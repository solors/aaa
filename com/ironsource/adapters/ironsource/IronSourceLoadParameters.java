package com.ironsource.adapters.ironsource;

import com.ironsource.C20517nb;
import com.ironsource.mediationsdk.C20348d;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* loaded from: classes6.dex */
public interface IronSourceLoadParameters {

    @Metadata
    /* loaded from: classes6.dex */
    public static final class Base implements IronSourceLoadParameters {
        @NotNull
        private final JSONObject loadConfig;
        @Nullable
        private final String serverData;

        public Base(@NotNull JSONObject loadConfig, @Nullable String str) {
            Intrinsics.checkNotNullParameter(loadConfig, "loadConfig");
            this.loadConfig = loadConfig;
            this.serverData = str;
        }

        @Override // com.ironsource.adapters.ironsource.IronSourceLoadParameters
        @NotNull
        public JSONObject config() {
            return this.loadConfig;
        }

        @Override // com.ironsource.adapters.ironsource.IronSourceLoadParameters
        public boolean demandOnly() {
            return this.loadConfig.optBoolean(Constants.DEMAND_ONLY, false);
        }

        @Override // com.ironsource.adapters.ironsource.IronSourceLoadParameters
        @NotNull
        public HashMap<String, String> value() {
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("isOneFlow", String.valueOf(this.loadConfig.optBoolean("isOneFlow")));
            if (this.serverData != null) {
                String m57017a = C20348d.m57010b().m57017a(this.serverData);
                Intrinsics.checkNotNullExpressionValue(m57017a, "getInstance().getAdmFromServerData(serverData)");
                hashMap.put("adm", m57017a);
                hashMap.putAll(C20348d.m57010b().m57009b(this.serverData));
            }
            return hashMap;
        }

        public /* synthetic */ Base(JSONObject jSONObject, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(jSONObject, (i & 2) != 0 ? null : str);
        }
    }

    @Metadata
    /* loaded from: classes6.dex */
    public static final class Constants {
        @NotNull
        public static final String ADM_KEY = "adm";
        @NotNull
        public static final String DEMAND_ONLY = "demandOnly";
        @NotNull
        public static final Constants INSTANCE = new Constants();
        @NotNull
        public static final String ONE_FLOW_KEY = "isOneFlow";

        private Constants() {
        }
    }

    @Metadata
    /* loaded from: classes6.dex */
    public static final class WithLog implements IronSourceLoadParameters {
        @NotNull
        private final IronSourceLoadParameters loadParameters;

        public WithLog(@NotNull IronSourceLoadParameters loadParameters) {
            Intrinsics.checkNotNullParameter(loadParameters, "loadParameters");
            this.loadParameters = loadParameters;
        }

        @Override // com.ironsource.adapters.ironsource.IronSourceLoadParameters
        @NotNull
        public JSONObject config() {
            return this.loadParameters.config();
        }

        @Override // com.ironsource.adapters.ironsource.IronSourceLoadParameters
        public boolean demandOnly() {
            return this.loadParameters.demandOnly();
        }

        @Override // com.ironsource.adapters.ironsource.IronSourceLoadParameters
        @NotNull
        public HashMap<String, String> value() {
            HashMap<String, String> value = this.loadParameters.value();
            if (!value.isEmpty()) {
                IronLog.ADAPTER_API.verbose("instance extra params:");
                for (String str : value.keySet()) {
                    IronLog ironLog = IronLog.ADAPTER_API;
                    ironLog.verbose(str + C20517nb.f52173T + value.get(str));
                }
            }
            return value;
        }
    }

    @NotNull
    JSONObject config();

    boolean demandOnly();

    @NotNull
    HashMap<String, String> value();
}
