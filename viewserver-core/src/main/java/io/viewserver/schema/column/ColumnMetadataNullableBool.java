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

package io.viewserver.schema.column;

import io.viewserver.core.NullableBool;

/**
 * Created by nickc on 16/01/2015.
 */
public class ColumnMetadataNullableBool extends ColumnMetadata {
    private NullableBool nullValue = NullableBool.Null;

    public NullableBool getNullValue() {
        return nullValue;
    }

    public void setNullValue(NullableBool nullValue) {
        this.nullValue = nullValue;
    }
}