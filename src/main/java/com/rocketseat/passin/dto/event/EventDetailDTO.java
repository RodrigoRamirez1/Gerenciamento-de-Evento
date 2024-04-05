package com.rocketseat.passin.dto.event;

public record EventDetailDTO(
        String id,
        String title,
        String details,
        String slug,
        Integer maximAttendees,
        Integer attendeesAmount
) {
}
