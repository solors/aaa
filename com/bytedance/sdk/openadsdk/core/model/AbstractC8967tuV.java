package com.bytedance.sdk.openadsdk.core.model;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bykv.p135vk.openvk.p136bg.p137bg.p149bg.p151bX.C6493IL;
import com.bytedance.sdk.component.adexpress.p243bg.p245bX.C7321eqN;
import com.bytedance.sdk.component.p238WR.p239IL.C7260bg;
import com.bytedance.sdk.component.utils.C7741PX;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.act.C8874bg;
import com.bytedance.sdk.openadsdk.core.p316PX.C8643bg;
import com.bytedance.sdk.openadsdk.core.p321Ta.p324bg.C8726IL;
import com.bytedance.sdk.openadsdk.core.p326VB.ldr.C8831bg;
import com.bytedance.sdk.openadsdk.p284Fy.C7862bg;
import com.bytedance.sdk.openadsdk.utils.ayS;
import com.bytedance.sdk.openadsdk.utils.daV;
import com.maticoo.sdk.utils.constant.KeyConstants;
import com.p552ot.pubsub.p554b.C26502a;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.model.tuV */
/* loaded from: classes3.dex */
public abstract class AbstractC8967tuV {

    /* renamed from: bg */
    protected boolean f19948bg;

    /* renamed from: bX */
    public static final String f19945bX = C8955a.m84270a("_", new CharSequence[]{"is", ayS.m82489LZ()});
    public static final String eqN = C8955a.m84270a("_", new CharSequence[]{"is", ayS.m82489LZ(), C26502a.f69299e});

    /* renamed from: zx */
    public static final String f19946zx = C8955a.m84270a("_", new CharSequence[]{ayS.m82489LZ(), "strategy"});
    protected static int ldr = 330;

    /* renamed from: iR */
    private long f19949iR = 0;

    /* renamed from: IL */
    protected boolean f19947IL = false;

    /* renamed from: com.bytedance.sdk.openadsdk.core.model.tuV$bg */
    /* loaded from: classes3.dex */
    public static class C8968bg {

        /* renamed from: IL */
        private String f19950IL;

        /* renamed from: Kg */
        private List<Integer> f19951Kg;

        /* renamed from: PX */
        private String f19952PX;

        /* renamed from: Ta */
        private String f19953Ta;

        /* renamed from: VB */
        private String f19954VB;

        /* renamed from: WR */
        private String f19955WR;

        /* renamed from: bX */
        private String f19956bX;

        /* renamed from: bg */
        private String f19957bg;

        /* renamed from: eo */
        private String f19958eo;
        private String eqN;

        /* renamed from: iR */
        private String f19959iR;
        private String ldr;
        private String yDt;

        /* renamed from: zx */
        private String f19960zx;

        @NonNull
        /* renamed from: IL */
        public static C8831bg m83974IL(C8968bg c8968bg, String str) {
            return new C8831bg().m84775bg(c8968bg.ldr()).m84780IL(c8968bg.m83952vb()).m84778bX(c8968bg.m83970Lq()).eqN(c8968bg.xxp()).m84773zx(str);
        }

        @NonNull
        /* renamed from: bg */
        public static C7321eqN m83959bg(C8968bg c8968bg, String str) {
            return C7321eqN.m89123bg().m89122bg(c8968bg.ldr()).m89125IL(c8968bg.m83954iR()).m89124bX(c8968bg.m83972Kg()).eqN(c8968bg.m83963WR()).m89121zx(c8968bg.m83951zx()).ldr(str);
        }

        /* renamed from: Kg */
        public String m83972Kg() {
            return this.f19956bX;
        }

        /* renamed from: Lq */
        public String m83970Lq() {
            return this.f19952PX;
        }

        /* renamed from: PX */
        public String m83969PX() {
            return this.f19954VB;
        }

        /* renamed from: Ta */
        public String m83967Ta() {
            return this.f19958eo;
        }

