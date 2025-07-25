package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.k5 */
/* loaded from: classes9.dex */
public final class C34661k5 {

    /* renamed from: a */
    public final String f94765a;

    public C34661k5(String str) {
        this.f94765a = str;
    }

    /* renamed from: a */
    public final PublicLogger m21492a() {
        return LoggerStorage.getOrCreatePublicLogger(this.f94765a);
    }
}
