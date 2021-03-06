package com.mokhov.mabaya_exam.service;

import com.mokhov.mabaya_exam.model.dto.CreateCampaignResponseDto;
import com.mokhov.mabaya_exam.model.dto.CreateCampaignRequestDto;
import com.mokhov.mabaya_exam.model.dto.ServerAdResponseDto;

import java.text.ParseException;

public interface CampaignService {

    CreateCampaignResponseDto createCampaign(CreateCampaignRequestDto campaign);
    ServerAdResponseDto serveAd(String category) throws ParseException;

}
