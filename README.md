# JBossMiddlewareIntegratedDemo
This demo uses JBoss FUSE, Business Process Management Suite and 
JBoss Data Virtualization together to implement a business use case.

The use case and how to do the demo is described in the IntegratedDemo.pdf.

But before you can run the demo, there are a number of preparation work that need
to be done.

Prerequisites for the Demo:

JBoss FUSE V6.2
BPMS V6.1
JDV V6.2
Devloper Studio V8.X or V9.X with tooling (Integration Pack) installed

The maven setting.xml may look something like settingSample.xml. Modify where
appropriate to suit your environment.

The instructions that follow assumes that you are already familiar with the products listed above 
and know how to use them.

Also note that 2 instances of EAP will be running during the demo: 1 for JDV and 1 for BPMS.
Consequently, the BPMS EAP need to be configured to run at port-offset=100 (described in BPMS Setup)

BPMS Setup:

1) go to the bpms directory, read the README.md file and following the instructions.

JDV Setup:

1) Go to the jdv directory, read the README.md file and following the instructions.
2) Import project in jdv/worspace into Developer Studio
3) Set up a JDV server in Developer Studio to run the FederatedDB virtual database

FUSE Setup:
1) Import project in fuse/worspace into Developer Studio
2) From the Fuse Integration Perspective, right click from the Project Explore:
   src/main/resources/OSGI-INF/blueprint/camelContext.xml
   and select Run As->Local Camel Context (without tests)
   to start the Camel Routes
   
   

<<<<<READ IntegratedDemo.pdfAGAIN TO FULLY UNDERSTAND WHAT IS BEING DEMO'ED>>>>>>
