package sg.bigo.ads.common.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import sg.bigo.ads.common.C43746p;
import sg.bigo.ads.common.p911e.C43612a;
import sg.bigo.ads.common.p932t.C43782a;

/* loaded from: classes10.dex */
public class ViewFlow extends AbstractC43871a {

    /* renamed from: s */
    private static final Interpolator f114796s = new Interpolator() { // from class: sg.bigo.ads.common.view.ViewFlow.1
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };

    /* renamed from: A */
    private float f114797A;

    /* renamed from: B */
    private float f114798B;

    /* renamed from: C */
    private int f114799C;

    /* renamed from: D */
    private VelocityTracker f114800D;

    /* renamed from: E */
    private int f114801E;

    /* renamed from: F */
    private int f114802F;

    /* renamed from: G */
    private int f114803G;

    /* renamed from: H */
    private int f114804H;

    /* renamed from: I */
    private boolean f114805I;

    /* renamed from: J */
    private final Runnable f114806J;

    /* renamed from: K */
    private int f114807K;

    /* renamed from: L */
    private boolean f114808L;

    /* renamed from: M */
    private boolean f114809M;

    /* renamed from: a */
    protected int f114810a;

    /* renamed from: b */
    protected int f114811b;

    /* renamed from: c */
    protected int f114812c;

    /* renamed from: d */
    protected int f114813d;

    /* renamed from: e */
    protected View f114814e;

    /* renamed from: f */
    protected View f114815f;

    /* renamed from: g */
    public boolean f114816g;

    /* renamed from: h */
    public boolean f114817h;

    /* renamed from: i */
    protected int f114818i;

    /* renamed from: j */
    protected int f114819j;

    /* renamed from: k */
    private final C43863a f114820k;

    /* renamed from: l */
    private int f114821l;

    /* renamed from: m */
    private int f114822m;

    /* renamed from: n */
    private int f114823n;

    /* renamed from: o */
    private InterfaceC43870d f114824o;

    /* renamed from: p */
    private InterfaceC43870d f114825p;

    /* renamed from: q */
    private C43746p f114826q;

    /* renamed from: r */
    private boolean f114827r;

    /* renamed from: t */
    private Scroller f114828t;

    /* renamed from: u */
    private boolean f114829u;

    /* renamed from: v */
    private boolean f114830v;

    /* renamed from: w */
    private boolean f114831w;

    /* renamed from: x */
    private int f114832x;

    /* renamed from: y */
    private float f114833y;

    /* renamed from: z */
    private float f114834z;

    /* renamed from: sg.bigo.ads.common.view.ViewFlow$a */
    /* loaded from: classes10.dex */
    static class C43863a implements InterfaceC43869c {

        /* renamed from: a */
        InterfaceC43869c f114838a;

        /* renamed from: b */
        int f114839b;

        /* renamed from: c */
        private final ViewFlow f114840c;

        private C43863a(ViewFlow viewFlow) {
            this.f114839b = 0;
            this.f114840c = viewFlow;
        }

        @Override // sg.bigo.ads.common.view.ViewFlow.InterfaceC43869c
        /* renamed from: a */
        public final void mo4734a(final int i) {
            this.f114840c.post(new Runnable() { // from class: sg.bigo.ads.common.view.ViewFlow.a.3
                @Override // java.lang.Runnable
                public final void run() {
                    C43863a c43863a = C43863a.this;
                    int i2 = c43863a.f114839b;
                    int i3 = i;
                    if (i2 == i3) {
                        return;
                    }
                    c43863a.f114839b = i3;
                    InterfaceC43869c interfaceC43869c = c43863a.f114838a;
                    if (interfaceC43869c != null) {
                        interfaceC43869c.mo4734a(i3);
                    }
                }
            });
        }

        /* synthetic */ C43863a(ViewFlow viewFlow, byte b) {
            this(viewFlow);
        }

