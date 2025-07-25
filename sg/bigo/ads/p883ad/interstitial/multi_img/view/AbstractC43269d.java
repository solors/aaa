package sg.bigo.ads.p883ad.interstitial.multi_img.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import sg.bigo.ads.common.p940w.C43887b;
import sg.bigo.ads.common.utils.C43810a;
import sg.bigo.ads.common.utils.C43819d;
import sg.bigo.ads.common.utils.C43822e;
import sg.bigo.ads.common.utils.C43841u;
import sg.bigo.ads.common.view.AdImageView;
import sg.bigo.ads.common.view.FixContentFrameLayout;
import sg.bigo.ads.common.view.RoundedFrameLayout;
import sg.bigo.ads.p883ad.interstitial.AbstractC43368u;
import sg.bigo.ads.p883ad.interstitial.multi_img.EnumC43253c;

/* renamed from: sg.bigo.ads.ad.interstitial.multi_img.view.d */
/* loaded from: classes10.dex */
public abstract class AbstractC43269d<T extends View> {

    /* renamed from: b */
    public static long f113310b = 300;

    /* renamed from: c */
    public static long f113311c = 500;

    /* renamed from: d */
    public static int f113312d = AbstractC43368u.f113684e;

    /* renamed from: e */
    public static int f113313e = -188383023;

    /* renamed from: a */
    private final boolean f113314a;

    /* renamed from: f */
    protected final Context f113315f;

    /* renamed from: g */
    protected EnumC43253c f113316g;

    /* renamed from: h */
    protected int f113317h;

    /* renamed from: i */
    protected final int f113318i;
    @NonNull

    /* renamed from: j */
    public final RoundedFrameLayout f113319j;

    /* renamed from: k */
    public final FixContentFrameLayout f113320k;
    @NonNull

    /* renamed from: l */
    public final T f113321l;

    /* renamed from: m */
    public final AdImageView f113322m;

    /* renamed from: n */
    public int f113323n;

    /* renamed from: o */
    public int f113324o;

    /* renamed from: p */
    public Bitmap f113325p;

    /* renamed from: q */
    public int f113326q;

    /* renamed from: r */
    public InterfaceC43278a f113327r;

    /* renamed from: t */
    private ValueAnimator f113329t;

    /* renamed from: u */
    private ValueAnimator f113330u;

    /* renamed from: v */
    private long f113331v = 0;

    /* renamed from: s */
    public boolean f113328s = false;

    /* renamed from: sg.bigo.ads.ad.interstitial.multi_img.view.d$a */
    /* loaded from: classes10.dex */
    public interface InterfaceC43278a {
        /* renamed from: a */
        void mo5537a();

        /* renamed from: b */
        void mo5536b();
    }

