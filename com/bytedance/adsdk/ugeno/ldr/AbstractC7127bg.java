package com.bytedance.adsdk.ugeno.ldr;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.adsdk.ugeno.ldr.p223IL.C7125bg;
import com.bytedance.adsdk.ugeno.ldr.p224bg.C7132bg;
import com.bytedance.adsdk.ugeno.p206Kg.AbstractC6990IL;
import com.bytedance.adsdk.ugeno.p206Kg.C6991bX;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.bytedance.adsdk.ugeno.ldr.bg */
/* loaded from: classes3.dex */
public abstract class AbstractC7127bg<T> extends FrameLayout implements C6991bX.InterfaceC6999eqN {

    /* renamed from: Fy */
    private final Runnable f15298Fy;

    /* renamed from: IL */
    protected C6991bX f15299IL;

    /* renamed from: Kg */
    private String f15300Kg;

    /* renamed from: LZ */
    private final Runnable f15301LZ;

    /* renamed from: Lq */
    private int f15302Lq;

    /* renamed from: PX */
    private boolean f15303PX;

    /* renamed from: Ta */
    private boolean f15304Ta;

    /* renamed from: VB */
    private boolean f15305VB;
    private C7131bg VzQ;

    /* renamed from: WR */
    private float f15306WR;

    /* renamed from: bX */
    private int f15307bX;

    /* renamed from: bg */
    protected List<T> f15308bg;

    /* renamed from: eo */
    private boolean f15309eo;
    private int eqN;

    /* renamed from: iR */
    private int f15310iR;
    private int ldr;
    private InterfaceC7126bX tuV;

    /* renamed from: vb */
    private int f15311vb;
    private C7132bg xxp;
    private int yDt;

    /* renamed from: zx */
    private int f15312zx;

    /* renamed from: com.bytedance.adsdk.ugeno.ldr.bg$IL */
    /* loaded from: classes3.dex */
    class C7130IL extends C6991bX {
        public C7130IL(Context context) {
            super(context);
        }

