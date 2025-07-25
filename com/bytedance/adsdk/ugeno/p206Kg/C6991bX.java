package com.bytedance.adsdk.ugeno.p206Kg;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.bytedance.adsdk.ugeno.Kg.bX */
/* loaded from: classes3.dex */
public class C6991bX extends ViewGroup {
    private boolean ApA;
    private int CQc;
    private boolean DDQ;

    /* renamed from: Dt */
    private int f14960Dt;
    private int Dxa;

    /* renamed from: Fy */
    private float f14961Fy;

    /* renamed from: GZ */
    private InterfaceC6999eqN f14962GZ;
    private boolean GvG;
    private boolean JAA;

    /* renamed from: Ja */
    private boolean f14963Ja;

    /* renamed from: Kg */
    private final C6995IL f14964Kg;
    private float LKE;

    /* renamed from: LZ */
    private float f14965LZ;

    /* renamed from: Ld */
    private List<Object> f14966Ld;

    /* renamed from: Lq */
    private C7002ldr f14967Lq;

    /* renamed from: PX */
    private ClassLoader f14968PX;
    private boolean Pae;

    /* renamed from: RJ */
    private EdgeEffect f14969RJ;
    private final Runnable RiO;

    /* renamed from: Ta */
    private Scroller f14970Ta;

    /* renamed from: Uq */
    private boolean f14971Uq;

    /* renamed from: Uw */
    private int f14972Uw;

    /* renamed from: VB */
    private Parcelable f14973VB;

    /* renamed from: VJ */
    private int f14974VJ;

    /* renamed from: VW */
    private int f14975VW;
    private int VzQ;

    /* renamed from: WR */
    private final Rect f14976WR;

    /* renamed from: Ys */
    private ArrayList<View> f14977Ys;
    private float ZQc;
    private int aGH;
    private float ayS;
    private InterfaceC6999eqN bCU;

    /* renamed from: bN */
    private int f14978bN;

    /* renamed from: bX */
    AbstractC6990IL f14979bX;

    /* renamed from: bg */
    private int f14980bg;
    private int cZH;
    private float daV;

    /* renamed from: eo */
    private int f14981eo;
    int eqN;
    private List<InterfaceC6999eqN> gXn;

    /* renamed from: iR */
    private final ArrayList<C6995IL> f14982iR;

    /* renamed from: jz */
    private int f14983jz;
    private boolean kMt;

    /* renamed from: lM */
    private int f14984lM;

    /* renamed from: qC */
    private int f14985qC;
    private int rri;
    private boolean sVc;

    /* renamed from: tC */
    private int f14986tC;
    private int tuV;
    private EdgeEffect txA;

    /* renamed from: uu */
    private VelocityTracker f14987uu;

    /* renamed from: vb */
    private int f14988vb;

    /* renamed from: wS */
    private InterfaceC7003zx f14989wS;
    private Drawable xxp;
    private boolean yDt;
    private int zCS;

    /* renamed from: IL */
    static final int[] f14957IL = {16842931};

    /* renamed from: zx */
    private static final Comparator<C6995IL> f14959zx = new Comparator<C6995IL>() { // from class: com.bytedance.adsdk.ugeno.Kg.bX.1
        @Override // java.util.Comparator
        /* renamed from: bg */
        public int compare(C6995IL c6995il, C6995IL c6995il2) {
            return c6995il.f14991IL - c6995il2.f14991IL;
        }
    };
    private static final Interpolator ldr = new Interpolator() { // from class: com.bytedance.adsdk.ugeno.Kg.bX.2
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };

    /* renamed from: dS */
    private static final C6996Kg f14958dS = new C6996Kg();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.bytedance.adsdk.ugeno.Kg.bX$IL */
    /* loaded from: classes3.dex */
    public static class C6995IL {

        /* renamed from: IL */
        int f14991IL;

        /* renamed from: bX */
        boolean f14992bX;

        /* renamed from: bg */
        Object f14993bg;
        float eqN;

        /* renamed from: zx */
        float f14994zx;

        C6995IL() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.bytedance.adsdk.ugeno.Kg.bX$Kg */
    /* loaded from: classes3.dex */
    public static class C6996Kg implements Comparator<View> {
        C6996Kg() {
        }

        @Override // java.util.Comparator
        /* renamed from: bg */
        public int compare(View view, View view2) {
            C6997bX c6997bX = (C6997bX) view.getLayoutParams();
            C6997bX c6997bX2 = (C6997bX) view2.getLayoutParams();
            boolean z = c6997bX.f14997bg;
            if (z != c6997bX2.f14997bg) {
                if (z) {
                    return 1;
                }
                return -1;
            }
            return c6997bX.f14998zx - c6997bX2.f14998zx;
        }
    }

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: com.bytedance.adsdk.ugeno.Kg.bX$bg */
    /* loaded from: classes3.dex */
    public @interface InterfaceC6998bg {
    }

    /* renamed from: com.bytedance.adsdk.ugeno.Kg.bX$eqN */
    /* loaded from: classes3.dex */
    public interface InterfaceC6999eqN {
        /* renamed from: Kg */
        void mo89978Kg(int i);

        /* renamed from: bg */
        void mo89969bg(int i, float f, int i2);
    }

    /* renamed from: com.bytedance.adsdk.ugeno.Kg.bX$iR */
    /* loaded from: classes3.dex */
    public static class C7000iR extends AbstractC7004bg {
        public static final Parcelable.Creator<C7000iR> CREATOR = new Parcelable.ClassLoaderCreator<C7000iR>() { // from class: com.bytedance.adsdk.ugeno.Kg.bX.iR.1
            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: bg */
            public C7000iR createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C7000iR(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: bg */
            public C7000iR createFromParcel(Parcel parcel) {
                return new C7000iR(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: bg */
            public C7000iR[] newArray(int i) {
                return new C7000iR[i];
            }
        };

        /* renamed from: IL */
        int f14999IL;

        /* renamed from: bX */
        Parcelable f15000bX;
        ClassLoader eqN;

        public C7000iR(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f14999IL + "}";
        }

        @Override // com.bytedance.adsdk.ugeno.p206Kg.AbstractC7004bg, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f14999IL);
            parcel.writeParcelable(this.f15000bX, i);
        }

        C7000iR(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f14999IL = parcel.readInt();
            this.f15000bX = parcel.readParcelable(classLoader);
            this.eqN = classLoader;
        }
    }

    /* renamed from: com.bytedance.adsdk.ugeno.Kg.bX$ldr */
    /* loaded from: classes3.dex */
    private class C7002ldr extends DataSetObserver {
        C7002ldr() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            C6991bX.this.m90336IL();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            C6991bX.this.m90336IL();
        }
    }

