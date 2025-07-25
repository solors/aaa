package com.monetization.ads.exo.drm;

import androidx.annotation.Nullable;
import com.monetization.ads.exo.drm.InterfaceC25488f;
import com.yandex.mobile.ads.impl.InterfaceC31680vt;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.monetization.ads.exo.drm.e */
/* loaded from: classes7.dex */
public interface InterfaceC25485e {

    /* renamed from: com.monetization.ads.exo.drm.e$a */
    /* loaded from: classes7.dex */
    public static class C25486a extends IOException {

        /* renamed from: b */
        public final int f66181b;

        public C25486a(Throwable th, int i) {
            super(th);
            this.f66181b = i;
        }
    }

    /* renamed from: a */
    static void m44449a(@Nullable InterfaceC25485e interfaceC25485e, @Nullable InterfaceC25485e interfaceC25485e2) {
        if (interfaceC25485e == interfaceC25485e2) {
            return;
        }
        if (interfaceC25485e2 != null) {
            interfaceC25485e2.mo44417a(null);
        }
        if (interfaceC25485e != null) {
            interfaceC25485e.mo44416b(null);
        }
    }

    /* renamed from: a */
    void mo44417a(@Nullable InterfaceC25488f.C25489a c25489a);

    /* renamed from: b */
    void mo44416b(@Nullable InterfaceC25488f.C25489a c25489a);

    @Nullable
    InterfaceC31680vt getCryptoConfig();

    @Nullable
    C25486a getError();

    UUID getSchemeUuid();

    int getState();

    default boolean playClearSamplesWithoutKeys() {
        return false;
    }

    @Nullable
    Map<String, String> queryKeyStatus();

    boolean requiresSecureDecoder(String str);
}
