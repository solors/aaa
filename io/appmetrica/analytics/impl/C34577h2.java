package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaConfig;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.h2 */
/* loaded from: classes9.dex */
public final class C34577h2 {
    /* renamed from: a */
    public static final boolean m21640a(Throwable th) {
        return true;
    }

    @NotNull
    /* renamed from: a */
    public final InterfaceC33841Da m21641a(@NotNull Context context, @NotNull AppMetricaConfig appMetricaConfig, @NotNull InterfaceC34180Ra interfaceC34180Ra) {
        return new C34306Wg(new C34253Ub(interfaceC34180Ra, appMetricaConfig), new InterfaceC34716m6() { // from class: io.appmetrica.analytics.impl.yo
            @Override // io.appmetrica.analytics.impl.InterfaceC34716m6
            /* renamed from: a */
            public final boolean mo20729a(Throwable th) {
                return C34577h2.m21640a(th);
            }
        }, appMetricaConfig.crashTransformer, new C34012K9(context));
    }
}
