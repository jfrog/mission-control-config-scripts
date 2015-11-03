repoName = userInput (
    type: "STRING",
    value : "docker-snapshot-local",
    description : "please provide a repository name"
  )
localRepository(repoName) {
  packageType "docker"
  handleSnapshots true
  handleReleases false
  maxUniqueSnapshots 5
  snapshotVersionBehavior "unique"
}
