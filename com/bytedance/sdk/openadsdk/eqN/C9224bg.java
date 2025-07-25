package com.bytedance.sdk.openadsdk.eqN;

import android.text.TextUtils;
import com.bytedance.sdk.component.ldr.p261bg.eqN.p272bg.InterfaceC7707IL;
import com.bytedance.sdk.component.p233Kg.AbstractRunnableC7227Kg;
import com.bytedance.sdk.component.utils.C7740Lq;
import com.bytedance.sdk.component.utils.C7741PX;
import com.bytedance.sdk.openadsdk.core.C8838VzQ;
import com.bytedance.sdk.openadsdk.core.model.AbstractC8967tuV;
import com.bytedance.sdk.openadsdk.core.model.C8965rri;
import com.bytedance.sdk.openadsdk.eqN.p342IL.C9118bX;
import com.bytedance.sdk.openadsdk.eqN.p342IL.InterfaceC9117IL;
import com.bytedance.sdk.openadsdk.eqN.p342IL.InterfaceC9119bg;
import com.bytedance.sdk.openadsdk.eqN.p344bg.C9252eqN;
import com.bytedance.sdk.openadsdk.ldr.C9297IL;
import com.bytedance.sdk.openadsdk.multipro.C9307IL;
import com.bytedance.sdk.openadsdk.p284Fy.C7862bg;
import com.bytedance.sdk.openadsdk.utils.C9519VJ;
import com.bytedance.sdk.openadsdk.utils.C9561rri;
import com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity;
import com.zeus.gmc.sdk.mobileads.columbus.internal.ciio2c.C32647coo2iico;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.eqN.bg */
/* loaded from: classes3.dex */
public class C9224bg implements InterfaceC7707IL {

    /* renamed from: Fy */
    private InterfaceC9119bg f20601Fy;

    /* renamed from: IL */
    protected final JSONObject f20602IL;

    /* renamed from: Kg */
    private int f20603Kg;

    /* renamed from: LZ */
    private String f20604LZ;

    /* renamed from: Lq */
    private String f20605Lq;

    /* renamed from: PX */
    private final AtomicBoolean f20606PX;

    /* renamed from: Ta */
    private JSONObject f20607Ta;
    private String VzQ;

    /* renamed from: WR */
    private int f20608WR;

    /* renamed from: bX */
    private boolean f20609bX;

    /* renamed from: bg */
    public final String f20610bg;
    private long eqN;

    /* renamed from: iR */
    private int f20611iR;
    private String kMt;
    private final String ldr;
    private int rri;

    /* renamed from: tC */
    private String f20612tC;
    private String tuV;

    /* renamed from: vb */
    private String f20613vb;
    private String xxp;
    private String yDt;

    /* renamed from: zx */
    private long f20614zx;

    /* renamed from: eo */
    private static final Set<String> f20600eo = new HashSet(Arrays.asList("insight_log"));

    /* renamed from: VB */
    private static final Map<String, String> f20599VB = new HashMap<String, String>() { // from class: com.bytedance.sdk.openadsdk.eqN.bg.1
        {
            put("id", "extra_id");
            put("source", "extra_source");
            put("url", InneractiveInternalBrowserActivity.URL_EXTRA);
            put("toolType", "extra_tool_type");
            put("storeOpenType", "store_open_type");
            put("errorCode", "error_code");
            put("md5", "extra_md5");
            put("areaType", "area_type");
            put("rectInfo", "rect_info");
        }
    };

    /* renamed from: com.bytedance.sdk.openadsdk.eqN.bg$bg */
    /* loaded from: classes3.dex */
    public static final class C9226bg {

        /* renamed from: Fy */
        private String f20615Fy;

        /* renamed from: IL */
        private String f20616IL;

        /* renamed from: Kg */
        private String f20617Kg;

        /* renamed from: Lq */
        private InterfaceC9119bg f20618Lq;

        /* renamed from: PX */
        private final int f20619PX;

        /* renamed from: Ta */
        private String f20620Ta;

        /* renamed from: VB */
        private String f20621VB;
        private int VzQ;

        /* renamed from: WR */
        private String f20622WR;

        /* renamed from: bX */
        private String f20623bX;

        /* renamed from: bg */
        public int f20624bg;

        /* renamed from: eo */
        private JSONObject f20625eo;
        private String eqN;

        /* renamed from: iR */
        private String f20626iR;
        private String ldr;
        private boolean tuV;

        /* renamed from: vb */
        private final long f20627vb;
        private int xxp;
        private InterfaceC9117IL yDt;

        /* renamed from: zx */
        private String f20628zx;

