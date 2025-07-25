package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdvIdentifiersResult;
import io.appmetrica.analytics.internal.IdentifiersResult;

/* renamed from: io.appmetrica.analytics.impl.I */
/* loaded from: classes9.dex */
public final class C33954I {
    /* renamed from: a */
    public static AdvIdentifiersResult.AdvId m22556a(IdentifiersResult identifiersResult) {
        String str;
        AdvIdentifiersResult.Details details;
        String str2 = null;
        if (identifiersResult == null) {
            str = null;
        } else {
            str = identifiersResult.f95711id;
        }
        if (identifiersResult == null) {
            details = AdvIdentifiersResult.Details.INTERNAL_ERROR;
        } else {
            int i = AbstractC33930H.f92942a[identifiersResult.status.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                details = AdvIdentifiersResult.Details.INTERNAL_ERROR;
                            } else {
                                details = AdvIdentifiersResult.Details.INVALID_ADV_ID;
                            }
                        } else {
                            details = AdvIdentifiersResult.Details.IDENTIFIER_PROVIDER_UNAVAILABLE;
                        }
                    } else {
                        details = AdvIdentifiersResult.Details.FEATURE_DISABLED;
                    }
                } else {
                    details = AdvIdentifiersResult.Details.NO_STARTUP;
                }
            } else {
                details = AdvIdentifiersResult.Details.OK;
            }
        }
        if (identifiersResult != null) {
            str2 = identifiersResult.errorExplanation;
        }
        return new AdvIdentifiersResult.AdvId(str, details, str2);
    }
}
