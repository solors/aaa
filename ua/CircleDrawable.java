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
/* renamed from: ua.a */
/* loaded from: classes8.dex */
public final class CircleDrawable extends Drawable {
    @NotNull

    /* renamed from: a */
    private final C44450a f116641a;
    @NotNull

    /* renamed from: b */
    private final Paint f116642b;
    @Nullable

    /* renamed from: c */
    private final Paint f116643c;
    @NotNull

    /* renamed from: d */
    private final RectF f116644d;

    /* compiled from: CircleDrawable.kt */
    @Metadata
    /* renamed from: ua.a$a */
    /* loaded from: classes8.dex */
    public static final class C44450a {

        /* renamed from: a */
        private final float f116645a;

        /* renamed from: b */
        private final int f116646b;
        @Nullable

        /* renamed from: c */
        private final Integer f116647c;
        @Nullable

        /* renamed from: d */
        private final Float f116648d;

        public C44450a(@InterfaceC0152Px float f, int i, @Nullable Integer num, @Nullable Float f2) {
            this.f116645a = f;
            this.f116646b = i;
            this.f116647c = num;
            this.f116648d = f2;
        }

        /* renamed from: a */
        public final int m2931a() {
            return this.f116646b;
        }

        /* renamed from: b */
        public final float m2930b() {
            return this.f116645a;
        }

        @Nullable
        /* renamed from: c */
        public final Integer m2929c() {
            return this.f116647c;
        }

        @Nullable
        /* renamed from: d */
        public final Float m2928d() {
            return this.f116648d;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C44450a)) {
                return false;
            }
            C44450a c44450a = (C44450a) obj;
            if (Float.compare(this.f116645a, c44450a.f116645a) == 0 && this.f116646b == c44450a.f116646b && Intrinsics.m17075f(this.f116647c, c44450a.f116647c) && Intrinsics.m17075f(this.f116648d, c44450a.f116648d)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = ((Float.hashCode(this.f116645a) * 31) + Integer.hashCode(this.f116646b)) * 31;
            Integer num = this.f116647c;
            int i = 0;
            if (num == null) {
                hashCode = 0;
            } else {
                hashCode = num.hashCode();
            }
            int i2 = (hashCode2 + hashCode) * 31;
            Float f = this.f116648d;
            if (f != null) {
                i = f.hashCode();
            }
            return i2 + i;
        }

        @NotNull
        public String toString() {
            return "Params(radius=" + this.f116645a + ", color=" + this.f116646b + ", strokeColor=" + this.f116647c + ", strokeWidth=" + this.f116648d + ')';
        }
    }

    public CircleDrawable(@NotNull C44450a params) {
        Paint paint;
        Intrinsics.checkNotNullParameter(params, "params");
        this.f116641a = params;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(params.m2931a());
        this.f116642b = paint2;
        if (params.m2929c() != null && params.m2928d() != null) {
            paint = new Paint(1);
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(params.m2929c().intValue());
            paint.setStrokeWidth(params.m2928d().floatValue());
        } else {
            paint = null;
        }
        this.f116643c = paint;
        float f = 2;
        RectF rectF = new RectF(0.0f, 0.0f, params.m2930b() * f, params.m2930b() * f);
        this.f116644d = rectF;
        Rect rect = new Rect();
        rectF.roundOut(rect);
        setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        this.f116642b.setColor(this.f116641a.m2931a());
        this.f116644d.set(getBounds());
        canvas.drawCircle(this.f116644d.centerX(), this.f116644d.centerY(), this.f116641a.m2930b(), this.f116642b);
        if (this.f116643c != null) {
            canvas.drawCircle(this.f116644d.centerX(), this.f116644d.centerY(), this.f116641a.m2930b(), this.f116643c);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return ((int) this.f116641a.m2930b()) * 2;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return ((int) this.f116641a.m2930b()) * 2;
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
