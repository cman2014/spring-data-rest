/*
 * Copyright 2015-2019 the original author or authors.
 *
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
 */
package org.springframework.data.rest.webmvc.support;

import org.springframework.core.MethodParameter;
import org.springframework.hateoas.TemplateVariables;
import org.springframework.hateoas.mvc.UriComponentsContributor;
import org.springframework.web.util.UriComponents;

/**
 * Interface to abstract the access of {@link TemplateVariables} for pagination and sorting.
 *
 * @author Oliver Gierke
 * @since 2.3
 */
public interface PagingAndSortingTemplateVariables extends UriComponentsContributor {

	/**
	 * Returns the {@link TemplateVariables} for pagination.
	 *
	 * @param parameter can be {@literal null}.
	 * @param components must not be {@literal null}.
	 * @return
	 */
	TemplateVariables getPaginationTemplateVariables(MethodParameter parameter, UriComponents components);

	/**
	 * Returns the {@link TemplateVariables} for sorting.
	 *
	 * @param parameter can be {@literal null}.
	 * @param components must not be {@literal null}.
	 * @return
	 */
	TemplateVariables getSortTemplateVariables(MethodParameter parameter, UriComponents components);
}
