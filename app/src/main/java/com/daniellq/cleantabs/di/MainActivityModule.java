package com.daniellq.cleantabs.di;

import com.daniellq.cleantabs.firstFragment.ui.FirstFragment;
import com.daniellq.cleantabs.secondFragment.ui.SecondFragment;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by dani on 7/8/17.
 */
@Module
public class MainActivityModule {
    @Provides
    @Singleton
    public FirstFragment provideFirstFragment() {
        return new FirstFragment();
    }

    @Provides
    @Singleton
    public SecondFragment provideSecondFragment() {
        return new SecondFragment();
    }
}
