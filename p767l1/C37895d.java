package p767l1;

import androidx.annotation.NonNull;
import com.smaato.sdk.video.vast.model.Verification;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: l1.d */
/* loaded from: classes3.dex */
public class C37895d extends C37901j {

    /* renamed from: f */
    private final List<C37912u> f99867f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C37895d(XmlPullParser xmlPullParser) {
        super(xmlPullParser);
        this.f99867f = new ArrayList();
        xmlPullParser.require(2, null, "AdVerifications");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (C37911t.m15738x(xmlPullParser.getName(), Verification.NAME)) {
                    this.f99867f.add(new C37912u(xmlPullParser));
                } else {
                    C37911t.m15758C(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, null, "AdVerifications");
    }

    @NonNull
    /* renamed from: R */
    public List<C37912u> m15829R() {
        return this.f99867f;
    }
}
