package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.selection.SelectionAdjustment;
import androidx.compose.p015ui.text.TextLayoutResult;
import androidx.compose.p015ui.text.TextRange;
import androidx.compose.p015ui.text.TextRangeKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges._Ranges;
import kotlin.text.C37690r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SelectionAdjustment.kt */
@Metadata
/* loaded from: classes.dex */
public interface SelectionAdjustment {
    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: SelectionAdjustment.kt */
    @Metadata
    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        @NotNull
        private static final SelectionAdjustment None = new SelectionAdjustment() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustment$Companion$None$1
            @Override // androidx.compose.foundation.text.selection.SelectionAdjustment
            /* renamed from: adjust-ZXO7KMw */
            public long mo106692adjustZXO7KMw(@NotNull TextLayoutResult textLayoutResult, long j, int i, boolean z, @Nullable TextRange textRange) {
                Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
                return j;
            }
        };
        @NotNull
        private static final SelectionAdjustment Character = new SelectionAdjustment() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustment$Companion$Character$1
            @Override // androidx.compose.foundation.text.selection.SelectionAdjustment
            /* renamed from: adjust-ZXO7KMw */
            public long mo106692adjustZXO7KMw(@NotNull TextLayoutResult textLayoutResult, long j, int i, boolean z, @Nullable TextRange textRange) {
                boolean z2;
                int m16578Y;
                Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
                if (TextRange.m109376getCollapsedimpl(j)) {
                    if (textRange != null) {
                        z2 = TextRange.m109381getReversedimpl(textRange.m109386unboximpl());
                    } else {
                        z2 = false;
                    }
                    int m109382getStartimpl = TextRange.m109382getStartimpl(j);
                    m16578Y = C37690r.m16578Y(textLayoutResult.getLayoutInput().getText());
                    return SelectionAdjustmentKt.ensureAtLeastOneChar(m109382getStartimpl, m16578Y, z, z2);
                }
                return j;
            }
        };
        @NotNull
        private static final SelectionAdjustment Word = new SelectionAdjustment() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustment$Companion$Word$1
            @Override // androidx.compose.foundation.text.selection.SelectionAdjustment
            /* renamed from: adjust-ZXO7KMw */
            public long mo106692adjustZXO7KMw(@NotNull TextLayoutResult textLayoutResult, long j, int i, boolean z, @Nullable TextRange textRange) {
                long m106694adjustByBoundaryDvylE;
                Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
                m106694adjustByBoundaryDvylE = SelectionAdjustment.Companion.$$INSTANCE.m106694adjustByBoundaryDvylE(textLayoutResult, j, new SelectionAdjustment$Companion$Word$1$adjust$1(textLayoutResult));
                return m106694adjustByBoundaryDvylE;
            }
        };
        @NotNull
        private static final SelectionAdjustment Paragraph = new SelectionAdjustment() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustment$Companion$Paragraph$1
            @Override // androidx.compose.foundation.text.selection.SelectionAdjustment
            /* renamed from: adjust-ZXO7KMw */
            public long mo106692adjustZXO7KMw(@NotNull TextLayoutResult textLayoutResult, long j, int i, boolean z, @Nullable TextRange textRange) {
                long m106694adjustByBoundaryDvylE;
                Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
                m106694adjustByBoundaryDvylE = SelectionAdjustment.Companion.$$INSTANCE.m106694adjustByBoundaryDvylE(textLayoutResult, j, new SelectionAdjustment$Companion$Paragraph$1$adjust$boundaryFun$1(textLayoutResult.getLayoutInput().getText()));
                return m106694adjustByBoundaryDvylE;
            }
        };
        @NotNull
        private static final SelectionAdjustment CharacterWithWordAccelerate = new SelectionAdjustment() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustment$Companion$CharacterWithWordAccelerate$1
            private final boolean isAtWordBoundary(TextLayoutResult textLayoutResult, int i) {
                long m109369getWordBoundaryjx7JFs = textLayoutResult.m109369getWordBoundaryjx7JFs(i);
                if (i != TextRange.m109382getStartimpl(m109369getWordBoundaryjx7JFs) && i != TextRange.m109377getEndimpl(m109369getWordBoundaryjx7JFs)) {
                    return false;
                }
                return true;
            }

            private final boolean isExpanding(int i, int i2, boolean z, boolean z2) {
                if (i2 == -1) {
                    return true;
                }
                if (i == i2) {
                    return false;
                }
                if (z ^ z2) {
                    if (i < i2) {
                        return true;
                    }
                } else if (i > i2) {
                    return true;
                }
                return false;
            }

            private final int snapToWordBoundary(TextLayoutResult textLayoutResult, int i, int i2, int i3, boolean z, boolean z2) {
                int lineStart;
                int lineEnd$default;
                long m109369getWordBoundaryjx7JFs = textLayoutResult.m109369getWordBoundaryjx7JFs(i);
                if (textLayoutResult.getLineForOffset(TextRange.m109382getStartimpl(m109369getWordBoundaryjx7JFs)) == i2) {
                    lineStart = TextRange.m109382getStartimpl(m109369getWordBoundaryjx7JFs);
                } else {
                    lineStart = textLayoutResult.getLineStart(i2);
                }
                if (textLayoutResult.getLineForOffset(TextRange.m109377getEndimpl(m109369getWordBoundaryjx7JFs)) == i2) {
                    lineEnd$default = TextRange.m109377getEndimpl(m109369getWordBoundaryjx7JFs);
                } else {
                    lineEnd$default = TextLayoutResult.getLineEnd$default(textLayoutResult, i2, false, 2, null);
                }
                if (lineStart == i3) {
                    return lineEnd$default;
                }
                if (lineEnd$default == i3) {
                    return lineStart;
                }
                int i4 = (lineStart + lineEnd$default) / 2;
                if (z ^ z2) {
                    if (i <= i4) {
                        return lineStart;
                    }
                } else if (i < i4) {
                    return lineStart;
                }
                return lineEnd$default;
            }

            private final int updateSelectionBoundary(TextLayoutResult textLayoutResult, int i, int i2, int i3, int i4, boolean z, boolean z2) {
                if (i == i2) {
                    return i3;
                }
                int lineForOffset = textLayoutResult.getLineForOffset(i);
                if (lineForOffset != textLayoutResult.getLineForOffset(i3)) {
                    return snapToWordBoundary(textLayoutResult, i, lineForOffset, i4, z, z2);
                }
                if (!isExpanding(i, i2, z, z2)) {
                    return i;
                }
                if (!isAtWordBoundary(textLayoutResult, i3)) {
                    return i;
                }
                return snapToWordBoundary(textLayoutResult, i, lineForOffset, i4, z, z2);
            }

            @Override // androidx.compose.foundation.text.selection.SelectionAdjustment
            /* renamed from: adjust-ZXO7KMw */
            public long mo106692adjustZXO7KMw(@NotNull TextLayoutResult textLayoutResult, long j, int i, boolean z, @Nullable TextRange textRange) {
                int updateSelectionBoundary;
                int i2;
                int m16578Y;
                Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
                if (textRange == null) {
                    return SelectionAdjustment.Companion.$$INSTANCE.getWord().mo106692adjustZXO7KMw(textLayoutResult, j, i, z, textRange);
                }
                if (TextRange.m109376getCollapsedimpl(j)) {
                    int m109382getStartimpl = TextRange.m109382getStartimpl(j);
                    m16578Y = C37690r.m16578Y(textLayoutResult.getLayoutInput().getText());
                    return SelectionAdjustmentKt.ensureAtLeastOneChar(m109382getStartimpl, m16578Y, z, TextRange.m109381getReversedimpl(textRange.m109386unboximpl()));
                }
                if (z) {
                    i2 = updateSelectionBoundary(textLayoutResult, TextRange.m109382getStartimpl(j), i, TextRange.m109382getStartimpl(textRange.m109386unboximpl()), TextRange.m109377getEndimpl(j), true, TextRange.m109381getReversedimpl(j));
                    updateSelectionBoundary = TextRange.m109377getEndimpl(j);
                } else {
                    int m109382getStartimpl2 = TextRange.m109382getStartimpl(j);
                    updateSelectionBoundary = updateSelectionBoundary(textLayoutResult, TextRange.m109377getEndimpl(j), i, TextRange.m109377getEndimpl(textRange.m109386unboximpl()), TextRange.m109382getStartimpl(j), false, TextRange.m109381getReversedimpl(j));
                    i2 = m109382getStartimpl2;
                }
                return TextRangeKt.TextRange(i2, updateSelectionBoundary);
            }
        };

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: adjustByBoundary--Dv-ylE  reason: not valid java name */
        public final long m106694adjustByBoundaryDvylE(TextLayoutResult textLayoutResult, long j, Function1<? super Integer, TextRange> function1) {
            boolean z;
            int m16578Y;
            int m16908n;
            int m16908n2;
            int m109382getStartimpl;
            int m109377getEndimpl;
            if (textLayoutResult.getLayoutInput().getText().length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                m16578Y = C37690r.m16578Y(textLayoutResult.getLayoutInput().getText());
                m16908n = _Ranges.m16908n(TextRange.m109382getStartimpl(j), 0, m16578Y);
                long m109386unboximpl = function1.invoke(Integer.valueOf(m16908n)).m109386unboximpl();
                m16908n2 = _Ranges.m16908n(TextRange.m109377getEndimpl(j), 0, m16578Y);
                long m109386unboximpl2 = function1.invoke(Integer.valueOf(m16908n2)).m109386unboximpl();
                if (TextRange.m109381getReversedimpl(j)) {
                    m109382getStartimpl = TextRange.m109377getEndimpl(m109386unboximpl);
                } else {
                    m109382getStartimpl = TextRange.m109382getStartimpl(m109386unboximpl);
                }
                if (TextRange.m109381getReversedimpl(j)) {
                    m109377getEndimpl = TextRange.m109382getStartimpl(m109386unboximpl2);
                } else {
                    m109377getEndimpl = TextRange.m109377getEndimpl(m109386unboximpl2);
                }
                return TextRangeKt.TextRange(m109382getStartimpl, m109377getEndimpl);
            }
            return TextRange.Companion.m109387getZerod9O1mEE();
        }

        @NotNull
        public final SelectionAdjustment getCharacter() {
            return Character;
        }

        @NotNull
        public final SelectionAdjustment getCharacterWithWordAccelerate() {
            return CharacterWithWordAccelerate;
        }

        @NotNull
        public final SelectionAdjustment getNone() {
            return None;
        }

        @NotNull
        public final SelectionAdjustment getParagraph() {
            return Paragraph;
        }

        @NotNull
        public final SelectionAdjustment getWord() {
            return Word;
        }
    }

    /* renamed from: adjust-ZXO7KMw  reason: not valid java name */
    long mo106692adjustZXO7KMw(@NotNull TextLayoutResult textLayoutResult, long j, int i, boolean z, @Nullable TextRange textRange);
}
