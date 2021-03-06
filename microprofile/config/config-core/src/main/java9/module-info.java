/*
 * Copyright (c) 2018 Oracle and/or its affiliates. All rights reserved.
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

/**
 * Microprofile configuration module.
 */
module io.helidon.mp.config {
    requires java.logging;

    requires transitive io.helidon.config;
    requires transitive microprofile.config.api;
    requires io.helidon.security.tools.config;

    exports io.helidon.microprofile.config;

    provides org.eclipse.microprofile.config.spi.ConfigProviderResolver with io.helidon.microprofile.config.MpConfigProviderResolver;

    uses org.eclipse.microprofile.config.spi.ConfigSource;
    uses org.eclipse.microprofile.config.spi.ConfigSourceProvider;
    uses org.eclipse.microprofile.config.spi.Converter;
}
