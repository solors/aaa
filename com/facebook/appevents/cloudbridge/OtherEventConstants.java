package com.facebook.appevents.cloudbridge;

import java.util.Arrays;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: AppEventsConversionsAPITransformer.kt */
@Metadata
/* loaded from: classes2.dex */
public enum OtherEventConstants {
    EVENT("event"),
    ACTION_SOURCE("action_source"),
    APP("app"),
    MOBILE_APP_INSTALL("MobileAppInstall"),
    INSTALL_EVENT_TIME("install_timestamp");
    
    @NotNull
    private final String rawValue;

    OtherEventConstants(String str) {
        this.rawValue = str;
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static OtherEventConstants[] valuesCustom() {
        OtherEventConstants[] valuesCustom = values();
        return (OtherEventConstants[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    @NotNull
    public final String getRawValue() {
        return this.rawValue;
    }
}
