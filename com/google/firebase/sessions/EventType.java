package com.google.firebase.sessions;

import com.google.firebase.encoders.json.NumberedEnum;
import kotlin.Metadata;

/* compiled from: SessionEvent.kt */
@Metadata
/* loaded from: classes4.dex */
public enum EventType implements NumberedEnum {
    EVENT_TYPE_UNKNOWN(0),
    SESSION_START(1);
    

    /* renamed from: b */
    private final int f43690b;

    EventType(int i) {
        this.f43690b = i;
    }

    @Override // com.google.firebase.encoders.json.NumberedEnum
    public int getNumber() {
        return this.f43690b;
    }
}
