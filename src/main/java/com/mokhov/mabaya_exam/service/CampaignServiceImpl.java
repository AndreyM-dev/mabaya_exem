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
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CampaignServiceImpl implements CampaignService {

    private CategoryRepository categoryRepository;
    private ProductRepository productRepository;
    private CampaignRepository campaignRepository;

    @Autowired
    public CampaignServiceImpl(CategoryRepository categoryRepository, ProductRepository productRepository, CampaignRepository campaignRepository) {
        this.categoryRepository = categoryRepository;
        this.productRepository = productRepository;
        this.campaignRepository = campaignRepository;
    }

    @Override
    public CreateCampaignResponseDto createCampaign(CreateCampaignRequestDto campaign) {

        CategoryOfProduct category = getOrCreateCategoryIfNotExisted(campaign.getCategory());
        Campaign campaignSaved = campaignRepository.save(Campaign.builder()
                .category(category)
                .campaignName(campaign.getName())
                .startDate(campaign.getStartDate())
                .bid(campaign.getBid())
                .build());

        return CreateCampaignResponseDto.builder()
                .id(campaignSaved.getId())
                .name(campaignSaved.getCampaignName())
                .category(campaignSaved.getCampaignName())
                .bid(campaignSaved.getBid())
                .startDate(campaignSaved.getStartDate())
                .build();
    }

    @Cacheable("category")
    public CategoryOfProduct getOrCreateCategoryIfNotExisted(String category) {

        log.info("Added new category " + category);
        return categoryRepository.findCategoryOfProductByCategory(category)
                .orElse(categoryRepository.save(CategoryOfProduct.builder()
                .category(category)
                .build()));
    }

    @Override
    public ServerAdResponseDto serveAd(String category) {
        return null;
    }
}
