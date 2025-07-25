package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.kb0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public abstract class ua0<T extends kb0<T>> extends xd0 {
    @NotNull

    /* renamed from: A */
    private final pa0 f86171A;
    @Nullable

    /* renamed from: B */
    private na0<T> f86172B;
    @Nullable

    /* renamed from: C */
    private na0<T> f86173C;
    @Nullable

    /* renamed from: D */
    private T f86174D;
    @NotNull

    /* renamed from: x */
    private final va0<T> f86175x;
    @NotNull

    /* renamed from: y */
    private final eb0<T> f86176y;
    @NotNull

    /* renamed from: z */
    private final ae0 f86177z;

    public /* synthetic */ ua0(Context context, C30359g3 c30359g3, pq1 pq1Var, va0 va0Var, C31952z4 c31952z4, eb0 eb0Var, ae0 ae0Var) {
        this(context, c30359g3, pq1Var, va0Var, c31952z4, eb0Var, ae0Var, new pa0(pq1Var));
    }

    @NotNull
    /* renamed from: a */
    protected abstract na0<T> mo26835a(@NotNull oa0 oa0Var);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.yandex.mobile.ads.impl.AbstractC30251ej
    /* renamed from: a */
    public final void mo28558a(@NotNull C31082p3 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f86175x.mo28381a(error);
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC30251ej
    /* renamed from: e */
    public final void mo28844e() {
        if (!C30079ca.m35331a((InterfaceC30957nn) this)) {
            Context m34526l = m34526l();
            na0[] na0VarArr = {this.f86173C, this.f86172B};
            for (int i = 0; i < 2; i++) {
                na0 na0Var = na0VarArr[i];
                if (na0Var != null) {
                    na0Var.mo26564a(m34526l);
                }
            }
            super.mo28844e();
        }
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC30251ej
    /* renamed from: r */
    protected final void mo28843r() {
        C31082p3 error = C30774l7.m32321p();
        Intrinsics.checkNotNullParameter(error, "error");
        this.f86175x.mo28381a(error);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.yandex.mobile.ads.impl.AbstractC30251ej
    /* renamed from: s */
    public final void mo28842s() {
        T t = this.f86174D;
        if (t != null) {
            this.f86175x.mo28382a(t);
        } else {
            this.f86175x.mo28381a(C30774l7.m32325l());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ua0(@NotNull Context context, @NotNull C30359g3 adConfiguration, @NotNull pq1 sdkEnvironmentModule, @NotNull va0<T> fullScreenLoadEventListener, @NotNull C31952z4 adLoadingPhasesManager, @NotNull eb0<T> fullscreenAdContentFactory, @NotNull ae0 htmlAdResponseReportManager, @NotNull pa0 adResponseControllerFactoryCreator) {
        super(context, adConfiguration, adLoadingPhasesManager);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(fullScreenLoadEventListener, "fullScreenLoadEventListener");
        Intrinsics.checkNotNullParameter(adLoadingPhasesManager, "adLoadingPhasesManager");
        Intrinsics.checkNotNullParameter(fullscreenAdContentFactory, "fullscreenAdContentFactory");
        Intrinsics.checkNotNullParameter(htmlAdResponseReportManager, "htmlAdResponseReportManager");
        Intrinsics.checkNotNullParameter(adResponseControllerFactoryCreator, "adResponseControllerFactoryCreator");
        this.f86175x = fullScreenLoadEventListener;
        this.f86176y = fullscreenAdContentFactory;
        this.f86177z = htmlAdResponseReportManager;
        this.f86171A = adResponseControllerFactoryCreator;
        m34545a(C31803x8.f87592a.m33827a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.mobile.ads.impl.AbstractC30251ej, com.yandex.mobile.ads.impl.om1.InterfaceC31054b
    /* renamed from: a */
    public void mo28555a(@NotNull C30149d8<String> adResponse) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        super.mo28562a((C30149d8) adResponse);
        this.f86177z.m35913a(adResponse);
        this.f86177z.m35912a(m34533f());
        na0<T> mo26835a = mo26835a(this.f86171A.m30795a(adResponse));
        this.f86173C = this.f86172B;
        this.f86172B = mo26835a;
        this.f86174D = this.f86176y.mo27456a(adResponse, m34533f(), mo26835a);
        Context m30861a = C31079p0.m30861a();
        if (m30861a != null) {
            um0.m28728a(new Object[0]);
        }
        if (m30861a == null) {
            m30861a = m34526l();
        }
        mo26835a.mo26563a(m30861a, adResponse);
    }
}
