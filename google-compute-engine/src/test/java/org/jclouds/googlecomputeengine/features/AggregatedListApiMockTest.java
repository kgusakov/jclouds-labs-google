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
package org.jclouds.googlecomputeengine.features;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.jclouds.googlecomputeengine.internal.BaseGoogleComputeEngineApiMockTest;
import org.testng.annotations.Test;

@Test(groups = "unit", testName = "AggregatedListApiMockTest", singleThreaded = true)
public class AggregatedListApiMockTest extends BaseGoogleComputeEngineApiMockTest {

   public void machineTypes() throws Exception {
      server.enqueue(jsonResponse("/aggregated_machinetype_list.json"));

      AggregatedListApi aggregatedList = api().aggregatedList();

      assertTrue(aggregatedList.machineTypes().hasNext());

      assertSent(server, "GET", "/projects/party/aggregated/machineTypes");
   }

   public void machineTypesResponseIs4xx() throws Exception {
      server.enqueue(jsonResponse("/aggregated_instance_list_empty.json"));

      AggregatedListApi aggregatedList = api().aggregatedList();

      assertFalse(aggregatedList.machineTypes().hasNext());

      assertSent(server, "GET", "/projects/party/aggregated/machineTypes");
   }

   public void instances() throws Exception {
      server.enqueue(jsonResponse("/aggregated_instance_list.json"));

      AggregatedListApi aggregatedList = api().aggregatedList();

      assertTrue(aggregatedList.instances().hasNext());

      assertSent(server, "GET", "/projects/party/aggregated/instances");
   }

   public void instancesResponseIs4xx() throws Exception {
      server.enqueue(jsonResponse("/aggregated_instance_list_empty.json"));

      AggregatedListApi aggregatedList = api().aggregatedList();

      assertFalse(aggregatedList.instances().hasNext());

      assertSent(server, "GET", "/projects/party/aggregated/instances");
   }

   public void addresses() throws Exception {
      server.enqueue(jsonResponse("/aggregated_address_list.json"));

      AggregatedListApi aggregatedList = api().aggregatedList();

      assertTrue(aggregatedList.addresses().hasNext());

      assertSent(server, "GET", "/projects/party/aggregated/addresses");
   }

   public void addressesResponseIs4xx() throws Exception {
      server.enqueue(jsonResponse("/aggregated_address_list_empty.json"));

      AggregatedListApi aggregatedList = api().aggregatedList();

      assertFalse(aggregatedList.addresses().hasNext());

      assertSent(server, "GET", "/projects/party/aggregated/addresses");
   }

   public void disks() throws Exception {
      server.enqueue(jsonResponse("/aggregated_disk_list.json"));

      AggregatedListApi aggregatedList = api().aggregatedList();

      assertTrue(aggregatedList.disks().hasNext());

      assertSent(server, "GET", "/projects/party/aggregated/disks");
   }

   public void disksResponseIs4xx() throws Exception {
      server.enqueue(jsonResponse("/aggregated_disk_list_empty.json"));

      AggregatedListApi aggregatedList = api().aggregatedList();

      assertFalse(aggregatedList.disks().hasNext());

      assertSent(server, "GET", "/projects/party/aggregated/disks");
   }

   public void diskTypes() throws Exception {
      server.enqueue(jsonResponse("/aggregated_disktype_list.json"));

      AggregatedListApi aggregatedList = api().aggregatedList();

      assertTrue(aggregatedList.diskTypes().hasNext());

      assertSent(server, "GET", "/projects/party/aggregated/diskTypes");
   }

   public void diskTypesResponseIs4xx() throws Exception {
      server.enqueue(jsonResponse("/aggregated_disktype_list_empty.json"));

      AggregatedListApi aggregatedList = api().aggregatedList();

      assertFalse(aggregatedList.diskTypes().hasNext());

      assertSent(server, "GET", "/projects/party/aggregated/diskTypes");
   }

   public void globalOperations() throws Exception {
      server.enqueue(jsonResponse("/aggregated_global_operation_list.json"));

      AggregatedListApi aggregatedList = api().aggregatedList();

      assertTrue(aggregatedList.globalOperations().hasNext());

      assertSent(server, "GET", "/projects/party/aggregated/operations");
   }

   public void globalOperationsResponseIs4xx() throws Exception {
      server.enqueue(jsonResponse("/aggregated_global_operation_list_empty.json"));

      AggregatedListApi aggregatedList = api().aggregatedList();

      assertFalse(aggregatedList.globalOperations().hasNext());

      assertSent(server, "GET", "/projects/party/aggregated/operations");
   }
}
