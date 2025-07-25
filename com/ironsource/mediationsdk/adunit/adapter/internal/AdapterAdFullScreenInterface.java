package com.ironsource.mediationsdk.adunit.adapter.internal;

import android.app.Activity;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public interface AdapterAdFullScreenInterface<Listener extends AdapterAdListener> {
    boolean isAdAvailable(@NotNull AdData adData);

    void loadAd(@NotNull AdData adData, @NotNull Activity activity, @NotNull Listener listener);

    void showAd(@NotNull AdData adData, @NotNull Listener listener);
}
