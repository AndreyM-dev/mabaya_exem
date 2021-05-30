package com.mokhov.mabaya_exam.repository;

import com.mokhov.mabaya_exam.model.entity.Campaign;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CampaignRepository extends JpaRepository<Campaign, Long> {
}
