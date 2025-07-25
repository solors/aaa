package com.ironsource.mediationsdk;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.ironsource.C19897f5;
import com.ironsource.C20028h5;
import com.ironsource.C20086i9;
import com.ironsource.C21218xa;
import com.ironsource.InterfaceC20244l4;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.C20348d;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceAES;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.learnings.purchase.event.EventUploader;
import com.mbridge.msdk.newreward.function.common.MBridgeCommon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.e */
/* loaded from: classes6.dex */
public class C20400e {

    /* renamed from: a */
    private final String f51547a = "1";

    /* renamed from: b */
    private final String f51548b = MBridgeCommon.DYNAMIC_VIEW_TEMPLATE_VALUE;

    /* renamed from: c */
    private final String f51549c = MBridgeCommon.DYNAMIC_VIEW_TEMPLATE_VALUE;

    /* renamed from: d */
    private final String f51550d = "GenericNotifications";

    /* renamed from: e */
    private C20402f f51551e;

    /* renamed from: f */
    private IronSource.AD_UNIT f51552f;

    /* renamed from: g */
    private C20028h5 f51553g;

    /* renamed from: h */
    private InterfaceC20244l4 f51554h;

    /* renamed from: i */
    private ISBannerSize f51555i;

    /* renamed from: com.ironsource.mediationsdk.e$a */
    /* loaded from: classes6.dex */
    public static class RunnableC20401a implements Runnable {

        /* renamed from: a */
        protected WeakReference<InterfaceC20244l4> f51556a;

        /* renamed from: b */
        protected C20348d.C20349a f51557b;

        /* renamed from: c */
        protected int f51558c;

        /* renamed from: d */
        protected String f51559d;

        /* renamed from: e */
        protected long f51560e;

        /* renamed from: f */
        protected int f51561f;

        /* renamed from: h */
        private int f51563h;

        /* renamed from: k */
        private final URL f51566k;

        /* renamed from: l */
        private final JSONObject f51567l;

        /* renamed from: m */
        private final boolean f51568m;

        /* renamed from: n */
        private final int f51569n;

        /* renamed from: o */
        private final long f51570o;

        /* renamed from: p */
        private final boolean f51571p;

        /* renamed from: q */
        private final boolean f51572q;

        /* renamed from: g */
        protected String f51562g = "other";

        /* renamed from: i */
        protected String f51564i = "";

        /* renamed from: j */
        protected int f51565j = 0;

        public RunnableC20401a(InterfaceC20244l4 interfaceC20244l4, URL url, JSONObject jSONObject, boolean z, int i, long j, boolean z2, boolean z3, int i2) {
            this.f51556a = new WeakReference<>(interfaceC20244l4);
            this.f51566k = url;
            this.f51567l = jSONObject;
            this.f51568m = z;
            this.f51569n = i;
            this.f51570o = j;
            this.f51571p = z2;
            this.f51572q = z3;
            this.f51563h = i2;
        }

        /* renamed from: a */
        private String m56874a() {
            return this.f51563h == 2 ? C21218xa.m54153b().m54151d() : C21218xa.m54153b().m54152c();
        }

        /* renamed from: b */
        private JSONObject m56864b(String str, String str2) throws JSONException {
            IronLog.INTERNAL.verbose("decrypting and decompressing auction response");
            String decryptAndDecompress = IronSourceAES.decryptAndDecompress(str, str2);
            if (decryptAndDecompress != null) {
                return new JSONObject(decryptAndDecompress);
            }
            throw new JSONException("decompression error");
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean m56865b = m56865b();
            InterfaceC20244l4 interfaceC20244l4 = this.f51556a.get();
            if (interfaceC20244l4 == null) {
                return;
            }
            mo56866a(m56865b, interfaceC20244l4, new Date().getTime() - this.f51560e);
        }

        /* renamed from: a */
        private String m56870a(HttpURLConnection httpURLConnection) throws IOException {
            InputStreamReader inputStreamReader = new InputStreamReader(httpURLConnection.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    bufferedReader.close();
                    inputStreamReader.close();
                    return sb2.toString();
                }
                sb2.append(readLine);
            }
        }

