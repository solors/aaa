package androidx.compose.p015ui.text;

import androidx.compose.p015ui.graphics.Color;
import androidx.compose.p015ui.graphics.ColorKt;
import androidx.compose.p015ui.graphics.Shadow;
import androidx.compose.p015ui.graphics.ShadowKt;
import androidx.compose.p015ui.text.font.FontFamily;
import androidx.compose.p015ui.text.font.FontStyle;
import androidx.compose.p015ui.text.font.FontSynthesis;
import androidx.compose.p015ui.text.font.FontWeight;
import androidx.compose.p015ui.text.font.FontWeightKt;
import androidx.compose.p015ui.text.intl.LocaleList;
import androidx.compose.p015ui.text.style.BaselineShift;
import androidx.compose.p015ui.text.style.BaselineShiftKt;
import androidx.compose.p015ui.text.style.TextDecoration;
import androidx.compose.p015ui.text.style.TextDrawStyle;
import androidx.compose.p015ui.text.style.TextDrawStyleKt;
import androidx.compose.p015ui.text.style.TextGeometricTransform;
import androidx.compose.p015ui.text.style.TextGeometricTransformKt;
import androidx.compose.p015ui.unit.TextUnit;
import androidx.compose.p015ui.unit.TextUnitKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: SpanStyle.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.SpanStyleKt */
/* loaded from: classes.dex */
public final class SpanStyleKt {
    private static final long DefaultBackgroundColor;
    private static final long DefaultColor;
    private static final long DefaultFontSize = TextUnitKt.getSp(14);
    private static final long DefaultLetterSpacing = TextUnitKt.getSp(0);

    static {
        Color.Companion companion = Color.Companion;
        DefaultBackgroundColor = companion.m107562getTransparent0d7_KjU();
        DefaultColor = companion.m107553getBlack0d7_KjU();
    }

    @NotNull
    public static final SpanStyle lerp(@NotNull SpanStyle start, @NotNull SpanStyle stop, float f) {
        float m109592constructorimpl;
        float m109592constructorimpl2;
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(stop, "stop");
        TextDrawStyle lerp = TextDrawStyleKt.lerp(start.getTextDrawStyle$ui_text_release(), stop.getTextDrawStyle$ui_text_release(), f);
        FontFamily fontFamily = (FontFamily) lerpDiscrete(start.getFontFamily(), stop.getFontFamily(), f);
        long m109360lerpTextUnitInheritableC3pnCVY = m109360lerpTextUnitInheritableC3pnCVY(start.m109356getFontSizeXSAIIZE(), stop.m109356getFontSizeXSAIIZE(), f);
        FontWeight fontWeight = start.getFontWeight();
        if (fontWeight == null) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        FontWeight fontWeight2 = stop.getFontWeight();
        if (fontWeight2 == null) {
            fontWeight2 = FontWeight.Companion.getNormal();
        }
        FontWeight lerp2 = FontWeightKt.lerp(fontWeight, fontWeight2, f);
        FontStyle fontStyle = (FontStyle) lerpDiscrete(start.m109357getFontStyle4Lr2A7w(), stop.m109357getFontStyle4Lr2A7w(), f);
        FontSynthesis fontSynthesis = (FontSynthesis) lerpDiscrete(start.m109358getFontSynthesisZQGJjVo(), stop.m109358getFontSynthesisZQGJjVo(), f);
        String str = (String) lerpDiscrete(start.getFontFeatureSettings(), stop.getFontFeatureSettings(), f);
        long m109360lerpTextUnitInheritableC3pnCVY2 = m109360lerpTextUnitInheritableC3pnCVY(start.m109359getLetterSpacingXSAIIZE(), stop.m109359getLetterSpacingXSAIIZE(), f);
        BaselineShift m109354getBaselineShift5SSeXJ0 = start.m109354getBaselineShift5SSeXJ0();
        if (m109354getBaselineShift5SSeXJ0 != null) {
            m109592constructorimpl = m109354getBaselineShift5SSeXJ0.m109597unboximpl();
        } else {
            m109592constructorimpl = BaselineShift.m109592constructorimpl(0.0f);
        }
        BaselineShift m109354getBaselineShift5SSeXJ02 = stop.m109354getBaselineShift5SSeXJ0();
        if (m109354getBaselineShift5SSeXJ02 != null) {
            m109592constructorimpl2 = m109354getBaselineShift5SSeXJ02.m109597unboximpl();
        } else {
            m109592constructorimpl2 = BaselineShift.m109592constructorimpl(0.0f);
        }
        float m109604lerpjWV1Mfo = BaselineShiftKt.m109604lerpjWV1Mfo(m109592constructorimpl, m109592constructorimpl2, f);
        TextGeometricTransform textGeometricTransform = start.getTextGeometricTransform();
        if (textGeometricTransform == null) {
            textGeometricTransform = TextGeometricTransform.Companion.getNone$ui_text_release();
        }
        TextGeometricTransform textGeometricTransform2 = stop.getTextGeometricTransform();
        if (textGeometricTransform2 == null) {
            textGeometricTransform2 = TextGeometricTransform.Companion.getNone$ui_text_release();
        }
        TextGeometricTransform lerp3 = TextGeometricTransformKt.lerp(textGeometricTransform, textGeometricTransform2, f);
        LocaleList localeList = (LocaleList) lerpDiscrete(start.getLocaleList(), stop.getLocaleList(), f);
        long m107579lerpjxsXWHM = ColorKt.m107579lerpjxsXWHM(start.m109353getBackground0d7_KjU(), stop.m109353getBackground0d7_KjU(), f);
        TextDecoration textDecoration = (TextDecoration) lerpDiscrete(start.getTextDecoration(), stop.getTextDecoration(), f);
        Shadow shadow = start.getShadow();
        if (shadow == null) {
            shadow = new Shadow(0L, 0L, 0.0f, 7, null);
        }
        Shadow shadow2 = stop.getShadow();
        if (shadow2 == null) {
            shadow2 = new Shadow(0L, 0L, 0.0f, 7, null);
        }
        return new SpanStyle(lerp, m109360lerpTextUnitInheritableC3pnCVY, lerp2, fontStyle, fontSynthesis, fontFamily, str, m109360lerpTextUnitInheritableC3pnCVY2, BaselineShift.m109591boximpl(m109604lerpjWV1Mfo), lerp3, localeList, m107579lerpjxsXWHM, textDecoration, ShadowKt.lerp(shadow, shadow2, f), lerpPlatformStyle(start.getPlatformStyle(), stop.getPlatformStyle(), f), (DefaultConstructorMarker) null);
    }

