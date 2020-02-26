package com.ecp.vendor.service;

import com.ecp.vendor.model.Vendor;
import com.ecp.vendor.repository.VendorRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendorService {
    private static Logger logger = LoggerFactory.getLogger(VendorService.class);

    @Autowired
    VendorRepository vendorRepository;

    public Vendor insert(Vendor V){
        return vendorRepository.insert(V);
    }

    public List<Vendor> getAllVendors(){
        return vendorRepository.getAllVendors();
    }

    public Vendor getVendorById(Integer vendorId){
        return vendorRepository.getVendorById(vendorId);
    }

    public String getFeedBackById(Integer vendorId){
        return vendorRepository.getFeedbackById(vendorId);
    }

    public Vendor setFeedback(Integer vendorId, String feedback){
        vendorRepository.setFeedback(vendorId, feedback);
        return vendorRepository.getVendorById(vendorId);
    }

}
