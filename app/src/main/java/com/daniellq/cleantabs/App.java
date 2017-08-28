package com.daniellq.cleantabs;

import android.app.Application;

import com.daniellq.cleantabs.di.DaggerMainActivityComponent;
import com.daniellq.cleantabs.di.MainActivityComponent;
import com.daniellq.cleantabs.di.MainActivityModule;
import com.daniellq.cleantabs.firstFragment.di.DaggerFirstFragmentComponent;
import com.daniellq.cleantabs.firstFragment.di.FirstFragmentComponent;
import com.daniellq.cleantabs.firstFragment.di.FirstFragmentModule;
import com.daniellq.cleantabs.firstFragment.ui.FirstFragmentView;
import com.daniellq.cleantabs.secondFragment.di.DaggerSecondFragmentComponent;
import com.daniellq.cleantabs.secondFragment.di.SecondFragmentComponent;
import com.daniellq.cleantabs.secondFragment.di.SecondFragmentModule;
import com.daniellq.cleantabs.secondFragment.ui.SecondFragmentView;

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

    public static FirstFragmentComponent getFirstFragmentComponent(FirstFragmentView view) {
        return DaggerFirstFragmentComponent
                .builder()
                .firstFragmentModule(new FirstFragmentModule(view))
                .build();
    }

    public static SecondFragmentComponent getSecondFragmentComponent(SecondFragmentView view) {
        return DaggerSecondFragmentComponent
                .builder()
                .secondFragmentModule(new SecondFragmentModule(view))
                .build();
    }
}
