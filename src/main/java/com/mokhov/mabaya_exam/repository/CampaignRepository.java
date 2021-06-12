package com.mokhov.mabaya_exam.repository;

import com.mokhov.mabaya_exam.model.entity.Campaign;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface CampaignRepository extends JpaRepository<Campaign, Long> {

    List<Campaign> findAllByStartDateAfter(Date date);
}
