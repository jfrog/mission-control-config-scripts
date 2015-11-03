name = userInput (
    type : "STRING",
    description : "Please provide a repository name"
  )

repoDescription = userInput (
    type : "STRING",
    description : "Please provide a repository name"
  )


localRepository(name) {
  description repoDescription
  notes "Created throught JFrog Mission Control"
  includesPattern "**/*" 
  excludesPattern "" 
  repoLayoutRef "nuget-default"
  packageType "nuget" 
  maxUniqueSnapshots  0 
}

