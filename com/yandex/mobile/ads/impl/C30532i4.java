package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.C30767l4;
import com.yandex.mobile.ads.impl.as1;
import java.util.List;
import kotlin.collections._Collections;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.i4 */
/* loaded from: classes8.dex */
public final class C30532i4 {
    @NotNull

    /* renamed from: a */
    private final C30767l4 f80313a;
    @NotNull

    /* renamed from: b */
    private final C30600j4 f80314b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C30532i4() {
        this(C30767l4.C30768a.m32352a(), new C30600j4());
        int i = C30767l4.f81682e;
    }

    @NotNull
    /* renamed from: a */
    public final String m33375a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return m33374a(context, this.f80313a.m32354c());
    }

    @NotNull
    /* renamed from: b */
    public final String m33373b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return m33374a(context, this.f80313a.m32353d());
    }

    /* renamed from: a */
    private final String m33374a(Context context, List<String> list) {
        int m16912j;
        String m17521z0;
        this.f80314b.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        int i = as1.f76895l;
        yp1 m35796a = as1.C29962a.m35776a().m35796a(context);
        m16912j = _Ranges.m16912j((m35796a == null || m35796a.m26762e() == 0) ? 5 : m35796a.m26762e(), list.size());
        m17521z0 = _Collections.m17521z0(list.subList(list.size() - m16912j, list.size()), ",", null, null, 0, null, null, 62, null);
        return m17521z0;
    }

    public C30532i4(@NotNull C30767l4 adIdStorage, @NotNull C30600j4 adIdHeaderSizeProvider) {
        Intrinsics.checkNotNullParameter(adIdStorage, "adIdStorage");
        Intrinsics.checkNotNullParameter(adIdHeaderSizeProvider, "adIdHeaderSizeProvider");
        this.f80313a = adIdStorage;
        this.f80314b = adIdHeaderSizeProvider;
    }
}