    public static final <T> T lerpDiscrete(T t, T t2, float f) {
        if (f >= 0.5d) {
            return t2;
        }
        return t;
    }

    private static final PlatformSpanStyle lerpPlatformStyle(PlatformSpanStyle platformSpanStyle, PlatformSpanStyle platformSpanStyle2, float f) {
        if (platformSpanStyle == null && platformSpanStyle2 == null) {
            return null;
        }
        if (platformSpanStyle == null) {
            platformSpanStyle = PlatformSpanStyle.Companion.getDefault();
        }
        if (platformSpanStyle2 == null) {
            platformSpanStyle2 = PlatformSpanStyle.Companion.getDefault();
        }
        return AndroidTextStyle_androidKt.lerp(platformSpanStyle, platformSpanStyle2, f);
    }

    /* renamed from: lerpTextUnitInheritable-C3pnCVY  reason: not valid java name */
    public static final long m109360lerpTextUnitInheritableC3pnCVY(long j, long j2, float f) {
        if (!TextUnitKt.m109933isUnspecifiedR2X_6o(j) && !TextUnitKt.m109933isUnspecifiedR2X_6o(j2)) {
            return TextUnitKt.m109935lerpC3pnCVY(j, j2, f);
        }
        return ((TextUnit) lerpDiscrete(TextUnit.m109905boximpl(j), TextUnit.m109905boximpl(j2), f)).m109924unboximpl();
    }

