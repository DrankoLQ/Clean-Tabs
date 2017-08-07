package com.daniellq.cleantabs.secondFragment.ui;

/**
 * Created by dani on 7/8/17.
 */

public interface SecondFragmentView {
    void showProgressBar();

    void hideProgressBar();

    void enableButton();

    void disableButton();

    void showToastWithMessage(String message);
}
