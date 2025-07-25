package com.ironsource.mediationsdk.metadata;

import android.text.TextUtils;
import com.ironsource.environment.StringUtils;
import com.ironsource.mediationsdk.metadata.MetaData;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import net.pubnative.lite.sdk.utils.svgparser.utils.SVGParserImpl;

/* loaded from: classes6.dex */
public class MetaDataUtils {
    public static String checkMetaDataKeyValidity(String str) {
        if (str != null && str.length() <= 2048) {
            return "";
        }
        return "The MetaData key you entered is invalid. Please enter a key of maximum 2048 characters.";
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String checkMetaDataValueValidity(java.util.List<java.lang.String> r2) {
        /*
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L9
            java.lang.String r2 = "The MetaData list should include at least one element."
            return r2
        L9:
            java.util.Iterator r2 = r2.iterator()
        Ld:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L26
            java.lang.Object r0 = r2.next()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L23
            int r0 = r0.length()
            r1 = 2048(0x800, float:2.87E-42)
            if (r0 <= r1) goto Ld
        L23:
            java.lang.String r2 = "The MetaData value(s) you entered is invalid. Please enter a value of maximum 2048 characters."
            return r2
        L26:
            java.lang.String r2 = ""
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.metadata.MetaDataUtils.checkMetaDataValueValidity(java.util.List):java.lang.String");
    }

    public static MetaData formatMetaData(String str, List<String> list) {
        if (!isKnownKey(str)) {
            return new MetaData(str, list);
        }
        String lowerCase = StringUtils.toLowerCase(str);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (String str2 : list) {
            MetaData.MetaDataValueTypes valueTypeForKey = getValueTypeForKey(lowerCase);
            String formatValueForType = formatValueForType(str2, valueTypeForKey);
            arrayList.add(valueTypeForKey);
            arrayList2.add(formatValueForType);
        }
        return new MetaData(lowerCase, arrayList2, arrayList);
    }

    public static String formatValueForType(String str, MetaData.MetaDataValueTypes metaDataValueTypes) {
        if (metaDataValueTypes == MetaData.MetaDataValueTypes.META_DATA_VALUE_BOOLEAN) {
            String str2 = "true";
            if (!str.equalsIgnoreCase("true") && !str.equalsIgnoreCase("yes")) {
                str2 = "false";
                if (!str.equalsIgnoreCase("false") && !str.equalsIgnoreCase(SVGParserImpl.XML_STYLESHEET_ATTR_ALTERNATE_NO)) {
                    return "";
                }
            }
            return str2;
        }
        return str;
    }

    public static boolean getMetaDataBooleanValue(String str) {
        return !str.equals("false");
    }

    public static MetaData.MetaDataValueTypes getValueTypeForKey(String str) {
        if (!str.equalsIgnoreCase(C20419a.f51677a) && !str.equalsIgnoreCase(C20419a.f51678b) && !str.equalsIgnoreCase(C20419a.f51679c) && !str.equalsIgnoreCase(C20419a.f51680d)) {
            return MetaData.MetaDataValueTypes.META_DATA_VALUE_STRING;
        }
        return MetaData.MetaDataValueTypes.META_DATA_VALUE_BOOLEAN;
    }

    public static boolean isKnownKey(String str) {
        return C20419a.f51689m.contains(str.toLowerCase(Locale.getDefault()));
    }

    public static boolean isMediationKeysBeforeInit(String str) {
        return C20419a.f51688l.contains(str.toLowerCase(Locale.getDefault()));
    }

    public static boolean isMediationOnlyKey(String str) {
        return C20419a.f51687k.contains(str.toLowerCase(Locale.getDefault()));
    }

    public static boolean isValidCCPAMetaData(String str, String str2) {
        return isValidMetaData(str, C20419a.f51677a, str2);
    }

    public static boolean isValidMetaData(String str, String str2, String str3) {
        if (str.equalsIgnoreCase(str2) && !TextUtils.isEmpty(str3)) {
            return true;
        }
        return false;
    }
}
