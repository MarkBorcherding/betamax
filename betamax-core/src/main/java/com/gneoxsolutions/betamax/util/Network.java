/*
 * Copyright 2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/*
 * Converted from Groovy to Java by Sean Freitag
 */

package com.gneoxsolutions.betamax.util;

import com.google.common.collect.ImmutableList;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Collection;

public class Network {
    public static Collection<String> getLocalAddresses() {
        try {
            InetAddress local = InetAddress.getLocalHost();
            return ImmutableList.of(local.getHostName(), local.getHostAddress(), "localhost", "127.0.0.1");
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
    }
}
