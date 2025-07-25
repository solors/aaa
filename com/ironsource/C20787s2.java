package com.ironsource;

/* renamed from: com.ironsource.s2 */
/* loaded from: classes6.dex */
public class C20787s2 extends C21189wp {

    /* renamed from: h */
    private static String f52842h = "type";

    /* renamed from: i */
    private static String f52843i = "numOfAdUnits";

    /* renamed from: j */
    private static String f52844j = "firstCampaignCredits";

    /* renamed from: k */
    private static String f52845k = "totalNumberCredits";

    /* renamed from: l */
    private static String f52846l = "productType";

    /* renamed from: b */
    private String f52847b;

    /* renamed from: c */
    private String f52848c;

    /* renamed from: d */
    private String f52849d;

    /* renamed from: e */
    private String f52850e;

    /* renamed from: f */
    private String f52851f;

    /* renamed from: g */
    private boolean f52852g;

    public C20787s2(String str) {
        super(str);
        boolean z;
        if (m54319a(f52842h)) {
            m55395k(m54308d(f52842h));
        }
        if (m54319a(f52843i)) {
            m55398h(m54308d(f52843i));
            z = true;
        } else {
            z = false;
        }
        m55406a(z);
        if (m54319a(f52844j)) {
            m55399g(m54308d(f52844j));
        }
        if (m54319a(f52845k)) {
            m55396j(m54308d(f52845k));
        }
        if (m54319a(f52846l)) {
            m55397i(m54308d(f52846l));
        }
    }

    /* renamed from: a */
    private void m55406a(boolean z) {
        this.f52852g = z;
    }

    /* renamed from: b */
    public String m55405b() {
        return this.f52850e;
    }

    /* renamed from: c */
    public String m55404c() {
        return this.f52849d;
    }

    /* renamed from: d */
    public String m55403d() {
        return this.f52848c;
    }

    /* renamed from: e */
    public String m55402e() {
        return this.f52851f;
    }

    /* renamed from: f */
    public String m55401f() {
        return this.f52847b;
    }

    /* renamed from: g */
    public void m55399g(String str) {
        this.f52850e = str;
    }

    /* renamed from: h */
    public void m55398h(String str) {
        this.f52849d = str;
    }

    /* renamed from: i */
    public void m55397i(String str) {
        this.f52848c = str;
    }

    /* renamed from: j */
    public void m55396j(String str) {
        this.f52851f = str;
    }

    /* renamed from: k */
    public void m55395k(String str) {
        this.f52847b = str;
    }

    /* renamed from: g */
    public boolean m55400g() {
        return this.f52852g;
    }
}
