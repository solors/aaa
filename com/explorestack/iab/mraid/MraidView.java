package com.explorestack.iab.mraid;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.explorestack.iab.mraid.MraidAdView;
import com.explorestack.iab.utils.C10504a;
import com.explorestack.iab.utils.C10507d;
import com.explorestack.iab.utils.C10512g;
import com.explorestack.iab.utils.C10530o;
import com.explorestack.iab.utils.C10532q;
import com.explorestack.iab.utils.C10534s;
import com.explorestack.iab.utils.InterfaceC10505b;
import com.explorestack.iab.view.C10593a;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import p678g1.C33182b;
import p678g1.EnumC33181a;
import p708i1.InterfaceC33594b;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes3.dex */
public class MraidView extends C10593a implements C10593a.InterfaceC10597d, InterfaceC10505b {
    @NonNull

    /* renamed from: A */
    private final AtomicBoolean f23843A;
    @NonNull

    /* renamed from: B */
    private final C10593a.InterfaceC10597d f23844B;
    @Nullable

    /* renamed from: C */
    private final C10507d f23845C;
    @Nullable

    /* renamed from: D */
    private final C10507d f23846D;
    @Nullable

    /* renamed from: E */
    private final C10507d f23847E;
    @Nullable

    /* renamed from: F */
    private final C10507d f23848F;

    /* renamed from: G */
    private boolean f23849G;
    @Nullable

    /* renamed from: H */
    private C10534s f23850H;
    @Nullable

    /* renamed from: I */
    private C10532q f23851I;
    @Nullable

    /* renamed from: J */
    private Integer f23852J;
    @NonNull

    /* renamed from: j */
    private final MutableContextWrapper f23853j;
    @NonNull

    /* renamed from: k */
    private final MraidAdView f23854k;
    @Nullable

    /* renamed from: l */
    private C10593a f23855l;
    @Nullable

    /* renamed from: m */
    private C10593a f23856m;
    @Nullable

    /* renamed from: n */
    private C10530o f23857n;
    @Nullable

    /* renamed from: o */
    private WeakReference<Activity> f23858o;
    @Nullable

    /* renamed from: p */
    private String f23859p;
    @Nullable

    /* renamed from: q */
    private InterfaceC10483k f23860q;
    @Nullable

    /* renamed from: r */
    private final InterfaceC33594b f23861r;
    @NonNull

    /* renamed from: s */
    private final EnumC33181a f23862s;

    /* renamed from: t */
    private final float f23863t;

    /* renamed from: u */
    private final float f23864u;

    /* renamed from: v */
    private final float f23865v;

    /* renamed from: w */
    private final boolean f23866w;

    /* renamed from: x */
    private final boolean f23867x;

    /* renamed from: y */
    private final boolean f23868y;

    /* renamed from: z */
    private final boolean f23869z;

    /* renamed from: com.explorestack.iab.mraid.MraidView$a */
    /* loaded from: classes3.dex */
    public static class C10460a {
        @Nullable

        /* renamed from: a */
        private final EnumC10479g f23870a;
        @NonNull

        /* renamed from: b */
        private EnumC33181a f23871b;

        /* renamed from: c */
        private String f23872c;

        /* renamed from: d */
        private String f23873d;

        /* renamed from: e */
        private String f23874e;

        /* renamed from: f */
        private String[] f23875f;
        @VisibleForTesting

        /* renamed from: g */
        public InterfaceC10483k f23876g;

        /* renamed from: h */
        public InterfaceC33594b f23877h;

        /* renamed from: i */
        private C10507d f23878i;

        /* renamed from: j */
        private C10507d f23879j;

        /* renamed from: k */
        private C10507d f23880k;

        /* renamed from: l */
        private C10507d f23881l;

        /* renamed from: m */
        private float f23882m;

        /* renamed from: n */
        private float f23883n;

        /* renamed from: o */
        private float f23884o;

