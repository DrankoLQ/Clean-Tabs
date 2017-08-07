package com.daniellq.cleantabs.di;

import com.daniellq.cleantabs.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by dani on 7/8/17.
 */
@Singleton
@Component(modules = MainActivityModule.class)
public interface MainActivityComponent {
    void inject(MainActivity activity);
}
