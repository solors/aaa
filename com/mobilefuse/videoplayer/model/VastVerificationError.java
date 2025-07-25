package com.mobilefuse.videoplayer.model;

import kotlin.Metadata;

/* compiled from: enums.kt */
@Metadata
/* loaded from: classes7.dex */
public enum VastVerificationError {
    RESOURCE_REJECTED(1),
    NOT_SUPPORTED(2),
    LOAD_ERROR(3);
    
    private final int errorCode;

    VastVerificationError(int i) {
        this.errorCode = i;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }
}
