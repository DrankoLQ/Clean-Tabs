package com.daniellq.cleantabs.secondFragment.interactor;

import com.daniellq.cleantabs.secondFragment.presenter.SecondFragmentPresenter;
import com.daniellq.cleantabs.secondFragment.repository.SecondFragmentRepository;
import com.daniellq.cleantabs.secondFragment.repository.SecondFragmentRepositoryImpl;

/**
 * Created by dani on 7/8/17.
 */

public class SecondFragmentInteractorImpl implements SecondFragmentInteractor {
    private SecondFragmentPresenter mPresenter;
    private SecondFragmentRepository mRepository;

    public SecondFragmentInteractorImpl(SecondFragmentPresenter presenter) {
        mPresenter = presenter;
        mRepository = new SecondFragmentRepositoryImpl(this);
    }

    @Override
    public void getMessageUseCase() {
        mRepository.getMessage();
    }

    @Override
    public void onMessageLoaded(String message) {
        mPresenter.onMessageLoaded(message);
    }

    @Override
    public void onMessageNotLoaded(String error) {
        mPresenter.onMessageNotLoaded(error);
    }
}
