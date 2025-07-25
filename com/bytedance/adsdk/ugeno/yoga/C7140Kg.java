package com.bytedance.adsdk.ugeno.yoga;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.InterfaceC7032bX;
import com.bytedance.adsdk.ugeno.p205IL.AbstractView$OnTouchListenerC6981bX;
import com.bytedance.adsdk.ugeno.p205IL.InterfaceC6979IL;
import com.bytedance.adsdk.ugeno.p214bg.C7054ldr;
import com.bytedance.adsdk.ugeno.p214bg.InterfaceC7055zx;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.adsdk.ugeno.yoga.Kg */
/* loaded from: classes3.dex */
public class C7140Kg extends ViewGroup implements InterfaceC6979IL, InterfaceC7055zx {

    /* renamed from: IL */
    private final AbstractC7144PX f15347IL;

    /* renamed from: bX */
    private InterfaceC7032bX f15348bX;

    /* renamed from: bg */
    private final Map<View, AbstractC7144PX> f15349bg;
    private C7054ldr eqN;

    public C7140Kg(Context context) {
        this(context, null, 0);
    }

    @Override // com.bytedance.adsdk.ugeno.p205IL.InterfaceC6979IL
    /* renamed from: IL */
    public void mo89929IL(int i) {
        AbstractC7144PX abstractC7144PX = this.f15347IL;
        if (abstractC7144PX != null) {
            m89927IL(abstractC7144PX, i);
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        AbstractC7144PX m89899bg;
        this.f15347IL.mo89871bg((InterfaceC7147WR) null);
        if (!(view instanceof C7149bg)) {
            super.addView(view, i, layoutParams);
            if (this.f15349bg.containsKey(view)) {
                return;
            }
            if (view instanceof C7140Kg) {
                m89899bg = ((C7140Kg) view).getYogaNode();
            } else {
                if (this.f15349bg.containsKey(view)) {
                    m89899bg = this.f15349bg.get(view);
                } else {
                    m89899bg = AbstractC7145Ta.m89899bg();
                }
                m89899bg.mo89865bg(view);
                m89899bg.mo89871bg((InterfaceC7147WR) new C7141IL());
            }
            m89919bg((C7142bg) view.getLayoutParams(), m89899bg, view);
            this.f15349bg.put(view, m89899bg);
            if (view.getVisibility() == 8) {
                view.setTag(151060224, Integer.valueOf(this.f15347IL.mo89879bg()));
                return;
            }
            AbstractC7144PX abstractC7144PX = this.f15347IL;
            abstractC7144PX.mo89872bg(m89899bg, abstractC7144PX.mo89879bg());
            return;
        }
        throw null;
    }

    @Override // com.bytedance.adsdk.ugeno.p205IL.InterfaceC6979IL
    /* renamed from: bX */
    public void mo89926bX(View view, int i) {
        eqN(view, i);
    }

    /* renamed from: bg */
    public AbstractC7144PX m89923bg(View view) {
        return this.f15349bg.get(view);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C7142bg;
    }

    public void eqN(View view, int i) {
        int mo89873bg;
        view.setVisibility(i);
        try {
            AbstractC7144PX abstractC7144PX = this.f15349bg.get(view);
            Object tag = view.getTag(151060224);
            if (i == 0) {
                if (tag != null && this.f15347IL.mo89873bg(abstractC7144PX) == -1) {
                    int intValue = ((Integer) tag).intValue();
                    if (intValue < this.f15347IL.mo89879bg()) {
                        this.f15347IL.mo89872bg(this.f15349bg.get(view), intValue);
                    } else {
                        this.f15347IL.mo89872bg(this.f15349bg.get(view), this.f15347IL.mo89879bg());
                    }
                    m89918bg(this.f15347IL);
                }
            } else if (i == 8 && (mo89873bg = this.f15347IL.mo89873bg(abstractC7144PX)) != -1) {
                this.f15347IL.mo89893IL(mo89873bg);
                view.setTag(151060224, Integer.valueOf(mo89873bg));
                m89918bg(this.f15347IL);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C7142bg(-1, -1);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C7142bg(layoutParams);
    }

    public float getBorderRadius() {
        return this.eqN.m90177bg();
    }

    @Override // com.bytedance.adsdk.ugeno.p214bg.InterfaceC7055zx, com.bytedance.adsdk.ugeno.core.IAnimation
    public float getRipple() {
        return this.eqN.getRipple();
    }

    @Override // com.bytedance.adsdk.ugeno.p214bg.InterfaceC7055zx
    public float getRubIn() {
        return this.eqN.getRubIn();
    }

    @Override // com.bytedance.adsdk.ugeno.p214bg.InterfaceC7055zx
    public float getShine() {
        return this.eqN.getShine();
    }

    @Override // com.bytedance.adsdk.ugeno.p214bg.InterfaceC7055zx
    public float getStretch() {
        return this.eqN.getStretch();
    }

    public AbstractC7144PX getYogaNode() {
        return this.f15347IL;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC7032bX interfaceC7032bX = this.f15348bX;
        if (interfaceC7032bX != null) {
            interfaceC7032bX.mo90223iR();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC7032bX interfaceC7032bX = this.f15348bX;
        if (interfaceC7032bX != null) {
            interfaceC7032bX.mo90228Kg();
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        InterfaceC7032bX interfaceC7032bX = this.f15348bX;
        if (interfaceC7032bX != null) {
            interfaceC7032bX.mo90225bg(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        InterfaceC7032bX interfaceC7032bX = this.f15348bX;
        if (interfaceC7032bX != null) {
            interfaceC7032bX.ldr();
        }
        if (!(getParent() instanceof C7140Kg)) {
            m89924bg(View.MeasureSpec.makeMeasureSpec(i3 - i, 1073741824), View.MeasureSpec.makeMeasureSpec(i4 - i2, 1073741824));
        }
        m89917bg(this.f15347IL, 0.0f, 0.0f);
        InterfaceC7032bX interfaceC7032bX2 = this.f15348bX;
        if (interfaceC7032bX2 != null) {
            interfaceC7032bX2.mo90226bg(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        if (!(getParent() instanceof C7140Kg)) {
            m89924bg(i, i2);
        }
        InterfaceC7032bX interfaceC7032bX = this.f15348bX;
        if (interfaceC7032bX != null) {
            int[] mo90227bg = interfaceC7032bX.mo90227bg(i, i2);
            setMeasuredDimension(mo90227bg[0], mo90227bg[1]);
        } else {
            setMeasuredDimension(Math.round(this.f15347IL.mo89862iR()), Math.round(this.f15347IL.mo89889Kg()));
        }
        InterfaceC7032bX interfaceC7032bX2 = this.f15348bX;
        if (interfaceC7032bX2 != null) {
            interfaceC7032bX2.mo90222zx();
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        InterfaceC7032bX interfaceC7032bX = this.f15348bX;
        if (interfaceC7032bX != null) {
            interfaceC7032bX.mo90229IL(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    @Override // android.view.ViewGroup
    public void removeAllViews() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            m89921bg(getChildAt(i), false);
        }
        super.removeAllViews();
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            m89921bg(getChildAt(i), true);
        }
        super.removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        m89921bg(view, false);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i) {
        m89921bg(getChildAt(i), false);
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View view) {
        m89921bg(view, true);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            m89921bg(getChildAt(i3), false);
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            m89921bg(getChildAt(i3), true);
        }
        super.removeViewsInLayout(i, i2);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.eqN.m90175bg(i);
    }

    public void setBorderRadius(float f) {
        this.eqN.m90176bg(f);
    }

    public void setRipple(float f) {
        C7054ldr c7054ldr = this.eqN;
        if (c7054ldr != null) {
            c7054ldr.m90179IL(f);
        }
    }

    public void setRubIn(float f) {
        C7054ldr c7054ldr = this.eqN;
        if (c7054ldr != null) {
            c7054ldr.m90174zx(f);
        }
    }

    public void setShine(float f) {
        C7054ldr c7054ldr = this.eqN;
        if (c7054ldr != null) {
            c7054ldr.m90178bX(f);
        }
    }

    public void setStretch(float f) {
        C7054ldr c7054ldr = this.eqN;
        if (c7054ldr != null) {
            c7054ldr.eqN(f);
        }
    }

    public C7140Kg(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.eqN = new C7054ldr(this);
        AbstractC7144PX m89899bg = AbstractC7145Ta.m89899bg();
        this.f15347IL = m89899bg;
        this.f15349bg = new HashMap();
        m89899bg.mo89865bg(this);
        m89899bg.mo89871bg((InterfaceC7147WR) new C7141IL());
        m89919bg((C7142bg) generateDefaultLayoutParams(), m89899bg, this);
    }

    @Override // com.bytedance.adsdk.ugeno.p205IL.InterfaceC6979IL
    /* renamed from: bg */
    public void mo89925bg(int i) {
        AbstractC7144PX abstractC7144PX = this.f15347IL;
        if (abstractC7144PX != null) {
            m89916bg(abstractC7144PX, i);
            requestLayout();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.p205IL.InterfaceC6979IL
    /* renamed from: IL */
    public void mo89928IL(View view, int i) {
        AbstractC7144PX m89923bg;
        if (view == null || (m89923bg = m89923bg(view)) == null) {
            return;
        }
        m89927IL(m89923bg, i);
        view.requestLayout();
    }

    @Override // com.bytedance.adsdk.ugeno.p205IL.InterfaceC6979IL
    /* renamed from: bg */
    public void mo89922bg(View view, int i) {
        AbstractC7144PX m89923bg;
        if (view == null || (m89923bg = m89923bg(view)) == null) {
            return;
        }
        m89916bg(m89923bg, i);
        view.requestLayout();
    }

    /* renamed from: IL */
    private void m89927IL(AbstractC7144PX abstractC7144PX, int i) {
        if (i == -1) {
            abstractC7144PX.mo89861iR(100.0f);
        } else if (i == -2) {
            abstractC7144PX.eqN();
        } else {
            abstractC7144PX.ldr(i);
        }
    }

    /* renamed from: bg */
    private void m89916bg(AbstractC7144PX abstractC7144PX, int i) {
        if (i == -1) {
            abstractC7144PX.mo89859zx(100.0f);
        } else if (i == -2) {
            abstractC7144PX.mo89884bX();
        } else {
            abstractC7144PX.eqN(i);
        }
    }

    /* renamed from: com.bytedance.adsdk.ugeno.yoga.Kg$IL */
    /* loaded from: classes3.dex */
    public static class C7141IL implements InterfaceC7147WR {
        @Override // com.bytedance.adsdk.ugeno.yoga.InterfaceC7147WR
        /* renamed from: bg */
        public long mo89896bg(AbstractC7144PX abstractC7144PX, float f, EnumC7151eo enumC7151eo, float f2, EnumC7151eo enumC7151eo2) {
            View view = (View) abstractC7144PX.mo89886WR();
            if (view != null && !(view instanceof C7140Kg)) {
                view.measure(View.MeasureSpec.makeMeasureSpec((int) f, m89915bg(enumC7151eo)), View.MeasureSpec.makeMeasureSpec((int) f2, m89915bg(enumC7151eo2)));
                return C7146VB.m89897bg(view.getMeasuredWidth(), view.getMeasuredHeight());
            }
            return C7146VB.m89897bg(0, 0);
        }

        /* renamed from: bg */
        private int m89915bg(EnumC7151eo enumC7151eo) {
            if (enumC7151eo == EnumC7151eo.AT_MOST) {
                return Integer.MIN_VALUE;
            }
            return enumC7151eo == EnumC7151eo.EXACTLY ? 1073741824 : 0;
        }
    }

    /* renamed from: com.bytedance.adsdk.ugeno.yoga.Kg$bg */
    /* loaded from: classes3.dex */
    public static class C7142bg extends ViewGroup.LayoutParams {

        /* renamed from: IL */
        SparseArray<String> f15350IL;

        /* renamed from: Kg */
        private float f15351Kg;

        /* renamed from: Lq */
        private float f15352Lq;

        /* renamed from: PX */
        private float f15353PX;

        /* renamed from: Ta */
        private float f15354Ta;

        /* renamed from: VB */
        private float f15355VB;

        /* renamed from: WR */
        private float f15356WR;

        /* renamed from: bX */
        private float f15357bX;

        /* renamed from: bg */
        SparseArray<Float> f15358bg;

        /* renamed from: eo */
        private float f15359eo;
        private float eqN;

        /* renamed from: iR */
        private float f15360iR;
        private float ldr;

        /* renamed from: vb */
        private float f15361vb;
        private float xxp;
        private float yDt;

        /* renamed from: zx */
        private float f15362zx;

        public C7142bg(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            if (layoutParams instanceof C7142bg) {
                C7142bg c7142bg = (C7142bg) layoutParams;
                this.f15358bg = c7142bg.f15358bg.clone();
                this.f15350IL = c7142bg.f15350IL.clone();
                return;
            }
            this.f15358bg = new SparseArray<>();
            this.f15350IL = new SparseArray<>();
            if (layoutParams.width >= 0) {
                this.f15358bg.put(15, Float.valueOf(((ViewGroup.LayoutParams) this).width));
            }
            if (layoutParams.height >= 0) {
                this.f15358bg.put(16, Float.valueOf(((ViewGroup.LayoutParams) this).height));
            }
        }

        /* renamed from: IL */
        public void m89914IL(float f) {
            this.f15351Kg = f;
            this.f15358bg.put(6, Float.valueOf(f));
        }

        /* renamed from: Kg */
        public void m89913Kg(float f) {
            this.yDt = f;
            this.f15358bg.put(11, Float.valueOf(f));
        }

        /* renamed from: Lq */
        public void m89912Lq(float f) {
            this.xxp = f;
            this.f15358bg.put(25, Float.valueOf(f));
        }

        /* renamed from: PX */
        public void m89911PX(float f) {
            this.eqN = f;
            this.f15358bg.put(18, Float.valueOf(f));
        }

        /* renamed from: Ta */
        public void m89910Ta(float f) {
            this.f15362zx = f;
            this.f15358bg.put(19, Float.valueOf(f));
        }

        /* renamed from: VB */
        public void m89909VB(float f) {
            this.f15357bX = f;
            this.f15358bg.put(17, Float.valueOf(f));
        }

        /* renamed from: WR */
        public void m89908WR(float f) {
            this.f15352Lq = f;
            this.f15358bg.put(12, Float.valueOf(f));
        }

        /* renamed from: bX */
        public void m89907bX(float f) {
            this.f15356WR = f;
            this.f15358bg.put(7, Float.valueOf(f));
        }

        /* renamed from: bg */
        public void m89906bg(float f) {
            this.f15360iR = f;
            this.f15358bg.put(5, Float.valueOf(f));
        }

        /* renamed from: eo */
        public void m89905eo(float f) {
            this.f15361vb = f;
            this.f15358bg.put(13, Float.valueOf(f));
        }

        public void eqN(float f) {
            this.f15359eo = f;
            this.f15358bg.put(8, Float.valueOf(f));
        }

        /* renamed from: iR */
        public void m89904iR(float f) {
            this.f15354Ta = f;
            this.f15358bg.put(10, Float.valueOf(f));
        }

        public void ldr(float f) {
            this.f15353PX = f;
            this.f15358bg.put(14, Float.valueOf(f));
        }

        public void yDt(float f) {
            this.ldr = f;
            this.f15358bg.put(20, Float.valueOf(f));
        }

        /* renamed from: zx */
        public void m89903zx(float f) {
            this.f15355VB = f;
            this.f15358bg.put(9, Float.valueOf(f));
        }

        public C7142bg(int i, int i2) {
            super(i, i2);
            this.f15358bg = new SparseArray<>();
            this.f15350IL = new SparseArray<>();
            if (i == -2 || i == -1 || i >= 0) {
                this.f15358bg.put(15, Float.valueOf(i));
            }
            if (i2 == -2 || i2 == -1 || i2 >= 0) {
                this.f15358bg.put(16, Float.valueOf(i2));
            }
        }
    }

    /* renamed from: bg */
    private void m89918bg(AbstractC7144PX abstractC7144PX) {
        if (abstractC7144PX.mo89895IL() != null) {
            m89918bg(abstractC7144PX.mo89895IL());
        } else {
            abstractC7144PX.mo89877bg(Float.NaN, Float.NaN);
        }
    }

    /* renamed from: bg */
    private void m89921bg(View view, boolean z) {
        AbstractC7144PX abstractC7144PX = this.f15349bg.get(view);
        if (abstractC7144PX == null) {
            return;
        }
        AbstractC7144PX mo89895IL = abstractC7144PX.mo89895IL();
        int i = 0;
        while (true) {
            if (i >= mo89895IL.mo89879bg()) {
                break;
            } else if (mo89895IL.mo89876bg(i).equals(abstractC7144PX)) {
                mo89895IL.mo89893IL(i);
                break;
            } else {
                i++;
            }
        }
        abstractC7144PX.mo89865bg((Object) null);
        this.f15349bg.remove(view);
        if (z) {
            this.f15347IL.mo89877bg(Float.NaN, Float.NaN);
        }
    }

    /* renamed from: bg */
    private void m89917bg(AbstractC7144PX abstractC7144PX, float f, float f2) {
        View view = (View) abstractC7144PX.mo89886WR();
        if (view != null && view != this) {
            if (view.getVisibility() == 8) {
                return;
            }
            int round = Math.round(abstractC7144PX.mo89860zx() + f);
            int round2 = Math.round(abstractC7144PX.ldr() + f2);
            view.measure(View.MeasureSpec.makeMeasureSpec(Math.round(abstractC7144PX.mo89862iR()), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.round(abstractC7144PX.mo89889Kg()), 1073741824));
            view.layout(round, round2, view.getMeasuredWidth() + round, view.getMeasuredHeight() + round2);
        }
        int mo89879bg = abstractC7144PX.mo89879bg();
        for (int i = 0; i < mo89879bg; i++) {
            if (equals(view)) {
                m89917bg(abstractC7144PX.mo89876bg(i), f, f2);
            } else if (!(view instanceof C7140Kg)) {
                m89917bg(abstractC7144PX.mo89876bg(i), abstractC7144PX.mo89860zx() + f, abstractC7144PX.ldr() + f2);
            }
        }
    }

    /* renamed from: bg */
    private void m89924bg(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode2 == 1073741824) {
            this.f15347IL.ldr(size2);
        }
        if (mode == 1073741824) {
            this.f15347IL.eqN(size);
        }
        if (mode2 == Integer.MIN_VALUE) {
            this.f15347IL.mo89885WR(size2);
        }
        if (mode == Integer.MIN_VALUE) {
            this.f15347IL.mo89888Kg(size);
        }
        this.f15347IL.mo89877bg(Float.NaN, Float.NaN);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: bg */
    public static void m89919bg(C7142bg c7142bg, AbstractC7144PX abstractC7144PX, View view) {
        if (view.getResources().getConfiguration().getLayoutDirection() == 1) {
            abstractC7144PX.mo89870bg(EnumC7152eqN.RTL);
        }
        Drawable background = view.getBackground();
        if (background != null) {
            Rect rect = new Rect();
            if (background.getPadding(rect)) {
                abstractC7144PX.mo89890IL(EnumC7157zx.LEFT, rect.left);
                abstractC7144PX.mo89890IL(EnumC7157zx.TOP, rect.top);
                abstractC7144PX.mo89890IL(EnumC7157zx.RIGHT, rect.right);
                abstractC7144PX.mo89890IL(EnumC7157zx.BOTTOM, rect.bottom);
            }
        }
        for (int i = 0; i < c7142bg.f15358bg.size(); i++) {
            int keyAt = c7142bg.f15358bg.keyAt(i);
            float floatValue = c7142bg.f15358bg.valueAt(i).floatValue();
            if (keyAt == 4) {
                abstractC7144PX.mo89881bX(EnumC7134IL.m89945bg(Math.round(floatValue)));
            } else if (keyAt == 0) {
                abstractC7144PX.mo89875bg(EnumC7134IL.m89945bg(Math.round(floatValue)));
            } else if (keyAt == 9) {
                abstractC7144PX.mo89892IL(EnumC7134IL.m89945bg(Math.round(floatValue)));
            } else if (keyAt == 25) {
                abstractC7144PX.mo89863eo(floatValue);
            } else if (keyAt == 8) {
                abstractC7144PX.mo89883bX(floatValue);
            } else if (keyAt == 1) {
                abstractC7144PX.mo89868bg(EnumC7154ldr.m89851bg(Math.round(floatValue)));
            } else if (keyAt == 6) {
                abstractC7144PX.mo89878bg(floatValue);
            } else if (keyAt == 7) {
                abstractC7144PX.mo89894IL(floatValue);
            } else if (keyAt == 16) {
                if (floatValue == -1.0f) {
                    abstractC7144PX.mo89861iR(100.0f);
                } else if (floatValue == -2.0f) {
                    abstractC7144PX.eqN();
                } else {
                    abstractC7144PX.ldr(floatValue);
                }
            } else if (keyAt == 18) {
                abstractC7144PX.mo89866bg(EnumC7157zx.LEFT, floatValue);
            } else if (keyAt == 3) {
                abstractC7144PX.mo89869bg(EnumC7153iR.m89854bg(Math.round(floatValue)));
            } else if (keyAt == 17) {
                abstractC7144PX.mo89866bg(EnumC7157zx.TOP, floatValue);
            } else if (keyAt == 20) {
                abstractC7144PX.mo89866bg(EnumC7157zx.RIGHT, floatValue);
            } else if (keyAt == 19) {
                abstractC7144PX.mo89866bg(EnumC7157zx.BOTTOM, floatValue);
            } else if (keyAt == 22) {
                abstractC7144PX.mo89890IL(EnumC7157zx.LEFT, floatValue);
            } else if (keyAt == 21) {
                abstractC7144PX.mo89890IL(EnumC7157zx.TOP, floatValue);
            } else if (keyAt == 24) {
                abstractC7144PX.mo89890IL(EnumC7157zx.RIGHT, floatValue);
            } else if (keyAt == 23) {
                abstractC7144PX.mo89890IL(EnumC7157zx.BOTTOM, floatValue);
            } else if (keyAt == 11) {
                abstractC7144PX.mo89880bX(EnumC7157zx.LEFT, floatValue);
            } else if (keyAt == 10) {
                abstractC7144PX.mo89880bX(EnumC7157zx.TOP, floatValue);
            } else if (keyAt == 13) {
                abstractC7144PX.mo89880bX(EnumC7157zx.RIGHT, floatValue);
            } else if (keyAt == 12) {
                abstractC7144PX.mo89880bX(EnumC7157zx.BOTTOM, floatValue);
            } else if (keyAt == 14) {
                abstractC7144PX.mo89874bg(EnumC7143Lq.m89901bg(Math.round(floatValue)));
            } else if (keyAt == 15) {
                if (floatValue == -1.0f) {
                    abstractC7144PX.mo89859zx(100.0f);
                } else if (floatValue == -2.0f) {
                    abstractC7144PX.mo89884bX();
                } else {
                    abstractC7144PX.eqN(floatValue);
                }
            } else if (keyAt == 2) {
                abstractC7144PX.mo89867bg(EnumC7155xxp.m89848bg(Math.round(floatValue)));
            }
        }
    }

    /* renamed from: bg */
    public void m89920bg(AbstractView$OnTouchListenerC6981bX abstractView$OnTouchListenerC6981bX) {
        this.f15348bX = abstractView$OnTouchListenerC6981bX;
    }
}
