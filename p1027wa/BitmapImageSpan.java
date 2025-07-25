package p1027wa;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.ColorInt;
import be.MathJVM;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.NoWhenBranchMatchedException;
import sa.C39638b;

@Metadata
/* renamed from: wa.a */
/* loaded from: classes8.dex */
public final class BitmapImageSpan extends PositionAwareReplacementSpan {

    /* renamed from: b */
    private final int f117140b;

    /* renamed from: c */
    private final int f117141c;
    @Nullable

    /* renamed from: d */
    private final String f117142d;
    @NotNull

    /* renamed from: f */
    private final String f117143f;
    @Nullable

    /* renamed from: g */
    private final InterfaceC44645b f117144g;
    @NotNull

    /* renamed from: h */
    private final EnumC44644a f117145h;
    @NotNull

    /* renamed from: i */
    private final Drawable f117146i;

    /* renamed from: j */
    private float f117147j;

    /* renamed from: k */
    private float f117148k;

    /* renamed from: l */
    private float f117149l;

    /* renamed from: m */
    private float f117150m;

    /* compiled from: BitmapImageSpan.kt */
    @Metadata
    /* renamed from: wa.a$a */
    /* loaded from: classes8.dex */
    public enum EnumC44644a {
        BASELINE,
        LINE_BOTTOM
    }

    /* compiled from: BitmapImageSpan.kt */
    @Metadata
    /* renamed from: wa.a$b */
    /* loaded from: classes8.dex */
    public interface InterfaceC44645b {
        /* renamed from: a */
        void mo1684a();
    }

