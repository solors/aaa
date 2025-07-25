package com.applovin.impl;

import android.view.View;
import android.webkit.WebView;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.C5416j;
import com.applovin.impl.sdk.C5434n;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import com.iab.omid.library.applovin.adsession.AdEvents;
import com.iab.omid.library.applovin.adsession.AdSession;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.ErrorType;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.applovin.impl.lg */
/* loaded from: classes2.dex */
public abstract class AbstractC4775lg {

    /* renamed from: a */
    protected final AppLovinAdBase f7751a;

    /* renamed from: b */
    protected final C5416j f7752b;

    /* renamed from: c */
    protected final C5434n f7753c;

    /* renamed from: d */
    protected final String f7754d;

    /* renamed from: e */
    protected boolean f7755e;

    /* renamed from: f */
    protected AdSession f7756f;

    /* renamed from: g */
    protected AdEvents f7757g;

    public AbstractC4775lg(AppLovinAdBase appLovinAdBase) {
        this.f7751a = appLovinAdBase;
        this.f7752b = appLovinAdBase.getSdk();
        this.f7753c = appLovinAdBase.getSdk().m95186I();
        String str = "AdEventTracker:" + appLovinAdBase.getAdIdNumber();
        if (StringUtils.isValidString(appLovinAdBase.getDspName())) {
            str = str + ":" + appLovinAdBase.getDspName();
        }
        this.f7754d = str;
    }

    /* renamed from: a */
    protected abstract AdSessionConfiguration mo95897a();

    /* renamed from: a */
    protected abstract AdSessionContext mo95895a(WebView webView);

    /* renamed from: h */
    public void mo95890h() {
        m97685b("track loaded", new Runnable() { // from class: com.applovin.impl.kz
            {
                AbstractC4775lg.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AbstractC4775lg.this.m97681d();
            }
        });
    }

    /* renamed from: b */
    public /* synthetic */ void m97688b(WebView webView) {
        AdSessionContext mo95895a;
        if (!this.f7751a.isOpenMeasurementEnabled()) {
            if (C5434n.m94914a()) {
                this.f7753c.m94903d(this.f7754d, "Skip starting session - Open Measurement disabled");
            }
        } else if (this.f7756f != null) {
            if (C5434n.m94914a()) {
                C5434n c5434n = this.f7753c;
                String str = this.f7754d;
                c5434n.m94895k(str, "Attempting to start session again for ad: " + this.f7751a);
            }
        } else {
            if (C5434n.m94914a()) {
                this.f7753c.m94911a(this.f7754d, "Starting session");
            }
            AdSessionConfiguration mo95897a = mo95897a();
            if (mo95897a == null || (mo95895a = mo95895a(webView)) == null) {
                return;
            }
            try {
                AdSession createAdSession = AdSession.createAdSession(mo95897a, mo95895a);
                this.f7756f = createAdSession;
                try {
                    this.f7757g = AdEvents.createAdEvents(createAdSession);
                    mo95894a(this.f7756f);
                    this.f7756f.start();
                    this.f7755e = true;
                    if (C5434n.m94914a()) {
                        this.f7753c.m94911a(this.f7754d, "Session started");
                    }
                } catch (Throwable th) {
                    if (C5434n.m94914a()) {
                        this.f7753c.m94910a(this.f7754d, "Failed to create ad events", th);
                    }
                }
            } catch (Throwable th2) {
                if (C5434n.m94914a()) {
                    this.f7753c.m94910a(this.f7754d, "Failed to create session", th2);
                }
            }
        }
    }

    /* renamed from: c */
    public /* synthetic */ void m97684c() {
        this.f7757g.impressionOccurred();
    }

    /* renamed from: d */
    public /* synthetic */ void m97681d() {
        this.f7757g.loaded();
    }

    /* renamed from: a */
    protected void mo95894a(AdSession adSession) {
    }

    /* renamed from: e */
    public void m97679e() {
        m97683c(null);
    }

    /* renamed from: f */
    public void m97677f() {
        m97685b("stop session", new Runnable() { // from class: com.applovin.impl.iz
            {
                AbstractC4775lg.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AbstractC4775lg.this.m97690b();
            }
        });
    }

    /* renamed from: g */
    public void m97675g() {
        m97685b("track impression event", new Runnable() { // from class: com.applovin.impl.jz
            {
                AbstractC4775lg.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AbstractC4775lg.this.m97684c();
            }
        });
    }

    /* renamed from: a */
    public /* synthetic */ void m97691a(String str, Runnable runnable) {
        try {
            if (this.f7755e) {
                if (C5434n.m94914a()) {
                    C5434n c5434n = this.f7753c;
                    String str2 = this.f7754d;
                    c5434n.m94911a(str2, "Running operation: " + str);
                }
                runnable.run();
            }
        } catch (Throwable th) {
            if (C5434n.m94914a()) {
                C5434n c5434n2 = this.f7753c;
                String str3 = this.f7754d;
                c5434n2.m94910a(str3, "Failed to run operation: " + str, th);
            }
        }
    }

    /* renamed from: c */
    public void m97683c(final WebView webView) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.fz
            {
                AbstractC4775lg.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AbstractC4775lg.this.m97688b(webView);
            }
        });
    }

    /* renamed from: a */
    public /* synthetic */ void m97692a(String str) {
        this.f7756f.error(ErrorType.VIDEO, str);
    }

    /* renamed from: a */
    public /* synthetic */ void m97694a(View view, List list) {
        this.f7756f.registerAdView(view);
        this.f7756f.removeAllFriendlyObstructions();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C5010ng c5010ng = (C5010ng) it.next();
            if (c5010ng.m96973c() != null) {
                try {
                    this.f7756f.addFriendlyObstruction(c5010ng.m96973c(), c5010ng.m96974b(), c5010ng.m96975a());
                } catch (Throwable th) {
                    if (C5434n.m94914a()) {
                        C5434n c5434n = this.f7753c;
                        String str = this.f7754d;
                        c5434n.m94910a(str, "Failed to add friendly obstruction (" + c5010ng + ")", th);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public /* synthetic */ void m97690b() {
        this.f7755e = false;
        this.f7756f.finish();
        this.f7756f = null;
        this.f7757g = null;
    }

    /* renamed from: a */
    public void m97695a(View view) {
        m97689b(view, Collections.emptyList());
    }

    /* renamed from: b */
    public void m97685b(final String str, final Runnable runnable) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.ez
            {
                AbstractC4775lg.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AbstractC4775lg.this.m97691a(str, runnable);
            }
        });
    }

    /* renamed from: b */
    public void m97686b(final String str) {
        m97685b("track error", new Runnable() { // from class: com.applovin.impl.gz
            {
                AbstractC4775lg.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AbstractC4775lg.this.m97692a(str);
            }
        });
    }

    /* renamed from: b */
    public void m97689b(final View view, final List list) {
        m97685b("update main view: " + view, new Runnable() { // from class: com.applovin.impl.hz
            {
                AbstractC4775lg.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AbstractC4775lg.this.m97694a(view, list);
            }
        });
    }
}
