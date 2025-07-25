package com.bytedance.sdk.component.p257iR.p259bX;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.p228IL.p229bg.AbstractC7189Lq;
import com.bytedance.sdk.component.p228IL.p229bg.AbstractC7191Ta;
import com.bytedance.sdk.component.p257iR.eqN.C7641zx;
import java.net.InetAddress;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.sdk.component.iR.bX.ldr */
/* loaded from: classes3.dex */
public class C7625ldr {

    /* renamed from: Kg */
    private C7627zx f16641Kg;

    /* renamed from: bX */
    private C7619bg f16647bX;
    private boolean eqN;

    /* renamed from: iR */
    private Context f16650iR;
    private int tuV;

    /* renamed from: zx */
    private InterfaceC7616IL f16652zx;

    /* renamed from: IL */
    private long f16640IL = 0;
    private boolean ldr = false;

    /* renamed from: WR */
    private int f16646WR = 0;

    /* renamed from: eo */
    private long f16649eo = 19700101000L;

    /* renamed from: VB */
    private int f16645VB = 0;

    /* renamed from: PX */
    private HashMap<String, Integer> f16643PX = new HashMap<>();

    /* renamed from: Ta */
    private HashMap<String, Integer> f16644Ta = new HashMap<>();
    private int yDt = 0;

    /* renamed from: Lq */
    private HashMap<String, Integer> f16642Lq = new HashMap<>();

    /* renamed from: vb */
    private HashMap<String, Integer> f16651vb = new HashMap<>();
    private boolean xxp = true;
    private Map<String, Integer> VzQ = new HashMap();

