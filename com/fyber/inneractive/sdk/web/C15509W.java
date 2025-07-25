package com.fyber.inneractive.sdk.web;

import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.digitalturbine.ignite.p367cl.aidl.IIgniteServiceAPI;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.C14388r;
import com.fyber.inneractive.sdk.config.global.features.C14371r;
import com.fyber.inneractive.sdk.flow.C14540v;
import com.fyber.inneractive.sdk.ignite.C14563h;
import com.fyber.inneractive.sdk.ignite.C14567l;
import com.fyber.inneractive.sdk.ignite.EnumC14565j;
import com.fyber.inneractive.sdk.ignite.EnumC14568m;
import com.fyber.inneractive.sdk.ignite.InterfaceC14573r;
import com.fyber.inneractive.sdk.network.EnumC14730t;
import com.fyber.inneractive.sdk.util.AbstractC15459m;
import com.fyber.inneractive.sdk.util.AbstractC15465p;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.View$OnLongClickListenerC15423N;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.fyber.inneractive.sdk.web.W */
/* loaded from: classes4.dex */
public final class C15509W implements InterfaceC14573r {

    /* renamed from: B */
    public boolean f30688B;

    /* renamed from: a */
    public final WebView f30692a;

    /* renamed from: b */
    public final C14563h f30693b;

    /* renamed from: c */
    public final String f30694c;

    /* renamed from: d */
    public EnumC14568m f30695d;

    /* renamed from: e */
    public final String f30696e;

    /* renamed from: f */
    public final String f30697f;

    /* renamed from: g */
    public final String f30698g;

    /* renamed from: h */
    public final C14540v f30699h;

    /* renamed from: i */
    public InterfaceC15507U f30700i;

    /* renamed from: k */
    public String f30702k;

    /* renamed from: m */
    public final C14388r f30704m;

    /* renamed from: o */
    public long f30706o;

    /* renamed from: p */
    public RunnableC15501N f30707p;

    /* renamed from: q */
    public WeakReference f30708q;

    /* renamed from: j */
    public String f30701j = "invalid_task_id";

    /* renamed from: l */
    public boolean f30703l = false;

    /* renamed from: n */
    public long f30705n = 10;

    /* renamed from: r */
    public boolean f30709r = false;

    /* renamed from: s */
    public boolean f30710s = false;

    /* renamed from: t */
    public final AtomicInteger f30711t = new AtomicInteger(0);

    /* renamed from: u */
    public final AtomicBoolean f30712u = new AtomicBoolean(false);

    /* renamed from: v */
    public final AtomicBoolean f30713v = new AtomicBoolean(false);

    /* renamed from: w */
    public boolean f30714w = false;

    /* renamed from: x */
    public boolean f30715x = false;

    /* renamed from: y */
    public boolean f30716y = false;

    /* renamed from: z */
    public boolean f30717z = false;

    /* renamed from: A */
    public boolean f30687A = false;

    /* renamed from: C */
    public boolean f30689C = false;

    /* renamed from: D */
    public boolean f30690D = false;

    /* renamed from: E */
    public final C15500M f30691E = new C15500M(this);

    public C15509W(C15510X c15510x) {
        this.f30694c = c15510x.f30718a;
        this.f30695d = c15510x.f30719b;
        this.f30696e = c15510x.f30720c;
        this.f30704m = c15510x.f30721d;
        this.f30697f = c15510x.f30722e;
        this.f30698g = c15510x.f30723f;
        this.f30699h = c15510x.f30724g;
        C14563h c14563h = IAConfigManager.f27060O.f27067E;
        this.f30693b = c14563h;
        c14563h.f27599h.add(this);
        this.f30692a = new WebView(AbstractC15459m.f30607a);
    }

    @Override // com.fyber.inneractive.sdk.ignite.InterfaceC14573r
    /* renamed from: a */
    public final void mo76412a(String str, String str2) {
        if (str == null || str2 == null || !str2.equals(this.f30694c)) {
            return;
        }
        this.f30701j = str;
    }

    @Override // com.fyber.inneractive.sdk.ignite.InterfaceC14573r
    /* renamed from: b */
    public final void mo76410b(String str) {
        this.f30717z = false;
        this.f30687A = true;
        if (this.f30701j.equals(str)) {
            this.f30693b.m77797m();
            m76408d("onInstallationSuccess();");
        }
    }

