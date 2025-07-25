package io.appmetrica.analytics.gpllibrary.internal;

import android.location.Location;
import android.location.LocationListener;
import com.google.android.gms.tasks.OnSuccessListener;

/* loaded from: classes9.dex */
class GplOnSuccessListener implements OnSuccessListener<Location> {

    /* renamed from: a */
    private final LocationListener f92516a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public GplOnSuccessListener(LocationListener locationListener) {
        this.f92516a = locationListener;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Location location) {
        this.f92516a.onLocationChanged(location);
    }
}
