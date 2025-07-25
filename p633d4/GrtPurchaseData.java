package p633d4;

import android.text.TextUtils;

/* renamed from: d4.g */
/* loaded from: classes6.dex */
public class GrtPurchaseData {

    /* renamed from: a */
    private double f89524a;

    /* renamed from: b */
    private String f89525b;

    /* renamed from: a */
    public String m25732a() {
        return m25731b(this.f89525b);
    }

    /* renamed from: b */
    String m25731b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "void";
        }
        return str;
    }

    /* renamed from: c */
    public double m25730c() {
        return this.f89524a;
    }

    /* renamed from: d */
    public void m25729d(String str) {
        this.f89525b = str;
    }

    /* renamed from: e */
    public void m25728e(double d) {
        this.f89524a = d;
    }
}