    @Override // com.fyber.inneractive.sdk.ignite.InterfaceC14573r
    /* renamed from: c */
    public final void mo76409c(String str) {
        C14540v c14540v;
        IIgniteServiceAPI iIgniteServiceAPI;
        if (this.f30713v.get() && str != null) {
            if (str.equals(EnumC14565j.NOT_CONNECTED.m77794a()) || str.equals(EnumC14565j.SESSION_EXPIRED.m77794a())) {
                if (this.f30711t.getAndIncrement() < 2) {
                    this.f30693b.m77798a(new C15504Q(this));
                    return;
                }
                C14563h c14563h = this.f30693b;
                C14567l c14567l = c14563h.f27607p;
                if (c14567l == null || !c14567l.isConnected() || (iIgniteServiceAPI = c14563h.f27593b) == null || !iIgniteServiceAPI.asBinder().isBinderAlive()) {
                    EnumC14565j enumC14565j = EnumC14565j.FAILED_TO_BIND_SERVICE;
                    C14563h c14563h2 = this.f30693b;
                    if (!c14563h2.f27600i && (c14540v = this.f30699h) != null) {
                        c14563h2.f27600i = true;
                        c14540v.m77818a(EnumC14730t.IGNITE_FLOW_FAILED_TO_START, null, enumC14565j.m77794a(), null);
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public final void m76408d(String str) {
        AbstractC15465p.f30612b.post(new RunnableC15502O(this, str));
    }

    /* renamed from: e */
    public final void m76407e(String str) {
        int i;
        if (!TextUtils.isEmpty(str)) {
            this.f30702k = str;
            WebSettings settings = this.f30692a.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setUseWideViewPort(true);
            this.f30692a.setInitialScale(1);
            this.f30692a.setBackgroundColor(-1);
            this.f30692a.setWebViewClient(this.f30691E);
            WebView webView = this.f30692a;
            webView.setLongClickable(false);
            webView.setOnLongClickListener(new View$OnLongClickListenerC15423N());
            this.f30692a.addJavascriptInterface(new C15508V(this), "nativeInterface");
            this.f30692a.loadUrl(str);
            C14388r c14388r = this.f30704m;
            if (c14388r != null) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                Integer mo77934a = ((C14371r) c14388r.m77927a(C14371r.class)).mo77934a("load_timeout");
                int i2 = 10;
                if (mo77934a != null) {
                    i = mo77934a.intValue();
                } else {
                    i = 10;
                }
                if (i < 30 && i > 2) {
                    i2 = i;
                }
                long millis = timeUnit.toMillis(i2);
                this.f30705n = millis;
                IAlog.m76529a("InternalStoreWebpageController: Starting load timeout with %d", Long.valueOf(millis));
            }
            this.f30706o = System.currentTimeMillis();
            RunnableC15501N runnableC15501N = new RunnableC15501N(this);
            this.f30707p = runnableC15501N;
            AbstractC15465p.f30612b.postDelayed(runnableC15501N, this.f30705n);
        }
    }

    @Override // com.fyber.inneractive.sdk.ignite.InterfaceC14573r
    /* renamed from: a */
    public final void mo76414a(String str) {
        this.f30717z = true;
        if (this.f30701j.equals(str)) {
            this.f30693b.m77797m();
            m76408d("onInstallStart();");
        }
    }

    @Override // com.fyber.inneractive.sdk.ignite.InterfaceC14573r
    /* renamed from: a */
    public final void mo76413a(String str, int i, double d) {
        if (this.f30701j.equals(str)) {
            if (i == 0) {
                m76408d(String.format("onDownloadProgress(%f);", Double.valueOf(d)));
            } else if (i != 1) {
            } else {
                m76408d("onInstallationProgress();");
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.ignite.InterfaceC14573r
    /* renamed from: a */
    public final void mo76411a(String str, String str2, String str3) {
        C14540v c14540v;
        IIgniteServiceAPI iIgniteServiceAPI;
        if (this.f30690D) {
            this.f30717z = false;
            if (this.f30701j.equals(str)) {
                this.f30693b.m77797m();
                if (!this.f30713v.get() && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str2) && str2.equals("App already installed")) {
                    m76408d("onInstallationSuccess();");
                    this.f30687A = true;
                    return;
                }
            }
            if ((str2 != null && (str2.equals(EnumC14565j.NOT_CONNECTED.m77794a()) || str2.equals(EnumC14565j.SESSION_EXPIRED.m77794a()))) || !this.f30693b.m77796n()) {
                if (this.f30711t.getAndIncrement() < 2) {
                    this.f30693b.m77798a(new C15503P(this, str2, str3));
                    return;
                }
                this.f30693b.m77797m();
                m76408d("onInstallationFailed();");
                C14563h c14563h = this.f30693b;
                C14567l c14567l = c14563h.f27607p;
                if (c14567l == null || !c14567l.isConnected() || (iIgniteServiceAPI = c14563h.f27593b) == null || !iIgniteServiceAPI.asBinder().isBinderAlive()) {
                    EnumC14565j enumC14565j = EnumC14565j.FAILED_TO_BIND_SERVICE;
                    C14563h c14563h2 = this.f30693b;
                    if (!c14563h2.f27600i && (c14540v = this.f30699h) != null) {
                        c14563h2.f27600i = true;
                        c14540v.m77818a(EnumC14730t.IGNITE_FLOW_FAILED_TO_START, null, enumC14565j.m77794a(), null);
                    }
                }
            } else if (!TextUtils.equals(str2, EnumC14565j.DOWNLOAD_IS_CANCELLED.m77794a())) {
                this.f30693b.m77797m();
                m76408d("onInstallationFailed();");
            }
            EnumC14568m enumC14568m = this.f30695d;
            if (enumC14568m != null) {
                this.f30699h.m77818a(EnumC14730t.IGNITE_FLOW_FAILED_TO_INSTALL_APP, str2, str3, enumC14568m);
            }
        }
    }
}
