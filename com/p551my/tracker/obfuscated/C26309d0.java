package com.p551my.tracker.obfuscated;

import android.content.Context;
import android.text.TextUtils;
import com.p551my.tracker.MyTrackerConfig;
import com.p551my.tracker.obfuscated.AbstractC26465z;
import java.net.InetAddress;
import java.net.URL;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* renamed from: com.my.tracker.obfuscated.d0 */
/* loaded from: classes7.dex */
public final class C26309d0 {

    /* renamed from: b */
    final String f68548b;

    /* renamed from: c */
    final MyTrackerConfig.OkHttpClientProvider f68549c;

    /* renamed from: a */
    final AtomicReference<byte[]> f68547a = new AtomicReference<>();

    /* renamed from: d */
    boolean f68550d = false;

    public C26309d0(C26290a1 c26290a1) {
        this.f68548b = m42093a(c26290a1.m42169l());
        this.f68549c = c26290a1.m42170k();
    }

    /* renamed from: a */
    static String m42093a(String str) {
        try {
            URL url = new URL(str);
            return url.getProtocol() + "://ip4." + url.getAuthority();
        } catch (Throwable th) {
            C26468z0.m41527a("Ipv4DataProvider: error occurred while creating IPv4 url", th);
            return null;
        }
    }

    /* renamed from: a */
    public /* synthetic */ void m42097a() {
        C26468z0.m41528a("Ipv4DataProvider: get IPv4 address");
        byte[] bArr = C26351j.f68673a;
        try {
            AbstractC26465z.C26467b<String> mo41533a = AbstractC26465z.m41535a(this.f68549c).mo41533a(this.f68548b);
            if (!mo41533a.m41531b()) {
                C26468z0.m41528a("Ipv4DataProvider: unsuccessful response from server");
                synchronized (this.f68547a) {
                    this.f68547a.set(bArr);
                    this.f68547a.notify();
                }
                return;
            }
            String m41532a = mo41533a.m41532a();
            if (TextUtils.isEmpty(m41532a)) {
                C26468z0.m41528a("Ipv4DataProvider: empty response from server");
                synchronized (this.f68547a) {
                    this.f68547a.set(bArr);
                    this.f68547a.notify();
                }
                return;
            }
            String optString = new JSONObject(m41532a).optString("ip");
            if (TextUtils.isEmpty(optString)) {
                C26468z0.m41528a("Ipv4DataProvider: IP is empty");
                synchronized (this.f68547a) {
                    this.f68547a.set(bArr);
                    this.f68547a.notify();
                }
                return;
            }
            C26468z0.m41528a("Ipv4DataProvider: IPv4 address is received " + optString);
            byte[] address = InetAddress.getByName(optString).getAddress();
            synchronized (this.f68547a) {
                this.f68547a.set(address);
                this.f68547a.notify();
            }
        } catch (Throwable th) {
            try {
                C26468z0.m41524b("Ipv4DataProvider: failed to get IPv4 address", th);
                synchronized (this.f68547a) {
                    this.f68547a.set(bArr);
                    this.f68547a.notify();
                }
            } catch (Throwable th2) {
                synchronized (this.f68547a) {
                    this.f68547a.set(bArr);
                    this.f68547a.notify();
                    throw th2;
                }
            }
        }
    }

    /* renamed from: a */
    public void m42096a(Context context) {
        if (this.f68550d) {
            return;
        }
        this.f68550d = true;
        if (TextUtils.isEmpty(this.f68548b)) {
            C26468z0.m41528a("Ipv4DataProvider: no IPv4 url");
            this.f68547a.set(C26351j.f68673a);
            return;
        }
        C26325g.m42072b(new Runnable() { // from class: com.my.tracker.obfuscated.t1
            {
                C26309d0.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C26309d0.this.m42097a();
            }
        });
        this.f68550d = true;
    }

    /* renamed from: a */
    public void m42094a(C26405s0 c26405s0, Context context) {
        String str;
        byte[] bArr = this.f68547a.get();
        if (bArr == null) {
            try {
                C26468z0.m41528a("Ipv4DataProvider: waiting for collecting data");
                synchronized (this.f68547a) {
                    this.f68547a.wait(1000L);
                }
                C26468z0.m41528a("Ipv4DataProvider: timeout for collecting IPv4 has exceeded");
                bArr = this.f68547a.get();
            } catch (Throwable unused) {
                C26468z0.m41528a("Ipv4DataProvider: attempt to block thread retrieving IPv4 finished unsuccessfully");
            }
        }
        if (bArr == null) {
            str = "Ipv4DataProvider: data hasn't been collected yet";
        } else if (bArr != C26351j.f68673a) {
            c26405s0.m41692b(bArr);
            return;
        } else {
            str = "Ipv4DataProvider: error occurred while collecting data";
        }
        C26468z0.m41528a(str);
    }

    /* renamed from: b */
    public void m42092b(Context context) {
    }
}
