package com.yandex.mobile.ads.impl;

import com.monetization.ads.core.identifiers.p548ad.huawei.OpenDeviceIdentifierService;
import com.monetization.ads.core.identifiers.p548ad.huawei.ServiceConnectionC25460a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class fd0 {
    @NotNull

    /* renamed from: a */
    private final C29928ac f79051a;

    public /* synthetic */ fd0() {
        this(new C29928ac());
    }

    @Nullable
    /* renamed from: a */
    public final C31967zb m34172a(@NotNull ServiceConnectionC25460a serviceConnection) {
        Intrinsics.checkNotNullParameter(serviceConnection, "serviceConnection");
        try {
            OpenDeviceIdentifierService m44525a = serviceConnection.m44525a();
            if (m44525a == null) {
                return null;
            }
            String oaid = m44525a.getOaid();
            boolean oaidTrackLimited = m44525a.getOaidTrackLimited();
            this.f79051a.getClass();
            if (oaid == null) {
                return null;
            }
            return new C31967zb(oaid, oaidTrackLimited);
        } catch (Exception unused) {
            um0.m28726c(new Object[0]);
            return null;
        }
    }

    public fd0(@NotNull C29928ac advertisingInfoCreator) {
        Intrinsics.checkNotNullParameter(advertisingInfoCreator, "advertisingInfoCreator");
        this.f79051a = advertisingInfoCreator;
    }
}
