package com.chartboost.sdk.impl;

import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.impl.AbstractC10024la;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.chartboost.sdk.impl.r3 */
/* loaded from: classes3.dex */
public final class C10161r3 extends AbstractC10024la {

    /* renamed from: m */
    public static final C10162a f23046m = new C10162a(null);

    /* renamed from: com.chartboost.sdk.impl.r3$a */
    /* loaded from: classes3.dex */
    public static final class C10162a {
        public C10162a() {
        }

        /* renamed from: a */
        public final C10161r3 m80688a(InterfaceC10068na name, String message) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(message, "message");
            return new C10161r3(name, message, null, null, null, null, 60, null);
        }

        public /* synthetic */ C10162a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C10161r3 m80687a(InterfaceC10068na name, String message, String adType, String location) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(adType, "adType");
            Intrinsics.checkNotNullParameter(location, "location");
            return new C10161r3(name, message, adType, location, null, null, 48, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10161r3(InterfaceC10068na name, String message, String adType, String location, Mediation mediation, C9833ea trackAd) {
        super(name, message, adType, location, mediation, AbstractC10024la.EnumC10026b.f22550c, trackAd, false, false, 0L, 0.0f, AbstractC10024la.EnumC10025a.f22546c, 1920, null);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(trackAd, "trackAd");
    }

    /* renamed from: a */
    public static final C10161r3 m80690a(InterfaceC10068na interfaceC10068na, String str) {
        return f23046m.m80688a(interfaceC10068na, str);
    }

    /* renamed from: a */
    public static final C10161r3 m80689a(InterfaceC10068na interfaceC10068na, String str, String str2, String str3) {
        return f23046m.m80687a(interfaceC10068na, str, str2, str3);
    }

    public /* synthetic */ C10161r3(InterfaceC10068na interfaceC10068na, String str, String str2, String str3, Mediation mediation, C9833ea c9833ea, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC10068na, str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? null : mediation, (i & 32) != 0 ? new C9833ea(null, null, null, null, null, null, null, null, 255, null) : c9833ea);
    }
}
