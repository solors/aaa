package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashClientModule;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashClientModuleDummy;

/* renamed from: io.appmetrica.analytics.impl.fd */
/* loaded from: classes9.dex */
public final class C34534fd {

    /* renamed from: a */
    public final C34208Se f94372a;

    /* renamed from: b */
    public final NativeCrashClientModule f94373b;

    /* renamed from: c */
    public final C33781B0 f94374c;

    /* renamed from: d */
    public C33756A0 f94375d;

    public C34534fd(C34208Se c34208Se) {
        this.f94372a = c34208Se;
        NativeCrashClientModule nativeCrashClientModule = (NativeCrashClientModule) ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor("io.appmetrica.analytics.ndkcrashes.NativeCrashClientModuleImpl", NativeCrashClientModule.class);
        this.f94373b = nativeCrashClientModule == null ? new NativeCrashClientModuleDummy() : nativeCrashClientModule;
        this.f94374c = new C33781B0();
    }
}
