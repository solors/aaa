package com.ironsource.mediationsdk.adunit.adapter.internal.listener;

import android.view.View;
import android.widget.FrameLayout;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public interface AdapterAdViewListener extends AdapterAdListener {
    void onAdLeftApplication();

    void onAdLoadSuccess(@NotNull View view, @NotNull FrameLayout.LayoutParams layoutParams);

    void onAdScreenDismissed();

    void onAdScreenPresented();
}
