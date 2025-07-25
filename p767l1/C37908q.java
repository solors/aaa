package p767l1;

import com.smaato.sdk.video.vast.model.Tracking;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import p734j1.C37248c;
import p734j1.EnumC37246a;

/* renamed from: l1.q */
/* loaded from: classes3.dex */
class C37908q extends C37911t {

    /* renamed from: d */
    private final EnumMap<EnumC37246a, List<String>> f99922d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C37908q(XmlPullParser xmlPullParser) {
        super(xmlPullParser);
        EnumC37246a enumC37246a;
        this.f99922d = new EnumMap<>(EnumC37246a.class);
        xmlPullParser.require(2, null, "TrackingEvents");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (C37911t.m15738x(xmlPullParser.getName(), Tracking.NAME)) {
                    String m15744r = new C37909r(xmlPullParser).m15744r("event");
                    try {
                        enumC37246a = EnumC37246a.valueOf(m15744r);
                    } catch (Exception unused) {
                        C37248c.m18681a("VastXmlTag", "Event: %s is not valid. Skipping it.", m15744r);
                        enumC37246a = null;
                    }
                    if (enumC37246a != null) {
                        String m15759B = C37911t.m15759B(xmlPullParser);
                        List<String> list = this.f99922d.get(enumC37246a);
                        if (list != null) {
                            list.add(m15759B);
                        } else {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(m15759B);
                            this.f99922d.put((EnumMap<EnumC37246a, List<String>>) enumC37246a, (EnumC37246a) arrayList);
                        }
                    }
                }
                C37911t.m15758C(xmlPullParser);
            }
        }
        xmlPullParser.require(3, null, "TrackingEvents");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: R */
    public EnumMap<EnumC37246a, List<String>> m15763R() {
        return this.f99922d;
    }
}
