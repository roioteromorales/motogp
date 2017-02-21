package infrastructure.threading;

import org.springframework.stereotype.Service;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

import static com.google.common.base.Preconditions.checkNotNull;

@Service
public class Executor implements Consumer<Runnable> {

    private static final int KEEP_ALIVE_TIME = 10;
    private static final TimeUnit KEEP_ALIVE_TIME_UNIT = TimeUnit.SECONDS;
    private static final int NUMBER_OF_CORES = Runtime.getRuntime().availableProcessors();

    private ThreadPoolExecutor threadPoolExecutor;

    public Executor() {
        this.threadPoolExecutor =
                new ThreadPoolExecutor(NUMBER_OF_CORES, NUMBER_OF_CORES + 2, KEEP_ALIVE_TIME, KEEP_ALIVE_TIME_UNIT, new LinkedBlockingQueue<>(),
                        new BackgroundThreadFactory(),
                        (rejectedRunnable, executor) -> System.out.println("Rejected execution of " + rejectedRunnable.getClass().getName()));
    }

    @Override
    public void accept(Runnable runnable) {
        checkNotNull(runnable);
        threadPoolExecutor.execute(runnable);
    }

    private static class BackgroundThreadFactory implements ThreadFactory {

        private static final String THREAD_NAME_PREFIX = "motogp_";
        private int counter = 0;

        @Override
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, THREAD_NAME_PREFIX + counter++);
        }
    }
}