        /* renamed from: p */
        private boolean f23885p;

        /* renamed from: q */
        private boolean f23886q;

        /* renamed from: r */
        private boolean f23887r;

        /* renamed from: s */
        private boolean f23888s;

        public C10460a() {
            this(EnumC10479g.INLINE);
        }

        /* renamed from: A */
        public C10460a m79603A(boolean z) {
            this.f23885p = z;
            return this;
        }

        /* renamed from: B */
        public C10460a m79602B(InterfaceC10483k interfaceC10483k) {
            this.f23876g = interfaceC10483k;
            return this;
        }

        /* renamed from: C */
        public C10460a m79601C(C10507d c10507d) {
            this.f23880k = c10507d;
            return this;
        }

        /* renamed from: D */
        public C10460a m79600D(float f) {
            this.f23882m = f;
            return this;
        }

        /* renamed from: E */
        public C10460a m79599E(String str) {
            this.f23873d = str;
            return this;
        }

        /* renamed from: F */
        public C10460a m79598F(C10507d c10507d) {
            this.f23881l = c10507d;
            return this;
        }

        /* renamed from: G */
        public C10460a m79597G(boolean z) {
            this.f23887r = z;
            return this;
        }

        /* renamed from: H */
        public C10460a m79596H(boolean z) {
            this.f23888s = z;
            return this;
        }

        /* renamed from: c */
        public MraidView m79593c(@NonNull Context context) {
            return new MraidView(context, this, null);
        }

        /* renamed from: h */
        public C10460a m79588h(boolean z) {
            this.f23886q = z;
            return this;
        }

        /* renamed from: t */
        public C10460a m79576t(@Nullable InterfaceC33594b interfaceC33594b) {
            this.f23877h = interfaceC33594b;
            return this;
        }

        /* renamed from: u */
        public C10460a m79575u(String str) {
            this.f23872c = str;
            return this;
        }

        /* renamed from: v */
        public C10460a m79574v(@NonNull EnumC33181a enumC33181a) {
            this.f23871b = enumC33181a;
            return this;
        }

        /* renamed from: w */
        public C10460a m79573w(C10507d c10507d) {
            this.f23878i = c10507d;
            return this;
        }

        /* renamed from: x */
        public C10460a m79572x(float f) {
            this.f23883n = f;
            return this;
        }

        /* renamed from: y */
        public C10460a m79571y(C10507d c10507d) {
            this.f23879j = c10507d;
            return this;
        }

        /* renamed from: z */
        public C10460a m79570z(float f) {
            this.f23884o = f;
            return this;
        }

