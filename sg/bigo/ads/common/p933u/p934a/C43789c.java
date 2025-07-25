package sg.bigo.ads.common.p933u.p934a;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.common.net.HttpHeaders;
import com.mbridge.msdk.MBridgeConstans;
import com.smaato.sdk.video.vast.model.Verification;
import java.io.BufferedOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.HttpsURLConnection;
import sg.bigo.ads.common.InterfaceC43665g;
import sg.bigo.ads.common.p932t.C43782a;
import sg.bigo.ads.common.p933u.C43806f;
import sg.bigo.ads.common.p933u.p935b.AbstractC43797c;
import sg.bigo.ads.common.utils.C43828k;

/* renamed from: sg.bigo.ads.common.u.a.c */
/* loaded from: classes10.dex */
public final class C43789c {

    /* renamed from: a */
    final AbstractC43797c f114578a;

    /* renamed from: b */
    URL f114579b;

    /* renamed from: c */
    boolean f114580c;

    /* renamed from: d */
    private final C43788b f114581d;

    /* renamed from: e */
    private final InterfaceC43665g f114582e;
    @Nullable

    /* renamed from: f */
    private final URL f114583f;

    /* renamed from: g */
    private int f114584g;

    /* renamed from: h */
    private HttpURLConnection f114585h;

    private C43789c(@NonNull AbstractC43797c abstractC43797c, @Nullable URL url, @Nullable URL url2, @NonNull C43788b c43788b, @Nullable InterfaceC43665g interfaceC43665g) {
        this.f114580c = false;
        this.f114578a = abstractC43797c;
        this.f114579b = url;
        this.f114583f = url2;
        this.f114581d = c43788b;
        this.f114582e = interfaceC43665g;
        C43782a.m5010a(0, 3, "HttpRequest", "request, " + abstractC43797c + ", redirectURL= " + url2 + ", content=" + abstractC43797c.mo4971d());
    }

    /* renamed from: a */
    public final HttpURLConnection m5001a() {
        String str;
        URL url = this.f114583f;
        if (url == null) {
            this.f114578a.m4976a("PreHost");
            T t = this.f114578a.f114616j;
            String mo4525a = t.mo4525a();
            String mo4519e = t.mo4519e();
            String mo4520d = t.mo4520d();
            if (!TextUtils.isEmpty(mo4519e) && !TextUtils.isEmpty(mo4520d) && !TextUtils.equals(mo4519e, mo4520d)) {
                this.f114578a.m4975a("PreHost", mo4519e);
            }
            this.f114578a.mo4089h();
            url = m4999a(Uri.parse(mo4525a));
            this.f114579b = url;
        } else if (url != null && this.f114582e != null && this.f114578a.f114620n) {
            url = m4999a(Uri.parse(url.toString()));
        }
        boolean equalsIgnoreCase = "HTTPS".equalsIgnoreCase(url.getProtocol());
        URLConnection openConnection = url.openConnection();
        this.f114585h = equalsIgnoreCase ? (HttpsURLConnection) openConnection : (HttpURLConnection) openConnection;
        this.f114585h.setInstanceFollowRedirects(false);
        this.f114585h.setDoInput(true);
        this.f114585h.setUseCaches(false);
        this.f114585h.setConnectTimeout((int) this.f114578a.f114618l);
        this.f114585h.setReadTimeout((int) this.f114578a.f114618l);
        this.f114585h.setRequestMethod(this.f114578a.mo4977a());
        Map<String, Set<String>> map = this.f114578a.f114619m;
        if (!map.containsKey("Connection")) {
            map.put("Connection", new HashSet(Arrays.asList(HttpHeaders.KEEP_ALIVE)));
        }
        Set<String> set = map.get("Accept-Encoding");
        if (C43828k.m4877a(map.get("Range")) && C43828k.m4877a(set)) {
            this.f114580c = true;
            map.put("Accept-Encoding", new HashSet(Arrays.asList("gzip")));
        }
        try {
            C43788b c43788b = this.f114581d;
            String host = this.f114585h.getURL().getHost();
            str = TextUtils.isEmpty(host) ? "" : c43788b.f114577a.get(host);
        } catch (Exception unused) {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            map.put("Host", new HashSet(Arrays.asList(str)));
        }
        for (Map.Entry<String, Set<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            Set<String> value = entry.getValue();
            if (!TextUtils.isEmpty(key) && !C43828k.m4877a(value)) {
                for (String str2 : value) {
                    if (!TextUtils.isEmpty(str2)) {
                        this.f114585h.addRequestProperty(key, str2);
                    }
                }
            }
        }
        byte[] mo4972c = this.f114578a.mo4972c();
        if (mo4972c != null && mo4972c.length > 0) {
            C43806f mo4974b = this.f114578a.mo4974b();
            if (mo4974b != null) {
                this.f114585h.setRequestProperty("Content-Type", mo4974b.toString());
            }
            this.f114585h.setDoOutput(true);
            this.f114585h.setRequestProperty("Content-Length", Long.toString(this.f114578a.mo4970e()));
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(this.f114585h.getOutputStream());
            bufferedOutputStream.write(mo4972c);
            bufferedOutputStream.flush();
            bufferedOutputStream.close();
        }
        return this.f114585h;
    }

