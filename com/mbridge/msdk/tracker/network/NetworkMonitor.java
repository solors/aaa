package com.mbridge.msdk.tracker.network;

import android.os.SystemClock;
import android.text.TextUtils;
import com.maticoo.sdk.utils.constant.KeyConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.same.report.EventLibraryCommon;
import com.mbridge.msdk.foundation.same.report.p452d.C22011d;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import com.mbridge.msdk.thrid.okhttp.Call;
import com.mbridge.msdk.thrid.okhttp.Connection;
import com.mbridge.msdk.thrid.okhttp.Handshake;
import com.mbridge.msdk.thrid.okhttp.Headers;
import com.mbridge.msdk.thrid.okhttp.Protocol;
import com.mbridge.msdk.thrid.okhttp.Request;
import com.mbridge.msdk.thrid.okhttp.Response;
import com.mbridge.msdk.thrid.okhttp.Route;
import com.mbridge.msdk.thrid.okhttp.TlsVersion;
import com.mbridge.msdk.tracker.C22885e;
import com.unity3d.services.core.network.core.OkHttp3Client;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URLEncoder;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.tracker.network.q */
/* loaded from: classes6.dex */
public final class NetworkMonitor {

    /* renamed from: A */
    private volatile long f59770A;

    /* renamed from: B */
    private volatile long f59771B;

    /* renamed from: C */
    private volatile long f59772C;

    /* renamed from: D */
    private volatile long f59773D;

    /* renamed from: E */
    private volatile long f59774E;

    /* renamed from: F */
    private volatile long f59775F;

    /* renamed from: G */
    private volatile long f59776G;

    /* renamed from: H */
    private volatile List<InetAddress> f59777H;

    /* renamed from: I */
    private volatile InetSocketAddress f59778I;

    /* renamed from: J */
    private volatile Proxy f59779J;

    /* renamed from: K */
    private volatile Handshake f59780K;

    /* renamed from: L */
    private volatile Protocol f59781L;

    /* renamed from: M */
    private volatile IOException f59782M;

    /* renamed from: O */
    private volatile Exception f59784O;

    /* renamed from: Q */
    private long f59786Q;

    /* renamed from: R */
    private long f59787R;

    /* renamed from: S */
    private long f59788S;

    /* renamed from: T */
    private long f59789T;

    /* renamed from: d */
    private volatile String f59793d;

    /* renamed from: f */
    private volatile long f59795f;

    /* renamed from: j */
    private volatile String f59799j;

    /* renamed from: k */
    private volatile String f59800k;

    /* renamed from: s */
    private volatile long f59808s;

    /* renamed from: t */
    private volatile long f59809t;

    /* renamed from: u */
    private volatile IOException f59810u;

    /* renamed from: v */
    private volatile long f59811v;

    /* renamed from: w */
    private volatile long f59812w;

    /* renamed from: x */
    private volatile long f59813x;

    /* renamed from: y */
    private volatile long f59814y;

    /* renamed from: z */
    private volatile long f59815z;

    /* renamed from: a */
    protected volatile String f59790a = "";

    /* renamed from: b */
    private volatile String f59791b = "";

    /* renamed from: c */
    private volatile String f59792c = "";

    /* renamed from: e */
    private volatile String f59794e = "";

    /* renamed from: g */
    private volatile int f59796g = -1;

    /* renamed from: h */
    private volatile String f59797h = "";

    /* renamed from: i */
    private volatile int f59798i = -1;

    /* renamed from: l */
    private volatile String f59801l = OkHttp3Client.NETWORK_CLIENT_OKHTTP;

    /* renamed from: m */
    private volatile boolean f59802m = false;

    /* renamed from: n */
    private final AtomicInteger f59803n = new AtomicInteger(0);

    /* renamed from: o */
    private volatile String f59804o = "";

    /* renamed from: p */
    private volatile long f59805p = 0;

    /* renamed from: q */
    private volatile long f59806q = 0;

    /* renamed from: r */
    private volatile long f59807r = 0;

    /* renamed from: N */
    private volatile boolean f59783N = false;

    /* renamed from: P */
    private volatile boolean f59785P = false;

    public NetworkMonitor(String str, String str2) {
        this.f59793d = "";
        this.f59799j = "un_known";
        this.f59800k = "";
        this.f59799j = str;
        this.f59800k = str2;
        this.f59793d = UUID.randomUUID().toString();
    }

    /* renamed from: g */
    private String m49470g() {
        return TextUtils.isEmpty(this.f59792c) ? "" : this.f59792c;
    }

    /* renamed from: h */
    private String m49468h() {
        return TextUtils.isEmpty(this.f59791b) ? "" : this.f59791b;
    }