        public C10460a(@Nullable EnumC10479g enumC10479g) {
            this.f23875f = null;
            this.f23882m = 3.0f;
            this.f23883n = 0.0f;
            this.f23884o = 0.0f;
            this.f23870a = enumC10479g;
            this.f23871b = EnumC33181a.FullLoad;
            this.f23872c = "https://localhost";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.explorestack.iab.mraid.MraidView$b */
    /* loaded from: classes3.dex */
    public class C10461b implements C10534s.InterfaceC10537c {
        C10461b() {
            MraidView.this = r1;
        }

        @Override // com.explorestack.iab.utils.C10534s.InterfaceC10537c
        /* renamed from: a */
        public void mo79196a() {
            if (MraidView.this.f23851I != null) {
                MraidView.this.f23851I.m79224m();
            }
            if (MraidView.this.f23854k.isOpenNotified() || !MraidView.this.f23869z || MraidView.this.f23865v <= 0.0f) {
                return;
            }
            MraidView.this.m79638R();
        }

        @Override // com.explorestack.iab.utils.C10534s.InterfaceC10537c
        /* renamed from: a */
        public void mo79195a(float f, long j, long j2) {
            int i = (int) (j2 / 1000);
            int i2 = (int) (j / 1000);
            if (MraidView.this.f23851I != null) {
                MraidView.this.f23851I.m79215r(f, i2, i);
            }
        }
    }

    /* renamed from: com.explorestack.iab.mraid.MraidView$d */
    /* loaded from: classes3.dex */
    public class RunnableC10463d implements Runnable {
        RunnableC10463d() {
            MraidView.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            EnumC10484l mraidViewState = MraidView.this.f23854k.getMraidViewState();
            if (mraidViewState == EnumC10484l.RESIZED) {
                MraidView.this.m79642N();
            } else if (mraidViewState == EnumC10484l.EXPANDED) {
                MraidView.this.m79643M();
            } else if (MraidView.this.m79635U()) {
                MraidView.this.f23854k.close();
                MraidView.this.m79632X();
            }
        }
    }

    /* renamed from: com.explorestack.iab.mraid.MraidView$e */
    /* loaded from: classes3.dex */
    class RunnableC10464e implements Runnable {
        RunnableC10464e() {
            MraidView.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            MraidView.this.f23854k.updateMetrics(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.explorestack.iab.mraid.MraidView$f */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C10465f {

        /* renamed from: a */
        static final /* synthetic */ int[] f23893a;

        static {
            int[] iArr = new int[EnumC33181a.values().length];
            f23893a = iArr;
            try {
                iArr[EnumC33181a.FullLoad.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23893a[EnumC33181a.Stream.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23893a[EnumC33181a.PartialLoad.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.explorestack.iab.mraid.MraidView$g */
    /* loaded from: classes3.dex */
    public class C10466g implements MraidAdView.InterfaceC10456f {
        private C10466g() {
            MraidView.this = r1;
        }

        @Override // com.explorestack.iab.mraid.MraidAdView.InterfaceC10456f
        public void onChangeOrientationIntention(@NonNull MraidAdView mraidAdView, @NonNull C10478f c10478f) {
            MraidView.this.m79619k(c10478f);
        }

        @Override // com.explorestack.iab.mraid.MraidAdView.InterfaceC10456f
        public void onCloseIntention(@NonNull MraidAdView mraidAdView) {
            MraidView.this.m79640P();
        }

        @Override // com.explorestack.iab.mraid.MraidAdView.InterfaceC10456f
        public boolean onExpandIntention(@NonNull MraidAdView mraidAdView, @NonNull WebView webView, @Nullable C10478f c10478f, boolean z) {
            return MraidView.this.m79608v(webView, c10478f, z);
        }

        @Override // com.explorestack.iab.mraid.MraidAdView.InterfaceC10456f
        public void onExpanded(@NonNull MraidAdView mraidAdView) {
            MraidView.this.m79630Z();
        }

        @Override // com.explorestack.iab.mraid.MraidAdView.InterfaceC10456f
        public void onMraidAdViewExpired(@NonNull MraidAdView mraidAdView, @NonNull C33182b c33182b) {
            MraidView.this.m79612r(c33182b);
        }

        @Override // com.explorestack.iab.mraid.MraidAdView.InterfaceC10456f
        public void onMraidAdViewLoadFailed(@NonNull MraidAdView mraidAdView, @NonNull C33182b c33182b) {
            MraidView.this.m79650F(c33182b);
        }

        @Override // com.explorestack.iab.mraid.MraidAdView.InterfaceC10456f
        public void onMraidAdViewPageLoaded(@NonNull MraidAdView mraidAdView, @NonNull String str, @NonNull WebView webView, boolean z) {
            MraidView.this.m79610t(str, webView, z);
        }

        @Override // com.explorestack.iab.mraid.MraidAdView.InterfaceC10456f
        public void onMraidAdViewShowFailed(@NonNull MraidAdView mraidAdView, @NonNull C33182b c33182b) {
            MraidView.this.m79647I(c33182b);
        }

        @Override // com.explorestack.iab.mraid.MraidAdView.InterfaceC10456f
        public void onMraidAdViewShown(@NonNull MraidAdView mraidAdView) {
            MraidView.this.m79626d0();
        }

        @Override // com.explorestack.iab.mraid.MraidAdView.InterfaceC10456f
        public void onMraidLoadedIntention(@NonNull MraidAdView mraidAdView) {
            MraidView.this.m79628b0();
        }

        @Override // com.explorestack.iab.mraid.MraidAdView.InterfaceC10456f
        public void onOpenBrowserIntention(@NonNull MraidAdView mraidAdView, @NonNull String str) {
            MraidView.this.m79649G(str);
        }

        @Override // com.explorestack.iab.mraid.MraidAdView.InterfaceC10456f
        public void onPlayVideoIntention(@NonNull MraidAdView mraidAdView, @NonNull String str) {
            MraidView.this.m79611s(str);
        }

        @Override // com.explorestack.iab.mraid.MraidAdView.InterfaceC10456f
        public boolean onResizeIntention(@NonNull MraidAdView mraidAdView, @NonNull WebView webView, @NonNull C10480h c10480h, @NonNull C10481i c10481i) {
            return MraidView.this.m79607w(webView, c10480h, c10481i);
        }

        @Override // com.explorestack.iab.mraid.MraidAdView.InterfaceC10456f
        public void onSyncCustomCloseIntention(@NonNull MraidAdView mraidAdView, boolean z) {
            if (MraidView.this.f23867x) {
                return;
            }
            if (z && !MraidView.this.f23849G) {
                MraidView.this.f23849G = true;
            }
            MraidView.this.m79609u(z);
        }

        /* synthetic */ C10466g(MraidView mraidView, C10461b c10461b) {
            this();
        }
    }

    private MraidView(@NonNull Context context, @NonNull C10460a c10460a) {
        super(context);
        this.f23843A = new AtomicBoolean(false);
        this.f23849G = false;
        this.f23853j = new MutableContextWrapper(context);
        this.f23860q = c10460a.f23876g;
        this.f23862s = c10460a.f23871b;
        this.f23863t = c10460a.f23882m;
        this.f23864u = c10460a.f23883n;
        float f = c10460a.f23884o;
        this.f23865v = f;
        this.f23866w = c10460a.f23885p;
        this.f23867x = c10460a.f23886q;
        this.f23868y = c10460a.f23887r;
        this.f23869z = c10460a.f23888s;
        InterfaceC33594b interfaceC33594b = c10460a.f23877h;
        this.f23861r = interfaceC33594b;
        this.f23845C = c10460a.f23878i;
        this.f23846D = c10460a.f23879j;
        this.f23847E = c10460a.f23880k;
        C10507d c10507d = c10460a.f23881l;
        this.f23848F = c10507d;
        MraidAdView m79662a = new MraidAdView.C10454d(context.getApplicationContext(), c10460a.f23870a, new C10466g(this, null)).m79660c(c10460a.f23872c).m79658e(c10460a.f23873d).m79661b(c10460a.f23875f).m79659d(c10460a.f23874e).m79662a();
        this.f23854k = m79662a;
        addView(m79662a, new FrameLayout.LayoutParams(-1, -1, 17));
        if (f > 0.0f) {
            C10532q c10532q = new C10532q(null);
            this.f23851I = c10532q;
            c10532q.m79229f(context, this, c10507d);
            C10534s c10534s = new C10534s(this, new C10461b());
            this.f23850H = c10534s;
            c10534s.m79208b(f);
        }
        this.f23844B = new C10462c();
        setCloseClickListener(this);
        if (interfaceC33594b != null) {
            interfaceC33594b.registerAdContainer(this);
            interfaceC33594b.registerAdView(m79662a.getWebView());
        }
    }

    /* renamed from: B */
    private void m79654B(@NonNull Activity activity) {
        this.f23852J = Integer.valueOf(activity.getRequestedOrientation());
    }

    /* renamed from: F */
    public void m79650F(@NonNull C33182b c33182b) {
        InterfaceC33594b interfaceC33594b = this.f23861r;
        if (interfaceC33594b != null) {
            interfaceC33594b.onError(c33182b);
        }
        InterfaceC10483k interfaceC10483k = this.f23860q;
        if (interfaceC10483k != null) {
            interfaceC10483k.onLoadFailed(this, c33182b);
        }
    }

    /* renamed from: G */
    public void m79649G(@NonNull String str) {
        if (this.f23860q == null) {
            return;
        }
        setLoadingVisible(true);
        InterfaceC33594b interfaceC33594b = this.f23861r;
        if (interfaceC33594b != null) {
            interfaceC33594b.onAdClicked();
        }
        this.f23860q.onOpenBrowser(this, str, this);
    }

    /* renamed from: I */
    public void m79647I(@NonNull C33182b c33182b) {
        InterfaceC33594b interfaceC33594b = this.f23861r;
        if (interfaceC33594b != null) {
            interfaceC33594b.onError(c33182b);
        }
        InterfaceC10483k interfaceC10483k = this.f23860q;
        if (interfaceC10483k != null) {
            interfaceC10483k.onShowFailed(this, c33182b);
        }
    }

    /* renamed from: J */
    private void m79646J(@Nullable String str) {
        this.f23854k.load(str);
    }

    /* renamed from: M */
    public void m79643M() {
        m79620j(this.f23856m);
        this.f23856m = null;
        Activity peekActivity = peekActivity();
        if (peekActivity != null) {
            m79621i(peekActivity);
        }
        this.f23854k.closeExpanded();
    }

    /* renamed from: N */
    public void m79642N() {
        m79620j(this.f23855l);
        this.f23855l = null;
        this.f23854k.closeResized();
    }

    /* renamed from: R */
    public void m79638R() {
        C10507d m79403b = C10504a.m79403b(getContext(), this.f23845C);
        this.f23854k.handleRedirectScreen(m79403b.m79366l().intValue(), m79403b.m79353y().intValue());
    }

    /* renamed from: W */
    private boolean m79633W() {
        return this.f23854k.isLoaded();
    }

    /* renamed from: X */
    public void m79632X() {
        InterfaceC10483k interfaceC10483k = this.f23860q;
        if (interfaceC10483k != null) {
            interfaceC10483k.onClose(this);
        }
    }

    /* renamed from: Z */
    public void m79630Z() {
        InterfaceC10483k interfaceC10483k = this.f23860q;
        if (interfaceC10483k != null) {
            interfaceC10483k.onExpand(this);
        }
    }

    /* renamed from: b0 */
    public void m79628b0() {
        InterfaceC10483k interfaceC10483k;
        if (!this.f23843A.getAndSet(true) && (interfaceC10483k = this.f23860q) != null) {
            interfaceC10483k.onLoaded(this);
        }
    }

    /* renamed from: d0 */
    public void m79626d0() {
        InterfaceC33594b interfaceC33594b = this.f23861r;
        if (interfaceC33594b != null) {
            interfaceC33594b.onAdShown();
        }
        InterfaceC10483k interfaceC10483k = this.f23860q;
        if (interfaceC10483k != null) {
            interfaceC10483k.onShown(this);
        }
    }

    @NonNull
    /* renamed from: f0 */
    private Context m79624f0() {
        Activity peekActivity = peekActivity();
        if (peekActivity == null) {
            return getContext();
        }
        return peekActivity;
    }

    /* renamed from: g0 */
    private void m79623g0() {
        setCloseClickListener(this.f23844B);
        setCloseVisibility(true, this.f23863t);
    }

    /* renamed from: i */
    private void m79621i(@NonNull Activity activity) {
        Integer num = this.f23852J;
        if (num != null) {
            activity.setRequestedOrientation(num.intValue());
            this.f23852J = null;
        }
    }

    /* renamed from: j */
    private void m79620j(@Nullable View view) {
        if (view == null) {
            return;
        }
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).removeAllViews();
        }
        C10512g.m79321L(view);
    }

    /* renamed from: k */
    public void m79619k(@Nullable C10478f c10478f) {
        if (c10478f == null) {
            return;
        }
        Activity peekActivity = peekActivity();
        C10472c.m79529a("MraidView", "applyOrientation: %s", c10478f);
        if (peekActivity == null) {
            C10472c.m79529a("MraidView", "no any interacted activities", new Object[0]);
            return;
        }
        m79654B(peekActivity);
        peekActivity.setRequestedOrientation(c10478f.m79502c(peekActivity));
    }

    /* renamed from: l */
    private void m79618l(@NonNull C10480h c10480h, @NonNull C10481i c10481i) {
        C10472c.m79529a("MraidView", "setResizedViewSizeAndPosition: %s", c10480h);
        if (this.f23855l == null) {
            return;
        }
        int m79302o = C10512g.m79302o(getContext(), c10480h.f23925a);
        int m79302o2 = C10512g.m79302o(getContext(), c10480h.f23926b);
        int m79302o3 = C10512g.m79302o(getContext(), c10480h.f23927c);
        int m79302o4 = C10512g.m79302o(getContext(), c10480h.f23928d);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(m79302o, m79302o2);
        Rect m79494f = c10481i.m79494f();
        layoutParams.leftMargin = m79494f.left + m79302o3;
        layoutParams.topMargin = m79494f.top + m79302o4;
        this.f23855l.setLayoutParams(layoutParams);
    }

    /* renamed from: q */
    private void m79613q(@NonNull C10593a c10593a, boolean z) {
        setCloseClickListener(this);
        c10593a.setCloseStyle(this.f23845C);
        c10593a.setCountDownStyle(this.f23846D);
        m79609u(z);
    }

    /* renamed from: r */
    public void m79612r(@NonNull C33182b c33182b) {
        InterfaceC33594b interfaceC33594b = this.f23861r;
        if (interfaceC33594b != null) {
            interfaceC33594b.onError(c33182b);
        }
        InterfaceC10483k interfaceC10483k = this.f23860q;
        if (interfaceC10483k != null) {
            interfaceC10483k.onExpired(this, c33182b);
        }
    }

    /* renamed from: s */
    public void m79611s(@NonNull String str) {
        InterfaceC10483k interfaceC10483k = this.f23860q;
        if (interfaceC10483k != null) {
            interfaceC10483k.onPlayVideo(this, str);
        }
    }

    /* renamed from: t */
    public void m79610t(@NonNull String str, @NonNull WebView webView, boolean z) {
        setLoadingVisible(false);
        if (m79635U()) {
            m79613q(this, z);
        }
        InterfaceC33594b interfaceC33594b = this.f23861r;
        if (interfaceC33594b != null) {
            interfaceC33594b.onAdViewReady(webView);
        }
        if (this.f23862s == EnumC33181a.FullLoad && !this.f23866w && !str.equals("data:text/html,<html></html>")) {
            m79628b0();
        }
    }

    /* renamed from: u */
    public void m79609u(boolean z) {
        boolean z2;
        float f;
        if (z && !this.f23867x) {
            z2 = false;
        } else {
            z2 = true;
        }
        C10593a c10593a = this.f23855l;
        if (c10593a != null || (c10593a = this.f23856m) != null) {
            c10593a.setCloseVisibility(z2, this.f23864u);
        } else if (m79635U()) {
            if (this.f23849G) {
                f = 0.0f;
            } else {
                f = this.f23864u;
            }
            setCloseVisibility(z2, f);
        }
    }

    /* renamed from: v */
    public boolean m79608v(@NonNull WebView webView, @Nullable C10478f c10478f, boolean z) {
        C10593a c10593a = this.f23856m;
        if (c10593a == null || c10593a.getParent() == null) {
            View m79472c = C10489q.m79472c(m79624f0(), this);
            if (!(m79472c instanceof ViewGroup)) {
                C10472c.m79526d("MraidView", "Can't add resized view because can't find required parent", new Object[0]);
                return false;
            }
            C10593a c10593a2 = new C10593a(getContext());
            this.f23856m = c10593a2;
            c10593a2.setCloseClickListener(this);
            ((ViewGroup) m79472c).addView(this.f23856m);
        }
        C10512g.m79321L(webView);
        this.f23856m.addView(webView);
        m79613q(this.f23856m, z);
        m79619k(c10478f);
        return true;
    }

    /* renamed from: w */
    public boolean m79607w(@NonNull WebView webView, @NonNull C10480h c10480h, @NonNull C10481i c10481i) {
        C10593a c10593a = this.f23855l;
        if (c10593a == null || c10593a.getParent() == null) {
            View m79472c = C10489q.m79472c(m79624f0(), this);
            if (!(m79472c instanceof ViewGroup)) {
                C10472c.m79526d("MraidView", "Can't add resized view because can't find required parent", new Object[0]);
                return false;
            }
            C10593a c10593a2 = new C10593a(getContext());
            this.f23855l = c10593a2;
            c10593a2.setCloseClickListener(this);
            ((ViewGroup) m79472c).addView(this.f23855l);
        }
        C10512g.m79321L(webView);
        this.f23855l.addView(webView);
        C10507d m79403b = C10504a.m79403b(getContext(), this.f23845C);
        m79403b.m79390M(Integer.valueOf(c10480h.f23929e.m79482e() & 7));
        m79403b.m79380W(Integer.valueOf(c10480h.f23929e.m79482e() & 112));
        this.f23855l.setCloseStyle(m79403b);
        this.f23855l.setCloseVisibility(false, this.f23864u);
        m79618l(c10480h, c10481i);
        return true;
    }

    /* renamed from: P */
    public void m79640P() {
        if (!this.f23854k.isOpenNotified() && this.f23868y) {
            m79638R();
        } else {
            C10512g.m79328E(new RunnableC10463d());
        }
    }

    @VisibleForTesting
    /* renamed from: U */
    boolean m79635U() {
        return this.f23854k.isInterstitial();
    }

    @Override // com.explorestack.iab.view.C10593a
    public boolean canBeClosed() {
        if (getOnScreenTimeMs() > C10489q.f23963a || this.f23854k.isReceivedJsError()) {
            return true;
        }
        if (!this.f23867x && this.f23854k.isUseCustomClose()) {
            return false;
        }
        return super.canBeClosed();
    }

    @Override // com.explorestack.iab.utils.InterfaceC10505b
    public void clickHandleCanceled() {
        setLoadingVisible(false);
    }

    public void clickHandleError() {
        setLoadingVisible(false);
    }

    @Override // com.explorestack.iab.utils.InterfaceC10505b
    public void clickHandled() {
        setLoadingVisible(false);
    }

    public void destroy() {
        this.f23860q = null;
        this.f23858o = null;
        Activity peekActivity = peekActivity();
        if (peekActivity != null) {
            m79621i(peekActivity);
        }
        m79620j(this.f23855l);
        m79620j(this.f23856m);
        this.f23854k.destroy();
        C10534s c10534s = this.f23850H;
        if (c10534s != null) {
            c10534s.m79209a();
        }
    }

    public void load(@Nullable String str) {
        InterfaceC33594b interfaceC33594b = this.f23861r;
        if (interfaceC33594b != null && str != null) {
            str = interfaceC33594b.prepareCreativeForMeasure(str);
        }
        int i = C10465f.f23893a[this.f23862s.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    m79628b0();
                } else {
                    return;
                }
            } else {
                this.f23859p = str;
                m79628b0();
                return;
            }
        }
        m79646J(str);
    }

    @Override // com.explorestack.iab.view.C10593a.InterfaceC10597d
    public void onCloseClick() {
        m79640P();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C10472c.m79529a("MraidView", "onConfigurationChanged: %s", C10512g.m79324I(configuration.orientation));
        C10512g.m79328E(new RunnableC10464e());
    }

    @Override // com.explorestack.iab.view.C10593a.InterfaceC10597d
    public void onCountDownFinish() {
        if (!this.f23854k.isOpenNotified() && this.f23869z && this.f23865v == 0.0f) {
            m79638R();
        }
    }

    @Nullable
    public Activity peekActivity() {
        WeakReference<Activity> weakReference = this.f23858o;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public void setLastInteractedActivity(@Nullable Activity activity) {
        if (activity != null) {
            this.f23858o = new WeakReference<>(activity);
            this.f23853j.setBaseContext(activity);
        }
    }

    public void setLoadingVisible(boolean z) {
        if (z) {
            if (this.f23857n == null) {
                C10530o c10530o = new C10530o(null);
                this.f23857n = c10530o;
                c10530o.m79229f(getContext(), this, this.f23847E);
            }
            this.f23857n.m79230d(0);
            this.f23857n.m79231c();
            return;
        }
        C10530o c10530o2 = this.f23857n;
        if (c10530o2 != null) {
            c10530o2.m79230d(8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x001e, code lost:
        if (m79635U() != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0041, code lost:
        if (m79635U() != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0043, code lost:
        m79613q(r2, r2.f23854k.isUseCustomClose());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void show(@androidx.annotation.Nullable android.app.Activity r3) {
        /*
            r2 = this;
            int[] r0 = com.explorestack.iab.mraid.MraidView.C10465f.f23893a
            g1.a r1 = r2.f23862s
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L3d
            r1 = 2
            if (r0 == r1) goto L2b
            r1 = 3
            if (r0 == r1) goto L14
            goto L4c
        L14:
            boolean r0 = r2.m79633W()
            if (r0 == 0) goto L21
            boolean r0 = r2.m79635U()
            if (r0 == 0) goto L4c
            goto L43
        L21:
            boolean r0 = r2.m79635U()
            if (r0 == 0) goto L4c
            r2.m79623g0()
            goto L4c
        L2b:
            boolean r0 = r2.m79635U()
            if (r0 == 0) goto L34
            r2.m79623g0()
        L34:
            java.lang.String r0 = r2.f23859p
            r2.m79646J(r0)
            r0 = 0
            r2.f23859p = r0
            goto L4c
        L3d:
            boolean r0 = r2.m79635U()
            if (r0 == 0) goto L4c
        L43:
            com.explorestack.iab.mraid.MraidAdView r0 = r2.f23854k
            boolean r0 = r0.isUseCustomClose()
            r2.m79613q(r2, r0)
        L4c:
            com.explorestack.iab.mraid.MraidAdView r0 = r2.f23854k
            r0.show()
            r2.setLastInteractedActivity(r3)
            com.explorestack.iab.mraid.MraidAdView r3 = r2.f23854k
            com.explorestack.iab.mraid.f r3 = r3.getLastOrientationProperties()
            r2.m79619k(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.iab.mraid.MraidView.show(android.app.Activity):void");
    }

    /* synthetic */ MraidView(Context context, C10460a c10460a, C10461b c10461b) {
        this(context, c10460a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.explorestack.iab.mraid.MraidView$c */
    /* loaded from: classes3.dex */
    public class C10462c implements C10593a.InterfaceC10597d {
        C10462c() {
            MraidView.this = r1;
        }

        @Override // com.explorestack.iab.view.C10593a.InterfaceC10597d
        public void onCloseClick() {
            MraidView.this.m79647I(C33182b.m24481i("Close button clicked"));
            MraidView.this.m79632X();
        }

        @Override // com.explorestack.iab.view.C10593a.InterfaceC10597d
        public void onCountDownFinish() {
        }
    }
}
