package com.bytedance.sdk.openadsdk.eqN.p344bg;

import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.multipro.eqN.C9351bg;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.yDt.C9601bX;
import com.maticoo.sdk.utils.event.EventId;
import com.p552ot.pubsub.p561i.p562a.C26559a;
import java.util.concurrent.atomic.AtomicInteger;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.eqN.bg.ldr */
/* loaded from: classes3.dex */
public class C9255ldr {

    /* renamed from: bg */
    public static AtomicInteger f20684bg = new AtomicInteger(0);

    /* renamed from: IL */
    public static AtomicInteger f20680IL = new AtomicInteger(0);

    /* renamed from: bX */
    public static AtomicInteger f20683bX = new AtomicInteger(0);
    public static AtomicInteger eqN = new AtomicInteger(0);

    /* renamed from: zx */
    public static AtomicInteger f20686zx = new AtomicInteger(0);
    public static AtomicInteger ldr = new AtomicInteger(0);

    /* renamed from: iR */
    public static AtomicInteger f20685iR = new AtomicInteger(0);

    /* renamed from: Kg */
    public static AtomicInteger f20681Kg = new AtomicInteger(0);

    /* renamed from: WR */
    public static AtomicInteger f20682WR = new AtomicInteger(0);

    /* renamed from: IL */
    public static void m83291IL() {
        try {
            C9601bX.m82293bg().m82280bg("pangle_sdk_get_ad_track", C9351bg.m83003IL("tt_sdk_event_get_ad", "get_ad_event_key", ""));
            C9351bg.m82995bg("tt_sdk_event_get_ad");
        } catch (Throwable unused) {
        }
    }

    /* renamed from: bX */
    public static void m83290bX() {
        try {
            C9351bg.m82987bg("tt_sdk_event_get_ad", "get_ad_event_key", eqN().toString());
        } catch (Throwable unused) {
        }
    }

    /* renamed from: bg */
    public static void m83289bg() {
        try {
            long m82992bg = C9351bg.m82992bg("tt_sdk_event_get_ad", "get_ad_event_time_key", 0L);
            int i = (m82992bg > 0L ? 1 : (m82992bg == 0L ? 0 : -1));
            if (i > 0 && System.currentTimeMillis() - m82992bg >= 86400000) {
                m83291IL();
                C9351bg.m82988bg("tt_sdk_event_get_ad", "get_ad_event_time_key", Long.valueOf(System.currentTimeMillis()));
                return;
            }
            if (i <= 0 || m82992bg > System.currentTimeMillis()) {
                C9351bg.m82988bg("tt_sdk_event_get_ad", "get_ad_event_time_key", Long.valueOf(System.currentTimeMillis()));
            }
            JSONObject jSONObject = new JSONObject(C9351bg.m83003IL("tt_sdk_event_get_ad", "get_ad_event_key", ""));
            int optInt = jSONObject.optInt("load_get_ad_version", 0);
            if (optInt >= 5702 && (optInt < 5800 || optInt >= 5802)) {
                f20684bg.addAndGet(jSONObject.optInt("load_times"));
                f20680IL.addAndGet(jSONObject.optInt(EventId.AD_LOAD_SUCCEED_NAME));
                f20683bX.addAndGet(jSONObject.optInt(Reporting.EventType.LOAD_FAIL));
                eqN.addAndGet(jSONObject.optInt("load_success_and_parse_success"));
                f20686zx.addAndGet(jSONObject.optInt("load_success_and_parse_fail"));
                ldr.addAndGet(jSONObject.optInt("load_success_and_no_ad"));
                f20685iR.addAndGet(jSONObject.optInt("load_fail_by_no_net"));
                f20681Kg.addAndGet(jSONObject.optInt("load_fail_by_io"));
                f20682WR.addAndGet(jSONObject.optInt("load_fail_in_background"));
                return;
            }
            C9351bg.m82995bg("tt_sdk_event_get_ad");
        } catch (Throwable unused) {
        }
    }

    public static JSONObject eqN() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("load_times", f20684bg.get());
            jSONObject.put(EventId.AD_LOAD_SUCCEED_NAME, f20680IL.get());
            jSONObject.put(Reporting.EventType.LOAD_FAIL, f20683bX.get());
            jSONObject.put("load_fail_in_background", f20682WR.get());
            jSONObject.put("load_success_and_parse_success", eqN.get());
            jSONObject.put("load_success_and_parse_fail", f20686zx.get());
            jSONObject.put("load_success_and_no_ad", ldr.get());
            jSONObject.put("load_fail_by_no_net", f20685iR.get());
            jSONObject.put("load_fail_by_io", f20681Kg.get());
            jSONObject.put("load_get_ad_version", BuildConfig.VERSION_CODE);
            return jSONObject;
        } catch (Throwable unused) {
            return new JSONObject();
        }
    }

    /* renamed from: zx */
    public static void m83287zx() {
        try {
            if (!DeviceUtils.m82711IL()) {
                f20682WR.incrementAndGet();
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: bg */
    public static void m83288bg(int i, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C26559a.f69635d, i);
            jSONObject.put("msg", str);
            C9601bX.m82293bg().m82279bg("pangle_sdk_client_load_error", jSONObject);
        } catch (Throwable unused) {
        }
    }
}
