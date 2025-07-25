package com.mobilefuse.sdk.internal.mute;

import com.mobilefuse.sdk.AdInstanceInfo;
import com.mobilefuse.sdk.MuteChangedListener;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.config.ObservableConfig;
import com.mobilefuse.sdk.config.ObservableConfigKey;
import com.mobilefuse.sdk.config.Observer;
import com.mobilefuse.sdk.telemetry.TelemetrySdkActionFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MutableAdController.kt */
@Metadata
/* loaded from: classes7.dex */
public final class MutableAdController implements MutableAd {
    @NotNull
    private final AdInstanceInfo adInstanceInfo;
    @Nullable
    private MuteChangedListener muteChangedListener;
    @NotNull
    private final ObservableConfig observableConfig;

    @Metadata
    /* loaded from: classes7.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ObservableConfigKey.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[ObservableConfigKey.MUTED.ordinal()] = 1;
        }
    }

    public MutableAdController(@NotNull ObservableConfig observableConfig, @NotNull AdInstanceInfo adInstanceInfo) {
        Intrinsics.checkNotNullParameter(observableConfig, "observableConfig");
        Intrinsics.checkNotNullParameter(adInstanceInfo, "adInstanceInfo");
        this.observableConfig = observableConfig;
        this.adInstanceInfo = adInstanceInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onConfigPropertyChanged(ObservableConfigKey observableConfigKey, Object obj) {
        boolean z;
        if (this.observableConfig.getBooleanValue(ObservableConfigKey.MUTE_ENABLED) && WhenMappings.$EnumSwitchMapping$0[observableConfigKey.ordinal()] == 1) {
            if (!(obj instanceof Boolean)) {
                obj = null;
            }
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            this.adInstanceInfo.getTelemetryAgent().onAction(TelemetrySdkActionFactory.createAdInstanceSetMutedAction(z, this.adInstanceInfo));
            MuteChangedListener muteChangedListener = getMuteChangedListener();
            if (muteChangedListener != null) {
                muteChangedListener.onMutedChanged(z);
            }
        }
    }

    @NotNull
    public final AdInstanceInfo getAdInstanceInfo() {
        return this.adInstanceInfo;
    }

    @Override // com.mobilefuse.sdk.internal.mute.MutableAd
    @Nullable
    public MuteChangedListener getMuteChangedListener() {
        return this.muteChangedListener;
    }

    @NotNull
    public final ObservableConfig getObservableConfig() {
        return this.observableConfig;
    }

    public final void init() {
        ObservableConfig observableConfig = this.observableConfig;
        observableConfig.setValue(ObservableConfigKey.MUTE_ENABLED, Boolean.TRUE);
        final MutableAdController$init$1$1 mutableAdController$init$1$1 = new MutableAdController$init$1$1(this);
        observableConfig.registerObserver(new Observer() { // from class: com.mobilefuse.sdk.internal.mute.MutableAdController$sam$com_mobilefuse_sdk_config_Observer$0
            @Override // com.mobilefuse.sdk.config.Observer
            public final /* synthetic */ void onChanged(ObservableConfigKey observableConfigKey, Object obj) {
                Intrinsics.checkNotNullExpressionValue(mutableAdController$init$1$1.mo105910invoke(observableConfigKey, obj), "invoke(...)");
            }
        });
    }

    @Override // com.mobilefuse.sdk.internal.mute.MutableAd
    public boolean isMuted() {
        try {
            return this.observableConfig.getBooleanValue(ObservableConfigKey.MUTED);
        } catch (Exception e) {
            StabilityHelper.logException(this, e);
            return false;
        }
    }

    @Override // com.mobilefuse.sdk.internal.mute.MutableAd
    public void setMuteChangedListener(@Nullable MuteChangedListener muteChangedListener) {
        this.muteChangedListener = muteChangedListener;
    }

    @Override // com.mobilefuse.sdk.internal.mute.MutableAd
    public void setMuted(boolean z) {
        try {
            this.observableConfig.setValue(ObservableConfigKey.MUTED, Boolean.valueOf(z));
        } catch (Exception e) {
            StabilityHelper.logException(this, e);
        }
    }
}
