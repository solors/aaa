package p028b5;

import android.text.TextUtils;
import java.util.Locale;

/* renamed from: b5.d */
/* loaded from: classes6.dex */
public class UserTagAdData {

    /* renamed from: a */
    private double f1593a;

    /* renamed from: b */
    private String f1594b;

    /* renamed from: c */
    private String f1595c;

    /* renamed from: d */
    private String f1596d;

    /* renamed from: e */
    private String f1597e;

    /* renamed from: f */
    private String f1598f;

    /* renamed from: a */
    public String m103919a() {
        return m103916d(this.f1597e);
    }

    /* renamed from: b */
    public String m103918b() {
        return m103916d(this.f1596d);
    }

    /* renamed from: c */
    public double m103917c() {
        return this.f1593a;
    }

    /* renamed from: d */
    String m103916d(String str) {
        if (TextUtils.isEmpty(str)) {
            return "void";
        }
        return str;
    }

    /* renamed from: e */
    public boolean m103915e() {
        if (TextUtils.equals(m103919a().toLowerCase(Locale.US), "interstitial") && m103917c() > 0.0d) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public void m103914f(String str) {
        this.f1597e = str;
    }

    /* renamed from: g */
    public void m103913g(String str) {
        this.f1595c = str;
    }

    /* renamed from: h */
    public void m103912h(String str) {
        this.f1596d = str;
    }

    /* renamed from: i */
    public void m103911i(String str) {
        this.f1598f = str;
    }

    /* renamed from: j */
    public void m103910j(String str) {
        this.f1594b = str;
    }

    /* renamed from: k */
    public void m103909k(double d) {
        this.f1593a = d;
    }
}
