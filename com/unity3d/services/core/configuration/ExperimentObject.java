package com.unity3d.services.core.configuration;

import org.json.JSONObject;

/* loaded from: classes7.dex */
public class ExperimentObject {
    private static final String APPLIED_KEY = "applied";
    private static final String VALUE_KEY = "value";
    private final JSONObject _experimentData;

    public ExperimentObject(JSONObject jSONObject) {
        this._experimentData = jSONObject == null ? new JSONObject() : jSONObject;
    }

    public ExperimentAppliedRule getAppliedRule() {
        ExperimentAppliedRule experimentAppliedRule = ExperimentAppliedRule.NEXT;
        String optString = this._experimentData.optString("applied");
        if (!optString.isEmpty()) {
            try {
                return ExperimentAppliedRule.valueOf(optString.toUpperCase());
            } catch (IllegalArgumentException unused) {
                return experimentAppliedRule;
            }
        }
        return experimentAppliedRule;
    }

    public boolean getBooleanValue() {
        return this._experimentData.optBoolean("value");
    }

    public String getStringValue() {
        return this._experimentData.optString("value");
    }
}
