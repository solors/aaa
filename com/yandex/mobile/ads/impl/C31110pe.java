package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.pe */
/* loaded from: classes8.dex */
public final class C31110pe {
    @NotNull

    /* renamed from: a */
    private final v52 f83864a;
    @NotNull

    /* renamed from: b */
    private final InterfaceC30014be f83865b;

    public /* synthetic */ C31110pe() {
        this(new v52(), C30087ce.m35245a());
    }

    /* renamed from: a */
    private static String m30749a(String str) {
        return "Incorrect AppMetrica Version. The minimum supported version of AppMetrica SDK is 7.2.1 (inclusive) and the maximum supported version is 8.0.0 (exclusive). And the current version of AppMetrica SDK is " + str;
    }

    /* renamed from: a */
    public final void m30750a() throws em0 {
        String mo28357a = this.f83865b.mo28357a();
        if (mo28357a != null) {
            this.f83864a.getClass();
            u52 m28523a = v52.m28523a("7.2.1");
            if (m28523a == null) {
                return;
            }
            this.f83864a.getClass();
            u52 m28523a2 = v52.m28523a("8.0.0");
            if (m28523a2 == null) {
                return;
            }
            this.f83864a.getClass();
            u52 m28523a3 = v52.m28523a(mo28357a);
            if (m28523a3 == null || m28523a3.compareTo(m28523a) < 0 || m28523a3.compareTo(m28523a2) >= 0) {
                String m30749a = m30749a(mo28357a);
                throw new em0(m30749a, m30749a);
            }
            return;
        }
        throw new em0("Incorrect AppMetrica Integration. The minimum supported version of AppMetrica SDK is 7.2.1 (inclusive) and the maximum supported version is 8.0.0 (exclusive). Please, check your AppMetrica integration.", "Incorrect AppMetrica Integration. The minimum supported version of AppMetrica SDK is 7.2.1 (inclusive) and the maximum supported version is 8.0.0 (exclusive). Please, check your AppMetrica integration.");
    }

    public C31110pe(@NotNull v52 versionNameParser, @NotNull InterfaceC30014be appMetricaAdapter) {
        Intrinsics.checkNotNullParameter(versionNameParser, "versionNameParser");
        Intrinsics.checkNotNullParameter(appMetricaAdapter, "appMetricaAdapter");
        this.f83864a = versionNameParser;
        this.f83865b = appMetricaAdapter;
    }
}
