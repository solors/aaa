package com.monetization.ads.exo.drm;

import androidx.annotation.Nullable;
import com.monetization.ads.exo.drm.InterfaceC25485e;
import com.monetization.ads.exo.drm.InterfaceC25488f;
import com.yandex.mobile.ads.impl.C30937nf;
import com.yandex.mobile.ads.impl.C31219ql;
import com.yandex.mobile.ads.impl.InterfaceC31680vt;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.monetization.ads.exo.drm.l */
/* loaded from: classes7.dex */
public final class C25504l implements InterfaceC25485e {

    /* renamed from: a */
    private final InterfaceC25485e.C25486a f66200a;

    public C25504l(InterfaceC25485e.C25486a c25486a) {
        this.f66200a = (InterfaceC25485e.C25486a) C30937nf.m31570a(c25486a);
    }

    @Override // com.monetization.ads.exo.drm.InterfaceC25485e
    @Nullable
    public final InterfaceC31680vt getCryptoConfig() {
        return null;
    }

    @Override // com.monetization.ads.exo.drm.InterfaceC25485e
    @Nullable
    public final InterfaceC25485e.C25486a getError() {
        return this.f66200a;
    }

    @Override // com.monetization.ads.exo.drm.InterfaceC25485e
    public final UUID getSchemeUuid() {
        return C31219ql.f84416a;
    }

    @Override // com.monetization.ads.exo.drm.InterfaceC25485e
    public final int getState() {
        return 1;
    }

    @Override // com.monetization.ads.exo.drm.InterfaceC25485e
    public final boolean playClearSamplesWithoutKeys() {
        return false;
    }

    @Override // com.monetization.ads.exo.drm.InterfaceC25485e
    @Nullable
    public final Map<String, String> queryKeyStatus() {
        return null;
    }

    @Override // com.monetization.ads.exo.drm.InterfaceC25485e
    public final boolean requiresSecureDecoder(String str) {
        return false;
    }

    @Override // com.monetization.ads.exo.drm.InterfaceC25485e
    /* renamed from: a */
    public final void mo44417a(@Nullable InterfaceC25488f.C25489a c25489a) {
    }

    @Override // com.monetization.ads.exo.drm.InterfaceC25485e
    /* renamed from: b */
    public final void mo44416b(@Nullable InterfaceC25488f.C25489a c25489a) {
    }
}