    /* renamed from: com.bytedance.adsdk.ugeno.Kg.bX$zx */
    /* loaded from: classes3.dex */
    public interface InterfaceC7003zx {
        /* renamed from: bg */
        void mo89983bg(View view, float f);
    }

    public C6991bX(Context context) {
        super(context);
        this.f14982iR = new ArrayList<>();
        this.f14964Kg = new C6995IL();
        this.f14976WR = new Rect();
        this.f14981eo = -1;
        this.f14973VB = null;
        this.f14968PX = null;
        this.f14961Fy = -3.4028235E38f;
        this.f14965LZ = Float.MAX_VALUE;
        this.f14972Uw = 1;
        this.CQc = -1;
        this.sVc = true;
        this.ApA = false;
        this.RiO = new Runnable() { // from class: com.bytedance.adsdk.ugeno.Kg.bX.3
            @Override // java.lang.Runnable
            public void run() {
                C6991bX.this.setScrollState(0);
                C6991bX.this.m90328bX();
            }
        };
        this.f14960Dt = 0;
        m90324bg();
    }

    /* renamed from: Kg */
    private boolean m90330Kg() {
        this.CQc = -1;
        m90301eo();
        this.f14969RJ.onRelease();
        this.txA.onRelease();
        if (!this.f14969RJ.isFinished() && !this.txA.isFinished()) {
            return false;
        }
        return true;
    }

    /* renamed from: WR */
    private C6995IL m90329WR() {
        float f;
        float f2;
        int i;
        int clientWidth = getClientWidth();
        float f3 = 0.0f;
        if (clientWidth > 0) {
            f = getScrollX() / clientWidth;
        } else {
            f = 0.0f;
        }
        if (clientWidth > 0) {
            f2 = this.f14988vb / clientWidth;
        } else {
            f2 = 0.0f;
        }
        int i2 = 0;
        boolean z = true;
        C6995IL c6995il = null;
        int i3 = -1;
        float f4 = 0.0f;
        while (i2 < this.f14982iR.size()) {
            C6995IL c6995il2 = this.f14982iR.get(i2);
            if (!z && c6995il2.f14991IL != (i = i3 + 1)) {
                c6995il2 = this.f14964Kg;
                c6995il2.f14994zx = f3 + f4 + f2;
                c6995il2.f14991IL = i;
                c6995il2.eqN = this.f14979bX.mo89955bg(i);
                i2--;
            }
            C6995IL c6995il3 = c6995il2;
            f3 = c6995il3.f14994zx;
            float f5 = c6995il3.eqN + f3 + f2;
            if (!z && f < f3) {
                return c6995il;
            }
            if (f >= f5 && i2 != this.f14982iR.size() - 1) {
                int i4 = c6995il3.f14991IL;
                float f6 = c6995il3.eqN;
                i2++;
                z = false;
                i3 = i4;
                f4 = f6;
                c6995il = c6995il3;
            } else {
                return c6995il3;
            }
        }
        return c6995il;
    }

    /* renamed from: eo */
    private void m90301eo() {
        this.DDQ = false;
        this.f14971Uq = false;
        VelocityTracker velocityTracker = this.f14987uu;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f14987uu = null;
        }
    }

    private boolean eqN(int i) {
        if (this.f14982iR.size() == 0) {
            if (this.sVc) {
                return false;
            }
            this.GvG = false;
            m90320bg(0, 0.0f, 0);
            if (this.GvG) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        C6995IL m90329WR = m90329WR();
        int clientWidth = getClientWidth();
        int i2 = this.f14988vb;
        int i3 = clientWidth + i2;
        float f = clientWidth;
        int i4 = m90329WR.f14991IL;
        float f2 = ((i / f) - m90329WR.f14994zx) / (m90329WR.eqN + (i2 / f));
        this.GvG = false;
        m90320bg(i4, f2, (int) (i3 * f2));
        if (this.GvG) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    /* renamed from: iR */
    private void m90300iR() {
        if (this.zCS != 0) {
            ArrayList<View> arrayList = this.f14977Ys;
            if (arrayList == null) {
                this.f14977Ys = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.f14977Ys.add(getChildAt(i));
            }
            Collections.sort(this.f14977Ys, f14958dS);
        }
    }

    private void ldr() {
        int i = 0;
        while (i < getChildCount()) {
            if (!((C6997bX) getChildAt(i).getLayoutParams()).f14997bg) {
                removeViewAt(i);
                i--;
            }
            i++;
        }
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.JAA != z) {
            this.JAA = z;
        }
    }

    /* renamed from: zx */
    private void m90298zx(int i) {
        InterfaceC6999eqN interfaceC6999eqN = this.f14962GZ;
        if (interfaceC6999eqN != null) {
            interfaceC6999eqN.mo89978Kg(i);
        }
        List<InterfaceC6999eqN> list = this.gXn;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                InterfaceC6999eqN interfaceC6999eqN2 = this.gXn.get(i2);
                if (interfaceC6999eqN2 != null) {
                    interfaceC6999eqN2.mo89978Kg(i);
                }
            }
        }
        InterfaceC6999eqN interfaceC6999eqN3 = this.bCU;
        if (interfaceC6999eqN3 != null) {
            interfaceC6999eqN3.mo89978Kg(i);
        }
    }

