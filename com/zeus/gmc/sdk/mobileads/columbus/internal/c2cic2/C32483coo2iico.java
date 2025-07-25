package com.zeus.gmc.sdk.mobileads.columbus.internal.c2cic2;

import android.text.TextUtils;
import android.util.Log;
import com.smaato.sdk.video.vast.model.InLine;
import com.smaato.sdk.video.vast.model.Linear;
import com.smaato.sdk.video.vast.model.VideoClicks;
import com.zeus.gmc.sdk.mobileads.columbus.internal.cioiic.C32664c2oc2i;
import com.zeus.gmc.sdk.mobileads.columbus.internal.cioiic.C32667cioccoiococ;
import com.zeus.gmc.sdk.mobileads.columbus.util.MLog;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.c2cic2.coo2iico */
/* loaded from: classes8.dex */
public class C32483coo2iico {
    private static volatile C32483coo2iico coi222o222 = null;
    private static final String coo2iico = "VastXmlParser";

    private C32483coo2iico() {
    }

    private void c2oc2i(XmlPullParser xmlPullParser, C32667cioccoiococ.C32668coo2iico.C32669coo2iico c32669coo2iico) throws IOException, XmlPullParserException {
        C32667cioccoiococ.C32668coo2iico.C32669coo2iico.C32673cioccoiococ c32673cioccoiococ = new C32667cioccoiococ.C32668coo2iico.C32669coo2iico.C32673cioccoiococ();
        c32673cioccoiococ.coo2iico = xmlPullParser.getAttributeValue(null, "id");
        c32673cioccoiococ.coi222o222 = xmlPullParser.nextText();
        if (c32669coo2iico.c2oc2i == null) {
            c32669coo2iico.c2oc2i = new ArrayList();
        }
        c32669coo2iico.c2oc2i.add(c32673cioccoiococ);
    }

    private C32667cioccoiococ.C32668coo2iico.C32669coo2iico.C32674coi222o222 coi222o222(XmlPullParser xmlPullParser, C32667cioccoiococ.C32668coo2iico.C32669coo2iico c32669coo2iico) throws XmlPullParserException, IOException {
        if (c32669coo2iico == null) {
            coi222o222("xml error, missing InLine tag");
        }
        if (c32669coo2iico.cioccoiococ == null) {
            coi222o222("xml error, missing Creatives tag");
        }
        C32667cioccoiococ.C32668coo2iico.C32669coo2iico.C32674coi222o222 c32674coi222o222 = new C32667cioccoiococ.C32668coo2iico.C32669coo2iico.C32674coi222o222();
        c32674coi222o222.coo2iico = xmlPullParser.getAttributeValue(null, "id");
        try {
            c32674coi222o222.coi222o222 = Integer.parseInt(xmlPullParser.getAttributeValue(null, "sequence"));
        } catch (Exception unused) {
            Log.d(coo2iico, "creative.sequence = Integer.parseInt(parser.getAttributeValue(null, \"sequence\") error");
        }
        c32669coo2iico.cioccoiococ.add(c32674coi222o222);
        return c32674coi222o222;
    }

    public static C32483coo2iico coo2iico() {
        if (coi222o222 == null) {
            synchronized (C32483coo2iico.class) {
                if (coi222o222 == null) {
                    coi222o222 = new C32483coo2iico();
                }
            }
        }
        return coi222o222;
    }

    public C32667cioccoiococ coo2iico(String str) {
        try {
            return coo2iico(new ByteArrayInputStream(str.getBytes()));
        } catch (Exception e) {
            MLog.m25888e(coo2iico, "parse vast had Exception: ", e);
            return null;
        }
    }

