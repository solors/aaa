package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.response.AbstractC15386e;
import com.fyber.inneractive.sdk.util.IAlog;
import java.text.SimpleDateFormat;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.network.w */
/* loaded from: classes4.dex */
public final class C14740w {

    /* renamed from: h */
    public static final SimpleDateFormat f27928h = new SimpleDateFormat("yyyy-MM-dd", Locale.US);

    /* renamed from: a */
    public InneractiveAdRequest f27929a;

    /* renamed from: b */
    public EnumC14730t f27930b;

    /* renamed from: c */
    public EnumC14738u f27931c;

    /* renamed from: d */
    public JSONArray f27932d;

    /* renamed from: e */
    public final AbstractC15386e f27933e;

    /* renamed from: f */
    public final JSONArray f27934f;

    /* renamed from: g */
    public boolean f27935g;

    public C14740w(EnumC14730t enumC14730t) {
        this((AbstractC15386e) null);
        this.f27930b = enumC14730t;
        this.f27929a = null;
        this.f27932d = null;
    }

    /* renamed from: a */
    public final C14740w m77657a(Object... objArr) {
        if (objArr.length > 0) {
            JSONObject jSONObject = new JSONObject();
            for (int i = 0; i < objArr.length - 1; i += 2) {
                String obj = objArr[i].toString();
                Object obj2 = objArr[i + 1];
                try {
                    jSONObject.put(obj, obj2);
                } catch (Exception unused) {
                    IAlog.m76524f("Got exception adding param to json object: %s, %s", obj, obj2);
                }
            }
            this.f27934f.put(jSONObject);
        }
        return this;
    }

    public C14740w(EnumC14730t enumC14730t, InneractiveAdRequest inneractiveAdRequest, AbstractC15386e abstractC15386e) {
        this(abstractC15386e);
        this.f27930b = enumC14730t;
        this.f27929a = inneractiveAdRequest;
        this.f27932d = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:205:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0172  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m77658a(java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.network.C14740w.m77658a(java.lang.String):void");
    }

    public C14740w(EnumC14738u enumC14738u) {
        this((AbstractC15386e) null);
        this.f27931c = enumC14738u;
        this.f27929a = null;
        this.f27932d = null;
    }

    public C14740w(EnumC14738u enumC14738u, InneractiveAdRequest inneractiveAdRequest, AbstractC15386e abstractC15386e) {
        this(abstractC15386e);
        this.f27931c = enumC14738u;
        this.f27929a = inneractiveAdRequest;
        this.f27932d = null;
    }

    public C14740w(AbstractC15386e abstractC15386e) {
        this.f27935g = false;
        this.f27933e = abstractC15386e;
        this.f27934f = new JSONArray();
    }
}
