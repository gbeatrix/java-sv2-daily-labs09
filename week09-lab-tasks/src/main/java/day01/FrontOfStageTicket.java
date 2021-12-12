package day01;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class FrontOfStageTicket extends Ticket{
    private String extraCode;

    public FrontOfStageTicket(String band, LocalDateTime time, int price, String extraCode) {
        super(band, time, price);
        this.extraCode = extraCode;
    }

    @Override
    public LocalTime entryTime() {
        return getStartTime().minusHours(2).toLocalTime();
    }

    public String getExtraCode() {
        return extraCode;
    }
}
