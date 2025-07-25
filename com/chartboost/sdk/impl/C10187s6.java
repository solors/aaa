package com.chartboost.sdk.impl;

import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.impl.AbstractC10024la;
import com.chartboost.sdk.impl.InterfaceC10068na;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.chartboost.sdk.impl.s6 */
/* loaded from: classes3.dex */
public final class C10187s6 extends AbstractC10024la {

    /* renamed from: m */
    public static final C10188a f23105m = new C10188a(null);

    /* renamed from: com.chartboost.sdk.impl.s6$a */
    /* loaded from: classes3.dex */
    public static final class C10188a {
        public C10188a() {
        }

        public /* synthetic */ C10188a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10187s6(InterfaceC10068na name, String message, String adType, String location, Mediation mediation, C9833ea trackAd) {
        super(name, message, adType, location, mediation, AbstractC10024la.EnumC10026b.f22549b, trackAd, false, false, 0L, 0.0f, AbstractC10024la.EnumC10025a.f22545b, 1920, null);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(trackAd, "trackAd");
        if (m80620n()) {
            m81164a(AbstractC10024la.EnumC10025a.f22546c);
            m81163a(true);
        }
    }

    /* renamed from: n */
    public final boolean m80620n() {
        InterfaceC10068na m81157f = m81157f();
        if (m81157f == InterfaceC10068na.EnumC10069a.f22671e || m81157f == InterfaceC10068na.EnumC10069a.f22672f || m81157f == InterfaceC10068na.EnumC10078i.f22725d || m81157f == InterfaceC10068na.EnumC10078i.f22726e) {
            return true;
        }
        return false;
    }

    public /* synthetic */ C10187s6(InterfaceC10068na interfaceC10068na, String str, String str2, String str3, Mediation mediation, C9833ea c9833ea, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC10068na, str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? null : mediation, (i & 32) != 0 ? new C9833ea(null, null, null, null, null, null, null, null, 255, null) : c9833ea);
    }
}
