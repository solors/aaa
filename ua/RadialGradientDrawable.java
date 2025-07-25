package ua;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.collections._Arrays;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.InterfaceC38501j;
import p804nd.LazyJVM;
import p804nd.NoWhenBranchMatchedException;

@Metadata
/* renamed from: ua.d */
/* loaded from: classes8.dex */
public final class RadialGradientDrawable extends Drawable {
    @NotNull

    /* renamed from: g */
    public static final C44456b f116662g = new C44456b(null);
    @NotNull

    /* renamed from: a */
    private AbstractC44460c f116663a;
    @NotNull

    /* renamed from: b */
    private AbstractC44453a f116664b;
    @NotNull

    /* renamed from: c */
    private AbstractC44453a f116665c;
    @NotNull

    /* renamed from: d */
    private int[] f116666d;
    @NotNull

    /* renamed from: e */
    private final Paint f116667e;
    @NotNull

    /* renamed from: f */
    private RectF f116668f;

    /* compiled from: RadialGradientDrawable.kt */
    @Metadata
    /* renamed from: ua.d$a */
    /* loaded from: classes8.dex */
    public static abstract class AbstractC44453a {

        /* compiled from: RadialGradientDrawable.kt */
        @Metadata
        /* renamed from: ua.d$a$a */
        /* loaded from: classes8.dex */
        public static final class C44454a extends AbstractC44453a {

            /* renamed from: a */
            private final float f116669a;

            public C44454a(float f) {
                super(null);
                this.f116669a = f;
            }

            /* renamed from: a */
            public final float m2918a() {
                return this.f116669a;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof C44454a) && Float.compare(this.f116669a, ((C44454a) obj).f116669a) == 0) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return Float.hashCode(this.f116669a);
            }

