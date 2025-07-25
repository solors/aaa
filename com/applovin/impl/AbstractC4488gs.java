package com.applovin.impl;

import org.xmlpull.v1.XmlPullParser;

/* renamed from: com.applovin.impl.gs */
/* loaded from: classes2.dex */
public abstract class AbstractC4488gs {
    /* renamed from: a */
    public static String m98862a(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m98860b(XmlPullParser xmlPullParser, String str) {
        return m98863a(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    /* renamed from: c */
    public static boolean m98859c(XmlPullParser xmlPullParser, String str) {
        if (m98861b(xmlPullParser) && xmlPullParser.getName().equals(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m98861b(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 2;
    }

    /* renamed from: a */
    public static boolean m98863a(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 3;
    }
}
