package com.bytedance.sdk.openadsdk.core;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.p233Kg.AbstractRunnableC7227Kg;
import com.bytedance.sdk.component.utils.C7741PX;
import com.bytedance.sdk.openadsdk.core.settings.C9011xxp;
import com.bytedance.sdk.openadsdk.p358vb.C9579eqN;
import com.bytedance.sdk.openadsdk.p358vb.InterfaceC9583zx;
import com.bytedance.sdk.openadsdk.p358vb.p359IL.C9575bg;
import com.bytedance.sdk.openadsdk.utils.C9519VJ;
import com.maticoo.sdk.MaticooAdsConstant;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.yDt */
/* loaded from: classes3.dex */
public class C9095yDt {

    /* renamed from: bg */
    public static volatile boolean f20321bg;

    /* renamed from: iR */
    private static volatile HandlerThread f20322iR;

    /* renamed from: zx */
    public static long f20323zx;

    /* renamed from: IL */
    public static AtomicBoolean f20318IL = new AtomicBoolean(false);

    /* renamed from: bX */
    public static long f20320bX = 0;
    private static volatile int ldr = 0;
    public static float eqN = 1.0f;

    /* renamed from: Kg */
    private static volatile Handler f20319Kg = null;

    static {
        HandlerThread handlerThread = new HandlerThread("csj_init_handle", 10);
        f20322iR = handlerThread;
        handlerThread.start();
        f20323zx = System.currentTimeMillis();
    }

    /* renamed from: IL */
    public static Handler m83552IL() {
        if (f20322iR != null && f20322iR.isAlive()) {
            if (f20319Kg == null) {
                synchronized (C9095yDt.class) {
                    if (f20319Kg == null) {
                        f20319Kg = new Handler(f20322iR.getLooper());
                    }
                }
            }
        } else {
            synchronized (C9095yDt.class) {
                if (f20322iR == null || !f20322iR.isAlive()) {
                    HandlerThread handlerThread = new HandlerThread("csj_init_handle", -1);
                    f20322iR = handlerThread;
                    handlerThread.start();
                    f20319Kg = new Handler(f20322iR.getLooper());
                }
            }
        }
        return f20319Kg;
    }

    /* renamed from: bX */
    public static Handler m83551bX() {
        return new Handler(Looper.getMainLooper());
    }

    /* renamed from: bg */
    public static void m83548bg(long j) {
        f20323zx = j;
    }

    public static int eqN() {
        return ldr;
    }

    /* renamed from: iR */
    public static void m83546iR() {
        m83552IL().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.yDt.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    C9579eqN.m82334bg(new InterfaceC9583zx() { // from class: com.bytedance.sdk.openadsdk.core.yDt.2.1
                        {
                            RunnableC90972.this = this;
                        }

                        @Override // com.bytedance.sdk.openadsdk.p358vb.InterfaceC9583zx
                        public C9575bg generatorModel() {
                            C9575bg c9575bg = new C9575bg();
                            c9575bg.m82364IL("init");
                            return c9575bg;
                        }
                    });
                } catch (Throwable th) {
                    C7741PX.m87873bg("InitHelper", th.getMessage());
                }
            }
        });
    }

    public static void ldr() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - f20320bX <= 10000) {
            return;
        }
        f20320bX = elapsedRealtime;
        C9519VJ.m82577bg(new AbstractRunnableC7227Kg("onSharedPreferenceChanged") { // from class: com.bytedance.sdk.openadsdk.core.yDt.1
            @Override // java.lang.Runnable
            public void run() {
                String m83784bX = C9011xxp.m83784bX(C8838VzQ.m84740bg());
                if (!TextUtils.equals(m83784bX, C9011xxp.eqN)) {
                    C9011xxp.m83746zU().mo83779bg(6, true);
                    C9011xxp.eqN = m83784bX;
                }
            }
        });
    }

    /* renamed from: zx */
    public static boolean m83545zx() {
        if (eqN() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: bg */
    public static long m83550bg() {
        return f20323zx;
    }

    /* renamed from: bg */
    public static void m83549bg(int i) {
        ldr = i;
    }

    /* renamed from: bg */
    public static void m83547bg(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (MaticooAdsConstant.KEY_AD_MEDIATION.equals(jSONObject.optString("name", ""))) {
                    C8840WR.m84734IL().m84730IL(jSONObject.optString("value", ""));
                    return;
                }
            }
        } catch (Throwable th) {
            C7741PX.m87873bg("InitHelper", th.getMessage());
        }
    }
}
