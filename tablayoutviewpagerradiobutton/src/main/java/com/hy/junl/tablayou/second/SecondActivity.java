package com.hy.junl.tablayou.second;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.hy.junl.tablayou.FragmentFactory;
import com.hy.junl.tablayou.R;

/**
 * =============================================
 * 作    者：Junl(袁军亮)
 * 版    本：1.0
 * 描    述：
 * <p>
 * 创建日期：2017/5/31
 * 开心一刻：人生若只如初见，何事秋风悲画扇。
 * =============================================
 */

public class SecondActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener{
    private TextView mToolbar;
    private RadioGroup mRadioGroup;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initViews();
    }

    private void initViews() {
        mToolbar = (TextView) findViewById(R.id.tv_toolbar);
        mRadioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        mRadioGroup.setOnCheckedChangeListener(this);
        mRadioGroup.check(R.id.rbtn_home);
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        Fragment fragment = FragmentFactory.create(checkedId, mToolbar);
        //存放fragment碎片的容器 + 提交
        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, fragment).commit();
    }
}
