package com.yandex.varioqub.analyticadapter;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes8.dex */
public interface VarioqubConfigAdapter extends VarioqubConfigReporter, VarioqubConfigClientIdentifiersProvider {
    @NotNull
    String getAdapterName();
}
