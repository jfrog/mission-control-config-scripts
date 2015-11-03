/*
 * Copyright (C) 2015 JFrog Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 *
 * This role creates remote repository matching the selected local
 */

target = userInput (
    type : "REPOSITORY", //select from repositories list
    value : "default value",
    description : "please select a target Maven SNAPSHOT repository"
  )

if (target) {
  // Cleanup -local from the repo name
  def name = target?.name - '-local' //removes the -local from repository name

  remoteRepository("$name-remote") { //creates the remote repo for the target
    packageType "maven"
    url "${target?.url}"
  }
}
