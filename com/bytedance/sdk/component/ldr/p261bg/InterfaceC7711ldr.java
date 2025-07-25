package com.bytedance.sdk.component.ldr.p261bg;

import android.content.ContentValues;
import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Map;

/* renamed from: com.bytedance.sdk.component.ldr.bg.ldr */
/* loaded from: classes3.dex */
public interface InterfaceC7711ldr extends IInterface {
    /* renamed from: bg */
    int mo83048bg(Uri uri, ContentValues contentValues, String str, String[] strArr) throws RemoteException;

    /* renamed from: bg */
    int mo83047bg(Uri uri, String str, String[] strArr) throws RemoteException;

    /* renamed from: bg */
    String mo83050bg(Uri uri) throws RemoteException;

    /* renamed from: bg */
    String mo83049bg(Uri uri, ContentValues contentValues) throws RemoteException;

    /* renamed from: bg */
    Map mo83046bg(Uri uri, String[] strArr, String str, String[] strArr2, String str2) throws RemoteException;

    /* renamed from: com.bytedance.sdk.component.ldr.bg.ldr$bg */
    /* loaded from: classes3.dex */
    public static abstract class AbstractBinderC7712bg extends Binder implements InterfaceC7711ldr {
        public AbstractBinderC7712bg() {
            attachInterface(this, "com.bytedance.sdk.component.log.impl.IListenerEventManager");
        }

        /* renamed from: bg */
        public static InterfaceC7711ldr m87956bg(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.bytedance.sdk.component.log.impl.IListenerEventManager");
            if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC7711ldr)) {
                return (InterfaceC7711ldr) queryLocalInterface;
            }
            return new C7713bg(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            Uri uri;
            Uri uri2;
            Uri uri3 = null;
            ContentValues contentValues = null;
            Uri uri4 = null;
            ContentValues contentValues2 = null;
            Uri uri5 = null;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                if (i != 1598968902) {
                                    return super.onTransact(i, parcel, parcel2, i2);
                                }
                                parcel2.writeString("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                                return true;
                            }
                            parcel.enforceInterface("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                            if (parcel.readInt() != 0) {
                                uri2 = (Uri) Uri.CREATOR.createFromParcel(parcel);
                            } else {
                                uri2 = null;
                            }
                            if (parcel.readInt() != 0) {
                                contentValues = (ContentValues) ContentValues.CREATOR.createFromParcel(parcel);
                            }
                            int mo83048bg = mo83048bg(uri2, contentValues, parcel.readString(), parcel.createStringArray());
                            parcel2.writeNoException();
                            parcel2.writeInt(mo83048bg);
                            return true;
                        }
                        parcel.enforceInterface("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                        if (parcel.readInt() != 0) {
                            uri4 = (Uri) Uri.CREATOR.createFromParcel(parcel);
                        }
                        int mo83047bg = mo83047bg(uri4, parcel.readString(), parcel.createStringArray());
                        parcel2.writeNoException();
                        parcel2.writeInt(mo83047bg);
                        return true;
                    }
                    parcel.enforceInterface("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                    if (parcel.readInt() != 0) {
                        uri = (Uri) Uri.CREATOR.createFromParcel(parcel);
                    } else {
                        uri = null;
                    }
                    if (parcel.readInt() != 0) {
                        contentValues2 = (ContentValues) ContentValues.CREATOR.createFromParcel(parcel);
                    }
                    String mo83049bg = mo83049bg(uri, contentValues2);
                    parcel2.writeNoException();
                    parcel2.writeString(mo83049bg);
                    return true;
                }
                parcel.enforceInterface("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                if (parcel.readInt() != 0) {
                    uri5 = (Uri) Uri.CREATOR.createFromParcel(parcel);
                }
                String mo83050bg = mo83050bg(uri5);
                parcel2.writeNoException();
                parcel2.writeString(mo83050bg);
                return true;
            }
            parcel.enforceInterface("com.bytedance.sdk.component.log.impl.IListenerEventManager");
            if (parcel.readInt() != 0) {
                uri3 = (Uri) Uri.CREATOR.createFromParcel(parcel);
            }
            Map mo83046bg = mo83046bg(uri3, parcel.createStringArray(), parcel.readString(), parcel.createStringArray(), parcel.readString());
            parcel2.writeNoException();
            parcel2.writeMap(mo83046bg);
            return true;
        }

        /* renamed from: bg */
        public static InterfaceC7711ldr m87957bg() {
            return C7713bg.f16874bg;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.bytedance.sdk.component.ldr.bg.ldr$bg$bg */
        /* loaded from: classes3.dex */
        public static class C7713bg implements InterfaceC7711ldr {

            /* renamed from: bg */
            public static InterfaceC7711ldr f16874bg;

            /* renamed from: IL */
            private IBinder f16875IL;

            C7713bg(IBinder iBinder) {
                this.f16875IL = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f16875IL;
            }

            @Override // com.bytedance.sdk.component.ldr.p261bg.InterfaceC7711ldr
            /* renamed from: bg */
            public Map mo83046bg(Uri uri, String[] strArr, String str, String[] strArr2, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStringArray(strArr);
                    obtain.writeString(str);
                    obtain.writeStringArray(strArr2);
                    obtain.writeString(str2);
                    if (!this.f16875IL.transact(1, obtain, obtain2, 0) && AbstractBinderC7712bg.m87957bg() != null) {
                        return AbstractBinderC7712bg.m87957bg().mo83046bg(uri, strArr, str, strArr2, str2);
                    }
                    obtain2.readException();
                    return obtain2.readHashMap(getClass().getClassLoader());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.component.ldr.p261bg.InterfaceC7711ldr
            /* renamed from: bg */
            public String mo83050bg(Uri uri) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f16875IL.transact(2, obtain, obtain2, 0) && AbstractBinderC7712bg.m87957bg() != null) {
                        return AbstractBinderC7712bg.m87957bg().mo83050bg(uri);
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.component.ldr.p261bg.InterfaceC7711ldr
            /* renamed from: bg */
            public String mo83049bg(Uri uri, ContentValues contentValues) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (contentValues != null) {
                        obtain.writeInt(1);
                        contentValues.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f16875IL.transact(3, obtain, obtain2, 0) && AbstractBinderC7712bg.m87957bg() != null) {
                        return AbstractBinderC7712bg.m87957bg().mo83049bg(uri, contentValues);
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.component.ldr.p261bg.InterfaceC7711ldr
            /* renamed from: bg */
            public int mo83047bg(Uri uri, String str, String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    obtain.writeStringArray(strArr);
                    if (!this.f16875IL.transact(4, obtain, obtain2, 0) && AbstractBinderC7712bg.m87957bg() != null) {
                        return AbstractBinderC7712bg.m87957bg().mo83047bg(uri, str, strArr);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.component.ldr.p261bg.InterfaceC7711ldr
            /* renamed from: bg */
            public int mo83048bg(Uri uri, ContentValues contentValues, String str, String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (contentValues != null) {
                        obtain.writeInt(1);
                        contentValues.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    obtain.writeStringArray(strArr);
                    if (!this.f16875IL.transact(5, obtain, obtain2, 0) && AbstractBinderC7712bg.m87957bg() != null) {
                        return AbstractBinderC7712bg.m87957bg().mo83048bg(uri, contentValues, str, strArr);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
