package com.example.mvpdemo.presenter;

import com.example.mvpdemo.model.MainModel;
import com.example.mvpdemo.model.Model;
import com.example.mvpdemo.view.MainView;

/**
 *
 * @author sunxy
 */
public class MainPresenter implements Presenter<Model> {

	@SuppressWarnings("rawtypes")
	private MainView mainView;
	private MainModel mainModel;

	@SuppressWarnings("rawtypes")
	public MainPresenter(MainView mainView) {
		this.mainView = mainView;
		mainModel = new MainModel(this);
	}

	@Override
	public void loadData() {
		mainModel.getData();
	}

	@SuppressWarnings("unchecked")
	@Override
	public void loadDataSuccess(Model model) {
		mainView.showData(model);
	}

	@Override
	public void loadFail() {
	}
}
