package com.bytedance.sdk.openadsdk.utils;

import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.sdk.component.p233Kg.AbstractRunnableC7227Kg;
import com.bytedance.sdk.component.p233Kg.C7255ldr;
import com.bytedance.sdk.component.p233Kg.p235bX.AbstractRunnableC7230IL;
import com.bytedance.sdk.component.p233Kg.p235bX.C7231bX;
import com.bytedance.sdk.component.p233Kg.p235bX.C7235ldr;
import com.bytedance.sdk.component.p233Kg.p235bX.InterfaceC7232bg;
import com.bytedance.sdk.component.p233Kg.p235bX.InterfaceC7240zx;
import com.bytedance.sdk.component.p233Kg.p235bX.p236bg.C7233bg;
import com.bytedance.sdk.component.utils.C7741PX;
import com.bytedance.sdk.openadsdk.core.C9095yDt;
import com.bytedance.sdk.openadsdk.core.settings.C9011xxp;
import com.bytedance.sdk.openadsdk.yDt.C9601bX;
import com.bytedance.sdk.openadsdk.yDt.InterfaceC9598IL;
import com.bytedance.sdk.openadsdk.yDt.p365bg.C9635eqN;
import com.bytedance.sdk.openadsdk.yDt.p365bg.InterfaceC9632bX;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.utils.VJ */
/* loaded from: classes3.dex */
public class C9519VJ {

    /* renamed from: IL */
    private static volatile boolean f21243IL;

    /* renamed from: Kg */
    private static volatile C7235ldr f21244Kg;

    /* renamed from: WR */
    private static volatile C7235ldr f21245WR;

    /* renamed from: bX */
    private static volatile C7235ldr f21246bX;

    /* renamed from: bg */
    private static volatile ThreadPoolExecutor f21247bg;

    /* renamed from: eo */
    private static volatile C7235ldr f21248eo;
    private static volatile C7235ldr eqN;

    /* renamed from: iR */
    private static volatile C7235ldr f21249iR;
    private static volatile C7235ldr ldr;

    /* renamed from: zx */
    private static volatile C7235ldr f21250zx;

