package com.plugin.test2;

import org.json.JSONArray;

import android.content.Context;
import android.telephony.TelephonyManager;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.PluginResult;

// {{ ------------- Toast test -------------------------
import android.widget.Toast;
// Cordova-required packages
import org.json.JSONException;
import org.json.JSONObject;
// }} ------------- Toast test -------------------------

public class A77Plugin extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) {
        PluginResult.Status status = PluginResult.Status.OK;
        String result = "";

        if (action.equals("get")) {
		  String message = "Aaaaaaaaaaaa";
		  Toast toast = Toast.makeText(cordova.getActivity(), message, Toast.LENGTH_LONG );
		  toast.show();
		  // Send a positive result to the callbackContext
		  PluginResult pluginResult = new PluginResult(PluginResult.Status.OK);
		  result = "OK";
        }
        else {
            status = PluginResult.Status.INVALID_ACTION;
        }
        callbackContext.sendPluginResult(new PluginResult(status, result));
        return true;
    }
}
