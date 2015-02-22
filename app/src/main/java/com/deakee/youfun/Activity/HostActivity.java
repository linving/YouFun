package com.deakee.youfun.Activity;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.deakee.youfun.Fragment.ProFileFragment;
import com.deakee.youfun.R;

/**
 * Created by zzt on 2015/2/22.
 */
public class HostActivity extends BaseActivity{

    private RadioGroup mHostRadioGroup;
    private Fragment[] fragments = new Fragment[] {new Fragment(), new ProFileFragment()};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.host_activity);
        init();

    }

    private void init(){
        attachFragments(R.id.content, fragments);
        mHostRadioGroup = (RadioGroup)findViewById(R.id.host_radio_group);
        mHostRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                int count = group.getChildCount();
                hideFragment();
                for (int i = 0; i < count; i++) {
                    if (((RadioButton) group.getChildAt(i)).isChecked()) {
                        showFragment(i);
                    }
                }
            }
        });
    }

}