    static {
        C7231bX.m89537bg(new InterfaceC7232bg() { // from class: com.bytedance.sdk.openadsdk.utils.VJ.1
            @Override // com.bytedance.sdk.component.p233Kg.p235bX.InterfaceC7232bg
            /* renamed from: bg */
            public void mo82565bg(C7235ldr c7235ldr, AbstractRunnableC7230IL abstractRunnableC7230IL) {
                abstractRunnableC7230IL.m89552IL();
                new RuntimeException();
            }
        });
        C7231bX.m89536bg(new InterfaceC7240zx() { // from class: com.bytedance.sdk.openadsdk.utils.VJ.3
            @Override // com.bytedance.sdk.component.p233Kg.p235bX.InterfaceC7240zx
            /* renamed from: bg */
            public void mo82564bg(final C7235ldr c7235ldr) {
                if (!C9515Uq.f21235bg && c7235ldr != null) {
                    try {
                        LinkedHashMap<String, C7233bg> m89526bg = c7235ldr.m89526bg();
                        if (m89526bg != null && m89526bg.size() > 0) {
                            for (Map.Entry<String, C7233bg> entry : m89526bg.entrySet()) {
                                final C7233bg value = entry.getValue();
                                if (value != null) {
                                    C9601bX.m82293bg();
                                    C9601bX.m82278bg("pag_thread_pool_state", false, new InterfaceC9598IL() { // from class: com.bytedance.sdk.openadsdk.utils.VJ.3.1
                                        {
                                            C95233.this = this;
                                        }

                                        @Override // com.bytedance.sdk.openadsdk.yDt.InterfaceC9598IL
                                        public InterfaceC9632bX getLogStats() throws Exception {
                                            int m89535IL;
                                            JSONObject jSONObject = new JSONObject();
                                            try {
                                                jSONObject.put("name", value.m89533bg());
                                                jSONObject.put("times", value.m89535IL());
                                                jSONObject.put("runMaxTime", value.ldr());
                                                jSONObject.put("waitMaxTime", value.m89531zx());
                                                if (value.m89535IL() == 0) {
                                                    m89535IL = 1;
                                                } else {
                                                    m89535IL = value.m89535IL();
                                                }
                                                long j = m89535IL;
                                                jSONObject.put("avgRunTime", value.eqN() / j);
                                                jSONObject.put("avgWaitTime", value.m89534bX() / j);
                                                jSONObject.put("poolType", c7235ldr.m89528IL());
                                            } catch (Exception e) {
                                                C7741PX.m87871bg("ThreadUtils", "run: ", e);
                                            }
                                            return C9635eqN.m82211IL().m82197bg("pag_thread_pool_state").m82209IL(jSONObject.toString());
                                        }
                                    });
                                }
                            }
                        }
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                }
            }
        });
        f21247bg = null;
        f21243IL = false;
    }

    /* renamed from: IL */
    public static ExecutorService m82592IL() {
        if (m82583VB()) {
            return m82568vb();
        }
        return C7255ldr.m89448eo();
    }

    /* renamed from: Kg */
    public static C7235ldr m82587Kg() {
        C7235ldr c7235ldr;
        C7235ldr c7235ldr2 = ldr;
        if (m82574bg(c7235ldr2)) {
            synchronized (C9519VJ.class) {
                if (m82574bg(ldr)) {
                    ldr = m82571bg(Reporting.EventType.CACHE, ldr);
                }
                c7235ldr = ldr;
            }
            return c7235ldr;
        }
        return c7235ldr2;
    }

    /* renamed from: Lq */
    private static C7235ldr m82586Lq() {
        C7235ldr c7235ldr;
        C7235ldr c7235ldr2 = f21250zx;
        if (m82574bg(c7235ldr2)) {
            synchronized (C9519VJ.class) {
                if (m82574bg(f21250zx)) {
                    f21250zx = m82571bg("aidl", f21250zx);
                }
                c7235ldr = f21250zx;
            }
            return c7235ldr;
        }
        return c7235ldr2;
    }

    /* renamed from: PX */
    private static ThreadPoolExecutor m82585PX() {
        int i;
        if (f21247bg == null) {
            synchronized (C9519VJ.class) {
                if (f21247bg == null) {
                    if (C9011xxp.JxS()) {
                        i = C9011xxp.m83746zU().RFq();
                        f21243IL = true;
                    } else {
                        i = 4;
                    }
                    f21247bg = new ThreadPoolExecutor(i, Integer.MAX_VALUE, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue());
                }
            }
        }
        return f21247bg;
    }

    /* renamed from: Ta */
    private static ThreadPoolExecutor m82584Ta() {
        C7235ldr c7235ldr;
        C7235ldr c7235ldr2 = f21246bX;
        if (m82574bg(c7235ldr2)) {
            synchronized (C9519VJ.class) {
                if (m82574bg(f21246bX)) {
                    f21246bX = m82571bg("ad", f21246bX);
                }
                c7235ldr = f21246bX;
            }
            return c7235ldr;
        }
        return c7235ldr2;
    }

    /* renamed from: VB */
    public static boolean m82583VB() {
        if (C9011xxp.JxS()) {
            return C9011xxp.m83746zU().xFs();
        }
        return true;
    }

    /* renamed from: WR */
    public static C7235ldr m82582WR() {
        C7235ldr c7235ldr;
        C7235ldr c7235ldr2 = f21245WR;
        if (m82574bg(c7235ldr2)) {
            synchronized (C9519VJ.class) {
                if (m82574bg(f21245WR)) {
                    f21245WR = m82571bg("express", f21245WR);
                }
                c7235ldr = f21245WR;
            }
            return c7235ldr;
        }
        return c7235ldr2;
    }

    /* renamed from: bX */
    public static ExecutorService m82581bX() {
        if (m82583VB()) {
            return yDt();
        }
        return C7255ldr.eqN();
    }

    /* renamed from: bg */
    public static ScheduledExecutorService m82578bg() {
        return C7255ldr.ldr();
    }

    /* renamed from: eo */
    public static C7235ldr m82570eo() {
        C7235ldr c7235ldr;
        C7235ldr c7235ldr2 = f21248eo;
        if (m82574bg(c7235ldr2)) {
            synchronized (C9519VJ.class) {
                if (m82574bg(f21248eo)) {
                    f21248eo = m82571bg("net", f21248eo);
                }
                c7235ldr = f21248eo;
            }
            return c7235ldr;
        }
        return c7235ldr2;
    }

    public static ExecutorService eqN() {
        if (m82583VB()) {
            return m82587Kg();
        }
        return C7255ldr.m89464IL();
    }

    /* renamed from: iR */
    public static ExecutorService m82569iR() {
        if (m82583VB()) {
            return xxp();
        }
        return C7255ldr.m89458bX();
    }

    public static boolean ldr() {
        String str;
        if (m82583VB()) {
            str = "pag_log";
        } else {
            str = "csj_log";
        }
        String name = Thread.currentThread().getName();
        if (TextUtils.isEmpty(name)) {
            return false;
        }
        return name.startsWith(str);
    }

    /* renamed from: vb */
    private static C7235ldr m82568vb() {
        C7235ldr c7235ldr;
        C7235ldr c7235ldr2 = f21244Kg;
        if (m82574bg(c7235ldr2)) {
            synchronized (C9519VJ.class) {
                if (m82574bg(f21244Kg)) {
                    f21244Kg = m82571bg("image", f21244Kg);
                }
                c7235ldr = f21244Kg;
            }
            return c7235ldr;
        }
        return c7235ldr2;
    }

    private static C7235ldr xxp() {
        C7235ldr c7235ldr;
        C7235ldr c7235ldr2 = f21249iR;
        if (m82574bg(c7235ldr2)) {
            synchronized (C9519VJ.class) {
                if (m82574bg(f21249iR)) {
                    f21249iR = m82571bg("io", f21249iR);
                }
                c7235ldr = f21249iR;
            }
            return c7235ldr;
        }
        return c7235ldr2;
    }

    private static C7235ldr yDt() {
        C7235ldr c7235ldr;
        C7235ldr c7235ldr2 = eqN;
        if (m82574bg(c7235ldr2)) {
            synchronized (C9519VJ.class) {
                if (m82574bg(eqN)) {
                    eqN = m82571bg("log", eqN);
                }
                c7235ldr = eqN;
            }
            return c7235ldr;
        }
        return c7235ldr2;
    }

    /* renamed from: zx */
    public static boolean m82567zx() {
        return Looper.getMainLooper() == Looper.myLooper();
    }

    /* renamed from: bg */
    public static void m82573bg(Runnable runnable) {
        if (runnable == null || C9515Uq.f21235bg) {
            return;
        }
        if (m82567zx()) {
            runnable.run();
        } else {
            C9095yDt.m83551bX().post(runnable);
        }
    }

    /* renamed from: zx */
    public static void m82566zx(final AbstractRunnableC7227Kg abstractRunnableC7227Kg) {
        if (C9515Uq.f21235bg) {
            return;
        }
        if (m82583VB()) {
            m82584Ta().execute(new AbstractRunnableC7230IL(abstractRunnableC7227Kg.getName(), abstractRunnableC7227Kg) { // from class: com.bytedance.sdk.openadsdk.utils.VJ.2
                @Override // java.lang.Runnable
                public void run() {
                    abstractRunnableC7227Kg.run();
                }
            });
            return;
        }
        ThreadPoolExecutor m82585PX = m82585PX();
        m82585PX.execute(abstractRunnableC7227Kg);
        if (f21243IL || !C9011xxp.JxS()) {
            return;
        }
        f21243IL = true;
        m82585PX.setCorePoolSize(C9011xxp.m83746zU().RFq());
    }

    /* renamed from: IL */
    public static void m82589IL(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        C9095yDt.m83551bX().removeCallbacks(runnable);
    }

    /* renamed from: bX */
    public static void m82580bX(final AbstractRunnableC7227Kg abstractRunnableC7227Kg) {
        if (abstractRunnableC7227Kg == null || C9515Uq.f21235bg) {
            return;
        }
        if (m82583VB()) {
            yDt().execute(new AbstractRunnableC7230IL(abstractRunnableC7227Kg.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.VJ.7
                @Override // java.lang.Runnable
                public void run() {
                    abstractRunnableC7227Kg.run();
                }
            });
        } else {
            C7255ldr.m89456bX(abstractRunnableC7227Kg);
        }
    }

    public static void eqN(final AbstractRunnableC7227Kg abstractRunnableC7227Kg) {
        if (abstractRunnableC7227Kg == null || C9515Uq.f21235bg) {
            return;
        }
        if (m82583VB()) {
            m82584Ta().execute(new AbstractRunnableC7230IL(abstractRunnableC7227Kg.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.VJ.9
                @Override // java.lang.Runnable
                public void run() {
                    abstractRunnableC7227Kg.run();
                }
            });
        } else {
            C7255ldr.m89445zx(abstractRunnableC7227Kg);
        }
    }

    /* renamed from: IL */
    public static void m82591IL(final AbstractRunnableC7227Kg abstractRunnableC7227Kg) {
        if (C9515Uq.f21235bg) {
            return;
        }
        if (m82583VB()) {
            xxp().execute(new AbstractRunnableC7230IL(abstractRunnableC7227Kg.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.VJ.5
                @Override // java.lang.Runnable
                public void run() {
                    abstractRunnableC7227Kg.run();
                }
            });
        } else {
            C7255ldr.m89462IL(abstractRunnableC7227Kg);
        }
    }

    /* renamed from: bg */
    public static void m82577bg(final AbstractRunnableC7227Kg abstractRunnableC7227Kg) {
        if (C9515Uq.f21235bg) {
            return;
        }
        if (m82583VB()) {
            m82587Kg().execute(new AbstractRunnableC7230IL(abstractRunnableC7227Kg.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.VJ.4
                @Override // java.lang.Runnable
                public void run() {
                    abstractRunnableC7227Kg.run();
                }
            });
        } else {
            C7255ldr.m89453bg(abstractRunnableC7227Kg);
        }
    }

    /* renamed from: bX */
    public static void m82579bX(final AbstractRunnableC7227Kg abstractRunnableC7227Kg, int i) {
        if (abstractRunnableC7227Kg == null || C9515Uq.f21235bg) {
            return;
        }
        if (m82583VB()) {
            m82586Lq().execute(new AbstractRunnableC7230IL(abstractRunnableC7227Kg.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.VJ.10
                @Override // java.lang.Runnable
                public void run() {
                    abstractRunnableC7227Kg.run();
                }
            });
        } else {
            C7255ldr.m89455bX(abstractRunnableC7227Kg, i);
        }
    }

    /* renamed from: IL */
    public static void m82590IL(final AbstractRunnableC7227Kg abstractRunnableC7227Kg, int i) {
        if (abstractRunnableC7227Kg == null || C9515Uq.f21235bg) {
            return;
        }
        if (m82583VB()) {
            AbstractRunnableC7230IL abstractRunnableC7230IL = new AbstractRunnableC7230IL(abstractRunnableC7227Kg.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.VJ.8
                @Override // java.lang.Runnable
                public void run() {
                    abstractRunnableC7227Kg.run();
                }
            };
            abstractRunnableC7230IL.m89546bg(i);
            yDt().execute(abstractRunnableC7230IL);
            return;
        }
        C7255ldr.m89461IL(abstractRunnableC7227Kg, i);
    }

    /* renamed from: bg */
    public static void m82576bg(final AbstractRunnableC7227Kg abstractRunnableC7227Kg, int i) {
        if (abstractRunnableC7227Kg == null || C9515Uq.f21235bg) {
            return;
        }
        if (m82583VB()) {
            AbstractRunnableC7230IL abstractRunnableC7230IL = new AbstractRunnableC7230IL(abstractRunnableC7227Kg.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.VJ.6
                @Override // java.lang.Runnable
                public void run() {
                    abstractRunnableC7227Kg.run();
                }
            };
            abstractRunnableC7230IL.m89546bg(i);
            xxp().execute(abstractRunnableC7230IL);
            return;
        }
        C7255ldr.m89451bg(abstractRunnableC7227Kg, 5, i);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: IL */
    private static C7235ldr.C7239bg m82588IL(String str) {
        char c;
        if (TextUtils.isEmpty(str)) {
            str = "unknown";
        }
        C7235ldr.C7239bg c7239bg = new C7235ldr.C7239bg();
        str.hashCode();
        switch (str.hashCode()) {
            case -1308979344:
                if (str.equals("express")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 3107:
                if (str.equals("ad")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 3366:
                if (str.equals("io")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 107332:
                if (str.equals("log")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 108957:
                if (str.equals("net")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 2993840:
                if (str.equals("aidl")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 94416770:
                if (str.equals(Reporting.EventType.CACHE)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 100313435:
                if (str.equals("image")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1236319578:
                if (str.equals("monitor")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return c7239bg.m89507bg(str).m89510bg(2).m89520IL(4).m89513bX(0).m89509bg(10000L).m89506bg(true).m89503zx(-1).eqN(10).m89518IL(false);
            case 1:
                return c7239bg.m89507bg(str).m89510bg(4).m89520IL(4).m89513bX(0).m89509bg(20000L).m89506bg(true).m89503zx(-1).eqN(10).m89518IL(false);
            case 2:
                return c7239bg.m89507bg(str).m89510bg(4).m89520IL(10).m89513bX(0).m89509bg(20000L).m89506bg(true).m89503zx(-1).eqN(10).m89518IL(false);
            case 3:
                return c7239bg.m89507bg(str).m89510bg(4).m89520IL(6).m89513bX(2).m89509bg(20000L).m89506bg(true).m89503zx(-1).eqN(10).m89518IL(false);
            case 4:
                return c7239bg.m89507bg(str).m89510bg(10).m89520IL(10).m89513bX(0).m89509bg(10000L).m89506bg(true).m89503zx(-1).eqN(10).m89518IL(false);
            case 5:
                return c7239bg.m89507bg(str).m89510bg(2).m89520IL(4).m89513bX(0).m89509bg(10000L).m89506bg(true).m89503zx(-1).eqN(10).m89518IL(false);
            case 6:
                return c7239bg.m89507bg(str).m89510bg(0).m89520IL(0).m89513bX(0).m89509bg(5000L).m89506bg(true).m89503zx(-1).eqN(20).m89518IL(false);
            case 7:
                return c7239bg.m89507bg(str).m89510bg(3).m89520IL(3).m89513bX(0).m89509bg(20000L).m89506bg(true).m89503zx(-1).eqN(10).m89518IL(false);
            case '\b':
                return c7239bg.m89507bg(str).m89510bg(2).m89520IL(2).m89513bX(0).m89509bg(10000L).m89506bg(true).m89503zx(-1).eqN(10).m89518IL(false);
            default:
                return c7239bg.m89507bg(str).m89510bg(8).m89520IL(16).m89513bX(2).m89509bg(20000L).m89506bg(true).m89503zx(-1).eqN(10).m89518IL(false);
        }
    }

    /* renamed from: bg */
    public static void m82575bg(AbstractRunnableC7230IL abstractRunnableC7230IL) {
        m82570eo().execute(abstractRunnableC7230IL);
    }

    /* renamed from: bg */
    private static boolean m82574bg(C7235ldr c7235ldr) {
        if (c7235ldr != null) {
            return !c7235ldr.m89527bX() && C9011xxp.JxS();
        }
        return true;
    }

    /* renamed from: bg */
    private static C7235ldr m82571bg(String str, C7235ldr c7235ldr) {
        C7235ldr.C7239bg m82572bg = m82572bg(str);
        if (c7235ldr == null) {
            return m82572bg.m89511bg();
        }
        c7235ldr.m89524bg(m82572bg);
        return c7235ldr;
    }

    /* renamed from: bg */
    private static C7235ldr.C7239bg m82572bg(String str) {
        C7235ldr.C7239bg m82588IL = m82588IL(str);
        try {
            if (C9011xxp.JxS()) {
                m82588IL.m89518IL(true);
                JSONObject gCm = C9011xxp.m83746zU().gCm();
                JSONObject optJSONObject = gCm != null ? gCm.optJSONObject(str) : null;
                if (optJSONObject != null) {
                    m82588IL.m89518IL(true);
                    if (optJSONObject.has("coreSize")) {
                        m82588IL.m89510bg(optJSONObject.optInt("coreSize"));
                    }
                    if (optJSONObject.has(SDKConstants.PARAM_CONTEXT_MAX_SIZE)) {
                        m82588IL.m89520IL(optJSONObject.optInt(SDKConstants.PARAM_CONTEXT_MAX_SIZE));
                    }
                    if (optJSONObject.has("createSize")) {
                        m82588IL.m89513bX(optJSONObject.optInt("createSize"));
                    }
                    if (optJSONObject.has("keepAlive")) {
                        m82588IL.m89509bg(optJSONObject.optInt("keepAlive"));
                    }
                    if (optJSONObject.has("allowCoreTimeOut")) {
                        m82588IL.m89506bg(optJSONObject.optBoolean("allowCoreTimeOut"));
                    }
                    if (optJSONObject.has("reportLogThreshold")) {
                        m82588IL.m89503zx(optJSONObject.optInt("reportLogThreshold"));
                    }
                    if (optJSONObject.has("logTaskCount")) {
                        m82588IL.eqN(optJSONObject.optInt("logTaskCount"));
                    }
                }
            }
        } catch (Throwable th) {
            th.getMessage();
        }
        return m82588IL;
    }
}
