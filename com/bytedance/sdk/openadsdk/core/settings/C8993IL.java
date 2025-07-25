package com.bytedance.sdk.openadsdk.core.settings;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.p552ot.pubsub.util.C26601v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.settings.IL */
/* loaded from: classes3.dex */
public class C8993IL {
    public int CQc;
    public int DDQ;
    public String Dxa;

    /* renamed from: Fy */
    public int f20046Fy;

    /* renamed from: IL */
    public int f20047IL;
    public int JAA;

    /* renamed from: Ja */
    public int f20048Ja;

    /* renamed from: Kg */
    public int f20049Kg;
    public int LKE;

    /* renamed from: LZ */
    public boolean f20050LZ;

    /* renamed from: Lq */
    public int f20051Lq;

    /* renamed from: PX */
    public int f20052PX;
    public List<C8994Kg> Pae;

    /* renamed from: RJ */
    public JSONObject f20053RJ;

    /* renamed from: Ta */
    public int f20054Ta;

    /* renamed from: Uq */
    public boolean f20055Uq;

    /* renamed from: Uw */
    public int f20056Uw;

    /* renamed from: VB */
    public int f20057VB;

    /* renamed from: VJ */
    public int f20058VJ;

    /* renamed from: VW */
    public boolean f20059VW;
    public int VzQ;

    /* renamed from: WR */
    public int f20060WR;
    public int ZQc;
    public boolean aGH;
    public boolean ayS;

    /* renamed from: bN */
    public String f20061bN;

    /* renamed from: bX */
    public int f20062bX;

    /* renamed from: bg */
    public String f20063bg;
    public int daV;

    /* renamed from: eo */
    public int f20064eo;
    public int eqN;

    /* renamed from: iR */
    public int f20065iR;

    /* renamed from: jz */
    public List<C8994Kg> f20066jz;
    public int kMt;
    public int ldr;

    /* renamed from: qC */
    public long f20067qC;
    public List<String> rri;

    /* renamed from: tC */
    public int f20068tC;
    public int tuV;

    /* renamed from: uu */
    public int f20069uu;

    /* renamed from: vb */
    public int f20070vb;
    public int xxp;
    public int yDt;

    /* renamed from: zx */
    public int f20071zx;