    /* renamed from: b */
    public final boolean m4997b() {
        if (this.f114583f != null) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (this.f114583f != null) {
            sb2.append("originUrl=");
            sb2.append(this.f114578a.m4968g());
            sb2.append(", redirectURL=");
            sb2.append(this.f114583f);
            sb2.append(", redirectCount=");
            sb2.append(this.f114584g);
        } else {
            sb2.append("requestUrl=");
            sb2.append(this.f114578a.m4968g());
        }
        return sb2.toString();
    }

    public C43789c(@NonNull AbstractC43797c abstractC43797c, @NonNull C43788b c43788b, @Nullable InterfaceC43665g interfaceC43665g) {
        this(abstractC43797c, null, null, c43788b, interfaceC43665g);
    }

    /* renamed from: a */
    private URL m4999a(Uri uri) {
        if (uri == null) {
            return null;
        }
        if (this.f114582e == null || !this.f114578a.f114620n) {
            return new URL(uri.toString());
        }
        Uri.Builder buildUpon = Uri.parse(uri.toString()).buildUpon();
        m5000a(buildUpon, "sdk_ver", this.f114582e.mo4179A());
        m5000a(buildUpon, "sdk_vc", "50002");
        m5000a(buildUpon, "country", this.f114582e.mo4157W());
        m5000a(buildUpon, MBridgeConstans.APP_KEY, this.f114582e.mo4153a());
        m5000a(buildUpon, "pkg_ver", this.f114582e.mo4144c());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f114582e.mo4143d());
        m5000a(buildUpon, "pkg_vc", sb2.toString());
        m5000a(buildUpon, "os", this.f114582e.mo4138i());
        m5000a(buildUpon, "os_ver", this.f114582e.mo4137j());
        m5000a(buildUpon, "os_lang", this.f114582e.mo4136k());
        m5000a(buildUpon, Verification.VENDOR, this.f114582e.mo4135l());
        m5000a(buildUpon, "model", this.f114582e.mo4134m());
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f114582e.mo4131p());
        m5000a(buildUpon, "dpi", sb3.toString());
        m5000a(buildUpon, "resolution", this.f114582e.mo4132o());
        m5000a(buildUpon, "net", this.f114582e.mo4130q());
        m5000a(buildUpon, "tz", this.f114582e.mo4129r());
        if (this.f114578a.mo4969f()) {
            m5000a(buildUpon, "enc", "1");
        }
        return new URL(buildUpon.build().toString());
    }

    @NonNull
    /* renamed from: a */
    public final C43789c m4998a(@NonNull URL url) {
        C43789c c43789c = new C43789c(this.f114578a, this.f114579b, url, this.f114581d, this.f114582e);
        c43789c.f114584g = this.f114584g + 1;
        return c43789c;
    }

    /* renamed from: a */
    private static void m5000a(Uri.Builder builder, String str, String str2) {
        if (builder == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }
}
