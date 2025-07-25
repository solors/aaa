package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.StartupParamsItem;
import io.appmetrica.analytics.StartupParamsItemStatus;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.internal.IdentifiersResult;

/* renamed from: io.appmetrica.analytics.impl.Xk */
/* loaded from: classes9.dex */
public final class C34334Xk {

    /* renamed from: a */
    public final C34382Zk f93784a = new C34382Zk();

    /* renamed from: a */
    public final StartupParamsItem m22091a(IdentifiersResult identifiersResult) {
        StartupParamsItemStatus startupParamsItemStatus;
        String str = identifiersResult.f95711id;
        C34382Zk c34382Zk = this.f93784a;
        IdentifierStatus identifierStatus = identifiersResult.status;
        c34382Zk.getClass();
        int i = AbstractC34358Yk.f93851a[identifierStatus.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            startupParamsItemStatus = StartupParamsItemStatus.UNKNOWN_ERROR;
                        } else {
                            startupParamsItemStatus = StartupParamsItemStatus.FEATURE_DISABLED;
                        }
                    } else {
                        startupParamsItemStatus = StartupParamsItemStatus.NETWORK_ERROR;
                    }
                } else {
                    startupParamsItemStatus = StartupParamsItemStatus.INVALID_VALUE_FROM_PROVIDER;
                }
            } else {
                startupParamsItemStatus = StartupParamsItemStatus.PROVIDER_UNAVAILABLE;
            }
        } else {
            startupParamsItemStatus = StartupParamsItemStatus.OK;
        }
        return new StartupParamsItem(str, startupParamsItemStatus, identifiersResult.errorExplanation);
    }
}