    /* renamed from: IL */
    void m90336IL() {
        int mo89957bg = this.f14979bX.mo89957bg();
        this.f14980bg = mo89957bg;
        boolean z = this.f14982iR.size() < (this.f14972Uw * 2) + 1 && this.f14982iR.size() < mo89957bg;
        int i = this.eqN;
        int i2 = 0;
        while (i2 < this.f14982iR.size()) {
            C6995IL c6995il = this.f14982iR.get(i2);
            int mo89949bg = this.f14979bX.mo89949bg(c6995il.f14993bg);
            if (mo89949bg != -1) {
                if (mo89949bg == -2) {
                    this.f14982iR.remove(i2);
                    i2--;
                    this.f14979bX.mo89950bg((ViewGroup) this, c6995il.f14991IL, c6995il.f14993bg);
                    int i3 = this.eqN;
                    if (i3 == c6995il.f14991IL) {
                        i = Math.max(0, Math.min(i3, mo89957bg - 1));
                    }
                } else {
                    int i4 = c6995il.f14991IL;
                    if (i4 != mo89949bg) {
                        if (i4 == this.eqN) {
                            i = mo89949bg;
                        }
                        c6995il.f14991IL = mo89949bg;
                    }
                }
                z = true;
            }
            i2++;
        }
        Collections.sort(this.f14982iR, f14959zx);
        if (z) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                C6997bX c6997bX = (C6997bX) getChildAt(i5).getLayoutParams();
                if (!c6997bX.f14997bg) {
                    c6997bX.f14996bX = 0.0f;
                }
            }
            m90313bg(i, false, true);
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        C6995IL m90308bg;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (m90308bg = m90308bg(childAt)) != null && m90308bg.f14991IL == this.eqN) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if ((i2 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
            return;
        }
        arrayList.add(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        C6995IL m90308bg;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (m90308bg = m90308bg(childAt)) != null && m90308bg.f14991IL == this.eqN) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        C6997bX c6997bX = (C6997bX) layoutParams;
        boolean m90326bX = c6997bX.f14997bg | m90326bX(view);
        c6997bX.f14997bg = m90326bX;
        if (this.kMt) {
            if (!m90326bX) {
                c6997bX.eqN = true;
                addViewInLayout(view, i, layoutParams);
                return;
            }
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
        super.addView(view, i, layoutParams);
    }

    /* renamed from: bX */
    void m90328bX() {
        m90321bg(this.eqN);
    }

    /* renamed from: bg */
    void m90324bg() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f14970Ta = new Scroller(context, ldr);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.f14974VJ = viewConfiguration.getScaledPagingTouchSlop();
        this.f14985qC = (int) (400.0f * f);
        this.Dxa = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f14969RJ = new EdgeEffect(context);
        this.txA = new EdgeEffect(context);
        this.f14978bN = (int) (25.0f * f);
        this.f14983jz = (int) (2.0f * f);
        this.aGH = (int) (f * 16.0f);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        if (this.f14979bX == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i < 0) {
            if (scrollX <= ((int) (clientWidth * this.f14961Fy))) {
                return false;
            }
            return true;
        } else if (i <= 0 || scrollX >= ((int) (clientWidth * this.f14965LZ))) {
            return false;
        } else {
            return true;
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof C6997bX) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public void computeScroll() {
        this.yDt = true;
        if (!this.f14970Ta.isFinished() && this.f14970Ta.computeScrollOffset()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.f14970Ta.getCurrX();
            int currY = this.f14970Ta.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
                if (!eqN(currX)) {
                    this.f14970Ta.abortAnimation();
                    scrollTo(0, currY);
                }
            }
            postInvalidateOnAnimation();
            return;
        }
        m90304bg(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!super.dispatchKeyEvent(keyEvent) && !m90310bg(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C6995IL m90308bg;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (m90308bg = m90308bg(childAt)) != null && m90308bg.f14991IL == this.eqN && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        AbstractC6990IL abstractC6990IL;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z = false;
        if (overScrollMode != 0 && (overScrollMode != 1 || (abstractC6990IL = this.f14979bX) == null || abstractC6990IL.mo89957bg() <= 1)) {
            this.f14969RJ.finish();
            this.txA.finish();
        } else {
            if (!this.f14969RJ.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.f14961Fy * width);
                this.f14969RJ.setSize(height, width);
                z = false | this.f14969RJ.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.txA.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.f14965LZ + 1.0f)) * width2);
                this.txA.setSize(height2, width2);
                z |= this.txA.draw(canvas);
                canvas.restoreToCount(save2);
            }
        }
        if (z) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.xxp;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C6997bX();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public AbstractC6990IL getAdapter() {
        return this.f14979bX;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i, int i2) {
        if (this.zCS == 2) {
            i2 = (i - 1) - i2;
        }
        return ((C6997bX) this.f14977Ys.get(i2).getLayoutParams()).ldr;
    }

    public int getCurrentItem() {
        return this.eqN;
    }

    public int getOffscreenPageLimit() {
        return this.f14972Uw;
    }

    public int getPageMargin() {
        return this.f14988vb;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.sVc = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.RiO);
        Scroller scroller = this.f14970Ta;
        if (scroller != null && !scroller.isFinished()) {
            this.f14970Ta.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int width;
        int i;
        float f;
        float f2;
        super.onDraw(canvas);
        if (this.f14988vb > 0 && this.xxp != null && this.f14982iR.size() > 0 && this.f14979bX != null) {
            int scrollX = getScrollX();
            float width2 = getWidth();
            float f3 = this.f14988vb / width2;
            int i2 = 0;
            C6995IL c6995il = this.f14982iR.get(0);
            float f4 = c6995il.f14994zx;
            int size = this.f14982iR.size();
            int i3 = c6995il.f14991IL;
            int i4 = this.f14982iR.get(size - 1).f14991IL;
            while (i3 < i4) {
                while (true) {
                    i = c6995il.f14991IL;
                    if (i3 <= i || i2 >= size) {
                        break;
                    }
                    i2++;
                    c6995il = this.f14982iR.get(i2);
                }
                if (i3 == i) {
                    float f5 = c6995il.f14994zx;
                    float f6 = c6995il.eqN;
                    f = (f5 + f6) * width2;
                    f4 = f5 + f6 + f3;
                } else {
                    float mo89955bg = this.f14979bX.mo89955bg(i3);
                    f = (f4 + mo89955bg) * width2;
                    f4 += mo89955bg + f3;
                }
                if (this.f14988vb + f > scrollX) {
                    f2 = f3;
                    this.xxp.setBounds(Math.round(f), this.VzQ, Math.round(this.f14988vb + f), this.tuV);
                    this.xxp.draw(canvas);
                } else {
                    f2 = f3;
                }
                if (f <= scrollX + width) {
                    i3++;
                    f3 = f2;
                } else {
                    return;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int findPointerIndex;
        float f;
        int action = motionEvent.getAction() & 255;
        if (action != 3 && action != 1) {
            if (action != 0) {
                if (this.DDQ) {
                    return true;
                }
                if (this.f14971Uq) {
                    return false;
                }
            }
            if (action != 0) {
                if (action != 2) {
                    if (action == 6) {
                        m90309bg(motionEvent);
                    }
                } else {
                    int i = this.CQc;
                    if (i != -1 && (findPointerIndex = motionEvent.findPointerIndex(i)) != -1) {
                        float x = motionEvent.getX(findPointerIndex);
                        float f2 = x - this.daV;
                        float abs = Math.abs(f2);
                        float y = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y - this.LKE);
                        int i2 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
                        if (i2 != 0 && !m90322bg(this.daV, f2) && m90307bg(this, false, (int) f2, (int) x, (int) y)) {
                            this.daV = x;
                            this.ayS = y;
                            this.f14971Uq = true;
                            return false;
                        }
                        int i3 = this.f14974VJ;
                        if (abs > i3 && abs * 0.5f > abs2) {
                            this.DDQ = true;
                            m90325bX(true);
                            setScrollState(1);
                            float f3 = this.ZQc;
                            float f4 = this.f14974VJ;
                            if (i2 > 0) {
                                f = f3 + f4;
                            } else {
                                f = f3 - f4;
                            }
                            this.daV = f;
                            this.ayS = y;
                            setScrollingCacheEnabled(true);
                        } else if (abs2 > i3) {
                            this.f14971Uq = true;
                        }
                        if (this.DDQ && m90335IL(x)) {
                            postInvalidateOnAnimation();
                        }
                    }
                }
            } else {
                float x2 = motionEvent.getX();
                this.ZQc = x2;
                this.daV = x2;
                float y2 = motionEvent.getY();
                this.LKE = y2;
                this.ayS = y2;
                this.CQc = motionEvent.getPointerId(0);
                this.f14971Uq = false;
                this.yDt = true;
                this.f14970Ta.computeScrollOffset();
                if (this.f14960Dt == 2 && Math.abs(this.f14970Ta.getFinalX() - this.f14970Ta.getCurrX()) > this.f14983jz) {
                    this.f14970Ta.abortAnimation();
                    this.f14963Ja = false;
                    m90328bX();
                    this.DDQ = true;
                    m90325bX(true);
                    setScrollState(1);
                } else {
                    m90304bg(false);
                    this.DDQ = false;
                }
            }
            if (this.f14987uu == null) {
                this.f14987uu = VelocityTracker.obtain();
            }
            this.f14987uu.addMovement(motionEvent);
            return this.DDQ;
        }
        m90330Kg();
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.p206Kg.C6991bX.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        C6997bX c6997bX;
        C6997bX c6997bX2;
        boolean z;
        int i3;
        setMeasuredDimension(View.getDefaultSize(0, i), View.getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.f14975VW = Math.min(measuredWidth / 10, this.aGH);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i4 = 0;
        while (true) {
            boolean z2 = true;
            int i5 = 1073741824;
            if (i4 >= childCount) {
                break;
            }
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8 && (c6997bX2 = (C6997bX) childAt.getLayoutParams()) != null && c6997bX2.f14997bg) {
                int i6 = c6997bX2.f14995IL;
                int i7 = i6 & 7;
                int i8 = i6 & 112;
                if (i8 != 48 && i8 != 80) {
                    z = false;
                } else {
                    z = true;
                }
                if (i7 != 3 && i7 != 5) {
                    z2 = false;
                }
                int i9 = Integer.MIN_VALUE;
                if (z) {
                    i3 = Integer.MIN_VALUE;
                    i9 = 1073741824;
                } else if (z2) {
                    i3 = 1073741824;
                } else {
                    i3 = Integer.MIN_VALUE;
                }
                int i10 = ((ViewGroup.LayoutParams) c6997bX2).width;
                if (i10 != -2) {
                    if (i10 == -1) {
                        i10 = paddingLeft;
                    }
                    i9 = 1073741824;
                } else {
                    i10 = paddingLeft;
                }
                int i11 = ((ViewGroup.LayoutParams) c6997bX2).height;
                if (i11 != -2) {
                    if (i11 == -1) {
                        i11 = measuredHeight;
                    }
                } else {
                    i11 = measuredHeight;
                    i5 = i3;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i10, i9), View.MeasureSpec.makeMeasureSpec(i11, i5));
                if (z) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z2) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i4++;
        }
        this.f14986tC = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.rri = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.kMt = true;
        m90328bX();
        this.kMt = false;
        int childCount2 = getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            View childAt2 = getChildAt(i12);
            if (childAt2.getVisibility() != 8 && ((c6997bX = (C6997bX) childAt2.getLayoutParams()) == null || !c6997bX.f14997bg)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * c6997bX.f14996bX), 1073741824), this.rri);
            }
        }
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        int i4;
        C6995IL m90308bg;
        int childCount = getChildCount();
        if ((i & 2) != 0) {
            i3 = childCount;
            i2 = 0;
            i4 = 1;
        } else {
            i2 = childCount - 1;
            i3 = -1;
            i4 = -1;
        }
        while (i2 != i3) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (m90308bg = m90308bg(childAt)) != null && m90308bg.f14991IL == this.eqN && childAt.requestFocus(i, rect)) {
                return true;
            }
            i2 += i4;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C7000iR)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C7000iR c7000iR = (C7000iR) parcelable;
        super.onRestoreInstanceState(c7000iR.m90292bg());
        if (this.f14979bX != null) {
            m90313bg(c7000iR.f14999IL, false, true);
            return;
        }
        this.f14981eo = c7000iR.f14999IL;
        this.f14973VB = c7000iR.f15000bX;
        this.f14968PX = c7000iR.eqN;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C7000iR c7000iR = new C7000iR(super.onSaveInstanceState());
        c7000iR.f14999IL = this.eqN;
        AbstractC6990IL abstractC6990IL = this.f14979bX;
        if (abstractC6990IL != null) {
            c7000iR.f15000bX = abstractC6990IL.m90341IL();
        }
        return c7000iR;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.f14988vb;
            m90316bg(i, i3, i5, i5);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractC6990IL abstractC6990IL;
        int findPointerIndex;
        float f;
        if (this.Pae) {
            return true;
        }
        boolean z = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (abstractC6990IL = this.f14979bX) == null || abstractC6990IL.mo89957bg() == 0) {
            return false;
        }
        if (this.f14987uu == null) {
            this.f14987uu = VelocityTracker.obtain();
        }
        this.f14987uu.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        if (action != 5) {
                            if (action == 6) {
                                m90309bg(motionEvent);
                                int findPointerIndex2 = motionEvent.findPointerIndex(this.CQc);
                                if (findPointerIndex2 != -1) {
                                    this.daV = motionEvent.getX(findPointerIndex2);
                                }
                            }
                        } else {
                            int actionIndex = motionEvent.getActionIndex();
                            if (actionIndex != -1) {
                                this.daV = motionEvent.getX(actionIndex);
                                this.CQc = motionEvent.getPointerId(actionIndex);
                            }
                        }
                    } else if (this.DDQ) {
                        m90314bg(this.eqN, true, 0, false);
                        z = m90330Kg();
                    }
                } else {
                    if (!this.DDQ) {
                        int findPointerIndex3 = motionEvent.findPointerIndex(this.CQc);
                        if (findPointerIndex3 == -1) {
                            z = m90330Kg();
                        } else {
                            float x = motionEvent.getX(findPointerIndex3);
                            float abs = Math.abs(x - this.daV);
                            float y = motionEvent.getY(findPointerIndex3);
                            float abs2 = Math.abs(y - this.ayS);
                            if (abs > this.f14974VJ && abs > abs2) {
                                this.DDQ = true;
                                m90325bX(true);
                                float f2 = this.ZQc;
                                if (x - f2 > 0.0f) {
                                    f = f2 + this.f14974VJ;
                                } else {
                                    f = f2 - this.f14974VJ;
                                }
                                this.daV = f;
                                this.ayS = y;
                                setScrollState(1);
                                setScrollingCacheEnabled(true);
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                    if (this.DDQ && (findPointerIndex = motionEvent.findPointerIndex(this.CQc)) != -1) {
                        z = false | m90335IL(motionEvent.getX(findPointerIndex));
                    }
                }
            } else if (this.DDQ) {
                VelocityTracker velocityTracker = this.f14987uu;
                velocityTracker.computeCurrentVelocity(1000, this.Dxa);
                int xVelocity = (int) velocityTracker.getXVelocity(this.CQc);
                this.f14963Ja = true;
                int clientWidth = getClientWidth();
                int scrollX = getScrollX();
                C6995IL m90329WR = m90329WR();
                float f3 = clientWidth;
                int i = m90329WR.f14991IL;
                float f4 = ((scrollX / f3) - m90329WR.f14994zx) / (m90329WR.eqN + (this.f14988vb / f3));
                int findPointerIndex4 = motionEvent.findPointerIndex(this.CQc);
                if (findPointerIndex4 != -1) {
                    m90312bg(m90319bg(i, f4, xVelocity, (int) (motionEvent.getX(findPointerIndex4) - this.ZQc)), true, true, xVelocity);
                    z = m90330Kg();
                }
            }
        } else {
            this.f14970Ta.abortAnimation();
            this.f14963Ja = false;
            m90328bX();
            float x2 = motionEvent.getX();
            this.ZQc = x2;
            this.daV = x2;
            float y2 = motionEvent.getY();
            this.LKE = y2;
            this.ayS = y2;
            this.CQc = motionEvent.getPointerId(0);
        }
        if (z) {
            postInvalidateOnAnimation();
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.kMt) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(AbstractC6990IL abstractC6990IL) {
        AbstractC6990IL abstractC6990IL2 = this.f14979bX;
        if (abstractC6990IL2 != null) {
            abstractC6990IL2.m90339bg((DataSetObserver) null);
            for (int i = 0; i < this.f14982iR.size(); i++) {
                C6995IL c6995il = this.f14982iR.get(i);
                this.f14979bX.mo89950bg((ViewGroup) this, c6995il.f14991IL, c6995il.f14993bg);
            }
            this.f14982iR.clear();
            ldr();
            this.eqN = 0;
            scrollTo(0, 0);
        }
        this.f14979bX = abstractC6990IL;
        this.f14980bg = 0;
        if (abstractC6990IL != null) {
            if (this.f14967Lq == null) {
                this.f14967Lq = new C7002ldr();
            }
            this.f14979bX.m90339bg((DataSetObserver) this.f14967Lq);
            this.f14963Ja = false;
            boolean z = this.sVc;
            this.sVc = true;
            this.f14980bg = this.f14979bX.mo89957bg();
            int i2 = this.f14981eo;
            if (i2 >= 0) {
                m90313bg(i2, false, true);
                this.f14981eo = -1;
                this.f14973VB = null;
                this.f14968PX = null;
            } else if (!z) {
                m90328bX();
            } else {
                requestLayout();
            }
        }
        List<Object> list = this.f14966Ld;
        if (list != null && !list.isEmpty()) {
            int size = this.f14966Ld.size();
            for (int i3 = 0; i3 < size; i3++) {
                this.f14966Ld.get(i3);
            }
        }
    }

    public void setCurrentItem(int i) {
        this.f14963Ja = false;
        m90313bg(i, !this.sVc, false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i <= 0) {
            Log.w("ViewPager", "Requested offscreen page limit " + i + " too small; defaulting to 1");
            i = 1;
        }
        if (i != this.f14972Uw) {
            this.f14972Uw = i;
            m90328bX();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(InterfaceC6999eqN interfaceC6999eqN) {
        this.f14962GZ = interfaceC6999eqN;
    }

    public void setPageMargin(int i) {
        int i2 = this.f14988vb;
        this.f14988vb = i;
        int width = getWidth();
        m90316bg(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.xxp = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    void setScrollState(int i) {
        boolean z;
        if (this.f14960Dt == i) {
            return;
        }
        this.f14960Dt = i;
        if (this.f14989wS != null) {
            if (i != 0) {
                z = true;
            } else {
                z = false;
            }
            m90331IL(z);
        }
        ldr(i);
    }

    public void setScroller(Scroller scroller) {
        this.f14970Ta = scroller;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.xxp) {
            return false;
        }
        return true;
    }

    /* renamed from: com.bytedance.adsdk.ugeno.Kg.bX$bX */
    /* loaded from: classes3.dex */
    public static class C6997bX extends ViewGroup.LayoutParams {

        /* renamed from: IL */
        public int f14995IL;

        /* renamed from: bX */
        float f14996bX;

        /* renamed from: bg */
        public boolean f14997bg;
        boolean eqN;
        int ldr;

        /* renamed from: zx */
        int f14998zx;

        public C6997bX() {
            super(-1, -1);
            this.f14996bX = 0.0f;
        }

        public C6997bX(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f14996bX = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6991bX.f14957IL);
            this.f14995IL = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: bX */
    private static boolean m90326bX(View view) {
        return view.getClass().getAnnotation(InterfaceC6998bg.class) != null;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C6997bX(getContext(), attributeSet);
    }

    /* renamed from: bX */
    private void m90325bX(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(getContext().getResources().getDrawable(i));
    }

    private void ldr(int i) {
        List<InterfaceC6999eqN> list = this.gXn;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.gXn.get(i2);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b9, code lost:
        if (r7 != 2) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c6  */
    /* renamed from: bX */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m90327bX(int r7) {
        /*
            r6 = this;
            android.view.View r0 = r6.findFocus()
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != r6) goto Lb
        L9:
            r0 = r3
            goto L66
        Lb:
            if (r0 == 0) goto L66
            android.view.ViewParent r4 = r0.getParent()
        L11:
            boolean r5 = r4 instanceof android.view.ViewGroup
            if (r5 == 0) goto L1e
            if (r4 != r6) goto L19
            r4 = r1
            goto L1f
        L19:
            android.view.ViewParent r4 = r4.getParent()
            goto L11
        L1e:
            r4 = r2
        L1f:
            if (r4 != 0) goto L66
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r4.append(r5)
            android.view.ViewParent r0 = r0.getParent()
        L35:
            boolean r5 = r0 instanceof android.view.ViewGroup
            if (r5 == 0) goto L4e
            java.lang.String r5 = " => "
            r4.append(r5)
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r4.append(r5)
            android.view.ViewParent r0 = r0.getParent()
            goto L35
        L4e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r5 = "arrowScroll tried to find focus based on non-child current focused view "
            r0.<init>(r5)
            java.lang.String r4 = r4.toString()
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = "ViewPager"
            android.util.Log.e(r4, r0)
            goto L9
        L66:
            android.view.FocusFinder r3 = android.view.FocusFinder.getInstance()
            android.view.View r3 = r3.findNextFocus(r6, r0, r7)
            r4 = 66
            r5 = 17
            if (r3 == 0) goto Lb1
            if (r3 == r0) goto Lb1
            if (r7 != r5) goto L96
            android.graphics.Rect r1 = r6.f14976WR
            android.graphics.Rect r1 = r6.m90311bg(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.f14976WR
            android.graphics.Rect r2 = r6.m90311bg(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto L91
            if (r1 < r2) goto L91
            boolean r2 = r6.eqN()
            goto Lc4
        L91:
            boolean r2 = r3.requestFocus()
            goto Lc4
        L96:
            if (r7 != r4) goto Lc4
            android.graphics.Rect r1 = r6.f14976WR
            android.graphics.Rect r1 = r6.m90311bg(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.f14976WR
            android.graphics.Rect r2 = r6.m90311bg(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto Lac
            if (r1 <= r2) goto Lbb
        Lac:
            boolean r2 = r3.requestFocus()
            goto Lc4
        Lb1:
            if (r7 == r5) goto Lc0
            if (r7 != r1) goto Lb6
            goto Lc0
        Lb6:
            if (r7 == r4) goto Lbb
            r0 = 2
            if (r7 != r0) goto Lc4
        Lbb:
            boolean r2 = r6.m90299zx()
            goto Lc4
        Lc0:
            boolean r2 = r6.eqN()
        Lc4:
            if (r2 == 0) goto Lcd
            int r7 = android.view.SoundEffectConstants.getContantForFocusDirection(r7)
            r6.playSoundEffect(r7)
        Lcd:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.p206Kg.C6991bX.m90327bX(int):boolean");
    }

    /* renamed from: zx */
    boolean m90299zx() {
        AbstractC6990IL abstractC6990IL = this.f14979bX;
        if (abstractC6990IL == null || this.eqN >= abstractC6990IL.mo89957bg() - 1) {
            return false;
        }
        m90315bg(this.eqN + 1, true);
        return true;
    }

    /* renamed from: bg */
    public void m90315bg(int i, boolean z) {
        this.f14963Ja = false;
        m90313bg(i, z, false);
    }

    boolean eqN() {
        int i = this.eqN;
        if (i > 0) {
            m90315bg(i - 1, true);
            return true;
        }
        return false;
    }

    /* renamed from: bg */
    void m90313bg(int i, boolean z, boolean z2) {
        m90312bg(i, z, z2, 0);
    }

    /* renamed from: bg */
    void m90312bg(int i, boolean z, boolean z2, int i2) {
        AbstractC6990IL abstractC6990IL = this.f14979bX;
        if (abstractC6990IL != null && abstractC6990IL.mo89957bg() > 0) {
            if (!z2 && this.eqN == i && this.f14982iR.size() != 0) {
                setScrollingCacheEnabled(false);
                return;
            }
            if (i < 0) {
                i = 0;
            } else if (i >= this.f14979bX.mo89957bg()) {
                i = this.f14979bX.mo89957bg() - 1;
            }
            int i3 = this.f14972Uw;
            int i4 = this.eqN;
            if (i > i4 + i3 || i < i4 - i3) {
                for (int i5 = 0; i5 < this.f14982iR.size(); i5++) {
                    this.f14982iR.get(i5).f14992bX = true;
                }
            }
            boolean z3 = this.eqN != i;
            if (this.sVc) {
                this.eqN = i;
                if (z3) {
                    m90298zx(i);
                }
                requestLayout();
                return;
            }
            m90321bg(i);
            m90314bg(i, z, i2, z3);
            return;
        }
        setScrollingCacheEnabled(false);
    }

    /* renamed from: IL */
    C6995IL m90332IL(View view) {
        while (true) {
            ViewParent parent = view.getParent();
            if (parent != this) {
                if (parent == null || !(parent instanceof View)) {
                    return null;
                }
                view = (View) parent;
            } else {
                return m90308bg(view);
            }
        }
    }

    /* renamed from: IL */
    C6995IL m90334IL(int i) {
        for (int i2 = 0; i2 < this.f14982iR.size(); i2++) {
            C6995IL c6995il = this.f14982iR.get(i2);
            if (c6995il.f14991IL == i) {
                return c6995il;
            }
        }
        return null;
    }

    /* renamed from: IL */
    private void m90333IL(int i, float f, int i2) {
        InterfaceC6999eqN interfaceC6999eqN = this.f14962GZ;
        if (interfaceC6999eqN != null) {
            interfaceC6999eqN.mo89969bg(i, f, i2);
        }
        List<InterfaceC6999eqN> list = this.gXn;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                InterfaceC6999eqN interfaceC6999eqN2 = this.gXn.get(i3);
                if (interfaceC6999eqN2 != null) {
                    interfaceC6999eqN2.mo89969bg(i, f, i2);
                }
            }
        }
        InterfaceC6999eqN interfaceC6999eqN3 = this.bCU;
        if (interfaceC6999eqN3 != null) {
            interfaceC6999eqN3.mo89969bg(i, f, i2);
        }
    }

    /* renamed from: bg */
    private void m90314bg(int i, boolean z, int i2, boolean z2) {
        C6995IL m90334IL = m90334IL(i);
        int clientWidth = m90334IL != null ? (int) (getClientWidth() * Math.max(this.f14961Fy, Math.min(m90334IL.f14994zx, this.f14965LZ))) : 0;
        if (z) {
            m90317bg(clientWidth, 0, i2);
            if (z2) {
                m90298zx(i);
                return;
            }
            return;
        }
        if (z2) {
            m90298zx(i);
        }
        m90304bg(false);
        scrollTo(clientWidth, 0);
        eqN(clientWidth);
    }

    /* renamed from: IL */
    private void m90331IL(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setLayerType(z ? this.cZH : 0, null);
        }
    }

    /* renamed from: IL */
    private boolean m90335IL(float f) {
        boolean z;
        boolean z2;
        float f2 = this.daV - f;
        this.daV = f;
        float scrollX = getScrollX() + f2;
        float clientWidth = getClientWidth();
        float f3 = this.f14961Fy * clientWidth;
        float f4 = this.f14965LZ * clientWidth;
        boolean z3 = false;
        C6995IL c6995il = this.f14982iR.get(0);
        ArrayList<C6995IL> arrayList = this.f14982iR;
        C6995IL c6995il2 = arrayList.get(arrayList.size() - 1);
        if (c6995il.f14991IL != 0) {
            f3 = c6995il.f14994zx * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (c6995il2.f14991IL != this.f14979bX.mo89957bg() - 1) {
            f4 = c6995il2.f14994zx * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f3) {
            if (z) {
                this.f14969RJ.onPull(Math.abs(f3 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (z2) {
                this.txA.onPull(Math.abs(scrollX - f4) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        }
        int i = (int) scrollX;
        this.daV += scrollX - i;
        scrollTo(i, getScrollY());
        eqN(i);
        return z3;
    }

    /* renamed from: bg */
    public void m90305bg(InterfaceC6999eqN interfaceC6999eqN) {
        if (this.gXn == null) {
            this.gXn = new ArrayList();
        }
        this.gXn.add(interfaceC6999eqN);
    }

    /* renamed from: bg */
    public void m90303bg(boolean z, InterfaceC7003zx interfaceC7003zx) {
        m90302bg(z, interfaceC7003zx, 2);
    }

    /* renamed from: bg */
    public void m90302bg(boolean z, InterfaceC7003zx interfaceC7003zx, int i) {
        boolean z2 = interfaceC7003zx != null;
        boolean z3 = z2 != (this.f14989wS != null);
        this.f14989wS = interfaceC7003zx;
        setChildrenDrawingOrderEnabled(z2);
        if (z2) {
            this.zCS = z ? 2 : 1;
            this.cZH = i;
        } else {
            this.zCS = 0;
        }
        if (z3) {
            m90328bX();
        }
    }

    /* renamed from: bg */
    float m90323bg(float f) {
        return (float) Math.sin((f - 0.5f) * 0.47123894f);
    }

    /* renamed from: bg */
    void m90317bg(int i, int i2, int i3) {
        int scrollX;
        int abs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.f14970Ta;
        if ((scroller == null || scroller.isFinished()) ? false : true) {
            scrollX = this.yDt ? this.f14970Ta.getCurrX() : this.f14970Ta.getStartX();
            this.f14970Ta.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            scrollX = getScrollX();
        }
        int i4 = scrollX;
        int scrollY = getScrollY();
        int i5 = i - i4;
        int i6 = i2 - scrollY;
        if (i5 == 0 && i6 == 0) {
            m90304bg(false);
            m90328bX();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i7 = clientWidth / 2;
        float f = clientWidth;
        float f2 = i7;
        float m90323bg = f2 + (m90323bg(Math.min(1.0f, (Math.abs(i5) * 1.0f) / f)) * f2);
        int abs2 = Math.abs(i3);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(m90323bg / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i5) / ((f * this.f14979bX.mo89955bg(this.eqN)) + this.f14988vb)) + 1.0f) * 100.0f);
        }
        int min = Math.min(abs, 600);
        this.yDt = false;
        this.f14970Ta.startScroll(i4, scrollY, i5, i6, min);
        postInvalidateOnAnimation();
    }

    /* renamed from: bg */
    C6995IL m90318bg(int i, int i2) {
        C6995IL c6995il = new C6995IL();
        c6995il.f14991IL = i;
        c6995il.f14993bg = this.f14979bX.mo89951bg((ViewGroup) this, i);
        c6995il.eqN = this.f14979bX.mo89955bg(i);
        if (i2 >= 0 && i2 < this.f14982iR.size()) {
            this.f14982iR.add(i2, c6995il);
        } else {
            this.f14982iR.add(c6995il);
        }
        return c6995il;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
        if (r9 == r10) goto L27;
     */
    /* renamed from: bg */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void m90321bg(int r18) {
        /*
            Method dump skipped, instructions count: 589
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.p206Kg.C6991bX.m90321bg(int):void");
    }

    /* renamed from: bg */
    private void m90306bg(C6995IL c6995il, int i, C6995IL c6995il2) {
        int i2;
        int i3;
        C6995IL c6995il3;
        C6995IL c6995il4;
        int mo89957bg = this.f14979bX.mo89957bg();
        int clientWidth = getClientWidth();
        float f = clientWidth > 0 ? this.f14988vb / clientWidth : 0.0f;
        if (c6995il2 != null) {
            int i4 = c6995il2.f14991IL;
            int i5 = c6995il.f14991IL;
            if (i4 < i5) {
                float f2 = c6995il2.f14994zx + c6995il2.eqN + f;
                int i6 = i4 + 1;
                int i7 = 0;
                while (i6 <= c6995il.f14991IL && i7 < this.f14982iR.size()) {
                    C6995IL c6995il5 = this.f14982iR.get(i7);
                    while (true) {
                        c6995il4 = c6995il5;
                        if (i6 <= c6995il4.f14991IL || i7 >= this.f14982iR.size() - 1) {
                            break;
                        }
                        i7++;
                        c6995il5 = this.f14982iR.get(i7);
                    }
                    while (i6 < c6995il4.f14991IL) {
                        f2 += this.f14979bX.mo89955bg(i6) + f;
                        i6++;
                    }
                    c6995il4.f14994zx = f2;
                    f2 += c6995il4.eqN + f;
                    i6++;
                }
            } else if (i4 > i5) {
                int size = this.f14982iR.size() - 1;
                float f3 = c6995il2.f14994zx;
                while (true) {
                    i4--;
                    if (i4 < c6995il.f14991IL || size < 0) {
                        break;
                    }
                    C6995IL c6995il6 = this.f14982iR.get(size);
                    while (true) {
                        c6995il3 = c6995il6;
                        if (i4 >= c6995il3.f14991IL || size <= 0) {
                            break;
                        }
                        size--;
                        c6995il6 = this.f14982iR.get(size);
                    }
                    while (i4 > c6995il3.f14991IL) {
                        f3 -= this.f14979bX.mo89955bg(i4) + f;
                        i4--;
                    }
                    f3 -= c6995il3.eqN + f;
                    c6995il3.f14994zx = f3;
                }
            }
        }
        int size2 = this.f14982iR.size();
        float f4 = c6995il.f14994zx;
        int i8 = c6995il.f14991IL;
        int i9 = i8 - 1;
        this.f14961Fy = i8 == 0 ? f4 : -3.4028235E38f;
        int i10 = mo89957bg - 1;
        this.f14965LZ = i8 == i10 ? (c6995il.eqN + f4) - 1.0f : Float.MAX_VALUE;
        int i11 = i - 1;
        while (i11 >= 0) {
            C6995IL c6995il7 = this.f14982iR.get(i11);
            while (true) {
                i3 = c6995il7.f14991IL;
                if (i9 <= i3) {
                    break;
                }
                f4 -= this.f14979bX.mo89955bg(i9) + f;
                i9--;
            }
            f4 -= c6995il7.eqN + f;
            c6995il7.f14994zx = f4;
            if (i3 == 0) {
                this.f14961Fy = f4;
            }
            i11--;
            i9--;
        }
        float f5 = c6995il.f14994zx + c6995il.eqN + f;
        int i12 = c6995il.f14991IL + 1;
        int i13 = i + 1;
        while (i13 < size2) {
            C6995IL c6995il8 = this.f14982iR.get(i13);
            while (true) {
                i2 = c6995il8.f14991IL;
                if (i12 >= i2) {
                    break;
                }
                f5 += this.f14979bX.mo89955bg(i12) + f;
                i12++;
            }
            if (i2 == i10) {
                this.f14965LZ = (c6995il8.eqN + f5) - 1.0f;
            }
            c6995il8.f14994zx = f5;
            f5 += c6995il8.eqN + f;
            i13++;
            i12++;
        }
        this.ApA = false;
    }

    /* renamed from: bg */
    C6995IL m90308bg(View view) {
        for (int i = 0; i < this.f14982iR.size(); i++) {
            C6995IL c6995il = this.f14982iR.get(i);
            if (this.f14979bX.mo89952bg(view, c6995il.f14993bg)) {
                return c6995il;
            }
        }
        return null;
    }

    /* renamed from: bg */
    private void m90316bg(int i, int i2, int i3, int i4) {
        if (i2 > 0 && !this.f14982iR.isEmpty()) {
            if (!this.f14970Ta.isFinished()) {
                this.f14970Ta.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)) * (((i - getPaddingLeft()) - getPaddingRight()) + i3)), getScrollY());
                return;
            }
        }
        C6995IL m90334IL = m90334IL(this.eqN);
        int min = (int) ((m90334IL != null ? Math.min(m90334IL.f14994zx, this.f14965LZ) : 0.0f) * ((i - getPaddingLeft()) - getPaddingRight()));
        if (min != getScrollX()) {
            m90304bg(false);
            scrollTo(min, getScrollY());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /* renamed from: bg */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void m90320bg(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.f14984lM
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L6a
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = r1
        L1b:
            if (r7 >= r6) goto L6a
            android.view.View r8 = r12.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            com.bytedance.adsdk.ugeno.Kg.bX$bX r9 = (com.bytedance.adsdk.ugeno.p206Kg.C6991bX.C6997bX) r9
            boolean r10 = r9.f14997bg
            if (r10 == 0) goto L67
            int r9 = r9.f14995IL
            r9 = r9 & 7
            if (r9 == r2) goto L4c
            r10 = 3
            if (r9 == r10) goto L46
            r10 = 5
            if (r9 == r10) goto L39
            r9 = r3
            goto L5b
        L39:
            int r9 = r5 - r4
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r4 = r4 + r10
            goto L58
        L46:
            int r9 = r8.getWidth()
            int r9 = r9 + r3
            goto L5b
        L4c:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r3)
        L58:
            r11 = r9
            r9 = r3
            r3 = r11
        L5b:
            int r3 = r3 + r0
            int r10 = r8.getLeft()
            int r3 = r3 - r10
            if (r3 == 0) goto L66
            r8.offsetLeftAndRight(r3)
        L66:
            r3 = r9
        L67:
            int r7 = r7 + 1
            goto L1b
        L6a:
            r12.m90333IL(r13, r14, r15)
            com.bytedance.adsdk.ugeno.Kg.bX$zx r13 = r12.f14989wS
            if (r13 == 0) goto L9d
            int r13 = r12.getScrollX()
            int r14 = r12.getChildCount()
        L79:
            if (r1 >= r14) goto L9d
            android.view.View r15 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            com.bytedance.adsdk.ugeno.Kg.bX$bX r0 = (com.bytedance.adsdk.ugeno.p206Kg.C6991bX.C6997bX) r0
            boolean r0 = r0.f14997bg
            if (r0 != 0) goto L9a
            int r0 = r15.getLeft()
            int r0 = r0 - r13
            float r0 = (float) r0
            int r3 = r12.getClientWidth()
            float r3 = (float) r3
            float r0 = r0 / r3
            com.bytedance.adsdk.ugeno.Kg.bX$zx r3 = r12.f14989wS
            r3.mo89983bg(r15, r0)
        L9a:
            int r1 = r1 + 1
            goto L79
        L9d:
            r12.GvG = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.p206Kg.C6991bX.m90320bg(int, float, int):void");
    }

    /* renamed from: bg */
    private void m90304bg(boolean z) {
        boolean z2 = this.f14960Dt == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.f14970Ta.isFinished()) {
                this.f14970Ta.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f14970Ta.getCurrX();
                int currY = this.f14970Ta.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        eqN(currX);
                    }
                }
            }
        }
        this.f14963Ja = false;
        for (int i = 0; i < this.f14982iR.size(); i++) {
            C6995IL c6995il = this.f14982iR.get(i);
            if (c6995il.f14992bX) {
                c6995il.f14992bX = false;
                z2 = true;
            }
        }
        if (z2) {
            if (z) {
                postOnAnimation(this.RiO);
            } else {
                this.RiO.run();
            }
        }
    }

    /* renamed from: bg */
    private boolean m90322bg(float f, float f2) {
        if (f >= this.f14975VW || f2 <= 0.0f) {
            return f > ((float) (getWidth() - this.f14975VW)) && f2 < 0.0f;
        }
        return true;
    }

    /* renamed from: bg */
    private int m90319bg(int i, float f, int i2, int i3) {
        if (Math.abs(i3) <= this.f14978bN || Math.abs(i2) <= this.f14985qC) {
            i += (int) (f + (i >= this.eqN ? 0.4f : 0.6f));
        } else if (i2 <= 0) {
            i++;
        }
        if (this.f14982iR.size() > 0) {
            ArrayList<C6995IL> arrayList = this.f14982iR;
            return Math.max(this.f14982iR.get(0).f14991IL, Math.min(i, arrayList.get(arrayList.size() - 1).f14991IL));
        }
        return i;
    }

    /* renamed from: bg */
    private void m90309bg(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.CQc) {
            int i = actionIndex == 0 ? 1 : 0;
            this.daV = motionEvent.getX(i);
            this.CQc = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f14987uu;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: bg */
    protected boolean m90307bg(View view, boolean z, int i, int i2, int i3) {
        int i4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && m90307bg(childAt, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z && view.canScrollHorizontally(-i);
    }

    /* renamed from: bg */
    public boolean m90310bg(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 21) {
                if (keyEvent.hasModifiers(2)) {
                    return eqN();
                }
                return m90327bX(17);
            } else if (keyCode == 22) {
                if (keyEvent.hasModifiers(2)) {
                    return m90299zx();
                }
                return m90327bX(66);
            } else if (keyCode == 61) {
                if (keyEvent.hasNoModifiers()) {
                    return m90327bX(2);
                }
                if (keyEvent.hasModifiers(1)) {
                    return m90327bX(1);
                }
            }
        }
        return false;
    }

    /* renamed from: bg */
    private Rect m90311bg(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }
}
