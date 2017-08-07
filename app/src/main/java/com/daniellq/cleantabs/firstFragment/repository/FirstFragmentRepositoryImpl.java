package com.daniellq.cleantabs.firstFragment.repository;

import android.os.Handler;

import com.daniellq.cleantabs.firstFragment.interactor.FirstFragmentInteractor;

import java.util.Random;

/**
 * Created by dani on 7/8/17.
 */

public class FirstFragmentRepositoryImpl implements FirstFragmentRepository {
    private FirstFragmentInteractor mInteractor;

    public FirstFragmentRepositoryImpl(FirstFragmentInteractor interactor) {
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
                    String successMessageFromRepoteApi = "First fragment message";
                    mInteractor.onMessageLoaded(successMessageFromRepoteApi);
                } else {
                    String errorMessageFromRemoteApi = "Failed to load message";
                    mInteractor.onMessageNotLoaded(errorMessageFromRemoteApi);
                }
            }
        }, 2000);
    }
}
