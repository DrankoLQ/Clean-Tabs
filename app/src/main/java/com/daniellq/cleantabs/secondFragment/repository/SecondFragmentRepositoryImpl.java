package com.daniellq.cleantabs.secondFragment.repository;

import android.os.Handler;

import com.daniellq.cleantabs.secondFragment.interactor.SecondFragmentInteractor;

import java.util.Random;

/**
 * Created by dani on 7/8/17.
 */

public class SecondFragmentRepositoryImpl implements SecondFragmentRepository {
    private SecondFragmentInteractor mInteractor;

    public SecondFragmentRepositoryImpl(SecondFragmentInteractor interactor) {
        mInteractor = interactor;
    }

    @Override
    public void getMessage() {
        // PostDelayed simulate a REST API call
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Random rand = new Random();
                int randomNum = rand.nextInt((100) + 1);
                if (randomNum < 90) {
                    String successMessageFromRepoteApi = "Second fragment message";
                    mInteractor.onMessageLoaded(successMessageFromRepoteApi);
                } else {
                    String errorMessageFromRemoteApi = "Failed to load message";
                    mInteractor.onMessageNotLoaded(errorMessageFromRemoteApi);
                }
            }
        }, 2000);
    }
}
