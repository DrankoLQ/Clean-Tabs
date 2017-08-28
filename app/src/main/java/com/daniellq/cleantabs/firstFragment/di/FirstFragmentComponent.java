package com.daniellq.cleantabs.firstFragment.di;

import com.daniellq.cleantabs.firstFragment.ui.FirstFragment;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by dani on 28/8/17.
 */

@Singleton
@Component(modules = FirstFragmentModule.class)
public interface FirstFragmentComponent {
    void inject(FirstFragment firstFragment);
}