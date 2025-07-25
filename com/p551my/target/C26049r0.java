package com.p551my.target;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.my.target.r0 */
/* loaded from: classes7.dex */
public class C26049r0 extends LinearLayoutManager {

    /* renamed from: a */
    public final float f67728a;

    /* renamed from: b */
    public InterfaceC26050a f67729b;

    /* renamed from: com.my.target.r0$a */
    /* loaded from: classes7.dex */
    public interface InterfaceC26050a {
        /* renamed from: a */
        void mo43097a();
    }

    public C26049r0(float f, Context context) {
        super(context, 0, false);
        this.f67728a = AbstractC26075s1.m42940a(f, -1.0f) == 0 ? 0.75f : f;
    }

    /* renamed from: a */
    public boolean m43099a(View view) {
        return findViewByPosition(findFirstCompletelyVisibleItemPosition()) == view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void measureChildWithMargins(View view, int i, int i2) {
        ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).width = (int) (getWidth() * this.f67728a);
        super.measureChildWithMargins(view, i, i2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        InterfaceC26050a interfaceC26050a = this.f67729b;
        if (interfaceC26050a != null) {
            interfaceC26050a.mo43097a();
        }
    }

    /* renamed from: a */
    public void m43098a(InterfaceC26050a interfaceC26050a) {
        this.f67729b = interfaceC26050a;
    }
}
