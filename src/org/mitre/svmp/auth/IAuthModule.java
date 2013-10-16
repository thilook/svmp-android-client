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

import android.content.Context;
import android.view.View;

/**
 * @author Joe Portner
 */
public interface IAuthModule {

    // integer ID used to add to the spinner selection when editing a ConnectionInfo (stored in DB for the connection)
    int getAuthTypeID();

    // string description used to add to the spinner selection when editing a ConnectionInfo
    String getAuthTypeDescription();

    // determines whether or not this Auth module is used, based on the ConnectionInfo's stored AuthType
    boolean isModuleUsed(int authType);

    // adds elements to the Dialog window for this Auth module, if necessary
    View generateUI(Context context);

    // string key used to add the input to an Intent
    String getAuthKey();

    // value used to add the input to an Intent, may get input from the View that was added to the UI (View may be null)
    byte[] getAuthValue(View view);
}