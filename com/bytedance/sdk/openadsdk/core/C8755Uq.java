package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bykv.p135vk.openvk.p136bg.p137bg.p149bg.p153iR.C6508bX;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.embedapplog.PangleEncryptManager;
import com.bytedance.sdk.component.p257iR.C7628bg;
import com.bytedance.sdk.component.utils.C7741PX;
import com.bytedance.sdk.component.utils.C7751bg;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.VzQ.p293bg.p294IL.C7933bg;
import com.bytedance.sdk.openadsdk.common.C8186IL;
import com.bytedance.sdk.openadsdk.core.p314Kg.C8544PX;
import com.bytedance.sdk.openadsdk.core.p332WR.C8850bX;
import com.bytedance.sdk.openadsdk.core.settings.C9008eqN;
import com.bytedance.sdk.openadsdk.core.settings.C9011xxp;
import com.bytedance.sdk.openadsdk.core.settings.InterfaceC9010ldr;
import com.bytedance.sdk.openadsdk.ldr.C9297IL;
import com.bytedance.sdk.openadsdk.utils.C9510LZ;
import com.bytedance.sdk.openadsdk.utils.C9516Uw;
import com.bytedance.sdk.openadsdk.utils.ZQc;
import com.bytedance.sdk.openadsdk.utils.ayS;
import com.ironsource.C19577ad;
import com.smaato.sdk.video.vast.model.Verification;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

@Deprecated
/* renamed from: com.bytedance.sdk.openadsdk.core.Uq */
/* loaded from: classes3.dex */
public class C8755Uq implements InterfaceC8757Uw {

    /* renamed from: zx */
    private static final Map<Integer, String> f19347zx = new HashMap<Integer, String>(12) { // from class: com.bytedance.sdk.openadsdk.core.Uq.1
        {
            put(1, "abtest");
            put(2, "user_data");
            put(3, C19577ad.f49047D0);
            put(4, "apk-sign");
            put(5, CommonUrlParts.APP_SET_ID_SCOPE);
            put(6, CommonUrlParts.APP_SET_ID);
            put(7, "installed_source");
            put(8, "app_running_time");
            put(9, Verification.VENDOR);
            put(10, "model");
            put(11, "user_agent_device");
            put(12, "user_agent_webview");
            put(13, "sys_compiling_time");
            put(14, "sec_did");
            put(15, "url");
            put(16, "X-Argus");
            put(17, "X-Ladon");
            put(18, "X-Khronos");
            put(19, "X-Gorgon");
            put(20, "pangle_m");
            put(21, CommonUrlParts.SCREEN_HEIGHT);
            put(22, CommonUrlParts.SCREEN_WIDTH);
            put(23, "rom_version");
            put(24, "carrier_name");
            put(25, CommonUrlParts.OS_VERSION);
            put(26, "conn_type");
            put(27, "boot");
            put(28, "feature_data");
        }
    };

    /* renamed from: bg */
    boolean f19350bg = false;

    /* renamed from: IL */
    boolean f19348IL = false;

    /* renamed from: bX */
    String f19349bX = "com.union_test.internationad";
    String eqN = "8025677";
    private int ldr = 0;

