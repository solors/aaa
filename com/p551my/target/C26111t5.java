package com.p551my.target;

import android.content.Context;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.my.target.t5 */
/* loaded from: classes7.dex */
public class C26111t5 extends RecyclerView {

    /* renamed from: a */
    public InterfaceC26112a f67907a;

    /* renamed from: com.my.target.t5$a */
    /* loaded from: classes7.dex */
    public interface InterfaceC26112a {
        /* renamed from: b */
        void mo42841b();
    }

    public C26111t5(Context context) {
        super(context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onScrollStateChanged(int i) {
        InterfaceC26112a interfaceC26112a;
        super.onScrollStateChanged(i);
        if (i == 0 && (interfaceC26112a = this.f67907a) != null) {
            interfaceC26112a.mo42841b();
        }
    }

    public void setMoveStopListener(@Nullable InterfaceC26112a interfaceC26112a) {
        this.f67907a = interfaceC26112a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void smoothScrollBy(int i, int i2) {
        super.smoothScrollBy(i, i2, new AccelerateDecelerateInterpolator());
    }
}
