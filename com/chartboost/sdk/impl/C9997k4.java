package com.chartboost.sdk.impl;

import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.impl.AbstractC10024la;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.chartboost.sdk.impl.k4 */
/* loaded from: classes3.dex */
public final class C9997k4 extends AbstractC10024la {

    /* renamed from: m */
    public static final C9998a f22471m = new C9998a(null);

    /* renamed from: com.chartboost.sdk.impl.k4$a */
    /* loaded from: classes3.dex */
    public static final class C9998a {
        public C9998a() {
        }

        /* renamed from: a */
        public final C9997k4 m81226a(InterfaceC10068na name, String message) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(message, "message");
            return new C9997k4(name, message, null, null, null, 28, null);
        }

        public /* synthetic */ C9998a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9997k4(InterfaceC10068na name, String message, String adType, String location, Mediation mediation) {
        super(name, message, adType, location, mediation, AbstractC10024la.EnumC10026b.f22551d, null, false, false, 0L, 0.0f, AbstractC10024la.EnumC10025a.f22546c, 1984, null);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(location, "location");
    }

    /* renamed from: a */
    public static final C9997k4 m81227a(InterfaceC10068na interfaceC10068na, String str) {
        return f22471m.m81226a(interfaceC10068na, str);
    }

    public /* synthetic */ C9997k4(InterfaceC10068na interfaceC10068na, String str, String str2, String str3, Mediation mediation, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC10068na, str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? null : mediation);
    }
}
