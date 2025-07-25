package com.bytedance.adsdk.ugeno.p205IL;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.C7085eqN;
import com.bytedance.adsdk.ugeno.InterfaceC7032bX;
import com.bytedance.adsdk.ugeno.InterfaceC7036bg;
import com.bytedance.adsdk.ugeno.core.C7063Kg;
import com.bytedance.adsdk.ugeno.core.C7072bg;
import com.bytedance.adsdk.ugeno.core.C7077eo;
import com.bytedance.adsdk.ugeno.core.C7079iR;
import com.bytedance.adsdk.ugeno.core.C7083zx;
import com.bytedance.adsdk.ugeno.core.EnumC7069VB;
import com.bytedance.adsdk.ugeno.core.IAnimation;
import com.bytedance.adsdk.ugeno.core.InterfaceC7064Lq;
import com.bytedance.adsdk.ugeno.core.InterfaceC7065PX;
import com.bytedance.adsdk.ugeno.core.InterfaceC7068Ta;
import com.bytedance.adsdk.ugeno.core.InterfaceC7081ldr;
import com.bytedance.adsdk.ugeno.core.p217IL.C7057IL;
import com.bytedance.adsdk.ugeno.core.p217IL.C7060bg;
import com.bytedance.adsdk.ugeno.core.p217IL.C7061eqN;
import com.bytedance.adsdk.ugeno.core.p217IL.C7062zx;
import com.bytedance.adsdk.ugeno.core.p217IL.InterfaceC7058bX;
import com.bytedance.adsdk.ugeno.core.p218bg.C7074bg;
import com.bytedance.adsdk.ugeno.eqN.C7112zx;
import com.bytedance.adsdk.ugeno.eqN.p221bg.C7107bg;
import com.bytedance.adsdk.ugeno.p205IL.C6988bg;
import com.bytedance.adsdk.ugeno.p213bX.C7033IL;
import com.bytedance.adsdk.ugeno.p214bg.C7045bX;
import com.bytedance.adsdk.ugeno.p214bg.C7046bg;
import com.bytedance.adsdk.ugeno.p214bg.InterfaceC7055zx;
import com.bytedance.adsdk.ugeno.p222iR.C7113IL;
import com.bytedance.adsdk.ugeno.p222iR.C7114Kg;
import com.bytedance.adsdk.ugeno.p222iR.C7117bX;
import com.bytedance.adsdk.ugeno.p222iR.C7118bg;
import com.bytedance.adsdk.ugeno.p222iR.C7120eqN;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ironsource.C20517nb;
import com.ironsource.C21114v8;
import com.maticoo.sdk.utils.constant.KeyConstants;
import io.appmetrica.analytics.impl.C33933H2;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.adsdk.ugeno.IL.bX */
/* loaded from: classes3.dex */
public abstract class AbstractView$OnTouchListenerC6981bX<T extends View> implements View.OnTouchListener, InterfaceC7032bX, InterfaceC7065PX.InterfaceC7066IL, InterfaceC7065PX.InterfaceC7067bg {
    protected boolean ApA;
    protected float CQc;
    private boolean DCn;
    protected float DDQ;

    /* renamed from: Dt */
    protected float f14883Dt;
    protected float Dxa;
    private boolean FFy;

    /* renamed from: Fx */
    private C7112zx f14884Fx;

    /* renamed from: Fy */
    protected float f14885Fy;

    /* renamed from: GR */
    private boolean f14886GR;

    /* renamed from: GZ */
    protected int f14887GZ;
    private boolean Gih;
    protected boolean GvG;
    private boolean HXG;
    private boolean IEI;

    /* renamed from: IL */
    private boolean f14888IL;
    protected float JAA;
    private C7107bg JMw;

    /* renamed from: Ja */
    protected float f14889Ja;
    private JSONObject JaB;
    private boolean JlG;
    @Deprecated
    private InterfaceC7058bX.InterfaceC7059bg JxS;
    private C7079iR KRc;

    /* renamed from: Kg */
    protected C6988bg<ViewGroup> f14890Kg;
    protected ImageView.ScaleType LKE;

    /* renamed from: LZ */
    protected boolean f14891LZ;

    /* renamed from: Ld */
    protected boolean f14892Ld;

    /* renamed from: Lq */
    protected float f14893Lq;

    /* renamed from: Ny */
    protected float f14894Ny;

    /* renamed from: PX */
    protected String f14895PX;
    protected float Pae;
    protected float RFq;

    /* renamed from: RJ */
    protected float f14896RJ;
    protected float RiO;

    /* renamed from: Ta */
    protected String f14897Ta;

    /* renamed from: Uq */
    protected float f14898Uq;

    /* renamed from: Uw */
    protected float f14899Uw;

    /* renamed from: VB */
    protected boolean f14900VB;
    private float VHL;

    /* renamed from: VJ */
    protected boolean f14901VJ;

    /* renamed from: VW */
    protected boolean f14902VW;
    protected float VzQ;

    /* renamed from: WR */
    protected C7083zx.C7084bg f14903WR;

    /* renamed from: Ys */
    protected float f14904Ys;
    protected String ZQc;
    private boolean ZTq;
    protected C7118bg.C7119bg ZyO;
    protected boolean aGH;
    protected int ayS;
    protected float bCU;

    /* renamed from: bN */
    protected float f14905bN;
    protected float bOf;

    /* renamed from: bX */
    protected Context f14906bX;

    /* renamed from: bg */
    private boolean f14907bg;

    /* renamed from: bu */
    private boolean f14908bu;
    protected C7046bg cZH;

    /* renamed from: dS */
    protected float f14909dS;
    protected boolean daV;
    protected float eDa;

    /* renamed from: eK */
    private String f14910eK;

    /* renamed from: eo */
    protected C7063Kg f14911eo;
    protected JSONObject eqN;
    @Deprecated
    private C7060bg ews;
    private boolean gCm;

    /* renamed from: gJ */
    private boolean f14912gJ;
    protected int gXn;
    private boolean gtr;
    protected InterfaceC7065PX hff;

    /* renamed from: hi */
    private GradientDrawable f14913hi;
    protected boolean huT;

    /* renamed from: iR */
    protected C6988bg<ViewGroup> f14914iR;

    /* renamed from: jA */
    protected InterfaceC7081ldr f14915jA;

    /* renamed from: jf */
    protected Map<Integer, C7077eo> f14916jf;

    /* renamed from: jz */
    protected float f14917jz;
    protected boolean kMt;

    /* renamed from: kU */
    protected float f14918kU;

