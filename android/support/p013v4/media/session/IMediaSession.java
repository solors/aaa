package android.support.p013v4.media.session;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: android.support.v4.media.session.b */
/* loaded from: classes.dex */
public interface IMediaSession extends IInterface {

    /* compiled from: IMediaSession.java */
    /* renamed from: android.support.v4.media.session.b$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC0103a extends Binder implements IMediaSession {

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: IMediaSession.java */
        /* renamed from: android.support.v4.media.session.b$a$a */
        /* loaded from: classes.dex */
        public static class C0104a implements IMediaSession {

            /* renamed from: c */
            public static IMediaSession f285c;

            /* renamed from: b */
            private IBinder f286b;

            C0104a(IBinder iBinder) {
                this.f286b = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f286b;
            }

            @Override // android.support.p013v4.media.session.IMediaSession
            /* renamed from: b */
            public void mo105536b(IMediaControllerCallback iMediaControllerCallback) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (iMediaControllerCallback != null) {
                        iBinder = iMediaControllerCallback.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (!this.f286b.transact(3, obtain, obtain2, 0) && AbstractBinderC0103a.m105537i() != null) {
                        AbstractBinderC0103a.m105537i().mo105536b(iMediaControllerCallback);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: c */
        public static IMediaSession m105538c(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
            if (queryLocalInterface != null && (queryLocalInterface instanceof IMediaSession)) {
                return (IMediaSession) queryLocalInterface;
            }
            return new C0104a(iBinder);
        }

        /* renamed from: i */
        public static IMediaSession m105537i() {
            return C0104a.f285c;
        }
    }

    /* renamed from: b */
    void mo105536b(IMediaControllerCallback iMediaControllerCallback) throws RemoteException;
}
