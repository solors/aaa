package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public abstract class iz1 {
    @NotNull

    /* renamed from: a */
    private final String f80692a;

    /* renamed from: b */
    private final boolean f80693b;
    @Nullable

    /* renamed from: c */
    private lz1 f80694c;

    /* renamed from: d */
    private long f80695d;

    public /* synthetic */ iz1(String str) {
        this(str, true);
    }

    /* renamed from: a */
    public final boolean m33088a() {
        return this.f80693b;
    }

    @NotNull
    /* renamed from: b */
    public final String m33085b() {
        return this.f80692a;
    }

    /* renamed from: c */
    public final long m33084c() {
        return this.f80695d;
    }

    @Nullable
    /* renamed from: d */
    public final lz1 m33083d() {
        return this.f80694c;
    }

    /* renamed from: e */
    public abstract long mo29204e();

    @NotNull
    public final String toString() {
        return this.f80692a;
    }

    public iz1(@NotNull String name, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f80692a = name;
        this.f80693b = z;
        this.f80695d = -1L;
    }

    /* renamed from: a */
    public final void m33086a(@NotNull lz1 queue) {
        Intrinsics.checkNotNullParameter(queue, "queue");
        lz1 lz1Var = this.f80694c;
        if (lz1Var == queue) {
            return;
        }
        if (lz1Var == null) {
            this.f80694c = queue;
            return;
        }
        throw new IllegalStateException("task is in multiple queues".toString());
    }

    /* renamed from: a */
    public final void m33087a(long j) {
        this.f80695d = j;
    }
}
