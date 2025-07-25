package com.mbridge.msdk.foundation.same.net.p448f;

import android.text.TextUtils;
import com.ironsource.C20517nb;
import com.mbridge.msdk.foundation.same.net.p445c.FormFile;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.foundation.same.net.f.e */
/* loaded from: classes6.dex */
public final class CommonRequestParams {

    /* renamed from: a */
    public static String f56675a = "h";

    /* renamed from: b */
    public static String f56676b = "i";

    /* renamed from: c */
    public static String f56677c = "coppa";

    /* renamed from: d */
    public static String f56678d = "d";

    /* renamed from: e */
    public static String f56679e = "e";

    /* renamed from: f */
    public static String f56680f = "a";

    /* renamed from: g */
    public static String f56681g = "f";

    /* renamed from: h */
    public static String f56682h = "g";

    /* renamed from: i */
    private static final String f56683i = "e";

    /* renamed from: j */
    private Map<String, FormFile> f56684j = new LinkedHashMap();

    /* renamed from: k */
    private Map<String, String> f56685k = new LinkedHashMap();

    public CommonRequestParams() {
    }

    /* renamed from: a */
    public final void m52175a(String str, String str2) {
        if (str2 == null) {
            SameLogTool.m51824b(f56683i, "add() value is null!");
        }
        if (TextUtils.isEmpty(str) || str2 == null) {
            return;
        }
        this.f56685k.put(str, str2);
    }

    /* renamed from: b */
    public final String m52174b() {
        StringBuilder sb2 = new StringBuilder();
        try {
            for (Map.Entry<String, String> entry : this.f56685k.entrySet()) {
                if (sb2.length() > 0) {
                    sb2.append('&');
                }
                sb2.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
                sb2.append("=");
                sb2.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sb2.toString();
    }

    /* renamed from: c */
    public final JSONObject m52173c() {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, String> entry : this.f56685k.entrySet()) {
                jSONObject.put(URLEncoder.encode(entry.getKey(), "UTF-8"), URLEncoder.encode(entry.getValue(), "UTF-8"));
            }
            for (Map.Entry<String, FormFile> entry2 : this.f56684j.entrySet()) {
                jSONObject.put(URLEncoder.encode(entry2.getKey(), "UTF-8"), URLEncoder.encode("FILE_NAME_" + entry2.getValue().m52211a().getName(), "UTF-8"));
            }
        } catch (UnsupportedEncodingException unused) {
        } catch (JSONException e) {
            SameLogTool.m51824b(f56683i, e.getMessage());
        }
        return jSONObject;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(28);
        try {
            for (Map.Entry<String, String> entry : this.f56685k.entrySet()) {
                if (sb2.length() > 0) {
                    sb2.append('&');
                }
                sb2.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
                sb2.append(C20517nb.f52173T);
                sb2.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
            }
            for (Map.Entry<String, FormFile> entry2 : this.f56684j.entrySet()) {
                if (sb2.length() > 0) {
                    sb2.append('&');
                }
                sb2.append(URLEncoder.encode(entry2.getKey(), "UTF-8"));
                sb2.append(C20517nb.f52173T);
                sb2.append(URLEncoder.encode("FILE_NAME_" + entry2.getValue().m52211a().getName(), "UTF-8"));
            }
        } catch (UnsupportedEncodingException e) {
            SameLogTool.m51824b(f56683i, e.getMessage());
        }
        return sb2.toString();
    }

    public CommonRequestParams(Map<String, String> map) {
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                m52175a(entry.getKey(), entry.getValue());
            }
        }
    }

    /* renamed from: a */
    public final Map<String, String> m52177a() {
        return this.f56685k;
    }

    /* renamed from: a */
    public final void m52176a(String str) {
        this.f56685k.remove(str);
        this.f56684j.remove(str);
    }
}
