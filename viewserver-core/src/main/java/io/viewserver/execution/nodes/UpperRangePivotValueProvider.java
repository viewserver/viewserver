/*
 * Copyright 2016 Claymore Minds Limited and Niche Solutions (UK) Limited
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.viewserver.execution.nodes;

import io.viewserver.execution.ParameterHelper;
import io.viewserver.messages.common.ValueLists;

public class UpperRangePivotValueProvider implements IPivotValueProvider {
    private String startParam;
    private String rangeParam;

    public UpperRangePivotValueProvider(){}

    public UpperRangePivotValueProvider(String rangeParam){
        this.rangeParam = rangeParam;
    }

    public String getRangeParam() {
        return rangeParam;
    }

    public void setRangeParam(String rangeParam) {
        this.rangeParam = rangeParam;
    }

    @Override
    public Object[] getPivotValues(ParameterHelper parameterHelper){
        int startBucket = 0;
        int buckets = ((ValueLists.IIntegerList)parameterHelper.getParameterValues(rangeParam)).get(0);
        Object[] values = new Object[buckets];
        for (int i = 0; i < buckets; i++) {
            values[i] = startBucket + i;
        }
        return values;
    }
}
