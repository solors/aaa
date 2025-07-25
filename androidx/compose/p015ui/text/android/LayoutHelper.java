package androidx.compose.p015ui.text.android;

import android.text.Layout;
import androidx.annotation.IntRange;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C37563v;
import kotlin.collections._Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C37690r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LayoutHelper.kt */
@InternalPlatformTextApi
@Metadata
/* renamed from: androidx.compose.ui.text.android.LayoutHelper */
/* loaded from: classes.dex */
public final class LayoutHelper {
    @NotNull
    private final boolean[] bidiProcessedParagraphs;
    @NotNull
    private final Layout layout;
    @NotNull
    private final List<Bidi> paragraphBidi;
    private final int paragraphCount;
    @NotNull
    private final List<Integer> paragraphEnds;
    @Nullable
    private char[] tmpBuffer;

    /* compiled from: LayoutHelper.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.text.android.LayoutHelper$BidiRun */
    /* loaded from: classes.dex */
    private static final class BidiRun {
        private final int end;
        private final boolean isRtl;
        private final int start;

        public BidiRun(int i, int i2, boolean z) {
            this.start = i;
            this.end = i2;
            this.isRtl = z;
        }

        public static /* synthetic */ BidiRun copy$default(BidiRun bidiRun, int i, int i2, boolean z, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = bidiRun.start;
            }
            if ((i3 & 2) != 0) {
                i2 = bidiRun.end;
            }
            if ((i3 & 4) != 0) {
                z = bidiRun.isRtl;
            }
            return bidiRun.copy(i, i2, z);
        }

        public final int component1() {
            return this.start;
        }

        public final int component2() {
            return this.end;
        }

        public final boolean component3() {
            return this.isRtl;
        }

