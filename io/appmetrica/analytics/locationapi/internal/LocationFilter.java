package io.appmetrica.analytics.locationapi.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes9.dex */
public final class LocationFilter {

    /* renamed from: a */
    private final long f95777a;

    /* renamed from: b */
    private final float f95778b;

    public LocationFilter() {
        this(0L, 0.0f, 3, null);
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
        if (!Intrinsics.m17075f(LocationFilter.class, cls)) {
            return false;
        }
        if (obj != null) {
            LocationFilter locationFilter = (LocationFilter) obj;
            if (this.f95777a == locationFilter.f95777a && this.f95778b == locationFilter.f95778b) {
                return true;
            }
            return false;
        }
        throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.locationapi.internal.LocationFilter");
    }

    public final float getUpdateDistanceInterval() {
        return this.f95778b;
    }

    public final long getUpdateTimeInterval() {
        return this.f95777a;
    }

    public int hashCode() {
        return Float.hashCode(this.f95778b) + (Long.hashCode(this.f95777a) * 31);
    }

    @NotNull
    public String toString() {
        return "LocationFilter(updateTimeInterval=" + this.f95777a + ", updateDistanceInterval=" + this.f95778b + ')';
    }

    public LocationFilter(long j, float f) {
        this.f95777a = j;
        this.f95778b = f;
    }

    public /* synthetic */ LocationFilter(long j, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 5000L : j, (i & 2) != 0 ? 10.0f : f);
    }
}
