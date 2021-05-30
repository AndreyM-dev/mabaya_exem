package com.mokhov.mabaya_exam.controller;

import com.mokhov.mabaya_exam.model.dto.CreatCampaignResponseDto;
import com.mokhov.mabaya_exam.model.dto.CreateCampaignRequestDto;
import com.mokhov.mabaya_exam.model.dto.ServerAdResponseDto;
import com.mokhov.mabaya_exam.model.entity.Campaign;
import com.mokhov.mabaya_exam.service.CampaignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/campaign")
public class CampaignController {

    @Autowired
    private CampaignService campaignService;

    @PostMapping("/create")
    public CreatCampaignResponseDto createCampaign(@RequestBody CreateCampaignRequestDto createCampaignDto) {
      return campaignService.createCampaign(createCampaignDto);

    }

    @GetMapping("/serve_ad")
    public ServerAdResponseDto serveAd(@RequestParam String category) {
        return null;
    }
}
