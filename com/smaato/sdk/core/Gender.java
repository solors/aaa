package com.smaato.sdk.core;

import androidx.annotation.NonNull;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;

/* loaded from: classes7.dex */
public enum Gender {
    FEMALE(InneractiveMediationDefs.GENDER_FEMALE),
    MALE("m"),
    OTHER("o");
    
    private final String gender;

    Gender(String str) {
        this.gender = str;
    }

    @Override // java.lang.Enum
    @NonNull
    public String toString() {
        return this.gender;
    }
}
