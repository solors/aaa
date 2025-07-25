package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import com.bykv.p135vk.openvk.p136bg.p137bg.p149bg.p151bX.C6493IL;
import com.bytedance.sdk.component.utils.C7741PX;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.model.rri */
/* loaded from: classes3.dex */
public class C8965rri {

    /* renamed from: IL */
    private int f19934IL;

    /* renamed from: Kg */
    private int f19935Kg;

    /* renamed from: WR */
    private int f19936WR;

    /* renamed from: bX */
    private boolean f19937bX;

    /* renamed from: bg */
    private int f19938bg;

    /* renamed from: eo */
    private boolean f19939eo;
    private int eqN;

    /* renamed from: iR */
    private int f19940iR;
    private String ldr;

    /* renamed from: zx */
    private String f19941zx;

    public C8965rri(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.f19937bX = jSONObject.optBoolean("is_playable");
        this.eqN = jSONObject.optInt("playable_type", 0);
        this.f19941zx = jSONObject.optString("playable_style");
        JSONObject optJSONObject = jSONObject.optJSONObject("playable");
        if (optJSONObject != null) {
            this.ldr = optJSONObject.optString("playable_url", "");
            this.f19940iR = optJSONObject.optInt("playable_orientation", 0);
            this.f19934IL = optJSONObject.optInt("new_style", 0);
            this.f19938bg = optJSONObject.optInt("close_2_app", 0);
            int m84167IL = m84167IL(this.eqN);
            this.f19935Kg = optJSONObject.optInt("playable_webview_timeout", m84167IL);
            this.f19936WR = optJSONObject.optInt("playable_js_timeout", m84167IL);
            this.f19939eo = optJSONObject.optInt("playable_backup_enable", 0) == 1;
        }
    }

    /* renamed from: Fy */
    public static long m84169Fy(AbstractC8967tuV abstractC8967tuV) {
        return Math.max(m84164LZ(abstractC8967tuV), m84150tC(abstractC8967tuV));
    }

    /* renamed from: IL */
    private static int m84167IL(int i) {
        return i == 1 ? 10 : 5;
    }

    private static int JAA(AbstractC8967tuV abstractC8967tuV) {
        C8965rri kMt = kMt(abstractC8967tuV);
        if (kMt == null) {
            return 0;
        }
        return kMt.eqN;
    }

