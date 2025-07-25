package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class hw1 {
    @NotNull

    /* renamed from: a */
    private final xo0 f80225a;
    @NotNull

    /* renamed from: b */
    private final String f80226b;
    @NotNull

    /* renamed from: c */
    private final jw1 f80227c;

    public hw1(@NotNull xo0 link, @NotNull String name, @NotNull jw1 value) {
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f80225a = link;
        this.f80226b = name;
        this.f80227c = value;
    }

    @NotNull
    /* renamed from: a */
    public final xo0 m33449a() {
        return this.f80225a;
    }

    @NotNull
    /* renamed from: b */
    public final String m33448b() {
        return this.f80226b;
    }

    @NotNull
    /* renamed from: c */
    public final jw1 m33447c() {
        return this.f80227c;
    }
}
