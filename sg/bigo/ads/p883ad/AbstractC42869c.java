package sg.bigo.ads.p883ad;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.share.internal.ShareConstants;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import java.lang.ref.WeakReference;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import net.pubnative.lite.sdk.analytics.Reporting;
import sg.bigo.ads.api.AdActivity;
import sg.bigo.ads.api.AdBid;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.AdInteractionListener;
import sg.bigo.ads.api.InterfaceC43501Ad;
import sg.bigo.ads.api.core.C43558e;
import sg.bigo.ads.api.core.C43562g;
import sg.bigo.ads.api.core.C43579q;
import sg.bigo.ads.api.core.InterfaceC43550c;
import sg.bigo.ads.api.p903a.C43525i;
import sg.bigo.ads.api.p904b.AbstractC43534a;
import sg.bigo.ads.api.p904b.InterfaceC43538d;
import sg.bigo.ads.common.C43705i;
import sg.bigo.ads.common.form.C43634a;
import sg.bigo.ads.common.p912f.C43617a;
import sg.bigo.ads.common.p912f.C43620c;
import sg.bigo.ads.common.p926n.C43727d;
import sg.bigo.ads.common.p932t.C43782a;
import sg.bigo.ads.common.p937v.C43847a;
import sg.bigo.ads.common.utils.C43836q;
import sg.bigo.ads.controller.landing.C44063a;
import sg.bigo.ads.controller.landing.LandingPageStyleConfig;
import sg.bigo.ads.core.landing.C44230a;
import sg.bigo.ads.core.p953a.C44091a;
import sg.bigo.ads.core.p953a.C44093b;
import sg.bigo.ads.core.p958c.C44136b;
import sg.bigo.ads.core.p962d.p963a.C44156a;
import sg.bigo.ads.core.p962d.p963a.C44172d;
import sg.bigo.ads.p881a.C42775c;
import sg.bigo.ads.p883ad.C42779a;

/* renamed from: sg.bigo.ads.ad.c */
/* loaded from: classes10.dex */
public abstract class AbstractC42869c<T extends InterfaceC43501Ad, U extends InterfaceC43550c> extends AbstractC43534a<T, U> implements C43620c.InterfaceC43631a {

    /* renamed from: A */
    private final Set<String> f112242A;

    /* renamed from: B */
    private final Map<String, Object> f112243B;
    @Nullable

    /* renamed from: a */
    protected AdInteractionListener f112244a;
    @NonNull

    /* renamed from: b */
    public C43562g f112245b;
    @Nullable

    /* renamed from: c */
    protected View f112246c;
    @NonNull

    /* renamed from: d */
    public C44156a f112247d;

    /* renamed from: e */
    public boolean f112248e;

    /* renamed from: f */
    public boolean f112249f;

    /* renamed from: g */
    boolean f112250g;

    /* renamed from: h */
    public boolean f112251h;

    /* renamed from: i */
    public boolean f112252i;

    /* renamed from: j */
    public long f112253j;

    /* renamed from: k */
    public C44063a f112254k;

    /* renamed from: l */
    protected int f112255l;

    /* renamed from: m */
    protected int f112256m;

    /* renamed from: n */
    public int f112257n;

    /* renamed from: o */
    public int f112258o;

    /* renamed from: p */
    public long f112259p;

    /* renamed from: q */
    public long f112260q;
    @Nullable

    /* renamed from: r */
    public WeakReference<InterfaceC42870a> f112261r;

    /* renamed from: s */
    private boolean f112262s;

    /* renamed from: t */
    private boolean f112263t;

    /* renamed from: u */
    private boolean f112264u;

    /* renamed from: v */
    private boolean f112265v;

    /* renamed from: w */
    private long f112266w;

    /* renamed from: x */
    private long f112267x;

    /* renamed from: y */
    private AdBid f112268y;

    /* renamed from: z */
    private final Set<String> f112269z;

    /* renamed from: sg.bigo.ads.ad.c$a */
    /* loaded from: classes10.dex */
    public interface InterfaceC42870a {
        /* renamed from: a */
        LandingPageStyleConfig mo5672a(Context context, String str, int i, boolean z);

