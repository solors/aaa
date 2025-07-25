package com.pubmatic.sdk.common.models;

import kotlin.Metadata;

/* compiled from: POBDSAComplianceStatus.kt */
@Metadata
/* loaded from: classes7.dex */
public enum POBDSAComplianceStatus {
    NOT_REQUIRED(0),
    OPTIONAL(1),
    REQUIRED(2),
    REQUIRED_PUB_ONLINE_PLATFORM(3);
    

    /* renamed from: b */
    private final int f70129b;

    POBDSAComplianceStatus(int i) {
        this.f70129b = i;
    }

    public final int getValue() {
        return this.f70129b;
    }
}
