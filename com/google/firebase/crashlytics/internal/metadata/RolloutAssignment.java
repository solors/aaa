package com.google.firebase.crashlytics.internal.metadata;

import com.google.auto.value.AutoValue;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.annotations.Encodable;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import org.json.JSONException;
import org.json.JSONObject;

@AutoValue
@Encodable
/* loaded from: classes4.dex */
public abstract class RolloutAssignment {
    public static final DataEncoder ROLLOUT_ASSIGNMENT_JSON_ENCODER = new JsonDataEncoderBuilder().configureWith(AutoRolloutAssignmentEncoder.CONFIG).build();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static RolloutAssignment m67012a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        return create(jSONObject.getString(ConfigContainer.ROLLOUT_METADATA_ID), jSONObject.getString("parameterKey"), jSONObject.getString("parameterValue"), jSONObject.getString("variantId"), jSONObject.getLong(RemoteConfigConstants.ResponseFieldKey.TEMPLATE_VERSION_NUMBER));
    }

    /* renamed from: b */
    private static String m67011b(String str) {
        if (str.length() > 256) {
            return str.substring(0, 256);
        }
        return str;
    }

    public static RolloutAssignment create(String str, String str2, String str3, String str4, long j) {
        return new AutoValue_RolloutAssignment(str, str2, m67011b(str3), str4, j);
    }

    public abstract String getParameterKey();

    public abstract String getParameterValue();

    public abstract String getRolloutId();

    public abstract long getTemplateVersion();

    public abstract String getVariantId();

    public CrashlyticsReport.Session.Event.RolloutAssignment toReportProto() {
        return CrashlyticsReport.Session.Event.RolloutAssignment.builder().setRolloutVariant(CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.builder().setVariantId(getVariantId()).setRolloutId(getRolloutId()).build()).setParameterKey(getParameterKey()).setParameterValue(getParameterValue()).setTemplateVersion(getTemplateVersion()).build();
    }
}
