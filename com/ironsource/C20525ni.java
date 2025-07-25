package com.ironsource;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.ni */
/* loaded from: classes6.dex */
public class C20525ni {

    /* renamed from: a */
    private String f52205a;

    /* renamed from: e */
    private String f52209e;

    /* renamed from: f */
    private Map<String, String> f52210f;

    /* renamed from: g */
    private final InterfaceC19592an f52211g;

    /* renamed from: h */
    private boolean f52212h;

    /* renamed from: b */
    private boolean f52206b = false;

    /* renamed from: c */
    private boolean f52207c = false;

    /* renamed from: d */
    private C20047hf f52208d = null;

    /* renamed from: i */
    protected boolean f52213i = false;

    /* renamed from: j */
    protected String f52214j = null;

    public C20525ni(String str, InterfaceC19592an interfaceC19592an) throws NullPointerException {
        this.f52205a = SDKUtils.requireNonEmptyOrNull(str, "Instance name can't be null");
        this.f52211g = (InterfaceC19592an) SDKUtils.requireNonNull(interfaceC19592an, "AdListener name can't be null");
    }

    /* renamed from: a */
    public C20473mi m56160a() {
        return new C20473mi(m56155b(), this.f52205a, this.f52206b, this.f52207c, this.f52212h, this.f52213i, this.f52214j, this.f52210f, this.f52211g, this.f52208d);
    }

    /* renamed from: b */
    public C20525ni m56154b(@Nullable String str) {
        this.f52214j = str;
        return this;
    }

    /* renamed from: c */
    public C20525ni m56152c() {
        this.f52206b = true;
        return this;
    }

    /* renamed from: a */
    public C20525ni m56159a(C20047hf c20047hf) {
        this.f52208d = c20047hf;
        return this;
    }

    /* renamed from: b */
    public C20525ni m56153b(boolean z) {
        this.f52213i = z;
        return this;
    }

    /* renamed from: c */
    public C20525ni m56151c(boolean z) {
        this.f52212h = z;
        return this;
    }

    /* renamed from: a */
    public C20525ni m56158a(String str) {
        this.f52209e = str;
        return this;
    }

    /* renamed from: b */
    public String m56155b() {
        String str = this.f52209e;
        if (str != null) {
            return str;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", this.f52205a);
            jSONObject.put("rewarded", this.f52206b);
        } catch (JSONException e) {
            C20086i9.m57997d().m58003a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        return (this.f52207c || this.f52212h) ? C21226xi.m54134a() : C21226xi.m54132a(jSONObject);
    }

    /* renamed from: a */
    public C20525ni m56157a(Map<String, String> map) {
        this.f52210f = map;
        return this;
    }

    /* renamed from: a */
    public C20525ni m56156a(boolean z) {
        this.f52207c = z;
        return this;
    }
}
