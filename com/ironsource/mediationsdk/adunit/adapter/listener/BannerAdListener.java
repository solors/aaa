package com.ironsource.mediationsdk.adunit.adapter.listener;

import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public interface BannerAdListener extends AdapterAdViewListener {
    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    void onAdLoadSuccess(@NotNull View view, @NotNull FrameLayout.LayoutParams layoutParams);
}
