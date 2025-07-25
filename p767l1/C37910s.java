package p767l1;

import com.smaato.sdk.video.vast.model.VastTree;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: l1.s */
/* loaded from: classes3.dex */
public class C37910s extends C37911t {

    /* renamed from: f */
    private static final String[] f99924f = {"version"};

    /* renamed from: d */
    private final List<C37894c> f99925d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C37910s(XmlPullParser xmlPullParser) {
        super(xmlPullParser);
        this.f99925d = new ArrayList();
        xmlPullParser.require(2, null, VastTree.VAST);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (C37911t.m15738x(xmlPullParser.getName(), "Ad")) {
                    this.f99925d.add(new C37894c(xmlPullParser));
                } else {
                    C37911t.m15758C(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, null, VastTree.VAST);
    }

    @Override // p767l1.C37911t
    /* renamed from: I */
    public String[] mo15727I() {
        return f99924f;
    }

    /* renamed from: R */
    public List<C37894c> m15762R() {
        return this.f99925d;
    }

    /* renamed from: S */
    public boolean m15761S() {
        List<C37894c> list = this.f99925d;
        if (list != null && list.size() > 0) {
            return true;
        }
        return false;
    }
}
