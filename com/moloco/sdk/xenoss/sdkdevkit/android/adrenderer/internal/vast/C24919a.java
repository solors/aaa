package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.C25030g;
import java.util.Comparator;
import kotlin.Tuples;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.a */
/* loaded from: classes7.dex */
public final class C24919a implements Comparator<C25030g> {
    @Nullable

    /* renamed from: b */
    public final Integer f64397b;
    @Nullable

    /* renamed from: c */
    public final Integer f64398c;

    public C24919a(@Nullable Integer num, @Nullable Integer num2) {
        this.f64397b = num;
        this.f64398c = num2;
    }

    @Override // java.util.Comparator
    /* renamed from: a */
    public int compare(@NotNull C25030g c1, @NotNull C25030g c2) {
        Tuples m45397v;
        Intrinsics.checkNotNullParameter(c1, "c1");
        Intrinsics.checkNotNullParameter(c2, "c2");
        m45397v = C24956i.m45397v(c1, c2, this.f64397b, this.f64398c);
        return Intrinsics.m17071j(((Number) m45397v.m17631b()).intValue(), ((Number) m45397v.m17632a()).intValue());
    }
}
