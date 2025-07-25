package p767l1;

import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import p734j1.C37248c;

/* renamed from: l1.f */
/* loaded from: classes3.dex */
public class C37897f extends C37899h {

    /* renamed from: d */
    private final List<C37898g> f99887d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C37897f(XmlPullParser xmlPullParser) {
        super(xmlPullParser);
        this.f99887d = new ArrayList();
        xmlPullParser.require(2, null, "CompanionAds");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (C37911t.m15738x(xmlPullParser.getName(), "Companion")) {
                    C37898g c37898g = new C37898g(xmlPullParser);
                    if (c37898g.m15799a0()) {
                        this.f99887d.add(c37898g);
                    } else {
                        C37248c.m18681a("VastXmlTag", "Creative Companion: is not valid. Skipping it.", new Object[0]);
                    }
                } else {
                    C37911t.m15758C(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, null, "CompanionAds");
    }

    /* renamed from: R */
    public List<C37898g> m15809R() {
        return this.f99887d;
    }
}
