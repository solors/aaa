package io.appmetrica.analytics.location.impl;

import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.cache.SynchronizedDataCache;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.location.impl.m */
/* loaded from: classes9.dex */
public final class C35093m extends SynchronizedDataCache {

    /* renamed from: d */
    public static final long f95744d = 200;

    /* renamed from: e */
    public static final long f95745e = 50;

    /* renamed from: a */
    public final C35092l f95747a;

    /* renamed from: b */
    public static final long f95742b = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: c */
    public static final long f95743c = TimeUnit.MINUTES.toMillis(2);

    /* renamed from: f */
    public static final List<String> f95746f = Arrays.asList("gps", "network");

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C35093m() {
        /*
            r6 = this;
            io.appmetrica.analytics.location.impl.l r1 = new io.appmetrica.analytics.location.impl.l
            long r2 = io.appmetrica.analytics.location.impl.C35093m.f95743c
            r1.<init>(r2)
            long r2 = io.appmetrica.analytics.location.impl.C35093m.f95742b
            r4 = 2
            long r4 = r4 * r2
            r0 = r6
            r0.<init>(r1, r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.location.impl.C35093m.<init>():void");
    }

    @Override // io.appmetrica.analytics.coreutils.internal.cache.DataCache
    /* renamed from: a */
    public final boolean shouldUpdate(@NonNull Location location) {
        return f95746f.contains(location.getProvider()) && (this.mCachedData.isEmpty() || this.mCachedData.shouldUpdateData() || m20681a(location, (Location) this.mCachedData.getData(), this.f95747a.f95741a, 200L));
    }

    public C35093m(C35092l c35092l, long j, long j2) {
        super(j, j2, "location");
        this.f95747a = c35092l;
    }

    /* renamed from: a */
    public static boolean m20681a(@Nullable Location location, @Nullable Location location2, long j, long j2) {
        boolean equals;
        if (location2 == null) {
            return true;
        }
        if (location == null) {
            return false;
        }
        long time = location.getTime() - location2.getTime();
        boolean z = time > j;
        boolean z2 = time < (-j);
        boolean z3 = time > 0;
        if (z) {
            return true;
        }
        if (z2) {
            return false;
        }
        int accuracy = (int) (location.getAccuracy() - location2.getAccuracy());
        boolean z4 = accuracy > 0;
        boolean z5 = accuracy < 0;
        boolean z6 = ((long) accuracy) > j2;
        String provider = location.getProvider();
        String provider2 = location2.getProvider();
        if (provider == null) {
            equals = provider2 == null;
        } else {
            equals = provider.equals(provider2);
        }
        if (z5) {
            return true;
        }
        if (!z3 || z4) {
            return z3 && !z6 && equals;
        }
        return true;
    }
}
