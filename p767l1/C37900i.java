package p767l1;

import com.smaato.sdk.video.vast.model.Creative;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: l1.i */
/* loaded from: classes3.dex */
public class C37900i extends C37911t {

    /* renamed from: f */
    private static final String[] f99896f = {"id", "adID"};

    /* renamed from: d */
    private C37899h f99897d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C37900i(XmlPullParser xmlPullParser) {
        super(xmlPullParser);
        C37899h c37904m;
        xmlPullParser.require(2, null, Creative.NAME);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (C37911t.m15738x(name, "Linear")) {
                    c37904m = new C37904m(xmlPullParser);
                } else if (C37911t.m15738x(name, "CompanionAds")) {
                    c37904m = new C37897f(xmlPullParser);
                } else {
                    C37911t.m15758C(xmlPullParser);
                }
                this.f99897d = c37904m;
            }
        }
        xmlPullParser.require(3, null, Creative.NAME);
    }

    @Override // p767l1.C37911t
    /* renamed from: I */
    public String[] mo15727I() {
        return f99896f;
    }

    /* renamed from: R */
    public C37899h m15793R() {
        return this.f99897d;
    }
}
