package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.oh0;
import com.yandex.mobile.ads.impl.sy0;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes8.dex */
final class if2 {

    /* renamed from: a */
    private static final String[] f80445a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: b */
    private static final String[] f80446b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: c */
    private static final String[] f80447c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    @Nullable
    /* renamed from: a */
    public static sy0 m33282a(String str) throws IOException {
        try {
            return m33280b(str);
        } catch (gc1 | NumberFormatException | XmlPullParserException unused) {
            gq0.m33792d("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
        if (r7 == (-1)) goto L43;
     */
    @androidx.annotation.Nullable
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.yandex.mobile.ads.impl.sy0 m33280b(java.lang.String r20) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            org.xmlpull.v1.XmlPullParserFactory r0 = org.xmlpull.v1.XmlPullParserFactory.newInstance()
            org.xmlpull.v1.XmlPullParser r0 = r0.newPullParser()
            java.io.StringReader r1 = new java.io.StringReader
            r2 = r20
            r1.<init>(r2)
            r0.setInput(r1)
            r0.next()
            java.lang.String r1 = "x:xmpmeta"
            boolean r2 = com.yandex.mobile.ads.impl.hf2.m33555c(r0, r1)
            r3 = 0
            if (r2 == 0) goto Ld2
            com.yandex.mobile.ads.impl.oh0 r2 = com.yandex.mobile.ads.impl.oh0.m31009h()
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = r4
        L28:
            r0.next()
            java.lang.String r8 = "rdf:Description"
            boolean r8 = com.yandex.mobile.ads.impl.hf2.m33555c(r0, r8)
            if (r8 == 0) goto L9e
            java.lang.String[] r2 = com.yandex.mobile.ads.impl.if2.f80445a
            r6 = 0
            r7 = r6
        L37:
            r8 = 4
            if (r7 >= r8) goto L9d
            r9 = r2[r7]
            java.lang.String r9 = com.yandex.mobile.ads.impl.hf2.m33557a(r0, r9)
            if (r9 == 0) goto L9a
            int r2 = java.lang.Integer.parseInt(r9)
            r7 = 1
            if (r2 != r7) goto L9d
            java.lang.String[] r2 = com.yandex.mobile.ads.impl.if2.f80446b
            r7 = r6
        L4c:
            if (r7 >= r8) goto L64
            r9 = r2[r7]
            java.lang.String r9 = com.yandex.mobile.ads.impl.hf2.m33557a(r0, r9)
            if (r9 == 0) goto L61
            long r7 = java.lang.Long.parseLong(r9)
            r9 = -1
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 != 0) goto L65
            goto L64
        L61:
            int r7 = r7 + 1
            goto L4c
        L64:
            r7 = r4
        L65:
            java.lang.String[] r2 = com.yandex.mobile.ads.impl.if2.f80447c
        L67:
            r9 = 2
            if (r6 >= r9) goto L94
            r9 = r2[r6]
            java.lang.String r9 = com.yandex.mobile.ads.impl.hf2.m33557a(r0, r9)
            if (r9 == 0) goto L91
            long r12 = java.lang.Long.parseLong(r9)
            com.yandex.mobile.ads.impl.sy0$a r2 = new com.yandex.mobile.ads.impl.sy0$a
            java.lang.String r15 = "image/jpeg"
            r16 = 0
            r18 = 0
            r14 = r2
            r14.<init>(r15, r16, r18)
            com.yandex.mobile.ads.impl.sy0$a r6 = new com.yandex.mobile.ads.impl.sy0$a
            java.lang.String r11 = "video/mp4"
            r14 = 0
            r10 = r6
            r10.<init>(r11, r12, r14)
            com.yandex.mobile.ads.impl.oh0 r2 = com.yandex.mobile.ads.impl.oh0.m31015a(r2, r6)
            goto L98
        L91:
            int r6 = r6 + 1
            goto L67
        L94:
            com.yandex.mobile.ads.impl.oh0 r2 = com.yandex.mobile.ads.impl.oh0.m31009h()
        L98:
            r6 = r7
            goto Lbf
        L9a:
            int r7 = r7 + 1
            goto L37
        L9d:
            return r3
        L9e:
            java.lang.String r8 = "Container:Directory"
            boolean r8 = com.yandex.mobile.ads.impl.hf2.m33555c(r0, r8)
            if (r8 == 0) goto Laf
            java.lang.String r2 = "Container"
            java.lang.String r8 = "Item"
            com.yandex.mobile.ads.impl.oh0 r2 = m33281a(r0, r2, r8)
            goto Lbf
        Laf:
            java.lang.String r8 = "GContainer:Directory"
            boolean r8 = com.yandex.mobile.ads.impl.hf2.m33555c(r0, r8)
            if (r8 == 0) goto Lbf
            java.lang.String r2 = "GContainer"
            java.lang.String r8 = "GContainerItem"
            com.yandex.mobile.ads.impl.oh0 r2 = m33281a(r0, r2, r8)
        Lbf:
            boolean r8 = com.yandex.mobile.ads.impl.hf2.m33556b(r0, r1)
            if (r8 == 0) goto L28
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto Lcc
            return r3
        Lcc:
            com.yandex.mobile.ads.impl.sy0 r0 = new com.yandex.mobile.ads.impl.sy0
            r0.<init>(r6, r2)
            return r0
        Ld2:
            java.lang.String r0 = "Couldn't find xmp metadata"
            com.yandex.mobile.ads.impl.gc1 r0 = com.yandex.mobile.ads.impl.gc1.m33885a(r0, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.if2.m33280b(java.lang.String):com.yandex.mobile.ads.impl.sy0");
    }

    /* renamed from: a */
    private static oh0<sy0.C31413a> m33281a(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        int i = oh0.f83515d;
        oh0.C31039a c31039a = new oh0.C31039a();
        String concat = str.concat(":Item");
        String concat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (hf2.m33555c(xmlPullParser, concat)) {
                String concat3 = str2.concat(":Mime");
                String concat4 = str2.concat(":Semantic");
                String concat5 = str2.concat(":Length");
                String concat6 = str2.concat(":Padding");
                String m33557a = hf2.m33557a(xmlPullParser, concat3);
                String m33557a2 = hf2.m33557a(xmlPullParser, concat4);
                String m33557a3 = hf2.m33557a(xmlPullParser, concat5);
                String m33557a4 = hf2.m33557a(xmlPullParser, concat6);
                if (m33557a != null && m33557a2 != null) {
                    c31039a.m31999b(new sy0.C31413a(m33557a, m33557a3 != null ? Long.parseLong(m33557a3) : 0L, m33557a4 != null ? Long.parseLong(m33557a4) : 0L));
                } else {
                    return oh0.m31009h();
                }
            }
        } while (!hf2.m33556b(xmlPullParser, concat2));
        return c31039a.m31008a();
    }
}
