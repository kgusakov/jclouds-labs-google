/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jclouds.googlecomputeengine.parse;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

import java.net.URI;

import javax.ws.rs.Consumes;

import org.jclouds.googlecomputeengine.domain.Metadata;
import org.jclouds.googlecomputeengine.domain.Project;
import org.jclouds.googlecomputeengine.domain.Quota;
import org.jclouds.googlecomputeengine.internal.BaseGoogleComputeEngineParseTest;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

@Test(groups = "unit", testName = "ParseProjectTest")
public class ParseProjectTest extends BaseGoogleComputeEngineParseTest<Project> {

   @Override
   public String resource() {
      return "/project.json";
   }

   @Override @Consumes(APPLICATION_JSON)
   public Project expected() {
      return Project.create( //
            "13024414184846275913", // id
            URI.create(BASE_URL + "/myproject"), // selfLink
            "myproject", // name
            "", // description
            Metadata.create("efgh", ImmutableMap.of("propA", "valueA", "propB", "valueB")), // commonInstanceMetadata
            ImmutableList.of( //
                  Quota.create("INSTANCES", 0, 8), //
                  Quota.create("CPUS", 0, 8), //
                  Quota.create("EPHEMERAL_ADDRESSES", 0, 8), //
                  Quota.create("DISKS", 0, 8), //
                  Quota.create("DISKS_TOTAL_GB", 0, 100), //
                  Quota.create("SNAPSHOTS", 0, 1000), //
                  Quota.create("NETWORKS", 1, 5), //
                  Quota.create("FIREWALLS", 2, 100), //
                  Quota.create("IMAGES", 0, 100)), // quotas
            null // externalIpAddresses
      );
   }
}
