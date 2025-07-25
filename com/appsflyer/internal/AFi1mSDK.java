package com.appsflyer.internal;

import com.appsflyer.internal.platform_extension.Plugin;
import com.appsflyer.internal.platform_extension.PluginInfo;
import java.util.Map;
import kotlin.collections.C37559r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p804nd.C38513v;

/* loaded from: classes2.dex */
public final class AFi1mSDK implements AFi1pSDK {
    @NotNull
    private PluginInfo AFInAppEventParameterName = new PluginInfo(Plugin.NATIVE, "6.14.2", null, 4, null);

    @Override // com.appsflyer.internal.AFi1pSDK
    @NotNull
    public final Map<String, Object> AFInAppEventParameterName() {
        Map<String, Object> m17279o;
        m17279o = C37559r0.m17279o(C38513v.m14532a("platform", this.AFInAppEventParameterName.getPlugin().getPluginName()), C38513v.m14532a("version", this.AFInAppEventParameterName.getVersion()));
        if (!this.AFInAppEventParameterName.getAdditionalParams().isEmpty()) {
            m17279o.put("extras", this.AFInAppEventParameterName.getAdditionalParams());
        }
        return m17279o;
    }

    @Override // com.appsflyer.internal.AFi1pSDK
    public final void values(@NotNull PluginInfo pluginInfo) {
        Intrinsics.checkNotNullParameter(pluginInfo, "");
        this.AFInAppEventParameterName = pluginInfo;
    }
}
