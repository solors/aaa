package com.fyber.inneractive.sdk.click;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.ignite.EnumC14568m;
import com.fyber.inneractive.sdk.network.C14707h0;
import com.fyber.inneractive.sdk.util.AbstractC15415F;
import com.fyber.inneractive.sdk.util.AbstractC15465p;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.C15509W;
import com.ironsource.C20517nb;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.fyber.inneractive.sdk.click.r */
/* loaded from: classes4.dex */
public final class C14307r {

    /* renamed from: a */
    public Context f27032a;

    /* renamed from: b */
    public String f27033b;

    /* renamed from: c */
    public final boolean f27034c;

    /* renamed from: d */
    public InterfaceC14304o f27035d;

    /* renamed from: h */
    public C14707h0 f27039h;

    /* renamed from: j */
    public C15509W f27041j;

    /* renamed from: k */
    public boolean f27042k;

    /* renamed from: l */
    public EnumC14568m f27043l;

    /* renamed from: e */
    public volatile boolean f27036e = false;

    /* renamed from: g */
    public long f27038g = 0;

    /* renamed from: i */
    public final ArrayList f27040i = new ArrayList();

    /* renamed from: f */
    public final ArrayList f27037f = new ArrayList();

    /* renamed from: m */
    public final boolean f27044m = IAConfigManager.f27060O.f27097u.f27275b.m77916a(false, "should_decode_url");

    public C14307r(boolean z) {
        this.f27034c = true;
        this.f27034c = z;
    }

    /* renamed from: a */
    public final void m78003a(Context context, String str, InterfaceC14304o interfaceC14304o, C15509W c15509w, boolean z, EnumC14568m enumC14568m, String str2) {
        Uri uri;
        this.f27032a = context;
        this.f27033b = str;
        this.f27035d = interfaceC14304o;
        this.f27042k = z;
        this.f27038g = System.currentTimeMillis();
        this.f27041j = c15509w;
        this.f27043l = enumC14568m;
        C14291b m77999a = m77999a(this.f27033b);
        IAlog.m76526d("%s EVENT_CLICK %s %s", "VAST_EVENT", m77999a, str);
        if (m77999a == null) {
            String str3 = this.f27033b;
            try {
                try {
                    if (this.f27044m) {
                        if (!AbstractC15415F.m76535c(str3)) {
                            uri = Uri.parse(URLDecoder.decode(str3, C20517nb.f52167N));
                        } else {
                            uri = Uri.parse(str3);
                        }
                    } else if (AbstractC15415F.m76535c(str3)) {
                        uri = Uri.parse(URLDecoder.decode(str3, C20517nb.f52167N));
                    } else {
                        uri = Uri.parse(str3);
                    }
                } catch (Exception unused) {
                    IAlog.m76529a("%sgetDecodedUri: Failed parsing Uri!", "SuperClickHandler");
                    uri = null;
                }
                if (m78002a(uri)) {
                    IAlog.m76529a("%sfollowRedirects: Fetching uri: %s", IAlog.m76531a(this), uri.toString());
                    String uri2 = uri.toString();
                    C14707h0 c14707h0 = new C14707h0(new C14302m(this, uri2, str2), uri2);
                    this.f27039h = c14707h0;
                    IAConfigManager.f27060O.f27095s.m77724b(c14707h0);
                }
            } catch (Exception e) {
                if (e instanceof InterruptedException) {
                    return;
                }
                IAlog.m76528b("%sfailed followRedirects %s", IAlog.m76531a(this), e);
                this.f27037f.add(new C14299j(str3, false, EnumC14306q.INTERNAL_REDIRECT, null));
                m78001a(new C14291b(str3, EnumC14306q.FAILED, "followRedirects", e));
            }
        }
    }

