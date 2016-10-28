package com.example.mvpdemo.view;

/**
 *
 * @author sunxy
 */
public interface MainView<T> {

	void initView();

	void showData(T t);

}
