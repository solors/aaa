package com.fyber.inneractive.sdk.flow;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.global.C14388r;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.ignite.EnumC14568m;
import com.fyber.inneractive.sdk.network.C14740w;
import com.fyber.inneractive.sdk.network.EnumC14730t;
import com.fyber.inneractive.sdk.network.EnumC14738u;
import com.fyber.inneractive.sdk.response.AbstractC15386e;
import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.flow.v */
/* loaded from: classes4.dex */
public final class C14540v {

    /* renamed from: a */
    public final /* synthetic */ AbstractC14551w f27546a;

    public C14540v(AbstractC14551w abstractC14551w) {
        this.f27546a = abstractC14551w;
    }

    /* renamed from: a */
    public final void m77817a(EnumC14738u enumC14738u, EnumC14568m enumC14568m) {
        AbstractC14551w abstractC14551w = this.f27546a;
        InneractiveAdRequest inneractiveAdRequest = abstractC14551w.f27572a;
        AbstractC15386e abstractC15386e = abstractC14551w.f27573b;
        C14388r c14388r = abstractC14551w.f27574c;
        JSONArray m77925b = c14388r != null ? c14388r.m77925b() : null;
        C14740w c14740w = new C14740w(abstractC15386e);
        c14740w.f27931c = enumC14738u;
        c14740w.f27929a = inneractiveAdRequest;
        c14740w.f27932d = m77925b;
        JSONObject jSONObject = new JSONObject();
        String m77792a = enumC14568m.m77792a();
        try {
            jSONObject.put("ignitem", m77792a);
        } catch (Exception unused) {
            IAlog.m76524f("Got exception adding param to json object: %s, %s", "ignitem", m77792a);
        }
        c14740w.f27934f.put(jSONObject);
        c14740w.m77658a((String) null);
    }

    /* renamed from: a */
    public final void m77818a(EnumC14730t enumC14730t, String str, String str2, EnumC14568m enumC14568m) {
        AbstractC14551w abstractC14551w = this.f27546a;
        InneractiveAdRequest inneractiveAdRequest = abstractC14551w.f27572a;
        AbstractC15386e abstractC15386e = abstractC14551w.f27573b;
        C14388r c14388r = abstractC14551w.f27574c;
        JSONArray m77925b = c14388r != null ? c14388r.m77925b() : null;
        C14740w c14740w = new C14740w(abstractC15386e);
        c14740w.f27930b = enumC14730t;
        c14740w.f27929a = inneractiveAdRequest;
        c14740w.f27932d = m77925b;
        JSONObject jSONObject = new JSONObject();
        if (enumC14568m != null) {
            String m77792a = enumC14568m.m77792a();
            try {
                jSONObject.put("ignitem", m77792a);
            } catch (Exception unused) {
                IAlog.m76524f("Got exception adding param to json object: %s, %s", "ignitem", m77792a);
            }
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                jSONObject.put("message", str);
            } catch (Exception unused2) {
                IAlog.m76524f("Got exception adding param to json object: %s, %s", "message", str);
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            try {
                jSONObject.put("error_code", str2);
            } catch (Exception unused3) {
                IAlog.m76524f("Got exception adding param to json object: %s, %s", "error_code", str2);
            }
        }
        c14740w.f27934f.put(jSONObject);
        c14740w.m77658a((String) null);
    }
}
