package p767l1;

import androidx.annotation.Nullable;
import com.smaato.sdk.video.vast.model.Linear;
import com.smaato.sdk.video.vast.model.MediaFile;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import p734j1.C37248c;
import p734j1.EnumC37246a;

/* renamed from: l1.m */
/* loaded from: classes3.dex */
public class C37904m extends C37899h {

    /* renamed from: k */
    private static final String[] f99900k = {Linear.SKIPOFFSET};
    @Nullable

    /* renamed from: d */
    private Float f99901d;

    /* renamed from: f */
    private List<C37905n> f99902f;

    /* renamed from: g */
    private C37913v f99903g;

    /* renamed from: h */
    private String f99904h;

    /* renamed from: i */
    private EnumMap<EnumC37246a, List<String>> f99905i;

    /* renamed from: j */
    private int f99906j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C37904m(XmlPullParser xmlPullParser) {
        super(xmlPullParser);
        this.f99906j = -1;
        xmlPullParser.require(2, null, "Linear");
        int m15756E = C37911t.m15756E(m15744r(Linear.SKIPOFFSET));
        if (m15756E > -1) {
            m15792R(m15756E);
        }
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (C37911t.m15738x(name, Linear.DURATION)) {
                    float m15756E2 = C37911t.m15756E(C37911t.m15759B(xmlPullParser));
                    if (m15756E2 > -1.0f) {
                        m15782b0(Float.valueOf(m15756E2));
                    }
                } else if (C37911t.m15738x(name, Linear.MEDIA_FILES)) {
                    m15790T(m15788V(xmlPullParser));
                } else if (C37911t.m15738x(name, "VideoClicks")) {
                    m15789U(new C37913v(xmlPullParser));
                } else if (C37911t.m15738x(name, "AdParameters")) {
                    m15783a0(C37911t.m15759B(xmlPullParser));
                } else if (C37911t.m15738x(name, "TrackingEvents")) {
                    m15791S(new C37908q(xmlPullParser).m15763R());
                } else {
                    C37911t.m15758C(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, null, "Linear");
    }

    /* renamed from: R */
    private void m15792R(int i) {
        this.f99906j = i;
    }

    /* renamed from: S */
    private void m15791S(EnumMap<EnumC37246a, List<String>> enumMap) {
        this.f99905i = enumMap;
    }

    /* renamed from: T */
    private void m15790T(List<C37905n> list) {
        this.f99902f = list;
    }

    /* renamed from: U */
    private void m15789U(C37913v c37913v) {
        this.f99903g = c37913v;
    }

    /* renamed from: V */
    private static List<C37905n> m15788V(XmlPullParser xmlPullParser) {
        xmlPullParser.require(2, null, Linear.MEDIA_FILES);
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (C37911t.m15738x(xmlPullParser.getName(), MediaFile.NAME)) {
                    C37905n c37905n = new C37905n(xmlPullParser);
                    if (c37905n.m15778U()) {
                        arrayList.add(c37905n);
                    } else {
                        C37248c.m18681a("VastXmlTag", "MediaFile: is not valid. Skipping it.", new Object[0]);
                    }
                }
                C37911t.m15758C(xmlPullParser);
            }
        }
        xmlPullParser.require(3, null, Linear.MEDIA_FILES);
        return arrayList;
    }

    @Override // p767l1.C37911t
    /* renamed from: I */
    public String[] mo15727I() {
        return f99900k;
    }

    @Nullable
    /* renamed from: W */
    public Float m15787W() {
        return this.f99901d;
    }

    /* renamed from: X */
    public List<C37905n> m15786X() {
        return this.f99902f;
    }

    /* renamed from: Y */
    public Map<EnumC37246a, List<String>> m15785Y() {
        return this.f99905i;
    }

    /* renamed from: Z */
    public C37913v m15784Z() {
        return this.f99903g;
    }

    /* renamed from: a0 */
    public void m15783a0(String str) {
        this.f99904h = str;
    }

    /* renamed from: b0 */
    public void m15782b0(@Nullable Float f) {
        this.f99901d = f;
    }
}
