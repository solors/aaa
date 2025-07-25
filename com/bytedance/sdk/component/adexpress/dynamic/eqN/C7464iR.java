package com.bytedance.sdk.component.adexpress.dynamic.eqN;

import android.graphics.Color;
import android.text.TextUtils;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.component.adexpress.C7487eqN;
import com.bytedance.sdk.component.adexpress.dynamic.p252zx.C7475VB;
import com.bytedance.sdk.component.adexpress.eqN.C7489Kg;
import com.ironsource.C21114v8;
import net.pubnative.lite.sdk.analytics.Reporting;
import net.pubnative.lite.sdk.vpaid.enums.EventConstants;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.eqN.iR */
/* loaded from: classes3.dex */
public class C7464iR {

    /* renamed from: IL */
    public String f16180IL;

    /* renamed from: bX */
    public JSONObject f16181bX;

    /* renamed from: bg */
    public int f16182bg;
    private C7465ldr eqN;
    private String ldr;

    /* renamed from: zx */
    private C7466zx f16183zx;

    public C7464iR(C7466zx c7466zx) {
        this.f16183zx = c7466zx;
        this.f16182bg = c7466zx.m88759bg();
        this.f16180IL = c7466zx.m88761bX();
        this.f16181bX = c7466zx.m88755zx().RiO();
        this.ldr = c7466zx.eqN();
        if (C7487eqN.m88684bX() == 1) {
            this.eqN = c7466zx.m88756iR();
        } else {
            this.eqN = c7466zx.m88755zx();
        }
        if (C7487eqN.m88685IL()) {
            this.eqN = c7466zx.m88755zx();
        }
    }

    private boolean hff() {
        if (C7487eqN.m88685IL()) {
            return false;
        }
        if ((TextUtils.isEmpty(this.f16180IL) || !this.f16180IL.contains("adx:")) && !C7475VB.m88731IL()) {
            return false;
        }
        return true;
    }

    /* renamed from: jA */
    private boolean m88891jA() {
        if ((C7487eqN.m88685IL() && (this.f16183zx.m88764IL().contains("logo-union") || this.f16183zx.m88764IL().contains("logounion") || this.f16183zx.m88764IL().contains("logoad"))) || "logo-union".equals(this.f16183zx.m88764IL()) || "logounion".equals(this.f16183zx.m88764IL()) || "logoad".equals(this.f16183zx.m88764IL())) {
            return true;
        }
        return false;
    }

    public boolean ApA() {
        return this.eqN.m88804bu();
    }

    public boolean CQc() {
        return this.eqN.m88851Ny();
    }

    public int DDQ() {
        return m88895bg(this.eqN.rri());
    }

    /* renamed from: Dt */
    public String m88921Dt() {
        return this.eqN.ZyO();
    }

    public String Dxa() {
        return this.eqN.LKE();
    }

    /* renamed from: Fy */
    public boolean m88920Fy() {
        return this.eqN.uny();
    }

    /* renamed from: GZ */
    public boolean m88919GZ() {
        return this.eqN.m88845Ta();
    }

    public String GvG() {
        return this.eqN.m88841Uq();
    }

    /* renamed from: IL */
    public int m88918IL() {
        return (int) this.eqN.xxp();
    }

    public String JAA() {
        return this.eqN.Gih();
    }

    /* renamed from: Ja */
    public long m88916Ja() {
        return this.eqN.JaB();
    }

    /* renamed from: Kg */
    public int m88915Kg() {
        String m88859LZ = this.eqN.m88859LZ();
        if ("left".equals(m88859LZ)) {
            return 17;
        }
        if ("center".equals(m88859LZ)) {
            return 4;
        }
        if ("right".equals(m88859LZ)) {
            return 3;
        }
        return 2;
    }

    public String LKE() {
        return this.eqN.m88779uu();
    }

    /* renamed from: LZ */
    public String m88914LZ() {
        return this.eqN.kMt();
    }

    /* renamed from: Ld */
    public String m88913Ld() {
        return this.eqN.aGH();
    }

    /* renamed from: Lq */
    public float m88912Lq() {
        return this.eqN.m88836VB();
    }

    /* renamed from: Ny */
    public boolean m88911Ny() {
        return this.eqN.ZTq();
    }

    /* renamed from: PX */
    public String m88910PX() {
        return this.ldr;
    }

