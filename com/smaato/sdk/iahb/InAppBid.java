package com.smaato.sdk.iahb;

import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;

@AutoValue.CopyAnnotations
@AutoValue
/* loaded from: classes7.dex */
public abstract class InAppBid {
    @NonNull
    public static InAppBid create(@NonNull String str) {
        if (str != null) {
            return new AutoValue_InAppBid(str);
        }
        throw new NullPointerException("'json' specified as non-null is null");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public abstract String getJson();
}
