package com.pubmatic.sdk.openwrap.core.signal;

import android.os.Bundle;
import androidx.annotation.Keep;
import com.pubmatic.sdk.common.POBAdFormat;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: POBSignalConfig.kt */
@Keep
@Metadata
/* loaded from: classes7.dex */
public final class POBSignalConfig {
    @NotNull
    private final POBAdFormat adFormat;
    @Nullable
    private final Bundle extras;
    @Nullable
    private final String gpid;

    /* compiled from: POBSignalConfig.kt */
    @Keep
    @Metadata
    /* loaded from: classes7.dex */
    public static final class Builder {
        @NotNull
        private final POBAdFormat adFormat;
        @Nullable
        private Bundle extras;
        @Nullable
        private String gpid;

        public Builder(@NotNull POBAdFormat adFormat) {
            Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            this.adFormat = adFormat;
        }

        @NotNull
        public final POBSignalConfig build() {
            return new POBSignalConfig(this.adFormat, this.extras, this.gpid, null);
        }

        @NotNull
        public final POBAdFormat getAdFormat() {
            return this.adFormat;
        }

        @NotNull
        public final Builder setExtras(@NotNull Bundle extras) {
            Intrinsics.checkNotNullParameter(extras, "extras");
            this.extras = extras;
            return this;
        }

        @NotNull
        public final Builder setGpid(@NotNull String gpid) {
            Intrinsics.checkNotNullParameter(gpid, "gpid");
            this.gpid = gpid;
            return this;
        }
    }

    public /* synthetic */ POBSignalConfig(POBAdFormat pOBAdFormat, Bundle bundle, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(pOBAdFormat, bundle, str);
    }

    @NotNull
    public final POBAdFormat getAdFormat() {
        return this.adFormat;
    }

    @Nullable
    public final Bundle getExtras() {
        return this.extras;
    }

    @Nullable
    public final String getGpid() {
        return this.gpid;
    }

    private POBSignalConfig(POBAdFormat pOBAdFormat, Bundle bundle, String str) {
        this.adFormat = pOBAdFormat;
        this.extras = bundle;
        this.gpid = str;
    }
}
