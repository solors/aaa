package com.moloco.sdk.internal.services.bidtoken.providers;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.services.InterfaceC24355g0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.moloco.sdk.internal.services.bidtoken.providers.r */
/* loaded from: classes7.dex */
public final class C24304r implements InterfaceC24292j<C24303q> {
    @NotNull

    /* renamed from: d */
    public static final C24305a f62928d = new C24305a(null);
    @NotNull

    /* renamed from: b */
    public final InterfaceC24355g0 f62929b;
    @NotNull

    /* renamed from: c */
    public C24303q f62930c;

    /* renamed from: com.moloco.sdk.internal.services.bidtoken.providers.r$a */
    /* loaded from: classes7.dex */
    public static final class C24305a {
        public /* synthetic */ C24305a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C24305a() {
        }
    }

    public C24304r(@NotNull InterfaceC24355g0 networkInfoService) {
        Intrinsics.checkNotNullParameter(networkInfoService, "networkInfoService");
        this.f62929b = networkInfoService;
        this.f62930c = m46635e();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.InterfaceC24292j
    /* renamed from: a */
    public void mo46632a() {
        this.f62930c = m46635e();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.InterfaceC24292j
    /* renamed from: b */
    public boolean mo46631b() {
        C24303q m46635e = m46635e();
        boolean z = !Intrinsics.m17075f(m46635e, this.f62930c);
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "NISignalProvider", "[CBT] NIS needsRefresh: " + z + ", with nis: " + m46635e + ", cached: " + this.f62930c, false, 4, null);
        return z;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.InterfaceC24292j
    @NotNull
    /* renamed from: c */
    public String mo46630c() {
        return "NISignalProvider";
    }

    /* renamed from: e */
    public final C24303q m46635e() {
        C24303q c24303q = new C24303q(this.f62929b.mo46540d(), this.f62929b.mo46542b(), this.f62929b.mo46543a(), this.f62929b.mo46541c());
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        MolocoLogger.debugBuildLog$default(molocoLogger, "NISignalProvider", "[CBT] NIS providing " + c24303q, false, 4, null);
        return c24303q;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.InterfaceC24292j
    @NotNull
    /* renamed from: f */
    public C24303q mo46629d() {
        return this.f62930c;
    }
}
