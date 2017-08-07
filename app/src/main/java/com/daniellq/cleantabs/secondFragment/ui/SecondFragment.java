package com.daniellq.cleantabs.secondFragment.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.daniellq.cleantabs.R;
import com.daniellq.cleantabs.secondFragment.presenter.SecondFragmentPresenter;
import com.daniellq.cleantabs.secondFragment.presenter.SecondFragmentPresenterImpl;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

public class SecondFragment extends Fragment implements SecondFragmentView {

    @BindView(R.id.secondFragmentButton)
    Button mGetMessageButton;
    @BindView(R.id.progressBar)
    ProgressBar mProgressBar;
    Unbinder unbinder;

    private SecondFragmentPresenter mPresenter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_second, container, false);
        unbinder = ButterKnife.bind(this, rootView);
        mPresenter = new SecondFragmentPresenterImpl(this);
        return rootView;
    }

    @OnClick(R.id.secondFragmentButton)
    public void onClickButton() {
        mPresenter.showMessage();
    }

    @Override
    public void showProgressBar() {
        mProgressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgressBar() {
        mProgressBar.setVisibility(View.INVISIBLE);
    }

    @Override
    public void enableButton() {
        mGetMessageButton.setEnabled(true);
    }

    @Override
    public void disableButton() {
        mGetMessageButton.setEnabled(false);
    }

    @Override
    public void showToastWithMessage(String message) {
        Toast.makeText(getActivity(), message, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
