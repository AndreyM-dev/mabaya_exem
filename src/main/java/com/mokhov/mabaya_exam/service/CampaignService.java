package com.mokhov.mabaya_exam.service;

import com.mokhov.mabaya_exam.model.dto.CreatCampaignResponseDto;
import com.mokhov.mabaya_exam.model.dto.CreateCampaignRequestDto;
import com.mokhov.mabaya_exam.model.dto.ServerAdResponseDto;

public interface CampaignService {

    CreatCampaignResponseDto createCampaign(CreateCampaignRequestDto campaign);
    ServerAdResponseDto serveAd(String category);

}
