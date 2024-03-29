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

import io.viewserver.configurator.IConfiguratorSpec;
import io.viewserver.execution.ParameterHelper;
import io.viewserver.messages.command.IConfigurateCommand;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.util.List;
import java.util.Map;

/**
 * Created by nickc on 01/11/2014.
 */

@JsonTypeInfo(
        use = JsonTypeInfo.Id.CLASS,
        include = JsonTypeInfo.As.PROPERTY)
public interface IGraphNode {
    String getName();

    String getType();

    Object withMetadata(Map<String, Object> metadata);

    Object withMetadata(String key, Object value);

    Object withConnection(String operator);

    Object withConnection(String operator, String output, String input);

    IConfigurateCommand.IOperator getOperatorSpecDto(ParameterHelper parameterHelper);

    Object getConfig(ParameterHelper parameterHelper);

    String getNameForOperatorSpec(boolean shouldHash);

    boolean isDistributed();

    Object withDistribution();

    IConfiguratorSpec.OperatorSpec getOperatorSpec(ParameterHelper parameterHelper, boolean shouldHash);

    void setParameterHelper(ParameterHelper parameterHelper);

    String getOperatorName(ParameterHelper parameterHelper);

    List<IConfiguratorSpec.Connection> getConnections();

    void setDistributed(boolean distributed);

    List<String> getDependencies();
}
