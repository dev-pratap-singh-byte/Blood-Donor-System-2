package com.blood.donor.controller;

import com.blood.donor.model.Donor;
import com.blood.donor.service.DonorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/donors")
@CrossOrigin("*") // Frontend ke liye CORS enable
public class DonorController {

    @Autowired
    private DonorService donorService;

    // Register donor
    @PostMapping("/register")
    public String registerDonor(@RequestBody Donor donor) {
        donorService.addDonor(donor);
        return "Donor registered successfully!";
    }
    // Search donors
    @GetMapping("/search")
    public List<Donor> searchDonors(@RequestParam String blood, @RequestParam String city){
    return donorService.findDonors(blood,city);
    }
}
