package com.daniellq.cleantabs.firstFragment.interactor;

import com.daniellq.cleantabs.firstFragment.presenter.FirstFragmentPresenter;
import com.daniellq.cleantabs.firstFragment.repository.FirstFragmentRepository;
import com.daniellq.cleantabs.firstFragment.repository.FirstFragmentRepositoryImpl;

/**
 * Created by dani on 7/8/17.
 */

public class FirstFragmentInteractorImpl implements FirstFragmentInteractor {
    private FirstFragmentPresenter mPresenter;
    private FirstFragmentRepository mRepository;

    public FirstFragmentInteractorImpl(FirstFragmentPresenter presenter) {
        mPresenter = presenter;
        mRepository = new FirstFragmentRepositoryImpl(this);
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
