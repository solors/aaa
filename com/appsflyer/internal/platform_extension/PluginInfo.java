package com.appsflyer.internal.platform_extension;

import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C37559r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class PluginInfo {
    @NotNull
    private final Map<String, String> AFInAppEventParameterName;
    @NotNull
    private final Plugin AFInAppEventType;
    @NotNull
    private final String AFKeystoreWrapper;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PluginInfo(@NotNull Plugin plugin, @NotNull String str) {
        this(plugin, str, null, 4, null);
        Intrinsics.checkNotNullParameter(plugin, "");
        Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PluginInfo copy$default(PluginInfo pluginInfo, Plugin plugin, String str, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            plugin = pluginInfo.AFInAppEventType;
        }
        if ((i & 2) != 0) {
            str = pluginInfo.AFKeystoreWrapper;
        }
        if ((i & 4) != 0) {
            map = pluginInfo.AFInAppEventParameterName;
        }
        return pluginInfo.copy(plugin, str, map);
    }

    @NotNull
    public final Plugin component1() {
        return this.AFInAppEventType;
    }

    @NotNull
    public final String component2() {
        return this.AFKeystoreWrapper;
    }

    @NotNull
    public final Map<String, String> component3() {
        return this.AFInAppEventParameterName;
    }

    @NotNull
    public final PluginInfo copy(@NotNull Plugin plugin, @NotNull String str, @NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(plugin, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        return new PluginInfo(plugin, str, map);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PluginInfo)) {
            return false;
        }
        PluginInfo pluginInfo = (PluginInfo) obj;
        if (this.AFInAppEventType == pluginInfo.AFInAppEventType && Intrinsics.m17075f(this.AFKeystoreWrapper, pluginInfo.AFKeystoreWrapper) && Intrinsics.m17075f(this.AFInAppEventParameterName, pluginInfo.AFInAppEventParameterName)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final Map<String, String> getAdditionalParams() {
        return this.AFInAppEventParameterName;
    }

    @NotNull
    public final Plugin getPlugin() {
        return this.AFInAppEventType;
    }

    @NotNull
    public final String getVersion() {
        return this.AFKeystoreWrapper;
    }

    public final int hashCode() {
        return (((this.AFInAppEventType.hashCode() * 31) + this.AFKeystoreWrapper.hashCode()) * 31) + this.AFInAppEventParameterName.hashCode();
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PluginInfo(plugin=");
        sb2.append(this.AFInAppEventType);
        sb2.append(", version=");
        sb2.append(this.AFKeystoreWrapper);
        sb2.append(", additionalParams=");
        sb2.append(this.AFInAppEventParameterName);
        sb2.append(')');
        return sb2.toString();
    }

    public PluginInfo(@NotNull Plugin plugin, @NotNull String str, @NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(plugin, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.AFInAppEventType = plugin;
        this.AFKeystoreWrapper = str;
        this.AFInAppEventParameterName = map;
    }

    public /* synthetic */ PluginInfo(Plugin plugin, String str, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(plugin, str, (i & 4) != 0 ? C37559r0.m17284j() : map);
    }
}
