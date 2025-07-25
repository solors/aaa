package p767l1;

import androidx.annotation.Nullable;
import com.smaato.sdk.video.vast.model.Verification;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: l1.u */
/* loaded from: classes3.dex */
public class C37912u extends C37911t {

    /* renamed from: g */
    private static final String[] f99928g = {Verification.VENDOR};

    /* renamed from: d */
    private C37903l f99929d;

    /* renamed from: f */
    private String f99930f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C37912u(XmlPullParser xmlPullParser) {
        super(xmlPullParser);
        xmlPullParser.require(2, null, Verification.NAME);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (C37911t.m15738x(name, "JavaScriptResource")) {
                    this.f99929d = new C37903l(xmlPullParser);
                } else if (C37911t.m15738x(name, Verification.VERIFICATION_PARAMETERS)) {
                    this.f99930f = C37911t.m15759B(xmlPullParser);
                } else {
                    C37911t.m15758C(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, null, Verification.NAME);
    }

    @Override // p767l1.C37911t
    /* renamed from: I */
    public String[] mo15727I() {
        return f99928g;
    }

    @Nullable
    /* renamed from: R */
    public C37903l m15735R() {
        return this.f99929d;
    }

    @Nullable
    /* renamed from: S */
    public String m15734S() {
        return m15744r(Verification.VENDOR);
    }

    @Nullable
    /* renamed from: T */
    public String m15733T() {
        return this.f99930f;
    }
}
