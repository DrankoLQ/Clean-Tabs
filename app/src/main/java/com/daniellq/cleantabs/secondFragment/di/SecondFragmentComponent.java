package com.daniellq.cleantabs.secondFragment.di;

import com.daniellq.cleantabs.secondFragment.ui.SecondFragment;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by dani on 28/8/17.
 */

@Singleton
@Component(modules = SecondFragmentModule.class)
public interface SecondFragmentComponent {
    void inject(SecondFragment secondFragment);
}
