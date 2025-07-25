package com.google.android.finsky.externalreferrer;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.p378a.BaseProxy;
import com.google.android.p378a.BaseStub;
import com.google.android.p378a.Codecs;

/* loaded from: classes4.dex */
public interface IGetInstallReferrerService extends IInterface {

    /* loaded from: classes4.dex */
    public static abstract class Stub extends BaseStub implements IGetInstallReferrerService {

        /* loaded from: classes4.dex */
        public static class Proxy extends BaseProxy implements IGetInstallReferrerService {
            Proxy(IBinder iBinder) {
                super(iBinder);
            }

            @Override // com.google.android.finsky.externalreferrer.IGetInstallReferrerService
            /* renamed from: c */
            public final Bundle mo72331c(Bundle bundle) throws RemoteException {
                Parcel m76349i = m76349i();
                Codecs.m76346b(m76349i, bundle);
                Parcel m76348u = m76348u(m76349i);
                Bundle bundle2 = (Bundle) Codecs.m76347a(m76348u, Bundle.CREATOR);
                m76348u.recycle();
                return bundle2;
            }
        }

        /* renamed from: b */
        public static IGetInstallReferrerService m72333b(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            if (queryLocalInterface instanceof IGetInstallReferrerService) {
                return (IGetInstallReferrerService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.p378a.BaseStub
        /* renamed from: c */
        protected final boolean mo72332c(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
            if (i == 1) {
                Bundle mo72331c = mo72331c((Bundle) Codecs.m76347a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                Codecs.m76345c(parcel2, mo72331c);
                return true;
            }
            return false;
        }
    }

    /* renamed from: c */
    Bundle mo72331c(Bundle bundle) throws RemoteException;
}
