package com.blood.donor.repository;

import com.blood.donor.entity.Donor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DonorRepository extends JpaRepository<Donor, Long> {

    List<Donor> findByBloodAndCityContainingIgnoreCase(String blood, String city);
}