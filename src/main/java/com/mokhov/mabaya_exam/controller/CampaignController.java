package com.mokhov.mabaya_exam.controller;

import com.mokhov.mabaya_exam.model.dto.CreatCampaignResponseDto;
import com.mokhov.mabaya_exam.model.dto.CreateCampaignRequestDto;
import com.mokhov.mabaya_exam.model.dto.ServerAdResponseDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/campaign")
public class CampaignController {

    @PostMapping("/create")
    public CreatCampaignResponseDto createCampaign(@RequestBody CreateCampaignRequestDto createCampaignDto) {

    }

    @GetMapping("/serve_ad")
    public ServerAdResponseDto serveAd(@RequestParam String category) {

    }
}
