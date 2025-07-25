package sg.bigo.ads.common.p940w;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import java.util.List;
import sg.bigo.ads.common.p930r.C43778a;
import sg.bigo.ads.common.p940w.C43900c;
import sg.bigo.ads.common.utils.C43819d;
import sg.bigo.ads.common.utils.C43828k;

/* renamed from: sg.bigo.ads.common.w.b */
/* loaded from: classes10.dex */
public final class C43887b {

    /* renamed from: a */
    public static final int f114927a = -2123303016;

    /* renamed from: sg.bigo.ads.common.w.b$a */
    /* loaded from: classes10.dex */
    public static class C43895a {
        /* renamed from: a */
        public long mo4671a() {
            return -1L;
        }

        /* renamed from: a */
        public boolean mo4670a(int i) {
            return false;
        }

        /* renamed from: b */
        public void mo4669b(int i) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: sg.bigo.ads.common.w.b$b */
    /* loaded from: classes10.dex */
    public static class C43896b extends AbstractC43898d<ColorDrawable> {

        /* renamed from: d */
        private final int f114947d;

        private C43896b(View view, ColorDrawable colorDrawable, int i) {
            super(view, colorDrawable, i, (byte) 0);
            T t = this.f114950b;
            this.f114947d = t != 0 ? ((ColorDrawable) t).getColor() : 0;
        }

        @Override // sg.bigo.ads.common.p940w.C43887b.AbstractC43898d
        /* renamed from: a */
        protected final int mo4668a() {
            return this.f114947d;
        }

        /* synthetic */ C43896b(View view, ColorDrawable colorDrawable, int i, byte b) {
            this(view, colorDrawable, i);
        }

        @Override // sg.bigo.ads.common.p940w.C43887b.AbstractC43898d
        /* renamed from: a */
        public final void mo4666a(int i) {
            T t;
            if (this.f114949a == null || (t = this.f114950b) == 0) {
                return;
            }
            ((ColorDrawable) t).setColor(i);
            ((ColorDrawable) this.f114950b).invalidateSelf();
        }