            @NotNull
            public String toString() {
                return "Fixed(value=" + this.f116669a + ')';
            }
        }

        /* compiled from: RadialGradientDrawable.kt */
        @Metadata
        /* renamed from: ua.d$a$b */
        /* loaded from: classes8.dex */
        public static final class C44455b extends AbstractC44453a {

            /* renamed from: a */
            private final float f116670a;

            public C44455b(float f) {
                super(null);
                this.f116670a = f;
            }

            /* renamed from: a */
            public final float m2917a() {
                return this.f116670a;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof C44455b) && Float.compare(this.f116670a, ((C44455b) obj).f116670a) == 0) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return Float.hashCode(this.f116670a);
            }

            @NotNull
            public String toString() {
                return "Relative(value=" + this.f116670a + ')';
            }
        }

        private AbstractC44453a() {
        }

        public /* synthetic */ AbstractC44453a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: RadialGradientDrawable.kt */
    @Metadata
    /* renamed from: ua.d$b */
    /* loaded from: classes8.dex */
    public static final class C44456b {

        /* compiled from: RadialGradientDrawable.kt */
        @Metadata
        /* renamed from: ua.d$b$a */
        /* loaded from: classes8.dex */
        public /* synthetic */ class C44457a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AbstractC44460c.C44462b.EnumC44463a.values().length];
                try {
                    iArr[AbstractC44460c.C44462b.EnumC44463a.NEAREST_CORNER.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AbstractC44460c.C44462b.EnumC44463a.FARTHEST_CORNER.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[AbstractC44460c.C44462b.EnumC44463a.NEAREST_SIDE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[AbstractC44460c.C44462b.EnumC44463a.FARTHEST_SIDE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: RadialGradientDrawable.kt */
        @Metadata
        /* renamed from: ua.d$b$b */
        /* loaded from: classes8.dex */
        public static final class C44458b extends Lambda implements Functions<Float[]> {

            /* renamed from: g */
            final /* synthetic */ float f116671g;

            /* renamed from: h */
            final /* synthetic */ float f116672h;

            /* renamed from: i */
            final /* synthetic */ float f116673i;

            /* renamed from: j */
            final /* synthetic */ float f116674j;

            /* renamed from: k */
            final /* synthetic */ float f116675k;

            /* renamed from: l */
            final /* synthetic */ float f116676l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C44458b(float f, float f2, float f3, float f4, float f5, float f6) {
                super(0);
                this.f116671g = f;
                this.f116672h = f2;
                this.f116673i = f3;
                this.f116674j = f4;
                this.f116675k = f5;
                this.f116676l = f6;
            }

            @Override // kotlin.jvm.functions.Functions
            @NotNull
            /* renamed from: b */
            public final Float[] invoke() {
                return new Float[]{Float.valueOf(C44456b.m2912e(this.f116675k, this.f116676l, this.f116671g, this.f116672h)), Float.valueOf(C44456b.m2912e(this.f116675k, this.f116676l, this.f116673i, this.f116672h)), Float.valueOf(C44456b.m2912e(this.f116675k, this.f116676l, this.f116673i, this.f116674j)), Float.valueOf(C44456b.m2912e(this.f116675k, this.f116676l, this.f116671g, this.f116674j))};
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: RadialGradientDrawable.kt */
        @Metadata
        /* renamed from: ua.d$b$c */
        /* loaded from: classes8.dex */
        public static final class C44459c extends Lambda implements Functions<Float[]> {

            /* renamed from: g */
            final /* synthetic */ float f116677g;

            /* renamed from: h */
            final /* synthetic */ float f116678h;

            /* renamed from: i */
            final /* synthetic */ float f116679i;

            /* renamed from: j */
            final /* synthetic */ float f116680j;

            /* renamed from: k */
            final /* synthetic */ float f116681k;

            /* renamed from: l */
            final /* synthetic */ float f116682l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C44459c(float f, float f2, float f3, float f4, float f5, float f6) {
                super(0);
                this.f116677g = f;
                this.f116678h = f2;
                this.f116679i = f3;
                this.f116680j = f4;
                this.f116681k = f5;
                this.f116682l = f6;
            }

            @Override // kotlin.jvm.functions.Functions
            @NotNull
            /* renamed from: b */
            public final Float[] invoke() {
                return new Float[]{Float.valueOf(C44456b.m2910g(this.f116681k, this.f116677g)), Float.valueOf(C44456b.m2910g(this.f116681k, this.f116678h)), Float.valueOf(C44456b.m2911f(this.f116682l, this.f116679i)), Float.valueOf(C44456b.m2911f(this.f116682l, this.f116680j))};
            }
        }

        private C44456b() {
        }

        public /* synthetic */ C44456b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static final float m2912e(float f, float f2, float f3, float f4) {
            double d = 2;
            return (float) Math.sqrt(((float) Math.pow(f - f3, d)) + ((float) Math.pow(f2 - f4, d)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public static final float m2911f(float f, float f2) {
            return Math.abs(f - f2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public static final float m2910g(float f, float f2) {
            return Math.abs(f - f2);
        }

        /* renamed from: h */
        private static final Float[] m2909h(InterfaceC38501j<Float[]> interfaceC38501j) {
            return interfaceC38501j.getValue();
        }

        /* renamed from: i */
        private static final Float[] m2908i(InterfaceC38501j<Float[]> interfaceC38501j) {
            return interfaceC38501j.getValue();
        }

        /* renamed from: j */
        private static final float m2907j(AbstractC44453a abstractC44453a, int i) {
            if (abstractC44453a instanceof AbstractC44453a.C44454a) {
                return ((AbstractC44453a.C44454a) abstractC44453a).m2918a();
            }
            if (abstractC44453a instanceof AbstractC44453a.C44455b) {
                return ((AbstractC44453a.C44455b) abstractC44453a).m2917a() * i;
            }
            throw new NoWhenBranchMatchedException();
        }

        @NotNull
        /* renamed from: d */
        public final RadialGradient m2913d(@NotNull AbstractC44460c radius, @NotNull AbstractC44453a centerX, @NotNull AbstractC44453a centerY, @NotNull int[] colors, int i, int i2) {
            InterfaceC38501j m14554a;
            InterfaceC38501j m14554a2;
            Float m17309q0;
            float floatValue;
            Float m17310p0;
            Float m17309q02;
            Float m17310p02;
            Intrinsics.checkNotNullParameter(radius, "radius");
            Intrinsics.checkNotNullParameter(centerX, "centerX");
            Intrinsics.checkNotNullParameter(centerY, "centerY");
            Intrinsics.checkNotNullParameter(colors, "colors");
            float m2907j = m2907j(centerX, i);
            float m2907j2 = m2907j(centerY, i2);
            float f = i;
            float f2 = i2;
            m14554a = LazyJVM.m14554a(new C44458b(0.0f, 0.0f, f, f2, m2907j, m2907j2));
            m14554a2 = LazyJVM.m14554a(new C44459c(0.0f, f, f2, 0.0f, m2907j, m2907j2));
            if (radius instanceof AbstractC44460c.C44461a) {
                floatValue = ((AbstractC44460c.C44461a) radius).m2904a();
            } else if (radius instanceof AbstractC44460c.C44462b) {
                int i3 = C44457a.$EnumSwitchMapping$0[((AbstractC44460c.C44462b) radius).m2903a().ordinal()];
                if (i3 == 1) {
                    m17309q0 = _Arrays.m17309q0(m2909h(m14554a));
                    Intrinsics.m17074g(m17309q0);
                    floatValue = m17309q0.floatValue();
                } else if (i3 == 2) {
                    m17310p0 = _Arrays.m17310p0(m2909h(m14554a));
                    Intrinsics.m17074g(m17310p0);
                    floatValue = m17310p0.floatValue();
                } else if (i3 == 3) {
                    m17309q02 = _Arrays.m17309q0(m2908i(m14554a2));
                    Intrinsics.m17074g(m17309q02);
                    floatValue = m17309q02.floatValue();
                } else if (i3 == 4) {
                    m17310p02 = _Arrays.m17310p0(m2908i(m14554a2));
                    Intrinsics.m17074g(m17310p02);
                    floatValue = m17310p02.floatValue();
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
            if (floatValue <= 0.0f) {
                floatValue = 0.01f;
            }
            return new RadialGradient(m2907j, m2907j2, floatValue, colors, (float[]) null, Shader.TileMode.CLAMP);
        }
    }

    /* compiled from: RadialGradientDrawable.kt */
    @Metadata
    /* renamed from: ua.d$c */
    /* loaded from: classes8.dex */
    public static abstract class AbstractC44460c {

        /* compiled from: RadialGradientDrawable.kt */
        @Metadata
        /* renamed from: ua.d$c$a */
        /* loaded from: classes8.dex */
        public static final class C44461a extends AbstractC44460c {

            /* renamed from: a */
            private final float f116683a;

            public C44461a(float f) {
                super(null);
                this.f116683a = f;
            }

            /* renamed from: a */
            public final float m2904a() {
                return this.f116683a;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof C44461a) && Float.compare(this.f116683a, ((C44461a) obj).f116683a) == 0) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return Float.hashCode(this.f116683a);
            }

            @NotNull
            public String toString() {
                return "Fixed(value=" + this.f116683a + ')';
            }
        }

        /* compiled from: RadialGradientDrawable.kt */
        @Metadata
        /* renamed from: ua.d$c$b */
        /* loaded from: classes8.dex */
        public static final class C44462b extends AbstractC44460c {
            @NotNull

            /* renamed from: a */
            private final EnumC44463a f116684a;

            /* compiled from: RadialGradientDrawable.kt */
            @Metadata
            /* renamed from: ua.d$c$b$a */
            /* loaded from: classes8.dex */
            public enum EnumC44463a {
                NEAREST_CORNER,
                FARTHEST_CORNER,
                NEAREST_SIDE,
                FARTHEST_SIDE
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C44462b(@NotNull EnumC44463a type) {
                super(null);
                Intrinsics.checkNotNullParameter(type, "type");
                this.f116684a = type;
            }

            @NotNull
            /* renamed from: a */
            public final EnumC44463a m2903a() {
                return this.f116684a;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof C44462b) && this.f116684a == ((C44462b) obj).f116684a) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return this.f116684a.hashCode();
            }

            @NotNull
            public String toString() {
                return "Relative(type=" + this.f116684a + ')';
            }
        }

        private AbstractC44460c() {
        }

        public /* synthetic */ AbstractC44460c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public RadialGradientDrawable(@NotNull AbstractC44460c radius, @NotNull AbstractC44453a centerX, @NotNull AbstractC44453a centerY, @NotNull int[] colors) {
        Intrinsics.checkNotNullParameter(radius, "radius");
        Intrinsics.checkNotNullParameter(centerX, "centerX");
        Intrinsics.checkNotNullParameter(centerY, "centerY");
        Intrinsics.checkNotNullParameter(colors, "colors");
        this.f116663a = radius;
        this.f116664b = centerX;
        this.f116665c = centerY;
        this.f116666d = colors;
        this.f116667e = new Paint();
        this.f116668f = new RectF();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.drawRect(this.f116668f, this.f116667e);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f116667e.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(@NotNull Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        super.onBoundsChange(bounds);
        this.f116667e.setShader(f116662g.m2913d(this.f116663a, this.f116664b, this.f116665c, this.f116666d, bounds.width(), bounds.height()));
        this.f116668f.set(bounds);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f116667e.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
    }
}
