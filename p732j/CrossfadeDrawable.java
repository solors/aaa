package p732j;

import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import be.MathJVM;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p689h.DecodeUtils;
import p853r.EnumC39423h;

@Metadata
/* renamed from: j.b */
/* loaded from: classes2.dex */
public final class CrossfadeDrawable extends Drawable implements Drawable.Callback, Animatable2Compat {
    @NotNull

    /* renamed from: o */
    public static final C37244a f98327o = new C37244a(null);
    @NotNull

    /* renamed from: b */
    private final EnumC39423h f98328b;

    /* renamed from: c */
    private final int f98329c;

    /* renamed from: d */
    private final boolean f98330d;

    /* renamed from: f */
    private final boolean f98331f;
    @NotNull

    /* renamed from: g */
    private final List<Animatable2Compat.AnimationCallback> f98332g = new ArrayList();

    /* renamed from: h */
    private final int f98333h;

    /* renamed from: i */
    private final int f98334i;

    /* renamed from: j */
    private long f98335j;

    /* renamed from: k */
    private int f98336k;

    /* renamed from: l */
    private int f98337l;
    @Nullable

    /* renamed from: m */
    private Drawable f98338m;
    @Nullable

    /* renamed from: n */
    private final Drawable f98339n;

    /* compiled from: CrossfadeDrawable.kt */
    @Metadata
    /* renamed from: j.b$a */
    /* loaded from: classes2.dex */
    public static final class C37244a {
        private C37244a() {
        }

        public /* synthetic */ C37244a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public CrossfadeDrawable(@Nullable Drawable drawable, @Nullable Drawable drawable2, @NotNull EnumC39423h enumC39423h, int i, boolean z, boolean z2) {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Drawable drawable3;
        boolean z3;
        this.f98328b = enumC39423h;
        this.f98329c = i;
        this.f98330d = z;
        this.f98331f = z2;
        if (drawable != null) {
            num = Integer.valueOf(drawable.getIntrinsicWidth());
        } else {
            num = null;
        }
        if (drawable2 != null) {
            num2 = Integer.valueOf(drawable2.getIntrinsicWidth());
        } else {
            num2 = null;
        }
        this.f98333h = m18685a(num, num2);
        if (drawable != null) {
            num3 = Integer.valueOf(drawable.getIntrinsicHeight());
        } else {
            num3 = null;
        }
        if (drawable2 != null) {
            num4 = Integer.valueOf(drawable2.getIntrinsicHeight());
        } else {
            num4 = null;
        }
        this.f98334i = m18685a(num3, num4);
        this.f98336k = 255;
        if (drawable != null) {
            drawable3 = drawable.mutate();
        } else {
            drawable3 = null;
        }
        this.f98338m = drawable3;
        Drawable mutate = drawable2 != null ? drawable2.mutate() : null;
        this.f98339n = mutate;
        if (i > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            Drawable drawable4 = this.f98338m;
            if (drawable4 != null) {
                drawable4.setCallback(this);
            }
            if (mutate != null) {
                mutate.setCallback(this);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("durationMillis must be > 0.".toString());
    }

    /* renamed from: a */
    private final int m18685a(Integer num, Integer num2) {
        int i;
        int i2 = -1;
        if (!this.f98331f && ((num != null && num.intValue() == -1) || (num2 != null && num2.intValue() == -1))) {
            return -1;
        }
        if (num != null) {
            i = num.intValue();
        } else {
            i = -1;
        }
        if (num2 != null) {
            i2 = num2.intValue();
        }
        return Math.max(i, i2);
    }

    /* renamed from: b */
    private final void m18684b() {
        this.f98337l = 2;
        this.f98338m = null;
        List<Animatable2Compat.AnimationCallback> list = this.f98332g;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i).onAnimationEnd(this);
        }
    }

