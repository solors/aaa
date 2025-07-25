package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.fl1;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.la */
/* loaded from: classes8.dex */
public final class C30778la implements bd1 {
    @NotNull

    /* renamed from: a */
    private final fl1.EnumC30325c f81751a;
    @Nullable

    /* renamed from: b */
    private final String f81752b;

    public C30778la(@NotNull fl1.EnumC30325c status, @Nullable String str) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f81751a = status;
        this.f81752b = str;
    }

    @Override // com.yandex.mobile.ads.impl.bd1
    @NotNull
    /* renamed from: a */
    public final Map<String, Object> mo28030a(long j) {
        gl1 gl1Var = new gl1((Map) null, 3);
        gl1Var.m33814b(this.f81752b, "adapter");
        gl1Var.m33814b(this.f81751a.m34118a(), "status");
        gl1Var.m33814b(Long.valueOf(j), "duration");
        return gl1Var.m33815b();
    }
}
