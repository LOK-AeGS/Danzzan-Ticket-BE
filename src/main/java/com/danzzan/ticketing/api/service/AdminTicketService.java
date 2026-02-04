package com.danzzan.ticketing.api.service;

import com.danzzan.ticketing.api.dto.IssueTicketResponseDTO;
import com.danzzan.ticketing.api.dto.TicketSearchResponseDTO;

public interface AdminTicketService {
    TicketSearchResponseDTO searchTicketByStudentId(Long eventId, String studentId);
    IssueTicketResponseDTO issueTicket(Long eventId, Long ticketId, String note);
}