        /* renamed from: VB */
        public String m83965VB() {
            return this.f19959iR;
        }

        /* renamed from: WR */
        public String m83963WR() {
            return this.eqN;
        }

        /* renamed from: bX */
        public List<Integer> m83961bX() {
            return this.f19951Kg;
        }

        /* renamed from: eo */
        public String m83956eo() {
            return this.f19960zx;
        }

        public String eqN() {
            return this.f19955WR;
        }

        /* renamed from: iR */
        public String m83954iR() {
            return this.f19950IL;
        }

        public String ldr() {
            return this.f19957bg;
        }

        /* renamed from: vb */
        public String m83952vb() {
            return this.f19953Ta;
        }

        public String xxp() {
            return this.yDt;
        }

        public boolean yDt() {
            if (!TextUtils.isEmpty(this.f19958eo) && this.f19958eo.equals("v3")) {
                return true;
            }
            return false;
        }

        /* renamed from: zx */
        public String m83951zx() {
            return this.ldr;
        }

        /* renamed from: Kg */
        public void m83971Kg(String str) {
            this.f19959iR = str;
        }

        /* renamed from: PX */
        public void m83968PX(String str) {
            this.f19953Ta = str;
        }

        /* renamed from: Ta */
        public void m83966Ta(String str) {
            this.yDt = str;
        }

        /* renamed from: VB */
        public void m83964VB(String str) {
            this.f19952PX = str;
        }

        /* renamed from: WR */
        public void m83962WR(String str) {
            this.f19954VB = str;
        }

        /* renamed from: bX */
        public void m83960bX(String str) {
            this.f19957bg = str;
        }

        /* renamed from: eo */
        public void m83955eo(String str) {
            this.f19958eo = str;
        }

        public void eqN(String str) {
            this.f19950IL = str;
        }

        /* renamed from: iR */
        public void m83953iR(String str) {
            this.f19960zx = str;
        }

        public void ldr(String str) {
            this.eqN = str;
        }

        /* renamed from: zx */
        public void m83950zx(String str) {
            this.f19956bX = str;
        }

        /* renamed from: IL */
        public void m83973IL(String str) {
            this.ldr = str;
        }

        /* renamed from: bg */
        public void m83957bg(List<Integer> list) {
            this.f19951Kg = list;
        }

        /* renamed from: bg */
        public void m83958bg(String str) {
            this.f19955WR = str;
        }
    }

    public AbstractC8967tuV() {
        this.f19948bg = false;
        this.f19948bg = C7862bg.m87502bg("is_new_playable", false);
    }

    /* renamed from: bX */
    public static boolean m84061bX(AbstractC8967tuV abstractC8967tuV) {
        return (abstractC8967tuV == null || abstractC8967tuV.Dxa() == null || abstractC8967tuV.Dxa().eqN() != 7 || C8965rri.m84151iR(abstractC8967tuV)) ? false : true;
    }

    public static boolean eqN(AbstractC8967tuV abstractC8967tuV) {
        return (abstractC8967tuV == null || abstractC8967tuV.Dxa() == null || abstractC8967tuV.Dxa().m91737bg() != 1) ? false : true;
    }

    /* renamed from: iR */
    private static double m84008iR(JSONObject jSONObject) {
        if (jSONObject == null) {
            return 0.0d;
        }
        return jSONObject.optDouble("pack_time", 0.0d);
    }

