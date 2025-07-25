package com.bytedance.sdk.openadsdk.core.p316PX.p319bg.p320bg;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.p316PX.C8643bg;
import com.bytedance.sdk.openadsdk.core.p316PX.p317IL.C8622bX;
import com.bytedance.sdk.openadsdk.core.p316PX.p318bX.C8637bg;
import com.bytedance.sdk.openadsdk.core.p316PX.p319bg.AbstractC8644IL;
import com.bytedance.sdk.openadsdk.core.p316PX.p319bg.EnumC8646bg;
import com.smaato.sdk.video.vast.model.VastTree;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.bytedance.sdk.openadsdk.core.PX.bg.bg.zx */
/* loaded from: classes3.dex */
public class C8651zx extends AbstractC8644IL {

    /* renamed from: iR */
    public static final String f19089iR = null;

    public C8651zx(Context context, int i, int i2) {
        super(context, i, i2);
    }

    /* renamed from: IL */
    public static int m85433IL(String str) {
        if (TextUtils.isEmpty(str)) {
            return Integer.MIN_VALUE;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return Integer.MIN_VALUE;
        }
    }

    /* renamed from: bX */
    private void m85430bX(String str) {
        EnumC8646bg enumC8646bg;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        List singletonList = Collections.singletonList(new C8622bX.C8628bg(str).m85507bg());
        if (this.f19077bg > 0) {
            enumC8646bg = EnumC8646bg.NO_ADS_VAST_RESPONSE;
        } else {
            enumC8646bg = EnumC8646bg.UNDEFINED_ERROR;
        }
        C8622bX.m85516bg(C8622bX.m85515bg(singletonList, enumC8646bg, -1L, null), (C8622bX.C8626IL) null);
    }