    /* renamed from: i */
    private String m49466i() {
        return TextUtils.isEmpty(this.f59793d) ? "" : this.f59793d;
    }

    /* renamed from: j */
    private String m49464j() {
        return TextUtils.isEmpty(this.f59794e) ? "" : this.f59794e;
    }

    /* renamed from: k */
    private String m49462k() {
        try {
            if (TextUtils.isEmpty(this.f59790a)) {
                return "";
            }
            return URLEncoder.encode(this.f59790a, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return "";
        }
    }

    /* renamed from: l */
    private String m49461l() {
        if (TextUtils.isEmpty(this.f59799j)) {
            return "un_known";
        }
        return this.f59799j;
    }

    /* renamed from: m */
    private String m49460m() {
        if (TextUtils.isEmpty(this.f59800k)) {
            return "";
        }
        return this.f59800k;
    }

    /* renamed from: n */
    private int m49459n() {
        return this.f59803n.getAndAdd(0);
    }

    /* renamed from: o */
    private String m49458o() {
        if (this.f59777H != null && !this.f59777H.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            for (int i = 0; i < this.f59777H.size(); i++) {
                try {
                    InetAddress inetAddress = this.f59777H.get(i);
                    if (inetAddress != null) {
                        sb2.append(inetAddress.getHostAddress());
                        if (i != this.f59777H.size() - 1) {
                            sb2.append(",");
                        }
                    }
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        SameLogTool.m51823b("NetworkMonitor", "getDnsResult ", e);
                    }
                }
            }
            return sb2.toString();
        }
        return "";
    }

