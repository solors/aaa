package com.google.firebase.sessions;

import com.google.firebase.encoders.json.NumberedEnum;
import kotlin.Metadata;

/* compiled from: ApplicationInfo.kt */
@Metadata
/* loaded from: classes4.dex */
public enum LogEnvironment implements NumberedEnum {
    LOG_ENVIRONMENT_UNKNOWN(0),
    LOG_ENVIRONMENT_AUTOPUSH(1),
    LOG_ENVIRONMENT_STAGING(2),
    LOG_ENVIRONMENT_PROD(3);
    

    /* renamed from: b */
    private final int f43705b;

    LogEnvironment(int i) {
        this.f43705b = i;
    }

    @Override // com.google.firebase.encoders.json.NumberedEnum
    public int getNumber() {
        return this.f43705b;
    }
}
