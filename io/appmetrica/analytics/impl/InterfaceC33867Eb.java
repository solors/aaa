package io.appmetrica.analytics.impl;

import android.location.Location;
import io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.Eb */
/* loaded from: classes9.dex */
public interface InterfaceC33867Eb extends LocationServiceApi {
    /* renamed from: a */
    void mo22587a(@NotNull Object obj);

    /* renamed from: a */
    void mo22586a(boolean z);

    /* renamed from: b */
    void mo22585b(@NotNull Object obj);

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    @Nullable
    Location getLocation();

    void init();
}
