package sg.bigo.ads.controller.p949e;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.api.p903a.InterfaceC43530n;
import sg.bigo.ads.common.p912f.C43618b;
import sg.bigo.ads.controller.p949e.C44035g;
import sg.bigo.ads.core.p958c.C44136b;

/* renamed from: sg.bigo.ads.controller.e.h */
/* loaded from: classes10.dex */
public final class C44037h implements C43618b.InterfaceC43619a {

    /* renamed from: f */
    private static final C44037h f115528f = new C44037h();

    /* renamed from: h */
    private boolean f115535h;

    /* renamed from: i */
    private long f115536i;

    /* renamed from: j */
    private long f115537j;

    /* renamed from: a */
    public boolean f115529a = false;

    /* renamed from: b */
    long f115530b = 5000;

    /* renamed from: g */
    private long f115534g = 21600000;

    /* renamed from: c */
    long f115531c = 0;

    /* renamed from: d */
    long f115532d = 0;
    @NonNull

    /* renamed from: e */
    public final C44038a f115533e = new C44038a();

    /* renamed from: sg.bigo.ads.controller.e.h$a */
    /* loaded from: classes10.dex */
    public class C44038a {

        /* renamed from: a */
        final long f115538a = System.currentTimeMillis();

        /* renamed from: b */
        long f115539b = System.currentTimeMillis();

        /* renamed from: c */
        long f115540c = System.currentTimeMillis();

        public C44038a() {
        }

        /* renamed from: a */
        public final String m4101a(String str) {
            boolean z;
            int i;
            boolean z2;
            int i2;
            boolean z3;
            int i3;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("start_ts", Long.valueOf(this.f115540c));
                C44037h c44037h = C44037h.this;
                jSONObject.putOpt("total_duration", Long.valueOf(c44037h.f115531c + c44037h.m4102b()));
                C44037h c44037h2 = C44037h.this;
                long m4102b = c44037h2.m4102b();
                if (m4102b > c44037h2.f115530b) {
                    c44037h2.f115532d = m4102b;
                } else {
                    m4102b = c44037h2.f115532d;
                }
                jSONObject.putOpt("close_duration", Long.valueOf(m4102b));
                C44035g.C44036a m4110a = C44035g.m4111a().m4110a(str);
                z = C44035g.this.f115523c;
                if (z) {
                    i = m4110a.f115524a.getAndAdd(1);
                } else {
                    i = m4110a.f115524a.get();
                }
                jSONObject.putOpt("front_total_req_times", Long.valueOf(i));
                C44035g.C44036a m4110a2 = C44035g.m4111a().m4110a(str);
                z2 = C44035g.this.f115523c;
                if (!z2) {
                    i2 = m4110a2.f115525b.getAndAdd(1);
                } else {
                    i2 = m4110a2.f115525b.get();
                }
                jSONObject.putOpt("back_total_req_times", Long.valueOf(i2));
                C44035g.C44036a m4110a3 = C44035g.m4111a().m4110a(str);
                z3 = C44035g.this.f115523c;
                if (z3) {
                    i3 = m4110a3.f115526c.getAndAdd(1);
                } else {
                    i3 = m4110a3.f115526c.get();
                }
                jSONObject.putOpt("close_front_req_times", Long.valueOf(i3));
                jSONObject.putOpt("req_status", Long.valueOf(C44037h.m4104a(C44037h.this)));
            } catch (JSONException unused) {
            }
            return jSONObject.toString();
        }
    }

    private C44037h() {
        C43618b.m5305a().f114196d = this;
    }

    /* renamed from: a */
    static /* synthetic */ int m4104a(C44037h c44037h) {
        return c44037h.f115535h ? 1 : 2;
    }

    /* renamed from: b */
    final long m4102b() {
        long j = this.f115536i;
        if (j <= 0) {
            return 0L;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        if (elapsedRealtime <= 0 || elapsedRealtime <= this.f115530b) {
            return 0L;
        }
        return elapsedRealtime;
    }

    /* renamed from: a */
    public static C44037h m4107a() {
        return f115528f;
    }

    @Override // sg.bigo.ads.common.p912f.C43618b.InterfaceC43619a
    /* renamed from: a */
    public final void mo4106a(long j, long j2) {
        this.f115535h = true;
        this.f115536i = j;
        C44038a c44038a = this.f115533e;
        c44038a.f115539b = j2;
        long j3 = this.f115534g;
        if (j3 > 0) {
            long j4 = this.f115537j;
            if (j4 > 0 && j - j4 >= j3) {
                this.f115531c = 0L;
                this.f115532d = 0L;
                c44038a.f115540c = System.currentTimeMillis();
                C44035g.m4111a().f115522a.clear();
            }
        }
        C44038a c44038a2 = this.f115533e;
        if (c44038a2.f115540c == 0) {
            c44038a2.f115540c = System.currentTimeMillis();
        }
        C44035g.m4111a().m4108a(true);
    }

    /* renamed from: a */
    public final void m4105a(InterfaceC43530n interfaceC43530n) {
        this.f115529a = interfaceC43530n.mo5369a();
        this.f115530b = interfaceC43530n.mo5367b();
        this.f115534g = interfaceC43530n.mo5366c();
    }

    @Override // sg.bigo.ads.common.p912f.C43618b.InterfaceC43619a
    /* renamed from: a */
    public final void mo4103a(boolean z, long j, long j2, long j3) {
        this.f115535h = false;
        this.f115537j = j2;
        this.f115536i = 0L;
        long j4 = j2 - j;
        if (j4 > 0 && j4 > this.f115530b) {
            this.f115531c += j4;
            this.f115532d = j4;
            if (this.f115529a) {
                C44136b.m3907a(z ? 1 : 2, j3, j4);
            }
        }
        C44035g.m4111a().m4108a(false);
    }
}
