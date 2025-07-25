package com.bytedance.sdk.component.p257iR.p259bX;

import android.content.Context;
import android.content.SharedPreferences;
import android.location.Address;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.amazon.device.ads.DtbConstants;
import com.appsflyer.AppsFlyerProperties;
import com.bytedance.sdk.component.p233Kg.p237bg.C7246bg;
import com.bytedance.sdk.component.p257iR.C7608IL;
import com.bytedance.sdk.component.p257iR.C7628bg;
import com.bytedance.sdk.component.p257iR.eqN.C7641zx;
import com.bytedance.sdk.component.p257iR.p258IL.AbstractC7611bX;
import com.bytedance.sdk.component.p257iR.p258IL.C7609IL;
import com.bytedance.sdk.component.p257iR.p260bg.AbstractC7632bg;
import com.bytedance.sdk.component.utils.C7748VzQ;
import com.bytedance.sdk.component.utils.JAA;
import com.ironsource.C21018tj;
import com.p552ot.pubsub.util.C26601v;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.component.iR.bX.bg */
/* loaded from: classes3.dex */
public class C7619bg implements JAA.InterfaceC7736bg {

    /* renamed from: Kg */
    private static boolean f16611Kg;

    /* renamed from: WR */
    private static InterfaceC7618bX f16612WR;

    /* renamed from: eo */
    private static ThreadPoolExecutor f16613eo;

    /* renamed from: IL */
    private final boolean f16614IL;

    /* renamed from: Lq */
    private int f16615Lq;

    /* renamed from: PX */
    private final Context f16616PX;
    private C7628bg yDt;

    /* renamed from: bX */
    private volatile boolean f16619bX = false;
    private boolean eqN = true;

    /* renamed from: zx */
    private boolean f16622zx = false;
    private long ldr = 0;

    /* renamed from: iR */
    private long f16621iR = 0;

    /* renamed from: VB */
    private AtomicBoolean f16618VB = new AtomicBoolean(false);

    /* renamed from: Ta */
    private volatile boolean f16617Ta = false;

    /* renamed from: bg */
    final JAA f16620bg = C7246bg.m89489bg().m89483bg(this, "tt-net");

    public C7619bg(Context context, int i) {
        this.f16616PX = context;
        this.f16614IL = C7748VzQ.m87853bg(context);
        this.f16615Lq = i;
    }

    /* renamed from: Kg */
    private boolean m88364Kg() {
        String[] ldr = ldr();
        if (ldr != null && ldr.length != 0) {
            m88359bg(0);
        }
        return false;
    }

    /* renamed from: WR */
    private C7628bg m88363WR() {
        if (this.yDt == null) {
            C7628bg.C7630bg c7630bg = new C7628bg.C7630bg();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            this.yDt = c7630bg.m88306bg(10L, timeUnit).m88310IL(10L, timeUnit).m88308bX(10L, timeUnit).m88307bg();
        }
        return this.yDt;
    }

