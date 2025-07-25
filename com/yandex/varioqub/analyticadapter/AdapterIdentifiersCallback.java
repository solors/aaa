package com.yandex.varioqub.analyticadapter;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes8.dex */
public interface AdapterIdentifiersCallback {
    void onError(@NotNull String str);

    void onSuccess(@NotNull String str);
}
