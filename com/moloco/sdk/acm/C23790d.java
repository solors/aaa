package com.moloco.sdk.acm;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.moloco.sdk.acm.d */
/* loaded from: classes7.dex */
public final class C23790d {
    @NotNull

    /* renamed from: a */
    private final String f61757a;
    @NotNull

    /* renamed from: b */
    private final String f61758b;

    public C23790d(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f61757a = key;
        this.f61758b = value;
    }

    @NotNull
    /* renamed from: a */
    public final String m47732a() {
        return this.f61757a;
    }

    @NotNull
    /* renamed from: b */
    public final String m47731b() {
        return this.f61758b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23790d)) {
            return false;
        }
        C23790d c23790d = (C23790d) obj;
        if (Intrinsics.m17075f(this.f61757a, c23790d.f61757a) && Intrinsics.m17075f(this.f61758b, c23790d.f61758b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f61757a.hashCode() * 31) + this.f61758b.hashCode();
    }

    @NotNull
    public String toString() {
        return "EventTag(key=" + this.f61757a + ", value=" + this.f61758b + ')';
    }
}
