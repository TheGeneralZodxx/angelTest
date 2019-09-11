package com.ang.test.offer.repository;

import com.ang.test.offer.domain.Offer;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfferRepository extends JpaRepository<Offer, Long> {

	void saveAll(List<Offer> offers);
}