    private static long ldr(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optLong(KeyConstants.RequestBody.KEY_UID, 0L);
        }
        return 0L;
    }

    /* renamed from: zx */
    public static boolean m83978zx(AbstractC8967tuV abstractC8967tuV) {
        if (abstractC8967tuV == null) {
            return false;
        }
        int bOf = abstractC8967tuV.bOf();
        if (!abstractC8967tuV.HXG() && bOf != 5 && bOf != 15 && bOf != 50) {
            return false;
        }
        return true;
    }

    public abstract C8948Lq ApA();

    /* renamed from: Az */
    public abstract C8831bg mo84139Az();

    public abstract void CQc(int i);

    public abstract boolean CQc();

    /* renamed from: Cv */
    public abstract String mo84138Cv();

    public abstract JSONObject DCn();

    public abstract int DDQ();

    public abstract void DDQ(int i);

    public abstract void DDQ(String str);

    /* renamed from: Dt */
    public abstract C8952VB mo84137Dt();

    public abstract C6493IL Dxa();

    public abstract void Dxa(int i);

    public abstract int FFy();

    /* renamed from: Fb */
    public abstract boolean mo84136Fb();

    /* renamed from: Fx */
    public abstract int mo84135Fx();

    /* renamed from: Fy */
    public abstract String mo84134Fy();

    /* renamed from: Fy */
    public abstract void mo84133Fy(int i);

    /* renamed from: Fy */
    public abstract void mo84132Fy(String str);

    public abstract int GEa();

    public abstract boolean GJw();

    /* renamed from: GR */
    public abstract C6493IL mo84131GR();

    /* renamed from: GZ */
    public abstract List<String> mo84130GZ();

    public abstract boolean GZy();

    public abstract String Gih();

    public abstract String GvG();

    public abstract boolean HXG();

    /* renamed from: Hn */
    public abstract String mo84129Hn();

    /* renamed from: IE */
    public abstract boolean mo84128IE();

    public abstract int IEI();

    public abstract int IGR();

    /* renamed from: IL */
    public long m84127IL() {
        return this.f19949iR;
    }

    /* renamed from: IL */
    public abstract void mo84126IL(double d);

    /* renamed from: IL */
    public abstract void mo84125IL(int i);

    /* renamed from: IL */
    public abstract void mo84124IL(long j);

    /* renamed from: IL */
    public abstract void mo84122IL(C6493IL c6493il);

    /* renamed from: IL */
    public abstract void mo84121IL(C8831bg c8831bg);

    /* renamed from: IL */
    public abstract void mo84120IL(C8948Lq c8948Lq);

    /* renamed from: IL */
    public abstract void mo84117IL(JSONObject jSONObject);

    /* renamed from: IL */
    public abstract void mo84116IL(boolean z);

    public abstract int JAA();

    public abstract String JAA(String str);

    public abstract void JAA(int i);

    public abstract int JMw();

    /* renamed from: Ja */
    public abstract int mo84115Ja();

    /* renamed from: Ja */
    public abstract void mo84114Ja(int i);

    /* renamed from: Ja */
    public abstract void mo84113Ja(String str);

    public abstract int JaB();

    public abstract C8950Ta JlG();

    public abstract boolean JxS();

    public abstract int KRc();

    /* renamed from: Kg */
    public abstract void mo84111Kg(int i);

    /* renamed from: Kg */
    public abstract void mo84110Kg(String str);

    /* renamed from: Kg */
    public abstract void mo84109Kg(boolean z);

    /* renamed from: Kg */
    public boolean mo84112Kg() {
        if (!TextUtils.isEmpty(ldr()) && !TextUtils.isEmpty(mo84011iR())) {
            return true;
        }
        return false;
    }

    /* renamed from: Ky */
    public abstract String mo84108Ky();

    public abstract C8968bg LKE();

    public abstract void LKE(int i);

    /* renamed from: LZ */
    public abstract int mo84107LZ();

    /* renamed from: LZ */
    public abstract void mo84106LZ(int i);

    /* renamed from: LZ */
    public abstract void mo84105LZ(String str);

    /* renamed from: Ld */
    public abstract List<String> mo84104Ld();

    /* renamed from: Lq */
    public abstract C8965rri mo84103Lq();

    /* renamed from: Lq */
    public abstract void mo84102Lq(int i);

    /* renamed from: Lq */
    public abstract void mo84101Lq(String str);

    /* renamed from: MM */
    public abstract String mo84100MM();

    /* renamed from: NC */
    public abstract boolean mo84099NC();

    public abstract boolean NHy();

    /* renamed from: NU */
    public abstract boolean mo84098NU();

    /* renamed from: Ny */
    public abstract String mo84097Ny();

    public abstract int OLh();

    @Nullable
    /* renamed from: PC */
    public abstract String mo84096PC();

    /* renamed from: PX */
    public abstract int mo84095PX();

    /* renamed from: PX */
    public abstract void mo84094PX(int i);

    /* renamed from: PX */
    public abstract void mo84093PX(String str);

    public abstract boolean Pae();

    public abstract boolean RFq();

    /* renamed from: RJ */
    public abstract boolean mo84092RJ();

    /* renamed from: Rh */
    public abstract boolean mo84091Rh();

    public abstract C8956bX RiO();

    /* renamed from: Ta */
    public abstract int mo84090Ta();

    /* renamed from: Ta */
    public abstract void mo84089Ta(int i);

    /* renamed from: Ta */
    public abstract void mo84088Ta(String str);

    public abstract int ULi();

    /* renamed from: Uq */
    public abstract int mo84087Uq();

    /* renamed from: Uq */
    public abstract void mo84086Uq(int i);

    /* renamed from: Uw */
    public abstract String mo84085Uw();

    /* renamed from: Uw */
    public abstract void mo84084Uw(int i);

    /* renamed from: Uw */
    public abstract void mo84083Uw(String str);

    /* renamed from: VB */
    public abstract C8962eqN mo84082VB();

    /* renamed from: VB */
    public abstract void mo84081VB(int i);

    /* renamed from: VB */
    public abstract void mo84080VB(String str);

    public abstract long VHL();

    /* renamed from: VJ */
    public abstract int mo84079VJ();

    /* renamed from: VJ */
    public abstract void mo84078VJ(int i);

    /* renamed from: VW */
    public abstract AdSlot mo84077VW();

    /* renamed from: VW */
    public abstract void mo84076VW(int i);

    /* renamed from: Vm */
    public abstract boolean mo84075Vm();

    public abstract int VzQ();

    public abstract void VzQ(int i);

    public abstract void VzQ(String str);

    /* renamed from: WR */
    public abstract C8953VzQ mo84074WR();

    /* renamed from: WR */
    public abstract void mo84073WR(int i);

    /* renamed from: WR */
    public abstract void mo84072WR(String str);

    /* renamed from: WR */
    public abstract void mo84071WR(boolean z);

    /* renamed from: XQ */
    public abstract boolean mo84070XQ();

    /* renamed from: Ys */
    public abstract String mo84069Ys();

    public abstract int ZQc();

    public abstract void ZQc(int i);

    public abstract JSONObject ZTq();

    public abstract boolean ZyO();

    public abstract C8954WR aGH();

    public abstract void aGH(int i);

    public abstract boolean aMs();

    public abstract void ayS(int i);

    public abstract boolean ayS();

    public abstract List<String> bCU();

    /* renamed from: bN */
    public abstract String mo84068bN();

    /* renamed from: bN */
    public abstract void mo84067bN(int i);

    public abstract int bOf();

    /* renamed from: bX */
    public abstract void mo84065bX(int i);

    /* renamed from: bX */
    public abstract void mo84064bX(long j);

    /* renamed from: bX */
    public abstract void mo84063bX(C6493IL c6493il);

    /* renamed from: bX */
    public abstract void mo84062bX(C8948Lq c8948Lq);

    /* renamed from: bX */
    public abstract void mo84059bX(JSONObject jSONObject);

    /* renamed from: bX */
    public abstract void mo84058bX(boolean z);

    public abstract boolean bZw();

    /* renamed from: bg */
    public abstract void mo84056bg(double d);

    /* renamed from: bg */
    public abstract void mo84055bg(float f);

    /* renamed from: bg */
    public abstract void mo84054bg(int i);

    /* renamed from: bg */
    public abstract void mo84053bg(int i, int i2);

    /* renamed from: bg */
    public abstract void mo84050bg(C6493IL c6493il);

    /* renamed from: bg */
    public abstract void mo84049bg(AdSlot adSlot);

    /* renamed from: bg */
    public abstract void mo84048bg(FilterWord filterWord);

    /* renamed from: bg */
    public abstract void mo84047bg(C8643bg c8643bg);

    /* renamed from: bg */
    public abstract void mo84046bg(C8831bg c8831bg);

    /* renamed from: bg */
    public abstract void mo84045bg(C8945Ja c8945Ja);

    /* renamed from: bg */
    public abstract void mo84044bg(C8948Lq c8948Lq);

    /* renamed from: bg */
    public abstract void mo84043bg(C8949PX c8949px);

    /* renamed from: bg */
    public abstract void mo84042bg(C8950Ta c8950Ta);

    /* renamed from: bg */
    public abstract void mo84041bg(C8952VB c8952vb);

    /* renamed from: bg */
    public abstract void mo84040bg(C8953VzQ c8953VzQ);

    /* renamed from: bg */
    public abstract void mo84039bg(C8954WR c8954wr);

    /* renamed from: bg */
    public abstract void mo84038bg(C8956bX c8956bX);

    /* renamed from: bg */
    public abstract void mo84037bg(C8962eqN c8962eqN);

    /* renamed from: bg */
    public abstract void mo84036bg(C8965rri c8965rri);

    /* renamed from: bg */
    public abstract void mo84035bg(C8966tC c8966tC);

    /* renamed from: bg */
    public abstract void mo84034bg(C8968bg c8968bg);

    /* renamed from: bg */
    public abstract void mo84031bg(C8989zx c8989zx);

    /* renamed from: bg */
    public abstract void mo84028bg(Map<String, Object> map);

    /* renamed from: bg */
    public abstract void mo84026bg(boolean z);

    /* renamed from: bg */
    public boolean m84057bg() {
        int mo83989vb = mo83989vb();
        return (mo83995tC() != 2 || mo83989vb == 5 || mo83989vb == 6 || mo83989vb == 19 || mo83989vb == 12) ? false : true;
    }

    /* renamed from: bu */
    public abstract int mo84025bu();

    public abstract String cZH();

    public abstract double dFf();

    public abstract daV dRo();

    /* renamed from: dS */
    public abstract String mo84024dS();

    /* renamed from: dX */
    public abstract boolean mo84023dX();

    /* renamed from: dY */
    public abstract boolean mo84022dY();

    public abstract String daV();

    public abstract void daV(int i);

    public abstract boolean dtS();

    public abstract long eDa();

    /* renamed from: eK */
    public abstract boolean mo84021eK();

    /* renamed from: eo */
    public abstract C8989zx mo84020eo();

    /* renamed from: eo */
    public abstract void mo84019eo(int i);

    /* renamed from: eo */
    public abstract void mo84018eo(String str);

    /* renamed from: eo */
    public abstract void mo84017eo(boolean z);

    /* renamed from: eq */
    public abstract boolean mo84016eq();

    public abstract void eqN(int i);

    public abstract void eqN(JSONObject jSONObject);

    public abstract void eqN(boolean z);

    public abstract boolean eqN();

    public abstract JSONObject ews();

    /* renamed from: fE */
    public abstract boolean mo84015fE();

    public abstract int fVE();

    /* renamed from: fW */
    public abstract C8966tC mo84014fW();

    public abstract void fkt();

    public abstract JSONObject gCm();

    /* renamed from: gJ */
    public abstract boolean mo84013gJ();

    public abstract String gXn();

    public abstract int gtr();

    public abstract C8831bg hSp();

    public abstract JSONObject hff();

    /* renamed from: hi */
    public abstract C8643bg mo84012hi();

    public abstract boolean huT();

    /* renamed from: iR */
    public abstract String mo84011iR();

    /* renamed from: iR */
    public abstract void mo84010iR(int i);

    /* renamed from: iR */
    public abstract void mo84009iR(String str);

    /* renamed from: iR */
    public abstract void mo84007iR(boolean z);

    /* renamed from: jA */
    public abstract Map<String, Object> mo84006jA();

    /* renamed from: jB */
    public abstract int mo84005jB();

    public abstract String jUS();

    /* renamed from: jf */
    public abstract float mo84004jf();

    public abstract void jwM();

    /* renamed from: jz */
    public abstract int mo84003jz();

    public abstract boolean kCH();

    public abstract int kMt();

    public abstract void kMt(int i);

    public abstract void kMt(String str);

    /* renamed from: kU */
    public abstract List<FilterWord> mo84002kU();

    /* renamed from: lM */
    public abstract List<C8948Lq> mo84001lM();

    public abstract String ldr();

    public abstract void ldr(int i);

    public abstract void ldr(String str);

    public abstract void ldr(boolean z);

    public abstract C7260bg mLT();

    public abstract int mZk();

    public abstract int ovC();

    /* renamed from: pA */
    public abstract boolean mo84000pA();

    /* renamed from: qC */
    public abstract int mo83999qC();

    /* renamed from: qC */
    public abstract void mo83998qC(int i);

    public abstract int qSG();

    /* renamed from: qp */
    public abstract String mo83997qp();

    public abstract String rgo();

    /* renamed from: rr */
    public abstract boolean mo83996rr();

    public abstract void rri(int i);

    public abstract void rri(String str);

    public abstract boolean rri();

    public abstract C8948Lq sVc();

    public abstract void sbN();

    /* renamed from: tC */
    public abstract int mo83995tC();

    /* renamed from: tC */
    public abstract void mo83994tC(int i);

    /* renamed from: tC */
    public abstract void mo83993tC(String str);

    public abstract int tuV();

    public abstract void tuV(int i);

    public abstract void tuV(String str);

    public abstract int txA();

    /* renamed from: uV */
    public abstract int mo83992uV();

    public abstract void uny();

    /* renamed from: uu */
    public abstract C8945Ja mo83991uu();

    /* renamed from: uu */
    public abstract void mo83990uu(int i);

    public abstract boolean vTg();

    /* renamed from: vb */
    public abstract int mo83989vb();

    /* renamed from: vb */
    public abstract void mo83988vb(int i);

    /* renamed from: vb */
    public abstract void mo83987vb(String str);

    /* renamed from: wF */
    public abstract void mo83986wF();

    /* renamed from: wS */
    public abstract String mo83985wS();

    public abstract String waE();

    /* renamed from: wq */
    public abstract C6493IL mo83984wq();

    public abstract int xFs();

    /* renamed from: xZ */
    public abstract long mo83983xZ();

    public abstract int xxp();

    public abstract void xxp(int i);

    public abstract void xxp(String str);

    public abstract long yDt();

    public abstract void yDt(int i);

    public abstract void yDt(String str);

    /* renamed from: yN */
    public abstract boolean mo83982yN();

    public abstract int yda();

    public abstract String zCS();

    /* renamed from: zU */
    public abstract boolean mo83981zU();

    public abstract boolean zqp();

    /* renamed from: zx */
    public abstract void mo83979zx(int i);

    /* renamed from: zx */
    public abstract void mo83977zx(String str);

    /* renamed from: zx */
    public abstract void mo83976zx(JSONObject jSONObject);

    /* renamed from: zx */
    public abstract void mo83975zx(boolean z);

    /* renamed from: zx */
    public abstract boolean mo83980zx();

    /* renamed from: IL */
    public static boolean m84119IL(AbstractC8967tuV abstractC8967tuV) {
        return (m84033bg(abstractC8967tuV) || m84061bX(abstractC8967tuV)) ? false : true;
    }

    /* renamed from: bX */
    public static JSONObject m84060bX(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return new JSONObject(str);
            } catch (JSONException e) {
                C7741PX.m87873bg("MaterialMeta", e.getMessage());
            }
        }
        return null;
    }

    public static boolean ldr(AbstractC8967tuV abstractC8967tuV) {
        Object obj;
        if (abstractC8967tuV == null) {
            return false;
        }
        try {
            Map<String, Object> mo84006jA = abstractC8967tuV.mo84006jA();
            if (mo84006jA == null || (obj = mo84006jA.get(TTAdConstant.SDK_BIDDING_TYPE)) == null) {
                return false;
            }
            return 2 == Integer.parseInt(obj.toString());
        } catch (Throwable th) {
            C7741PX.m87873bg("MaterialMeta", th.getMessage());
            return false;
        }
    }

    /* renamed from: IL */
    public static double m84118IL(String str) {
        return m84008iR(m84060bX(str));
    }

    public static int eqN(String str) {
        return m84027bg(m84060bX(str));
    }

    /* renamed from: bg */
    public void m84052bg(long j) {
        this.f19949iR = j;
    }

    /* renamed from: bg */
    public static boolean m84032bg(AbstractC8967tuV abstractC8967tuV, boolean z, boolean z2, boolean z3, boolean z4) {
        if (m84033bg(abstractC8967tuV) || z4 || abstractC8967tuV == null || abstractC8967tuV.Dxa() == null || TextUtils.isEmpty(abstractC8967tuV.Dxa().m91745PX())) {
            return false;
        }
        return m84061bX(abstractC8967tuV) ? z3 : (abstractC8967tuV.Dxa() == null || abstractC8967tuV.Dxa().m91737bg() != 1) ? z : z2;
    }

    /* renamed from: IL */
    public static String m84123IL(Context context, AbstractC8967tuV abstractC8967tuV) {
        if (context != null && abstractC8967tuV != null) {
            try {
                if (abstractC8967tuV.mo84003jz() == 8 || abstractC8967tuV.mo84020eo().m83874bg()) {
                    String m84517bg = C8874bg.m84517bg(context);
                    if (TextUtils.isEmpty(m84517bg)) {
                        return null;
                    }
                    return m84517bg;
                }
            } catch (Throwable th) {
                C7741PX.m87873bg("MaterialMeta", th.getMessage());
            }
        }
        return null;
    }

    /* renamed from: bX */
    public static AbstractC8967tuV m84066bX() {
        return new kMt();
    }

    /* renamed from: bg */
    public static boolean m84033bg(AbstractC8967tuV abstractC8967tuV) {
        return (abstractC8967tuV == null || abstractC8967tuV.Dxa() == null || abstractC8967tuV.Dxa().eqN() != 1) ? false : true;
    }

    /* renamed from: bg */
    public static C8726IL m84029bg(String str, AbstractC8967tuV abstractC8967tuV) {
        abstractC8967tuV.ayS(0);
        int mo84135Fx = abstractC8967tuV.mo84135Fx();
        int i = 3;
        if (mo84135Fx == 3) {
            i = 4;
        } else if (mo84135Fx == 7) {
            i = 1;
        } else if (mo84135Fx == 8) {
            i = 2;
        }
        return new C8726IL(str, abstractC8967tuV.mo83984wq(), abstractC8967tuV.mo84131GR(), abstractC8967tuV.mo83992uV(), abstractC8967tuV.qSG(), i);
    }

    /* renamed from: bg */
    public static long m84030bg(String str) {
        return ldr(m84060bX(str));
    }

    /* renamed from: bg */
    public static int m84027bg(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optInt("ut", 0);
        }
        return 0;
    }

    /* renamed from: bg */
    public static String m84051bg(Context context, AbstractC8967tuV abstractC8967tuV) {
        if (context == null || abstractC8967tuV == null || !((abstractC8967tuV.mo84135Fx() == 8 || abstractC8967tuV.mo84135Fx() == 7) && abstractC8967tuV.ayS())) {
            return null;
        }
        String m84123IL = m84123IL(context, abstractC8967tuV);
        if (TextUtils.isEmpty(m84123IL) || C8874bg.m84519bg() != 1) {
            return null;
        }
        return m84123IL;
    }
}
