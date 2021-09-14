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

package org.apache.dubbo.mock.handler;

import java.util.Objects;

/**
 * handle the {@link Long} type result.
 */
public class LongTypeHandler implements TypeHandler<Long> {

    @Override
    public boolean isMatch(ResultContext resultContext) {
        return Objects.equals(Long.class, resultContext.getTargetType())
            || Objects.equals(long.class, resultContext.getTargetType());
    }

    @Override
    public Long handleResult(ResultContext resultContext) {
        return Long.parseLong(resultContext.getData());
    }
}
