package com.moloco.sdk.internal.services.bidtoken.providers;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.services.InterfaceC24319c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.moloco.sdk.internal.services.bidtoken.providers.b */
/* loaded from: classes7.dex */
public final class C24279b implements InterfaceC24292j<C24278a> {
    @NotNull

    /* renamed from: d */
    public static final C24280a f62879d = new C24280a(null);
    @NotNull

    /* renamed from: b */
    public final InterfaceC24319c f62880b;
    @NotNull

    /* renamed from: c */
    public C24278a f62881c;

    /* renamed from: com.moloco.sdk.internal.services.bidtoken.providers.b$a */
    /* loaded from: classes7.dex */
    public static final class C24280a {
        public /* synthetic */ C24280a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C24280a() {
        }
    }

    public C24279b(@NotNull InterfaceC24319c accessibilityInfoService) {
        Intrinsics.checkNotNullParameter(accessibilityInfoService, "accessibilityInfoService");
        this.f62880b = accessibilityInfoService;
        this.f62881c = m46675e();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.InterfaceC24292j
    /* renamed from: a */
    public void mo46632a() {
        this.f62881c = m46675e();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.InterfaceC24292j
    /* renamed from: b */
    public boolean mo46631b() {
        C24278a m46675e = m46675e();
        boolean z = !Intrinsics.m17075f(m46675e, this.f62881c);
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "AcSignalProvider", "[CBT] needsRefresh: " + z + ", with current: " + m46675e + ", cached: " + this.f62881c, false, 4, null);
        return z;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.InterfaceC24292j
    @NotNull
    /* renamed from: c */
    public String mo46630c() {
        return "AcSignalProvider";
    }

    /* renamed from: e */
    public final C24278a m46675e() {
        return new C24278a(this.f62880b.mo46588c(), this.f62880b.mo46589b(), this.f62880b.mo46590a(), this.f62880b.getFontScale());
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.InterfaceC24292j
    @NotNull
    /* renamed from: f */
    public C24278a mo46629d() {
        return this.f62881c;
    }
}
