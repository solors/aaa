package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.u72;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class jj0 implements u72.InterfaceC31557b {
    @NotNull

    /* renamed from: a */
    private final p62 f80933a;

    public jj0(@NotNull kl0 videoAd, @NotNull p62 infoDataProvider) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        Intrinsics.checkNotNullParameter(infoDataProvider, "infoDataProvider");
        this.f80933a = infoDataProvider;
    }

    @Override // com.yandex.mobile.ads.impl.u72.InterfaceC31557b
    @NotNull
    /* renamed from: a */
    public final gl1 mo28856a() {
        gl1 gl1Var = new gl1(new LinkedHashMap(), 2);
        gl1Var.m33814b(this.f80933a.m30832a(), "product_type");
        return gl1Var;
    }
}
