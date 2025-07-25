package com.zeus.gmc.sdk.mobileads.columbus.util.gaid;

import android.os.IInterface;
import android.os.RemoteException;

/* loaded from: classes8.dex */
public interface AdvertisingIdInterface extends IInterface {
    String getId() throws RemoteException;

    boolean isLimitAdTrackingEnabled(boolean z) throws RemoteException;
}
