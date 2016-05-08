repositories = userInput (
    name : "User Friendly Name", // Optional
    type : "REPOSITORY", // "BOOLEAN", "INTEGER", "INSTANCE", "REPOSITORY"
    description : "please provide a value",
    multivalued : true
  )
localRepository() {
  description "Public description"
  notes "Some internal notes"
  multipushReplication(repositories)  {
    // URL will be calculated based on the repositories created in other instances
    cronExp "0 0/9 14 * * ?"
    socketTimeoutMillis 15000
	// Insert here username and password to the remote instance
    username "admin"
    password "password"
    proxy //"proxy-ref"
    enableEventReplication  true
    enabled  true
    syncDeletes  false
    syncProperties  true
  }
}
