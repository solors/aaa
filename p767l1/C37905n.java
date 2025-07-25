package p767l1;

import android.text.TextUtils;
import com.smaato.sdk.video.vast.model.MediaFile;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: l1.n */
/* loaded from: classes3.dex */
public class C37905n extends C37911t {

    /* renamed from: d */
    private static final String[] f99907d = {"delivery", "type", "width", "height", MediaFile.CODEC, "id", MediaFile.BITRATE, MediaFile.MIN_BITRATE, MediaFile.MAX_BITRATE, MediaFile.SCALABLE, MediaFile.MAINTAIN_ASPECT_RATIO, "apiFramework"};

    /* JADX INFO: Access modifiers changed from: package-private */
    public C37905n(XmlPullParser xmlPullParser) {
        super(xmlPullParser);
    }

    @Override // p767l1.C37911t
    /* renamed from: I */
    public String[] mo15727I() {
        return f99907d;
    }

    @Override // p767l1.C37911t
    /* renamed from: M */
    public boolean mo15749M() {
        return true;
    }

    /* renamed from: R */
    public int m15781R() {
        return m15737y("height");
    }

    /* renamed from: S */
    public String m15780S() {
        return m15744r("type");
    }

    /* renamed from: T */
    public int m15779T() {
        return m15737y("width");
    }

    /* renamed from: U */
    public boolean m15778U() {
        String m15744r = m15744r("type");
        String m15744r2 = m15744r("width");
        String m15744r3 = m15744r("height");
        if (!TextUtils.isEmpty(m15744r) && !TextUtils.isEmpty(m15744r2) && !TextUtils.isEmpty(m15744r3) && !TextUtils.isEmpty(m15752J())) {
            return true;
        }
        return false;
    }
}
