package io.appmetrica.analytics.logger.appmetrica.internal;

import io.appmetrica.analytics.logger.common.BaseDebugLogger;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata
/* loaded from: classes9.dex */
public final class DebugLogger extends BaseDebugLogger {
    @NotNull
    public static final DebugLogger INSTANCE = new DebugLogger();

    private DebugLogger() {
        super("AppMetricaDebug");
    }

    public final void dumpJson(@NotNull String str, @NotNull JSONObject jSONObject) {
        String str2;
        try {
            str2 = jSONObject.toString(2);
        } catch (Throwable unused) {
            str2 = "Exception during dumping JSONObject";
        }
        info(str, str2, new Object[0]);
    }
}
