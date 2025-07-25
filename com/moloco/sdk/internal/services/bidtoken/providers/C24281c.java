package com.moloco.sdk.internal.services.bidtoken.providers;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.services.AbstractC24347f;
import com.moloco.sdk.internal.services.InterfaceC24357i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.moloco.sdk.internal.services.bidtoken.providers.c */
/* loaded from: classes7.dex */
public final class C24281c implements InterfaceC24292j<AbstractC24347f> {
    @NotNull

    /* renamed from: d */
    public static final C24282a f62882d = new C24282a(null);
    @NotNull

    /* renamed from: b */
    public final InterfaceC24357i f62883b;
    @NotNull

    /* renamed from: c */
    public AbstractC24347f f62884c;

    /* renamed from: com.moloco.sdk.internal.services.bidtoken.providers.c$a */
    /* loaded from: classes7.dex */
    public static final class C24282a {
        public /* synthetic */ C24282a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C24282a() {
        }
    }

    public C24281c(@NotNull InterfaceC24357i advertisingService) {
        Intrinsics.checkNotNullParameter(advertisingService, "advertisingService");
        this.f62883b = advertisingService;
        this.f62884c = m46673e();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.InterfaceC24292j
    /* renamed from: a */
    public void mo46632a() {
        this.f62884c = m46673e();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.InterfaceC24292j
    /* renamed from: b */
    public boolean mo46631b() {
        boolean z = !Intrinsics.m17075f(this.f62884c, m46673e());
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "AdvertisingSignalProvider", "[CBT][ASP]: needsRefresh: " + z, false, 4, null);
        return z;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.InterfaceC24292j
    @NotNull
    /* renamed from: c */
    public String mo46630c() {
        return "AdvertisingSignalProvider";
    }

    /* renamed from: e */
    public final AbstractC24347f m46673e() {
        AbstractC24347f mo46521a = this.f62883b.mo46521a();
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        MolocoLogger.debugBuildLog$default(molocoLogger, "AdvertisingSignalProvider", "[CBT][ASP]: adData: " + mo46521a, false, 4, null);
        return mo46521a;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.InterfaceC24292j
    @NotNull
    /* renamed from: f */
    public AbstractC24347f mo46629d() {
        return m46673e();
    }
}