    /* renamed from: lM */
    protected float f14919lM;
    protected T ldr;
    private InterfaceC7064Lq mLT;
    private boolean mZk;
    @Deprecated
    private C7062zx ovC;

    /* renamed from: qC */
    protected boolean f14920qC;
    private boolean qSG;

    /* renamed from: qp */
    protected float f14921qp;
    private C7072bg rgo;

    /* renamed from: rr */
    private boolean f14922rr;
    protected boolean rri;
    protected boolean sVc;

    /* renamed from: tC */
    protected boolean f14923tC;
    protected float tuV;
    protected boolean txA;

    /* renamed from: uV */
    private boolean f14924uV;
    @Deprecated
    private C7061eqN uny;

    /* renamed from: uu */
    protected boolean f14925uu;

    /* renamed from: vb */
    protected float f14926vb;

    /* renamed from: wS */
    protected ViewGroup.LayoutParams f14927wS;

    /* renamed from: wq */
    private boolean f14928wq;
    protected InterfaceC7068Ta xFs;
    protected float xxp;
    protected float yDt;
    private String yda;
    protected float zCS;
    @Deprecated

    /* renamed from: zU */
    private C7057IL f14929zU;

    /* renamed from: zx */
    protected JSONObject f14930zx;

    public AbstractView$OnTouchListenerC6981bX(Context context) {
        this(context, null);
    }

    private void Pae() {
        C7077eo c7077eo;
        if (this.hff == null || !m90387IL(18) || (c7077eo = this.f14916jf.get(18)) == null) {
            return;
        }
        JSONObject m90099bX = c7077eo.m90099bX();
        if (m90099bX != null) {
            try {
                m90099bX.put("rotateZ", C7033IL.m90221bg(m90099bX.optString("rotateZ"), this.f14930zx));
            } catch (JSONException unused) {
            }
        }
        this.hff.mo84830bg(c7077eo, this, this);
    }

