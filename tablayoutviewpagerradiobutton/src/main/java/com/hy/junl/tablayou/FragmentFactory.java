package com.hy.junl.tablayou;

import android.support.v4.app.Fragment;
import android.widget.TextView;

import com.hy.junl.tablayou.second.HappyFragment;
import com.hy.junl.tablayou.second.HealthFragment;
import com.hy.junl.tablayou.second.SafeFragment;
import com.hy.junl.tablayou.second.SecondDiscoveryFragment;
import com.hy.junl.tablayou.second.SecondHomeFragment;
import com.hy.junl.tablayou.second.SecondInfoFragment;
import com.hy.junl.tablayou.second.SecondMineFragment;

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

public class FragmentFactory {
    private static Fragment mFragment;

    /**
     * 实例化碎片
     *
     * @param checkedId 被选中的fragmentID
     * @param mToolbar  标题栏title
     */
    public static Fragment create(int checkedId, TextView mToolbar) {
        switch (checkedId) {
            case R.id.rbtn_home:
                mFragment = new SecondHomeFragment();
                if (mToolbar != null)
                    mToolbar.setText("港岛妹妹");
                break;
            case R.id.rbtn_discovery:
                mFragment = new SecondDiscoveryFragment();
                if (mToolbar != null)
                    mToolbar.setText("天空之城");
                break;
            case R.id.rbtn_info:
                mFragment = new SecondInfoFragment();
                if (mToolbar != null)
                    mToolbar.setText("甜蜜的爱情");
                break;

            case R.id.rbtn_mine:
                mFragment = new SecondMineFragment();
                if (mToolbar != null)
                    mToolbar.setText("疯狂的撕裂我");
                break;
//            case R.id.rbtn_safe:
//                mFragment = new SafeFragment();
//                break;
//            case R.id.rbtn_happy:
//                mFragment = new HappyFragment();
//                break;
//            case R.id.rbtn_health:
//                mFragment = new HealthFragment();
//                break;
        }
        return mFragment;
    }
}
