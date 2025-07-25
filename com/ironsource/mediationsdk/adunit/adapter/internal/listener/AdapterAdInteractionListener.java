package com.ironsource.mediationsdk.adunit.adapter.internal.listener;

import org.jetbrains.annotations.Nullable;

/* loaded from: classes6.dex */
public interface AdapterAdInteractionListener extends AdapterAdListener {
    void onAdClosed();

    void onAdEnded();

    void onAdShowFailed(int i, @Nullable String str);

    void onAdShowSuccess();

    void onAdStarted();

    void onAdVisible();
}
