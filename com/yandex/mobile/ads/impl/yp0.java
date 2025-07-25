package com.yandex.mobile.ads.impl;

import android.location.Location;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class yp0 {

    /* renamed from: a */
    private static final long f88331a = TimeUnit.MINUTES.toMillis(2);

    /* renamed from: a */
    public static boolean m26797a(@NotNull Location updatedLocation, @Nullable Location location) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        Intrinsics.checkNotNullParameter(updatedLocation, "updatedLocation");
        if (location == null) {
            return true;
        }
        long time = updatedLocation.getTime() - location.getTime();
        long j = f88331a;
        if (time > j) {
            z = true;
        } else {
            z = false;
        }
        if (time < (-j)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (time > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        int accuracy = (int) (updatedLocation.getAccuracy() - location.getAccuracy());
        if (accuracy > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (accuracy < 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (accuracy > 200) {
            z6 = true;
        } else {
            z6 = false;
        }
        boolean m17075f = Intrinsics.m17075f(updatedLocation.getProvider(), location.getProvider());
        if (z) {
            return true;
        }
        if (!z2) {
            if (z5) {
                return true;
            }
            if (z3 && !z4) {
                return true;
            }
            if (z3 && !z6 && m17075f) {
                return true;
            }
        }
        return false;
    }
}