    public AbstractC43269d(Context context, EnumC43253c enumC43253c, boolean z, int i, int i2, @LayoutRes int i3, @IdRes int i4, @IdRes int i5, @IdRes int i6) {
        this.f113315f = context;
        this.f113314a = z;
        this.f113318i = i2;
        RoundedFrameLayout roundedFrameLayout = (RoundedFrameLayout) C43810a.m4954a(context, i3, null, false);
        this.f113319j = roundedFrameLayout;
        this.f113320k = (FixContentFrameLayout) roundedFrameLayout.findViewById(i4);
        this.f113321l = (T) roundedFrameLayout.findViewById(i5);
        this.f113322m = (AdImageView) roundedFrameLayout.findViewById(i6);
        m5840a(enumC43253c);
        m5842a(i);
        this.f113326q = f113312d;
        C43841u.m4800a(roundedFrameLayout, new ViewTreeObserver.OnGlobalLayoutListener() { // from class: sg.bigo.ads.ad.interstitial.multi_img.view.d.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                AbstractC43269d.this.f113331v = SystemClock.elapsedRealtime();
            }
        });
        roundedFrameLayout.setTag(f113313e, this);
    }

    /* renamed from: c */
    public final boolean m5831c(int i) {
        return this.f113328s ? i == 5 : i == 4;
    }

    /* renamed from: d */
    public final boolean m5829d(int i) {
        return this.f113328s ? i == 4 : i == 3;
    }

    /* renamed from: b */
    public final void m5835b(final int i) {
        if (mo5843a()) {
            this.f113322m.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.multi_img.view.d.5
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC43269d.this.f113322m.setBackgroundColor(i);
                }
            });
        }
    }

    /* renamed from: a */
    public final void m5842a(int i) {
        int i2;
        if (i != Integer.MIN_VALUE) {
            if (i != 4) {
                if (i == 1) {
                    i2 = -1;
                } else if (i != 2) {
                    i = 3;
                } else {
                    i2 = ViewCompat.MEASURED_STATE_MASK;
                }
            }
            this.f113317h = i;
        }
        i2 = 0;
        m5835b(i2);
        this.f113317h = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public final void m5834b(Bitmap bitmap) {
        InterfaceC43278a interfaceC43278a;
        boolean z = true;
        boolean z2 = false;
        boolean z3 = ((this.f113331v > 0L ? 1 : (this.f113331v == 0L ? 0 : -1)) != 0 ? SystemClock.elapsedRealtime() - this.f113331v : 0L) > f113310b;
        if (m5831c(this.f113318i) || m5831c(this.f113317h)) {
            this.f113325p = C43819d.m4919a(this.f113315f, bitmap);
            if (m5831c(this.f113318i)) {
                this.f113324o = C43887b.m4678a(this.f113325p, (int) ViewCompat.MEASURED_STATE_MASK);
            } else {
                this.f113324o = ViewCompat.MEASURED_STATE_MASK;
            }
            final C43887b.C43895a c43895a = new C43887b.C43895a() { // from class: sg.bigo.ads.ad.interstitial.multi_img.view.d.2
                @Override // sg.bigo.ads.common.p940w.C43887b.C43895a
                /* renamed from: a */
                public final long mo4671a() {
                    return AbstractC43269d.f113311c;
                }

                @Override // sg.bigo.ads.common.p940w.C43887b.C43895a
                /* renamed from: b */
                public final void mo4669b(int i) {
                    if (AbstractC43269d.this.f113327r != null) {
                        AbstractC43269d.this.f113327r.mo5536b();
                    }
                }

                @Override // sg.bigo.ads.common.p940w.C43887b.C43895a
                /* renamed from: a */
                public final boolean mo4670a(int i) {
                    AbstractC43269d.this.f113326q = i;
                    AbstractC43269d abstractC43269d = AbstractC43269d.this;
                    if (abstractC43269d.m5831c(abstractC43269d.f113317h)) {
                        AbstractC43269d abstractC43269d2 = AbstractC43269d.this;
                        AbstractC43269d.m5836a(abstractC43269d2, abstractC43269d2.f113325p, AbstractC43269d.this.f113326q);
                    }
                    if (AbstractC43269d.this.f113327r != null) {
                        AbstractC43269d.this.f113327r.mo5537a();
                    }
                    return super.mo4670a(i);
                }
            };
            if (z3) {
                ValueAnimator valueAnimator = this.f113330u;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofInt = ValueAnimator.ofInt(0, f113312d);
                this.f113330u = ofInt;
                ofInt.setInterpolator(new LinearInterpolator());
                this.f113330u.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: sg.bigo.ads.ad.interstitial.multi_img.view.d.6
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        Object animatedValue = valueAnimator2.getAnimatedValue();
                        if (animatedValue instanceof Integer) {
                            int intValue = ((Integer) animatedValue).intValue();
                            C43887b.C43895a c43895a2 = c43895a;
                            if (c43895a2 != null) {
                                c43895a2.mo4670a(intValue);
                            }
                        }
                    }
                });
                this.f113330u.addListener(new AnimatorListenerAdapter() { // from class: sg.bigo.ads.ad.interstitial.multi_img.view.d.7
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        C43887b.C43895a c43895a2 = c43895a;
                        if (c43895a2 != null) {
                            c43895a2.mo4669b(AbstractC43269d.f113312d);
                        }
                    }
                });
                if (c43895a.mo4671a() >= 0) {
                    this.f113330u.setDuration(c43895a.mo4671a());
                }
                this.f113330u.start();
            } else {
                c43895a.mo4670a(f113312d);
                c43895a.mo4669b(f113312d);
            }
            z2 = true;
        }
        if (m5829d(this.f113318i) || m5829d(this.f113317h)) {
            int m4678a = C43887b.m4678a(bitmap, (int) ViewCompat.MEASURED_STATE_MASK);
            final C43887b.C43895a c43895a2 = new C43887b.C43895a() { // from class: sg.bigo.ads.ad.interstitial.multi_img.view.d.3
                @Override // sg.bigo.ads.common.p940w.C43887b.C43895a
                /* renamed from: a */
                public final long mo4671a() {
                    return AbstractC43269d.f113311c;
                }

                @Override // sg.bigo.ads.common.p940w.C43887b.C43895a
                /* renamed from: b */
                public final void mo4669b(int i) {
                    if (AbstractC43269d.this.f113327r != null) {
                        AbstractC43269d.this.f113327r.mo5536b();
                    }
                }

                @Override // sg.bigo.ads.common.p940w.C43887b.C43895a
                /* renamed from: a */
                public final boolean mo4670a(int i) {
                    AbstractC43269d.this.f113323n = i;
                    AbstractC43269d abstractC43269d = AbstractC43269d.this;
                    if (abstractC43269d.m5829d(abstractC43269d.f113317h)) {
                        AbstractC43269d abstractC43269d2 = AbstractC43269d.this;
                        abstractC43269d2.m5835b(abstractC43269d2.f113323n);
                    }
                    if (AbstractC43269d.this.f113327r != null) {
                        AbstractC43269d.this.f113327r.mo5537a();
                    }
                    return super.mo4670a(i);
                }
            };
            if (z3) {
                ValueAnimator valueAnimator2 = this.f113329t;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                this.f113329t = C43887b.m4675a(this.f113322m, m4678a, new C43887b.C43895a() { // from class: sg.bigo.ads.ad.interstitial.multi_img.view.d.8
                    @Override // sg.bigo.ads.common.p940w.C43887b.C43895a
                    /* renamed from: a */
                    public final long mo4671a() {
                        C43887b.C43895a c43895a3 = c43895a2;
                        if (c43895a3 != null) {
                            return c43895a3.mo4671a();
                        }
                        return -1L;
                    }

                    @Override // sg.bigo.ads.common.p940w.C43887b.C43895a
                    /* renamed from: b */
                    public final void mo4669b(int i) {
                        C43887b.C43895a c43895a3 = c43895a2;
                        if (c43895a3 != null) {
                            c43895a3.mo4669b(i);
                        }
                    }

                    @Override // sg.bigo.ads.common.p940w.C43887b.C43895a
                    /* renamed from: a */
                    public final boolean mo4670a(int i) {
                        C43887b.C43895a c43895a3 = c43895a2;
                        if (c43895a3 != null) {
                            c43895a3.mo4670a(i);
                            return true;
                        }
                        return true;
                    }
                });
            } else {
                c43895a2.mo4670a(m4678a);
                c43895a2.mo4669b(m4678a);
            }
        } else {
            z = z2;
        }
        if (z || (interfaceC43278a = this.f113327r) == null) {
            return;
        }
        interfaceC43278a.mo5536b();
    }

    /* renamed from: a */
    public final void m5841a(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return;
        }
        FixContentFrameLayout.C43849a c43849a = (FixContentFrameLayout.C43849a) this.f113321l.getLayoutParams();
        if (c43849a.f114714a == i || c43849a.f114715b == i2) {
            return;
        }
        c43849a.f114714a = i;
        c43849a.f114715b = i2;
        this.f113321l.setLayoutParams(c43849a);
    }

    /* renamed from: a */
    public final void m5840a(EnumC43253c enumC43253c) {
        FixContentFrameLayout fixContentFrameLayout;
        boolean z;
        this.f113316g = enumC43253c;
        if (mo5843a()) {
            int m4906a = C43822e.m4906a(this.f113315f, 12);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f113320k.getLayoutParams();
            layoutParams.gravity = 17;
            layoutParams.topMargin = m4906a;
            layoutParams.leftMargin = m4906a;
            layoutParams.rightMargin = m4906a;
            layoutParams.bottomMargin = m4906a;
            layoutParams.height = -2;
            layoutParams.width = -2;
            this.f113320k.setLayoutParams(layoutParams);
            fixContentFrameLayout = this.f113320k;
            z = true;
        } else {
            fixContentFrameLayout = this.f113320k;
            z = false;
        }
        fixContentFrameLayout.setFixContent(z);
    }

    /* renamed from: a */
    static /* synthetic */ void m5836a(AbstractC43269d abstractC43269d, final Bitmap bitmap, final int i) {
        if (abstractC43269d.mo5843a()) {
            abstractC43269d.f113322m.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.multi_img.view.d.4
                @Override // java.lang.Runnable
                public final void run() {
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(AbstractC43269d.this.f113322m.getResources(), bitmap);
                    bitmapDrawable.setAlpha(i);
                    AbstractC43269d.this.f113322m.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    AbstractC43269d.this.f113322m.setImageDrawable(bitmapDrawable);
                }
            });
        }
    }

    /* renamed from: a */
    public boolean mo5843a() {
        return this.f113314a;
    }
}