    /* renamed from: bg */
    Handler f16648bg = new Handler(Looper.getMainLooper()) { // from class: com.bytedance.sdk.component.iR.bX.ldr.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            boolean z;
            if (message.what == 10000) {
                if (message.arg1 == 0) {
                    z = false;
                } else {
                    z = true;
                }
                C7625ldr.this.m88342IL(z);
            }
        }
    };

    private C7625ldr() {
    }

    /* renamed from: WR */
    private void m88340WR() {
        SharedPreferences sharedPreferences = this.f16650iR.getSharedPreferences(m88337bg(), 0);
        this.f16646WR = sharedPreferences.getInt("tnc_probe_cmd", 0);
        this.f16649eo = sharedPreferences.getLong("tnc_probe_version", 19700101000L);
    }

    /* renamed from: bg */
    private boolean m88336bg(int i) {
        return i >= 200 && i < 400;
    }

    /* renamed from: eo */
    private void m88325eo() {
        this.f16645VB = 0;
        this.f16643PX.clear();
        this.f16644Ta.clear();
        this.yDt = 0;
        this.f16642Lq.clear();
        this.f16651vb.clear();
    }

    /* renamed from: IL */
    public C7619bg m88345IL() {
        return this.f16647bX;
    }

    /* renamed from: Kg */
    public C7627zx m88341Kg() {
        return this.f16641Kg;
    }

    /* renamed from: bX */
    public boolean m88339bX() {
        return this.eqN;
    }

    public InterfaceC7616IL eqN() {
        return this.f16652zx;
    }

    /* renamed from: iR */
    public Map<String, String> m88324iR() {
        C7623eqN ldr = ldr();
        if (ldr != null) {
            return ldr.eqN;
        }
        return null;
    }

    public C7623eqN ldr() {
        C7627zx c7627zx = this.f16641Kg;
        if (c7627zx != null) {
            return c7627zx.m88320bX();
        }
        return null;
    }

    /* renamed from: zx */
    public void m88323zx() {
        this.VzQ.clear();
    }

    /* renamed from: IL */
    private void m88343IL(String str) {
        Map<String, String> m88324iR;
        if (TextUtils.isEmpty(str) || (m88324iR = m88324iR()) == null || !m88324iR.containsValue(str)) {
            return;
        }
        if (this.VzQ.get(str) == null) {
            this.VzQ.put(str, 1);
        } else {
            this.VzQ.put(str, Integer.valueOf(this.VzQ.get(str).intValue() + 1));
        }
    }

    /* renamed from: bX */
    private void m88338bX(String str) {
        if (!TextUtils.isEmpty(str) && this.VzQ.containsKey(str)) {
            this.VzQ.put(str, 0);
        }
    }

    private boolean eqN(String str) {
        Map<String, String> m88324iR = m88324iR();
        if (m88324iR == null) {
            return false;
        }
        String str2 = m88324iR.get(str);
        return (TextUtils.isEmpty(str2) || this.VzQ.get(str2) == null || this.VzQ.get(str2).intValue() < 3) ? false : true;
    }

    /* renamed from: bg */
    public String m88337bg() {
        return "ttnet_tnc_config" + this.tuV;
    }

    /* renamed from: bg */
    public void m88327bg(boolean z) {
        this.eqN = z;
    }

    /* renamed from: bg */
    public void m88330bg(InterfaceC7616IL interfaceC7616IL) {
        this.f16652zx = interfaceC7616IL;
    }

    /* renamed from: bg */
    public synchronized void m88335bg(Context context, boolean z) {
        if (!this.ldr) {
            this.f16650iR = context;
            this.xxp = z;
            this.f16641Kg = new C7627zx(context, z, this.tuV);
            if (z) {
                m88340WR();
            }
            this.f16647bX = C7617Kg.m88372bg().m88370bg(this.tuV, this.f16650iR);
            this.ldr = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: IL */
    public void m88342IL(boolean z) {
        C7623eqN ldr = ldr();
        if (ldr == null) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (z || this.f16640IL + (ldr.f16632VB * 1000) <= elapsedRealtime) {
            this.f16640IL = elapsedRealtime;
            C7617Kg.m88372bg().m88370bg(this.tuV, this.f16650iR).m88362bX();
        }
    }

    /* renamed from: IL */
    private boolean m88344IL(int i) {
        if (i < 100 || i >= 1000) {
            return true;
        }
        C7623eqN ldr = ldr();
        return (ldr == null || TextUtils.isEmpty(ldr.f16631Ta) || !ldr.f16631Ta.contains(String.valueOf(i))) ? false : true;
    }

    /* renamed from: bg */
    public String m88328bg(String str) {
        String str2;
        Map<String, String> m88324iR;
        if (TextUtils.isEmpty(str) || str.contains("/network/get_network") || str.contains("/get_domains/v4") || str.contains("/ies/speed")) {
            return str;
        }
        String str3 = null;
        try {
            URL url = new URL(str);
            str2 = url.getProtocol();
            try {
                str3 = url.getHost();
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            str2 = null;
        }
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        if ((!"http".equals(str2) && !"https".equals(str2)) || TextUtils.isEmpty(str3) || eqN(str3) || (m88324iR = m88324iR()) == null || !m88324iR.containsKey(str3)) {
            return str;
        }
        String str4 = m88324iR.get(str3);
        if (TextUtils.isEmpty(str4)) {
            return str;
        }
        String str5 = str2 + "://" + str3;
        return str.startsWith(str5) ? str.replaceFirst(str5, str2 + "://" + str4) : str;
    }

    public C7625ldr(int i) {
        this.tuV = i;
    }

    /* renamed from: bg */
    public synchronized void m88332bg(AbstractC7191Ta abstractC7191Ta, AbstractC7189Lq abstractC7189Lq) {
        URL url;
        if (abstractC7191Ta == null || abstractC7189Lq == null) {
            return;
        }
        if (this.xxp) {
            if (C7641zx.m88296bg(this.f16650iR)) {
                try {
                    url = abstractC7191Ta.mo89647IL().m89595bg();
                } catch (Exception unused) {
                    url = null;
                }
                if (url == null) {
                    return;
                }
                String protocol = url.getProtocol();
                String host = url.getHost();
                String path = url.getPath();
                String m88333bg = m88333bg(abstractC7191Ta);
                int mo89611bX = abstractC7189Lq.mo89611bX();
                if ("http".equals(protocol) || "https".equals(protocol)) {
                    if (TextUtils.isEmpty(m88333bg)) {
                        return;
                    }
                    C7623eqN ldr = ldr();
                    if (ldr != null && ldr.f16627IL) {
                        m88334bg(abstractC7189Lq, host);
                    }
                    if (ldr == null) {
                        return;
                    }
                    this.f16643PX.size();
                    this.f16644Ta.size();
                    this.f16642Lq.size();
                    this.f16651vb.size();
                    if (mo89611bX > 0) {
                        if (m88336bg(mo89611bX)) {
                            if (this.f16645VB > 0 || this.yDt > 0) {
                                m88325eo();
                            }
                            m88338bX(host);
                        } else if (!m88344IL(mo89611bX)) {
                            this.yDt++;
                            this.f16642Lq.put(path, 0);
                            this.f16651vb.put(m88333bg, 0);
                            if (this.yDt >= ldr.f16628Kg && this.f16642Lq.size() >= ldr.f16633WR && this.f16651vb.size() >= ldr.f16636eo) {
                                m88326bg(false, 0L);
                                m88325eo();
                            }
                            m88343IL(host);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: bg */
    private String m88333bg(AbstractC7191Ta abstractC7191Ta) {
        if (abstractC7191Ta == null || abstractC7191Ta.mo89647IL() == null) {
            return "";
        }
        if (abstractC7191Ta.mo89647IL().m89595bg() != null) {
            try {
            } catch (Exception unused) {
                return "";
            }
        }
        return InetAddress.getByName(abstractC7191Ta.mo89647IL().m89595bg().getHost()).getHostAddress();
    }

    /* renamed from: bg */
    public synchronized void m88331bg(AbstractC7191Ta abstractC7191Ta, Exception exc) {
        URL url;
        if (abstractC7191Ta != null) {
            if (abstractC7191Ta.mo89647IL() != null && exc != null) {
                if (this.xxp) {
                    if (C7641zx.m88296bg(this.f16650iR)) {
                        try {
                            url = abstractC7191Ta.mo89647IL().m89595bg();
                        } catch (Exception unused) {
                            url = null;
                        }
                        if (url == null) {
                            return;
                        }
                        String protocol = url.getProtocol();
                        String host = url.getHost();
                        String path = url.getPath();
                        String m88333bg = m88333bg(abstractC7191Ta);
                        if ("http".equals(protocol) || "https".equals(protocol)) {
                            C7623eqN ldr = ldr();
                            if (ldr == null) {
                                return;
                            }
                            this.f16643PX.size();
                            this.f16644Ta.size();
                            this.f16642Lq.size();
                            this.f16651vb.size();
                            this.f16645VB++;
                            this.f16643PX.put(path, 0);
                            this.f16644Ta.put(m88333bg, 0);
                            if (this.f16645VB >= ldr.f16638zx && this.f16643PX.size() >= ldr.ldr && this.f16644Ta.size() >= ldr.f16637iR) {
                                m88326bg(false, 0L);
                                m88325eo();
                            }
                            m88343IL(host);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003d  */
    /* renamed from: bg */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m88334bg(com.bytedance.sdk.component.p228IL.p229bg.AbstractC7189Lq r9, java.lang.String r10) {
        /*
            r8 = this;
            if (r9 != 0) goto L3
            return
        L3:
            boolean r10 = r8.xxp
            if (r10 != 0) goto L8
            return
        L8:
            java.lang.String r10 = "tnc-cmd"
            r0 = 0
            java.lang.String r9 = r9.mo89608bg(r10, r0)
            boolean r10 = android.text.TextUtils.isEmpty(r9)
            if (r10 == 0) goto L16
            return
        L16:
            java.lang.String r10 = "@"
            java.lang.String[] r9 = r9.split(r10)
            if (r9 == 0) goto L83
            int r10 = r9.length
            r0 = 2
            if (r10 == r0) goto L23
            goto L83
        L23:
            r10 = 1
            r0 = 0
            r2 = 0
            r3 = r9[r2]     // Catch: java.lang.Throwable -> L34
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.Throwable -> L34
            r9 = r9[r10]     // Catch: java.lang.Throwable -> L35
            long r4 = java.lang.Long.parseLong(r9)     // Catch: java.lang.Throwable -> L35
            goto L36
        L34:
            r3 = r2
        L35:
            r4 = r0
        L36:
            long r6 = r8.f16649eo
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 > 0) goto L3d
            return
        L3d:
            r8.f16646WR = r3
            r8.f16649eo = r4
            android.content.Context r9 = r8.f16650iR
            java.lang.String r6 = r8.m88337bg()
            android.content.SharedPreferences r9 = r9.getSharedPreferences(r6, r2)
            android.content.SharedPreferences$Editor r9 = r9.edit()
            java.lang.String r2 = "tnc_probe_cmd"
            android.content.SharedPreferences$Editor r9 = r9.putInt(r2, r3)
            java.lang.String r2 = "tnc_probe_version"
            android.content.SharedPreferences$Editor r9 = r9.putLong(r2, r4)
            r9.apply()
            int r9 = r8.f16646WR
            r2 = 10000(0x2710, float:1.4013E-41)
            if (r9 != r2) goto L83
            com.bytedance.sdk.component.iR.bX.eqN r9 = r8.ldr()
            if (r9 != 0) goto L6b
            return
        L6b:
            java.util.Random r2 = new java.util.Random
            long r3 = java.lang.System.currentTimeMillis()
            r2.<init>(r3)
            int r9 = r9.f16630PX
            if (r9 <= 0) goto L80
            int r9 = r2.nextInt(r9)
            long r0 = (long) r9
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
        L80:
            r8.m88326bg(r10, r0)
        L83:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.p257iR.p259bX.C7625ldr.m88334bg(com.bytedance.sdk.component.IL.bg.Lq, java.lang.String):void");
    }

    /* renamed from: bg */
    private void m88326bg(boolean z, long j) {
        if (this.f16648bg.hasMessages(10000)) {
            return;
        }
        Message obtainMessage = this.f16648bg.obtainMessage();
        obtainMessage.what = 10000;
        obtainMessage.arg1 = z ? 1 : 0;
        if (j > 0) {
            this.f16648bg.sendMessageDelayed(obtainMessage, j);
        } else {
            this.f16648bg.sendMessage(obtainMessage);
        }
    }
}
