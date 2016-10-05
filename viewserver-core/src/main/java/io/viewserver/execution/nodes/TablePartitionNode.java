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
import io.viewserver.messages.config.IOperatorConfig;
import io.viewserver.operators.table.ITablePartitionConfig;
import io.viewserver.operators.table.TablePartitionOperator;

/**
 * Created by nick on 10/11/15.
 */
public class TablePartitionNode extends GraphNodeBase<TablePartitionNode> implements ITablePartitionConfig {
    private String partitionColumnName;
    private Object partitionValue;

    public TablePartitionNode() {
        super();
    }

    public TablePartitionNode(String name) {
        super(name, TablePartitionOperator.class.getName());
    }

    public TablePartitionNode withPartitionColumnName(String partitionColumnName) {
        this.partitionColumnName = partitionColumnName;
        return this;
    }

    public TablePartitionNode withPartitionValue(Object partitionValue) {
        this.partitionValue = partitionValue;
        return this;
    }

    @Override
    public Object getConfig(ParameterHelper parameterHelper) {
        return this;
    }

    @Override
    protected IOperatorConfig getConfigDto(ParameterHelper parameterHelper) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String getPartitionColumnName() {
        return partitionColumnName;
    }

    @Override
    public Object getPartitionValue() {
        return partitionValue;
    }
}