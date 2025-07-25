package androidx.compose.p015ui.text.android;

import android.graphics.Canvas;
import android.graphics.Path;
import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.annotation.InterfaceC0152Px;
import androidx.annotation.VisibleForTesting;
import androidx.compose.p015ui.text.android.style.BaselineShiftSpan;
import kotlin.Metadata;
import kotlin.Tuples;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.EnumC38505n;
import p804nd.InterfaceC38501j;
import p804nd.LazyJVM;

/* compiled from: TextLayout.kt */
@InternalPlatformTextApi
@Metadata
/* renamed from: androidx.compose.ui.text.android.TextLayout */
/* loaded from: classes.dex */
public final class TextLayout {
    private final int bottomPadding;
    private final boolean didExceedMaxLines;
    private final boolean fallbackLineSpacing;
    private final boolean includePadding;
    private final boolean isBoringLayout;
    @NotNull
    private final Layout layout;
    @NotNull
    private final InterfaceC38501j layoutHelper$delegate;
    @NotNull
    private final LayoutIntrinsics layoutIntrinsics;
    private final int lineCount;
    private final int topPadding;

    public TextLayout(@NotNull CharSequence charSequence, float f, @NotNull TextPaint textPaint, int i, @Nullable TextUtils.TruncateAt truncateAt, int i2, float f2, @InterfaceC0152Px float f3, boolean z, boolean z2, int i3, int i4, int i5, int i6, @Nullable int[] iArr, @Nullable int[] iArr2, @NotNull LayoutIntrinsics layoutIntrinsics) {
        boolean z3;
        boolean z4;
        Layout create;
        Tuples verticalPaddings;
        Tuples lineHeightPaddings;
        InterfaceC38501j m14553b;
        Intrinsics.checkNotNullParameter(charSequence, "charSequence");
        Intrinsics.checkNotNullParameter(textPaint, "textPaint");
        Intrinsics.checkNotNullParameter(layoutIntrinsics, "layoutIntrinsics");
        this.includePadding = z;
        this.fallbackLineSpacing = z2;
        this.layoutIntrinsics = layoutIntrinsics;
        int length = charSequence.length();
        TextDirectionHeuristic textDirectionHeuristic = TextLayoutKt.getTextDirectionHeuristic(i2);
        Layout.Alignment alignment = TextAlignmentAdapter.INSTANCE.get(i);
        boolean z5 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, BaselineShiftSpan.class) < length;
        BoringLayout.Metrics boringMetrics = layoutIntrinsics.getBoringMetrics();
        double d = f;
        int ceil = (int) Math.ceil(d);
        if (boringMetrics != null && layoutIntrinsics.getMaxIntrinsicWidth() <= f && !z5) {
            this.isBoringLayout = true;
            create = BoringLayoutFactory.INSTANCE.create(charSequence, textPaint, ceil, boringMetrics, alignment, z, truncateAt, ceil);
            z4 = true;
            z3 = false;
        } else {
            this.isBoringLayout = false;
            z3 = false;
            z4 = true;
            create = StaticLayoutFactory.INSTANCE.create(charSequence, 0, charSequence.length(), textPaint, ceil, textDirectionHeuristic, alignment, i3, truncateAt, (int) Math.ceil(d), f2, f3, i6, z, z2, i4, i5, iArr, iArr2);
        }
        this.layout = create;
        int min = Math.min(create.getLineCount(), i3);
        this.lineCount = min;
        this.didExceedMaxLines = (min >= i3 && (create.getEllipsisCount(min + (-1)) > 0 || create.getLineEnd(min + (-1)) != charSequence.length())) ? z4 : z3;
        verticalPaddings = TextLayoutKt.getVerticalPaddings(this);
        lineHeightPaddings = TextLayoutKt.getLineHeightPaddings(this);
        this.topPadding = Math.max(((Number) verticalPaddings.m17630c()).intValue(), ((Number) lineHeightPaddings.m17630c()).intValue());
        this.bottomPadding = Math.max(((Number) verticalPaddings.m17629d()).intValue(), ((Number) lineHeightPaddings.m17629d()).intValue());
        m14553b = LazyJVM.m14553b(EnumC38505n.f101867d, new TextLayout$layoutHelper$2(this));
        this.layoutHelper$delegate = m14553b;
    }

    private final LayoutHelper getLayoutHelper() {
        return (LayoutHelper) this.layoutHelper$delegate.getValue();
    }

    public static /* synthetic */ float getPrimaryHorizontal$default(TextLayout textLayout, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return textLayout.getPrimaryHorizontal(i, z);
    }

    public static /* synthetic */ float getSecondaryHorizontal$default(TextLayout textLayout, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return textLayout.getSecondaryHorizontal(i, z);
    }

    public final void fillBoundingBoxes(int i, int i2, @NotNull float[] array, int i3) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i4;
        float secondaryDownstream;
        float secondaryUpstream;
        Intrinsics.checkNotNullParameter(array, "array");
        int length = getText().length();
        int i5 = 1;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i < length) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (i2 > i) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    if (i2 <= length) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        if (array.length - i3 >= (i2 - i) * 4) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (z5) {
                            int lineForOffset = getLineForOffset(i);
                            int lineForOffset2 = getLineForOffset(i2 - 1);
                            HorizontalPositionCache horizontalPositionCache = new HorizontalPositionCache(this);
                            if (lineForOffset <= lineForOffset2) {
                                int i6 = lineForOffset;
                                int i7 = i3;
                                while (true) {
                                    int lineStart = getLineStart(i6);
                                    int lineEnd = getLineEnd(i6);
                                    int min = Math.min(i2, lineEnd);
                                    float lineTop = getLineTop(i6);
                                    float lineBottom = getLineBottom(i6);
                                    if (getParagraphDirection(i6) == i5) {
                                        i4 = i5;
                                    } else {
                                        i4 = 0;
                                    }
                                    int i8 = i4 ^ 1;
                                    for (int max = Math.max(i, lineStart); max < min; max++) {
                                        boolean isRtlCharAt = isRtlCharAt(max);
                                        if (i4 != 0 && !isRtlCharAt) {
                                            secondaryDownstream = horizontalPositionCache.getPrimaryDownstream(max);
                                            secondaryUpstream = horizontalPositionCache.getPrimaryUpstream(max + 1);
                                        } else if (i4 != 0 && isRtlCharAt) {
                                            secondaryUpstream = horizontalPositionCache.getSecondaryDownstream(max);
                                            secondaryDownstream = horizontalPositionCache.getSecondaryUpstream(max + 1);
                                        } else if (i8 != 0 && isRtlCharAt) {
                                            secondaryUpstream = horizontalPositionCache.getPrimaryDownstream(max);
                                            secondaryDownstream = horizontalPositionCache.getPrimaryUpstream(max + 1);
                                        } else {
                                            secondaryDownstream = horizontalPositionCache.getSecondaryDownstream(max);
                                            secondaryUpstream = horizontalPositionCache.getSecondaryUpstream(max + 1);
                                        }
                                        array[i7] = secondaryDownstream;
                                        array[i7 + 1] = lineTop;
                                        array[i7 + 2] = secondaryUpstream;
                                        array[i7 + 3] = lineBottom;
                                        i7 += 4;
                                    }
                                    if (i6 != lineForOffset2) {
                                        i6++;
                                        i5 = 1;
                                    } else {
                                        return;
                                    }
                                }
                            }
                        } else {
                            throw new IllegalArgumentException("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4".toString());
                        }
                    } else {
                        throw new IllegalArgumentException("endOffset must be smaller or equal to text length".toString());
                    }
                } else {
                    throw new IllegalArgumentException("endOffset must be greater than startOffset".toString());
                }
            } else {
                throw new IllegalArgumentException("startOffset must be less than text length".toString());
            }
        } else {
            throw new IllegalArgumentException("startOffset must be > 0".toString());
        }
    }

    public final int getBottomPadding$ui_text_release() {
        return this.bottomPadding;
    }

    public final boolean getDidExceedMaxLines() {
        return this.didExceedMaxLines;
    }

    public final boolean getFallbackLineSpacing() {
        return this.fallbackLineSpacing;
    }

    public final int getHeight() {
        int height;
        if (this.didExceedMaxLines) {
            height = this.layout.getLineBottom(this.lineCount - 1);
        } else {
            height = this.layout.getHeight();
        }
        return height + this.topPadding + this.bottomPadding;
    }

    public final boolean getIncludePadding() {
        return this.includePadding;
    }

    @NotNull
    public final Layout getLayout() {
        return this.layout;
    }

    @NotNull
    public final LayoutIntrinsics getLayoutIntrinsics() {
        return this.layoutIntrinsics;
    }

    public final float getLineAscent(int i) {
        return this.layout.getLineAscent(i);
    }

    public final float getLineBaseline(int i) {
        return this.topPadding + this.layout.getLineBaseline(i);
    }

    public final float getLineBottom(int i) {
        int i2;
        float lineBottom = this.topPadding + this.layout.getLineBottom(i);
        if (i == this.lineCount - 1) {
            i2 = this.bottomPadding;
        } else {
            i2 = 0;
        }
        return lineBottom + i2;
    }

    public final int getLineCount() {
        return this.lineCount;
    }

    public final float getLineDescent(int i) {
        return this.layout.getLineDescent(i);
    }

    public final int getLineEllipsisCount(int i) {
        return this.layout.getEllipsisCount(i);
    }

    public final int getLineEllipsisOffset(int i) {
        return this.layout.getEllipsisStart(i);
    }

    public final int getLineEnd(int i) {
        if (this.layout.getEllipsisStart(i) == 0) {
            return this.layout.getLineEnd(i);
        }
        return this.layout.getText().length();
    }

    public final int getLineForOffset(int i) {
        return this.layout.getLineForOffset(i);
    }

    public final int getLineForVertical(int i) {
        return this.layout.getLineForVertical(this.topPadding + i);
    }

    public final float getLineHeight(int i) {
        return getLineBottom(i) - getLineTop(i);
    }

    public final float getLineLeft(int i) {
        return this.layout.getLineLeft(i);
    }

    public final float getLineRight(int i) {
        return this.layout.getLineRight(i);
    }

    public final int getLineStart(int i) {
        return this.layout.getLineStart(i);
    }

    public final float getLineTop(int i) {
        int i2;
        float lineTop = this.layout.getLineTop(i);
        if (i == 0) {
            i2 = 0;
        } else {
            i2 = this.topPadding;
        }
        return lineTop + i2;
    }

    public final int getLineVisibleEnd(int i) {
        if (this.layout.getEllipsisStart(i) == 0) {
            return this.layout.getLineVisibleEnd(i);
        }
        return this.layout.getEllipsisStart(i) + this.layout.getLineStart(i);
    }

    public final float getLineWidth(int i) {
        return this.layout.getLineWidth(i);
    }

    public final float getMaxIntrinsicWidth() {
        return this.layoutIntrinsics.getMaxIntrinsicWidth();
    }

    public final float getMinIntrinsicWidth() {
        return this.layoutIntrinsics.getMinIntrinsicWidth();
    }

    public final int getOffsetForHorizontal(int i, float f) {
        return this.layout.getOffsetForHorizontal(i, f);
    }

    public final int getParagraphDirection(int i) {
        return this.layout.getParagraphDirection(i);
    }

    public final float getPrimaryHorizontal(int i, boolean z) {
        return getLayoutHelper().getHorizontalPosition(i, true, z);
    }

    public final float getSecondaryHorizontal(int i, boolean z) {
        return getLayoutHelper().getHorizontalPosition(i, false, z);
    }

    public final void getSelectionPath(int i, int i2, @NotNull Path dest) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.layout.getSelectionPath(i, i2, dest);
        if (this.topPadding != 0 && !dest.isEmpty()) {
            dest.offset(0.0f, this.topPadding);
        }
    }

    @NotNull
    public final CharSequence getText() {
        CharSequence text = this.layout.getText();
        Intrinsics.checkNotNullExpressionValue(text, "layout.text");
        return text;
    }

    public final int getTopPadding$ui_text_release() {
        return this.topPadding;
    }

    public final boolean isEllipsisApplied(int i) {
        if (this.layout.getEllipsisCount(i) > 0) {
            return true;
        }
        return false;
    }

    public final boolean isFallbackLinespacingApplied$ui_text_release() {
        if (this.fallbackLineSpacing && !this.isBoringLayout && Build.VERSION.SDK_INT >= 28) {
            return true;
        }
        return false;
    }

    public final boolean isLineEllipsized(int i) {
        if (this.layout.getEllipsisStart(i) != 0) {
            return true;
        }
        return false;
    }

    public final boolean isRtlCharAt(int i) {
        return this.layout.isRtlCharAt(i);
    }

    public final void paint(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int i = this.topPadding;
        if (i != 0) {
            canvas.translate(0.0f, i);
        }
        this.layout.draw(canvas);
        int i2 = this.topPadding;
        if (i2 != 0) {
            canvas.translate(0.0f, (-1) * i2);
        }
    }

    @VisibleForTesting
    public static /* synthetic */ void getBottomPadding$ui_text_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getLayout$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getTopPadding$ui_text_release$annotations() {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ TextLayout(java.lang.CharSequence r22, float r23, android.text.TextPaint r24, int r25, android.text.TextUtils.TruncateAt r26, int r27, float r28, float r29, boolean r30, boolean r31, int r32, int r33, int r34, int r35, int[] r36, int[] r37, androidx.compose.p015ui.text.android.LayoutIntrinsics r38, int r39, kotlin.jvm.internal.DefaultConstructorMarker r40) {
        /*
            r21 = this;
            r0 = r39
            r1 = r0 & 2
            r2 = 0
            if (r1 == 0) goto L9
            r5 = r2
            goto Lb
        L9:
            r5 = r23
        Lb:
            r1 = r0 & 8
            r3 = 0
            if (r1 == 0) goto L12
            r7 = r3
            goto L14
        L12:
            r7 = r25
        L14:
            r1 = r0 & 16
            r4 = 0
            if (r1 == 0) goto L1b
            r8 = r4
            goto L1d
        L1b:
            r8 = r26
        L1d:
            r1 = r0 & 32
            if (r1 == 0) goto L24
            r1 = 2
            r9 = r1
            goto L26
        L24:
            r9 = r27
        L26:
            r1 = r0 & 64
            if (r1 == 0) goto L2e
            r1 = 1065353216(0x3f800000, float:1.0)
            r10 = r1
            goto L30
        L2e:
            r10 = r28
        L30:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L36
            r11 = r2
            goto L38
        L36:
            r11 = r29
        L38:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L3e
            r12 = r3
            goto L40
        L3e:
            r12 = r30
        L40:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L47
            r1 = 1
            r13 = r1
            goto L49
        L47:
            r13 = r31
        L49:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L52
            r1 = 2147483647(0x7fffffff, float:NaN)
            r14 = r1
            goto L54
        L52:
            r14 = r32
        L54:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L5a
            r15 = r3
            goto L5c
        L5a:
            r15 = r33
        L5c:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L63
            r16 = r3
            goto L65
        L63:
            r16 = r34
        L65:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L6c
            r17 = r3
            goto L6e
        L6c:
            r17 = r35
        L6e:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L75
            r18 = r4
            goto L77
        L75:
            r18 = r36
        L77:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L80
            r19 = r4
            goto L82
        L80:
            r19 = r37
        L82:
            r1 = 65536(0x10000, float:9.18355E-41)
            r0 = r0 & r1
            if (r0 == 0) goto L93
            androidx.compose.ui.text.android.LayoutIntrinsics r0 = new androidx.compose.ui.text.android.LayoutIntrinsics
            r1 = r22
            r2 = r24
            r0.<init>(r1, r2, r9)
            r20 = r0
            goto L99
        L93:
            r1 = r22
            r2 = r24
            r20 = r38
        L99:
            r3 = r21
            r4 = r22
            r6 = r24
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.text.android.TextLayout.<init>(java.lang.CharSequence, float, android.text.TextPaint, int, android.text.TextUtils$TruncateAt, int, float, float, boolean, boolean, int, int, int, int, int[], int[], androidx.compose.ui.text.android.LayoutIntrinsics, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
