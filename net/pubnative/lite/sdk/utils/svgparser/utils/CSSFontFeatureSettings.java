package net.pubnative.lite.sdk.utils.svgparser.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.pubnative.lite.sdk.utils.svgparser.utils.Style;

/* loaded from: classes10.dex */
public class CSSFontFeatureSettings {
    static CSSFontFeatureSettings CAPS_ALL_OFF = null;
    static CSSFontFeatureSettings EAST_ASIAN_ALL_OFF = null;
    public static final String FEATURE_AFRC = "afrc";
    private static final String FEATURE_C2PC = "c2pc";
    private static final String FEATURE_C2SC = "c2sc";
    public static final String FEATURE_CALT = "calt";
    public static final String FEATURE_CLIG = "clig";
    public static final String FEATURE_DLIG = "dlig";
    public static final String FEATURE_FRAC = "frac";
    public static final String FEATURE_FWID = "fwid";
    public static final String FEATURE_HLIG = "hlig";
    public static final String FEATURE_JP04 = "jp04";
    public static final String FEATURE_JP78 = "jp78";
    public static final String FEATURE_JP83 = "jp83";
    public static final String FEATURE_JP90 = "jp90";
    public static final String FEATURE_KERN = "kern";
    public static final String FEATURE_LIGA = "liga";
    public static final String FEATURE_LNUM = "lnum";
    private static final String FEATURE_OFF = "off";
    private static final String FEATURE_ON = "on";
    public static final String FEATURE_ONUM = "onum";
    public static final String FEATURE_ORDN = "ordn";
    private static final String FEATURE_PCAP = "pcap";
    public static final String FEATURE_PNUM = "pnum";
    public static final String FEATURE_PWID = "pwid";
    public static final String FEATURE_RUBY = "ruby";
    private static final String FEATURE_SMCP = "smcp";
    public static final String FEATURE_SMPL = "smpl";
    private static final String FEATURE_SUBS = "subs";
    private static final String FEATURE_SUPS = "sups";
    private static final String FEATURE_TITL = "titl";
    public static final String FEATURE_TNUM = "tnum";
    public static final String FEATURE_TRAD = "trad";
    private static final String FEATURE_UNIC = "unic";
    public static final String FEATURE_ZERO = "zero";
    private static final String FONT_VARIANT_ALL_PETITE_CAPS = "all-petite-caps";
    private static final String FONT_VARIANT_ALL_SMALL_CAPS = "all-small-caps";
    private static final String FONT_VARIANT_AUTO = "auto";
    private static final String FONT_VARIANT_COMMON_LIGATURES = "common-ligatures";
    private static final String FONT_VARIANT_CONTEXTUAL_LIGATURES = "contextual";
    private static final String FONT_VARIANT_DIAGONAL_FRACTIONS = "diagonal-fractions";
    private static final String FONT_VARIANT_DISCRETIONARY_LIGATURES = "discretionary-ligatures";
    private static final String FONT_VARIANT_FULL_WIDTH = "full-width";
    private static final String FONT_VARIANT_HISTORICAL_LIGATURES = "historical-ligatures";
    private static final String FONT_VARIANT_JIS04 = "jis04";
    private static final String FONT_VARIANT_JIS78 = "jis78";
    private static final String FONT_VARIANT_JIS83 = "jis83";
    private static final String FONT_VARIANT_JIS90 = "jis90";
    private static final String FONT_VARIANT_LINING_NUMS = "lining-nums";
    private static final String FONT_VARIANT_NONE = "none";
    static final String FONT_VARIANT_NORMAL = "normal";
    private static final String FONT_VARIANT_NO_COMMON_LIGATURES = "no-common-ligatures";
    private static final String FONT_VARIANT_NO_CONTEXTUAL_LIGATURES = "no-contextual";
    private static final String FONT_VARIANT_NO_DISCRETIONARY_LIGATURES = "no-discretionary-ligatures";
    private static final String FONT_VARIANT_NO_HISTORICAL_LIGATURES = "no-historical-ligatures";
    private static final String FONT_VARIANT_OLDSTYLE_NUMS = "oldstyle-nums";
    private static final String FONT_VARIANT_ORDINAL = "ordinal";
    private static final String FONT_VARIANT_PETITE_CAPS = "petite-caps";
    private static final String FONT_VARIANT_PROPORTIONAL_NUMS = "proportional-nums";
    private static final String FONT_VARIANT_PROPORTIONAL_WIDTH = "proportional-width";
    private static final String FONT_VARIANT_RUBY = "ruby";
    private static final String FONT_VARIANT_SIMPLIFIED = "simplified";
    private static final String FONT_VARIANT_SLASHED_ZERO = "slashed-zero";
    static final String FONT_VARIANT_SMALL_CAPS = "small-caps";
    private static final String FONT_VARIANT_STACKED_FRACTIONS = "stacked-fractions";
    private static final String FONT_VARIANT_SUB = "sub";
    private static final String FONT_VARIANT_SUPER = "super";
    private static final String FONT_VARIANT_TABULAR_NUMS = "tabular-nums";
    private static final String FONT_VARIANT_TITLING_CAPS = "titling-caps";
    private static final String FONT_VARIANT_TRADITIONAL = "traditional";
    private static final String FONT_VARIANT_UNICASE = "unicase";
    static CSSFontFeatureSettings LIGATURES_NORMAL = null;
    static CSSFontFeatureSettings NUMERIC_ALL_OFF = null;
    static CSSFontFeatureSettings POSITION_ALL_OFF = null;
    private static final String TOKEN_ERROR = "ERR";
    private static final int VALUE_OFF = 0;
    private static final int VALUE_ON = 1;
    private final HashMap<String, Integer> settings;
    public static final CSSFontFeatureSettings FONT_FEATURE_SETTINGS_NORMAL = makeDefaultSettings();
    public static final CSSFontFeatureSettings ERROR = new CSSFontFeatureSettings((HashMap<String, Integer>) null);
    private static CSSFontFeatureSettings LIGATURES_ALL_OFF = null;
    private static CSSFontFeatureSettings CAPS_SMALL_CAPS = null;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes10.dex */
    public static class FontFeatureEntry {
        String name;
        int val;

