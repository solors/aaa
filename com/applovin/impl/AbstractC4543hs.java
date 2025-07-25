package com.applovin.impl;

import com.applovin.impl.AbstractC4247db;
import com.applovin.impl.C4773lf;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* renamed from: com.applovin.impl.hs */
/* loaded from: classes2.dex */
abstract class AbstractC4543hs {

    /* renamed from: a */
    private static final String[] f6698a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: b */
    private static final String[] f6699b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: c */
    private static final String[] f6700c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* renamed from: a */
    public static C4773lf m98629a(String str) {
        try {
            return m98626b(str);
        } catch (C4187ch | NumberFormatException | XmlPullParserException unused) {
            AbstractC5063oc.m96800d("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    /* renamed from: b */
    private static C4773lf m98626b(String str) {
        XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
        newPullParser.setInput(new StringReader(str));
        newPullParser.next();
        if (AbstractC4488gs.m98859c(newPullParser, "x:xmpmeta")) {
            AbstractC4247db m99829h = AbstractC4247db.m99829h();
            long j = -9223372036854775807L;
            do {
                newPullParser.next();
                if (AbstractC4488gs.m98859c(newPullParser, "rdf:Description")) {
                    if (!m98625b(newPullParser)) {
                        return null;
                    }
                    j = m98624c(newPullParser);
                    m99829h = m98628a(newPullParser);
                } else if (AbstractC4488gs.m98859c(newPullParser, "Container:Directory")) {
                    m99829h = m98627a(newPullParser, "Container", "Item");
                } else if (AbstractC4488gs.m98859c(newPullParser, "GContainer:Directory")) {
                    m99829h = m98627a(newPullParser, "GContainer", "GContainerItem");
                }
            } while (!AbstractC4488gs.m98860b(newPullParser, "x:xmpmeta"));
            if (m99829h.isEmpty()) {
                return null;
            }
            return new C4773lf(j, m99829h);
        }
        throw C4187ch.m100188a("Couldn't find xmp metadata", null);
    }

    /* renamed from: c */
    private static long m98624c(XmlPullParser xmlPullParser) {
        for (String str : f6699b) {
            String m98862a = AbstractC4488gs.m98862a(xmlPullParser, str);
            if (m98862a != null) {
                long parseLong = Long.parseLong(m98862a);
                if (parseLong == -1) {
                    return -9223372036854775807L;
                }
                return parseLong;
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: a */
    private static AbstractC4247db m98628a(XmlPullParser xmlPullParser) {
        for (String str : f6700c) {
            String m98862a = AbstractC4488gs.m98862a(xmlPullParser, str);
            if (m98862a != null) {
                return AbstractC4247db.m99841a(new C4773lf.C4774a("image/jpeg", "Primary", 0L, 0L), new C4773lf.C4774a("video/mp4", "MotionPhoto", Long.parseLong(m98862a), 0L));
            }
        }
        return AbstractC4247db.m99829h();
    }

    /* renamed from: a */
    private static AbstractC4247db m98627a(XmlPullParser xmlPullParser, String str, String str2) {
        AbstractC4247db.C4248a m99831f = AbstractC4247db.m99831f();
        String str3 = str + ":Item";
        String str4 = str + ":Directory";
        do {
            xmlPullParser.next();
            if (AbstractC4488gs.m98859c(xmlPullParser, str3)) {
                String m98862a = AbstractC4488gs.m98862a(xmlPullParser, str2 + ":Mime");
                String m98862a2 = AbstractC4488gs.m98862a(xmlPullParser, str2 + ":Semantic");
                String m98862a3 = AbstractC4488gs.m98862a(xmlPullParser, str2 + ":Length");
                String m98862a4 = AbstractC4488gs.m98862a(xmlPullParser, str2 + ":Padding");
                if (m98862a != null && m98862a2 != null) {
                    m99831f.m99827b(new C4773lf.C4774a(m98862a, m98862a2, m98862a3 != null ? Long.parseLong(m98862a3) : 0L, m98862a4 != null ? Long.parseLong(m98862a4) : 0L));
                } else {
                    return AbstractC4247db.m99829h();
                }
            }
        } while (!AbstractC4488gs.m98860b(xmlPullParser, str4));
        return m99831f.m99828a();
    }

    /* renamed from: b */
    private static boolean m98625b(XmlPullParser xmlPullParser) {
        for (String str : f6698a) {
            String m98862a = AbstractC4488gs.m98862a(xmlPullParser, str);
            if (m98862a != null) {
                return Integer.parseInt(m98862a) == 1;
            }
        }
        return false;
    }
}
