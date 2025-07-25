package androidx.compose.p015ui.text;

import androidx.compose.p015ui.text.style.LineHeightStyle;
import androidx.compose.p015ui.text.style.TextAlign;
import androidx.compose.p015ui.text.style.TextDirection;
import androidx.compose.p015ui.text.style.TextIndent;
import androidx.compose.p015ui.unit.TextUnit;
import androidx.compose.p015ui.unit.TextUnitKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ParagraphStyle.kt */
@Immutable
@Metadata
/* renamed from: androidx.compose.ui.text.ParagraphStyle */
/* loaded from: classes.dex */
public final class ParagraphStyle {
    private final long lineHeight;
    @Nullable
    private final LineHeightStyle lineHeightStyle;
    @Nullable
    private final PlatformParagraphStyle platformStyle;
    @Nullable
    private final TextAlign textAlign;
    @Nullable
    private final TextDirection textDirection;
    @Nullable
    private final TextIndent textIndent;

    @ExperimentalTextApi
    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j, TextIndent textIndent, @ExperimentalTextApi PlatformParagraphStyle platformParagraphStyle, @ExperimentalTextApi LineHeightStyle lineHeightStyle, DefaultConstructorMarker defaultConstructorMarker) {
        this(textAlign, textDirection, j, textIndent, platformParagraphStyle, lineHeightStyle);
    }

    /* renamed from: copy-Elsmlbk$default */
    public static /* synthetic */ ParagraphStyle m109311copyElsmlbk$default(ParagraphStyle paragraphStyle, TextAlign textAlign, TextDirection textDirection, long j, TextIndent textIndent, int i, Object obj) {
        if ((i & 1) != 0) {
            textAlign = paragraphStyle.textAlign;
        }
        if ((i & 2) != 0) {
            textDirection = paragraphStyle.textDirection;
        }
        TextDirection textDirection2 = textDirection;
        if ((i & 4) != 0) {
            j = paragraphStyle.lineHeight;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            textIndent = paragraphStyle.textIndent;
        }
        return paragraphStyle.m109313copyElsmlbk(textAlign, textDirection2, j2, textIndent);
    }

    /* renamed from: copy-xPh5V4g$default */
    public static /* synthetic */ ParagraphStyle m109312copyxPh5V4g$default(ParagraphStyle paragraphStyle, TextAlign textAlign, TextDirection textDirection, long j, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i, Object obj) {
        if ((i & 1) != 0) {
            textAlign = paragraphStyle.textAlign;
        }
        if ((i & 2) != 0) {
            textDirection = paragraphStyle.textDirection;
        }
        TextDirection textDirection2 = textDirection;
        if ((i & 4) != 0) {
            j = paragraphStyle.lineHeight;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            textIndent = paragraphStyle.textIndent;
        }
        TextIndent textIndent2 = textIndent;
        if ((i & 16) != 0) {
            platformParagraphStyle = paragraphStyle.platformStyle;
        }
        PlatformParagraphStyle platformParagraphStyle2 = platformParagraphStyle;
        if ((i & 32) != 0) {
            lineHeightStyle = paragraphStyle.lineHeightStyle;
        }
        return paragraphStyle.m109314copyxPh5V4g(textAlign, textDirection2, j2, textIndent2, platformParagraphStyle2, lineHeightStyle);
    }

    public static /* synthetic */ ParagraphStyle merge$default(ParagraphStyle paragraphStyle, ParagraphStyle paragraphStyle2, int i, Object obj) {
        if ((i & 1) != 0) {
            paragraphStyle2 = null;
        }
        return paragraphStyle.merge(paragraphStyle2);
    }

    private final PlatformParagraphStyle mergePlatformStyle(PlatformParagraphStyle platformParagraphStyle) {
        PlatformParagraphStyle platformParagraphStyle2 = this.platformStyle;
        if (platformParagraphStyle2 == null) {
            return platformParagraphStyle;
        }
        if (platformParagraphStyle == null) {
            return platformParagraphStyle2;
        }
        return platformParagraphStyle2.merge(platformParagraphStyle);
    }

    @NotNull
    /* renamed from: copy-Elsmlbk */
    public final ParagraphStyle m109313copyElsmlbk(@Nullable TextAlign textAlign, @Nullable TextDirection textDirection, long j, @Nullable TextIndent textIndent) {
        return new ParagraphStyle(textAlign, textDirection, j, textIndent, this.platformStyle, this.lineHeightStyle, null);
    }

    @ExperimentalTextApi
    @NotNull
    /* renamed from: copy-xPh5V4g */
    public final ParagraphStyle m109314copyxPh5V4g(@Nullable TextAlign textAlign, @Nullable TextDirection textDirection, long j, @Nullable TextIndent textIndent, @Nullable PlatformParagraphStyle platformParagraphStyle, @Nullable LineHeightStyle lineHeightStyle) {
        return new ParagraphStyle(textAlign, textDirection, j, textIndent, platformParagraphStyle, lineHeightStyle, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParagraphStyle)) {
            return false;
        }
        ParagraphStyle paragraphStyle = (ParagraphStyle) obj;
        if (Intrinsics.m17075f(this.textAlign, paragraphStyle.textAlign) && Intrinsics.m17075f(this.textDirection, paragraphStyle.textDirection) && TextUnit.m109912equalsimpl0(this.lineHeight, paragraphStyle.lineHeight) && Intrinsics.m17075f(this.textIndent, paragraphStyle.textIndent) && Intrinsics.m17075f(this.platformStyle, paragraphStyle.platformStyle) && Intrinsics.m17075f(this.lineHeightStyle, paragraphStyle.lineHeightStyle)) {
            return true;
        }
        return false;
    }

    /* renamed from: getLineHeight-XSAIIZE */
    public final long m109315getLineHeightXSAIIZE() {
        return this.lineHeight;
    }

    @ExperimentalTextApi
    @Nullable
    public final LineHeightStyle getLineHeightStyle() {
        return this.lineHeightStyle;
    }

    @ExperimentalTextApi
    @Nullable
    public final PlatformParagraphStyle getPlatformStyle() {
        return this.platformStyle;
    }

    @Nullable
    /* renamed from: getTextAlign-buA522U */
    public final TextAlign m109316getTextAlignbuA522U() {
        return this.textAlign;
    }

    @Nullable
    /* renamed from: getTextDirection-mmuk1to */
    public final TextDirection m109317getTextDirectionmmuk1to() {
        return this.textDirection;
    }

    @Nullable
    public final TextIndent getTextIndent() {
        return this.textIndent;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        TextAlign textAlign = this.textAlign;
        int i5 = 0;
        if (textAlign != null) {
            i = TextAlign.m109639hashCodeimpl(textAlign.m109641unboximpl());
        } else {
            i = 0;
        }
        int i6 = i * 31;
        TextDirection textDirection = this.textDirection;
        if (textDirection != null) {
            i2 = TextDirection.m109652hashCodeimpl(textDirection.m109654unboximpl());
        } else {
            i2 = 0;
        }
        int m109916hashCodeimpl = (((i6 + i2) * 31) + TextUnit.m109916hashCodeimpl(this.lineHeight)) * 31;
        TextIndent textIndent = this.textIndent;
        if (textIndent != null) {
            i3 = textIndent.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (m109916hashCodeimpl + i3) * 31;
        PlatformParagraphStyle platformParagraphStyle = this.platformStyle;
        if (platformParagraphStyle != null) {
            i4 = platformParagraphStyle.hashCode();
        } else {
            i4 = 0;
        }
        int i8 = (i7 + i4) * 31;
        LineHeightStyle lineHeightStyle = this.lineHeightStyle;
        if (lineHeightStyle != null) {
            i5 = lineHeightStyle.hashCode();
        }
        return i8 + i5;
    }

    @Stable
    @NotNull
    public final ParagraphStyle merge(@Nullable ParagraphStyle paragraphStyle) {
        long j;
        if (paragraphStyle == null) {
            return this;
        }
        if (TextUnitKt.m109933isUnspecifiedR2X_6o(paragraphStyle.lineHeight)) {
            j = this.lineHeight;
        } else {
            j = paragraphStyle.lineHeight;
        }
        long j2 = j;
        TextIndent textIndent = paragraphStyle.textIndent;
        if (textIndent == null) {
            textIndent = this.textIndent;
        }
        TextIndent textIndent2 = textIndent;
        TextAlign textAlign = paragraphStyle.textAlign;
        if (textAlign == null) {
            textAlign = this.textAlign;
        }
        TextAlign textAlign2 = textAlign;
        TextDirection textDirection = paragraphStyle.textDirection;
        if (textDirection == null) {
            textDirection = this.textDirection;
        }
        TextDirection textDirection2 = textDirection;
        PlatformParagraphStyle mergePlatformStyle = mergePlatformStyle(paragraphStyle.platformStyle);
        LineHeightStyle lineHeightStyle = paragraphStyle.lineHeightStyle;
        if (lineHeightStyle == null) {
            lineHeightStyle = this.lineHeightStyle;
        }
        return new ParagraphStyle(textAlign2, textDirection2, j2, textIndent2, mergePlatformStyle, lineHeightStyle, null);
    }

    @Stable
    @NotNull
    public final ParagraphStyle plus(@NotNull ParagraphStyle other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return merge(other);
    }

    @NotNull
    public String toString() {
        return "ParagraphStyle(textAlign=" + this.textAlign + ", textDirection=" + this.textDirection + ", lineHeight=" + ((Object) TextUnit.m109922toStringimpl(this.lineHeight)) + ", textIndent=" + this.textIndent + ", platformStyle=" + this.platformStyle + ", lineHeightStyle=" + this.lineHeightStyle + ')';
    }

    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j, TextIndent textIndent, DefaultConstructorMarker defaultConstructorMarker) {
        this(textAlign, textDirection, j, textIndent);
    }

    private ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle) {
        this.textAlign = textAlign;
        this.textDirection = textDirection;
        this.lineHeight = j;
        this.textIndent = textIndent;
        this.platformStyle = platformParagraphStyle;
        this.lineHeightStyle = lineHeightStyle;
        if (TextUnit.m109912equalsimpl0(j, TextUnit.Companion.m109926getUnspecifiedXSAIIZE())) {
            return;
        }
        if (TextUnit.m109915getValueimpl(j) >= 0.0f) {
            return;
        }
        throw new IllegalStateException(("lineHeight can't be negative (" + TextUnit.m109915getValueimpl(j) + ')').toString());
    }

    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : textAlign, (i & 2) != 0 ? null : textDirection, (i & 4) != 0 ? TextUnit.Companion.m109926getUnspecifiedXSAIIZE() : j, (i & 8) != 0 ? null : textIndent, (i & 16) != 0 ? null : platformParagraphStyle, (i & 32) == 0 ? lineHeightStyle : null, null);
    }

    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j, TextIndent textIndent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : textAlign, (i & 2) != 0 ? null : textDirection, (i & 4) != 0 ? TextUnit.Companion.m109926getUnspecifiedXSAIIZE() : j, (i & 8) != 0 ? null : textIndent, null);
    }

    private ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j, TextIndent textIndent) {
        this(textAlign, textDirection, j, textIndent, null, null, null);
    }
}
