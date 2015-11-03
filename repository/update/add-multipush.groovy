repos = userInput (
    type : "REPOSITORY",
    multivalued: true,
    description : "please select target repositories for multipush"
  )

localRepository() {
  multipushReplication(repos)  {
    cronExp "0 0/9 14 * * ?"
    socketTimeoutMillis 15000
    username "admin"
    password "password"
    enableEventReplication  true
    enabled  true
    syncDeletes  false
    syncProperties  true
  }
}