    /* renamed from: a */
    public final boolean m78002a(Uri uri) {
        if (uri == null) {
            IAlog.m76529a("%s followRedirects: Got a url which is not valid: null", IAlog.m76531a(this));
            this.f27037f.add(new C14299j(null, false, null, "Invalid url"));
            m78001a(m77998a(uri.toString(), "followRedirects", "Invalid url"));
            return false;
        }
        String scheme = uri.getScheme();
        if (scheme == null || !(scheme.equalsIgnoreCase("http") || scheme.equalsIgnoreCase("https"))) {
            IAlog.m76529a("%scould not follow redirects for scheme: %s", IAlog.m76531a(this), uri.getScheme());
            IAlog.m76529a("%sfull url: %s", IAlog.m76531a(this), uri.toString());
            ArrayList arrayList = this.f27037f;
            String uri2 = uri.toString();
            arrayList.add(new C14299j(uri2, false, null, "Invalid scheme: " + uri.getScheme()));
            m78001a(m77998a(uri.toString(), "followRedirects", "Invalid scheme: " + uri.getScheme()));
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final C14291b m77999a(String str) {
        Uri uri;
        try {
            uri = Uri.parse(str);
        } catch (Exception unused) {
            IAlog.m76529a("IAJavaUtil: getValidUri: Invalid url %s", str);
            uri = null;
        }
        if (uri == null) {
            this.f27037f.add(new C14299j(str, false, null, "illegal uri"));
            return m78001a(m77998a(str, null, "illegal uri"));
        } else if (this.f27040i.isEmpty()) {
            this.f27037f.add(new C14299j(str, false, null, "no click handlers found"));
            return m78001a(m77998a(str, null, "no click handlers found"));
        } else {
            Iterator it = this.f27040i.iterator();
            while (it.hasNext()) {
                InterfaceC14290a interfaceC14290a = (InterfaceC14290a) it.next();
                if (interfaceC14290a.mo78004a(uri, this)) {
                    Context context = this.f27032a;
                    C14291b mo78006a = context != null ? interfaceC14290a.mo78006a(context, uri, this.f27037f) : null;
                    if (mo78006a != null) {
                        return m78001a(mo78006a);
                    }
                }
            }
            return null;
        }
    }

    /* renamed from: a */
    public static void m78000a(C14307r c14307r, String str, String str2, String str3, Exception exc) {
        String message;
        Throwable cause;
        if (c14307r.f27034c) {
            Intent intent = new Intent(c14307r.f27032a, InneractiveInternalBrowserActivity.class);
            if (!TextUtils.isEmpty(str)) {
                InneractiveInternalBrowserActivity.setHtmlExtra(str);
            }
            intent.putExtra(InneractiveInternalBrowserActivity.URL_EXTRA, str2);
            intent.putExtra("spotId", str3);
            if (!(c14307r.f27032a instanceof Activity)) {
                intent.setFlags(268435456);
            }
            try {
                Context context = c14307r.f27032a;
                if (context != null) {
                    context.startActivity(intent);
                }
                ArrayList arrayList = c14307r.f27037f;
                boolean z = exc == null;
                EnumC14306q enumC14306q = EnumC14306q.OPENED_IN_INTERNAL_BROWSER;
                Exception exc2 = exc;
                if (exc == null) {
                    message = null;
                } else {
                    do {
                        message = exc2.getMessage();
                        cause = exc2.getCause();
                        exc2 = cause;
                    } while (cause != null);
                }
                arrayList.add(new C14299j(str2, z, enumC14306q, message));
                c14307r.m78001a(new C14291b(str2, enumC14306q, "followRedirects", null));
                return;
            } catch (ActivityNotFoundException unused) {
                c14307r.f27037f.add(new C14299j(str2, false, EnumC14306q.OPENED_IN_INTERNAL_BROWSER, "internal browser not registered"));
                c14307r.m78001a(m77998a(str2, "followRedirects", "internal browser not registered"));
                return;
            }
        }
        c14307r.f27037f.add(new C14299j(str2, false, EnumC14306q.OPENED_IN_INTERNAL_BROWSER, "internal browser not usable"));
        c14307r.m78001a(m77998a(str2, "followRedirects", "internal browser not usable"));
    }

    /* renamed from: a */
    public static C14291b m77998a(String str, String str2, String str3) {
        return new C14291b(str, EnumC14306q.FAILED, str2, new C14305p(str3));
    }

    /* renamed from: a */
    public final C14291b m78001a(C14291b c14291b) {
        ArrayList arrayList = this.f27037f;
        c14291b.f27004f.clear();
        c14291b.f27004f.addAll(arrayList);
        c14291b.f27003e = System.currentTimeMillis() - this.f27038g;
        IAlog.m76529a("%s reporting result: %s", IAlog.m76531a(this), c14291b);
        AbstractC15465p.f30612b.post(new RunnableC14303n(this, c14291b));
        return c14291b;
    }
}
