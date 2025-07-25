package androidx.compose.p015ui.text;

import androidx.compose.p015ui.geometry.Rect;
import androidx.compose.p015ui.graphics.Path;
import androidx.compose.p015ui.text.style.ResolvedTextDirection;
import androidx.compose.p015ui.unit.IntSize;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TextLayoutResult.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.TextLayoutResult */
/* loaded from: classes.dex */
public final class TextLayoutResult {
    private final float firstBaseline;
    private final float lastBaseline;
    @NotNull
    private final TextLayoutInput layoutInput;
    @NotNull
    private final MultiParagraph multiParagraph;
    @NotNull
    private final List<Rect> placeholderRects;
    private final long size;

    public /* synthetic */ TextLayoutResult(TextLayoutInput textLayoutInput, MultiParagraph multiParagraph, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(textLayoutInput, multiParagraph, j);
    }

    /* renamed from: copy-O0kMr_c$default  reason: not valid java name */
    public static /* synthetic */ TextLayoutResult m109365copyO0kMr_c$default(TextLayoutResult textLayoutResult, TextLayoutInput textLayoutInput, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            textLayoutInput = textLayoutResult.layoutInput;
        }
        if ((i & 2) != 0) {
            j = textLayoutResult.size;
        }
        return textLayoutResult.m109366copyO0kMr_c(textLayoutInput, j);
    }

    public static /* synthetic */ int getLineEnd$default(TextLayoutResult textLayoutResult, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return textLayoutResult.getLineEnd(i, z);
    }

    @NotNull
    /* renamed from: copy-O0kMr_c  reason: not valid java name */
    public final TextLayoutResult m109366copyO0kMr_c(@NotNull TextLayoutInput layoutInput, long j) {
        Intrinsics.checkNotNullParameter(layoutInput, "layoutInput");
        return new TextLayoutResult(layoutInput, this.multiParagraph, j, null);
    }

    public boolean equals(@Nullable Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextLayoutResult)) {
            return false;
        }
        TextLayoutResult textLayoutResult = (TextLayoutResult) obj;
        if (!Intrinsics.m17075f(this.layoutInput, textLayoutResult.layoutInput) || !Intrinsics.m17075f(this.multiParagraph, textLayoutResult.multiParagraph) || !IntSize.m109892equalsimpl0(this.size, textLayoutResult.size)) {
            return false;
        }
        if (this.firstBaseline == textLayoutResult.firstBaseline) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        if (this.lastBaseline == textLayoutResult.lastBaseline) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && Intrinsics.m17075f(this.placeholderRects, textLayoutResult.placeholderRects)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final ResolvedTextDirection getBidiRunDirection(int i) {
        return this.multiParagraph.getBidiRunDirection(i);
    }

    @NotNull
    public final Rect getBoundingBox(int i) {
        return this.multiParagraph.getBoundingBox(i);
    }

    @NotNull
    public final Rect getCursorRect(int i) {
        return this.multiParagraph.getCursorRect(i);
    }

    public final boolean getDidOverflowHeight() {
        if (!this.multiParagraph.getDidExceedMaxLines() && IntSize.m109893getHeightimpl(this.size) >= this.multiParagraph.getHeight()) {
            return false;
        }
        return true;
    }

    public final boolean getDidOverflowWidth() {
        if (IntSize.m109894getWidthimpl(this.size) < this.multiParagraph.getWidth()) {
            return true;
        }
        return false;
    }

    public final float getFirstBaseline() {
        return this.firstBaseline;
    }

    public final boolean getHasVisualOverflow() {
        if (!getDidOverflowWidth() && !getDidOverflowHeight()) {
            return false;
        }
        return true;
    }

    public final float getHorizontalPosition(int i, boolean z) {
        return this.multiParagraph.getHorizontalPosition(i, z);
    }

    public final float getLastBaseline() {
        return this.lastBaseline;
    }

    @NotNull
    public final TextLayoutInput getLayoutInput() {
        return this.layoutInput;
    }

    public final float getLineBottom(int i) {
        return this.multiParagraph.getLineBottom(i);
    }

    public final int getLineCount() {
        return this.multiParagraph.getLineCount();
    }

    public final int getLineEnd(int i, boolean z) {
        return this.multiParagraph.getLineEnd(i, z);
    }

    public final int getLineForOffset(int i) {
        return this.multiParagraph.getLineForOffset(i);
    }

    public final int getLineForVerticalPosition(float f) {
        return this.multiParagraph.getLineForVerticalPosition(f);
    }

    public final float getLineLeft(int i) {
        return this.multiParagraph.getLineLeft(i);
    }

    public final float getLineRight(int i) {
        return this.multiParagraph.getLineRight(i);
    }

    public final int getLineStart(int i) {
        return this.multiParagraph.getLineStart(i);
    }

    public final float getLineTop(int i) {
        return this.multiParagraph.getLineTop(i);
    }

    @NotNull
    public final MultiParagraph getMultiParagraph() {
        return this.multiParagraph;
    }

    /* renamed from: getOffsetForPosition-k-4lQ0M  reason: not valid java name */
    public final int m109367getOffsetForPositionk4lQ0M(long j) {
        return this.multiParagraph.m109297getOffsetForPositionk4lQ0M(j);
    }

    @NotNull
    public final ResolvedTextDirection getParagraphDirection(int i) {
        return this.multiParagraph.getParagraphDirection(i);
    }

    @NotNull
    public final Path getPathForRange(int i, int i2) {
        return this.multiParagraph.getPathForRange(i, i2);
    }

    @NotNull
    public final List<Rect> getPlaceholderRects() {
        return this.placeholderRects;
    }

    /* renamed from: getSize-YbymL2g  reason: not valid java name */
    public final long m109368getSizeYbymL2g() {
        return this.size;
    }

    /* renamed from: getWordBoundary--jx7JFs  reason: not valid java name */
    public final long m109369getWordBoundaryjx7JFs(int i) {
        return this.multiParagraph.m109298getWordBoundaryjx7JFs(i);
    }

    public int hashCode() {
        return (((((((((this.layoutInput.hashCode() * 31) + this.multiParagraph.hashCode()) * 31) + IntSize.m109895hashCodeimpl(this.size)) * 31) + Float.hashCode(this.firstBaseline)) * 31) + Float.hashCode(this.lastBaseline)) * 31) + this.placeholderRects.hashCode();
    }

    public final boolean isLineEllipsized(int i) {
        return this.multiParagraph.isLineEllipsized(i);
    }

    @NotNull
    public String toString() {
        return "TextLayoutResult(layoutInput=" + this.layoutInput + ", multiParagraph=" + this.multiParagraph + ", size=" + ((Object) IntSize.m109897toStringimpl(this.size)) + ", firstBaseline=" + this.firstBaseline + ", lastBaseline=" + this.lastBaseline + ", placeholderRects=" + this.placeholderRects + ')';
    }

    private TextLayoutResult(TextLayoutInput textLayoutInput, MultiParagraph multiParagraph, long j) {
        this.layoutInput = textLayoutInput;
        this.multiParagraph = multiParagraph;
        this.size = j;
        this.firstBaseline = multiParagraph.getFirstBaseline();
        this.lastBaseline = multiParagraph.getLastBaseline();
        this.placeholderRects = multiParagraph.getPlaceholderRects();
    }
}
