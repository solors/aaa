package com.moloco.sdk.internal.services;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.moloco.sdk.internal.services.AbstractC24347f;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p804nd.C38508r;
import p804nd.Result;

/* renamed from: com.moloco.sdk.internal.services.k */
/* loaded from: classes7.dex */
public final class C24375k implements InterfaceC24357i {
    @NotNull

    /* renamed from: a */
    public final Context f63106a;

    public C24375k(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f63106a = context;
    }

    @Override // com.moloco.sdk.internal.services.InterfaceC24357i
    @NotNull
    /* renamed from: a */
    public AbstractC24347f mo46521a() {
        Object m14549b;
        try {
            Result.C38506a c38506a = Result.f101870c;
            m14549b = Result.m14549b(AdvertisingIdClient.getAdvertisingIdInfo(this.f63106a));
        } catch (Throwable th) {
            Result.C38506a c38506a2 = Result.f101870c;
            m14549b = Result.m14549b(C38508r.m14540a(th));
        }
        AbstractC24347f abstractC24347f = null;
        if (Result.m14544g(m14549b)) {
            m14549b = null;
        }
        AdvertisingIdClient.Info info = (AdvertisingIdClient.Info) m14549b;
        if (info != null) {
            if (info.isLimitAdTrackingEnabled()) {
                abstractC24347f = AbstractC24347f.C24349b.f63046a;
            } else {
                String id2 = info.getId();
                if (id2 != null) {
                    Intrinsics.checkNotNullExpressionValue(id2, "this");
                    abstractC24347f = new AbstractC24347f.C24348a(id2);
                }
            }
            if (abstractC24347f != null) {
                return abstractC24347f;
            }
        }
        return AbstractC24347f.C24349b.f63046a;
    }
}
