/*
 * Copyright 2014 Wolfram Rittmeyer.
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

package com.grokkingandroid.sampleapp.samples.gcm.ccs.server;

public class ProcessorFactory {

    private static final String ACTION_REGISTER = "REGISTER";
    private static final String ACTION_ECHO = "ECHO";
    private static final String ACTION_MESSAGE = "MESSAGE";
    private static final String ACTION_USER_LIST = "USERLIST";
    private static final String ACTION_SIGNUP = "SIGNUP";
    private static final String ACTION_CHAT = "CHAT";
    private static final String ACTION_KEY_PRESS = "KEYPRESS";
    
    public static PayloadProcessor getProcessor(String action) {
        if (action == null) {
            throw new IllegalStateException("action must not be null");
        }
        switch (action) {
            case ACTION_REGISTER:
                return new RegisterProcessor();
            case ACTION_USER_LIST:
                return new UserListProcessor();
            case ACTION_SIGNUP:
                return new UserSignup();
            case ACTION_ECHO:
                return new EchoProcessor();
            case ACTION_CHAT:
                return new ChatProcessor();
            case ACTION_KEY_PRESS:
                return new UserKeyPressProcessor();
            case ACTION_MESSAGE:
                return new MessageProcessor();
        }
        throw new IllegalStateException("Action " + action + " is unknown");
    }
}
