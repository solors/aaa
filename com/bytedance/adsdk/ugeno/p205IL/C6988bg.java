package com.bytedance.adsdk.ugeno.p205IL;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.p222iR.C7114Kg;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.adsdk.ugeno.IL.bg */
/* loaded from: classes3.dex */
public class C6988bg<E extends ViewGroup> extends AbstractView$OnTouchListenerC6981bX {

    /* renamed from: bg */
    protected List<AbstractView$OnTouchListenerC6981bX<View>> f14939bg;

    public C6988bg(Context context) {
        this(context, null);
    }

    @Override // com.bytedance.adsdk.ugeno.p205IL.AbstractView$OnTouchListenerC6981bX
    /* renamed from: IL */
    public void mo84928IL() {
        super.mo84928IL();
    }

    /* renamed from: bX */
    public C6989bg mo89795bX() {
        return new C6989bg();
    }

    /* renamed from: bg */
    public void mo89937bg(AbstractView$OnTouchListenerC6981bX abstractView$OnTouchListenerC6981bX) {
        if (abstractView$OnTouchListenerC6981bX == null) {
            return;
        }
        this.f14939bg.add(abstractView$OnTouchListenerC6981bX);
        View m90372WR = abstractView$OnTouchListenerC6981bX.m90372WR();
        if (m90372WR != null) {
            ((ViewGroup) this.ldr).addView(m90372WR);
        }
    }

    public C6988bg(Context context, C6988bg c6988bg) {
        super(context, c6988bg);
        this.f14939bg = new ArrayList();
    }

    @Override // com.bytedance.adsdk.ugeno.p205IL.AbstractView$OnTouchListenerC6981bX
    /* renamed from: IL */
    public AbstractView$OnTouchListenerC6981bX mo90344IL(String str) {
        AbstractView$OnTouchListenerC6981bX<View> eqN;
        if (TextUtils.isEmpty(str) || !TextUtils.equals(str, this.f14897Ta)) {
            for (AbstractView$OnTouchListenerC6981bX<View> abstractView$OnTouchListenerC6981bX : this.f14939bg) {
                if (abstractView$OnTouchListenerC6981bX != null && (eqN = abstractView$OnTouchListenerC6981bX.eqN(str)) != null) {
                    return eqN;
                }
            }
            return null;
        }
        return this;
    }

    /* renamed from: bg */
    public void mo89936bg(AbstractView$OnTouchListenerC6981bX abstractView$OnTouchListenerC6981bX, ViewGroup.LayoutParams layoutParams) {
        if (abstractView$OnTouchListenerC6981bX == null) {
            return;
        }
        this.f14939bg.add(abstractView$OnTouchListenerC6981bX);
        View m90372WR = abstractView$OnTouchListenerC6981bX.m90372WR();
        if (m90372WR != null) {
            ((ViewGroup) this.ldr).addView(m90372WR, layoutParams);
        }
    }

    /* renamed from: bg */
    public List<AbstractView$OnTouchListenerC6981bX<View>> m90343bg() {
        return this.f14939bg;
    }

    @Override // com.bytedance.adsdk.ugeno.p205IL.AbstractView$OnTouchListenerC6981bX
    /* renamed from: bg */
    public AbstractView$OnTouchListenerC6981bX mo90342bg(String str) {
        AbstractView$OnTouchListenerC6981bX<View> m90367bX;
        if (TextUtils.isEmpty(str) || !TextUtils.equals(str, this.f14895PX)) {
            for (AbstractView$OnTouchListenerC6981bX<View> abstractView$OnTouchListenerC6981bX : this.f14939bg) {
                if (abstractView$OnTouchListenerC6981bX != null && (m90367bX = abstractView$OnTouchListenerC6981bX.m90367bX(str)) != null) {
                    return m90367bX;
                }
            }
            return null;
        }
        return this;
    }

    /* renamed from: com.bytedance.adsdk.ugeno.IL.bg$bg */
    /* loaded from: classes3.dex */
    public static class C6989bg {

        /* renamed from: Fy */
        protected boolean f14940Fy;

        /* renamed from: Kg */
        protected float f14942Kg;

        /* renamed from: LZ */
        protected ViewGroup.LayoutParams f14943LZ;

        /* renamed from: Lq */
        protected boolean f14944Lq;

        /* renamed from: PX */
        protected float f14945PX;

        /* renamed from: Ta */
        protected boolean f14946Ta;

        /* renamed from: VB */
        protected float f14947VB;
        protected boolean VzQ;

        /* renamed from: WR */
        protected float f14948WR;

        /* renamed from: bX */
        protected float f14949bX;

        /* renamed from: eo */
        protected float f14951eo;
        protected float eqN;

        /* renamed from: iR */
        protected float f14952iR;
        protected float ldr;
        protected boolean tuV;

