package com.p552ot.pubsub.util;

import com.p552ot.pubsub.Configuration;
import com.p552ot.pubsub.PubSubTrack;
import com.p552ot.pubsub.p553a.C26484a;

/* renamed from: com.ot.pubsub.util.q */
/* loaded from: classes7.dex */
public class C26596q {

    /* renamed from: a */
    private static final String f69800a = "custom_open";

    /* renamed from: b */
    private static final String f69801b = "custom_close";

    /* renamed from: c */
    private static final String f69802c = "exprience_open";

    /* renamed from: d */
    private static final String f69803d = "exprience_close";

    /* renamed from: e */
    private static final String f69804e = "PrivacyManager";

    /* renamed from: k */
    private static final long f69805k = 900000;

    /* renamed from: f */
    private PubSubTrack.IEventHook f69806f;

    /* renamed from: g */
    private Configuration f69807g;

    /* renamed from: h */
    private boolean f69808h;

    /* renamed from: i */
    private boolean f69809i;

    /* renamed from: j */
    private long f69810j = 0;

    public C26596q(Configuration configuration) {
        this.f69807g = configuration;
        this.f69808h = C26599t.m40978d(C26591m.m41035a(configuration));
    }

    /* renamed from: b */
    private boolean m41009b(String str) {
        return "onetrack_dau".equals(str) || C26484a.f69224g.equals(str);
    }

    /* renamed from: c */
    private boolean m41008c(String str) {
        PubSubTrack.IEventHook iEventHook = this.f69806f;
        if (iEventHook != null && iEventHook.isRecommendEvent(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private boolean m41007d(String str) {
        PubSubTrack.IEventHook iEventHook = this.f69806f;
        if (iEventHook != null && iEventHook.isCustomDauEvent(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public boolean m41012a(String str) {
        boolean m41010b;
        if (this.f69807g.isUseCustomPrivacyPolicy()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("use custom privacy policy, the policy is ");
            sb2.append(this.f69808h ? "open" : "close");
            C26586j.m41080a(f69804e, sb2.toString());
            m41010b = this.f69808h;
        } else {
            m41010b = m41010b();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("use system experience plan, the policy is ");
            sb3.append(m41010b ? "open" : "close");
            C26586j.m41080a(f69804e, sb3.toString());
        }
        if (m41010b) {
            return m41010b;
        }
        boolean m41009b = m41009b(str);
        boolean m41008c = m41008c(str);
        boolean m41007d = m41007d(str);
        StringBuilder sb4 = new StringBuilder();
        sb4.append("This event ");
        sb4.append(str);
        sb4.append(m41009b ? " is " : " is not ");
        sb4.append("basic event and ");
        sb4.append(m41008c ? "is" : "is not");
        sb4.append(" recommend event and ");
        sb4.append(m41007d ? "is" : "is not");
        sb4.append(" custom dau event");
        C26586j.m41080a(f69804e, sb4.toString());
        return m41009b || m41008c || m41007d;
    }

    /* renamed from: b */
    private boolean m41010b() {
        if (Math.abs(System.currentTimeMillis() - this.f69810j) > 900000) {
            this.f69810j = System.currentTimeMillis();
            this.f69809i = C26590l.m41052a(C26577b.m41116b());
        }
        return this.f69809i;
    }

    /* renamed from: a */
    public void m41013a(PubSubTrack.IEventHook iEventHook) {
        this.f69806f = iEventHook;
    }

    /* renamed from: a */
    public void m41011a(boolean z) {
        this.f69808h = z;
    }

    /* renamed from: a */
    public String m41014a() {
        return this.f69807g.isUseCustomPrivacyPolicy() ? this.f69808h ? f69800a : f69801b : m41010b() ? f69802c : f69803d;
    }
}
