package com.mokhov.mabaya_exam.service;

import com.mokhov.mabaya_exam.model.dto.CreateCampaignResponseDto;
import com.mokhov.mabaya_exam.model.dto.CreateCampaignRequestDto;
import com.mokhov.mabaya_exam.model.dto.ServerAdResponseDto;
import com.mokhov.mabaya_exam.model.entity.Campaign;
import com.mokhov.mabaya_exam.model.entity.CategoryOfProduct;
import com.mokhov.mabaya_exam.repository.CampaignRepository;
import com.mokhov.mabaya_exam.repository.CategoryRepository;
import com.mokhov.mabaya_exam.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CampaignServiceImpl implements CampaignService {


    private final CategoryRepository categoryRepository;
    private final ProductRepository productRepository;
    private final CampaignRepository campaignRepository;
    private final CategoryService categoryService;

    @Autowired
    public CampaignServiceImpl(CategoryRepository categoryRepository, ProductRepository productRepository, CampaignRepository campaignRepository, CategoryService categoryService) {
        this.categoryRepository = categoryRepository;
        this.productRepository = productRepository;
        this.campaignRepository = campaignRepository;
        this.categoryService = categoryService;
    }

    @Override
    public CreateCampaignResponseDto createCampaign(CreateCampaignRequestDto campaign) {

        CategoryOfProduct category = categoryService.getOrCreateCategoryIfNotExisted(campaign.getCategory());
        Campaign savedCampaign = campaignRepository.save(Campaign.builder()
                .category(category)
                .campaignName(campaign.getName())
                .startDate(campaign.getStartDate())
                .bid(campaign.getBid())
                .build());

        return CreateCampaignResponseDto.builder()
                .id(savedCampaign.getId())
                .name(savedCampaign.getCampaignName())
                .category(savedCampaign.getCategory().getCategory())
                .bid(savedCampaign.getBid())
                .startDate(savedCampaign.getStartDate())
                .build();
    }



    @Override
    public ServerAdResponseDto serveAd(String category) {
        return null;
    }
}