    /* compiled from: BitmapImageSpan.kt */
    @Metadata
    /* renamed from: wa.a$c */
    /* loaded from: classes8.dex */
    public /* synthetic */ class C44646c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC44644a.values().length];
            try {
                iArr[EnumC44644a.BASELINE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC44644a.LINE_BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public BitmapImageSpan(@NotNull Context context, @NotNull Bitmap bitmap, int i, int i2, int i3, int i4, @ColorInt @Nullable Integer num, @NotNull PorterDuff.Mode tintMode, boolean z, @Nullable String str, @NotNull String accessibilityType, @Nullable InterfaceC44645b interfaceC44645b, @NotNull EnumC44644a anchorPoint) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(tintMode, "tintMode");
        Intrinsics.checkNotNullParameter(accessibilityType, "accessibilityType");
        Intrinsics.checkNotNullParameter(anchorPoint, "anchorPoint");
        this.f117140b = i;
        this.f117141c = i2;
        this.f117142d = str;
        this.f117143f = accessibilityType;
        this.f117144g = interfaceC44645b;
        this.f117145h = anchorPoint;
        BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), bitmap);
        this.f117146i = bitmapDrawable;
        if (z) {
            m2168k(bitmap, i3, i4);
        } else {
            bitmapDrawable.setBounds(0, 0, i3, i4);
        }
        if (num != null) {
            bitmapDrawable.setColorFilter(new PorterDuffColorFilter(num.intValue(), tintMode));
        }
    }

    /* renamed from: i */
    private final float m2170i(int i, Paint paint) {
        float f;
        int i2 = this.f117141c;
        if (i2 > 0) {
            f = i2 / paint.getTextSize();
        } else {
            f = 1.0f;
        }
        return (((paint.ascent() + paint.descent()) / 2.0f) * f) - ((-i) / 2.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void m2168k(android.graphics.Bitmap r6, int r7, int r8) {
        /*
            r5 = this;
            int r0 = r6.getWidth()
            int r6 = r6.getHeight()
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r7 <= 0) goto L10
            float r2 = (float) r0
            float r7 = (float) r7
            float r2 = r2 / r7
            goto L11
        L10:
            r2 = r1
        L11:
            if (r8 <= 0) goto L17
            float r7 = (float) r6
            float r8 = (float) r8
            float r1 = r7 / r8
        L17:
            float r7 = java.lang.Math.max(r2, r1)
            android.graphics.drawable.Drawable r8 = r5.f117146i
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 <= 0) goto L2f
            int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r4 != 0) goto L28
            r4 = r1
            goto L29
        L28:
            r4 = r3
        L29:
            if (r4 != 0) goto L2f
            float r0 = (float) r0
            float r0 = r0 / r7
            int r0 = (int) r0
            goto L30
        L2f:
            r0 = r3
        L30:
            if (r6 <= 0) goto L3e
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 != 0) goto L37
            goto L38
        L37:
            r1 = r3
        L38:
            if (r1 != 0) goto L3e
            float r6 = (float) r6
            float r6 = r6 / r7
            int r6 = (int) r6
            goto L3f
        L3e:
            r6 = r3
        L3f:
            r8.setBounds(r3, r3, r0, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p1027wa.BitmapImageSpan.m2168k(android.graphics.Bitmap, int, int):void");
    }

    @Override // p1027wa.PositionAwareReplacementSpan
    /* renamed from: a */
    public int mo2164a(@NotNull Paint paint, @NotNull CharSequence text, int i, int i2, @Nullable Paint.FontMetricsInt fontMetricsInt) {
        int m103791d;
        Intrinsics.checkNotNullParameter(paint, "paint");
        Intrinsics.checkNotNullParameter(text, "text");
        if (fontMetricsInt != null && this.f117140b <= 0) {
            int i3 = 0;
            C39638b.m12010b(this.f117146i.getBounds().top, 0);
            int height = this.f117146i.getBounds().height();
            m103791d = MathJVM.m103791d(m2170i(height, paint));
            int i4 = C44646c.$EnumSwitchMapping$0[this.f117145h.ordinal()];
            if (i4 != 1) {
                if (i4 == 2) {
                    i3 = fontMetricsInt.bottom;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            int i5 = (-height) + m103791d + i3;
            int i6 = fontMetricsInt.top;
            int i7 = fontMetricsInt.ascent;
            fontMetricsInt.ascent = Math.min(i5, i7);
            int max = Math.max(height + i5, fontMetricsInt.descent);
            fontMetricsInt.descent = max;
            fontMetricsInt.top = fontMetricsInt.ascent + (i6 - i7);
            fontMetricsInt.bottom = max + (fontMetricsInt.bottom - fontMetricsInt.descent);
        }
        return this.f117146i.getBounds().right;
    }

    @Nullable
    /* renamed from: c */
    public final String m2176c() {
        return this.f117142d;
    }

    @NotNull
    /* renamed from: d */
    public final String m2175d() {
        return this.f117143f;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(@NotNull Canvas canvas, @NotNull CharSequence text, int i, int i2, float f, int i3, int i4, int i5, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        canvas.save();
        int i6 = C44646c.$EnumSwitchMapping$0[this.f117145h.ordinal()];
        if (i6 != 1) {
            if (i6 == 2) {
                i4 = i5;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        float m2170i = m2170i(this.f117146i.getBounds().height(), paint);
        float f2 = (i4 - this.f117146i.getBounds().bottom) + m2170i;
        this.f117148k = this.f117146i.getBounds().bottom + f2 + m2170i;
        this.f117147j = m2170i + f2;
        this.f117149l = f;
        this.f117150m = this.f117146i.getBounds().right + f;
        canvas.translate(f, f2);
        this.f117146i.draw(canvas);
        canvas.restore();
    }

    /* renamed from: e */
    public final float m2174e() {
        return this.f117148k;
    }

    /* renamed from: f */
    public final float m2173f() {
        return this.f117149l;
    }

    /* renamed from: g */
    public final float m2172g() {
        return this.f117150m;
    }

    /* renamed from: h */
    public final float m2171h() {
        return this.f117147j;
    }

    @Nullable
    /* renamed from: j */
    public final InterfaceC44645b m2169j() {
        return this.f117144g;
    }
}