        @Override // sg.bigo.ads.common.view.ViewFlow.InterfaceC43869c
        /* renamed from: a */
        public final void mo4733a(final int i, final int i2) {
            this.f114840c.post(new Runnable() { // from class: sg.bigo.ads.common.view.ViewFlow.a.4
                @Override // java.lang.Runnable
                public final void run() {
                    InterfaceC43869c interfaceC43869c = C43863a.this.f114838a;
                    if (interfaceC43869c != null) {
                        interfaceC43869c.mo4733a(i, i2);
                    }
                }
            });
        }

        @Override // sg.bigo.ads.common.view.ViewFlow.InterfaceC43869c
        /* renamed from: a */
        public final void mo4732a(@NonNull final View view, final int i) {
            this.f114840c.post(new Runnable() { // from class: sg.bigo.ads.common.view.ViewFlow.a.2
                @Override // java.lang.Runnable
                public final void run() {
                    InterfaceC43869c interfaceC43869c = C43863a.this.f114838a;
                    if (interfaceC43869c != null) {
                        interfaceC43869c.mo4732a(view, i);
                    }
                }
            });
        }

        @Override // sg.bigo.ads.common.view.ViewFlow.InterfaceC43869c
        /* renamed from: a */
        public final void mo4731a(@NonNull final View view, final int i, final float f) {
            this.f114840c.post(new Runnable() { // from class: sg.bigo.ads.common.view.ViewFlow.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    InterfaceC43869c interfaceC43869c = C43863a.this.f114838a;
                    if (interfaceC43869c != null) {
                        interfaceC43869c.mo4731a(view, i, f);
                    }
                }
            });
        }
    }

    /* renamed from: sg.bigo.ads.common.view.ViewFlow$b */
    /* loaded from: classes10.dex */
    public static class C43868b extends ViewGroup.LayoutParams {

        /* renamed from: a */
        public int f114853a;

        /* renamed from: b */
        public int f114854b;

        /* renamed from: c */
        public boolean f114855c;

        /* renamed from: d */
        public int f114856d;

        /* renamed from: e */
        public int f114857e;

        public C43868b() {
            this((byte) 0);
        }

        private C43868b(byte b) {
            super(-1, -1);
            this.f114857e = 17;
        }
    }

    /* renamed from: sg.bigo.ads.common.view.ViewFlow$c */
    /* loaded from: classes10.dex */
    public interface InterfaceC43869c {
        /* renamed from: a */
        void mo4734a(int i);

        /* renamed from: a */
        void mo4733a(int i, int i2);

        /* renamed from: a */
        void mo4732a(@NonNull View view, int i);

        /* renamed from: a */
        void mo4731a(@NonNull View view, int i, float f);
    }

    /* renamed from: sg.bigo.ads.common.view.ViewFlow$d */
    /* loaded from: classes10.dex */
    public interface InterfaceC43870d {
        /* renamed from: a */
        void mo4730a();
    }

    public ViewFlow(Context context) {
        this(context, null);
    }

    /* renamed from: b */
    private static float m4743b(float f) {
        return (float) Math.sin((f - 0.5f) * 0.47123894f);
    }

    /* renamed from: c */
    private void m4741c(@IntRange(from = 0) int i) {
        m4748a(i, true, -20);
    }

    /* renamed from: f */
    private boolean m4739f() {
        int i = this.f114812c;
        if (i != 2 && i != 3) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    private boolean m4738g() {
        this.f114799C = -1;
        m4736i();
        return true;
    }

    private int getScrollRange() {
        return Math.max(0, this.f114823n - getMeasuredWidth());
    }

    /* renamed from: h */
    private void m4737h() {
        this.f114817h = false;
        this.f114830v = true;
    }

    /* renamed from: i */
    private void m4736i() {
        this.f114830v = false;
        this.f114831w = false;
        this.f114817h = false;
        VelocityTracker velocityTracker = this.f114800D;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f114800D = null;
        }
    }

    /* renamed from: j */
    private void m4735j() {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    /* renamed from: a */
    public final int m4746a(View view) {
        if (view == null) {
            return -1;
        }
        List<View> items = getItems();
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i) == view) {
                return i;
            }
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (i < 0) {
            View childAt = getChildAt(getChildCount() - 1);
            if (childAt != null && childAt == this.f114815f) {
                i = getChildCount() - 1;
            }
        } else {
            View childAt2 = getChildAt(0);
            if (childAt2 != null && childAt2 == this.f114814e) {
                i++;
            }
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof C43868b) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public void computeScroll() {
        this.f114829u = true;
        if (!this.f114828t.isFinished() && this.f114828t.computeScrollOffset()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.f114828t.getCurrX();
            int currY = this.f114828t.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
            }
            C43612a.m5313a(this);
            return;
        }
        m4744a(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        this.f114816g = true;
        if (!this.f114809M) {
            onTouchEvent(motionEvent);
        }
        return dispatchTouchEvent;
    }

    /* renamed from: e */
    public final boolean m4740e() {
        int i = this.f114823n;
        View view = this.f114814e;
        if (view != null) {
            i -= view.getRight();
        }
        View view2 = this.f114815f;
        if (view2 != null) {
            i -= view2.getMeasuredWidth();
        }
        if (getWidth() >= i) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C43868b();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public int getContentMaxWidthSpace() {
        return this.f114813d;
    }

    @IntRange(from = 0)
    public int getCurrentItem() {
        return this.f114810a;
    }

    @IntRange(from = 0)
    public int getItemCount() {
        return this.f114811b;
    }

    @NonNull
    public List<View> getItems() {
        ArrayList arrayList = new ArrayList();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt != this.f114814e && childAt != this.f114815f) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    public InterfaceC43869c getOnItemChangeListener() {
        return this.f114820k.f114838a;
    }

    public int getViewStyle() {
        return this.f114812c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // sg.bigo.ads.common.view.AbstractC43871a, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f114805I = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // sg.bigo.ads.common.view.AbstractC43871a, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f114806J);
        Scroller scroller = this.f114828t;
        if (scroller != null && !scroller.isFinished()) {
            this.f114828t.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f;
        boolean z;
        boolean z2;
        this.f114809M = false;
        if (this.f114827r) {
            return false;
        }
        int action = motionEvent.getAction() & 255;
        if (action != 3 && action != 1) {
            if (action != 0) {
                if (this.f114830v) {
                    return true;
                }
                if (this.f114831w) {
                    return false;
                }
            }
            if (action != 0) {
                if (action != 2) {
                    if (action == 6) {
                        m4747a(motionEvent);
                    }
                } else {
                    int i = this.f114799C;
                    if (i != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i);
                        float x = motionEvent.getX(findPointerIndex);
                        float f2 = x - this.f114833y;
                        float abs = Math.abs(f2);
                        float y = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y - this.f114798B);
                        int i2 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
                        if (i2 != 0) {
                            float f3 = this.f114833y;
                            if ((f3 < this.f114819j && i2 > 0) || (f3 > getWidth() - this.f114819j && f2 < 0.0f)) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!z) {
                                if (getWidth() < this.f114823n) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (z2) {
                                    this.f114833y = x;
                                    this.f114834z = y;
                                    this.f114831w = true;
                                    return false;
                                }
                            }
                        }
                        int i3 = this.f114832x;
                        if (abs > i3 && abs * 0.5f > abs2) {
                            m4737h();
                            m4735j();
                            setScrollState(1);
                            float f4 = this.f114797A;
                            float f5 = this.f114832x;
                            if (i2 > 0) {
                                f = f4 + f5;
                            } else {
                                f = f4 - f5;
                            }
                            this.f114833y = f;
                            this.f114834z = y;
                        } else if (abs2 > i3) {
                            this.f114831w = true;
                        }
                        if (this.f114830v) {
                            m4751a(x);
                        }
                    }
                }
            } else {
                float x2 = motionEvent.getX();
                this.f114797A = x2;
                this.f114833y = x2;
                float y2 = motionEvent.getY();
                this.f114798B = y2;
                this.f114834z = y2;
                this.f114799C = motionEvent.getPointerId(0);
                this.f114831w = false;
                this.f114829u = true;
                this.f114828t.computeScrollOffset();
                if (this.f114807K == 2 && Math.abs(this.f114828t.getFinalX() - this.f114828t.getCurrX()) > this.f114804H) {
                    this.f114828t.abortAnimation();
                    m4737h();
                    m4735j();
                    setScrollState(1);
                } else {
                    m4744a(false);
                    this.f114830v = false;
                }
            }
            if (this.f114800D == null) {
                this.f114800D = VelocityTracker.obtain();
            }
            this.f114800D.addMovement(motionEvent);
            return this.f114830v;
        }
        m4738g();
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ce  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onLayout(boolean r8, int r9, int r10, int r11, int r12) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.common.view.ViewFlow.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        C43746p c43746p;
        int i3;
        int makeMeasureSpec;
        int makeMeasureSpec2;
        C43746p m5066a;
        C43746p c43746p2;
        C43868b c43868b;
        int i4;
        int i5 = 0;
        setMeasuredDimension(View.getDefaultSize(0, i), View.getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        this.f114819j = Math.min(measuredWidth / 10, this.f114818i);
        int measuredWidth2 = getMeasuredWidth() - (this.f114813d * 2);
        int childCount = getChildCount();
        int i6 = 0;
        while (true) {
            if (i6 >= childCount) {
                break;
            }
            View childAt = getChildAt(i6);
            if (childAt != this.f114814e && childAt != this.f114815f && (c43868b = (C43868b) childAt.getLayoutParams()) != null && c43868b.f114855c) {
                int i7 = c43868b.f114853a;
                if (i7 > 0 && (i4 = c43868b.f114854b) > 0) {
                    c43746p = C43746p.m5066a(i7, i4, measuredWidth2, measuredHeight);
                }
            } else {
                i6++;
            }
        }
        c43746p = null;
        if (c43746p == null && (c43746p2 = this.f114826q) != null) {
            c43746p = C43746p.m5066a(c43746p2.f114477a, c43746p2.f114478b, measuredWidth2, measuredHeight);
        }
        this.f114810a = Math.min(Math.max(0, this.f114810a), this.f114811b - 1);
        int i8 = 0;
        while (i8 < childCount) {
            View childAt2 = getChildAt(i8);
            if (childAt2 != this.f114814e && childAt2 != this.f114815f) {
                C43868b c43868b2 = (C43868b) childAt2.getLayoutParams();
                if (c43868b2 != null) {
                    int i9 = c43868b2.f114853a;
                    int i10 = c43868b2.f114854b;
                    if (this.f114812c == Integer.MIN_VALUE) {
                        m5066a = new C43746p((int) (((measuredHeight * 1.0f) * i9) / i10), measuredHeight);
                    } else {
                        int i11 = c43868b2.f114856d;
                        if (i11 == 1 || i11 == 2) {
                            if (i11 == 2 && c43746p != null) {
                                m5066a = c43746p;
                            } else if (i9 > 0 && i10 > 0) {
                                m5066a = C43746p.m5066a(i9, i10, measuredWidth2, measuredHeight);
                            }
                        }
                        m5066a = new C43746p(measuredWidth2, measuredHeight);
                    }
                    int i12 = m5066a.f114477a;
                    ((ViewGroup.LayoutParams) c43868b2).width = i12;
                    ((ViewGroup.LayoutParams) c43868b2).height = m5066a.f114478b;
                    i3 = 0;
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, i12), 1073741824);
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.max(0, ((ViewGroup.LayoutParams) c43868b2).height), 1073741824);
                } else {
                    i3 = i5;
                    i8++;
                    i5 = i3;
                }
            } else {
                i3 = i5;
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), i3);
                makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), i3);
            }
            childAt2.measure(makeMeasureSpec, makeMeasureSpec2);
            i8++;
            i5 = i3;
        }
    }

    @Override // android.view.View
    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        float f;
        int measuredWidth;
        float left;
        boolean z;
        super.onScrollChanged(i, i2, i3, i4);
        View childAt = getChildAt(0);
        if (childAt != null && childAt == this.f114814e) {
            i5 = Math.max(childAt.getRight(), i);
            i6 = 1;
        } else {
            i5 = i;
            i6 = 0;
        }
        int childCount = getChildCount();
        View childAt2 = getChildAt(childCount - 1);
        if (childAt2 != null && childAt2 == this.f114815f) {
            i5 = Math.min(childAt2.getLeft() - getMeasuredWidth(), i5);
            childCount--;
        }
        if (m4739f()) {
            f = i5 + ((getMeasuredWidth() * 1.0f) / 2.0f);
        } else {
            f = i5 + this.f114813d;
        }
        View childAt3 = getChildAt(this.f114810a + i6);
        if (childAt3 != null && childAt3.getMeasuredWidth() > 0) {
            measuredWidth = childAt3.getMeasuredWidth();
        } else {
            measuredWidth = getMeasuredWidth() - (this.f114813d * 2);
        }
        C43782a.m5008a("ViewFlow", "computeScrollOffset, ----- begin -----");
        for (int i7 = i6; i7 < childCount; i7++) {
            View childAt4 = getChildAt(i7);
            if (childAt4 != null) {
                if (m4739f()) {
                    left = (int) (((childAt4.getLeft() + ((childAt4.getMeasuredWidth() * 1.0f) / 2.0f)) - f) + 0.5f);
                } else {
                    left = childAt4.getLeft() - f;
                }
                float max = Math.max(-1.0f, Math.min(1.0f, left / measuredWidth));
                int i8 = i7 - i6;
                if (childAt4.getLeft() < f && childAt4.getRight() > f) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    this.f114821l = i8;
                }
                this.f114820k.mo4731a(childAt4, i8, max);
                if (max == 0.0f && this.f114810a != i8) {
                    this.f114810a = i8;
                    this.f114821l = i8;
                    this.f114820k.mo4732a(childAt4, i8);
                }
            }
        }
        C43782a.m5008a("ViewFlow", "computeScrollOffset, ----- end -----");
        C43863a c43863a = this.f114820k;
        if (c43863a != null) {
            c43863a.mo4733a(i, getScrollRange());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x0212, code lost:
        if (r1 != null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0214, code lost:
        r1.mo4730a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0239, code lost:
        if (r1 != null) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:134:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0160  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.common.view.ViewFlow.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view != this.f114815f && view != this.f114814e && view != null) {
            this.f114811b++;
        }
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view != this.f114815f && view != this.f114814e && view != null) {
            this.f114811b--;
        }
    }

    public void setContentMaxWidthSpace(int i) {
        int max = Math.max(0, i);
        if (this.f114813d != max) {
            this.f114813d = max;
            requestLayout();
        }
    }

    public void setDividerWidth(int i) {
        int max = Math.max(0, i);
        if (this.f114822m != max) {
            this.f114822m = max;
            if (this.f114812c != 3) {
                requestLayout();
            }
        }
    }

    public void setEndView(View view) {
        View view2 = this.f114815f;
        if (view != view2) {
            if (view2 != null) {
                removeView(view2);
            }
            this.f114815f = view;
            if (view != null) {
                addView(view);
            }
            requestLayout();
        }
    }

    public void setMainChildSize(C43746p c43746p) {
        this.f114826q = c43746p;
    }

    public void setOnEndViewShowListener(InterfaceC43870d interfaceC43870d) {
        this.f114825p = interfaceC43870d;
    }

    public void setOnItemChangeListener(InterfaceC43869c interfaceC43869c) {
        this.f114820k.f114838a = interfaceC43869c;
    }

    public void setOnStartViewShowListener(InterfaceC43870d interfaceC43870d) {
        this.f114824o = interfaceC43870d;
    }

    public void setScrollEnabled(boolean z) {
        this.f114827r = z;
    }

    void setScrollState(int i) {
        if (this.f114807K == i) {
            return;
        }
        this.f114807K = i;
    }

    public void setStartView(View view) {
        View view2 = this.f114814e;
        if (view != view2) {
            if (view2 != null) {
                removeView(view2);
            }
            this.f114814e = view;
            if (view != null) {
                addView(view, 0);
            }
            requestLayout();
        }
    }

    public void setViewStyle(int i) {
        if (this.f114812c != i) {
            this.f114812c = i;
            requestLayout();
        }
    }

    public ViewFlow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f114820k = new C43863a(this, (byte) 0);
        this.f114810a = 0;
        this.f114811b = 0;
        this.f114821l = 0;
        this.f114812c = 3;
        this.f114827r = true;
        this.f114816g = false;
        this.f114817h = false;
        this.f114799C = -1;
        this.f114805I = true;
        this.f114806J = new Runnable() { // from class: sg.bigo.ads.common.view.ViewFlow.2
            @Override // java.lang.Runnable
            public final void run() {
                ViewFlow.this.setScrollState(0);
            }
        };
        this.f114807K = 0;
        this.f114809M = false;
        removeAllViews();
        setFocusable(true);
        setOverScrollMode(2);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        Context context2 = getContext();
        this.f114828t = new Scroller(context2, f114796s);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        float f = context2.getResources().getDisplayMetrics().density;
        this.f114832x = viewConfiguration.getScaledPagingTouchSlop();
        this.f114801E = (int) (400.0f * f);
        this.f114802F = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f114803G = (int) (25.0f * f);
        this.f114804H = (int) (2.0f * f);
        this.f114818i = (int) (f * 16.0f);
    }

    @Nullable
    /* renamed from: a */
    public final View m4750a(int i) {
        List<View> items = getItems();
        if (i < 0 || i >= items.size()) {
            return null;
        }
        return items.get(i);
    }

    /* renamed from: b */
    public final void m4742b(int i) {
        this.f114810a = i;
        if (this.f114805I) {
            requestLayout();
        } else {
            m4741c(i);
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    @Override // sg.bigo.ads.common.view.AbstractC43871a
    /* renamed from: a */
    protected final void mo4728a() {
        int i;
        int itemCount = getItemCount();
        if (itemCount <= 1) {
            return;
        }
        int currentItem = getCurrentItem();
        if (!this.f114808L) {
            if (currentItem != itemCount - 1) {
                View view = this.f114815f;
                int i2 = this.f114823n;
                if (view != null) {
                    i2 -= view.getMeasuredWidth();
                }
                if (!(getScrollX() + getMeasuredWidth() >= i2)) {
                    i = currentItem + 1;
                }
            }
            i = currentItem - 1;
            this.f114808L = true;
        } else if (currentItem == 0) {
            i = currentItem + 1;
            this.f114808L = false;
        } else {
            i = currentItem - 1;
        }
        m4741c(i);
    }

    @Override // sg.bigo.ads.common.view.AbstractC43871a
    /* renamed from: b */
    protected final boolean mo4725b() {
        return !this.f114830v;
    }

    /* renamed from: a */
    private void m4749a(int i, int i2) {
        int scrollX;
        if (this.f114811b == 0) {
            return;
        }
        Scroller scroller = this.f114828t;
        if ((scroller == null || scroller.isFinished()) ? false : true) {
            scrollX = this.f114829u ? this.f114828t.getCurrX() : this.f114828t.getStartX();
            this.f114828t.abortAnimation();
        } else {
            scrollX = getScrollX();
        }
        int i3 = scrollX;
        int scrollY = getScrollY();
        int i4 = i - i3;
        int i5 = 0 - scrollY;
        if (i4 == 0 && i5 == 0) {
            m4744a(false);
            setScrollState(0);
            return;
        }
        setScrollState(2);
        int measuredWidth = getMeasuredWidth();
        float f = measuredWidth / 2;
        float m4743b = f + (m4743b(Math.min(1.0f, (Math.abs(i4) * 1.0f) / measuredWidth)) * f);
        int abs = Math.abs(i2);
        int min = Math.min(abs > 0 ? Math.round(Math.abs(m4743b / abs) * 1000.0f) * 4 : (int) (((Math.abs(i4) / getChildAt(this.f114810a).getWidth()) + 1.0f) * 100.0f), 600);
        this.f114829u = false;
        this.f114828t.startScroll(i3, scrollY, i4, i5, min);
        C43612a.m5313a(this);
    }

    /* renamed from: a */
    private void m4748a(@IntRange(from = 0) int i, boolean z, int i2) {
        int i3;
        int measuredWidth;
        if (this.f114811b <= 0) {
            return;
        }
        int min = Math.min(Math.max(0, i), this.f114811b - 1);
        View childAt = getChildAt(0);
        if (childAt != null && childAt == this.f114814e) {
            min++;
        }
        View childAt2 = getChildAt(min);
        int left = childAt2 != null ? m4739f() ? childAt2.getLeft() - ((getMeasuredWidth() - childAt2.getMeasuredWidth()) / 2) : childAt2.getLeft() - Math.max(this.f114813d, this.f114822m) : 0;
        if (getChildAt(getChildCount() - 1) != null) {
            if (this.f114815f != null) {
                i3 = this.f114823n - getMeasuredWidth();
                measuredWidth = this.f114815f.getMeasuredWidth();
            } else {
                i3 = this.f114823n;
                measuredWidth = getMeasuredWidth();
            }
            left = (int) Math.max(0.0f, Math.min(left, i3 - measuredWidth));
        }
        if (left == getScrollX()) {
            return;
        }
        if (z) {
            m4749a(left, i2);
            return;
        }
        m4744a(false);
        scrollTo(left, 0);
    }

    /* renamed from: a */
    private void m4747a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f114799C) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f114833y = motionEvent.getX(i);
            this.f114799C = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f114800D;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m4745a(ViewFlow viewFlow) {
        int scrollX = viewFlow.getScrollX();
        if (viewFlow.f114814e != null) {
            View childAt = viewFlow.getChildAt(0);
            View view = viewFlow.f114814e;
            if (childAt == view && scrollX < view.getRight()) {
                viewFlow.m4741c(0);
                return;
            }
        }
        if (viewFlow.f114815f != null) {
            View childAt2 = viewFlow.getChildAt(viewFlow.getChildCount() - 1);
            View view2 = viewFlow.f114815f;
            if (childAt2 != view2 || scrollX <= view2.getLeft() - viewFlow.getMeasuredWidth()) {
                return;
            }
            viewFlow.m4741c(viewFlow.getItemCount() - 1);
        }
    }

    /* renamed from: a */
    private void m4744a(boolean z) {
        boolean z2 = this.f114807K == 2;
        if (z2 && (!this.f114828t.isFinished())) {
            this.f114828t.abortAnimation();
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.f114828t.getCurrX();
            int currY = this.f114828t.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
            }
        }
        if (z2) {
            if (z) {
                C43612a.m5310a(this, this.f114806J);
            } else {
                this.f114806J.run();
            }
        }
    }

    /* renamed from: a */
    private boolean m4751a(float f) {
        float f2 = this.f114833y - f;
        this.f114833y = f;
        float max = Math.max(0.0f, Math.min(getScrollX() + f2, getScrollRange()));
        C43782a.m5007b("ViewFlow", "performDrag, getScrollRange()=" + getScrollRange() + ", scrollX=" + max);
        int i = (int) max;
        this.f114833y = this.f114833y + (max - ((float) i));
        scrollTo(i, getScrollY());
        return false;
    }
}
