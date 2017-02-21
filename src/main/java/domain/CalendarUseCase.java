package domain;

import infrastructure.threading.Executor;
import infrastructure.usecase.UseCase;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service
public class CalendarUseCase extends UseCase<Calendar> {

    private CalendarService calendarService;

    @Inject
    public CalendarUseCase(Executor executor, CalendarService calendarService) {
        super(executor);
        this.calendarService = calendarService;
    }

    @Override
    protected void onRun() {
        Calendar calendar = calendarService.getCalendar();
        notifySuccess(calendar);
    }
}
