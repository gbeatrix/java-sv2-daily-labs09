package day01;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class ConcertTest {
    @Test
    void testConcert() {
        Concert concert = new Concert();
        String band = "Mikulás és a krampuszok";
        String extraCode = "TELAPO2021";
        LocalDateTime concertDateTime = LocalDateTime.of(2021, 12, 5, 20, 0);
        LocalTime entry1730 = LocalTime.of(17, 30);
        LocalTime entry1830 = LocalTime.of(18, 30);
        LocalTime entry1930 = LocalTime.of(19, 30);

        Person person = new Person(new Ticket(band, concertDateTime, 500));
        Person vipPerson = new Person(new FrontOfStageTicket(band, concertDateTime, 1000, extraCode));

        concert.addPerson(person, entry1930);
        concert.addPerson(vipPerson, entry1830);
        assertEquals(2, concert.getPersons().size());

        assertThrows(IllegalArgumentException.class,
                () -> concert.addPerson(person, entry1830));
        assertThrows(IllegalArgumentException.class,
                () -> concert.addPerson(vipPerson, entry1730));
    }
}
