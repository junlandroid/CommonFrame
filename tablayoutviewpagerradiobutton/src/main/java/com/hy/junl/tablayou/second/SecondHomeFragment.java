package com.hy.junl.tablayou.second;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;

import com.hy.junl.tablayou.FragmentFactory;
import com.hy.junl.tablayou.R;

import java.util.ArrayList;

/**
 * =============================================
 * 作    者：Junl(袁军亮)
 * 版    本：1.0
 * 描    述：fragment嵌套viewpager
 * <p>
 * 创建日期：2017/5/31
 * 开心一刻：人生若只如初见，何事秋风悲画扇。
 * =============================================
 */

public class SecondHomeFragment extends Fragment implements ViewPager.OnPageChangeListener,View.OnClickListener{
    private RadioGroup mRadioGroup;
    private ViewPager viewPager;
    private ArrayList<Fragment> fragments;


    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_second_home, container, false);
        mRadioGroup = (RadioGroup) view.findViewById(R.id.radioGroup2);
        viewPager = (ViewPager) view.findViewById(R.id.viewPager);

        fragments = new ArrayList<Fragment>();
        fragments.add(new SafeFragment());
        fragments.add(new HappyFragment());
        fragments.add(new HealthFragment());

        view.findViewById(R.id.rbtn_safe).setOnClickListener(this);
        view.findViewById(R.id.rbtn_happy).setOnClickListener(this);
        view.findViewById(R.id.rbtn_health).setOnClickListener(this);

        /**
         * Fragment和ViewPager多层嵌套,容易出现内层fragment某些页面数据丢失...
         * 参考：http://blog.csdn.net/luuzhu/article/details/52830341
         * 注意该处使用getChildFragmentManager()而非getSupportFragmentManager()
         */
        viewPager.setAdapter(new FragmentPagerAdapter(getChildFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return fragments.get(position);
            }

            @Override
            public int getCount() {
                return fragments.size();
            }
        });

        viewPager.setOnPageChangeListener(this);
        mRadioGroup.check(R.id.rbtn_safe);

        return view;
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {}

    /**
     * RadioGroup设置被选中项
     * @param position
     */
    @Override
    public void onPageSelected(int position) {
        switch (position) {
            case 0:
                mRadioGroup.check(R.id.rbtn_safe);
                break;
            case 1:
                mRadioGroup.check(R.id.rbtn_happy);
                break;
            case 2:
                mRadioGroup.check(R.id.rbtn_health);
                break;
        }
    }

    @Override
    public void onPageScrollStateChanged(int state) {}

    /**
     * viewpager设置被选中项
     * @param v
     */
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.rbtn_safe:
                viewPager.setCurrentItem(0, true);
                break;
            case R.id.rbtn_happy:
                viewPager.setCurrentItem(1, true);
                break;
            case R.id.rbtn_health:
                viewPager.setCurrentItem(2, true);
                break;
        }
    }
}
