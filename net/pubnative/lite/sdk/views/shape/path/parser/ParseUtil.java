package net.pubnative.lite.sdk.views.shape.path.parser;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.ironsource.C21114v8;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes10.dex */
class ParseUtil {
    ParseUtil() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Float convertUnits(String str, XmlPullParser xmlPullParser, float f, float f2, float f3) {
        float f4;
        String stringAttr = getStringAttr(str, xmlPullParser);
        if (stringAttr == null) {
            return null;
        }
        if (stringAttr.endsWith("px")) {
            return Float.valueOf(Float.parseFloat(stringAttr.substring(0, stringAttr.length() - 2)));
        }
        if (stringAttr.endsWith("pt")) {
            return Float.valueOf((Float.parseFloat(stringAttr.substring(0, stringAttr.length() - 2)) * f) / 72.0f);
        }
        if (stringAttr.endsWith(ApsMetricsDataMap.APSMETRICS_FIELD_PLATFORMCATEGORY)) {
            return Float.valueOf((Float.parseFloat(stringAttr.substring(0, stringAttr.length() - 2)) * f) / 6.0f);
        }
        if (stringAttr.endsWith("cm")) {
            return Float.valueOf((Float.parseFloat(stringAttr.substring(0, stringAttr.length() - 2)) * f) / 2.54f);
        }
        if (stringAttr.endsWith("mm")) {
            return Float.valueOf((Float.parseFloat(stringAttr.substring(0, stringAttr.length() - 2)) * f) / 254.0f);
        }
        if (stringAttr.endsWith("in")) {
            return Float.valueOf(Float.parseFloat(stringAttr.substring(0, stringAttr.length() - 2)) * f);
        }
        if (stringAttr.endsWith("%")) {
            Float valueOf = Float.valueOf(stringAttr.substring(0, stringAttr.length() - 1));
            if (!str.contains("x") && !str.equals("width")) {
                if (!str.contains("y") && !str.equals("height")) {
                    f4 = (f3 + f2) / 2.0f;
                } else {
                    f4 = f3 / 100.0f;
                }
            } else {
                f4 = f2 / 100.0f;
            }
            return Float.valueOf(valueOf.floatValue() * f4);
        }
        return Float.valueOf(stringAttr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final String escape(String str) {
        return str.replaceAll("\"", "&quot;").replaceAll("'", "&apos").replaceAll("<", "&lt;").replaceAll(">", "&gt;").replaceAll(C21114v8.C21123i.f54135c, "&amp;");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final String getStringAttr(String str, XmlPullParser xmlPullParser) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }
}
