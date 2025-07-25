package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.C30284f2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.d2 */
/* loaded from: classes8.dex */
public final class C30139d2 {
    @NotNull

    /* renamed from: a */
    private final C30218e2 f77841a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C30139d2(Context context) {
        this(context, C30284f2.C30285a.m34382a(context).m34383c());
        int i = C30284f2.f78883d;
    }

    @NotNull
    /* renamed from: a */
    public final C29982b2 m35122a() {
        return this.f77841a.m34704b();
    }

    public C30139d2(@NotNull Context context, @NotNull C30218e2 adBlockerStateStorage) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adBlockerStateStorage, "adBlockerStateStorage");
        this.f77841a = adBlockerStateStorage;
    }
}