    private C32667cioccoiococ.C32668coo2iico.C32669coo2iico.C32674coi222o222.C32675coi222o222 coi222o222(C32667cioccoiococ.C32668coo2iico.C32669coo2iico.C32674coi222o222 c32674coi222o222) throws XmlPullParserException {
        if (c32674coi222o222 == null) {
            coi222o222("xml error, missing Creative tag");
        }
        C32667cioccoiococ.C32668coo2iico.C32669coo2iico.C32674coi222o222.C32675coi222o222 c32675coi222o222 = new C32667cioccoiococ.C32668coo2iico.C32669coo2iico.C32674coi222o222.C32675coi222o222();
        c32674coi222o222.c2oc2i = c32675coi222o222;
        return c32675coi222o222;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x018d, code lost:
        if (r13.equals("VideoClicks") == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.zeus.gmc.sdk.mobileads.columbus.internal.cioiic.C32667cioccoiococ coo2iico(java.io.InputStream r13) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        /*
            Method dump skipped, instructions count: 710
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zeus.gmc.sdk.mobileads.columbus.internal.c2cic2.C32483coo2iico.coo2iico(java.io.InputStream):com.zeus.gmc.sdk.mobileads.columbus.internal.cioiic.cioccoiococ");
    }

    private void coi222o222(String str, XmlPullParser xmlPullParser, C32667cioccoiococ.C32668coo2iico.C32669coo2iico.C32674coi222o222.C32675coi222o222 c32675coi222o222) throws IOException, XmlPullParserException {
        if (c32675coi222o222 == null) {
            coi222o222("xml error, missing Linear tag");
        }
        if (c32675coi222o222.c2oc2i == null) {
            coi222o222("xml error, missing VideoClicks tag");
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -617879491:
                if (str.equals(VideoClicks.CLICK_THROUGH)) {
                    c = 0;
                    break;
                }
                break;
            case -135761801:
                if (str.equals(VideoClicks.CUSTOM_CLICK)) {
                    c = 1;
                    break;
                }
                break;
            case 2107600959:
                if (str.equals(VideoClicks.CLICK_TRACKING)) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                c32675coi222o222.c2oc2i.coo2iico = xmlPullParser.nextText();
                return;
            case 1:
                C32667cioccoiococ.C32668coo2iico.C32669coo2iico.C32674coi222o222.C32675coi222o222.C32677cioccoiococ c32677cioccoiococ = c32675coi222o222.c2oc2i;
                if (c32677cioccoiococ.c2oc2i == null) {
                    c32677cioccoiococ.c2oc2i = new ArrayList();
                }
                c32675coi222o222.c2oc2i.c2oc2i.add(xmlPullParser.nextText());
                return;
            case 2:
                C32667cioccoiococ.C32668coo2iico.C32669coo2iico.C32674coi222o222.C32675coi222o222.C32677cioccoiococ c32677cioccoiococ2 = c32675coi222o222.c2oc2i;
                if (c32677cioccoiococ2.coi222o222 == null) {
                    c32677cioccoiococ2.coi222o222 = new ArrayList();
                }
                c32675coi222o222.c2oc2i.coi222o222.add(xmlPullParser.nextText());
                return;
            default:
                return;
        }
    }

    private void coi222o222(XmlPullParser xmlPullParser, C32667cioccoiococ.C32668coo2iico.C32669coo2iico.C32674coi222o222.C32675coi222o222 c32675coi222o222) throws XmlPullParserException, IOException {
        if (c32675coi222o222 == null) {
            return;
        }
        if (c32675coi222o222.cioccoiococ == null) {
            coi222o222("xml error, missing TrackingEvents tag");
        }
        C32664c2oc2i c32664c2oc2i = new C32664c2oc2i();
        c32664c2oc2i.coo2iico = xmlPullParser.getAttributeValue("", "event");
        c32664c2oc2i.coi222o222 = xmlPullParser.nextText();
        c32675coi222o222.cioccoiococ.add(c32664c2oc2i);
    }

    private void coi222o222(String str) throws XmlPullParserException {
        throw new XmlPullParserException(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043 A[Catch: Exception -> 0x004a, XmlPullParserException -> 0x0051, TRY_LEAVE, TryCatch #2 {XmlPullParserException -> 0x0051, Exception -> 0x004a, blocks: (B:5:0x0005, B:20:0x003c, B:21:0x0043, B:10:0x0022, B:13:0x002c), top: B:28:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void coo2iico(org.xmlpull.v1.XmlPullParser r6, com.zeus.gmc.sdk.mobileads.columbus.internal.cioiic.C32667cioccoiococ.C32668coo2iico.C32669coo2iico.C32674coi222o222.C32680coo2iico.C32681coo2iico r7) {
        /*
            r5 = this;
            java.lang.String r0 = "VastXmlParser"
            if (r7 != 0) goto L5
            return
        L5:
            java.lang.String r1 = "creativeType"
            r2 = 0
            java.lang.String r1 = r6.getAttributeValue(r2, r1)     // Catch: java.lang.Exception -> L4a org.xmlpull.v1.XmlPullParserException -> L51
            r7.cco22 = r1     // Catch: java.lang.Exception -> L4a org.xmlpull.v1.XmlPullParserException -> L51
            java.lang.String r1 = r6.getName()     // Catch: java.lang.Exception -> L4a org.xmlpull.v1.XmlPullParserException -> L51
            int r2 = r1.hashCode()     // Catch: java.lang.Exception -> L4a org.xmlpull.v1.XmlPullParserException -> L51
            r3 = 676623548(0x285474bc, float:1.1793677E-14)
            r4 = 1
            if (r2 == r3) goto L2c
            r3 = 1928285401(0x72ef4cd9, float:9.479657E30)
            if (r2 == r3) goto L22
            goto L36
        L22:
            java.lang.String r2 = "HTMLResource"
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Exception -> L4a org.xmlpull.v1.XmlPullParserException -> L51
            if (r1 == 0) goto L36
            r1 = 0
            goto L37
        L2c:
            java.lang.String r2 = "StaticResource"
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Exception -> L4a org.xmlpull.v1.XmlPullParserException -> L51
            if (r1 == 0) goto L36
            r1 = r4
            goto L37
        L36:
            r1 = -1
        L37:
            if (r1 == 0) goto L43
            if (r1 == r4) goto L3c
            goto L57
        L3c:
            java.lang.String r6 = r6.nextText()     // Catch: java.lang.Exception -> L4a org.xmlpull.v1.XmlPullParserException -> L51
            r7.c2oc2o = r6     // Catch: java.lang.Exception -> L4a org.xmlpull.v1.XmlPullParserException -> L51
            goto L57
        L43:
            java.lang.String r6 = r6.nextText()     // Catch: java.lang.Exception -> L4a org.xmlpull.v1.XmlPullParserException -> L51
            r7.cioccoiococ = r6     // Catch: java.lang.Exception -> L4a org.xmlpull.v1.XmlPullParserException -> L51
            goto L57
        L4a:
            r6 = move-exception
            java.lang.String r7 = "Exception"
            com.zeus.gmc.sdk.mobileads.columbus.util.MLog.m25888e(r0, r7, r6)
            goto L57
        L51:
            r6 = move-exception
            java.lang.String r7 = "XmlPullParserException"
            com.zeus.gmc.sdk.mobileads.columbus.util.MLog.m25888e(r0, r7, r6)
        L57:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zeus.gmc.sdk.mobileads.columbus.internal.c2cic2.C32483coo2iico.coo2iico(org.xmlpull.v1.XmlPullParser, com.zeus.gmc.sdk.mobileads.columbus.internal.cioiic.cioccoiococ$coo2iico$coo2iico$coi222o222$coo2iico$coo2iico):void");
    }

    private C32667cioccoiococ.C32668coo2iico.C32669coo2iico.C32674coi222o222.C32680coo2iico coo2iico(C32667cioccoiococ.C32668coo2iico.C32669coo2iico.C32674coi222o222 c32674coi222o222) throws XmlPullParserException {
        if (c32674coi222o222 == null) {
            coi222o222("xml error, missing creative tag");
        }
        C32667cioccoiococ.C32668coo2iico.C32669coo2iico.C32674coi222o222.C32680coo2iico c32680coo2iico = new C32667cioccoiococ.C32668coo2iico.C32669coo2iico.C32674coi222o222.C32680coo2iico();
        c32674coi222o222.cioccoiococ = c32680coo2iico;
        return c32680coo2iico;
    }

    private C32667cioccoiococ.C32668coo2iico.C32669coo2iico.C32674coi222o222.C32680coo2iico.C32681coo2iico coo2iico(XmlPullParser xmlPullParser, C32667cioccoiococ.C32668coo2iico.C32669coo2iico.C32674coi222o222.C32680coo2iico c32680coo2iico) {
        if (c32680coo2iico == null) {
            return null;
        }
        C32667cioccoiococ.C32668coo2iico.C32669coo2iico.C32674coi222o222.C32680coo2iico.C32681coo2iico c32681coo2iico = new C32667cioccoiococ.C32668coo2iico.C32669coo2iico.C32674coi222o222.C32680coo2iico.C32681coo2iico();
        c32681coo2iico.c2oc2i = xmlPullParser.getAttributeValue(null, "id");
        if (c32680coo2iico.coo2iico == null) {
            c32680coo2iico.coo2iico = new ArrayList();
        }
        c32680coo2iico.coo2iico.add(c32681coo2iico);
        try {
            c32681coo2iico.coo2iico = xmlPullParser.getAttributeValue(null, "width");
            c32681coo2iico.coi222o222 = xmlPullParser.getAttributeValue(null, "height");
        } catch (Exception unused) {
            Log.d(coo2iico, "companion width, height can't found ");
        }
        return c32681coo2iico;
    }

    private C32667cioccoiococ coo2iico(XmlPullParser xmlPullParser) {
        C32667cioccoiococ c32667cioccoiococ = new C32667cioccoiococ();
        c32667cioccoiococ.coo2iico = xmlPullParser.getAttributeValue(null, "version");
        return c32667cioccoiococ;
    }

    private C32667cioccoiococ.C32668coo2iico coo2iico(XmlPullParser xmlPullParser, C32667cioccoiococ c32667cioccoiococ) throws XmlPullParserException {
        if (c32667cioccoiococ != null) {
            C32667cioccoiococ.C32668coo2iico c32668coo2iico = new C32667cioccoiococ.C32668coo2iico();
            c32668coo2iico.coo2iico = xmlPullParser.getAttributeValue(null, "id");
            if (c32667cioccoiococ.coi222o222 == null) {
                c32667cioccoiococ.coi222o222 = new ArrayList();
            }
            c32667cioccoiococ.coi222o222.add(c32668coo2iico);
            return c32668coo2iico;
        }
        throw new XmlPullParserException("xml error, missing VAST tag");
    }

    private void coo2iico(XmlPullParser xmlPullParser, C32667cioccoiococ c32667cioccoiococ, C32667cioccoiococ.C32668coo2iico.C32669coo2iico c32669coo2iico) throws XmlPullParserException, IOException {
        if (xmlPullParser.getDepth() == 2) {
            if (c32667cioccoiococ == null) {
                coi222o222("xml error, missing VAST tag");
            }
            c32667cioccoiococ.c2oc2i = xmlPullParser.nextText();
        } else if (xmlPullParser.getDepth() == 4) {
            if (c32669coo2iico == null) {
                coi222o222("xml error, missing InLine tag");
            }
            c32669coo2iico.c2oc2o = xmlPullParser.nextText();
        }
    }

    private C32667cioccoiococ.C32668coo2iico.C32669coo2iico coo2iico(C32667cioccoiococ.C32668coo2iico c32668coo2iico) throws XmlPullParserException {
        if (c32668coo2iico == null) {
            coi222o222("xml error, missing AD tag");
        }
        C32667cioccoiococ.C32668coo2iico.C32669coo2iico c32669coo2iico = new C32667cioccoiococ.C32668coo2iico.C32669coo2iico();
        c32668coo2iico.coi222o222 = c32669coo2iico;
        return c32669coo2iico;
    }

    private void coo2iico(String str, XmlPullParser xmlPullParser, C32667cioccoiococ.C32668coo2iico.C32669coo2iico c32669coo2iico) throws IOException, XmlPullParserException {
        if (c32669coo2iico == null) {
            coi222o222("xml error, missing InLine tag");
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1692490108:
                if (str.equals("Creatives")) {
                    c = 0;
                    break;
                }
                break;
            case -1633884078:
                if (str.equals("AdSystem")) {
                    c = 1;
                    break;
                }
                break;
            case -56677412:
                if (str.equals(InLine.DESCRIPTION)) {
                    c = 2;
                    break;
                }
                break;
            case 184043572:
                if (str.equals("Extensions")) {
                    c = 3;
                    break;
                }
                break;
            case 501930965:
                if (str.equals(InLine.AD_TITLE)) {
                    c = 4;
                    break;
                }
                break;
            case 2065545547:
                if (str.equals("Advertiser")) {
                    c = 5;
                    break;
                }
                break;
            case 2114088489:
                if (str.equals("Impression")) {
                    c = 6;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                c32669coo2iico.cioccoiococ = new ArrayList();
                return;
            case 1:
                coo2iico(xmlPullParser, c32669coo2iico);
                return;
            case 2:
                c32669coo2iico.cco22 = xmlPullParser.nextText();
                return;
            case 3:
                c32669coo2iico.cicic = new ArrayList();
                return;
            case 4:
                c32669coo2iico.coi222o222 = xmlPullParser.nextText();
                return;
            case 5:
                c32669coo2iico.cii2c2 = xmlPullParser.nextText();
                return;
            case 6:
                c2oc2i(xmlPullParser, c32669coo2iico);
                return;
            default:
                return;
        }
    }

    private void coo2iico(XmlPullParser xmlPullParser, C32667cioccoiococ.C32668coo2iico.C32669coo2iico c32669coo2iico) throws IOException, XmlPullParserException {
        C32667cioccoiococ.C32668coo2iico.C32669coo2iico.C32682coo2iico c32682coo2iico = new C32667cioccoiococ.C32668coo2iico.C32669coo2iico.C32682coo2iico();
        c32682coo2iico.coo2iico = xmlPullParser.getAttributeValue(null, "version");
        c32682coo2iico.coi222o222 = xmlPullParser.nextText();
        c32669coo2iico.coo2iico = c32682coo2iico;
    }

    private C32667cioccoiococ.C32668coo2iico.C32669coo2iico.C32670c2oc2i coo2iico(C32667cioccoiococ.C32668coo2iico.C32669coo2iico c32669coo2iico) throws XmlPullParserException {
        if (c32669coo2iico == null) {
            coi222o222("xml error, missing InLine tag");
        }
        if (c32669coo2iico.cicic == null) {
            coi222o222("xml error, missing Extensions tag");
        }
        C32667cioccoiococ.C32668coo2iico.C32669coo2iico.C32670c2oc2i c32670c2oc2i = new C32667cioccoiococ.C32668coo2iico.C32669coo2iico.C32670c2oc2i();
        c32669coo2iico.cicic.add(c32670c2oc2i);
        return c32670c2oc2i;
    }

    private void coo2iico(XmlPullParser xmlPullParser, C32667cioccoiococ.C32668coo2iico.C32669coo2iico.C32670c2oc2i c32670c2oc2i) throws XmlPullParserException, IOException {
        if (c32670c2oc2i == null) {
            coi222o222("xml error, missing extension tag");
        }
        C32667cioccoiococ.C32668coo2iico.C32669coo2iico.C32670c2oc2i.C32671coo2iico c32671coo2iico = new C32667cioccoiococ.C32668coo2iico.C32669coo2iico.C32670c2oc2i.C32671coo2iico();
        c32670c2oc2i.coo2iico = c32671coo2iico;
        c32671coo2iico.coo2iico = xmlPullParser.nextText();
    }

    private void coo2iico(String str, XmlPullParser xmlPullParser, C32667cioccoiococ.C32668coo2iico.C32669coo2iico.C32674coi222o222.C32675coi222o222 c32675coi222o222) throws XmlPullParserException, IOException {
        if (c32675coi222o222 == null) {
            return;
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -2049897434:
                if (str.equals("VideoClicks")) {
                    c = 0;
                    break;
                }
                break;
            case -1927368268:
                if (str.equals(Linear.DURATION)) {
                    c = 1;
                    break;
                }
                break;
            case -385055469:
                if (str.equals(Linear.MEDIA_FILES)) {
                    c = 2;
                    break;
                }
                break;
            case 611554000:
                if (str.equals("TrackingEvents")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                c32675coi222o222.c2oc2i = new C32667cioccoiococ.C32668coo2iico.C32669coo2iico.C32674coi222o222.C32675coi222o222.C32677cioccoiococ();
                return;
            case 1:
                c32675coi222o222.coo2iico = xmlPullParser.nextText();
                return;
            case 2:
                c32675coi222o222.coi222o222 = new ArrayList();
                return;
            case 3:
                c32675coi222o222.cioccoiococ = new ArrayList();
                return;
            default:
                return;
        }
    }

    private void coo2iico(XmlPullParser xmlPullParser, C32667cioccoiococ.C32668coo2iico.C32669coo2iico.C32674coi222o222.C32675coi222o222 c32675coi222o222) throws XmlPullParserException, IOException {
        if (c32675coi222o222 == null) {
            return;
        }
        if (c32675coi222o222.coi222o222 == null) {
            coi222o222("xml error, missing MediaFiles tag");
        }
        C32667cioccoiococ.C32668coo2iico.C32669coo2iico.C32674coi222o222.C32675coi222o222.C32676c2oc2i c32676c2oc2i = new C32667cioccoiococ.C32668coo2iico.C32669coo2iico.C32674coi222o222.C32675coi222o222.C32676c2oc2i();
        c32676c2oc2i.c2oc2i = xmlPullParser.getAttributeValue("", "delivery");
        c32676c2oc2i.cioccoiococ = xmlPullParser.getAttributeValue("", "type");
        c32676c2oc2i.c2oc2o = Integer.parseInt(xmlPullParser.getAttributeValue("", "width"));
        c32676c2oc2i.cco22 = Integer.parseInt(xmlPullParser.getAttributeValue("", "height"));
        String nextText = xmlPullParser.nextText();
        c32676c2oc2i.coi222o222 = nextText;
        if (!TextUtils.isEmpty(nextText)) {
            c32676c2oc2i.coi222o222 = c32676c2oc2i.coi222o222.trim();
        }
        c32675coi222o222.coi222o222.add(c32676c2oc2i);
    }
}
