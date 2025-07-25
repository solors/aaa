package ua;

import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: ua.f */
/* loaded from: classes8.dex */
public final class ScalingDrawable extends Drawable {
    @Nullable

    /* renamed from: d */
    private Bitmap f116707d;
    @Nullable

    /* renamed from: e */
    private Picture f116708e;

    /* renamed from: h */
    private boolean f116711h;

    /* renamed from: k */
    private float f116714k;

    /* renamed from: l */
    private float f116715l;
    @NotNull

    /* renamed from: a */
    private EnumC44467c f116704a = EnumC44467c.NO_SCALE;
    @NotNull

    /* renamed from: b */
    private EnumC44465a f116705b = EnumC44465a.LEFT;
    @NotNull

    /* renamed from: c */
    private EnumC44466b f116706c = EnumC44466b.TOP;
    @NotNull

    /* renamed from: f */
    private final Paint f116709f = new Paint(3);
    @NotNull

    /* renamed from: g */
    private Matrix f116710g = new Matrix();

    /* renamed from: i */
    private float f116712i = 1.0f;

    /* renamed from: j */
    private float f116713j = 1.0f;

    /* compiled from: ScalingDrawable.kt */
    @Metadata
    /* renamed from: ua.f$a */
    /* loaded from: classes8.dex */
    public enum EnumC44465a {
        LEFT,
        CENTER,
        RIGHT
    }

    /* compiled from: ScalingDrawable.kt */
    @Metadata
    /* renamed from: ua.f$b */
    /* loaded from: classes8.dex */
    public enum EnumC44466b {
        TOP,
        CENTER,
        BOTTOM
    }

    /* compiled from: ScalingDrawable.kt */
    @Metadata
    /* renamed from: ua.f$c */
    /* loaded from: classes8.dex */
    public enum EnumC44467c {
        NO_SCALE,
        FIT,
        FILL,
        STRETCH
    }

    /* compiled from: ScalingDrawable.kt */
    @Metadata
    /* renamed from: ua.f$d */
    /* loaded from: classes8.dex */
    public /* synthetic */ class C44468d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[EnumC44467c.values().length];
            try {
                iArr[EnumC44467c.FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC44467c.FIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC44467c.NO_SCALE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[EnumC44465a.values().length];
            try {
                iArr2[EnumC44465a.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EnumC44465a.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[EnumC44466b.values().length];
            try {
                iArr3[EnumC44466b.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[EnumC44466b.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    /* renamed from: a */
    private final void m2893a() {
        this.f116711h = true;
        invalidateSelf();
    }

    /* renamed from: b */
    public final void m2892b(@NotNull EnumC44465a enumC44465a) {
        Intrinsics.checkNotNullParameter(enumC44465a, "<set-?>");
        this.f116705b = enumC44465a;
    }

    /* renamed from: c */
    public final void m2891c(@NotNull EnumC44466b enumC44466b) {
        Intrinsics.checkNotNullParameter(enumC44466b, "<set-?>");
        this.f116706c = enumC44466b;
    }

    /* renamed from: d */
    public final void m2890d(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.f116707d = bitmap;
        this.f116708e = null;
        m2893a();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bf  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void draw(@org.jetbrains.annotations.NotNull android.graphics.Canvas r10) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ua.ScalingDrawable.draw(android.graphics.Canvas):void");
    }

    /* renamed from: e */
    public final void m2889e(@NotNull EnumC44467c enumC44467c) {
        Intrinsics.checkNotNullParameter(enumC44467c, "<set-?>");
        this.f116704a = enumC44467c;
    }

    /* renamed from: f */
    public final void m2888f(@NotNull Picture picture) {
        Intrinsics.checkNotNullParameter(picture, "picture");
        this.f116708e = picture;
        this.f116707d = null;
        m2893a();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f116709f.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(@NotNull Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        super.onBoundsChange(bounds);
        m2893a();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f116709f.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
    }
}
