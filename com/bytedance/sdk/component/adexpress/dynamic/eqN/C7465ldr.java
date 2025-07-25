package com.bytedance.sdk.component.adexpress.dynamic.eqN;

import com.bytedance.sdk.component.adexpress.C7487eqN;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ironsource.C20517nb;
import com.ironsource.C21114v8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.eqN.ldr */
/* loaded from: classes3.dex */
public class C7465ldr {
    private String ApA;
    private int CQc;
    private String DCn;
    private double DDQ;

    /* renamed from: Dt */
    private int f16184Dt;
    private int Dxa;
    private boolean FFy;

    /* renamed from: Fx */
    private String f16185Fx;

    /* renamed from: Fy */
    private String f16186Fy;

    /* renamed from: GR */
    private int f16187GR;

    /* renamed from: GZ */
    private boolean f16188GZ;
    private String Gih;
    private boolean GvG;
    private JSONObject HXG;
    private double IEI;

    /* renamed from: IL */
    private float f16189IL;
    private boolean JAA;

    /* renamed from: Ja */
    private int f16190Ja;
    private String JaB;
    private int JlG;
    private int JxS;
    private int KRc;

    /* renamed from: Kg */
    private float f16191Kg;
    private int LKE;

    /* renamed from: LZ */
    private String f16192LZ;

    /* renamed from: Ld */
    private JSONObject f16193Ld;

    /* renamed from: Lq */
    private String f16194Lq;

    /* renamed from: Ny */
    private int f16195Ny;

    /* renamed from: PX */
    private double f16196PX;
    private boolean Pae;
    private int RFq;

    /* renamed from: RJ */
    private int f16197RJ;
    private int RiO;

    /* renamed from: Ta */
    private String f16198Ta;

    /* renamed from: Uq */
    private double f16199Uq;

    /* renamed from: Uw */
    private int f16200Uw;

    /* renamed from: VB */
    private double f16201VB;

    /* renamed from: VJ */
    private String f16202VJ;

    /* renamed from: VW */
    private String f16203VW;
    private String VzQ;

    /* renamed from: WR */
    private float f16204WR;

    /* renamed from: Ys */
    private int f16205Ys;
    private boolean ZQc;
    private boolean ZTq;
    private int ZyO;
    private String aGH;
    private String ayS;
    private String bCU;

    /* renamed from: bN */
    private double f16206bN;
    private String bOf;

    /* renamed from: bX */
    private float f16207bX;

    /* renamed from: bg */
    private float f16208bg;

    /* renamed from: bu */
    private JSONObject f16209bu;
    private boolean cZH;

    /* renamed from: dS */
    private int f16210dS;
    private String daV;
    private int eDa;

    /* renamed from: eK */
    private String f16211eK;

    /* renamed from: eo */
    private float f16212eo;
    private float eqN;
    private int ews;
    private boolean gCm;

    /* renamed from: gJ */
    private long f16213gJ = -1;
    private boolean gXn;
    private boolean gtr;
    private List<C7460bg> hff;

    /* renamed from: hi */
    private int f16214hi;
    private int huT;

    /* renamed from: iR */
    private float f16215iR;

    /* renamed from: jA */
    private int f16216jA;

    /* renamed from: jf */
    private int f16217jf;

    /* renamed from: jz */
    private int f16218jz;
    private String kMt;

    /* renamed from: kU */
    private String f16219kU;

    /* renamed from: lM */
    private boolean f16220lM;
    private float ldr;
    private String mLT;
    private boolean mZk;
    private JSONObject ovC;

    /* renamed from: qC */
    private int f16221qC;
    private int qSG;

    /* renamed from: qp */
    private boolean f16222qp;
    private boolean rgo;

    /* renamed from: rr */
    private int f16223rr;
    private String rri;
    private int sVc;

    /* renamed from: tC */
    private String f16224tC;
    private String tuV;
    private boolean txA;

    /* renamed from: uV */
    private boolean f16225uV;
    private int uny;

    /* renamed from: uu */
    private int f16226uu;

    /* renamed from: vb */
    private String f16227vb;

    /* renamed from: wS */
    private int f16228wS;

    /* renamed from: wq */
    private int f16229wq;
    private int xFs;
    private String xxp;
    private String yDt;
    private String yda;
    private int zCS;

    /* renamed from: zU */
    private int f16230zU;

    /* renamed from: zx */
    private boolean f16231zx;

    /* renamed from: Uw */
    private void m88837Uw(String str) {
        this.DCn = str;
    }

