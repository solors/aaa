package p767l1;

import org.xmlpull.v1.XmlPullParser;

/* renamed from: l1.k */
/* loaded from: classes3.dex */
public class C37902k extends C37892a {
    public C37902k(XmlPullParser xmlPullParser) {
        super(xmlPullParser);
        xmlPullParser.require(2, null, "InLine");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (C37911t.m15738x(name, "Creatives")) {
                    m15842R(m15839U(xmlPullParser));
                } else if (C37911t.m15738x(name, "Extensions")) {
                    m15840T(m15837W(xmlPullParser));
                } else if (C37911t.m15738x(name, "Impression")) {
                    m15831c0(C37911t.m15759B(xmlPullParser));
                } else if (C37911t.m15738x(name, "Error")) {
                    m15832b0(C37911t.m15759B(xmlPullParser));
                } else if (C37911t.m15738x(name, "AdSystem")) {
                    m15841S(new C37893b(xmlPullParser));
                } else {
                    C37911t.m15758C(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, null, "InLine");
    }
}
