/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  The ASF licenses this file to You
 * under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.  For additional information regarding
 * copyright in this work, please see the NOTICE file in the top level
 * directory of this distribution.
 */

package org.apache.roller.weblogger.util.cache;

import java.util.Map;


/**
 * Base interface representing a cache in Roller.
 */
public interface Cache {
    
    /**
     * a unique identifier for the cache.
     */
    String getId();
    
    
    /**
     * put an item in the cache.
     */
    void put(String key, Object value);
    
    
    /**
     * get an item from the cache.
     */
    Object get(String key);
    
    
    /**
     * remove an item from the cache.
     */
    void remove(String key);
    
    
    /**
     * clear the entire cache.
     */
    void clear();
    
    
    /**
     * get cache stats.
     */
    Map<String, Object> getStats();
    
}
