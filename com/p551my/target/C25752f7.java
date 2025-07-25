package com.p551my.target;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.my.target.f7 */
/* loaded from: classes7.dex */
public class C25752f7 extends AbstractC26019q {

    /* renamed from: b */
    public final String f66838b;

    /* renamed from: c */
    public final ArrayList f66839c = new ArrayList();

    /* renamed from: d */
    public final ArrayList f66840d = new ArrayList();

    /* renamed from: e */
    public JSONObject f66841e;

    /* renamed from: f */
    public boolean f66842f;

    /* renamed from: g */
    public String f66843g;

    /* renamed from: h */
    public String f66844h;

    /* renamed from: i */
    public String f66845i;

    /* renamed from: j */
    public String f66846j;

    /* renamed from: k */
    public String f66847k;

    /* renamed from: l */
    public String f66848l;

    public C25752f7(String str) {
        this.f66838b = str;
    }

    /* renamed from: b */
    public static C25752f7 m43926b(String str) {
        return new C25752f7(str);
    }

    /* renamed from: a */
    public void m43930a(C26272z6 c26272z6) {
        this.f66839c.add(c26272z6);
    }

    /* renamed from: c */
    public List m43925c() {
        return new ArrayList(this.f66839c);
    }

    /* renamed from: d */
    public String m43923d() {
        return this.f66845i;
    }

    /* renamed from: e */
    public String m43921e() {
        return this.f66847k;
    }

    /* renamed from: f */
    public String m43919f() {
        return this.f66844h;
    }

    /* renamed from: g */
    public String m43917g() {
        return this.f66848l;
    }

    /* renamed from: h */
    public String m43915h() {
        return this.f66846j;
    }

    /* renamed from: i */
    public String m43913i() {
        return this.f66838b;
    }

    /* renamed from: j */
    public JSONObject m43912j() {
        return this.f66841e;
    }

    /* renamed from: k */
    public ArrayList m43911k() {
        return this.f66840d;
    }

    /* renamed from: l */
    public String m43910l() {
        return this.f66843g;
    }

    /* renamed from: m */
    public boolean m43909m() {
        return this.f66842f;
    }

    @Override // com.p551my.target.AbstractC26019q
    /* renamed from: a */
    public int mo42296a() {
        return this.f66839c.size();
    }

    /* renamed from: c */
    public void m43924c(String str) {
        this.f66845i = str;
    }

    /* renamed from: d */
    public void m43922d(String str) {
        this.f66847k = str;
    }

    /* renamed from: e */
    public void m43920e(String str) {
        this.f66844h = str;
    }

    /* renamed from: f */
    public void m43918f(String str) {
        this.f66848l = str;
    }

    /* renamed from: g */
    public void m43916g(String str) {
        this.f66846j = str;
    }

    /* renamed from: h */
    public void m43914h(String str) {
        this.f66843g = str;
    }

    /* renamed from: a */
    public String m43929a(String str) {
        Iterator it = this.f66840d.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            if (str.equals(pair.first)) {
                return (String) pair.second;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void m43927a(boolean z) {
        this.f66842f = z;
    }

    /* renamed from: a */
    public void m43928a(JSONObject jSONObject) {
        this.f66841e = jSONObject;
    }
}
