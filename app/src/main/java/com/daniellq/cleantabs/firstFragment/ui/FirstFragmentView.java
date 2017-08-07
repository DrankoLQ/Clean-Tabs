package com.daniellq.cleantabs.firstFragment.ui;

/**
 * Created by dani on 7/8/17.
 */

public interface FirstFragmentView {
    void showProgressBar();

    void hideProgressBar();

    void enableButton();

    void disableButton();

    void showToastWithMessage(String message);
}
