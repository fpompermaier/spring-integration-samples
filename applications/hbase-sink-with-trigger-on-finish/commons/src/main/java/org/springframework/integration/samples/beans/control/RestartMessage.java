/*
 * Copyright 2002-2010 the original author or authors.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package org.springframework.integration.samples.beans.control;

import java.util.UUID;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Domain object representing a document to index.
 * Set stop to true only if the processing of document has finished!
 * 
 * @author Flavio Pompermaier
 */
@Data
@EqualsAndHashCode(of="id")
public class RestartMessage {

	private final String id = UUID.randomUUID().toString();

}
