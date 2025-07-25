package androidx.compose.p015ui.text.android.style;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import androidx.compose.p015ui.text.android.InternalPlatformTextApi;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PlaceholderSpan.kt */
@InternalPlatformTextApi
@Metadata
/* renamed from: androidx.compose.ui.text.android.style.PlaceholderSpan */
/* loaded from: classes.dex */
public final class PlaceholderSpan extends ReplacementSpan {
    public static final int ALIGN_ABOVE_BASELINE = 0;
    public static final int ALIGN_BOTTOM = 2;
    public static final int ALIGN_CENTER = 3;
    public static final int ALIGN_TEXT_BOTTOM = 5;
    public static final int ALIGN_TEXT_CENTER = 6;
    public static final int ALIGN_TEXT_TOP = 4;
    public static final int ALIGN_TOP = 1;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int UNIT_EM = 1;
    public static final int UNIT_SP = 0;
    public static final int UNIT_UNSPECIFIED = 2;
    private Paint.FontMetricsInt fontMetrics;
    private final float height;
    private int heightPx;
    private final int heightUnit;
    private boolean isLaidOut;
    private final float pxPerSp;
    private final int verticalAlign;
    private final float width;
    private int widthPx;
    private final int widthUnit;

    /* compiled from: PlaceholderSpan.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.text.android.style.PlaceholderSpan$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {

        /* compiled from: PlaceholderSpan.kt */
        @Retention(RetentionPolicy.SOURCE)
        @Metadata
        /* renamed from: androidx.compose.ui.text.android.style.PlaceholderSpan$Companion$Unit */
        /* loaded from: classes.dex */
        public @interface Unit {
        }

        /* compiled from: PlaceholderSpan.kt */
        @Retention(RetentionPolicy.SOURCE)
        @Metadata
        /* renamed from: androidx.compose.ui.text.android.style.PlaceholderSpan$Companion$VerticalAlign */
        /* loaded from: classes.dex */
        public @interface VerticalAlign {
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public PlaceholderSpan(float f, int i, float f2, int i2, float f3, int i3) {
        this.width = f;
        this.widthUnit = i;
        this.height = f2;
        this.heightUnit = i2;
        this.pxPerSp = f3;
        this.verticalAlign = i3;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(@NotNull Canvas canvas, @Nullable CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(paint, "paint");
    }

    @NotNull
    public final Paint.FontMetricsInt getFontMetrics() {
        Paint.FontMetricsInt fontMetricsInt = this.fontMetrics;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        Intrinsics.m17056y("fontMetrics");
        return null;
    }

    public final int getHeightPx() {
        if (this.isLaidOut) {
            return this.heightPx;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.".toString());
    }

    @Override // android.text.style.ReplacementSpan
    @SuppressLint({"DocumentExceptions"})
    public int getSize(@NotNull Paint paint, @Nullable CharSequence charSequence, int i, int i2, @Nullable Paint.FontMetricsInt fontMetricsInt) {
        boolean z;
        float f;
        int ceilToInt;
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.isLaidOut = true;
        float textSize = paint.getTextSize();
        Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
        Intrinsics.checkNotNullExpressionValue(fontMetricsInt2, "paint.fontMetricsInt");
        this.fontMetrics = fontMetricsInt2;
        if (getFontMetrics().descent > getFontMetrics().ascent) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i3 = this.widthUnit;
            if (i3 != 0) {
                if (i3 == 1) {
                    f = this.width * textSize;
                } else {
                    throw new IllegalArgumentException("Unsupported unit.");
                }
            } else {
                f = this.width * this.pxPerSp;
            }
            this.widthPx = PlaceholderSpanKt.ceilToInt(f);
            int i4 = this.heightUnit;
            if (i4 != 0) {
                if (i4 == 1) {
                    ceilToInt = PlaceholderSpanKt.ceilToInt(this.height * textSize);
                } else {
                    throw new IllegalArgumentException("Unsupported unit.");
                }
            } else {
                ceilToInt = PlaceholderSpanKt.ceilToInt(this.height * this.pxPerSp);
            }
            this.heightPx = ceilToInt;
            if (fontMetricsInt != null) {
                fontMetricsInt.ascent = getFontMetrics().ascent;
                fontMetricsInt.descent = getFontMetrics().descent;
                fontMetricsInt.leading = getFontMetrics().leading;
                switch (this.verticalAlign) {
                    case 0:
                        if (fontMetricsInt.ascent > (-getHeightPx())) {
                            fontMetricsInt.ascent = -getHeightPx();
                            break;
                        }
                        break;
                    case 1:
                    case 4:
                        if (fontMetricsInt.ascent + getHeightPx() > fontMetricsInt.descent) {
                            fontMetricsInt.descent = fontMetricsInt.ascent + getHeightPx();
                            break;
                        }
                        break;
                    case 2:
                    case 5:
                        if (fontMetricsInt.ascent > fontMetricsInt.descent - getHeightPx()) {
                            fontMetricsInt.ascent = fontMetricsInt.descent - getHeightPx();
                            break;
                        }
                        break;
                    case 3:
                    case 6:
                        if (fontMetricsInt.descent - fontMetricsInt.ascent < getHeightPx()) {
                            int heightPx = fontMetricsInt.ascent - ((getHeightPx() - (fontMetricsInt.descent - fontMetricsInt.ascent)) / 2);
                            fontMetricsInt.ascent = heightPx;
                            fontMetricsInt.descent = heightPx + getHeightPx();
                            break;
                        }
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown verticalAlign.");
                }
                fontMetricsInt.top = Math.min(getFontMetrics().top, fontMetricsInt.ascent);
                fontMetricsInt.bottom = Math.max(getFontMetrics().bottom, fontMetricsInt.descent);
            }
            return getWidthPx();
        }
        throw new IllegalArgumentException("Invalid fontMetrics: line height can not be negative.".toString());
    }

    public final int getVerticalAlign() {
        return this.verticalAlign;
    }

    public final int getWidthPx() {
        if (this.isLaidOut) {
            return this.widthPx;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.".toString());
    }
}