        /* renamed from: vb */
        protected boolean f14953vb;
        protected boolean xxp;
        protected boolean yDt;

        /* renamed from: zx */
        protected float f14954zx;

        /* renamed from: bg */
        protected float f14950bg = -2.0f;

        /* renamed from: IL */
        protected float f14941IL = -2.0f;

        /* renamed from: bg */
        public void mo89788bg(Context context, String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            str.hashCode();
            char c = 65535;
            switch (str.hashCode()) {
                case -1501175880:
                    if (str.equals("paddingLeft")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1221029593:
                    if (str.equals("height")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1081309778:
                    if (str.equals("margin")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1044792121:
                    if (str.equals("marginTop")) {
                        c = 3;
                        break;
                    }
                    break;
                case -806339567:
                    if (str.equals("padding")) {
                        c = 4;
                        break;
                    }
                    break;
                case -289173127:
                    if (str.equals("marginBottom")) {
                        c = 5;
                        break;
                    }
                    break;
                case 90130308:
                    if (str.equals("paddingTop")) {
                        c = 6;
                        break;
                    }
                    break;
                case 113126854:
                    if (str.equals("width")) {
                        c = 7;
                        break;
                    }
                    break;
                case 202355100:
                    if (str.equals("paddingBottom")) {
                        c = '\b';
                        break;
                    }
                    break;
                case 713848971:
                    if (str.equals("paddingRight")) {
                        c = '\t';
                        break;
                    }
                    break;
                case 975087886:
                    if (str.equals("marginRight")) {
                        c = '\n';
                        break;
                    }
                    break;
                case 1970934485:
                    if (str.equals("marginLeft")) {
                        c = 11;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    this.f14948WR = C7114Kg.m90006bg(context, str2);
                    this.f14946Ta = true;
                    return;
                case 1:
                    if (TextUtils.equals(str2, "match_parent")) {
                        this.f14941IL = -1.0f;
                        return;
                    } else if (TextUtils.equals(str2, "wrap_content")) {
                        this.f14941IL = -2.0f;
                        return;
                    } else {
                        this.f14941IL = C7114Kg.m90006bg(context, str2);
                        return;
                    }
                case 2:
                    this.f14949bX = C7114Kg.m90006bg(context, str2);
                    return;
                case 3:
                    this.ldr = C7114Kg.m90006bg(context, str2);
                    this.tuV = true;
                    return;
                case 4:
                    this.f14942Kg = C7114Kg.m90006bg(context, str2);
                    return;
                case 5:
                    this.f14952iR = C7114Kg.m90006bg(context, str2);
                    this.f14940Fy = true;
                    return;
                case 6:
                    this.f14951eo = C7114Kg.m90006bg(context, str2);
                    this.f14944Lq = true;
                    return;
                case 7:
                    if (TextUtils.equals(str2, "match_parent")) {
                        this.f14950bg = -1.0f;
                        return;
                    } else if (TextUtils.equals(str2, "wrap_content")) {
                        this.f14950bg = -2.0f;
                        return;
                    } else {
                        this.f14950bg = C7114Kg.m90006bg(context, str2);
                        return;
                    }
                case '\b':
                    this.f14945PX = C7114Kg.m90006bg(context, str2);
                    this.f14953vb = true;
                    return;
                case '\t':
                    this.f14947VB = C7114Kg.m90006bg(context, str2);
                    this.yDt = true;
                    return;
                case '\n':
                    this.f14954zx = C7114Kg.m90006bg(context, str2);
                    this.VzQ = true;
                    return;
                case 11:
                    this.eqN = C7114Kg.m90006bg(context, str2);
                    this.xxp = true;
                    return;
                default:
                    return;
            }
        }

        public String toString() {
            return "LayoutParams{mWidth=" + this.f14950bg + ", mHeight=" + this.f14941IL + ", mMargin=" + this.f14949bX + ", mMarginLeft=" + this.eqN + ", mMarginRight=" + this.f14954zx + ", mMarginTop=" + this.ldr + ", mMarginBottom=" + this.f14952iR + ", mParams=" + this.f14943LZ + '}';
        }

        /* renamed from: bg */
        public ViewGroup.LayoutParams mo89789bg() {
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams((int) this.f14950bg, (int) this.f14941IL);
            marginLayoutParams.leftMargin = (int) (this.xxp ? this.eqN : this.f14949bX);
            marginLayoutParams.rightMargin = (int) (this.VzQ ? this.f14954zx : this.f14949bX);
            marginLayoutParams.topMargin = (int) (this.tuV ? this.ldr : this.f14949bX);
            marginLayoutParams.bottomMargin = (int) (this.f14940Fy ? this.f14952iR : this.f14949bX);
            return marginLayoutParams;
        }
    }
}
