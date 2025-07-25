package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.StringHelpers;
import androidx.compose.foundation.text.StringHelpers_androidKt;
import androidx.compose.foundation.text.selection.BaseTextPreparedSelection;
import androidx.compose.p015ui.geometry.OffsetKt;
import androidx.compose.p015ui.text.AnnotatedString;
import androidx.compose.p015ui.text.TextLayoutResult;
import androidx.compose.p015ui.text.TextRange;
import androidx.compose.p015ui.text.TextRangeKt;
import androidx.compose.p015ui.text.input.OffsetMapping;
import androidx.compose.p015ui.text.style.ResolvedTextDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TextPreparedSelection.kt */
@Metadata
/* loaded from: classes.dex */
public abstract class BaseTextPreparedSelection<T extends BaseTextPreparedSelection<T>> {
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int NoCharacterFound = -1;
    @NotNull
    private AnnotatedString annotatedString;
    @Nullable
    private final TextLayoutResult layoutResult;
    @NotNull
    private final OffsetMapping offsetMapping;
    private final long originalSelection;
    @NotNull
    private final AnnotatedString originalText;
    private long selection;
    @NotNull
    private final TextPreparedSelectionState state;

    /* compiled from: TextPreparedSelection.kt */
    @Metadata
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ BaseTextPreparedSelection(AnnotatedString annotatedString, long j, TextLayoutResult textLayoutResult, OffsetMapping offsetMapping, TextPreparedSelectionState textPreparedSelectionState, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, j, textLayoutResult, offsetMapping, textPreparedSelectionState);
    }

    public static /* synthetic */ BaseTextPreparedSelection apply$default(BaseTextPreparedSelection baseTextPreparedSelection, Object obj, boolean z, Function1 block, int i, Object obj2) {
        if (obj2 == null) {
            boolean z2 = true;
            if ((i & 1) != 0) {
                z = true;
            }
            Intrinsics.checkNotNullParameter(block, "block");
            if (z) {
                baseTextPreparedSelection.getState().resetCachedX();
            }
            if (baseTextPreparedSelection.getText$foundation_release().length() <= 0) {
                z2 = false;
            }
            if (z2) {
                block.invoke(obj);
            }
            if (obj != null) {
                return (BaseTextPreparedSelection) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: apply");
    }

    private final int charOffset(int i) {
        int m16912j;
        m16912j = _Ranges.m16912j(i, getText$foundation_release().length() - 1);
        return m16912j;
    }

    private final int getLineEndByOffsetForLayout(TextLayoutResult textLayoutResult, int i) {
        return this.offsetMapping.transformedToOriginal(textLayoutResult.getLineEnd(textLayoutResult.getLineForOffset(i), true));
    }

    static /* synthetic */ int getLineEndByOffsetForLayout$default(BaseTextPreparedSelection baseTextPreparedSelection, TextLayoutResult textLayoutResult, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                i = baseTextPreparedSelection.transformedMaxOffset();
            }
            return baseTextPreparedSelection.getLineEndByOffsetForLayout(textLayoutResult, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineEndByOffsetForLayout");
    }

    private final int getLineStartByOffsetForLayout(TextLayoutResult textLayoutResult, int i) {
        return this.offsetMapping.transformedToOriginal(textLayoutResult.getLineStart(textLayoutResult.getLineForOffset(i)));
    }

    static /* synthetic */ int getLineStartByOffsetForLayout$default(BaseTextPreparedSelection baseTextPreparedSelection, TextLayoutResult textLayoutResult, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                i = baseTextPreparedSelection.transformedMinOffset();
            }
            return baseTextPreparedSelection.getLineStartByOffsetForLayout(textLayoutResult, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineStartByOffsetForLayout");
    }

    private final int getNextWordOffsetForLayout(TextLayoutResult textLayoutResult, int i) {
        if (i >= this.originalText.length()) {
            return this.originalText.length();
        }
        long m109369getWordBoundaryjx7JFs = textLayoutResult.m109369getWordBoundaryjx7JFs(charOffset(i));
        if (TextRange.m109377getEndimpl(m109369getWordBoundaryjx7JFs) <= i) {
            return getNextWordOffsetForLayout(textLayoutResult, i + 1);
        }
        return this.offsetMapping.transformedToOriginal(TextRange.m109377getEndimpl(m109369getWordBoundaryjx7JFs));
    }

    static /* synthetic */ int getNextWordOffsetForLayout$default(BaseTextPreparedSelection baseTextPreparedSelection, TextLayoutResult textLayoutResult, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                i = baseTextPreparedSelection.transformedEndOffset();
            }
            return baseTextPreparedSelection.getNextWordOffsetForLayout(textLayoutResult, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNextWordOffsetForLayout");
    }

    private final int getParagraphEnd() {
        return StringHelpers.findParagraphEnd(getText$foundation_release(), TextRange.m109379getMaximpl(this.selection));
    }

    private final int getParagraphStart() {
        return StringHelpers.findParagraphStart(getText$foundation_release(), TextRange.m109380getMinimpl(this.selection));
    }

    private final int getPrevWordOffset(TextLayoutResult textLayoutResult, int i) {
        if (i < 0) {
            return 0;
        }
        long m109369getWordBoundaryjx7JFs = textLayoutResult.m109369getWordBoundaryjx7JFs(charOffset(i));
        if (TextRange.m109382getStartimpl(m109369getWordBoundaryjx7JFs) >= i) {
            return getPrevWordOffset(textLayoutResult, i - 1);
        }
        return this.offsetMapping.transformedToOriginal(TextRange.m109382getStartimpl(m109369getWordBoundaryjx7JFs));
    }

    static /* synthetic */ int getPrevWordOffset$default(BaseTextPreparedSelection baseTextPreparedSelection, TextLayoutResult textLayoutResult, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                i = baseTextPreparedSelection.transformedEndOffset();
            }
            return baseTextPreparedSelection.getPrevWordOffset(textLayoutResult, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPrevWordOffset");
    }

    private final boolean isLtr() {
        ResolvedTextDirection resolvedTextDirection;
        TextLayoutResult textLayoutResult = this.layoutResult;
        if (textLayoutResult != null) {
            resolvedTextDirection = textLayoutResult.getParagraphDirection(TextRange.m109377getEndimpl(this.selection));
        } else {
            resolvedTextDirection = null;
        }
        if (resolvedTextDirection != ResolvedTextDirection.Rtl) {
            return true;
        }
        return false;
    }

    private final int jumpByLinesOffset(TextLayoutResult textLayoutResult, int i) {
        int transformedEndOffset = transformedEndOffset();
        if (this.state.getCachedX() == null) {
            this.state.setCachedX(Float.valueOf(textLayoutResult.getCursorRect(transformedEndOffset).getLeft()));
        }
        int lineForOffset = textLayoutResult.getLineForOffset(transformedEndOffset) + i;
        if (lineForOffset < 0) {
            return 0;
        }
        if (lineForOffset >= textLayoutResult.getLineCount()) {
            return getText$foundation_release().length();
        }
        float lineBottom = textLayoutResult.getLineBottom(lineForOffset) - 1;
        Float cachedX = this.state.getCachedX();
        Intrinsics.m17074g(cachedX);
        float floatValue = cachedX.floatValue();
        if ((isLtr() && floatValue >= textLayoutResult.getLineRight(lineForOffset)) || (!isLtr() && floatValue <= textLayoutResult.getLineLeft(lineForOffset))) {
            return textLayoutResult.getLineEnd(lineForOffset, true);
        }
        return this.offsetMapping.transformedToOriginal(textLayoutResult.m109367getOffsetForPositionk4lQ0M(OffsetKt.Offset(cachedX.floatValue(), lineBottom)));
    }

    private final T moveCursorNext() {
        boolean z;
        int nextCharacterIndex;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && (nextCharacterIndex = getNextCharacterIndex()) != -1) {
            setCursor(nextCharacterIndex);
        }
        return this;
    }

    private final T moveCursorNextByWord() {
        boolean z;
        Integer nextWordOffset;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && (nextWordOffset = getNextWordOffset()) != null) {
            setCursor(nextWordOffset.intValue());
        }
        return this;
    }

    private final T moveCursorPrev() {
        boolean z;
        int precedingCharacterIndex;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && (precedingCharacterIndex = getPrecedingCharacterIndex()) != -1) {
            setCursor(precedingCharacterIndex);
        }
        return this;
    }

    private final T moveCursorPrevByWord() {
        boolean z;
        Integer previousWordOffset;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && (previousWordOffset = getPreviousWordOffset()) != null) {
            setCursor(previousWordOffset.intValue());
        }
        return this;
    }

    private final int transformedEndOffset() {
        return this.offsetMapping.originalToTransformed(TextRange.m109377getEndimpl(this.selection));
    }

    private final int transformedMaxOffset() {
        return this.offsetMapping.originalToTransformed(TextRange.m109379getMaximpl(this.selection));
    }

    private final int transformedMinOffset() {
        return this.offsetMapping.originalToTransformed(TextRange.m109380getMinimpl(this.selection));
    }

    @NotNull
    protected final <U> T apply(U u, boolean z, @NotNull Function1<? super U, Unit> block) {
        boolean z2;
        Intrinsics.checkNotNullParameter(block, "block");
        if (z) {
            getState().resetCachedX();
        }
        if (getText$foundation_release().length() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            block.invoke(u);
        }
        if (u != null) {
            return (T) u;
        }
        throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
    }

    @NotNull
    public final T collapseLeftOr(@NotNull Function1<? super T, Unit> or) {
        boolean z;
        Intrinsics.checkNotNullParameter(or, "or");
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (TextRange.m109376getCollapsedimpl(this.selection)) {
                or.invoke(this);
            } else if (isLtr()) {
                setCursor(TextRange.m109380getMinimpl(this.selection));
            } else {
                setCursor(TextRange.m109379getMaximpl(this.selection));
            }
        }
        return this;
    }

    @NotNull
    public final T collapseRightOr(@NotNull Function1<? super T, Unit> or) {
        boolean z;
        Intrinsics.checkNotNullParameter(or, "or");
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (TextRange.m109376getCollapsedimpl(this.selection)) {
                or.invoke(this);
            } else if (isLtr()) {
                setCursor(TextRange.m109379getMaximpl(this.selection));
            } else {
                setCursor(TextRange.m109380getMinimpl(this.selection));
            }
        }
        return this;
    }

    @NotNull
    public final T deselect() {
        boolean z;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            setCursor(TextRange.m109377getEndimpl(this.selection));
        }
        return this;
    }

    @NotNull
    public final AnnotatedString getAnnotatedString() {
        return this.annotatedString;
    }

    @Nullable
    public final TextLayoutResult getLayoutResult() {
        return this.layoutResult;
    }

    @Nullable
    public final Integer getLineEndByOffset() {
        TextLayoutResult textLayoutResult = this.layoutResult;
        if (textLayoutResult == null) {
            return null;
        }
        return Integer.valueOf(getLineEndByOffsetForLayout$default(this, textLayoutResult, 0, 1, null));
    }

    @Nullable
    public final Integer getLineStartByOffset() {
        TextLayoutResult textLayoutResult = this.layoutResult;
        if (textLayoutResult == null) {
            return null;
        }
        return Integer.valueOf(getLineStartByOffsetForLayout$default(this, textLayoutResult, 0, 1, null));
    }

    public final int getNextCharacterIndex() {
        return StringHelpers_androidKt.findFollowingBreak(this.annotatedString.getText(), TextRange.m109377getEndimpl(this.selection));
    }

    @Nullable
    public final Integer getNextWordOffset() {
        TextLayoutResult textLayoutResult = this.layoutResult;
        if (textLayoutResult == null) {
            return null;
        }
        return Integer.valueOf(getNextWordOffsetForLayout$default(this, textLayoutResult, 0, 1, null));
    }

    @NotNull
    public final OffsetMapping getOffsetMapping() {
        return this.offsetMapping;
    }

    /* renamed from: getOriginalSelection-d9O1mEE  reason: not valid java name */
    public final long m106678getOriginalSelectiond9O1mEE() {
        return this.originalSelection;
    }

    @NotNull
    public final AnnotatedString getOriginalText() {
        return this.originalText;
    }

    public final int getPrecedingCharacterIndex() {
        return StringHelpers_androidKt.findPrecedingBreak(this.annotatedString.getText(), TextRange.m109377getEndimpl(this.selection));
    }

    @Nullable
    public final Integer getPreviousWordOffset() {
        TextLayoutResult textLayoutResult = this.layoutResult;
        if (textLayoutResult == null) {
            return null;
        }
        return Integer.valueOf(getPrevWordOffset$default(this, textLayoutResult, 0, 1, null));
    }

    /* renamed from: getSelection-d9O1mEE  reason: not valid java name */
    public final long m106679getSelectiond9O1mEE() {
        return this.selection;
    }

    @NotNull
    public final TextPreparedSelectionState getState() {
        return this.state;
    }

    @NotNull
    public final String getText$foundation_release() {
        return this.annotatedString.getText();
    }

    @NotNull
    public final T moveCursorDownByLine() {
        boolean z;
        TextLayoutResult textLayoutResult;
        if (getText$foundation_release().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && (textLayoutResult = this.layoutResult) != null) {
            setCursor(jumpByLinesOffset(textLayoutResult, 1));
        }
        return this;
    }

    @NotNull
    public final T moveCursorLeft() {
        boolean z;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (isLtr()) {
                moveCursorPrev();
            } else {
                moveCursorNext();
            }
        }
        return this;
    }

    @NotNull
    public final T moveCursorLeftByWord() {
        boolean z;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (isLtr()) {
                moveCursorPrevByWord();
            } else {
                moveCursorNextByWord();
            }
        }
        return this;
    }

    @NotNull
    public final T moveCursorNextByParagraph() {
        boolean z;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            setCursor(getParagraphEnd());
        }
        return this;
    }

    @NotNull
    public final T moveCursorPrevByParagraph() {
        boolean z;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            setCursor(getParagraphStart());
        }
        return this;
    }

    @NotNull
    public final T moveCursorRight() {
        boolean z;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (isLtr()) {
                moveCursorNext();
            } else {
                moveCursorPrev();
            }
        }
        return this;
    }

    @NotNull
    public final T moveCursorRightByWord() {
        boolean z;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (isLtr()) {
                moveCursorNextByWord();
            } else {
                moveCursorPrevByWord();
            }
        }
        return this;
    }

    @NotNull
    public final T moveCursorToEnd() {
        boolean z;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            setCursor(getText$foundation_release().length());
        }
        return this;
    }

    @NotNull
    public final T moveCursorToHome() {
        boolean z;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            setCursor(0);
        }
        return this;
    }

    @NotNull
    public final T moveCursorToLineEnd() {
        boolean z;
        Integer lineEndByOffset;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && (lineEndByOffset = getLineEndByOffset()) != null) {
            setCursor(lineEndByOffset.intValue());
        }
        return this;
    }

    @NotNull
    public final T moveCursorToLineLeftSide() {
        boolean z;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (isLtr()) {
                moveCursorToLineStart();
            } else {
                moveCursorToLineEnd();
            }
        }
        return this;
    }

    @NotNull
    public final T moveCursorToLineRightSide() {
        boolean z;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (isLtr()) {
                moveCursorToLineEnd();
            } else {
                moveCursorToLineStart();
            }
        }
        return this;
    }

    @NotNull
    public final T moveCursorToLineStart() {
        boolean z;
        Integer lineStartByOffset;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && (lineStartByOffset = getLineStartByOffset()) != null) {
            setCursor(lineStartByOffset.intValue());
        }
        return this;
    }

    @NotNull
    public final T moveCursorUpByLine() {
        boolean z;
        TextLayoutResult textLayoutResult;
        if (getText$foundation_release().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && (textLayoutResult = this.layoutResult) != null) {
            setCursor(jumpByLinesOffset(textLayoutResult, -1));
        }
        return this;
    }

    @NotNull
    public final T selectAll() {
        boolean z;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            setSelection(0, getText$foundation_release().length());
        }
        return this;
    }

    @NotNull
    public final T selectMovement() {
        boolean z;
        if (getText$foundation_release().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.selection = TextRangeKt.TextRange(TextRange.m109382getStartimpl(this.originalSelection), TextRange.m109377getEndimpl(this.selection));
        }
        return this;
    }

    public final void setAnnotatedString(@NotNull AnnotatedString annotatedString) {
        Intrinsics.checkNotNullParameter(annotatedString, "<set-?>");
        this.annotatedString = annotatedString;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setCursor(int i) {
        setSelection(i, i);
    }

    protected final void setSelection(int i, int i2) {
        this.selection = TextRangeKt.TextRange(i, i2);
    }

    /* renamed from: setSelection-5zc-tL8  reason: not valid java name */
    public final void m106680setSelection5zctL8(long j) {
        this.selection = j;
    }

    private BaseTextPreparedSelection(AnnotatedString annotatedString, long j, TextLayoutResult textLayoutResult, OffsetMapping offsetMapping, TextPreparedSelectionState textPreparedSelectionState) {
        this.originalText = annotatedString;
        this.originalSelection = j;
        this.layoutResult = textLayoutResult;
        this.offsetMapping = offsetMapping;
        this.state = textPreparedSelectionState;
        this.selection = j;
        this.annotatedString = annotatedString;
    }
}