    /* renamed from: RJ */
    private void m90378RJ() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f14895PX);
        this.ldr.setContentDescription(sb2);
    }

    private void txA() {
        float f;
        float f2;
        float f3;
        float f4;
        if (this.txA) {
            f = this.f14905bN;
        } else {
            f = this.Dxa;
        }
        if (this.sVc) {
            f2 = this.Pae;
        } else {
            f2 = this.Dxa;
        }
        if (this.ApA) {
            f3 = this.f14917jz;
        } else {
            f3 = this.Dxa;
        }
        if (this.GvG) {
            f4 = this.f14896RJ;
        } else {
            f4 = this.Dxa;
        }
        this.f14913hi.setCornerRadii(new float[]{f, f, f2, f2, f4, f4, f3, f3});
    }

    public boolean DDQ() {
        return this.f14900VB;
    }

    public float Dxa() {
        T t = this.ldr;
        if (t instanceof InterfaceC7055zx) {
            return ((InterfaceC7055zx) t).getShine();
        }
        return 0.0f;
    }

    /* renamed from: Fy */
    public float m90388Fy() {
        return this.Dxa;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: IL */
    public void mo84928IL() {
        rri();
        mo89941VB();
        m90369bX(this.f14887GZ);
        m90366bg();
        m90370bX();
        C7112zx c7112zx = this.f14884Fx;
        if (c7112zx != null) {
            c7112zx.m90021bg();
            this.f14884Fx.m90023IL();
            this.f14884Fx.m90022bX();
        }
        this.ldr.setOnTouchListener(this);
        m90378RJ();
        ViewGroup viewGroup = (ViewGroup) this.ldr.getParent();
        if (viewGroup != null) {
            viewGroup.setClipChildren(!this.f14908bu);
        }
        C7046bg c7046bg = this.cZH;
        if (c7046bg != null) {
            c7046bg.m90193bX();
        }
    }

    public ViewGroup.LayoutParams JAA() {
        return this.f14927wS;
    }

    /* renamed from: Ja */
    public void m90383Ja() {
        if (this.ldr != null) {
            m90364bg(this.f14927wS);
            m90346zx((int) this.yDt);
            ldr((int) this.f14893Lq);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.InterfaceC7032bX
    /* renamed from: Kg */
    public void mo90228Kg() {
        C7079iR c7079iR = this.KRc;
        if (c7079iR != null) {
            c7079iR.m90091IL();
        }
        C7046bg c7046bg = this.cZH;
        if (c7046bg != null) {
            c7046bg.m90194IL();
        }
    }

    public C7107bg LKE() {
        return this.JMw;
    }

    /* renamed from: LZ */
    public InterfaceC7065PX m90381LZ() {
        return this.hff;
    }

    /* renamed from: Lq */
    public float m90380Lq() {
        return this.f14894Ny;
    }

    /* renamed from: PX */
    public float m90379PX() {
        return this.f14904Ys;
    }

    /* renamed from: Ta */
    public float m90377Ta() {
        return this.f14909dS;
    }

    /* renamed from: Uq */
    public C6988bg m90376Uq() {
        return this.f14914iR;
    }

    /* renamed from: Uw */
    public C7083zx.C7084bg m90375Uw() {
        return this.f14903WR;
    }

    /* renamed from: VB */
    protected void mo89941VB() {
        float f;
        float f2;
        float f3;
        float f4;
        if (this.aGH) {
            f = this.f14889Ja;
        } else {
            f = this.JAA;
        }
        if (this.f14902VW) {
            f2 = this.f14899Uw;
        } else {
            f2 = this.JAA;
        }
        if (this.f14901VJ) {
            f3 = this.DDQ;
        } else {
            f3 = this.JAA;
        }
        if (this.daV) {
            f4 = this.f14898Uq;
        } else {
            f4 = this.JAA;
        }
        this.ldr.setPadding((int) f, (int) f3, (int) f2, (int) f4);
    }

    /* renamed from: VJ */
    public int m90374VJ() {
        return (int) this.yDt;
    }

    /* renamed from: VW */
    public String m90373VW() {
        return this.f14897Ta;
    }

    public float VzQ() {
        return this.eDa;
    }

    /* renamed from: WR */
    public T m90372WR() {
        return this.ldr;
    }

    public int ZQc() {
        return this.ayS;
    }

    public String aGH() {
        return this.f14895PX;
    }

    public boolean ayS() {
        return this.f14892Ld;
    }

    /* renamed from: bN */
    public float m90371bN() {
        T t = this.ldr;
        if (t instanceof InterfaceC7055zx) {
            return ((InterfaceC7055zx) t).getStretch();
        }
        return 0.0f;
    }

    /* renamed from: bg */
    public void mo90354bg(JSONObject jSONObject) {
        this.f14930zx = jSONObject;
        JSONObject jSONObject2 = this.eqN;
        if (jSONObject2 == null) {
            return;
        }
        Iterator<String> keys = jSONObject2.keys();
        C6988bg<ViewGroup> c6988bg = this.f14914iR;
        C6988bg.C6989bg mo89795bX = c6988bg instanceof C6988bg ? c6988bg.mo89795bX() : null;
        while (keys.hasNext()) {
            String next = keys.next();
            String m90221bg = C7033IL.m90221bg(this.eqN.optString(next), jSONObject);
            mo84929bg(next, m90221bg);
            if (mo89795bX != null) {
                mo89795bX.mo89788bg(this.f14906bX, next, m90221bg);
            }
        }
        if (mo89795bX != null) {
            m90364bg(mo89795bX.mo89789bg());
        }
        if (this.JaB == null || this.f14930zx == null) {
            return;
        }
        try {
            if (DDQ()) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("i18n", this.JaB);
                this.f14930zx.put("xNode", jSONObject3);
                return;
            }
            this.f14930zx.put("i18n", this.JaB);
        } catch (JSONException unused) {
        }
    }

    public int daV() {
        return (int) this.f14893Lq;
    }

    /* renamed from: eo */
    public JSONObject m90352eo() {
        return this.f14930zx;
    }

    public T eqN() {
        return null;
    }

    @Override // com.bytedance.adsdk.ugeno.InterfaceC7032bX
    /* renamed from: iR */
    public void mo90223iR() {
        C7072bg c7072bg = this.rgo;
        if (c7072bg != null) {
            C7079iR c7079iR = new C7079iR(this.ldr, c7072bg);
            this.KRc = c7079iR;
            c7079iR.m90090bg();
        }
        C7046bg c7046bg = this.cZH;
        if (c7046bg != null) {
            c7046bg.m90192bg();
        }
        C7112zx c7112zx = this.f14884Fx;
        if (c7112zx != null) {
            c7112zx.eqN();
        }
        if (this.ews != null && m90387IL(10)) {
            this.ews.m90170bg();
        }
        if (this.ovC == null || !m90387IL(9)) {
            return;
        }
        this.ovC.m90165bg();
    }

    /* renamed from: jz */
    public float m90350jz() {
        T t = this.ldr;
        if (t instanceof InterfaceC7055zx) {
            return ((InterfaceC7055zx) t).getRubIn();
        }
        return 0.0f;
    }

    protected void kMt() {
        C7085eqN.m90061bg().m90063IL().mo84883bg(this.f14911eo, this.ZQc, new InterfaceC7036bg.InterfaceC7037bg() { // from class: com.bytedance.adsdk.ugeno.IL.bX.4
            {
                AbstractView$OnTouchListenerC6981bX.this = this;
            }

            @Override // com.bytedance.adsdk.ugeno.InterfaceC7036bg.InterfaceC7037bg
            /* renamed from: bg */
            public void mo89932bg(final Bitmap bitmap) {
                if (bitmap != null) {
                    AbstractView$OnTouchListenerC6981bX abstractView$OnTouchListenerC6981bX = AbstractView$OnTouchListenerC6981bX.this;
                    if (abstractView$OnTouchListenerC6981bX.f14925uu) {
                        final Bitmap m90007bg = C7114Kg.m90007bg(abstractView$OnTouchListenerC6981bX.f14906bX, bitmap, (int) abstractView$OnTouchListenerC6981bX.CQc);
                        if (m90007bg != null) {
                            C7114Kg.m90005bg(new Runnable() { // from class: com.bytedance.adsdk.ugeno.IL.bX.4.1
                                {
                                    C69854.this = this;
                                }

                                @Override // java.lang.Runnable
                                public void run() {
                                    AbstractView$OnTouchListenerC6981bX.this.mo89939bg(new BitmapDrawable(m90007bg));
                                }
                            });
                            return;
                        }
                        return;
                    }
                    C7114Kg.m90005bg(new Runnable() { // from class: com.bytedance.adsdk.ugeno.IL.bX.4.2
                        {
                            C69854.this = this;
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            AbstractView$OnTouchListenerC6981bX.this.mo89939bg(new BitmapDrawable(bitmap));
                        }
                    });
                }
            }
        });
    }

    public void ldr(String str) {
        this.f14897Ta = str;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        C7061eqN c7061eqN;
        InterfaceC7065PX interfaceC7065PX;
        C7057IL c7057il;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 || action == 3) {
                mo90279uu();
            }
        } else {
            CQc();
        }
        InterfaceC7068Ta interfaceC7068Ta = this.xFs;
        if (interfaceC7068Ta != null) {
            interfaceC7068Ta.mo84832bg(this, motionEvent);
        }
        if (m90387IL(17) && motionEvent.getAction() == 0) {
            this.hff.mo84830bg(this.f14916jf.get(17), this, this);
        }
        if (m90387IL(1) && this.JlG && (interfaceC7065PX = this.hff) != null && (c7057il = this.f14929zU) != null) {
            return c7057il.m90172bg(interfaceC7065PX, this, motionEvent);
        }
        InterfaceC7065PX interfaceC7065PX2 = this.hff;
        if (interfaceC7065PX2 != null && (c7061eqN = this.uny) != null) {
            return c7061eqN.m90166bg(interfaceC7065PX2, this, motionEvent);
        }
        C7112zx c7112zx = this.f14884Fx;
        if (c7112zx != null) {
            return c7112zx.m90020bg(motionEvent);
        }
        return false;
    }

    /* renamed from: qC */
    public float m90349qC() {
        T t = this.ldr;
        if (t instanceof InterfaceC7055zx) {
            return ((InterfaceC7055zx) t).getRipple();
        }
        return 0.0f;
    }

    protected void rri() {
        Bitmap.Config config;
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        if (TextUtils.isEmpty(this.ZQc)) {
            if (this.huT) {
                m90355bg(this.ZyO);
                return;
            }
            this.f14913hi.setColor(this.ayS);
            eqN(this.ayS);
        } else if (this.ZQc.startsWith("local://")) {
            String replace = this.ZQc.replace("local://", "");
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                if (this.f14925uu) {
                    config = Bitmap.Config.ARGB_4444;
                } else {
                    config = Bitmap.Config.RGB_565;
                }
                options.inPreferredConfig = config;
                options.inPurgeable = true;
                options.inInputShareable = true;
                Bitmap decodeStream = BitmapFactory.decodeStream(this.f14906bX.getResources().openRawResource(C7120eqN.m89991bg(this.f14906bX, replace)), null, options);
                if (this.f14925uu) {
                    Bitmap m90007bg = C7114Kg.m90007bg(this.f14906bX, decodeStream, (int) this.CQc);
                    if (m90007bg != null) {
                        bitmapDrawable2 = new BitmapDrawable(this.f14906bX.getResources(), m90007bg);
                        mo89939bg(bitmapDrawable2);
                    }
                    bitmapDrawable = new BitmapDrawable(this.f14906bX.getResources(), decodeStream);
                } else {
                    bitmapDrawable = new BitmapDrawable(this.f14906bX.getResources(), decodeStream);
                }
                bitmapDrawable2 = bitmapDrawable;
                mo89939bg(bitmapDrawable2);
            } catch (Throwable unused) {
            }
        } else {
            kMt();
        }
    }

    /* renamed from: tC */
    public JSONObject m90348tC() {
        return this.eqN;
    }

    public float tuV() {
        return this.RFq;
    }

    /* renamed from: vb */
    public float m90347vb() {
        return this.f14918kU;
    }

    public float xxp() {
        return this.f14921qp;
    }

    public float yDt() {
        return this.f14883Dt;
    }

    /* renamed from: zx */
    public void m90345zx(String str) {
        this.f14895PX = str;
    }

    public AbstractView$OnTouchListenerC6981bX(Context context, C6988bg<ViewGroup> c6988bg) {
        this.yDt = -2.0f;
        this.f14893Lq = -2.0f;
        this.f14887GZ = 0;
        this.f14892Ld = true;
        this.zCS = 0.0f;
        this.f14904Ys = 0.0f;
        this.f14909dS = 0.0f;
        this.RiO = 1.0f;
        this.f14883Dt = 1.0f;
        this.f14894Ny = 1.0f;
        this.bOf = 0.0f;
        this.f14918kU = 0.0f;
        this.f14921qp = 0.0f;
        this.eDa = 0.0f;
        this.RFq = 1.0f;
        this.f14908bu = true;
        this.Gih = true;
        this.f14912gJ = false;
        this.DCn = false;
        this.VHL = 12.0f;
        this.f14906bX = context;
        this.f14914iR = c6988bg;
        this.f14916jf = new HashMap();
        this.f14913hi = new GradientDrawable();
        this.ldr = eqN();
    }

    @Deprecated
    /* renamed from: bX */
    private void m90370bX() {
        InterfaceC7058bX eqN;
        this.ldr.setVisibility(this.f14887GZ);
        float f = this.eDa;
        if (f != 0.0f) {
            this.ldr.setRotation(f);
        }
        C7083zx.C7084bg c7084bg = this.f14903WR;
        if (c7084bg != null && TextUtils.isEmpty(c7084bg.m90075IL())) {
            this.ldr.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.adsdk.ugeno.IL.bX.1
                {
                    AbstractView$OnTouchListenerC6981bX.this = this;
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    AbstractView$OnTouchListenerC6981bX abstractView$OnTouchListenerC6981bX = AbstractView$OnTouchListenerC6981bX.this;
                    if (abstractView$OnTouchListenerC6981bX.f14915jA != null) {
                        boolean unused = abstractView$OnTouchListenerC6981bX.Gih;
                    }
                }
            });
        } else if (m90387IL(1) && !this.JlG) {
            this.ldr.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.adsdk.ugeno.IL.bX.2
                {
                    AbstractView$OnTouchListenerC6981bX.this = this;
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    AbstractView$OnTouchListenerC6981bX abstractView$OnTouchListenerC6981bX = AbstractView$OnTouchListenerC6981bX.this;
                    if (abstractView$OnTouchListenerC6981bX.hff != null && abstractView$OnTouchListenerC6981bX.Gih) {
                        AbstractView$OnTouchListenerC6981bX abstractView$OnTouchListenerC6981bX2 = AbstractView$OnTouchListenerC6981bX.this;
                        AbstractView$OnTouchListenerC6981bX abstractView$OnTouchListenerC6981bX3 = AbstractView$OnTouchListenerC6981bX.this;
                        abstractView$OnTouchListenerC6981bX2.hff.mo84830bg(abstractView$OnTouchListenerC6981bX2.f14916jf.get(1), abstractView$OnTouchListenerC6981bX3, abstractView$OnTouchListenerC6981bX3);
                    }
                }
            });
        }
        if (this.hff != null && m90387IL(4)) {
            if (m90387IL(1)) {
                this.mZk = true;
                this.uny = new C7061eqN(this.f14906bX, this.f14916jf.get(4), this.f14916jf.get(1), this.mZk);
            } else {
                this.uny = new C7061eqN(this.f14906bX, this.f14916jf.get(4), this.mZk);
            }
        }
        if (this.hff != null && m90387IL(1) && this.JlG) {
            this.f14929zU = new C7057IL(this.f14906bX, this.f14916jf.get(1));
        }
        Pae();
        if (this.hff != null && m90387IL(3) && (eqN = C7085eqN.m90061bg().eqN()) != null) {
            this.JxS = eqN.m90171bg(this.f14906bX);
            new Object() { // from class: com.bytedance.adsdk.ugeno.IL.bX.3
                {
                    AbstractView$OnTouchListenerC6981bX.this = this;
                }
            };
        }
        if (this.hff != null && m90387IL(9)) {
            C7062zx c7062zx = new C7062zx(this.f14906bX, this.f14916jf.get(9), this);
            this.ovC = c7062zx;
            c7062zx.m90164bg(this.hff);
        }
        if (m90387IL(10)) {
            C7060bg c7060bg = new C7060bg(this.f14906bX, this.f14916jf.get(10), this);
            this.ews = c7060bg;
            c7060bg.m90169bg(this.hff);
        }
    }

    public void eqN(int i) {
        this.f14913hi.setShape(0);
        this.f14913hi.setColor(i);
        txA();
        this.f14913hi.setStroke((int) this.f14919lM, this.gXn);
        this.ldr.setBackground(this.f14913hi);
    }

    @Override // com.bytedance.adsdk.ugeno.InterfaceC7032bX
    public void ldr() {
        if (this.mLT == null || this.f14928wq) {
            return;
        }
        this.f14928wq = true;
    }

    @Override // com.bytedance.adsdk.ugeno.InterfaceC7032bX
    /* renamed from: zx */
    public void mo90222zx() {
        if (this.mLT == null || this.f14924uV) {
            return;
        }
        this.f14924uV = true;
    }

    /* renamed from: Kg */
    private boolean m90382Kg(String str) {
        return TextUtils.isEmpty(str) || !TextUtils.equals(str, "hidden");
    }

    public void ldr(int i) {
        if (DDQ()) {
            T t = this.ldr;
            if (t instanceof InterfaceC6979IL) {
                ((InterfaceC6979IL) t).mo89929IL(i);
                return;
            }
            ViewGroup viewGroup = (ViewGroup) t.getParent();
            if (viewGroup instanceof InterfaceC6979IL) {
                ((InterfaceC6979IL) viewGroup).mo89928IL(this.ldr, i);
                return;
            }
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.ldr.getLayoutParams();
        layoutParams.height = i;
        this.ldr.setLayoutParams(layoutParams);
    }

    /* renamed from: zx */
    public void m90346zx(int i) {
        if (DDQ()) {
            T t = this.ldr;
            if (t instanceof InterfaceC6979IL) {
                ((InterfaceC6979IL) t).mo89925bg(i);
                return;
            }
            ViewGroup viewGroup = (ViewGroup) t.getParent();
            if (viewGroup instanceof InterfaceC6979IL) {
                ((InterfaceC6979IL) viewGroup).mo89922bg(this.ldr, i);
                return;
            }
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.ldr.getLayoutParams();
        layoutParams.width = i;
        this.ldr.setLayoutParams(layoutParams);
    }

    public AbstractView$OnTouchListenerC6981bX<T> eqN(String str) {
        return mo90344IL(str);
    }

    /* renamed from: iR */
    private ImageView.ScaleType m90351iR(String str) {
        str.hashCode();
        if (str.equals(KeyConstants.RequestBody.KEY_FIT)) {
            this.LKE = ImageView.ScaleType.FIT_CENTER;
        } else if (!str.equals("crop")) {
            this.LKE = ImageView.ScaleType.FIT_XY;
        } else {
            this.LKE = ImageView.ScaleType.CENTER_CROP;
        }
        return this.LKE;
    }

    /* renamed from: IL */
    public boolean m90387IL(int i) {
        Map<Integer, C7077eo> map = this.f14916jf;
        return map != null && map.containsKey(Integer.valueOf(i));
    }

    /* renamed from: IL */
    public void m90384IL(JSONObject jSONObject) {
        this.eqN = jSONObject;
    }

    /* renamed from: bg */
    private void m90366bg() {
        if (this.f14907bg) {
            this.ldr.setTranslationX(this.f14904Ys);
        }
        if (this.f14888IL) {
            this.ldr.setTranslationY(this.f14909dS);
        }
        if (this.ZTq) {
            this.ldr.setScaleX(this.f14883Dt);
        }
        if (this.gCm) {
            this.ldr.setScaleY(this.f14894Ny);
        }
        if (this.FFy) {
            this.ldr.setRotation(this.bOf);
        }
        if (this.f14922rr) {
            this.ldr.setRotationX(this.bOf);
        }
        if (this.gtr) {
            this.ldr.setRotationY(this.f14921qp);
        }
        if (this.IEI) {
            this.ldr.setAlpha(this.RFq);
        }
        float f = this.eDa;
        if (f != 0.0f) {
            this.ldr.setRotation(f);
        }
    }

    /* renamed from: IL */
    protected AbstractView$OnTouchListenerC6981bX<T> mo90344IL(String str) {
        if (TextUtils.isEmpty(this.f14897Ta) || !TextUtils.equals(this.f14897Ta, str)) {
            return null;
        }
        return this;
    }

    public void CQc() {
    }

    /* renamed from: IL */
    public void m90385IL(String str, String str2) {
        if (!TextUtils.isEmpty(str2) && this.f14916jf != null) {
            try {
                int m90156bg = EnumC7069VB.m90155bg(str).m90156bg();
                C7077eo c7077eo = new C7077eo();
                c7077eo.m90097bg(m90156bg);
                c7077eo.m90096bg(this);
                JSONObject jSONObject = new JSONObject(str2);
                if (m90156bg == 3) {
                    try {
                        this.VHL = Float.parseFloat(C7033IL.m90221bg(jSONObject.optString("shakeAmplitude"), this.f14930zx));
                    } catch (NumberFormatException unused) {
                        this.VHL = 12.0f;
                    }
                }
                InterfaceC7065PX interfaceC7065PX = this.hff;
                if (!(interfaceC7065PX instanceof C7074bg)) {
                    m90365bg(m90156bg, jSONObject, c7077eo);
                } else if (!((C7074bg) interfaceC7065PX).m90115bg()) {
                    m90365bg(m90156bg, jSONObject, c7077eo);
                } else {
                    c7077eo.m90094bg(jSONObject);
                    this.f14916jf.put(Integer.valueOf(m90156bg), c7077eo);
                }
            } catch (JSONException unused2) {
            }
        }
    }

    /* renamed from: uu */
    public void mo90279uu() {
    }

    /* renamed from: bX */
    public void m90369bX(int i) {
        ViewGroup viewGroup = (ViewGroup) this.ldr.getParent();
        if (viewGroup instanceof InterfaceC6979IL) {
            ((InterfaceC6979IL) viewGroup).mo89926bX(this.ldr, i);
        } else {
            this.ldr.setVisibility(i);
        }
    }

    /* renamed from: bX */
    public AbstractView$OnTouchListenerC6981bX<T> m90367bX(String str) {
        return mo90342bg(str);
    }

    @Override // com.bytedance.adsdk.ugeno.InterfaceC7032bX
    /* renamed from: IL */
    public void mo90229IL(int i, int i2, int i3, int i4) {
        C7079iR c7079iR = this.KRc;
        if (c7079iR != null) {
            c7079iR.m90089bg(i, i2);
        }
        C7046bg c7046bg = this.cZH;
        if (c7046bg != null) {
            c7046bg.m90191bg(i, i2);
        }
    }

    /* renamed from: bg */
    public void m90361bg(InterfaceC7064Lq interfaceC7064Lq) {
        this.mLT = interfaceC7064Lq;
    }

    /* renamed from: bg */
    public void m90359bg(InterfaceC7068Ta interfaceC7068Ta) {
        this.xFs = interfaceC7068Ta;
    }

    /* renamed from: bg */
    public void m90360bg(InterfaceC7065PX interfaceC7065PX) {
        this.hff = interfaceC7065PX;
    }

    /* renamed from: IL */
    public AbstractView$OnTouchListenerC6981bX m90386IL(AbstractView$OnTouchListenerC6981bX abstractView$OnTouchListenerC6981bX) {
        return (abstractView$OnTouchListenerC6981bX.m90376Uq() == null && (abstractView$OnTouchListenerC6981bX instanceof C6988bg)) ? abstractView$OnTouchListenerC6981bX : m90386IL(abstractView$OnTouchListenerC6981bX.m90376Uq());
    }

    /* renamed from: bg */
    public void m90355bg(C7118bg.C7119bg c7119bg) {
        if (c7119bg == null) {
            return;
        }
        this.f14913hi.setShape(0);
        this.f14913hi.setOrientation(c7119bg.f15289bg);
        if (Build.VERSION.SDK_INT >= 29) {
            this.f14913hi.setColors(c7119bg.f15287IL, c7119bg.f15288bX);
        } else {
            this.f14913hi.setColors(c7119bg.f15287IL);
        }
        txA();
        this.f14913hi.setStroke((int) this.f14919lM, this.gXn);
        this.ldr.setBackground(this.f14913hi);
    }

    /* renamed from: bg */
    protected void mo89939bg(Drawable drawable) {
        this.ldr.setBackground(drawable);
    }

    /* renamed from: bg */
    public void m90364bg(ViewGroup.LayoutParams layoutParams) {
        T t = this.ldr;
        if (t != null) {
            t.setLayoutParams(layoutParams);
        }
        this.f14927wS = layoutParams;
    }

    /* renamed from: bg */
    public void m90357bg(C7083zx.C7084bg c7084bg) {
        this.f14903WR = c7084bg;
    }

    /* renamed from: bg */
    protected AbstractView$OnTouchListenerC6981bX<T> mo90342bg(String str) {
        if (TextUtils.isEmpty(this.f14895PX) || !TextUtils.equals(this.f14895PX, str)) {
            return null;
        }
        return this;
    }

    /* renamed from: bg */
    public void m90353bg(boolean z) {
        this.f14900VB = z;
    }

    /* renamed from: bg */
    public void m90363bg(C6988bg c6988bg) {
        this.f14914iR = c6988bg;
    }

    /* renamed from: bg */
    public void m90362bg(C7063Kg c7063Kg) {
        this.f14911eo = c7063Kg;
    }

    /* renamed from: bg */
    public void m90358bg(InterfaceC7081ldr interfaceC7081ldr) {
        this.f14915jA = interfaceC7081ldr;
    }

    /* renamed from: bg */
    public void mo84929bg(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1964681502:
                if (str.equals("clickable")) {
                    c = 0;
                    break;
                }
                break;
            case -1721943862:
                if (str.equals("translateX")) {
                    c = 1;
                    break;
                }
                break;
            case -1721943861:
                if (str.equals("translateY")) {
                    c = 2;
                    break;
                }
                break;
            case -1501175880:
                if (str.equals("paddingLeft")) {
                    c = 3;
                    break;
                }
                break;
            case -1351184668:
                if (str.equals("onDelay")) {
                    c = 4;
                    break;
                }
                break;
            case -1337252761:
                if (str.equals("onShake")) {
                    c = 5;
                    break;
                }
                break;
            case -1337126126:
                if (str.equals("onSlide")) {
                    c = 6;
                    break;
                }
                break;
            case -1336288090:
                if (str.equals("onTimer")) {
                    c = 7;
                    break;
                }
                break;
            case -1335874424:
                if (str.equals("onTwist")) {
                    c = '\b';
                    break;
                }
                break;
            case -1332194002:
                if (str.equals(C33933H2.f92945g)) {
                    c = '\t';
                    break;
                }
                break;
            case -1291329255:
                if (str.equals("events")) {
                    c = '\n';
                    break;
                }
                break;
            case -1267206133:
                if (str.equals("opacity")) {
                    c = 11;
                    break;
                }
                break;
            case -1228066334:
                if (str.equals("borderTopLeftRadius")) {
                    c = '\f';
                    break;
                }
                break;
            case -1221029593:
                if (str.equals("height")) {
                    c = '\r';
                    break;
                }
                break;
            case -1081309778:
                if (str.equals("margin")) {
                    c = 14;
                    break;
                }
                break;
            case -1044792121:
                if (str.equals("marginTop")) {
                    c = 15;
                    break;
                }
                break;
            case -1013407967:
                if (str.equals("onDown")) {
                    c = 16;
                    break;
                }
                break;
            case -933876756:
                if (str.equals("backgroundDrawable")) {
                    c = 17;
                    break;
                }
                break;
            case -925180581:
                if (str.equals("rotate")) {
                    c = 18;
                    break;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c = 19;
                    break;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c = 20;
                    break;
                }
                break;
            case -806339567:
                if (str.equals("padding")) {
                    c = 21;
                    break;
                }
                break;
            case -681357156:
                if (str.equals("triggerFunc")) {
                    c = 22;
                    break;
                }
                break;
            case -289173127:
                if (str.equals("marginBottom")) {
                    c = 23;
                    break;
                }
                break;
            case 3355:
                if (str.equals("id")) {
                    c = 24;
                    break;
                }
                break;
            case 3176990:
                if (str.equals("i18n")) {
                    c = 25;
                    break;
                }
                break;
            case 3373707:
                if (str.equals("name")) {
                    c = 26;
                    break;
                }
                break;
            case 87811796:
                if (str.equals("backgroundImageBlur")) {
                    c = 27;
                    break;
                }
                break;
            case 90130308:
                if (str.equals("paddingTop")) {
                    c = 28;
                    break;
                }
                break;
            case 94750088:
                if (str.equals("click")) {
                    c = 29;
                    break;
                }
                break;
            case 105871684:
                if (str.equals("onTap")) {
                    c = 30;
                    break;
                }
                break;
            case 108285963:
                if (str.equals("ratio")) {
                    c = 31;
                    break;
                }
                break;
            case 109250890:
                if (str.equals("scale")) {
                    c = ' ';
                    break;
                }
                break;
            case 113126854:
                if (str.equals("width")) {
                    c = '!';
                    break;
                }
                break;
            case 202355100:
                if (str.equals("paddingBottom")) {
                    c = '\"';
                    break;
                }
                break;
            case 320386138:
                if (str.equals("onLoadMore")) {
                    c = '#';
                    break;
                }
                break;
            case 333432965:
                if (str.equals("borderTopRightRadius")) {
                    c = '$';
                    break;
                }
                break;
            case 529642498:
                if (str.equals("overflow")) {
                    c = '%';
                    break;
                }
                break;
            case 581268560:
                if (str.equals("borderBottomLeftRadius")) {
                    c = '&';
                    break;
                }
                break;
            case 588239831:
                if (str.equals("borderBottomRightRadius")) {
                    c = '\'';
                    break;
                }
                break;
            case 713848971:
                if (str.equals("paddingRight")) {
                    c = '(';
                    break;
                }
                break;
            case 722830999:
                if (str.equals("borderColor")) {
                    c = ')';
                    break;
                }
                break;
            case 741115130:
                if (str.equals("borderWidth")) {
                    c = '*';
                    break;
                }
                break;
            case 843948038:
                if (str.equals("onExposure")) {
                    c = '+';
                    break;
                }
                break;
            case 975087886:
                if (str.equals("marginRight")) {
                    c = ',';
                    break;
                }
                break;
            case 1052832078:
                if (str.equals("translate")) {
                    c = '-';
                    break;
                }
                break;
            case 1087723621:
                if (str.equals("onAnimation")) {
                    c = '.';
                    break;
                }
                break;
            case 1118509956:
                if (str.equals("animation")) {
                    c = '/';
                    break;
                }
                break;
            case 1151851515:
                if (str.equals("animatorSet")) {
                    c = '0';
                    break;
                }
                break;
            case 1158381436:
                if (str.equals("onPullToRefresh")) {
                    c = '1';
                    break;
                }
                break;
            case 1287124693:
                if (str.equals("backgroundColor")) {
                    c = '2';
                    break;
                }
                break;
            case 1292595405:
                if (str.equals("backgroundImage")) {
                    c = '3';
                    break;
                }
                break;
            case 1301532860:
                if (str.equals("backgroundScale")) {
                    c = '4';
                    break;
                }
                break;
            case 1349188574:
                if (str.equals("borderRadius")) {
                    c = '5';
                    break;
                }
                break;
            case 1384173149:
                if (str.equals("rotateX")) {
                    c = '6';
                    break;
                }
                break;
            case 1384173150:
                if (str.equals("rotateY")) {
                    c = '7';
                    break;
                }
                break;
            case 1384173151:
                if (str.equals("rotateZ")) {
                    c = '8';
                    break;
                }
                break;
            case 1490730380:
                if (str.equals("onScroll")) {
                    c = '9';
                    break;
                }
                break;
            case 1671308008:
                if (str.equals("disable")) {
                    c = ':';
                    break;
                }
                break;
            case 1685004456:
                if (str.equals("onLongTap")) {
                    c = ';';
                    break;
                }
                break;
            case 1941332754:
                if (str.equals(ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY)) {
                    c = '<';
                    break;
                }
                break;
            case 1970934485:
                if (str.equals("marginLeft")) {
                    c = C20517nb.f52173T;
                    break;
                }
                break;
            case 1997542747:
                if (str.equals("availability")) {
                    c = '>';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.Gih = C7117bX.m89999bg(str2, true);
                return;
            case 1:
                this.f14907bg = true;
                this.f14904Ys = C7114Kg.m90009bg(this.f14906bX, C7117bX.m90002bg(str2, 0.0f));
                return;
            case 2:
                this.f14888IL = true;
                this.f14909dS = C7114Kg.m90009bg(this.f14906bX, C7117bX.m90002bg(str2, 0.0f));
                return;
            case 3:
                this.f14889Ja = C7114Kg.m90006bg(this.f14906bX, str2);
                this.aGH = true;
                return;
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case 16:
            case 30:
            case '#':
            case '+':
            case '.':
            case '1':
            case '9':
            case ';':
                m90385IL(str, str2);
                return;
            case '\t':
            case '2':
                if (C7118bg.m89997bX(str2)) {
                    this.huT = true;
                    this.ZyO = C7118bg.m89998IL(str2);
                    return;
                }
                this.ayS = C7118bg.m89993bg(str2, 0);
                this.huT = false;
                return;
            case '\n':
                this.f14884Fx = C7112zx.m90019bg(this, str2);
                return;
            case 11:
                this.IEI = true;
                this.RFq = C7117bX.m90002bg(str2, 1.0f);
                return;
            case '\f':
                this.f14905bN = C7114Kg.m90006bg(this.f14906bX, str2);
                this.txA = true;
                return;
            case '\r':
                if (TextUtils.equals(str2, "match_parent")) {
                    this.f14893Lq = -1.0f;
                } else if (TextUtils.equals(str2, "wrap_content")) {
                    this.f14893Lq = -2.0f;
                } else {
                    this.f14893Lq = C7114Kg.m90006bg(this.f14906bX, str2);
                }
                this.DCn = true;
                return;
            case 14:
                this.f14926vb = C7114Kg.m90006bg(this.f14906bX, str2);
                return;
            case 15:
                this.tuV = C7114Kg.m90006bg(this.f14906bX, str2);
                this.rri = true;
                return;
            case 17:
            case '3':
                this.ZQc = str2;
                return;
            case 18:
                this.FFy = true;
                this.bOf = C7117bX.m90002bg(str2, 0.0f);
                return;
            case 19:
                this.ZTq = true;
                this.f14883Dt = C7117bX.m90002bg(str2, 0.0f);
                return;
            case 20:
                this.gCm = true;
                this.f14894Ny = C7117bX.m90002bg(str2, 0.0f);
                return;
            case 21:
                this.JAA = C7114Kg.m90006bg(this.f14906bX, str2);
                return;
            case 22:
                this.yda = str2;
                return;
            case 23:
                this.f14885Fy = C7114Kg.m90006bg(this.f14906bX, str2);
                this.kMt = true;
                return;
            case 24:
                this.f14895PX = str2;
                return;
            case 25:
                this.JaB = C7113IL.m90014bg(str2, (JSONObject) null);
                return;
            case 26:
                this.f14897Ta = str2;
                return;
            case 27:
                float m90002bg = C7117bX.m90002bg(str2, 0.0f);
                this.CQc = m90002bg;
                if (m90002bg > 0.0f) {
                    this.f14925uu = true;
                    return;
                }
                return;
            case 28:
                this.DDQ = C7114Kg.m90006bg(this.f14906bX, str2);
                this.f14901VJ = true;
                return;
            case 29:
                this.f14910eK = str2;
                return;
            case 31:
                this.bCU = C7117bX.m90002bg(str2, 0.0f);
                return;
            case ' ':
                this.ZTq = true;
                this.gCm = true;
                float[] m90199bX = C7045bX.m90199bX(str2);
                this.f14883Dt = m90199bX[0];
                this.f14894Ny = m90199bX[1];
                return;
            case '!':
                if (TextUtils.equals(str2, "match_parent")) {
                    this.yDt = -1.0f;
                } else if (TextUtils.equals(str2, "wrap_content")) {
                    this.yDt = -2.0f;
                } else {
                    this.yDt = C7114Kg.m90006bg(this.f14906bX, str2);
                }
                this.f14912gJ = true;
                return;
            case '\"':
                this.f14898Uq = C7114Kg.m90006bg(this.f14906bX, str2);
                this.daV = true;
                return;
            case '$':
                this.Pae = C7114Kg.m90006bg(this.f14906bX, str2);
                this.sVc = true;
                return;
            case '%':
                this.f14908bu = m90382Kg(str2);
                return;
            case '&':
                this.f14917jz = C7114Kg.m90006bg(this.f14906bX, str2);
                this.ApA = true;
                return;
            case '\'':
                this.f14896RJ = C7114Kg.m90006bg(this.f14906bX, str2);
                this.GvG = true;
                return;
            case '(':
                this.f14899Uw = C7114Kg.m90006bg(this.f14906bX, str2);
                this.f14902VW = true;
                return;
            case ')':
                this.gXn = C7118bg.m89995bg(str2);
                return;
            case '*':
                this.f14919lM = C7114Kg.m90006bg(this.f14906bX, str2);
                return;
            case ',':
                this.VzQ = C7114Kg.m90006bg(this.f14906bX, str2);
                this.f14923tC = true;
                return;
            case '-':
                this.f14907bg = true;
                this.f14888IL = true;
                float[] m90199bX2 = C7045bX.m90199bX(str2);
                this.f14904Ys = C7114Kg.m90009bg(this.f14906bX, m90199bX2[0]);
                this.f14909dS = C7114Kg.m90009bg(this.f14906bX, m90199bX2[1]);
                return;
            case '/':
                try {
                    this.cZH = new C7046bg(this.f14906bX, this, C7045bX.m90195bg(new JSONObject(str2)));
                    return;
                } catch (JSONException unused) {
                    return;
                }
            case '0':
                this.rgo = C7072bg.m90134bg(str2, this);
                return;
            case '4':
                this.f14920qC = true;
                this.LKE = m90351iR(str2);
                return;
            case '5':
                this.Dxa = C7114Kg.m90006bg(this.f14906bX, str2);
                return;
            case '6':
                this.f14922rr = true;
                this.f14918kU = C7117bX.m90002bg(str2, 0.0f);
                return;
            case '7':
                this.gtr = true;
                this.f14921qp = C7117bX.m90002bg(str2, 0.0f);
                return;
            case '8':
                this.eDa = C7117bX.m90002bg(str2, 0.0f);
                return;
            case ':':
                this.HXG = C7117bX.m89999bg(str2, false);
                return;
            case '<':
                if (TextUtils.equals("visible", str2)) {
                    this.f14887GZ = 0;
                } else if (TextUtils.equals("invisible", str2)) {
                    this.f14887GZ = 4;
                } else if (TextUtils.equals("gone", str2) || TextUtils.equals("hidden", str2)) {
                    this.f14887GZ = 8;
                }
                this.ldr.setVisibility(this.f14887GZ);
                return;
            case '=':
                this.xxp = C7114Kg.m90006bg(this.f14906bX, str2);
                this.f14891LZ = true;
                return;
            case '>':
                this.f14892Ld = !TextUtils.equals(str2, "unavailable");
                return;
            default:
                return;
        }
    }

    @Deprecated
    /* renamed from: bg */
    protected void m90365bg(int i, JSONObject jSONObject, C7077eo c7077eo) {
        JSONObject optJSONObject = jSONObject.optJSONObject("success");
        if (optJSONObject != null) {
            C7077eo c7077eo2 = new C7077eo();
            c7077eo2.m90094bg(optJSONObject);
            c7077eo2.m90096bg(this);
            c7077eo.m90095bg(c7077eo2);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject(C21114v8.C21120f.f53958e);
        if (optJSONObject2 != null) {
            C7077eo c7077eo3 = new C7077eo();
            c7077eo3.m90094bg(optJSONObject2);
            c7077eo3.m90096bg(this);
            c7077eo.m90100IL(c7077eo3);
        }
        c7077eo.m90094bg(jSONObject);
        this.f14916jf.put(Integer.valueOf(i), c7077eo);
    }

    @Override // com.bytedance.adsdk.ugeno.InterfaceC7032bX
    /* renamed from: bg */
    public int[] mo90227bg(int i, int i2) {
        if (this.bCU > 0.0f) {
            if (this.f14912gJ) {
                int size = View.MeasureSpec.getSize(i);
                float f = this.bCU;
                if (f != 0.0f) {
                    i2 = View.MeasureSpec.makeMeasureSpec((int) (size / f), 1073741824);
                }
            } else if (this.DCn) {
                int size2 = View.MeasureSpec.getSize(i2);
                float f2 = this.bCU;
                if (f2 != 0.0f) {
                    i = View.MeasureSpec.makeMeasureSpec((int) (size2 * f2), 1073741824);
                }
            }
        }
        if (this.mLT != null && !this.qSG) {
            this.qSG = true;
        }
        return new int[]{i, i2};
    }

    @Override // com.bytedance.adsdk.ugeno.InterfaceC7032bX
    /* renamed from: bg */
    public void mo90226bg(int i, int i2, int i3, int i4) {
        if (this.mLT == null || this.f14886GR) {
            return;
        }
        this.f14886GR = true;
    }

    @Override // com.bytedance.adsdk.ugeno.InterfaceC7032bX
    /* renamed from: bg */
    public void mo90224bg(Canvas canvas, IAnimation iAnimation) {
        C7079iR c7079iR = this.KRc;
        if (c7079iR != null) {
            c7079iR.m90088bg(canvas, iAnimation);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.InterfaceC7032bX
    /* renamed from: bg */
    public void mo90225bg(Canvas canvas) {
        C7046bg c7046bg = this.cZH;
        if (c7046bg != null) {
            c7046bg.m90190bg(canvas);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.core.InterfaceC7065PX.InterfaceC7066IL
    /* renamed from: bg */
    public void mo90157bg(C7077eo c7077eo) {
        C6988bg<ViewGroup> c6988bg;
        AbstractView$OnTouchListenerC6981bX<T> m90367bX;
        if (c7077eo == null || c7077eo.m90099bX() == null || !TextUtils.equals(c7077eo.m90099bX().optString("type"), "onDismiss")) {
            return;
        }
        String optString = c7077eo.m90099bX().optString("nodeId");
        m90369bX(8);
        this.f14890Kg = (C6988bg) m90386IL(this);
        if (TextUtils.isEmpty(optString) || (c6988bg = this.f14890Kg) == null || (m90367bX = c6988bg.m90367bX(optString)) == null) {
            return;
        }
        m90367bX.m90369bX(8);
    }

    /* renamed from: bg */
    public void m90356bg(C7107bg c7107bg) {
        this.JMw = c7107bg;
    }
}
