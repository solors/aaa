package p767l1;

import org.xmlpull.v1.XmlPullParser;

/* renamed from: l1.c */
/* loaded from: classes3.dex */
public class C37894c extends C37911t {

    /* renamed from: f */
    private static final String[] f99865f = {"id"};

    /* renamed from: d */
    private C37892a f99866d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C37894c(XmlPullParser xmlPullParser) {
        super(xmlPullParser);
        C37892a c37902k;
        xmlPullParser.require(2, null, "Ad");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (C37911t.m15738x(name, "InLine")) {
                    c37902k = new C37902k(xmlPullParser);
                } else if (C37911t.m15738x(name, "Wrapper")) {
                    c37902k = new C37914w(xmlPullParser);
                } else {
                    C37911t.m15758C(xmlPullParser);
                }
                this.f99866d = c37902k;
            }
        }
        xmlPullParser.require(3, null, "Ad");
    }

    @Override // p767l1.C37911t
    /* renamed from: I */
    public String[] mo15727I() {
        return f99865f;
    }

    /* renamed from: R */
    public C37892a m15830R() {
        return this.f99866d;
    }
}
