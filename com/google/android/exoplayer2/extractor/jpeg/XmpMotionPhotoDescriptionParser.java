package com.google.android.exoplayer2.extractor.jpeg;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.jpeg.MotionPhotoDescription;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.XmlPullParserUtil;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes4.dex */
final class XmpMotionPhotoDescriptionParser {

    /* renamed from: a */
    private static final String[] f33050a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: b */
    private static final String[] f33051b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: c */
    private static final String[] f33052c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    private XmpMotionPhotoDescriptionParser() {
    }

    @Nullable
    /* renamed from: a */
    private static MotionPhotoDescription m74625a(String str) throws XmlPullParserException, IOException {
        XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
        newPullParser.setInput(new StringReader(str));
        newPullParser.next();
        if (XmlPullParserUtil.isStartTag(newPullParser, "x:xmpmeta")) {
            ImmutableList<MotionPhotoDescription.ContainerItem> m69424of = ImmutableList.m69424of();
            long j = -9223372036854775807L;
            do {
                newPullParser.next();
                if (XmlPullParserUtil.isStartTag(newPullParser, "rdf:Description")) {
                    if (!m74623c(newPullParser)) {
                        return null;
                    }
                    j = m74622d(newPullParser);
                    m69424of = m74624b(newPullParser);
                } else if (XmlPullParserUtil.isStartTag(newPullParser, "Container:Directory")) {
                    m69424of = m74621e(newPullParser, "Container", "Item");
                } else if (XmlPullParserUtil.isStartTag(newPullParser, "GContainer:Directory")) {
                    m69424of = m74621e(newPullParser, "GContainer", "GContainerItem");
                }
            } while (!XmlPullParserUtil.isEndTag(newPullParser, "x:xmpmeta"));
            if (m69424of.isEmpty()) {
                return null;
            }
            return new MotionPhotoDescription(j, m69424of);
        }
        throw ParserException.createForMalformedContainer("Couldn't find xmp metadata", null);
    }

    /* renamed from: b */
    private static ImmutableList<MotionPhotoDescription.ContainerItem> m74624b(XmlPullParser xmlPullParser) {
        for (String str : f33052c) {
            String attributeValue = XmlPullParserUtil.getAttributeValue(xmlPullParser, str);
            if (attributeValue != null) {
                return ImmutableList.m69422of(new MotionPhotoDescription.ContainerItem("image/jpeg", "Primary", 0L, 0L), new MotionPhotoDescription.ContainerItem("video/mp4", "MotionPhoto", Long.parseLong(attributeValue), 0L));
            }
        }
        return ImmutableList.m69424of();
    }

    /* renamed from: c */
    private static boolean m74623c(XmlPullParser xmlPullParser) {
        for (String str : f33050a) {
            String attributeValue = XmlPullParserUtil.getAttributeValue(xmlPullParser, str);
            if (attributeValue != null) {
                if (Integer.parseInt(attributeValue) != 1) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    private static long m74622d(XmlPullParser xmlPullParser) {
        for (String str : f33051b) {
            String attributeValue = XmlPullParserUtil.getAttributeValue(xmlPullParser, str);
            if (attributeValue != null) {
                long parseLong = Long.parseLong(attributeValue);
                if (parseLong == -1) {
                    return -9223372036854775807L;
                }
                return parseLong;
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: e */
    private static ImmutableList<MotionPhotoDescription.ContainerItem> m74621e(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        long j;
        long j2;
        ImmutableList.Builder builder = ImmutableList.builder();
        String str3 = str + ":Item";
        String str4 = str + ":Directory";
        do {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, str3)) {
                String attributeValue = XmlPullParserUtil.getAttributeValue(xmlPullParser, str2 + ":Mime");
                String attributeValue2 = XmlPullParserUtil.getAttributeValue(xmlPullParser, str2 + ":Semantic");
                String attributeValue3 = XmlPullParserUtil.getAttributeValue(xmlPullParser, str2 + ":Length");
                String attributeValue4 = XmlPullParserUtil.getAttributeValue(xmlPullParser, str2 + ":Padding");
                if (attributeValue != null && attributeValue2 != null) {
                    if (attributeValue3 != null) {
                        j = Long.parseLong(attributeValue3);
                    } else {
                        j = 0;
                    }
                    if (attributeValue4 != null) {
                        j2 = Long.parseLong(attributeValue4);
                    } else {
                        j2 = 0;
                    }
                    builder.add((ImmutableList.Builder) new MotionPhotoDescription.ContainerItem(attributeValue, attributeValue2, j, j2));
                } else {
                    return ImmutableList.m69424of();
                }
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, str4));
        return builder.build();
    }

    @Nullable
    public static MotionPhotoDescription parse(String str) throws IOException {
        try {
            return m74625a(str);
        } catch (ParserException | NumberFormatException | XmlPullParserException unused) {
            Log.m72602w("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }
}
