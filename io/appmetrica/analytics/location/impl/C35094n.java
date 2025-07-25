package io.appmetrica.analytics.location.impl;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.location.impl.n */
/* loaded from: classes9.dex */
public final class C35094n implements LocationListener {

    /* renamed from: a */
    public final C35096p f95748a;

    public C35094n(C35096p c35096p) {
        this.f95748a = c35096p;
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        boolean z;
        if (location != null) {
            C35096p c35096p = this.f95748a;
            c35096p.getClass();
            String provider = location.getProvider();
            C35100t c35100t = (C35100t) c35096p.f95754e.get(provider);
            if (c35100t == null) {
                C35100t c35100t2 = new C35100t(c35096p.f95750a.f95728a);
                c35100t2.f95761c.add(c35096p.f95752c);
                for (Consumer consumer : c35096p.f95753d) {
                    c35100t2.f95761c.add(consumer);
                }
                c35096p.f95754e.put(provider, c35100t2);
                c35100t = c35100t2;
            } else {
                c35100t.f95759a = c35096p.f95750a.f95728a;
            }
            if (c35100t.f95762d != null) {
                boolean didTimePassMillis = c35100t.f95760b.didTimePassMillis(c35100t.f95763e, c35100t.f95759a.getUpdateTimeInterval(), "isSavedLocationOutdated");
                boolean z2 = true;
                if (location.distanceTo(c35100t.f95762d) > c35100t.f95759a.getUpdateDistanceInterval()) {
                    z = true;
                } else {
                    z = false;
                }
                if (c35100t.f95762d != null && location.getTime() - c35100t.f95762d.getTime() < 0) {
                    z2 = false;
                }
                if ((!didTimePassMillis && !z) || !z2) {
                    return;
                }
            }
            c35100t.f95762d = location;
            c35100t.f95763e = System.currentTimeMillis();
            Iterator it = c35100t.f95761c.iterator();
            while (it.hasNext()) {
                ((Consumer) it.next()).consume(location);
            }
        }
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i, Bundle bundle) {
    }
}
