package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.LocationManager;

/* renamed from: io.appmetrica.analytics.impl.z2 */
/* loaded from: classes9.dex */
public final class C35054z2 {

    /* renamed from: a */
    public final LocationManager f95674a;

    public C35054z2(Context context) {
        this((LocationManager) context.getSystemService("location"));
    }

    public C35054z2(LocationManager locationManager) {
        this.f95674a = locationManager;
    }
}
