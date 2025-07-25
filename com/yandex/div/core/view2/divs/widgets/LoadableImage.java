package com.yandex.div.core.view2.divs.widgets;

import java.util.concurrent.Future;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.yandex.div.core.view2.divs.widgets.n */
/* loaded from: classes8.dex */
public interface LoadableImage {
    void cleanLoadingTask();

    @Nullable
    Future<?> getLoadingTask();

    void saveLoadingTask(@NotNull Future<?> future);
}
