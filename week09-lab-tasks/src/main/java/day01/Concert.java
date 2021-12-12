package day01;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Concert {
    private List<Person> persons = new ArrayList<>();

    public void addPerson(Person person, LocalTime actualTime){
        LocalTime entryTime = person.getTicket().entryTime();
        if(actualTime.isBefore(entryTime)){
            throw new IllegalArgumentException("Entry not allowed.");
        } else {
            persons.add(person);
        }
    }

    public List<Person> getPersons() {
        return persons;
    }
}
