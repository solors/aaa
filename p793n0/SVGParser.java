package p793n0;

import android.graphics.Matrix;
import android.util.Log;
import android.util.Xml;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.ViewCompat;
import com.bykv.p135vk.openvk.preload.falconx.statistic.StatisticData;
import com.ironsource.C20517nb;
import com.ironsource.C21114v8;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.CacheDataSource;
import com.p552ot.pubsub.p553a.C26484a;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.ext.DefaultHandler2;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p793n0.CSSParser;
import p793n0.PreserveAspectRatio;
import p793n0.SVG;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: n0.l */
/* loaded from: classes11.dex */
public class SVGParser {

    /* renamed from: d */
    private int f101606d;

    /* renamed from: a */
    private SVG f101603a = null;

    /* renamed from: b */
    private SVG.InterfaceC38358j0 f101604b = null;

    /* renamed from: c */
    private boolean f101605c = false;

    /* renamed from: e */
    private boolean f101607e = false;

    /* renamed from: f */
    private EnumC38409h f101608f = null;

    /* renamed from: g */
    private StringBuilder f101609g = null;

    /* renamed from: h */
    private boolean f101610h = false;

    /* renamed from: i */
    private StringBuilder f101611i = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SVGParser.java */
    /* renamed from: n0.l$a */
    /* loaded from: classes11.dex */
    public static /* synthetic */ class C38402a {

        /* renamed from: a */
        static final /* synthetic */ int[] f101612a;

        /* renamed from: b */
        static final /* synthetic */ int[] f101613b;

        static {
            int[] iArr = new int[EnumC38408g.values().length];
            f101613b = iArr;
            try {
                iArr[EnumC38408g.x.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f101613b[EnumC38408g.y.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f101613b[EnumC38408g.width.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f101613b[EnumC38408g.height.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f101613b[EnumC38408g.version.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f101613b[EnumC38408g.href.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f101613b[EnumC38408g.preserveAspectRatio.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f101613b[EnumC38408g.d.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f101613b[EnumC38408g.pathLength.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f101613b[EnumC38408g.rx.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f101613b[EnumC38408g.ry.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f101613b[EnumC38408g.cx.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f101613b[EnumC38408g.cy.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f101613b[EnumC38408g.r.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f101613b[EnumC38408g.x1.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f101613b[EnumC38408g.y1.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f101613b[EnumC38408g.x2.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f101613b[EnumC38408g.y2.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f101613b[EnumC38408g.dx.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f101613b[EnumC38408g.dy.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f101613b[EnumC38408g.requiredFeatures.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f101613b[EnumC38408g.requiredExtensions.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f101613b[EnumC38408g.systemLanguage.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f101613b[EnumC38408g.requiredFormats.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f101613b[EnumC38408g.requiredFonts.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f101613b[EnumC38408g.refX.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f101613b[EnumC38408g.refY.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f101613b[EnumC38408g.markerWidth.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f101613b[EnumC38408g.markerHeight.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f101613b[EnumC38408g.markerUnits.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f101613b[EnumC38408g.orient.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f101613b[EnumC38408g.gradientUnits.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f101613b[EnumC38408g.gradientTransform.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f101613b[EnumC38408g.spreadMethod.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f101613b[EnumC38408g.fx.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f101613b[EnumC38408g.fy.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f101613b[EnumC38408g.offset.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f101613b[EnumC38408g.clipPathUnits.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                f101613b[EnumC38408g.startOffset.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                f101613b[EnumC38408g.patternUnits.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                f101613b[EnumC38408g.patternContentUnits.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                f101613b[EnumC38408g.patternTransform.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                f101613b[EnumC38408g.maskUnits.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                f101613b[EnumC38408g.maskContentUnits.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                f101613b[EnumC38408g.style.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                f101613b[EnumC38408g.CLASS.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                f101613b[EnumC38408g.fill.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                f101613b[EnumC38408g.fill_rule.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                f101613b[EnumC38408g.fill_opacity.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                f101613b[EnumC38408g.stroke.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                f101613b[EnumC38408g.stroke_opacity.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                f101613b[EnumC38408g.stroke_width.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                f101613b[EnumC38408g.stroke_linecap.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                f101613b[EnumC38408g.stroke_linejoin.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                f101613b[EnumC38408g.stroke_miterlimit.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                f101613b[EnumC38408g.stroke_dasharray.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                f101613b[EnumC38408g.stroke_dashoffset.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                f101613b[EnumC38408g.opacity.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                f101613b[EnumC38408g.color.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                f101613b[EnumC38408g.font.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                f101613b[EnumC38408g.font_family.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                f101613b[EnumC38408g.font_size.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                f101613b[EnumC38408g.font_weight.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                f101613b[EnumC38408g.font_style.ordinal()] = 64;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                f101613b[EnumC38408g.text_decoration.ordinal()] = 65;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                f101613b[EnumC38408g.direction.ordinal()] = 66;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                f101613b[EnumC38408g.text_anchor.ordinal()] = 67;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                f101613b[EnumC38408g.overflow.ordinal()] = 68;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                f101613b[EnumC38408g.marker.ordinal()] = 69;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                f101613b[EnumC38408g.marker_start.ordinal()] = 70;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                f101613b[EnumC38408g.marker_mid.ordinal()] = 71;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                f101613b[EnumC38408g.marker_end.ordinal()] = 72;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                f101613b[EnumC38408g.display.ordinal()] = 73;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                f101613b[EnumC38408g.visibility.ordinal()] = 74;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                f101613b[EnumC38408g.stop_color.ordinal()] = 75;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                f101613b[EnumC38408g.stop_opacity.ordinal()] = 76;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                f101613b[EnumC38408g.clip.ordinal()] = 77;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                f101613b[EnumC38408g.clip_path.ordinal()] = 78;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                f101613b[EnumC38408g.clip_rule.ordinal()] = 79;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                f101613b[EnumC38408g.mask.ordinal()] = 80;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                f101613b[EnumC38408g.solid_color.ordinal()] = 81;
            } catch (NoSuchFieldError unused81) {
            }
            try {
                f101613b[EnumC38408g.solid_opacity.ordinal()] = 82;
            } catch (NoSuchFieldError unused82) {
            }
            try {
                f101613b[EnumC38408g.viewport_fill.ordinal()] = 83;
            } catch (NoSuchFieldError unused83) {
            }
            try {
                f101613b[EnumC38408g.viewport_fill_opacity.ordinal()] = 84;
            } catch (NoSuchFieldError unused84) {
            }
            try {
                f101613b[EnumC38408g.vector_effect.ordinal()] = 85;
            } catch (NoSuchFieldError unused85) {
            }
            try {
                f101613b[EnumC38408g.image_rendering.ordinal()] = 86;
            } catch (NoSuchFieldError unused86) {
            }
            try {
                f101613b[EnumC38408g.viewBox.ordinal()] = 87;
            } catch (NoSuchFieldError unused87) {
            }
            try {
                f101613b[EnumC38408g.type.ordinal()] = 88;
            } catch (NoSuchFieldError unused88) {
            }
            try {
                f101613b[EnumC38408g.media.ordinal()] = 89;
            } catch (NoSuchFieldError unused89) {
            }
            int[] iArr2 = new int[EnumC38409h.values().length];
            f101612a = iArr2;
            try {
                iArr2[EnumC38409h.svg.ordinal()] = 1;
            } catch (NoSuchFieldError unused90) {
            }
            try {
                f101612a[EnumC38409h.g.ordinal()] = 2;
            } catch (NoSuchFieldError unused91) {
            }
            try {
                f101612a[EnumC38409h.a.ordinal()] = 3;
            } catch (NoSuchFieldError unused92) {
            }
            try {
                f101612a[EnumC38409h.defs.ordinal()] = 4;
            } catch (NoSuchFieldError unused93) {
            }
            try {
                f101612a[EnumC38409h.use.ordinal()] = 5;
            } catch (NoSuchFieldError unused94) {
            }
            try {
                f101612a[EnumC38409h.path.ordinal()] = 6;
            } catch (NoSuchFieldError unused95) {
            }
            try {
                f101612a[EnumC38409h.rect.ordinal()] = 7;
            } catch (NoSuchFieldError unused96) {
            }
            try {
                f101612a[EnumC38409h.circle.ordinal()] = 8;
            } catch (NoSuchFieldError unused97) {
            }
            try {
                f101612a[EnumC38409h.ellipse.ordinal()] = 9;
            } catch (NoSuchFieldError unused98) {
            }
            try {
                f101612a[EnumC38409h.line.ordinal()] = 10;
            } catch (NoSuchFieldError unused99) {
            }
            try {
                f101612a[EnumC38409h.polyline.ordinal()] = 11;
            } catch (NoSuchFieldError unused100) {
            }
            try {
                f101612a[EnumC38409h.polygon.ordinal()] = 12;
            } catch (NoSuchFieldError unused101) {
            }
            try {
                f101612a[EnumC38409h.text.ordinal()] = 13;
            } catch (NoSuchFieldError unused102) {
            }
            try {
                f101612a[EnumC38409h.tspan.ordinal()] = 14;
            } catch (NoSuchFieldError unused103) {
            }
            try {
                f101612a[EnumC38409h.tref.ordinal()] = 15;
            } catch (NoSuchFieldError unused104) {
            }
            try {
                f101612a[EnumC38409h.SWITCH.ordinal()] = 16;
            } catch (NoSuchFieldError unused105) {
            }
            try {
                f101612a[EnumC38409h.symbol.ordinal()] = 17;
            } catch (NoSuchFieldError unused106) {
            }
            try {
                f101612a[EnumC38409h.marker.ordinal()] = 18;
            } catch (NoSuchFieldError unused107) {
            }
            try {
                f101612a[EnumC38409h.linearGradient.ordinal()] = 19;
            } catch (NoSuchFieldError unused108) {
            }
            try {
                f101612a[EnumC38409h.radialGradient.ordinal()] = 20;
            } catch (NoSuchFieldError unused109) {
            }
            try {
                f101612a[EnumC38409h.stop.ordinal()] = 21;
            } catch (NoSuchFieldError unused110) {
            }
            try {
                f101612a[EnumC38409h.title.ordinal()] = 22;
            } catch (NoSuchFieldError unused111) {
            }
            try {
                f101612a[EnumC38409h.desc.ordinal()] = 23;
            } catch (NoSuchFieldError unused112) {
            }
            try {
                f101612a[EnumC38409h.clipPath.ordinal()] = 24;
            } catch (NoSuchFieldError unused113) {
            }
            try {
                f101612a[EnumC38409h.textPath.ordinal()] = 25;
            } catch (NoSuchFieldError unused114) {
            }
            try {
                f101612a[EnumC38409h.pattern.ordinal()] = 26;
            } catch (NoSuchFieldError unused115) {
            }
            try {
                f101612a[EnumC38409h.image.ordinal()] = 27;
            } catch (NoSuchFieldError unused116) {
            }
            try {
                f101612a[EnumC38409h.view.ordinal()] = 28;
            } catch (NoSuchFieldError unused117) {
            }
            try {
                f101612a[EnumC38409h.mask.ordinal()] = 29;
            } catch (NoSuchFieldError unused118) {
            }
            try {
                f101612a[EnumC38409h.style.ordinal()] = 30;
            } catch (NoSuchFieldError unused119) {
            }
            try {
                f101612a[EnumC38409h.solidColor.ordinal()] = 31;
            } catch (NoSuchFieldError unused120) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SVGParser.java */
    /* renamed from: n0.l$b */
    /* loaded from: classes11.dex */
    public static class C38403b {

        /* renamed from: a */
        private static final Map<String, PreserveAspectRatio.EnumC38321a> f101614a;

        static {
            HashMap hashMap = new HashMap(10);
            f101614a = hashMap;
            hashMap.put("none", PreserveAspectRatio.EnumC38321a.none);
            hashMap.put("xMinYMin", PreserveAspectRatio.EnumC38321a.xMinYMin);
            hashMap.put("xMidYMin", PreserveAspectRatio.EnumC38321a.xMidYMin);
            hashMap.put("xMaxYMin", PreserveAspectRatio.EnumC38321a.xMaxYMin);
            hashMap.put("xMinYMid", PreserveAspectRatio.EnumC38321a.xMinYMid);
            hashMap.put("xMidYMid", PreserveAspectRatio.EnumC38321a.xMidYMid);
            hashMap.put("xMaxYMid", PreserveAspectRatio.EnumC38321a.xMaxYMid);
            hashMap.put("xMinYMax", PreserveAspectRatio.EnumC38321a.xMinYMax);
            hashMap.put("xMidYMax", PreserveAspectRatio.EnumC38321a.xMidYMax);
            hashMap.put("xMaxYMax", PreserveAspectRatio.EnumC38321a.xMaxYMax);
        }

        /* renamed from: a */
        static PreserveAspectRatio.EnumC38321a m14764a(String str) {
            return f101614a.get(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SVGParser.java */
    /* renamed from: n0.l$c */
    /* loaded from: classes11.dex */
    public static class C38404c {

        /* renamed from: a */
        private static final Map<String, Integer> f101615a;

        static {
            HashMap hashMap = new HashMap(47);
            f101615a = hashMap;
            hashMap.put("aliceblue", -984833);
            hashMap.put("antiquewhite", -332841);
            hashMap.put("aqua", -16711681);
            hashMap.put("aquamarine", -8388652);
            hashMap.put("azure", -983041);
            hashMap.put("beige", -657956);
            hashMap.put("bisque", -6972);
            hashMap.put("black", Integer.valueOf((int) ViewCompat.MEASURED_STATE_MASK));
            hashMap.put("blanchedalmond", -5171);
            hashMap.put("blue", -16776961);
            hashMap.put("blueviolet", -7722014);
            hashMap.put("brown", -5952982);
            hashMap.put("burlywood", -2180985);
            hashMap.put("cadetblue", -10510688);
            hashMap.put("chartreuse", -8388864);
            hashMap.put("chocolate", -2987746);
            hashMap.put("coral", -32944);
            hashMap.put("cornflowerblue", -10185235);
            hashMap.put("cornsilk", -1828);
            hashMap.put("crimson", -2354116);
            hashMap.put("cyan", -16711681);
            hashMap.put("darkblue", -16777077);
            hashMap.put("darkcyan", -16741493);
            hashMap.put("darkgoldenrod", -4684277);
            hashMap.put("darkgray", -5658199);
            hashMap.put("darkgreen", -16751616);
            hashMap.put("darkgrey", -5658199);
            hashMap.put("darkkhaki", -4343957);
            hashMap.put("darkmagenta", -7667573);
            hashMap.put("darkolivegreen", -11179217);
            hashMap.put("darkorange", -29696);
            hashMap.put("darkorchid", -6737204);
            hashMap.put("darkred", -7667712);
            hashMap.put("darksalmon", -1468806);
            hashMap.put("darkseagreen", -7357297);
            hashMap.put("darkslateblue", -12042869);
            hashMap.put("darkslategray", -13676721);
            hashMap.put("darkslategrey", -13676721);
            hashMap.put("darkturquoise", -16724271);
            hashMap.put("darkviolet", -7077677);
            hashMap.put("deeppink", -60269);
            hashMap.put("deepskyblue", -16728065);
            hashMap.put("dimgray", -9868951);
            hashMap.put("dimgrey", -9868951);
            hashMap.put("dodgerblue", -14774017);
            hashMap.put("firebrick", -5103070);
            hashMap.put("floralwhite", -1296);
            hashMap.put("forestgreen", -14513374);
            hashMap.put("fuchsia", -65281);
            hashMap.put("gainsboro", -2302756);
            hashMap.put("ghostwhite", -460545);
            hashMap.put("gold", -10496);
            hashMap.put("goldenrod", -2448096);
            hashMap.put("gray", -8355712);
            hashMap.put("green", -16744448);
            hashMap.put("greenyellow", -5374161);
            hashMap.put("grey", -8355712);
            hashMap.put("honeydew", -983056);
            hashMap.put("hotpink", -38476);
            hashMap.put("indianred", -3318692);
            hashMap.put("indigo", -11861886);
            hashMap.put("ivory", -16);
            hashMap.put("khaki", -989556);
            hashMap.put("lavender", -1644806);
            hashMap.put("lavenderblush", -3851);
            hashMap.put("lawngreen", -8586240);
            hashMap.put("lemonchiffon", -1331);
            hashMap.put("lightblue", -5383962);
            hashMap.put("lightcoral", -1015680);
            hashMap.put("lightcyan", -2031617);
            hashMap.put("lightgoldenrodyellow", -329006);
            hashMap.put("lightgray", -2894893);
            hashMap.put("lightgreen", -7278960);
            hashMap.put("lightgrey", -2894893);
            hashMap.put("lightpink", -18751);
            hashMap.put("lightsalmon", -24454);
            hashMap.put("lightseagreen", -14634326);
            hashMap.put("lightskyblue", -7876870);
            hashMap.put("lightslategray", -8943463);
            hashMap.put("lightslategrey", -8943463);
            hashMap.put("lightsteelblue", -5192482);
            hashMap.put("lightyellow", -32);
            hashMap.put("lime", -16711936);
            hashMap.put("limegreen", -13447886);
            hashMap.put("linen", -331546);
            hashMap.put("magenta", -65281);
            hashMap.put("maroon", -8388608);
            hashMap.put("mediumaquamarine", -10039894);
            hashMap.put("mediumblue", -16777011);
            hashMap.put("mediumorchid", -4565549);
            hashMap.put("mediumpurple", -7114533);
            hashMap.put("mediumseagreen", -12799119);
            hashMap.put("mediumslateblue", -8689426);
            hashMap.put("mediumspringgreen", -16713062);
            hashMap.put("mediumturquoise", -12004916);
            hashMap.put("mediumvioletred", -3730043);
            hashMap.put("midnightblue", -15132304);
            hashMap.put("mintcream", -655366);
            hashMap.put("mistyrose", -6943);
            hashMap.put("moccasin", -6987);
            hashMap.put("navajowhite", -8531);
            hashMap.put("navy", -16777088);
            hashMap.put("oldlace", -133658);
            hashMap.put("olive", -8355840);
            hashMap.put("olivedrab", -9728477);
            hashMap.put("orange", -23296);
            hashMap.put("orangered", -47872);
            hashMap.put("orchid", -2461482);
            hashMap.put("palegoldenrod", -1120086);
            hashMap.put("palegreen", -6751336);
            hashMap.put("paleturquoise", -5247250);
            hashMap.put("palevioletred", -2396013);
            hashMap.put("papayawhip", -4139);
            hashMap.put("peachpuff", -9543);
            hashMap.put("peru", -3308225);
            hashMap.put("pink", -16181);
            hashMap.put("plum", -2252579);
            hashMap.put("powderblue", -5185306);
            hashMap.put("purple", -8388480);
            hashMap.put("rebeccapurple", -10079335);
            hashMap.put("red", Integer.valueOf((int) SupportMenu.CATEGORY_MASK));
            hashMap.put("rosybrown", -4419697);
            hashMap.put("royalblue", -12490271);
            hashMap.put("saddlebrown", -7650029);
            hashMap.put("salmon", -360334);
            hashMap.put("sandybrown", -744352);
            hashMap.put("seagreen", -13726889);
            hashMap.put("seashell", -2578);
            hashMap.put("sienna", -6270419);
            hashMap.put("silver", -4144960);
            hashMap.put("skyblue", -7876885);
            hashMap.put("slateblue", -9807155);
            hashMap.put("slategray", -9404272);
            hashMap.put("slategrey", -9404272);
            hashMap.put("snow", -1286);
            hashMap.put("springgreen", -16711809);
            hashMap.put("steelblue", -12156236);
            hashMap.put("tan", -2968436);
            hashMap.put("teal", -16744320);
            hashMap.put("thistle", -2572328);
            hashMap.put("tomato", -40121);
            hashMap.put("turquoise", -12525360);
            hashMap.put("violet", -1146130);
            hashMap.put("wheat", -663885);
            hashMap.put("white", -1);
            hashMap.put("whitesmoke", -657931);
            hashMap.put("yellow", Integer.valueOf((int) InputDeviceCompat.SOURCE_ANY));
            hashMap.put("yellowgreen", -6632142);
            hashMap.put(C21114v8.C21122h.f54047T, 0);
        }

        /* renamed from: a */
        static Integer m14763a(String str) {
            return f101615a.get(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SVGParser.java */
    /* renamed from: n0.l$d */
    /* loaded from: classes11.dex */
    public static class C38405d {

        /* renamed from: a */
        private static final Map<String, SVG.C38369p> f101616a;

        static {
            HashMap hashMap = new HashMap(9);
            f101616a = hashMap;
            SVG.EnumC38335d1 enumC38335d1 = SVG.EnumC38335d1.pt;
            hashMap.put("xx-small", new SVG.C38369p(0.694f, enumC38335d1));
            hashMap.put("x-small", new SVG.C38369p(0.833f, enumC38335d1));
            hashMap.put("small", new SVG.C38369p(10.0f, enumC38335d1));
            hashMap.put("medium", new SVG.C38369p(12.0f, enumC38335d1));
            hashMap.put("large", new SVG.C38369p(14.4f, enumC38335d1));
            hashMap.put("x-large", new SVG.C38369p(17.3f, enumC38335d1));
            hashMap.put("xx-large", new SVG.C38369p(20.7f, enumC38335d1));
            SVG.EnumC38335d1 enumC38335d12 = SVG.EnumC38335d1.percent;
            hashMap.put("smaller", new SVG.C38369p(83.33f, enumC38335d12));
            hashMap.put("larger", new SVG.C38369p(120.0f, enumC38335d12));
        }

        /* renamed from: a */
        static SVG.C38369p m14762a(String str) {
            return f101616a.get(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SVGParser.java */
    /* renamed from: n0.l$e */
    /* loaded from: classes11.dex */
    public static class C38406e {

        /* renamed from: a */
        private static final Map<String, Integer> f101617a;

        static {
            HashMap hashMap = new HashMap(13);
            f101617a = hashMap;
            hashMap.put("normal", 400);
            Integer valueOf = Integer.valueOf((int) IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED);
            hashMap.put("bold", valueOf);
            hashMap.put("bolder", 1);
            hashMap.put("lighter", -1);
            hashMap.put(StatisticData.ERROR_CODE_NOT_FOUND, 100);
            hashMap.put("200", 200);
            hashMap.put("300", 300);
            hashMap.put("400", 400);
            hashMap.put("500", 500);
            hashMap.put("600", 600);
            hashMap.put("700", valueOf);
            hashMap.put("800", 800);
            hashMap.put("900", 900);
        }

        /* renamed from: a */
        static Integer m14761a(String str) {
            return f101617a.get(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SVGParser.java */
    /* renamed from: n0.l$f */
    /* loaded from: classes11.dex */
    public class C38407f extends DefaultHandler2 {
        private C38407f() {
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void characters(char[] cArr, int i, int i2) throws SAXException {
            SVGParser.this.m14819c1(new String(cArr, i, i2));
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endDocument() throws SAXException {
            SVGParser.this.m14788o();
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endElement(String str, String str2, String str3) throws SAXException {
            SVGParser.this.m14786p(str, str2, str3);
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void processingInstruction(String str, String str2) throws SAXException {
            SVGParser.this.m14782r(str, SVGParser.this.m14769x0(new C38410i(str2)));
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startDocument() throws SAXException {
            SVGParser.this.m14834W0();
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
            SVGParser.this.m14832X0(str, str2, str3, attributes);
        }

        /* synthetic */ C38407f(SVGParser sVGParser, C38402a c38402a) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SVGParser.java */
    /* renamed from: n0.l$g */
    /* loaded from: classes11.dex */
    public enum EnumC38408g {
        CLASS,
        clip,
        clip_path,
        clipPathUnits,
        clip_rule,
        color,
        cx,
        cy,
        direction,
        dx,
        dy,
        fx,
        fy,
        d,
        display,
        fill,
        fill_rule,
        fill_opacity,
        font,
        font_family,
        font_size,
        font_weight,
        font_style,
        gradientTransform,
        gradientUnits,
        height,
        href,
        image_rendering,
        marker,
        marker_start,
        marker_mid,
        marker_end,
        markerHeight,
        markerUnits,
        markerWidth,
        mask,
        maskContentUnits,
        maskUnits,
        media,
        offset,
        opacity,
        orient,
        overflow,
        pathLength,
        patternContentUnits,
        patternTransform,
        patternUnits,
        points,
        preserveAspectRatio,
        r,
        refX,
        refY,
        requiredFeatures,
        requiredExtensions,
        requiredFormats,
        requiredFonts,
        rx,
        ry,
        solid_color,
        solid_opacity,
        spreadMethod,
        startOffset,
        stop_color,
        stop_opacity,
        stroke,
        stroke_dasharray,
        stroke_dashoffset,
        stroke_linecap,
        stroke_linejoin,
        stroke_miterlimit,
        stroke_opacity,
        stroke_width,
        style,
        systemLanguage,
        text_anchor,
        text_decoration,
        transform,
        type,
        vector_effect,
        version,
        viewBox,
        width,
        x,
        y,
        x1,
        y1,
        x2,
        y2,
        viewport_fill,
        viewport_fill_opacity,
        visibility,
        UNSUPPORTED;
        

        /* renamed from: Q0 */
        private static final Map<String, EnumC38408g> f101652Q0 = new HashMap();

        static {
            EnumC38408g[] values;
            for (EnumC38408g enumC38408g : values()) {
                if (enumC38408g == CLASS) {
                    f101652Q0.put(C26484a.f69235r, enumC38408g);
                } else if (enumC38408g != UNSUPPORTED) {
                    f101652Q0.put(enumC38408g.name().replace('_', '-'), enumC38408g);
                }
            }
        }

        /* renamed from: b */
        public static EnumC38408g m14760b(String str) {
            EnumC38408g enumC38408g = f101652Q0.get(str);
            if (enumC38408g != null) {
                return enumC38408g;
            }
            return UNSUPPORTED;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SVGParser.java */
    /* renamed from: n0.l$h */
    /* loaded from: classes11.dex */
    public enum EnumC38409h {
        svg,
        a,
        circle,
        clipPath,
        defs,
        desc,
        ellipse,
        g,
        image,
        line,
        linearGradient,
        marker,
        mask,
        path,
        pattern,
        polygon,
        polyline,
        radialGradient,
        rect,
        solidColor,
        stop,
        style,
        SWITCH,
        symbol,
        text,
        textPath,
        title,
        tref,
        tspan,
        use,
        view,
        UNSUPPORTED;
        

        /* renamed from: I */
        private static final Map<String, EnumC38409h> f101721I = new HashMap();

        static {
            EnumC38409h[] values;
            for (EnumC38409h enumC38409h : values()) {
                if (enumC38409h == SWITCH) {
                    f101721I.put("switch", enumC38409h);
                } else if (enumC38409h != UNSUPPORTED) {
                    f101721I.put(enumC38409h.name(), enumC38409h);
                }
            }
        }

        /* renamed from: b */
        public static EnumC38409h m14759b(String str) {
            EnumC38409h enumC38409h = f101721I.get(str);
            if (enumC38409h != null) {
                return enumC38409h;
            }
            return UNSUPPORTED;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SVGParser.java */
    /* renamed from: n0.l$i */
    /* loaded from: classes11.dex */
    public static class C38410i {

        /* renamed from: a */
        String f101747a;

        /* renamed from: c */
        int f101749c;

        /* renamed from: b */
        int f101748b = 0;

        /* renamed from: d */
        private NumberParser f101750d = new NumberParser();

        /* JADX INFO: Access modifiers changed from: package-private */
        public C38410i(String str) {
            this.f101749c = 0;
            String trim = str.trim();
            this.f101747a = trim;
            this.f101749c = trim.length();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: A */
        public void m14758A() {
            while (true) {
                int i = this.f101748b;
                if (i < this.f101749c && m14747k(this.f101747a.charAt(i))) {
                    this.f101748b++;
                } else {
                    return;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public int m14757a() {
            int i = this.f101748b;
            int i2 = this.f101749c;
            if (i == i2) {
                return -1;
            }
            int i3 = i + 1;
            this.f101748b = i3;
            if (i3 >= i2) {
                return -1;
            }
            return this.f101747a.charAt(i3);
        }

        /* renamed from: b */
        String m14756b() {
            int i = this.f101748b;
            while (!m14750h() && !m14747k(this.f101747a.charAt(this.f101748b))) {
                this.f101748b++;
            }
            String substring = this.f101747a.substring(i, this.f101748b);
            this.f101748b = i;
            return substring;
        }

        /* renamed from: c */
        Boolean m14755c(Object obj) {
            if (obj == null) {
                return null;
            }
            m14732z();
            return m14745m();
        }

        /* renamed from: d */
        float m14754d(float f) {
            if (Float.isNaN(f)) {
                return Float.NaN;
            }
            m14732z();
            return m14744n();
        }

        /* renamed from: e */
        float m14753e(Boolean bool) {
            if (bool == null) {
                return Float.NaN;
            }
            m14732z();
            return m14744n();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: f */
        public boolean m14752f(char c) {
            boolean z;
            int i = this.f101748b;
            if (i < this.f101749c && this.f101747a.charAt(i) == c) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f101748b++;
            }
            return z;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: g */
        public boolean m14751g(String str) {
            boolean z;
            int length = str.length();
            int i = this.f101748b;
            if (i <= this.f101749c - length && this.f101747a.substring(i, i + length).equals(str)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f101748b += length;
            }
            return z;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: h */
        public boolean m14750h() {
            if (this.f101748b == this.f101749c) {
                return true;
            }
            return false;
        }

        /* renamed from: i */
        boolean m14749i() {
            int i = this.f101748b;
            if (i == this.f101749c) {
                return false;
            }
            char charAt = this.f101747a.charAt(i);
            if ((charAt < 'a' || charAt > 'z') && (charAt < 'A' || charAt > 'Z')) {
                return false;
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: j */
        public boolean m14748j(int i) {
            if (i != 10 && i != 13) {
                return false;
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: k */
        public boolean m14747k(int i) {
            if (i != 32 && i != 10 && i != 13 && i != 9) {
                return false;
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: l */
        public Integer m14746l() {
            int i = this.f101748b;
            if (i == this.f101749c) {
                return null;
            }
            String str = this.f101747a;
            this.f101748b = i + 1;
            return Integer.valueOf(str.charAt(i));
        }

        /* renamed from: m */
        Boolean m14745m() {
            int i = this.f101748b;
            if (i == this.f101749c) {
                return null;
            }
            char charAt = this.f101747a.charAt(i);
            if (charAt != '0' && charAt != '1') {
                return null;
            }
            boolean z = true;
            this.f101748b++;
            if (charAt != '1') {
                z = false;
            }
            return Boolean.valueOf(z);
        }

        /* renamed from: n */
        float m14744n() {
            float m15050b = this.f101750d.m15050b(this.f101747a, this.f101748b, this.f101749c);
            if (!Float.isNaN(m15050b)) {
                this.f101748b = this.f101750d.m15051a();
            }
            return m15050b;
        }

        /* renamed from: o */
        String m14743o() {
            if (m14750h()) {
                return null;
            }
            int i = this.f101748b;
            int charAt = this.f101747a.charAt(i);
            while (true) {
                if ((charAt < 97 || charAt > 122) && (charAt < 65 || charAt > 90)) {
                    break;
                }
                charAt = m14757a();
            }
            int i2 = this.f101748b;
            while (m14747k(charAt)) {
                charAt = m14757a();
            }
            if (charAt == 40) {
                this.f101748b++;
                return this.f101747a.substring(i, i2);
            }
            this.f101748b = i;
            return null;
        }

        /* renamed from: p */
        SVG.C38369p m14742p() {
            float m14744n = m14744n();
            if (Float.isNaN(m14744n)) {
                return null;
            }
            SVG.EnumC38335d1 m14736v = m14736v();
            if (m14736v == null) {
                return new SVG.C38369p(m14744n, SVG.EnumC38335d1.px);
            }
            return new SVG.C38369p(m14744n, m14736v);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: q */
        public String m14741q() {
            if (m14750h()) {
                return null;
            }
            int i = this.f101748b;
            char charAt = this.f101747a.charAt(i);
            if (charAt != '\'' && charAt != '\"') {
                return null;
            }
            int m14757a = m14757a();
            while (m14757a != -1 && m14757a != charAt) {
                m14757a = m14757a();
            }
            if (m14757a == -1) {
                this.f101748b = i;
                return null;
            }
            int i2 = this.f101748b + 1;
            this.f101748b = i2;
            return this.f101747a.substring(i + 1, i2 - 1);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: r */
        public String m14740r() {
            return m14738t(' ', false);
        }

        /* renamed from: s */
        String m14739s(char c) {
            return m14738t(c, false);
        }

        /* renamed from: t */
        String m14738t(char c, boolean z) {
            if (m14750h()) {
                return null;
            }
            char charAt = this.f101747a.charAt(this.f101748b);
            if ((!z && m14747k(charAt)) || charAt == c) {
                return null;
            }
            int i = this.f101748b;
            int m14757a = m14757a();
            while (m14757a != -1 && m14757a != c && (z || !m14747k(m14757a))) {
                m14757a = m14757a();
            }
            return this.f101747a.substring(i, this.f101748b);
        }

        /* renamed from: u */
        String m14737u(char c) {
            return m14738t(c, true);
        }

        /* renamed from: v */
        SVG.EnumC38335d1 m14736v() {
            if (m14750h()) {
                return null;
            }
            if (this.f101747a.charAt(this.f101748b) == '%') {
                this.f101748b++;
                return SVG.EnumC38335d1.percent;
            }
            int i = this.f101748b;
            if (i > this.f101749c - 2) {
                return null;
            }
            try {
                SVG.EnumC38335d1 valueOf = SVG.EnumC38335d1.valueOf(this.f101747a.substring(i, i + 2).toLowerCase(Locale.US));
                this.f101748b += 2;
                return valueOf;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: w */
        public String m14735w() {
            if (m14750h()) {
                return null;
            }
            int i = this.f101748b;
            char charAt = this.f101747a.charAt(i);
            if ((charAt >= 'A' && charAt <= 'Z') || (charAt >= 'a' && charAt <= 'z')) {
                int m14757a = m14757a();
                while (true) {
                    if ((m14757a < 65 || m14757a > 90) && (m14757a < 97 || m14757a > 122)) {
                        break;
                    }
                    m14757a = m14757a();
                }
                return this.f101747a.substring(i, this.f101748b);
            }
            this.f101748b = i;
            return null;
        }

        /* renamed from: x */
        float m14734x() {
            m14732z();
            float m15050b = this.f101750d.m15050b(this.f101747a, this.f101748b, this.f101749c);
            if (!Float.isNaN(m15050b)) {
                this.f101748b = this.f101750d.m15051a();
            }
            return m15050b;
        }

        /* renamed from: y */
        String m14733y() {
            if (m14750h()) {
                return null;
            }
            int i = this.f101748b;
            this.f101748b = this.f101749c;
            return this.f101747a.substring(i);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: z */
        public boolean m14732z() {
            m14758A();
            int i = this.f101748b;
            if (i == this.f101749c || this.f101747a.charAt(i) != ',') {
                return false;
            }
            this.f101748b++;
            m14758A();
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SVGParser.java */
    /* renamed from: n0.l$j */
    /* loaded from: classes11.dex */
    public class C38411j implements Attributes {

        /* renamed from: a */
        private XmlPullParser f101751a;

        public C38411j(XmlPullParser xmlPullParser) {
            this.f101751a = xmlPullParser;
        }

        @Override // org.xml.sax.Attributes
        public int getIndex(String str) {
            return -1;
        }

        @Override // org.xml.sax.Attributes
        public int getLength() {
            return this.f101751a.getAttributeCount();
        }

        @Override // org.xml.sax.Attributes
        public String getLocalName(int i) {
            return this.f101751a.getAttributeName(i);
        }

        @Override // org.xml.sax.Attributes
        public String getQName(int i) {
            String attributeName = this.f101751a.getAttributeName(i);
            if (this.f101751a.getAttributePrefix(i) != null) {
                return this.f101751a.getAttributePrefix(i) + ':' + attributeName;
            }
            return attributeName;
        }

        @Override // org.xml.sax.Attributes
        public String getType(int i) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getURI(int i) {
            return this.f101751a.getAttributeNamespace(i);
        }

        @Override // org.xml.sax.Attributes
        public String getValue(String str) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public int getIndex(String str, String str2) {
            return -1;
        }

        @Override // org.xml.sax.Attributes
        public String getType(String str) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getValue(String str, String str2) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getType(String str, String str2) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getValue(int i) {
            return this.f101751a.getAttributeValue(i);
        }
    }

    /* renamed from: A */
    private void m14879A(SVG.C38333d c38333d, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch (C38402a.f101613b[EnumC38408g.m14760b(attributes.getLocalName(i)).ordinal()]) {
                case 12:
                    c38333d.f101351o = m14787o0(trim);
                    break;
                case 13:
                    c38333d.f101352p = m14787o0(trim);
                    break;
                case 14:
                    SVG.C38369p m14787o0 = m14787o0(trim);
                    c38333d.f101353q = m14787o0;
                    if (m14787o0.m15000h()) {
                        throw new SVGParseException("Invalid <circle> element. r cannot be negative");
                    }
                    break;
            }
        }
    }

    /* renamed from: A0 */
    private static Set<String> m14878A0(String str) {
        C38410i c38410i = new C38410i(str);
        HashSet hashSet = new HashSet();
        while (!c38410i.m14750h()) {
            hashSet.add(c38410i.m14740r());
            c38410i.m14758A();
        }
        return hashSet;
    }

    /* renamed from: B */
    private void m14877B(SVG.C38336e c38336e, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            if (C38402a.f101613b[EnumC38408g.m14760b(attributes.getLocalName(i)).ordinal()] == 38) {
                if ("objectBoundingBox".equals(trim)) {
                    c38336e.f101365p = Boolean.FALSE;
                } else if ("userSpaceOnUse".equals(trim)) {
                    c38336e.f101365p = Boolean.TRUE;
                } else {
                    throw new SVGParseException("Invalid value for attribute clipPathUnits");
                }
            }
        }
    }

    /* renamed from: B0 */
    private static SVG.C38369p[] m14876B0(String str) {
        SVG.C38369p m14742p;
        C38410i c38410i = new C38410i(str);
        c38410i.m14758A();
        if (c38410i.m14750h() || (m14742p = c38410i.m14742p()) == null || m14742p.m15000h()) {
            return null;
        }
        float m15006b = m14742p.m15006b();
        ArrayList arrayList = new ArrayList();
        arrayList.add(m14742p);
        while (!c38410i.m14750h()) {
            c38410i.m14732z();
            SVG.C38369p m14742p2 = c38410i.m14742p();
            if (m14742p2 == null || m14742p2.m15000h()) {
                return null;
            }
            arrayList.add(m14742p2);
            m15006b += m14742p2.m15006b();
        }
        if (m15006b == 0.0f) {
            return null;
        }
        return (SVG.C38369p[]) arrayList.toArray(new SVG.C38369p[arrayList.size()]);
    }

    /* renamed from: C */
    private void m14875C(SVG.InterfaceC38352g0 interfaceC38352g0, Attributes attributes) throws SVGParseException {
        HashSet hashSet;
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch (C38402a.f101613b[EnumC38408g.m14760b(attributes.getLocalName(i)).ordinal()]) {
                case 21:
                    interfaceC38352g0.setRequiredFeatures(m14765z0(trim));
                    break;
                case 22:
                    interfaceC38352g0.setRequiredExtensions(trim);
                    break;
                case 23:
                    interfaceC38352g0.setSystemLanguage(m14868F0(trim));
                    break;
                case 24:
                    interfaceC38352g0.setRequiredFormats(m14878A0(trim));
                    break;
                case 25:
                    List<String> m14802i0 = m14802i0(trim);
                    if (m14802i0 != null) {
                        hashSet = new HashSet(m14802i0);
                    } else {
                        hashSet = new HashSet(0);
                    }
                    interfaceC38352g0.setRequiredFonts(hashSet);
                    break;
            }
        }
    }

    /* renamed from: C0 */
    private static SVG.C38337e0.EnumC38340c m14874C0(String str) {
        if ("butt".equals(str)) {
            return SVG.C38337e0.EnumC38340c.Butt;
        }
        if ("round".equals(str)) {
            return SVG.C38337e0.EnumC38340c.Round;
        }
        if ("square".equals(str)) {
            return SVG.C38337e0.EnumC38340c.Square;
        }
        return null;
    }

    /* renamed from: D */
    private void m14873D(SVG.AbstractC38362l0 abstractC38362l0, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String qName = attributes.getQName(i);
            if (!qName.equals("id") && !qName.equals("xml:id")) {
                if (qName.equals("xml:space")) {
                    String trim = attributes.getValue(i).trim();
                    if ("default".equals(trim)) {
                        abstractC38362l0.f101481d = Boolean.FALSE;
                        return;
                    } else if ("preserve".equals(trim)) {
                        abstractC38362l0.f101481d = Boolean.TRUE;
                        return;
                    } else {
                        throw new SVGParseException("Invalid value for \"xml:space\" attribute: " + trim);
                    }
                }
            } else {
                abstractC38362l0.f101480c = attributes.getValue(i).trim();
                return;
            }
        }
    }

    /* renamed from: D0 */
    private static SVG.C38337e0.EnumC38341d m14872D0(String str) {
        if ("miter".equals(str)) {
            return SVG.C38337e0.EnumC38341d.Miter;
        }
        if ("round".equals(str)) {
            return SVG.C38337e0.EnumC38341d.Round;
        }
        if ("bevel".equals(str)) {
            return SVG.C38337e0.EnumC38341d.Bevel;
        }
        return null;
    }

    /* renamed from: E */
    private void m14871E(SVG.C38355i c38355i, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch (C38402a.f101613b[EnumC38408g.m14760b(attributes.getLocalName(i)).ordinal()]) {
                case 10:
                    SVG.C38369p m14787o0 = m14787o0(trim);
                    c38355i.f101462q = m14787o0;
                    if (m14787o0.m15000h()) {
                        throw new SVGParseException("Invalid <ellipse> element. rx cannot be negative");
                    }
                    break;
                case 11:
                    SVG.C38369p m14787o02 = m14787o0(trim);
                    c38355i.f101463r = m14787o02;
                    if (m14787o02.m15000h()) {
                        throw new SVGParseException("Invalid <ellipse> element. ry cannot be negative");
                    }
                    break;
                case 12:
                    c38355i.f101460o = m14787o0(trim);
                    break;
                case 13:
                    c38355i.f101461p = m14787o0(trim);
                    break;
            }
        }
    }

    /* renamed from: E0 */
    private static void m14870E0(SVG.AbstractC38362l0 abstractC38362l0, String str) {
        C38410i c38410i = new C38410i(str.replaceAll("/\\*.*?\\*/", ""));
        while (true) {
            String m14739s = c38410i.m14739s(':');
            c38410i.m14758A();
            if (c38410i.m14752f(':')) {
                c38410i.m14758A();
                String m14737u = c38410i.m14737u(';');
                if (m14737u == null) {
                    return;
                }
                c38410i.m14758A();
                if (c38410i.m14750h() || c38410i.m14752f(';')) {
                    if (abstractC38362l0.f101483f == null) {
                        abstractC38362l0.f101483f = new SVG.C38337e0();
                    }
                    m14842S0(abstractC38362l0.f101483f, m14739s, m14737u);
                    c38410i.m14758A();
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x008c, code lost:
        continue;
     */
    /* renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m14869F(p793n0.SVG.AbstractC38357j r5, org.xml.sax.Attributes r6) throws p793n0.SVGParseException {
        /*
            r4 = this;
            r0 = 0
        L1:
            int r1 = r6.getLength()
            if (r0 >= r1) goto L90
            java.lang.String r1 = r6.getValue(r0)
            java.lang.String r1 = r1.trim()
            int[] r2 = p793n0.SVGParser.C38402a.f101613b
            java.lang.String r3 = r6.getLocalName(r0)
            n0.l$g r3 = p793n0.SVGParser.EnumC38408g.m14760b(r3)
            int r3 = r3.ordinal()
            r2 = r2[r3]
            r3 = 6
            if (r2 == r3) goto L72
            switch(r2) {
                case 32: goto L50;
                case 33: goto L49;
                case 34: goto L26;
                default: goto L25;
            }
        L25:
            goto L8c
        L26:
            n0.h$k r2 = p793n0.SVG.EnumC38359k.valueOf(r1)     // Catch: java.lang.IllegalArgumentException -> L2d
            r5.f101472k = r2     // Catch: java.lang.IllegalArgumentException -> L2d
            goto L8c
        L2d:
            n0.k r5 = new n0.k
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "Invalid spreadMethod attribute. \""
            r6.append(r0)
            r6.append(r1)
            java.lang.String r0 = "\" is not a valid value."
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L49:
            android.graphics.Matrix r1 = r4.m14860J0(r1)
            r5.f101471j = r1
            goto L8c
        L50:
            java.lang.String r2 = "objectBoundingBox"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L5d
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r5.f101470i = r1
            goto L8c
        L5d:
            java.lang.String r2 = "userSpaceOnUse"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L6a
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r5.f101470i = r1
            goto L8c
        L6a:
            n0.k r5 = new n0.k
            java.lang.String r6 = "Invalid value for attribute gradientUnits"
            r5.<init>(r6)
            throw r5
        L72:
            java.lang.String r2 = ""
            java.lang.String r3 = r6.getURI(r0)
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L8a
            java.lang.String r2 = "http://www.w3.org/1999/xlink"
            java.lang.String r3 = r6.getURI(r0)
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L8c
        L8a:
            r5.f101473l = r1
        L8c:
            int r0 = r0 + 1
            goto L1
        L90:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p793n0.SVGParser.m14869F(n0.h$j, org.xml.sax.Attributes):void");
    }

    /* renamed from: F0 */
    private static Set<String> m14868F0(String str) {
        C38410i c38410i = new C38410i(str);
        HashSet hashSet = new HashSet();
        while (!c38410i.m14750h()) {
            String m14740r = c38410i.m14740r();
            int indexOf = m14740r.indexOf(45);
            if (indexOf != -1) {
                m14740r = m14740r.substring(0, indexOf);
            }
            hashSet.add(new Locale(m14740r, "", "").getLanguage());
            c38410i.m14758A();
        }
        return hashSet;
    }

    /* renamed from: G */
    private void m14867G(SVG.C38367o c38367o, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int i2 = C38402a.f101613b[EnumC38408g.m14760b(attributes.getLocalName(i)).ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 != 6) {
                                if (i2 == 7) {
                                    m14771w0(c38367o, trim);
                                }
                            } else if ("".equals(attributes.getURI(i)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i))) {
                                c38367o.f101492p = trim;
                            }
                        } else {
                            SVG.C38369p m14787o0 = m14787o0(trim);
                            c38367o.f101496t = m14787o0;
                            if (m14787o0.m15000h()) {
                                throw new SVGParseException("Invalid <use> element. height cannot be negative");
                            }
                        }
                    } else {
                        SVG.C38369p m14787o02 = m14787o0(trim);
                        c38367o.f101495s = m14787o02;
                        if (m14787o02.m15000h()) {
                            throw new SVGParseException("Invalid <use> element. width cannot be negative");
                        }
                    }
                } else {
                    c38367o.f101494r = m14787o0(trim);
                }
            } else {
                c38367o.f101493q = m14787o0(trim);
            }
        }
    }

    /* renamed from: G0 */
    private static SVG.C38337e0.EnumC38343f m14866G0(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1074341483:
                if (str.equals("middle")) {
                    c = 0;
                    break;
                }
                break;
            case 100571:
                if (str.equals("end")) {
                    c = 1;
                    break;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return SVG.C38337e0.EnumC38343f.Middle;
            case 1:
                return SVG.C38337e0.EnumC38343f.End;
            case 2:
                return SVG.C38337e0.EnumC38343f.Start;
            default:
                return null;
        }
    }

    /* renamed from: H */
    private void m14865H(SVG.C38371q c38371q, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch (C38402a.f101613b[EnumC38408g.m14760b(attributes.getLocalName(i)).ordinal()]) {
                case 15:
                    c38371q.f101501o = m14787o0(trim);
                    break;
                case 16:
                    c38371q.f101502p = m14787o0(trim);
                    break;
                case 17:
                    c38371q.f101503q = m14787o0(trim);
                    break;
                case 18:
                    c38371q.f101504r = m14787o0(trim);
                    break;
            }
        }
    }

    /* renamed from: H0 */
    private static SVG.C38337e0.EnumC38344g m14864H0(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1171789332:
                if (str.equals("line-through")) {
                    c = 0;
                    break;
                }
                break;
            case -1026963764:
                if (str.equals("underline")) {
                    c = 1;
                    break;
                }
                break;
            case 3387192:
                if (str.equals("none")) {
                    c = 2;
                    break;
                }
                break;
            case 93826908:
                if (str.equals("blink")) {
                    c = 3;
                    break;
                }
                break;
            case 529818312:
                if (str.equals("overline")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return SVG.C38337e0.EnumC38344g.LineThrough;
            case 1:
                return SVG.C38337e0.EnumC38344g.Underline;
            case 2:
                return SVG.C38337e0.EnumC38344g.None;
            case 3:
                return SVG.C38337e0.EnumC38344g.Blink;
            case 4:
                return SVG.C38337e0.EnumC38344g.Overline;
            default:
                return null;
        }
    }

    /* renamed from: I */
    private void m14863I(SVG.C38364m0 c38364m0, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch (C38402a.f101613b[EnumC38408g.m14760b(attributes.getLocalName(i)).ordinal()]) {
                case 15:
                    c38364m0.f101486m = m14787o0(trim);
                    break;
                case 16:
                    c38364m0.f101487n = m14787o0(trim);
                    break;
                case 17:
                    c38364m0.f101488o = m14787o0(trim);
                    break;
                case 18:
                    c38364m0.f101489p = m14787o0(trim);
                    break;
            }
        }
    }

    /* renamed from: I0 */
    private static SVG.C38337e0.EnumC38345h m14862I0(String str) {
        str.hashCode();
        if (!str.equals("ltr")) {
            if (!str.equals("rtl")) {
                return null;
            }
            return SVG.C38337e0.EnumC38345h.RTL;
        }
        return SVG.C38337e0.EnumC38345h.LTR;
    }

    /* renamed from: J */
    private void m14861J(SVG.C38373r c38373r, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch (C38402a.f101613b[EnumC38408g.m14760b(attributes.getLocalName(i)).ordinal()]) {
                case 26:
                    c38373r.f101511r = m14787o0(trim);
                    break;
                case 27:
                    c38373r.f101512s = m14787o0(trim);
                    break;
                case 28:
                    SVG.C38369p m14787o0 = m14787o0(trim);
                    c38373r.f101513t = m14787o0;
                    if (m14787o0.m15000h()) {
                        throw new SVGParseException("Invalid <marker> element. markerWidth cannot be negative");
                    }
                    break;
                case 29:
                    SVG.C38369p m14787o02 = m14787o0(trim);
                    c38373r.f101514u = m14787o02;
                    if (m14787o02.m15000h()) {
                        throw new SVGParseException("Invalid <marker> element. markerHeight cannot be negative");
                    }
                    break;
                case 30:
                    if ("strokeWidth".equals(trim)) {
                        c38373r.f101510q = false;
                        break;
                    } else if ("userSpaceOnUse".equals(trim)) {
                        c38373r.f101510q = true;
                        break;
                    } else {
                        throw new SVGParseException("Invalid value for attribute markerUnits");
                    }
                case 31:
                    if ("auto".equals(trim)) {
                        c38373r.f101515v = Float.valueOf(Float.NaN);
                        break;
                    } else {
                        c38373r.f101515v = Float.valueOf(m14811f0(trim));
                        break;
                    }
            }
        }
    }

    /* renamed from: J0 */
    private Matrix m14860J0(String str) throws SVGParseException {
        Matrix matrix = new Matrix();
        C38410i c38410i = new C38410i(str);
        c38410i.m14758A();
        while (!c38410i.m14750h()) {
            String m14743o = c38410i.m14743o();
            if (m14743o != null) {
                char c = 65535;
                switch (m14743o.hashCode()) {
                    case -1081239615:
                        if (m14743o.equals("matrix")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -925180581:
                        if (m14743o.equals("rotate")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 109250890:
                        if (m14743o.equals("scale")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 109493390:
                        if (m14743o.equals("skewX")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 109493391:
                        if (m14743o.equals("skewY")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 1052832078:
                        if (m14743o.equals("translate")) {
                            c = 5;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        c38410i.m14758A();
                        float m14744n = c38410i.m14744n();
                        c38410i.m14732z();
                        float m14744n2 = c38410i.m14744n();
                        c38410i.m14732z();
                        float m14744n3 = c38410i.m14744n();
                        c38410i.m14732z();
                        float m14744n4 = c38410i.m14744n();
                        c38410i.m14732z();
                        float m14744n5 = c38410i.m14744n();
                        c38410i.m14732z();
                        float m14744n6 = c38410i.m14744n();
                        c38410i.m14758A();
                        if (!Float.isNaN(m14744n6) && c38410i.m14752f(')')) {
                            Matrix matrix2 = new Matrix();
                            matrix2.setValues(new float[]{m14744n, m14744n3, m14744n5, m14744n2, m14744n4, m14744n6, 0.0f, 0.0f, 1.0f});
                            matrix.preConcat(matrix2);
                            break;
                        } else {
                            throw new SVGParseException("Invalid transform list: " + str);
                        }
                        break;
                    case 1:
                        c38410i.m14758A();
                        float m14744n7 = c38410i.m14744n();
                        float m14734x = c38410i.m14734x();
                        float m14734x2 = c38410i.m14734x();
                        c38410i.m14758A();
                        if (!Float.isNaN(m14744n7) && c38410i.m14752f(')')) {
                            if (Float.isNaN(m14734x)) {
                                matrix.preRotate(m14744n7);
                                break;
                            } else if (!Float.isNaN(m14734x2)) {
                                matrix.preRotate(m14744n7, m14734x, m14734x2);
                                break;
                            } else {
                                throw new SVGParseException("Invalid transform list: " + str);
                            }
                        } else {
                            throw new SVGParseException("Invalid transform list: " + str);
                        }
                    case 2:
                        c38410i.m14758A();
                        float m14744n8 = c38410i.m14744n();
                        float m14734x3 = c38410i.m14734x();
                        c38410i.m14758A();
                        if (!Float.isNaN(m14744n8) && c38410i.m14752f(')')) {
                            if (Float.isNaN(m14734x3)) {
                                matrix.preScale(m14744n8, m14744n8);
                                break;
                            } else {
                                matrix.preScale(m14744n8, m14734x3);
                                break;
                            }
                        } else {
                            throw new SVGParseException("Invalid transform list: " + str);
                        }
                        break;
                    case 3:
                        c38410i.m14758A();
                        float m14744n9 = c38410i.m14744n();
                        c38410i.m14758A();
                        if (!Float.isNaN(m14744n9) && c38410i.m14752f(')')) {
                            matrix.preSkew((float) Math.tan(Math.toRadians(m14744n9)), 0.0f);
                            break;
                        } else {
                            throw new SVGParseException("Invalid transform list: " + str);
                        }
                        break;
                    case 4:
                        c38410i.m14758A();
                        float m14744n10 = c38410i.m14744n();
                        c38410i.m14758A();
                        if (!Float.isNaN(m14744n10) && c38410i.m14752f(')')) {
                            matrix.preSkew(0.0f, (float) Math.tan(Math.toRadians(m14744n10)));
                            break;
                        } else {
                            throw new SVGParseException("Invalid transform list: " + str);
                        }
                    case 5:
                        c38410i.m14758A();
                        float m14744n11 = c38410i.m14744n();
                        float m14734x4 = c38410i.m14734x();
                        c38410i.m14758A();
                        if (!Float.isNaN(m14744n11) && c38410i.m14752f(')')) {
                            if (Float.isNaN(m14734x4)) {
                                matrix.preTranslate(m14744n11, 0.0f);
                                break;
                            } else {
                                matrix.preTranslate(m14744n11, m14734x4);
                                break;
                            }
                        } else {
                            throw new SVGParseException("Invalid transform list: " + str);
                        }
                        break;
                    default:
                        throw new SVGParseException("Invalid transform list fn: " + m14743o + ")");
                }
                if (!c38410i.m14750h()) {
                    c38410i.m14732z();
                } else {
                    return matrix;
                }
            } else {
                throw new SVGParseException("Bad transform function encountered in transform list: " + str);
            }
        }
        return matrix;
    }

    /* renamed from: K */
    private void m14859K(SVG.C38375s c38375s, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int i2 = C38402a.f101613b[EnumC38408g.m14760b(attributes.getLocalName(i)).ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 != 43) {
                                if (i2 != 44) {
                                    continue;
                                } else if ("objectBoundingBox".equals(trim)) {
                                    c38375s.f101518p = Boolean.FALSE;
                                } else if ("userSpaceOnUse".equals(trim)) {
                                    c38375s.f101518p = Boolean.TRUE;
                                } else {
                                    throw new SVGParseException("Invalid value for attribute maskContentUnits");
                                }
                            } else if ("objectBoundingBox".equals(trim)) {
                                c38375s.f101517o = Boolean.FALSE;
                            } else if ("userSpaceOnUse".equals(trim)) {
                                c38375s.f101517o = Boolean.TRUE;
                            } else {
                                throw new SVGParseException("Invalid value for attribute maskUnits");
                            }
                        } else {
                            SVG.C38369p m14787o0 = m14787o0(trim);
                            c38375s.f101522t = m14787o0;
                            if (m14787o0.m15000h()) {
                                throw new SVGParseException("Invalid <mask> element. height cannot be negative");
                            }
                        }
                    } else {
                        SVG.C38369p m14787o02 = m14787o0(trim);
                        c38375s.f101521s = m14787o02;
                        if (m14787o02.m15000h()) {
                            throw new SVGParseException("Invalid <mask> element. width cannot be negative");
                        }
                    }
                } else {
                    c38375s.f101520r = m14787o0(trim);
                }
            } else {
                c38375s.f101519q = m14787o0(trim);
            }
        }
    }

    /* renamed from: K0 */
    private void m14858K0(InputStream inputStream) throws SVGParseException {
        Log.d("SVGParser", "Falling back to SAX parser");
        try {
            SAXParserFactory newInstance = SAXParserFactory.newInstance();
            newInstance.setFeature("http://xml.org/sax/features/external-general-entities", false);
            newInstance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            XMLReader xMLReader = newInstance.newSAXParser().getXMLReader();
            C38407f c38407f = new C38407f(this, null);
            xMLReader.setContentHandler(c38407f);
            xMLReader.setProperty("http://xml.org/sax/properties/lexical-handler", c38407f);
            xMLReader.parse(new InputSource(inputStream));
        } catch (IOException e) {
            throw new SVGParseException("Stream error", e);
        } catch (ParserConfigurationException e2) {
            throw new SVGParseException("XML parser problem", e2);
        } catch (SAXException e3) {
            throw new SVGParseException("SVG parse error", e3);
        }
    }

    /* renamed from: L */
    private void m14857L(SVG.C38381v c38381v, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int i2 = C38402a.f101613b[EnumC38408g.m14760b(attributes.getLocalName(i)).ordinal()];
            if (i2 != 8) {
                if (i2 != 9) {
                    continue;
                } else {
                    Float valueOf = Float.valueOf(m14811f0(trim));
                    c38381v.f101528p = valueOf;
                    if (valueOf.floatValue() < 0.0f) {
                        throw new SVGParseException("Invalid <path> element. pathLength cannot be negative");
                    }
                }
            } else {
                c38381v.f101527o = m14775u0(trim);
            }
        }
    }

    /* renamed from: L0 */
    private void m14856L0(InputStream inputStream, boolean z) throws SVGParseException {
        try {
            try {
                XmlPullParser newPullParser = Xml.newPullParser();
                C38411j c38411j = new C38411j(newPullParser);
                newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-docdecl", false);
                newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
                newPullParser.setInput(inputStream, null);
                for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.nextToken()) {
                    if (eventType != 0) {
                        if (eventType != 8) {
                            if (eventType != 10) {
                                if (eventType != 2) {
                                    if (eventType != 3) {
                                        if (eventType != 4) {
                                            if (eventType == 5) {
                                                m14819c1(newPullParser.getText());
                                            }
                                        } else {
                                            int[] iArr = new int[2];
                                            m14813e1(newPullParser.getTextCharacters(iArr), iArr[0], iArr[1]);
                                        }
                                    } else {
                                        String name = newPullParser.getName();
                                        if (newPullParser.getPrefix() != null) {
                                            name = newPullParser.getPrefix() + ':' + name;
                                        }
                                        m14786p(newPullParser.getNamespace(), newPullParser.getName(), name);
                                    }
                                } else {
                                    String name2 = newPullParser.getName();
                                    if (newPullParser.getPrefix() != null) {
                                        name2 = newPullParser.getPrefix() + ':' + name2;
                                    }
                                    m14832X0(newPullParser.getNamespace(), newPullParser.getName(), name2, c38411j);
                                }
                            } else if (z && this.f101603a.m15024p() == null && newPullParser.getText().contains("<!ENTITY ")) {
                                try {
                                    Log.d("SVGParser", "Switching to SAX parser to process entities");
                                    inputStream.reset();
                                    m14858K0(inputStream);
                                    return;
                                } catch (IOException unused) {
                                    Log.w("SVGParser", "Detected internal entity definitions, but could not parse them.");
                                    return;
                                }
                            }
                        } else {
                            Log.d("SVGParser", "PROC INSTR: " + newPullParser.getText());
                            C38410i c38410i = new C38410i(newPullParser.getText());
                            m14782r(c38410i.m14740r(), m14769x0(c38410i));
                        }
                    } else {
                        m14834W0();
                    }
                }
                m14788o();
            } catch (XmlPullParserException e) {
                throw new SVGParseException("XML parser problem", e);
            }
        } catch (IOException e2) {
            throw new SVGParseException("Stream error", e2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00cf, code lost:
        continue;
     */
    /* renamed from: M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m14855M(p793n0.SVG.C38387y r6, org.xml.sax.Attributes r7) throws p793n0.SVGParseException {
        /*
            r5 = this;
            r0 = 0
        L1:
            int r1 = r7.getLength()
            if (r0 >= r1) goto Ld3
            java.lang.String r1 = r7.getValue(r0)
            java.lang.String r1 = r1.trim()
            int[] r2 = p793n0.SVGParser.C38402a.f101613b
            java.lang.String r3 = r7.getLocalName(r0)
            n0.l$g r3 = p793n0.SVGParser.EnumC38408g.m14760b(r3)
            int r3 = r3.ordinal()
            r2 = r2[r3]
            r3 = 1
            if (r2 == r3) goto Lc9
            r3 = 2
            if (r2 == r3) goto Lc2
            r3 = 3
            if (r2 == r3) goto Lad
            r3 = 4
            if (r2 == r3) goto L98
            r3 = 6
            if (r2 == r3) goto L7d
            java.lang.String r3 = "userSpaceOnUse"
            java.lang.String r4 = "objectBoundingBox"
            switch(r2) {
                case 40: goto L5f;
                case 41: goto L3f;
                case 42: goto L37;
                default: goto L35;
            }
        L35:
            goto Lcf
        L37:
            android.graphics.Matrix r1 = r5.m14860J0(r1)
            r6.f101537s = r1
            goto Lcf
        L3f:
            boolean r2 = r4.equals(r1)
            if (r2 == 0) goto L4b
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r6.f101536r = r1
            goto Lcf
        L4b:
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L57
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r6.f101536r = r1
            goto Lcf
        L57:
            n0.k r6 = new n0.k
            java.lang.String r7 = "Invalid value for attribute patternContentUnits"
            r6.<init>(r7)
            throw r6
        L5f:
            boolean r2 = r4.equals(r1)
            if (r2 == 0) goto L6a
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r6.f101535q = r1
            goto Lcf
        L6a:
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L75
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r6.f101535q = r1
            goto Lcf
        L75:
            n0.k r6 = new n0.k
            java.lang.String r7 = "Invalid value for attribute patternUnits"
            r6.<init>(r7)
            throw r6
        L7d:
            java.lang.String r2 = ""
            java.lang.String r3 = r7.getURI(r0)
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L95
            java.lang.String r2 = "http://www.w3.org/1999/xlink"
            java.lang.String r3 = r7.getURI(r0)
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto Lcf
        L95:
            r6.f101542x = r1
            goto Lcf
        L98:
            n0.h$p r1 = m14787o0(r1)
            r6.f101541w = r1
            boolean r1 = r1.m15000h()
            if (r1 != 0) goto La5
            goto Lcf
        La5:
            n0.k r6 = new n0.k
            java.lang.String r7 = "Invalid <pattern> element. height cannot be negative"
            r6.<init>(r7)
            throw r6
        Lad:
            n0.h$p r1 = m14787o0(r1)
            r6.f101540v = r1
            boolean r1 = r1.m15000h()
            if (r1 != 0) goto Lba
            goto Lcf
        Lba:
            n0.k r6 = new n0.k
            java.lang.String r7 = "Invalid <pattern> element. width cannot be negative"
            r6.<init>(r7)
            throw r6
        Lc2:
            n0.h$p r1 = m14787o0(r1)
            r6.f101539u = r1
            goto Lcf
        Lc9:
            n0.h$p r1 = m14787o0(r1)
            r6.f101538t = r1
        Lcf:
            int r0 = r0 + 1
            goto L1
        Ld3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p793n0.SVGParser.m14855M(n0.h$y, org.xml.sax.Attributes):void");
    }

    /* renamed from: M0 */
    private static SVG.C38337e0.EnumC38346i m14854M0(String str) {
        str.hashCode();
        if (!str.equals("none")) {
            if (!str.equals("non-scaling-stroke")) {
                return null;
            }
            return SVG.C38337e0.EnumC38346i.NonScalingStroke;
        }
        return SVG.C38337e0.EnumC38346i.None;
    }

    /* renamed from: N */
    private void m14853N(SVG.C38389z c38389z, Attributes attributes, String str) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (EnumC38408g.m14760b(attributes.getLocalName(i)) == EnumC38408g.points) {
                C38410i c38410i = new C38410i(attributes.getValue(i));
                ArrayList<Float> arrayList = new ArrayList();
                c38410i.m14758A();
                while (!c38410i.m14750h()) {
                    float m14744n = c38410i.m14744n();
                    if (!Float.isNaN(m14744n)) {
                        c38410i.m14732z();
                        float m14744n2 = c38410i.m14744n();
                        if (!Float.isNaN(m14744n2)) {
                            c38410i.m14732z();
                            arrayList.add(Float.valueOf(m14744n));
                            arrayList.add(Float.valueOf(m14744n2));
                        } else {
                            throw new SVGParseException("Invalid <" + str + "> points attribute. There should be an even number of coordinates.");
                        }
                    } else {
                        throw new SVGParseException("Invalid <" + str + "> points attribute. Non-coordinate content found in list.");
                    }
                }
                c38389z.f101543o = new float[arrayList.size()];
                int i2 = 0;
                for (Float f : arrayList) {
                    c38389z.f101543o[i2] = f.floatValue();
                    i2++;
                }
            }
        }
    }

    /* renamed from: N0 */
    private static SVG.C38327b m14852N0(String str) throws SVGParseException {
        C38410i c38410i = new C38410i(str);
        c38410i.m14758A();
        float m14744n = c38410i.m14744n();
        c38410i.m14732z();
        float m14744n2 = c38410i.m14744n();
        c38410i.m14732z();
        float m14744n3 = c38410i.m14744n();
        c38410i.m14732z();
        float m14744n4 = c38410i.m14744n();
        if (!Float.isNaN(m14744n) && !Float.isNaN(m14744n2) && !Float.isNaN(m14744n3) && !Float.isNaN(m14744n4)) {
            if (m14744n3 >= 0.0f) {
                if (m14744n4 >= 0.0f) {
                    return new SVG.C38327b(m14744n, m14744n2, m14744n3, m14744n4);
                }
                throw new SVGParseException("Invalid viewBox. height cannot be negative");
            }
            throw new SVGParseException("Invalid viewBox. width cannot be negative");
        }
        throw new SVGParseException("Invalid viewBox definition - should have four numbers");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005b, code lost:
        continue;
     */
    /* renamed from: O */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m14851O(p793n0.SVG.C38372q0 r5, org.xml.sax.Attributes r6) throws p793n0.SVGParseException {
        /*
            r4 = this;
            r0 = 0
        L1:
            int r1 = r6.getLength()
            if (r0 >= r1) goto L5e
            java.lang.String r1 = r6.getValue(r0)
            java.lang.String r1 = r1.trim()
            int[] r2 = p793n0.SVGParser.C38402a.f101613b
            java.lang.String r3 = r6.getLocalName(r0)
            n0.l$g r3 = p793n0.SVGParser.EnumC38408g.m14760b(r3)
            int r3 = r3.ordinal()
            r2 = r2[r3]
            r3 = 35
            if (r2 == r3) goto L55
            r3 = 36
            if (r2 == r3) goto L4e
            switch(r2) {
                case 12: goto L47;
                case 13: goto L40;
                case 14: goto L2b;
                default: goto L2a;
            }
        L2a:
            goto L5b
        L2b:
            n0.h$p r1 = m14787o0(r1)
            r5.f101507o = r1
            boolean r1 = r1.m15000h()
            if (r1 != 0) goto L38
            goto L5b
        L38:
            n0.k r5 = new n0.k
            java.lang.String r6 = "Invalid <radialGradient> element. r cannot be negative"
            r5.<init>(r6)
            throw r5
        L40:
            n0.h$p r1 = m14787o0(r1)
            r5.f101506n = r1
            goto L5b
        L47:
            n0.h$p r1 = m14787o0(r1)
            r5.f101505m = r1
            goto L5b
        L4e:
            n0.h$p r1 = m14787o0(r1)
            r5.f101509q = r1
            goto L5b
        L55:
            n0.h$p r1 = m14787o0(r1)
            r5.f101508p = r1
        L5b:
            int r0 = r0 + 1
            goto L1
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p793n0.SVGParser.m14851O(n0.h$q0, org.xml.sax.Attributes):void");
    }

    /* renamed from: O0 */
    private void m14850O0(Attributes attributes) throws SVGParseException {
        m14794l("<path>", new Object[0]);
        if (this.f101604b != null) {
            SVG.C38381v c38381v = new SVG.C38381v();
            c38381v.f101490a = this.f101603a;
            c38381v.f101491b = this.f101604b;
            m14873D(c38381v, attributes);
            m14843S(c38381v, attributes);
            m14835W(c38381v, attributes);
            m14875C(c38381v, attributes);
            m14857L(c38381v, attributes);
            this.f101604b.mo14992a(c38381v);
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    /* renamed from: P */
    private void m14849P(SVG.C38328b0 c38328b0, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int i2 = C38402a.f101613b[EnumC38408g.m14760b(attributes.getLocalName(i)).ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 != 10) {
                                if (i2 != 11) {
                                    continue;
                                } else {
                                    SVG.C38369p m14787o0 = m14787o0(trim);
                                    c38328b0.f101344t = m14787o0;
                                    if (m14787o0.m15000h()) {
                                        throw new SVGParseException("Invalid <rect> element. ry cannot be negative");
                                    }
                                }
                            } else {
                                SVG.C38369p m14787o02 = m14787o0(trim);
                                c38328b0.f101343s = m14787o02;
                                if (m14787o02.m15000h()) {
                                    throw new SVGParseException("Invalid <rect> element. rx cannot be negative");
                                }
                            }
                        } else {
                            SVG.C38369p m14787o03 = m14787o0(trim);
                            c38328b0.f101342r = m14787o03;
                            if (m14787o03.m15000h()) {
                                throw new SVGParseException("Invalid <rect> element. height cannot be negative");
                            }
                        }
                    } else {
                        SVG.C38369p m14787o04 = m14787o0(trim);
                        c38328b0.f101341q = m14787o04;
                        if (m14787o04.m15000h()) {
                            throw new SVGParseException("Invalid <rect> element. width cannot be negative");
                        }
                    }
                } else {
                    c38328b0.f101340p = m14787o0(trim);
                }
            } else {
                c38328b0.f101339o = m14787o0(trim);
            }
        }
    }

    /* renamed from: P0 */
    private void m14848P0(Attributes attributes) throws SVGParseException {
        m14794l("<pattern>", new Object[0]);
        if (this.f101604b != null) {
            SVG.C38387y c38387y = new SVG.C38387y();
            c38387y.f101490a = this.f101603a;
            c38387y.f101491b = this.f101604b;
            m14873D(c38387y, attributes);
            m14843S(c38387y, attributes);
            m14875C(c38387y, attributes);
            m14831Y(c38387y, attributes);
            m14855M(c38387y, attributes);
            this.f101604b.mo14992a(c38387y);
            this.f101604b = c38387y;
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    /* renamed from: Q */
    private void m14847Q(SVG.C38349f0 c38349f0, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int i2 = C38402a.f101613b[EnumC38408g.m14760b(attributes.getLocalName(i)).ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 == 5) {
                                c38349f0.f101452u = trim;
                            }
                        } else {
                            SVG.C38369p m14787o0 = m14787o0(trim);
                            c38349f0.f101451t = m14787o0;
                            if (m14787o0.m15000h()) {
                                throw new SVGParseException("Invalid <svg> element. height cannot be negative");
                            }
                        }
                    } else {
                        SVG.C38369p m14787o02 = m14787o0(trim);
                        c38349f0.f101450s = m14787o02;
                        if (m14787o02.m15000h()) {
                            throw new SVGParseException("Invalid <svg> element. width cannot be negative");
                        }
                    }
                } else {
                    c38349f0.f101449r = m14787o0(trim);
                }
            } else {
                c38349f0.f101448q = m14787o0(trim);
            }
        }
    }

    /* renamed from: Q0 */
    private void m14846Q0(Attributes attributes) throws SVGParseException {
        m14794l("<polygon>", new Object[0]);
        if (this.f101604b != null) {
            SVG.C38389z c38325a0 = new SVG.C38325a0();
            c38325a0.f101490a = this.f101603a;
            c38325a0.f101491b = this.f101604b;
            m14873D(c38325a0, attributes);
            m14843S(c38325a0, attributes);
            m14835W(c38325a0, attributes);
            m14875C(c38325a0, attributes);
            m14853N(c38325a0, attributes, "polygon");
            this.f101604b.mo14992a(c38325a0);
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    /* renamed from: R */
    private void m14845R(SVG.C38334d0 c38334d0, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            if (C38402a.f101613b[EnumC38408g.m14760b(attributes.getLocalName(i)).ordinal()] == 37) {
                c38334d0.f101354h = m14789n0(trim);
            }
        }
    }

    /* renamed from: R0 */
    private void m14844R0(Attributes attributes) throws SVGParseException {
        m14794l("<polyline>", new Object[0]);
        if (this.f101604b != null) {
            SVG.C38389z c38389z = new SVG.C38389z();
            c38389z.f101490a = this.f101603a;
            c38389z.f101491b = this.f101604b;
            m14873D(c38389z, attributes);
            m14843S(c38389z, attributes);
            m14835W(c38389z, attributes);
            m14875C(c38389z, attributes);
            m14853N(c38389z, attributes, "polyline");
            this.f101604b.mo14992a(c38389z);
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    /* renamed from: S */
    private void m14843S(SVG.AbstractC38362l0 abstractC38362l0, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            if (trim.length() != 0) {
                int i2 = C38402a.f101613b[EnumC38408g.m14760b(attributes.getLocalName(i)).ordinal()];
                if (i2 != 45) {
                    if (i2 != 46) {
                        if (abstractC38362l0.f101482e == null) {
                            abstractC38362l0.f101482e = new SVG.C38337e0();
                        }
                        m14842S0(abstractC38362l0.f101482e, attributes.getLocalName(i), attributes.getValue(i).trim());
                    } else {
                        abstractC38362l0.f101484g = CSSParser.m15099f(trim);
                    }
                } else {
                    m14870E0(abstractC38362l0, trim);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: S0 */
    public static void m14842S0(SVG.C38337e0 c38337e0, String str, String str2) {
        if (str2.length() == 0 || str2.equals("inherit")) {
            return;
        }
        try {
            switch (C38402a.f101613b[EnumC38408g.m14760b(str).ordinal()]) {
                case 47:
                    SVG.AbstractC38368o0 m14777t0 = m14777t0(str2);
                    c38337e0.f101382c = m14777t0;
                    if (m14777t0 != null) {
                        c38337e0.f101381b |= 1;
                        return;
                    }
                    return;
                case 48:
                    SVG.C38337e0.EnumC38338a m14814e0 = m14814e0(str2);
                    c38337e0.f101383d = m14814e0;
                    if (m14814e0 != null) {
                        c38337e0.f101381b |= 2;
                        return;
                    }
                    return;
                case 49:
                    Float m14781r0 = m14781r0(str2);
                    c38337e0.f101384f = m14781r0;
                    if (m14781r0 != null) {
                        c38337e0.f101381b |= 4;
                        return;
                    }
                    return;
                case 50:
                    SVG.AbstractC38368o0 m14777t02 = m14777t0(str2);
                    c38337e0.f101385g = m14777t02;
                    if (m14777t02 != null) {
                        c38337e0.f101381b |= 8;
                        return;
                    }
                    return;
                case 51:
                    Float m14781r02 = m14781r0(str2);
                    c38337e0.f101386h = m14781r02;
                    if (m14781r02 != null) {
                        c38337e0.f101381b |= 16;
                        return;
                    }
                    return;
                case 52:
                    c38337e0.f101387i = m14787o0(str2);
                    c38337e0.f101381b |= 32;
                    break;
                case 53:
                    SVG.C38337e0.EnumC38340c m14874C0 = m14874C0(str2);
                    c38337e0.f101388j = m14874C0;
                    if (m14874C0 != null) {
                        c38337e0.f101381b |= 64;
                        return;
                    }
                    return;
                case 54:
                    SVG.C38337e0.EnumC38341d m14872D0 = m14872D0(str2);
                    c38337e0.f101389k = m14872D0;
                    if (m14872D0 != null) {
                        c38337e0.f101381b |= 128;
                        return;
                    }
                    return;
                case 55:
                    c38337e0.f101390l = Float.valueOf(m14811f0(str2));
                    c38337e0.f101381b |= 256;
                    break;
                case 56:
                    if ("none".equals(str2)) {
                        c38337e0.f101391m = null;
                        c38337e0.f101381b |= 512;
                        return;
                    }
                    SVG.C38369p[] m14876B0 = m14876B0(str2);
                    c38337e0.f101391m = m14876B0;
                    if (m14876B0 != null) {
                        c38337e0.f101381b |= 512;
                        return;
                    }
                    return;
                case 57:
                    c38337e0.f101392n = m14787o0(str2);
                    c38337e0.f101381b |= 1024;
                    break;
                case 58:
                    c38337e0.f101393o = m14781r0(str2);
                    c38337e0.f101381b |= 2048;
                    return;
                case 59:
                    c38337e0.f101394p = m14823b0(str2);
                    c38337e0.f101381b |= 4096;
                    break;
                case 60:
                    m14805h0(c38337e0, str2);
                    return;
                case 61:
                    List<String> m14802i0 = m14802i0(str2);
                    c38337e0.f101395q = m14802i0;
                    if (m14802i0 != null) {
                        c38337e0.f101381b |= 8192;
                        return;
                    }
                    return;
                case 62:
                    SVG.C38369p m14799j0 = m14799j0(str2);
                    c38337e0.f101396r = m14799j0;
                    if (m14799j0 != null) {
                        c38337e0.f101381b |= 16384;
                        return;
                    }
                    return;
                case 63:
                    Integer m14793l0 = m14793l0(str2);
                    c38337e0.f101397s = m14793l0;
                    if (m14793l0 != null) {
                        c38337e0.f101381b |= 32768;
                        return;
                    }
                    return;
                case 64:
                    SVG.C38337e0.EnumC38339b m14796k0 = m14796k0(str2);
                    c38337e0.f101398t = m14796k0;
                    if (m14796k0 != null) {
                        c38337e0.f101381b |= 65536;
                        return;
                    }
                    return;
                case 65:
                    SVG.C38337e0.EnumC38344g m14864H0 = m14864H0(str2);
                    c38337e0.f101399u = m14864H0;
                    if (m14864H0 != null) {
                        c38337e0.f101381b |= 131072;
                        return;
                    }
                    return;
                case 66:
                    SVG.C38337e0.EnumC38345h m14862I0 = m14862I0(str2);
                    c38337e0.f101400v = m14862I0;
                    if (m14862I0 != null) {
                        c38337e0.f101381b |= 68719476736L;
                        return;
                    }
                    return;
                case 67:
                    SVG.C38337e0.EnumC38343f m14866G0 = m14866G0(str2);
                    c38337e0.f101401w = m14866G0;
                    if (m14866G0 != null) {
                        c38337e0.f101381b |= 262144;
                        return;
                    }
                    return;
                case 68:
                    Boolean m14779s0 = m14779s0(str2);
                    c38337e0.f101402x = m14779s0;
                    if (m14779s0 != null) {
                        c38337e0.f101381b |= 524288;
                        return;
                    }
                    return;
                case 69:
                    String m14791m0 = m14791m0(str2, str);
                    c38337e0.f101404z = m14791m0;
                    c38337e0.f101366A = m14791m0;
                    c38337e0.f101367B = m14791m0;
                    c38337e0.f101381b |= 14680064;
                    return;
                case 70:
                    c38337e0.f101404z = m14791m0(str2, str);
                    c38337e0.f101381b |= CacheDataSource.DEFAULT_MAX_CACHE_FILE_SIZE;
                    return;
                case 71:
                    c38337e0.f101366A = m14791m0(str2, str);
                    c38337e0.f101381b |= 4194304;
                    return;
                case 72:
                    c38337e0.f101367B = m14791m0(str2, str);
                    c38337e0.f101381b |= 8388608;
                    return;
                case 73:
                    if (str2.indexOf(124) < 0) {
                        if ("|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|".contains('|' + str2 + '|')) {
                            c38337e0.f101368C = Boolean.valueOf(!str2.equals("none"));
                            c38337e0.f101381b |= 16777216;
                            return;
                        }
                        return;
                    }
                    return;
                case 74:
                    if (str2.indexOf(124) < 0) {
                        if ("|visible|hidden|collapse|".contains('|' + str2 + '|')) {
                            c38337e0.f101369D = Boolean.valueOf(str2.equals("visible"));
                            c38337e0.f101381b |= 33554432;
                            return;
                        }
                        return;
                    }
                    return;
                case 75:
                    if (str2.equals("currentColor")) {
                        c38337e0.f101370E = SVG.C38351g.m15007b();
                    } else {
                        try {
                            c38337e0.f101370E = m14823b0(str2);
                        } catch (SVGParseException e) {
                            Log.w("SVGParser", e.getMessage());
                            return;
                        }
                    }
                    c38337e0.f101381b |= 67108864;
                    return;
                case 76:
                    c38337e0.f101371F = m14781r0(str2);
                    c38337e0.f101381b |= 134217728;
                    return;
                case 77:
                    SVG.C38330c m14826a0 = m14826a0(str2);
                    c38337e0.f101403y = m14826a0;
                    if (m14826a0 != null) {
                        c38337e0.f101381b |= 1048576;
                        return;
                    }
                    return;
                case 78:
                    c38337e0.f101372G = m14791m0(str2, str);
                    c38337e0.f101381b |= 268435456;
                    return;
                case 79:
                    c38337e0.f101373H = m14814e0(str2);
                    c38337e0.f101381b |= 536870912;
                    return;
                case 80:
                    c38337e0.f101374I = m14791m0(str2, str);
                    c38337e0.f101381b |= 1073741824;
                    return;
                case 81:
                    if (str2.equals("currentColor")) {
                        c38337e0.f101375J = SVG.C38351g.m15007b();
                    } else {
                        try {
                            c38337e0.f101375J = m14823b0(str2);
                        } catch (SVGParseException e2) {
                            Log.w("SVGParser", e2.getMessage());
                            return;
                        }
                    }
                    c38337e0.f101381b |= 2147483648L;
                    return;
                case 82:
                    c38337e0.f101376K = m14781r0(str2);
                    c38337e0.f101381b |= 4294967296L;
                    return;
                case 83:
                    if (str2.equals("currentColor")) {
                        c38337e0.f101377L = SVG.C38351g.m15007b();
                    } else {
                        try {
                            c38337e0.f101377L = m14823b0(str2);
                        } catch (SVGParseException e3) {
                            Log.w("SVGParser", e3.getMessage());
                            return;
                        }
                    }
                    c38337e0.f101381b |= 8589934592L;
                    return;
                case 84:
                    c38337e0.f101378M = m14781r0(str2);
                    c38337e0.f101381b |= 17179869184L;
                    return;
                case 85:
                    SVG.C38337e0.EnumC38346i m14854M0 = m14854M0(str2);
                    c38337e0.f101379N = m14854M0;
                    if (m14854M0 != null) {
                        c38337e0.f101381b |= 34359738368L;
                        return;
                    }
                    return;
                case 86:
                    SVG.C38337e0.EnumC38342e m14767y0 = m14767y0(str2);
                    c38337e0.f101380O = m14767y0;
                    if (m14767y0 != null) {
                        c38337e0.f101381b |= 137438953472L;
                        return;
                    }
                    return;
                default:
            }
        } catch (SVGParseException unused) {
        }
    }

    /* renamed from: T */
    private void m14841T(SVG.C38380u0 c38380u0, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            if (C38402a.f101613b[EnumC38408g.m14760b(attributes.getLocalName(i)).ordinal()] == 6 && ("".equals(attributes.getURI(i)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i)))) {
                c38380u0.f101525o = trim;
            }
        }
    }

    /* renamed from: T0 */
    private void m14840T0(Attributes attributes) throws SVGParseException {
        m14794l("<radialGradient>", new Object[0]);
        if (this.f101604b != null) {
            SVG.C38372q0 c38372q0 = new SVG.C38372q0();
            c38372q0.f101490a = this.f101603a;
            c38372q0.f101491b = this.f101604b;
            m14873D(c38372q0, attributes);
            m14843S(c38372q0, attributes);
            m14869F(c38372q0, attributes);
            m14851O(c38372q0, attributes);
            this.f101604b.mo14992a(c38372q0);
            this.f101604b = c38372q0;
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    /* renamed from: U */
    private void m14839U(SVG.C38390z0 c38390z0, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int i2 = C38402a.f101613b[EnumC38408g.m14760b(attributes.getLocalName(i)).ordinal()];
            if (i2 != 6) {
                if (i2 == 39) {
                    c38390z0.f101545p = m14787o0(trim);
                }
            } else if ("".equals(attributes.getURI(i)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i))) {
                c38390z0.f101544o = trim;
            }
        }
    }

    /* renamed from: U0 */
    private void m14838U0(Attributes attributes) throws SVGParseException {
        m14794l("<rect>", new Object[0]);
        if (this.f101604b != null) {
            SVG.C38328b0 c38328b0 = new SVG.C38328b0();
            c38328b0.f101490a = this.f101603a;
            c38328b0.f101491b = this.f101604b;
            m14873D(c38328b0, attributes);
            m14843S(c38328b0, attributes);
            m14835W(c38328b0, attributes);
            m14875C(c38328b0, attributes);
            m14849P(c38328b0, attributes);
            this.f101604b.mo14992a(c38328b0);
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    /* renamed from: V */
    private void m14837V(SVG.AbstractC38326a1 abstractC38326a1, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int i2 = C38402a.f101613b[EnumC38408g.m14760b(attributes.getLocalName(i)).ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 19) {
                        if (i2 == 20) {
                            abstractC38326a1.f101334r = m14785p0(trim);
                        }
                    } else {
                        abstractC38326a1.f101333q = m14785p0(trim);
                    }
                } else {
                    abstractC38326a1.f101332p = m14785p0(trim);
                }
            } else {
                abstractC38326a1.f101331o = m14785p0(trim);
            }
        }
    }

    /* renamed from: V0 */
    private void m14836V0(Attributes attributes) throws SVGParseException {
        m14794l("<solidColor>", new Object[0]);
        if (this.f101604b != null) {
            SVG.C38331c0 c38331c0 = new SVG.C38331c0();
            c38331c0.f101490a = this.f101603a;
            c38331c0.f101491b = this.f101604b;
            m14873D(c38331c0, attributes);
            m14843S(c38331c0, attributes);
            this.f101604b.mo14992a(c38331c0);
            this.f101604b = c38331c0;
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    /* renamed from: W */
    private void m14835W(SVG.InterfaceC38365n interfaceC38365n, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (EnumC38408g.m14760b(attributes.getLocalName(i)) == EnumC38408g.transform) {
                interfaceC38365n.setTransform(m14860J0(attributes.getValue(i)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W0 */
    public void m14834W0() {
        this.f101603a = new SVG();
    }

    /* renamed from: X */
    private void m14833X(SVG.C38347e1 c38347e1, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int i2 = C38402a.f101613b[EnumC38408g.m14760b(attributes.getLocalName(i)).ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 == 6 && ("".equals(attributes.getURI(i)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i)))) {
                                c38347e1.f101440p = trim;
                            }
                        } else {
                            SVG.C38369p m14787o0 = m14787o0(trim);
                            c38347e1.f101444t = m14787o0;
                            if (m14787o0.m15000h()) {
                                throw new SVGParseException("Invalid <use> element. height cannot be negative");
                            }
                        }
                    } else {
                        SVG.C38369p m14787o02 = m14787o0(trim);
                        c38347e1.f101443s = m14787o02;
                        if (m14787o02.m15000h()) {
                            throw new SVGParseException("Invalid <use> element. width cannot be negative");
                        }
                    }
                } else {
                    c38347e1.f101442r = m14787o0(trim);
                }
            } else {
                c38347e1.f101441q = m14787o0(trim);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X0 */
    public void m14832X0(String str, String str2, String str3, Attributes attributes) throws SVGParseException {
        if (this.f101605c) {
            this.f101606d++;
        } else if (!"http://www.w3.org/2000/svg".equals(str) && !"".equals(str)) {
        } else {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            EnumC38409h m14759b = EnumC38409h.m14759b(str2);
            switch (C38402a.f101612a[m14759b.ordinal()]) {
                case 1:
                    m14825a1(attributes);
                    return;
                case 2:
                case 3:
                    m14784q(attributes);
                    return;
                case 4:
                    m14792m(attributes);
                    return;
                case 5:
                    m14801i1(attributes);
                    return;
                case 6:
                    m14850O0(attributes);
                    return;
                case 7:
                    m14838U0(attributes);
                    return;
                case 8:
                    m14803i(attributes);
                    return;
                case 9:
                    m14790n(attributes);
                    return;
                case 10:
                    m14774v(attributes);
                    return;
                case 11:
                    m14844R0(attributes);
                    return;
                case 12:
                    m14846Q0(attributes);
                    return;
                case 13:
                    m14816d1(attributes);
                    return;
                case 14:
                    m14804h1(attributes);
                    return;
                case 15:
                    m14807g1(attributes);
                    return;
                case 16:
                    m14795k1(attributes);
                    return;
                case 17:
                    m14822b1(attributes);
                    return;
                case 18:
                    m14770x(attributes);
                    return;
                case 19:
                    m14772w(attributes);
                    return;
                case 20:
                    m14840T0(attributes);
                    return;
                case 21:
                    m14830Y0(attributes);
                    return;
                case 22:
                case 23:
                    this.f101607e = true;
                    this.f101608f = m14759b;
                    return;
                case 24:
                    m14797k(attributes);
                    return;
                case 25:
                    m14810f1(attributes);
                    return;
                case 26:
                    m14848P0(attributes);
                    return;
                case 27:
                    m14776u(attributes);
                    return;
                case 28:
                    m14798j1(attributes);
                    return;
                case 29:
                    m14768y(attributes);
                    return;
                case 30:
                    m14828Z0(attributes);
                    return;
                case 31:
                    m14836V0(attributes);
                    return;
                default:
                    this.f101605c = true;
                    this.f101606d = 1;
                    return;
            }
        }
    }

    /* renamed from: Y */
    private void m14831Y(SVG.AbstractC38374r0 abstractC38374r0, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int i2 = C38402a.f101613b[EnumC38408g.m14760b(attributes.getLocalName(i)).ordinal()];
            if (i2 != 7) {
                if (i2 == 87) {
                    abstractC38374r0.f101516p = m14852N0(trim);
                }
            } else {
                m14771w0(abstractC38374r0, trim);
            }
        }
    }

    /* renamed from: Y0 */
    private void m14830Y0(Attributes attributes) throws SVGParseException {
        m14794l("<stop>", new Object[0]);
        SVG.InterfaceC38358j0 interfaceC38358j0 = this.f101604b;
        if (interfaceC38358j0 != null) {
            if (interfaceC38358j0 instanceof SVG.AbstractC38357j) {
                SVG.C38334d0 c38334d0 = new SVG.C38334d0();
                c38334d0.f101490a = this.f101603a;
                c38334d0.f101491b = this.f101604b;
                m14873D(c38334d0, attributes);
                m14843S(c38334d0, attributes);
                m14845R(c38334d0, attributes);
                this.f101604b.mo14992a(c38334d0);
                this.f101604b = c38334d0;
                return;
            }
            throw new SVGParseException("Invalid document. <stop> elements are only valid inside <linearGradient> or <radialGradient> elements.");
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    /* renamed from: Z */
    private void m14829Z(String str) {
        this.f101603a.m15039a(new CSSParser(CSSParser.EnumC38304f.screen, CSSParser.EnumC38319u.Document).m15101d(str));
    }

    /* renamed from: Z0 */
    private void m14828Z0(Attributes attributes) throws SVGParseException {
        m14794l("<style>", new Object[0]);
        if (this.f101604b != null) {
            String str = "all";
            boolean z = true;
            for (int i = 0; i < attributes.getLength(); i++) {
                String trim = attributes.getValue(i).trim();
                int i2 = C38402a.f101613b[EnumC38408g.m14760b(attributes.getLocalName(i)).ordinal()];
                if (i2 != 88) {
                    if (i2 == 89) {
                        str = trim;
                    }
                } else {
                    z = trim.equals("text/css");
                }
            }
            if (z && CSSParser.m15103b(str, CSSParser.EnumC38304f.screen)) {
                this.f101610h = true;
                return;
            }
            this.f101605c = true;
            this.f101606d = 1;
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    /* renamed from: a0 */
    private static SVG.C38330c m14826a0(String str) {
        if ("auto".equals(str) || !str.startsWith("rect(")) {
            return null;
        }
        C38410i c38410i = new C38410i(str.substring(5));
        c38410i.m14758A();
        SVG.C38369p m14783q0 = m14783q0(c38410i);
        c38410i.m14732z();
        SVG.C38369p m14783q02 = m14783q0(c38410i);
        c38410i.m14732z();
        SVG.C38369p m14783q03 = m14783q0(c38410i);
        c38410i.m14732z();
        SVG.C38369p m14783q04 = m14783q0(c38410i);
        c38410i.m14758A();
        if (!c38410i.m14752f(')') && !c38410i.m14750h()) {
            return null;
        }
        return new SVG.C38330c(m14783q0, m14783q02, m14783q03, m14783q04);
    }

    /* renamed from: a1 */
    private void m14825a1(Attributes attributes) throws SVGParseException {
        m14794l("<svg>", new Object[0]);
        SVG.C38349f0 c38349f0 = new SVG.C38349f0();
        c38349f0.f101490a = this.f101603a;
        c38349f0.f101491b = this.f101604b;
        m14873D(c38349f0, attributes);
        m14843S(c38349f0, attributes);
        m14875C(c38349f0, attributes);
        m14831Y(c38349f0, attributes);
        m14847Q(c38349f0, attributes);
        SVG.InterfaceC38358j0 interfaceC38358j0 = this.f101604b;
        if (interfaceC38358j0 == null) {
            this.f101603a.m15016x(c38349f0);
        } else {
            interfaceC38358j0.mo14992a(c38349f0);
        }
        this.f101604b = c38349f0;
    }

    /* renamed from: b0 */
    private static SVG.C38348f m14823b0(String str) throws SVGParseException {
        int i = 5;
        if (str.charAt(0) == '#') {
            C38320c m15054b = C38320c.m15054b(str, 1, str.length());
            if (m15054b != null) {
                int m15055a = m15054b.m15055a();
                if (m15055a != 4) {
                    if (m15055a != 5) {
                        if (m15055a != 7) {
                            if (m15055a == 9) {
                                return new SVG.C38348f((m15054b.m15052d() >>> 8) | (m15054b.m15052d() << 24));
                            }
                            throw new SVGParseException("Bad hex colour value: " + str);
                        }
                        return new SVG.C38348f(m15054b.m15052d() | ViewCompat.MEASURED_STATE_MASK);
                    }
                    int m15052d = m15054b.m15052d();
                    int i2 = 61440 & m15052d;
                    int i3 = m15052d & 3840;
                    int i4 = m15052d & 240;
                    int i5 = m15052d & 15;
                    return new SVG.C38348f((i5 << 24) | (i5 << 28) | (i2 << 8) | (i2 << 4) | (i3 << 4) | i3 | i4 | (i4 >> 4));
                }
                int m15052d2 = m15054b.m15052d();
                int i6 = m15052d2 & 3840;
                int i7 = m15052d2 & 240;
                int i8 = m15052d2 & 15;
                return new SVG.C38348f(i8 | (i6 << 8) | (-16777216) | (i6 << 12) | (i7 << 8) | (i7 << 4) | (i8 << 4));
            }
            throw new SVGParseException("Bad hex colour value: " + str);
        }
        String lowerCase = str.toLowerCase(Locale.US);
        boolean startsWith = lowerCase.startsWith("rgba(");
        if (!startsWith && !lowerCase.startsWith("rgb(")) {
            boolean startsWith2 = lowerCase.startsWith("hsla(");
            if (!startsWith2 && !lowerCase.startsWith("hsl(")) {
                return m14820c0(lowerCase);
            }
            if (!startsWith2) {
                i = 4;
            }
            C38410i c38410i = new C38410i(str.substring(i));
            c38410i.m14758A();
            float m14744n = c38410i.m14744n();
            float m14754d = c38410i.m14754d(m14744n);
            if (!Float.isNaN(m14754d)) {
                c38410i.m14752f('%');
            }
            float m14754d2 = c38410i.m14754d(m14754d);
            if (!Float.isNaN(m14754d2)) {
                c38410i.m14752f('%');
            }
            if (startsWith2) {
                float m14754d3 = c38410i.m14754d(m14754d2);
                c38410i.m14758A();
                if (!Float.isNaN(m14754d3) && c38410i.m14752f(')')) {
                    return new SVG.C38348f((m14800j(m14754d3 * 256.0f) << 24) | m14780s(m14744n, m14754d, m14754d2));
                }
                throw new SVGParseException("Bad hsla() colour value: " + str);
            }
            c38410i.m14758A();
            if (!Float.isNaN(m14754d2) && c38410i.m14752f(')')) {
                return new SVG.C38348f(m14780s(m14744n, m14754d, m14754d2) | ViewCompat.MEASURED_STATE_MASK);
            }
            throw new SVGParseException("Bad hsl() colour value: " + str);
        }
        if (!startsWith) {
            i = 4;
        }
        C38410i c38410i2 = new C38410i(str.substring(i));
        c38410i2.m14758A();
        float m14744n2 = c38410i2.m14744n();
        if (!Float.isNaN(m14744n2) && c38410i2.m14752f('%')) {
            m14744n2 = (m14744n2 * 256.0f) / 100.0f;
        }
        float m14754d4 = c38410i2.m14754d(m14744n2);
        if (!Float.isNaN(m14754d4) && c38410i2.m14752f('%')) {
            m14754d4 = (m14754d4 * 256.0f) / 100.0f;
        }
        float m14754d5 = c38410i2.m14754d(m14754d4);
        if (!Float.isNaN(m14754d5) && c38410i2.m14752f('%')) {
            m14754d5 = (m14754d5 * 256.0f) / 100.0f;
        }
        if (startsWith) {
            float m14754d6 = c38410i2.m14754d(m14754d5);
            c38410i2.m14758A();
            if (!Float.isNaN(m14754d6) && c38410i2.m14752f(')')) {
                return new SVG.C38348f((m14800j(m14754d6 * 256.0f) << 24) | (m14800j(m14744n2) << 16) | (m14800j(m14754d4) << 8) | m14800j(m14754d5));
            }
            throw new SVGParseException("Bad rgba() colour value: " + str);
        }
        c38410i2.m14758A();
        if (!Float.isNaN(m14754d5) && c38410i2.m14752f(')')) {
            return new SVG.C38348f((m14800j(m14744n2) << 16) | ViewCompat.MEASURED_STATE_MASK | (m14800j(m14754d4) << 8) | m14800j(m14754d5));
        }
        throw new SVGParseException("Bad rgb() colour value: " + str);
    }

    /* renamed from: b1 */
    private void m14822b1(Attributes attributes) throws SVGParseException {
        m14794l("<symbol>", new Object[0]);
        if (this.f101604b != null) {
            SVG.AbstractC38374r0 c38378t0 = new SVG.C38378t0();
            c38378t0.f101490a = this.f101603a;
            c38378t0.f101491b = this.f101604b;
            m14873D(c38378t0, attributes);
            m14843S(c38378t0, attributes);
            m14875C(c38378t0, attributes);
            m14831Y(c38378t0, attributes);
            this.f101604b.mo14992a(c38378t0);
            this.f101604b = c38378t0;
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    /* renamed from: c0 */
    private static SVG.C38348f m14820c0(String str) throws SVGParseException {
        Integer m14763a = C38404c.m14763a(str);
        if (m14763a != null) {
            return new SVG.C38348f(m14763a.intValue());
        }
        throw new SVGParseException("Invalid colour keyword: " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c1 */
    public void m14819c1(String str) throws SVGParseException {
        if (this.f101605c) {
            return;
        }
        if (this.f101607e) {
            if (this.f101609g == null) {
                this.f101609g = new StringBuilder(str.length());
            }
            this.f101609g.append(str);
        } else if (this.f101610h) {
            if (this.f101611i == null) {
                this.f101611i = new StringBuilder(str.length());
            }
            this.f101611i.append(str);
        } else if (this.f101604b instanceof SVG.AbstractC38388y0) {
            m14806h(str);
        }
    }

    /* renamed from: d0 */
    private static SVG.AbstractC38368o0 m14817d0(String str) {
        str.hashCode();
        if (!str.equals("none")) {
            if (!str.equals("currentColor")) {
                try {
                    return m14823b0(str);
                } catch (SVGParseException unused) {
                    return null;
                }
            }
            return SVG.C38351g.m15007b();
        }
        return SVG.C38348f.f101446d;
    }

    /* renamed from: d1 */
    private void m14816d1(Attributes attributes) throws SVGParseException {
        m14794l("<text>", new Object[0]);
        if (this.f101604b != null) {
            SVG.C38384w0 c38384w0 = new SVG.C38384w0();
            c38384w0.f101490a = this.f101603a;
            c38384w0.f101491b = this.f101604b;
            m14873D(c38384w0, attributes);
            m14843S(c38384w0, attributes);
            m14835W(c38384w0, attributes);
            m14875C(c38384w0, attributes);
            m14837V(c38384w0, attributes);
            this.f101604b.mo14992a(c38384w0);
            this.f101604b = c38384w0;
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    /* renamed from: e0 */
    private static SVG.C38337e0.EnumC38338a m14814e0(String str) {
        if ("nonzero".equals(str)) {
            return SVG.C38337e0.EnumC38338a.NonZero;
        }
        if ("evenodd".equals(str)) {
            return SVG.C38337e0.EnumC38338a.EvenOdd;
        }
        return null;
    }

    /* renamed from: e1 */
    private void m14813e1(char[] cArr, int i, int i2) throws SVGParseException {
        if (this.f101605c) {
            return;
        }
        if (this.f101607e) {
            if (this.f101609g == null) {
                this.f101609g = new StringBuilder(i2);
            }
            this.f101609g.append(cArr, i, i2);
        } else if (this.f101610h) {
            if (this.f101611i == null) {
                this.f101611i = new StringBuilder(i2);
            }
            this.f101611i.append(cArr, i, i2);
        } else if (this.f101604b instanceof SVG.AbstractC38388y0) {
            m14806h(new String(cArr, i, i2));
        }
    }

    /* renamed from: f0 */
    private static float m14811f0(String str) throws SVGParseException {
        int length = str.length();
        if (length != 0) {
            return m14808g0(str, 0, length);
        }
        throw new SVGParseException("Invalid float value (empty string)");
    }

    /* renamed from: f1 */
    private void m14810f1(Attributes attributes) throws SVGParseException {
        m14794l("<textPath>", new Object[0]);
        if (this.f101604b != null) {
            SVG.C38390z0 c38390z0 = new SVG.C38390z0();
            c38390z0.f101490a = this.f101603a;
            c38390z0.f101491b = this.f101604b;
            m14873D(c38390z0, attributes);
            m14843S(c38390z0, attributes);
            m14875C(c38390z0, attributes);
            m14839U(c38390z0, attributes);
            this.f101604b.mo14992a(c38390z0);
            this.f101604b = c38390z0;
            SVG.InterfaceC38358j0 interfaceC38358j0 = c38390z0.f101491b;
            if (interfaceC38358j0 instanceof SVG.InterfaceC38329b1) {
                c38390z0.m14990c((SVG.InterfaceC38329b1) interfaceC38358j0);
                return;
            } else {
                c38390z0.m14990c(((SVG.InterfaceC38386x0) interfaceC38358j0).getTextRoot());
                return;
            }
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    /* renamed from: g0 */
    private static float m14808g0(String str, int i, int i2) throws SVGParseException {
        float m15050b = new NumberParser().m15050b(str, i, i2);
        if (!Float.isNaN(m15050b)) {
            return m15050b;
        }
        throw new SVGParseException("Invalid float value: " + str);
    }

    /* renamed from: g1 */
    private void m14807g1(Attributes attributes) throws SVGParseException {
        m14794l("<tref>", new Object[0]);
        SVG.InterfaceC38358j0 interfaceC38358j0 = this.f101604b;
        if (interfaceC38358j0 != null) {
            if (interfaceC38358j0 instanceof SVG.AbstractC38388y0) {
                SVG.C38380u0 c38380u0 = new SVG.C38380u0();
                c38380u0.f101490a = this.f101603a;
                c38380u0.f101491b = this.f101604b;
                m14873D(c38380u0, attributes);
                m14843S(c38380u0, attributes);
                m14875C(c38380u0, attributes);
                m14841T(c38380u0, attributes);
                this.f101604b.mo14992a(c38380u0);
                SVG.InterfaceC38358j0 interfaceC38358j02 = c38380u0.f101491b;
                if (interfaceC38358j02 instanceof SVG.InterfaceC38329b1) {
                    c38380u0.m14998c((SVG.InterfaceC38329b1) interfaceC38358j02);
                    return;
                } else {
                    c38380u0.m14998c(((SVG.InterfaceC38386x0) interfaceC38358j02).getTextRoot());
                    return;
                }
            }
            throw new SVGParseException("Invalid document. <tref> elements are only valid inside <text> or <tspan> elements.");
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    /* renamed from: h */
    private void m14806h(String str) throws SVGParseException {
        SVG.C38366n0 c38366n0;
        SVG.AbstractC38354h0 abstractC38354h0 = (SVG.AbstractC38354h0) this.f101604b;
        int size = abstractC38354h0.f101454i.size();
        if (size == 0) {
            c38366n0 = null;
        } else {
            c38366n0 = abstractC38354h0.f101454i.get(size - 1);
        }
        if (c38366n0 instanceof SVG.C38332c1) {
            StringBuilder sb2 = new StringBuilder();
            SVG.C38332c1 c38332c1 = (SVG.C38332c1) c38366n0;
            sb2.append(c38332c1.f101349c);
            sb2.append(str);
            c38332c1.f101349c = sb2.toString();
            return;
        }
        this.f101604b.mo14992a(new SVG.C38332c1(str));
    }

    /* renamed from: h0 */
    private static void m14805h0(SVG.C38337e0 c38337e0, String str) {
        String m14739s;
        int intValue;
        if (!"|caption|icon|menu|message-box|small-caption|status-bar|".contains('|' + str + '|')) {
            return;
        }
        C38410i c38410i = new C38410i(str);
        Integer num = null;
        SVG.C38337e0.EnumC38339b enumC38339b = null;
        String str2 = null;
        while (true) {
            m14739s = c38410i.m14739s('/');
            c38410i.m14758A();
            if (m14739s == null) {
                return;
            }
            if (num != null && enumC38339b != null) {
                break;
            } else if (!m14739s.equals("normal") && (num != null || (num = C38406e.m14761a(m14739s)) == null)) {
                if (enumC38339b != null || (enumC38339b = m14796k0(m14739s)) == null) {
                    if (str2 != null || !m14739s.equals("small-caps")) {
                        break;
                    }
                    str2 = m14739s;
                }
            }
        }
        SVG.C38369p m14799j0 = m14799j0(m14739s);
        if (c38410i.m14752f('/')) {
            c38410i.m14758A();
            String m14740r = c38410i.m14740r();
            if (m14740r != null) {
                try {
                    m14787o0(m14740r);
                } catch (SVGParseException unused) {
                    return;
                }
            }
            c38410i.m14758A();
        }
        c38337e0.f101395q = m14802i0(c38410i.m14733y());
        c38337e0.f101396r = m14799j0;
        if (num == null) {
            intValue = 400;
        } else {
            intValue = num.intValue();
        }
        c38337e0.f101397s = Integer.valueOf(intValue);
        if (enumC38339b == null) {
            enumC38339b = SVG.C38337e0.EnumC38339b.Normal;
        }
        c38337e0.f101398t = enumC38339b;
        c38337e0.f101381b |= 122880;
    }

    /* renamed from: h1 */
    private void m14804h1(Attributes attributes) throws SVGParseException {
        m14794l("<tspan>", new Object[0]);
        SVG.InterfaceC38358j0 interfaceC38358j0 = this.f101604b;
        if (interfaceC38358j0 != null) {
            if (interfaceC38358j0 instanceof SVG.AbstractC38388y0) {
                SVG.C38382v0 c38382v0 = new SVG.C38382v0();
                c38382v0.f101490a = this.f101603a;
                c38382v0.f101491b = this.f101604b;
                m14873D(c38382v0, attributes);
                m14843S(c38382v0, attributes);
                m14875C(c38382v0, attributes);
                m14837V(c38382v0, attributes);
                this.f101604b.mo14992a(c38382v0);
                this.f101604b = c38382v0;
                SVG.InterfaceC38358j0 interfaceC38358j02 = c38382v0.f101491b;
                if (interfaceC38358j02 instanceof SVG.InterfaceC38329b1) {
                    c38382v0.m14997c((SVG.InterfaceC38329b1) interfaceC38358j02);
                    return;
                } else {
                    c38382v0.m14997c(((SVG.InterfaceC38386x0) interfaceC38358j02).getTextRoot());
                    return;
                }
            }
            throw new SVGParseException("Invalid document. <tspan> elements are only valid inside <text> or other <tspan> elements.");
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    /* renamed from: i */
    private void m14803i(Attributes attributes) throws SVGParseException {
        m14794l("<circle>", new Object[0]);
        if (this.f101604b != null) {
            SVG.C38333d c38333d = new SVG.C38333d();
            c38333d.f101490a = this.f101603a;
            c38333d.f101491b = this.f101604b;
            m14873D(c38333d, attributes);
            m14843S(c38333d, attributes);
            m14835W(c38333d, attributes);
            m14875C(c38333d, attributes);
            m14879A(c38333d, attributes);
            this.f101604b.mo14992a(c38333d);
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    /* renamed from: i0 */
    private static List<String> m14802i0(String str) {
        C38410i c38410i = new C38410i(str);
        ArrayList arrayList = null;
        do {
            String m14741q = c38410i.m14741q();
            if (m14741q == null) {
                m14741q = c38410i.m14737u(',');
            }
            if (m14741q == null) {
                break;
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(m14741q);
            c38410i.m14732z();
        } while (!c38410i.m14750h());
        return arrayList;
    }

    /* renamed from: i1 */
    private void m14801i1(Attributes attributes) throws SVGParseException {
        m14794l("<use>", new Object[0]);
        if (this.f101604b != null) {
            SVG.C38347e1 c38347e1 = new SVG.C38347e1();
            c38347e1.f101490a = this.f101603a;
            c38347e1.f101491b = this.f101604b;
            m14873D(c38347e1, attributes);
            m14843S(c38347e1, attributes);
            m14835W(c38347e1, attributes);
            m14875C(c38347e1, attributes);
            m14833X(c38347e1, attributes);
            this.f101604b.mo14992a(c38347e1);
            this.f101604b = c38347e1;
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    /* renamed from: j */
    private static int m14800j(float f) {
        if (f < 0.0f) {
            return 0;
        }
        if (f > 255.0f) {
            return 255;
        }
        return Math.round(f);
    }

    /* renamed from: j0 */
    private static SVG.C38369p m14799j0(String str) {
        try {
            SVG.C38369p m14762a = C38405d.m14762a(str);
            if (m14762a == null) {
                return m14787o0(str);
            }
            return m14762a;
        } catch (SVGParseException unused) {
            return null;
        }
    }

    /* renamed from: j1 */
    private void m14798j1(Attributes attributes) throws SVGParseException {
        m14794l("<view>", new Object[0]);
        if (this.f101604b != null) {
            SVG.AbstractC38374r0 c38350f1 = new SVG.C38350f1();
            c38350f1.f101490a = this.f101603a;
            c38350f1.f101491b = this.f101604b;
            m14873D(c38350f1, attributes);
            m14875C(c38350f1, attributes);
            m14831Y(c38350f1, attributes);
            this.f101604b.mo14992a(c38350f1);
            this.f101604b = c38350f1;
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    /* renamed from: k */
    private void m14797k(Attributes attributes) throws SVGParseException {
        m14794l("<clipPath>", new Object[0]);
        if (this.f101604b != null) {
            SVG.C38336e c38336e = new SVG.C38336e();
            c38336e.f101490a = this.f101603a;
            c38336e.f101491b = this.f101604b;
            m14873D(c38336e, attributes);
            m14843S(c38336e, attributes);
            m14835W(c38336e, attributes);
            m14875C(c38336e, attributes);
            m14877B(c38336e, attributes);
            this.f101604b.mo14992a(c38336e);
            this.f101604b = c38336e;
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    /* renamed from: k0 */
    private static SVG.C38337e0.EnumC38339b m14796k0(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1657669071:
                if (str.equals("oblique")) {
                    c = 0;
                    break;
                }
                break;
            case -1178781136:
                if (str.equals("italic")) {
                    c = 1;
                    break;
                }
                break;
            case -1039745817:
                if (str.equals("normal")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return SVG.C38337e0.EnumC38339b.Oblique;
            case 1:
                return SVG.C38337e0.EnumC38339b.Italic;
            case 2:
                return SVG.C38337e0.EnumC38339b.Normal;
            default:
                return null;
        }
    }

    /* renamed from: k1 */
    private void m14795k1(Attributes attributes) throws SVGParseException {
        m14794l("<switch>", new Object[0]);
        if (this.f101604b != null) {
            SVG.C38376s0 c38376s0 = new SVG.C38376s0();
            c38376s0.f101490a = this.f101603a;
            c38376s0.f101491b = this.f101604b;
            m14873D(c38376s0, attributes);
            m14843S(c38376s0, attributes);
            m14835W(c38376s0, attributes);
            m14875C(c38376s0, attributes);
            this.f101604b.mo14992a(c38376s0);
            this.f101604b = c38376s0;
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    /* renamed from: l0 */
    private static Integer m14793l0(String str) {
        return C38406e.m14761a(str);
    }

    /* renamed from: m */
    private void m14792m(Attributes attributes) throws SVGParseException {
        m14794l("<defs>", new Object[0]);
        if (this.f101604b != null) {
            SVG.C38353h c38353h = new SVG.C38353h();
            c38353h.f101490a = this.f101603a;
            c38353h.f101491b = this.f101604b;
            m14873D(c38353h, attributes);
            m14843S(c38353h, attributes);
            m14835W(c38353h, attributes);
            this.f101604b.mo14992a(c38353h);
            this.f101604b = c38353h;
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    /* renamed from: m0 */
    private static String m14791m0(String str, String str2) {
        if (str.equals("none") || !str.startsWith("url(")) {
            return null;
        }
        if (str.endsWith(")")) {
            return str.substring(4, str.length() - 1).trim();
        }
        return str.substring(4).trim();
    }

    /* renamed from: n */
    private void m14790n(Attributes attributes) throws SVGParseException {
        m14794l("<ellipse>", new Object[0]);
        if (this.f101604b != null) {
            SVG.C38355i c38355i = new SVG.C38355i();
            c38355i.f101490a = this.f101603a;
            c38355i.f101491b = this.f101604b;
            m14873D(c38355i, attributes);
            m14843S(c38355i, attributes);
            m14835W(c38355i, attributes);
            m14875C(c38355i, attributes);
            m14871E(c38355i, attributes);
            this.f101604b.mo14992a(c38355i);
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    /* renamed from: n0 */
    private Float m14789n0(String str) throws SVGParseException {
        if (str.length() != 0) {
            int length = str.length();
            boolean z = true;
            if (str.charAt(str.length() - 1) == '%') {
                length--;
            } else {
                z = false;
            }
            try {
                float m14808g0 = m14808g0(str, 0, length);
                float f = 100.0f;
                if (z) {
                    m14808g0 /= 100.0f;
                }
                if (m14808g0 < 0.0f) {
                    f = 0.0f;
                } else if (m14808g0 <= 100.0f) {
                    f = m14808g0;
                }
                return Float.valueOf(f);
            } catch (NumberFormatException e) {
                throw new SVGParseException("Invalid offset value in <stop>: " + str, e);
            }
        }
        throw new SVGParseException("Invalid offset value in <stop> (empty string)");
    }

    /* renamed from: o0 */
    static SVG.C38369p m14787o0(String str) throws SVGParseException {
        if (str.length() != 0) {
            int length = str.length();
            SVG.EnumC38335d1 enumC38335d1 = SVG.EnumC38335d1.px;
            char charAt = str.charAt(length - 1);
            if (charAt == '%') {
                length--;
                enumC38335d1 = SVG.EnumC38335d1.percent;
            } else if (length > 2 && Character.isLetter(charAt) && Character.isLetter(str.charAt(length - 2))) {
                length -= 2;
                try {
                    enumC38335d1 = SVG.EnumC38335d1.valueOf(str.substring(length).toLowerCase(Locale.US));
                } catch (IllegalArgumentException unused) {
                    throw new SVGParseException("Invalid length unit specifier: " + str);
                }
            }
            try {
                return new SVG.C38369p(m14808g0(str, 0, length), enumC38335d1);
            } catch (NumberFormatException e) {
                throw new SVGParseException("Invalid length value: " + str, e);
            }
        }
        throw new SVGParseException("Invalid length value (empty string)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public void m14786p(String str, String str2, String str3) throws SVGParseException {
        if (this.f101605c) {
            int i = this.f101606d - 1;
            this.f101606d = i;
            if (i == 0) {
                this.f101605c = false;
                return;
            }
        }
        if (!"http://www.w3.org/2000/svg".equals(str) && !"".equals(str)) {
            return;
        }
        if (str2.length() <= 0) {
            str2 = str3;
        }
        int i2 = C38402a.f101612a[EnumC38409h.m14759b(str2).ordinal()];
        if (i2 != 1 && i2 != 2 && i2 != 4 && i2 != 5 && i2 != 13 && i2 != 14) {
            switch (i2) {
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 31:
                    break;
                case 22:
                case 23:
                    this.f101607e = false;
                    StringBuilder sb2 = this.f101609g;
                    if (sb2 != null) {
                        EnumC38409h enumC38409h = this.f101608f;
                        if (enumC38409h == EnumC38409h.title) {
                            this.f101603a.m15015y(sb2.toString());
                        } else if (enumC38409h == EnumC38409h.desc) {
                            this.f101603a.m15018v(sb2.toString());
                        }
                        this.f101609g.setLength(0);
                        return;
                    }
                    return;
                case 30:
                    StringBuilder sb3 = this.f101611i;
                    if (sb3 != null) {
                        this.f101610h = false;
                        m14829Z(sb3.toString());
                        this.f101611i.setLength(0);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
        this.f101604b = ((SVG.C38366n0) this.f101604b).f101491b;
    }

    /* renamed from: p0 */
    private static List<SVG.C38369p> m14785p0(String str) throws SVGParseException {
        if (str.length() != 0) {
            ArrayList arrayList = new ArrayList(1);
            C38410i c38410i = new C38410i(str);
            c38410i.m14758A();
            while (!c38410i.m14750h()) {
                float m14744n = c38410i.m14744n();
                if (!Float.isNaN(m14744n)) {
                    SVG.EnumC38335d1 m14736v = c38410i.m14736v();
                    if (m14736v == null) {
                        m14736v = SVG.EnumC38335d1.px;
                    }
                    arrayList.add(new SVG.C38369p(m14744n, m14736v));
                    c38410i.m14732z();
                } else {
                    throw new SVGParseException("Invalid length list value: " + c38410i.m14756b());
                }
            }
            return arrayList;
        }
        throw new SVGParseException("Invalid length list (empty string)");
    }

    /* renamed from: q */
    private void m14784q(Attributes attributes) throws SVGParseException {
        m14794l("<g>", new Object[0]);
        if (this.f101604b != null) {
            SVG.C38363m c38363m = new SVG.C38363m();
            c38363m.f101490a = this.f101603a;
            c38363m.f101491b = this.f101604b;
            m14873D(c38363m, attributes);
            m14843S(c38363m, attributes);
            m14835W(c38363m, attributes);
            m14875C(c38363m, attributes);
            this.f101604b.mo14992a(c38363m);
            this.f101604b = c38363m;
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    /* renamed from: q0 */
    private static SVG.C38369p m14783q0(C38410i c38410i) {
        if (c38410i.m14751g("auto")) {
            return new SVG.C38369p(0.0f);
        }
        return c38410i.m14742p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public void m14782r(String str, Map<String, String> map) {
        if (str.equals("xml-stylesheet")) {
            SVG.m15029k();
        }
    }

    /* renamed from: r0 */
    private static Float m14781r0(String str) {
        try {
            float m14811f0 = m14811f0(str);
            float f = 0.0f;
            if (m14811f0 >= 0.0f) {
                f = 1.0f;
                if (m14811f0 > 1.0f) {
                }
                return Float.valueOf(m14811f0);
            }
            m14811f0 = f;
            return Float.valueOf(m14811f0);
        } catch (SVGParseException unused) {
            return null;
        }
    }

    /* renamed from: s */
    private static int m14780s(float f, float f2, float f3) {
        float f4;
        float f5 = 0.0f;
        int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        float f6 = f % 360.0f;
        if (i < 0) {
            f6 += 360.0f;
        }
        float f7 = f6 / 60.0f;
        float f8 = f2 / 100.0f;
        float f9 = f3 / 100.0f;
        if (f8 < 0.0f) {
            f8 = 0.0f;
        } else if (f8 > 1.0f) {
            f8 = 1.0f;
        }
        if (f9 >= 0.0f) {
            if (f9 > 1.0f) {
                f5 = 1.0f;
            } else {
                f5 = f9;
            }
        }
        if (f5 <= 0.5f) {
            f4 = (f8 + 1.0f) * f5;
        } else {
            f4 = (f5 + f8) - (f8 * f5);
        }
        float f10 = (f5 * 2.0f) - f4;
        return m14800j(m14778t(f10, f4, f7 - 2.0f) * 256.0f) | (m14800j(m14778t(f10, f4, f7 + 2.0f) * 256.0f) << 16) | (m14800j(m14778t(f10, f4, f7) * 256.0f) << 8);
    }

    /* renamed from: s0 */
    private static Boolean m14779s0(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1217487446:
                if (str.equals("hidden")) {
                    c = 0;
                    break;
                }
                break;
            case -907680051:
                if (str.equals("scroll")) {
                    c = 1;
                    break;
                }
                break;
            case 3005871:
                if (str.equals("auto")) {
                    c = 2;
                    break;
                }
                break;
            case 466743410:
                if (str.equals("visible")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
                return Boolean.FALSE;
            case 2:
            case 3:
                return Boolean.TRUE;
            default:
                return null;
        }
    }

    /* renamed from: t */
    private static float m14778t(float f, float f2, float f3) {
        float f4;
        if (f3 < 0.0f) {
            f3 += 6.0f;
        }
        if (f3 >= 6.0f) {
            f3 -= 6.0f;
        }
        if (f3 < 1.0f) {
            f4 = (f2 - f) * f3;
        } else if (f3 < 3.0f) {
            return f2;
        } else {
            if (f3 < 4.0f) {
                f4 = (f2 - f) * (4.0f - f3);
            } else {
                return f;
            }
        }
        return f4 + f;
    }

    /* renamed from: t0 */
    private static SVG.AbstractC38368o0 m14777t0(String str) {
        if (str.startsWith("url(")) {
            int indexOf = str.indexOf(")");
            SVG.AbstractC38368o0 abstractC38368o0 = null;
            if (indexOf != -1) {
                String trim = str.substring(4, indexOf).trim();
                String trim2 = str.substring(indexOf + 1).trim();
                if (trim2.length() > 0) {
                    abstractC38368o0 = m14817d0(trim2);
                }
                return new SVG.C38379u(trim, abstractC38368o0);
            }
            return new SVG.C38379u(str.substring(4).trim(), null);
        }
        return m14817d0(str);
    }

    /* renamed from: u */
    private void m14776u(Attributes attributes) throws SVGParseException {
        m14794l("<image>", new Object[0]);
        if (this.f101604b != null) {
            SVG.C38367o c38367o = new SVG.C38367o();
            c38367o.f101490a = this.f101603a;
            c38367o.f101491b = this.f101604b;
            m14873D(c38367o, attributes);
            m14843S(c38367o, attributes);
            m14835W(c38367o, attributes);
            m14875C(c38367o, attributes);
            m14867G(c38367o, attributes);
            this.f101604b.mo14992a(c38367o);
            this.f101604b = c38367o;
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x02a4, code lost:
        return r9;
     */
    /* renamed from: u0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static p793n0.SVG.C38383w m14775u0(java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 760
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p793n0.SVGParser.m14775u0(java.lang.String):n0.h$w");
    }

    /* renamed from: v */
    private void m14774v(Attributes attributes) throws SVGParseException {
        m14794l("<line>", new Object[0]);
        if (this.f101604b != null) {
            SVG.C38371q c38371q = new SVG.C38371q();
            c38371q.f101490a = this.f101603a;
            c38371q.f101491b = this.f101604b;
            m14873D(c38371q, attributes);
            m14843S(c38371q, attributes);
            m14835W(c38371q, attributes);
            m14875C(c38371q, attributes);
            m14865H(c38371q, attributes);
            this.f101604b.mo14992a(c38371q);
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    /* renamed from: v0 */
    static PreserveAspectRatio m14773v0(String str) throws SVGParseException {
        PreserveAspectRatio.EnumC38322b enumC38322b;
        C38410i c38410i = new C38410i(str);
        c38410i.m14758A();
        String m14740r = c38410i.m14740r();
        if ("defer".equals(m14740r)) {
            c38410i.m14758A();
            m14740r = c38410i.m14740r();
        }
        PreserveAspectRatio.EnumC38321a m14764a = C38403b.m14764a(m14740r);
        c38410i.m14758A();
        if (!c38410i.m14750h()) {
            String m14740r2 = c38410i.m14740r();
            m14740r2.hashCode();
            if (!m14740r2.equals("meet")) {
                if (m14740r2.equals("slice")) {
                    enumC38322b = PreserveAspectRatio.EnumC38322b.slice;
                } else {
                    throw new SVGParseException("Invalid preserveAspectRatio definition: " + str);
                }
            } else {
                enumC38322b = PreserveAspectRatio.EnumC38322b.meet;
            }
        } else {
            enumC38322b = null;
        }
        return new PreserveAspectRatio(m14764a, enumC38322b);
    }

    /* renamed from: w */
    private void m14772w(Attributes attributes) throws SVGParseException {
        m14794l("<linearGradient>", new Object[0]);
        if (this.f101604b != null) {
            SVG.C38364m0 c38364m0 = new SVG.C38364m0();
            c38364m0.f101490a = this.f101603a;
            c38364m0.f101491b = this.f101604b;
            m14873D(c38364m0, attributes);
            m14843S(c38364m0, attributes);
            m14869F(c38364m0, attributes);
            m14863I(c38364m0, attributes);
            this.f101604b.mo14992a(c38364m0);
            this.f101604b = c38364m0;
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    /* renamed from: w0 */
    private static void m14771w0(SVG.AbstractC38370p0 abstractC38370p0, String str) throws SVGParseException {
        abstractC38370p0.f101500o = m14773v0(str);
    }

    /* renamed from: x */
    private void m14770x(Attributes attributes) throws SVGParseException {
        m14794l("<marker>", new Object[0]);
        if (this.f101604b != null) {
            SVG.C38373r c38373r = new SVG.C38373r();
            c38373r.f101490a = this.f101603a;
            c38373r.f101491b = this.f101604b;
            m14873D(c38373r, attributes);
            m14843S(c38373r, attributes);
            m14875C(c38373r, attributes);
            m14831Y(c38373r, attributes);
            m14861J(c38373r, attributes);
            this.f101604b.mo14992a(c38373r);
            this.f101604b = c38373r;
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x0 */
    public Map<String, String> m14769x0(C38410i c38410i) {
        HashMap hashMap = new HashMap();
        c38410i.m14758A();
        String m14739s = c38410i.m14739s(C20517nb.f52173T);
        while (m14739s != null) {
            c38410i.m14752f(C20517nb.f52173T);
            hashMap.put(m14739s, c38410i.m14741q());
            c38410i.m14758A();
            m14739s = c38410i.m14739s(C20517nb.f52173T);
        }
        return hashMap;
    }

    /* renamed from: y */
    private void m14768y(Attributes attributes) throws SVGParseException {
        m14794l("<mask>", new Object[0]);
        if (this.f101604b != null) {
            SVG.C38375s c38375s = new SVG.C38375s();
            c38375s.f101490a = this.f101603a;
            c38375s.f101491b = this.f101604b;
            m14873D(c38375s, attributes);
            m14843S(c38375s, attributes);
            m14875C(c38375s, attributes);
            m14859K(c38375s, attributes);
            this.f101604b.mo14992a(c38375s);
            this.f101604b = c38375s;
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    /* renamed from: y0 */
    private static SVG.C38337e0.EnumC38342e m14767y0(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -933002398:
                if (str.equals("optimizeQuality")) {
                    c = 0;
                    break;
                }
                break;
            case 3005871:
                if (str.equals("auto")) {
                    c = 1;
                    break;
                }
                break;
            case 362741610:
                if (str.equals("optimizeSpeed")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return SVG.C38337e0.EnumC38342e.optimizeQuality;
            case 1:
                return SVG.C38337e0.EnumC38342e.auto;
            case 2:
                return SVG.C38337e0.EnumC38342e.optimizeSpeed;
            default:
                return null;
        }
    }

    /* renamed from: z0 */
    private static Set<String> m14765z0(String str) {
        C38410i c38410i = new C38410i(str);
        HashSet hashSet = new HashSet();
        while (!c38410i.m14750h()) {
            String m14740r = c38410i.m14740r();
            if (m14740r.startsWith("http://www.w3.org/TR/SVG11/feature#")) {
                hashSet.add(m14740r.substring(35));
            } else {
                hashSet.add("UNSUPPORTED");
            }
            c38410i.m14758A();
        }
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public SVG m14766z(InputStream inputStream, boolean z) throws SVGParseException {
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream);
        }
        try {
            inputStream.mark(3);
            int read = inputStream.read() + (inputStream.read() << 8);
            inputStream.reset();
            if (read == 35615) {
                inputStream = new BufferedInputStream(new GZIPInputStream(inputStream));
            }
        } catch (IOException unused) {
        }
        try {
            inputStream.mark(4096);
            m14856L0(inputStream, z);
            return this.f101603a;
        } finally {
            try {
                inputStream.close();
            } catch (IOException unused2) {
                Log.e("SVGParser", "Exception thrown closing input stream");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public void m14788o() {
    }

    /* renamed from: l */
    private void m14794l(String str, Object... objArr) {
    }
}
