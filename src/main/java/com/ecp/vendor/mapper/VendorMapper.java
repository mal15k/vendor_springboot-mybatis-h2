package com.ecp.vendor.mapper;

import com.ecp.vendor.model.Vendor;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface VendorMapper {

    @Insert("insert into Vendor values( #{vendorId} , #{vendorName} , #{vendorFeedback} )")
    public int insert(Vendor V);

    @Select("select * from Vendor")
    public List<Vendor> getAllVendors();

    @Select("select * from Vendor where vendorId = #{vendorId}")
    public Vendor getVendorById(Integer vendorId);

    @Select("select vendorFeedback from Vendor where vendorId = #{vendorId}")
    public String getFeedbackById(Integer vendorId);

    @Insert("update Vendor set vendorFeedback = #{feedback} WHERE vendorId = #{vendorId}")
    public int setFeedback(Integer vendorId, String feedback);


}
