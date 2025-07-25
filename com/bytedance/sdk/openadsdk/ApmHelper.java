package com.bytedance.sdk.openadsdk;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.device.ads.DtbConstants;
import com.apm.insight.AttachUserData;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.MonitorCrash;
import com.bytedance.sdk.component.p233Kg.AbstractRunnableC7227Kg;
import com.bytedance.sdk.component.utils.C7741PX;
import com.bytedance.sdk.component.utils.C7751bg;
import com.bytedance.sdk.openadsdk.core.C8617PX;
import com.bytedance.sdk.openadsdk.core.C8838VzQ;
import com.bytedance.sdk.openadsdk.core.model.AbstractC8967tuV;
import com.bytedance.sdk.openadsdk.core.settings.InterfaceC9010ldr;
import com.bytedance.sdk.openadsdk.eqN.C9165bX;
import com.bytedance.sdk.openadsdk.utils.C9499IL;
import com.bytedance.sdk.openadsdk.utils.C9519VJ;
import com.bytedance.sdk.openadsdk.utils.ayS;
import com.bytedance.sdk.openadsdk.yDt.p364bX.InterfaceC9627bg;
import com.ironsource.C21018tj;
import com.maticoo.sdk.utils.constant.KeyConstants;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class ApmHelper {

    /* renamed from: bX */
    private static String f17154bX;

    /* renamed from: bg */
    private static volatile boolean f17155bg;
    private static boolean eqN;

    /* renamed from: iR */
    private static C7861bg f17156iR;
    private static InterfaceC7860IL ldr;

    /* renamed from: IL */
    private static final AtomicBoolean f17153IL = new AtomicBoolean(false);

    /* renamed from: zx */
    private static boolean f17157zx = false;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.bytedance.sdk.openadsdk.ApmHelper$IL */
    /* loaded from: classes3.dex */
    public interface InterfaceC7860IL {
        /* renamed from: bg */
        void mo87510bg(String str, String str2, Throwable th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.bytedance.sdk.openadsdk.ApmHelper$bg */
    /* loaded from: classes3.dex */
    public static class C7861bg {

        /* renamed from: IL */
        public final String f17167IL;

        /* renamed from: bX */
        public final Throwable f17168bX;

        /* renamed from: bg */
        public final String f17169bg;

        public C7861bg(String str, String str2, Throwable th) {
            this.f17169bg = str;
            this.f17167IL = str2;
            this.f17168bX = th;
        }
    }

    /* renamed from: WR */
    private static Map<String, String> m87523WR() {
        HashMap hashMap = new HashMap();
        AbstractC8967tuV m82658bg = C9499IL.m82658bg();
        if (m82658bg != null) {
            hashMap.put("adType", String.valueOf(m82658bg.JMw()));
            hashMap.put(C21018tj.f53565b, String.valueOf(m82658bg.VHL()));
            hashMap.put("cid", m82658bg.mo84069Ys());
            hashMap.put(KeyConstants.RequestBody.KEY_REQ_ID, m82658bg.waE());
            hashMap.put("rit", m82658bg.JAA("-1"));
            int JAA = m82658bg.JAA();
            if (m82658bg.mo83995tC() != 2) {
                JAA = -1;
            }
            hashMap.put("render_type", String.valueOf(JAA));
        }
        return hashMap;
    }

    /* renamed from: bX */
    static /* synthetic */ Map m87522bX() {
        return m87523WR();
    }

    public static void initApm(final Context context, final InitConfig initConfig) {
        if (!f17153IL.compareAndSet(false, true) || f17155bg) {
            return;
        }
        C9519VJ.m82577bg(new AbstractRunnableC7227Kg("init-apm") { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1
            @Override // java.lang.Runnable
            public void run() {
                if (!ApmHelper.f17155bg) {
                    InterfaceC9010ldr eqN2 = C8838VzQ.eqN();
                    boolean unused = ApmHelper.eqN = eqN2.mo83759jz();
                    if (ApmHelper.eqN && !TextUtils.isEmpty(eqN2.daV())) {
                        String unused2 = ApmHelper.f17154bX = initConfig.getAppId();
                        String[] strArr = {"com.bytedance.sdk.component", "com.bytedance.sdk.mediation", BuildConfig.LIBRARY_PACKAGE_NAME, "com.com.bytedance.overseas.sdk", "com.pgl.ssdk", "com.bykv.vk", "com.iab.omid.library.bytedance2", "com.bytedance.adsdk"};
                        String m85532bg = C8617PX.m85532bg(context);
                        String daV = eqN2.daV();
                        try {
                            final MonitorCrash initSDK = MonitorCrash.initSDK(context, "10000001", 6406L, BuildConfig.VERSION_NAME, strArr);
                            initSDK.setCustomDataCallback(new AttachUserData() { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1.1
                                @Override // com.apm.insight.AttachUserData
                                @Nullable
                                public Map<? extends String, ? extends String> getUserData(CrashType crashType) {
                                    Map<? extends String, ? extends String> m87522bX = ApmHelper.m87522bX();
                                    if (m87522bX.containsKey("render_type")) {
                                        initSDK.addTags("render_type", m87522bX.get("render_type"));
                                    } else {
                                        initSDK.addTags("render_type", "-2");
                                    }
                                    return m87522bX;
                                }
                            });
                            if (eqN2.RiO()) {
                                initSDK.config().setSoList(new String[]{"libnms.so", "libtobEmbedPagEncrypt.so", "tt_ugen_layout.so"});
                            }
                            initSDK.config().setDeviceId(m85532bg);
                            initSDK.setReportUrl(daV);
                            initSDK.addTags("host_appid", ApmHelper.f17154bX);
                            initSDK.addTags("sdk_version", BuildConfig.VERSION_NAME);
                            InterfaceC7860IL unused3 = ApmHelper.ldr = new InterfaceC7860IL() { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1.2
                                @Override // com.bytedance.sdk.openadsdk.ApmHelper.InterfaceC7860IL
                                /* renamed from: bg */
                                public void mo87510bg(String str, String str2, Throwable th) {
                                    initSDK.reportCustomErr(str, str2, th);
                                }
                            };
                            boolean unused4 = ApmHelper.f17155bg = true;
                            ApmHelper.m87520bX(m85532bg, daV);
                            initSDK.registerCrashCallback(new ICrashCallback() { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1.3
                                @Override // com.apm.insight.ICrashCallback
                                public void onCrash(@NonNull CrashType crashType, @Nullable String str, @Nullable Thread thread) {
                                    if (!ApmHelper.f17157zx) {
                                        ApmHelper.eqN(crashType.getName());
                                    }
                                    boolean unused5 = ApmHelper.f17157zx = true;
                                }
                            }, CrashType.ALL);
                            C7861bg c7861bg = ApmHelper.f17156iR;
                            C7861bg unused5 = ApmHelper.f17156iR = null;
                            if (c7861bg != null) {
                                ApmHelper.ldr.mo87510bg(c7861bg.f17169bg, c7861bg.f17167IL, c7861bg.f17168bX);
                            }
                        } catch (Throwable unused6) {
                            boolean unused7 = ApmHelper.f17155bg = false;
                        }
                    }
                }
                ApmHelper.f17153IL.set(false);
            }
        });
    }

    public static boolean isIsInit() {
        return f17155bg;
    }

    public static void reportCustomError(String str, String str2, Throwable th) {
        InterfaceC7860IL interfaceC7860IL = ldr;
        if (interfaceC7860IL != null) {
            interfaceC7860IL.mo87510bg(str, str2, th);
        } else {
            f17156iR = new C7861bg(str, str2, th);
        }
    }

    public static void reportPvFromBackGround() {
        if (eqN) {
            m87526IL(C8617PX.m85532bg(C8838VzQ.m84740bg()), C8838VzQ.eqN().daV());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void eqN(final String str) {
        final AbstractC8967tuV m82658bg = C9499IL.m82658bg();
        if (m82658bg != null) {
            String m82462bg = ayS.m82462bg(m82658bg);
            if (TextUtils.isEmpty(m82462bg)) {
                return;
            }
            C9165bX.m83430bg(System.currentTimeMillis(), m82658bg, m82462bg, "sdk_crash_info", new InterfaceC9627bg() { // from class: com.bytedance.sdk.openadsdk.ApmHelper.2
                @Override // com.bytedance.sdk.openadsdk.yDt.p364bX.InterfaceC9627bg
                /* renamed from: bg */
                public JSONObject mo82275bg() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("type", str);
                        jSONObject2.put("material", C7751bg.m87838bg(m82658bg.ZTq()).toString());
                        jSONObject.put("ad_extra_data", jSONObject2.toString());
                    } catch (JSONException unused) {
                    }
                    return jSONObject;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bX */
    public static void m87520bX(String str, String str2) {
        m87526IL(str, str2);
    }

    /* renamed from: IL */
    private static void m87526IL(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        C8838VzQ.m84741bX().mo85553bg(m87521bX(str), DtbConstants.HTTPS + str2 + "/monitor/collect/c/session?version_code=6406&device_platform=android&aid=10000001");
    }

    /* renamed from: bX */
    private static JSONObject m87521bX(String str) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("sdk_version", BuildConfig.VERSION_NAME);
            jSONObject3.put("host_app_id", f17154bX);
            jSONObject2.putOpt("custom", jSONObject3);
            jSONObject2.put("os", "Android");
            jSONObject2.put(CommonUrlParts.OS_VERSION, Build.VERSION.RELEASE);
            jSONObject2.put("device_model", Build.MODEL);
            jSONObject2.put("device_brand", Build.BRAND);
            jSONObject2.put("sdk_version_name", "0.0.5");
            jSONObject2.put(C21018tj.f53565b, "10000001");
            jSONObject2.put("update_version_code", BuildConfig.VERSION_CODE);
            jSONObject2.put("bd_did", str);
            jSONObject.putOpt("header", jSONObject2);
            jSONObject.putOpt("local_time", Long.valueOf(System.currentTimeMillis()));
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(new JSONObject().put("local_time_ms", System.currentTimeMillis()));
            jSONObject.putOpt("launch", jSONArray);
        } catch (JSONException e) {
            C7741PX.m87873bg("ApmHelper", e.getMessage());
        }
        return jSONObject;
    }
}
