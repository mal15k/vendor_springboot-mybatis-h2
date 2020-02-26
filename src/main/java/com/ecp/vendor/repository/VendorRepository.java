package com.ecp.vendor.repository;

import com.ecp.vendor.mapper.VendorMapper;
import com.ecp.vendor.model.Vendor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class VendorRepository {

    private static Logger logger = LoggerFactory.getLogger(VendorRepository.class);

    @Autowired
    VendorMapper vendorMapper;

    public Vendor insert(Vendor V){
        int newVendorId = vendorMapper.insert(V);
        return getVendorById(V.getVendorId());
    }

    public List<Vendor> getAllVendors(){
        return vendorMapper.getAllVendors();
    }

    public Vendor getVendorById(Integer vendorId){
        return vendorMapper.getVendorById(vendorId);
    }

    public String getFeedbackById(Integer vendorId){
        return vendorMapper.getFeedbackById(vendorId);
    }

    public void setFeedback(Integer vendorId, String feedback){
        vendorMapper.setFeedback(vendorId, feedback);
    }

}
