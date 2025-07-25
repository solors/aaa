package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.u5 */
/* loaded from: classes9.dex */
public final class C34927u5 {

    /* renamed from: a */
    public final PublicLogger f95450a;

    public C34927u5(String str) {
        this.f95450a = LoggerStorage.getOrCreatePublicLogger(str);
    }

    /* renamed from: a */
    public final int m20921a(int i) {
        if (i < 100) {
            PublicLogger publicLogger = this.f95450a;
            publicLogger.warning("Value passed as maxReportsInDatabaseCount is invalid. Should be greater than or equal to 100, but was: " + i + ". Default value (100) will be used", new Object[0]);
            return 100;
        } else if (i > 10000) {
            PublicLogger publicLogger2 = this.f95450a;
            publicLogger2.warning("Value passed as maxReportsInDatabaseCount is invalid. Should be less than or equal to 10000, but was: " + i + ". Default value (10000) will be used", new Object[0]);
            return 10000;
        } else {
            return i;
        }
    }
}
