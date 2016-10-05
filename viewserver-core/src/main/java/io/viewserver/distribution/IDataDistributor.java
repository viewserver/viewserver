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

package io.viewserver.distribution;

import io.viewserver.command.CommandResult;
import io.viewserver.messages.tableevent.IRowEvent;
import io.viewserver.schema.column.IRowFlags;

/**
 * Created by nickc on 09/12/2014.
 */
public interface IDataDistributor {
    DistributionOperator getOwner();

    void onBeforeCommit();

    void onRowAdd(int rowId);

    void onRowUpdate(int rowId, IRowFlags rowFlags);

    void onRowRemove(int rowId);

    void onAfterCommit();

    void tearDown();

    void sendTableEvents();

    void reset();

    void setTableEventsResult(CommandResult commandResult);

    void addRowEvent(ViewServerNode node, IRowEvent.Type eventType, int row, IRowFlags rowFlags);
}