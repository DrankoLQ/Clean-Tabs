package com.daniellq.cleantabs.secondFragment.interactor;

/**
 * Created by dani on 7/8/17.
 */

public interface SecondFragmentInteractor {
    void getMessageUseCase();

    void onMessageLoaded(String message);

    void onMessageNotLoaded(String error);
}
