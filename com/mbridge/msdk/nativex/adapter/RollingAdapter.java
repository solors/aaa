package com.mbridge.msdk.nativex.adapter;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import com.mbridge.msdk.nativex.view.MBNativeRollView;
import com.mbridge.msdk.out.Frame;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public class RollingAdapter extends PagerAdapter {
    private List<Frame> list;
    private List<View> listview = new ArrayList();
    private MBNativeRollView.InterfaceC22268a mvinterface;

    public RollingAdapter(List<Frame> list) {
        this.list = new ArrayList();
        this.list = list;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView(this.listview.get(i));
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.list.size();
    }

    public MBNativeRollView.InterfaceC22268a getMvinterface() {
        return this.mvinterface;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        List<Frame> list;
        View m50936a;
        if (this.mvinterface != null && (list = this.list) != null && list.size() > 0 && (m50936a = this.mvinterface.m50936a(this.list.get(i), i)) != null) {
            this.listview.add(m50936a);
            viewGroup.addView(m50936a);
            return m50936a;
        }
        return null;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        if (view == obj) {
            return true;
        }
        return false;
    }

    public void setMvinterface(MBNativeRollView.InterfaceC22268a interfaceC22268a) {
        this.mvinterface = interfaceC22268a;
    }
}
