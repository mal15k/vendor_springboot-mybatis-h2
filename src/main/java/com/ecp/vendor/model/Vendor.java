package com.ecp.vendor.model;

public class Vendor{
    private Integer vendorId;
    private String vendorName;
    private String vendorFeedback;

    public Vendor() {
    }

    public Vendor(Integer vendorId, String vendorName, String vendorFeedback) {
        this.vendorId = vendorId;
        this.vendorName = vendorName;
        this.vendorFeedback = vendorFeedback;
    }

    public Integer getVendorId() {
        return vendorId;
    }

    public void setVendorId(Integer vendorId) {
        this.vendorId = vendorId;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getVendorFeedback() {
        return vendorFeedback;
    }

    public void setVendorFeedback(String vendorFeedback) {
        this.vendorFeedback = vendorFeedback;
    }
}
