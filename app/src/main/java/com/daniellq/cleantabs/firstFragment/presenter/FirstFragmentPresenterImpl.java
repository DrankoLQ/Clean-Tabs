package com.daniellq.cleantabs.firstFragment.presenter;

import com.daniellq.cleantabs.firstFragment.interactor.FirstFragmentInteractor;
import com.daniellq.cleantabs.firstFragment.interactor.FirstFragmentInteractorImpl;
import com.daniellq.cleantabs.firstFragment.ui.FirstFragmentView;

/**
 * Created by dani on 7/8/17.
 */

public class FirstFragmentPresenterImpl implements FirstFragmentPresenter {
    private FirstFragmentView mView;
    private FirstFragmentInteractor mInteractor;

    public FirstFragmentPresenterImpl(FirstFragmentView view) {
        mView = view;
        mInteractor = new FirstFragmentInteractorImpl(this);
    }

    @Override
    public void showMessage() {
        if (mView != null) {
            mView.showProgressBar();
            mView.disableButton();
        }
        mInteractor.getMessageUseCase();
    }

    @Override
    public void onMessageLoaded(String message) {
        if (mView != null) {
            mView.hideProgressBar();
            mView.enableButton();
            mView.showToastWithMessage(message);
        }
    }

    @Override
    public void onMessageNotLoaded(String error) {
        if (mView != null) {
            mView.hideProgressBar();
            mView.enableButton();
            mView.showToastWithMessage(error);
        }
    }
}