    private static List<C8622bX> eqN(String str) {
        return m85427bg(str, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x004e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.bytedance.sdk.openadsdk.core.p316PX.p319bg.AbstractC8644IL
    /* renamed from: bg */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.bytedance.sdk.openadsdk.core.p316PX.C8643bg mo85428bg(java.lang.String r6, java.util.List<com.bytedance.sdk.openadsdk.core.p316PX.p317IL.C8622bX> r7) {
        /*
            r5 = this;
            java.lang.String r0 = "UTF-8"
            r1 = 0
            r5.f19078zx = r1
            android.content.Context r2 = r5.f19075IL
            r3 = 0
            if (r2 != 0) goto Le
            r6 = -1
            r5.f19078zx = r6
            return r3
        Le:
            boolean r2 = android.text.TextUtils.isEmpty(r6)
            if (r2 == 0) goto L18
            r6 = -2
            r5.f19078zx = r6
            return r3
        L18:
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3d
            byte[] r6 = r6.getBytes(r0)     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3d
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3d
            org.xmlpull.v1.XmlPullParser r6 = android.util.Xml.newPullParser()     // Catch: java.lang.Exception -> L3e java.lang.Throwable -> L4a
            java.lang.String r4 = "http://xmlpull.org/v1/doc/features.html#process-namespaces"
            r6.setFeature(r4, r1)     // Catch: java.lang.Exception -> L3e java.lang.Throwable -> L4a
            r6.setInput(r2, r0)     // Catch: java.lang.Exception -> L3e java.lang.Throwable -> L4a
            r6.nextTag()     // Catch: java.lang.Exception -> L3e java.lang.Throwable -> L4a
            com.bytedance.sdk.openadsdk.core.PX.bg r6 = r5.m85423bg(r6, r7)     // Catch: java.lang.Exception -> L3e java.lang.Throwable -> L4a
            r5.m85429bg(r6)     // Catch: java.lang.Exception -> L3e java.lang.Throwable -> L4a
            r2.close()     // Catch: java.io.IOException -> L3a
        L3a:
            return r6
        L3b:
            r6 = move-exception
            goto L4c
        L3d:
            r2 = r3
        L3e:
            r6 = -3
            r5.f19078zx = r6     // Catch: java.lang.Throwable -> L4a
            r5.m85429bg(r3)     // Catch: java.lang.Throwable -> L4a
            if (r2 == 0) goto L49
            r2.close()     // Catch: java.io.IOException -> L49
        L49:
            return r3
        L4a:
            r6 = move-exception
            r3 = r2
        L4c:
            if (r3 == 0) goto L51
            r3.close()     // Catch: java.io.IOException -> L51
        L51:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.p316PX.p319bg.p320bg.C8651zx.mo85428bg(java.lang.String, java.util.List):com.bytedance.sdk.openadsdk.core.PX.bg");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.bytedance.sdk.openadsdk.core.PX.bg.bg.zx$bg */
    /* loaded from: classes3.dex */
    public static class C8652bg {

        /* renamed from: IL */
        C8637bg.EnumC8641bg f19090IL;

        /* renamed from: bX */
        C8637bg.EnumC8640IL f19091bX;

        /* renamed from: bg */
        String f19092bg;
        String eqN;

        /* renamed from: zx */
        final List<C8622bX> f19094zx = new ArrayList();
        final List<C8622bX> ldr = new ArrayList();

        /* renamed from: iR */
        float f19093iR = Float.MIN_VALUE;

        public C8652bg() {
        }

        /* renamed from: IL */
        public void m85422IL(String str) {
            this.ldr.add(new C8622bX.C8628bg(str).m85507bg());
        }

        /* renamed from: bg */
        public void m85420bg(String str, C8637bg.EnumC8641bg enumC8641bg, C8637bg.EnumC8640IL enumC8640IL) {
            this.f19092bg = str;
            this.f19090IL = enumC8641bg;
            this.f19091bX = enumC8640IL;
        }

        /* renamed from: bg */
        public void m85421bg(String str) {
            this.f19094zx.add(new C8622bX.C8628bg(str).m85507bg());
        }

        public C8652bg(String str, C8637bg.EnumC8641bg enumC8641bg, C8637bg.EnumC8640IL enumC8640IL) {
            m85420bg(str, enumC8641bg, enumC8640IL);
        }
    }

    /* renamed from: IL */
    public static String m85432IL(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        String str2;
        String str3 = f19089iR;
        xmlPullParser.require(2, str3, str);
        if (xmlPullParser.next() == 4) {
            str2 = xmlPullParser.getText().trim();
            xmlPullParser.nextTag();
        } else {
            str2 = "";
        }
        xmlPullParser.require(3, str3, str);
        return str2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008a, code lost:
        if (r8.equals("TrackingEvents") == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0017, code lost:
        continue;
     */
    /* renamed from: IL */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.bytedance.sdk.openadsdk.core.p316PX.C8643bg m85431IL(org.xmlpull.v1.XmlPullParser r18, java.util.List<com.bytedance.sdk.openadsdk.core.p316PX.p317IL.C8622bX> r19) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            int r3 = r0.f19077bg
            r4 = 0
            r5 = 5
            if (r3 < r5) goto L10
            m85426bg(r18)
            return r4
        L10:
            com.bytedance.sdk.openadsdk.core.PX.eqN r3 = new com.bytedance.sdk.openadsdk.core.PX.eqN
            r3.<init>(r4)
            r6 = r4
            r7 = r6
        L17:
            int r8 = r18.getEventType()
            java.lang.String r9 = "Wrapper"
            r10 = 3
            if (r8 != r10) goto L42
            java.lang.String r8 = r18.getName()
            boolean r8 = r9.equals(r8)
            if (r8 != 0) goto L2b
            goto L42
        L2b:
            com.bytedance.sdk.openadsdk.core.PX.bg r1 = r0.mo85428bg(r6, r2)
            if (r1 == 0) goto L41
            com.bytedance.sdk.openadsdk.core.PX.bX r2 = r1.m85465bX()
            if (r2 != 0) goto L3a
            r1.m85459bg(r7)
        L3a:
            com.bytedance.sdk.openadsdk.core.PX.eqN r2 = r1.m85463bg()
            r2.m85392bg(r3)
        L41:
            return r1
        L42:
            r18.next()
            int r8 = r18.getEventType()
            r11 = 2
            if (r8 != r11) goto L17
            java.lang.String r8 = r18.getName()
            r8.hashCode()
            int r12 = r8.hashCode()
            java.lang.String r13 = "ClickTracking"
            java.lang.String r14 = "Error"
            java.lang.String r15 = "VASTAdTagURI"
            r16 = -1
            switch(r12) {
                case -587420703: goto L96;
                case 67232232: goto L8d;
                case 611554000: goto L84;
                case 1150879268: goto L79;
                case 2107600959: goto L70;
                case 2114088489: goto L65;
                default: goto L62;
            }
        L62:
            r11 = r16
            goto L9e
        L65:
            java.lang.String r11 = "Impression"
            boolean r11 = r8.equals(r11)
            if (r11 != 0) goto L6e
            goto L62
        L6e:
            r11 = r5
            goto L9e
        L70:
            boolean r11 = r8.equals(r13)
            if (r11 != 0) goto L77
            goto L62
        L77:
            r11 = 4
            goto L9e
        L79:
            java.lang.String r11 = "CompanionAds"
            boolean r11 = r8.equals(r11)
            if (r11 != 0) goto L82
            goto L62
        L82:
            r11 = r10
            goto L9e
        L84:
            java.lang.String r12 = "TrackingEvents"
            boolean r12 = r8.equals(r12)
            if (r12 != 0) goto L9e
            goto L62
        L8d:
            boolean r11 = r8.equals(r14)
            if (r11 != 0) goto L94
            goto L62
        L94:
            r11 = 1
            goto L9e
        L96:
            boolean r11 = r8.equals(r15)
            if (r11 != 0) goto L9d
            goto L62
        L9d:
            r11 = 0
        L9e:
            switch(r11) {
                case 0: goto Ld4;
                case 1: goto Lc2;
                case 2: goto Lbd;
                case 3: goto Lb5;
                case 4: goto Lac;
                case 5: goto La3;
                default: goto La1;
            }
        La1:
            goto L17
        La3:
            java.util.List r8 = m85425bg(r1, r8)
            r3.m85386bg(r8)
            goto L17
        Lac:
            java.util.List r8 = m85425bg(r1, r13)
            r3.m85382iR(r8)
            goto L17
        Lb5:
            android.content.Context r7 = r0.f19075IL
            com.bytedance.sdk.openadsdk.core.PX.bX r7 = com.bytedance.sdk.openadsdk.core.p316PX.p319bg.p320bg.C8649bg.m85435bg(r7, r1)
            goto L17
        Lbd:
            com.bytedance.sdk.openadsdk.core.p316PX.p319bg.p320bg.C8648bX.m85436bg(r1, r3)
            goto L17
        Lc2:
            com.bytedance.sdk.openadsdk.core.PX.IL.bX$bg r8 = new com.bytedance.sdk.openadsdk.core.PX.IL.bX$bg
            java.lang.String r9 = m85432IL(r1, r14)
            r8.<init>(r9)
            com.bytedance.sdk.openadsdk.core.PX.IL.bX r8 = r8.m85507bg()
            r2.add(r8)
            goto L17
        Ld4:
            java.lang.String r6 = m85432IL(r1, r15)
            java.lang.String r6 = r0.m85448IL(r6, r2)
            boolean r8 = android.text.TextUtils.isEmpty(r6)
            if (r8 == 0) goto L17
            m85424bg(r1, r9, r10)
            r1 = -2
            r0.f19078zx = r1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.p316PX.p319bg.p320bg.C8651zx.m85431IL(org.xmlpull.v1.XmlPullParser, java.util.List):com.bytedance.sdk.openadsdk.core.PX.bg");
    }

    /* renamed from: bg */
    private void m85429bg(C8643bg c8643bg) {
        if (this.ldr == null) {
            this.ldr = new AbstractC8644IL.C8645bg();
        }
        AbstractC8644IL.C8645bg c8645bg = this.ldr;
        c8645bg.f19081bg = this.f19078zx;
        c8645bg.f19079IL = this.f19077bg;
        if (c8643bg != null) {
            c8645bg.f19080bX = c8643bg.m85463bg().f19099IL.size() <= 0;
        }
    }

    /* renamed from: bg */
    private C8643bg m85423bg(XmlPullParser xmlPullParser, List<C8622bX> list) throws IOException, XmlPullParserException {
        xmlPullParser.require(2, f19089iR, VastTree.VAST);
        boolean z = false;
        String str = null;
        while (xmlPullParser.next() != 1) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if ("Error".equals(name)) {
                    str = m85432IL(xmlPullParser, name);
                } else if ("Ad".equals(name)) {
                    if (m85446bg(xmlPullParser.getAttributeValue(f19089iR, "sequence"))) {
                        while (true) {
                            if (xmlPullParser.next() == 3 && "Ad".equals(xmlPullParser.getName())) {
                                break;
                            } else if (xmlPullParser.getEventType() == 2) {
                                String name2 = xmlPullParser.getName();
                                if ("InLine".equals(name2)) {
                                    C8643bg m85443bg = C8647IL.m85443bg(this.f19075IL, xmlPullParser, list, this.f19076bX, this.eqN);
                                    if (m85443bg != null) {
                                        if (TextUtils.isEmpty(m85443bg.m85453iR())) {
                                            this.f19078zx = -6;
                                            return null;
                                        }
                                        return m85443bg;
                                    }
                                } else if ("Wrapper".equals(name2)) {
                                    C8643bg m85431IL = m85431IL(xmlPullParser, list);
                                    if (m85431IL != null) {
                                        return m85431IL;
                                    }
                                } else {
                                    m85426bg(xmlPullParser);
                                }
                            }
                        }
                    } else {
                        m85426bg(xmlPullParser);
                    }
                    z = true;
                } else {
                    m85426bg(xmlPullParser);
                }
            }
        }
        if (!z) {
            this.f19078zx = -4;
            m85430bX(str);
        }
        if (this.f19078zx == 0) {
            this.f19078zx = -5;
        }
        return null;
    }

    /* renamed from: bg */
    public static List<C8622bX> m85425bg(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        return eqN(m85432IL(xmlPullParser, str));
    }

    /* renamed from: bg */
    public static void m85426bg(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (xmlPullParser.getEventType() != 2) {
            throw new IllegalStateException();
        }
        int i = 1;
        while (i != 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    /* renamed from: bg */
    public static void m85424bg(XmlPullParser xmlPullParser, String str, int i) throws XmlPullParserException, IOException {
        while (xmlPullParser.getEventType() != 1) {
            if (str.equals(xmlPullParser.getName()) && xmlPullParser.getEventType() == i) {
                return;
            }
            xmlPullParser.next();
        }
    }

    /* renamed from: bg */
    private static List<C8622bX> m85427bg(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return new ArrayList();
        }
        return Collections.singletonList(new C8622bX.C8628bg(str).m85506bg(z).m85507bg());
    }
}
