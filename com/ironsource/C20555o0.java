package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.o0 */
/* loaded from: classes6.dex */
public final class C20555o0 implements InterfaceC19602au {
    @NotNull

    /* renamed from: a */
    private final String f52266a;
    @Nullable

    /* renamed from: b */
    private final InterfaceC19817eh f52267b;

    /* renamed from: c */
    private final boolean f52268c;

    @Metadata
    /* renamed from: com.ironsource.o0$a */
    /* loaded from: classes6.dex */
    static final class C20556a extends Lambda implements Functions<IronSourceError> {

        /* renamed from: a */
        public static final C20556a f52269a = new C20556a();

        C20556a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Functions
        @NotNull
        /* renamed from: a */
        public final IronSourceError invoke() {
            return C20040hb.f50441a.m58172r();
        }
    }

    @Metadata
    /* renamed from: com.ironsource.o0$b */
    /* loaded from: classes6.dex */
    static final class C20557b extends Lambda implements Functions<IronSourceError> {

        /* renamed from: a */
        public static final C20557b f52270a = new C20557b();

        C20557b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Functions
        @NotNull
        /* renamed from: a */
        public final IronSourceError invoke() {
            return C20040hb.f50441a.m58175o();
        }
    }

    @Metadata
    /* renamed from: com.ironsource.o0$c */
    /* loaded from: classes6.dex */
    static final class C20558c extends Lambda implements Functions<IronSourceError> {

        /* renamed from: a */
        public static final C20558c f52271a = new C20558c();

        C20558c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Functions
        @NotNull
        /* renamed from: a */
        public final IronSourceError invoke() {
            return C20040hb.f50441a.m58176n();
        }
    }

    @Metadata
    /* renamed from: com.ironsource.o0$d */
    /* loaded from: classes6.dex */
    static final class C20559d extends Lambda implements Functions<IronSourceError> {

        /* renamed from: a */
        public static final C20559d f52272a = new C20559d();

        C20559d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Functions
        @NotNull
        /* renamed from: a */
        public final IronSourceError invoke() {
            return C20040hb.f50441a.m58173q();
        }
    }

    @Metadata
    /* renamed from: com.ironsource.o0$e */
    /* loaded from: classes6.dex */
    static final class C20560e extends Lambda implements Functions<IronSourceError> {

        /* renamed from: a */
        public static final C20560e f52273a = new C20560e();

        C20560e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Functions
        @NotNull
        /* renamed from: a */
        public final IronSourceError invoke() {
            return C20040hb.f50441a.m58175o();
        }
    }

    @Metadata
    /* renamed from: com.ironsource.o0$f */
    /* loaded from: classes6.dex */
    static final class C20561f extends Lambda implements Functions<IronSourceError> {

        /* renamed from: a */
        public static final C20561f f52274a = new C20561f();

        C20561f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Functions
        @NotNull
        /* renamed from: a */
        public final IronSourceError invoke() {
            return C20040hb.f50441a.m58183g();
        }
    }

    public C20555o0(@NotNull String adm, @Nullable InterfaceC19817eh interfaceC19817eh, boolean z) {
        Intrinsics.checkNotNullParameter(adm, "adm");
        this.f52266a = adm;
        this.f52267b = interfaceC19817eh;
        this.f52268c = z;
    }

    @Override // com.ironsource.InterfaceC19602au
    /* renamed from: a */
    public void mo54173a() throws C19934fq {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        m59390a(this.f52268c, C20556a.f52269a);
        boolean z5 = true;
        if (this.f52267b != null) {
            z = true;
        } else {
            z = false;
        }
        m59390a(z, C20557b.f52270a);
        InterfaceC19817eh interfaceC19817eh = this.f52267b;
        if (interfaceC19817eh != null) {
            if (interfaceC19817eh.mo53945c() == EnumC19990gh.NonBidder) {
                if (this.f52266a.length() == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                m59390a(z4, C20558c.f52271a);
            }
            if (interfaceC19817eh.mo53945c() == EnumC19990gh.Bidder) {
                if (this.f52266a.length() > 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                m59390a(z3, C20559d.f52272a);
            }
            if (interfaceC19817eh.mo53945c() != EnumC19990gh.NotSupported) {
                z2 = true;
            } else {
                z2 = false;
            }
            m59390a(z2, C20560e.f52273a);
            if (interfaceC19817eh.mo53946b().length() <= 0) {
                z5 = false;
            }
            m59390a(z5, C20561f.f52274a);
        }
    }
}
