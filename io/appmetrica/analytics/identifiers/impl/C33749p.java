package io.appmetrica.analytics.identifiers.impl;

import android.os.IBinder;
import android.os.IInterface;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: io.appmetrica.analytics.identifiers.impl.p */
/* loaded from: classes9.dex */
public final class C33749p extends Lambda implements Function1 {

    /* renamed from: a */
    public static final C33749p f92535a = new C33749p();

    public C33749p() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        IBinder iBinder = (IBinder) obj;
        int i = AbstractBinderC33753t.f92539a;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.yandex.android.advid.service.YandexAdvIdInterface");
        if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC33754u)) {
            return (InterfaceC33754u) queryLocalInterface;
        }
        return new C33752s(iBinder);
    }
}
