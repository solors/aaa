package com.mobilefuse.sdk.telemetry.implementations.sentry;

import com.mbridge.msdk.foundation.entity.BaseCampaignUnit;
import com.mobilefuse.sdk.telemetry.TelemetryBreadcrumb;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata
/* renamed from: com.mobilefuse.sdk.telemetry.implementations.sentry.SentryDataModelToJsonKt */
/* loaded from: classes7.dex */
public final class SentryDataModelToJson {
    @NotNull
    public static final JSONObject getJson(@NotNull SentryEvent json) {
        Intrinsics.checkNotNullParameter(json, "$this$json");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event_id", json.getEventId());
        jSONObject.put("timestamp", json.getTimestamp());
        jSONObject.put("message", json.getMessage());
        jSONObject.put("exception", getJson(json.getException()));
        jSONObject.put("platform", json.getPlatform());
        if (!json.getModules().isEmpty()) {
            jSONObject.put("modules", SentryHelpers.getJson(json.getModules()));
        }
        if (!json.getExtra().isEmpty()) {
            jSONObject.put("extra", SentryHelpers.getJson(json.getExtra()));
        }
        String release = json.getRelease();
        if (release != null) {
            jSONObject.put("release", release);
        }
        String culprit = json.getCulprit();
        if (culprit != null) {
            jSONObject.put("culprit", culprit);
        }
        SentryDataModel breadcrumbs = json.getBreadcrumbs();
        if (breadcrumbs != null && (!breadcrumbs.getValues().isEmpty())) {
            jSONObject.put("breadcrumbs", getJson(breadcrumbs));
        }
        return jSONObject;
    }

    @NotNull
    public static final JSONObject getJson(@NotNull SentryException json) {
        Intrinsics.checkNotNullParameter(json, "$this$json");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", json.getType());
        jSONObject.put("value", json.getValue());
        jSONObject.put("module", json.getModule());
        JSONObject put = jSONObject.put("stacktrace", getJson(json.getStacktrace()));
        Intrinsics.checkNotNullExpressionValue(put, "run {\n        with(JSONO…ace.json)\n        }\n    }");
        return put;
    }

    @NotNull
    public static final JSONObject getJson(@NotNull SentryStackTrace json) {
        Intrinsics.checkNotNullParameter(json, "$this$json");
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        for (SentryStackFrame sentryStackFrame : json.getFrames()) {
            jSONArray.put(getJson(sentryStackFrame));
        }
        JSONObject put = jSONObject.put(BaseCampaignUnit.JSON_KEY_FRAME_ADS, jSONArray);
        Intrinsics.checkNotNullExpressionValue(put, "run {\n        with(JSONO…mesArray)\n        }\n    }");
        return put;
    }

    @NotNull
    public static final JSONObject getJson(@NotNull SentryStackFrame json) {
        Intrinsics.checkNotNullParameter(json, "$this$json");
        JSONObject jSONObject = new JSONObject();
        if (json.getFunction().length() > 0) {
            jSONObject.put("function", json.getFunction());
        }
        if (json.getFilename().length() > 0) {
            jSONObject.put("filename", json.getFilename());
        }
        if (json.getModule().length() > 0) {
            jSONObject.put("module", json.getModule());
        }
        JSONObject put = jSONObject.put("lineno", json.getLineNumber());
        Intrinsics.checkNotNullExpressionValue(put, "run {\n        with(JSONO…neNumber)\n        }\n    }");
        return put;
    }

    @NotNull
    public static final JSONObject getJson(@NotNull TelemetryBreadcrumb json) {
        Intrinsics.checkNotNullParameter(json, "$this$json");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("timestamp", json.getTimestamp());
        jSONObject.put("message", json.getMessage());
        jSONObject.put("category", json.getCategory());
        Map<String, String> data = json.getData();
        if (data != null) {
            jSONObject.put("data", SentryHelpers.getJson(data));
        }
        return jSONObject;
    }

    @NotNull
    public static final JSONObject getJson(@NotNull SentryDataModel json) {
        Intrinsics.checkNotNullParameter(json, "$this$json");
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        for (TelemetryBreadcrumb telemetryBreadcrumb : json.getValues()) {
            jSONArray.put(getJson(telemetryBreadcrumb));
        }
        JSONObject put = jSONObject.put("values", jSONArray);
        Intrinsics.checkNotNullExpressionValue(put, "run {\n        with(JSONO…uesArray)\n        }\n    }");
        return put;
    }
}