    public int Pae() {
        return this.eqN.ews();
    }

    public String RFq() {
        return this.eqN.JAA();
    }

    /* renamed from: RJ */
    public int m88909RJ() {
        return this.eqN.JlG();
    }

    public String RiO() {
        return this.eqN.qSG();
    }

    /* renamed from: Ta */
    public double m88908Ta() {
        if (this.f16182bg == 11) {
            try {
                double parseDouble = Double.parseDouble(this.f16180IL);
                if (!C7487eqN.m88685IL()) {
                    return (int) parseDouble;
                }
                return parseDouble;
            } catch (NumberFormatException unused) {
            }
        }
        return -1.0d;
    }

    /* renamed from: Uq */
    public double m88907Uq() {
        return this.eqN.m88864Kg();
    }

    /* renamed from: Uw */
    public int m88906Uw() {
        String CQc = this.eqN.CQc();
        if (!"skip-with-time-skip-btn".equals(this.f16183zx.m88764IL()) && !EventConstants.SKIP.equals(this.f16183zx.m88764IL()) && !TextUtils.equals("skip-with-countdowns-skip-btn", this.f16183zx.m88764IL())) {
            if (!"skip-with-time-countdown".equals(this.f16183zx.m88764IL()) && !"skip-with-time".equals(this.f16183zx.m88764IL())) {
                if (this.f16182bg == 10 && TextUtils.equals(this.eqN.m88779uu(), "click")) {
                    return 5;
                }
                if (m88891jA() && hff()) {
                    return 0;
                }
                if (m88891jA()) {
                    return 7;
                }
                if ("feedback-dislike".equals(this.f16183zx.m88764IL())) {
                    return 3;
                }
                if (!TextUtils.isEmpty(CQc) && !CQc.equals("none")) {
                    if (!CQc.equals("video") && (this.f16183zx.m88759bg() != 7 || !TextUtils.equals(CQc, "normal"))) {
                        if (CQc.equals("normal")) {
                            return 1;
                        }
                        if (!CQc.equals(Reporting.Key.CREATIVE) && !"slide".equals(this.eqN.m88779uu())) {
                            return 0;
                        }
                        return 2;
                    } else if (C7487eqN.m88685IL() && this.f16183zx.m88755zx() != null && this.f16183zx.m88755zx().yda()) {
                        return 11;
                    } else {
                        return 4;
                    }
                }
            }
            return 0;
        }
        return 6;
    }

    /* renamed from: VB */
    public String m88905VB() {
        if (this.f16182bg == 1) {
            return this.f16180IL;
        }
        return "";
    }

    /* renamed from: VJ */
    public int m88904VJ() {
        return this.eqN.m88771zx();
    }

    /* renamed from: VW */
    public int m88903VW() {
        return this.eqN.m88874IL();
    }

    public int VzQ() {
        return this.eqN.m88772zU();
    }

    /* renamed from: WR */
    public int m88902WR() {
        int m88915Kg = m88915Kg();
        if (m88915Kg == 4) {
            return 17;
        }
        if (m88915Kg == 3) {
            return GravityCompat.END;
        }
        return GravityCompat.START;
    }

    /* renamed from: Ys */
    public double m88901Ys() {
        return this.eqN.ZQc();
    }

    public String ZQc() {
        return this.eqN.m88801eo();
    }

    public int aGH() {
        return this.eqN.m88821bX();
    }

    public int ayS() {
        return this.eqN.m88828WR();
    }

    public boolean bCU() {
        return this.eqN.m88830VW();
    }

    /* renamed from: bN */
    public boolean m88900bN() {
        return this.eqN.gtr();
    }

    public int bOf() {
        return this.eqN.m88784rr();
    }

    /* renamed from: bX */
    public int m88899bX() {
        return (int) this.eqN.m88855Lq();
    }

    /* renamed from: bg */
    public int m88898bg() {
        return (int) this.eqN.yDt();
    }

    public int cZH() {
        return this.eqN.daV();
    }

    /* renamed from: dS */
    public int m88894dS() {
        return this.eqN.m88797hi();
    }

    public int daV() {
        return this.eqN.eqN();
    }

    public boolean eDa() {
        return this.eqN.m88804bu();
    }

