package com.blood.donor.service;

import com.blood.donor.model.Donor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class DonorService {
    private final List<Donor> donors = new ArrayList<>();

    public void addDonor(Donor donor) {
        donors.add(donor);
    }

    public List<Donor> findDonors(String blood, String city) {
        return donors.stream()
                .filter(d -> (blood.equals("Any") || d.getBlood().equalsIgnoreCase(blood)) &&
                        d.getCity().toLowerCase().contains(city.toLowerCase()))
                .collect(Collectors.toList());
    }
}