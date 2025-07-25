package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.TextView;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class qb2 implements View.OnClickListener {
    @Nullable

    /* renamed from: a */
    private final View f84295a;

    public qb2(@Nullable TextView textView) {
        this.f84295a = textView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@Nullable View view) {
        View view2 = this.f84295a;
        if (view2 != null) {
            view2.performClick();
        }
    }
}
