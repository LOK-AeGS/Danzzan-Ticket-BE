package com.danzzan.ticketing.api.service;

import com.danzzan.ticketing.api.dto.AdminLoginRequestDTO;
import com.danzzan.ticketing.api.dto.AdminLoginResponseDTO;
import com.danzzan.ticketing.api.dto.AdminLogoutResponseDTO;
import com.danzzan.ticketing.api.dto.AdminMeResponseDTO;

public interface AdminAuthService {
    AdminLoginResponseDTO login(AdminLoginRequestDTO request);
    AdminMeResponseDTO me();
    AdminLogoutResponseDTO logout();
}
