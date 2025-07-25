package com.smaato.sdk.nativead;

import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;
import java.util.List;

@AutoValue.CopyAnnotations
@AutoValue
/* loaded from: classes7.dex */
public abstract class NativeAdLink {
    @NonNull
    public static NativeAdLink create(String str, List<String> list) {
        return new AutoValue_NativeAdLink(str, list);
    }

    @NonNull
    public abstract List<String> trackers();

    @NonNull
    public abstract String url();
}
