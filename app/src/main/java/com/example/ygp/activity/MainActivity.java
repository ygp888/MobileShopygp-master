package com.example.ygp.activity;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.ygp.fragment.NavigationFragment;
import com.example.ygp.R;
import com.example.ygp.common.BaseActivity;

public class MainActivity extends BaseActivity {

    @Override
    public int getContentViewId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        super.initView();
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.fl_main,new NavigationFragment());
        transaction.commit();
    }
}
