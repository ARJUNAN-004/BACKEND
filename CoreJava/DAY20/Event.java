package DAY20;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

public class Event {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public Event(String name, Duration duration, LocalDateTime dateTime) {
        this.name = name;
        this.duration = duration;
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return "Event{" +
                "name=' " + name + '\'' +
                ", duration= " + duration.toHours() +
                ", dateTime= " + dateTime +
                '}';
    }

    public Duration duration;
    public LocalDateTime dateTime;
    public static void main(String[] args) {
        List<Event>eventList = List.of(
                new Event("Meeting", Duration.ofHours(1), LocalDateTime.of(2025, 1, 28, 12, 0)),
                new Event("Workshop", Duration.ofHours(2), LocalDateTime.of(2025, 1, 13, 14, 0)));
        for (Event event : eventList) {
            System.out.println(event);
        }
        System.out.println();
        eventList.stream().filter(event -> event.getDateTime().getDayOfMonth() == 28)
                .forEach(System.out::println);
        for (int i=0;i< eventList.size()-1;i++){
            Duration d= Duration.between(eventList.get(i+1).getDateTime(),eventList.get(i).getDateTime());

            System.out.println(d.toHours());
        }

    }
}
