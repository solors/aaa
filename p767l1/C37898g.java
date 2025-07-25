package p767l1;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.explorestack.iab.mraid.C10489q;
import com.smaato.sdk.video.vast.model.Companion;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import p734j1.EnumC37246a;

/* renamed from: l1.g */
/* loaded from: classes3.dex */
public class C37898g extends C37911t {

    /* renamed from: l */
    private static final String[] f99888l = {"width", "height", "id", Companion.ASSET_WIDTH, Companion.ASSET_HEIGHT, Companion.EXPANDED_WIDTH, Companion.EXPANDED_HEIGHT, "apiFramework", Companion.AD_SLOT_ID, "required"};

    /* renamed from: d */
    private C37907p f99889d;

    /* renamed from: f */
    private String f99890f;

    /* renamed from: g */
    private String f99891g;

    /* renamed from: h */
    private String f99892h;

    /* renamed from: i */
    private List<String> f99893i;

    /* renamed from: j */
    private Map<EnumC37246a, List<String>> f99894j;

    /* renamed from: k */
    private String f99895k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C37898g(XmlPullParser xmlPullParser) {
        super(xmlPullParser);
        xmlPullParser.require(2, null, "Companion");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (C37911t.m15738x(name, "StaticResource")) {
                    C37907p c37907p = new C37907p(xmlPullParser);
                    if (c37907p.m15764R()) {
                        m15807S(c37907p);
                    }
                } else if (C37911t.m15738x(name, "IFrameResource")) {
                    m15796d0(C37911t.m15759B(xmlPullParser));
                } else if (C37911t.m15738x(name, "HTMLResource")) {
                    m15794f0(C37911t.m15759B(xmlPullParser));
                } else if (C37911t.m15738x(name, Companion.COMPANION_CLICK_THROUGH)) {
                    m15797c0(C37911t.m15759B(xmlPullParser));
                } else if (C37911t.m15738x(name, Companion.COMPANION_CLICK_TRACKING)) {
                    m15798b0(C37911t.m15759B(xmlPullParser));
                } else if (C37911t.m15738x(name, "TrackingEvents")) {
                    m15808R(new C37908q(xmlPullParser).m15763R());
                } else if (C37911t.m15738x(name, "AdParameters")) {
                    m15795e0(C37911t.m15759B(xmlPullParser));
                } else {
                    C37911t.m15758C(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, null, "Companion");
    }

    /* renamed from: R */
    private void m15808R(Map<EnumC37246a, List<String>> map) {
        this.f99894j = map;
    }

    /* renamed from: S */
    private void m15807S(C37907p c37907p) {
        this.f99889d = c37907p;
    }

    /* renamed from: b0 */
    private void m15798b0(String str) {
        if (this.f99893i == null) {
            this.f99893i = new ArrayList();
        }
        this.f99893i.add(str);
    }

    /* renamed from: c0 */
    private void m15797c0(String str) {
        this.f99892h = str;
    }

    /* renamed from: d0 */
    private void m15796d0(String str) {
        this.f99890f = str;
    }

    @Override // p767l1.C37911t
    /* renamed from: I */
    public String[] mo15727I() {
        return f99888l;
    }

    /* renamed from: T */
    public List<String> m15806T() {
        return this.f99893i;
    }

    /* renamed from: U */
    public int m15805U() {
        return m15737y("height");
    }

    @Nullable
    /* renamed from: V */
    public String m15804V() {
        String m15803W = m15803W();
        if (m15803W != null) {
            return C10489q.m79457r(m15803W);
        }
        return null;
    }

    @Nullable
    /* renamed from: W */
    public String m15803W() {
        String str = this.f99891g;
        if (str != null) {
            return str;
        }
        C37907p c37907p = this.f99889d;
        if (c37907p != null) {
            return String.format("<script type='text/javascript'>document.write('<a style=\"display: flex; width: 100%%; height: 100%%; justify-content: center; align-items: center\" href=\"%s\" target=\"_blank\"><img style=\"border-style: none; height: 100%%; width: 100%%; object-fit: contain;\" src=\"%s\"/></a>');</script>", this.f99892h, c37907p.m15752J());
        }
        if (this.f99890f != null) {
            return String.format("<iframe frameborder=\"0\" scrolling=\"no\" marginheight=\"0\" marginwidth=\"0\" style=\"border: 0px; margin: 0px;\" width=\"%s\" height=\"%s\" src=\"%s\"></iframe>", Integer.valueOf(m15801Y()), Integer.valueOf(m15805U()), this.f99890f);
        }
        return null;
    }

    @Nullable
    /* renamed from: X */
    public Map<EnumC37246a, List<String>> m15802X() {
        return this.f99894j;
    }

    /* renamed from: Y */
    public int m15801Y() {
        return m15737y("width");
    }

    /* renamed from: Z */
    public boolean m15800Z() {
        if (this.f99891g == null && this.f99889d == null && this.f99890f == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a0 */
    public boolean m15799a0() {
        String m15744r = m15744r("width");
        String m15744r2 = m15744r("height");
        if (!TextUtils.isEmpty(m15744r) && !TextUtils.isEmpty(m15744r2)) {
            return true;
        }
        return false;
    }

    /* renamed from: e0 */
    public void m15795e0(String str) {
        this.f99895k = str;
    }

    /* renamed from: f0 */
    public void m15794f0(String str) {
        this.f99891g = str;
    }
}
