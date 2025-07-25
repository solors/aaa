package p767l1;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.explorestack.iab.utils.C10507d;
import com.smaato.sdk.video.vast.model.Linear;
import org.xmlpull.v1.XmlPullParser;
import p734j1.C37248c;

/* renamed from: l1.o */
/* loaded from: classes3.dex */
public class C37906o extends C37911t {

    /* renamed from: q */
    static final /* synthetic */ boolean f99908q = true;
    @Nullable

    /* renamed from: i */
    private String f99913i;
    @NonNull

    /* renamed from: d */
    private final C10507d f99909d = new C10507d();
    @NonNull

    /* renamed from: f */
    private final C10507d f99910f = new C10507d();
    @NonNull

    /* renamed from: g */
    private final C10507d f99911g = new C10507d();
    @NonNull

    /* renamed from: h */
    private final C10507d f99912h = new C10507d();

    /* renamed from: j */
    private float f99914j = 0.0f;

    /* renamed from: k */
    private float f99915k = 0.0f;

    /* renamed from: l */
    private boolean f99916l = true;

    /* renamed from: m */
    private boolean f99917m = false;

    /* renamed from: n */
    private boolean f99918n = false;

    /* renamed from: o */
    private boolean f99919o = false;

    /* renamed from: p */
    private boolean f99920p = false;

    /* renamed from: R */
    public float m15777R() {
        return this.f99914j;
    }

    /* renamed from: S */
    public float m15776S() {
        return this.f99915k;
    }

    @Nullable
    /* renamed from: T */
    public String m15775T() {
        return this.f99913i;
    }

    /* renamed from: U */
    public boolean m15774U() {
        return this.f99918n;
    }

    /* renamed from: V */
    public boolean m15773V() {
        return this.f99916l;
    }

    /* renamed from: W */
    public void m15772W(int i) {
        this.f99914j = i;
    }

    /* renamed from: X */
    public void m15771X(boolean z) {
        this.f99916l = z;
    }

    @NonNull
    /* renamed from: a */
    public C10507d m15770a() {
        return this.f99909d;
    }

    @NonNull
    /* renamed from: h */
    public C10507d m15769h() {
        return this.f99912h;
    }

    /* renamed from: j */
    public boolean m15768j() {
        return this.f99920p;
    }

    /* renamed from: l */
    public boolean m15767l() {
        return this.f99919o;
    }

    @NonNull
    /* renamed from: p */
    public C10507d m15766p() {
        return this.f99910f;
    }

    @NonNull
    /* renamed from: q */
    public C10507d m15765q() {
        return this.f99911g;
    }

    @Override // p767l1.C37911t
    /* renamed from: u */
    protected void mo15741u(XmlPullParser xmlPullParser) {
        C10507d c10507d;
        xmlPullParser.require(2, null, "Postbanner");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                try {
                    String name = xmlPullParser.getName();
                    if (C37911t.m15738x(name, "CloseTime")) {
                        String m15759B = C37911t.m15759B(xmlPullParser);
                        if (TextUtils.isEmpty(m15759B)) {
                            continue;
                        } else {
                            if (!f99908q && m15759B == null) {
                                throw new AssertionError();
                            }
                            this.f99914j = Float.parseFloat(m15759B);
                        }
                    } else if (C37911t.m15738x(name, Linear.DURATION)) {
                        String m15759B2 = C37911t.m15759B(xmlPullParser);
                        if (TextUtils.isEmpty(m15759B2)) {
                            continue;
                        } else {
                            if (!f99908q && m15759B2 == null) {
                                throw new AssertionError();
                            }
                            this.f99915k = Float.parseFloat(m15759B2);
                        }
                    } else {
                        if (C37911t.m15738x(name, "ClosableView")) {
                            c10507d = this.f99909d;
                        } else if (C37911t.m15738x(name, "Countdown")) {
                            c10507d = this.f99910f;
                        } else if (C37911t.m15738x(name, "LoadingView")) {
                            c10507d = this.f99911g;
                        } else if (C37911t.m15738x(name, "Progress")) {
                            c10507d = this.f99912h;
                        } else if (C37911t.m15738x(name, "UseNativeClose")) {
                            this.f99918n = C37911t.m15736z(xmlPullParser);
                        } else if (C37911t.m15738x(name, "IgnoresSafeAreaLayoutGuide")) {
                            this.f99917m = C37911t.m15736z(xmlPullParser);
                        } else if (C37911t.m15738x(name, "ProductLink")) {
                            this.f99913i = C37911t.m15759B(xmlPullParser);
                        } else if (C37911t.m15738x(name, "R1")) {
                            this.f99919o = C37911t.m15736z(xmlPullParser);
                        } else if (C37911t.m15738x(name, "R2")) {
                            this.f99920p = C37911t.m15736z(xmlPullParser);
                        } else {
                            C37911t.m15758C(xmlPullParser);
                        }
                        C37911t.m15740v(xmlPullParser, c10507d);
                    }
                } catch (Throwable th) {
                    C37248c.m18680b("VastXmlTag", th);
                }
            }
        }
        xmlPullParser.require(3, null, "Postbanner");
    }
}
