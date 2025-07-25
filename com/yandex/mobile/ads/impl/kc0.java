package com.yandex.mobile.ads.impl;

import android.os.IBinder;
import android.os.IInterface;
import com.monetization.ads.core.identifiers.p548ad.gms.service.GmsServiceAdvertisingInfoReader;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class kc0 {
    @NotNull

    /* renamed from: a */
    private final C29928ac f81374a;
    @NotNull

    /* renamed from: b */
    private final fc0 f81375b;

    public /* synthetic */ kc0() {
        this(new C29928ac(), new fc0());
    }

    @Nullable
    /* renamed from: a */
    public final C31967zb m32595a(@NotNull gc0 connection) {
        InterfaceC30305fc interfaceC30305fc;
        C31967zb c31967zb;
        Intrinsics.checkNotNullParameter(connection, "connection");
        try {
            IBinder binder = connection.m33887a();
            if (binder == null) {
                return null;
            }
            this.f81375b.getClass();
            Intrinsics.checkNotNullParameter(binder, "binder");
            IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            if (queryLocalInterface instanceof InterfaceC30305fc) {
                interfaceC30305fc = (InterfaceC30305fc) queryLocalInterface;
            } else {
                interfaceC30305fc = null;
            }
            if (interfaceC30305fc == null) {
                interfaceC30305fc = new GmsServiceAdvertisingInfoReader(binder);
            }
            String readAdvertisingId = interfaceC30305fc.readAdvertisingId();
            Boolean readAdTrackingLimited = interfaceC30305fc.readAdTrackingLimited();
            this.f81374a.getClass();
            if (readAdTrackingLimited != null && readAdvertisingId != null) {
                c31967zb = new C31967zb(readAdvertisingId, readAdTrackingLimited.booleanValue());
            } else {
                c31967zb = null;
            }
            um0.m28728a(new Object[0]);
            return c31967zb;
        } catch (InterruptedException unused) {
            um0.m28726c(new Object[0]);
            return null;
        }
    }

    public kc0(@NotNull C29928ac advertisingInfoCreator, @NotNull fc0 gmsAdvertisingInfoReaderProvider) {
        Intrinsics.checkNotNullParameter(advertisingInfoCreator, "advertisingInfoCreator");
        Intrinsics.checkNotNullParameter(gmsAdvertisingInfoReaderProvider, "gmsAdvertisingInfoReaderProvider");
        this.f81374a = advertisingInfoCreator;
        this.f81375b = gmsAdvertisingInfoReaderProvider;
    }
}
