/*******************************************************************************
 * Copyright 2020 Observational Health Data Sciences and Informatics & The Hyve
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package org.ohdsi.usagi;

/**
 * Class for holding information about a single (target) concept in the Vocabulary
 */
public class MappingTarget{

	private final Concept concept;
	private final String createdBy;
	private final long createdTime;

	public MappingTarget() {
		this.concept = Concept.createEmptyConcept();
		this.createdBy = "";
		this.createdTime = 0;
	}

	public MappingTarget(Concept concept, String createdBy) {
		this(concept, createdBy, System.currentTimeMillis());
	}

	public MappingTarget(Concept concept, String createdBy, long createdTime) {
		this.concept = concept;
		this.createdBy = createdBy;
		this.createdTime = createdTime;
	}

	public Concept getConcept() {
		return concept;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public long getCreatedTime() {
		return createdTime;
	}
}
