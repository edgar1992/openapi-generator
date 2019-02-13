/*
 * Copyright 2018 OpenAPI-Generator Contributors (https://openapi-generator.tech)
 * Copyright 2018 SmartBear Software
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

package org.openapitools.codegen.languages.features;

public interface SpringFeatures extends BeanValidationFeatures {

    public static final String GENERATE_SPRING_APPLICATION = "generateSpringApplication";

    public static final String GENERATE_SPRING_BOOT_APPLICATION = "generateSpringBootApplication";

    public static final String USE_SPRING_ANNOTATION_CONFIG = "useSpringAnnotationConfig";

    public void setGenerateSpringApplication(boolean useGenerateSpringApplication);

    public void setGenerateSpringBootApplication(boolean generateSpringBootApplication);

    public void setUseSpringAnnotationConfig(boolean useSpringAnnotationConfig);


}