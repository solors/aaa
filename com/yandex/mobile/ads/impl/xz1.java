package com.yandex.mobile.ads.impl;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class xz1 extends Spannable.Factory {
    @Nullable

    /* renamed from: a */
    private final Drawable f87963a;

    /* renamed from: b */
    private final int f87964b;

    /* renamed from: c */
    private final int f87965c;

    public xz1(@Nullable Drawable drawable, int i, int i2) {
        this.f87963a = drawable;
        this.f87964b = i;
        this.f87965c = i2;
    }

    @Override // android.text.Spannable.Factory
    @NotNull
    public final Spannable newSpannable(@NotNull CharSequence source) {
        Intrinsics.checkNotNullParameter(source, "source");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (this.f87963a != null && this.f87964b > 0) {
            spannableStringBuilder.append((CharSequence) "  ");
            Drawable drawable = this.f87963a;
            int i = this.f87964b;
            drawable.setBounds(0, 0, i, i);
            C31028oc c31028oc = new C31028oc(drawable);
            ColorDrawable colorDrawable = new ColorDrawable(0);
            int i2 = this.f87965c;
            colorDrawable.setBounds(0, 0, i2, i2);
            C31028oc c31028oc2 = new C31028oc(colorDrawable);
            spannableStringBuilder.setSpan(c31028oc, 0, 1, 33);
            spannableStringBuilder.setSpan(c31028oc2, 1, 2, 33);
        }
        spannableStringBuilder.append(source);
        return spannableStringBuilder;
    }
}
