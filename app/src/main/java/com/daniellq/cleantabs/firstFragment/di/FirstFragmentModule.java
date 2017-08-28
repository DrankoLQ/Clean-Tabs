package com.daniellq.cleantabs.firstFragment.di;

import com.daniellq.cleantabs.firstFragment.presenter.FirstFragmentPresenter;
import com.daniellq.cleantabs.firstFragment.presenter.FirstFragmentPresenterImpl;
import com.daniellq.cleantabs.firstFragment.ui.FirstFragmentView;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by dani on 28/8/17.
 */

@Module
public class FirstFragmentModule {
    private FirstFragmentView mView;

    public FirstFragmentModule(FirstFragmentView view) {
        mView = view;
    }

    @Provides
    @Singleton
    public FirstFragmentPresenter provideFirstFragmentPresenter() {
        return new FirstFragmentPresenterImpl(mView);
    }
}