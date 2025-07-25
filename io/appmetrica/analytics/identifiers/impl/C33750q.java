package io.appmetrica.analytics.identifiers.impl;

import android.content.Context;
import android.os.Parcel;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.identifiers.impl.q */
/* loaded from: classes9.dex */
public final class C33750q implements InterfaceC33735b {

    /* renamed from: a */
    public final C33739f f92536a;

    @VisibleForTesting
    public C33750q(@NotNull C33739f c33739f) {
        this.f92536a = c33739f;
    }

    @Override // io.appmetrica.analytics.identifiers.impl.InterfaceC33735b
    @NotNull
    /* renamed from: a */
    public final C33736c mo22788a(@NotNull Context context) {
        C33736c c33736c;
        try {
            try {
                try {
                    try {
                        C33736c m22787b = m22787b(context);
                        try {
                            this.f92536a.m22795b(context);
                            return m22787b;
                        } catch (Throwable unused) {
                            return m22787b;
                        }
                    } catch (C33745l e) {
                        String message = e.getMessage();
                        if (message == null) {
                            message = "No yandex adv_id service";
                        }
                        c33736c = new C33736c(IdentifierStatus.IDENTIFIER_PROVIDER_UNAVAILABLE, null, message, 2);
                        this.f92536a.m22795b(context);
                        return c33736c;
                    }
                } catch (C33740g e2) {
                    String message2 = e2.getMessage();
                    if (message2 == null) {
                        message2 = "unknown exception while binding yandex adv_id service";
                    }
                    c33736c = new C33736c(IdentifierStatus.IDENTIFIER_PROVIDER_UNAVAILABLE, null, message2, 2);
                    this.f92536a.m22795b(context);
                    return c33736c;
                }
            } catch (Throwable unused2) {
                return c33736c;
            }
        }
    }

    /* renamed from: b */
    public final C33736c m22787b(Context context) {
        C33752s c33752s = (C33752s) ((InterfaceC33754u) this.f92536a.m22796a(context));
        c33752s.getClass();
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.yandex.android.advid.service.YandexAdvIdInterface");
            boolean z = true;
            c33752s.f92538a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            String readString = obtain2.readString();
            obtain2.recycle();
            obtain.recycle();
            obtain = Parcel.obtain();
            obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.yandex.android.advid.service.YandexAdvIdInterface");
                c33752s.f92538a.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                if (obtain2.readInt() == 0) {
                    z = false;
                }
                obtain2.recycle();
                obtain.recycle();
                return new C33736c(IdentifierStatus.OK, new C33734a("yandex", readString, Boolean.valueOf(z)), null, 4);
            } finally {
            }
        } finally {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C33750q() {
        /*
            r4 = this;
            io.appmetrica.analytics.identifiers.impl.f r0 = new io.appmetrica.analytics.identifiers.impl.f
            android.content.Intent r1 = io.appmetrica.analytics.identifiers.impl.AbstractC33751r.m22786a()
            io.appmetrica.analytics.identifiers.impl.p r2 = io.appmetrica.analytics.identifiers.impl.C33749p.f92535a
            java.lang.String r3 = "yandex"
            r0.<init>(r1, r2, r3)
            r4.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.identifiers.impl.C33750q.<init>():void");
    }
}
