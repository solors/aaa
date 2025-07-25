package com.mobilefuse.sdk.config;

import com.mobilefuse.sdk.Debugging;
import com.mobilefuse.sdk.MobileFuseDefaults;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.math.MathMf;
import com.mobilefuse.sdk.network.model.AdmMediaType;
import com.mobilefuse.sdk.network.model.MfxBidResponse;
import com.mobilefuse.sdk.video.ClickthroughBehaviour;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p804nd.NoWhenBranchMatchedException;

@Metadata
/* renamed from: com.mobilefuse.sdk.config.Apply_BidResponse_to_ObservableConfigKt */
/* loaded from: classes7.dex */
public final class apply_BidResponse_to_ObservableConfig {
    public static final void applyConfigFromBidResponse(@NotNull ObservableConfig applyConfigFromBidResponse, @NotNull MfxBidResponse bidResponse) {
        Float endCardCloseSeconds;
        Integer maxEndCards;
        boolean z;
        Intrinsics.checkNotNullParameter(applyConfigFromBidResponse, "$this$applyConfigFromBidResponse");
        Intrinsics.checkNotNullParameter(bidResponse, "bidResponse");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            if (bidResponse.getType() == AdmMediaType.VIDEO || bidResponse.getType() == AdmMediaType.NATIVE) {
                ClickthroughBehaviour clickBehavior = bidResponse.getClickBehavior();
                if (clickBehavior == null) {
                    clickBehavior = MobileFuseDefaults.DEFAULT_VIDEO_CLICKTHROUGH_BEHAVIOUR;
                }
                applyConfigFromBidResponse.setValue(ObservableConfigKey.VIDEO_CLICK_THROUGH_BEHAVIOUR, clickBehavior);
                ObservableConfigKey observableConfigKey = ObservableConfigKey.MUTED;
                if (!applyConfigFromBidResponse.hasValue(observableConfigKey)) {
                    boolean booleanValue = applyConfigFromBidResponse.getBooleanValue(ObservableConfigKey.DEFAULT_MUTED, true);
                    Boolean muted = bidResponse.getMuted();
                    if (muted != null) {
                        z = muted.booleanValue();
                    } else {
                        z = booleanValue;
                    }
                    Debugging.logDebug$default(applyConfigFromBidResponse, "Apply muted config [appliedValue=" + z + ", defaultValue=" + booleanValue + ", bidResponseValue=" + bidResponse.getMuted() + ']', null, 2, null);
                    applyConfigFromBidResponse.setValue(observableConfigKey, Boolean.valueOf(z));
                } else {
                    Debugging.logDebug$default(applyConfigFromBidResponse, "Muted config configured by app developer [value=" + applyConfigFromBidResponse.getValue(observableConfigKey) + ']', null, 2, null);
                }
                ObservableConfigKey observableConfigKey2 = ObservableConfigKey.MAX_END_CARDS;
                if (!applyConfigFromBidResponse.hasValue(observableConfigKey2) && (maxEndCards = bidResponse.getMaxEndCards()) != null) {
                    applyConfigFromBidResponse.setValue(observableConfigKey2, Integer.valueOf(maxEndCards.intValue()));
                }
                ObservableConfigKey observableConfigKey3 = ObservableConfigKey.END_CARD_CLOSE_SECONDS;
                if (!applyConfigFromBidResponse.hasValue(observableConfigKey3) && (endCardCloseSeconds = bidResponse.getEndCardCloseSeconds()) != null) {
                    applyConfigFromBidResponse.setValue(observableConfigKey3, Float.valueOf(endCardCloseSeconds.floatValue()));
                }
            }
            float floatValue = applyConfigFromBidResponse.getFloatValue(ObservableConfigKey.DEFAULT_FORCE_SKIP_SECONDS, -1.0f);
            Float forceSkipSeconds = bidResponse.getForceSkipSeconds();
            if (forceSkipSeconds != null) {
                floatValue = MathMf.minPreferPositive(forceSkipSeconds.floatValue(), floatValue);
            }
            if (floatValue > -1.0f) {
                applyConfigFromBidResponse.setValue(ObservableConfigKey.FORCE_SKIP_SECONDS, Float.valueOf(floatValue));
            }
            Float blockSkipSeconds = bidResponse.getBlockSkipSeconds();
            if (blockSkipSeconds != null) {
                applyConfigFromBidResponse.setValue(ObservableConfigKey.BLOCK_SKIP_SECONDS, Float.valueOf(blockSkipSeconds.floatValue()));
            }
        } catch (Throwable th) {
            int i = C23492x25dff923.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
            StabilityHelper.logException("[Automatically caught]", th);
        }
    }
}
