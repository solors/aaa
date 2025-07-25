package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.Map;
import kotlin.collections.C37559r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class AFc1eSDK implements AFc1pSDK {
    @NotNull
    private final AFd1pSDK valueOf;

    public AFc1eSDK(@NotNull AFd1pSDK aFd1pSDK) {
        Intrinsics.checkNotNullParameter(aFd1pSDK, "");
        this.valueOf = aFd1pSDK;
    }

    @Override // com.appsflyer.internal.AFc1pSDK
    public final void AFInAppEventParameterName() {
        this.valueOf.AFInAppEventParameterName("deeplink_data");
    }

    @Override // com.appsflyer.internal.AFc1pSDK
    @NotNull
    public final Map<String, Object> AFInAppEventType() {
        Map<String, Object> m17284j;
        Map<String, Object> m17284j2;
        if (this.valueOf.valueOf("deeplink_data")) {
            try {
                String AFKeystoreWrapper = this.valueOf.AFKeystoreWrapper("deeplink_data", (String) null);
                if (AFKeystoreWrapper == null) {
                    m17284j = C37559r0.m17284j();
                    return m17284j;
                }
                return AFj1sSDK.valueOf(new JSONObject(AFKeystoreWrapper));
            } catch (Throwable th) {
                AFLogger.afErrorLog("Exception while parsing stored deeplink data", th, true, false);
            }
        }
        m17284j2 = C37559r0.m17284j();
        return m17284j2;
    }

    @Override // com.appsflyer.internal.AFc1pSDK
    public final void AFInAppEventParameterName(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.valueOf.AFInAppEventParameterName("deeplink_data", new JSONObject(map).toString());
    }
}
