package io.appmetrica.analytics.impl;

import android.location.Location;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleLocationSourcesServiceController;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServicesDatabase;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.Bc */
/* loaded from: classes9.dex */
public interface InterfaceC33793Bc extends InterfaceC34230Tc {
    @NotNull
    /* renamed from: a */
    List<ModuleServicesDatabase> mo22702a();

    @NotNull
    /* renamed from: b */
    /* synthetic */ Map mo22699b();

    @NotNull
    /* renamed from: c */
    /* synthetic */ Map mo22698c();

    @NotNull
    /* renamed from: d */
    List<Consumer<Location>> mo22697d();

    @Nullable
    /* renamed from: e */
    ModuleLocationSourcesServiceController mo22696e();

    @Nullable
    /* renamed from: f */
    Toggle mo22695f();

    @NotNull
    /* renamed from: g */
    /* synthetic */ List mo22694g();
}