        @NotNull
        public final BidiRun copy(int i, int i2, boolean z) {
            return new BidiRun(i, i2, z);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BidiRun)) {
                return false;
            }
            BidiRun bidiRun = (BidiRun) obj;
            if (this.start == bidiRun.start && this.end == bidiRun.end && this.isRtl == bidiRun.isRtl) {
                return true;
            }
            return false;
        }

        public final int getEnd() {
            return this.end;
        }

        public final int getStart() {
            return this.start;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = ((Integer.hashCode(this.start) * 31) + Integer.hashCode(this.end)) * 31;
            boolean z = this.isRtl;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return hashCode + i;
        }

        public final boolean isRtl() {
            return this.isRtl;
        }

        @NotNull
        public String toString() {
            return "BidiRun(start=" + this.start + ", end=" + this.end + ", isRtl=" + this.isRtl + ')';
        }
    }

    public LayoutHelper(@NotNull Layout layout) {
        int m16568d0;
        int i;
        Intrinsics.checkNotNullParameter(layout, "layout");
        this.layout = layout;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        do {
            CharSequence text = this.layout.getText();
            Intrinsics.checkNotNullExpressionValue(text, "layout.text");
            m16568d0 = C37690r.m16568d0(text, '\n', i2, false, 4, null);
            if (m16568d0 < 0) {
                i = this.layout.getText().length();
            } else {
                i = m16568d0 + 1;
            }
            i2 = i;
            arrayList.add(Integer.valueOf(i2));
        } while (i2 < this.layout.getText().length());
        this.paragraphEnds = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            arrayList2.add(null);
        }
        this.paragraphBidi = arrayList2;
        this.bidiProcessedParagraphs = new boolean[this.paragraphEnds.size()];
        this.paragraphCount = this.paragraphEnds.size();
    }

    private final float getDownstreamHorizontal(int i, boolean z) {
        if (z) {
            return this.layout.getPrimaryHorizontal(i);
        }
        return this.layout.getSecondaryHorizontal(i);
    }

    public static /* synthetic */ int getParagraphForOffset$default(LayoutHelper layoutHelper, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return layoutHelper.getParagraphForOffset(i, z);
    }

    private final int lineEndToVisibleEnd(int i) {
        while (i > 0 && isLineEndSpace(this.layout.getText().charAt(i - 1))) {
            i--;
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005d, code lost:
        if (r0.getRunCount() == 1) goto L25;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.text.Bidi analyzeBidi(int r12) {
        /*
            r11 = this;
            boolean[] r0 = r11.bidiProcessedParagraphs
            boolean r0 = r0[r12]
            if (r0 == 0) goto Lf
            java.util.List<java.text.Bidi> r0 = r11.paragraphBidi
            java.lang.Object r12 = r0.get(r12)
            java.text.Bidi r12 = (java.text.Bidi) r12
            return r12
        Lf:
            r0 = 0
            if (r12 != 0) goto L14
            r1 = r0
            goto L22
        L14:
            java.util.List<java.lang.Integer> r1 = r11.paragraphEnds
            int r2 = r12 + (-1)
            java.lang.Object r1 = r1.get(r2)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
        L22:
            java.util.List<java.lang.Integer> r2 = r11.paragraphEnds
            java.lang.Object r2 = r2.get(r12)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            int r8 = r2 - r1
            char[] r3 = r11.tmpBuffer
            if (r3 == 0) goto L37
            int r4 = r3.length
            if (r4 >= r8) goto L39
        L37:
            char[] r3 = new char[r8]
        L39:
            r10 = r3
            android.text.Layout r3 = r11.layout
            java.lang.CharSequence r3 = r3.getText()
            android.text.TextUtils.getChars(r3, r1, r2, r10, r0)
            boolean r0 = java.text.Bidi.requiresBidi(r10, r0, r8)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L5f
            boolean r9 = r11.isRtlParagraph(r12)
            java.text.Bidi r0 = new java.text.Bidi
            r5 = 0
            r6 = 0
            r7 = 0
            r3 = r0
            r4 = r10
            r3.<init>(r4, r5, r6, r7, r8, r9)
            int r3 = r0.getRunCount()
            if (r3 != r2) goto L60
        L5f:
            r0 = r1
        L60:
            java.util.List<java.text.Bidi> r3 = r11.paragraphBidi
            r3.set(r12, r0)
            boolean[] r3 = r11.bidiProcessedParagraphs
            r3[r12] = r2
            if (r0 == 0) goto L72
            char[] r12 = r11.tmpBuffer
            if (r10 != r12) goto L71
            r10 = r1
            goto L72
        L71:
            r10 = r12
        L72:
            r11.tmpBuffer = r10
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.text.android.LayoutHelper.analyzeBidi(int):java.text.Bidi");
    }

    public final float getHorizontalPosition(int i, boolean z, boolean z2) {
        Bidi bidi;
        int m17325a0;
        boolean z3;
        int m17325a02;
        boolean z4;
        boolean z5;
        if (!z2) {
            return getDownstreamHorizontal(i, z);
        }
        int lineForOffset = LayoutCompatKt.getLineForOffset(this.layout, i, z2);
        int lineStart = this.layout.getLineStart(lineForOffset);
        int lineEnd = this.layout.getLineEnd(lineForOffset);
        if (i != lineStart && i != lineEnd) {
            return getDownstreamHorizontal(i, z);
        }
        if (i != 0 && i != this.layout.getText().length()) {
            int paragraphForOffset = getParagraphForOffset(i, z2);
            boolean isRtlParagraph = isRtlParagraph(paragraphForOffset);
            int lineEndToVisibleEnd = lineEndToVisibleEnd(lineEnd);
            int paragraphStart = getParagraphStart(paragraphForOffset);
            int i2 = lineStart - paragraphStart;
            int i3 = lineEndToVisibleEnd - paragraphStart;
            Bidi analyzeBidi = analyzeBidi(paragraphForOffset);
            if (analyzeBidi != null) {
                bidi = analyzeBidi.createLineBidi(i2, i3);
            } else {
                bidi = null;
            }
            boolean z6 = false;
            if (bidi != null && bidi.getRunCount() != 1) {
                int runCount = bidi.getRunCount();
                BidiRun[] bidiRunArr = new BidiRun[runCount];
                for (int i4 = 0; i4 < runCount; i4++) {
                    int runStart = bidi.getRunStart(i4) + lineStart;
                    int runLimit = bidi.getRunLimit(i4) + lineStart;
                    if (bidi.getRunLevel(i4) % 2 == 1) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    bidiRunArr[i4] = new BidiRun(runStart, runLimit, z5);
                }
                int runCount2 = bidi.getRunCount();
                byte[] bArr = new byte[runCount2];
                for (int i5 = 0; i5 < runCount2; i5++) {
                    bArr[i5] = (byte) bidi.getRunLevel(i5);
                }
                Bidi.reorderVisually(bArr, 0, bidiRunArr, 0, runCount);
                int i6 = -1;
                if (i == lineStart) {
                    int i7 = 0;
                    while (true) {
                        if (i7 >= runCount) {
                            break;
                        }
                        if (bidiRunArr[i7].getStart() == i) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            i6 = i7;
                            break;
                        }
                        i7++;
                    }
                    BidiRun bidiRun = bidiRunArr[i6];
                    if (z || isRtlParagraph == bidiRun.isRtl()) {
                        if (!isRtlParagraph) {
                            isRtlParagraph = true;
                        } else {
                            isRtlParagraph = false;
                        }
                    }
                    if (i6 != 0 || !isRtlParagraph) {
                        m17325a02 = _Arrays.m17325a0(bidiRunArr);
                        if (i6 == m17325a02 && !isRtlParagraph) {
                            return this.layout.getLineRight(lineForOffset);
                        }
                        if (isRtlParagraph) {
                            return this.layout.getPrimaryHorizontal(bidiRunArr[i6 - 1].getStart());
                        }
                        return this.layout.getPrimaryHorizontal(bidiRunArr[i6 + 1].getStart());
                    }
                    return this.layout.getLineLeft(lineForOffset);
                }
                int i8 = 0;
                while (true) {
                    if (i8 >= runCount) {
                        break;
                    }
                    if (bidiRunArr[i8].getEnd() == i) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        i6 = i8;
                        break;
                    }
                    i8++;
                }
                BidiRun bidiRun2 = bidiRunArr[i6];
                if (!z && isRtlParagraph != bidiRun2.isRtl()) {
                    isRtlParagraph = !isRtlParagraph;
                }
                if (i6 != 0 || !isRtlParagraph) {
                    m17325a0 = _Arrays.m17325a0(bidiRunArr);
                    if (i6 == m17325a0 && !isRtlParagraph) {
                        return this.layout.getLineRight(lineForOffset);
                    }
                    if (isRtlParagraph) {
                        return this.layout.getPrimaryHorizontal(bidiRunArr[i6 - 1].getEnd());
                    }
                    return this.layout.getPrimaryHorizontal(bidiRunArr[i6 + 1].getEnd());
                }
                return this.layout.getLineLeft(lineForOffset);
            }
            boolean isRtlCharAt = this.layout.isRtlCharAt(lineStart);
            if (z || isRtlParagraph == isRtlCharAt) {
                if (!isRtlParagraph) {
                    isRtlParagraph = true;
                } else {
                    isRtlParagraph = false;
                }
            }
            if (i == lineStart) {
                z6 = isRtlParagraph;
            } else if (!isRtlParagraph) {
                z6 = true;
            }
            Layout layout = this.layout;
            if (z6) {
                return layout.getLineLeft(lineForOffset);
            }
            return layout.getLineRight(lineForOffset);
        }
        return getDownstreamHorizontal(i, z);
    }

    @NotNull
    public final Layout getLayout() {
        return this.layout;
    }

    public final int getParagraphCount() {
        return this.paragraphCount;
    }

    public final int getParagraphEnd(@IntRange(from = 0) int i) {
        return this.paragraphEnds.get(i).intValue();
    }

    public final int getParagraphForOffset(@IntRange(from = 0) int i, boolean z) {
        int m17167l;
        int i2;
        m17167l = C37563v.m17167l(this.paragraphEnds, Integer.valueOf(i), 0, 0, 6, null);
        if (m17167l < 0) {
            i2 = -(m17167l + 1);
        } else {
            i2 = m17167l + 1;
        }
        if (z && i2 > 0) {
            int i3 = i2 - 1;
            if (i == this.paragraphEnds.get(i3).intValue()) {
                return i3;
            }
        }
        return i2;
    }

    public final int getParagraphStart(@IntRange(from = 0) int i) {
        if (i == 0) {
            return 0;
        }
        return this.paragraphEnds.get(i - 1).intValue();
    }

    public final boolean isLineEndSpace(char c) {
        boolean z;
        if (c == ' ' || c == '\n' || c == 5760) {
            return true;
        }
        if (8192 <= c && c < 8203) {
            z = true;
        } else {
            z = false;
        }
        if ((z && c != 8199) || c == 8287 || c == 12288) {
            return true;
        }
        return false;
    }

    public final boolean isRtlParagraph(@IntRange(from = 0) int i) {
        if (this.layout.getParagraphDirection(this.layout.getLineForOffset(getParagraphStart(i))) == -1) {
            return true;
        }
        return false;
    }
}
