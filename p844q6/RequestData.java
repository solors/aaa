package p844q6;

import android.text.TextUtils;

/* renamed from: q6.b */
/* loaded from: classes5.dex */
public class RequestData {

    /* renamed from: a */
    private String f103457a;

    /* renamed from: b */
    private String f103458b;

    /* renamed from: c */
    private String f103459c;

    /* renamed from: d */
    private String f103460d;

    /* renamed from: e */
    private String f103461e;

    /* renamed from: f */
    private String f103462f;

    /* renamed from: g */
    private String f103463g = "Android";

    /* renamed from: h */
    private String f103464h;

    /* renamed from: i */
    private String f103465i;

    /* renamed from: j */
    private String f103466j;

    /* renamed from: k */
    private String f103467k;

    /* renamed from: l */
    private String f103468l;

    /* renamed from: a */
    public boolean m12909a() {
        if (TextUtils.isEmpty(this.f103457a)) {
            return false;
        }
        return !TextUtils.isEmpty(this.f103464h);
    }

    /* renamed from: b */
    public String m12908b() {
        return this.f103466j;
    }

    /* renamed from: c */
    public String m12907c() {
        return this.f103459c;
    }

    /* renamed from: d */
    public String m12906d() {
        return this.f103458b;
    }

    /* renamed from: e */
    public String m12905e() {
        return this.f103462f;
    }

    /* renamed from: f */
    public String m12904f() {
        return this.f103457a;
    }

    /* renamed from: g */
    public String m12903g() {
        return this.f103468l;
    }

    /* renamed from: h */
    public String m12902h() {
        return this.f103463g;
    }

    /* renamed from: i */
    public String m12901i() {
        return this.f103465i;
    }

    /* renamed from: j */
    public String m12900j() {
        return this.f103460d;
    }

    /* renamed from: k */
    public String m12899k() {
        return this.f103467k;
    }

    /* renamed from: l */
    public String m12898l() {
        return this.f103461e;
    }

    /* renamed from: m */
    public String m12897m() {
        return this.f103464h;
    }

    /* renamed from: n */
    public void m12896n(String str) {
        this.f103466j = str;
    }

    /* renamed from: o */
    public void m12895o(String str) {
        this.f103459c = str;
    }

    /* renamed from: p */
    public void m12894p(String str) {
        this.f103458b = str;
    }

    /* renamed from: q */
    public void m12893q(String str) {
        this.f103462f = str;
    }

    /* renamed from: r */
    public void m12892r(String str) {
        this.f103457a = str;
    }

    /* renamed from: s */
    public void m12891s(String str) {
        this.f103468l = str;
    }

    /* renamed from: t */
    public void m12890t(String str) {
        this.f103465i = str;
    }

    public String toString() {
        return "RequestData{luid='" + this.f103457a + "', country='" + this.f103458b + "', appVersion='" + this.f103459c + "', sdkVersion='" + this.f103460d + "', timeZone='" + this.f103461e + "', lan='" + this.f103462f + "', token='" + this.f103464h + "', platform='" + this.f103463g + "', productionId='" + this.f103465i + "', apiKey='" + this.f103466j + "', secret='" + this.f103467k + "'}";
    }

    /* renamed from: u */
    public void m12889u(String str) {
        this.f103460d = str;
    }

    /* renamed from: v */
    public void m12888v(String str) {
        this.f103467k = str;
    }

    /* renamed from: w */
    public void m12887w(String str) {
        this.f103461e = str;
    }

    /* renamed from: x */
    public void m12886x(String str) {
        this.f103464h = str;
    }
}
