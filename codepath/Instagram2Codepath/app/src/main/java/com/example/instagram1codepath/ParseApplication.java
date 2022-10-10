package com.example.instagram1codepath;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("QK12GoKURiJeiFm3TOrvCvDJe7qtNHpsi3dXCbrM")
                .clientKey("xTChaQ49I1n27YzMsmHQsa4QBbSvj6eQ5V5sB1sy")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
