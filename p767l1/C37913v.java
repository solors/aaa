package p767l1;

import com.smaato.sdk.video.vast.model.VideoClicks;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: l1.v */
/* loaded from: classes3.dex */
public class C37913v extends C37911t {

    /* renamed from: d */
    private String f99931d;

    /* renamed from: f */
    private List<String> f99932f;

    /* renamed from: g */
    private List<String> f99933g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C37913v(XmlPullParser xmlPullParser) {
        super(xmlPullParser);
        xmlPullParser.require(2, null, "VideoClicks");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (C37911t.m15738x(name, VideoClicks.CLICK_THROUGH)) {
                    m15728V(C37911t.m15759B(xmlPullParser));
                } else if (C37911t.m15738x(name, VideoClicks.CLICK_TRACKING)) {
                    m15730T(C37911t.m15759B(xmlPullParser));
                } else if (C37911t.m15738x(name, VideoClicks.CUSTOM_CLICK)) {
                    m15729U(C37911t.m15759B(xmlPullParser));
                } else {
                    C37911t.m15758C(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, null, "VideoClicks");
    }

    /* renamed from: T */
    private void m15730T(String str) {
        if (this.f99932f == null) {
            this.f99932f = new ArrayList();
        }
        this.f99932f.add(str);
    }

    /* renamed from: U */
    private void m15729U(String str) {
        if (this.f99933g == null) {
            this.f99933g = new ArrayList();
        }
        this.f99933g.add(str);
    }

    /* renamed from: V */
    private void m15728V(String str) {
        this.f99931d = str;
    }

    /* renamed from: R */
    public String m15732R() {
        return this.f99931d;
    }

    /* renamed from: S */
    public List<String> m15731S() {
        return this.f99932f;
    }
}
