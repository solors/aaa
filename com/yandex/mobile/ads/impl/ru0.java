package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.facebook.internal.NativeProtocol;
import com.monetization.ads.base.model.MediationNetwork;
import com.monetization.ads.mediation.base.C25606a;
import com.monetization.ads.mediation.base.MediatedAdapterInfo;
import com.yandex.mobile.ads.impl.fl1;
import java.util.List;
import java.util.Map;
import kotlin.collections.C37559r0;
import kotlin.collections.MapsJVM;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.C38513v;

/* loaded from: classes8.dex */
public final class ru0<T extends C25606a, L> {
    @NotNull

    /* renamed from: a */
    private final C30359g3 f84887a;
    @NotNull

    /* renamed from: b */
    private final C31952z4 f84888b;
    @NotNull

    /* renamed from: c */
    private final wu0<T, L> f84889c;
    @NotNull

    /* renamed from: d */
    private final fv0 f84890d;
    @NotNull

    /* renamed from: e */
    private final su0<T> f84891e;
    @NotNull

    /* renamed from: f */
    private final kc1 f84892f;
    @NotNull

    /* renamed from: g */
    private final cv0 f84893g;
    @Nullable

    /* renamed from: h */
    private qu0<T> f84894h;

    public /* synthetic */ ru0(C30359g3 c30359g3, C31952z4 c31952z4, wu0 wu0Var, fv0 fv0Var, su0 su0Var, kc1 kc1Var) {
        this(c30359g3, c31952z4, wu0Var, fv0Var, su0Var, kc1Var, new cv0());
    }

    @Nullable
    /* renamed from: a */
    public final qu0<T> m29949a() {
        return this.f84894h;
    }

    /* renamed from: b */
    public final void m29942b(@NotNull Context context) {
        Map<String, ? extends Object> m17291g;
        Intrinsics.checkNotNullParameter(context, "context");
        qu0<T> qu0Var = this.f84894h;
        if (qu0Var != null) {
            m17291g = MapsJVM.m17291g(C38513v.m14532a("status", "success"));
            this.f84890d.m34069f(context, qu0Var.m30215b(), m17291g, qu0Var.m30217a().getAdapterInfo().getNetworkName());
        }
    }

