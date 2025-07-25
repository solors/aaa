package com.ironsource;

import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.gm */
/* loaded from: classes6.dex */
public final class C20002gm {

    @Metadata
    /* renamed from: com.ironsource.gm$a */
    /* loaded from: classes6.dex */
    public static final class C20003a {
        @NotNull

        /* renamed from: a */
        public static final C20003a f50284a = new C20003a();
        @NotNull

        /* renamed from: b */
        public static final String f50285b = "SDKPluginType";
        @NotNull

        /* renamed from: c */
        public static final String f50286c = "sessionid";

        private C20003a() {
        }
    }

    @NotNull
    /* renamed from: a */
    public final Map<String, String> m58335a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String pluginType = ConfigFile.getConfigFile().getPluginType();
        if (pluginType != null) {
            linkedHashMap.put(C20003a.f50285b, pluginType);
        }
        String sessionId = IronSourceUtils.getSessionId();
        if (sessionId != null) {
            linkedHashMap.put("sessionid", sessionId);
        }
        return linkedHashMap;
    }
}
