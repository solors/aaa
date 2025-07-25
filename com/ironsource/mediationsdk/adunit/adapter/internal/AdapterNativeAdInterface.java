package com.ironsource.mediationsdk.adunit.adapter.internal;

import android.app.Activity;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes6.dex */
public interface AdapterNativeAdInterface<Listener extends AdapterAdListener> {
    void destroyAd(@NotNull AdData adData);

    void loadAd(@NotNull AdData adData, @NotNull Activity activity, Listener listener);
}
