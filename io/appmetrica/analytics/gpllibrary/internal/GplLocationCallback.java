package io.appmetrica.analytics.gpllibrary.internal;

import android.location.LocationListener;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;

/* loaded from: classes9.dex */
class GplLocationCallback extends LocationCallback {

    /* renamed from: a */
    private final LocationListener f92515a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public GplLocationCallback(LocationListener locationListener) {
        this.f92515a = locationListener;
    }

    @Override // com.google.android.gms.location.LocationCallback
    public void onLocationResult(LocationResult locationResult) {
        this.f92515a.onLocationChanged(locationResult.getLastLocation());
    }
}
