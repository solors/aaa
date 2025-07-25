package com.bytedance.sdk.openadsdk.yDt;

import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.p233Kg.AbstractRunnableC7227Kg;
import com.bytedance.sdk.component.utils.C7741PX;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.C8617PX;
import com.bytedance.sdk.openadsdk.core.C8838VzQ;
import com.bytedance.sdk.openadsdk.core.C9095yDt;
import com.bytedance.sdk.openadsdk.core.model.AbstractC8967tuV;
import com.bytedance.sdk.openadsdk.core.settings.C9011xxp;
import com.bytedance.sdk.openadsdk.eqN.p345zx.p346IL.C9281bg;
import com.bytedance.sdk.openadsdk.eqN.p345zx.p346IL.InterfaceC9280bX;
import com.bytedance.sdk.openadsdk.utils.C9510LZ;
import com.bytedance.sdk.openadsdk.utils.C9519VJ;
import com.bytedance.sdk.openadsdk.utils.ayS;
import com.bytedance.sdk.openadsdk.yDt.p365bg.C9635eqN;
import com.bytedance.sdk.openadsdk.yDt.p365bg.InterfaceC9632bX;
import com.ironsource.C21114v8;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.File;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.yDt.bX */
/* loaded from: classes3.dex */
public class C9601bX {

    /* renamed from: bg */
    private static volatile C9601bX f21403bg;

    private C9601bX() {
    }