        public C9226bg(long j, AbstractC8967tuV abstractC8967tuV) {
            this.xxp = -1;
            this.VzQ = -1;
            this.f20624bg = -1;
            if (abstractC8967tuV != null) {
                this.tuV = C8965rri.m84166IL(abstractC8967tuV);
                this.xxp = abstractC8967tuV.xxp();
                this.VzQ = abstractC8967tuV.mo83989vb();
                this.f20624bg = abstractC8967tuV.bOf();
            }
            this.f20627vb = j;
            this.f20619PX = C7740Lq.m87886bX(C8838VzQ.m84740bg());
        }

        /* renamed from: IL */
        public C9226bg m83334IL(String str) {
            this.f20623bX = str;
            return this;
        }

        /* renamed from: Kg */
        public C9226bg m83332Kg(String str) {
            this.f20615Fy = str;
            return this;
        }

        /* renamed from: bX */
        public C9226bg m83325bX(String str) {
            this.eqN = str;
            return this;
        }

        public C9226bg eqN(String str) {
            this.f20628zx = str;
            return this;
        }

        /* renamed from: iR */
        public C9226bg m83313iR(String str) {
            this.f20626iR = str;
            return this;
        }

        public C9226bg ldr(String str) {
            this.f20622WR = str;
            return this;
        }

        /* renamed from: zx */
        public C9226bg m83310zx(String str) {
            this.f20617Kg = str;
            return this;
        }

        /* renamed from: bg */
        public C9226bg m83317bg(String str) {
            this.f20620Ta = str;
            return this;
        }

        /* renamed from: bg */
        public C9226bg m83316bg(JSONObject jSONObject) {
            if (jSONObject == null) {
                return this;
            }
            this.f20625eo = jSONObject;
            return this;
        }

        /* renamed from: bg */
        public void m83323bg(InterfaceC9119bg interfaceC9119bg) {
            C9297IL.m83136bg().m83124bg(this.eqN, this.f20615Fy, this.f20626iR, this.f20623bX);
            this.f20618Lq = interfaceC9119bg;
            final C9224bg c9224bg = new C9224bg(this);
            try {
                InterfaceC9117IL interfaceC9117IL = this.yDt;
                if (interfaceC9117IL != null) {
                    interfaceC9117IL.mo83522bg(c9224bg.f20602IL, this.f20627vb);
                } else {
                    new C9118bX().mo83522bg(c9224bg.f20602IL, this.f20627vb);
                }
            } catch (Throwable unused) {
            }
            if (C9307IL.m83088bX()) {
                C9519VJ.m82580bX(new AbstractRunnableC7227Kg("dispatchEvent") { // from class: com.bytedance.sdk.openadsdk.eqN.bg.bg.1
                    @Override // java.lang.Runnable
                    public void run() {
                        C9252eqN.m83298bg(c9224bg);
                    }
                });
            } else {
                C9252eqN.m83298bg(c9224bg);
            }
        }
    }

    public C9224bg(String str, JSONObject jSONObject) {
        this.ldr = "adiff";
        this.f20606PX = new AtomicBoolean(false);
        this.f20607Ta = new JSONObject();
        this.f20610bg = str;
        this.f20602IL = jSONObject;
    }

