package com.ironsource;

import android.text.TextUtils;
import com.ironsource.AbstractC20235l1;
import com.ironsource.C21205x1;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AdapterUtils;
import com.ironsource.mediationsdk.C20410l;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.Placement;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C37612s0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.e6 */
/* loaded from: classes6.dex */
public final class C19802e6 extends AbstractC20235l1 {
    @NotNull

    /* renamed from: h */
    private final WeakReference<InterfaceC20029h6> f49864h;
    @NotNull

    /* renamed from: i */
    private final C19803a f49865i;
    @NotNull

    /* renamed from: j */
    private final C19898f6 f49866j;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata
    /* renamed from: com.ironsource.e6$a */
    /* loaded from: classes6.dex */
    public final class C19803a extends AbstractC20235l1.C20236a implements InterfaceC20790s5 {
        public C19803a() {
            super();
        }

        @Override // com.ironsource.InterfaceC20790s5
        /* renamed from: a */
        public void mo55388a(@NotNull C20674q5 instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            IronLog.INTERNAL.verbose(C19802e6.this.m57568a(instance.m54226o()));
            InterfaceC20029h6 interfaceC20029h6 = (InterfaceC20029h6) C19802e6.this.f49864h.get();
            if (interfaceC20029h6 != null) {
                interfaceC20029h6.mo56051h(new C20617p1(C19802e6.this, instance.mo54243d()));
            }
        }

        @Override // com.ironsource.InterfaceC20790s5
        /* renamed from: b */
        public void mo55387b(@NotNull C20674q5 instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            IronLog.INTERNAL.verbose(C19802e6.this.m57568a(instance.m54226o()));
            InterfaceC20029h6 interfaceC20029h6 = (InterfaceC20029h6) C19802e6.this.f49864h.get();
            if (interfaceC20029h6 != null) {
                interfaceC20029h6.mo56057c(new C20617p1(C19802e6.this, instance.mo54243d()));
            }
        }

        @Override // com.ironsource.InterfaceC20790s5
        /* renamed from: c */
        public void mo55386c(@NotNull C20674q5 instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            IronLog.INTERNAL.verbose(C19802e6.this.m57568a(instance.m54226o()));
            InterfaceC20029h6 interfaceC20029h6 = (InterfaceC20029h6) C19802e6.this.f49864h.get();
            if (interfaceC20029h6 != null) {
                interfaceC20029h6.mo56052f(new C20617p1(C19802e6.this, instance.mo54243d()));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19802e6(@NotNull C20179k1 tools, @NotNull C19898f6 adUnitData, @NotNull InterfaceC20029h6 listener) {
        super(tools, adUnitData, listener);
        String str;
        String format;
        int m54869b;
        Intrinsics.checkNotNullParameter(tools, "tools");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f49864h = new WeakReference<>(listener);
        this.f49865i = new C19803a();
        this.f49866j = adUnitData;
        Placement m57558h = m57558h();
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("placement = " + m57558h);
        if (m57558h != null && !TextUtils.isEmpty(m57558h.getPlacementName())) {
            format = null;
            m54869b = 510;
        } else {
            C37612s0 c37612s0 = C37612s0.f99333a;
            Object[] objArr = new Object[1];
            if (m57558h == null) {
                str = "placement is null";
            } else {
                str = "placement name is empty";
            }
            objArr[0] = str;
            format = String.format("can't load banner - %s", Arrays.copyOf(objArr, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
            m54869b = C20996t1.m54869b(adUnitData.mo53957b().m59389a());
        }
        if (format != null) {
            IronLog.API.error(m57568a(format));
            m57572a(m54869b, format);
        }
    }

    @Override // com.ironsource.AbstractC20235l1
    @NotNull
    /* renamed from: a */
    protected InterfaceC19563a0 mo54122a() {
        return new InterfaceC19563a0() { // from class: com.ironsource.zv
            @Override // com.ironsource.InterfaceC19563a0
            /* renamed from: a */
            public final AbstractC21201x mo53705a(C21245y c21245y) {
                AbstractC21201x m58827a;
                m58827a = C19802e6.m58827a(C19802e6.this, c21245y);
                return m58827a;
            }
        };
    }

    @Override // com.ironsource.AbstractC20235l1
    @NotNull
    /* renamed from: b */
    public C20500n1 mo57567b() {
        return new C20251l6(this.f49866j.mo53957b(), m58826a(m58825k()));
    }

    /* renamed from: a */
    private final ISBannerSize m58826a(ISBannerSize iSBannerSize) {
        return iSBannerSize.isSmart() ? AdapterUtils.isLargeScreen(ContextProvider.getInstance().getApplicationContext()) ? C20410l.m56798a() : ISBannerSize.BANNER : iSBannerSize;
    }

    /* renamed from: k */
    private final ISBannerSize m58825k() {
        return m57559g().m57761a(this.f49866j.mo53957b().m59191g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final AbstractC21201x m58827a(C19802e6 this$0, C21245y instanceData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(instanceData, "instanceData");
        return new C20674q5(new C20618p2(this$0.m57559g(), C21205x1.EnumC21207b.PROVIDER), instanceData, this$0.f49865i);
    }

    /* renamed from: a */
    public final void m58829a(@Nullable InterfaceC19789du interfaceC19789du) {
        if (interfaceC19789du != null) {
            m57571a(new C21061u5(interfaceC19789du));
        }
    }
}
