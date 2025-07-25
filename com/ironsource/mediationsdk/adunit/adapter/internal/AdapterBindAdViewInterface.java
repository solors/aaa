package com.ironsource.mediationsdk.adunit.adapter.internal;

import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes6.dex */
public interface AdapterBindAdViewInterface {
    void onAdViewBound(@NotNull AdData adData);

    void onAdViewWillBind(@NotNull AdData adData);
}
