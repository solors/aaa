package net.pubnative.lite.sdk.utils.svgparser.utils;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes10.dex */
public class CSSFontVariationSettings {
    private static final String NORMAL = "normal";
    static final String VARIATION_ITALIC = "ital";
    static final String VARIATION_OBLIQUE = "slnt";
    static final String VARIATION_WEIGHT = "wght";
    static final String VARIATION_WIDTH = "wdth";
    private final HashMap<String, Float> settings;
    static final Float VARIATION_ITALIC_VALUE_ON = Float.valueOf(1.0f);
    static final Float VARIATION_OBLIQUE_VALUE_ON = Float.valueOf(-14.0f);

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes10.dex */
    public static class FontVariationEntry {
        String name;
        Float val;

        public FontVariationEntry(String str, Float f) {
            this.name = str;
            this.val = f;
        }
    }

    public CSSFontVariationSettings() {
        this.settings = new HashMap<>();
    }

    private static FontVariationEntry nextFeatureEntry(TextScanner textScanner) {
        Float valueOf;
        textScanner.skipWhitespace();
        String nextQuotedString = textScanner.nextQuotedString();
        if (nextQuotedString == null || nextQuotedString.length() != 4) {
            return null;
        }
        textScanner.skipWhitespace();
        if (textScanner.empty() || (valueOf = Float.valueOf(textScanner.nextFloat())) == null) {
            return null;
        }
        return new FontVariationEntry(nextQuotedString, valueOf);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static CSSFontVariationSettings parseFontVariationSettings(String str) {
        CSSFontVariationSettings cSSFontVariationSettings = new CSSFontVariationSettings();
        TextScanner textScanner = new TextScanner(str);
        textScanner.skipWhitespace();
        if (textScanner.consume(NORMAL)) {
            return null;
        }
        while (!textScanner.empty()) {
            FontVariationEntry nextFeatureEntry = nextFeatureEntry(textScanner);
            if (nextFeatureEntry == null) {
                return null;
            }
            cSSFontVariationSettings.settings.put(nextFeatureEntry.name, nextFeatureEntry.val);
            textScanner.skipCommaWhitespace();
        }
        return cSSFontVariationSettings;
    }

    public void addSetting(String str, float f) {
        this.settings.put(str, Float.valueOf(f));
    }

    public void applySettings(CSSFontVariationSettings cSSFontVariationSettings) {
        if (cSSFontVariationSettings == null) {
            return;
        }
        this.settings.putAll(cSSFontVariationSettings.settings);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry<String, Float> entry : this.settings.entrySet()) {
            if (sb2.length() > 0) {
                sb2.append(',');
            }
            sb2.append("'");
            sb2.append(entry.getKey());
            sb2.append("' ");
            sb2.append(new DecimalFormat("#.##").format(entry.getValue()));
        }
        return sb2.toString();
    }

    private CSSFontVariationSettings(HashMap<String, Float> hashMap) {
        this.settings = hashMap;
    }

    public CSSFontVariationSettings(CSSFontVariationSettings cSSFontVariationSettings) {
        this.settings = new HashMap<>(cSSFontVariationSettings.settings);
    }
}
