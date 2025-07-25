package p767l1;

import com.applovin.sdk.AppLovinMediationProvider;
import com.smaato.sdk.video.vast.model.Creative;
import com.smaato.sdk.video.vast.model.Extension;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: l1.a */
/* loaded from: classes3.dex */
public class C37892a extends C37911t {

    /* renamed from: d */
    private C37893b f99859d;

    /* renamed from: f */
    private List<C37900i> f99860f;

    /* renamed from: g */
    private List<C37901j> f99861g;

    /* renamed from: h */
    private List<String> f99862h;

    /* renamed from: i */
    private List<String> f99863i;

    public C37892a(XmlPullParser xmlPullParser) {
        super(xmlPullParser);
    }

    /* renamed from: V */
    private C37901j m15838V(XmlPullParser xmlPullParser) {
        C37901j c37901j;
        xmlPullParser.require(2, null, Extension.NAME);
        String m15744r = new C37901j(xmlPullParser).m15744r("type");
        if (C37911t.m15738x(m15744r, AppLovinMediationProvider.APPODEAL)) {
            c37901j = new C37896e(xmlPullParser);
        } else if (C37911t.m15738x(m15744r, "AdVerifications")) {
            C37901j c37901j2 = null;
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (C37911t.m15738x(xmlPullParser.getName(), "AdVerifications")) {
                        c37901j2 = new C37895d(xmlPullParser);
                    } else {
                        C37911t.m15758C(xmlPullParser);
                    }
                }
            }
            c37901j = c37901j2;
        } else {
            C37911t.m15758C(xmlPullParser);
            c37901j = null;
        }
        xmlPullParser.require(3, null, Extension.NAME);
        return c37901j;
    }

    /* renamed from: R */
    public void m15842R(List<C37900i> list) {
        this.f99860f = list;
    }

    /* renamed from: S */
    public void m15841S(C37893b c37893b) {
        this.f99859d = c37893b;
    }

    /* renamed from: T */
    public void m15840T(List<C37901j> list) {
        this.f99861g = list;
    }

    /* renamed from: U */
    public List<C37900i> m15839U(XmlPullParser xmlPullParser) {
        xmlPullParser.require(2, null, "Creatives");
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (C37911t.m15738x(xmlPullParser.getName(), Creative.NAME)) {
                    arrayList.add(new C37900i(xmlPullParser));
                } else {
                    C37911t.m15758C(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, null, "Creatives");
        return arrayList;
    }

    /* renamed from: W */
    public List<C37901j> m15837W(XmlPullParser xmlPullParser) {
        xmlPullParser.require(2, null, "Extensions");
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (C37911t.m15738x(xmlPullParser.getName(), Extension.NAME)) {
                    C37901j m15838V = m15838V(xmlPullParser);
                    if (m15838V != null) {
                        arrayList.add(m15838V);
                    }
                } else {
                    C37911t.m15758C(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, null, "Extensions");
        return arrayList;
    }

    /* renamed from: X */
    public List<C37900i> m15836X() {
        return this.f99860f;
    }

    /* renamed from: Y */
    public List<String> m15835Y() {
        return this.f99863i;
    }

    /* renamed from: Z */
    public List<C37901j> m15834Z() {
        return this.f99861g;
    }

    /* renamed from: a0 */
    public List<String> m15833a0() {
        return this.f99862h;
    }

    /* renamed from: b0 */
    public void m15832b0(String str) {
        if (this.f99863i == null) {
            this.f99863i = new ArrayList();
        }
        this.f99863i.add(str);
    }

    /* renamed from: c0 */
    public void m15831c0(String str) {
        if (this.f99862h == null) {
            this.f99862h = new ArrayList();
        }
        this.f99862h.add(str);
    }
}
