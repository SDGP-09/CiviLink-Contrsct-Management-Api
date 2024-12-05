package com.civilink.civilink_contract_manager.dtos.requests;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class RequestAllBidDto {
    private String bidId;
    private String clientName;
    private String projectName;
    private String ActivityName;
}
