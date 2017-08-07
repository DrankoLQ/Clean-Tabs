package com.daniellq.cleantabs;

import android.app.Application;

import com.daniellq.cleantabs.di.DaggerMainActivityComponent;
import com.daniellq.cleantabs.di.MainActivityComponent;
import com.daniellq.cleantabs.di.MainActivityModule;

/**
 * Created by dani on 7/8/17.
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
    }

    public static MainActivityComponent getMainActivityComponent() {
        return DaggerMainActivityComponent
                .builder()
                .mainActivityModule(new MainActivityModule())
                .build();
    }
}
