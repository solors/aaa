package com.appsflyer.internal;

import com.appsflyer.internal.platform_extension.PluginInfo;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public interface AFi1pSDK {
    @NotNull
    Map<String, Object> AFInAppEventParameterName();

    void values(@NotNull PluginInfo pluginInfo);
}
