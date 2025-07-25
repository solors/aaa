package com.yandex.mobile.ads.impl;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C37554o0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class gl1 {
    @NotNull

    /* renamed from: a */
    private final Map<String, Object> f79689a;
    @Nullable

    /* renamed from: b */
    private C30280f f79690b;

    public /* synthetic */ gl1(Map map, int i) {
        this((i & 1) != 0 ? C37554o0.m17366j() : map, (C30280f) null);
    }

    @Nullable
    /* renamed from: a */
    public final C30280f m33820a() {
        return this.f79690b;
    }

    @NotNull
    /* renamed from: b */
    public final Map<String, Object> m33815b() {
        return this.f79689a;
    }

    /* renamed from: a */
    public final void m33819a(@Nullable C30280f c30280f) {
        this.f79690b = c30280f;
    }

    /* renamed from: b */
    public final void m33814b(@Nullable Object obj, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (obj == null) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.f79689a.put(key, "undefined");
            return;
        }
        this.f79689a.put(key, obj);
    }

    public gl1(@NotNull Map<String, ? extends Object> reportData, @Nullable C30280f c30280f) {
        Intrinsics.checkNotNullParameter(reportData, "reportData");
        reportData = TypeIntrinsics.m16998m(reportData) ? reportData : null;
        this.f79689a = reportData == null ? new LinkedHashMap<>() : reportData;
        this.f79690b = c30280f;
    }

    /* renamed from: a */
    public final void m33816a(@NotNull Map<String, ? extends Object> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f79689a.putAll(data);
    }

    /* renamed from: a */
    public final void m33817a(@Nullable List list) {
        Intrinsics.checkNotNullParameter("active_experiments", "key");
        if (list == null || !(!list.isEmpty())) {
            return;
        }
        this.f79689a.put("active_experiments", list);
    }

    /* renamed from: a */
    public final void m33818a(@Nullable Object obj, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (obj != null) {
            this.f79689a.put(key, obj);
        }
    }
}
