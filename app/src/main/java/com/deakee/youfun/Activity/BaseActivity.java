package com.deakee.youfun.Activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;

import java.util.List;

/**
 * Created by zzt on 2015/2/22.
 */
public class BaseActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    protected FragmentTransaction getFragmentTransaction(){
        return getSupportFragmentManager().beginTransaction();
    }

    protected void showFragment(int index){
        hideFragment();
        FragmentTransaction ftx = getFragmentTransaction();
        List<Fragment> fragments = getSupportFragmentManager().getFragments();
        ftx.show(fragments.get(index)).commit();
    }

    protected void hideFragment(){
        FragmentTransaction ftx = getFragmentTransaction();
        List<Fragment> fragments = getSupportFragmentManager().getFragments();
        for(Fragment f: fragments){
            ftx.hide(f);
        }
        ftx.commit();
    }

    protected void attachFragments(int resId, Fragment[] fragments){
        FragmentTransaction ftx = getFragmentTransaction();
        for(Fragment f: fragments){
            ftx.add(resId, f);
        }
        ftx.commit();
    }

}
