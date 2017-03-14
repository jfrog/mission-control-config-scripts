Full mesh topology
==========================

Full mesh topology is implemented by having each site manage multiple local repositories. 
Each site can only write to its own local repository, while replicating it to the other sites. 

### Configuration

These scripts will create full mesh topology in 2 steps. 

##### Script 1: Create local repositories on all sites 
For example, 'local-amsterdam' on Amsterdam, Bangkok, and Chicago.

How to create and execute the script:

Step 1: open mission-control Configuration script editor 

Create new script -> paste the `CreateLocalRepo` script in the editor. Save

![alt tag](https://github.com/shanilevy/mission-control-config-scripts/blob/master/Topology/Star%20Topology/screenshots/CreateLocalRepoScript.jpg)

Step 2: selecting repositories / new repository / select instances - select source instance and destination instances

![alt tag](https://github.com/shanilevy/mission-control-config-scripts/blob/master/Topology/Full%20Mesh%20Topology/screenshots/NewRepo0.jpg)

Step 3: in apply scripts - select the `CreateLocalRepo` script and select the repositories 

![alt tag](https://github.com/shanilevy/mission-control-config-scripts/blob/master/Topology/Full%20Mesh%20Topology/screenshots/NewRepo1.jpg)

![alt tag](https://github.com/shanilevy/mission-control-config-scripts/blob/master/Topology/Full%20Mesh%20Topology/screenshots/NewRepo2.jpg)

Step 4: in user input type the name of the local repository to create on all instances ('local-amsterdam')

![alt tag](https://github.com/shanilevy/mission-control-config-scripts/blob/master/Topology/Full%20Mesh%20Topology/screenshots/NewRepo3.jpg)

Step 5: summary 

![alt tag](https://github.com/shanilevy/mission-control-config-scripts/blob/master/Topology/Full%20Mesh%20Topology/screenshots/NewRepo4.jpg)

##### Script 2: create multi-push replication for full mesh topology

Step 1: open mission-control configuration script editor 

Create new Script -> paste the `NewRepoReplication` script in the editor. Save

![alt tag](https://github.com/shanilevy/mission-control-config-scripts/blob/master/Topology/Full%20Mesh%20Topology/screenshots/NewReplicationScript.jpg)

Step 2: selecting repositories / update repository / select instances - select replication source instance and destination instances

![alt tag](https://github.com/shanilevy/mission-control-config-scripts/blob/master/Topology/Full%20Mesh%20Topology/screenshots/UpdateRepo0.jpg)

Step 3: in select repositories - select the source repos

![alt tag](https://github.com/shanilevy/mission-control-config-scripts/blob/master/Topology/Full%20Mesh%20Topology/screenshots/UpdateRepo1.jpg)

Step 4: in apply scripts - select the `NewRepoReplication` script and select the source repositories

![alt tag](https://github.com/shanilevy/mission-control-config-scripts/blob/master/Topology/Full%20Mesh%20Topology/screenshots/UpdateRepo2.jpg)

![alt tag](https://github.com/shanilevy/mission-control-config-scripts/blob/master/Topology/Full%20Mesh%20Topology/screenshots/UpdateRepo3.jpg)

Step 5: in user input select the destination repos for each source

![alt tag](https://github.com/shanilevy/mission-control-config-scripts/blob/master/Topology/Full%20Mesh%20Topology/screenshots/UpdateRepo4.jpg)

![alt tag](https://github.com/shanilevy/mission-control-config-scripts/blob/master/Topology/Full%20Mesh%20Topology/screenshots/UpdateRepo5.jpg)

![alt tag](https://github.com/shanilevy/mission-control-config-scripts/blob/master/Topology/Full%20Mesh%20Topology/screenshots/UpdateRepo6.jpg)

Step 6: summary

![alt tag](https://github.com/shanilevy/mission-control-config-scripts/blob/master/Topology/Full%20Mesh%20Topology/screenshots/UpdateRepo7.jpg)

This is how it would look like in the mission-control map:

![alt tag](https://github.com/shanilevy/mission-control-config-scripts/blob/master/Topology/Full%20Mesh%20Topology/screenshots/FullMeshMap.jpg)
