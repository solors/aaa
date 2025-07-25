package com.amazon.aps.ads.util.adview;

import android.webkit.ValueCallback;
import com.amazon.device.ads.DTBAdMRAIDController;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: ApsWebBridgeListener.kt */
@Metadata
/* loaded from: classes2.dex */
public interface ApsWebBridgeListener {
    void evaluateApsJavascript(@Nullable String str, @Nullable ValueCallback<String> valueCallback);

    @Nullable
    DTBAdMRAIDController getApsMraidHandler();
}
