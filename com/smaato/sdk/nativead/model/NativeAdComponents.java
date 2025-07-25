package com.smaato.sdk.nativead.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;
import com.smaato.sdk.nativead.NativeAdAssets;
import com.smaato.sdk.nativead.NativeAdLink;
import com.smaato.sdk.nativead.NativeAdTracker;
import com.smaato.sdk.nativead.model.AutoValue_NativeAdComponents;
import java.util.List;

@AutoValue.CopyAnnotations
@AutoValue
/* loaded from: classes7.dex */
public abstract class NativeAdComponents {

    @AutoValue.Builder
    /* loaded from: classes7.dex */
    public static abstract class Builder {
        public abstract Builder assets(NativeAdAssets nativeAdAssets);

        public abstract NativeAdComponents build();

        public abstract Builder link(NativeAdLink nativeAdLink);

        public abstract Builder mraidWrappedVast(String str);

        public abstract Builder privacyUrl(String str);

        public abstract Builder trackers(List<NativeAdTracker> list);
    }

    @NonNull
    public static Builder builder() {
        return new AutoValue_NativeAdComponents.C27462b();
    }

    @NonNull
    public abstract NativeAdAssets assets();

    @NonNull
    public Builder buildUpon() {
        return builder().link(link()).assets(assets()).trackers(trackers()).privacyUrl(privacyUrl()).mraidWrappedVast(mraidWrappedVast());
    }

    @NonNull
    public abstract NativeAdLink link();

    @Nullable
    public abstract String mraidWrappedVast();

    @Nullable
    public abstract String privacyUrl();

    @NonNull
    public abstract List<NativeAdTracker> trackers();
}
