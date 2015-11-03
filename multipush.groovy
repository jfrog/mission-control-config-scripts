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
 * This role creates multipush replication to all peers
 */

repository() {
  multipushReplication(peers)  { //peers object is all other repositories
                                 //selected for the current action except current
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
