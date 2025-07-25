package com.moloco.sdk.internal.services.bidtoken.providers;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.services.bidtoken.InterfaceC24311s;
import com.moloco.sdk.publisher.privacy.MolocoPrivacy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.moloco.sdk.internal.services.bidtoken.providers.s */
/* loaded from: classes7.dex */
public final class C24306s implements InterfaceC24292j<MolocoPrivacy.PrivacySettings> {
    @NotNull

    /* renamed from: b */
    public final InterfaceC24311s f62931b;
    @NotNull

    /* renamed from: c */
    public final String f62932c;
    @NotNull

    /* renamed from: d */
    public MolocoPrivacy.PrivacySettings f62933d;

    public C24306s(@NotNull InterfaceC24311s privacyProvider) {
        Intrinsics.checkNotNullParameter(privacyProvider, "privacyProvider");
        this.f62931b = privacyProvider;
        this.f62932c = "PrivacyStateSignalProvider";
        this.f62933d = privacyProvider.getPrivacy();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.InterfaceC24292j
    /* renamed from: a */
    public void mo46632a() {
        this.f62933d = this.f62931b.getPrivacy();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.InterfaceC24292j
    /* renamed from: b */
    public boolean mo46631b() {
        String str;
        boolean z = !Intrinsics.m17075f(this.f62933d, this.f62931b.getPrivacy());
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        String str2 = this.f62932c;
        if (z) {
            str = "[CBT] privacy updated";
        } else {
            str = "[CBT] privacy didn't change";
        }
        MolocoLogger.debugBuildLog$default(molocoLogger, str2, str, false, 4, null);
        return z;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.InterfaceC24292j
    @NotNull
    /* renamed from: c */
    public String mo46630c() {
        return this.f62932c;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.InterfaceC24292j
    @NotNull
    /* renamed from: e */
    public MolocoPrivacy.PrivacySettings mo46629d() {
        return this.f62933d;
    }
}
