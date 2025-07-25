package com.p551my.target;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.URLUtil;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

/* renamed from: com.my.target.la */
/* loaded from: classes7.dex */
public class C25895la {

    /* renamed from: c */
    public static final String[] f67213c = {"http://play.google.com", "https://play.google.com", "http://market.android.com", "https://market.android.com", "https://appgallery.huawei.com/", "https://appgallery.cloud.huawei.com/", "market://", "samsungapps://", "appmarket://", "hiapplink://", "https://apps.rustore.ru", "https://backapi.rustore.ru"};

    /* renamed from: a */
    public final String f67214a;

    /* renamed from: b */
    public InterfaceC25896a f67215b;

    /* renamed from: com.my.target.la$a */
    /* loaded from: classes7.dex */
    public interface InterfaceC25896a {
        /* renamed from: a */
        void mo43430a(String str);
    }

    public C25895la(String str) {
        this.f67214a = str;
    }

    /* renamed from: a */
    public static String m43505a(String str) {
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (Throwable th) {
            AbstractC25846ja.m43680a("UrlResolver: Unable to decode url - " + th.getMessage());
            return str;
        }
    }

    /* renamed from: b */
    public static String m43503b(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (Throwable th) {
            AbstractC25846ja.m43680a("UrlResolver: Unable to encode url - " + th.getMessage());
            return "";
        }
    }

    /* renamed from: c */
    public static boolean m43502c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("https");
    }

    /* renamed from: d */
    public static boolean m43501d(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (String str2 : f67213c) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m43500e(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (URLUtil.isHttpsUrl(str)) {
                return !TextUtils.isEmpty(new URL(str).getHost());
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /* renamed from: g */
    public static C25895la m43498g(String str) {
        return new C25895la(str);
    }

    /* renamed from: f */
    public final /* synthetic */ void m43499f(String str) {
        InterfaceC25896a interfaceC25896a = this.f67215b;
        if (interfaceC25896a != null) {
            interfaceC25896a.mo43430a(str);
            this.f67215b = null;
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void m43507a(Context context) {
        final String str = (String) C25701d2.m44039a().m44185a(this.f67214a, null, context).m44112c();
        if (this.f67215b == null) {
            return;
        }
        AbstractC25671c0.m44121e(new Runnable() { // from class: com.my.target.sc
            @Override // java.lang.Runnable
            public final void run() {
                C25895la.this.m43499f(str);
            }
        });
    }

    /* renamed from: b */
    public void m43504b(Context context) {
        final Context applicationContext = context.getApplicationContext();
        AbstractC25671c0.m44122d(new Runnable() { // from class: com.my.target.rc
            @Override // java.lang.Runnable
            public final void run() {
                C25895la.this.m43507a(applicationContext);
            }
        });
    }

    /* renamed from: a */
    public C25895la m43506a(InterfaceC25896a interfaceC25896a) {
        this.f67215b = interfaceC25896a;
        return this;
    }
}
