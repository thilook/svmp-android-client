/*
 Copyright 2013 The MITRE Corporation, All Rights Reserved.

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this work except in compliance with the License.
 You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
package org.mitre.svmp.auth;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author Joe Portner
 */
public class AuthModuleRegistry {
    // get an array of all Auth Modules that are registered
    public static IAuthModule[] getAuthModules() {
        return AUTH_MODULES.toArray(new IAuthModule[AUTH_MODULES.size()]);
    }

    private static final List<IAuthModule> AUTH_MODULES = registerModules();

    private static List<IAuthModule> registerModules() {
        List<IAuthModule> list = new ArrayList<IAuthModule>();

        // add instances of modules here
        list.add(new PasswordAuthModule());
        list.add(new TokenAuthModule());

        return list;
    }

 /*   // get an array of all Auth Modules that are registered
    public static IAuthModule[] getAuthModules() {
        return AUTH_MODULES.values().toArray(new IAuthModule[AUTH_MODULES.size()]);
    }

    // get a specific Auth Module by its AuthKey (String that is sent in the Intent to be authorized)
    public static IAuthModule getAuthModule(String authKey) {
        return AUTH_MODULES.get(authKey);
    }

    private static final HashMap<String, IAuthModule> AUTH_MODULES = registerModules();

    private static HashMap<String, IAuthModule> registerModules() {
        HashMap<String, IAuthModule> map = new HashMap<String, IAuthModule>();
        List<IAuthModule> list = new ArrayList<IAuthModule>();

        // add instances of modules here
        list.add(new PasswordAuthModule());
        list.add(new TokenAuthModule());

        // loop through the list and add entries to the map
        for (IAuthModule authModule : list)
            map.put(authModule.getAuthKey(), authModule);
        return map;
    }*/
}
