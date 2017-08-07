package com.daniellq.cleantabs.firstFragment.presenter;

/**
 * Created by dani on 7/8/17.
 */

public interface FirstFragmentPresenter {
    void showMessage();

    void onMessageLoaded(String message);

    void onMessageNotLoaded(String error);
}
