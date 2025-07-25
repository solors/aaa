package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.Cj */
/* loaded from: classes9.dex */
public final class C33825Cj implements ModuleRemoteConfig {

    /* renamed from: a */
    public final SdkIdentifiers f92677a;

    /* renamed from: b */
    public final RemoteConfigMetaInfo f92678b;

    /* renamed from: c */
    public final Object f92679c;

    public C33825Cj(@NotNull SdkIdentifiers sdkIdentifiers, @NotNull RemoteConfigMetaInfo remoteConfigMetaInfo, Object obj) {
        this.f92677a = sdkIdentifiers;
        this.f92678b = remoteConfigMetaInfo;
        this.f92679c = obj;
    }

    @NotNull
    /* renamed from: a */
    public final C33825Cj m22733a(@NotNull SdkIdentifiers sdkIdentifiers, @NotNull RemoteConfigMetaInfo remoteConfigMetaInfo, Object obj) {
        return new C33825Cj(sdkIdentifiers, remoteConfigMetaInfo, obj);
    }

    @NotNull
    /* renamed from: b */
    public final RemoteConfigMetaInfo m22731b() {
        return this.f92678b;
    }

    /* renamed from: c */
    public final Object m22730c() {
        return this.f92679c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33825Cj)) {
            return false;
        }
        C33825Cj c33825Cj = (C33825Cj) obj;
        if (Intrinsics.m17075f(this.f92677a, c33825Cj.f92677a) && Intrinsics.m17075f(this.f92678b, c33825Cj.f92678b) && Intrinsics.m17075f(this.f92679c, c33825Cj.f92679c)) {
            return true;
        }
        return false;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig
    public final Object getFeaturesConfig() {
        return this.f92679c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig
    @NotNull
    public final SdkIdentifiers getIdentifiers() {
        return this.f92677a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig
    @NotNull
    public final RemoteConfigMetaInfo getRemoteConfigMetaInfo() {
        return this.f92678b;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f92678b.hashCode() + (this.f92677a.hashCode() * 31)) * 31;
        Object obj = this.f92679c;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return hashCode2 + hashCode;
    }

    @NotNull
    public final String toString() {
        return "ServiceModuleRemoteConfigModel(identifiers=" + this.f92677a + ", remoteConfigMetaInfo=" + this.f92678b + ", featuresConfig=" + this.f92679c + ')';
    }

    @NotNull
    /* renamed from: a */
    public final SdkIdentifiers m22734a() {
        return this.f92677a;
    }

    /* renamed from: a */
    public static C33825Cj m22732a(C33825Cj c33825Cj, SdkIdentifiers sdkIdentifiers, RemoteConfigMetaInfo remoteConfigMetaInfo, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            sdkIdentifiers = c33825Cj.f92677a;
        }
        if ((i & 2) != 0) {
            remoteConfigMetaInfo = c33825Cj.f92678b;
        }
        if ((i & 4) != 0) {
            obj = c33825Cj.f92679c;
        }
        c33825Cj.getClass();
        return new C33825Cj(sdkIdentifiers, remoteConfigMetaInfo, obj);
    }
}
