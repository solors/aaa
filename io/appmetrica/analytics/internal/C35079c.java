package io.appmetrica.analytics.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: io.appmetrica.analytics.internal.c */
/* loaded from: classes9.dex */
public final class C35079c implements IAppMetricaService {

    /* renamed from: a */
    public final IBinder f95714a;

    public C35079c(IBinder iBinder) {
        this.f95714a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f95714a;
    }

    @Override // io.appmetrica.analytics.internal.IAppMetricaService
    public final void pauseUserSession(Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IAppMetricaService.DESCRIPTOR);
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f95714a.transact(2, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // io.appmetrica.analytics.internal.IAppMetricaService
    public final void reportData(int i, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IAppMetricaService.DESCRIPTOR);
            obtain.writeInt(i);
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f95714a.transact(3, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // io.appmetrica.analytics.internal.IAppMetricaService
    public final void resumeUserSession(Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IAppMetricaService.DESCRIPTOR);
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f95714a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
