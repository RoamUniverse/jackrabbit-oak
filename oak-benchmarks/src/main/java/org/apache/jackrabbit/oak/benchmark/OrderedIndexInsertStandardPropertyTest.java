/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.jackrabbit.oak.benchmark;

import javax.jcr.Node;

/**
 *
 */
public class OrderedIndexInsertStandardPropertyTest extends OrderedIndexInsertBaseTest {
   private Node index = null;
   
   @Override
   void defineIndex() throws Exception {
       index = defineStandardPropertyIndex(session);   
   }

   @Override
   protected void afterTest() throws Exception {
      //deleting the index. no need for session.save(); as it will be run by the super.afterTest();
      index.remove();
      super.afterTest();
   }
}
