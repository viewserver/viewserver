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

import io.viewserver.r.client.RClient;
import org.junit.Test;

/**
 * Created by nick on 15/07/15.
 */
public class RClientTests {
    // why the fark won't it pick up the junit dependency???????
    @Test
    public void test() throws Exception {
        RClient client = new RClient("client", "tcp://localhost:18000");
//        RClientSubscription subscription = client.subscribe("fxrates", Constants.OUT);
//        Iterable<RClientSubscription.ColumnValues> rows = subscription.getRows(-1);
    }
}