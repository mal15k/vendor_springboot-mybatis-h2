package com.ecp.vendor;

import com.ecp.vendor.model.Vendor;
import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MappedTypes({Vendor.class})
@MapperScan("com.ecp.vendor.mapper")
@SpringBootApplication
public class VendorApplication {

	private static Logger logger = LoggerFactory.getLogger(VendorApplication.class);

	public static void main(String[] args) {

		logger.info("Starting the App");
		SpringApplication.run(VendorApplication.class, args);
	}

}
