package com.ironsource;

import android.view.View;
import com.ironsource.C19707cg;
import com.ironsource.C21114v8;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* renamed from: com.ironsource.gg */
/* loaded from: classes6.dex */
public final class C19986gg {
    @NotNull

    /* renamed from: a */
    private C19707cg f50235a;
    @Nullable

    /* renamed from: b */
    private View f50236b;
    @Nullable

    /* renamed from: c */
    private View f50237c;
    @Nullable

    /* renamed from: d */
    private View f50238d;
    @Nullable

    /* renamed from: e */
    private View f50239e;
    @Nullable

    /* renamed from: f */
    private View f50240f;
    @Nullable

    /* renamed from: g */
    private View f50241g;
    @NotNull

    /* renamed from: h */
    private View f50242h;
    @Nullable

    /* renamed from: i */
    private InterfaceC19987a f50243i;

    @Metadata
    /* renamed from: com.ironsource.gg$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC19987a {
        /* renamed from: a */
        void mo58365a(@NotNull C19941fu c19941fu);

        /* renamed from: a */
        void mo58364a(@NotNull EnumC19988b enumC19988b);
    }

    @Metadata
    /* renamed from: com.ironsource.gg$b */
    /* loaded from: classes6.dex */
    public enum EnumC19988b {
        Title("title"),
        Advertiser(C21114v8.C21122h.f54027F0),
        Body("body"),
        Cta("cta"),
        Icon("icon"),
        Container("container"),
        PrivacyIcon(C21114v8.C21122h.f54035J0);
        
        @NotNull

        /* renamed from: a */
        private final String f50252a;

        EnumC19988b(String str) {
            this.f50252a = str;
        }

        @NotNull
        /* renamed from: b */
        public final String m58362b() {
            return this.f50252a;
        }
    }

    @Metadata
    /* renamed from: com.ironsource.gg$c */
    /* loaded from: classes6.dex */
    public static final class C19989c implements C19707cg.InterfaceC19708a {
        C19989c() {
            C19986gg.this = r1;
        }

        @Override // com.ironsource.C19707cg.InterfaceC19708a
        /* renamed from: a */
        public void mo58361a(@NotNull C19941fu viewVisibilityParams) {
            Intrinsics.checkNotNullParameter(viewVisibilityParams, "viewVisibilityParams");
            InterfaceC19987a m58372n = C19986gg.this.m58372n();
            if (m58372n != null) {
                m58372n.mo58365a(viewVisibilityParams);
            }
        }
    }

    public C19986gg(@NotNull C19707cg containerView, @Nullable View view, @Nullable View view2, @Nullable View view3, @Nullable View view4, @Nullable View view5, @Nullable View view6, @NotNull View privacyIconView) {
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(privacyIconView, "privacyIconView");
        this.f50235a = containerView;
        this.f50236b = view;
        this.f50237c = view2;
        this.f50238d = view3;
        this.f50239e = view4;
        this.f50240f = view5;
        this.f50241g = view6;
        this.f50242h = privacyIconView;
        m58368r();
        m58367s();
    }

    /* renamed from: b */
    public static /* synthetic */ void m58389b(C19986gg c19986gg, EnumC19988b enumC19988b, View view) {
        m58392a(c19986gg, enumC19988b, view);
    }

    /* renamed from: r */
    private final void m58368r() {
        m58394a(this, this.f50236b, EnumC19988b.Title);
        m58394a(this, this.f50237c, EnumC19988b.Advertiser);
        m58394a(this, this.f50239e, EnumC19988b.Body);
        m58394a(this, this.f50241g, EnumC19988b.Cta);
        m58394a(this, this.f50238d, EnumC19988b.Icon);
        m58394a(this, this.f50235a, EnumC19988b.Container);
        m58394a(this, this.f50242h, EnumC19988b.PrivacyIcon);
    }

    /* renamed from: s */
    private final void m58367s() {
        this.f50235a.setListener$mediationsdk_release(new C19989c());
    }

    @NotNull
    /* renamed from: a */
    public final C19707cg m58399a() {
        return this.f50235a;
    }

    @Nullable
    /* renamed from: c */
    public final View m58388c() {
        return this.f50237c;
    }

    @Nullable
    /* renamed from: d */
    public final View m58386d() {
        return this.f50238d;
    }

    @Nullable
    /* renamed from: e */
    public final View m58384e() {
        return this.f50239e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19986gg)) {
            return false;
        }
        C19986gg c19986gg = (C19986gg) obj;
        if (Intrinsics.m17075f(this.f50235a, c19986gg.f50235a) && Intrinsics.m17075f(this.f50236b, c19986gg.f50236b) && Intrinsics.m17075f(this.f50237c, c19986gg.f50237c) && Intrinsics.m17075f(this.f50238d, c19986gg.f50238d) && Intrinsics.m17075f(this.f50239e, c19986gg.f50239e) && Intrinsics.m17075f(this.f50240f, c19986gg.f50240f) && Intrinsics.m17075f(this.f50241g, c19986gg.f50241g) && Intrinsics.m17075f(this.f50242h, c19986gg.f50242h)) {
            return true;
        }
        return false;
    }

    @Nullable
    /* renamed from: f */
    public final View m58382f() {
        return this.f50240f;
    }

    @Nullable
    /* renamed from: g */
    public final View m58380g() {
        return this.f50241g;
    }

    @NotNull
    /* renamed from: h */
    public final View m58378h() {
        return this.f50242h;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6 = this.f50235a.hashCode() * 31;
        View view = this.f50236b;
        int i = 0;
        if (view == null) {
            hashCode = 0;
        } else {
            hashCode = view.hashCode();
        }
        int i2 = (hashCode6 + hashCode) * 31;
        View view2 = this.f50237c;
        if (view2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = view2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        View view3 = this.f50238d;
        if (view3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = view3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        View view4 = this.f50239e;
        if (view4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = view4.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        View view5 = this.f50240f;
        if (view5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = view5.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        View view6 = this.f50241g;
        if (view6 != null) {
            i = view6.hashCode();
        }
        return ((i6 + i) * 31) + this.f50242h.hashCode();
    }

    @Nullable
    /* renamed from: i */
    public final View m58377i() {
        return this.f50237c;
    }

    @Nullable
    /* renamed from: j */
    public final View m58376j() {
        return this.f50239e;
    }

    @NotNull
    /* renamed from: k */
    public final C19707cg m58375k() {
        return this.f50235a;
    }

    @Nullable
    /* renamed from: l */
    public final View m58374l() {
        return this.f50241g;
    }

    @Nullable
    /* renamed from: m */
    public final View m58373m() {
        return this.f50238d;
    }

    @Nullable
    /* renamed from: n */
    public final InterfaceC19987a m58372n() {
        return this.f50243i;
    }

    @Nullable
    /* renamed from: o */
    public final View m58371o() {
        return this.f50240f;
    }

    @NotNull
    /* renamed from: p */
    public final View m58370p() {
        return this.f50242h;
    }

    @Nullable
    /* renamed from: q */
    public final View m58369q() {
        return this.f50236b;
    }

    @NotNull
    /* renamed from: t */
    public final JSONObject m58366t() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        JSONObject jSONObject = new JSONObject();
        boolean z6 = true;
        if (this.f50236b != null) {
            z = true;
        } else {
            z = false;
        }
        JSONObject put = jSONObject.put("title", z);
        if (this.f50237c != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        JSONObject put2 = put.put(C21114v8.C21122h.f54027F0, z2);
        if (this.f50239e != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        JSONObject put3 = put2.put("body", z3);
        if (this.f50241g != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        JSONObject put4 = put3.put("cta", z4);
        if (this.f50240f != null) {
            z5 = true;
        } else {
            z5 = false;
        }
        JSONObject put5 = put4.put("media", z5);
        if (this.f50238d == null) {
            z6 = false;
        }
        JSONObject put6 = put5.put("icon", z6);
        Intrinsics.checkNotNullExpressionValue(put6, "JSONObject()\n        .pu…\"icon\", iconView != null)");
        return put6;
    }

    @NotNull
    public String toString() {
        return "ISNNativeAdViewHolder(containerView=" + this.f50235a + ", titleView=" + this.f50236b + ", advertiserView=" + this.f50237c + ", iconView=" + this.f50238d + ", bodyView=" + this.f50239e + ", mediaView=" + this.f50240f + ", ctaView=" + this.f50241g + ", privacyIconView=" + this.f50242h + ')';
    }

    public /* synthetic */ C19986gg(C19707cg c19707cg, View view, View view2, View view3, View view4, View view5, View view6, View view7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c19707cg, (i & 2) != 0 ? null : view, (i & 4) != 0 ? null : view2, (i & 8) != 0 ? null : view3, (i & 16) != 0 ? null : view4, (i & 32) != 0 ? null : view5, (i & 64) != 0 ? null : view6, view7);
    }

    @NotNull
    /* renamed from: a */
    public final C19986gg m58396a(@NotNull C19707cg containerView, @Nullable View view, @Nullable View view2, @Nullable View view3, @Nullable View view4, @Nullable View view5, @Nullable View view6, @NotNull View privacyIconView) {
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(privacyIconView, "privacyIconView");
        return new C19986gg(containerView, view, view2, view3, view4, view5, view6, privacyIconView);
    }

    @Nullable
    /* renamed from: b */
    public final View m58391b() {
        return this.f50236b;
    }

    /* renamed from: c */
    public final void m58387c(@Nullable View view) {
        this.f50241g = view;
    }

    /* renamed from: d */
    public final void m58385d(@Nullable View view) {
        this.f50238d = view;
    }

    /* renamed from: e */
    public final void m58383e(@Nullable View view) {
        this.f50240f = view;
    }

    /* renamed from: f */
    public final void m58381f(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<set-?>");
        this.f50242h = view;
    }

    /* renamed from: g */
    public final void m58379g(@Nullable View view) {
        this.f50236b = view;
    }

    /* renamed from: b */
    public final void m58390b(@Nullable View view) {
        this.f50239e = view;
    }

    /* renamed from: a */
    public final void m58398a(@Nullable View view) {
        this.f50237c = view;
    }

    /* renamed from: a */
    public final void m58397a(@NotNull C19707cg c19707cg) {
        Intrinsics.checkNotNullParameter(c19707cg, "<set-?>");
        this.f50235a = c19707cg;
    }

    /* renamed from: a */
    public final void m58395a(@Nullable InterfaceC19987a interfaceC19987a) {
        this.f50243i = interfaceC19987a;
    }

    /* renamed from: a */
    private static final void m58394a(C19986gg c19986gg, View view, final EnumC19988b enumC19988b) {
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.ironsource.ew
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C19986gg.m58389b(C19986gg.this, enumC19988b, view2);
                }
            });
        }
    }

    /* renamed from: a */
    public static final void m58392a(C19986gg this$0, EnumC19988b viewName, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(viewName, "$viewName");
        InterfaceC19987a interfaceC19987a = this$0.f50243i;
        if (interfaceC19987a != null) {
            interfaceC19987a.mo58364a(viewName);
        }
    }
}
