package com.facebook.ads.redexgen.p370X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.dp */
/* loaded from: assets/audience_network.dex */
public class C13258dp<ModelType, StateType> {
    public final ModelType A02;
    public final StateType A03;
    public final String A04;
    public final String A05;
    public List<InterfaceC13260dr<ModelType, StateType>> A01 = null;
    public C13257do A00 = C13257do.A08;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.dp != com.instagram.common.viewpoint.core.ViewpointData$Builder<ModelType, StateType> */
    public C13258dp(ModelType model, StateType state, String str) {
        this.A02 = model;
        this.A03 = state;
        this.A05 = str;
        this.A04 = str;
    }

    public static /* synthetic */ C13257do A00(C13258dp c13258dp) {
        return c13258dp.A00;
    }

    public static /* synthetic */ Object A01(C13258dp c13258dp) {
        return c13258dp.A02;
    }

    public static /* synthetic */ Object A02(C13258dp c13258dp) {
        return c13258dp.A03;
    }

    public static /* synthetic */ String A03(C13258dp c13258dp) {
        return c13258dp.A05;
    }

    public static /* synthetic */ List A04(C13258dp c13258dp) {
        return c13258dp.A01;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.dp != com.instagram.common.viewpoint.core.ViewpointData$Builder<ModelType, StateType> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.dr != com.instagram.common.viewpoint.core.ViewpointAction<ModelType, StateType> */
    public final C13258dp<ModelType, StateType> A05(InterfaceC13260dr<ModelType, StateType> interfaceC13260dr) {
        if (this.A01 == null) {
            this.A01 = new ArrayList();
        }
        this.A01.add(interfaceC13260dr);
        return this;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.dp != com.instagram.common.viewpoint.core.ViewpointData$Builder<ModelType, StateType> */
    public final C13257do<ModelType, StateType> A06() {
        return new C13257do<>(this);
    }
}
