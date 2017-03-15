/*
 * Copyright 2017, DevCon5 GmbH, Switzerland
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package io.devcon5.jsonb.jackson;

import static org.junit.Assert.assertNotNull;

import javax.json.bind.JsonbBuilder;

import org.junit.Test;

public class JacksonJsonbProviderTest {

    @Test
    public void shouldCreateABuilder() throws Exception {

        JsonbBuilder builder = new JacksonJsonbProvider().create();

        assertNotNull(builder);

    }

}
