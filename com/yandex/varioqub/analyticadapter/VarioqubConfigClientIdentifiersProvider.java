package com.yandex.varioqub.analyticadapter;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes8.dex */
public interface VarioqubConfigClientIdentifiersProvider {
    void requestDeviceId(@NotNull AdapterIdentifiersCallback adapterIdentifiersCallback);

    void requestUserId(@NotNull AdapterIdentifiersCallback adapterIdentifiersCallback);
}
