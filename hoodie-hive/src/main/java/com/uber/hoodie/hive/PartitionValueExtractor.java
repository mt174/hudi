/*
 *  Copyright (c) 2017 Uber Technologies, Inc. (hoodie-dev-group@uber.com)
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *           http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 *
 */

package com.uber.hoodie.hive;

import java.util.List;

/**
 * HDFS Path contain hive partition values for the keys it is partitioned on.
 * This mapping is not straight forward and requires a pluggable implementation to extract the partition value from HDFS path.
 *
 * e.g. Hive table partitioned by datestr=yyyy-mm-dd and hdfs path /app/hoodie/dataset1/YYYY=[yyyy]/MM=[mm]/DD=[dd]
 */
public interface PartitionValueExtractor {
  List<String> extractPartitionValuesInPath(String partitionPath);
}
