package net.pubnative.lite.sdk.utils.svgparser.utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.pubnative.lite.sdk.utils.svgparser.SVGParseException;
import net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase;
import net.pubnative.lite.sdk.utils.svgparser.utils.SVGParserImpl;

/* loaded from: classes10.dex */
public class Style implements Cloneable {
    static final float FONT_STRETCH_MIN = 0.0f;
    static final float FONT_STRETCH_NORMAL = 100.0f;
    static final float FONT_WEIGHT_BOLD = 700.0f;
    static final float FONT_WEIGHT_BOLDER = Float.MAX_VALUE;
    static final float FONT_WEIGHT_LIGHTER = Float.MIN_VALUE;
    static final float FONT_WEIGHT_MAX = 1000.0f;
    static final float FONT_WEIGHT_MIN = 1.0f;
    static final float FONT_WEIGHT_NORMAL = 400.0f;
    static final long SPECIFIED_CLIP = 1048576;
    static final long SPECIFIED_CLIP_PATH = 268435456;
    static final long SPECIFIED_CLIP_RULE = 536870912;
    static final long SPECIFIED_COLOR = 4096;
    static final long SPECIFIED_DIRECTION = 68719476736L;
    static final long SPECIFIED_DISPLAY = 16777216;
    static final long SPECIFIED_FILL = 1;
    static final long SPECIFIED_FILL_OPACITY = 4;
    static final long SPECIFIED_FILL_RULE = 2;
    static final long SPECIFIED_FONT_FAMILY = 8192;
    static final long SPECIFIED_FONT_FEATURE_SETTINGS = 35184372088832L;
    static final long SPECIFIED_FONT_KERNING = 562949953421312L;
    static final long SPECIFIED_FONT_SIZE = 16384;
    static final long SPECIFIED_FONT_STRETCH = 2251799813685248L;
    static final long SPECIFIED_FONT_STYLE = 65536;
    static final long SPECIFIED_FONT_VARIANT_CAPS = 4398046511104L;
    static final long SPECIFIED_FONT_VARIANT_EAST_ASIAN = 17592186044416L;
    static final long SPECIFIED_FONT_VARIANT_LIGATURES = 1099511627776L;
    static final long SPECIFIED_FONT_VARIANT_NUMERIC = 8796093022208L;
    static final long SPECIFIED_FONT_VARIANT_POSITION = 2199023255552L;
    static final long SPECIFIED_FONT_VARIATION_SETTINGS = 1125899906842624L;
    static final long SPECIFIED_FONT_WEIGHT = 32768;
    static final long SPECIFIED_GLYPH_ORIENTATION_VERTICAL = 140737488355328L;
    static final long SPECIFIED_IMAGE_RENDERING = 137438953472L;
    static final long SPECIFIED_ISOLATION = 274877906944L;
    static final long SPECIFIED_LETTER_SPACING = 4503599627370496L;
    static final long SPECIFIED_MARKER_END = 8388608;
    static final long SPECIFIED_MARKER_MID = 4194304;
    static final long SPECIFIED_MARKER_START = 2097152;
    static final long SPECIFIED_MASK = 1073741824;
    static final long SPECIFIED_MIX_BLEND_MODE = 549755813888L;
    static final long SPECIFIED_OPACITY = 2048;
    static final long SPECIFIED_OVERFLOW = 524288;
    private static final long SPECIFIED_RESET = -1159984767303681L;
    static final long SPECIFIED_SOLID_COLOR = 2147483648L;
    static final long SPECIFIED_SOLID_OPACITY = 4294967296L;
    static final long SPECIFIED_STOP_COLOR = 67108864;
    static final long SPECIFIED_STOP_OPACITY = 134217728;
    static final long SPECIFIED_STROKE = 8;
    static final long SPECIFIED_STROKE_DASHARRAY = 512;
    static final long SPECIFIED_STROKE_DASHOFFSET = 1024;
    static final long SPECIFIED_STROKE_LINECAP = 64;
    static final long SPECIFIED_STROKE_LINEJOIN = 128;
    static final long SPECIFIED_STROKE_MITERLIMIT = 256;
    static final long SPECIFIED_STROKE_OPACITY = 16;
    static final long SPECIFIED_STROKE_WIDTH = 32;
    static final long SPECIFIED_TEXT_ANCHOR = 262144;
    static final long SPECIFIED_TEXT_DECORATION = 131072;
    static final long SPECIFIED_TEXT_ORIENTATION = 281474976710656L;
    static final long SPECIFIED_VECTOR_EFFECT = 34359738368L;
    static final long SPECIFIED_VIEWPORT_FILL = 8589934592L;
    static final long SPECIFIED_VIEWPORT_FILL_OPACITY = 17179869184L;
    static final long SPECIFIED_VISIBILITY = 33554432;
    static final long SPECIFIED_WORD_SPACING = 9007199254740992L;
    static final long SPECIFIED_WRITING_MODE = 70368744177664L;
    SVGBase.CSSClipRect clip;
    String clipPath;
    FillRule clipRule;
    SVGBase.Colour color;
    TextDirection direction;
    Boolean display;
    SVGBase.SvgPaint fill;
    Float fillOpacity;
    FillRule fillRule;
    List<String> fontFamily;
    CSSFontFeatureSettings fontFeatureSettings;
    FontKerning fontKerning;
    SVGBase.Length fontSize;
    Float fontStretch;
    FontStyle fontStyle;
    CSSFontFeatureSettings fontVariantCaps;
    CSSFontFeatureSettings fontVariantEastAsian;
    CSSFontFeatureSettings fontVariantLigatures;
    CSSFontFeatureSettings fontVariantNumeric;
    CSSFontFeatureSettings fontVariantPosition;
    CSSFontVariationSettings fontVariationSettings;
    Float fontWeight;
    GlypOrientationVertical glyphOrientationVertical;
    RenderQuality imageRendering;
    Isolation isolation;
    SVGBase.Length letterSpacing;
    String markerEnd;
    String markerMid;
    String markerStart;
    String mask;
    CSSBlendMode mixBlendMode;
    Float opacity;
    Boolean overflow;
    SVGBase.SvgPaint solidColor;
    Float solidOpacity;
    long specifiedFlags = 0;
    SVGBase.SvgPaint stopColor;
    Float stopOpacity;
    SVGBase.SvgPaint stroke;
    SVGBase.Length[] strokeDashArray;
    SVGBase.Length strokeDashOffset;
    LineCap strokeLineCap;
    LineJoin strokeLineJoin;
    Float strokeMiterLimit;
    Float strokeOpacity;
    SVGBase.Length strokeWidth;
    TextAnchor textAnchor;
    TextDecoration textDecoration;
    TextOrientation textOrientation;
    VectorEffect vectorEffect;
    SVGBase.SvgPaint viewportFill;
    Float viewportFillOpacity;
    Boolean visibility;
    SVGBase.Length wordSpacing;
    WritingMode writingMode;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: net.pubnative.lite.sdk.utils.svgparser.utils.Style$1 */
    /* loaded from: classes10.dex */
    public static /* synthetic */ class C387041 {

        /* renamed from: $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGAttr */
        static final /* synthetic */ int[] f102134xfe0bd2a4;

        static {
            int[] iArr = new int[SVGParserImpl.SVGAttr.values().length];
            f102134xfe0bd2a4 = iArr;
            try {
                iArr[SVGParserImpl.SVGAttr.fill.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f102134xfe0bd2a4[SVGParserImpl.SVGAttr.fill_rule.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f102134xfe0bd2a4[SVGParserImpl.SVGAttr.fill_opacity.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f102134xfe0bd2a4[SVGParserImpl.SVGAttr.stroke.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f102134xfe0bd2a4[SVGParserImpl.SVGAttr.stroke_opacity.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f102134xfe0bd2a4[SVGParserImpl.SVGAttr.stroke_width.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f102134xfe0bd2a4[SVGParserImpl.SVGAttr.stroke_linecap.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f102134xfe0bd2a4[SVGParserImpl.SVGAttr.stroke_linejoin.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f102134xfe0bd2a4[SVGParserImpl.SVGAttr.stroke_miterlimit.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f102134xfe0bd2a4[SVGParserImpl.SVGAttr.stroke_dasharray.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f102134xfe0bd2a4[SVGParserImpl.SVGAttr.stroke_dashoffset.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f102134xfe0bd2a4[SVGParserImpl.SVGAttr.opacity.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f102134xfe0bd2a4[SVGParserImpl.SVGAttr.color.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f102134xfe0bd2a4[SVGParserImpl.SVGAttr.font.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f102134xfe0bd2a4[SVGParserImpl.SVGAttr.font_family.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f102134xfe0bd2a4[SVGParserImpl.SVGAttr.font_size.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f102134xfe0bd2a4[SVGParserImpl.SVGAttr.font_weight.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f102134xfe0bd2a4[SVGParserImpl.SVGAttr.font_style.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f102134xfe0bd2a4[SVGParserImpl.SVGAttr.font_stretch.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f102134xfe0bd2a4[SVGParserImpl.SVGAttr.text_decoration.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f102134xfe0bd2a4[SVGParserImpl.SVGAttr.direction.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f102134xfe0bd2a4[SVGParserImpl.SVGAttr.text_anchor.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f102134xfe0bd2a4[SVGParserImpl.SVGAttr.overflow.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f102134xfe0bd2a4[SVGParserImpl.SVGAttr.marker.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f102134xfe0bd2a4[SVGParserImpl.SVGAttr.marker_start.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f102134xfe0bd2a4[SVGParserImpl.SVGAttr.marker_mid.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f102134xfe0bd2a4[SVGParserImpl.SVGAttr.marker_end.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f102134xfe0bd2a4[SVGParserImpl.SVGAttr.display.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f102134xfe0bd2a4[SVGParserImpl.SVGAttr.visibility.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f102134xfe0bd2a4[SVGParserImpl.SVGAttr.stop_color.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f102134xfe0bd2a4[SVGParserImpl.SVGAttr.stop_opacity.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f102134xfe0bd2a4[SVGParserImpl.SVGAttr.clip.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f102134xfe0bd2a4[SVGParserImpl.SVGAttr.clip_path.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f102134xfe0bd2a4[SVGParserImpl.SVGAttr.clip_rule.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f102134xfe0bd2a4[SVGParserImpl.SVGAttr.mask.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f102134xfe0bd2a4[SVGParserImpl.SVGAttr.solid_color.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f102134xfe0bd2a4[SVGParserImpl.SVGAttr.solid_opacity.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f102134xfe0bd2a4[SVGParserImpl.SVGAttr.viewport_fill.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                f102134xfe0bd2a4[SVGParserImpl.SVGAttr.viewport_fill_opacity.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                f102134xfe0bd2a4[SVGParserImpl.SVGAttr.vector_effect.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                f102134xfe0bd2a4[SVGParserImpl.SVGAttr.image_rendering.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                f102134xfe0bd2a4[SVGParserImpl.SVGAttr.isolation.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                f102134xfe0bd2a4[SVGParserImpl.SVGAttr.mix_blend_mode.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                f102134xfe0bd2a4[SVGParserImpl.SVGAttr.font_kerning.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                f102134xfe0bd2a4[SVGParserImpl.SVGAttr.font_variant.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                f102134xfe0bd2a4[SVGParserImpl.SVGAttr.font_variant_ligatures.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                f102134xfe0bd2a4[SVGParserImpl.SVGAttr.font_variant_position.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                f102134xfe0bd2a4[SVGParserImpl.SVGAttr.font_variant_caps.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                f102134xfe0bd2a4[SVGParserImpl.SVGAttr.font_variant_numeric.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                f102134xfe0bd2a4[SVGParserImpl.SVGAttr.font_variant_east_asian.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                f102134xfe0bd2a4[SVGParserImpl.SVGAttr.font_feature_settings.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                f102134xfe0bd2a4[SVGParserImpl.SVGAttr.font_variation_settings.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                f102134xfe0bd2a4[SVGParserImpl.SVGAttr.letter_spacing.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                f102134xfe0bd2a4[SVGParserImpl.SVGAttr.word_spacing.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
        }
    }

    /* loaded from: classes10.dex */
    public enum CSSBlendMode {
        normal,
        multiply,
        screen,
        overlay,
        darken,
        lighten,
        color_dodge,
        color_burn,
        hard_light,
        soft_light,
        difference,
        exclusion,
        hue,
        saturation,
        color,
        luminosity,
        UNSUPPORTED;
        
        private static final Map<String, CSSBlendMode> cache = new HashMap();

        static {
            CSSBlendMode[] values;
            for (CSSBlendMode cSSBlendMode : values()) {
                if (cSSBlendMode != UNSUPPORTED) {
                    cache.put(cSSBlendMode.name().replace('_', '-'), cSSBlendMode);
                }
            }
        }

        public static CSSBlendMode fromString(String str) {
            CSSBlendMode cSSBlendMode = cache.get(str);
            if (cSSBlendMode != null) {
                return cSSBlendMode;
            }
            return UNSUPPORTED;
        }
    }

    /* loaded from: classes10.dex */
    public enum FillRule {
        NonZero,
        EvenOdd
    }

    /* loaded from: classes10.dex */
    public enum FontKerning {
        auto,
        normal,
        none
    }

    /* loaded from: classes10.dex */
    public enum FontStyle {
        normal,
        italic,
        oblique
    }

    /* loaded from: classes10.dex */
    public enum GlypOrientationVertical {
        auto,
        angle0,
        angle90,
        angle180,
        angle270
    }

    /* loaded from: classes10.dex */
    public enum Isolation {
        auto,
        isolate
    }

    /* loaded from: classes10.dex */
    public enum LineCap {
        Butt,
        Round,
        Square
    }

    /* loaded from: classes10.dex */
    public enum LineJoin {
        Miter,
        Round,
        Bevel
    }

    /* loaded from: classes10.dex */
    public enum RenderQuality {
        auto,
        optimizeQuality,
        optimizeSpeed
    }

    /* loaded from: classes10.dex */
    public enum TextAnchor {
        Start,
        Middle,
        End
    }

    /* loaded from: classes10.dex */
    public enum TextDecoration {
        None,
        Underline,
        Overline,
        LineThrough,
        Blink
    }

    /* loaded from: classes10.dex */
    public enum TextDirection {
        LTR,
        RTL
    }

    /* loaded from: classes10.dex */
    public enum TextOrientation {
        mixed,
        upright,
        sideways
    }

    /* loaded from: classes10.dex */
    public enum VectorEffect {
        None,
        NonScalingStroke
    }

    /* loaded from: classes10.dex */
    public enum WritingMode {
        lr_tb,
        rl_tb,
        tb_rl,
        lr,
        rl,
        tb,
        horizontal_tb,
        vertical_rl,
        vertical_lr
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Style getDefaultStyle() {
        Style style = new Style();
        SVGBase.Colour colour = SVGBase.Colour.BLACK;
        style.fill = colour;
        FillRule fillRule = FillRule.NonZero;
        style.fillRule = fillRule;
        Float valueOf = Float.valueOf(1.0f);
        style.fillOpacity = valueOf;
        style.stroke = null;
        style.strokeOpacity = valueOf;
        style.strokeWidth = new SVGBase.Length(1.0f);
        style.strokeLineCap = LineCap.Butt;
        style.strokeLineJoin = LineJoin.Miter;
        style.strokeMiterLimit = Float.valueOf(4.0f);
        style.strokeDashArray = null;
        SVGBase.Length length = SVGBase.Length.ZERO;
        style.strokeDashOffset = length;
        style.opacity = valueOf;
        style.color = colour;
        style.fontFamily = null;
        style.fontSize = new SVGBase.Length(12.0f, SVGBase.Unit.pt);
        style.fontWeight = Float.valueOf(400.0f);
        style.fontStyle = FontStyle.normal;
        style.fontStretch = Float.valueOf(100.0f);
        style.textDecoration = TextDecoration.None;
        style.direction = TextDirection.LTR;
        style.textAnchor = TextAnchor.Start;
        Boolean bool = Boolean.TRUE;
        style.overflow = bool;
        style.clip = null;
        style.markerStart = null;
        style.markerMid = null;
        style.markerEnd = null;
        style.display = bool;
        style.visibility = bool;
        style.stopColor = colour;
        style.stopOpacity = valueOf;
        style.clipPath = null;
        style.clipRule = fillRule;
        style.mask = null;
        style.solidColor = null;
        style.solidOpacity = valueOf;
        style.viewportFill = null;
        style.viewportFillOpacity = valueOf;
        style.vectorEffect = VectorEffect.None;
        style.imageRendering = RenderQuality.auto;
        style.isolation = Isolation.auto;
        style.mixBlendMode = CSSBlendMode.normal;
        style.fontKerning = FontKerning.auto;
        style.fontVariantLigatures = CSSFontFeatureSettings.LIGATURES_NORMAL;
        style.fontVariantPosition = CSSFontFeatureSettings.POSITION_ALL_OFF;
        style.fontVariantCaps = CSSFontFeatureSettings.CAPS_ALL_OFF;
        style.fontVariantNumeric = CSSFontFeatureSettings.NUMERIC_ALL_OFF;
        style.fontVariantEastAsian = CSSFontFeatureSettings.EAST_ASIAN_ALL_OFF;
        style.fontFeatureSettings = CSSFontFeatureSettings.FONT_FEATURE_SETTINGS_NORMAL;
        style.fontVariationSettings = null;
        style.letterSpacing = length;
        style.wordSpacing = length;
        style.writingMode = WritingMode.horizontal_tb;
        style.glyphOrientationVertical = GlypOrientationVertical.auto;
        style.textOrientation = TextOrientation.mixed;
        style.specifiedFlags = SPECIFIED_RESET;
        return style;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void processStyleProperty(Style style, String str, String str2, boolean z) {
        if (str2.length() == 0 || str2.equals("inherit")) {
            return;
        }
        try {
            switch (C387041.f102134xfe0bd2a4[SVGParserImpl.SVGAttr.fromString(str).ordinal()]) {
                case 1:
                    SVGBase.SvgPaint parsePaintSpecifier = SVGParserImpl.parsePaintSpecifier(str2);
                    style.fill = parsePaintSpecifier;
                    if (parsePaintSpecifier != null) {
                        style.specifiedFlags |= 1;
                        return;
                    }
                    return;
                case 2:
                    FillRule parseFillRule = SVGParserImpl.parseFillRule(str2);
                    style.fillRule = parseFillRule;
                    if (parseFillRule != null) {
                        style.specifiedFlags |= 2;
                        return;
                    }
                    return;
                case 3:
                    Float parseOpacity = SVGParserImpl.parseOpacity(str2);
                    style.fillOpacity = parseOpacity;
                    if (parseOpacity != null) {
                        style.specifiedFlags |= SPECIFIED_FILL_OPACITY;
                        return;
                    }
                    return;
                case 4:
                    SVGBase.SvgPaint parsePaintSpecifier2 = SVGParserImpl.parsePaintSpecifier(str2);
                    style.stroke = parsePaintSpecifier2;
                    if (parsePaintSpecifier2 != null) {
                        style.specifiedFlags |= SPECIFIED_STROKE;
                        return;
                    }
                    return;
                case 5:
                    Float parseOpacity2 = SVGParserImpl.parseOpacity(str2);
                    style.strokeOpacity = parseOpacity2;
                    if (parseOpacity2 != null) {
                        style.specifiedFlags |= SPECIFIED_STROKE_OPACITY;
                        return;
                    }
                    return;
                case 6:
                    style.strokeWidth = SVGParserImpl.parseLength(str2);
                    style.specifiedFlags |= SPECIFIED_STROKE_WIDTH;
                    break;
                case 7:
                    LineCap parseStrokeLineCap = SVGParserImpl.parseStrokeLineCap(str2);
                    style.strokeLineCap = parseStrokeLineCap;
                    if (parseStrokeLineCap != null) {
                        style.specifiedFlags |= SPECIFIED_STROKE_LINECAP;
                        return;
                    }
                    return;
                case 8:
                    LineJoin parseStrokeLineJoin = SVGParserImpl.parseStrokeLineJoin(str2);
                    style.strokeLineJoin = parseStrokeLineJoin;
                    if (parseStrokeLineJoin != null) {
                        style.specifiedFlags |= SPECIFIED_STROKE_LINEJOIN;
                        return;
                    }
                    return;
                case 9:
                    style.strokeMiterLimit = Float.valueOf(SVGParserImpl.parseFloat(str2));
                    style.specifiedFlags |= SPECIFIED_STROKE_MITERLIMIT;
                    break;
                case 10:
                    if ("none".equals(str2)) {
                        style.strokeDashArray = null;
                        style.specifiedFlags |= SPECIFIED_STROKE_DASHARRAY;
                        return;
                    }
                    SVGBase.Length[] parseStrokeDashArray = SVGParserImpl.parseStrokeDashArray(str2);
                    style.strokeDashArray = parseStrokeDashArray;
                    if (parseStrokeDashArray != null) {
                        style.specifiedFlags |= SPECIFIED_STROKE_DASHARRAY;
                        return;
                    }
                    return;
                case 11:
                    style.strokeDashOffset = SVGParserImpl.parseLength(str2);
                    style.specifiedFlags |= SPECIFIED_STROKE_DASHOFFSET;
                    break;
                case 12:
                    style.opacity = SVGParserImpl.parseOpacity(str2);
                    style.specifiedFlags |= SPECIFIED_OPACITY;
                    return;
                case 13:
                    style.color = SVGParserImpl.parseColour(str2);
                    style.specifiedFlags |= SPECIFIED_COLOR;
                    return;
                case 14:
                    if (z) {
                        return;
                    }
                    SVGParserImpl.parseFont(style, str2);
                    return;
                case 15:
                    List<String> parseFontFamily = SVGParserImpl.parseFontFamily(str2);
                    style.fontFamily = parseFontFamily;
                    if (parseFontFamily != null) {
                        style.specifiedFlags |= SPECIFIED_FONT_FAMILY;
                        return;
                    }
                    return;
                case 16:
                    SVGBase.Length parseFontSize = SVGParserImpl.parseFontSize(str2);
                    style.fontSize = parseFontSize;
                    if (parseFontSize != null) {
                        style.specifiedFlags |= SPECIFIED_FONT_SIZE;
                        return;
                    }
                    return;
                case 17:
                    Float parseFontWeight = SVGParserImpl.parseFontWeight(str2);
                    style.fontWeight = parseFontWeight;
                    if (parseFontWeight != null) {
                        style.specifiedFlags |= SPECIFIED_FONT_WEIGHT;
                        return;
                    }
                    return;
                case 18:
                    FontStyle parseFontStyle = SVGParserImpl.parseFontStyle(str2);
                    style.fontStyle = parseFontStyle;
                    if (parseFontStyle != null) {
                        style.specifiedFlags |= SPECIFIED_FONT_STYLE;
                        return;
                    }
                    return;
                case 19:
                    Float parseFontStretch = SVGParserImpl.parseFontStretch(str2);
                    style.fontStretch = parseFontStretch;
                    if (parseFontStretch != null) {
                        style.specifiedFlags |= SPECIFIED_FONT_STRETCH;
                        return;
                    }
                    return;
                case 20:
                    TextDecoration parseTextDecoration = SVGParserImpl.parseTextDecoration(str2);
                    style.textDecoration = parseTextDecoration;
                    if (parseTextDecoration != null) {
                        style.specifiedFlags |= SPECIFIED_TEXT_DECORATION;
                        return;
                    }
                    return;
                case 21:
                    TextDirection parseTextDirection = SVGParserImpl.parseTextDirection(str2);
                    style.direction = parseTextDirection;
                    if (parseTextDirection != null) {
                        style.specifiedFlags |= SPECIFIED_DIRECTION;
                        return;
                    }
                    return;
                case 22:
                    TextAnchor parseTextAnchor = SVGParserImpl.parseTextAnchor(str2);
                    style.textAnchor = parseTextAnchor;
                    if (parseTextAnchor != null) {
                        style.specifiedFlags |= SPECIFIED_TEXT_ANCHOR;
                        return;
                    }
                    return;
                case 23:
                    Boolean parseOverflow = SVGParserImpl.parseOverflow(str2);
                    style.overflow = parseOverflow;
                    if (parseOverflow != null) {
                        style.specifiedFlags |= SPECIFIED_OVERFLOW;
                        return;
                    }
                    return;
                case 24:
                    String parseFunctionalIRI = SVGParserImpl.parseFunctionalIRI(str2, str);
                    style.markerStart = parseFunctionalIRI;
                    style.markerMid = parseFunctionalIRI;
                    style.markerEnd = parseFunctionalIRI;
                    style.specifiedFlags |= 14680064;
                    return;
                case 25:
                    style.markerStart = SVGParserImpl.parseFunctionalIRI(str2, str);
                    style.specifiedFlags |= 2097152;
                    return;
                case 26:
                    style.markerMid = SVGParserImpl.parseFunctionalIRI(str2, str);
                    style.specifiedFlags |= SPECIFIED_MARKER_MID;
                    return;
                case 27:
                    style.markerEnd = SVGParserImpl.parseFunctionalIRI(str2, str);
                    style.specifiedFlags |= SPECIFIED_MARKER_END;
                    return;
                case 28:
                    if (str2.indexOf(124) < 0) {
                        if ("|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|".contains('|' + str2 + '|')) {
                            style.display = Boolean.valueOf(!str2.equals("none"));
                            style.specifiedFlags |= SPECIFIED_DISPLAY;
                            return;
                        }
                        return;
                    }
                    return;
                case 29:
                    if (str2.indexOf(124) < 0) {
                        if ("|visible|hidden|collapse|".contains('|' + str2 + '|')) {
                            style.visibility = Boolean.valueOf(str2.equals("visible"));
                            style.specifiedFlags |= SPECIFIED_VISIBILITY;
                            return;
                        }
                        return;
                    }
                    return;
                case 30:
                    if (str2.equals("currentColor")) {
                        style.stopColor = SVGBase.CurrentColor.getInstance();
                    } else {
                        style.stopColor = SVGParserImpl.parseColour(str2);
                    }
                    style.specifiedFlags |= SPECIFIED_STOP_COLOR;
                    return;
                case 31:
                    style.stopOpacity = SVGParserImpl.parseOpacity(str2);
                    style.specifiedFlags |= SPECIFIED_STOP_OPACITY;
                    return;
                case 32:
                    SVGBase.CSSClipRect parseClip = SVGParserImpl.parseClip(str2);
                    style.clip = parseClip;
                    if (parseClip != null) {
                        style.specifiedFlags |= SPECIFIED_CLIP;
                        return;
                    }
                    return;
                case 33:
                    style.clipPath = SVGParserImpl.parseFunctionalIRI(str2, str);
                    style.specifiedFlags |= SPECIFIED_CLIP_PATH;
                    return;
                case 34:
                    style.clipRule = SVGParserImpl.parseFillRule(str2);
                    style.specifiedFlags |= SPECIFIED_CLIP_RULE;
                    return;
                case 35:
                    style.mask = SVGParserImpl.parseFunctionalIRI(str2, str);
                    style.specifiedFlags |= SPECIFIED_MASK;
                    return;
                case 36:
                    if (z) {
                        if (str2.equals("currentColor")) {
                            style.solidColor = SVGBase.CurrentColor.getInstance();
                        } else {
                            style.solidColor = SVGParserImpl.parseColour(str2);
                        }
                        style.specifiedFlags |= SPECIFIED_SOLID_COLOR;
                        return;
                    }
                    return;
                case 37:
                    if (z) {
                        style.solidOpacity = SVGParserImpl.parseOpacity(str2);
                        style.specifiedFlags |= SPECIFIED_SOLID_OPACITY;
                        return;
                    }
                    return;
                case 38:
                    if (str2.equals("currentColor")) {
                        style.viewportFill = SVGBase.CurrentColor.getInstance();
                    } else {
                        style.viewportFill = SVGParserImpl.parseColour(str2);
                    }
                    style.specifiedFlags |= SPECIFIED_VIEWPORT_FILL;
                    return;
                case 39:
                    style.viewportFillOpacity = SVGParserImpl.parseOpacity(str2);
                    style.specifiedFlags |= SPECIFIED_VIEWPORT_FILL_OPACITY;
                    return;
                case 40:
                    VectorEffect parseVectorEffect = SVGParserImpl.parseVectorEffect(str2);
                    style.vectorEffect = parseVectorEffect;
                    if (parseVectorEffect != null) {
                        style.specifiedFlags |= SPECIFIED_VECTOR_EFFECT;
                        return;
                    }
                    return;
                case 41:
                    RenderQuality parseRenderQuality = SVGParserImpl.parseRenderQuality(str2);
                    style.imageRendering = parseRenderQuality;
                    if (parseRenderQuality != null) {
                        style.specifiedFlags |= SPECIFIED_IMAGE_RENDERING;
                        return;
                    }
                    return;
                case 42:
                    if (z) {
                        return;
                    }
                    Isolation parseIsolation = SVGParserImpl.parseIsolation(str2);
                    style.isolation = parseIsolation;
                    if (parseIsolation != null) {
                        style.specifiedFlags |= SPECIFIED_ISOLATION;
                        return;
                    }
                    return;
                case 43:
                    if (z) {
                        return;
                    }
                    CSSBlendMode fromString = CSSBlendMode.fromString(str2);
                    style.mixBlendMode = fromString;
                    if (fromString != null) {
                        style.specifiedFlags |= SPECIFIED_MIX_BLEND_MODE;
                        return;
                    }
                    return;
                case 44:
                    if (z) {
                        return;
                    }
                    FontKerning parseFontKerning = CSSFontFeatureSettings.parseFontKerning(str2);
                    style.fontKerning = parseFontKerning;
                    if (parseFontKerning != null) {
                        style.specifiedFlags |= SPECIFIED_FONT_KERNING;
                        return;
                    }
                    return;
                case 45:
                    if (z) {
                        return;
                    }
                    CSSFontFeatureSettings.parseFontVariant(style, str2);
                    return;
                case 46:
                    if (z) {
                        return;
                    }
                    CSSFontFeatureSettings parseVariantLigatures = CSSFontFeatureSettings.parseVariantLigatures(str2);
                    style.fontVariantLigatures = parseVariantLigatures;
                    if (parseVariantLigatures != null) {
                        style.specifiedFlags |= SPECIFIED_FONT_VARIANT_LIGATURES;
                        return;
                    }
                    return;
                case 47:
                    if (z) {
                        return;
                    }
                    CSSFontFeatureSettings parseVariantPosition = CSSFontFeatureSettings.parseVariantPosition(str2);
                    style.fontVariantPosition = parseVariantPosition;
                    if (parseVariantPosition != null) {
                        style.specifiedFlags |= SPECIFIED_FONT_VARIANT_POSITION;
                        return;
                    }
                    return;
                case 48:
                    if (z) {
                        return;
                    }
                    CSSFontFeatureSettings parseVariantCaps = CSSFontFeatureSettings.parseVariantCaps(str2);
                    style.fontVariantCaps = parseVariantCaps;
                    if (parseVariantCaps != null) {
                        style.specifiedFlags |= SPECIFIED_FONT_VARIANT_CAPS;
                        return;
                    }
                    return;
                case 49:
                    if (z) {
                        return;
                    }
                    CSSFontFeatureSettings parseVariantNumeric = CSSFontFeatureSettings.parseVariantNumeric(str2);
                    style.fontVariantNumeric = parseVariantNumeric;
                    if (parseVariantNumeric != null) {
                        style.specifiedFlags |= SPECIFIED_FONT_VARIANT_NUMERIC;
                        return;
                    }
                    return;
                case 50:
                    if (z) {
                        return;
                    }
                    CSSFontFeatureSettings parseEastAsian = CSSFontFeatureSettings.parseEastAsian(str2);
                    style.fontVariantEastAsian = parseEastAsian;
                    if (parseEastAsian != null) {
                        style.specifiedFlags |= SPECIFIED_FONT_VARIANT_EAST_ASIAN;
                        return;
                    }
                    return;
                case 51:
                    if (z) {
                        return;
                    }
                    CSSFontFeatureSettings parseFontFeatureSettings = CSSFontFeatureSettings.parseFontFeatureSettings(str2);
                    style.fontFeatureSettings = parseFontFeatureSettings;
                    if (parseFontFeatureSettings != null) {
                        style.specifiedFlags |= SPECIFIED_FONT_FEATURE_SETTINGS;
                        return;
                    }
                    return;
                case 52:
                    if (z) {
                        return;
                    }
                    CSSFontVariationSettings parseFontVariationSettings = CSSFontVariationSettings.parseFontVariationSettings(str2);
                    style.fontVariationSettings = parseFontVariationSettings;
                    if (parseFontVariationSettings != null) {
                        style.specifiedFlags |= SPECIFIED_FONT_VARIATION_SETTINGS;
                        return;
                    }
                    return;
                case 53:
                    SVGBase.Length parseLetterOrWordSpacing = SVGParserImpl.parseLetterOrWordSpacing(str2);
                    style.letterSpacing = parseLetterOrWordSpacing;
                    if (parseLetterOrWordSpacing != null) {
                        style.specifiedFlags |= SPECIFIED_LETTER_SPACING;
                        return;
                    }
                    return;
                case 54:
                    SVGBase.Length parseLetterOrWordSpacing2 = SVGParserImpl.parseLetterOrWordSpacing(str2);
                    style.wordSpacing = parseLetterOrWordSpacing2;
                    if (parseLetterOrWordSpacing2 != null) {
                        style.specifiedFlags |= SPECIFIED_WORD_SPACING;
                        return;
                    }
                    return;
                default:
            }
        } catch (SVGParseException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Object clone() throws CloneNotSupportedException {
        Style style = (Style) super.clone();
        SVGBase.Length[] lengthArr = this.strokeDashArray;
        if (lengthArr != null) {
            style.strokeDashArray = (SVGBase.Length[]) lengthArr.clone();
        }
        return style;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void resetNonInheritingProperties(boolean z) {
        Boolean bool = Boolean.TRUE;
        this.display = bool;
        if (!z) {
            bool = Boolean.FALSE;
        }
        this.overflow = bool;
        this.clip = null;
        this.clipPath = null;
        this.opacity = Float.valueOf(1.0f);
        this.stopColor = SVGBase.Colour.BLACK;
        this.stopOpacity = Float.valueOf(1.0f);
        this.mask = null;
        this.solidColor = null;
        this.solidOpacity = Float.valueOf(1.0f);
        this.viewportFill = null;
        this.viewportFillOpacity = Float.valueOf(1.0f);
        this.vectorEffect = VectorEffect.None;
        this.isolation = Isolation.auto;
        this.mixBlendMode = CSSBlendMode.normal;
    }
}
