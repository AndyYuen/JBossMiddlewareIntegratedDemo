This is the preparation work you need to do to set up BPMS before running the Integrated Demo.

The Demo supports BPMS V6.1. If you use BPMS6.3 the FUSE integration needs to be changed
for the validation part using rules running on the BPMS server as the endpoint has changes
and an addition http header is needed. See link below for differences between V6.1 and V6.3
rules server:

http://mrdreambot.ddns.net/bpmsbrms-6-3-an-intelligent-process-server-odyssey/#more-316

Please note that since 2 instances of EAP are running, one of them have to use port-offset.

BPMS should be started with -Djboss.socket.binding.port-offset=100

Alternatively, you could change the standalone.xml file as follows:

<socket-binding-group name="standard-sockets" default-interface="public" 
   port-offset="${jboss.socket.binding.port-offset:0}">

to

<socket-binding-group name="standard-sockets" default-interface="public" 
   port-offset="${jboss.socket.binding.port-offset:100}">

More preparation work assuming you are familiar of BPMS Business Central:

1) untar the Mortgage.tgz file
2) From Business Central, create an Organization Unit called "Demo"
3) From Business Central, clone the repository using the untar'ed Mortgage GIT into Demo
    file:///path/Mortgage.git
4) From Business Central, build and deploy the 2 projects
5) From Business Central, create a Realtime Decision Server container with endpoint:
   http://localhost:8180/kie-server/services/rest/server/containers/Validation
   This will be used for by the Fuse validation path.
6) Deploy the jboss-mortgage-demo-ws.war to the BPMS EAP either using the console or
   dropping the war file into the standalone/deployment directory/
7) If you set up BPMS using the default H2 im-memory database, remember to
   build and deploy the Mortgage business process and start the Validation container
   everythime you restart BPMS.
