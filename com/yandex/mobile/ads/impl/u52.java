package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class u52 implements Comparable<u52> {

    /* renamed from: b */
    private final int f86119b;

    /* renamed from: c */
    private final int f86120c;

    /* renamed from: d */
    private final int f86121d;

    public u52(int i, int i2, int i3) {
        this.f86119b = i;
        this.f86120c = i2;
        this.f86121d = i3;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(@NotNull u52 other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int i = this.f86119b;
        int i2 = other.f86119b;
        if (i != i2) {
            return Intrinsics.m17071j(i, i2);
        }
        int i3 = this.f86120c;
        int i4 = other.f86120c;
        return i3 != i4 ? Intrinsics.m17071j(i3, i4) : Intrinsics.m17071j(this.f86121d, other.f86121d);
    }

    /* renamed from: a */
    public final int m28878a() {
        return this.f86119b;
    }
}
