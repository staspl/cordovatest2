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

import integrate_clientsdk.*;

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
        else if ( action.equals("scanCard") )  {
		try {
			
			// NATIVE!!! String version = About.releaseVersion();
			String version = integrate_clientsdk.Error.errorTypeToString ( integrate_clientsdk.Error.ErrorType.SUCCESS );
			result = "Scan card - " + version;
			Toast toast = Toast.makeText(cordova.getActivity(), result, Toast.LENGTH_LONG );
			toast.show();
		}
		catch(Exception e) {
			status = PluginResult.Status.ERROR;
			result = e.toString();
			Toast toast = Toast.makeText(cordova.getActivity(), "Scan card error: " + result, Toast.LENGTH_LONG );
			toast.show();
		}		

        } else {
            status = PluginResult.Status.INVALID_ACTION;
        }

        callbackContext.sendPluginResult(new PluginResult(status, result));
        return true;
    }
}
