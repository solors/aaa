package com.applovin.impl.adview;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.applovin.impl.adview.AbstractC4028e;

/* renamed from: com.applovin.impl.adview.g */
/* loaded from: classes2.dex */
public class C4034g extends FrameLayout {

    /* renamed from: a */
    private AbstractC4028e f4675a;

    /* renamed from: b */
    private int f4676b;

    public C4034g(AbstractC4028e.EnumC4029a enumC4029a, Activity activity) {
        super(activity);
        setBackgroundColor(0);
        AbstractC4028e m100859a = AbstractC4028e.m100859a(enumC4029a, activity);
        this.f4675a = m100859a;
        addView(m100859a);
    }

    /* renamed from: a */
    public void m100838a(AbstractC4028e.EnumC4029a enumC4029a) {
        if (enumC4029a == null || enumC4029a == this.f4675a.getStyle()) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.f4675a.getLayoutParams();
        removeView(this.f4675a);
        AbstractC4028e m100859a = AbstractC4028e.m100859a(enumC4029a, getContext());
        this.f4675a = m100859a;
        addView(m100859a);
        this.f4675a.setLayoutParams(layoutParams);
        this.f4675a.mo100836a(this.f4676b);
    }

    /* renamed from: a */
    public void m100839a(int i, int i2, int i3, int i4) {
        this.f4676b = i;
        int i5 = i2 + i + i3;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = i5;
            layoutParams.width = i5;
        } else {
            setLayoutParams(new FrameLayout.LayoutParams(i5, i5));
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i, i, i4);
        layoutParams2.setMargins(i3, i3, i3, 0);
        this.f4675a.setLayoutParams(layoutParams2);
        this.f4675a.mo100836a(i);
    }
}