    /* renamed from: eo */
    public String m88893eo() {
        int i = this.f16182bg;
        if (i != 2 && i != 13) {
            return "";
        }
        return this.f16180IL;
    }

    public int eqN() {
        return (int) this.eqN.m88778vb();
    }

    public String gXn() {
        return this.eqN.mZk();
    }

    /* renamed from: iR */
    public int m88892iR() {
        return m88895bg(this.eqN.m88783tC());
    }

    /* renamed from: jz */
    public int m88890jz() {
        return this.eqN.m88796iR();
    }

    public String kMt() {
        return this.eqN.CQc();
    }

    /* renamed from: kU */
    public int m88889kU() {
        return this.eqN.FFy();
    }

    /* renamed from: lM */
    public String m88888lM() {
        return this.eqN.HXG();
    }

    public String ldr() {
        if (this.f16182bg == 0) {
            if (!TextUtils.isEmpty(this.f16180IL)) {
                return this.f16180IL;
            }
            return this.f16181bX.optString(C7489Kg.m88679bX(C7487eqN.m88683bg()));
        }
        return "";
    }

    /* renamed from: qC */
    public int m88887qC() {
        return this.eqN.bOf();
    }

    /* renamed from: qp */
    public int m88886qp() {
        return this.eqN.gCm();
    }

    public int rri() {
        return this.eqN.m88789jz();
    }

    public int sVc() {
        return this.eqN.huT();
    }

    /* renamed from: tC */
    public boolean m88885tC() {
        return this.eqN.m88822bN();
    }

    public int tuV() {
        return this.eqN.JxS();
    }

    public int txA() {
        return this.eqN.IEI();
    }

    /* renamed from: uu */
    public int m88884uu() {
        return this.eqN.m88788kU();
    }

    /* renamed from: vb */
    public int m88883vb() {
        return m88895bg(this.eqN.m88867Ja());
    }

    /* renamed from: wS */
    public int m88882wS() {
        return this.eqN.m88832VJ();
    }

    public float xxp() {
        return this.eqN.m88850PX();
    }

    public double yDt() {
        return this.eqN.tuV();
    }

    public double zCS() {
        return this.eqN.ayS();
    }

    /* renamed from: zx */
    public float m88881zx() {
        return this.eqN.VzQ();
    }

    /* renamed from: IL */
    public static float[] m88917IL(String str) {
        String[] split = str.substring(str.indexOf("(") + 1, str.indexOf(")")).split(",");
        return (split == null || split.length != 4) ? new float[]{0.0f, 0.0f, 0.0f, 0.0f} : new float[]{Float.parseFloat(split[0]), Float.parseFloat(split[1]), Float.parseFloat(split[2]), Float.parseFloat(split[3])};
    }

    /* renamed from: bg */
    public void m88897bg(float f) {
        this.eqN.m88812bg(f);
    }

    /* renamed from: bg */
    public static int m88895bg(String str) {
        String[] split;
        if (TextUtils.isEmpty(str)) {
            return ViewCompat.MEASURED_STATE_MASK;
        }
        if (str.equals(C21114v8.C21122h.f54047T)) {
            return 0;
        }
        if (str.charAt(0) == '#' && str.length() == 7) {
            return Color.parseColor(str);
        }
        if (str.charAt(0) == '#' && str.length() == 9) {
            return Color.parseColor(str);
        }
        if (str.startsWith("rgba") && (split = str.substring(str.indexOf("(") + 1, str.indexOf(")")).split(",")) != null) {
            try {
                if (split.length == 4) {
                    return (((int) ((Float.parseFloat(split[3]) * 255.0f) + 0.5f)) << 24) | (((int) Float.parseFloat(split[0])) << 16) | (((int) Float.parseFloat(split[1])) << 8) | ((int) Float.parseFloat(split[2])) | 0;
                }
            } catch (NumberFormatException unused) {
                return 0;
            }
        }
        return ViewCompat.MEASURED_STATE_MASK;
    }

    /* renamed from: bg */
    public boolean m88896bg(int i) {
        C7466zx c7466zx = this.f16183zx;
        if (c7466zx == null) {
            return false;
        }
        if (i == 1) {
            this.eqN = c7466zx.m88756iR();
        } else {
            this.eqN = c7466zx.m88755zx();
        }
        return this.eqN != null;
    }
}
