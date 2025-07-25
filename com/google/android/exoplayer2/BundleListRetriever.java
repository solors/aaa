package com.google.android.exoplayer2;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes4.dex */
public final class BundleListRetriever extends Binder {

    /* renamed from: c */
    private static final int f31362c;

    /* renamed from: b */
    private final ImmutableList<Bundle> f31363b;

    static {
        int i;
        if (Util.SDK_INT >= 30) {
            i = IBinder.getSuggestedMaxIpcSizeBytes();
        } else {
            i = 65536;
        }
        f31362c = i;
    }

    public BundleListRetriever(List<Bundle> list) {
        this.f31363b = ImmutableList.copyOf((Collection) list);
    }

    public static ImmutableList<Bundle> getList(IBinder iBinder) {
        int readInt;
        ImmutableList.Builder builder = ImmutableList.builder();
        int i = 0;
        int i2 = 1;
        while (i2 != 0) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInt(i);
                try {
                    iBinder.transact(1, obtain, obtain2, 0);
                    while (true) {
                        readInt = obtain2.readInt();
                        if (readInt == 1) {
                            builder.add((ImmutableList.Builder) ((Bundle) Assertions.checkNotNull(obtain2.readBundle())));
                            i++;
                        }
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    i2 = readInt;
                } catch (RemoteException e) {
                    throw new RuntimeException(e);
                }
            } catch (Throwable th) {
                obtain2.recycle();
                obtain.recycle();
                throw th;
            }
        }
        return builder.build();
    }

    @Override // android.os.Binder
    protected boolean onTransact(int i, Parcel parcel, @Nullable Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        int i3 = 0;
        if (parcel2 == null) {
            return false;
        }
        int size = this.f31363b.size();
        int readInt = parcel.readInt();
        while (readInt < size && parcel2.dataSize() < f31362c) {
            parcel2.writeInt(1);
            parcel2.writeBundle(this.f31363b.get(readInt));
            readInt++;
        }
        if (readInt < size) {
            i3 = 2;
        }
        parcel2.writeInt(i3);
        return true;
    }
}
