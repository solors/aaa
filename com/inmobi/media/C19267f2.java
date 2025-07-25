package com.inmobi.media;

import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.commons.core.configs.C18840b;
import com.inmobi.commons.core.configs.C18842d;
import com.inmobi.commons.core.configs.C18844f;
import com.inmobi.commons.core.configs.Config;
import com.inmobi.commons.core.configs.CrashConfig;
import com.inmobi.commons.core.configs.RootConfig;
import com.inmobi.commons.core.configs.SignalsConfig;
import com.inmobi.commons.core.configs.TelemetryConfig;
import com.mbridge.msdk.foundation.entity.BaseCampaignUnit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.f2 */
/* loaded from: classes6.dex */
public final class C19267f2 {
    /* renamed from: a */
    public static Config m60363a(String configType, String str) {
        Intrinsics.checkNotNullParameter(configType, "configType");
        switch (configType.hashCode()) {
            case -60641721:
                if (configType.equals("crashReporting")) {
                    return new CrashConfig(str);
                }
                break;
            case 96432:
                if (configType.equals(BaseCampaignUnit.JSON_KEY_ADS)) {
                    return new AdConfig(str);
                }
                break;
            case 3506402:
                if (configType.equals("root")) {
                    return new RootConfig(str);
                }
                break;
            case 780346297:
                if (configType.equals("telemetry")) {
                    return new TelemetryConfig(str);
                }
                break;
            case 2088265419:
                if (configType.equals("signals")) {
                    return new SignalsConfig(str);
                }
                break;
        }
        return new AdConfig(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static Config m60362a(String configType, JSONObject jsonObject, String str, long j) {
        Config config;
        Intrinsics.checkNotNullParameter(configType, "configType");
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        switch (configType.hashCode()) {
            case -60641721:
                if (configType.equals("crashReporting")) {
                    CrashConfig.Companion.getClass();
                    config = (Config) new C19368m5().m60028a(jsonObject, CrashConfig.class);
                    break;
                }
                AdConfig.Companion.getClass();
                config = (Config) C18840b.m61280a().m60028a(jsonObject, AdConfig.class);
                break;
            case 96432:
                if (configType.equals(BaseCampaignUnit.JSON_KEY_ADS)) {
                    AdConfig.Companion.getClass();
                    config = (Config) C18840b.m61280a().m60028a(jsonObject, AdConfig.class);
                    break;
                }
                AdConfig.Companion.getClass();
                config = (Config) C18840b.m61280a().m60028a(jsonObject, AdConfig.class);
                break;
            case 3506402:
                if (configType.equals("root")) {
                    RootConfig.Companion.getClass();
                    config = (Config) new C19368m5().m60032a(new C19415pa("components", RootConfig.class), (AbstractC19401oa) new C19019M5(new C18842d(), RootConfig.ComponentConfig.class)).m60028a(jsonObject, RootConfig.class);
                    break;
                }
                AdConfig.Companion.getClass();
                config = (Config) C18840b.m61280a().m60028a(jsonObject, AdConfig.class);
                break;
            case 780346297:
                if (configType.equals("telemetry")) {
                    TelemetryConfig.Companion.getClass();
                    config = (Config) new C19368m5().m60032a(new C19415pa("priorityEvents", TelemetryConfig.class), (AbstractC19401oa) new C19019M5(new C19276fb(), String.class)).m60028a(jsonObject, TelemetryConfig.class);
                    break;
                }
                AdConfig.Companion.getClass();
                config = (Config) C18840b.m61280a().m60028a(jsonObject, AdConfig.class);
                break;
            case 2088265419:
                if (configType.equals("signals")) {
                    SignalsConfig.Companion.getClass();
                    config = (Config) C18844f.m61279a().m60028a(jsonObject, SignalsConfig.class);
                    break;
                }
                AdConfig.Companion.getClass();
                config = (Config) C18840b.m61280a().m60028a(jsonObject, AdConfig.class);
                break;
            default:
                AdConfig.Companion.getClass();
                config = (Config) C18840b.m61280a().m60028a(jsonObject, AdConfig.class);
                break;
        }
        if (config != null) {
            config.setAccountId$media_release(str);
            config.setLastUpdateTimeStamp(j);
        }
        return config;
    }
}
