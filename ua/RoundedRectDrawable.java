package ua;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.InterfaceC0152Px;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sa.C39638b;

@Metadata
/* renamed from: ua.e */
/* loaded from: classes8.dex */
public final class RoundedRectDrawable extends Drawable {
    @NotNull

    /* renamed from: a */
    private final C44464a f116690a;
    @NotNull

    /* renamed from: b */
    private final Paint f116691b;
    @Nullable

    /* renamed from: c */
    private final Paint f116692c;

    /* renamed from: d */
    private final float f116693d;

    /* renamed from: e */
    private final float f116694e;

    /* renamed from: f */
    private final float f116695f;

    /* renamed from: g */
    private final float f116696g;
    @NotNull

    /* renamed from: h */
    private final RectF f116697h;

    /* compiled from: RoundedRectDrawable.kt */
    @Metadata
    /* renamed from: ua.e$a */
    /* loaded from: classes8.dex */
    public static final class C44464a {

        /* renamed from: a */
        private final float f116698a;

        /* renamed from: b */
        private final float f116699b;

        /* renamed from: c */
        private final int f116700c;

        /* renamed from: d */
        private final float f116701d;
        @Nullable

        /* renamed from: e */
        private final Integer f116702e;
        @Nullable

        /* renamed from: f */
        private final Float f116703f;

        public C44464a(@InterfaceC0152Px float f, @InterfaceC0152Px float f2, int i, @InterfaceC0152Px float f3, @Nullable Integer num, @InterfaceC0152Px @Nullable Float f4) {
            this.f116698a = f;
            this.f116699b = f2;
            this.f116700c = i;
            this.f116701d = f3;
            this.f116702e = num;
            this.f116703f = f4;
        }

        /* renamed from: a */
        public final int m2899a() {
            return this.f116700c;
        }

        /* renamed from: b */
        public final float m2898b() {
            return this.f116699b;
        }

        /* renamed from: c */
        public final float m2897c() {
            return this.f116701d;
        }

        @Nullable
        /* renamed from: d */
        public final Integer m2896d() {
            return this.f116702e;
        }

        @Nullable
        /* renamed from: e */
        public final Float m2895e() {
            return this.f116703f;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C44464a)) {
                return false;
            }
            C44464a c44464a = (C44464a) obj;
            if (Float.compare(this.f116698a, c44464a.f116698a) == 0 && Float.compare(this.f116699b, c44464a.f116699b) == 0 && this.f116700c == c44464a.f116700c && Float.compare(this.f116701d, c44464a.f116701d) == 0 && Intrinsics.m17075f(this.f116702e, c44464a.f116702e) && Intrinsics.m17075f(this.f116703f, c44464a.f116703f)) {
                return true;
            }
            return false;
        }

        /* renamed from: f */
        public final float m2894f() {
            return this.f116698a;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = ((((((Float.hashCode(this.f116698a) * 31) + Float.hashCode(this.f116699b)) * 31) + Integer.hashCode(this.f116700c)) * 31) + Float.hashCode(this.f116701d)) * 31;
            Integer num = this.f116702e;
            int i = 0;
            if (num == null) {
                hashCode = 0;
            } else {
                hashCode = num.hashCode();
            }
            int i2 = (hashCode2 + hashCode) * 31;
            Float f = this.f116703f;
            if (f != null) {
                i = f.hashCode();
            }
            return i2 + i;
        }

        @NotNull
        public String toString() {
            return "Params(width=" + this.f116698a + ", height=" + this.f116699b + ", color=" + this.f116700c + ", radius=" + this.f116701d + ", strokeColor=" + this.f116702e + ", strokeWidth=" + this.f116703f + ')';
        }
    }

    public RoundedRectDrawable(@NotNull C44464a params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.f116690a = params;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(params.m2899a());
        this.f116691b = paint;
        this.f116695f = m2901a(params.m2897c(), params.m2898b());
        this.f116696g = m2901a(params.m2897c(), params.m2894f());
        RectF rectF = new RectF(0.0f, 0.0f, params.m2894f(), params.m2898b());
        this.f116697h = rectF;
        if (params.m2896d() != null && params.m2895e() != null) {
            Paint paint2 = new Paint(1);
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setColor(params.m2896d().intValue());
            paint2.setStrokeWidth(params.m2895e().floatValue());
            this.f116692c = paint2;
            this.f116693d = params.m2895e().floatValue() / 2;
            this.f116694e = 1.0f;
        } else {
            this.f116692c = null;
            this.f116693d = 0.0f;
            this.f116694e = 0.0f;
        }
        Rect rect = new Rect();
        rectF.roundOut(rect);
        setBounds(rect);
    }

    /* renamed from: a */
    private final float m2901a(float f, float f2) {
        float f3;
        if (f >= f2 / 2) {
            f3 = this.f116693d;
        } else {
            f3 = 0.0f;
        }
        return f - f3;
    }

    /* renamed from: b */
    private final void m2900b(float f) {
        Rect bounds = getBounds();
        this.f116697h.set(bounds.left + f, bounds.top + f, bounds.right - f, bounds.bottom - f);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        m2900b(this.f116694e);
        canvas.drawRoundRect(this.f116697h, this.f116695f, this.f116696g, this.f116691b);
        Paint paint = this.f116692c;
        if (paint != null) {
            m2900b(this.f116693d);
            canvas.drawRoundRect(this.f116697h, this.f116690a.m2897c(), this.f116690a.m2897c(), paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.f116690a.m2898b();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return (int) this.f116690a.m2894f();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        C39638b.m12001k("Setting alpha is not implemented");
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        C39638b.m12001k("Setting color filter is not implemented");
    }
}
