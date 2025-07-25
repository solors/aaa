package com.mbridge.msdk.foundation.same.report;

import android.text.TextUtils;
import com.ironsource.C20517nb;
import com.mbridge.msdk.foundation.same.report.p452d.C22011d;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.foundation.same.report.k */
/* loaded from: classes6.dex */
public final class SameCommonReporter {

    /* renamed from: a */
    private final Map<String, String> f56820a;

    /* renamed from: b */
    private final String f56821b;

    /* compiled from: SameCommonReporter.java */
    /* renamed from: com.mbridge.msdk.foundation.same.report.k$a */
    /* loaded from: classes6.dex */
    public static class C22019a {

        /* renamed from: a */
        private final Map<String, String> f56822a = new HashMap();

        /* renamed from: b */
        private final String f56823b;

        public C22019a(String str) {
            this.f56823b = str;
        }

        /* renamed from: a */
        public final SameCommonReporter m51944a() {
            return new SameCommonReporter(this);
        }
    }

    /* renamed from: b */
    private String m51945b(String str) {
        try {
            return URLEncoder.encode(str, C20517nb.f52167N);
        } catch (Exception unused) {
            return str;
        }
    }

    /* renamed from: a */
    public final void m51947a(String str) {
        if (TextUtils.isEmpty(this.f56821b)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key", this.f56821b);
            m51946a(this.f56820a, jSONObject);
            C22011d.m52050a().m52037a(jSONObject);
        } catch (Throwable th) {
            SameLogTool.m51824b("SameCommonReporter", th.getMessage());
        }
    }

    private SameCommonReporter(C22019a c22019a) {
        this.f56821b = c22019a.f56823b;
        this.f56820a = c22019a.f56822a;
    }

    /* renamed from: a */
    private void m51946a(Map<String, String> map, JSONObject jSONObject) {
        if (map == null || map.isEmpty() || jSONObject == null) {
            return;
        }
        try {
            for (String str : map.keySet()) {
                jSONObject.put(str, m51945b(map.get(str)));
            }
        } catch (Exception e) {
            SameLogTool.m51824b("SameCommonReporter", e.getMessage());
        }
    }
}
