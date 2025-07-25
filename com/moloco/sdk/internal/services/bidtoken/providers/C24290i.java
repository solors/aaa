package com.moloco.sdk.internal.services.bidtoken.providers;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.services.InterfaceC24402x;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.moloco.sdk.internal.services.bidtoken.providers.i */
/* loaded from: classes7.dex */
public final class C24290i implements InterfaceC24292j<C24289h> {
    @NotNull

    /* renamed from: d */
    public static final C24291a f62897d = new C24291a(null);
    @NotNull

    /* renamed from: b */
    public final InterfaceC24402x f62898b;
    @NotNull

    /* renamed from: c */
    public C24289h f62899c;

    /* renamed from: com.moloco.sdk.internal.services.bidtoken.providers.i$a */
    /* loaded from: classes7.dex */
    public static final class C24291a {
        public /* synthetic */ C24291a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C24291a() {
        }
    }

    public C24290i(@NotNull InterfaceC24402x batteryInfoService) {
        Intrinsics.checkNotNullParameter(batteryInfoService, "batteryInfoService");
        this.f62898b = batteryInfoService;
        this.f62899c = m46661e();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.InterfaceC24292j
    /* renamed from: a */
    public void mo46632a() {
        this.f62899c = m46661e();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.InterfaceC24292j
    /* renamed from: b */
    public boolean mo46631b() {
        boolean z = !Intrinsics.m17075f(this.f62899c, m46661e());
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "BInfoSignalProvider", "[CBT][BIS]: needsRefresh: " + z, false, 4, null);
        return z;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.InterfaceC24292j
    @NotNull
    /* renamed from: c */
    public String mo46630c() {
        return "BInfoSignalProvider";
    }

    /* renamed from: e */
    public final C24289h m46661e() {
        C24289h c24289h = new C24289h(this.f62898b.mo46491b(), this.f62898b.mo46492a(), this.f62898b.mo46490c());
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        MolocoLogger.debugBuildLog$default(molocoLogger, "BInfoSignalProvider", "[CBT][BIS]: blev: " + c24289h.m46663b() + ", bst: " + c24289h.m46664a() + ", psm: " + c24289h.m46662c(), false, 4, null);
        return c24289h;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.InterfaceC24292j
    @NotNull
    /* renamed from: f */
    public C24289h mo46629d() {
        return this.f62899c;
    }
}
