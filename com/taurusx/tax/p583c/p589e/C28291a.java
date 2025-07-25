package com.taurusx.tax.p583c.p589e;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.common.primitives.SignedBytes;
import com.taurusx.tax.C28162a;
import com.taurusx.tax.p583c.p584a.C28265a;
import com.taurusx.tax.p583c.p584a.RunnableC28269b;
import com.taurusx.tax.p583c.p584a.RunnableC28270c;
import com.taurusx.tax.p583c.p584a.p585d.C28274d;
import com.taurusx.tax.p583c.p586b.C28276a;
import com.taurusx.tax.p583c.p587c.InterfaceC28281a;
import com.taurusx.tax.p583c.p590f.C28294c;
import org.json.JSONException;
import org.json.JSONObject;
import p692h2.StringFogImpl;

/* renamed from: com.taurusx.tax.c.e.a */
/* loaded from: classes7.dex */
public class C28291a {

    /* renamed from: m */
    public static final String f73476m = C28162a.f73047a.m23824a(new byte[]{98, 87, 82, 87, 96, 90, 95, 83, 84}, new byte[]{38, 54});

    /* renamed from: a */
    public Context f73477a;

    /* renamed from: b */
    public boolean f73478b;

    /* renamed from: c */
    public String f73479c;

    /* renamed from: d */
    public int f73480d;

    /* renamed from: e */
    public String f73481e;

    /* renamed from: f */
    public String f73482f;

    /* renamed from: g */
    public String f73483g;

    /* renamed from: h */
    public String f73484h;

    /* renamed from: i */
    public String f73485i;

    /* renamed from: j */
    public InterfaceC28281a f73486j;

    /* renamed from: k */
    public C28265a f73487k;

    /* renamed from: l */
    public C28276a f73488l;

    public C28291a(Context context) {
        C28294c.m38285a().m38284a(context);
        m38306f();
    }

    /* renamed from: a */
    public String m38315a() {
        return this.f73479c;
    }

    /* renamed from: b */
    public InterfaceC28281a m38311b() {
        return this.f73486j;
    }

    /* renamed from: c */
    public int m38309c() {
        return this.f73480d;
    }

    /* renamed from: d */
    public String m38308d() {
        return this.f73481e;
    }

    /* renamed from: e */
    public String m38307e() {
        return this.f73485i;
    }

    /* renamed from: f */
    public final void m38306f() {
        C28294c m38285a = C28294c.m38285a();
        StringFogImpl stringFogImpl = C28162a.f73047a;
        if (m38285a.m38283a(stringFogImpl.m23824a(new byte[]{79, -41, 91, -51, 93, -31, 69, -33, 92, -48, 74, -42, 118, -54, SignedBytes.MAX_POWER_OF_TWO, -45, 76}, new byte[]{41, -66})) == 0) {
            C28294c m38285a2 = C28294c.m38285a();
            String m23824a = stringFogImpl.m23824a(new byte[]{-2, -125, -22, -103, -20, -75, -12, -117, -19, -124, -5, -126, -57, -98, -15, -121, -3}, new byte[]{-104, -22});
            long currentTimeMillis = System.currentTimeMillis();
            m38285a2.getClass();
            try {
                SharedPreferences.Editor edit = m38285a2.m38282b().edit();
                edit.putLong(m23824a, currentTimeMillis);
                edit.commit();
            } catch (Error | Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public void m38312a(JSONObject jSONObject) {
        if (this.f73488l != null) {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                StringFogImpl stringFogImpl = C28162a.f73047a;
                jSONObject.put(stringFogImpl.m23824a(new byte[]{100, 102}, new byte[]{16, 21}), currentTimeMillis);
                jSONObject.put(stringFogImpl.m23824a(new byte[]{65, -98}, new byte[]{52, -19}), currentTimeMillis * 1000);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            C28276a c28276a = this.f73488l;
            String jSONObject2 = jSONObject.toString();
            C28265a c28265a = c28276a.f73453d;
            c28265a.getClass();
            if (TextUtils.isEmpty(jSONObject2)) {
                return;
            }
            c28265a.f73431b.execute(new RunnableC28269b(c28265a, jSONObject2));
        }
    }

    /* renamed from: b */
    public void m38310b(String str) {
        C28265a c28265a = this.f73487k;
        if (c28265a != null) {
            synchronized (c28265a) {
                C28274d c28274d = c28265a.f73433d;
                c28274d.f73446b.getReadableDatabase().delete(c28274d.f73448d, C28162a.f73047a.m23824a(new byte[]{-93, -107, -70, -103, -9, -64, -9, -61}, new byte[]{-41, -4}), new String[]{str});
            }
        }
    }

    /* renamed from: a */
    public void m38313a(String str, String str2) {
        C28265a c28265a = this.f73487k;
        if (c28265a == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        c28265a.f73431b.execute(new RunnableC28270c(c28265a, str, str2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0069, code lost:
        if (r5 != null) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0150 A[Catch: all -> 0x0154, TRY_ENTER, TryCatch #2 {, blocks: (B:57:0x0007, B:59:0x000c, B:83:0x0139, B:89:0x0150, B:90:0x0153), top: B:96:0x0007 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List<com.taurusx.tax.p583c.p584a.C28265a.C28267b> m38314a(java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taurusx.tax.p583c.p589e.C28291a.m38314a(java.lang.String):java.util.List");
    }
}
