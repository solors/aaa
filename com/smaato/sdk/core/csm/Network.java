package com.smaato.sdk.core.csm;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;
import com.smaato.sdk.core.csm.AutoValue_Network;

@AutoValue
/* loaded from: classes7.dex */
public abstract class Network {

    @AutoValue.Builder
    /* loaded from: classes7.dex */
    public static abstract class Builder {
        public abstract Network build();

        public abstract Builder setAdUnitId(@Nullable String str);

        public abstract Builder setClassName(@Nullable String str);

        public abstract Builder setClickUrl(@NonNull String str);

        public abstract Builder setCustomData(@Nullable String str);

        public abstract Builder setHeight(int i);

        public abstract Builder setImpression(@NonNull String str);

        public abstract Builder setName(@NonNull String str);

        public abstract Builder setPriority(int i);

        public abstract Builder setWidth(int i);
    }

    public static Builder builder() {
        return new AutoValue_Network.C27067b();
    }

    @Nullable
    public abstract String getAdUnitId();

    @Nullable
    public abstract String getClassName();

    @NonNull
    public abstract String getClickUrl();

    @Nullable
    public abstract String getCustomData();

    public abstract int getHeight();

    @NonNull
    public abstract String getImpression();

    @NonNull
    public abstract String getName();

    public abstract int getPriority();

    public abstract int getWidth();

    public boolean isCustomCsmNetwork() {
        return "Custom_CSM".equalsIgnoreCase(getName());
    }
}