        /* renamed from: b */
        protected boolean m56865b() {
            long time;
            int responseCode;
            String str;
            this.f51560e = new Date().getTime();
            try {
                this.f51563h = this.f51565j == 1015 ? 1 : this.f51563h;
                this.f51561f = 0;
                HttpURLConnection httpURLConnection = null;
                while (true) {
                    int i = this.f51561f;
                    int i2 = this.f51569n;
                    if (i >= i2) {
                        this.f51561f = i2 - 1;
                        this.f51562g = "trials_fail";
                        return false;
                    }
                    try {
                        time = new Date().getTime();
                        String str2 = "Auction Handler: auction trial " + (this.f51561f + 1) + " out of " + this.f51569n + " max trials";
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, str2, 0);
                        IronSourceUtils.sendAutomationLog(str2);
                        httpURLConnection = m56868a(this.f51566k, this.f51570o);
                        m56869a(httpURLConnection, this.f51567l, this.f51571p);
                        responseCode = httpURLConnection.getResponseCode();
                    } catch (SocketTimeoutException e) {
                        C20086i9.m57997d().m58003a(e);
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        this.f51558c = 1006;
                        this.f51559d = "Connection timed out";
                        IronLog.INTERNAL.error("Auction socket timeout exception " + e.getMessage());
                    } catch (Throwable th) {
                        C20086i9.m57997d().m58003a(th);
                        IronLog.INTERNAL.error("getting exception " + th);
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        this.f51558c = 1000;
                        this.f51559d = th.getMessage();
                        this.f51562g = "other";
                        return false;
                    }
                    if (responseCode == 200 || responseCode == 204) {
                        try {
                            m56871a(m56870a(httpURLConnection), this.f51568m, this.f51572q);
                            httpURLConnection.disconnect();
                            return true;
                        } catch (JSONException e2) {
                            C20086i9.m57997d().m58003a(e2);
                            if (e2.getMessage() != null && e2.getMessage().equalsIgnoreCase("decryption error")) {
                                this.f51558c = 1003;
                                str = "Auction decryption error";
                            } else if (e2.getMessage() == null || !e2.getMessage().equalsIgnoreCase("decompression error")) {
                                this.f51558c = 1002;
                                str = "Auction parsing error";
                            } else {
                                this.f51558c = 1008;
                                str = "Auction decompression error";
                            }
                            this.f51559d = str;
                            this.f51562g = "parsing";
                            IronLog.INTERNAL.error("Auction handle response exception " + e2.getMessage());
                            httpURLConnection.disconnect();
                            return false;
                        }
                    }
                    this.f51558c = 1001;
                    String str3 = "Auction response code not valid, error code response from server - " + responseCode;
                    this.f51559d = str3;
                    IronLog.INTERNAL.error(str3);
                    httpURLConnection.disconnect();
                    if (this.f51561f < this.f51569n - 1) {
                        m56873a(this.f51570o, time);
                    }
                    this.f51561f++;
                }
            } catch (Exception e3) {
                C20086i9.m57997d().m58003a(e3);
                this.f51558c = 1007;
                this.f51559d = e3.getMessage();
                this.f51561f = 0;
                this.f51562g = "other";
                IronLog.INTERNAL.error("Auction request exception " + e3.getMessage());
                return false;
            }
        }

        /* renamed from: a */
        private HttpURLConnection m56868a(URL url, long j) throws IOException {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", EventUploader.MEDIA_TYPE_JSON);
            httpURLConnection.setReadTimeout((int) j);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(true);
            return httpURLConnection;
        }

        /* renamed from: a */
        private JSONObject m56872a(String str, String str2) throws JSONException {
            String decode = IronSourceAES.decode(str, str2);
            if (TextUtils.isEmpty(decode)) {
                throw new JSONException("decryption error");
            }
            return new JSONObject(decode);
        }

        /* renamed from: a */
        protected JSONObject m56867a(JSONObject jSONObject, boolean z) throws JSONException {
            String m56874a = m56874a();
            String string = jSONObject.getString(this.f51563h == 2 ? "ct" : "response");
            return z ? m56864b(m56874a, string) : m56872a(m56874a, string);
        }

        /* renamed from: a */
        private void m56873a(long j, long j2) {
            long time = j - (new Date().getTime() - j2);
            if (time > 0) {
                SystemClock.sleep(time);
            }
        }

        /* renamed from: a */
        protected void m56871a(String str, boolean z, boolean z2) throws JSONException {
            if (TextUtils.isEmpty(str)) {
                throw new JSONException("empty response");
            }
            JSONObject jSONObject = new JSONObject(str);
            if (z) {
                jSONObject = m56867a(jSONObject, z2);
            }
            C20348d.C20349a m57012a = C20348d.m57010b().m57012a(jSONObject);
            this.f51557b = m57012a;
            this.f51558c = m57012a.m56996c();
            this.f51559d = this.f51557b.m56995d();
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0059  */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x006e  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x007b  */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void m56869a(java.net.HttpURLConnection r9, org.json.JSONObject r10, boolean r11) throws java.lang.Exception {
            /*
                r8 = this;
                java.io.OutputStream r9 = r9.getOutputStream()
                java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter
                java.lang.String r1 = "UTF-8"
                r0.<init>(r9, r1)
                java.io.BufferedWriter r1 = new java.io.BufferedWriter
                r1.<init>(r0)
                int r2 = r8.f51563h
                r3 = 1
                r4 = 2
                if (r2 != r4) goto L4d
                com.ironsource.xa r2 = com.ironsource.C21218xa.m54153b()     // Catch: org.json.JSONException -> L1f
                java.lang.String r2 = r2.m54155a()     // Catch: org.json.JSONException -> L1f
                goto L4f
            L1f:
                r2 = move-exception
                com.ironsource.i9 r5 = com.ironsource.C20086i9.m57997d()
                r5.m58003a(r2)
                java.lang.String r5 = r2.getLocalizedMessage()
                r8.f51564i = r5
                r5 = 1015(0x3f7, float:1.422E-42)
                r8.f51565j = r5
                r8.f51563h = r3
                com.ironsource.mediationsdk.logger.IronLog r5 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = "get encrypted session key exception "
                r6.append(r7)
                java.lang.String r2 = r2.getMessage()
                r6.append(r2)
                java.lang.String r2 = r6.toString()
                r5.error(r2)
            L4d:
                java.lang.String r2 = ""
            L4f:
                java.lang.String r10 = r10.toString()
                java.lang.String r5 = r8.m56874a()
                if (r11 == 0) goto L65
                com.ironsource.mediationsdk.logger.IronLog r11 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
                java.lang.String r6 = "compressing and encrypting auction request"
                r11.verbose(r6)
                java.lang.String r10 = com.ironsource.mediationsdk.utils.IronSourceAES.compressAndEncrypt(r5, r10)
                goto L69
            L65:
                java.lang.String r10 = com.ironsource.mediationsdk.utils.IronSourceAES.encode(r5, r10)
            L69:
                int r11 = r8.f51563h
                r5 = 0
                if (r11 != r4) goto L7b
                java.lang.Object[] r11 = new java.lang.Object[r4]
                r11[r5] = r2
                r11[r3] = r10
                java.lang.String r10 = "{\"sk\" : \"%1$s\", \"ct\" : \"%2$s\"}"
                java.lang.String r10 = java.lang.String.format(r10, r11)
                goto L85
            L7b:
                java.lang.Object[] r11 = new java.lang.Object[r3]
                r11[r5] = r10
                java.lang.String r10 = "{\"request\" : \"%1$s\"}"
                java.lang.String r10 = java.lang.String.format(r10, r11)
            L85:
                r1.write(r10)
                r1.flush()
                r1.close()
                r0.close()
                r9.close()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C20400e.RunnableC20401a.m56869a(java.net.HttpURLConnection, org.json.JSONObject, boolean):void");
        }

        /* renamed from: a */
        protected void mo56866a(boolean z, InterfaceC20244l4 interfaceC20244l4, long j) {
            if (z) {
                interfaceC20244l4.mo56434a(this.f51557b.m56991h(), this.f51557b.m57007a(), this.f51557b.m56994e(), this.f51557b.m56993f(), this.f51557b.m56998b(), this.f51561f + 1, j, this.f51565j, this.f51564i);
            } else {
                interfaceC20244l4.mo56457a(this.f51558c, this.f51559d, this.f51561f + 1, this.f51562g, j);
            }
        }
    }

    @Deprecated
    public C20400e(IronSource.AD_UNIT ad_unit, C20028h5 c20028h5, InterfaceC20244l4 interfaceC20244l4) {
        this.f51552f = ad_unit;
        this.f51553g = c20028h5;
        this.f51554h = interfaceC20244l4;
    }

    /* renamed from: a */
    private JSONObject m56876a(Map<String, Object> map, List<String> list, C20404h c20404h, int i, boolean z, IronSourceSegment ironSourceSegment) throws JSONException {
        C20406i c20406i = new C20406i(this.f51552f);
        c20406i.m56847a(map);
        c20406i.m56848a(list);
        c20406i.m56853a(c20404h);
        c20406i.m56857a(i);
        c20406i.m56856a(this.f51555i);
        c20406i.m56854a(ironSourceSegment);
        c20406i.m56843b(z);
        return C20348d.m57010b().m57018a(c20406i);
    }

    public C20400e(C20402f c20402f) {
        this.f51551e = c20402f;
    }

    /* renamed from: a */
    public void m56882a(Context context, C20406i c20406i, InterfaceC20244l4 interfaceC20244l4) {
        try {
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.f51551e.mo56861a(context, c20406i, interfaceC20244l4));
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("execute auction exception " + e.getMessage());
            if (interfaceC20244l4 != null) {
                interfaceC20244l4.mo56457a(1000, e.getMessage(), 0, "other", 0L);
            }
        }
    }

    @Deprecated
    /* renamed from: a */
    public void m56881a(Context context, Map<String, Object> map, List<String> list, C20404h c20404h, int i, IronSourceSegment ironSourceSegment) {
        try {
            boolean isEncryptedResponse = IronSourceUtils.isEncryptedResponse();
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new RunnableC20401a(this.f51554h, new URL(this.f51553g.m58298a(false)), m56876a(map, list, c20404h, i, isEncryptedResponse, ironSourceSegment), isEncryptedResponse, this.f51553g.m58292g(), this.f51553g.m58286m(), this.f51553g.m58285n(), this.f51553g.m58284o(), this.f51553g.m58295d()));
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("execute auction exception " + e.getMessage());
            this.f51554h.mo56457a(1000, e.getMessage(), 0, "other", 0L);
        }
    }

    @Deprecated
    /* renamed from: a */
    public void m56880a(Context context, Map<String, Object> map, List<String> list, C20404h c20404h, int i, IronSourceSegment ironSourceSegment, ISBannerSize iSBannerSize) {
        this.f51555i = iSBannerSize;
        m56881a(context, map, list, c20404h, i, ironSourceSegment);
    }

    /* renamed from: a */
    public void m56879a(C19897f5 c19897f5, int i, C19897f5 c19897f52) {
        for (String str : c19897f5.m58646g()) {
            C20348d.m57010b().m57013a("reportLoadSuccess", c19897f5.m58650c(), C20348d.m57010b().m57016a(str, i, c19897f5, "", "", ""));
        }
        if (c19897f52 != null) {
            for (String str2 : c19897f52.m58646g()) {
                C20348d.m57010b().m57013a("reportLoadSuccess", "GenericNotifications", C20348d.m57010b().m57016a(str2, i, c19897f5, "", MBridgeCommon.DYNAMIC_VIEW_TEMPLATE_VALUE, ""));
            }
        }
    }

    /* renamed from: a */
    public void m56878a(C19897f5 c19897f5, int i, C19897f5 c19897f52, String str) {
        for (String str2 : c19897f5.m58651b()) {
            C20348d.m57010b().m57013a("reportImpression", c19897f5.m58650c(), C20348d.m57010b().m57016a(str2, i, c19897f5, "", "", str));
        }
        if (c19897f52 != null) {
            for (String str3 : c19897f52.m58651b()) {
                C20348d.m57010b().m57013a("reportImpression", "GenericNotifications", C20348d.m57010b().m57016a(str3, i, c19897f5, "", MBridgeCommon.DYNAMIC_VIEW_TEMPLATE_VALUE, str));
            }
        }
    }

    /* renamed from: a */
    public void m56877a(ArrayList<String> arrayList, ConcurrentHashMap<String, C19897f5> concurrentHashMap, int i, C19897f5 c19897f5, C19897f5 c19897f52) {
        int m58644i = c19897f52.m58644i();
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (!next.equals(c19897f52.m58650c())) {
                C19897f5 c19897f53 = concurrentHashMap.get(next);
                int m58644i2 = c19897f53.m58644i();
                String m58645h = c19897f53.m58645h();
                String str = m58644i2 < m58644i ? "1" : MBridgeCommon.DYNAMIC_VIEW_TEMPLATE_VALUE;
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("instance=" + c19897f53.m58650c() + ", instancePriceOrder= " + m58644i2 + ", loseReasonCode=" + str + ", winnerInstance=" + c19897f52.m58650c() + ", winnerInstancePriceOrder=" + m58644i);
                for (String str2 : c19897f53.m58647f()) {
                    C20348d.m57010b().m57013a("reportAuctionLose", c19897f53.m58650c(), C20348d.m57010b().m57016a(str2, i, c19897f52, m58645h, str, ""));
                }
            }
        }
        if (c19897f5 != null) {
            for (String str3 : c19897f5.m58647f()) {
                C20348d.m57010b().m57013a("reportAuctionLose", "GenericNotifications", C20348d.m57010b().m57016a(str3, i, c19897f52, "", MBridgeCommon.DYNAMIC_VIEW_TEMPLATE_VALUE, ""));
            }
        }
    }

    /* renamed from: a */
    public void m56875a(CopyOnWriteArrayList<AbstractC20465y> copyOnWriteArrayList, ConcurrentHashMap<String, C19897f5> concurrentHashMap, int i, C19897f5 c19897f5, C19897f5 c19897f52) {
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<AbstractC20465y> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().mo56362c());
        }
        m56877a(arrayList, concurrentHashMap, i, c19897f5, c19897f52);
    }

    /* renamed from: a */
    public boolean m56883a() {
        return this.f51551e.mo56862a();
    }
}