        @Override // sg.bigo.ads.common.p940w.C43887b.AbstractC43898d
        /* renamed from: a */
        public final void mo4665a(boolean z) {
            T t;
            if (this.f114949a == null || (t = this.f114950b) == 0) {
                return;
            }
            ((ColorDrawable) t).setColor(z ? this.f114947d : this.f114951c);
            ((ColorDrawable) this.f114950b).invalidateSelf();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: sg.bigo.ads.common.w.b$c */
    /* loaded from: classes10.dex */
    public static class C43897c extends AbstractC43898d<Paint> {

        /* renamed from: d */
        private final int f114948d;

        public C43897c(View view, Paint paint, int i) {
            super(view, paint, i, (byte) 0);
            T t = this.f114950b;
            this.f114948d = t != 0 ? ((Paint) t).getColor() : 0;
        }

        @Override // sg.bigo.ads.common.p940w.C43887b.AbstractC43898d
        /* renamed from: a */
        public final int mo4668a() {
            return this.f114948d;
        }

        @Override // sg.bigo.ads.common.p940w.C43887b.AbstractC43898d
        /* renamed from: a */
        public final void mo4666a(int i) {
            T t;
            if (this.f114949a == null || (t = this.f114950b) == 0) {
                return;
            }
            ((Paint) t).setColor(i);
            this.f114949a.getBackground().invalidateSelf();
        }

        @Override // sg.bigo.ads.common.p940w.C43887b.AbstractC43898d
        /* renamed from: a */
        public final void mo4665a(boolean z) {
            T t;
            if (this.f114949a == null || (t = this.f114950b) == 0) {
                return;
            }
            ((Paint) t).setColor(z ? this.f114948d : this.f114951c);
            this.f114949a.getBackground().invalidateSelf();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: sg.bigo.ads.common.w.b$d */
    /* loaded from: classes10.dex */
    public static abstract class AbstractC43898d<T> {

        /* renamed from: a */
        protected final View f114949a;

        /* renamed from: b */
        protected final T f114950b;

        /* renamed from: c */
        protected final int f114951c;

        private AbstractC43898d(View view, T t, int i) {
            this.f114949a = view;
            this.f114950b = t;
            this.f114951c = i;
        }

        /* renamed from: a */
        protected abstract int mo4668a();

        /* renamed from: a */
        public int mo4667a(@FloatRange(from = 0.0d, m105511to = 1.0d) float f) {
            return C43887b.m4688a(f, mo4668a(), this.f114951c);
        }

        /* renamed from: a */
        protected abstract void mo4666a(int i);

        /* renamed from: a */
        public abstract void mo4665a(boolean z);

        /* synthetic */ AbstractC43898d(View view, Object obj, int i, byte b) {
            this(view, obj, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: sg.bigo.ads.common.w.b$e */
    /* loaded from: classes10.dex */
    public static class C43899e extends AbstractC43898d<Drawable> {

        /* renamed from: d */
        private Drawable f114952d;

        /* renamed from: e */
        private final ColorDrawable f114953e;

        /* renamed from: f */
        private int f114954f;

        public C43899e(View view, int i) {
            super(view, null, i, (byte) 0);
            ColorDrawable colorDrawable = new ColorDrawable(i);
            this.f114953e = colorDrawable;
            if (view != null) {
                Drawable background = view.getBackground();
                this.f114952d = background;
                if (background == null) {
                    colorDrawable.setColor(0);
                    view.setBackground(colorDrawable);
                    return;
                }
                view.setBackground(new LayerDrawable(new Drawable[]{this.f114952d, colorDrawable}));
            }
        }

        @Override // sg.bigo.ads.common.p940w.C43887b.AbstractC43898d
        /* renamed from: a */
        protected final int mo4668a() {
            return 0;
        }

        @Override // sg.bigo.ads.common.p940w.C43887b.AbstractC43898d
        /* renamed from: a */
        public final int mo4667a(float f) {
            this.f114954f = Math.max((int) ((255.0f - (f * 255.0f)) + 0.5f), 255);
            return super.mo4667a(f);
        }

        @Override // sg.bigo.ads.common.p940w.C43887b.AbstractC43898d
        /* renamed from: a */
        public final void mo4666a(int i) {
            if (this.f114949a != null) {
                ColorDrawable colorDrawable = this.f114953e;
                if (colorDrawable != null) {
                    colorDrawable.setColor(i);
                    this.f114953e.invalidateSelf();
                }
                Drawable drawable = this.f114952d;
                if (drawable != null) {
                    drawable.setAlpha(this.f114954f);
                    this.f114952d.invalidateSelf();
                }
            }
        }

        @Override // sg.bigo.ads.common.p940w.C43887b.AbstractC43898d
        /* renamed from: a */
        public final void mo4665a(boolean z) {
            View view = this.f114949a;
            if (view != null) {
                view.setBackground(z ? this.f114952d : this.f114953e);
            }
        }
    }

    /* renamed from: a */
    public static double m4687a(int i) {
        double m4684a = m4684a((16711680 & i) >> 16, (65280 & i) >> 8, i & 255);
        double m4684a2 = m4684a(255, 255, 255);
        return (Math.max(m4684a, m4684a2) + 0.05000000074505806d) / (Math.min(m4684a, m4684a2) + 0.05000000074505806d);
    }

    /* renamed from: b */
    public static int m4672b(@ColorInt int i) {
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        float f = fArr[2];
        if (f > 0.3f) {
            fArr[2] = ((f - 1.0f) * 0.6857143f) + 0.93f;
        } else {
            fArr[2] = f * 1.5f;
        }
        return Color.HSVToColor(fArr);
    }

    /* renamed from: a */
    private static double m4684a(int i, int i2, int i3) {
        double[] dArr = new double[3];
        dArr[0] = i / 255.0f;
        dArr[1] = i2 / 255.0f;
        dArr[2] = i3 / 255.0f;
        for (int i4 = 0; i4 < 3; i4++) {
            double d = dArr[i4];
            dArr[i4] = d <= 0.0392800010740757d ? d / 12.920000076293945d : Math.pow((d + 0.054999999701976776d) / 1.0549999475479126d, 2.4000000953674316d);
        }
        return (dArr[0] * 0.2125999927520752d) + (dArr[1] * 0.7152000069618225d) + (dArr[2] * 0.0722000002861023d);
    }

    /* renamed from: a */
    private static float m4689a(float f, float f2) {
        if (f < 0.0f) {
            return 0.0f;
        }
        return f > f2 ? f2 : f;
    }

    /* renamed from: a */
    static /* synthetic */ float m4680a(ValueAnimator valueAnimator) {
        if (valueAnimator != null) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue instanceof Float) {
                return ((Float) animatedValue).floatValue();
            }
            return 1.0f;
        }
        return 1.0f;
    }

    /* renamed from: a */
    public static int m4688a(float f, int i, int i2) {
        float f2 = ((i >> 24) & 255) / 255.0f;
        float pow = (float) Math.pow(((i >> 16) & 255) / 255.0f, 2.2d);
        float pow2 = (float) Math.pow(((i >> 8) & 255) / 255.0f, 2.2d);
        float pow3 = (float) Math.pow((i & 255) / 255.0f, 2.2d);
        float pow4 = (float) Math.pow(((i2 >> 16) & 255) / 255.0f, 2.2d);
        float pow5 = pow3 + (f * (((float) Math.pow((i2 & 255) / 255.0f, 2.2d)) - pow3));
        return (Math.round(((float) Math.pow(pow + ((pow4 - pow) * f), 0.45454545454545453d)) * 255.0f) << 16) | (Math.round((f2 + (((((i2 >> 24) & 255) / 255.0f) - f2) * f)) * 255.0f) << 24) | (Math.round(((float) Math.pow(pow2 + ((((float) Math.pow(((i2 >> 8) & 255) / 255.0f, 2.2d)) - pow2) * f), 0.45454545454545453d)) * 255.0f) << 8) | Math.round(((float) Math.pow(pow5, 0.45454545454545453d)) * 255.0f);
    }

    /* renamed from: a */
    public static int m4686a(int i, @FloatRange(from = 0.0d, m105511to = 1.0d) float f) {
        return m4685a(i, (int) (f * 255.0f));
    }

    /* renamed from: a */
    public static int m4685a(int i, @IntRange(from = 0, m105510to = 255) int i2) {
        return (i & ViewCompat.MEASURED_SIZE_MASK) | ((Math.max(0, Math.min(255, i2)) & 255) << 24);
    }

    @ColorInt
    /* renamed from: a */
    public static int m4678a(Bitmap bitmap, @ColorInt int i) {
        Integer m4679a = m4679a(bitmap);
        return m4679a != null ? m4679a.intValue() : i;
    }

    @Nullable
    /* renamed from: a */
    public static ValueAnimator m4675a(final View view, final int i, final C43895a c43895a) {
        if (view == null) {
            return null;
        }
        final AbstractC43898d m4676a = m4676a(view, i);
        int i2 = f114927a;
        Object tag = view.getTag(i2);
        if (tag instanceof ValueAnimator) {
            ((ValueAnimator) tag).cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        long mo4671a = c43895a.mo4671a();
        if (mo4671a != -1) {
            ofFloat.setDuration(mo4671a);
        }
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: sg.bigo.ads.common.w.b.4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                boolean z;
                int mo4667a = AbstractC43898d.this.mo4667a(C43887b.m4680a(valueAnimator));
                C43895a c43895a2 = c43895a;
                if (c43895a2 != null) {
                    z = c43895a2.mo4670a(mo4667a);
                } else {
                    z = false;
                }
                if (!z) {
                    AbstractC43898d.this.mo4666a(mo4667a);
                }
            }
        });
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: sg.bigo.ads.common.w.b.5

            /* renamed from: e */
            private boolean f114940e = false;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                super.onAnimationCancel(animator);
                this.f114940e = true;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                C43895a c43895a2 = C43895a.this;
                if (c43895a2 != null) {
                    c43895a2.mo4669b(i);
                }
                m4676a.mo4665a(this.f114940e);
                view.setTag(C43887b.f114927a, null);
            }
        });
        ofFloat.start();
        view.setTag(i2, ofFloat);
        return ofFloat;
    }

