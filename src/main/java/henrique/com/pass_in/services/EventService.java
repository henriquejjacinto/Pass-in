package henrique.com.pass_in.services;

import henrique.com.pass_in.domain.attendee.Attendee;
import henrique.com.pass_in.domain.event.Event;
import henrique.com.pass_in.dto.event.EventResponseDto;
import henrique.com.pass_in.repositories.AttendeeRepository;
import henrique.com.pass_in.repositories.EventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EventService {

    private final EventRepository eventRepository;
    private  final AttendeeRepository attendeeRepository;

    public EventResponseDto getEventDetail(String eventId) {
        Event event = this.eventRepository.findById(eventId).orElseThrow(() -> new RuntimeException("Evento não encontrado"));
        List<Attendee> attendeeList = this.attendeeRepository.findByEventId(eventId);
        return new EventResponseDto(event, attendeeList.size());
    }
}