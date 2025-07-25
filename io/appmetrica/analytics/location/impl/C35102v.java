package io.appmetrica.analytics.location.impl;

import android.content.Context;
import android.location.LocationListener;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.location.impl.v */
/* loaded from: classes9.dex */
public final class C35102v implements LastKnownLocationExtractorProvider {

    /* renamed from: a */
    public final String f95768a;

    /* renamed from: b */
    public final InterfaceC35099s f95769b;

    /* renamed from: c */
    public final String f95770c;

    public C35102v(@NotNull String str, @NotNull InterfaceC35099s interfaceC35099s, @NotNull String str2) {
        this.f95768a = str;
        this.f95769b = interfaceC35099s;
        this.f95770c = str2;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider
    @NotNull
    /* renamed from: a */
    public final C35101u getExtractor(@NotNull Context context, @NotNull PermissionExtractor permissionExtractor, @NotNull IHandlerExecutor iHandlerExecutor, @NotNull LocationListener locationListener) {
        return new C35101u(context, this.f95769b.mo20673a(permissionExtractor), locationListener, this.f95768a);
    }

    @Override // io.appmetrica.analytics.locationapi.internal.Identifiable
    @NotNull
    public final String getIdentifier() {
        return this.f95770c;
    }
}