    /* renamed from: IL */
    private boolean m83388IL(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case 111399750:
                if (str.equals("umeng")) {
                    c = 0;
                    break;
                }
                break;
            case 278118976:
                if (str.equals("event_v1")) {
                    c = 1;
                    break;
                }
                break;
            case 278118978:
                if (str.equals("event_v3")) {
                    c = 2;
                    break;
                }
                break;
            case 1844205361:
                if (str.equals("app_union")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: bg */
    private boolean m83384bg(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "0") || TextUtils.isEmpty(str3)) {
            return false;
        }
        str2.hashCode();
        char c = 65535;
        switch (str2.hashCode()) {
            case 111399750:
                if (str2.equals("umeng")) {
                    c = 0;
                    break;
                }
                break;
            case 278118976:
                if (str2.equals("event_v1")) {
                    c = 1;
                    break;
                }
                break;
            case 278118978:
                if (str2.equals("event_v3")) {
                    c = 2;
                    break;
                }
                break;
            case 1844205361:
                if (str2.equals("app_union")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: iR */
    private void m83380iR() throws JSONException {
        this.f20602IL.putOpt("app_log_url", this.kMt);
        this.f20602IL.putOpt("tag", this.yDt);
        this.f20602IL.putOpt("label", this.f20605Lq);
        this.f20602IL.putOpt("category", this.f20613vb);
        if (!TextUtils.isEmpty(this.xxp)) {
            try {
                this.f20602IL.putOpt("value", Long.valueOf(Long.parseLong(this.xxp)));
            } catch (NumberFormatException unused) {
                this.f20602IL.putOpt("value", 0L);
            }
        }
        if (!TextUtils.isEmpty(this.tuV)) {
            try {
                this.f20602IL.putOpt("ext_value", Long.valueOf(Long.parseLong(this.tuV)));
            } catch (Exception unused2) {
            }
        }
        if (!TextUtils.isEmpty(this.f20612tC)) {
            this.f20602IL.putOpt("log_extra", this.f20612tC);
        }
        if (!TextUtils.isEmpty(this.f20604LZ)) {
            try {
                this.f20602IL.putOpt("ua_policy", Integer.valueOf(Integer.parseInt(this.f20604LZ)));
            } catch (NumberFormatException unused3) {
            }
        }
        m83382bg(this.f20602IL, this.f20605Lq);
        try {
            this.f20602IL.putOpt("nt", Integer.valueOf(this.rri));
        } catch (Exception unused4) {
        }
        Iterator<String> keys = this.f20607Ta.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            this.f20602IL.putOpt(next, this.f20607Ta.opt(next));
        }
    }

    private void ldr() {
        JSONObject jSONObject = this.f20607Ta;
        if (jSONObject == null) {
            if (!m83384bg(this.xxp, this.f20613vb, this.f20612tC)) {
                return;
            }
        } else {
            String optString = jSONObject.optString("value");
            String optString2 = this.f20607Ta.optString("category");
            String optString3 = this.f20607Ta.optString("log_extra");
            if (m83384bg(this.xxp, this.f20613vb, this.f20612tC)) {
                if (!TextUtils.isEmpty(optString) && TextUtils.equals(optString, "0")) {
                    return;
                }
                if (!TextUtils.isEmpty(optString2) && !m83388IL(optString2)) {
                    return;
                }
            } else if ((!TextUtils.isEmpty(optString) && !TextUtils.equals(optString, "0")) || (!TextUtils.isEmpty(this.xxp) && !TextUtils.equals(this.xxp, "0"))) {
                if ((!TextUtils.isEmpty(this.f20613vb) && m83388IL(this.f20613vb)) || (!TextUtils.isEmpty(optString2) && m83388IL(optString2))) {
                    if (TextUtils.isEmpty(this.f20612tC) && TextUtils.isEmpty(optString3)) {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        this.eqN = C9252eqN.f20675bg.incrementAndGet();
    }

    /* renamed from: bX */
    public JSONObject mo83238bX() {
        if (this.f20606PX.get()) {
            return this.f20602IL;
        }
        try {
            m83380iR();
        } catch (Throwable unused) {
        }
        if (this.f20602IL.has("ad_extra_data")) {
            Object opt = this.f20602IL.opt("ad_extra_data");
            if (opt != null) {
                try {
                    if (opt instanceof JSONObject) {
                        C7741PX.m87873bg(C32647coo2iico.c2oc2i, "ad_extra_data is JSONObject");
                        this.f20602IL.put("ad_extra_data", m83383bg((JSONObject) opt).toString());
                    } else if (opt instanceof String) {
                        this.f20602IL.put("ad_extra_data", m83383bg(new JSONObject((String) opt)).toString());
                    }
                } catch (JSONException e) {
                    C7741PX.m87870bg(C32647coo2iico.c2oc2i, "json error", e.getMessage());
                }
            }
            this.f20606PX.set(true);
            return this.f20602IL;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("adiff", this.f20610bg);
            if (this.f20609bX) {
                jSONObject.put("interaction_method", this.f20611iR);
                jSONObject.put("real_interaction_method", this.f20603Kg);
                jSONObject.put("image_mode", this.f20608WR);
            }
            this.f20602IL.put("ad_extra_data", jSONObject.toString());
        } catch (JSONException e2) {
            C7741PX.m87870bg(C32647coo2iico.c2oc2i, "json error", e2.getMessage());
        }
        this.f20606PX.set(true);
        return this.f20602IL;
        return this.f20602IL;
    }

    public String eqN() {
        return this.f20610bg;
    }

    /* renamed from: zx */
    public boolean m83379zx() {
        Set<String> mo83800Ta;
        if (this.f20602IL == null || (mo83800Ta = C8838VzQ.eqN().mo83800Ta()) == null) {
            return false;
        }
        String optString = this.f20602IL.optString("label");
        if (TextUtils.isEmpty(optString)) {
            if (TextUtils.isEmpty(this.f20605Lq)) {
                return false;
            }
            return mo83800Ta.contains(this.f20605Lq);
        }
        return mo83800Ta.contains(optString);
    }

    /* renamed from: IL */
    private void m83387IL(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        for (String str : f20599VB.keySet()) {
            try {
                if (jSONObject.has(str)) {
                    Object opt = jSONObject.opt(str);
                    jSONObject.remove(str);
                    jSONObject.put(f20599VB.get(str), opt);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: bg */
    private JSONObject m83383bg(JSONObject jSONObject) {
        try {
            if (!jSONObject.has("adiff")) {
                jSONObject.put("adiff", this.f20610bg);
            }
            if (this.f20609bX) {
                if (!jSONObject.has("interaction_method")) {
                    jSONObject.put("interaction_method", this.f20611iR);
                }
                if (!jSONObject.has("real_interaction_method")) {
                    jSONObject.put("real_interaction_method", this.f20603Kg);
                }
                if (!jSONObject.has("image_mode")) {
                    jSONObject.put("image_mode", this.f20608WR);
                }
            }
            if (C7862bg.m87502bg("replace_log_extra_key", false)) {
                m83387IL(jSONObject);
            }
            jSONObject.put("pangle_client_unique_id", "pangle-" + this.f20610bg + "-" + System.currentTimeMillis());
            return jSONObject;
        } catch (Throwable th) {
            C7741PX.m87873bg(C32647coo2iico.c2oc2i, th.getMessage() == null ? "error " : th.getMessage());
            return jSONObject;
        }
    }

    C9224bg(C9226bg c9226bg) {
        this.ldr = "adiff";
        this.f20606PX = new AtomicBoolean(false);
        this.f20607Ta = new JSONObject();
        if (!TextUtils.isEmpty(c9226bg.f20616IL)) {
            this.f20610bg = c9226bg.f20616IL;
        } else {
            this.f20610bg = C9561rri.m82393bg();
        }
        this.f20601Fy = c9226bg.f20618Lq;
        this.f20612tC = c9226bg.ldr;
        this.yDt = c9226bg.f20623bX;
        this.f20605Lq = c9226bg.eqN;
        if (!TextUtils.isEmpty(c9226bg.f20628zx)) {
            this.f20613vb = c9226bg.f20628zx;
        } else {
            this.f20613vb = "app_union";
        }
        this.f20604LZ = c9226bg.f20621VB;
        this.xxp = c9226bg.f20617Kg;
        this.tuV = c9226bg.f20622WR;
        this.VzQ = c9226bg.f20626iR;
        this.rri = c9226bg.f20619PX;
        this.kMt = c9226bg.f20620Ta;
        this.f20607Ta = c9226bg.f20625eo = c9226bg.f20625eo != null ? c9226bg.f20625eo : new JSONObject();
        JSONObject jSONObject = new JSONObject();
        this.f20602IL = jSONObject;
        if (!TextUtils.isEmpty(c9226bg.f20620Ta)) {
            try {
                jSONObject.put("app_log_url", c9226bg.f20620Ta);
            } catch (JSONException e) {
                C7741PX.m87873bg(C32647coo2iico.c2oc2i, e.getMessage());
            }
        }
        this.f20611iR = c9226bg.xxp;
        this.f20603Kg = c9226bg.VzQ;
        this.f20608WR = c9226bg.f20624bg;
        this.f20609bX = c9226bg.tuV;
        this.f20614zx = System.currentTimeMillis();
        ldr();
    }

    @Override // com.bytedance.sdk.component.ldr.p261bg.eqN.p272bg.InterfaceC7707IL
    /* renamed from: IL */
    public long mo83389IL() {
        return this.eqN;
    }

    /* renamed from: bg */
    public JSONObject m83381bg(boolean z) {
        JSONObject mo83238bX = mo83238bX();
        try {
            if (z) {
                JSONObject jSONObject = new JSONObject(mo83238bX.toString());
                JSONObject optJSONObject = jSONObject.optJSONObject("params");
                if (optJSONObject != null) {
                    optJSONObject.remove("app_log_url");
                }
                return jSONObject;
            }
            JSONObject jSONObject2 = new JSONObject(mo83238bX.toString());
            jSONObject2.remove("app_log_url");
            return jSONObject2;
        } catch (JSONException e) {
            C7741PX.m87873bg(C32647coo2iico.c2oc2i, e.getMessage());
            return mo83238bX;
        }
    }

    @Override // com.bytedance.sdk.component.ldr.p261bg.eqN.p272bg.InterfaceC7707IL
    /* renamed from: bg */
    public JSONObject mo83385bg(String str) {
        return mo83238bX();
    }

    @Override // com.bytedance.sdk.component.ldr.p261bg.eqN.p272bg.InterfaceC7707IL
    /* renamed from: bg */
    public long mo83386bg() {
        return this.f20614zx;
    }

    /* renamed from: bg */
    private static void m83382bg(JSONObject jSONObject, String str) {
        try {
            Set<String> set = f20600eo;
            if (!set.contains(str) && !set.contains(jSONObject.get("label"))) {
                jSONObject.putOpt("is_ad_event", "1");
            }
        } catch (Throwable th) {
            C7741PX.m87870bg(C32647coo2iico.c2oc2i, th);
        }
    }
}
