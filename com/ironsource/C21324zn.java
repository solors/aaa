package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.zn */
/* loaded from: classes6.dex */
public final class C21324zn extends AbstractC20325m7 {
    @NotNull

    /* renamed from: P */
    public static final C21324zn f54809P;

    @Metadata
    /* renamed from: com.ironsource.zn$a */
    /* loaded from: classes6.dex */
    public static final class C21325a {
        /* renamed from: a */
        public final void m53767a() {
            C21324zn.f54809P.mo57283a(new C20200kb(IronSourceConstants.INIT_DEFERRED_DATA, new C21224xg().m54136a()));
        }
    }

    static {
        C21324zn c21324zn = new C21324zn();
        f54809P = c21324zn;
        c21324zn.f51145H = "outcome";
        c21324zn.f51144G = 0;
        c21324zn.f51146I = IronSourceConstants.PIXEL_EVENT_TYPE;
        c21324zn.m57235e();
    }

    private C21324zn() {
    }

    @Override // com.ironsource.AbstractC20325m7
    /* renamed from: c */
    protected int mo53775c(@Nullable C20200kb c20200kb) {
        return 1;
    }

    @Override // com.ironsource.AbstractC20325m7
    /* renamed from: d */
    protected void mo53774d() {
    }

    @Override // com.ironsource.AbstractC20325m7
    @NotNull
    /* renamed from: e */
    protected String mo53772e(int i) {
        return "";
    }

    @Override // com.ironsource.AbstractC20325m7
    /* renamed from: g */
    protected boolean mo53770g(@Nullable C20200kb c20200kb) {
        return false;
    }

    @Override // com.ironsource.AbstractC20325m7
    /* renamed from: h */
    protected boolean mo53769h(@Nullable C20200kb c20200kb) {
        return false;
    }

    @Override // com.ironsource.AbstractC20325m7
    /* renamed from: j */
    protected boolean mo53768j(@Nullable C20200kb c20200kb) {
        return false;
    }

    @Override // com.ironsource.AbstractC20325m7
    /* renamed from: d */
    protected boolean mo53773d(@Nullable C20200kb c20200kb) {
        return true;
    }

    @Override // com.ironsource.AbstractC20325m7
    /* renamed from: a */
    protected void mo53776a(@Nullable ArrayList<C20200kb> arrayList) {
    }

    @Override // com.ironsource.AbstractC20325m7
    /* renamed from: f */
    protected void mo53771f(@Nullable C20200kb c20200kb) {
    }
}
