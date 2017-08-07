package com.daniellq.cleantabs.secondFragment.presenter;

import com.daniellq.cleantabs.secondFragment.interactor.SecondFragmentInteractor;
import com.daniellq.cleantabs.secondFragment.interactor.SecondFragmentInteractorImpl;
import com.daniellq.cleantabs.secondFragment.ui.SecondFragmentView;

/**
 * Created by dani on 7/8/17.
 */

public class SecondFragmentPresenterImpl implements SecondFragmentPresenter {
    private SecondFragmentView mView;
    private SecondFragmentInteractor mInteractor;

    public SecondFragmentPresenterImpl(SecondFragmentView view) {
        mView = view;
        mInteractor = new SecondFragmentInteractorImpl(this);
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
