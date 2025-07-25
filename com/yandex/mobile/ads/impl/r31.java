package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

/* loaded from: classes8.dex */
public final class r31 implements zm1<n31> {
    @NotNull

    /* renamed from: a */
    private final bd2 f84616a;
    @NotNull

    /* renamed from: b */
    private final y51 f84617b;

    public /* synthetic */ r31(Context context, jl1 jl1Var) {
        this(context, jl1Var, b91.m35565a(), new y51(context, jl1Var));
    }

    @Nullable
    /* renamed from: a */
    public final n31 m30158a(@NotNull String stringResponse) {
        Intrinsics.checkNotNullParameter(stringResponse, "stringResponse");
        try {
            return this.f84617b.m27029a(stringResponse);
        } catch (i31 unused) {
            um0.m28727b(new Object[0]);
            return null;
        } catch (JSONException unused2) {
            um0.m28727b(new Object[0]);
            return null;
        }
    }

    public r31(@NotNull Context context, @NotNull jl1 reporter, @NotNull bd2 volleyNetworkResponseDecoder, @NotNull y51 nativeJsonParser) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(volleyNetworkResponseDecoder, "volleyNetworkResponseDecoder");
        Intrinsics.checkNotNullParameter(nativeJsonParser, "nativeJsonParser");
        this.f84616a = volleyNetworkResponseDecoder;
        this.f84617b = nativeJsonParser;
    }

    @Override // com.yandex.mobile.ads.impl.zm1
    /* renamed from: a */
    public final n31 mo26085a(c91 networkResponse) {
        Intrinsics.checkNotNullParameter(networkResponse, "networkResponse");
        String mo35246a = this.f84616a.mo35246a(networkResponse);
        if (mo35246a == null || mo35246a.length() == 0) {
            return null;
        }
        return m30158a(mo35246a);
    }
}
