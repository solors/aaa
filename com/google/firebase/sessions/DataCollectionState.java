package com.google.firebase.sessions;

import com.google.firebase.encoders.json.NumberedEnum;
import kotlin.Metadata;

/* compiled from: SessionEvent.kt */
@Metadata
/* loaded from: classes4.dex */
public enum DataCollectionState implements NumberedEnum {
    COLLECTION_UNKNOWN(0),
    COLLECTION_SDK_NOT_INSTALLED(1),
    COLLECTION_ENABLED(2),
    COLLECTION_DISABLED(3),
    COLLECTION_DISABLED_REMOTE(4),
    COLLECTION_SAMPLED(5);
    

    /* renamed from: b */
    private final int f43684b;

    DataCollectionState(int i) {
        this.f43684b = i;
    }

    @Override // com.google.firebase.encoders.json.NumberedEnum
    public int getNumber() {
        return this.f43684b;
    }
}