    private void eqN(boolean z) {
        if (this.f16622zx) {
            return;
        }
        if (this.eqN) {
            this.eqN = false;
            this.ldr = 0L;
            this.f16621iR = 0L;
        }
        long j = z ? 360000L : C26601v.f69836c;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.ldr > j) {
            if (currentTimeMillis - this.f16621iR > UnityAdsConstants.Timeout.INIT_TIMEOUT_MS || !this.f16617Ta) {
                m88362bX();
            }
        }
    }

    /* renamed from: iR */
    public static ExecutorService m88349iR() {
        ExecutorService executorService;
        InterfaceC7618bX interfaceC7618bX = f16612WR;
        if (interfaceC7618bX != null) {
            executorService = interfaceC7618bX.getThreadPool();
        } else {
            executorService = null;
        }
        if (executorService != null) {
            return executorService;
        }
        if (f16613eo == null) {
            synchronized (C7619bg.class) {
                if (f16613eo == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 2, 20L, TimeUnit.SECONDS, new LinkedBlockingQueue());
                    f16613eo = threadPoolExecutor;
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                }
            }
        }
        return f16613eo;
    }

    /* renamed from: bX */
    public boolean m88362bX() {
        this.f16618VB.get();
        m88349iR().execute(new Runnable() { // from class: com.bytedance.sdk.component.iR.bX.bg.2
            {
                C7619bg.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean m88296bg = C7641zx.m88296bg(C7619bg.this.f16616PX);
                if (m88296bg) {
                    C7619bg.this.f16621iR = System.currentTimeMillis();
                    if (!C7619bg.this.f16618VB.compareAndSet(false, true)) {
                        return;
                    }
                    C7619bg.this.m88361bX(m88296bg);
                }
            }
        });
        return true;
    }

    public String[] ldr() {
        String[] strArr;
        if (C7617Kg.m88372bg().m88371bg(this.f16615Lq).eqN() != null) {
            strArr = C7617Kg.m88372bg().m88371bg(this.f16615Lq).eqN().ldr();
        } else {
            strArr = null;
        }
        if (strArr == null || strArr.length <= 0) {
            return new String[0];
        }
        return strArr;
    }

    /* renamed from: zx */
    public void m88348zx() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        try {
            if (this.f16614IL) {
                eqN();
            } else {
                m88369IL();
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: IL */
    public static void m88365IL(boolean z) {
        f16611Kg = z;
    }

    /* renamed from: bX */
    void m88361bX(boolean z) {
        eqN();
        this.f16622zx = true;
        if (!z) {
            this.f16620bg.sendEmptyMessage(102);
            return;
        }
        try {
            m88364Kg();
        } catch (Exception unused) {
            this.f16618VB.set(false);
        }
    }

    /* renamed from: IL */
    synchronized void m88369IL() {
        if (System.currentTimeMillis() - this.ldr > 3600000) {
            this.ldr = System.currentTimeMillis();
            try {
                if (C7617Kg.m88372bg().m88371bg(this.f16615Lq).m88341Kg() != null) {
                    C7617Kg.m88372bg().m88371bg(this.f16615Lq).m88341Kg().m88322IL();
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: bg */
    public void m88360bg() {
        m88350bg(false);
    }

    /* renamed from: bg */
    public synchronized void m88350bg(boolean z) {
        if (this.f16614IL) {
            eqN(z);
            return;
        }
        if (this.ldr <= 0) {
            try {
                m88349iR().execute(new Runnable() { // from class: com.bytedance.sdk.component.iR.bX.bg.1
                    {
                        C7619bg.this = this;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        C7619bg.this.m88369IL();
                    }
                });
            } catch (Throwable unused) {
            }
        }
    }

    public synchronized void eqN() {
        if (this.f16617Ta) {
            return;
        }
        this.f16617Ta = true;
        long j = this.f16616PX.getSharedPreferences("ss_app_config", 0).getLong("last_refresh_time", 0L);
        long currentTimeMillis = System.currentTimeMillis();
        if (j > currentTimeMillis) {
            j = currentTimeMillis;
        }
        this.ldr = j;
        try {
            if (C7617Kg.m88372bg().m88371bg(this.f16615Lq).m88341Kg() != null) {
                C7617Kg.m88372bg().m88371bg(this.f16615Lq).m88341Kg().m88319bg();
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: IL */
    public void m88368IL(int i) {
        JAA jaa = this.f16620bg;
        if (jaa != null) {
            jaa.sendEmptyMessage(i);
        }
    }

    @Override // com.bytedance.sdk.component.utils.JAA.InterfaceC7736bg
    /* renamed from: bg */
    public void mo83648bg(Message message) {
        int i = message.what;
        if (i == 101) {
            this.f16622zx = false;
            this.ldr = System.currentTimeMillis();
            if (this.eqN) {
                m88360bg();
            }
            this.f16618VB.set(false);
        } else if (i != 102) {
        } else {
            this.f16622zx = false;
            if (this.eqN) {
                m88360bg();
            }
            this.f16618VB.set(false);
        }
    }

    /* renamed from: bg */
    public boolean m88352bg(Object obj) throws Exception {
        JSONObject jSONObject;
        if (obj instanceof String) {
            String str = (String) obj;
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            jSONObject = new JSONObject(str);
            if (!"success".equals(jSONObject.getString("message"))) {
                return false;
            }
        } else {
            jSONObject = obj instanceof JSONObject ? (JSONObject) obj : null;
        }
        if (jSONObject == null) {
            return false;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        synchronized (this) {
            SharedPreferences.Editor edit = this.f16616PX.getSharedPreferences("ss_app_config", 0).edit();
            edit.putLong("last_refresh_time", System.currentTimeMillis());
            edit.apply();
        }
        if (C7617Kg.m88372bg().m88371bg(this.f16615Lq).m88341Kg() != null) {
            C7617Kg.m88372bg().m88371bg(this.f16615Lq).m88341Kg().m88318bg(jSONObject2);
            return true;
        }
        return true;
    }

    /* renamed from: bg */
    public void m88359bg(final int i) {
        String[] ldr = ldr();
        if (ldr != null && ldr.length > i) {
            String str = ldr[i];
            if (TextUtils.isEmpty(str)) {
                m88368IL(102);
                return;
            }
            try {
                String m88351bg = m88351bg(str);
                if (TextUtils.isEmpty(m88351bg)) {
                    m88368IL(102);
                    return;
                }
                C7609IL m88316bX = m88363WR().m88316bX();
                m88316bX.m88402IL(m88351bg);
                m88358bg(m88316bX);
                m88316bX.m88405bg(new AbstractC7632bg() { // from class: com.bytedance.sdk.component.iR.bX.bg.3
                    {
                        C7619bg.this = this;
                    }

                    @Override // com.bytedance.sdk.component.p257iR.p260bg.AbstractC7632bg
                    /* renamed from: bg */
                    public void mo83462bg(AbstractC7611bX abstractC7611bX, C7608IL c7608il) {
                        JSONObject jSONObject;
                        if (c7608il != null && c7608il.ldr()) {
                            String str2 = null;
                            try {
                                jSONObject = new JSONObject(c7608il.eqN());
                            } catch (Exception unused) {
                                jSONObject = null;
                            }
                            if (jSONObject == null) {
                                C7619bg.this.m88359bg(i + 1);
                                return;
                            }
                            try {
                                str2 = jSONObject.getString("message");
                            } catch (Exception unused2) {
                            }
                            if (!"success".equals(str2)) {
                                C7619bg.this.m88359bg(i + 1);
                                return;
                            }
                            try {
                                if (C7619bg.this.m88352bg(jSONObject)) {
                                    C7619bg.this.m88368IL(101);
                                    return;
                                } else {
                                    C7619bg.this.m88359bg(i + 1);
                                    return;
                                }
                            } catch (Exception unused3) {
                                return;
                            }
                        }
                        C7619bg.this.m88359bg(i + 1);
                    }

                    @Override // com.bytedance.sdk.component.p257iR.p260bg.AbstractC7632bg
                    /* renamed from: bg */
                    public void mo83461bg(AbstractC7611bX abstractC7611bX, IOException iOException) {
                        C7619bg.this.m88359bg(i + 1);
                    }
                });
                return;
            } catch (Throwable th) {
                th.toString();
                return;
            }
        }
        m88368IL(102);
    }

    /* renamed from: bg */
    private String m88351bg(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return DtbConstants.HTTPS + str + "/get_domains/v4/";
    }

    /* renamed from: bg */
    private void m88358bg(C7609IL c7609il) {
        if (c7609il == null) {
            return;
        }
        Address mo82328bg = C7617Kg.m88372bg().m88371bg(this.f16615Lq).eqN() != null ? C7617Kg.m88372bg().m88371bg(this.f16615Lq).eqN().mo82328bg(this.f16616PX) : null;
        if (mo82328bg != null && mo82328bg.hasLatitude() && mo82328bg.hasLongitude()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(mo82328bg.getLatitude());
            c7609il.m88404bg("latitude", sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append(mo82328bg.getLongitude());
            c7609il.m88404bg("longitude", sb3.toString());
            String locality = mo82328bg.getLocality();
            if (!TextUtils.isEmpty(locality)) {
                c7609il.m88404bg("city", Uri.encode(locality));
            }
        }
        if (this.f16619bX) {
            c7609il.m88404bg("force", "1");
        }
        try {
            c7609il.m88404bg("abi", Build.SUPPORTED_ABIS[0]);
        } catch (Throwable unused) {
        }
        if (C7617Kg.m88372bg().m88371bg(this.f16615Lq).eqN() != null) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(C7617Kg.m88372bg().m88371bg(this.f16615Lq).eqN().mo82329bg());
            c7609il.m88404bg(C21018tj.f53565b, sb4.toString());
            c7609il.m88404bg("device_platform", C7617Kg.m88372bg().m88371bg(this.f16615Lq).eqN().mo82330bX());
            c7609il.m88404bg(AppsFlyerProperties.CHANNEL, C7617Kg.m88372bg().m88371bg(this.f16615Lq).eqN().mo82331IL());
            StringBuilder sb5 = new StringBuilder();
            sb5.append(C7617Kg.m88372bg().m88371bg(this.f16615Lq).eqN().eqN());
            c7609il.m88404bg("version_code", sb5.toString());
            c7609il.m88404bg("custom_info_1", C7617Kg.m88372bg().m88371bg(this.f16615Lq).eqN().mo82325zx());
        }
    }

    /* renamed from: bg */
    public static void m88357bg(InterfaceC7618bX interfaceC7618bX) {
        f16612WR = interfaceC7618bX;
    }
}