    @NotNull
    public static final SpanStyle resolveSpanStyleDefaults(@NotNull SpanStyle style) {
        long m109356getFontSizeXSAIIZE;
        int m109465getNormal_LCdwA;
        int m109475getAllGVVA2EU;
        long m109359getLetterSpacingXSAIIZE;
        float m109601getNoney9eOQZs;
        boolean z;
        Intrinsics.checkNotNullParameter(style, "style");
        TextDrawStyle takeOrElse = style.getTextDrawStyle$ui_text_release().takeOrElse(SpanStyleKt$resolveSpanStyleDefaults$1.INSTANCE);
        if (TextUnitKt.m109933isUnspecifiedR2X_6o(style.m109356getFontSizeXSAIIZE())) {
            m109356getFontSizeXSAIIZE = DefaultFontSize;
        } else {
            m109356getFontSizeXSAIIZE = style.m109356getFontSizeXSAIIZE();
        }
        long j = m109356getFontSizeXSAIIZE;
        FontWeight fontWeight = style.getFontWeight();
        if (fontWeight == null) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        FontWeight fontWeight2 = fontWeight;
        FontStyle m109357getFontStyle4Lr2A7w = style.m109357getFontStyle4Lr2A7w();
        if (m109357getFontStyle4Lr2A7w != null) {
            m109465getNormal_LCdwA = m109357getFontStyle4Lr2A7w.m109463unboximpl();
        } else {
            m109465getNormal_LCdwA = FontStyle.Companion.m109465getNormal_LCdwA();
        }
        FontStyle m109457boximpl = FontStyle.m109457boximpl(m109465getNormal_LCdwA);
        FontSynthesis m109358getFontSynthesisZQGJjVo = style.m109358getFontSynthesisZQGJjVo();
        if (m109358getFontSynthesisZQGJjVo != null) {
            m109475getAllGVVA2EU = m109358getFontSynthesisZQGJjVo.m109474unboximpl();
        } else {
            m109475getAllGVVA2EU = FontSynthesis.Companion.m109475getAllGVVA2EU();
        }
        FontSynthesis m109466boximpl = FontSynthesis.m109466boximpl(m109475getAllGVVA2EU);
        FontFamily fontFamily = style.getFontFamily();
        if (fontFamily == null) {
            fontFamily = FontFamily.Companion.getDefault();
        }
        FontFamily fontFamily2 = fontFamily;
        String fontFeatureSettings = style.getFontFeatureSettings();
        if (fontFeatureSettings == null) {
            fontFeatureSettings = "";
        }
        String str = fontFeatureSettings;
        if (TextUnitKt.m109933isUnspecifiedR2X_6o(style.m109359getLetterSpacingXSAIIZE())) {
            m109359getLetterSpacingXSAIIZE = DefaultLetterSpacing;
        } else {
            m109359getLetterSpacingXSAIIZE = style.m109359getLetterSpacingXSAIIZE();
        }
        long j2 = m109359getLetterSpacingXSAIIZE;
        BaselineShift m109354getBaselineShift5SSeXJ0 = style.m109354getBaselineShift5SSeXJ0();
        if (m109354getBaselineShift5SSeXJ0 != null) {
            m109601getNoney9eOQZs = m109354getBaselineShift5SSeXJ0.m109597unboximpl();
        } else {
            m109601getNoney9eOQZs = BaselineShift.Companion.m109601getNoney9eOQZs();
        }
        BaselineShift m109591boximpl = BaselineShift.m109591boximpl(m109601getNoney9eOQZs);
        TextGeometricTransform textGeometricTransform = style.getTextGeometricTransform();
        if (textGeometricTransform == null) {
            textGeometricTransform = TextGeometricTransform.Companion.getNone$ui_text_release();
        }
        TextGeometricTransform textGeometricTransform2 = textGeometricTransform;
        LocaleList localeList = style.getLocaleList();
        if (localeList == null) {
            localeList = LocaleList.Companion.getCurrent();
        }
        LocaleList localeList2 = localeList;
        long m109353getBackground0d7_KjU = style.m109353getBackground0d7_KjU();
        if (m109353getBackground0d7_KjU != Color.Companion.m107563getUnspecified0d7_KjU()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            m109353getBackground0d7_KjU = DefaultBackgroundColor;
        }
        long j3 = m109353getBackground0d7_KjU;
        TextDecoration textDecoration = style.getTextDecoration();
        if (textDecoration == null) {
            textDecoration = TextDecoration.Companion.getNone();
        }
        TextDecoration textDecoration2 = textDecoration;
        Shadow shadow = style.getShadow();
        if (shadow == null) {
            shadow = Shadow.Companion.getNone();
        }
        return new SpanStyle(takeOrElse, j, fontWeight2, m109457boximpl, m109466boximpl, fontFamily2, str, j2, m109591boximpl, textGeometricTransform2, localeList2, j3, textDecoration2, shadow, style.getPlatformStyle(), (DefaultConstructorMarker) null);
    }
}
