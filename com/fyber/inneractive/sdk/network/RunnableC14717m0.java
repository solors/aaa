package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.response.AbstractC15386e;
import com.fyber.inneractive.sdk.util.AbstractC15471s;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.PrintWriter;
import java.io.StringWriter;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.network.m0 */
/* loaded from: classes4.dex */
public final class RunnableC14717m0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C14719n0 f27894a;

    public RunnableC14717m0(C14719n0 c14719n0) {
        this.f27894a = c14719n0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        InneractiveAdRequest inneractiveAdRequest;
        AbstractC15386e abstractC15386e;
        JSONArray jSONArray;
        C14719n0 c14719n0 = this.f27894a;
        AbstractC14686U abstractC14686U = (AbstractC14686U) AbstractC15471s.m76459a(c14719n0.f27896b);
        Thread thread = (Thread) AbstractC15471s.m76459a(this.f27894a.f27895a);
        if (abstractC14686U != null && abstractC14686U.f27829f != EnumC14709i0.DONE && abstractC14686U.f27829f != EnumC14709i0.RESOLVED) {
            boolean m77716t = abstractC14686U.m77716t();
            IAlog.m76529a("%s : NetworkWatchdogHolder : should report: %s", IAlog.m76532a(C14719n0.class), Boolean.valueOf(m77716t));
            if (m77716t) {
                if (thread != null) {
                    StackTraceElement[] stackTrace = thread.getStackTrace();
                    Exception exc = new Exception();
                    exc.setStackTrace(stackTrace);
                    StringWriter stringWriter = new StringWriter();
                    exc.printStackTrace(new PrintWriter(stringWriter));
                    str = stringWriter.getBuffer().toString();
                } else {
                    str = "";
                }
                String mo77692p = abstractC14686U.mo77692p();
                if (abstractC14686U instanceof C14683Q) {
                    inneractiveAdRequest = ((C14683Q) abstractC14686U).f27812p;
                } else {
                    inneractiveAdRequest = null;
                }
                if (abstractC14686U instanceof C14703f0) {
                    abstractC15386e = ((C14703f0) abstractC14686U).f27875s;
                } else {
                    abstractC15386e = null;
                }
                EnumC14738u enumC14738u = EnumC14738u.NETWORK_REQUEST_PASSED_ALLOWED_TIME;
                if (abstractC14686U.mo77700i() != null) {
                    jSONArray = abstractC14686U.mo77700i().m77925b();
                } else {
                    jSONArray = null;
                }
                C14740w c14740w = new C14740w(abstractC15386e);
                c14740w.f27931c = enumC14738u;
                c14740w.f27929a = inneractiveAdRequest;
                c14740w.f27932d = jSONArray;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("url", mo77692p);
                } catch (Exception unused) {
                    IAlog.m76524f("Got exception adding param to json object: %s, %s", "url", mo77692p);
                }
                try {
                    jSONObject.put("stack_trace", str);
                } catch (Exception unused2) {
                    IAlog.m76524f("Got exception adding param to json object: %s, %s", "stack_trace", str);
                }
                Integer valueOf = Integer.valueOf(c14719n0.f27897c);
                try {
                    jSONObject.put("total_time", valueOf);
                } catch (Exception unused3) {
                    IAlog.m76524f("Got exception adding param to json object: %s, %s", "total_time", valueOf);
                }
                c14740w.f27934f.put(jSONObject);
                c14740w.m77658a((String) null);
            }
            IAlog.m76529a("%s : NetworkWatchdogHolder should cancel by timeout: %d", IAlog.m76531a(c14719n0), Integer.valueOf(c14719n0.f27897c));
            abstractC14686U.mo77704c();
        }
    }
}
