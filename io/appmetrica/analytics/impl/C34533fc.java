package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* renamed from: io.appmetrica.analytics.impl.fc */
/* loaded from: classes9.dex */
public final class C34533fc extends C34580h5 implements InterfaceC34013Ka, InterfaceC33989Ja {

    /* renamed from: A */
    public final C34632j3 f94368A;

    /* renamed from: x */
    public final C33846Df f94369x;

    /* renamed from: y */
    public final C33946Hf f94370y;

    /* renamed from: z */
    public final C33887F6 f94371z;

    public C34533fc(@NonNull Context context, @NonNull C34650jl c34650jl, @NonNull C34391a5 c34391a5, @NonNull C33835D4 c33835d4, @NonNull C33846Df c33846Df, @NonNull C33887F6 c33887f6, @NonNull AbstractC34526f5 abstractC34526f5) {
        this(context, c34391a5, c34650jl, c33835d4, new C34521f0(), new TimePassedChecker(), new C34560gc(context, c34391a5, c33835d4, abstractC34526f5, c34650jl, new C34398ac(c33887f6), C34693la.m21444h().m21431u().m20770d(), PackageManagerUtils.getAppVersionCodeInt(context), C34693la.m21444h().m21431u(), C34693la.m21444h().m21443i()), c33846Df, c33887f6);
    }

    @Override // io.appmetrica.analytics.impl.C34580h5
    /* renamed from: C */
    public final void mo21635C() {
        this.f94369x.m22708a(this.f94370y);
    }

    /* renamed from: D */
    public final boolean m21715D() {
        boolean optBoolean;
        C34997wn c34997wn = this.f94514v;
        synchronized (c34997wn) {
            optBoolean = c34997wn.f95576a.m20761a().optBoolean("referrer_handled", false);
        }
        return optBoolean;
    }

    @Override // io.appmetrica.analytics.impl.C34580h5, io.appmetrica.analytics.impl.InterfaceC34085Na, io.appmetrica.analytics.impl.InterfaceC33816Ca
    /* renamed from: a */
    public final synchronized void mo21634a(@NonNull C33835D4 c33835d4) {
        super.mo21634a(c33835d4);
        this.f94371z.m22664a(c33835d4.f92697i);
    }

    @Override // io.appmetrica.analytics.impl.C34580h5, io.appmetrica.analytics.impl.InterfaceC33816Ca
    @NonNull
    /* renamed from: c */
    public final CounterConfigurationReporterType mo21483c() {
        return CounterConfigurationReporterType.MAIN;
    }

    @Override // io.appmetrica.analytics.impl.C34580h5, io.appmetrica.analytics.impl.InterfaceC34085Na, io.appmetrica.analytics.impl.InterfaceC34262Uk
    /* renamed from: a */
    public final void mo21631a(@NonNull C34650jl c34650jl) {
        synchronized (this) {
            this.f94504l.m20886a(c34650jl);
            this.f94509q.m21161b();
        }
        this.f94368A.mo20741a(c34650jl);
    }

    public C34533fc(Context context, C34391a5 c34391a5, C34650jl c34650jl, C33835D4 c33835d4, C34521f0 c34521f0, TimePassedChecker timePassedChecker, C34560gc c34560gc, C33846Df c33846Df, C33887F6 c33887f6) {
        super(context, c34391a5, c34521f0, timePassedChecker, c34560gc);
        this.f94369x = c33846Df;
        C34298W8 m21621j = m21621j();
        m21621j.m22135a(EnumC34324Xa.EVENT_TYPE_REGULAR, new C34377Zf(m21621j.m22134b()));
        this.f94370y = c34560gc.m21656b(this);
        this.f94371z = c33887f6;
        C34632j3 m21657a = c34560gc.m21657a(this);
        this.f94368A = m21657a;
        m21657a.m21528a(c34650jl, c33835d4.f92701m);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC33989Ja
    /* renamed from: a */
    public final void mo21714a() {
        C34997wn c34997wn = this.f94514v;
        synchronized (c34997wn) {
            C35023xn c35023xn = c34997wn.f95576a;
            c35023xn.m20759a(c35023xn.m20761a().put("referrer_handled", true));
        }
    }
}
