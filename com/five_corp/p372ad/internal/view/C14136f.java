package com.five_corp.p372ad.internal.view;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.five_corp.p372ad.internal.cache.C13729b;
import com.five_corp.p372ad.internal.cache.C13733f;
import com.five_corp.p372ad.internal.layouter.C13831i;
import com.five_corp.p372ad.internal.layouter.InterfaceC13834l;
import com.five_corp.p372ad.internal.p373ad.custom_layout.C13649j;

/* renamed from: com.five_corp.ad.internal.view.f */
/* loaded from: classes4.dex */
public final class C14136f extends FrameLayout implements InterfaceC13834l {

    /* renamed from: a */
    public final C13729b f26794a;

    public C14136f(Context context, C13733f c13733f, C13649j c13649j) {
        super(context);
        C13729b m78419a = c13733f.m78419a(context, c13649j.f25320b);
        C13729b m78419a2 = c13733f.m78419a(context, c13649j.f25319a);
        this.f26794a = m78419a2;
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
        m78419a.setScaleType(scaleType);
        m78419a2.setScaleType(scaleType);
        addView(m78419a, new FrameLayout.LayoutParams(-1, -1));
        addView(m78419a2, new FrameLayout.LayoutParams(0, -1));
    }

    @Override // com.five_corp.p372ad.internal.layouter.InterfaceC13834l
    /* renamed from: a */
    public final void mo78061a(C13831i c13831i) {
        ViewGroup.LayoutParams layoutParams = this.f26794a.getLayoutParams();
        layoutParams.width = (int) (getWidth() * c13831i.f25825d);
        this.f26794a.setLayoutParams(layoutParams);
    }
}
