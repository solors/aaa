package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class m61 {
    @NotNull

    /* renamed from: a */
    private final r31 f82060a;

    public /* synthetic */ m61(Context context, jl1 jl1Var) {
        this(context, jl1Var, new r31(context, jl1Var));
    }

    @Nullable
    /* renamed from: a */
    public final n31 m32089a(@NotNull C30149d8<String> adResponse) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        String m35081G = adResponse.m35081G();
        if (m35081G != null && m35081G.length() != 0) {
            return this.f82060a.m30158a(m35081G);
        }
        return null;
    }

    public m61(@NotNull Context context, @NotNull jl1 reporter, @NotNull r31 nativeAdResponseParser) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(nativeAdResponseParser, "nativeAdResponseParser");
        this.f82060a = nativeAdResponseParser;
    }
}
