package androidx.compose.p015ui.text;

import androidx.compose.p015ui.graphics.Brush;
import androidx.compose.p015ui.graphics.Color;
import androidx.compose.p015ui.graphics.Shadow;
import androidx.compose.p015ui.text.font.FontFamily;
import androidx.compose.p015ui.text.font.FontStyle;
import androidx.compose.p015ui.text.font.FontSynthesis;
import androidx.compose.p015ui.text.font.FontWeight;
import androidx.compose.p015ui.text.intl.LocaleList;
import androidx.compose.p015ui.text.style.BaselineShift;
import androidx.compose.p015ui.text.style.LineHeightStyle;
import androidx.compose.p015ui.text.style.TextAlign;
import androidx.compose.p015ui.text.style.TextDecoration;
import androidx.compose.p015ui.text.style.TextDirection;
import androidx.compose.p015ui.text.style.TextDrawStyle;
import androidx.compose.p015ui.text.style.TextGeometricTransform;
import androidx.compose.p015ui.text.style.TextIndent;
import androidx.compose.p015ui.unit.TextUnit;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TextStyle.kt */
@Immutable
@Metadata
/* renamed from: androidx.compose.ui.text.TextStyle */
/* loaded from: classes.dex */
public final class TextStyle {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final TextStyle Default = new TextStyle(0, 0, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, 0, (TextIndent) null, 262143, (DefaultConstructorMarker) null);
    @NotNull
    private final ParagraphStyle paragraphStyle;
    @Nullable
    private final PlatformTextStyle platformStyle;
    @NotNull
    private final SpanStyle spanStyle;

