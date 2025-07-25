package com.mobilefuse.sdk.component;

import kotlin.Metadata;

/* compiled from: AdParsingInterfaces.kt */
@Metadata
/* loaded from: classes7.dex */
public enum ParsingAbility {
    INCAPABLE(0),
    CAN_PARSE(10),
    MUST_PARSE(1000);
    
    private final int strength;

    ParsingAbility(int i) {
        this.strength = i;
    }

    public final int getStrength() {
        return this.strength;
    }
}
