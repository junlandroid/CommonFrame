package com.hy.junl.tablayou.second;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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

public class SecondMineFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_second_mine, container, false);
        return view;
    }
}
