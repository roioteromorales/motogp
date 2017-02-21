package domain;

import data.MotoGpDataSource;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service
public class CalendarService {
    private MotoGpDataSource motoGpDataSource;

    @Inject
    public CalendarService(MotoGpDataSource motoGpDataSource) {
        this.motoGpDataSource = motoGpDataSource;
    }

    public Calendar getCalendar(){
        return motoGpDataSource.getCalendar();
    }

}
