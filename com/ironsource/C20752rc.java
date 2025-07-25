package com.ironsource;

import android.app.Activity;
import com.ironsource.AbstractC20235l1;
import com.ironsource.C21205x1;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C37559r0;
import kotlin.collections.MapsJVM;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p804nd.C38513v;

@Metadata
/* renamed from: com.ironsource.rc */
/* loaded from: classes6.dex */
public final class C20752rc extends AbstractC20235l1 {
    @NotNull

    /* renamed from: h */
    private final WeakReference<InterfaceC21010tc> f52751h;
    @NotNull

    /* renamed from: i */
    private final C20754b f52752i;

    /* renamed from: j */
    private WeakReference<InterfaceC20563o2> f52753j;

    @Metadata
    /* renamed from: com.ironsource.rc$a */
    /* loaded from: classes6.dex */
    public static final class C20753a {
        @NotNull
        /* renamed from: a */
        public final C20752rc m55501a(@NotNull C20179k1 tools, @NotNull C19610b1 adProperties, boolean z, @NotNull InterfaceC21010tc listener, @Nullable C19588ak c19588ak) {
            Intrinsics.checkNotNullParameter(tools, "tools");
            Intrinsics.checkNotNullParameter(adProperties, "adProperties");
            Intrinsics.checkNotNullParameter(listener, "listener");
            IronLog.INTERNAL.verbose();
            return new C20752rc(tools, C19774di.f49793A.m58889a(adProperties, c19588ak, z), listener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata
    /* renamed from: com.ironsource.rc$b */
    /* loaded from: classes6.dex */
    public final class C20754b extends AbstractC20235l1.C20236a implements InterfaceC20632pc {
        public C20754b() {
            super();
        }

        @Override // com.ironsource.InterfaceC20632pc
        /* renamed from: a */
        public void mo55500a(@NotNull IronSourceError error, @NotNull C20579oc fullscreenInstance) {
            Intrinsics.checkNotNullParameter(error, "error");
            Intrinsics.checkNotNullParameter(fullscreenInstance, "fullscreenInstance");
            IronLog ironLog = IronLog.INTERNAL;
            C20752rc c20752rc = C20752rc.this;
            ironLog.verbose(c20752rc.m57568a(fullscreenInstance.m54226o() + " - error = " + error));
            C20752rc.this.m55516a(error, fullscreenInstance);
        }

        @Override // com.ironsource.InterfaceC20632pc
        /* renamed from: b */
        public void mo55498b(@NotNull C20579oc fullscreenInstance) {
            Intrinsics.checkNotNullParameter(fullscreenInstance, "fullscreenInstance");
            IronLog.INTERNAL.verbose(C20752rc.this.m57568a(fullscreenInstance.m54226o()));
            C20752rc.this.m57559g().m57751e().m57504a().m57906l(C20752rc.this.m57557i());
            C20752rc.this.m55503n();
            C20752rc.this.m55504m();
            C20752rc.this.m55505l();
            WeakReference weakReference = C20752rc.this.f52753j;
            if (weakReference == null) {
                Intrinsics.m17056y("showListener");
                weakReference = null;
            }
            InterfaceC20563o2 interfaceC20563o2 = (InterfaceC20563o2) weakReference.get();
            if (interfaceC20563o2 != null) {
                interfaceC20563o2.mo54485d(new C20617p1(C20752rc.this, fullscreenInstance.mo54243d()));
            }
        }

        @Override // com.ironsource.InterfaceC20632pc
        /* renamed from: c */
        public void mo55497c(@NotNull C20579oc fullscreenInstance) {
            Intrinsics.checkNotNullParameter(fullscreenInstance, "fullscreenInstance");
            IronLog.INTERNAL.verbose(C20752rc.this.m57568a(fullscreenInstance.m54226o()));
            C20752rc.this.m57559g().m57751e().m57504a().m57917b(C20752rc.this.m57557i());
            InterfaceC21010tc interfaceC21010tc = (InterfaceC21010tc) C20752rc.this.f52751h.get();
            if (interfaceC21010tc != null) {
                interfaceC21010tc.mo54803a(new C20617p1(C20752rc.this, fullscreenInstance.mo54243d()));
            }
        }

        @Override // com.ironsource.InterfaceC20632pc
        /* renamed from: a */
        public void mo55499a(@NotNull C20579oc fullscreenInstance) {
            Intrinsics.checkNotNullParameter(fullscreenInstance, "fullscreenInstance");
            IronLog.INTERNAL.verbose(C20752rc.this.m57568a(fullscreenInstance.m54226o()));
            InterfaceC21010tc interfaceC21010tc = (InterfaceC21010tc) C20752rc.this.f52751h.get();
            if (interfaceC21010tc != null) {
                interfaceC21010tc.mo54802n(new C20617p1(C20752rc.this, fullscreenInstance.mo54243d()));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20752rc(@NotNull C20179k1 adTools, @NotNull AbstractC20785s1 adUnitData, @NotNull InterfaceC21010tc listener) {
        super(adTools, adUnitData, listener);
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f52751h = new WeakReference<>(listener);
        this.f52752i = new C20754b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public final void m55505l() {
        boolean z;
        if (m57557i().length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return;
        }
        C19902f8 mo56012a = C19821el.f49880p.m58785d().mo57086w().mo56012a(m57557i(), m57560f().mo53957b().m59386c());
        if (mo56012a.m58611d()) {
            m57559g().m57751e().m57504a().m57916b(m57557i(), mo56012a.m58610e());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public final void m55504m() {
        C19821el.f49880p.m58788a().mo57481u().mo54347b(m57560f().mo53957b().m59387b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public final void m55503n() {
        boolean z;
        if (m57557i().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C19821el.f49880p.m58788a().mo57489a().mo56010b(m57557i(), m57560f().mo53957b().m59386c());
        }
    }

    /* renamed from: o */
    private final IronSourceError m55502o() {
        boolean z;
        IronSourceError ironSourceError;
        if (!super.m57561e().mo58729a()) {
            return new IronSourceError(509, "show called while ad unit is not ready to show");
        }
        if (m57557i().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && C19821el.f49880p.m58785d().mo57086w().mo56012a(m57557i(), m57560f().mo53957b().m59386c()).m58611d()) {
            ironSourceError = new IronSourceError(IronSourceError.ERROR_PLACEMENT_CAPPED, "placement " + m57557i() + " is capped");
        } else if (C19821el.f49880p.m58785d().mo57088s().mo54349a(m57560f().mo53957b().m59387b()).m58611d()) {
            ironSourceError = new IronSourceError(IronSourceError.ERROR_AD_UNIT_CAPPED, "adUnitId " + m57560f().mo53957b().m59387b() + " is capped");
        } else {
            return null;
        }
        return ironSourceError;
    }

    @Override // com.ironsource.AbstractC20235l1
    @NotNull
    /* renamed from: a */
    protected InterfaceC19563a0 mo54122a() {
        return new InterfaceC19563a0() { // from class: com.ironsource.zz
            @Override // com.ironsource.InterfaceC19563a0
            /* renamed from: a */
            public final AbstractC21201x mo53705a(C21245y c21245y) {
                AbstractC21201x m55512a;
                m55512a = C20752rc.m55512a(C20752rc.this, c21245y);
                return m55512a;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final AbstractC21201x m55512a(C20752rc this$0, C21245y instanceData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(instanceData, "instanceData");
        return new C20579oc(new C20618p2(this$0.m57559g(), C21205x1.EnumC21207b.PROVIDER), instanceData, this$0.f52752i);
    }

    /* renamed from: k */
    private final LevelPlayAdInfo m55507k() {
        Map m17284j;
        m17284j = C37559r0.m17284j();
        if (m57557i().length() > 0) {
            m17284j = MapsJVM.m17291g(C38513v.m14532a("placement", m57557i()));
        }
        return new LevelPlayAdInfo(m57560f().mo53957b().m59387b(), m57560f().mo53957b().m59386c().getValue(), new ImpressionData(new JSONObject(m17284j)), null, 8, null);
    }

    /* renamed from: a */
    public final void m55518a(@NotNull Activity activity, @NotNull InterfaceC20563o2 showListener) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(showListener, "showListener");
        this.f52753j = new WeakReference<>(showListener);
        IronLog.INTERNAL.verbose(m57568a("showAd called"));
        m57559g().m57751e().m57504a().m57924a(activity, m57557i());
        IronSourceError m55502o = m55502o();
        if (m55502o == null) {
            m57571a(new C20683qc(activity));
            return;
        }
        IronLog.API.error(m57568a(m55502o.getErrorMessage()));
        m55517a(m55502o);
    }

    /* renamed from: a */
    private final void m55517a(IronSourceError ironSourceError) {
        m57559g().m57751e().m57504a().m57922a(m57557i(), ironSourceError.getErrorCode(), ironSourceError.getErrorMessage(), "");
        WeakReference<InterfaceC20563o2> weakReference = this.f52753j;
        if (weakReference == null) {
            Intrinsics.m17056y("showListener");
            weakReference = null;
        }
        InterfaceC20563o2 interfaceC20563o2 = weakReference.get();
        if (interfaceC20563o2 != null) {
            interfaceC20563o2.mo54488b(new C20617p1(this, m55507k()), ironSourceError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public final void m55516a(IronSourceError ironSourceError, C20579oc c20579oc) {
        m57559g().m57751e().m57504a().m57922a(m57557i(), ironSourceError.getErrorCode(), ironSourceError.getErrorMessage(), "");
        WeakReference<InterfaceC20563o2> weakReference = this.f52753j;
        if (weakReference == null) {
            Intrinsics.m17056y("showListener");
            weakReference = null;
        }
        InterfaceC20563o2 interfaceC20563o2 = weakReference.get();
        if (interfaceC20563o2 != null) {
            interfaceC20563o2.mo54488b(new C20617p1(this, c20579oc != null ? c20579oc.mo54243d() : null), ironSourceError);
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m55513a(C20752rc c20752rc, IronSourceError ironSourceError, C20579oc c20579oc, int i, Object obj) {
        if ((i & 2) != 0) {
            c20579oc = null;
        }
        c20752rc.m55516a(ironSourceError, c20579oc);
    }
}
