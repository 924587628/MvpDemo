package com.example.mvpdemo.presenter;

/**
 *
 * @author sunxy
 */
public interface Presenter<T> {

	void loadData();

	void loadDataSuccess(T t);

	void loadFail();

}