    @VisibleForTesting
    /* renamed from: c */
    public final void m18683c(@NotNull Drawable drawable, @NotNull Rect rect) {
        int m103792c;
        int m103792c2;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth > 0 && intrinsicHeight > 0) {
            int width = rect.width();
            int height = rect.height();
            double m23942c = DecodeUtils.m23942c(intrinsicWidth, intrinsicHeight, width, height, this.f98328b);
            double d = 2;
            m103792c = MathJVM.m103792c((width - (intrinsicWidth * m23942c)) / d);
            m103792c2 = MathJVM.m103792c((height - (m23942c * intrinsicHeight)) / d);
            drawable.setBounds(rect.left + m103792c, rect.top + m103792c2, rect.right - m103792c, rect.bottom - m103792c2);
            return;
        }
        drawable.setBounds(rect);
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public void clearAnimationCallbacks() {
        this.f98332g.clear();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas) {
        double m16910l;
        boolean z;
        int save;
        Drawable drawable;
        int i = this.f98337l;
        if (i == 0) {
            Drawable drawable2 = this.f98338m;
            if (drawable2 != null) {
                drawable2.setAlpha(this.f98336k);
                save = canvas.save();
                try {
                    drawable2.draw(canvas);
                } finally {
                }
            }
        } else if (i == 2) {
            Drawable drawable3 = this.f98339n;
            if (drawable3 != null) {
                drawable3.setAlpha(this.f98336k);
                save = canvas.save();
                try {
                    drawable3.draw(canvas);
                } finally {
                }
            }
        } else {
            double uptimeMillis = (SystemClock.uptimeMillis() - this.f98335j) / this.f98329c;
            m16910l = _Ranges.m16910l(uptimeMillis, 0.0d, 1.0d);
            int i2 = this.f98336k;
            int i3 = (int) (m16910l * i2);
            if (this.f98330d) {
                i2 -= i3;
            }
            if (uptimeMillis >= 1.0d) {
                z = true;
            } else {
                z = false;
            }
            if (!z && (drawable = this.f98338m) != null) {
                drawable.setAlpha(i2);
                save = canvas.save();
                try {
                    drawable.draw(canvas);
                } finally {
                }
            }
            Drawable drawable4 = this.f98339n;
            if (drawable4 != null) {
                drawable4.setAlpha(i3);
                save = canvas.save();
                try {
                    drawable4.draw(canvas);
                } finally {
                }
            }
            if (z) {
                m18684b();
            } else {
                invalidateSelf();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f98336k;
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public ColorFilter getColorFilter() {
        ColorFilter colorFilter;
        Drawable drawable;
        int i = this.f98337l;
        if (i != 0) {
            if (i != 1) {
                if (i != 2 || (drawable = this.f98339n) == null) {
                    return null;
                }
                return drawable.getColorFilter();
            }
            Drawable drawable2 = this.f98339n;
            if (drawable2 != null && (colorFilter = drawable2.getColorFilter()) != null) {
                return colorFilter;
            }
            Drawable drawable3 = this.f98338m;
            if (drawable3 == null) {
                return null;
            }
            return drawable3.getColorFilter();
        }
        Drawable drawable4 = this.f98338m;
        if (drawable4 == null) {
            return null;
        }
        return drawable4.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f98334i;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f98333h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f98338m;
        Drawable drawable2 = this.f98339n;
        int i = this.f98337l;
        if (i == 0) {
            if (drawable == null) {
                return -2;
            }
            return drawable.getOpacity();
        } else if (i == 2) {
            if (drawable2 == null) {
                return -2;
            }
            return drawable2.getOpacity();
        } else if (drawable != null && drawable2 != null) {
            return Drawable.resolveOpacity(drawable.getOpacity(), drawable2.getOpacity());
        } else {
            if (drawable != null) {
                return drawable.getOpacity();
            }
            if (drawable2 == null) {
                return -2;
            }
            return drawable2.getOpacity();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NotNull Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        if (this.f98337l == 1) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(@NotNull Rect rect) {
        Drawable drawable = this.f98338m;
        if (drawable != null) {
            m18683c(drawable, rect);
        }
        Drawable drawable2 = this.f98339n;
        if (drawable2 != null) {
            m18683c(drawable2, rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        boolean z;
        boolean z2;
        Drawable drawable = this.f98338m;
        if (drawable != null) {
            z = drawable.setLevel(i);
        } else {
            z = false;
        }
        Drawable drawable2 = this.f98339n;
        if (drawable2 != null) {
            z2 = drawable2.setLevel(i);
        } else {
            z2 = false;
        }
        if (!z && !z2) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(@NotNull int[] iArr) {
        boolean z;
        boolean z2;
        Drawable drawable = this.f98338m;
        if (drawable != null) {
            z = drawable.setState(iArr);
        } else {
            z = false;
        }
        Drawable drawable2 = this.f98339n;
        if (drawable2 != null) {
            z2 = drawable2.setState(iArr);
        } else {
            z2 = false;
        }
        if (!z && !z2) {
            return false;
        }
        return true;
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public void registerAnimationCallback(@NotNull Animatable2Compat.AnimationCallback animationCallback) {
        this.f98332g.add(animationCallback);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@NotNull Drawable drawable, @NotNull Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        boolean z = false;
        if (i >= 0 && i < 256) {
            z = true;
        }
        if (z) {
            this.f98336k = i;
            return;
        }
        throw new IllegalArgumentException(("Invalid alpha: " + i).toString());
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        Drawable drawable = this.f98338m;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        Drawable drawable2 = this.f98339n;
        if (drawable2 != null) {
            drawable2.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        Drawable drawable = this.f98338m;
        if (drawable != null) {
            drawable.setTint(i);
        }
        Drawable drawable2 = this.f98339n;
        if (drawable2 != null) {
            drawable2.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi(29)
    public void setTintBlendMode(@Nullable BlendMode blendMode) {
        Drawable drawable = this.f98338m;
        if (drawable != null) {
            drawable.setTintBlendMode(blendMode);
        }
        Drawable drawable2 = this.f98339n;
        if (drawable2 != null) {
            drawable2.setTintBlendMode(blendMode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(@Nullable ColorStateList colorStateList) {
        Drawable drawable = this.f98338m;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
        Drawable drawable2 = this.f98339n;
        if (drawable2 != null) {
            drawable2.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(@Nullable PorterDuff.Mode mode) {
        Drawable drawable = this.f98338m;
        if (drawable != null) {
            drawable.setTintMode(mode);
        }
        Drawable drawable2 = this.f98339n;
        if (drawable2 != null) {
            drawable2.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Animatable animatable;
        Drawable drawable = this.f98338m;
        Animatable animatable2 = null;
        if (drawable instanceof Animatable) {
            animatable = (Animatable) drawable;
        } else {
            animatable = null;
        }
        if (animatable != null) {
            animatable.start();
        }
        Drawable drawable2 = this.f98339n;
        if (drawable2 instanceof Animatable) {
            animatable2 = (Animatable) drawable2;
        }
        if (animatable2 != null) {
            animatable2.start();
        }
        if (this.f98337l != 0) {
            return;
        }
        this.f98337l = 1;
        this.f98335j = SystemClock.uptimeMillis();
        List<Animatable2Compat.AnimationCallback> list = this.f98332g;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i).onAnimationStart(this);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Animatable animatable;
        Drawable drawable = this.f98338m;
        Animatable animatable2 = null;
        if (drawable instanceof Animatable) {
            animatable = (Animatable) drawable;
        } else {
            animatable = null;
        }
        if (animatable != null) {
            animatable.stop();
        }
        Drawable drawable2 = this.f98339n;
        if (drawable2 instanceof Animatable) {
            animatable2 = (Animatable) drawable2;
        }
        if (animatable2 != null) {
            animatable2.stop();
        }
        if (this.f98337l != 2) {
            m18684b();
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public boolean unregisterAnimationCallback(@NotNull Animatable2Compat.AnimationCallback animationCallback) {
        return this.f98332g.remove(animationCallback);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@NotNull Drawable drawable, @NotNull Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
