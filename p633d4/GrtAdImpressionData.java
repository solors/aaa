package p633d4;

import android.text.TextUtils;

/* renamed from: d4.f */
/* loaded from: classes6.dex */
public class GrtAdImpressionData {

    /* renamed from: a */
    private double f89518a;

    /* renamed from: b */
    private String f89519b;

    /* renamed from: c */
    private String f89520c;

    /* renamed from: d */
    private String f89521d;

    /* renamed from: e */
    private String f89522e;

    /* renamed from: f */
    private String f89523f;

    /* renamed from: a */
    public String m25745a() {
        return m25741e(this.f89522e);
    }

    /* renamed from: b */
    public String m25744b() {
        return m25741e(this.f89520c);
    }

    /* renamed from: c */
    public String m25743c() {
        return m25741e(this.f89521d);
    }

    /* renamed from: d */
    public String m25742d() {
        return m25741e(this.f89523f);
    }

    /* renamed from: e */
    String m25741e(String str) {
        if (TextUtils.isEmpty(str)) {
            return "void";
        }
        return str;
    }

    /* renamed from: f */
    public double m25740f() {
        return this.f89518a;
    }

    /* renamed from: g */
    public boolean m25739g() {
        return TextUtils.equals(m25745a().toLowerCase(), "banner");
    }

    /* renamed from: h */
    public void m25738h(String str) {
        this.f89522e = str;
    }

    /* renamed from: i */
    public void m25737i(String str) {
        this.f89520c = str;
    }

    /* renamed from: j */
    public void m25736j(String str) {
        this.f89521d = str;
    }

    /* renamed from: k */
    public void m25735k(String str) {
        this.f89523f = str;
    }

    /* renamed from: l */
    public void m25734l(String str) {
        this.f89519b = str;
    }

    /* renamed from: m */
    public void m25733m(double d) {
        this.f89518a = d;
    }
}
