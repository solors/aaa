package com.monetization.ads.core.identifiers.p548ad.gms.service;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.yandex.mobile.ads.impl.InterfaceC30305fc;
import com.yandex.mobile.ads.impl.um0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.monetization.ads.core.identifiers.ad.gms.service.GmsServiceAdvertisingInfoReader */
/* loaded from: classes7.dex */
public final class GmsServiceAdvertisingInfoReader implements InterfaceC30305fc, IInterface {
    @NotNull

    /* renamed from: a */
    private final IBinder f66080a;

    public GmsServiceAdvertisingInfoReader(@NotNull IBinder binder) {
        Intrinsics.checkNotNullParameter(binder, "binder");
        this.f66080a = binder;
    }

    @Override // android.os.IInterface
    @NotNull
    public IBinder asBinder() {
        return this.f66080a;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30305fc
    @Nullable
    public Boolean readAdTrackingLimited() {
        Parcel obtain = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(obtain, "obtain(...)");
        Parcel obtain2 = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(obtain2, "obtain(...)");
        try {
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z = true;
                obtain.writeInt(1);
                this.f66080a.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                if (obtain2.readInt() == 0) {
                    z = false;
                }
                return Boolean.valueOf(z);
            } catch (Throwable unused) {
                um0.m28726c(new Object[0]);
                obtain2.recycle();
                obtain.recycle();
                return null;
            }
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30305fc
    @Nullable
    public String readAdvertisingId() {
        Parcel obtain = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(obtain, "obtain(...)");
        Parcel obtain2 = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(obtain2, "obtain(...)");
        try {
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f66080a.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } catch (Throwable unused) {
                um0.m28726c(new Object[0]);
                obtain2.recycle();
                obtain.recycle();
                return null;
            }
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
