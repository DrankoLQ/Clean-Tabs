package com.daniellq.cleantabs.secondFragment.di;


import com.daniellq.cleantabs.secondFragment.presenter.SecondFragmentPresenter;
import com.daniellq.cleantabs.secondFragment.presenter.SecondFragmentPresenterImpl;
import com.daniellq.cleantabs.secondFragment.ui.SecondFragmentView;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by dani on 28/8/17.
 */

@Module
public class SecondFragmentModule {
    private SecondFragmentView mView;

    public SecondFragmentModule(SecondFragmentView mView) {
        this.mView = mView;
    }

    @Provides
    @Singleton
    public SecondFragmentPresenter provideSecondFragmentPresenter() {
        return new SecondFragmentPresenterImpl(mView);
    }
}