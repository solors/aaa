package com.facebook.appevents.cloudbridge;

import com.ironsource.C20517nb;
import java.util.Arrays;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: AppEventsCAPIManager.kt */
@Metadata
/* loaded from: classes2.dex */
public enum SettingsAPIFields {
    URL(C20517nb.f52192r),
    ENABLED("is_enabled"),
    DATASETID("dataset_id"),
    ACCESSKEY("access_key");
    
    @NotNull
    private final String rawValue;

    SettingsAPIFields(String str) {
        this.rawValue = str;
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static SettingsAPIFields[] valuesCustom() {
        SettingsAPIFields[] valuesCustom = values();
        return (SettingsAPIFields[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    @NotNull
    public final String getRawValue() {
        return this.rawValue;
    }
}
