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

package io.viewserver.datasource;

import io.viewserver.catalog.ICatalog;
import io.viewserver.core.ExecutionContext;
import io.viewserver.core.IJsonSerialiser;

/**
 * Created by nick on 18/02/2015.
 */
public class SlaveDataSourceRegistry extends DataSourceRegistryBase<SlaveDataSource> {
    public SlaveDataSourceRegistry(ICatalog systemCatalog, ExecutionContext executionContext, IJsonSerialiser serialiser) {
        super(systemCatalog, executionContext, serialiser, SlaveDataSource.class);
    }
}