    @Override // com.bytedance.sdk.openadsdk.core.InterfaceC8757Uw
    /* renamed from: bX */
    public InterfaceC8757Uw mo84955bX(int i) {
        C8840WR.m84734IL().m84718bX(i);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.InterfaceC8757Uw
    public String eqN() {
        return BuildConfig.VERSION_NAME;
    }

    @Override // com.bytedance.sdk.openadsdk.core.InterfaceC8757Uw
    /* renamed from: iR */
    public int mo84949iR() {
        return this.ldr;
    }

    @Override // com.bytedance.sdk.openadsdk.core.InterfaceC8757Uw
    public int ldr() {
        return C8840WR.m84734IL().m84735Fy();
    }

    @Override // com.bytedance.sdk.openadsdk.core.InterfaceC8757Uw
    /* renamed from: zx */
    public C8755Uq mo84957IL(String str) {
        C8840WR.m84734IL().m84715bX(str);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.InterfaceC8757Uw
    /* renamed from: IL */
    public InterfaceC8757Uw mo84958IL(int i) {
        C8840WR.m84734IL().m84733IL(i);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.InterfaceC8757Uw
    /* renamed from: bX */
    public int mo84956bX() {
        return C8840WR.m84734IL().m84721WR();
    }

    @Override // com.bytedance.sdk.openadsdk.core.InterfaceC8757Uw
    /* renamed from: bg */
    public InterfaceC8757Uw mo84952bg(int i) {
        C8840WR.m84734IL().m84695zx(i);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.InterfaceC8757Uw
    /* renamed from: eqN */
    public C8755Uq mo84951bg(String str) {
        C8840WR.m84734IL().m84707bg(str);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.InterfaceC8757Uw
    public InterfaceC8757Uw ldr(int i) {
        C8840WR.m84734IL().m84712bg(i);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.InterfaceC8757Uw
    /* renamed from: zx */
    public String mo84948zx() {
        return mo84954bX((String) null);
    }

    @Override // com.bytedance.sdk.openadsdk.core.InterfaceC8757Uw
    /* renamed from: IL */
    public int mo84959IL() {
        return C8840WR.m84734IL().m84728Kg();
    }

    @Override // com.bytedance.sdk.openadsdk.core.InterfaceC8757Uw
    /* renamed from: bX */
    public String mo84954bX(String str) {
        int i;
        ayS.m82446eo("getBiddingToken");
        C8850bX.m84679bg();
        try {
            JSONObject jSONObject = new JSONObject();
            boolean z = true;
            jSONObject.put("is_init", C9095yDt.m83545zx() ? 1 : 0);
            String mo83766eo = C8838VzQ.eqN().mo83766eo();
            String mo83824Fy = C8838VzQ.eqN().mo83824Fy();
            if (mo83766eo != null && mo83824Fy != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("version", mo83766eo);
                jSONObject2.put("param", mo83824Fy);
                jSONObject.put("abtest", jSONObject2);
            }
            jSONObject.put("ad_sdk_version", BuildConfig.VERSION_NAME);
            jSONObject.put("package_name", ayS.m82439zx());
            jSONObject.put("user_data", C8599LZ.m85576bg(TextUtils.isEmpty(str) ? null : new AdSlot.Builder().setCodeId(str).build()));
            jSONObject.put("ts", System.currentTimeMillis() / 1000);
            if (jSONObject.toString().getBytes().length <= 2680) {
                InterfaceC9010ldr eqN = C8838VzQ.eqN();
                if (eqN.DDQ(C19577ad.f49047D0)) {
                    jSONObject.put(C19577ad.f49047D0, C7933bg.m87401bg().m87403IL());
                }
                Context m84740bg = C8838VzQ.m84740bg();
                jSONObject.put("apk-sign", C8186IL.m86851iR());
                jSONObject.put(CommonUrlParts.APP_SET_ID_SCOPE, C9008eqN.m83831IL());
                jSONObject.put(CommonUrlParts.APP_SET_ID, C9008eqN.m83829bX());
                jSONObject.put("installed_source", C9008eqN.eqN());
                jSONObject.put("app_running_time", (System.currentTimeMillis() - C9095yDt.m83550bg()) / 1000);
                jSONObject.put("rewardedfull_link", C9011xxp.m83746zU().IEI() ? 1 : 0);
                jSONObject.put("js_render_ver", C8544PX.m85801IL());
                jSONObject.put("js_render_v3_ver", C8544PX.m85800bX());
                jSONObject.put(Verification.VENDOR, Build.MANUFACTURER);
                jSONObject.put("model", Build.MODEL);
                jSONObject.put("user_agent_device", ayS.m82501IL());
                jSONObject.put("user_agent_webview", ayS.m82476bX());
                jSONObject.put("sys_compiling_time", C8617PX.m85535IL(m84740bg));
                jSONObject.put(CommonUrlParts.SCREEN_HEIGHT, ZQc.eqN(m84740bg));
                jSONObject.put(CommonUrlParts.SCREEN_WIDTH, ZQc.m82538bX(m84740bg));
                jSONObject.put("rom_version", com.bytedance.sdk.openadsdk.utils.JAA.m82644bg());
                jSONObject.put("carrier_name", C9516Uw.m82595bg());
                jSONObject.put(CommonUrlParts.OS_VERSION, Build.VERSION.RELEASE);
                jSONObject.put("conn_type", ayS.m82486PX(m84740bg));
                if (eqN.DDQ("boot")) {
                    jSONObject.put("boot", String.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime()));
                }
                ayS.m82452bg(jSONObject);
                C8850bX.m84674bg(jSONObject);
                i = f19347zx.size();
            } else {
                i = 2;
            }
            while (i > 0 && jSONObject.toString().getBytes().length > 2680) {
                jSONObject.remove(f19347zx.get(Integer.valueOf(i)));
                i--;
            }
            C9297IL.m83136bg().m83123bg(jSONObject);
            if (!C9011xxp.JxS() || !C9011xxp.m83746zU().mo83776bg(PangleEncryptConstant.CryptDataScene.BIDDING_TOKEN)) {
                z = false;
            }
            JSONObject m84961bg = m84961bg(jSONObject, z);
            while (i > 0 && m84961bg.toString().getBytes().length > 4096) {
                jSONObject.remove(f19347zx.get(Integer.valueOf(i)));
                m84961bg = m84961bg(jSONObject, z);
                i--;
            }
            if (C7741PX.eqN()) {
                Objects.toString(m84961bg);
                int length = m84961bg.toString().getBytes().length;
            }
            Objects.toString(m84961bg);
            return m84961bg.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.InterfaceC8757Uw
    /* renamed from: bg */
    public InterfaceC8757Uw mo84953bg() {
        C7741PX.m87874bg("PangleSDK-6406");
        C6508bX.m91677bg("PangleSDK-6406");
        C7741PX.m87881IL();
        C7628bg.m88315bg();
        C6508bX.m91679bg();
        C9510LZ.m82615bg();
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.InterfaceC8757Uw
    public InterfaceC8757Uw eqN(int i) {
        C8840WR.m84734IL().ldr(i);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.InterfaceC8757Uw
    /* renamed from: zx */
    public InterfaceC8757Uw mo84947zx(int i) {
        this.ldr = i;
        return this;
    }

    /* renamed from: bg */
    private JSONObject m84961bg(JSONObject jSONObject, boolean z) {
        JSONObject m87838bg;
        if (z) {
            m87838bg = PangleEncryptManager.encryptType4(jSONObject, new C9041tC(PangleEncryptConstant.CryptDataScene.BIDDING_TOKEN));
            C8990rri.m83864bg(m87838bg);
        } else {
            m87838bg = C7751bg.m87838bg(jSONObject);
        }
        return m87838bg != null ? m87838bg : new JSONObject();
    }

    @Override // com.bytedance.sdk.openadsdk.core.InterfaceC8757Uw
    /* renamed from: bg */
    public boolean mo84950bg(String str, int i, String str2, String str3, String str4) {
        if (this.f19349bX.equals(C8838VzQ.m84740bg().getPackageName()) && this.eqN.equals(C8840WR.m84734IL().eqN()) && !TextUtils.isEmpty(str)) {
            try {
                Method m87828bg = com.bytedance.sdk.component.utils.kMt.m87828bg("com.bytedance.sdk.openadsdk.TTC3Proxy", "verityPlayable", String.class, Integer.TYPE, String.class, String.class, String.class);
                if (m87828bg != null) {
                    m87828bg.invoke(null, str, Integer.valueOf(i), str2, str3, str4);
                }
            } catch (Throwable unused) {
            }
            return true;
        }
        return false;
    }
}
