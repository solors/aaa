package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.impl.dj1;
import java.util.Arrays;
import kotlin.jvm.internal.C37612s0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class cj1<V extends View & dj1> extends bb2<V, String> {
    @NotNull

    /* renamed from: c */
    private final jl1 f77647c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cj1(@NotNull V ratingView, @NotNull jl1 reporter) {
        super(ratingView);
        Intrinsics.checkNotNullParameter(ratingView, "ratingView");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        this.f77647c = reporter;
    }

    @Override // com.yandex.mobile.ads.impl.bb2
    /* renamed from: a */
    public final void mo27596a(@NotNull V view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setRating(0.0f);
        super.mo27596a(view);
    }

    @Override // com.yandex.mobile.ads.impl.bb2
    /* renamed from: b */
    public final void mo27593b(View view, String str) {
        float m16918d;
        String value = str;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            m16918d = _Ranges.m16918d(Float.parseFloat(value), 0.0f);
            ((dj1) view).setRating(m16918d);
        } catch (NumberFormatException e) {
            C37612s0 c37612s0 = C37612s0.f99333a;
            Intrinsics.checkNotNullExpressionValue(String.format("Could not parse rating value. Rating value is %s", Arrays.copyOf(new Object[]{value}, 1)), "format(...)");
            Object[] args = new Object[0];
            int i = um0.f86330b;
            Intrinsics.checkNotNullParameter(args, "args");
            this.f77647c.reportError("Could not parse rating value", e);
        }
    }

    @Override // com.yandex.mobile.ads.impl.bb2
    /* renamed from: a */
    public final boolean mo27595a(View view, String str) {
        String value = str;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(value, "value");
        return true;
    }
}