        @Override // com.bytedance.adsdk.ugeno.p206Kg.C6991bX, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (AbstractC7127bg.this.f15304Ta) {
                try {
                    return super.onInterceptTouchEvent(motionEvent);
                } catch (IllegalArgumentException unused) {
                    return false;
                }
            }
            return false;
        }

        @Override // com.bytedance.adsdk.ugeno.p206Kg.C6991bX, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (AbstractC7127bg.this.f15304Ta) {
                try {
                    return super.onTouchEvent(motionEvent);
                } catch (IllegalArgumentException unused) {
                    return false;
                }
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.bytedance.adsdk.ugeno.ldr.bg$bg */
    /* loaded from: classes3.dex */
    public class C7131bg extends AbstractC6990IL {
        C7131bg() {
        }

        @Override // com.bytedance.adsdk.ugeno.p206Kg.AbstractC6990IL
        /* renamed from: bg */
        public int mo89949bg(Object obj) {
            return -2;
        }

        @Override // com.bytedance.adsdk.ugeno.p206Kg.AbstractC6990IL
        /* renamed from: bg */
        public boolean mo89952bg(View view, Object obj) {
            return view == obj;
        }

        @Override // com.bytedance.adsdk.ugeno.p206Kg.AbstractC6990IL
        /* renamed from: bg */
        public int mo89957bg() {
            if (AbstractC7127bg.this.f15303PX) {
                return Integer.MAX_VALUE;
            }
            return AbstractC7127bg.this.f15308bg.size();
        }

        @Override // com.bytedance.adsdk.ugeno.p206Kg.AbstractC6990IL
        /* renamed from: bg */
        public Object mo89951bg(ViewGroup viewGroup, int i) {
            View m89968bg = AbstractC7127bg.this.m89968bg(i, C7133eqN.m89947bg(AbstractC7127bg.this.f15303PX, i, AbstractC7127bg.this.f15308bg.size()));
            viewGroup.addView(m89968bg);
            return m89968bg;
        }

        @Override // com.bytedance.adsdk.ugeno.p206Kg.AbstractC6990IL
        /* renamed from: bg */
        public void mo89950bg(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // com.bytedance.adsdk.ugeno.p206Kg.AbstractC6990IL
        /* renamed from: bg */
        public float mo89955bg(int i) {
            if (AbstractC7127bg.this.f15306WR <= 0.0f) {
                return 1.0f;
            }
            return 1.0f / AbstractC7127bg.this.f15306WR;
        }
    }

    public AbstractC7127bg(Context context) {
        super(context);
        this.f15308bg = new CopyOnWriteArrayList();
        this.f15307bX = 2000;
        this.eqN = 500;
        this.f15312zx = 10;
        this.ldr = -1;
        this.f15310iR = -1;
        this.f15300Kg = "normal";
        this.f15306WR = 1.0f;
        this.f15309eo = true;
        this.f15305VB = true;
        this.f15303PX = true;
        this.f15304Ta = true;
        this.yDt = 0;
        this.f15302Lq = 0;
        this.f15311vb = 0;
        this.f15298Fy = new Runnable() { // from class: com.bytedance.adsdk.ugeno.ldr.bg.1
            @Override // java.lang.Runnable
            public void run() {
                int currentItem = AbstractC7127bg.this.f15299IL.getCurrentItem() + 1;
                if (AbstractC7127bg.this.f15303PX) {
                    if (currentItem >= Integer.MAX_VALUE) {
                        AbstractC7127bg.this.f15299IL.m90315bg(1073741823, false);
                    } else {
                        AbstractC7127bg.this.f15299IL.m90315bg(currentItem, true);
                    }
                } else if (currentItem >= AbstractC7127bg.this.f15299IL.getAdapter().mo89957bg()) {
                    AbstractC7127bg.this.f15299IL.m90315bg(0, false);
                } else {
                    AbstractC7127bg.this.f15299IL.m90315bg(currentItem, true);
                }
            }
        };
        this.f15301LZ = new Runnable() { // from class: com.bytedance.adsdk.ugeno.ldr.bg.2
            @Override // java.lang.Runnable
            public void run() {
                if (AbstractC7127bg.this.f15305VB) {
                    int currentItem = AbstractC7127bg.this.f15299IL.getCurrentItem() + 1;
                    if (AbstractC7127bg.this.f15303PX) {
                        if (currentItem >= Integer.MAX_VALUE) {
                            AbstractC7127bg.this.f15299IL.m90315bg(1073741823, false);
                        } else {
                            AbstractC7127bg.this.f15299IL.m90315bg(currentItem, true);
                        }
                        AbstractC7127bg abstractC7127bg = AbstractC7127bg.this;
                        abstractC7127bg.postDelayed(abstractC7127bg.f15301LZ, AbstractC7127bg.this.f15307bX);
                    } else if (currentItem >= AbstractC7127bg.this.f15299IL.getAdapter().mo89957bg()) {
                        AbstractC7127bg.this.f15299IL.m90315bg(0, false);
                        AbstractC7127bg abstractC7127bg2 = AbstractC7127bg.this;
                        abstractC7127bg2.postDelayed(abstractC7127bg2.f15301LZ, AbstractC7127bg.this.f15307bX);
                    } else {
                        AbstractC7127bg.this.f15299IL.m90315bg(currentItem, true);
                        AbstractC7127bg abstractC7127bg3 = AbstractC7127bg.this;
                        abstractC7127bg3.postDelayed(abstractC7127bg3.f15301LZ, AbstractC7127bg.this.f15307bX);
                    }
                }
            }
        };
        this.f15299IL = new C7130IL(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        addView(this.f15299IL, layoutParams);
        C7132bg c7132bg = new C7132bg(context);
        this.xxp = c7132bg;
        addView(c7132bg);
    }

    @Override // com.bytedance.adsdk.ugeno.p206Kg.C6991bX.InterfaceC6999eqN
    /* renamed from: Kg */
    public void mo89978Kg(int i) {
        boolean z;
        boolean z2;
        if (this.tuV != null) {
            int m89947bg = C7133eqN.m89947bg(this.f15303PX, i, this.f15308bg.size());
            InterfaceC7126bX interfaceC7126bX = this.tuV;
            boolean z3 = this.f15303PX;
            if (m89947bg == 0) {
                z = true;
            } else {
                z = false;
            }
            if (m89947bg == this.f15308bg.size() - 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            interfaceC7126bX.mo84787bg(z3, m89947bg, i, z, z2);
        }
        if (this.f15309eo) {
            this.xxp.m89954bg(i);
        }
    }

    /* renamed from: WR */
    public void m89977WR(int i) {
        m89964bg(this.f15300Kg, this.f15312zx, this.ldr, this.f15310iR, true);
        if (this.VzQ == null) {
            this.VzQ = new C7131bg();
            this.f15299IL.m90305bg((C6991bX.InterfaceC6999eqN) this);
            this.f15299IL.setAdapter(this.VzQ);
        }
        if (this.f15303PX) {
            if (i >= Integer.MAX_VALUE) {
                this.f15299IL.m90315bg(1073741823, false);
            } else {
                this.f15299IL.m90315bg(i, true);
            }
        } else if (i >= 0 && i < this.f15308bg.size()) {
            this.f15299IL.m90315bg(i, true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f15305VB) {
            int action = motionEvent.getAction();
            if (action != 1 && action != 3 && action != 4) {
                if (action == 0) {
                    m89976bX();
                }
            } else {
                m89982IL();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public AbstractC6990IL getAdapter() {
        return this.f15299IL.getAdapter();
    }

    public int getCurrentItem() {
        return this.f15299IL.getCurrentItem();
    }

    public C6991bX getViewPager() {
        return this.f15299IL;
    }

    /* renamed from: iR */
    public abstract View mo89962iR(int i);

    public void setOnPageChangeListener(InterfaceC7126bX interfaceC7126bX) {
        this.tuV = interfaceC7126bX;
    }

    /* renamed from: IL */
    public AbstractC7127bg m89979IL(boolean z) {
        this.f15309eo = z;
        return this;
    }

    /* renamed from: bX */
    public AbstractC7127bg m89975bX(int i) {
        this.xxp.setUnSelectedColor(i);
        return this;
    }

    /* renamed from: bg */
    public AbstractC7127bg m89963bg(boolean z) {
        this.f15305VB = z;
        m89982IL();
        return this;
    }

    public AbstractC7127bg eqN(int i) {
        this.f15312zx = i;
        m89964bg(this.f15300Kg, i, this.ldr, this.f15310iR, true);
        return this;
    }

    public AbstractC7127bg ldr(int i) {
        this.f15310iR = i;
        m89964bg(this.f15300Kg, this.f15312zx, this.ldr, i, true);
        return this;
    }

    /* renamed from: zx */
    public AbstractC7127bg m89961zx(int i) {
        this.ldr = i;
        m89964bg(this.f15300Kg, this.f15312zx, i, this.f15310iR, true);
        return this;
    }

    /* renamed from: IL */
    public AbstractC7127bg m89981IL(int i) {
        this.xxp.setSelectedColor(i);
        return this;
    }

    /* renamed from: bX */
    public AbstractC7127bg m89973bX(boolean z) {
        this.xxp.setLoop(z);
        if (this.f15303PX != z) {
            int m89947bg = C7133eqN.m89947bg(z, this.f15299IL.getCurrentItem(), this.f15308bg.size());
            this.f15303PX = z;
            C7131bg c7131bg = this.VzQ;
            if (c7131bg != null) {
                c7131bg.m90340bX();
                this.f15299IL.setCurrentItem(m89947bg);
            }
        }
        return this;
    }

    /* renamed from: IL */
    public void m89982IL() {
        removeCallbacks(this.f15301LZ);
        postDelayed(this.f15301LZ, this.f15307bX);
    }

    /* renamed from: bg */
    public AbstractC7127bg m89970bg(int i) {
        this.f15307bX = i;
        m89982IL();
        return this;
    }

    /* renamed from: bg */
    public AbstractC7127bg m89971bg(float f) {
        this.f15306WR = f;
        return this;
    }

    /* renamed from: bg */
    public AbstractC7127bg m89965bg(String str) {
        this.f15300Kg = str;
        m89964bg(str, this.f15312zx, this.ldr, this.f15310iR, true);
        return this;
    }

    /* renamed from: bg */
    public void m89964bg(String str, int i, int i2, int i3, boolean z) {
        C7131bg c7131bg = this.VzQ;
        if (c7131bg != null) {
            c7131bg.m90340bX();
        }
        setClipChildren(false);
        this.f15299IL.setClipChildren(false);
        this.f15299IL.setPageMargin(i);
        ViewGroup.LayoutParams layoutParams = this.f15299IL.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.leftMargin = i2 + i;
            marginLayoutParams.rightMargin = i3 + i;
            this.f15299IL.setLayoutParams(layoutParams);
        }
        if (TextUtils.equals(str, "linear")) {
            this.f15299IL.m90303bg(false, (C6991bX.InterfaceC7003zx) new C7125bg());
        } else {
            this.f15299IL.m90303bg(false, (C6991bX.InterfaceC7003zx) null);
        }
        this.f15299IL.setOffscreenPageLimit((int) this.f15306WR);
    }

    /* renamed from: bX */
    public void m89976bX() {
        removeCallbacks(this.f15301LZ);
    }

    /* renamed from: bg */
    public void m89972bg() {
        int i;
        m89964bg(this.f15300Kg, this.f15312zx, this.ldr, this.f15310iR, true);
        if (this.VzQ == null) {
            this.VzQ = new C7131bg();
            this.f15299IL.m90305bg((C6991bX.InterfaceC6999eqN) this);
            this.f15299IL.setAdapter(this.VzQ);
        }
        int i2 = this.yDt;
        if (i2 < 0 || i2 >= this.f15308bg.size()) {
            this.yDt = 0;
        }
        if (this.f15303PX) {
            i = this.yDt + 1073741823;
        } else {
            i = this.yDt;
        }
        this.f15299IL.m90315bg(i, true);
        if (!this.f15303PX) {
            mo89978Kg(i);
        }
        if (this.f15305VB) {
            m89982IL();
        }
    }

    /* renamed from: bg */
    public View m89968bg(int i, int i2) {
        if (this.f15308bg.size() == 0) {
            return new View(getContext());
        }
        View mo89962iR = mo89962iR(i2);
        FrameLayout frameLayout = new FrameLayout(getContext());
        if (mo89962iR instanceof ViewGroup) {
            frameLayout.setClipChildren(true);
        }
        if (mo89962iR.getParent() instanceof ViewGroup) {
            ((ViewGroup) mo89962iR.getParent()).removeView(mo89962iR);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        frameLayout.addView(mo89962iR, layoutParams);
        frameLayout.addView(new View(getContext()), new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    /* renamed from: bg */
    public AbstractC7127bg<T> m89966bg(T t) {
        if (t != null) {
            this.f15308bg.add(t);
            if (this.f15309eo) {
                this.xxp.m89959IL();
            }
        }
        C7131bg c7131bg = this.VzQ;
        if (c7131bg != null) {
            c7131bg.m90340bX();
            this.xxp.m89953bg(this.yDt, this.f15299IL.getCurrentItem());
        }
        return this;
    }

    @Override // com.bytedance.adsdk.ugeno.p206Kg.C6991bX.InterfaceC6999eqN
    /* renamed from: bg */
    public void mo89969bg(int i, float f, int i2) {
        if (this.tuV != null) {
            C7133eqN.m89947bg(this.f15303PX, i, this.f15308bg.size());
        }
    }
}