    /* renamed from: Kg */
    public static boolean m84165Kg(AbstractC8967tuV abstractC8967tuV) {
        C8965rri mo84103Lq = abstractC8967tuV.mo84103Lq();
        if (mo84103Lq == null || abstractC8967tuV.kCH() || !mo84103Lq.f19937bX || mo84103Lq.f19934IL != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: LZ */
    public static long m84164LZ(AbstractC8967tuV abstractC8967tuV) {
        C8965rri kMt = kMt(abstractC8967tuV);
        if (kMt == null) {
            return 5L;
        }
        return kMt.m84156bg();
    }

    /* renamed from: Lq */
    public static boolean m84163Lq(AbstractC8967tuV abstractC8967tuV) {
        int i;
        if (abstractC8967tuV != null && abstractC8967tuV.Dxa() != null) {
            i = abstractC8967tuV.Dxa().m91753Fy();
        } else {
            i = 0;
        }
        if (i == 1) {
            return false;
        }
        return true;
    }

    /* renamed from: PX */
    public static String m84162PX(AbstractC8967tuV abstractC8967tuV) {
        C8965rri kMt = kMt(abstractC8967tuV);
        if (kMt == null) {
            return null;
        }
        return kMt.ldr;
    }

    /* renamed from: Ta */
    public static String m84161Ta(AbstractC8967tuV abstractC8967tuV) {
        if (abstractC8967tuV == null) {
            return null;
        }
        C8965rri mo84103Lq = abstractC8967tuV.mo84103Lq();
        if (mo84103Lq != null && mo84103Lq.f19937bX) {
            String str = mo84103Lq.ldr;
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        if (abstractC8967tuV.mo83989vb() == 20) {
            return abstractC8967tuV.GvG();
        }
        if (abstractC8967tuV.Dxa() == null) {
            return null;
        }
        return abstractC8967tuV.Dxa().m91745PX();
    }

    /* renamed from: VB */
    public static String m84160VB(AbstractC8967tuV abstractC8967tuV) {
        C8965rri kMt = kMt(abstractC8967tuV);
        if (kMt == null) {
            return null;
        }
        return kMt.f19941zx;
    }

    public static boolean VzQ(AbstractC8967tuV abstractC8967tuV) {
        if (m84151iR(abstractC8967tuV) && JAA(abstractC8967tuV) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: WR */
    public static boolean m84159WR(AbstractC8967tuV abstractC8967tuV) {
        C8965rri mo84103Lq = abstractC8967tuV.mo84103Lq();
        if (mo84103Lq == null || !mo84103Lq.f19937bX || mo84103Lq.f19934IL != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: bX */
    public static boolean m84157bX(AbstractC8967tuV abstractC8967tuV) {
        return m84166IL(abstractC8967tuV) && JAA(abstractC8967tuV) == 1;
    }

    /* renamed from: bg */
    public static int m84155bg(int i) {
        return i + 10;
    }

    /* renamed from: eo */
    public static boolean m84152eo(AbstractC8967tuV abstractC8967tuV) {
        C8965rri mo84103Lq = abstractC8967tuV.mo84103Lq();
        if (mo84103Lq == null || !abstractC8967tuV.kCH() || !mo84103Lq.f19937bX || mo84103Lq.f19934IL != 1) {
            return false;
        }
        return true;
    }

    public static boolean eqN(AbstractC8967tuV abstractC8967tuV) {
        if (m84157bX(abstractC8967tuV) && !m84159WR(abstractC8967tuV)) {
            return true;
        }
        return false;
    }

    /* renamed from: iR */
    public static boolean m84151iR(AbstractC8967tuV abstractC8967tuV) {
        C8965rri kMt = kMt(abstractC8967tuV);
        if (kMt == null || abstractC8967tuV.kCH() || !kMt.f19937bX || TextUtils.isEmpty(m84161Ta(abstractC8967tuV))) {
            return false;
        }
        return true;
    }

    private static C8965rri kMt(AbstractC8967tuV abstractC8967tuV) {
        if (abstractC8967tuV == null) {
            return null;
        }
        return abstractC8967tuV.mo84103Lq();
    }

    public static boolean ldr(AbstractC8967tuV abstractC8967tuV) {
        if (m84148zx(abstractC8967tuV) && JAA(abstractC8967tuV) == 1) {
            return true;
        }
        return false;
    }

    public static boolean rri(AbstractC8967tuV abstractC8967tuV) {
        C8965rri kMt = kMt(abstractC8967tuV);
        if (kMt != null && kMt.m84158bX()) {
            return true;
        }
        return false;
    }

    /* renamed from: tC */
    public static long m84150tC(AbstractC8967tuV abstractC8967tuV) {
        C8965rri kMt = kMt(abstractC8967tuV);
        if (kMt == null) {
            return 5L;
        }
        return kMt.m84168IL();
    }

    public static boolean tuV(AbstractC8967tuV abstractC8967tuV) {
        if (m84151iR(abstractC8967tuV) && JAA(abstractC8967tuV) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: vb */
    public static boolean m84149vb(AbstractC8967tuV abstractC8967tuV) {
        C6493IL Dxa = abstractC8967tuV.Dxa();
        if (Dxa == null || Dxa.m91753Fy() != 1) {
            return false;
        }
        return true;
    }

    public static int xxp(AbstractC8967tuV abstractC8967tuV) {
        C8965rri kMt = kMt(abstractC8967tuV);
        if (kMt == null) {
            return 0;
        }
        return kMt.f19940iR;
    }

    public static boolean yDt(AbstractC8967tuV abstractC8967tuV) {
        return true;
    }

    /* renamed from: zx */
    public static boolean m84148zx(AbstractC8967tuV abstractC8967tuV) {
        C8965rri kMt = kMt(abstractC8967tuV);
        if (kMt == null || !abstractC8967tuV.kCH() || !kMt.f19937bX || TextUtils.isEmpty(m84161Ta(abstractC8967tuV))) {
            return false;
        }
        return true;
    }

    /* renamed from: IL */
    public static boolean m84166IL(AbstractC8967tuV abstractC8967tuV) {
        C8965rri kMt = kMt(abstractC8967tuV);
        return (kMt == null || !kMt.f19937bX || TextUtils.isEmpty(m84161Ta(abstractC8967tuV))) ? false : true;
    }

    /* renamed from: bg */
    public static int m84154bg(AbstractC8967tuV abstractC8967tuV) {
        int i;
        C8965rri mo84103Lq = abstractC8967tuV.mo84103Lq();
        if (mo84103Lq != null && (i = mo84103Lq.f19938bg) >= 0 && i <= 100) {
            return i;
        }
        return 0;
    }

    /* renamed from: bX */
    public boolean m84158bX() {
        return this.f19939eo;
    }

    /* renamed from: IL */
    public int m84168IL() {
        return this.f19936WR;
    }

    /* renamed from: bg */
    public void m84153bg(JSONObject jSONObject) {
        try {
            jSONObject.put("is_playable", this.f19937bX);
        } catch (JSONException e) {
            C7741PX.m87873bg("PlayableModel", e.getMessage());
        }
        if (!TextUtils.isEmpty(this.ldr)) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("playable_url", this.ldr);
                jSONObject2.put("playable_orientation", this.f19940iR);
                jSONObject2.put("new_style", this.f19934IL);
                jSONObject2.put("close_2_app", this.f19938bg);
                jSONObject2.put("playable_webview_timeout", this.f19935Kg);
                jSONObject2.put("playable_js_timeout", this.f19936WR);
                jSONObject2.put("playable_backup_enable", this.f19939eo ? 1 : 0);
                jSONObject.put("playable", jSONObject2);
            } catch (Exception e2) {
                C7741PX.m87873bg("PlayableModel", e2.getMessage());
            }
        }
        try {
            jSONObject.put("playable_type", this.eqN);
        } catch (JSONException e3) {
            C7741PX.m87873bg("PlayableModel", e3.getMessage());
        }
        try {
            jSONObject.put("playable_style", this.f19941zx);
        } catch (JSONException e4) {
            C7741PX.m87873bg("PlayableModel", e4.getMessage());
        }
    }

    /* renamed from: bg */
    public int m84156bg() {
        return this.f19935Kg;
    }
}
