package io.appmetrica.analytics.location.impl;

import android.content.Context;
import android.location.Location;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.coreutils.internal.cache.LocationDataCacheUpdateScheduler;
import io.appmetrica.analytics.locationapi.internal.ILastKnownUpdater;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import io.appmetrica.analytics.locationapi.internal.LocationReceiver;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.location.impl.k */
/* loaded from: classes9.dex */
public final class C35091k implements ILastKnownUpdater, LocationControllerObserver {

    /* renamed from: a */
    public final Context f95732a;

    /* renamed from: b */
    public final PermissionExtractor f95733b;

    /* renamed from: c */
    public final C35096p f95734c;

    /* renamed from: d */
    public final IHandlerExecutor f95735d;

    /* renamed from: e */
    public final C35094n f95736e;

    /* renamed from: f */
    public final LocationDataCacheUpdateScheduler f95737f;

    /* renamed from: g */
    public boolean f95738g;

    /* renamed from: h */
    public final HashMap f95739h = new HashMap();

    /* renamed from: i */
    public final HashMap f95740i = new HashMap();

    public C35091k(@NonNull Context context, @NonNull PermissionExtractor permissionExtractor, @NonNull IHandlerExecutor iHandlerExecutor, @NonNull C35096p c35096p) {
        this.f95732a = context;
        this.f95734c = c35096p;
        this.f95733b = permissionExtractor;
        this.f95735d = iHandlerExecutor;
        this.f95736e = new C35094n(c35096p);
        LocationDataCacheUpdateScheduler locationDataCacheUpdateScheduler = new LocationDataCacheUpdateScheduler(iHandlerExecutor, this, c35096p.m20679a(), "loc");
        this.f95737f = locationDataCacheUpdateScheduler;
        c35096p.m20679a().setUpdateScheduler(locationDataCacheUpdateScheduler);
    }

    @Nullable
    /* renamed from: a */
    public final Location m20690a() {
        return (Location) this.f95734c.f95751b.getData();
    }

    /* renamed from: b */
    public final synchronized void m20686b() {
        this.f95737f.startUpdates();
        for (LocationReceiver locationReceiver : this.f95740i.values()) {
            locationReceiver.startLocationUpdates();
        }
        updateLastKnown();
    }

    /* renamed from: c */
    public final synchronized void m20683c() {
        this.f95737f.stopUpdates();
        for (LocationReceiver locationReceiver : this.f95740i.values()) {
            locationReceiver.stopLocationUpdates();
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public final synchronized void startLocationTracking() {
        if (!this.f95738g) {
            this.f95738g = true;
            m20686b();
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public final synchronized void stopLocationTracking() {
        if (this.f95738g) {
            this.f95738g = false;
            m20683c();
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.ILastKnownUpdater
    public final synchronized void updateLastKnown() {
        for (LastKnownLocationExtractor lastKnownLocationExtractor : this.f95739h.values()) {
            lastKnownLocationExtractor.updateLastKnownLocation();
        }
    }

    @AnyThread
    /* renamed from: a */
    public final void m20689a(@NonNull C35089i c35089i) {
        this.f95735d.execute(new RunnableC35090j(this, c35089i));
    }

    @AnyThread
    /* renamed from: a */
    public final synchronized void m20688a(@NonNull LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        LastKnownLocationExtractor extractor = lastKnownLocationExtractorProvider.getExtractor(this.f95732a, this.f95733b, this.f95735d, this.f95736e);
        this.f95739h.put(lastKnownLocationExtractorProvider.getIdentifier(), extractor);
        if (this.f95738g) {
            extractor.updateLastKnownLocation();
        }
    }

    @AnyThread
    /* renamed from: b */
    public final synchronized void m20685b(@NonNull LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        this.f95739h.remove(lastKnownLocationExtractorProvider.getIdentifier());
    }

    @AnyThread
    /* renamed from: b */
    public final synchronized void m20684b(@NonNull LocationReceiverProvider locationReceiverProvider) {
        LocationReceiver locationReceiver = (LocationReceiver) this.f95740i.remove(locationReceiverProvider.getIdentifier());
        if (locationReceiver != null && this.f95738g) {
            locationReceiver.stopLocationUpdates();
        }
    }

    @AnyThread
    /* renamed from: a */
    public final synchronized void m20687a(@NonNull LocationReceiverProvider locationReceiverProvider) {
        LocationReceiver locationReceiver = locationReceiverProvider.getLocationReceiver(this.f95732a, this.f95733b, this.f95735d, this.f95736e);
        LocationReceiver locationReceiver2 = (LocationReceiver) this.f95740i.put(locationReceiverProvider.getIdentifier(), locationReceiver);
        if (this.f95738g) {
            if (locationReceiver2 != null) {
                locationReceiver2.stopLocationUpdates();
            }
            locationReceiver.startLocationUpdates();
        }
    }
}
