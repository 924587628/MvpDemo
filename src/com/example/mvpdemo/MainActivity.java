package com.example.mvpdemo;

import com.example.mvpdemo.model.Model;
import com.example.mvpdemo.presenter.MainPresenter;
import com.example.mvpdemo.view.MainView;
import com.example.mvptest.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity implements MainView<Model> {
	
	private MainPresenter mainPresenter;
	private TextView textview;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initView();
	}

	@Override
	public void initView() {
		textview = (TextView) findViewById(R.id.txt);
		mainPresenter = new MainPresenter(this);
		mainPresenter.loadData();
	}

	@Override
	public void showData(Model model) {
		textview.setText(model.getName());
	}
}
