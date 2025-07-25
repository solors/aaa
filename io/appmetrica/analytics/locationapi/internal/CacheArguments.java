package io.appmetrica.analytics.locationapi.internal;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes9.dex */
public final class CacheArguments {

    /* renamed from: a */
    private final long f95775a;

    /* renamed from: b */
    private final long f95776b;

    public CacheArguments() {
        this(0L, 0L, 3, null);
    }

    public boolean equals(@Nullable Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.m17075f(CacheArguments.class, cls)) {
            return false;
        }
        if (obj != null) {
            CacheArguments cacheArguments = (CacheArguments) obj;
            if (this.f95775a == cacheArguments.f95775a && this.f95776b == cacheArguments.f95776b) {
                return true;
            }
            return false;
        }
        throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.locationapi.internal.CacheArguments");
    }

    public final long getOutdatedTimeInterval() {
        return this.f95776b;
    }

    public final long getRefreshPeriod() {
        return this.f95775a;
    }

    public int hashCode() {
        return Long.hashCode(this.f95776b) + (Long.hashCode(this.f95775a) * 31);
    }

    @NotNull
    public String toString() {
        return "CacheArguments(refreshPeriod=" + this.f95775a + ", outdatedTimeInterval=" + this.f95776b + ')';
    }

    public CacheArguments(long j, long j2) {
        this.f95775a = j;
        this.f95776b = j2;
    }

    public /* synthetic */ CacheArguments(long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? TimeUnit.SECONDS.toMillis(10L) : j, (i & 2) != 0 ? TimeUnit.MINUTES.toMillis(2L) : j2);
    }
}
