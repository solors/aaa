package p767l1;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.explorestack.iab.utils.C10507d;
import com.pubmatic.sdk.webrendering.mraid.POBVideoPlayerActivity;
import com.smaato.sdk.video.vast.model.Extension;
import com.zeus.gmc.sdk.mobileads.columbus.common.Constants;
import org.xmlpull.v1.XmlPullParser;
import p734j1.InterfaceC37269k;

/* renamed from: l1.e */
/* loaded from: classes3.dex */
public class C37896e extends C37901j implements InterfaceC37269k {
    @NonNull

    /* renamed from: f */
    private final C10507d f99868f;
    @NonNull

    /* renamed from: g */
    private final C10507d f99869g;
    @NonNull

    /* renamed from: h */
    private final C10507d f99870h;
    @NonNull

    /* renamed from: i */
    private final C10507d f99871i;
    @NonNull

    /* renamed from: j */
    private final C10507d f99872j;
    @NonNull

    /* renamed from: k */
    private final C10507d f99873k;
    @NonNull

    /* renamed from: l */
    private final C10507d f99874l;
    @NonNull

    /* renamed from: m */
    private final C10507d f99875m;
    @NonNull

    /* renamed from: n */
    private final C37906o f99876n;
    @Nullable

    /* renamed from: o */
    private Integer f99877o;
    @Nullable

    /* renamed from: p */
    private Integer f99878p;
    @Nullable

    /* renamed from: q */
    private C37898g f99879q;
    @Nullable

    /* renamed from: r */
    private Boolean f99880r;
    @Nullable

    /* renamed from: s */
    private Float f99881s;

    /* renamed from: t */
    private boolean f99882t;

    /* renamed from: u */
    private boolean f99883u;

    /* renamed from: v */
    private boolean f99884v;

    /* renamed from: w */
    private boolean f99885w;
    @Nullable

