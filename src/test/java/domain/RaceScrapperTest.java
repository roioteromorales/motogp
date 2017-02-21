package domain;

import infrastructure.Application;
import infrastructure.threading.Executor;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import javax.inject.Inject;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(classes= Application.class)
public class RaceScrapperTest {

    @Inject
    private CalendarUseCase calendarUseCase;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getRace() throws Exception {
        calendarUseCase.onSuccess(System.out::println).run();
        Thread.sleep(2000);
//        assertThat(race).isEqualTo("ARG");
    }
}