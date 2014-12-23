/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.cxf.rs.security.oauth2.client;

import java.io.Serializable;

import javax.ws.rs.core.MultivaluedMap;

import org.apache.cxf.rs.security.oauth2.common.ClientAccessToken;

public class ClientCodeRequest implements Serializable {
    private static final long serialVersionUID = -3501237730333195311L;
    private ClientAccessToken token;
    private MultivaluedMap<String, String> state;
    private String userName;
    
    public ClientAccessToken getToken() {
        return token;
    }

    public void setToken(ClientAccessToken token) {
        this.token = token;
    }

    public MultivaluedMap<String, String> getState() {
        return state;
    }

    public void setState(MultivaluedMap<String, String> state) {
        this.state = state;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
