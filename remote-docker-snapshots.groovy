target = userInput (
    type : "REPOSITORY",
    value : "default value",
    description : "please select a target Maven SNAPSHOT repository"
  )

if (target) {
  // Cleanup -local from the repo name
  def name = target?.name.replaceAll("-local", "")

  remoteRepository("$name-remote") {
    packageType "docker"
    url "${target?.url}"
  }
}
