package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.C25044s;
import java.util.Comparator;
import kotlin.Tuples;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.b */
/* loaded from: classes7.dex */
public final class C24920b implements Comparator<C25044s> {

    /* renamed from: b */
    public final double f64399b;
    @Nullable

    /* renamed from: c */
    public final Long f64400c;
    @Nullable

    /* renamed from: d */
    public final Integer f64401d;
    @Nullable

    /* renamed from: f */
    public final Integer f64402f;

    public C24920b(double d, @Nullable Long l, @Nullable Integer num, @Nullable Integer num2) {
        this.f64399b = d;
        this.f64400c = l;
        this.f64401d = num;
        this.f64402f = num2;
    }

    @Override // java.util.Comparator
    /* renamed from: a */
    public int compare(@NotNull C25044s mf1, @NotNull C25044s mf2) {
        Tuples m45400s;
        Intrinsics.checkNotNullParameter(mf1, "mf1");
        Intrinsics.checkNotNullParameter(mf2, "mf2");
        m45400s = C24956i.m45400s(mf1, mf2, this.f64399b, this.f64400c, this.f64401d, this.f64402f);
        return Intrinsics.m17071j(((Number) m45400s.m17631b()).intValue(), ((Number) m45400s.m17632a()).intValue());
    }
}
