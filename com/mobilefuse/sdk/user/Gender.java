package com.mobilefuse.sdk.user;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: Gender.kt */
@Metadata
/* loaded from: classes7.dex */
public enum Gender {
    FEMALE("F"),
    MALE("M"),
    OTHER("O"),
    UNKNOWN("");
    
    @NotNull
    private final String value;

    Gender(String str) {
        this.value = str;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