    /* renamed from: p */
    private String m49457p() {
        if (this.f59778I != null) {
            try {
                InetAddress address = this.f59778I.getAddress();
                if (address == null) {
                    return "";
                }
                String hostAddress = address.getHostAddress();
                if (TextUtils.isEmpty(hostAddress)) {
                    return "";
                }
                return hostAddress;
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    SameLogTool.m51823b("NetworkMonitor", "getAddress ", e);
                }
            }
        }
        return "";
    }

    /* renamed from: q */
    private String m49456q() {
        if (this.f59780K != null) {
            try {
                TlsVersion tlsVersion = this.f59780K.tlsVersion();
                if (tlsVersion == null) {
                    return "";
                }
                return tlsVersion.javaName();
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    SameLogTool.m51823b("NetworkMonitor", "getTlsVersion ", e);
                }
            }
        }
        return "";
    }

    /* renamed from: r */
    private String m49455r() {
        try {
            if (this.f59782M != null) {
                String name = this.f59782M.getClass().getName();
                String message = this.f59782M.getMessage();
                if (!TextUtils.isEmpty(message)) {
                    return m49488a("connection: %s ", name, message);
                }
            }
            if (this.f59810u != null) {
                String name2 = this.f59810u.getClass().getName();
                String message2 = this.f59810u.getMessage();
                if (!TextUtils.isEmpty(message2)) {
                    return m49488a("call: %s ", name2, message2);
                }
            }
            if (this.f59784O != null) {
                String name3 = this.f59784O.getClass().getName();
                String message3 = this.f59784O.getMessage();
                if (!TextUtils.isEmpty(message3)) {
                    return m49488a("error: %s ", name3, message3);
                }
                return "un_known";
            }
            return "un_known";
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                SameLogTool.m51823b("NetworkMonitor", "getError ", e);
                return "un_known";
            }
            return "un_known";
        }
    }

    /* renamed from: a */
    public final void m49489a(String str) {
        this.f59790a = str;
    }

    /* renamed from: b */
    public final void m49482b(long j) {
        this.f59787R = j;
    }

    /* renamed from: c */
    public final void m49479c(long j) {
        this.f59788S = j;
    }

    /* renamed from: d */
    public final void m49476d(long j) {
        this.f59789T = j;
    }

    /* renamed from: e */
    public final void m49473e(long j) {
        this.f59772C = SystemClock.elapsedRealtime();
    }

    /* renamed from: f */
    public final void m49471f(long j) {
        this.f59807r = j;
    }

    /* renamed from: a */
    public final void m49498a(long j) {
        this.f59786Q = j;
    }

    /* renamed from: b */
    public final void m49481b(String str) {
        this.f59792c = str;
    }

    /* renamed from: c */
    public final void m49478c(String str) {
        this.f59791b = str;
    }

    /* renamed from: d */
    public final void m49475d(String str) {
        this.f59797h = str;
    }

    /* renamed from: e */
    public final void m49474e() {
        this.f59775F = SystemClock.elapsedRealtime();
    }

    /* renamed from: f */
    public final long m49472f() {
        return this.f59807r;
    }

    /* renamed from: g */
    public final void m49469g(long j) {
        this.f59776G = SystemClock.elapsedRealtime();
    }

    /* renamed from: h */
    public final void m49467h(long j) {
        this.f59806q = j;
    }

    /* renamed from: i */
    public final void m49465i(long j) {
        this.f59805p = j;
    }

    /* renamed from: j */
    public final void m49463j(long j) {
        this.f59794e = UUID.randomUUID().toString();
        this.f59795f = j;
        this.f59803n.addAndGet(1);
        this.f59782M = null;
        this.f59810u = null;
        this.f59784O = null;
        this.f59808s = 0L;
        this.f59809t = 0L;
        this.f59811v = 0L;
        this.f59812w = 0L;
        this.f59813x = 0L;
        this.f59814y = 0L;
        this.f59815z = 0L;
        this.f59770A = 0L;
        this.f59771B = 0L;
        this.f59772C = 0L;
        this.f59773D = 0L;
        this.f59774E = 0L;
        this.f59775F = 0L;
        this.f59776G = 0L;
        this.f59806q = 0L;
        this.f59807r = 0L;
        this.f59802m = false;
        this.f59796g = -1;
        this.f59798i = -1;
        this.f59797h = "";
        this.f59804o = "";
        this.f59805p = 0L;
        this.f59785P = false;
        this.f59785P = true;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key", "m_request_start");
            jSONObject.put(CommonUrlParts.UUID, m49466i());
            jSONObject.put("request_uuid", m49464j());
            jSONObject.put("lrid", m49468h());
            jSONObject.put("url", m49462k());
            jSONObject.put("timeout", this.f59786Q);
            jSONObject.put("timeout_connection", this.f59787R);
            jSONObject.put("timeout_read", this.f59788S);
            jSONObject.put("timeout_write", this.f59789T);
            jSONObject.put(KeyConstants.RequestBody.KEY_SCENE, m49461l());
            jSONObject.put("method", m49460m());
            jSONObject.put("adtp", m49470g());
            jSONObject.put("http_stack", this.f59801l);
            jSONObject.put("retry_count", m49459n() - 1);
            jSONObject.put("request_wait_duration", this.f59795f);
            C22885e m49485a = m49485a(jSONObject, "m_request_start");
            if (MBridgeConstans.DEBUG) {
                SameLogTool.m51827a("NetworkMonitor_" + m49461l(), "request start monitor = " + jSONObject.toString());
            }
            C22011d.m52050a().m52030c().m49540a(m49485a);
        } catch (Throwable th) {
            if (MBridgeConstans.DEBUG) {
                SameLogTool.m51823b("NetworkMonitor", "reportRequestStart ", th);
            }
        }
    }

    /* renamed from: a */
    public final void m49499a(int i) {
        this.f59798i = i;
    }

    /* renamed from: b */
    public final void m49484b() {
        this.f59815z = SystemClock.elapsedRealtime();
    }

    /* renamed from: c */
    public final void m49480c() {
        this.f59771B = SystemClock.elapsedRealtime();
    }

    /* renamed from: d */
    public final void m49477d() {
        this.f59773D = SystemClock.elapsedRealtime();
    }

    /* renamed from: a */
    public final void m49497a(Call call) {
        this.f59808s = SystemClock.elapsedRealtime();
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0103 A[Catch: all -> 0x01d5, TryCatch #0 {all -> 0x01d5, blocks: (B:51:0x000c, B:55:0x00bc, B:58:0x00c6, B:60:0x00d8, B:62:0x00e0, B:65:0x00eb, B:68:0x00f4, B:70:0x00fa, B:72:0x0103, B:73:0x0109, B:75:0x0129, B:76:0x0139, B:78:0x019c, B:79:0x01c9), top: B:86:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0129 A[Catch: all -> 0x01d5, TryCatch #0 {all -> 0x01d5, blocks: (B:51:0x000c, B:55:0x00bc, B:58:0x00c6, B:60:0x00d8, B:62:0x00e0, B:65:0x00eb, B:68:0x00f4, B:70:0x00fa, B:72:0x0103, B:73:0x0109, B:75:0x0129, B:76:0x0139, B:78:0x019c, B:79:0x01c9), top: B:86:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x019c A[Catch: all -> 0x01d5, TryCatch #0 {all -> 0x01d5, blocks: (B:51:0x000c, B:55:0x00bc, B:58:0x00c6, B:60:0x00d8, B:62:0x00e0, B:65:0x00eb, B:68:0x00f4, B:70:0x00fa, B:72:0x0103, B:73:0x0109, B:75:0x0129, B:76:0x0139, B:78:0x019c, B:79:0x01c9), top: B:86:0x000c }] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m49483b(int r10) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.tracker.network.NetworkMonitor.m49483b(int):void");
    }

    /* renamed from: a */
    public final void m49500a() {
        this.f59811v = SystemClock.elapsedRealtime();
    }

    /* renamed from: a */
    public final void m49486a(List<InetAddress> list) {
        this.f59812w = SystemClock.elapsedRealtime();
        this.f59777H = list;
    }

    /* renamed from: a */
    public final void m49487a(InetSocketAddress inetSocketAddress, Proxy proxy) {
        this.f59813x = SystemClock.elapsedRealtime();
        this.f59778I = inetSocketAddress;
        this.f59779J = proxy;
        this.f59783N = true;
    }

    /* renamed from: a */
    public final void m49495a(Handshake handshake) {
        this.f59780K = handshake;
    }

    /* renamed from: a */
    public final void m49494a(Protocol protocol, IOException iOException) {
        this.f59814y = SystemClock.elapsedRealtime();
        this.f59781L = protocol;
        this.f59782M = iOException;
    }

    /* renamed from: a */
    public final void m49496a(Connection connection) {
        this.f59802m = !this.f59783N;
        if (!this.f59802m || connection == null) {
            return;
        }
        try {
            this.f59781L = connection.protocol();
            Route route = connection.route();
            if (route != null) {
                this.f59778I = route.socketAddress();
                this.f59779J = route.proxy();
            }
            this.f59780K = connection.handshake();
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                SameLogTool.m51823b("NetworkMonitor", "connectionAcquired ", e);
            }
        }
    }

    /* renamed from: a */
    public final void m49493a(Request request) {
        this.f59770A = SystemClock.elapsedRealtime();
    }

    /* renamed from: a */
    public final void m49492a(Response response) {
        this.f59774E = SystemClock.elapsedRealtime();
        if (response != null) {
            try {
                Headers headers = response.headers();
                if (headers != null) {
                    String str = headers.get("Content-Type");
                    if (TextUtils.isEmpty(str)) {
                        str = "";
                    }
                    this.f59804o = str;
                }
            } catch (Exception e) {
                this.f59804o = "unknown";
                if (MBridgeConstans.DEBUG) {
                    SameLogTool.m51823b("NetworkMonitor", "responseHeadersEnd ", e);
                }
            }
        }
    }

    /* renamed from: a */
    public final void m49491a(IOException iOException) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f59809t = elapsedRealtime;
        this.f59810u = iOException;
        if (iOException != null) {
            if (this.f59811v == 0) {
                this.f59811v = elapsedRealtime;
            }
            if (this.f59812w == 0) {
                this.f59812w = elapsedRealtime;
            }
            if (this.f59813x == 0) {
                this.f59813x = elapsedRealtime;
            }
            if (this.f59814y == 0) {
                this.f59814y = elapsedRealtime;
            }
            if (this.f59815z == 0) {
                this.f59815z = elapsedRealtime;
            }
            if (this.f59770A == 0) {
                this.f59770A = elapsedRealtime;
            }
            if (this.f59771B == 0) {
                this.f59771B = elapsedRealtime;
            }
            if (this.f59772C == 0) {
                this.f59772C = elapsedRealtime;
            }
            if (this.f59773D == 0) {
                this.f59773D = elapsedRealtime;
            }
            if (this.f59774E == 0) {
                this.f59774E = elapsedRealtime;
            }
            if (this.f59775F == 0) {
                this.f59775F = elapsedRealtime;
            }
            if (this.f59776G == 0) {
                this.f59776G = elapsedRealtime;
            }
        }
    }

    /* renamed from: a */
    private static String m49488a(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder();
        Object[] objArr = new Object[1];
        if (TextUtils.isEmpty(str2)) {
            str2 = "IOException";
        }
        objArr[0] = str2;
        sb2.append(String.format(str, objArr));
        sb2.append(TextUtils.isEmpty(str3) ? "" : str3.replaceAll("[\\n\\r]", " "));
        return sb2.toString();
    }

    /* renamed from: a */
    public final void m49490a(Exception exc) {
        this.f59784O = exc;
    }

    /* renamed from: a */
    private static C22885e m49485a(JSONObject jSONObject, String str) {
        C22885e c22885e = new C22885e(str);
        c22885e.m49598b(0);
        c22885e.m49605a(0);
        c22885e.m49603a(EventLibraryCommon.m52108c());
        c22885e.m49601a(jSONObject);
        return c22885e;
    }
}
