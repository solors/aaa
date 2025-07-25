package io.bidmachine.nativead.view;

import android.view.ViewGroup;
import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public class NativeAdContainerBridge {
    public static void configureContainer(@NonNull NativeAdContainer nativeAdContainer, @NonNull ViewGroup viewGroup) {
        nativeAdContainer.configureContainer(viewGroup);
    }

    public static void deConfigureContainer(@NonNull NativeAdContainer nativeAdContainer) {
        nativeAdContainer.deConfigureContainer();
    }
}
