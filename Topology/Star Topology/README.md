Star topology
==========================

Star topology is implemented by having a main facility doing development (say, Amsterdam) while additional development is managed at multiple remote sites (Bangkok and Chicago). The main instance will then replicate to all the other instances.

### Configuration

This script will create replication session between a source repo to destination repo(s). 
All repo(s) are new repo(s).

We will use 'peers' which a content variable that refers to all instances except for the one we are using. 
Please note that 'peers' is only available when creating a new repo.

What do we need:
Create local repo script that will be executed on ALL instances. 
Create multi-push replication script that will run only on the source. 

How to create and execute the script:

Step 1: open mission-control configuration script editor 

Create new Script -> paste the `CreateLocalRepo` script in the editor. Save

![alt tag](https://github.com/shanilevy/mission-control-config-scripts/blob/master/Topology/Star Topology/screenshots/CreateLocalRepoScript.jpg)

Create a new script -> paste the `CreateMultiPushReplication` script in the editor. Save

![alt tag](https://github.com/shanilevy/mission-control-config-scripts/blob/master/Topology/Star Topology/screenshots/CreateReplicationScript.jpg)

Step 2: select repositories / new repository / select instances - select replication source instance and destination instances

![alt tag](https://github.com/shanilevy/mission-control-config-scripts/blob/master/Topology/Star Topology/screenshots/NewRepo0.jpg)

Step 3: in apply scripts - select the `CreateLocalRepo` script and the instances. Click "add" 

![alt tag](https://github.com/shanilevy/mission-control-config-scripts/blob/master/Topology/Star Topology/screenshots/NewRepo1.jpg)

![alt tag](https://github.com/shanilevy/mission-control-config-scripts/blob/master/Topology/Star Topology/screenshots/NewRepo2.jpg)

Step 4: in apply scripts - select the `CreateMultiPushReplication` script and select only the source. Click "add" 

![alt tag](https://github.com/shanilevy/mission-control-config-scripts/blob/master/Topology/Star Topology/screenshots/NewRepo3.jpg)

![alt tag](https://github.com/shanilevy/mission-control-config-scripts/blob/master/Topology/Star Topology/screenshots/NewRepo4.jpg)

Step 5: in user input type the name of the local repository to create on all instances ('local-amsterdam')

![alt tag](https://github.com/shanilevy/mission-control-config-scripts/blob/master/Topology/Star Topology/screenshots/NewRepo5.jpg)

Step 6: summary 

![alt tag](https://github.com/shanilevy/mission-control-config-scripts/blob/master/Topology/Star Topology/screenshots/NewRepo6.jpg)

This is how it should look like in the mission-control map:

![alt tag](https://github.com/shanilevy/mission-control-config-scripts/blob/master/Topology/Star Topology/screenshots/StarMap.jpg)
