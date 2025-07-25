package io.appmetrica.analytics.location.impl;

import io.appmetrica.analytics.locationapi.internal.CacheArguments;
import io.appmetrica.analytics.locationapi.internal.LocationFilter;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.appmetrica.analytics.location.impl.i */
/* loaded from: classes9.dex */
public final class C35089i {

    /* renamed from: a */
    public final LocationFilter f95728a;

    /* renamed from: b */
    public final CacheArguments f95729b;

    public C35089i(LocationFilter locationFilter, CacheArguments cacheArguments) {
        this.f95728a = locationFilter;
        this.f95729b = cacheArguments;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.m17075f(C35089i.class, cls)) {
            return false;
        }
        if (obj != null) {
            C35089i c35089i = (C35089i) obj;
            if (Intrinsics.m17075f(this.f95728a, c35089i.f95728a) && Intrinsics.m17075f(this.f95729b, c35089i.f95729b)) {
                return true;
            }
            return false;
        }
        throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.location.impl.LocationConfig");
    }

    public final int hashCode() {
        return this.f95729b.hashCode() + (this.f95728a.hashCode() * 31);
    }

    public final String toString() {
        return "LocationConfig(locationFilter=" + this.f95728a + ", cacheArguments=" + this.f95729b + ')';
    }

    public /* synthetic */ C35089i() {
        this(new LocationFilter(0L, 0.0f, 3, null), new CacheArguments(0L, 0L, 3, null));
    }
}
