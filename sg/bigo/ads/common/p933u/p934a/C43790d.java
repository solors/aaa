package sg.bigo.ads.common.p933u.p934a;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import sg.bigo.ads.common.utils.C43825h;

/* renamed from: sg.bigo.ads.common.u.a.d */
/* loaded from: classes10.dex */
public final class C43790d {
    @NonNull

    /* renamed from: a */
    final HttpURLConnection f114586a;

    /* renamed from: b */
    final int f114587b;

    /* renamed from: c */
    final C43825h<List<String>> f114588c;

    /* renamed from: d */
    private final C43789c f114589d;

    /* renamed from: e */
    private final String f114590e;

    /* renamed from: f */
    private final boolean f114591f;

    /* renamed from: sg.bigo.ads.common.u.a.d$a */
    /* loaded from: classes10.dex */
    public static class C43791a {

        /* renamed from: a */
        public final URL f114592a;

        /* renamed from: b */
        public final String f114593b;

        /* renamed from: c */
        public final int f114594c;

        /* renamed from: d */
        public final String f114595d;

        /* renamed from: e */
        public final int f114596e;

        private C43791a(URL url, String str, int i, String str2, int i2) {
            this.f114592a = url;
            this.f114593b = str;
            this.f114594c = i;
            this.f114595d = str2;
            this.f114596e = i2;
        }

        /* synthetic */ C43791a(URL url, String str, int i, String str2, int i2, byte b) {
            this(url, str, i, str2, i2);
        }
    }

    public C43790d(@NonNull C43789c c43789c) {
        this.f114589d = c43789c;
        HttpURLConnection m5001a = c43789c.m5001a();
        this.f114586a = m5001a;
        this.f114587b = m5001a.getResponseCode();
        this.f114590e = m5001a.getRequestMethod();
        C43825h<List<String>> c43825h = new C43825h<>();
        this.f114588c = c43825h;
        Map<String, List<String>> headerFields = m5001a.getHeaderFields();
        if (headerFields != null) {
            c43825h.m4883a(headerFields);
        }
        boolean equalsIgnoreCase = "gzip".equalsIgnoreCase(m5001a.getContentEncoding());
        this.f114591f = equalsIgnoreCase;
        if (equalsIgnoreCase && c43789c.f114580c) {
            c43825h.m4882b("Content-Encoding");
            c43825h.m4882b("Content-Length");
        }
    }

    /* renamed from: a */
    public final InputStream m4996a() {
        InputStream inputStream = this.f114586a.getInputStream();
        return (this.f114591f && this.f114589d.f114580c) ? new GZIPInputStream(inputStream) : inputStream;
    }

    @Nullable
    /* renamed from: b */
    public final C43791a m4994b() {
        int i = this.f114587b;
        if (i != 307 && i != 308) {
            switch (i) {
                case 300:
                case 301:
                case 302:
                case 303:
                    String m4995a = m4995a("Location");
                    if (TextUtils.isEmpty(m4995a)) {
                        return new C43791a(null, m4995a, IronSourceError.ERROR_NT_INSTANCE_INIT_TIMEOUT, "empty location.", this.f114587b, (byte) 0);
                    }
                    try {
                        URL url = new URL(this.f114586a.getURL(), m4995a);
                        String url2 = url.toString();
                        if (TextUtils.equals(url2, this.f114586a.getURL().toString())) {
                            return new C43791a(url, m4995a, IronSourceError.ERROR_NT_LOAD_EXCEPTION, "redirect to the same url, location is " + m4995a + ", redirectURL is " + url2, this.f114587b, (byte) 0);
                        }
                        URL url3 = this.f114589d.f114579b;
                        if (url3 != null && TextUtils.equals(url2, url3.toString())) {
                            return new C43791a(url, m4995a, IronSourceError.ERROR_NT_LOAD_PLACEMENT_CAPPED, "redirect to origin url, location is " + m4995a + ", redirectURL is " + url2, this.f114587b, (byte) 0);
                        }
                        return new C43791a(url, m4995a, 0, "", this.f114587b, (byte) 0);
                    } catch (Exception unused) {
                        return new C43791a(null, m4995a, IronSourceError.ERROR_NT_INSTANCE_LOAD_TIMEOUT, "location->\"" + m4995a + "\" is not a network url.", this.f114587b, (byte) 0);
                    }
                default:
                    return null;
            }
        }
        String m4995a2 = m4995a("Location");
        if (!this.f114590e.equalsIgnoreCase("GET") && !this.f114590e.equalsIgnoreCase("HEAD")) {
            return new C43791a(null, m4995a2, IronSourceError.ERROR_NT_LOAD_NO_FILL, "redirect code(" + this.f114587b + ") is only available for GET or HEAD method, current request method is " + this.f114590e, this.f114587b, (byte) 0);
        }
        return new C43791a(null, m4995a2, 0, "", this.f114587b, (byte) 0);
    }

    @Nullable
    /* renamed from: a */
    private String m4995a(String str) {
        List<String> m4884a = this.f114588c.m4884a(str);
        int size = m4884a != null ? m4884a.size() : 0;
        String str2 = "";
        while (TextUtils.isEmpty(str2) && size > 0) {
            str2 = m4884a.get(0);
        }
        return str2;
    }
}
