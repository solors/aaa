package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.C10127p9;
import com.chartboost.sdk.privacy.model.COPPA;
import com.chartboost.sdk.privacy.model.DataUseConsent;
import com.chartboost.sdk.privacy.model.GDPR;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.chartboost.sdk.impl.m8 */
/* loaded from: classes3.dex */
public class C10050m8 {

    /* renamed from: a */
    public final InterfaceC10191s8 f22616a;

    /* renamed from: b */
    public final C9999k5 f22617b;

    /* renamed from: c */
    public final C10355x8 f22618c;

    /* renamed from: d */
    public final C10019l5 f22619d;

    /* renamed from: e */
    public final C10046m5 f22620e;

    /* renamed from: f */
    public final C10410z9 f22621f;

    /* renamed from: g */
    public final C9977j5 f22622g;

    /* renamed from: h */
    public final String f22623h;

    /* renamed from: i */
    public C10127p9.C10129b f22624i;

    public C10050m8(InterfaceC10191s8 interfaceC10191s8, C9999k5 c9999k5, C10355x8 c10355x8, C10019l5 c10019l5, C10046m5 c10046m5, C10410z9 c10410z9, C9977j5 c9977j5, String str) {
        this.f22616a = interfaceC10191s8;
        this.f22617b = c9999k5;
        this.f22618c = c10355x8;
        this.f22619d = c10019l5;
        this.f22620e = c10046m5;
        this.f22621f = c10410z9;
        this.f22622g = c9977j5;
        this.f22623h = str;
    }

    /* renamed from: a */
    public int m81095a() {
        return m81088d().equals(GDPR.GDPR_CONSENT.BEHAVIORAL.getValue()) ? 1 : 0;
    }

    /* renamed from: b */
    public Integer m81091b() {
        COPPA coppa = (COPPA) m81092a("coppa");
        if (coppa != null) {
            if (coppa.getConsent().booleanValue()) {
                return 1;
            }
            return 0;
        }
        return null;
    }

    /* renamed from: c */
    public int m81089c() {
        return !m81088d().equals("-1");
    }

    /* renamed from: d */
    public String m81088d() {
        DataUseConsent m81225a = this.f22617b.m81225a("gdpr");
        if (m81225a == null) {
            return "-1";
        }
        return (String) m81225a.getConsent();
    }

    /* renamed from: e */
    public JSONObject m81087e() {
        List m81086f = m81086f();
        C10019l5 c10019l5 = this.f22619d;
        if (c10019l5 != null && m81086f != null) {
            return c10019l5.m81178a(m81086f);
        }
        return null;
    }

    /* renamed from: f */
    public List m81086f() {
        C10127p9.C10129b c10129b;
        C10046m5 c10046m5 = this.f22620e;
        if (c10046m5 != null && (c10129b = this.f22624i) != null) {
            return c10046m5.m81105a(c10129b);
        }
        return null;
    }

    /* renamed from: g */
    public C10066n8 m81085g() {
        return new C10066n8(Integer.valueOf(m81095a()), m81086f(), Integer.valueOf(m81089c()), m81091b(), m81087e(), m81088d(), this.f22621f.m79790a(), this.f22622g.m81304b(), this.f22622g.m81305a());
    }

    /* renamed from: a */
    public DataUseConsent m81092a(String str) {
        C9999k5 c9999k5 = this.f22617b;
        if (c9999k5 != null) {
            return c9999k5.m81225a(str);
        }
        return null;
    }

    /* renamed from: a */
    public void m81093a(DataUseConsent dataUseConsent) {
        InterfaceC10191s8 interfaceC10191s8 = this.f22616a;
        if (interfaceC10191s8 != null) {
            interfaceC10191s8.mo80528a(dataUseConsent);
        }
    }

    /* renamed from: b */
    public void m81090b(String str) {
        C10355x8 c10355x8 = this.f22618c;
        if (c10355x8 != null) {
            c10355x8.m80068a(str);
        }
    }

    /* renamed from: a */
    public void m81094a(C10127p9.C10129b c10129b) {
        this.f22624i = c10129b;
    }
}
