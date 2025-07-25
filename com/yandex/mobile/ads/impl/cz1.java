package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import java.util.HashSet;
import java.util.List;
import kotlin.collections.C37563v;
import kotlin.collections.CollectionsJVM;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class cz1 {
    @NotNull

    /* renamed from: c */
    private static final HashSet f77812c;
    @NotNull

    /* renamed from: d */
    private static final HashSet f77813d;
    @Nullable

    /* renamed from: a */
    private final LocationManager f77814a;
    @NotNull

    /* renamed from: b */
    private final vc1 f77815b;

    static {
        List m17175e;
        List m17163p;
        m17175e = CollectionsJVM.m17175e("gps");
        f77812c = new HashSet(m17175e);
        m17163p = C37563v.m17163p("gps", "passive");
        f77813d = new HashSet(m17163p);
    }

    public /* synthetic */ cz1(Context context, LocationManager locationManager) {
        this(context, locationManager, new vc1(context));
    }

    @Nullable
    /* renamed from: a */
    public final Location m35132a(@NotNull String locationProvider) {
        Intrinsics.checkNotNullParameter(locationProvider, "locationProvider");
        boolean m28369a = this.f77815b.m28369a();
        boolean m28368b = this.f77815b.m28368b();
        boolean z = !f77812c.contains(locationProvider);
        if (f77813d.contains(locationProvider)) {
            if (!z || !m28369a || !m28368b) {
                return null;
            }
        } else if (!z || !m28369a) {
            return null;
        }
        try {
            LocationManager locationManager = this.f77814a;
            if (locationManager == null) {
                return null;
            }
            Location lastKnownLocation = locationManager.getLastKnownLocation(locationProvider);
            um0.m28728a(locationProvider, lastKnownLocation);
            return lastKnownLocation;
        } catch (Throwable unused) {
            um0.m28727b(new Object[0]);
            return null;
        }
    }

    public cz1(@NotNull Context context, @Nullable LocationManager locationManager, @NotNull vc1 permissionExtractor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(permissionExtractor, "permissionExtractor");
        this.f77814a = locationManager;
        this.f77815b = permissionExtractor;
    }
}
