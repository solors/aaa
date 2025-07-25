package com.p551my.target;

import com.ironsource.C21114v8;
import java.net.HttpCookie;
import org.json.JSONObject;

/* renamed from: com.my.target.d6 */
/* loaded from: classes7.dex */
public class C25705d6 {
    /* renamed from: a */
    public HttpCookie m44025a(String str) {
        Throwable th;
        HttpCookie httpCookie;
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(str);
            httpCookie = new HttpCookie(jSONObject.getString("name"), jSONObject.optString("value"));
        } catch (Throwable th2) {
            th = th2;
            httpCookie = null;
        }
        try {
            httpCookie.setComment(jSONObject.optString("comment"));
            httpCookie.setCommentURL(jSONObject.optString("commentUrl"));
            httpCookie.setDomain(jSONObject.optString(C21114v8.C21123i.f54109D));
            httpCookie.setMaxAge(jSONObject.optInt("maxage"));
            httpCookie.setPath(jSONObject.optString("path"));
            httpCookie.setPortlist(jSONObject.optString("portlist"));
            httpCookie.setVersion(jSONObject.optInt("version"));
            httpCookie.setSecure(jSONObject.optBoolean("secure"));
            httpCookie.setDiscard(jSONObject.optBoolean("discard"));
            httpCookie.setHttpOnly(jSONObject.optBoolean("httpOnly"));
        } catch (Throwable th3) {
            th = th3;
            AbstractC25846ja.m43680a("MyTargetJSONCookie: Exception decoding cookie - " + th.getMessage());
            return httpCookie;
        }
        return httpCookie;
    }

    /* renamed from: a */
    public String m44024a(HttpCookie httpCookie) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", httpCookie.getName());
            jSONObject.putOpt("value", httpCookie.getValue());
            jSONObject.putOpt("comment", httpCookie.getComment());
            jSONObject.putOpt("commentUrl", httpCookie.getCommentURL());
            jSONObject.putOpt(C21114v8.C21123i.f54109D, httpCookie.getDomain());
            jSONObject.putOpt("maxage", Long.valueOf(httpCookie.getMaxAge()));
            jSONObject.putOpt("path", httpCookie.getPath());
            jSONObject.putOpt("portlist", httpCookie.getPortlist());
            jSONObject.putOpt("version", Integer.valueOf(httpCookie.getVersion()));
            jSONObject.putOpt("secure", Boolean.valueOf(httpCookie.getSecure()));
            jSONObject.putOpt("discard", Boolean.valueOf(httpCookie.getDiscard()));
            jSONObject.putOpt("httpOnly", Boolean.valueOf(httpCookie.isHttpOnly()));
            return jSONObject.toString();
        } catch (Throwable th) {
            AbstractC25846ja.m43680a("MyTargetJSONCookie: Exception encoding cookie - " + th.getMessage());
            return null;
        }
    }
}
