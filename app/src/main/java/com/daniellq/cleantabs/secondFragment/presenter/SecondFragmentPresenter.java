package com.daniellq.cleantabs.secondFragment.presenter;

/**
 * Created by dani on 7/8/17.
 */

public interface SecondFragmentPresenter {
    void showMessage();

    void onMessageLoaded(String message);

    void onMessageNotLoaded(String error);
}
