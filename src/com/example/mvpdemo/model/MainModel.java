package com.example.mvpdemo.model;

import com.example.mvpdemo.presenter.MainPresenter;

/**
 *
 * @author sunxy
 */
public class MainModel {

	private MainPresenter mainPresenter;
	
	private Model model;

	public MainModel(MainPresenter mainPresenter) {
		this.mainPresenter = mainPresenter;
	}

	// 从服务器中获取数据
	public void getData() {
		// 这个方法主要是获取数据如果成功则调用MainPresenter的loadDataSuccess 方法
		// 如果失败就调用MainPresenter的loadFail()方法
		
		model = new Model();
		model.setName("简单的 MVPDemo");
		
		mainPresenter.loadDataSuccess(model);
	}

}
