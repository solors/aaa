package ua;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: ua.b */
/* loaded from: classes8.dex */
public final class LinearGradientDrawable extends Drawable {
    @NotNull

    /* renamed from: e */
    public static final C44451a f116649e = new C44451a(null);

    /* renamed from: a */
    private final float f116650a;
    @NotNull

    /* renamed from: b */
    private final int[] f116651b;
    @NotNull

    /* renamed from: c */
    private final Paint f116652c;
    @NotNull

    /* renamed from: d */
    private RectF f116653d;

    /* compiled from: LinearGradientDrawable.kt */
    @Metadata
    /* renamed from: ua.b$a */
    /* loaded from: classes8.dex */
    public static final class C44451a {
        private C44451a() {
        }

        public /* synthetic */ C44451a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        private final float m2926b(float f) {
            return (float) ((f * 3.141592653589793d) / 180.0f);
        }

        @NotNull
        /* renamed from: a */
        public final LinearGradient m2927a(float f, @NotNull int[] colors, int i, int i2) {
            Intrinsics.checkNotNullParameter(colors, "colors");
            float f2 = i / 2;
            float cos = ((float) Math.cos(m2926b(f))) * f2;
            float f3 = i2 / 2;
            float sin = ((float) Math.sin(m2926b(f))) * f3;
            return new LinearGradient(f2 - cos, f3 + sin, f2 + cos, f3 - sin, colors, (float[]) null, Shader.TileMode.CLAMP);
        }
    }

    public LinearGradientDrawable(float f, @NotNull int[] colors) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        this.f116650a = f;
        this.f116651b = colors;
        this.f116652c = new Paint();
        this.f116653d = new RectF();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.drawRect(this.f116653d, this.f116652c);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f116652c.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(@NotNull Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        super.onBoundsChange(bounds);
        this.f116652c.setShader(f116649e.m2927a(this.f116650a, this.f116651b, bounds.width(), bounds.height()));
        this.f116653d.set(bounds);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f116652c.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
    }
}
