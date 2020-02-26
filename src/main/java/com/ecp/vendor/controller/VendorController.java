package com.ecp.vendor.controller;

import com.ecp.vendor.mapper.VendorMapper;
import com.ecp.vendor.model.Vendor;
import com.ecp.vendor.service.VendorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VendorController {

    private static Logger logger = LoggerFactory.getLogger(VendorController.class);

    @Autowired
    VendorMapper vendorMapper;

    @Autowired
    VendorService vendorService;

    @PostMapping("/vendor")
    public Vendor insert(@RequestBody Vendor V){
        return vendorService.insert(V);
    }

    @GetMapping("/vendor/{vendorId}")
    public Vendor getVendorById(@PathVariable Integer vendorId){
        return  vendorService.getVendorById(vendorId);
    }

    @GetMapping("/vendors")
    public List<Vendor> getAllVendors(){
        return vendorService.getAllVendors();
    }

    @PostMapping("/vendor/{vendorId}/feedback/{feedback}")
    public Vendor setFeedback(@PathVariable Integer vendorId, @PathVariable String feedback){
        return vendorService.setFeedback(vendorId, feedback);
    }

    @GetMapping("/vendor/{vendorId}/feedback")
    public String getFeedbackById(@PathVariable Integer vendorId){
        return vendorService.getFeedBackById(vendorId);
    }


}
