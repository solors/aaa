package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.embedapplog.PangleEncryptManager;
import com.bytedance.sdk.component.p233Kg.AbstractRunnableC7227Kg;
import com.bytedance.sdk.component.p257iR.C7608IL;
import com.bytedance.sdk.component.p257iR.p258IL.AbstractC7611bX;
import com.bytedance.sdk.component.p257iR.p258IL.C7614eqN;
import com.bytedance.sdk.component.p257iR.p260bg.AbstractC7632bg;
import com.bytedance.sdk.component.utils.C7740Lq;
import com.bytedance.sdk.component.utils.C7741PX;
import com.bytedance.sdk.component.utils.C7751bg;
import com.bytedance.sdk.component.utils.C7759rri;
import com.bytedance.sdk.openadsdk.core.settings.C9011xxp;
import com.bytedance.sdk.openadsdk.eqN.p344bg.C9235bX;
import com.bytedance.sdk.openadsdk.utils.C9519VJ;
import com.bytedance.sdk.openadsdk.utils.ayS;
import com.bytedance.sdk.openadsdk.xxp.C9585bX;
import com.bytedance.sdk.openadsdk.yDt.C9601bX;
import com.learnings.purchase.event.EventUploader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import net.pubnative.lite.sdk.models.Protocol;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.VB */
/* loaded from: classes3.dex */
public class C8758VB {

    /* renamed from: bg */
    private static final AtomicInteger f19352bg = new AtomicInteger(0);

    /* renamed from: IL */
    private static final AtomicBoolean f19351IL = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bX */
    public static void m84942bX(final String str) {
        C9519VJ.m82580bX(new AbstractRunnableC7227Kg("ipv6") { // from class: com.bytedance.sdk.openadsdk.core.VB.1
            @Override // java.lang.Runnable
            public void run() {
                JSONObject m87838bg;
                final String mo83760jf = C9011xxp.m83746zU().mo83760jf();
                C9601bX.m82292bg(0, mo83760jf);
                if (TextUtils.isEmpty(mo83760jf)) {
                    C9601bX.m82291bg(-1, mo83760jf, -1, "url is null");
                    return;
                }
                C7614eqN m88317IL = C9585bX.m82322bg().m82324IL().m88317IL();
                try {
                    m88317IL.m88402IL(mo83760jf);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("connect_type", C7759rri.m87808bg(C8838VzQ.m84740bg(), 0L));
                    jSONObject.put("device_id", Long.parseLong(str));
                    jSONObject.put("header", C9235bX.m83345bg().m83348IL());
                    if (C9011xxp.m83746zU().mo83776bg(PangleEncryptConstant.CryptDataScene.APP_LOG)) {
                        m87838bg = PangleEncryptManager.encryptType4(jSONObject, new C9041tC(PangleEncryptConstant.CryptDataScene.DUAL_EVENT));
                        if (m87838bg != null && m87838bg.optInt("cypher") == 4) {
                            C8990rri.m83867IL(true);
                            m88317IL.m88401IL("x-pgli18n", Protocol.VAST_1_0_WRAPPER);
                            m88317IL.m88401IL("Content-Type", EventUploader.MEDIA_TYPE_JSON);
                        } else {
                            C8990rri.m83867IL(false);
                        }
                    } else {
                        m87838bg = C7751bg.m87838bg(jSONObject);
                        if (C8758VB.m84944IL(m87838bg)) {
                            m88317IL.m88401IL("Content-Encoding", "union_sdk_encode");
                        }
                    }
                    if (C8758VB.m84944IL(m87838bg)) {
                        jSONObject = m87838bg;
                    }
                    m88317IL.m88401IL("Content-Type", EventUploader.MEDIA_TYPE_JSON);
                    m88317IL.m88401IL("User-Agent", ayS.m82476bX());
                    m88317IL.m88374bg(jSONObject);
                    m88317IL.m88398bg(6);
                    m88317IL.m88396bg("send_i_p_v6");
                    m88317IL.m88377bg(new AbstractC7632bg() { // from class: com.bytedance.sdk.openadsdk.core.VB.1.1
                        @Override // com.bytedance.sdk.component.p257iR.p260bg.AbstractC7632bg
                        /* renamed from: bg */
                        public void mo83462bg(AbstractC7611bX abstractC7611bX, C7608IL c7608il) {
                            if (c7608il.ldr()) {
                                C9601bX.m82292bg(1, mo83760jf);
                                return;
                            }
                            C9601bX.m82291bg(-1, mo83760jf, c7608il.m88412bg(), c7608il.m88414IL());
                            C8758VB.eqN();
                        }

                        @Override // com.bytedance.sdk.component.p257iR.p260bg.AbstractC7632bg
                        /* renamed from: bg */
                        public void mo83461bg(AbstractC7611bX abstractC7611bX, IOException iOException) {
                            if (iOException != null) {
                                C9601bX.m82291bg(-1, mo83760jf, 1, iOException.getMessage());
                            }
                            C8758VB.eqN();
                        }
                    });
                } catch (Exception e) {
                    C9601bX.m82291bg(-1, mo83760jf, -2, e.getMessage());
                    C7741PX.m87880IL("build ipv6 request failed:" + e.getMessage());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void eqN() {
        if (f19352bg.getAndIncrement() <= 0) {
            C9519VJ.m82578bg().schedule(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.VB.2
                @Override // java.lang.Runnable
                public void run() {
                    C8758VB.m84942bX(C8617PX.m85532bg(C8838VzQ.m84740bg()));
                }
            }, 10000L, TimeUnit.MILLISECONDS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bX */
    public static void m84943bX() {
        f19352bg.set(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.bytedance.sdk.openadsdk.core.VB$bg */
    /* loaded from: classes3.dex */
    public static class C8762bg implements C7759rri.InterfaceC7762bg {

        /* renamed from: bg */
        private static final AtomicBoolean f19357bg = new AtomicBoolean(false);

        /* renamed from: IL */
        private static volatile long f19356IL = -1;

        private C8762bg() {
        }

        /* renamed from: bg */
        public static void m84889bg() {
            if (f19357bg.compareAndSet(false, true)) {
                f19356IL = System.currentTimeMillis();
                C7759rri.m87804bg(new C8762bg(), C8838VzQ.m84740bg());
            }
        }

        /* renamed from: IL */
        public void m84893IL() {
            C7759rri.m87805bg(this);
        }

        @Override // com.bytedance.sdk.component.utils.C7759rri.InterfaceC7762bg
        /* renamed from: bg */
        public void mo84888bg(Context context, Intent intent, boolean z, int i) {
            if (System.currentTimeMillis() - f19356IL >= 2000 && i != 0) {
                C8758VB.m84943bX();
                C8758VB.m84942bX(C8617PX.m85532bg(C8838VzQ.m84740bg()));
                m84893IL();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: IL */
    public static boolean m84944IL(JSONObject jSONObject) {
        return jSONObject != null && jSONObject.length() > 0;
    }

    /* renamed from: bg */
    public static void m84940bg(String str) {
        AtomicBoolean atomicBoolean = f19351IL;
        if (atomicBoolean.compareAndSet(false, true)) {
            if (!C7740Lq.m87887Kg(C8838VzQ.m84740bg())) {
                atomicBoolean.set(false);
                return;
            }
            C8762bg.m84889bg();
            m84942bX(str);
        }
    }
}
