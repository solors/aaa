package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;

/* renamed from: io.appmetrica.analytics.impl.Yk */
/* loaded from: classes9.dex */
public abstract /* synthetic */ class AbstractC34358Yk {

    /* renamed from: a */
    public static final /* synthetic */ int[] f93851a;

    static {
        int[] iArr = new int[IdentifierStatus.values().length];
        iArr[IdentifierStatus.OK.ordinal()] = 1;
        iArr[IdentifierStatus.IDENTIFIER_PROVIDER_UNAVAILABLE.ordinal()] = 2;
        iArr[IdentifierStatus.INVALID_ADV_ID.ordinal()] = 3;
        iArr[IdentifierStatus.NO_STARTUP.ordinal()] = 4;
        iArr[IdentifierStatus.FEATURE_DISABLED.ordinal()] = 5;
        f93851a = iArr;
    }
}
