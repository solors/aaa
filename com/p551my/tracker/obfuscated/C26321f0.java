package com.p551my.tracker.obfuscated;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;

/* renamed from: com.my.tracker.obfuscated.f0 */
/* loaded from: classes7.dex */
public final class C26321f0 {

    /* renamed from: a */
    Location f68576a;

    /* renamed from: b */
    int f68577b = -1;

    /* renamed from: c */
    private volatile boolean f68578c = true;

    /* renamed from: a */
    public void m42077a(Context context) {
        LocationManager locationManager;
        int i;
        Location location = null;
        this.f68576a = null;
        char c = 65535;
        this.f68577b = -1;
        if (this.f68578c && C26378o0.m41900a("android.permission.ACCESS_FINE_LOCATION", context) && C26378o0.m41900a("android.permission.ACCESS_COARSE_LOCATION", context) && !C26378o0.m41901a() && (locationManager = (LocationManager) context.getSystemService("location")) != null) {
            long j = 0;
            float f = Float.MAX_VALUE;
            String str = null;
            for (String str2 : locationManager.getAllProviders()) {
                try {
                    Location lastKnownLocation = locationManager.getLastKnownLocation(str2);
                    if (lastKnownLocation != null) {
                        float accuracy = lastKnownLocation.getAccuracy();
                        long time = lastKnownLocation.getTime();
                        if (location == null || (time > j && accuracy < f)) {
                            str = str2;
                            location = lastKnownLocation;
                            f = accuracy;
                            j = time;
                        }
                    }
                } catch (SecurityException unused) {
                    C26468z0.m41528a("Permission android.permission.ACCESS_COARSE_LOCATION or android.permission.ACCESS_FINE_LOCATION check was positive, but still got security exception on the location provider");
                }
            }
            if (location != null) {
                this.f68576a = location;
                str.hashCode();
                switch (str.hashCode()) {
                    case -792039641:
                        if (str.equals("passive")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 102570:
                        if (str.equals("gps")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 1843485230:
                        if (str.equals("network")) {
                            c = 2;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        i = 4;
                        break;
                    case 1:
                        this.f68577b = 2;
                        return;
                    case 2:
                        i = 3;
                        break;
                    default:
                        this.f68577b = 1;
                        return;
                }
                this.f68577b = i;
            }
        }
    }

    /* renamed from: a */
    public void m42076a(C26405s0 c26405s0, Context context) {
        Location location = this.f68576a;
        if (location != null) {
            c26405s0.m41714a(location, this.f68577b);
        }
    }

    /* renamed from: a */
    public void m42075a(boolean z) {
        this.f68578c = z;
    }

    /* renamed from: b */
    public void m42074b(Context context) {
    }
}