        /* renamed from: a */
        boolean mo6298a();
    }

    public AbstractC42869c(@NonNull C43562g c43562g) {
        super(c43562g.f114092c);
        this.f112248e = false;
        this.f112262s = false;
        this.f112249f = false;
        this.f112263t = false;
        this.f112264u = false;
        this.f112265v = false;
        this.f112250g = false;
        this.f112251h = false;
        this.f112252i = false;
        this.f112269z = new HashSet();
        this.f112242A = new HashSet();
        this.f112258o = -1;
        this.f112259p = 0L;
        this.f112260q = 0L;
        this.f112243B = new HashMap();
        this.f112245b = c43562g;
        m6439x();
        m6438y();
        this.f114061N = new C43847a();
    }

    /* renamed from: A */
    private long m6464A() {
        InterfaceC43550c.InterfaceC43551a mo4392O = this.f112245b.f114090a.mo4392O();
        if (mo4392O != null) {
            return mo4392O.mo4312b();
        }
        return 0L;
    }

    /* renamed from: x */
    private void m6439x() {
        InterfaceC43550c interfaceC43550c = this.f112245b.f114090a;
        C43579q mo4489l = C43525i.f114036a.mo4489l();
        InterfaceC43550c.InterfaceC43556f[] mo4404C = interfaceC43550c.mo4404C();
        C44172d[] c44172dArr = new C44172d[0];
        if (mo4404C != null && mo4404C.length > 0) {
            c44172dArr = new C44172d[mo4404C.length];
            for (int i = 0; i < mo4404C.length; i++) {
                c44172dArr[i] = new C44172d(mo4404C[i].mo4206a(), this.f112245b.f114093d);
            }
        }
        InterfaceC43550c.InterfaceC43556f[] mo4403D = interfaceC43550c.mo4403D();
        C44172d[] c44172dArr2 = new C44172d[0];
        if (mo4403D != null && mo4403D.length > 0) {
            c44172dArr2 = new C44172d[mo4403D.length];
            for (int i2 = 0; i2 < mo4403D.length; i2++) {
                c44172dArr2[i2] = new C44172d(mo4403D[i2].mo4206a(), this.f112245b.f114093d);
            }
        }
        InterfaceC43550c.InterfaceC43556f[] mo4402E = interfaceC43550c.mo4402E();
        C44172d[] c44172dArr3 = new C44172d[0];
        if (mo4402E != null && mo4402E.length > 0) {
            c44172dArr3 = new C44172d[mo4402E.length];
            for (int i3 = 0; i3 < mo4402E.length; i3++) {
                c44172dArr3[i3] = new C44172d(mo4402E[i3].mo4206a(), this.f112245b.f114093d);
            }
        }
        InterfaceC43550c.InterfaceC43556f[] mo4401F = interfaceC43550c.mo4401F();
        C44172d[] c44172dArr4 = new C44172d[0];
        if (mo4401F != null && mo4401F.length > 0) {
            c44172dArr4 = new C44172d[mo4401F.length];
            for (int i4 = 0; i4 < mo4401F.length; i4++) {
                c44172dArr4[i4] = new C44172d(mo4401F[i4].mo4206a(), this.f112245b.f114093d);
            }
        }
        C44156a c44156a = new C44156a(mo4489l, c44172dArr, c44172dArr2, c44172dArr3, c44172dArr4, C44136b.m3844c(this.f112245b.f114090a, this));
        this.f112247d = c44156a;
        c44156a.m3791b("express_id", interfaceC43550c.mo4369ab());
    }

    /* renamed from: y */
    private void m6438y() {
        this.f112248e = false;
        this.f112262s = false;
        this.f112249f = false;
        this.f112263t = false;
        this.f112264u = false;
        this.f112265v = false;
        this.f112250g = false;
        this.f112251h = false;
        this.f112266w = 0L;
        this.f112253j = 0L;
        this.f112268y = null;
        this.f112252i = false;
        this.f114064Q = 0;
    }

