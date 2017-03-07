package com.roisoftstudio;

import com.roisoftstudio.domain.CalendarUseCase;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import javax.inject.Inject;


@RunWith(SpringRunner.class)
@SpringBootTest
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