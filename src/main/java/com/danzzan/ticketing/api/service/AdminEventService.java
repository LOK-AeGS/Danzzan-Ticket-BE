package com.danzzan.ticketing.api.service;

import com.danzzan.ticketing.api.dto.EventListResponseDTO;
import com.danzzan.ticketing.api.dto.EventStatsResponseDTO;

public interface AdminEventService {
    EventListResponseDTO listEvents();
    EventStatsResponseDTO getEventStats(Long eventId);
}
