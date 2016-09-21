This is the preparation work you need to do to set up JDV before running the Integrated Demo.

The FederatedDB project running on JDV requires 3 data sources. The otherholdings.xml
is already in the targetFTPDir.

The 2nd data source is the web service MarketRESTWebSvc.war. Either deploy the war file
using the EAP console or drop it in the EAP standalone/deployment directory.

The 3rd source is a MySQL database. Assuming you have already had one set up. here is how you
import the data into the database.

Use mysql to login to your MySQL server and issue the following commands:

CREATE DATABASE jdv_customers;
CREATE USER jdv@localhost IDENTIFIED BY 'Welcome||7';
GRANT ALL PRIVILEGES ON jdv_customers.* TO jdv@localhost;
FLUSH PRIVILEGES;

Then quit out and issue the command below to populate the database:


mysql -u jdv -p jdv_customers < customer-schema.sql

That completes the setup.