        public FontFeatureEntry(String str, int i) {
            this.name = str;
            this.val = i;
        }
    }

    static {
        LIGATURES_NORMAL = null;
        POSITION_ALL_OFF = null;
        CAPS_ALL_OFF = null;
        NUMERIC_ALL_OFF = null;
        EAST_ASIAN_ALL_OFF = null;
        CSSFontFeatureSettings cSSFontFeatureSettings = new CSSFontFeatureSettings();
        LIGATURES_NORMAL = cSSFontFeatureSettings;
        cSSFontFeatureSettings.settings.put(FEATURE_LIGA, 1);
        LIGATURES_NORMAL.settings.put(FEATURE_CLIG, 1);
        LIGATURES_NORMAL.settings.put(FEATURE_DLIG, 0);
        LIGATURES_NORMAL.settings.put(FEATURE_HLIG, 0);
        LIGATURES_NORMAL.settings.put(FEATURE_CALT, 1);
        CSSFontFeatureSettings cSSFontFeatureSettings2 = new CSSFontFeatureSettings();
        POSITION_ALL_OFF = cSSFontFeatureSettings2;
        cSSFontFeatureSettings2.settings.put("subs", 0);
        POSITION_ALL_OFF.settings.put(FEATURE_SUPS, 0);
        CSSFontFeatureSettings cSSFontFeatureSettings3 = new CSSFontFeatureSettings();
        CAPS_ALL_OFF = cSSFontFeatureSettings3;
        cSSFontFeatureSettings3.settings.put(FEATURE_SMCP, 0);
        CAPS_ALL_OFF.settings.put(FEATURE_C2SC, 0);
        CAPS_ALL_OFF.settings.put(FEATURE_PCAP, 0);
        CAPS_ALL_OFF.settings.put(FEATURE_C2PC, 0);
        CAPS_ALL_OFF.settings.put(FEATURE_UNIC, 0);
        CAPS_ALL_OFF.settings.put(FEATURE_TITL, 0);
        CSSFontFeatureSettings cSSFontFeatureSettings4 = new CSSFontFeatureSettings();
        NUMERIC_ALL_OFF = cSSFontFeatureSettings4;
        cSSFontFeatureSettings4.settings.put(FEATURE_LNUM, 0);
        NUMERIC_ALL_OFF.settings.put(FEATURE_ONUM, 0);
        NUMERIC_ALL_OFF.settings.put(FEATURE_PNUM, 0);
        NUMERIC_ALL_OFF.settings.put(FEATURE_TNUM, 0);
        NUMERIC_ALL_OFF.settings.put(FEATURE_FRAC, 0);
        NUMERIC_ALL_OFF.settings.put(FEATURE_AFRC, 0);
        NUMERIC_ALL_OFF.settings.put(FEATURE_ORDN, 0);
        NUMERIC_ALL_OFF.settings.put(FEATURE_ZERO, 0);
        CSSFontFeatureSettings cSSFontFeatureSettings5 = new CSSFontFeatureSettings();
        EAST_ASIAN_ALL_OFF = cSSFontFeatureSettings5;
        cSSFontFeatureSettings5.settings.put(FEATURE_JP78, 0);
        EAST_ASIAN_ALL_OFF.settings.put(FEATURE_JP83, 0);
        EAST_ASIAN_ALL_OFF.settings.put(FEATURE_JP90, 0);
        EAST_ASIAN_ALL_OFF.settings.put(FEATURE_JP04, 0);
        EAST_ASIAN_ALL_OFF.settings.put(FEATURE_SMPL, 0);
        EAST_ASIAN_ALL_OFF.settings.put(FEATURE_TRAD, 0);
        EAST_ASIAN_ALL_OFF.settings.put(FEATURE_FWID, 0);
        EAST_ASIAN_ALL_OFF.settings.put(FEATURE_PWID, 0);
        EAST_ASIAN_ALL_OFF.settings.put("ruby", 0);
    }

