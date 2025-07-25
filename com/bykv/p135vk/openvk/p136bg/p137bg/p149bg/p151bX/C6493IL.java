package com.bykv.p135vk.openvk.p136bg.p137bg.p149bg.p151bX;

import android.text.TextUtils;
import com.bykv.p135vk.openvk.p136bg.p137bg.p149bg.p153iR.C6507IL;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONObject;

/* renamed from: com.bykv.vk.openvk.bg.bg.bg.bX.IL */
/* loaded from: classes3.dex */
public class C6493IL {

    /* renamed from: IL */
    private int f13547IL;

    /* renamed from: Kg */
    private String f13548Kg;

    /* renamed from: PX */
    private int f13550PX;

    /* renamed from: Ta */
    private int f13551Ta;

    /* renamed from: VB */
    private double f13552VB;

    /* renamed from: WR */
    private String f13553WR;

    /* renamed from: bX */
    private long f13554bX;

    /* renamed from: bg */
    private int f13555bg;

    /* renamed from: eo */
    private String f13556eo;
    private double eqN;

    /* renamed from: iR */
    private String f13557iR;
    private String ldr;

    /* renamed from: zx */
    private String f13559zx;
    private float yDt = -1.0f;

    /* renamed from: Lq */
    private int f13549Lq = 0;

    /* renamed from: vb */
    private int f13558vb = 0;
    private int xxp = 0;
    private int VzQ = 0;
    private int tuV = 307200;

    /* renamed from: Fy */
    private int f13546Fy = 1;

    /* renamed from: Fy */
    public int m91753Fy() {
        return this.f13558vb;
    }

    /* renamed from: IL */
    public int m91752IL() {
        return this.f13555bg;
    }

    /* renamed from: Kg */
    public float m91749Kg() {
        return this.yDt;
    }

    /* renamed from: LZ */
    public boolean m91747LZ() {
        if (this.xxp == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: Lq */
    public int m91746Lq() {
        if (this.tuV < 0) {
            this.tuV = 307200;
        }
        long j = this.f13554bX;
        if (this.tuV > j) {
            this.tuV = (int) j;
        }
        return this.tuV;
    }

    /* renamed from: PX */
    public String m91745PX() {
        return this.f13548Kg;
    }

    /* renamed from: Ta */
    public String m91744Ta() {
        return this.f13553WR;
    }

    /* renamed from: VB */
    public String m91743VB() {
        return this.f13557iR;
    }

    public JSONObject VzQ() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cover_height", m91752IL());
            jSONObject.put("cover_url", m91732eo());
            jSONObject.put("cover_width", m91740bX());
            jSONObject.put(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD, m91745PX());
            jSONObject.put("file_hash", yDt());
            jSONObject.put("resolution", m91742WR());
            jSONObject.put("size", m91726zx());
            jSONObject.put("video_duration", ldr());
            jSONObject.put("video_url", m91743VB());
            jSONObject.put("playable_download_url", m91744Ta());
            jSONObject.put("if_playable_loading_show", tuV());
            jSONObject.put("remove_loading_page_type", m91753Fy());
            jSONObject.put("fallback_endcard_judge", m91737bg());
            jSONObject.put("video_preload_size", m91746Lq());
            jSONObject.put("reward_video_cached_type", m91727vb());
            jSONObject.put("execute_cached_type", xxp());
            jSONObject.put("endcard_render", eqN());
            jSONObject.put("replay_time", m91728tC());
            jSONObject.put("play_speed_ratio", m91749Kg());
            if (m91730iR() > 0.0d) {
                jSONObject.put("start", m91730iR());
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* renamed from: WR */
    public String m91742WR() {
        return this.f13559zx;
    }

    /* renamed from: bX */
    public int m91740bX() {
        return this.f13547IL;
    }

    /* renamed from: bg */
    public int m91737bg() {
        return this.f13550PX;
    }

    /* renamed from: eo */
    public String m91732eo() {
        return this.ldr;
    }

    public int eqN() {
        return this.f13551Ta;
    }

    /* renamed from: iR */
    public double m91730iR() {
        return this.f13552VB;
    }

    public double ldr() {
        return this.eqN;
    }

    /* renamed from: tC */
    public int m91728tC() {
        return this.f13546Fy;
    }

    public int tuV() {
        return this.f13549Lq;
    }

    /* renamed from: vb */
    public int m91727vb() {
        return this.xxp;
    }

    public int xxp() {
        return this.VzQ;
    }

    public String yDt() {
        if (TextUtils.isEmpty(this.f13556eo)) {
            this.f13556eo = C6507IL.m91683bg(this.f13557iR);
        }
        return this.f13556eo;
    }

    /* renamed from: zx */
    public long m91726zx() {
        return this.f13554bX;
    }

    /* renamed from: IL */
    public void m91751IL(int i) {
        this.f13555bg = i;
    }

    /* renamed from: Kg */
    public void m91748Kg(int i) {
        this.f13549Lq = i;
    }

    /* renamed from: WR */
    public void m91741WR(int i) {
        this.f13558vb = i;
    }

    /* renamed from: bX */
    public void m91739bX(int i) {
        this.f13547IL = i;
    }

    /* renamed from: bg */
    public void m91735bg(int i) {
        this.f13550PX = i;
    }

    /* renamed from: eo */
    public void m91731eo(int i) {
        this.f13546Fy = Math.min(4, Math.max(1, i));
    }

    public void eqN(int i) {
        this.f13551Ta = i;
    }

    /* renamed from: iR */
    public void m91729iR(int i) {
        this.VzQ = i;
    }

    public void ldr(String str) {
        this.f13556eo = str;
    }

    /* renamed from: zx */
    public void m91724zx(String str) {
        this.f13553WR = str;
    }

    /* renamed from: IL */
    public void m91750IL(String str) {
        this.ldr = str;
    }

    /* renamed from: bX */
    public void m91738bX(String str) {
        this.f13557iR = str;
    }

    /* renamed from: bg */
    public void m91734bg(long j) {
        this.f13554bX = j;
    }

    public void eqN(String str) {
        this.f13548Kg = str;
    }

    public void ldr(int i) {
        this.xxp = i;
    }

    /* renamed from: zx */
    public void m91725zx(int i) {
        this.tuV = i;
    }

    /* renamed from: bg */
    public void m91736bg(double d) {
        this.eqN = d;
    }

    /* renamed from: bg */
    public void m91733bg(String str) {
        this.f13559zx = str;
    }
}
