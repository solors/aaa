package p767l1;

import com.smaato.sdk.video.vast.model.Wrapper;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: l1.w */
/* loaded from: classes3.dex */
public class C37914w extends C37892a {

    /* renamed from: k */
    private static final String[] f99934k = {Wrapper.FOLLOW_ADDITIONAL_WRAPPERS, Wrapper.ALLOW_MULTIPLE_ADS, Wrapper.FALLBACK_ON_NO_AD};

    /* renamed from: j */
    private String f99935j;

    public C37914w(XmlPullParser xmlPullParser) {
        super(xmlPullParser);
        xmlPullParser.require(2, null, "Wrapper");
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
                } else if (C37911t.m15738x(name, "VASTAdTagURI")) {
                    m15725e0(C37911t.m15759B(xmlPullParser));
                } else {
                    C37911t.m15758C(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, null, "Wrapper");
    }

    /* renamed from: e0 */
    private void m15725e0(String str) {
        this.f99935j = str;
    }

    @Override // p767l1.C37911t
    /* renamed from: I */
    public String[] mo15727I() {
        return f99934k;
    }

    /* renamed from: d0 */
    public String m15726d0() {
        return this.f99935j;
    }
}
