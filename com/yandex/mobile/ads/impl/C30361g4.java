package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.amazon.device.ads.DtbConstants;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p804nd.NoWhenBranchMatchedException;

/* renamed from: com.yandex.mobile.ads.impl.g4 */
/* loaded from: classes8.dex */
public final class C30361g4 {
    @NotNull

    /* renamed from: c */
    private static final String f79476c = DtbConstants.HTTPS + "mobile.yandexadexchange.net";
    @NotNull

    /* renamed from: a */
    private final as1 f79477a;
    @NotNull

    /* renamed from: b */
    private final oq0 f79478b;

    public /* synthetic */ C30361g4(as1 as1Var) {
        this(as1Var, new oq0());
    }

    @NotNull
    /* renamed from: a */
    public final String m33934a(@NotNull Context context, @NotNull C30723ke identifiers, @NotNull gg0 identifiersType) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(identifiers, "identifiers");
        Intrinsics.checkNotNullParameter(identifiersType, "identifiersType");
        yp1 m35796a = this.f79477a.m35796a(context);
        String m26764d = m35796a != null ? m35796a.m26764d() : null;
        String m32573a = identifiers.m32573a();
        this.f79478b.getClass();
        String m33933a = m33933a(oq0.m30948a(context));
        if (m33933a == null) {
            int ordinal = identifiersType.ordinal();
            if (ordinal == 0) {
                m32573a = m33933a(m26764d);
                if (m32573a == null) {
                    return f79476c;
                }
            } else if (ordinal != 1) {
                throw new NoWhenBranchMatchedException();
            } else {
                if (m32573a == null) {
                    return f79476c;
                }
            }
            return m32573a;
        }
        return m33933a;
    }

    public C30361g4(@NotNull as1 sdkSettings, @NotNull oq0 manifestAnalyzer) {
        Intrinsics.checkNotNullParameter(sdkSettings, "sdkSettings");
        Intrinsics.checkNotNullParameter(manifestAnalyzer, "manifestAnalyzer");
        this.f79477a = sdkSettings;
        this.f79478b = manifestAnalyzer;
    }

    /* renamed from: a */
    private static String m33933a(String str) {
        if (str != null) {
            return DtbConstants.HTTPS + str;
        }
        return null;
    }
}
