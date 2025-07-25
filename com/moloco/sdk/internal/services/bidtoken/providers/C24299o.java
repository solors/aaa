package com.moloco.sdk.internal.services.bidtoken.providers;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.services.InterfaceC24328d0;
import com.moloco.sdk.internal.services.InterfaceC24356h;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.moloco.sdk.internal.services.bidtoken.providers.o */
/* loaded from: classes7.dex */
public final class C24299o implements InterfaceC24292j<C24298n> {
    @NotNull

    /* renamed from: e */
    public static final C24300a f62917e = new C24300a(null);
    @NotNull

    /* renamed from: b */
    public final InterfaceC24328d0 f62918b;
    @NotNull

    /* renamed from: c */
    public final InterfaceC24356h f62919c;
    @NotNull

    /* renamed from: d */
    public C24298n f62920d;

    /* renamed from: com.moloco.sdk.internal.services.bidtoken.providers.o$a */
    /* loaded from: classes7.dex */
    public static final class C24300a {
        public /* synthetic */ C24300a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C24300a() {
        }
    }

    public C24299o(@NotNull InterfaceC24328d0 deviceInfoService, @NotNull InterfaceC24356h screenInfoService) {
        Intrinsics.checkNotNullParameter(deviceInfoService, "deviceInfoService");
        Intrinsics.checkNotNullParameter(screenInfoService, "screenInfoService");
        this.f62918b = deviceInfoService;
        this.f62919c = screenInfoService;
        this.f62920d = m46644e();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.InterfaceC24292j
    /* renamed from: a */
    public void mo46632a() {
        this.f62920d = m46644e();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.InterfaceC24292j
    /* renamed from: b */
    public boolean mo46631b() {
        C24298n m46644e = m46644e();
        boolean z = !Intrinsics.m17075f(m46644e, this.f62920d);
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "DSignalProvider", "[CBT] DSP needsRefresh: " + z + ", with current: " + m46644e + ", cached: " + this.f62920d, false, 4, null);
        return z;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.InterfaceC24292j
    @NotNull
    /* renamed from: c */
    public String mo46630c() {
        return "DSignalProvider";
    }

    /* renamed from: e */
    public final C24298n m46644e() {
        return new C24298n(this.f62919c.mo46522b(), this.f62918b.mo46506c(), this.f62918b.mo46505d());
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.InterfaceC24292j
    @NotNull
    /* renamed from: f */
    public C24298n mo46629d() {
        return this.f62920d;
    }
}
