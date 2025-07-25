package p767l1;

import android.text.TextUtils;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: l1.p */
/* loaded from: classes3.dex */
public class C37907p extends C37911t {

    /* renamed from: d */
    private static final String[] f99921d = {"creativeType"};

    /* JADX INFO: Access modifiers changed from: package-private */
    public C37907p(XmlPullParser xmlPullParser) {
        super(xmlPullParser);
    }

    @Override // p767l1.C37911t
    /* renamed from: I */
    public String[] mo15727I() {
        return f99921d;
    }

    @Override // p767l1.C37911t
    /* renamed from: M */
    public boolean mo15749M() {
        return true;
    }

    /* renamed from: R */
    public boolean m15764R() {
        String m15744r = m15744r("creativeType");
        if (!TextUtils.isEmpty(m15744r)) {
            return m15744r.matches("image/.*(?i)(gif|jpeg|jpg|bmp|png)");
        }
        return false;
    }
}
