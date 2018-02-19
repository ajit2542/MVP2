package com.example.renoster.mvp.main;

/**
 * Responsible for handling action from View And Updating
 */

public class MainPresenter implements MainContract.Presenter {
    private MainContract.MvpViw mView;

    public MainPresenter(MainContract.MvpViw mView) {
        this.mView = mView;
    }

}
