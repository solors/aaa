package com.mobilefuse.sdk.utils;

import com.mobilefuse.sdk.AdError;
import com.mobilefuse.sdk.config.ObservableConfig;
import com.mobilefuse.sdk.config.ObservableConfigKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AdErrorHelper.kt */
@Metadata
/* loaded from: classes7.dex */
public final class AdErrorHelper {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* compiled from: AdErrorHelper.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void onAdError(@NotNull AdError adError, @Nullable ObservableConfig observableConfig) {
            Intrinsics.checkNotNullParameter(adError, "adError");
            if (observableConfig == null) {
                return;
            }
            try {
                Object value = observableConfig.getValue(ObservableConfigKey.AD_ERROR_CALLBACK);
                if (!(value instanceof AdErrorCallback)) {
                    value = null;
                }
                AdErrorCallback adErrorCallback = (AdErrorCallback) value;
                if (adErrorCallback == null) {
                    return;
                }
                adErrorCallback.onError(adError, observableConfig);
            } catch (Exception unused) {
            }
        }

        public final void onAdRenderingError(@Nullable ObservableConfig observableConfig) {
            try {
                onAdError(AdError.AD_RUNTIME_ERROR, observableConfig);
            } catch (Exception unused) {
            }
        }
    }

    public static final void onAdError(@NotNull AdError adError, @Nullable ObservableConfig observableConfig) {
        Companion.onAdError(adError, observableConfig);
    }

    public static final void onAdRenderingError(@Nullable ObservableConfig observableConfig) {
        Companion.onAdRenderingError(observableConfig);
    }
}