    /* renamed from: z */
    private int m6437z() {
        InterfaceC43550c.InterfaceC43551a mo4392O = this.f112245b.f114090a.mo4392O();
        if (mo4392O != null) {
            return mo4392O.mo4313a();
        }
        return 0;
    }

    /* renamed from: a */
    public void mo6397a() {
        m6439x();
        m6438y();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a_ */
    public final void m6456a_() {
        if (!isExpired() && !this.f112251h && !this.f112265v) {
            this.f112265v = true;
            this.f112266w = SystemClock.elapsedRealtime();
            mo5821h();
            AdInteractionListener adInteractionListener = this.f112244a;
            if (adInteractionListener != null) {
                adInteractionListener.onAdImpression();
            }
        }
    }

    @NonNull
    /* renamed from: b */
    public <ValueType> ValueType mo5515b(String str, ValueType valuetype) {
        ValueType valuetype2 = (ValueType) this.f112243B.get(str);
        return valuetype2 != null ? valuetype2 : valuetype;
    }

    @Override // sg.bigo.ads.api.p904b.AbstractC43534a
    /* renamed from: c */
    public final void mo5442c() {
        if (this.f112248e) {
            return;
        }
        this.f112248e = true;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f112253j = elapsedRealtime;
        AbstractC43534a abstractC43534a = this.f114063P;
        if (abstractC43534a instanceof AbstractC42869c) {
            ((AbstractC42869c) abstractC43534a).f112253j = elapsedRealtime;
        }
        if (this.f112245b.f114090a.mo4363ah()) {
            return;
        }
        m6449d("filled");
        if (this.f112245b.f114090a.mo4393N().mo4289k() == 1) {
            mo5729s();
        }
        if (this.f112245b.f114090a.mo4393N().mo4297c() == 2) {
            C42775c.m6608a(C43617a.f114190a);
        }
        C43620c.m5300a(this);
    }

    @Override // sg.bigo.ads.api.p904b.AbstractC43534a
    /* renamed from: d */
    public final String mo6450d() {
        return mo5439f().mo4399H();
    }

    @Override // sg.bigo.ads.api.InterfaceC43501Ad
    @CallSuper
    public void destroy() {
        this.f112251h = true;
        C44063a c44063a = this.f112254k;
        if (c44063a != null) {
            c44063a.m4060a();
        }
        if (this.f112252i) {
            C43634a.m5289a(mo5439f().hashCode(), 4);
        }
        C43634a.m5283b(mo5439f().hashCode());
        setAdInteractionListener(null);
        C43620c.m5297b(this);
        C43782a.m5010a(0, 3, "Ad", "Ad was destroyed.");
    }

    @Override // sg.bigo.ads.api.p904b.AbstractC43534a
    /* renamed from: e */
    public final long mo5440e() {
        return mo5439f().mo4380a();
    }

    @Override // sg.bigo.ads.api.p904b.AbstractC43534a
    @NonNull
    /* renamed from: f */
    public U mo5439f() {
        return (U) this.f112245b.f114090a;
    }

    @Override // sg.bigo.ads.api.InterfaceC43501Ad
    @Nullable
    public AdBid getBid() {
        C42779a.C42780a c42780a;
        if (this.f112268y == null) {
            C43562g c43562g = this.f112245b;
            InterfaceC43550c interfaceC43550c = c43562g.f114090a;
            C44156a c44156a = this.f112247d;
            if (interfaceC43550c.mo4360ak()) {
                c42780a = new C42779a.C42780a(c43562g, interfaceC43550c, c44156a);
            } else {
                c42780a = null;
            }
            this.f112268y = c42780a;
        }
        return this.f112268y;
    }

    @Override // sg.bigo.ads.api.InterfaceC43501Ad
    @Nullable
    public String getExtraInfo(String str) {
        InterfaceC43550c interfaceC43550c;
        C43562g c43562g = this.f112245b;
        if (c43562g != null) {
            interfaceC43550c = c43562g.f114090a;
        } else {
            interfaceC43550c = null;
        }
        if (interfaceC43550c != null) {
            return interfaceC43550c.mo4349b(str);
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public void mo5821h() {
        boolean z;
        int i;
        mo5820l();
        int i2 = this.f114062O;
        int i3 = C43847a.f114698e;
        if (i2 != i3) {
            C43847a c43847a = this.f114061N;
            View view = this.f112246c;
            if (c43847a.f114700g == i3) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C43782a.m5010a(0, 4, "OutAppChecker", "Out app status: 4 - start activity from background");
                i = C43847a.f114698e;
            } else if (C43847a.m4789a(view)) {
                C43782a.m5010a(0, 4, "OutAppChecker", "Out app status: 5 - Lock screen");
                i = C43847a.f114699f;
            } else if (C43847a.m4788b(view)) {
                C43782a.m5010a(0, 4, "OutAppChecker", "Out app status: 3 - Float window");
                i = C43847a.f114697d;
            } else {
                C43782a.m5010a(0, 4, "OutAppChecker", "Out app status: 1 - not outside app");
                i = C43847a.f114695b;
            }
            this.f114062O = i;
        }
        this.f112247d.m3799a(this.f114062O);
        final C44156a c44156a = this.f112247d;
        C43727d.m5108a(1, new Runnable() { // from class: sg.bigo.ads.core.d.a.a.2

            /* renamed from: a */
            final /* synthetic */ boolean f115883a = false;

            @Override // java.lang.Runnable
            public final void run() {
                c44156a.m3792a(this.f115883a);
            }
        });
        if (m6461a("06002010")) {
            C44136b.m3885a(this, (String) mo5515b("show_proportion", ""), mo6448i(), ((Integer) mo5515b("render_style", 0)).intValue(), m6441u(), ((Long) mo5515b("attach_render_cost", -1L)).longValue(), SystemClock.elapsedRealtime() - this.f112253j, ((Integer) mo5515b("icon_sta", -1)).intValue(), ((Integer) mo5515b("img_sta", -1)).intValue(), ((Integer) mo5515b("vid_sta", -1)).intValue());
        }
        if (this.f112245b.f114090a.mo4393N().mo4289k() == 0) {
            mo5729s();
        }
    }

    /* renamed from: i */
    public String mo6448i() {
        if (this.f112246c == null) {
            return "";
        }
        return this.f112246c.getWidth() + "x" + this.f112246c.getHeight();
    }

    @Override // sg.bigo.ads.api.InterfaceC43501Ad
    public boolean isExpired() {
        return this.f112245b.f114090a.mo4397J();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: j */
    public final void m6447j() {
        AdInteractionListener adInteractionListener = this.f112244a;
        if (adInteractionListener != null) {
            adInteractionListener.onAdOpened();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @CallSuper
    /* renamed from: k */
    public void mo6390k() {
        AdInteractionListener adInteractionListener = this.f112244a;
        if (adInteractionListener != null) {
            adInteractionListener.onAdClosed();
        }
        this.f112250g = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l */
    public void mo5820l() {
        m6449d("impression");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m */
    public void mo5819m() {
        m6449d(Reporting.EventType.VIDEO_AD_CLICKED);
    }

    /* renamed from: n */
    public boolean mo5730n() {
        return this.f112265v;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o */
    public final int m6446o() {
        return this.f112245b.f114091b.mo4438b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: p */
    public final int m6445p() {
        return this.f112245b.f114090a.mo4327w();
    }

    /* renamed from: q */
    public final int m6444q() {
        if (this.f112260q != mo5439f().mo4325y()) {
            return -1;
        }
        return this.f112258o;
    }

    /* renamed from: r */
    public final long m6443r() {
        if (this.f112260q != mo5439f().mo4325y()) {
            return 0L;
        }
        return this.f112259p;
    }

    /* renamed from: s */
    public void mo5729s() {
        if (this.f112245b.f114090a.mo4393N().mo4294f() > 0) {
            final C44063a c44063a = new C44063a(this.f112245b.f114090a);
            this.f112254k = c44063a;
            final String mo4301a = c44063a.f115597b.mo4301a();
            final String mo4290j = c44063a.f115597b.mo4290j();
            final int mo4297c = c44063a.f115597b.mo4297c();
            int i = c44063a.f115598c;
            if (((i != 4 && i != 5) || !TextUtils.isEmpty(mo4290j)) && !C44230a.m3574a(mo4301a) && !TextUtils.isEmpty(mo4301a) && mo4301a.startsWith("http")) {
                if (mo4297c == 0 || mo4297c == 2) {
                    final C44063a.InterfaceC44069a interfaceC44069a = new C44063a.InterfaceC44069a() { // from class: sg.bigo.ads.controller.landing.a.3
                        @Override // sg.bigo.ads.controller.landing.C44063a.InterfaceC44069a
                        /* renamed from: a */
                        public final void mo4056a(String str) {
                            C43782a.m5010a(0, 3, "Preload", "preloadWebView onStart preloadType = " + C44063a.this.f115598c + ", url = " + str);
                        }

                        @Override // sg.bigo.ads.controller.landing.C44063a.InterfaceC44069a
                        /* renamed from: a */
                        public final void mo4055a(String str, long j, boolean z, int i2) {
                            C44063a.this.f115599d = z;
                            HashMap hashMap = new HashMap();
                            hashMap.put("land_way", String.valueOf(i2));
                            C44136b.m3862a(C44063a.this.f115596a, "preload_cost", j, z ? 1 : 0, hashMap);
                            C43782a.m5010a(0, 3, "Preload", "preload landing page onComplete preloadType=" + C44063a.this.f115598c + ", success = " + z + ", cost = " + j + ", url = " + str);
                            if (z) {
                                return;
                            }
                            C44063a.this.m4060a();
                        }
                    };
                    C43727d.m5108a(2, new Runnable() { // from class: sg.bigo.ads.controller.landing.a.4
                        @Override // java.lang.Runnable
                        public final void run() {
                            C44063a c44063a2 = C44063a.this;
                            int i2 = c44063a2.f115598c;
                            if (i2 != 1) {
                                if (i2 == 4 || i2 == 5) {
                                    C44063a.m4058a(c44063a2, mo4290j, mo4297c, interfaceC44069a);
                                    return;
                                }
                                return;
                            }
                            Uri parse = Uri.parse(mo4301a);
                            C44063a.m4058a(C44063a.this, parse.getScheme() + "://" + parse.getHost(), mo4297c, interfaceC44069a);
                        }
                    });
                }
            }
        }
    }

    @Override // sg.bigo.ads.api.InterfaceC43501Ad, sg.bigo.ads.api.IconAds
    @CallSuper
    public void setAdInteractionListener(AdInteractionListener adInteractionListener) {
        this.f112244a = adInteractionListener;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: t */
    public final void m6442t() {
        if (!this.f112263t) {
            this.f112263t = true;
            this.f112267x = SystemClock.elapsedRealtime();
        }
    }

    /* renamed from: u */
    public final long m6441u() {
        if (this.f112267x == 0) {
            return 0L;
        }
        return SystemClock.elapsedRealtime() - this.f112267x;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: v */
    public final boolean m6440v() {
        WeakReference<InterfaceC42870a> weakReference = this.f112261r;
        if (weakReference != null && weakReference.get() != null && this.f112261r.get().mo6298a()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private void m6449d(String str) {
        if (this.f112269z.contains(str)) {
            C43782a.m5010a(0, 3, "Ad", "ignore callback action, action = ".concat(String.valueOf(str)));
            return;
        }
        U mo5439f = mo5439f();
        Map<String, Object> m3977a = C44091a.m3977a(str, this.f112245b.f114091b, this.f114060M, mo5439f, Integer.valueOf(mo5439f.mo4361aj()), null, null, this);
        str.hashCode();
        if (str.equals("impression") || str.equals(Reporting.EventType.VIDEO_AD_CLICKED)) {
            m3977a.put("ad_size", mo6448i());
            m3977a.put("show_proportion", mo5515b("show_proportion", ""));
            m3977a.put("render_style", mo5515b("render_style", 0));
        }
        C44093b.m3973a().m3972a(str, m3977a);
    }

    @Override // sg.bigo.ads.api.p904b.AbstractC43534a
    /* renamed from: a */
    public final void mo5449a(int i, int i2, String str) {
        if (this.f112249f) {
            return;
        }
        this.f112249f = true;
        this.f112245b.f114092c.f114043g.m5445b();
        if (!this.f112245b.f114090a.mo4363ah() && m6461a("06002008")) {
            C44136b.m3887a(this, i, i2, str);
        }
    }

    @Override // sg.bigo.ads.api.p904b.AbstractC43534a
    /* renamed from: b */
    public final void mo6455b() {
        if (this.f112262s) {
            return;
        }
        this.f112262s = true;
        this.f112245b.f114092c.f114043g.m5445b();
        if (m6461a("06002008")) {
            C44136b.m3884a(this, ((Boolean) mo5515b("is_cache", Boolean.FALSE)).booleanValue());
        }
    }

    /* renamed from: c */
    public final void m6452c(String str) {
        if (C43836q.m4837a((CharSequence) str)) {
            return;
        }
        this.f112242A.add(str);
    }

    /* renamed from: c */
    private void m6451c(C43705i c43705i, int i, int i2, C43558e c43558e) {
        long elapsedRealtime = this.f112266w > 0 ? SystemClock.elapsedRealtime() - this.f112266w : 0L;
        String m5154b = c43705i != null ? c43705i.m5154b() : "";
        String m5155a = c43705i != null ? c43705i.m5155a() : "";
        if (m6461a("06002011")) {
            InterfaceC43550c interfaceC43550c = this.f112245b.f114090a;
            String mo6448i = mo6448i();
            int i3 = c43558e.f114077a;
            int i4 = c43558e.f114083g;
            int i5 = this.f112255l + 1;
            this.f112255l = i5;
            int i6 = this.f112256m + 1;
            this.f112256m = i6;
            C44136b.m3859a(interfaceC43550c, mo6448i, m5154b, m5155a, i, i2, i3, i4, elapsedRealtime, i5, i6, this);
        }
    }

    @CallSuper
    /* renamed from: a */
    public final void m6463a(int i, String str) {
        C43782a.m5010a(2, 5, "", "onAdError: (" + i + ") " + str);
        AdError adError = new AdError(i, str);
        C44136b.m3858a(this.f112245b.f114090a, adError, mo5730n());
        AdInteractionListener adInteractionListener = this.f112244a;
        if (adInteractionListener != null) {
            adInteractionListener.onAdError(adError);
        }
    }

    /* renamed from: b */
    public final void m6454b(String str) {
        if (C43836q.m4837a((CharSequence) str)) {
            return;
        }
        this.f112269z.add(str);
    }

    /* renamed from: b */
    private void m6453b(@Nullable C43705i c43705i, int i, int i2, @NonNull C43558e c43558e) {
        this.f112257n = i;
        if (!this.f112264u && !this.f112251h) {
            this.f112264u = true;
            mo6462a(c43705i != null ? c43705i.f114412b : null, i, i2, c43558e);
        }
        m6451c(c43705i, i, i2, c43558e);
        AdInteractionListener adInteractionListener = this.f112244a;
        if (adInteractionListener != null) {
            adInteractionListener.onAdClicked();
        }
    }

    @Override // sg.bigo.ads.common.p912f.C43620c.InterfaceC43631a
    /* renamed from: a */
    public final void mo5293a(Activity activity) {
        Intent intent;
        if (activity != null && (activity instanceof AdActivity) && (intent = activity.getIntent()) != null && intent.getIntExtra("ad_identifier", -1) == hashCode() && intent.getBooleanExtra("create_error_flag", false)) {
            String stringExtra = intent.getStringExtra("create_error_msg");
            m6463a(2005, "Activity create error");
            C44136b.m3876a(mo5439f(), 3000, 10117, stringExtra);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @CallSuper
    /* renamed from: a */
    public void mo6462a(@Nullable Point point, int i, int i2, @NonNull C43558e c43558e) {
        int i3;
        int i4;
        int i5;
        int i6;
        InterfaceC43550c interfaceC43550c;
        mo5819m();
        this.f112247d.m3791b(ShareConstants.WEB_DIALOG_PARAM_ACTION_TYPE, String.valueOf(c43558e.f114077a));
        C44156a c44156a = this.f112247d;
        final boolean z = false;
        if (point != null) {
            i4 = point.x;
            i3 = point.y;
        } else {
            i3 = 0;
            i4 = 0;
        }
        View view = this.f112246c;
        if (view != null) {
            i5 = view.getWidth();
            i6 = this.f112246c.getHeight();
        } else {
            i5 = 0;
            i6 = 0;
        }
        c44156a.m3791b("click_prop", C43836q.m4822e(C43836q.m4830a("{'x':%d,'y':%d,'ad_w':%d,'ad_h':%d,'x_r':%s,'y_r':%s,'mode':'%s'}", Integer.valueOf(i4), Integer.valueOf(i3), Integer.valueOf(i5), Integer.valueOf(i6), Float.valueOf(i5 > 0 ? new BigDecimal(i4 / i5).setScale(3, 4).floatValue() : 0.0f), Float.valueOf(i6 > 0 ? new BigDecimal(i3 / i6).setScale(3, 4).floatValue() : 0.0f), (i2 == 1 || i2 == 2) ? DevicePublicKeyStringDef.DIRECT : i2 == 3 ? "confirm" : "unknown")));
        this.f112247d.m3791b("click_source", String.valueOf(i2));
        this.f112247d.m3791b("click_module", String.valueOf(i));
        int i7 = c43558e.f114077a;
        int i8 = 4;
        if (i7 != 1) {
            if (i7 == 4) {
                interfaceC43550c = this.f112245b.f114090a;
                i8 = 8;
            }
            final C44156a c44156a2 = this.f112247d;
            C43727d.m5108a(1, new Runnable() { // from class: sg.bigo.ads.core.d.a.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    c44156a2.m3790b(z);
                }
            });
            C44136b.m3867a(this.f112245b.f114090a, 1, c43558e, this);
        }
        interfaceC43550c = this.f112245b.f114090a;
        z = interfaceC43550c.mo4379a(i8);
        final C44156a c44156a22 = this.f112247d;
        C43727d.m5108a(1, new Runnable() { // from class: sg.bigo.ads.core.d.a.a.1
            @Override // java.lang.Runnable
            public final void run() {
                c44156a22.m3790b(z);
            }
        });
        C44136b.m3867a(this.f112245b.f114090a, 1, c43558e, this);
    }

    /* renamed from: a */
    public final synchronized void m6460a(String str, Object obj) {
        this.f112243B.put(str, obj);
    }

    /* renamed from: a */
    public void mo6459a(AbstractC43534a abstractC43534a) {
        this.f114063P = abstractC43534a;
        if (abstractC43534a != null) {
            HashMap hashMap = new HashMap();
            C44136b.m3895a((Map<String, String>) hashMap, (AbstractC43534a) this, false);
            this.f112247d.m3800a(hashMap);
        }
    }

    @CallSuper
    /* renamed from: a */
    public void mo5431a(@NonNull InterfaceC43538d.InterfaceC43539a<T> interfaceC43539a) {
    }

    /* renamed from: a */
    public final void m6458a(@Nullable C43705i c43705i, int i, int i2, @NonNull C43558e c43558e) {
        if (isExpired() || this.f112251h) {
            return;
        }
        if (m6437z() != 2 || (mo5730n() && SystemClock.elapsedRealtime() - this.f112266w >= m6464A())) {
            m6453b(c43705i, i, i2, c43558e);
        }
    }

    /* renamed from: a */
    public final void m6457a(@Nullable C43705i c43705i, @NonNull C43558e c43558e) {
        m6458a(c43705i, 0, 1, c43558e);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean m6461a(String str) {
        return !this.f112242A.contains(str);
    }
}
