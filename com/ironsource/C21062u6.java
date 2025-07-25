package com.ironsource;

import com.ironsource.C19950g2;
import com.ironsource.C21062u6;
import com.ironsource.lifecycle.C20271b;
import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p804nd.InterfaceC38501j;
import p804nd.LazyJVM;

@Metadata
/* renamed from: com.ironsource.u6 */
/* loaded from: classes6.dex */
public final class C21062u6 {
    @NotNull

    /* renamed from: a */
    private final C19950g2 f53760a;
    @NotNull

    /* renamed from: b */
    private final C19612b2 f53761b;
    @NotNull

    /* renamed from: c */
    private final InterfaceC21254y5 f53762c;
    @NotNull

    /* renamed from: d */
    private final InterfaceC38501j f53763d;
    @NotNull

    /* renamed from: e */
    private final InterfaceC38501j f53764e;

    /* renamed from: f */
    private final boolean f53765f;

    /* renamed from: g */
    private final boolean f53766g;

    /* renamed from: h */
    private final boolean f53767h;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata
    /* renamed from: com.ironsource.u6$a */
    /* loaded from: classes6.dex */
    public static final class C21063a extends Lambda implements Functions<C20644pk> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C21063a() {
            super(0);
            C21062u6.this = r1;
        }

        @Override // kotlin.jvm.functions.Functions
        @NotNull
        /* renamed from: a */
        public final C20644pk invoke() {
            final C21062u6 c21062u6 = C21062u6.this;
            return new C20644pk(new Runnable() { // from class: com.ironsource.j00
                @Override // java.lang.Runnable
                public final void run() {
                    C21062u6.C21063a.m54681a(c21062u6);
                }
            }, C20271b.m57448d(), new C20547nt());
        }

        /* renamed from: a */
        public static final void m54681a(C21062u6 this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.f53762c.mo53874e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata
    /* renamed from: com.ironsource.u6$b */
    /* loaded from: classes6.dex */
    public static final class C21064b extends Lambda implements Functions<C20644pk> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C21064b() {
            super(0);
            C21062u6.this = r1;
        }

        @Override // kotlin.jvm.functions.Functions
        @NotNull
        /* renamed from: a */
        public final C20644pk invoke() {
            final C21062u6 c21062u6 = C21062u6.this;
            return new C20644pk(new Runnable() { // from class: com.ironsource.k00
                @Override // java.lang.Runnable
                public final void run() {
                    C21062u6.C21064b.m54678a(c21062u6);
                }
            }, C20271b.m57448d(), new C20547nt());
        }

        /* renamed from: a */
        public static final void m54678a(C21062u6 this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.f53762c.mo53873f();
        }
    }

    public C21062u6(@NotNull C19950g2 loadingData, @NotNull C19612b2 interactionData, @NotNull InterfaceC21254y5 mListener) {
        InterfaceC38501j m14554a;
        InterfaceC38501j m14554a2;
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(loadingData, "loadingData");
        Intrinsics.checkNotNullParameter(interactionData, "interactionData");
        Intrinsics.checkNotNullParameter(mListener, "mListener");
        this.f53760a = loadingData;
        this.f53761b = interactionData;
        this.f53762c = mListener;
        m14554a = LazyJVM.m14554a(new C21063a());
        this.f53763d = m14554a;
        m14554a2 = LazyJVM.m14554a(new C21064b());
        this.f53764e = m14554a2;
        if (loadingData.m58479b() > 0) {
            z = true;
        } else {
            z = false;
        }
        this.f53765f = z;
        if (interactionData.m59379b() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f53766g = z2;
        this.f53767h = loadingData.m58480a() == C19950g2.EnumC19951a.MANUAL_WITH_LOAD_ON_SHOW;
    }

    /* renamed from: c */
    private final C20644pk m54688c() {
        return (C20644pk) this.f53763d.getValue();
    }

    /* renamed from: d */
    private final C20644pk m54687d() {
        return (C20644pk) this.f53764e.getValue();
    }

    /* renamed from: f */
    private final void m54685f() {
        if (!this.f53767h) {
            return;
        }
        m54688c().m55786b();
    }

    /* renamed from: g */
    private final void m54684g() {
        if (!this.f53767h) {
            return;
        }
        m54687d().m55786b();
    }

    /* renamed from: b */
    public final void m54690b() {
        IronLog.INTERNAL.verbose();
        m54684g();
    }

    /* renamed from: e */
    public final void m54686e() {
        IronLog.INTERNAL.verbose();
        m54689b(this.f53761b.m59379b());
    }

    /* renamed from: h */
    public final void m54683h() {
        if (!this.f53765f) {
            IronLog.INTERNAL.verbose("banner reload interval is disabled");
            return;
        }
        IronLog.INTERNAL.verbose();
        m54692a(this.f53760a.m58479b());
    }

    /* renamed from: b */
    private final void m54689b(long j) {
        if (this.f53767h && this.f53766g) {
            m54687d().m55789a(j);
        }
    }

    /* renamed from: a */
    public final void m54693a() {
        IronLog.INTERNAL.verbose();
        m54685f();
    }

    /* renamed from: a */
    private final void m54692a(long j) {
        if (this.f53767h && this.f53765f) {
            m54688c().m55789a(j);
        }
    }
}
