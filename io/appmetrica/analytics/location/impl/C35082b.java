package io.appmetrica.analytics.location.impl;

import android.content.Context;
import android.location.LocationListener;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.gpllibrary.internal.GplLibraryWrapper;
import io.appmetrica.analytics.gpllibrary.internal.IGplLibraryWrapper;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.location.impl.b */
/* loaded from: classes9.dex */
public final class C35082b implements LastKnownLocationExtractor {

    /* renamed from: a */
    public final Context f95717a;

    /* renamed from: b */
    public final PermissionResolutionStrategy f95718b;

    /* renamed from: c */
    public final LocationListener f95719c;

    /* renamed from: d */
    public final IHandlerExecutor f95720d;

    /* renamed from: e */
    public final C35084d f95721e = new C35084d();

    public C35082b(@NotNull Context context, @NotNull PermissionResolutionStrategy permissionResolutionStrategy, @NotNull LocationListener locationListener, @NotNull IHandlerExecutor iHandlerExecutor) {
        this.f95717a = context;
        this.f95718b = permissionResolutionStrategy;
        this.f95719c = locationListener;
        this.f95720d = iHandlerExecutor;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor
    public final void updateLastKnownLocation() {
        IGplLibraryWrapper gplLibraryWrapper;
        if (this.f95718b.hasNecessaryPermissions(this.f95717a)) {
            try {
                C35084d c35084d = this.f95721e;
                Context context = this.f95717a;
                LocationListener locationListener = this.f95719c;
                IHandlerExecutor iHandlerExecutor = this.f95720d;
                c35084d.getClass();
                if (ReflectionUtils.detectClassExists("com.google.android.gms.location.LocationRequest")) {
                    try {
                        gplLibraryWrapper = new GplLibraryWrapper(context, locationListener, iHandlerExecutor.getLooper(), iHandlerExecutor, TimeUnit.SECONDS.toMillis(1L));
                    } catch (Throwable unused) {
                    }
                    gplLibraryWrapper.updateLastKnownLocation();
                }
                gplLibraryWrapper = new C35081a();
                gplLibraryWrapper.updateLastKnownLocation();
            } catch (Throwable unused2) {
            }
        }
    }
}
