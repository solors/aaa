package com.moloco.sdk.internal.services.bidtoken.providers;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.services.InterfaceC24400v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.moloco.sdk.internal.services.bidtoken.providers.g */
/* loaded from: classes7.dex */
public final class C24287g implements InterfaceC24292j<C24286f> {
    @NotNull

    /* renamed from: d */
    public static final C24288a f62891d = new C24288a(null);
    @NotNull

    /* renamed from: b */
    public final InterfaceC24400v f62892b;
    @NotNull

    /* renamed from: c */
    public C24286f f62893c;

    /* renamed from: com.moloco.sdk.internal.services.bidtoken.providers.g$a */
    /* loaded from: classes7.dex */
    public static final class C24288a {
        public /* synthetic */ C24288a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C24288a() {
        }
    }

    public C24287g(@NotNull InterfaceC24400v audioService) {
        Intrinsics.checkNotNullParameter(audioService, "audioService");
        this.f62892b = audioService;
        this.f62893c = m46666e();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.InterfaceC24292j
    /* renamed from: a */
    public void mo46632a() {
        this.f62893c = m46666e();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.InterfaceC24292j
    /* renamed from: b */
    public boolean mo46631b() {
        C24286f m46666e = m46666e();
        boolean z = !Intrinsics.m17075f(m46666e, this.f62893c);
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "AudSignalProvider", "[CBT] needsRefresh: " + z + ", with current: " + m46666e + ", cached: " + this.f62893c, false, 4, null);
        return z;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.InterfaceC24292j
    @NotNull
    /* renamed from: c */
    public String mo46630c() {
        return "AudSignalProvider";
    }

    /* renamed from: e */
    public final C24286f m46666e() {
        return new C24286f(this.f62892b.mo46495a(), this.f62892b.mo46494b());
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.InterfaceC24292j
    @NotNull
    /* renamed from: f */
    public C24286f mo46629d() {
        return this.f62893c;
    }
}
