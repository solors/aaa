package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.response.AbstractC15386e;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.PrintWriter;
import java.io.StringWriter;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.network.z */
/* loaded from: classes4.dex */
public abstract class AbstractC14743z {
    /* renamed from: a */
    public static void m77654a(String str, String str2, InneractiveAdRequest inneractiveAdRequest, AbstractC15386e abstractC15386e) {
        C14740w c14740w = new C14740w(EnumC14738u.CAUGHT_EXCEPTION, inneractiveAdRequest, abstractC15386e);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("exception_name", str);
        } catch (Exception unused) {
            IAlog.m76524f("Got exception adding param to json object: %s, %s", "exception_name", str);
        }
        try {
            jSONObject.put("description", str2);
        } catch (Exception unused2) {
            IAlog.m76524f("Got exception adding param to json object: %s, %s", "description", str2);
        }
        c14740w.f27934f.put(jSONObject);
        c14740w.m77658a((String) null);
    }

    /* renamed from: a */
    public static void m77653a(Throwable th, InneractiveAdRequest inneractiveAdRequest, AbstractC15386e abstractC15386e) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        String stringBuffer = stringWriter.getBuffer().toString();
        C14740w c14740w = new C14740w(EnumC14738u.CAUGHT_EXCEPTION, inneractiveAdRequest, abstractC15386e);
        JSONObject jSONObject = new JSONObject();
        String cls = th.getClass().toString();
        try {
            jSONObject.put("exception_name", cls);
        } catch (Exception unused) {
            IAlog.m76524f("Got exception adding param to json object: %s, %s", "exception_name", cls);
        }
        String message = th.getMessage();
        try {
            jSONObject.put("description", message);
        } catch (Exception unused2) {
            IAlog.m76524f("Got exception adding param to json object: %s, %s", "description", message);
        }
        try {
            jSONObject.put("stack_trace", stringBuffer);
        } catch (Exception unused3) {
            IAlog.m76524f("Got exception adding param to json object: %s, %s", "stack_trace", stringBuffer);
        }
        c14740w.f27934f.put(jSONObject);
        c14740w.m77658a((String) null);
    }
}
