package com.amazon.aps.ads.model;

import kotlin.Metadata;

/* compiled from: ApsLogLevel.kt */
@Metadata
/* loaded from: classes2.dex */
public enum ApsLogLevel {
    All(0),
    Trace(1),
    Debug(2),
    Info(3),
    Warn(4),
    Error(5),
    Fatal(6),
    Off(7);
    
    private final int value;

    ApsLogLevel(int i) {
        this.value = i;
    }

    public final int intValue() {
        return this.value;
    }
}
