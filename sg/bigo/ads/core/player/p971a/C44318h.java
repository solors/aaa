package sg.bigo.ads.core.player.p971a;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import sg.bigo.ads.common.C43718m;
import sg.bigo.ads.common.p926n.ThreadFactoryC43725c;
import sg.bigo.ads.common.p932t.C43782a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: sg.bigo.ads.core.player.a.h */
/* loaded from: classes10.dex */
public final class C44318h {

    /* renamed from: a */
    private final ExecutorService f116344a = Executors.newSingleThreadExecutor(new ThreadFactoryC43725c("Ping"));

    /* renamed from: b */
    private final String f116345b;

    /* renamed from: c */
    private final int f116346c;

    /* renamed from: sg.bigo.ads.core.player.a.h$a */
    /* loaded from: classes10.dex */
    class CallableC44319a implements Callable<Boolean> {
        private CallableC44319a() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Boolean call() {
            return Boolean.valueOf(C44318h.this.m3404b());
        }

        /* synthetic */ CallableC44319a(C44318h c44318h, byte b) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C44318h(String str, int i) {
        this.f116345b = (String) C43718m.m5142a(str);
        this.f116346c = i;
    }

    /* renamed from: c */
    private List<Proxy> m3403c() {
        ArrayList arrayList = new ArrayList();
        try {
            return ProxySelector.getDefault().select(new URI(m3402d()));
        } catch (URISyntaxException e) {
            C43782a.m5009a(0, "ProxyCache", "Pinger#getDefaultProxies, error message is : " + e.toString());
            return arrayList;
        }
    }

    /* renamed from: d */
    private String m3402d() {
        return String.format(Locale.US, "http://%s:%d/%s", this.f116345b, Integer.valueOf(this.f116346c), "ping");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean m3405a() {
        String str;
        int i = 70;
        int i2 = 0;
        while (i2 < 3) {
            try {
            } catch (InterruptedException | ExecutionException unused) {
                str = "Error pinging server due to unexpected error";
                C43782a.m5009a(0, "ProxyCache", str);
                i2++;
                i *= 2;
            } catch (TimeoutException unused2) {
                str = "Error pinging server (attempt: " + i2 + ", timeout: " + i + "). ";
                C43782a.m5009a(0, "ProxyCache", str);
                i2++;
                i *= 2;
            }
            if (((Boolean) this.f116344a.submit(new CallableC44319a(this, (byte) 0)).get(i, TimeUnit.MILLISECONDS)).booleanValue()) {
                return true;
            }
            i2++;
            i *= 2;
        }
        C43782a.m5009a(0, "ProxyCache", String.format(Locale.US, "Error pinging server (attempts: %d, max timeout: %d). If you see this message, please, report at https://github.com/danikula/AndroidVideoCache/issues/134. Default proxies are: %s", Integer.valueOf(i2), Integer.valueOf(i / 2), m3403c()));
        return false;
    }

    /* renamed from: b */
    final boolean m3404b() {
        C44317g c44317g = new C44317g(m3402d());
        try {
            byte[] bytes = "ping ok".getBytes();
            try {
                HttpURLConnection m3406b = c44317g.m3406b();
                c44317g.f116341a = m3406b;
                if (m3406b != null) {
                    c44317g.f116342b = new BufferedInputStream(c44317g.f116341a.getInputStream(), 8192);
                }
            } catch (IOException e) {
                C43782a.m5009a(0, "ProxyCache", "Error opening connection for " + c44317g.f116343c + " with offset 0, error message is : " + e.toString());
            }
            byte[] bArr = new byte[bytes.length];
            c44317g.m3407a(bArr);
            boolean equals = Arrays.equals(bytes, bArr);
            C43782a.m5010a(0, 3, "ProxyCache", "Ping response: `" + new String(bArr) + "`, pinged? " + equals);
            return equals;
        } finally {
            c44317g.m3408a();
        }
    }
}
