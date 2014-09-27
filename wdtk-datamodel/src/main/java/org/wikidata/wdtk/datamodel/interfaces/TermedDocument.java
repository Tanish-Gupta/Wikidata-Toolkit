package org.wikidata.wdtk.datamodel.interfaces;

/*
 * #%L
 * Wikidata Toolkit Data Model
 * %%
 * Copyright (C) 2014 Wikidata Toolkit Developers
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import java.util.List;
import java.util.Map;

/**
 * Interface for EntityDocuments that can be described by terms in several
 * languages. These terms consist labels, descriptions, and aliases.
 * 
 * @author Markus Kroetzsch
 */
public interface TermedDocument extends EntityDocument {
	/**
	 * Return a Map from Wikibase language codes to labels.
	 * 
	 * @return the map of labels
	 */
	Map<String, MonolingualTextValue> getLabels();

	/**
	 * Return a Map from Wikibase language codes to descriptions.
	 * 
	 * @return the map of descriptions
	 */
	Map<String, MonolingualTextValue> getDescriptions();

	/**
	 * Return a Map from Wikibase language codes to lists of alias labels for a
	 * given language.
	 * 
	 * @return the aliases for this language
	 */
	Map<String, List<MonolingualTextValue>> getAliases();

}