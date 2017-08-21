name = userInput (
    type : "STRING",
    description : "Please provide a repository name"
  )

repoDescription = userInput (
    type : "STRING",
    description : "Please provide a public description"
  )

repo = userInput (
    type : "REPOSITORY",
    description : "Please provide repositories to aggregate ",
    multivalued : true
  )

virtualRepository(name) {
  description "$repoDescription"
  repositories (repo*.key) 
  notes "Created through JFrog Mission Control"
  includesPattern "**/*" 
  excludesPattern "" 
  packageType "nuget" 
}

