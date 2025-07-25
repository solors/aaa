package com.mbridge.msdk.foundation.download.core;

import android.text.TextUtils;
import com.ironsource.C20517nb;
import com.mbridge.msdk.foundation.same.report.p452d.C22011d;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class DownloaderReporter {
    private static final String KEY = "key=";
    private static final String TAG = "DownloaderReporter";
    private final Map<String, String> _params;
    private final String _reportKey;

    /* loaded from: classes6.dex */
    public static class Builder {
        private final Map<String, String> _params;
        private final String _reportKey;

        public Builder(String str) {
            if (!TextUtils.isEmpty(str)) {
                this._reportKey = str;
                this._params = new HashMap();
                return;
            }
            throw new IllegalArgumentException("reportKey can not be empty");
        }

        public Builder add(String str, String str2) {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                try {
                    this._params.put(str, str2);
                } catch (Exception unused) {
                }
            }
            return this;
        }

        public DownloaderReporter build() {
            return new DownloaderReporter(this);
        }
    }

    private void addUrlParams(Map<String, String> map, JSONObject jSONObject) {
        if (map != null && !map.isEmpty() && jSONObject != null) {
            try {
                for (String str : map.keySet()) {
                    jSONObject.put(str, encodeValue(map.get(str)));
                }
            } catch (Exception e) {
                SameLogTool.m51824b(TAG, e.getMessage());
            }
        }
    }

    private String encodeValue(String str) {
        try {
            return URLEncoder.encode(str, C20517nb.f52167N);
        } catch (Exception unused) {
            return str;
        }
    }

    public final void report() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(KEY, this._reportKey);
            addUrlParams(this._params, jSONObject);
            C22011d.m52050a().m52037a(jSONObject);
        } catch (Throwable th) {
            SameLogTool.m51824b(TAG, th.getMessage());
        }
    }

    private DownloaderReporter(Builder builder) {
        this._reportKey = builder._reportKey;
        this._params = builder._params;
    }
}