    /* renamed from: c */
    public final void m29938c(@NotNull Context context, @NotNull Map<String, ? extends Object> mediatedReportData) {
        Map<String, ? extends Object> m17285D;
        MediationNetwork m30215b;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mediatedReportData, "mediatedReportData");
        qu0<T> qu0Var = this.f84894h;
        List<String> m44557d = (qu0Var == null || (m30215b = qu0Var.m30215b()) == null) ? null : m30215b.m44557d();
        C30710k9 c30710k9 = new C30710k9(context, this.f84887a);
        if (m44557d != null) {
            for (String str : m44557d) {
                c30710k9.m32625a(str);
            }
        }
        m17285D = C37559r0.m17285D(mediatedReportData);
        m17285D.put("status", "success");
        qu0<T> qu0Var2 = this.f84894h;
        if (qu0Var2 != null) {
            T m30217a = qu0Var2.m30217a();
            this.f84893g.getClass();
            m17285D.putAll(cv0.m35148a(m30217a));
            this.f84890d.m34068g(context, qu0Var2.m30215b(), m17285D, qu0Var2.m30217a().getAdapterInfo().getNetworkName());
        }
    }

    /* renamed from: d */
    public final void m29937d(@NotNull Context context, @NotNull Map<String, ? extends Object> additionalReportData) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(additionalReportData, "additionalReportData");
        qu0<T> qu0Var = this.f84894h;
        if (qu0Var != null) {
            this.f84890d.m34070e(context, qu0Var.m30215b(), additionalReportData, qu0Var.m30217a().getAdapterInfo().getNetworkName());
        }
    }

    /* renamed from: e */
    public final void m29936e(@NotNull Context context, @NotNull Map<String, ? extends Object> additionalReportData) {
        MediationNetwork mediationNetwork;
        T m30217a;
        MediatedAdapterInfo adapterInfo;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(additionalReportData, "additionalReportData");
        qu0<T> qu0Var = this.f84894h;
        String str = null;
        if (qu0Var != null) {
            mediationNetwork = qu0Var.m30215b();
        } else {
            mediationNetwork = null;
        }
        if (mediationNetwork != null) {
            fv0 fv0Var = this.f84890d;
            qu0<T> qu0Var2 = this.f84894h;
            if (qu0Var2 != null && (m30217a = qu0Var2.m30217a()) != null && (adapterInfo = m30217a.getAdapterInfo()) != null) {
                str = adapterInfo.getNetworkName();
            }
            fv0Var.m34073b(context, mediationNetwork, additionalReportData, str);
        }
    }

    /* renamed from: a */
    public final void m29948a(@NotNull Context context) {
        Map m17291g;
        Map<String, ? extends Object> m17291g2;
        Intrinsics.checkNotNullParameter(context, "context");
        qu0<T> qu0Var = this.f84894h;
        if (qu0Var != null) {
            try {
                this.f84889c.mo27740a(qu0Var.m30217a());
            } catch (Throwable th) {
                MediationNetwork m30215b = qu0Var.m30215b();
                String networkName = qu0Var.m30217a().getAdapterInfo().getNetworkName();
                um0.m28726c(new Object[0]);
                m17291g = MapsJVM.m17291g(C38513v.m14532a("exception_in_adapter", th.toString()));
                m17291g2 = MapsJVM.m17291g(C38513v.m14532a("reason", m17291g));
                this.f84890d.m34076a(context, m30215b, m17291g2, networkName);
            }
        }
    }

    public ru0(@NotNull C30359g3 adConfiguration, @NotNull C31952z4 adLoadingPhasesManager, @NotNull wu0<T, L> mediatedAdLoader, @NotNull fv0 mediatedAdapterReporter, @NotNull su0<T> mediatedAdCreator, @NotNull kc1 passbackAdLoader, @NotNull cv0 mediatedAdapterInfoReportDataProvider) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(adLoadingPhasesManager, "adLoadingPhasesManager");
        Intrinsics.checkNotNullParameter(mediatedAdLoader, "mediatedAdLoader");
        Intrinsics.checkNotNullParameter(mediatedAdapterReporter, "mediatedAdapterReporter");
        Intrinsics.checkNotNullParameter(mediatedAdCreator, "mediatedAdCreator");
        Intrinsics.checkNotNullParameter(passbackAdLoader, "passbackAdLoader");
        Intrinsics.checkNotNullParameter(mediatedAdapterInfoReportDataProvider, "mediatedAdapterInfoReportDataProvider");
        this.f84887a = adConfiguration;
        this.f84888b = adLoadingPhasesManager;
        this.f84889c = mediatedAdLoader;
        this.f84890d = mediatedAdapterReporter;
        this.f84891e = mediatedAdCreator;
        this.f84892f = passbackAdLoader;
        this.f84893g = mediatedAdapterInfoReportDataProvider;
    }

    /* renamed from: b */
    public final void m29941b(@NotNull Context context, @NotNull C31082p3 adFetchRequestError, L l) {
        Map<String, ? extends Object> m17279o;
        MediationNetwork m30215b;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adFetchRequestError, "adFetchRequestError");
        qu0<T> qu0Var = this.f84894h;
        C30778la parametersProvider = new C30778la(fl1.EnumC30325c.f79165d, (qu0Var == null || (m30215b = qu0Var.m30215b()) == null) ? null : m30215b.m44556e());
        C31952z4 c31952z4 = this.f84888b;
        EnumC31868y4 adLoadingPhaseType = EnumC31868y4.f88025c;
        c31952z4.getClass();
        Intrinsics.checkNotNullParameter(adLoadingPhaseType, "adLoadingPhaseType");
        Intrinsics.checkNotNullParameter(parametersProvider, "parametersProvider");
        c31952z4.m26391a(adLoadingPhaseType, parametersProvider, null);
        m17279o = C37559r0.m17279o(C38513v.m14532a("status", "error"), C38513v.m14532a("error_code", Integer.valueOf(adFetchRequestError.m30850b())), C38513v.m14532a(NativeProtocol.BRIDGE_ARG_ERROR_DESCRIPTION, adFetchRequestError.m30849c()));
        qu0<T> qu0Var2 = this.f84894h;
        if (qu0Var2 != null) {
            T m30217a = qu0Var2.m30217a();
            this.f84893g.getClass();
            m17279o.putAll(cv0.m35148a(m30217a));
            this.f84890d.m34068g(context, qu0Var2.m30215b(), m17279o, qu0Var2.m30217a().getAdapterInfo().getNetworkName());
        }
        m29948a(context);
        m29945a(context, (Context) l);
    }

    /* renamed from: a */
    public final void m29945a(@NotNull Context context, L l) {
        Map m17291g;
        Map<String, ? extends Object> m17291g2;
        MediationNetwork m30215b;
        Intrinsics.checkNotNullParameter(context, "context");
        qu0<T> mo25981a = this.f84891e.mo25981a(context);
        this.f84894h = mo25981a;
        if (mo25981a != null) {
            this.f84887a.m33979a(mo25981a.m30215b());
            this.f84887a.m33965c(mo25981a.m30217a().getAdapterInfo().getNetworkName());
            C31952z4 c31952z4 = this.f84888b;
            EnumC31868y4 enumC31868y4 = EnumC31868y4.f88025c;
            C30030bj.m35463a(c31952z4, enumC31868y4, "adLoadingPhaseType", enumC31868y4, null);
            MediationNetwork m30215b2 = mo25981a.m30215b();
            String networkName = mo25981a.m30217a().getAdapterInfo().getNetworkName();
            this.f84890d.m34074b(context, m30215b2, networkName);
            try {
                this.f84889c.mo27741a(context, mo25981a.m30217a(), l, mo25981a.m30216a(context), mo25981a.m30214c());
                return;
            } catch (Throwable th) {
                um0.m28726c(new Object[0]);
                m17291g = MapsJVM.m17291g(C38513v.m14532a("exception_in_adapter", th.toString()));
                m17291g2 = MapsJVM.m17291g(C38513v.m14532a("reason", m17291g));
                this.f84890d.m34076a(context, m30215b2, m17291g2, networkName);
                qu0<T> qu0Var = this.f84894h;
                C30778la parametersProvider = new C30778la(fl1.EnumC30325c.f79165d, (qu0Var == null || (m30215b = qu0Var.m30215b()) == null) ? null : m30215b.m44556e());
                C31952z4 c31952z42 = this.f84888b;
                EnumC31868y4 adLoadingPhaseType = EnumC31868y4.f88025c;
                c31952z42.getClass();
                Intrinsics.checkNotNullParameter(adLoadingPhaseType, "adLoadingPhaseType");
                Intrinsics.checkNotNullParameter(parametersProvider, "parametersProvider");
                c31952z42.m26391a(adLoadingPhaseType, parametersProvider, null);
                m29945a(context, (Context) l);
                return;
            }
        }
        this.f84892f.m32594a();
    }

    /* renamed from: c */
    public final void m29939c(@NotNull Context context) {
        T m30217a;
        MediatedAdapterInfo adapterInfo;
        Intrinsics.checkNotNullParameter(context, "context");
        qu0<T> qu0Var = this.f84894h;
        String str = null;
        MediationNetwork m30215b = qu0Var != null ? qu0Var.m30215b() : null;
        if (m30215b != null) {
            fv0 fv0Var = this.f84890d;
            qu0<T> qu0Var2 = this.f84894h;
            if (qu0Var2 != null && (m30217a = qu0Var2.m30217a()) != null && (adapterInfo = m30217a.getAdapterInfo()) != null) {
                str = adapterInfo.getNetworkName();
            }
            fv0Var.m34077a(context, m30215b, str);
        }
    }

    /* renamed from: b */
    public final void m29940b(@NotNull Context context, @NotNull Map<String, ? extends Object> additionalReportData) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(additionalReportData, "additionalReportData");
        qu0<T> qu0Var = this.f84894h;
        if (qu0Var != null) {
            MediationNetwork m30215b = qu0Var.m30215b();
            String networkName = qu0Var.m30217a().getAdapterInfo().getNetworkName();
            List<String> m44553h = m30215b.m44553h();
            if (m44553h != null) {
                for (String str : m44553h) {
                    new C30710k9(context, this.f84887a).m32625a(str);
                }
            }
            this.f84890d.m34071d(context, m30215b, additionalReportData, networkName);
        }
    }

    /* renamed from: b */
    public final boolean m29943b() {
        T m30217a;
        qu0<T> qu0Var = this.f84894h;
        if (qu0Var == null || (m30217a = qu0Var.m30217a()) == null) {
            return true;
        }
        return m30217a.getShouldTrackImpressionAutomatically();
    }

    /* renamed from: a */
    public final void m29944a(@NotNull Context context, @NotNull Map<String, ? extends Object> additionalReportData) {
        Map<String, ? extends Object> m17285D;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(additionalReportData, "additionalReportData");
        qu0<T> qu0Var = this.f84894h;
        if (qu0Var != null) {
            MediationNetwork m30215b = qu0Var.m30215b();
            String networkName = qu0Var.m30217a().getAdapterInfo().getNetworkName();
            List<String> m44554g = m30215b.m44554g();
            if (m44554g != null) {
                for (String str : m44554g) {
                    new C30710k9(context, this.f84887a).m32625a(str);
                }
            }
            m17285D = C37559r0.m17285D(additionalReportData);
            m17285D.put("click_type", "default");
            this.f84890d.m34072c(context, m30215b, m17285D, networkName);
        }
    }

    /* renamed from: a */
    public final void m29946a(@NotNull Context context, @NotNull C31082p3 adFetchRequestError, L l) {
        Map<String, ? extends Object> m17281m;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adFetchRequestError, "adFetchRequestError");
        qu0<T> qu0Var = this.f84894h;
        if (qu0Var != null) {
            m17281m = C37559r0.m17281m(C38513v.m14532a("status", "error"), C38513v.m14532a("error_code", Integer.valueOf(adFetchRequestError.m30850b())));
            this.f84890d.m34069f(context, qu0Var.m30215b(), m17281m, qu0Var.m30217a().getAdapterInfo().getNetworkName());
        }
        m29948a(context);
        m29945a(context, (Context) l);
    }

    /* renamed from: a */
    public final void m29947a(@NotNull Context context, @Nullable C30149d8<String> c30149d8) {
        T m30217a;
        MediatedAdapterInfo adapterInfo;
        Intrinsics.checkNotNullParameter(context, "context");
        qu0<T> qu0Var = this.f84894h;
        String str = null;
        MediationNetwork m30215b = qu0Var != null ? qu0Var.m30215b() : null;
        if (m30215b != null) {
            fv0 fv0Var = this.f84890d;
            qu0<T> qu0Var2 = this.f84894h;
            if (qu0Var2 != null && (m30217a = qu0Var2.m30217a()) != null && (adapterInfo = m30217a.getAdapterInfo()) != null) {
                str = adapterInfo.getNetworkName();
            }
            fv0Var.m34078a(context, m30215b, c30149d8, str);
        }
    }
}
