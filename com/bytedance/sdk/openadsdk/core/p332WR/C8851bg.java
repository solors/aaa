package com.bytedance.sdk.openadsdk.core.p332WR;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.VzQ.p293bg.p294IL.C7933bg;
import com.bytedance.sdk.openadsdk.core.C8617PX;
import com.bytedance.sdk.openadsdk.core.C8838VzQ;
import com.bytedance.sdk.openadsdk.core.C8840WR;
import com.bytedance.sdk.openadsdk.core.C9095yDt;
import com.bytedance.sdk.openadsdk.utils.C9510LZ;
import com.bytedance.sdk.openadsdk.yDt.InterfaceC9598IL;
import com.bytedance.sdk.openadsdk.yDt.p365bg.C9635eqN;
import com.bytedance.sdk.openadsdk.yDt.p365bg.InterfaceC9632bX;
import com.pgl.ssdk.ces.out.PglSSConfig;
import com.pgl.ssdk.ces.out.PglSSManager;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.bytedance.sdk.openadsdk.core.WR.bg */
/* loaded from: classes3.dex */
public class C8851bg {

    /* renamed from: IL */
    private volatile boolean f19544IL;

    /* renamed from: bg */
    private PglSSManager f19546bg;

    /* renamed from: bX */
    private volatile boolean f19545bX = true;
    private volatile boolean eqN = false;

    public C8851bg() {
        m84665bg();
    }

    /* renamed from: Kg */
    private boolean m84670Kg() {
        if (!this.f19544IL && this.f19545bX) {
            m84665bg();
        }
        return this.f19544IL;
    }

    /* renamed from: WR */
    private void m84669WR() {
        if (this.f19546bg == null) {
            this.f19546bg = PglSSManager.getInstance();
        }
    }

    /* renamed from: eo */
    private Class m84659eo() {
        Class<PglSSManager> cls;
        try {
            cls = PglSSManager.class;
            String str = PglSSManager.REPORT_SCENE_ADSHOW;
            try {
                this.f19545bX = true;
            } catch (Throwable unused) {
                this.f19545bX = false;
                return cls;
            }
        } catch (Throwable unused2) {
            cls = null;
        }
        return cls;
    }

    /* renamed from: IL */
    public boolean m84672IL() {
        return this.f19544IL;
    }

    /* renamed from: bX */
    public void m84668bX() {
        if (m84670Kg()) {
            m84669WR();
            if (this.f19546bg != null) {
                C9095yDt.m83552IL().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.WR.bg.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            HashMap hashMap = new HashMap();
                            hashMap.put(PglSSConfig.CUSTOMINFO_KEY_CHECKCLAZZ, C8838VzQ.eqN().mo83769bu());
                            C8851bg.this.f19546bg.setCustomInfo(hashMap);
                        } catch (Throwable th) {
                            C9510LZ.m82618IL("MSSdkImpl", "setCustomInfo", th.getMessage());
                        }
                    }
                });
            }
        }
    }

    public String eqN() {
        if (!m84670Kg()) {
            return "";
        }
        m84669WR();
        PglSSManager pglSSManager = this.f19546bg;
        if (pglSSManager == null) {
            return "";
        }
        return pglSSManager.getToken();
    }

    /* renamed from: iR */
    public int m84658iR() {
        if (this.f19545bX) {
            return PglSSManager.getInitStatus();
        }
        return 5;
    }

    public long ldr() {
        if (!m84670Kg()) {
            return 0L;
        }
        m84669WR();
        PglSSManager pglSSManager = this.f19546bg;
        if (pglSSManager == null) {
            return 0L;
        }
        return pglSSManager.getECForBidding();
    }

    /* renamed from: zx */
    public String m84657zx() {
        if (!m84670Kg()) {
            return "";
        }
        m84669WR();
        PglSSManager pglSSManager = this.f19546bg;
        if (pglSSManager == null) {
            return "";
        }
        return pglSSManager.getSofChara();
    }

    /* renamed from: IL */
    public void m84671IL(String str) {
        if (m84670Kg()) {
            m84669WR();
            PglSSManager pglSSManager = this.f19546bg;
            if (pglSSManager != null) {
                pglSSManager.setDeviceId(str);
            }
        }
    }

    /* renamed from: bg */
    public synchronized void m84665bg() {
        if (this.f19544IL) {
            return;
        }
        Context m84740bg = C8838VzQ.m84740bg();
        String eqN = C8840WR.m84734IL().eqN();
        if (TextUtils.isEmpty(eqN)) {
            eqN = C8840WR.m84706bg("app_id", Long.MAX_VALUE);
        }
        if (TextUtils.isEmpty(eqN)) {
            return;
        }
        PglSSManager.init(m84740bg, PglSSConfig.builder().setAppId(eqN).setOVRegionType(0).setAdsdkVersion(BuildConfig.VERSION_NAME).build(), null, null, C8617PX.m85532bg(m84740bg), C7933bg.m87401bg().m87403IL());
        m84669WR();
        this.f19544IL = true;
        if (this.f19545bX) {
            m84667bX(PglSSManager.getLoadError());
        }
    }

    /* renamed from: bX */
    private void m84667bX(final String str) {
        if (this.eqN || TextUtils.isEmpty(str)) {
            return;
        }
        C8838VzQ.m84738zx().mo82272bg(new InterfaceC9598IL() { // from class: com.bytedance.sdk.openadsdk.core.WR.bg.2
            @Override // com.bytedance.sdk.openadsdk.yDt.InterfaceC9598IL
            public InterfaceC9632bX getLogStats() throws Exception {
                return C9635eqN.m82211IL().m82197bg("secsdk_init_error").m82209IL(str);
            }
        }, false);
        this.eqN = true;
    }

    /* renamed from: bg */
    public void m84662bg(String str) {
        if (m84670Kg()) {
            m84669WR();
            PglSSManager pglSSManager = this.f19546bg;
            if (pglSSManager != null) {
                pglSSManager.setGaid(str);
            }
        }
    }

    /* renamed from: bg */
    public void m84661bg(String str, Map<String, Object> map) {
        if (m84670Kg()) {
            m84669WR();
            PglSSManager pglSSManager = this.f19546bg;
            if (pglSSManager != null) {
                pglSSManager.reportNow(str, map);
            }
        }
    }

    /* renamed from: bg */
    public void m84664bg(MotionEvent motionEvent) {
        if (m84672IL()) {
            m84669WR();
            PglSSManager pglSSManager = this.f19546bg;
            if (pglSSManager != null) {
                pglSSManager.checkEventVirtual(motionEvent);
            }
        }
    }

    /* renamed from: bg */
    public Map<String, String> m84660bg(String str, byte[] bArr) {
        Map<String, String> featureHash;
        return (!m84670Kg() || (featureHash = this.f19546bg.getFeatureHash(str, bArr)) == null) ? new HashMap() : featureHash;
    }
}
