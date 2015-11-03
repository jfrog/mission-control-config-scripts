name = userInput (
    type : "STRING",
    description : "Please provide a repository name"
  )

remoteRepository(name) {
  url "https://www.nuget.org/"
  description "Remote repository for nuget oficial gallery"
  notes "Created through JFrog Mission Control"
  includesPattern "**/*"
  excludesPattern ""
  packageType "nuget"
  maxUniqueSnapshots  0
  offline false
  blackedOut false
  socketTimeoutMillis 15000
  retrievalCachePeriodSecs 43200
  failedRetrievalCachePeriodSecs 30
  missedRetrievalCachePeriodSecs 7200
  unusedArtifactsCleanupEnabled false
  unusedArtifactsCleanupPeriodHours 0
  shareConfiguration false
  synchronizeProperties false
  enableCookieManagement false
}