    public C8993IL(JSONObject jSONObject) {
        this.f20047IL = 1;
        this.f20062bX = 1;
        this.eqN = 2;
        this.f20071zx = 1;
        this.ldr = 100;
        this.f20065iR = 0;
        this.f20049Kg = 2;
        this.f20060WR = 1;
        this.f20064eo = 3;
        this.f20057VB = 30;
        this.f20052PX = 30;
        this.f20054Ta = 1;
        this.yDt = 1;
        this.f20051Lq = 2;
        this.f20070vb = 1500;
        this.xxp = 2;
        this.VzQ = IronSourceConstants.BN_AUCTION_REQUEST;
        this.tuV = 0;
        this.f20046Fy = 5;
        this.f20050LZ = false;
        this.f20068tC = 0;
        this.kMt = 2;
        this.JAA = -1;
        this.f20048Ja = 0;
        this.f20056Uw = 0;
        this.DDQ = 5;
        this.f20055Uq = true;
        this.aGH = false;
        this.f20059VW = false;
        this.f20058VJ = 0;
        this.daV = -1;
        this.ayS = false;
        this.ZQc = 60000;
        this.LKE = 2;
        this.CQc = 1000;
        this.f20069uu = 1;
        this.f20066jz = new ArrayList();
        this.Pae = new ArrayList();
        new JSONObject();
        this.f20053RJ = jSONObject;
        if (jSONObject == null) {
            return;
        }
        this.f20063bg = jSONObject.optString("code_id");
        this.f20047IL = jSONObject.optInt("auto_play", 1);
        this.daV = jSONObject.optInt("endcard_close_time", -1);
        this.f20062bX = jSONObject.optInt("voice_control", 1);
        this.eqN = jSONObject.optInt("rv_preload", 2);
        this.f20071zx = jSONObject.optInt("nv_preload", 1);
        this.ldr = Math.min(100, Math.max(0, jSONObject.optInt("proportion_watching", 100)));
        this.f20065iR = jSONObject.optInt("skip_time_displayed", 0);
        this.f20049Kg = jSONObject.optInt("video_skip_result", 2);
        this.f20060WR = jSONObject.optInt("reg_creative_control", 1);
        this.f20064eo = jSONObject.optInt("play_bar_show_time", 3);
        int optInt = jSONObject.optInt("rv_skip_time", 30);
        this.f20057VB = optInt;
        if (optInt < 0) {
            this.f20057VB = 30;
        }
        this.f20054Ta = jSONObject.optInt("voice_control", 2);
        this.yDt = jSONObject.optInt("if_show_win", 1);
        this.f20051Lq = jSONObject.optInt("sp_preload", 2);
        this.f20070vb = jSONObject.optInt("stop_time", 1500);
        this.xxp = jSONObject.optInt("native_playable_delay", 2);
        this.VzQ = jSONObject.optInt("time_out_control", -1);
        this.JAA = jSONObject.optInt("playable_close_time", -1);
        this.tuV = jSONObject.optInt("playable_reward_type", 0);
        this.f20068tC = jSONObject.optInt("reward_is_callback", 0);
        int optInt2 = jSONObject.optInt("iv_skip_time", 5);
        this.f20046Fy = optInt2;
        if (optInt2 < 0) {
            this.f20046Fy = 5;
        }
        m83861bg(jSONObject.optJSONArray("parent_tpl_ids"));
        this.kMt = jSONObject.optInt("slot_type", 2);
        this.f20050LZ = jSONObject.optBoolean("close_on_click", false);
        this.f20048Ja = jSONObject.optInt("allow_system_back", 0);
        this.f20056Uw = jSONObject.optInt("splash_skip_time", 0);
        this.DDQ = jSONObject.optInt("splash_image_count_down_time", 5);
        this.aGH = jSONObject.optBoolean("splash_count_down_time_off", false);
        this.f20059VW = jSONObject.optBoolean("splash_close_on_click", false);
        int optInt3 = jSONObject.optInt("splash_load_strategy", 0);
        this.f20058VJ = optInt3;
        if (optInt3 < 0 || optInt3 > 1) {
            this.f20058VJ = 0;
        }
        this.f20055Uq = jSONObject.optBoolean("allow_mediaview_click", true);
        int optInt4 = jSONObject.optInt("total_time_out", 60000);
        this.ZQc = optInt4;
        if (optInt4 <= 0 || optInt4 > 1800000) {
            this.ZQc = 60000;
        }
        int optInt5 = jSONObject.optInt("req_parallel_num", 2);
        this.LKE = optInt5;
        if (optInt5 <= 0 || optInt5 > 4) {
            this.LKE = 2;
        }
        this.CQc = jSONObject.optInt("bidding_token_tmax", 1000);
        int optInt6 = jSONObject.optInt("ad_load_type", 1);
        this.f20069uu = optInt6;
        if (optInt6 <= 0 || optInt6 > 2) {
            this.f20069uu = 1;
        }
        boolean optBoolean = jSONObject.optBoolean("is_mediation", false);
        this.ayS = optBoolean;
        if (optBoolean) {
            C9011xxp.m83746zU().zCS();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("mediation_config");
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                String optString = optJSONObject.optString("adn_name");
                String optString2 = optJSONObject.optString("adn_slot_id");
                int optInt7 = optJSONObject.optInt("ad_expired_time", C26601v.f69837d);
                int optInt8 = optJSONObject.optInt("req_bidding_type", 2);
                String optString3 = optJSONObject.optString("rit_cpm");
                int optInt9 = optJSONObject.optInt("show_sort");
                int optInt10 = optJSONObject.optInt("layer_time_out", 2000);
                int i2 = (optInt10 <= 0 || optInt10 > 60000) ? 2000 : optInt10;
                JSONObject optJSONObject2 = optJSONObject.optJSONObject("server_params");
                if (optInt8 == 2) {
                    arrayList.add(new C8994Kg(optString, optString2, optInt7, optInt8, optString3, optInt9, i2, optJSONObject2 == null ? "" : optJSONObject2.toString()));
                } else if (optInt8 == 0) {
                    arrayList2.add(new C8994Kg(optString, optString2, optInt7, optInt8, optString3, optInt9, i2, optJSONObject2 == null ? "" : optJSONObject2.toString()));
                }
            }
            this.f20066jz = arrayList;
            this.Pae = arrayList2;
            Collections.sort(arrayList);
            Collections.sort(this.Pae);
        }
        if (!m83862bg(this.f20062bX)) {
            this.f20062bX = 1;
        }
        if (!m83862bg(this.f20054Ta)) {
            this.f20054Ta = 1;
        }
        this.f20067qC = jSONObject.optLong("waterfall_id");
        String optString4 = jSONObject.optString("waterfall_version");
        this.Dxa = optString4;
        this.f20061bN = optString4;
        this.f20052PX = jSONObject.optInt("multi_rv_skip_time", 30);
    }

    /* renamed from: bg */
    private static boolean m83862bg(int i) {
        return i == 1 || i == 2;
    }

    /* renamed from: bg */
    public void m83861bg(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return;
        }
        this.rri = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                this.rri.add(jSONArray.get(i).toString());
            } catch (Exception unused) {
                return;
            }
        }
    }

    public C8993IL(String str, int i) {
        this.f20047IL = 1;
        this.f20062bX = 1;
        this.eqN = 2;
        this.f20071zx = 1;
        this.ldr = 100;
        this.f20065iR = 0;
        this.f20049Kg = 2;
        this.f20060WR = 1;
        this.f20064eo = 3;
        this.f20057VB = 30;
        this.f20052PX = 30;
        this.f20054Ta = 1;
        this.yDt = 1;
        this.f20051Lq = 2;
        this.f20070vb = 1500;
        this.xxp = 2;
        this.VzQ = IronSourceConstants.BN_AUCTION_REQUEST;
        this.tuV = 0;
        this.f20046Fy = 5;
        this.f20050LZ = false;
        this.f20068tC = 0;
        this.kMt = 2;
        this.JAA = -1;
        this.f20048Ja = 0;
        this.f20056Uw = 0;
        this.DDQ = 5;
        this.f20055Uq = true;
        this.aGH = false;
        this.f20059VW = false;
        this.f20058VJ = 0;
        this.daV = -1;
        this.ayS = false;
        this.ZQc = 60000;
        this.LKE = 2;
        this.CQc = 1000;
        this.f20069uu = 1;
        this.f20066jz = new ArrayList();
        this.Pae = new ArrayList();
        this.f20053RJ = new JSONObject();
        this.f20063bg = str;
        this.f20062bX = i;
    }
}
