package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import com.yandex.mobile.ads.impl.k62;
import com.yandex.mobile.ads.impl.qa1;
import com.yandex.mobile.ads.impl.sa2;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.MapsJVM;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.C38513v;
import p804nd.NoWhenBranchMatchedException;

/* loaded from: classes8.dex */
public final class ph2 implements sa2 {
    @NotNull

    /* renamed from: a */
    private final Context f83969a;
    @NotNull

    /* renamed from: b */
    private final j72 f83970b;
    @Nullable

    /* renamed from: c */
    private final x72 f83971c;
    @NotNull

    /* renamed from: d */
    private final List<j52> f83972d;
    @NotNull

    /* renamed from: e */
    private final qa2 f83973e;
    @NotNull

    /* renamed from: f */
    private final ab1 f83974f;
    @NotNull

    /* renamed from: g */
    private final jl1 f83975g;
    @Nullable

    /* renamed from: h */
    private AbstractC31183q8 f83976h;
    @Nullable

    /* renamed from: i */
    private dt0 f83977i;
    @Nullable

    /* renamed from: j */
    private C30531i3 f83978j;

    /* renamed from: k */
    private boolean f83979k;

    public ph2(@NotNull Context context, @NotNull j72 videoAdPosition, @Nullable x72 x72Var, @NotNull List<j52> verifications, @NotNull qa2 eventsTracker, @NotNull ab1 omSdkVastPropertiesCreator, @NotNull jl1 reporter) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoAdPosition, "videoAdPosition");
        Intrinsics.checkNotNullParameter(verifications, "verifications");
        Intrinsics.checkNotNullParameter(eventsTracker, "eventsTracker");
        Intrinsics.checkNotNullParameter(omSdkVastPropertiesCreator, "omSdkVastPropertiesCreator");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        this.f83969a = context;
        this.f83970b = videoAdPosition;
        this.f83971c = x72Var;
        this.f83972d = verifications;
        this.f83973e = eventsTracker;
        this.f83974f = omSdkVastPropertiesCreator;
        this.f83975g = reporter;
    }

    @Override // com.yandex.mobile.ads.impl.sa2
    /* renamed from: a */
    public final void mo29047a() {
    }

    @Override // com.yandex.mobile.ads.impl.sa2
    /* renamed from: b */
    public final void mo29040b() {
        dt0 dt0Var = this.f83977i;
        if (dt0Var != null) {
            try {
                if (!this.f83979k) {
                    dt0Var.m34856d();
                }
            } catch (Exception e) {
                um0.m28726c(new Object[0]);
                this.f83975g.reportError("Failed to execute safely", e);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.sa2
    /* renamed from: c */
    public final void mo29039c() {
        dt0 dt0Var = this.f83977i;
        if (dt0Var != null) {
            try {
                if (!this.f83979k) {
                    dt0Var.m34852h();
                }
            } catch (Exception e) {
                um0.m28726c(new Object[0]);
                this.f83975g.reportError("Failed to execute safely", e);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.sa2
    /* renamed from: d */
    public final void mo29038d() {
        dt0 dt0Var = this.f83977i;
        if (dt0Var != null) {
            try {
                if (!this.f83979k) {
                    dt0Var.m34853g();
                }
            } catch (Exception e) {
                um0.m28726c(new Object[0]);
                this.f83975g.reportError("Failed to execute safely", e);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.sa2
    /* renamed from: e */
    public final void mo29037e() {
        dt0 dt0Var = this.f83977i;
        if (dt0Var != null) {
            try {
                if (!this.f83979k) {
                    dt0Var.m34851i();
                }
            } catch (Exception e) {
                um0.m28726c(new Object[0]);
                this.f83975g.reportError("Failed to execute safely", e);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.sa2
    /* renamed from: f */
    public final void mo29036f() {
        dt0 dt0Var = this.f83977i;
        if (dt0Var != null) {
            try {
                if (!this.f83979k) {
                    dt0Var.m34857c();
                }
            } catch (Exception e) {
                um0.m28726c(new Object[0]);
                this.f83975g.reportError("Failed to execute safely", e);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.sa2
    /* renamed from: j */
    public final void mo29032j() {
        dt0 dt0Var = this.f83977i;
        if (dt0Var != null) {
            try {
                if (!this.f83979k) {
                    dt0Var.m34858b();
                }
            } catch (Exception e) {
                um0.m28726c(new Object[0]);
                this.f83975g.reportError("Failed to execute safely", e);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.sa2
    /* renamed from: k */
    public final void mo29031k() {
        AbstractC31183q8 abstractC31183q8 = this.f83976h;
        if (abstractC31183q8 != null) {
            try {
                if (!this.f83979k) {
                    abstractC31183q8.mo27493a();
                    this.f83976h = null;
                    this.f83977i = null;
                    this.f83978j = null;
                    this.f83979k = true;
                }
            } catch (Exception e) {
                um0.m28726c(new Object[0]);
                this.f83975g.reportError("Failed to execute safely", e);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.sa2
    /* renamed from: m */
    public final void mo29029m() {
        dt0 dt0Var = this.f83977i;
        if (dt0Var != null) {
            try {
                if (!this.f83979k) {
                    dt0Var.m34862a();
                }
            } catch (Exception e) {
                um0.m28726c(new Object[0]);
                this.f83975g.reportError("Failed to execute safely", e);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.sa2
    /* renamed from: n */
    public final void mo29028n() {
        C30531i3 c30531i3 = this.f83978j;
        if (c30531i3 != null) {
            try {
                if (!this.f83979k) {
                    c30531i3.m33378a();
                }
            } catch (Exception e) {
                um0.m28726c(new Object[0]);
                this.f83975g.reportError("Failed to execute safely", e);
            }
        }
    }

    /* renamed from: a */
    public static final void m30656a(ph2 ph2Var, k52 k52Var) {
        Map<String, String> m17291g;
        ph2Var.getClass();
        m17291g = MapsJVM.m17291g(C38513v.m14532a("[REASON]", String.valueOf(k52Var.m32673a().m32671a())));
        ph2Var.f83973e.m30428a(k52Var.m32672b(), "verificationNotExecuted", m17291g);
    }

    @Override // com.yandex.mobile.ads.impl.sa2
    /* renamed from: a */
    public final void mo29044a(@NotNull View view, @NotNull List<k62> friendlyOverlays) {
        fa0 fa0Var;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(friendlyOverlays, "friendlyOverlays");
        mo29031k();
        this.f83979k = false;
        Unit unit = Unit.f99208a;
        try {
            Context context = this.f83969a;
            oh2 oh2Var = new oh2(this);
            pa1 pa1Var = new pa1(context, oh2Var);
            int i = qa1.f84275e;
            xa1 m26973a = new ya1(context, oh2Var, pa1Var, qa1.C31186a.m30430a(), new za1()).m26973a(this.f83972d);
            if (m26973a != null) {
                AbstractC31183q8 m27599b = m26973a.m27599b();
                m27599b.mo27492a(view);
                this.f83976h = m27599b;
                this.f83977i = m26973a.m27598c();
                this.f83978j = m26973a.m27600a();
            }
        } catch (Exception e) {
            um0.m28726c(new Object[0]);
            this.f83975g.reportError("Failed to execute safely", e);
        }
        AbstractC31183q8 abstractC31183q8 = this.f83976h;
        if (abstractC31183q8 != null) {
            for (k62 k62Var : friendlyOverlays) {
                View m32664c = k62Var.m32664c();
                if (m32664c != null) {
                    Unit unit2 = Unit.f99208a;
                    try {
                        k62.EnumC30704a purpose = k62Var.m32665b();
                        Intrinsics.checkNotNullParameter(purpose, "purpose");
                        int ordinal = purpose.ordinal();
                        if (ordinal == 0) {
                            fa0Var = fa0.f79025b;
                        } else if (ordinal == 1) {
                            fa0Var = fa0.f79026c;
                        } else if (ordinal == 2) {
                            fa0Var = fa0.f79027d;
                        } else if (ordinal != 3) {
                            throw new NoWhenBranchMatchedException();
                            break;
                        } else {
                            fa0Var = fa0.f79028e;
                        }
                        abstractC31183q8.mo27491a(m32664c, fa0Var, k62Var.m32666a());
                    } catch (Exception e2) {
                        um0.m28726c(new Object[0]);
                        this.f83975g.reportError("Failed to execute safely", e2);
                    }
                }
            }
        }
        AbstractC31183q8 abstractC31183q82 = this.f83976h;
        if (abstractC31183q82 != null) {
            try {
                if (!this.f83979k) {
                    abstractC31183q82.mo27489b();
                }
            } catch (Exception e3) {
                um0.m28726c(new Object[0]);
                this.f83975g.reportError("Failed to execute safely", e3);
            }
        }
        C30531i3 c30531i3 = this.f83978j;
        if (c30531i3 != null) {
            try {
                if (this.f83979k) {
                    return;
                }
                ab1 ab1Var = this.f83974f;
                x72 x72Var = this.f83971c;
                j72 j72Var = this.f83970b;
                ab1Var.getClass();
                c30531i3.m33377a(ab1.m35930a(x72Var, j72Var));
            } catch (Exception e4) {
                um0.m28726c(new Object[0]);
                this.f83975g.reportError("Failed to execute safely", e4);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.sa2
    /* renamed from: g */
    public final void mo29035g() {
    }

    @Override // com.yandex.mobile.ads.impl.sa2
    /* renamed from: h */
    public final void mo29034h() {
    }

    @Override // com.yandex.mobile.ads.impl.sa2
    /* renamed from: i */
    public final void mo29033i() {
    }

    @Override // com.yandex.mobile.ads.impl.sa2
    /* renamed from: l */
    public final void mo29030l() {
    }

    @Override // com.yandex.mobile.ads.impl.sa2
    /* renamed from: a */
    public final void mo29041a(@NotNull String assetName) {
        Intrinsics.checkNotNullParameter(assetName, "assetName");
        mo29029m();
    }

    @Override // com.yandex.mobile.ads.impl.sa2
    /* renamed from: a */
    public final void mo29043a(@NotNull g72 error) {
        Intrinsics.checkNotNullParameter(error, "error");
    }

    @Override // com.yandex.mobile.ads.impl.sa2
    /* renamed from: a */
    public final void mo29042a(@NotNull sa2.EnumC31344a quartile) {
        Intrinsics.checkNotNullParameter(quartile, "quartile");
        dt0 dt0Var = this.f83977i;
        if (dt0Var != null) {
            try {
                if (!this.f83979k) {
                    int ordinal = quartile.ordinal();
                    if (ordinal == 0) {
                        dt0Var.m34855e();
                    } else if (ordinal == 1) {
                        dt0Var.m34854f();
                    } else if (ordinal == 2) {
                        dt0Var.m34850j();
                    }
                }
            } catch (Exception e) {
                um0.m28726c(new Object[0]);
                this.f83975g.reportError("Failed to execute safely", e);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.sa2
    /* renamed from: a */
    public final void mo29045a(float f, long j) {
        dt0 dt0Var = this.f83977i;
        if (dt0Var != null) {
            try {
                if (this.f83979k) {
                    return;
                }
                dt0Var.m34860a(((float) j) / ((float) 1000), f);
            } catch (Exception e) {
                um0.m28726c(new Object[0]);
                this.f83975g.reportError("Failed to execute safely", e);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.sa2
    /* renamed from: a */
    public final void mo29046a(float f) {
        dt0 dt0Var = this.f83977i;
        if (dt0Var != null) {
            try {
                if (this.f83979k) {
                    return;
                }
                dt0Var.m34861a(f);
            } catch (Exception e) {
                um0.m28726c(new Object[0]);
                this.f83975g.reportError("Failed to execute safely", e);
            }
        }
    }
}