    public CSSFontFeatureSettings() {
        this.settings = new HashMap<>();
    }

    private void addSettings(String str, String str2, int i) {
        this.settings.put(str, Integer.valueOf(i));
        this.settings.put(str2, Integer.valueOf(i));
    }

    private static int containsOnce(List<String> list, String str) {
        if (list.remove(str)) {
            if (list.contains(str)) {
                return 2;
            }
            return 1;
        }
        return 0;
    }

    private static String containsOneOf(List<String> list, String... strArr) {
        String str = null;
        for (String str2 : strArr) {
            if (str == null && list.remove(str2)) {
                str = str2;
            }
            if (list.contains(str2)) {
                return TOKEN_ERROR;
            }
        }
        return str;
    }

    private static int containsWhich(List<String> list, String str, String str2) {
        if (list.remove(str)) {
            if (list.contains(str) || list.contains(str2)) {
                return 3;
            }
            return 1;
        } else if (list.remove(str2)) {
            if (list.contains(str2)) {
                return 3;
            }
            return 2;
        } else {
            return 0;
        }
    }

    private static void ensureLigaturesNone() {
        if (LIGATURES_ALL_OFF != null) {
            return;
        }
        CSSFontFeatureSettings cSSFontFeatureSettings = new CSSFontFeatureSettings();
        cSSFontFeatureSettings.settings.put(FEATURE_LIGA, 0);
        cSSFontFeatureSettings.settings.put(FEATURE_CLIG, 0);
        cSSFontFeatureSettings.settings.put(FEATURE_DLIG, 0);
        cSSFontFeatureSettings.settings.put(FEATURE_HLIG, 0);
        cSSFontFeatureSettings.settings.put(FEATURE_CALT, 0);
        LIGATURES_ALL_OFF = cSSFontFeatureSettings;
    }

    private void ensurePositionNormal() {
        if (POSITION_ALL_OFF == null) {
            CSSFontFeatureSettings cSSFontFeatureSettings = new CSSFontFeatureSettings();
            cSSFontFeatureSettings.settings.put("subs", 0);
            cSSFontFeatureSettings.settings.put(FEATURE_SUPS, 0);
            POSITION_ALL_OFF = cSSFontFeatureSettings;
        }
    }