    @Nullable
    /* renamed from: a */
    public static ValueAnimator m4674a(final View view, final Drawable drawable, long j) {
        if (view == null) {
            return null;
        }
        int i = f114927a;
        Object tag = view.getTag(i);
        if (tag instanceof ValueAnimator) {
            ((ValueAnimator) tag).cancel();
        }
        final Drawable background = view.getBackground();
        if (background == null) {
            view.setBackground(drawable);
        } else {
            view.setBackground(new LayerDrawable(new Drawable[]{background, drawable}));
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        if (j != -1) {
            ofFloat.setDuration(j);
        }
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: sg.bigo.ads.common.w.b.6
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int max = Math.max((int) ((C43887b.m4680a(valueAnimator) * 255.0f) + 0.5f), 255);
                drawable.setAlpha(max);
                drawable.invalidateSelf();
                Drawable drawable2 = background;
                if (drawable2 != null) {
                    drawable2.setAlpha(255 - max);
                    background.invalidateSelf();
                }
            }
        });
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: sg.bigo.ads.common.w.b.7

            /* renamed from: d */
            private boolean f114946d = false;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                this.f114946d = true;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                Drawable drawable2;
                View view2 = view;
                if (this.f114946d) {
                    drawable2 = background;
                } else {
                    drawable2 = drawable;
                }
                view2.setBackground(drawable2);
                view.setTag(C43887b.f114927a, null);
            }
        });
        ofFloat.start();
        view.setTag(i, ofFloat);
        return ofFloat;
    }

    @Nullable
    /* renamed from: a */
    public static Integer m4679a(Bitmap bitmap) {
        C43900c.C43902a m4663a;
        Bitmap bitmap2;
        int max;
        int i;
        C43900c.InterfaceC43903b[] interfaceC43903bArr;
        if (bitmap == null) {
            return null;
        }
        try {
            m4663a = C43900c.m4663a(bitmap);
            bitmap2 = m4663a.f114961a;
        } catch (Exception unused) {
        }
        if (bitmap2 != null) {
            double d = -1.0d;
            if (m4663a.f114964d > 0) {
                int width = bitmap2.getWidth() * bitmap2.getHeight();
                int i2 = m4663a.f114964d;
                if (width > i2) {
                    d = Math.sqrt(i2 / width);
                }
            } else if (m4663a.f114965e > 0 && (max = Math.max(bitmap2.getWidth(), bitmap2.getHeight())) > (i = m4663a.f114965e)) {
                d = i / max;
            }
            if (d > 0.0d) {
                bitmap2 = C43819d.m4915a(bitmap2, (int) Math.ceil(bitmap2.getWidth() * d), (int) Math.ceil(bitmap2.getHeight() * d));
            }
            int width2 = bitmap2.getWidth();
            int height = bitmap2.getHeight();
            int[] iArr = new int[width2 * height];
            bitmap2.getPixels(iArr, 0, width2, 0, 0, width2, height);
            int i3 = m4663a.f114963c;
            if (m4663a.f114966f.isEmpty()) {
                interfaceC43903bArr = null;
            } else {
                List<C43900c.InterfaceC43903b> list = m4663a.f114966f;
                interfaceC43903bArr = (C43900c.InterfaceC43903b[]) list.toArray(new C43900c.InterfaceC43903b[list.size()]);
            }
            C43884a c43884a = new C43884a(iArr, i3, interfaceC43903bArr);
            if (bitmap2 != m4663a.f114961a) {
                bitmap2.recycle();
            }
            C43900c c43900c = new C43900c(c43884a.f114913c, m4663a.f114962b);
            c43900c.m4664a();
            C43900c.C43904c c43904c = c43900c.f114956a;
            if (c43904c != null) {
                return Integer.valueOf(c43904c.f114967a);
            }
            return null;
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    private static AbstractC43898d m4676a(@NonNull View view, int i) {
        Drawable findDrawableByLayerId;
        ColorDrawable background = view.getBackground();
        if ((background instanceof LayerDrawable) && (findDrawableByLayerId = ((LayerDrawable) background).findDrawableByLayerId(C43819d.f114652a)) != null) {
            background = findDrawableByLayerId;
        }
        int i2 = 0;
        while (i2 < 10 && background != null) {
            i2++;
            Object m5021a = C43778a.m5021a(background, "getDrawable", Drawable.class);
            if (!(m5021a instanceof Drawable)) {
                break;
            }
            background = (Drawable) m5021a;
        }
        background = null;
        if (background instanceof ColorDrawable) {
            return new C43896b(view, background, i, (byte) 0);
        }
        if (background instanceof ShapeDrawable) {
            Paint paint = ((ShapeDrawable) background).getPaint();
            Paint.Style style = paint.getStyle();
            return (style == Paint.Style.FILL || style == Paint.Style.FILL_AND_STROKE) ? new C43897c(view, paint, i) : new C43899e(view, i);
        }
        return new C43899e(view, i);
    }

    /* renamed from: a */
    public static void m4683a(@IntRange(from = 0, m105510to = 255) int i, @IntRange(from = 0, m105510to = 255) int i2, @IntRange(from = 0, m105510to = 255) int i3, @NonNull float[] fArr) {
        float f;
        float abs;
        float f2 = i / 255.0f;
        float f3 = i2 / 255.0f;
        float f4 = i3 / 255.0f;
        float max = Math.max(f2, Math.max(f3, f4));
        float min = Math.min(f2, Math.min(f3, f4));
        float f5 = max - min;
        float f6 = (max + min) / 2.0f;
        if (max == min) {
            f = 0.0f;
            abs = 0.0f;
        } else {
            f = max == f2 ? ((f3 - f4) / f5) % 6.0f : max == f3 ? ((f4 - f2) / f5) + 2.0f : 4.0f + ((f2 - f3) / f5);
            abs = f5 / (1.0f - Math.abs((2.0f * f6) - 1.0f));
        }
        float f7 = (f * 60.0f) % 360.0f;
        if (f7 < 0.0f) {
            f7 += 360.0f;
        }
        fArr[0] = m4689a(f7, 360.0f);
        fArr[1] = m4689a(abs, 1.0f);
        fArr[2] = m4689a(f6, 1.0f);
    }

    /* renamed from: a */
    public static void m4682a(@ColorInt final int i, @ColorInt final int i2, long j, final TextView... textViewArr) {
        if (C43828k.m4872a(textViewArr)) {
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        if (j >= 0) {
            ofFloat.setDuration(j);
        }
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: sg.bigo.ads.common.w.b.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int m4688a = C43887b.m4688a(C43887b.m4680a(valueAnimator), i, i2);
                for (TextView textView : textViewArr) {
                    textView.setTextColor(m4688a);
                }
            }
        });
        ofFloat.start();
    }

    /* renamed from: a */
    public static void m4681a(@ColorInt int i, @NonNull float[] fArr) {
        m4683a(Color.red(i), Color.green(i), Color.blue(i), fArr);
    }

    /* renamed from: a */
    public static void m4677a(View view) {
        m4675a(view, -1, new C43895a() { // from class: sg.bigo.ads.common.w.b.3
            @Override // sg.bigo.ads.common.p940w.C43887b.C43895a
            /* renamed from: a */
            public final long mo4671a() {
                return 0L;
            }
        });
    }

    /* renamed from: a */
    public static void m4673a(Interpolator interpolator, final View view) {
        if (view == null) {
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(300L);
        ofFloat.setInterpolator(interpolator);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: sg.bigo.ads.common.w.b.2

            /* renamed from: a */
            final /* synthetic */ int f114931a = 0;

            /* renamed from: b */
            final /* synthetic */ int f114932b = -1291845632;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                view.setBackgroundColor(C43887b.m4688a(C43887b.m4680a(valueAnimator), this.f114931a, this.f114932b));
            }
        });
        ofFloat.start();
    }
}
