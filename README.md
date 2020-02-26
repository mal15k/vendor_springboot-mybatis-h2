-Basic springboot app using mybatis and H2

##VENDOR FEEDBACK SYSTEM

Vendor Table Schema:
Int VendorId,
String VendorName,
String VendorFeedback.


Base URL = "/vendor"

1. Add Vendor
URL = "/vendor"
POST Request Vendor Object Body

2. View list of all Vendors
URL = "/vendors"
GET Request

3. View particular vendor by Id
URL = "/vendor/{vendorId}"
GET Request

4. Enter feedback for a Vendor
URL = "/vendor/{vendorId}/feedback/{feedback}"
POST Request.

5. View feedback for a Vendor (by Id)
URL = "/vendor/{vendorId}/feedback"
GET Request
