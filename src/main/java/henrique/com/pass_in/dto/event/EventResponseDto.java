package henrique.com.pass_in.dto.event;

import henrique.com.pass_in.domain.event.Event;

public class EventResponseDto {

    EventDetailDto event;
    public EventResponseDto(Event event, Integer numberOfAttendees){
        this.event= new EventDetailDto(event.getId(), event.getTitle(), event.getDetails(), event.getSlug(), event.getMaximumAttendees(), numberOfAttendees);
    }
}
