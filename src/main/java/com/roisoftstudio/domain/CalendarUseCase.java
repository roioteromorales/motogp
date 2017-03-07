package com.roisoftstudio.domain;

import com.roisoftstudio.externalapi.ApiSeasonCalendar;
import com.roisoftstudio.infrastructure.threading.Executor;
import com.roisoftstudio.infrastructure.usecase.UseCase;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service
public class CalendarUseCase extends UseCase<ApiSeasonCalendar> {

    private CalendarService calendarService;

    @Inject
    public CalendarUseCase(Executor executor, CalendarService calendarService) {
        super(executor);
        this.calendarService = calendarService;
    }

    @Override
    protected void onRun() {
        ApiSeasonCalendar seasonCalendar = calendarService.getCalendar();
        notifySuccess(seasonCalendar);
    }
}