    private static List<String> extractTokensAsList(String str) {
        TextScanner textScanner = new TextScanner(str);
        textScanner.skipWhitespace();
        if (textScanner.empty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        while (!textScanner.empty()) {
            arrayList.add(textScanner.nextToken());
            textScanner.skipWhitespace();
        }
        return arrayList;
    }

    private static final CSSFontFeatureSettings makeDefaultSettings() {
        CSSFontFeatureSettings cSSFontFeatureSettings = new CSSFontFeatureSettings();
        cSSFontFeatureSettings.settings.put("rlig", 1);
        cSSFontFeatureSettings.settings.put(FEATURE_LIGA, 1);
        cSSFontFeatureSettings.settings.put(FEATURE_CLIG, 1);
        cSSFontFeatureSettings.settings.put(FEATURE_CALT, 1);
        cSSFontFeatureSettings.settings.put("locl", 1);
        cSSFontFeatureSettings.settings.put("ccmp", 1);
        cSSFontFeatureSettings.settings.put("mark", 1);
        cSSFontFeatureSettings.settings.put("mkmk", 1);
        return cSSFontFeatureSettings;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static CSSFontFeatureSettings makeSmallCaps() {
        if (CAPS_SMALL_CAPS == null) {
            CSSFontFeatureSettings cSSFontFeatureSettings = new CSSFontFeatureSettings();
            CAPS_SMALL_CAPS = cSSFontFeatureSettings;
            cSSFontFeatureSettings.settings.put(FEATURE_SMCP, 1);
            CAPS_SMALL_CAPS.settings.put(FEATURE_C2SC, 0);
            CAPS_SMALL_CAPS.settings.put(FEATURE_PCAP, 0);
            CAPS_SMALL_CAPS.settings.put(FEATURE_C2PC, 0);
            CAPS_SMALL_CAPS.settings.put(FEATURE_UNIC, 0);
            CAPS_SMALL_CAPS.settings.put(FEATURE_TITL, 0);
        }
        return CAPS_SMALL_CAPS;
    }

    private static FontFeatureEntry nextFeatureEntry(TextScanner textScanner) {
        int i;
        textScanner.skipWhitespace();
        String nextQuotedString = textScanner.nextQuotedString();
        if (nextQuotedString != null && nextQuotedString.length() == 4) {
            textScanner.skipWhitespace();
            if (!textScanner.empty()) {
                i = 0;
                Integer nextInteger = textScanner.nextInteger(false);
                if (nextInteger == null) {
                    if (!textScanner.consume(FEATURE_OFF)) {
                        textScanner.consume(FEATURE_ON);
                    }
                } else {
                    i = nextInteger.intValue();
                }
                return new FontFeatureEntry(nextQuotedString, i);
            }
            i = 1;
            return new FontFeatureEntry(nextQuotedString, i);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static CSSFontFeatureSettings parseEastAsian(String str) {
        CSSFontFeatureSettings parseVariantEastAsianSpecial;
        if (str.equals(FONT_VARIANT_NORMAL)) {
            return EAST_ASIAN_ALL_OFF;
        }
        List<String> extractTokensAsList = extractTokensAsList(str);
        if (extractTokensAsList == null || (parseVariantEastAsianSpecial = parseVariantEastAsianSpecial(extractTokensAsList)) == null || parseVariantEastAsianSpecial == ERROR || extractTokensAsList.size() > 0) {
            return null;
        }
        return parseVariantEastAsianSpecial;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static CSSFontFeatureSettings parseFontFeatureSettings(String str) {
        CSSFontFeatureSettings cSSFontFeatureSettings = new CSSFontFeatureSettings();
        TextScanner textScanner = new TextScanner(str);
        textScanner.skipWhitespace();
        while (!textScanner.empty()) {
            FontFeatureEntry nextFeatureEntry = nextFeatureEntry(textScanner);
            if (nextFeatureEntry == null) {
                return null;
            }
            cSSFontFeatureSettings.settings.put(nextFeatureEntry.name, Integer.valueOf(nextFeatureEntry.val));
            textScanner.skipCommaWhitespace();
        }
        return cSSFontFeatureSettings;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Style.FontKerning parseFontKerning(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1039745817:
                if (str.equals(FONT_VARIANT_NORMAL)) {
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
            case 3387192:
                if (str.equals("none")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return Style.FontKerning.normal;
            case 1:
                return Style.FontKerning.auto;
            case 2:
                return Style.FontKerning.none;
            default:
                return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void parseFontVariant(Style style, String str) {
        CSSFontFeatureSettings parseVariantLigaturesSpecial;
        CSSFontFeatureSettings cSSFontFeatureSettings;
        CSSFontFeatureSettings cSSFontFeatureSettings2;
        CSSFontFeatureSettings cSSFontFeatureSettings3;
        CSSFontFeatureSettings cSSFontFeatureSettings4;
        if (str.equals(FONT_VARIANT_NORMAL)) {
            style.fontVariantLigatures = LIGATURES_NORMAL;
            style.fontVariantPosition = POSITION_ALL_OFF;
            style.fontVariantCaps = CAPS_ALL_OFF;
            style.fontVariantNumeric = NUMERIC_ALL_OFF;
            style.fontVariantEastAsian = EAST_ASIAN_ALL_OFF;
            style.specifiedFlags |= 34084860461056L;
        } else if (str.equals("none")) {
            ensureLigaturesNone();
            style.fontVariantLigatures = LIGATURES_ALL_OFF;
            style.fontVariantPosition = POSITION_ALL_OFF;
            style.fontVariantCaps = CAPS_ALL_OFF;
            style.fontVariantNumeric = NUMERIC_ALL_OFF;
            style.fontVariantEastAsian = EAST_ASIAN_ALL_OFF;
            style.specifiedFlags |= 34084860461056L;
        } else {
            List<String> extractTokensAsList = extractTokensAsList(str);
            if (extractTokensAsList == null || (parseVariantLigaturesSpecial = parseVariantLigaturesSpecial(extractTokensAsList)) == (cSSFontFeatureSettings = ERROR)) {
                return;
            }
            CSSFontFeatureSettings cSSFontFeatureSettings5 = null;
            if (extractTokensAsList.size() > 0) {
                cSSFontFeatureSettings2 = parseVariantPositionSpecial(extractTokensAsList);
                if (cSSFontFeatureSettings2 == cSSFontFeatureSettings) {
                    return;
                }
            } else {
                cSSFontFeatureSettings2 = null;
            }
            if (extractTokensAsList.size() > 0) {
                cSSFontFeatureSettings3 = parseVariantCapsSpecial(extractTokensAsList);
                if (cSSFontFeatureSettings3 == cSSFontFeatureSettings) {
                    return;
                }
            } else {
                cSSFontFeatureSettings3 = null;
            }
            if (extractTokensAsList.size() > 0) {
                cSSFontFeatureSettings4 = parseVariantNumericSpecial(extractTokensAsList);
                if (cSSFontFeatureSettings4 == cSSFontFeatureSettings) {
                    return;
                }
            } else {
                cSSFontFeatureSettings4 = null;
            }
            if (extractTokensAsList.size() > 0 && (cSSFontFeatureSettings5 = parseVariantEastAsianSpecial(extractTokensAsList)) == cSSFontFeatureSettings) {
                return;
            }
            if (parseVariantLigaturesSpecial != null) {
                style.fontVariantLigatures = parseVariantLigaturesSpecial;
                style.specifiedFlags |= 1099511627776L;
            }
            if (cSSFontFeatureSettings2 != null) {
                style.fontVariantPosition = cSSFontFeatureSettings2;
                style.specifiedFlags |= 2199023255552L;
            }
            if (cSSFontFeatureSettings3 != null) {
                style.fontVariantCaps = cSSFontFeatureSettings3;
                style.specifiedFlags |= 4398046511104L;
            }
            if (cSSFontFeatureSettings4 != null) {
                style.fontVariantNumeric = cSSFontFeatureSettings4;
                style.specifiedFlags |= 8796093022208L;
            }
            if (cSSFontFeatureSettings5 != null) {
                style.fontVariantEastAsian = cSSFontFeatureSettings5;
                style.specifiedFlags |= 17592186044416L;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static CSSFontFeatureSettings parseVariantCaps(String str) {
        if (str.equals(FONT_VARIANT_NORMAL)) {
            return CAPS_ALL_OFF;
        }
        CSSFontFeatureSettings cSSFontFeatureSettings = new CSSFontFeatureSettings(CAPS_ALL_OFF);
        if (!setCapsFeature(cSSFontFeatureSettings, str)) {
            return null;
        }
        return cSSFontFeatureSettings;
    }

    private static CSSFontFeatureSettings parseVariantCapsSpecial(List<String> list) {
        CSSFontFeatureSettings cSSFontFeatureSettings = new CSSFontFeatureSettings(CAPS_ALL_OFF);
        String containsOneOf = containsOneOf(list, FONT_VARIANT_SMALL_CAPS, FONT_VARIANT_ALL_SMALL_CAPS, FONT_VARIANT_PETITE_CAPS, FONT_VARIANT_ALL_PETITE_CAPS, FONT_VARIANT_UNICASE, FONT_VARIANT_TITLING_CAPS);
        if (containsOneOf == TOKEN_ERROR) {
            return ERROR;
        }
        if (containsOneOf == null) {
            return null;
        }
        setCapsFeature(cSSFontFeatureSettings, containsOneOf);
        return cSSFontFeatureSettings;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0077, code lost:
        if (r1.equals(net.pubnative.lite.sdk.utils.svgparser.utils.CSSFontFeatureSettings.FONT_VARIANT_TRADITIONAL) == false) goto L5;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ea A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static net.pubnative.lite.sdk.utils.svgparser.utils.CSSFontFeatureSettings parseVariantEastAsianSpecial(java.util.List<java.lang.String> r9) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: net.pubnative.lite.sdk.utils.svgparser.utils.CSSFontFeatureSettings.parseVariantEastAsianSpecial(java.util.List):net.pubnative.lite.sdk.utils.svgparser.utils.CSSFontFeatureSettings");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static CSSFontFeatureSettings parseVariantLigatures(String str) {
        if (str.equals(FONT_VARIANT_NORMAL)) {
            return LIGATURES_NORMAL;
        }
        if (str.equals("none")) {
            ensureLigaturesNone();
            return LIGATURES_ALL_OFF;
        }
        List<String> extractTokensAsList = extractTokensAsList(str);
        if (extractTokensAsList == null) {
            return null;
        }
        ensureLigaturesNone();
        CSSFontFeatureSettings parseVariantLigaturesSpecial = parseVariantLigaturesSpecial(extractTokensAsList);
        if (parseVariantLigaturesSpecial == null || parseVariantLigaturesSpecial == ERROR || extractTokensAsList.size() > 0) {
            return null;
        }
        return parseVariantLigaturesSpecial;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a8 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static net.pubnative.lite.sdk.utils.svgparser.utils.CSSFontFeatureSettings parseVariantLigaturesSpecial(java.util.List<java.lang.String> r8) {
        /*
            ensureLigaturesNone()
            net.pubnative.lite.sdk.utils.svgparser.utils.CSSFontFeatureSettings r0 = new net.pubnative.lite.sdk.utils.svgparser.utils.CSSFontFeatureSettings
            net.pubnative.lite.sdk.utils.svgparser.utils.CSSFontFeatureSettings r1 = net.pubnative.lite.sdk.utils.svgparser.utils.CSSFontFeatureSettings.LIGATURES_ALL_OFF
            r0.<init>(r1)
            java.lang.String r1 = "common-ligatures"
            java.lang.String r2 = "no-common-ligatures"
            int r1 = containsWhich(r8, r1, r2)
            java.lang.String r2 = "liga"
            java.lang.String r3 = "clig"
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r1 == r6) goto L29
            if (r1 == r5) goto L25
            if (r1 == r4) goto L22
            r1 = r7
            goto L2d
        L22:
            net.pubnative.lite.sdk.utils.svgparser.utils.CSSFontFeatureSettings r8 = net.pubnative.lite.sdk.utils.svgparser.utils.CSSFontFeatureSettings.ERROR
            return r8
        L25:
            r0.addSettings(r3, r2, r7)
            goto L2c
        L29:
            r0.addSettings(r3, r2, r6)
        L2c:
            r1 = r6
        L2d:
            java.lang.String r2 = "discretionary-ligatures"
            java.lang.String r3 = "no-discretionary-ligatures"
            int r2 = containsWhich(r8, r2, r3)
            java.lang.String r3 = "dlig"
            if (r2 == r6) goto L4b
            if (r2 == r5) goto L41
            if (r2 == r4) goto L3e
            goto L55
        L3e:
            net.pubnative.lite.sdk.utils.svgparser.utils.CSSFontFeatureSettings r8 = net.pubnative.lite.sdk.utils.svgparser.utils.CSSFontFeatureSettings.ERROR
            return r8
        L41:
            java.util.HashMap<java.lang.String, java.lang.Integer> r1 = r0.settings
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            r1.put(r3, r2)
            goto L54
        L4b:
            java.util.HashMap<java.lang.String, java.lang.Integer> r1 = r0.settings
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            r1.put(r3, r2)
        L54:
            r1 = r6
        L55:
            java.lang.String r2 = "historical-ligatures"
            java.lang.String r3 = "no-historical-ligatures"
            int r2 = containsWhich(r8, r2, r3)
            java.lang.String r3 = "hlig"
            if (r2 == r6) goto L73
            if (r2 == r5) goto L69
            if (r2 == r4) goto L66
            goto L7d
        L66:
            net.pubnative.lite.sdk.utils.svgparser.utils.CSSFontFeatureSettings r8 = net.pubnative.lite.sdk.utils.svgparser.utils.CSSFontFeatureSettings.ERROR
            return r8
        L69:
            java.util.HashMap<java.lang.String, java.lang.Integer> r1 = r0.settings
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            r1.put(r3, r2)
            goto L7c
        L73:
            java.util.HashMap<java.lang.String, java.lang.Integer> r1 = r0.settings
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            r1.put(r3, r2)
        L7c:
            r1 = r6
        L7d:
            java.lang.String r2 = "contextual"
            java.lang.String r3 = "no-contextual"
            int r8 = containsWhich(r8, r2, r3)
            java.lang.String r2 = "calt"
            if (r8 == r6) goto L9c
            if (r8 == r5) goto L92
            if (r8 == r4) goto L8f
            r6 = r1
            goto La5
        L8f:
            net.pubnative.lite.sdk.utils.svgparser.utils.CSSFontFeatureSettings r8 = net.pubnative.lite.sdk.utils.svgparser.utils.CSSFontFeatureSettings.ERROR
            return r8
        L92:
            java.util.HashMap<java.lang.String, java.lang.Integer> r8 = r0.settings
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r8.put(r2, r1)
            goto La5
        L9c:
            java.util.HashMap<java.lang.String, java.lang.Integer> r8 = r0.settings
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            r8.put(r2, r1)
        La5:
            if (r6 == 0) goto La8
            goto La9
        La8:
            r0 = 0
        La9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: net.pubnative.lite.sdk.utils.svgparser.utils.CSSFontFeatureSettings.parseVariantLigaturesSpecial(java.util.List):net.pubnative.lite.sdk.utils.svgparser.utils.CSSFontFeatureSettings");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static CSSFontFeatureSettings parseVariantNumeric(String str) {
        CSSFontFeatureSettings parseVariantNumericSpecial;
        if (str.equals(FONT_VARIANT_NORMAL)) {
            return NUMERIC_ALL_OFF;
        }
        List<String> extractTokensAsList = extractTokensAsList(str);
        if (extractTokensAsList == null || (parseVariantNumericSpecial = parseVariantNumericSpecial(extractTokensAsList)) == null || parseVariantNumericSpecial == ERROR || extractTokensAsList.size() > 0) {
            return null;
        }
        return parseVariantNumericSpecial;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c0 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static net.pubnative.lite.sdk.utils.svgparser.utils.CSSFontFeatureSettings parseVariantNumericSpecial(java.util.List<java.lang.String> r7) {
        /*
            net.pubnative.lite.sdk.utils.svgparser.utils.CSSFontFeatureSettings r0 = new net.pubnative.lite.sdk.utils.svgparser.utils.CSSFontFeatureSettings
            net.pubnative.lite.sdk.utils.svgparser.utils.CSSFontFeatureSettings r1 = net.pubnative.lite.sdk.utils.svgparser.utils.CSSFontFeatureSettings.NUMERIC_ALL_OFF
            r0.<init>(r1)
            java.lang.String r1 = "lining-nums"
            java.lang.String r2 = "oldstyle-nums"
            int r1 = containsWhich(r7, r1, r2)
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == r4) goto L29
            if (r1 == r3) goto L1d
            if (r1 == r2) goto L1a
            r1 = 0
            goto L35
        L1a:
            net.pubnative.lite.sdk.utils.svgparser.utils.CSSFontFeatureSettings r7 = net.pubnative.lite.sdk.utils.svgparser.utils.CSSFontFeatureSettings.ERROR
            return r7
        L1d:
            java.util.HashMap<java.lang.String, java.lang.Integer> r1 = r0.settings
            java.lang.String r5 = "onum"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            r1.put(r5, r6)
            goto L34
        L29:
            java.util.HashMap<java.lang.String, java.lang.Integer> r1 = r0.settings
            java.lang.String r5 = "lnum"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            r1.put(r5, r6)
        L34:
            r1 = r4
        L35:
            java.lang.String r5 = "proportional-nums"
            java.lang.String r6 = "tabular-nums"
            int r5 = containsWhich(r7, r5, r6)
            if (r5 == r4) goto L53
            if (r5 == r3) goto L47
            if (r5 == r2) goto L44
            goto L5f
        L44:
            net.pubnative.lite.sdk.utils.svgparser.utils.CSSFontFeatureSettings r7 = net.pubnative.lite.sdk.utils.svgparser.utils.CSSFontFeatureSettings.ERROR
            return r7
        L47:
            java.util.HashMap<java.lang.String, java.lang.Integer> r1 = r0.settings
            java.lang.String r5 = "tnum"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            r1.put(r5, r6)
            goto L5e
        L53:
            java.util.HashMap<java.lang.String, java.lang.Integer> r1 = r0.settings
            java.lang.String r5 = "pnum"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            r1.put(r5, r6)
        L5e:
            r1 = r4
        L5f:
            java.lang.String r5 = "diagonal-fractions"
            java.lang.String r6 = "stacked-fractions"
            int r5 = containsWhich(r7, r5, r6)
            if (r5 == r4) goto L7d
            if (r5 == r3) goto L71
            if (r5 == r2) goto L6e
            goto L89
        L6e:
            net.pubnative.lite.sdk.utils.svgparser.utils.CSSFontFeatureSettings r7 = net.pubnative.lite.sdk.utils.svgparser.utils.CSSFontFeatureSettings.ERROR
            return r7
        L71:
            java.util.HashMap<java.lang.String, java.lang.Integer> r1 = r0.settings
            java.lang.String r2 = "afrc"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r1.put(r2, r5)
            goto L88
        L7d:
            java.util.HashMap<java.lang.String, java.lang.Integer> r1 = r0.settings
            java.lang.String r2 = "frac"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r1.put(r2, r5)
        L88:
            r1 = r4
        L89:
            java.lang.String r2 = "ordinal"
            int r2 = containsOnce(r7, r2)
            if (r2 == r4) goto L97
            if (r2 == r3) goto L94
            goto La3
        L94:
            net.pubnative.lite.sdk.utils.svgparser.utils.CSSFontFeatureSettings r7 = net.pubnative.lite.sdk.utils.svgparser.utils.CSSFontFeatureSettings.ERROR
            return r7
        L97:
            java.util.HashMap<java.lang.String, java.lang.Integer> r1 = r0.settings
            java.lang.String r2 = "ordn"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r1.put(r2, r5)
            r1 = r4
        La3:
            java.lang.String r2 = "slashed-zero"
            int r7 = containsOnce(r7, r2)
            if (r7 == r4) goto Lb2
            if (r7 == r3) goto Laf
            r4 = r1
            goto Lbd
        Laf:
            net.pubnative.lite.sdk.utils.svgparser.utils.CSSFontFeatureSettings r7 = net.pubnative.lite.sdk.utils.svgparser.utils.CSSFontFeatureSettings.ERROR
            return r7
        Lb2:
            java.util.HashMap<java.lang.String, java.lang.Integer> r7 = r0.settings
            java.lang.String r1 = "zero"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r7.put(r1, r2)
        Lbd:
            if (r4 == 0) goto Lc0
            goto Lc1
        Lc0:
            r0 = 0
        Lc1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: net.pubnative.lite.sdk.utils.svgparser.utils.CSSFontFeatureSettings.parseVariantNumericSpecial(java.util.List):net.pubnative.lite.sdk.utils.svgparser.utils.CSSFontFeatureSettings");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static CSSFontFeatureSettings parseVariantPosition(String str) {
        if (str.equals(FONT_VARIANT_NORMAL)) {
            return POSITION_ALL_OFF;
        }
        CSSFontFeatureSettings cSSFontFeatureSettings = new CSSFontFeatureSettings(POSITION_ALL_OFF);
        if (!str.equals("sub")) {
            if (!str.equals(FONT_VARIANT_SUPER)) {
                return null;
            }
            cSSFontFeatureSettings.settings.put(FEATURE_SUPS, 1);
        } else {
            cSSFontFeatureSettings.settings.put("subs", 1);
        }
        return cSSFontFeatureSettings;
    }

    private static CSSFontFeatureSettings parseVariantPositionSpecial(List<String> list) {
        CSSFontFeatureSettings cSSFontFeatureSettings = new CSSFontFeatureSettings(POSITION_ALL_OFF);
        int containsWhich = containsWhich(list, "sub", FONT_VARIANT_SUPER);
        boolean z = true;
        if (containsWhich != 1) {
            if (containsWhich != 2) {
                if (containsWhich != 3) {
                    z = false;
                } else {
                    return ERROR;
                }
            } else {
                cSSFontFeatureSettings.settings.put(FEATURE_SUPS, 1);
            }
        } else {
            cSSFontFeatureSettings.settings.put("subs", 1);
        }
        if (!z) {
            return null;
        }
        return cSSFontFeatureSettings;
    }

    private static boolean setCapsFeature(CSSFontFeatureSettings cSSFontFeatureSettings, String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -718866279:
                if (str.equals(FONT_VARIANT_TITLING_CAPS)) {
                    c = 0;
                    break;
                }
                break;
            case -436377709:
                if (str.equals(FONT_VARIANT_ALL_SMALL_CAPS)) {
                    c = 1;
                    break;
                }
                break;
            case -287029216:
                if (str.equals(FONT_VARIANT_UNICASE)) {
                    c = 2;
                    break;
                }
                break;
            case -155552173:
                if (str.equals(FONT_VARIANT_PETITE_CAPS)) {
                    c = 3;
                    break;
                }
                break;
            case 1173329959:
                if (str.equals(FONT_VARIANT_ALL_PETITE_CAPS)) {
                    c = 4;
                    break;
                }
                break;
            case 1183323111:
                if (str.equals(FONT_VARIANT_SMALL_CAPS)) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                cSSFontFeatureSettings.settings.put(FEATURE_TITL, 1);
                break;
            case 1:
                cSSFontFeatureSettings.addSettings(FEATURE_SMCP, FEATURE_C2SC, 1);
                break;
            case 2:
                cSSFontFeatureSettings.settings.put(FEATURE_UNIC, 1);
                break;
            case 3:
                cSSFontFeatureSettings.settings.put(FEATURE_PCAP, 1);
                break;
            case 4:
                cSSFontFeatureSettings.addSettings(FEATURE_PCAP, FEATURE_C2PC, 1);
                break;
            case 5:
                cSSFontFeatureSettings.settings.put(FEATURE_SMCP, 1);
                break;
            default:
                return false;
        }
        return true;
    }

    public void applyKerning(Style.FontKerning fontKerning) {
        if (fontKerning == Style.FontKerning.none) {
            this.settings.put(FEATURE_KERN, 0);
        } else {
            this.settings.put(FEATURE_KERN, 1);
        }
    }

    public void applySettings(CSSFontFeatureSettings cSSFontFeatureSettings) {
        if (cSSFontFeatureSettings == null) {
            return;
        }
        this.settings.putAll(cSSFontFeatureSettings.settings);
    }

    public boolean hasSettings() {
        if (this.settings.size() > 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry<String, Integer> entry : this.settings.entrySet()) {
            if (sb2.length() > 0) {
                sb2.append(',');
            }
            sb2.append("'");
            sb2.append(entry.getKey());
            sb2.append("' ");
            sb2.append(entry.getValue());
        }
        return sb2.toString();
    }

    private CSSFontFeatureSettings(HashMap<String, Integer> hashMap) {
        this.settings = hashMap;
    }

    public CSSFontFeatureSettings(CSSFontFeatureSettings cSSFontFeatureSettings) {
        this.settings = new HashMap<>(cSSFontFeatureSettings.settings);
    }
}