    @ExperimentalTextApi
    public /* synthetic */ TextStyle(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, textAlign, textDirection, j5, textIndent, platformTextStyle, lineHeightStyle);
    }

    /* renamed from: copy-WQp3-mU$default  reason: not valid java name */
    public static /* synthetic */ TextStyle m109392copyWQp3mU$default(TextStyle textStyle, Brush brush, long j, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j2, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j3, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j4, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i, Object obj) {
        TextAlign textAlign2;
        TextDirection textDirection2;
        TextDirection textDirection3;
        long j5;
        TextIndent textIndent2;
        PlatformTextStyle platformTextStyle2;
        long m109356getFontSizeXSAIIZE = (i & 2) != 0 ? textStyle.spanStyle.m109356getFontSizeXSAIIZE() : j;
        FontWeight fontWeight2 = (i & 4) != 0 ? textStyle.spanStyle.getFontWeight() : fontWeight;
        FontStyle m109357getFontStyle4Lr2A7w = (i & 8) != 0 ? textStyle.spanStyle.m109357getFontStyle4Lr2A7w() : fontStyle;
        FontSynthesis m109358getFontSynthesisZQGJjVo = (i & 16) != 0 ? textStyle.spanStyle.m109358getFontSynthesisZQGJjVo() : fontSynthesis;
        FontFamily fontFamily2 = (i & 32) != 0 ? textStyle.spanStyle.getFontFamily() : fontFamily;
        String fontFeatureSettings = (i & 64) != 0 ? textStyle.spanStyle.getFontFeatureSettings() : str;
        long m109359getLetterSpacingXSAIIZE = (i & 128) != 0 ? textStyle.spanStyle.m109359getLetterSpacingXSAIIZE() : j2;
        BaselineShift m109354getBaselineShift5SSeXJ0 = (i & 256) != 0 ? textStyle.spanStyle.m109354getBaselineShift5SSeXJ0() : baselineShift;
        TextGeometricTransform textGeometricTransform2 = (i & 512) != 0 ? textStyle.spanStyle.getTextGeometricTransform() : textGeometricTransform;
        LocaleList localeList2 = (i & 1024) != 0 ? textStyle.spanStyle.getLocaleList() : localeList;
        long m109353getBackground0d7_KjU = (i & 2048) != 0 ? textStyle.spanStyle.m109353getBackground0d7_KjU() : j3;
        TextDecoration textDecoration2 = (i & 4096) != 0 ? textStyle.spanStyle.getTextDecoration() : textDecoration;
        Shadow shadow2 = (i & 8192) != 0 ? textStyle.spanStyle.getShadow() : shadow;
        TextAlign m109316getTextAlignbuA522U = (i & 16384) != 0 ? textStyle.paragraphStyle.m109316getTextAlignbuA522U() : textAlign;
        if ((i & 32768) != 0) {
            textAlign2 = m109316getTextAlignbuA522U;
            textDirection2 = textStyle.paragraphStyle.m109317getTextDirectionmmuk1to();
        } else {
            textAlign2 = m109316getTextAlignbuA522U;
            textDirection2 = textDirection;
        }
        if ((i & 65536) != 0) {
            textDirection3 = textDirection2;
            j5 = textStyle.paragraphStyle.m109315getLineHeightXSAIIZE();
        } else {
            textDirection3 = textDirection2;
            j5 = j4;
        }
        TextIndent textIndent3 = (131072 & i) != 0 ? textStyle.paragraphStyle.getTextIndent() : textIndent;
        if ((i & 262144) != 0) {
            textIndent2 = textIndent3;
            platformTextStyle2 = textStyle.platformStyle;
        } else {
            textIndent2 = textIndent3;
            platformTextStyle2 = platformTextStyle;
        }
        return textStyle.m109395copyWQp3mU(brush, m109356getFontSizeXSAIIZE, fontWeight2, m109357getFontStyle4Lr2A7w, m109358getFontSynthesisZQGJjVo, fontFamily2, fontFeatureSettings, m109359getLetterSpacingXSAIIZE, m109354getBaselineShift5SSeXJ0, textGeometricTransform2, localeList2, m109353getBackground0d7_KjU, textDecoration2, shadow2, textAlign2, textDirection3, j5, textIndent2, platformTextStyle2, (i & 524288) != 0 ? textStyle.paragraphStyle.getLineHeightStyle() : lineHeightStyle);
    }

    public static /* synthetic */ TextStyle merge$default(TextStyle textStyle, TextStyle textStyle2, int i, Object obj) {
        if ((i & 1) != 0) {
            textStyle2 = null;
        }
        return textStyle.merge(textStyle2);
    }

    @NotNull
    /* renamed from: copy-HL5avdY  reason: not valid java name */
    public final TextStyle m109393copyHL5avdY(long j, long j2, @Nullable FontWeight fontWeight, @Nullable FontStyle fontStyle, @Nullable FontSynthesis fontSynthesis, @Nullable FontFamily fontFamily, @Nullable String str, long j3, @Nullable BaselineShift baselineShift, @Nullable TextGeometricTransform textGeometricTransform, @Nullable LocaleList localeList, long j4, @Nullable TextDecoration textDecoration, @Nullable Shadow shadow, @Nullable TextAlign textAlign, @Nullable TextDirection textDirection, long j5, @Nullable TextIndent textIndent) {
        TextDrawStyle m109660from8_81llA;
        if (Color.m107528equalsimpl0(j, this.spanStyle.m109355getColor0d7_KjU())) {
            m109660from8_81llA = this.spanStyle.getTextDrawStyle$ui_text_release();
        } else {
            m109660from8_81llA = TextDrawStyle.Companion.m109660from8_81llA(j);
        }
        return new TextStyle(new SpanStyle(m109660from8_81llA, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, this.spanStyle.getPlatformStyle(), (DefaultConstructorMarker) null), new ParagraphStyle(textAlign, textDirection, j5, textIndent, this.paragraphStyle.getPlatformStyle(), getLineHeightStyle(), null), this.platformStyle);
    }

    @ExperimentalTextApi
    @NotNull
    /* renamed from: copy-NOaFTUo  reason: not valid java name */
    public final TextStyle m109394copyNOaFTUo(long j, long j2, @Nullable FontWeight fontWeight, @Nullable FontStyle fontStyle, @Nullable FontSynthesis fontSynthesis, @Nullable FontFamily fontFamily, @Nullable String str, long j3, @Nullable BaselineShift baselineShift, @Nullable TextGeometricTransform textGeometricTransform, @Nullable LocaleList localeList, long j4, @Nullable TextDecoration textDecoration, @Nullable Shadow shadow, @Nullable TextAlign textAlign, @Nullable TextDirection textDirection, long j5, @Nullable TextIndent textIndent, @Nullable PlatformTextStyle platformTextStyle, @Nullable LineHeightStyle lineHeightStyle) {
        TextDrawStyle m109660from8_81llA;
        PlatformSpanStyle platformSpanStyle;
        if (Color.m107528equalsimpl0(j, this.spanStyle.m109355getColor0d7_KjU())) {
            m109660from8_81llA = this.spanStyle.getTextDrawStyle$ui_text_release();
        } else {
            m109660from8_81llA = TextDrawStyle.Companion.m109660from8_81llA(j);
        }
        TextDrawStyle textDrawStyle = m109660from8_81llA;
        PlatformParagraphStyle platformParagraphStyle = null;
        if (platformTextStyle != null) {
            platformSpanStyle = platformTextStyle.getSpanStyle();
        } else {
            platformSpanStyle = null;
        }
        SpanStyle spanStyle = new SpanStyle(textDrawStyle, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, platformSpanStyle, (DefaultConstructorMarker) null);
        if (platformTextStyle != null) {
            platformParagraphStyle = platformTextStyle.getParagraphStyle();
        }
        return new TextStyle(spanStyle, new ParagraphStyle(textAlign, textDirection, j5, textIndent, platformParagraphStyle, lineHeightStyle, null), platformTextStyle);
    }

    @ExperimentalTextApi
    @NotNull
    /* renamed from: copy-WQp3-mU  reason: not valid java name */
    public final TextStyle m109395copyWQp3mU(@Nullable Brush brush, long j, @Nullable FontWeight fontWeight, @Nullable FontStyle fontStyle, @Nullable FontSynthesis fontSynthesis, @Nullable FontFamily fontFamily, @Nullable String str, long j2, @Nullable BaselineShift baselineShift, @Nullable TextGeometricTransform textGeometricTransform, @Nullable LocaleList localeList, long j3, @Nullable TextDecoration textDecoration, @Nullable Shadow shadow, @Nullable TextAlign textAlign, @Nullable TextDirection textDirection, long j4, @Nullable TextIndent textIndent, @Nullable PlatformTextStyle platformTextStyle, @Nullable LineHeightStyle lineHeightStyle) {
        PlatformSpanStyle platformSpanStyle;
        PlatformParagraphStyle platformParagraphStyle = null;
        if (platformTextStyle != null) {
            platformSpanStyle = platformTextStyle.getSpanStyle();
        } else {
            platformSpanStyle = null;
        }
        SpanStyle spanStyle = new SpanStyle(brush, j, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j2, baselineShift, textGeometricTransform, localeList, j3, textDecoration, shadow, platformSpanStyle, (DefaultConstructorMarker) null);
        if (platformTextStyle != null) {
            platformParagraphStyle = platformTextStyle.getParagraphStyle();
        }
        return new TextStyle(spanStyle, new ParagraphStyle(textAlign, textDirection, j4, textIndent, platformParagraphStyle, lineHeightStyle, null), platformTextStyle);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStyle)) {
            return false;
        }
        TextStyle textStyle = (TextStyle) obj;
        if (Intrinsics.m17075f(this.spanStyle, textStyle.spanStyle) && Intrinsics.m17075f(this.paragraphStyle, textStyle.paragraphStyle) && Intrinsics.m17075f(this.platformStyle, textStyle.platformStyle)) {
            return true;
        }
        return false;
    }

    /* renamed from: getBackground-0d7_KjU  reason: not valid java name */
    public final long m109396getBackground0d7_KjU() {
        return this.spanStyle.m109353getBackground0d7_KjU();
    }

    @Nullable
    /* renamed from: getBaselineShift-5SSeXJ0  reason: not valid java name */
    public final BaselineShift m109397getBaselineShift5SSeXJ0() {
        return this.spanStyle.m109354getBaselineShift5SSeXJ0();
    }

    @ExperimentalTextApi
    @Nullable
    public final Brush getBrush() {
        return this.spanStyle.getBrush();
    }

    /* renamed from: getColor-0d7_KjU  reason: not valid java name */
    public final long m109398getColor0d7_KjU() {
        return this.spanStyle.m109355getColor0d7_KjU();
    }

    @Nullable
    public final FontFamily getFontFamily() {
        return this.spanStyle.getFontFamily();
    }

    @Nullable
    public final String getFontFeatureSettings() {
        return this.spanStyle.getFontFeatureSettings();
    }

    /* renamed from: getFontSize-XSAIIZE  reason: not valid java name */
    public final long m109399getFontSizeXSAIIZE() {
        return this.spanStyle.m109356getFontSizeXSAIIZE();
    }

    @Nullable
    /* renamed from: getFontStyle-4Lr2A7w  reason: not valid java name */
    public final FontStyle m109400getFontStyle4Lr2A7w() {
        return this.spanStyle.m109357getFontStyle4Lr2A7w();
    }

    @Nullable
    /* renamed from: getFontSynthesis-ZQGJjVo  reason: not valid java name */
    public final FontSynthesis m109401getFontSynthesisZQGJjVo() {
        return this.spanStyle.m109358getFontSynthesisZQGJjVo();
    }

    @Nullable
    public final FontWeight getFontWeight() {
        return this.spanStyle.getFontWeight();
    }

    /* renamed from: getLetterSpacing-XSAIIZE  reason: not valid java name */
    public final long m109402getLetterSpacingXSAIIZE() {
        return this.spanStyle.m109359getLetterSpacingXSAIIZE();
    }

    /* renamed from: getLineHeight-XSAIIZE  reason: not valid java name */
    public final long m109403getLineHeightXSAIIZE() {
        return this.paragraphStyle.m109315getLineHeightXSAIIZE();
    }

    @ExperimentalTextApi
    @Nullable
    public final LineHeightStyle getLineHeightStyle() {
        return this.paragraphStyle.getLineHeightStyle();
    }

    @Nullable
    public final LocaleList getLocaleList() {
        return this.spanStyle.getLocaleList();
    }

    @NotNull
    public final ParagraphStyle getParagraphStyle$ui_text_release() {
        return this.paragraphStyle;
    }

    @ExperimentalTextApi
    @Nullable
    public final PlatformTextStyle getPlatformStyle() {
        return this.platformStyle;
    }

    @Nullable
    public final Shadow getShadow() {
        return this.spanStyle.getShadow();
    }

    @NotNull
    public final SpanStyle getSpanStyle$ui_text_release() {
        return this.spanStyle;
    }

    @Nullable
    /* renamed from: getTextAlign-buA522U  reason: not valid java name */
    public final TextAlign m109404getTextAlignbuA522U() {
        return this.paragraphStyle.m109316getTextAlignbuA522U();
    }

    @Nullable
    public final TextDecoration getTextDecoration() {
        return this.spanStyle.getTextDecoration();
    }

    @Nullable
    /* renamed from: getTextDirection-mmuk1to  reason: not valid java name */
    public final TextDirection m109405getTextDirectionmmuk1to() {
        return this.paragraphStyle.m109317getTextDirectionmmuk1to();
    }

    @Nullable
    public final TextGeometricTransform getTextGeometricTransform() {
        return this.spanStyle.getTextGeometricTransform();
    }

    @Nullable
    public final TextIndent getTextIndent() {
        return this.paragraphStyle.getTextIndent();
    }

    public final boolean hasSameLayoutAffectingAttributes(@NotNull TextStyle other) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (this != other && (!Intrinsics.m17075f(this.paragraphStyle, other.paragraphStyle) || !this.spanStyle.hasSameLayoutAffectingAttributes$ui_text_release(other.spanStyle))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        int hashCode = ((this.spanStyle.hashCode() * 31) + this.paragraphStyle.hashCode()) * 31;
        PlatformTextStyle platformTextStyle = this.platformStyle;
        if (platformTextStyle != null) {
            i = platformTextStyle.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    @Stable
    @NotNull
    public final TextStyle merge(@Nullable TextStyle textStyle) {
        return (textStyle == null || Intrinsics.m17075f(textStyle, Default)) ? this : new TextStyle(toSpanStyle().merge(textStyle.toSpanStyle()), toParagraphStyle().merge(textStyle.toParagraphStyle()));
    }

    @Stable
    @NotNull
    public final TextStyle plus(@NotNull TextStyle other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return merge(other);
    }

    @Stable
    @NotNull
    public final ParagraphStyle toParagraphStyle() {
        return this.paragraphStyle;
    }

    @Stable
    @NotNull
    public final SpanStyle toSpanStyle() {
        return this.spanStyle;
    }

    @NotNull
    public String toString() {
        return "TextStyle(color=" + ((Object) Color.m107535toStringimpl(m109398getColor0d7_KjU())) + ", brush=" + getBrush() + ", fontSize=" + ((Object) TextUnit.m109922toStringimpl(m109399getFontSizeXSAIIZE())) + ", fontWeight=" + getFontWeight() + ", fontStyle=" + m109400getFontStyle4Lr2A7w() + ", fontSynthesis=" + m109401getFontSynthesisZQGJjVo() + ", fontFamily=" + getFontFamily() + ", fontFeatureSettings=" + getFontFeatureSettings() + ", letterSpacing=" + ((Object) TextUnit.m109922toStringimpl(m109402getLetterSpacingXSAIIZE())) + ", baselineShift=" + m109397getBaselineShift5SSeXJ0() + ", textGeometricTransform=" + getTextGeometricTransform() + ", localeList=" + getLocaleList() + ", background=" + ((Object) Color.m107535toStringimpl(m109396getBackground0d7_KjU())) + ", textDecoration=" + getTextDecoration() + ", shadow=" + getShadow() + ", textAlign=" + m109404getTextAlignbuA522U() + ", textDirection=" + m109405getTextDirectionmmuk1to() + ", lineHeight=" + ((Object) TextUnit.m109922toStringimpl(m109403getLineHeightXSAIIZE())) + ", textIndent=" + getTextIndent() + ", platformStyle=" + this.platformStyle + "lineHeightStyle=" + getLineHeightStyle() + ')';
    }

    public /* synthetic */ TextStyle(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, textAlign, textDirection, j5, textIndent);
    }

    @Stable
    @NotNull
    public final TextStyle plus(@NotNull ParagraphStyle other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return merge(other);
    }

    @ExperimentalTextApi
    public /* synthetic */ TextStyle(Brush brush, long j, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j2, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j3, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j4, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, DefaultConstructorMarker defaultConstructorMarker) {
        this(brush, j, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j2, baselineShift, textGeometricTransform, localeList, j3, textDecoration, shadow, textAlign, textDirection, j4, textIndent, platformTextStyle, lineHeightStyle);
    }

    @Stable
    @NotNull
    public final TextStyle plus(@NotNull SpanStyle other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return merge(other);
    }

    public TextStyle(@NotNull SpanStyle spanStyle, @NotNull ParagraphStyle paragraphStyle, @ExperimentalTextApi @Nullable PlatformTextStyle platformTextStyle) {
        Intrinsics.checkNotNullParameter(spanStyle, "spanStyle");
        Intrinsics.checkNotNullParameter(paragraphStyle, "paragraphStyle");
        this.spanStyle = spanStyle;
        this.paragraphStyle = paragraphStyle;
        this.platformStyle = platformTextStyle;
    }

    @Stable
    @NotNull
    public final TextStyle merge(@NotNull SpanStyle other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return new TextStyle(toSpanStyle().merge(other), toParagraphStyle());
    }

    public /* synthetic */ TextStyle(SpanStyle spanStyle, ParagraphStyle paragraphStyle, PlatformTextStyle platformTextStyle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(spanStyle, paragraphStyle, (i & 4) != 0 ? null : platformTextStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public TextStyle(@org.jetbrains.annotations.NotNull androidx.compose.p015ui.text.SpanStyle r3, @org.jetbrains.annotations.NotNull androidx.compose.p015ui.text.ParagraphStyle r4) {
        /*
            r2 = this;
            java.lang.String r0 = "spanStyle"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "paragraphStyle"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            androidx.compose.ui.text.PlatformSpanStyle r0 = r3.getPlatformStyle()
            androidx.compose.ui.text.PlatformParagraphStyle r1 = r4.getPlatformStyle()
            androidx.compose.ui.text.PlatformTextStyle r0 = androidx.compose.p015ui.text.TextStyleKt.access$createPlatformTextStyleInternal(r0, r1)
            r2.<init>(r3, r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.text.TextStyle.<init>(androidx.compose.ui.text.SpanStyle, androidx.compose.ui.text.ParagraphStyle):void");
    }

    @Stable
    @NotNull
    public final TextStyle merge(@NotNull ParagraphStyle other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return new TextStyle(toSpanStyle(), toParagraphStyle().merge(other));
    }

    public /* synthetic */ TextStyle(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Color.Companion.m107563getUnspecified0d7_KjU() : j, (i & 2) != 0 ? TextUnit.Companion.m109926getUnspecifiedXSAIIZE() : j2, (i & 4) != 0 ? null : fontWeight, (i & 8) != 0 ? null : fontStyle, (i & 16) != 0 ? null : fontSynthesis, (i & 32) != 0 ? null : fontFamily, (i & 64) != 0 ? null : str, (i & 128) != 0 ? TextUnit.Companion.m109926getUnspecifiedXSAIIZE() : j3, (i & 256) != 0 ? null : baselineShift, (i & 512) != 0 ? null : textGeometricTransform, (i & 1024) != 0 ? null : localeList, (i & 2048) != 0 ? Color.Companion.m107563getUnspecified0d7_KjU() : j4, (i & 4096) != 0 ? null : textDecoration, (i & 8192) != 0 ? null : shadow, (i & 16384) != 0 ? null : textAlign, (i & 32768) != 0 ? null : textDirection, (i & 65536) != 0 ? TextUnit.Companion.m109926getUnspecifiedXSAIIZE() : j5, (i & 131072) != 0 ? null : textIndent, null);
    }

    /* compiled from: TextStyle.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.text.TextStyle$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final TextStyle getDefault() {
            return TextStyle.Default;
        }

        @Stable
        public static /* synthetic */ void getDefault$annotations() {
        }
    }

    @ExperimentalTextApi
    public static /* synthetic */ void getBrush$annotations() {
    }

    @ExperimentalTextApi
    public static /* synthetic */ void getLineHeightStyle$annotations() {
    }

    private TextStyle(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent) {
        this(new SpanStyle(j, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, (PlatformSpanStyle) null, (DefaultConstructorMarker) null), new ParagraphStyle(textAlign, textDirection, j5, textIndent, null, null, null), null);
    }

    public /* synthetic */ TextStyle(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Color.Companion.m107563getUnspecified0d7_KjU() : j, (i & 2) != 0 ? TextUnit.Companion.m109926getUnspecifiedXSAIIZE() : j2, (i & 4) != 0 ? null : fontWeight, (i & 8) != 0 ? null : fontStyle, (i & 16) != 0 ? null : fontSynthesis, (i & 32) != 0 ? null : fontFamily, (i & 64) != 0 ? null : str, (i & 128) != 0 ? TextUnit.Companion.m109926getUnspecifiedXSAIIZE() : j3, (i & 256) != 0 ? null : baselineShift, (i & 512) != 0 ? null : textGeometricTransform, (i & 1024) != 0 ? null : localeList, (i & 2048) != 0 ? Color.Companion.m107563getUnspecified0d7_KjU() : j4, (i & 4096) != 0 ? null : textDecoration, (i & 8192) != 0 ? null : shadow, (i & 16384) != 0 ? null : textAlign, (i & 32768) != 0 ? null : textDirection, (i & 65536) != 0 ? TextUnit.Companion.m109926getUnspecifiedXSAIIZE() : j5, (i & 131072) != 0 ? null : textIndent, (i & 262144) != 0 ? null : platformTextStyle, (i & 524288) != 0 ? null : lineHeightStyle, (DefaultConstructorMarker) null);
    }

    private TextStyle(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle) {
        this(new SpanStyle(j, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, (DefaultConstructorMarker) null), new ParagraphStyle(textAlign, textDirection, j5, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, null), platformTextStyle);
    }

    public /* synthetic */ TextStyle(Brush brush, long j, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j2, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j3, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j4, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(brush, (i & 2) != 0 ? TextUnit.Companion.m109926getUnspecifiedXSAIIZE() : j, (i & 4) != 0 ? null : fontWeight, (i & 8) != 0 ? null : fontStyle, (i & 16) != 0 ? null : fontSynthesis, (i & 32) != 0 ? null : fontFamily, (i & 64) != 0 ? null : str, (i & 128) != 0 ? TextUnit.Companion.m109926getUnspecifiedXSAIIZE() : j2, (i & 256) != 0 ? null : baselineShift, (i & 512) != 0 ? null : textGeometricTransform, (i & 1024) != 0 ? null : localeList, (i & 2048) != 0 ? Color.Companion.m107563getUnspecified0d7_KjU() : j3, (i & 4096) != 0 ? null : textDecoration, (i & 8192) != 0 ? null : shadow, (i & 16384) != 0 ? null : textAlign, (32768 & i) != 0 ? null : textDirection, (65536 & i) != 0 ? TextUnit.Companion.m109926getUnspecifiedXSAIIZE() : j4, (131072 & i) != 0 ? null : textIndent, (262144 & i) != 0 ? null : platformTextStyle, (i & 524288) != 0 ? null : lineHeightStyle, (DefaultConstructorMarker) null);
    }

    private TextStyle(Brush brush, long j, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j2, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j3, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j4, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle) {
        this(new SpanStyle(brush, j, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j2, baselineShift, textGeometricTransform, localeList, j3, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, (DefaultConstructorMarker) null), new ParagraphStyle(textAlign, textDirection, j4, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, null), platformTextStyle);
    }
}
