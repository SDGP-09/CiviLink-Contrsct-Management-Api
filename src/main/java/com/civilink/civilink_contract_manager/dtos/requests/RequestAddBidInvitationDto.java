package com.civilink.civilink_contract_manager.dtos.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class RequestAddBidInvitationDto {
    private String bidId;
    private String bidInvitationId;
}