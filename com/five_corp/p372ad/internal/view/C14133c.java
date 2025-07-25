package com.five_corp.p372ad.internal.view;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: com.five_corp.ad.internal.view.c */
/* loaded from: classes4.dex */
public final class C14133c extends FrameLayout {

    /* renamed from: a */
    public FrameLayout.LayoutParams f26783a;

    public C14133c(Context context, FrameLayout.LayoutParams layoutParams) {
        super(context);
        this.f26783a = layoutParams;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, this.f26783a);
    }
}
