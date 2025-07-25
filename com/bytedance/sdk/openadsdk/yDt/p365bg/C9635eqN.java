package com.bytedance.sdk.openadsdk.yDt.p365bg;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.JProtect;
import com.bytedance.sdk.component.utils.C7740Lq;
import com.bytedance.sdk.component.utils.C7741PX;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.VzQ.p293bg.p294IL.C7933bg;
import com.bytedance.sdk.openadsdk.core.C8838VzQ;
import com.bytedance.sdk.openadsdk.core.C8840WR;
import com.bytedance.sdk.openadsdk.utils.ayS;
import com.bytedance.sdk.openadsdk.yDt.p365bg.C9635eqN;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.ironsource.C19577ad;
import com.meevii.adsdk.common.BidderConstants;
import com.smaato.sdk.video.vast.model.Verification;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.yDt.bg.eqN */
/* loaded from: classes3.dex */
public class C9635eqN<T extends C9635eqN> implements InterfaceC9632bX {

    /* renamed from: IL */
    private String f21470IL;

    /* renamed from: PX */
    private String f21472PX;

    /* renamed from: VB */
    private String f21473VB;

    /* renamed from: WR */
    private String f21474WR;

    /* renamed from: bX */
    private String f21475bX;

    /* renamed from: bg */
    private String f21476bg;

    /* renamed from: eo */
    private String f21477eo;

    /* renamed from: iR */
    private String f21478iR;
    private final String eqN = BuildConfig.VERSION_NAME;

    /* renamed from: zx */
    private long f21479zx = System.currentTimeMillis() / 1000;
    private int ldr = 0;

    /* renamed from: Kg */
    private int f21471Kg = 0;

    /* renamed from: IL */
    public static C9635eqN<C9635eqN> m82211IL() {
        return new C9635eqN<>();
    }

    @JProtect
    /* renamed from: Lq */
    private JSONObject m82206Lq() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("os", 1);
            jSONObject.put("model", Build.MODEL);
            jSONObject.put(Verification.VENDOR, Build.MANUFACTURER);
            jSONObject.put("package_name", ayS.m82439zx());
            jSONObject.put("ua", ayS.m82476bX());
            jSONObject.put(C19577ad.f49047D0, C7933bg.m87401bg().m87403IL());
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    /* renamed from: Kg */
    public long m82208Kg() {
        return this.f21479zx;
    }

    /* renamed from: PX */
    public String m82205PX() {
        return this.f21474WR;
    }

    /* renamed from: Ta */
    public String m82204Ta() {
        return this.f21477eo;
    }

    /* renamed from: VB */
    public int m82203VB() {
        return this.f21471Kg;
    }

    /* renamed from: WR */
    public int m82202WR() {
        return this.ldr;
    }

    /* renamed from: bX */
    public String m82201bX() {
        return this.f21476bg;
    }

    @Override // com.bytedance.sdk.openadsdk.yDt.p365bg.InterfaceC9632bX
    @JProtect
    /* renamed from: bg */
    public JSONObject mo82199bg() {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("ad_sdk_version", m82195iR());
            jSONObject2.put("app_version", ayS.m82445iR());
            jSONObject2.put("timestamp", m82208Kg());
            jSONObject2.put("conn_type", C7740Lq.m87888IL(C8838VzQ.m84740bg()));
            jSONObject2.put("appid", TextUtils.isEmpty(C8840WR.m84734IL().eqN()) ? "" : C8840WR.m84734IL().eqN());
            jSONObject2.put(DeviceRequestsHelper.DEVICE_INFO_PARAM, m82206Lq());
            if (!TextUtils.isEmpty(m82201bX())) {
                jSONObject2.put("type", m82201bX());
            }
            jSONObject2.put("error_code", m82203VB());
            if (!TextUtils.isEmpty(m82205PX())) {
                jSONObject2.put("error_msg", m82205PX());
            }
            if (!TextUtils.isEmpty(m82192zx())) {
                jSONObject2.put("rit", m82192zx());
            }
            if (!TextUtils.isEmpty(ldr())) {
                jSONObject2.put("creative_id", ldr());
            }
            if (m82202WR() > 0) {
                jSONObject2.put(BidderConstants.ADTYPE, m82202WR());
            }
            if (!TextUtils.isEmpty(m82196eo())) {
                jSONObject2.put("req_id", m82196eo());
            }
            if (!TextUtils.isEmpty(m82204Ta())) {
                jSONObject2.put("extra", m82204Ta());
            }
            String eqN = eqN();
            if (TextUtils.isEmpty(eqN)) {
                jSONObject = new JSONObject();
            } else {
                try {
                    jSONObject = new JSONObject(eqN);
                } catch (Exception unused) {
                    jSONObject = null;
                }
            }
            if (jSONObject != null) {
                jSONObject.put("os_version_int", Build.VERSION.SDK_INT);
                jSONObject2.put("event_extra", jSONObject.toString());
            } else if (!TextUtils.isEmpty(eqN)) {
                jSONObject2.put("event_extra", eqN);
            }
            if (!TextUtils.isEmpty(yDt())) {
                jSONObject2.put("duration", yDt());
            }
        } catch (Throwable th) {
            C7741PX.m87873bg("LogStatsBase", th.getMessage());
        }
        return jSONObject2;
    }

    /* renamed from: eo */
    public String m82196eo() {
        return this.f21478iR;
    }

    public String eqN() {
        return this.f21473VB;
    }

    /* renamed from: iR */
    public String m82195iR() {
        return TextUtils.isEmpty(BuildConfig.VERSION_NAME) ? "" : BuildConfig.VERSION_NAME;
    }

    public String ldr() {
        return this.f21475bX;
    }

    public String yDt() {
        return this.f21472PX;
    }

    /* renamed from: zx */
    public String m82192zx() {
        return this.f21470IL;
    }

    /* renamed from: IL */
    public T m82209IL(String str) {
        this.f21473VB = str;
        return m82193vb();
    }

    /* renamed from: Kg */
    public T m82207Kg(String str) {
        this.f21472PX = str;
        return m82193vb();
    }

    /* renamed from: bX */
    public T m82200bX(String str) {
        this.f21470IL = str;
        return m82193vb();
    }

    public T eqN(String str) {
        this.f21475bX = str;
        return m82193vb();
    }

    /* renamed from: iR */
    public T m82194iR(String str) {
        this.f21477eo = str;
        return m82193vb();
    }

    public T ldr(String str) {
        this.f21474WR = str;
        return m82193vb();
    }

    /* renamed from: zx */
    public T m82191zx(String str) {
        this.f21478iR = str;
        return m82193vb();
    }

    /* renamed from: IL */
    public T m82210IL(int i) {
        this.f21471Kg = i;
        return m82193vb();
    }

    /* renamed from: vb */
    private T m82193vb() {
        return this;
    }

    /* renamed from: bg */
    public T m82197bg(String str) {
        this.f21476bg = str;
        return m82193vb();
    }

    /* renamed from: bg */
    public T m82198bg(int i) {
        this.ldr = i;
        return m82193vb();
    }
}
