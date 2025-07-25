package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import com.yandex.mobile.ads.impl.di2;
import com.yandex.mobile.ads.impl.zh2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class b22 implements zh2.InterfaceC31993a {

    /* renamed from: h */
    private static b22 f77061h = new b22();

    /* renamed from: i */
    private static Handler f77062i = new Handler(Looper.getMainLooper());

    /* renamed from: j */
    private static Handler f77063j = null;

    /* renamed from: k */
    private static final Runnable f77064k = new RunnableC29984b();

    /* renamed from: l */
    private static final Runnable f77065l = new RunnableC29985c();

    /* renamed from: b */
    private int f77067b;

    /* renamed from: g */
    private long f77072g;

    /* renamed from: a */
    private ArrayList f77066a = new ArrayList();

    /* renamed from: c */
    private final ArrayList f77068c = new ArrayList();

    /* renamed from: e */
    private di2 f77070e = new di2();

    /* renamed from: d */
    private ji2 f77069d = new ji2();

    /* renamed from: f */
    private mi2 f77071f = new mi2(new ri2());

    /* renamed from: com.yandex.mobile.ads.impl.b22$a */
    /* loaded from: classes8.dex */
    public final class RunnableC29983a implements Runnable {
        RunnableC29983a() {
            b22.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            b22.this.f77071f.m31984a();
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.b22$b */
    /* loaded from: classes8.dex */
    static class RunnableC29984b implements Runnable {
        RunnableC29984b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            b22.m35676b(b22.m35671g());
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.b22$c */
    /* loaded from: classes8.dex */
    static class RunnableC29985c implements Runnable {
        RunnableC29985c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (b22.f77063j != null) {
                b22.f77063j.post(b22.f77064k);
                b22.f77063j.postDelayed(b22.f77065l, 200L);
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.b22$d */
    /* loaded from: classes8.dex */
    public interface InterfaceC29986d extends InterfaceC29987e {
        /* renamed from: a */
        void m35670a();
    }

    /* renamed from: com.yandex.mobile.ads.impl.b22$e */
    /* loaded from: classes8.dex */
    public interface InterfaceC29987e {
        /* renamed from: b */
        void m35669b();
    }

    b22() {
    }

    /* renamed from: c */
    public static void m35675c() {
        Handler handler = f77063j;
        if (handler != null) {
            handler.removeCallbacks(f77065l);
            f77063j = null;
        }
    }

    /* renamed from: g */
    public static b22 m35671g() {
        return f77061h;
    }

    /* renamed from: b */
    public final void m35677b() {
        m35675c();
        this.f77066a.clear();
        f77062i.post(new RunnableC29983a());
    }

    /* renamed from: a */
    public static void m35680a() {
        if (f77063j == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f77063j = handler;
            handler.post(f77064k);
            f77063j.postDelayed(f77065l, 200L);
        }
    }

    /* renamed from: b */
    static void m35676b(b22 b22Var) {
        b22Var.f77067b = 0;
        b22Var.f77068c.clear();
        for (xh2 xh2Var : yh2.m26905a().m26901c()) {
            xh2Var.getClass();
        }
        b22Var.f77072g = System.nanoTime();
        b22Var.f77070e.m34906c();
        long nanoTime = System.nanoTime();
        qi2 m32909a = b22Var.f77069d.m32909a();
        if (b22Var.f77070e.m34909b().size() > 0) {
            Iterator<String> it = b22Var.f77070e.m34909b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject mo26161a = m32909a.mo26161a(null);
                View m34907b = b22Var.f77070e.m34907b(next);
                ui2 m32908b = b22Var.f77069d.m32908b();
                String m34910a = b22Var.f77070e.m34910a(next);
                if (m34910a != null) {
                    JSONObject mo26161a2 = m32908b.mo26161a(m34907b);
                    try {
                        mo26161a2.put("adSessionId", next);
                    } catch (JSONException e) {
                        Log.e("OMIDLIB", "Error with setting ad session id", e);
                    }
                    try {
                        mo26161a2.put("notVisibleReason", m34910a);
                    } catch (JSONException e2) {
                        Log.e("OMIDLIB", "Error with setting not visible reason", e2);
                    }
                    ki2.m32539a(mo26161a, mo26161a2);
                }
                ki2.m32541a(mo26161a);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(next);
                b22Var.f77071f.m31980b(mo26161a, hashSet, nanoTime);
            }
        }
        if (b22Var.f77070e.m34912a().size() > 0) {
            JSONObject mo26161a3 = m32909a.mo26161a(null);
            m32909a.mo26160a(null, mo26161a3, b22Var, true, false);
            ki2.m32541a(mo26161a3);
            b22Var.f77071f.m31982a(mo26161a3, b22Var.f77070e.m34912a(), nanoTime);
        } else {
            b22Var.f77071f.m31984a();
        }
        b22Var.f77070e.m34904d();
        long nanoTime2 = System.nanoTime() - b22Var.f77072g;
        if (b22Var.f77066a.size() > 0) {
            Iterator it2 = b22Var.f77066a.iterator();
            while (it2.hasNext()) {
                InterfaceC29987e interfaceC29987e = (InterfaceC29987e) it2.next();
                TimeUnit.NANOSECONDS.toMillis(nanoTime2);
                interfaceC29987e.m35669b();
                if (interfaceC29987e instanceof InterfaceC29986d) {
                    ((InterfaceC29986d) interfaceC29987e).m35670a();
                }
            }
        }
    }

    /* renamed from: a */
    public final void m35679a(View view, zh2 zh2Var, JSONObject jSONObject, boolean z) {
        int m34905c;
        boolean z2;
        if (cj2.m35224c(view) != null || (m34905c = this.f77070e.m34905c(view)) == 3) {
            return;
        }
        JSONObject mo26161a = zh2Var.mo26161a(view);
        ki2.m32539a(jSONObject, mo26161a);
        Object m34911a = this.f77070e.m34911a(view);
        if (m34911a != null) {
            try {
                mo26161a.put("adSessionId", m34911a);
            } catch (JSONException e) {
                Log.e("OMIDLIB", "Error with setting ad session id", e);
            }
            try {
                mo26161a.put("hasWindowFocus", Boolean.valueOf(this.f77070e.m34903d(view)));
            } catch (JSONException e2) {
                Log.e("OMIDLIB", "Error with setting not visible reason", e2);
            }
            this.f77070e.m34902e();
        } else {
            di2.C30169a m34908b = this.f77070e.m34908b(view);
            if (m34908b != null) {
                pi2 m34901a = m34908b.m34901a();
                JSONArray jSONArray = new JSONArray();
                Iterator<String> it = m34908b.m34899b().iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next());
                }
                try {
                    mo26161a.put("isFriendlyObstructionFor", jSONArray);
                    mo26161a.put("friendlyObstructionClass", m34901a.m30649b());
                    mo26161a.put("friendlyObstructionPurpose", m34901a.m30648c());
                    mo26161a.put("friendlyObstructionReason", m34901a.m30647d());
                } catch (JSONException e3) {
                    Log.e("OMIDLIB", "Error with setting friendly obstruction", e3);
                }
                z2 = true;
            } else {
                z2 = false;
            }
            zh2Var.mo26160a(view, mo26161a, this, m34905c == 1, z || z2);
        }
        this.f77067b++;
    }
}
