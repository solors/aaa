package androidx.compose.p015ui.text;

import androidx.compose.p015ui.geometry.Offset;
import androidx.compose.p015ui.geometry.OffsetKt;
import androidx.compose.p015ui.geometry.Rect;
import androidx.compose.p015ui.graphics.Path;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MultiParagraph.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.ParagraphInfo */
/* loaded from: classes.dex */
public final class ParagraphInfo {
    private float bottom;
    private final int endIndex;
    private int endLineIndex;
    @NotNull
    private final Paragraph paragraph;
    private final int startIndex;
    private int startLineIndex;
    private float top;

    public ParagraphInfo(@NotNull Paragraph paragraph, int i, int i2, int i3, int i4, float f, float f2) {
        Intrinsics.checkNotNullParameter(paragraph, "paragraph");
        this.paragraph = paragraph;
        this.startIndex = i;
        this.endIndex = i2;
        this.startLineIndex = i3;
        this.endLineIndex = i4;
        this.top = f;
        this.bottom = f2;
    }

    public static /* synthetic */ ParagraphInfo copy$default(ParagraphInfo paragraphInfo, Paragraph paragraph, int i, int i2, int i3, int i4, float f, float f2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            paragraph = paragraphInfo.paragraph;
        }
        if ((i5 & 2) != 0) {
            i = paragraphInfo.startIndex;
        }
        int i6 = i;
        if ((i5 & 4) != 0) {
            i2 = paragraphInfo.endIndex;
        }
        int i7 = i2;
        if ((i5 & 8) != 0) {
            i3 = paragraphInfo.startLineIndex;
        }
        int i8 = i3;
        if ((i5 & 16) != 0) {
            i4 = paragraphInfo.endLineIndex;
        }
        int i9 = i4;
        if ((i5 & 32) != 0) {
            f = paragraphInfo.top;
        }
        float f3 = f;
        if ((i5 & 64) != 0) {
            f2 = paragraphInfo.bottom;
        }
        return paragraphInfo.copy(paragraph, i6, i7, i8, i9, f3, f2);
    }

    @NotNull
    public final Paragraph component1() {
        return this.paragraph;
    }

    public final int component2() {
        return this.startIndex;
    }

    public final int component3() {
        return this.endIndex;
    }

    public final int component4() {
        return this.startLineIndex;
    }

    public final int component5() {
        return this.endLineIndex;
    }

    public final float component6() {
        return this.top;
    }

    public final float component7() {
        return this.bottom;
    }

    @NotNull
    public final ParagraphInfo copy(@NotNull Paragraph paragraph, int i, int i2, int i3, int i4, float f, float f2) {
        Intrinsics.checkNotNullParameter(paragraph, "paragraph");
        return new ParagraphInfo(paragraph, i, i2, i3, i4, f, f2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParagraphInfo)) {
            return false;
        }
        ParagraphInfo paragraphInfo = (ParagraphInfo) obj;
        if (Intrinsics.m17075f(this.paragraph, paragraphInfo.paragraph) && this.startIndex == paragraphInfo.startIndex && this.endIndex == paragraphInfo.endIndex && this.startLineIndex == paragraphInfo.startLineIndex && this.endLineIndex == paragraphInfo.endLineIndex && Intrinsics.m17075f(Float.valueOf(this.top), Float.valueOf(paragraphInfo.top)) && Intrinsics.m17075f(Float.valueOf(this.bottom), Float.valueOf(paragraphInfo.bottom))) {
            return true;
        }
        return false;
    }

    public final float getBottom() {
        return this.bottom;
    }

    public final int getEndIndex() {
        return this.endIndex;
    }

    public final int getEndLineIndex() {
        return this.endLineIndex;
    }

    public final int getLength() {
        return this.endIndex - this.startIndex;
    }

    @NotNull
    public final Paragraph getParagraph() {
        return this.paragraph;
    }

    public final int getStartIndex() {
        return this.startIndex;
    }

    public final int getStartLineIndex() {
        return this.startLineIndex;
    }

    public final float getTop() {
        return this.top;
    }

    public int hashCode() {
        return (((((((((((this.paragraph.hashCode() * 31) + Integer.hashCode(this.startIndex)) * 31) + Integer.hashCode(this.endIndex)) * 31) + Integer.hashCode(this.startLineIndex)) * 31) + Integer.hashCode(this.endLineIndex)) * 31) + Float.hashCode(this.top)) * 31) + Float.hashCode(this.bottom);
    }

    public final void setBottom(float f) {
        this.bottom = f;
    }

    public final void setEndLineIndex(int i) {
        this.endLineIndex = i;
    }

    public final void setStartLineIndex(int i) {
        this.startLineIndex = i;
    }

    public final void setTop(float f) {
        this.top = f;
    }

    @NotNull
    public final Rect toGlobal(@NotNull Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        return rect.m107328translatek4lQ0M(OffsetKt.Offset(0.0f, this.top));
    }

    /* renamed from: toGlobal-GEjPoXI  reason: not valid java name */
    public final long m109305toGlobalGEjPoXI(long j) {
        return TextRangeKt.TextRange(toGlobalIndex(TextRange.m109382getStartimpl(j)), toGlobalIndex(TextRange.m109377getEndimpl(j)));
    }

    public final int toGlobalIndex(int i) {
        return i + this.startIndex;
    }

    public final int toGlobalLineIndex(int i) {
        return i + this.startLineIndex;
    }

    public final float toGlobalYPosition(float f) {
        return f + this.top;
    }

    /* renamed from: toLocal-MK-Hz9U  reason: not valid java name */
    public final long m109306toLocalMKHz9U(long j) {
        return OffsetKt.Offset(Offset.m107291getXimpl(j), Offset.m107292getYimpl(j) - this.top);
    }

    public final int toLocalIndex(int i) {
        int m16908n;
        m16908n = _Ranges.m16908n(i, this.startIndex, this.endIndex);
        return m16908n - this.startIndex;
    }

    public final int toLocalLineIndex(int i) {
        return i - this.startLineIndex;
    }

    public final float toLocalYPosition(float f) {
        return f - this.top;
    }

    @NotNull
    public String toString() {
        return "ParagraphInfo(paragraph=" + this.paragraph + ", startIndex=" + this.startIndex + ", endIndex=" + this.endIndex + ", startLineIndex=" + this.startLineIndex + ", endLineIndex=" + this.endLineIndex + ", top=" + this.top + ", bottom=" + this.bottom + ')';
    }

    @NotNull
    public final Path toGlobal(@NotNull Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        path.mo107426translatek4lQ0M(OffsetKt.Offset(0.0f, this.top));
        return path;
    }

    public /* synthetic */ ParagraphInfo(Paragraph paragraph, int i, int i2, int i3, int i4, float f, float f2, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(paragraph, i, i2, (i5 & 8) != 0 ? -1 : i3, (i5 & 16) != 0 ? -1 : i4, (i5 & 32) != 0 ? -1.0f : f, (i5 & 64) != 0 ? -1.0f : f2);
    }
}
