# Collection of [Roles](https://www.jfrog.com/confluence/display/MC/Roles) for JFrog Mission Control
Mission control embraces the configuration as code approach for configuring Artifactory instances. By using a Groovy based domain specific language (DSL), you can define "roles" that describe elements of Artifactory configuration such as repositories, replication, property sets, LDAP settings and more.

Roles are reusable pieces of code developed using the Mission control DSL which can be applied to one or more Artifactory instances in order to perform configuration actions. These can range from simple configurations such as setting a new caching policy for a set of remote repositories to more complex ones like creating a combination of local and remote repositories in a master-slave topology.