    /* renamed from: bg */
    public static C7465ldr m88806bg(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        C7465ldr c7465ldr = new C7465ldr();
        c7465ldr.m88870IL(jSONObject.optString("adType", "embeded"));
        c7465ldr.m88853Lq(jSONObject.optString("clickArea", Reporting.Key.CREATIVE));
        c7465ldr.m88776vb(jSONObject.optString("clickTigger", "click"));
        c7465ldr.m88817bX(jSONObject.optString("fontFamily", "PingFangSC"));
        c7465ldr.eqN(jSONObject.optString("textAlign", "left"));
        c7465ldr.m88767zx(jSONObject.optString("color", "#999999"));
        c7465ldr.ldr(jSONObject.optString("bgColor", C21114v8.C21122h.f54047T));
        c7465ldr.m88793iR(jSONObject.optString("bgImgUrl", ""));
        c7465ldr.m88837Uw(jSONObject.optString("bgImgData", ""));
        c7465ldr.m88861Kg(jSONObject.optString("borderColor", "#000000"));
        c7465ldr.m88825WR(jSONObject.optString("borderStyle", "solid"));
        c7465ldr.m88799eo(jSONObject.optString("heightMode", "auto"));
        c7465ldr.m88834VB(jSONObject.optString("widthMode", "fixed"));
        c7465ldr.m88848PX(jSONObject.optString("interactText", ""));
        c7465ldr.m88815bX(jSONObject.optBoolean("isShowBgControl", false));
        c7465ldr.m88843Ta(jSONObject.optString("interactBgColor", ""));
        JSONObject optJSONObject = jSONObject.optJSONObject("interactPosition");
        if (optJSONObject != null) {
            c7465ldr.m88794iR(optJSONObject.optInt("translateY", 0));
            c7465ldr.m88862Kg(optJSONObject.optInt("translateX", 0));
            c7465ldr.eqN(optJSONObject.optDouble("scaleX", 0.0d));
            c7465ldr.m88770zx(optJSONObject.optDouble("scaleY", 0.0d));
        }
        c7465ldr.yDt(jSONObject.optString("interactType", ""));
        c7465ldr.m88768zx(jSONObject.optInt("interactSlideDirection", -1));
        c7465ldr.xxp(jSONObject.optString("justifyHorizontal", "space-around"));
        c7465ldr.VzQ(jSONObject.optString("justifyVertical", "flex-start"));
        c7465ldr.m88873IL(jSONObject.optDouble("timingStart"));
        c7465ldr.m88820bX(jSONObject.optDouble("timingEnd"));
        c7465ldr.eqN((float) jSONObject.optDouble("width", 0.0d));
        c7465ldr.m88819bX((float) jSONObject.optDouble("height", 0.0d));
        c7465ldr.m88812bg((float) jSONObject.optDouble("borderRadius", 0.0d));
        c7465ldr.m88872IL((float) jSONObject.optDouble("borderSize", 0.0d));
        c7465ldr.m88868IL(jSONObject.optBoolean("interactValidate", false));
        c7465ldr.m88827WR((float) jSONObject.optDouble("fontSize", 0.0d));
        c7465ldr.m88769zx((float) jSONObject.optDouble("paddingBottom", 0.0d));
        c7465ldr.ldr((float) jSONObject.optDouble("paddingLeft", 0.0d));
        c7465ldr.m88795iR((float) jSONObject.optDouble("paddingRight", 0.0d));
        c7465ldr.m88863Kg((float) jSONObject.optDouble("paddingTop", 0.0d));
        c7465ldr.eqN(jSONObject.optBoolean("lineFeed", false));
        c7465ldr.m88826WR(jSONObject.optInt("lineCount", 0));
        c7465ldr.ldr(jSONObject.optDouble("lineHeight", 1.2d));
        c7465ldr.yDt(jSONObject.optInt("letterSpacing", 0));
        c7465ldr.m88765zx(jSONObject.optBoolean("isDataFixed", false));
        c7465ldr.m88854Lq(jSONObject.optInt("fontWeight"));
        c7465ldr.ldr(jSONObject.optBoolean("lineLimit"));
        c7465ldr.m88777vb(jSONObject.optInt(C21114v8.C21122h.f54038L));
        c7465ldr.tuV(jSONObject.optString("align"));
        c7465ldr.m88792iR(jSONObject.optBoolean("useLeft"));
        c7465ldr.m88860Kg(jSONObject.optBoolean("useRight"));
        c7465ldr.m88824WR(jSONObject.optBoolean("useTop"));
        c7465ldr.m88798eo(jSONObject.optBoolean("useBottom"));
        c7465ldr.m88877Fy(jSONObject.optString("data"));
        c7465ldr.m88869IL(jSONObject.optJSONObject("i18n"));
        c7465ldr.m88849PX(jSONObject.optInt("marginLeft"));
        c7465ldr.m88844Ta(jSONObject.optInt("marginRight"));
        c7465ldr.m88800eo(jSONObject.optInt("marginTop"));
        c7465ldr.m88835VB(jSONObject.optInt("marginBottom"));
        c7465ldr.xxp(jSONObject.optInt("tagMaxCount"));
        c7465ldr.m88833VB(jSONObject.optBoolean("allowTextFlow"));
        c7465ldr.VzQ(jSONObject.optInt("textFlowType"));
        c7465ldr.tuV(jSONObject.optInt("textFlowDuration"));
        c7465ldr.m88878Fy(jSONObject.optInt("left"));
        c7465ldr.m88858LZ(jSONObject.optInt("right"));
        c7465ldr.m88782tC(jSONObject.optInt(ViewHierarchyConstants.DIMENSION_TOP_KEY));
        c7465ldr.rri(jSONObject.optInt("bottom"));
        c7465ldr.m88857LZ(jSONObject.optString("alignItems", "flex-start"));
        c7465ldr.m88781tC(jSONObject.optString("direction", ""));
        c7465ldr.m88805bg(jSONObject.optBoolean("loop", false));
        c7465ldr.kMt(jSONObject.optInt("zIndex"));
        c7465ldr.m88840Uq(jSONObject.optInt("interactVisibleTime"));
        c7465ldr.JAA(jSONObject.optInt("interactHiddenTime"));
        c7465ldr.m88842Ta(jSONObject.optBoolean("interactEnableMask"));
        c7465ldr.yDt(jSONObject.optBoolean("interactWontHide"));
        c7465ldr.m88808bg(jSONObject.optString("bgGradient"));
        c7465ldr.m88829VW(jSONObject.optInt("areaType"));
        c7465ldr.m88831VJ(jSONObject.optInt("interactSlideThreshold", 0));
        c7465ldr.ZQc(jSONObject.optInt("interactBottomDistance", C7487eqN.m88685IL() ? 0 : 120));
        c7465ldr.VzQ(jSONObject.optBoolean("openPlayableLandingPage", false));
        c7465ldr.m88816bX(jSONObject.optJSONObject("video"));
        c7465ldr.eqN(jSONObject.optJSONObject("image"));
        c7465ldr.daV(jSONObject.optInt("borderShadowExtent"));
        c7465ldr.m88852Lq(jSONObject.optBoolean("bgGauseBlur"));
        c7465ldr.ayS(jSONObject.optInt("bgGauseBlurRadius"));
        c7465ldr.m88775vb(jSONObject.optBoolean("showTimeProgress", false));
        c7465ldr.xxp(jSONObject.optBoolean("showPlayButton", false));
        c7465ldr.m88813bg(jSONObject.optDouble("bgColorCg", 0.0d));
        c7465ldr.ldr(jSONObject.optInt("bgMaterialCenterCalcColor", 0));
        c7465ldr.m88871IL(jSONObject.optInt("borderTopLeftRadius", 0));
        c7465ldr.m88811bg(jSONObject.optInt("borderTopRightRadius", 0));
        c7465ldr.eqN(jSONObject.optInt("borderBottomLeftRadius", 0));
        c7465ldr.m88818bX(jSONObject.optInt("borderBottomRightRadius", 0));
        c7465ldr.m88766zx(jSONObject.optJSONObject("interactI18n"));
        c7465ldr.kMt(jSONObject.optString("imageObjectFit"));
        c7465ldr.JAA(jSONObject.optString("interactTitle"));
        c7465ldr.aGH(jSONObject.optInt("interactTextPositionTop"));
        c7465ldr.rri(jSONObject.optString("imageLottieTosPath"));
        c7465ldr.m88847PX(jSONObject.optBoolean("animationsLoop"));
        c7465ldr.m88866Ja(jSONObject.optInt("lottieAppNameMaxLength"));
        c7465ldr.DDQ(jSONObject.optInt("lottieAdDescMaxLength"));
        c7465ldr.m88838Uw(jSONObject.optInt("lottieAdTitleMaxLength"));
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("animations");
            if (optJSONArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                    C7460bg c7460bg = new C7460bg();
                    c7460bg.m88949bX(jSONObject2.optString("animationType"));
                    c7460bg.m88947bg(jSONObject2.optDouble("animationDuration"));
                    c7460bg.m88964IL(jSONObject2.optDouble("animationScaleX"));
                    c7460bg.m88951bX(jSONObject2.optDouble("animationScaleY"));
                    c7460bg.eqN(jSONObject2.optString("animationTimeFunction"));
                    c7460bg.eqN(jSONObject2.optDouble("animationDelay"));
                    c7460bg.ldr(jSONObject2.optInt("animationIterationCount"));
                    c7460bg.m88936zx(jSONObject2.optString("animationDirection"));
                    c7460bg.m88938zx(jSONObject2.optDouble("animationInterval"));
                    c7460bg.m88946bg(jSONObject2.optInt("animationBorderWidth"));
                    c7460bg.m88945bg(jSONObject2.optLong("key"));
                    c7460bg.m88963IL(jSONObject2.optInt("animationEffectWidth"));
                    c7460bg.m88950bX(jSONObject2.optInt("animationSwing", 1));
                    c7460bg.eqN(jSONObject2.optInt("animationTranslateX"));
                    c7460bg.m88937zx(jSONObject2.optInt("animationTranslateY"));
                    c7460bg.m88962IL(jSONObject2.optString("animationRippleBackgroundColor"));
                    c7460bg.m88944bg(jSONObject2.optString("animationScaleDirection"));
                    c7460bg.m88941iR(jSONObject2.optInt("animationFadeStart"));
                    c7460bg.m88960Kg(jSONObject2.optInt("animationFadeEnd"));
                    c7460bg.ldr(jSONObject2.optString("animationFillMode"));
                    c7460bg.m88953WR(jSONObject2.optInt("animationBounceHeight"));
                    if (c7465ldr.tuV() > 0.0d) {
                        c7460bg.eqN(c7460bg.yDt() + c7465ldr.tuV());
                    }
                    arrayList.add(c7460bg);
                }
                c7465ldr.m88807bg(arrayList);
            }
            if (jSONObject.has("triggerSlideMinDistance")) {
                c7465ldr.m88865Ja(jSONObject.optString("triggerSlideDirection", "0"));
                c7465ldr.m88810bg(jSONObject.optLong("triggerSlideMinDistance", 0L));
            }
        } catch (Exception unused) {
        }
        return c7465ldr;
    }

    public double ApA() {
        return this.f16206bN;
    }

    public String CQc() {
        return this.f16203VW;
    }

    public String DDQ() {
        return this.f16224tC;
    }

    /* renamed from: Dt */
    public int m88880Dt() {
        return this.f16228wS;
    }

    public String Dxa() {
        return this.ayS;
    }

    public int FFy() {
        return this.f16229wq;
    }

    /* renamed from: Fy */
    public double m88879Fy() {
        return this.f16196PX;
    }

    /* renamed from: GR */
    public void m88876GR() {
        m88809bg(this, this.HXG);
    }

    /* renamed from: GZ */
    public boolean m88875GZ() {
        return this.txA;
    }

    public String Gih() {
        return this.JaB;
    }

    public int GvG() {
        return this.f16218jz;
    }

    public String HXG() {
        return this.yda;
    }

    public int IEI() {
        return this.f16216jA;
    }

    /* renamed from: IL */
    public int m88874IL() {
        return this.f16230zU;
    }

    public String JAA() {
        return this.DCn;
    }

    /* renamed from: Ja */
    public String m88867Ja() {
        return this.tuV;
    }

    public long JaB() {
        return this.f16213gJ;
    }

    public int JlG() {
        return this.f16223rr;
    }

    public int JxS() {
        return this.ZyO;
    }

    public boolean KRc() {
        return this.gCm;
    }

    /* renamed from: Kg */
    public double m88864Kg() {
        return this.IEI;
    }

    public String LKE() {
        return this.aGH;
    }

    /* renamed from: LZ */
    public String m88859LZ() {
        return this.f16194Lq;
    }

    /* renamed from: Ld */
    public String m88856Ld() {
        return this.ApA;
    }

    /* renamed from: Lq */
    public float m88855Lq() {
        return this.f16215iR;
    }

    /* renamed from: Ny */
    public boolean m88851Ny() {
        return this.cZH;
    }

    /* renamed from: PX */
    public float m88850PX() {
        return this.f16189IL;
    }

    public int Pae() {
        return this.CQc;
    }

    public int RFq() {
        return this.f16184Dt;
    }

    /* renamed from: RJ */
    public int m88846RJ() {
        return this.f16226uu;
    }

    public JSONObject RiO() {
        return this.f16193Ld;
    }

    /* renamed from: Ta */
    public boolean m88845Ta() {
        return this.f16231zx;
    }

    /* renamed from: Uq */
    public String m88841Uq() {
        return this.rri;
    }

    /* renamed from: VB */
    public float m88836VB() {
        return this.f16208bg;
    }

    /* renamed from: VJ */
    public int m88832VJ() {
        return this.f16190Ja;
    }

    /* renamed from: VW */
    public boolean m88830VW() {
        return this.JAA;
    }

    public float VzQ() {
        return this.f16212eo;
    }

    /* renamed from: WR */
    public int m88828WR() {
        return this.ews;
    }

    /* renamed from: Ys */
    public boolean m88823Ys() {
        return this.f16188GZ;
    }

    public double ZQc() {
        return this.f16199Uq;
    }

    public boolean ZTq() {
        return this.f16225uV;
    }

    public String ZyO() {
        return this.mLT;
    }

    public String aGH() {
        return this.kMt;
    }

    public double ayS() {
        return this.DDQ;
    }

    public int bCU() {
        return this.sVc;
    }

    /* renamed from: bN */
    public boolean m88822bN() {
        return this.ZQc;
    }

    public int bOf() {
        return this.zCS;
    }

    /* renamed from: bX */
    public int m88821bX() {
        return this.uny;
    }

    /* renamed from: bu */
    public boolean m88804bu() {
        return this.rgo;
    }

    public boolean cZH() {
        return this.f16220lM;
    }

    /* renamed from: dS */
    public String m88803dS() {
        return this.bCU;
    }

    public int daV() {
        return this.f16200Uw;
    }

    public int eDa() {
        return this.RiO;
    }

    /* renamed from: eK */
    public List<C7460bg> m88802eK() {
        return this.hff;
    }

    /* renamed from: eo */
    public String m88801eo() {
        return this.f16185Fx;
    }

    public int eqN() {
        return this.JxS;
    }

    public int ews() {
        return this.f16217jf;
    }

    public int gCm() {
        return this.qSG;
    }

    public int gXn() {
        return this.f16197RJ;
    }

    public boolean gtr() {
        return this.mZk;
    }

    public String hff() {
        return this.bOf;
    }

    /* renamed from: hi */
    public int m88797hi() {
        return this.JlG;
    }

    public int huT() {
        return this.RFq;
    }

    /* renamed from: iR */
    public int m88796iR() {
        return this.f16214hi;
    }

    /* renamed from: jA */
    public int m88791jA() {
        return this.f16195Ny;
    }

    /* renamed from: jf */
    public int m88790jf() {
        return this.eDa;
    }

    /* renamed from: jz */
    public int m88789jz() {
        return this.LKE;
    }

    public String kMt() {
        return this.VzQ;
    }

    /* renamed from: kU */
    public int m88788kU() {
        return this.f16205Ys;
    }

    /* renamed from: lM */
    public boolean m88787lM() {
        return this.Pae;
    }

    public JSONObject ldr() {
        return this.ovC;
    }

    public boolean mLT() {
        return this.gtr;
    }

    public String mZk() {
        return this.f16211eK;
    }

    public int ovC() {
        return this.xFs;
    }

    /* renamed from: qC */
    public String m88786qC() {
        return this.daV;
    }

    public String qSG() {
        return this.Gih;
    }

    /* renamed from: qp */
    public int m88785qp() {
        return this.f16210dS;
    }

    public int rgo() {
        List<C7460bg> list = this.hff;
        if (list != null) {
            for (C7460bg c7460bg : list) {
                if ("translate".equals(c7460bg.m88954WR()) && c7460bg.m88942iR() < 0) {
                    return -c7460bg.m88942iR();
                }
            }
            return 0;
        }
        return 0;
    }

    /* renamed from: rr */
    public int m88784rr() {
        return this.f16187GR;
    }

    public String rri() {
        return this.xxp;
    }

    public int sVc() {
        return this.Dxa;
    }

    /* renamed from: tC */
    public String m88783tC() {
        return this.f16227vb;
    }

    public double tuV() {
        return this.f16201VB;
    }

    public int txA() {
        return this.f16221qC;
    }

    /* renamed from: uV */
    public JSONObject m88780uV() {
        return this.HXG;
    }

    public boolean uny() {
        return this.ZTq;
    }

    /* renamed from: uu */
    public String m88779uu() {
        return this.f16202VJ;
    }

    /* renamed from: vb */
    public float m88778vb() {
        return this.f16191Kg;
    }

    /* renamed from: wS */
    public boolean m88774wS() {
        return this.GvG;
    }

    /* renamed from: wq */
    public void m88773wq() {
        m88809bg(this, this.f16209bu);
    }

    public String xFs() {
        return this.f16219kU;
    }

    public float xxp() {
        return this.f16204WR;
    }

    public float yDt() {
        return this.ldr;
    }

    public boolean yda() {
        return this.FFy;
    }

    public boolean zCS() {
        return this.gXn;
    }

    /* renamed from: zU */
    public int m88772zU() {
        return this.huT;
    }

    /* renamed from: zx */
    public int m88771zx() {
        return this.KRc;
    }

    public void DDQ(int i) {
        this.f16187GR = i;
    }

    /* renamed from: Fy */
    public void m88877Fy(String str) {
        this.bCU = str;
    }

    /* renamed from: IL */
    public void m88871IL(int i) {
        this.uny = i;
    }

    public void JAA(int i) {
        this.RFq = i;
    }

    /* renamed from: Ja */
    public void m88866Ja(int i) {
        this.qSG = i;
    }

    /* renamed from: Kg */
    public void m88863Kg(float f) {
        this.f16204WR = f;
    }

    /* renamed from: LZ */
    public void m88858LZ(int i) {
        this.RiO = i;
    }

    /* renamed from: Lq */
    public void m88853Lq(String str) {
        this.f16203VW = str;
    }

    /* renamed from: PX */
    public void m88848PX(String str) {
        this.rri = str;
    }

    /* renamed from: Ta */
    public void m88843Ta(String str) {
        this.kMt = str;
    }

    /* renamed from: Uq */
    public void m88840Uq(int i) {
        this.f16216jA = i;
    }

    /* renamed from: Uw */
    public String m88839Uw() {
        return this.f16192LZ;
    }

    /* renamed from: VB */
    public void m88834VB(String str) {
        this.f16224tC = str;
    }

    /* renamed from: VJ */
    public void m88831VJ(int i) {
        this.f16217jf = i;
    }

    /* renamed from: VW */
    public void m88829VW(int i) {
        this.xFs = i;
    }

    public void VzQ(String str) {
        this.ayS = str;
    }

    /* renamed from: WR */
    public void m88827WR(float f) {
        this.f16212eo = f;
    }

    public void ZQc(int i) {
        this.f16223rr = i;
    }

    public void aGH(int i) {
        this.JlG = i;
    }

    public void ayS(int i) {
        this.ZyO = i;
    }

    /* renamed from: bX */
    public void m88818bX(int i) {
        this.JxS = i;
    }

    public void daV(int i) {
        this.huT = i;
    }

    /* renamed from: eo */
    public void m88799eo(String str) {
        this.f16192LZ = str;
    }

    public void eqN(int i) {
        this.KRc = i;
    }

    /* renamed from: iR */
    public void m88795iR(float f) {
        this.f16191Kg = f;
    }

    public void kMt(int i) {
        this.eDa = i;
    }

    public void ldr(int i) {
        this.ews = i;
    }

    public void rri(int i) {
        this.f16195Ny = i;
    }

    /* renamed from: tC */
    public void m88782tC(int i) {
        this.f16184Dt = i;
    }

    public void tuV(String str) {
        this.ApA = str;
    }

    /* renamed from: vb */
    public void m88776vb(String str) {
        this.f16202VJ = str;
    }

    public void xxp(String str) {
        this.daV = str;
    }

    public void yDt(String str) {
        this.aGH = str;
    }

    /* renamed from: zx */
    public void m88768zx(int i) {
        this.f16214hi = i;
    }

    /* renamed from: Fy */
    public void m88878Fy(int i) {
        this.f16210dS = i;
    }

    /* renamed from: IL */
    public void m88872IL(float f) {
        this.f16189IL = f;
    }

    public void JAA(String str) {
        this.Gih = str;
    }

    /* renamed from: Ja */
    public void m88865Ja(String str) {
        this.JaB = str;
    }

    /* renamed from: Kg */
    public void m88861Kg(String str) {
        this.tuV = str;
    }

    /* renamed from: LZ */
    public void m88857LZ(String str) {
        this.bOf = str;
    }

    /* renamed from: Lq */
    public void m88854Lq(int i) {
        this.f16197RJ = i;
    }

    /* renamed from: PX */
    public void m88849PX(int i) {
        this.f16221qC = i;
    }

    /* renamed from: Ta */
    public void m88844Ta(int i) {
        this.Dxa = i;
    }

    /* renamed from: Uw */
    public void m88838Uw(int i) {
        this.f16229wq = i;
    }

    /* renamed from: VB */
    public void m88835VB(int i) {
        this.f16226uu = i;
    }

    public void VzQ(int i) {
        this.zCS = i;
    }

    /* renamed from: WR */
    public void m88825WR(String str) {
        this.f16186Fy = str;
    }

    /* renamed from: bX */
    public void m88819bX(float f) {
        this.f16207bX = f;
    }

    /* renamed from: eo */
    public void m88800eo(int i) {
        this.CQc = i;
    }

    public void eqN(float f) {
        this.eqN = f;
    }

    /* renamed from: iR */
    public void m88793iR(String str) {
        this.VzQ = str;
    }

    public void kMt(String str) {
        this.yda = str;
    }

    public void ldr(float f) {
        this.f16215iR = f;
    }

    public void rri(String str) {
        this.mLT = str;
    }

    /* renamed from: tC */
    public void m88781tC(String str) {
        this.f16219kU = str;
    }

    public void tuV(int i) {
        this.f16205Ys = i;
    }

    /* renamed from: vb */
    public void m88777vb(int i) {
        this.sVc = i;
    }

    public void xxp(int i) {
        this.f16228wS = i;
    }

    public void yDt(int i) {
        this.f16218jz = i;
    }

    /* renamed from: zx */
    public void m88769zx(float f) {
        this.ldr = f;
    }

    /* renamed from: IL */
    public void m88868IL(boolean z) {
        this.f16231zx = z;
    }

    /* renamed from: Kg */
    public void m88862Kg(int i) {
        this.f16200Uw = i;
    }

    /* renamed from: Lq */
    public void m88852Lq(boolean z) {
        this.ZTq = z;
    }

    /* renamed from: PX */
    public void m88847PX(boolean z) {
        this.f16225uV = z;
    }

    /* renamed from: Ta */
    public void m88842Ta(boolean z) {
        this.mZk = z;
    }

    /* renamed from: VB */
    public void m88833VB(boolean z) {
        this.cZH = z;
    }

    public void VzQ(boolean z) {
        this.gtr = z;
    }

    /* renamed from: WR */
    public void m88826WR(int i) {
        this.LKE = i;
    }

    /* renamed from: bX */
    public void m88820bX(double d) {
        this.f16196PX = d;
    }

    /* renamed from: eo */
    public void m88798eo(boolean z) {
        this.f16188GZ = z;
    }

    public void eqN(String str) {
        this.f16194Lq = str;
    }

    /* renamed from: iR */
    public void m88794iR(int i) {
        this.f16190Ja = i;
    }

    public void ldr(String str) {
        this.xxp = str;
    }

    /* renamed from: vb */
    public void m88775vb(boolean z) {
        this.gCm = z;
    }

    public void xxp(boolean z) {
        this.FFy = z;
    }

    public void yDt(boolean z) {
        this.rgo = z;
    }

    /* renamed from: zx */
    public void m88767zx(String str) {
        this.f16227vb = str;
    }

    /* renamed from: IL */
    public void m88873IL(double d) {
        this.f16201VB = d;
    }

    /* renamed from: Kg */
    public void m88860Kg(boolean z) {
        this.f16220lM = z;
    }

    /* renamed from: WR */
    public void m88824WR(boolean z) {
        this.gXn = z;
    }

    /* renamed from: bX */
    public void m88817bX(String str) {
        this.yDt = str;
    }

    public void eqN(double d) {
        this.DDQ = d;
    }

    /* renamed from: iR */
    public void m88792iR(boolean z) {
        this.GvG = z;
    }

    public void ldr(double d) {
        this.f16206bN = d;
    }

    /* renamed from: zx */
    public void m88770zx(double d) {
        this.f16199Uq = d;
    }

    /* renamed from: IL */
    public void m88870IL(String str) {
        this.f16198Ta = str;
    }

    /* renamed from: bX */
    public void m88815bX(boolean z) {
        this.JAA = z;
    }

    public void eqN(boolean z) {
        this.ZQc = z;
    }

    public void ldr(boolean z) {
        this.txA = z;
    }

    /* renamed from: zx */
    public void m88765zx(boolean z) {
        this.Pae = z;
    }

    /* renamed from: IL */
    public void m88869IL(JSONObject jSONObject) {
        this.f16193Ld = jSONObject;
    }

    /* renamed from: bX */
    public void m88816bX(JSONObject jSONObject) {
        this.f16209bu = jSONObject;
    }

    public void eqN(JSONObject jSONObject) {
        this.HXG = jSONObject;
    }

    /* renamed from: zx */
    public void m88766zx(JSONObject jSONObject) {
        this.ovC = jSONObject;
    }

    /* renamed from: bg */
    public boolean m88814bg() {
        return this.f16222qp;
    }

    /* renamed from: bg */
    public void m88805bg(boolean z) {
        this.f16222qp = z;
    }

    /* renamed from: bg */
    public void m88811bg(int i) {
        this.f16230zU = i;
    }

    /* renamed from: bg */
    public void m88813bg(double d) {
        this.IEI = d;
    }

    /* renamed from: bg */
    public void m88808bg(String str) {
        this.f16185Fx = str;
    }

    /* renamed from: bg */
    public void m88812bg(float f) {
        this.f16208bg = f;
    }

    /* renamed from: bg */
    public void m88807bg(List<C7460bg> list) {
        this.hff = list;
    }

    /* renamed from: bg */
    public void m88810bg(long j) {
        this.f16213gJ = j;
    }

    /* renamed from: bg */
    private void m88809bg(C7465ldr c7465ldr, JSONObject jSONObject) {
        if (c7465ldr == null || jSONObject == null) {
            return;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            next.hashCode();
            char c = 65535;
            switch (next.hashCode()) {
                case -2067713583:
                    if (next.equals("isShowBgControl")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1965619659:
                    if (next.equals("clickArea")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1912831834:
                    if (next.equals("triggerSlideDirection")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1885934767:
                    if (next.equals("bgImgUrl")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1822062213:
                    if (next.equals("lineCount")) {
                        c = 4;
                        break;
                    }
                    break;
                case -1821293778:
                    if (next.equals("openPlayableLandingPage")) {
                        c = 5;
                        break;
                    }
                    break;
                case -1813937113:
                    if (next.equals("lineLimit")) {
                        c = 6;
                        break;
                    }
                    break;
                case -1578250488:
                    if (next.equals("interactBgColor")) {
                        c = 7;
                        break;
                    }
                    break;
                case -1501175880:
                    if (next.equals("paddingLeft")) {
                        c = '\b';
                        break;
                    }
                    break;
                case -1422965251:
                    if (next.equals("adType")) {
                        c = '\t';
                        break;
                    }
                    break;
                case -1383228885:
                    if (next.equals("bottom")) {
                        c = '\n';
                        break;
                    }
                    break;
                case -1224696685:
                    if (next.equals("fontFamily")) {
                        c = 11;
                        break;
                    }
                    break;
                case -1221029593:
                    if (next.equals("height")) {
                        c = '\f';
                        break;
                    }
                    break;
                case -1065511464:
                    if (next.equals("textAlign")) {
                        c = '\r';
                        break;
                    }
                    break;
                case -1063257157:
                    if (next.equals("alignItems")) {
                        c = 14;
                        break;
                    }
                    break;
                case -1046708884:
                    if (next.equals("interactValidate")) {
                        c = 15;
                        break;
                    }
                    break;
                case -1044792121:
                    if (next.equals("marginTop")) {
                        c = 16;
                        break;
                    }
                    break;
                case -1019884910:
                    if (next.equals("useBottom")) {
                        c = 17;
                        break;
                    }
                    break;
                case -1005195314:
                    if (next.equals("triggerSlideMinDistance")) {
                        c = 18;
                        break;
                    }
                    break;
                case -962590849:
                    if (next.equals("direction")) {
                        c = 19;
                        break;
                    }
                    break;
                case -912366651:
                    if (next.equals("tagMaxCount")) {
                        c = 20;
                        break;
                    }
                    break;
                case -848877971:
                    if (next.equals("interactHiddenTime")) {
                        c = 21;
                        break;
                    }
                    break;
                case -836058546:
                    if (next.equals("useTop")) {
                        c = 22;
                        break;
                    }
                    break;
                case -734428249:
                    if (next.equals("fontWeight")) {
                        c = 23;
                        break;
                    }
                    break;
                case -731417480:
                    if (next.equals("zIndex")) {
                        c = 24;
                        break;
                    }
                    break;
                case -709393864:
                    if (next.equals("timingStart")) {
                        c = 25;
                        break;
                    }
                    break;
                case -515807685:
                    if (next.equals("lineHeight")) {
                        c = 26;
                        break;
                    }
                    break;
                case -321658193:
                    if (next.equals("textFlowDuration")) {
                        c = 27;
                        break;
                    }
                    break;
                case -295409451:
                    if (next.equals("useRight")) {
                        c = 28;
                        break;
                    }
                    break;
                case -289173127:
                    if (next.equals("marginBottom")) {
                        c = 29;
                        break;
                    }
                    break;
                case -204859874:
                    if (next.equals("bgColor")) {
                        c = 30;
                        break;
                    }
                    break;
                case -148259282:
                    if (next.equals("useLeft")) {
                        c = 31;
                        break;
                    }
                    break;
                case -51738487:
                    if (next.equals("widthMode")) {
                        c = ' ';
                        break;
                    }
                    break;
                case 115029:
                    if (next.equals(ViewHierarchyConstants.DIMENSION_TOP_KEY)) {
                        c = '!';
                        break;
                    }
                    break;
                case 3076010:
                    if (next.equals("data")) {
                        c = '\"';
                        break;
                    }
                    break;
                case 3317767:
                    if (next.equals("left")) {
                        c = '#';
                        break;
                    }
                    break;
                case 3327652:
                    if (next.equals("loop")) {
                        c = '$';
                        break;
                    }
                    break;
                case 90130308:
                    if (next.equals("paddingTop")) {
                        c = '%';
                        break;
                    }
                    break;
                case 92903173:
                    if (next.equals("align")) {
                        c = '&';
                        break;
                    }
                    break;
                case 94842723:
                    if (next.equals("color")) {
                        c = '\'';
                        break;
                    }
                    break;
                case 108511772:
                    if (next.equals("right")) {
                        c = '(';
                        break;
                    }
                    break;
                case 113126854:
                    if (next.equals("width")) {
                        c = ')';
                        break;
                    }
                    break;
                case 164611121:
                    if (next.equals("timingEnd")) {
                        c = '*';
                        break;
                    }
                    break;
                case 202355100:
                    if (next.equals("paddingBottom")) {
                        c = '+';
                        break;
                    }
                    break;
                case 247204452:
                    if (next.equals("allowTextFlow")) {
                        c = ',';
                        break;
                    }
                    break;
                case 302841174:
                    if (next.equals("interactWontHide")) {
                        c = '-';
                        break;
                    }
                    break;
                case 365601008:
                    if (next.equals("fontSize")) {
                        c = '.';
                        break;
                    }
                    break;
                case 428975654:
                    if (next.equals("justifyVertical")) {
                        c = '/';
                        break;
                    }
                    break;
                case 439444041:
                    if (next.equals("interactVisibleTime")) {
                        c = '0';
                        break;
                    }
                    break;
                case 713848971:
                    if (next.equals("paddingRight")) {
                        c = '1';
                        break;
                    }
                    break;
                case 722830999:
                    if (next.equals("borderColor")) {
                        c = '2';
                        break;
                    }
                    break;
                case 737768677:
                    if (next.equals("borderStyle")) {
                        c = '3';
                        break;
                    }
                    break;
                case 747804969:
                    if (next.equals(C21114v8.C21122h.f54038L)) {
                        c = '4';
                        break;
                    }
                    break;
                case 791643104:
                    if (next.equals("isDataFixed")) {
                        c = '5';
                        break;
                    }
                    break;
                case 975087886:
                    if (next.equals("marginRight")) {
                        c = '6';
                        break;
                    }
                    break;
                case 1110826708:
                    if (next.equals("justifyHorizontal")) {
                        c = '7';
                        break;
                    }
                    break;
                case 1122368895:
                    if (next.equals("interactPosition")) {
                        c = '8';
                        break;
                    }
                    break;
                case 1188229042:
                    if (next.equals("lineFeed")) {
                        c = '9';
                        break;
                    }
                    break;
                case 1332036739:
                    if (next.equals("interactText")) {
                        c = ':';
                        break;
                    }
                    break;
                case 1332055696:
                    if (next.equals("interactType")) {
                        c = ';';
                        break;
                    }
                    break;
                case 1349188574:
                    if (next.equals("borderRadius")) {
                        c = '<';
                        break;
                    }
                    break;
                case 1360828714:
                    if (next.equals("clickTigger")) {
                        c = C20517nb.f52173T;
                        break;
                    }
                    break;
                case 1490178922:
                    if (next.equals("heightMode")) {
                        c = '>';
                        break;
                    }
                    break;
                case 1761274325:
                    if (next.equals("textFlowType")) {
                        c = '?';
                        break;
                    }
                    break;
                case 1824903757:
                    if (next.equals("borderSize")) {
                        c = '@';
                        break;
                    }
                    break;
                case 1970934485:
                    if (next.equals("marginLeft")) {
                        c = 'A';
                        break;
                    }
                    break;
                case 2111078717:
                    if (next.equals("letterSpacing")) {
                        c = 'B';
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    c7465ldr.m88815bX(jSONObject.optBoolean(next, false));
                    break;
                case 1:
                    c7465ldr.m88853Lq(jSONObject.optString(next));
                    break;
                case 2:
                    c7465ldr.m88865Ja(jSONObject.optString(next));
                    break;
                case 3:
                    c7465ldr.m88793iR(jSONObject.optString(next));
                    break;
                case 4:
                    c7465ldr.m88826WR(jSONObject.optInt(next));
                    break;
                case 5:
                    c7465ldr.VzQ(jSONObject.optBoolean(next));
                    break;
                case 6:
                    c7465ldr.ldr(jSONObject.optBoolean(next));
                    break;
                case 7:
                    c7465ldr.m88843Ta(jSONObject.optString(next));
                    break;
                case '\b':
                    c7465ldr.ldr((float) jSONObject.optDouble(next));
                    break;
                case '\t':
                    c7465ldr.m88870IL(jSONObject.optString(next));
                    break;
                case '\n':
                    c7465ldr.rri(jSONObject.optInt(next));
                    break;
                case 11:
                    c7465ldr.m88817bX(jSONObject.optString(next));
                    break;
                case '\f':
                    c7465ldr.m88819bX((float) jSONObject.optDouble(next));
                    break;
                case '\r':
                    c7465ldr.eqN(jSONObject.optString(next));
                    break;
                case 14:
                    c7465ldr.m88857LZ(jSONObject.optString(next));
                    break;
                case 15:
                    c7465ldr.m88868IL(jSONObject.optBoolean(next));
                    break;
                case 16:
                    c7465ldr.m88800eo(jSONObject.optInt(next));
                    break;
                case 17:
                    c7465ldr.m88798eo(jSONObject.optBoolean(next));
                    break;
                case 18:
                    c7465ldr.m88810bg(jSONObject.optLong(next));
                    break;
                case 19:
                    c7465ldr.m88781tC(jSONObject.optString(next));
                    break;
                case 20:
                    c7465ldr.xxp(jSONObject.optInt(next));
                    break;
                case 21:
                    c7465ldr.JAA(jSONObject.optInt(next));
                    break;
                case 22:
                    c7465ldr.m88824WR(jSONObject.optBoolean(next));
                    break;
                case 23:
                    c7465ldr.m88854Lq(jSONObject.optInt(next));
                    break;
                case 24:
                    c7465ldr.kMt(jSONObject.optInt(next));
                    break;
                case 25:
                    c7465ldr.m88873IL(jSONObject.optDouble(next));
                    break;
                case 26:
                    c7465ldr.ldr(jSONObject.optDouble(next));
                    break;
                case 27:
                    c7465ldr.tuV(jSONObject.optInt(next));
                    break;
                case 28:
                    c7465ldr.m88860Kg(jSONObject.optBoolean(next));
                    break;
                case 29:
                    c7465ldr.m88835VB(jSONObject.optInt(next));
                    break;
                case 30:
                    c7465ldr.ldr(jSONObject.optString(next));
                    break;
                case 31:
                    c7465ldr.m88792iR(jSONObject.optBoolean(next));
                    break;
                case ' ':
                    c7465ldr.m88834VB(jSONObject.optString(next));
                    break;
                case '!':
                    c7465ldr.m88782tC(jSONObject.optInt(next));
                    break;
                case '\"':
                    c7465ldr.m88877Fy(jSONObject.optString(next));
                    break;
                case '#':
                    c7465ldr.m88878Fy(jSONObject.optInt(next));
                    break;
                case '$':
                    c7465ldr.m88805bg(jSONObject.optBoolean(next));
                    break;
                case '%':
                    c7465ldr.m88863Kg((float) jSONObject.optDouble(next));
                    break;
                case '&':
                    c7465ldr.tuV(jSONObject.optString(next));
                    break;
                case '\'':
                    c7465ldr.m88767zx(jSONObject.optString(next));
                    break;
                case '(':
                    c7465ldr.m88858LZ(jSONObject.optInt(next));
                    break;
                case ')':
                    c7465ldr.eqN((float) jSONObject.optDouble(next));
                    break;
                case '*':
                    c7465ldr.m88820bX(jSONObject.optDouble(next));
                    break;
                case '+':
                    c7465ldr.m88769zx((float) jSONObject.optDouble(next));
                    break;
                case ',':
                    c7465ldr.m88833VB(jSONObject.optBoolean(next));
                    break;
                case '-':
                    c7465ldr.yDt(jSONObject.optBoolean(next));
                    break;
                case '.':
                    c7465ldr.m88827WR((float) jSONObject.optDouble(next));
                    break;
                case '/':
                    c7465ldr.VzQ(jSONObject.optString(next));
                    break;
                case '0':
                    c7465ldr.m88840Uq(jSONObject.optInt(next));
                    break;
                case '1':
                    c7465ldr.m88795iR((float) jSONObject.optDouble(next));
                    break;
                case '2':
                    c7465ldr.m88861Kg(jSONObject.optString(next));
                    break;
                case '3':
                    c7465ldr.m88825WR(jSONObject.optString(next));
                    break;
                case '4':
                    c7465ldr.m88777vb(jSONObject.optInt(next));
                    break;
                case '5':
                    c7465ldr.m88765zx(jSONObject.optBoolean(next));
                    break;
                case '6':
                    c7465ldr.m88844Ta(jSONObject.optInt(next));
                    break;
                case '7':
                    c7465ldr.xxp(jSONObject.optString(next));
                    break;
                case '8':
                    JSONObject optJSONObject = jSONObject.optJSONObject(next);
                    if (optJSONObject == null) {
                        break;
                    } else {
                        c7465ldr.m88794iR(optJSONObject.optInt("translateY", 0));
                        c7465ldr.m88862Kg(optJSONObject.optInt("translateX", 0));
                        c7465ldr.eqN(optJSONObject.optDouble("scaleX", 0.0d));
                        c7465ldr.m88770zx(optJSONObject.optDouble("scaleY", 0.0d));
                        break;
                    }
                case '9':
                    c7465ldr.eqN(jSONObject.optBoolean(next));
                    break;
                case ':':
                    c7465ldr.m88848PX(jSONObject.optString(next));
                    break;
                case ';':
                    c7465ldr.yDt(jSONObject.optString(next));
                    break;
                case '<':
                    c7465ldr.m88812bg((float) jSONObject.optDouble(next));
                    break;
                case '=':
                    c7465ldr.m88776vb(jSONObject.optString(next));
                    break;
                case '>':
                    c7465ldr.m88799eo(jSONObject.optString(next));
                    break;
                case '?':
                    c7465ldr.VzQ(jSONObject.optInt(next));
                    break;
                case '@':
                    c7465ldr.m88872IL((float) jSONObject.optDouble(next));
                    break;
                case 'A':
                    c7465ldr.m88849PX(jSONObject.optInt(next));
                    break;
                case 'B':
                    c7465ldr.yDt(jSONObject.optInt(next));
                    break;
            }
        }
    }
}
