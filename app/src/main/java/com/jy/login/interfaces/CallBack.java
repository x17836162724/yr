package com.jy.login.interfaces;

public interface CallBack<T> {
    void onFaile(String msg);
    void onSuccess(T t);
}
