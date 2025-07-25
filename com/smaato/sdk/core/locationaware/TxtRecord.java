package com.smaato.sdk.core.locationaware;

import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: classes7.dex */
public abstract class TxtRecord {
    @NonNull
    public static TxtRecord create(String str, int i) {
        return new AutoValue_TxtRecord(str, i);
    }

    public abstract String data();

    public abstract int ttl();
}