    /* renamed from: IL */
    public static void m82301IL(final AbstractC8967tuV abstractC8967tuV) {
        if (ayS.m82462bg(abstractC8967tuV) == null || TextUtils.isEmpty(abstractC8967tuV.mo83997qp())) {
            return;
        }
        m82278bg("download_gecko_start", false, new InterfaceC9598IL() { // from class: com.bytedance.sdk.openadsdk.yDt.bX.19
            @Override // com.bytedance.sdk.openadsdk.yDt.InterfaceC9598IL
            @Nullable
            public InterfaceC9632bX getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", abstractC8967tuV.GvG());
                jSONObject.put("channel_name", abstractC8967tuV.mo83997qp());
                return C9635eqN.m82211IL().m82197bg("download_gecko_start").m82198bg(abstractC8967tuV.JMw()).m82209IL(jSONObject.toString());
            }
        });
    }

    /* renamed from: bX */
    private boolean m82296bX(C9635eqN c9635eqN) {
        return c9635eqN == null;
    }

    /* renamed from: bg */
    public static C9601bX m82293bg() {
        if (f21403bg == null) {
            synchronized (C9601bX.class) {
                if (f21403bg == null) {
                    f21403bg = new C9601bX();
                }
            }
        }
        return f21403bg;
    }

    public static void eqN() {
        m82278bg("disk_log", false, new InterfaceC9598IL() { // from class: com.bytedance.sdk.openadsdk.yDt.bX.11
            @Override // com.bytedance.sdk.openadsdk.yDt.InterfaceC9598IL
            public InterfaceC9632bX getLogStats() throws Exception {
                File[] listFiles;
                JSONObject jSONObject = new JSONObject();
                File file = new File(CacheDirFactory.getRootDir());
                long j = 0;
                if (file.exists() && file.isDirectory()) {
                    for (File file2 : file.listFiles()) {
                        long m82284bg = C9601bX.m82284bg(file2);
                        j += m82284bg;
                        jSONObject.put(file2.getName(), m82284bg);
                    }
                }
                if (j < 524288000) {
                    return null;
                }
                return C9635eqN.m82211IL().m82197bg("disk_log").m82209IL(jSONObject.toString());
            }
        });
    }

    /* renamed from: bX */
    public void m82297bX() {
        m82278bg("blind_mode_status", true, new InterfaceC9598IL() { // from class: com.bytedance.sdk.openadsdk.yDt.bX.9
            {
                C9601bX.this = this;
            }

            @Override // com.bytedance.sdk.openadsdk.yDt.InterfaceC9598IL
            public InterfaceC9632bX getLogStats() throws Exception {
                return C9635eqN.m82211IL().m82197bg("blind_mode_status");
            }
        });
    }

    /* renamed from: bX */
    public static void m82295bX(final String str) {
        m82278bg("request_monitor_daily", false, new InterfaceC9598IL() { // from class: com.bytedance.sdk.openadsdk.yDt.bX.15
            @Override // com.bytedance.sdk.openadsdk.yDt.InterfaceC9598IL
            @Nullable
            public InterfaceC9632bX getLogStats() throws Exception {
                return C9635eqN.m82211IL().m82197bg("request_monitor_daily").m82209IL(str);
            }
        });
    }

    /* renamed from: bX */
    public static void m82294bX(final String str, final String str2) {
        m82278bg("playable_url_mime", false, new InterfaceC9598IL() { // from class: com.bytedance.sdk.openadsdk.yDt.bX.17
            @Override // com.bytedance.sdk.openadsdk.yDt.InterfaceC9598IL
            @Nullable
            public InterfaceC9632bX getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    String str3 = str;
                    Object obj = "not validate";
                    if (TextUtils.isEmpty(str3)) {
                        str3 = "not validate";
                    }
                    jSONObject.put("original_mime", str3);
                    String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(str2));
                    if (!TextUtils.isEmpty(mimeTypeFromExtension)) {
                        obj = mimeTypeFromExtension;
                    }
                    jSONObject.put("new_mime", obj);
                    jSONObject.put("url", str2);
                    jSONObject.put("is_same", str3.equals(obj) ? 1 : 0);
                } catch (Throwable unused) {
                }
                return C9635eqN.m82211IL().m82197bg("playable_url_mime").m82209IL(jSONObject.toString());
            }
        });
    }

    /* renamed from: IL */
    public void m82300IL(final C9635eqN c9635eqN) {
        if (m82296bX(c9635eqN)) {
            return;
        }
        c9635eqN.m82197bg("show_backup_endcard");
        C8838VzQ.m84738zx().mo82273bg(new InterfaceC9598IL() { // from class: com.bytedance.sdk.openadsdk.yDt.bX.22
            {
                C9601bX.this = this;
            }

            @Override // com.bytedance.sdk.openadsdk.yDt.InterfaceC9598IL
            public InterfaceC9632bX getLogStats() throws Exception {
                return c9635eqN;
            }
        });
    }

    /* renamed from: bg */
    public static void m82288bg(final AbstractC8967tuV abstractC8967tuV) {
        if (abstractC8967tuV == null) {
            return;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        m82278bg("bidding_receive", false, new InterfaceC9598IL() { // from class: com.bytedance.sdk.openadsdk.yDt.bX.1
            @Override // com.bytedance.sdk.openadsdk.yDt.InterfaceC9598IL
            @Nullable
            public InterfaceC9632bX getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("reveice_ts", currentTimeMillis);
                if (abstractC8967tuV.JMw() == 3) {
                    jSONObject.put("is_icon_only", abstractC8967tuV.mo84099NC() ? 1 : 0);
                }
                return C9635eqN.m82211IL().m82197bg("bidding_receive").m82209IL(jSONObject.toString());
            }
        });
    }

    /* renamed from: IL */
    public void m82299IL(final String str) {
        m82278bg("close_playable_test_tool", false, new InterfaceC9598IL() { // from class: com.bytedance.sdk.openadsdk.yDt.bX.3
            {
                C9601bX.this = this;
            }

            @Override // com.bytedance.sdk.openadsdk.yDt.InterfaceC9598IL
            public InterfaceC9632bX getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("playable_url", str);
                } catch (Throwable unused) {
                }
                return C9635eqN.m82211IL().m82197bg("close_playable_test_tool").m82209IL(jSONObject.toString());
            }
        });
    }

    /* renamed from: IL */
    public static void m82302IL() {
        C9519VJ.m82580bX(new AbstractRunnableC7227Kg("showFailLog") { // from class: com.bytedance.sdk.openadsdk.yDt.bX.6
            @Override // java.lang.Runnable
            public void run() {
                try {
                    C9601bX.m82293bg().m82279bg("show_fail_log", new JSONObject());
                } catch (Throwable th) {
                    C7741PX.m87873bg("StatsLogManager", th.getMessage());
                }
            }
        });
    }

    /* renamed from: IL */
    public static void m82298IL(String str, String str2) {
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                final C9635eqN m82209IL = C9635eqN.m82211IL().m82197bg(str).m82209IL(str2);
                C8838VzQ.m84738zx().mo82272bg(new InterfaceC9598IL() { // from class: com.bytedance.sdk.openadsdk.yDt.bX.13
                    @Override // com.bytedance.sdk.openadsdk.yDt.InterfaceC9598IL
                    public InterfaceC9632bX getLogStats() throws Exception {
                        return m82209IL;
                    }
                }, false);
            }
        } catch (Throwable th) {
            C7741PX.m87873bg("StatsLogManager", th.getMessage());
        }
    }

    /* renamed from: bg */
    public static void m82287bg(AbstractC8967tuV abstractC8967tuV, final long j) {
        if (abstractC8967tuV == null) {
            return;
        }
        m82278bg("bidding_load", false, new InterfaceC9598IL() { // from class: com.bytedance.sdk.openadsdk.yDt.bX.12
            @Override // com.bytedance.sdk.openadsdk.yDt.InterfaceC9598IL
            @Nullable
            public InterfaceC9632bX getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("duration", j);
                return C9635eqN.m82211IL().m82197bg("bidding_load").m82209IL(jSONObject.toString());
            }
        });
    }

    /* renamed from: bg */
    public static void m82281bg(final String str, final C9281bg c9281bg) {
        if (c9281bg == null) {
            return;
        }
        m82278bg(str, false, new InterfaceC9598IL() { // from class: com.bytedance.sdk.openadsdk.yDt.bX.18
            @Override // com.bytedance.sdk.openadsdk.yDt.InterfaceC9598IL
            @Nullable
            public InterfaceC9632bX getLogStats() throws Exception {
                JSONObject m83196bX = c9281bg.m83196bX();
                if (m83196bX == null) {
                    m83196bX = new JSONObject();
                }
                InterfaceC9280bX eqN = c9281bg.eqN();
                if (eqN != null) {
                    eqN.mo83173bg(m83196bX);
                }
                return C9635eqN.m82211IL().m82197bg(str).m82198bg(c9281bg.m83195bg().JMw()).m82209IL(m83196bX.toString());
            }
        });
    }

    /* renamed from: bg */
    public static void m82286bg(final AbstractC8967tuV abstractC8967tuV, final JSONObject jSONObject) {
        if (ayS.m82462bg(abstractC8967tuV) == null || TextUtils.isEmpty(abstractC8967tuV.mo83997qp())) {
            return;
        }
        m82278bg("download_gecko_end", false, new InterfaceC9598IL() { // from class: com.bytedance.sdk.openadsdk.yDt.bX.20
            @Override // com.bytedance.sdk.openadsdk.yDt.InterfaceC9598IL
            @Nullable
            public InterfaceC9632bX getLogStats() throws Exception {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("url", abstractC8967tuV.GvG());
                jSONObject2.put("channel_name", abstractC8967tuV.mo83997qp());
                jSONObject2.put("data", jSONObject);
                return C9635eqN.m82211IL().m82197bg("download_gecko_end").m82198bg(abstractC8967tuV.JMw()).m82209IL(jSONObject2.toString());
            }
        });
    }

    /* renamed from: bg */
    public void m82285bg(final C9635eqN c9635eqN) {
        if (m82296bX(c9635eqN)) {
            return;
        }
        c9635eqN.m82197bg("express_ad_render");
        C8838VzQ.m84738zx().mo82273bg(new InterfaceC9598IL() { // from class: com.bytedance.sdk.openadsdk.yDt.bX.21
            {
                C9601bX.this = this;
            }

            @Override // com.bytedance.sdk.openadsdk.yDt.InterfaceC9598IL
            public InterfaceC9632bX getLogStats() throws Exception {
                return c9635eqN;
            }
        });
    }

    /* renamed from: bg */
    public void m82283bg(final String str) {
        m82278bg("click_playable_test_tool", false, new InterfaceC9598IL() { // from class: com.bytedance.sdk.openadsdk.yDt.bX.2
            {
                C9601bX.this = this;
            }

            @Override // com.bytedance.sdk.openadsdk.yDt.InterfaceC9598IL
            public InterfaceC9632bX getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("playable_url", str);
                } catch (Throwable unused) {
                }
                return C9635eqN.m82211IL().m82197bg("click_playable_test_tool").m82209IL(jSONObject.toString());
            }
        });
    }

    /* renamed from: bg */
    public void m82282bg(final String str, final int i, final String str2) {
        m82278bg("use_playable_test_tool_error", false, new InterfaceC9598IL() { // from class: com.bytedance.sdk.openadsdk.yDt.bX.4
            {
                C9601bX.this = this;
            }

            @Override // com.bytedance.sdk.openadsdk.yDt.InterfaceC9598IL
            public InterfaceC9632bX getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("playable_url", str);
                    jSONObject.put("error_code", i);
                    jSONObject.put("error_message", str2);
                } catch (Throwable unused) {
                }
                return C9635eqN.m82211IL().m82197bg("use_playable_test_tool_error").m82209IL(jSONObject.toString());
            }
        });
    }

    /* renamed from: bg */
    public void m82290bg(final long j, final long j2) {
        final long j3 = j2 - j;
        m82278bg("general_label", false, new InterfaceC9598IL() { // from class: com.bytedance.sdk.openadsdk.yDt.bX.5
            {
                C9601bX.this = this;
            }

            @Override // com.bytedance.sdk.openadsdk.yDt.InterfaceC9598IL
            public InterfaceC9632bX getLogStats() throws Exception {
                int i = !C9095yDt.f20318IL.get();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("starttime", j);
                    jSONObject.put("endtime", j2);
                    jSONObject.put("start_type", i);
                } catch (Throwable unused) {
                }
                return C9635eqN.m82211IL().m82197bg("general_label").m82207Kg(String.valueOf(j3)).m82209IL(jSONObject.toString());
            }
        });
    }

    /* renamed from: bg */
    public void m82279bg(final String str, final JSONObject jSONObject) {
        if (str == null || jSONObject == null) {
            return;
        }
        m82278bg(str, false, new InterfaceC9598IL() { // from class: com.bytedance.sdk.openadsdk.yDt.bX.7
            {
                C9601bX.this = this;
            }

            @Override // com.bytedance.sdk.openadsdk.yDt.InterfaceC9598IL
            public InterfaceC9632bX getLogStats() throws Exception {
                return C9635eqN.m82211IL().m82197bg(str).m82209IL(jSONObject.toString());
            }
        });
    }

    /* renamed from: bg */
    public void m82280bg(final String str, final String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        m82278bg(str, false, new InterfaceC9598IL() { // from class: com.bytedance.sdk.openadsdk.yDt.bX.8
            {
                C9601bX.this = this;
            }

            @Override // com.bytedance.sdk.openadsdk.yDt.InterfaceC9598IL
            public InterfaceC9632bX getLogStats() throws Exception {
                return C9635eqN.m82211IL().m82197bg(str).m82209IL(str2);
            }
        });
    }

    /* renamed from: bg */
    public void m82277bg(final JSONObject jSONObject) {
        if (jSONObject == null) {
            C9510LZ.m82613bg("adRevenuePangle", "You must pass adRevenue json to pangle");
            return;
        }
        Object opt = jSONObject.opt("device_ad_mediation_platform");
        if ((opt instanceof String) && !TextUtils.isEmpty((String) opt)) {
            C9510LZ.m82612bg("adRevenuePangle", "pangle", "You successfully passed the parameters to pangle. The parameters are:", jSONObject);
            m82278bg("ad_revenue", true, new InterfaceC9598IL() { // from class: com.bytedance.sdk.openadsdk.yDt.bX.10
                {
                    C9601bX.this = this;
                }

                @Override // com.bytedance.sdk.openadsdk.yDt.InterfaceC9598IL
                public InterfaceC9632bX getLogStats() throws Exception {
                    try {
                        jSONObject.put("event", 272);
                        jSONObject.put(CommonUrlParts.UUID, C8617PX.m85534bX(C8838VzQ.m84740bg()));
                        String str = "";
                        if (C8617PX.m85532bg(C8838VzQ.m84740bg()) != null) {
                            str = C8617PX.m85532bg(C8838VzQ.m84740bg());
                        }
                        jSONObject.put("device_id", str);
                        jSONObject.put("platform", "android");
                        jSONObject.put("partner", "PangleSDK");
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                    return C9635eqN.m82211IL().m82197bg("ad_revenue").m82209IL(jSONObject.toString());
                }
            });
            return;
        }
        C9510LZ.m82613bg("adRevenuePangle", "You must pass device_ad_mediation_platform to pangle");
    }

    /* renamed from: bg */
    public static long m82284bg(File file) {
        if (file.isFile()) {
            return file.length();
        }
        long j = 0;
        for (File file2 : file.listFiles()) {
            j += m82284bg(file2);
        }
        return j;
    }

    /* renamed from: bg */
    public static void m82278bg(String str, boolean z, InterfaceC9598IL interfaceC9598IL) {
        int mo83816IL = C9011xxp.m83746zU().mo83816IL(str);
        if (TextUtils.isEmpty(str) || mo83816IL == 0 || interfaceC9598IL == null) {
            return;
        }
        boolean z2 = mo83816IL == 100;
        if (!z2) {
            z2 = ((int) ((Math.random() * 100.0d) + 1.0d)) <= mo83816IL;
        }
        if (z2) {
            C8838VzQ.m84738zx().mo82272bg(interfaceC9598IL, z);
        }
    }

    /* renamed from: bg */
    public static void m82289bg(long j, long j2, final String str, final int i) {
        if (j == 0) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        final long j3 = elapsedRealtime - j;
        final long j4 = elapsedRealtime - j2;
        final long j5 = j2 - j;
        m82278bg("ad_show_cost_time", false, new InterfaceC9598IL() { // from class: com.bytedance.sdk.openadsdk.yDt.bX.14
            @Override // com.bytedance.sdk.openadsdk.yDt.InterfaceC9598IL
            public InterfaceC9632bX getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("duration", j3);
                jSONObject.put("renderDuration", j4);
                jSONObject.put("showToRenderDuration", j5);
                jSONObject.put("tag", str);
                jSONObject.put("renderType", i);
                return C9635eqN.m82211IL().m82197bg("ad_show_cost_time").m82209IL(jSONObject.toString());
            }
        });
    }

    /* renamed from: bg */
    public static void m82292bg(int i, String str) {
        m82291bg(i, str, 0, (String) null);
    }

    /* renamed from: bg */
    public static void m82291bg(final int i, final String str, final int i2, final String str2) {
        m82278bg("ipv6_req", false, (InterfaceC9598IL) new InterfaceC9598IL<InterfaceC9632bX>() { // from class: com.bytedance.sdk.openadsdk.yDt.bX.16
            @Override // com.bytedance.sdk.openadsdk.yDt.InterfaceC9598IL
            @Nullable
            public InterfaceC9632bX getLogStats() throws Exception {
                String str3;
                JSONObject jSONObject = new JSONObject();
                int i3 = i;
                if (i3 == 1) {
                    str3 = "success";
                } else if (i3 == -1) {
                    jSONObject.put("error_code", i2);
                    jSONObject.put("error_msg", str2);
                    str3 = C21114v8.C21120f.f53958e;
                } else {
                    str3 = "start";
                }
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("url", str);
                }
                jSONObject.put("status", str3);
                return C9635eqN.m82211IL().m82197bg("ipv6_req").m82209IL(jSONObject.toString());
            }
        });
    }
}
