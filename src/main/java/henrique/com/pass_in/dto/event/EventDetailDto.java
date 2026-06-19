package henrique.com.pass_in.dto.event;

public record EventDetailDto(String id,
                             String title,
                             String details,
                             String slug,
                             Integer maximumAttendees,
                             Integer AttendeesAmo
) {

}