    /* renamed from: x */
    private Integer f99886x;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C37896e(XmlPullParser xmlPullParser) {
        super(xmlPullParser);
        C10507d c10507d;
        C10507d c10507d2;
        C10507d c10507d3;
        C10507d c10507d4;
        this.f99868f = new C10507d();
        this.f99869g = new C10507d();
        this.f99870h = new C10507d();
        this.f99871i = new C10507d();
        this.f99872j = new C10507d();
        this.f99873k = new C10507d();
        this.f99874l = new C10507d();
        this.f99875m = new C10507d();
        this.f99876n = new C37906o();
        this.f99882t = false;
        this.f99883u = false;
        this.f99884v = false;
        this.f99885w = false;
        xmlPullParser.require(2, null, Extension.NAME);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (C37911t.m15738x(name, Constants.VIDEO)) {
                    c10507d = this.f99868f;
                } else if (C37911t.m15738x(name, "LoadingView")) {
                    c10507d = this.f99874l;
                } else if (C37911t.m15738x(name, "Countdown")) {
                    c10507d = this.f99875m;
                } else if (C37911t.m15738x(name, "Progress")) {
                    c10507d = this.f99872j;
                } else if (C37911t.m15738x(name, "ClosableView")) {
                    c10507d = this.f99871i;
                } else if (C37911t.m15738x(name, "Mute")) {
                    c10507d = this.f99870h;
                } else if (C37911t.m15738x(name, Constants.CTA)) {
                    c10507d = this.f99869g;
                } else if (C37911t.m15738x(name, "RepeatView")) {
                    c10507d = this.f99873k;
                } else if (C37911t.m15738x(name, "Postbanner")) {
                    this.f99876n.m15746P(xmlPullParser);
                } else if (C37911t.m15738x(name, "Autorotate")) {
                    this.f99880r = Boolean.valueOf(C37911t.m15736z(xmlPullParser));
                } else if (C37911t.m15738x(name, "R1")) {
                    this.f99884v = C37911t.m15736z(xmlPullParser);
                } else if (C37911t.m15738x(name, "R2")) {
                    this.f99885w = C37911t.m15736z(xmlPullParser);
                } else if (C37911t.m15738x(name, POBVideoPlayerActivity.FORCE_ORIENTATION_KEY)) {
                    this.f99886x = C37911t.m15754G(C37911t.m15759B(xmlPullParser));
                } else if (C37911t.m15738x(name, "CtaText")) {
                    this.f99869g.m79396G(C37911t.m15759B(xmlPullParser));
                } else {
                    if (C37911t.m15738x(name, "ShowCta")) {
                        c10507d2 = this.f99869g;
                    } else if (C37911t.m15738x(name, "ShowMute")) {
                        c10507d2 = this.f99870h;
                    } else if (C37911t.m15738x(name, "ShowCompanion")) {
                        this.f99876n.m15771X(C37911t.m15736z(xmlPullParser));
                    } else if (C37911t.m15738x(name, "CompanionCloseTime")) {
                        int m15755F = C37911t.m15755F(C37911t.m15759B(xmlPullParser));
                        if (m15755F > -1) {
                            this.f99876n.m15772W(m15755F);
                        }
                    } else if (C37911t.m15738x(name, "Muted")) {
                        this.f99882t = C37911t.m15736z(xmlPullParser);
                    } else if (C37911t.m15738x(name, "VideoClickable")) {
                        this.f99883u = C37911t.m15736z(xmlPullParser);
                    } else {
                        if (C37911t.m15738x(name, "CtaXPosition")) {
                            c10507d3 = this.f99869g;
                        } else {
                            if (C37911t.m15738x(name, "CtaYPosition")) {
                                c10507d4 = this.f99869g;
                            } else if (C37911t.m15738x(name, "CloseXPosition")) {
                                c10507d3 = this.f99871i;
                            } else if (C37911t.m15738x(name, "CloseYPosition")) {
                                c10507d4 = this.f99871i;
                            } else if (C37911t.m15738x(name, "MuteXPosition")) {
                                c10507d3 = this.f99870h;
                            } else if (C37911t.m15738x(name, "MuteYPosition")) {
                                c10507d4 = this.f99870h;
                            } else if (C37911t.m15738x(name, "AssetsColor")) {
                                Integer m15760A = C37911t.m15760A(C37911t.m15759B(xmlPullParser));
                                if (m15760A != null) {
                                    this.f99877o = m15760A;
                                }
                            } else if (C37911t.m15738x(name, "AssetsBackgroundColor")) {
                                Integer m15760A2 = C37911t.m15760A(C37911t.m15759B(xmlPullParser));
                                if (m15760A2 != null) {
                                    this.f99878p = m15760A2;
                                }
                            } else if (C37911t.m15738x(name, "Companion")) {
                                C37898g c37898g = new C37898g(xmlPullParser);
                                if (c37898g.m15799a0() && c37898g.m15800Z()) {
                                    this.f99879q = c37898g;
                                }
                            } else if (C37911t.m15738x(name, "CloseTime")) {
                                String m15759B = C37911t.m15759B(xmlPullParser);
                                if (m15759B != null) {
                                    this.f99881s = Float.valueOf(Float.parseFloat(m15759B));
                                }
                            } else if (C37911t.m15738x(name, "ShowProgress")) {
                                c10507d2 = this.f99872j;
                            } else {
                                C37911t.m15758C(xmlPullParser);
                            }
                            c10507d4.m79380W(C37911t.m15750L(C37911t.m15759B(xmlPullParser)));
                        }
                        c10507d3.m79390M(C37911t.m15751K(C37911t.m15759B(xmlPullParser)));
                    }
                    c10507d2.m79379X(Boolean.valueOf(C37911t.m15736z(xmlPullParser)));
                }
                C37911t.m15740v(xmlPullParser, c10507d);
            }
        }
        xmlPullParser.require(3, null, Extension.NAME);
    }

    @Nullable
    /* renamed from: R */
    public C37898g m15828R() {
        return this.f99879q;
    }

    /* renamed from: S */
    public boolean m15827S() {
        return this.f99882t;
    }

    @Override // p734j1.InterfaceC37269k
    @NonNull
    /* renamed from: a */
    public C10507d mo15826a() {
        return this.f99871i;
    }

    @Override // p734j1.InterfaceC37269k
    @Nullable
    /* renamed from: b */
    public Integer mo15825b() {
        return this.f99878p;
    }

    @Override // p734j1.InterfaceC37269k
    @NonNull
    /* renamed from: c */
    public C10507d mo15824c() {
        return this.f99873k;
    }

    @Override // p734j1.InterfaceC37269k
    @NonNull
    /* renamed from: d */
    public C37906o mo15823d() {
        return this.f99876n;
    }

    @Override // p734j1.InterfaceC37269k
    /* renamed from: e */
    public boolean mo15822e() {
        return this.f99883u;
    }

    @Override // p734j1.InterfaceC37269k
    @Nullable
    /* renamed from: f */
    public Integer mo15821f() {
        return this.f99886x;
    }

    @Override // p734j1.InterfaceC37269k
    @Nullable
    /* renamed from: g */
    public Float mo15820g() {
        return this.f99881s;
    }

    @Override // p734j1.InterfaceC37269k
    @NonNull
    /* renamed from: h */
    public C10507d mo15819h() {
        return this.f99872j;
    }

    @Override // p734j1.InterfaceC37269k
    @NonNull
    /* renamed from: i */
    public C10507d mo15818i() {
        return this.f99870h;
    }

    @Override // p734j1.InterfaceC37269k
    /* renamed from: j */
    public boolean mo15817j() {
        return this.f99885w;
    }

    @Override // p734j1.InterfaceC37269k
    @NonNull
    /* renamed from: k */
    public C10507d mo15816k() {
        return this.f99868f;
    }

    @Override // p734j1.InterfaceC37269k
    /* renamed from: l */
    public boolean mo15815l() {
        return this.f99884v;
    }

    @Override // p734j1.InterfaceC37269k
    @Nullable
    /* renamed from: m */
    public Integer mo15814m() {
        return this.f99877o;
    }

    @Override // p734j1.InterfaceC37269k
    @NonNull
    /* renamed from: n */
    public C10507d mo15813n() {
        return this.f99869g;
    }

    @Override // p734j1.InterfaceC37269k
    @Nullable
    /* renamed from: o */
    public Boolean mo15812o() {
        return this.f99880r;
    }

    @Override // p734j1.InterfaceC37269k
    @NonNull
    /* renamed from: p */
    public C10507d mo15811p() {
        return this.f99875m;
    }

    @Override // p734j1.InterfaceC37269k
    @NonNull
    /* renamed from: q */
    public C10507d mo15810q() {
        return this.f99874l;
    }
}
