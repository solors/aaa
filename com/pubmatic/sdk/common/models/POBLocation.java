package com.pubmatic.sdk.common.models;

import android.location.Location;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.C20747r8;
import com.pubmatic.sdk.common.log.POBLog;

/* loaded from: classes7.dex */
public class POBLocation {

    /* renamed from: a */
    private long f70162a;

    /* renamed from: b */
    private float f70163b;

    /* renamed from: c */
    private double f70164c;

    /* renamed from: d */
    private double f70165d;
    @Nullable

    /* renamed from: e */
    private Source f70166e;

    /* loaded from: classes7.dex */
    public enum Source {
        GPS(1),
        IP_ADDRESS(2),
        USER(3);
        

        /* renamed from: b */
        private final int f70168b;

        Source(int i) {
            this.f70168b = i;
        }

        public int getValue() {
            return this.f70168b;
        }
    }

    public POBLocation(@NonNull Source source, double d, double d2) {
        this.f70166e = source;
        this.f70164c = d;
        this.f70165d = d2;
    }

    public float getAccuracy() {
        return this.f70163b;
    }

    public long getLastFixInMillis() {
        return this.f70162a;
    }

    public double getLatitude() {
        return this.f70164c;
    }

    public double getLongitude() {
        return this.f70165d;
    }

    @Nullable
    public Source getSource() {
        return this.f70166e;
    }

    public POBLocation(@NonNull Location location) {
        if (location != null) {
            this.f70164c = location.getLatitude();
            this.f70165d = location.getLongitude();
            String provider = location.getProvider();
            if (provider != null && (provider.equalsIgnoreCase("network") || provider.equalsIgnoreCase("gps") || provider.equalsIgnoreCase(C20747r8.f52730b))) {
                this.f70166e = Source.GPS;
            } else {
                this.f70166e = Source.USER;
            }
            this.f70163b = location.getAccuracy();
            this.f70162a = (SystemClock.elapsedRealtimeNanos() - location.getElapsedRealtimeNanos()) / 1000000;
            return;
        }
        POBLog.debug("POBLocation", "Provided location object is null", new Object[0]);
    }
}
