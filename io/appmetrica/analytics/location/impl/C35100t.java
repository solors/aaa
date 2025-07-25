package io.appmetrica.analytics.location.impl;

import android.location.Location;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.locationapi.internal.LocationFilter;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: io.appmetrica.analytics.location.impl.t */
/* loaded from: classes9.dex */
public final class C35100t {

    /* renamed from: a */
    public LocationFilter f95759a;

    /* renamed from: d */
    public Location f95762d;

    /* renamed from: e */
    public long f95763e;

    /* renamed from: c */
    public final CopyOnWriteArrayList f95761c = new CopyOnWriteArrayList();

    /* renamed from: b */
    public final TimePassedChecker f95760b = new TimePassedChecker();

    public C35100t(LocationFilter locationFilter) {
        this.f95759a = locationFilter;
    }
}
