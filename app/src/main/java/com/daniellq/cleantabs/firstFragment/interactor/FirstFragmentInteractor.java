package com.daniellq.cleantabs.firstFragment.interactor;

/**
 * Created by dani on 7/8/17.
 */

public interface FirstFragmentInteractor {
    void getMessageUseCase();

    void onMessageLoaded(String message);

    void onMessageNotLoaded(String error);
}
