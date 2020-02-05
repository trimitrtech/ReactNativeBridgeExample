package com.nativebridge;

import android.widget.Toast;
import android.util.Log;


// https://facebook.github.io/react-native/

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;


public class HelloWorldModule extends ReactContextBaseJavaModule {
    private static ReactApplicationContext reactContext;

    HelloWorldModule(ReactApplicationContext context){
        super(context);
        reactContext = context;
    }

    @Override
    public String getName(){
        return "HelloWorldModule";
    }

    @ReactMethod
    public void ShowMessage(String message, int duration){
        Log.d("HELLO_WORLD_MODULE", message);
        Toast.makeText(getReactApplicationContext(), message, duration).show();
    }
}
