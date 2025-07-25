package com.smaato.sdk.richmedia.mraid.bridge;

import android.graphics.Rect;
import androidx.annotation.NonNull;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.richmedia.mraid.MraidUtils;
import com.smaato.sdk.richmedia.mraid.dataprovider.MraidAudioVolumeLevel;
import com.smaato.sdk.richmedia.mraid.dataprovider.MraidExposureProperties;
import com.smaato.sdk.richmedia.mraid.dataprovider.MraidStateMachineFactory;
import com.smaato.sdk.richmedia.util.RectUtils;

/* loaded from: classes7.dex */
public final class MraidJsEvents {
    public static final String AUDIO_VOLUME_CHANGE = "audioVolumeChange";
    public static final String EXPOSURE_CHANGE = "exposureChange";
    @NonNull
    private final MraidJsBridge jsBridge;
    @NonNull
    private final Logger logger;

    public MraidJsEvents(Logger logger, @NonNull MraidJsBridge mraidJsBridge) {
        this.logger = (Logger) Objects.requireNonNull(logger);
        this.jsBridge = (MraidJsBridge) Objects.requireNonNull(mraidJsBridge);
    }

    public void fireAudioVolumeChangeEvent(@NonNull MraidAudioVolumeLevel mraidAudioVolumeLevel) {
        this.jsBridge.runScript(MraidUtils.format("window.mraidbridge.fireAudioVolumeChangeEvent(%s);", mraidAudioVolumeLevel.getAudioVolumeLevel()));
    }

    public void fireErrorEvent(@NonNull String str, @NonNull String str2) {
        this.jsBridge.runScript(MraidUtils.format("window.mraidbridge.fireErrorEvent('%s', '%s');", str2, str));
    }

    public void fireExposureChangeEvent(@NonNull MraidExposureProperties mraidExposureProperties) {
        if (mraidExposureProperties.isEmpty()) {
            return;
        }
        this.jsBridge.runScript(MraidUtils.format("window.mraidbridge.fireExposureChangeEvent(%.2f, %s, %s);", Float.valueOf(mraidExposureProperties.exposedPercentage), RectUtils.rectToString(mraidExposureProperties.visibleRectangleInDp), "null"));
    }

    public void fireSizeChangeEvent(@NonNull Rect rect) {
        this.jsBridge.runScript(MraidUtils.format("window.mraidbridge.fireSizeChangeEvent(%d, %d);", Integer.valueOf(rect.width()), Integer.valueOf(rect.height())));
    }

    public void fireStateChangeEvent(@NonNull MraidStateMachineFactory.State state) {
        try {
            this.jsBridge.runScript(MraidUtils.format("window.mraidbridge.fireStateChangeEvent('%s');", PropertiesUtils.m39090c(state)));
        } catch (IllegalArgumentException e) {
            Logger logger = this.logger;
            LogDomain logDomain = LogDomain.MRAID;
            logger.error(logDomain, "Failed to call MRAID's fireStateChangeEvent method, reason: " + e.getMessage(), new Object[0]);
        }
    }

    public void fireViewableChangeEvent(boolean z) {
        this.jsBridge.runScript(MraidUtils.format("window.mraidbridge.fireViewableChangeEvent(%b);", Boolean.valueOf(z)));
    }
}
