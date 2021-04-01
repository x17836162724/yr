package com.jy.login.interfaces;

public interface IBasePresenter<V extends IBaseView> {
    void  attachView(V view);
    void unArrachView();
}
