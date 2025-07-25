package com.yandex.varioqub.analyticadapter;

import com.yandex.varioqub.analyticadapter.data.ConfigData;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes8.dex */
public interface VarioqubConfigReporter {
    void reportConfigChanged(@NotNull ConfigData configData);

    void setExperiments(@NotNull String str);

    void setTriggeredTestIds(@NotNull Set<Long> set);
}
