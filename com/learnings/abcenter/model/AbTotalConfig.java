package com.learnings.abcenter.model;

import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class AbTotalConfig {
    public static final int PARSE_TYPE_ALL = 6;
    public static final int PARSE_TYPE_V5 = 2;
    public static final int PARSE_TYPE_V6 = 4;
    public static final String V5_CONFIG = "v5_config";
    private String configJsonV5;
    private String configJsonV6;

    public AbTotalConfig(String str) {
        this(str, 6);
    }

    private boolean isMatch(int i, int i2) {
        if ((i & i2) > 0) {
            return true;
        }
        return false;
    }

    private void setConfigJsonV5(String str) {
        try {
            this.configJsonV5 = new JSONObject(str).getJSONObject(V5_CONFIG).toString();
        } catch (Throwable unused) {
        }
    }

    private void setConfigJsonV6(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            jSONObject.remove(V5_CONFIG);
            this.configJsonV6 = jSONObject.toString();
        } catch (Throwable unused) {
        }
    }

    public String getConfigJsonV5() {
        return this.configJsonV5;
    }

    public String getConfigJsonV6() {
        return this.configJsonV6;
    }

    public AbTotalConfig(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (isMatch(i, 2)) {
            setConfigJsonV5(str);
        }
        if (isMatch(i, 4)) {
            setConfigJsonV6(str);
        }
    }
}
