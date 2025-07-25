package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.android.billingclient:billing@@6.1.0 */
/* loaded from: classes5.dex */
public abstract class zze extends zzq implements zzf {
    public zze() {
        super("com.android.vending.billing.IInAppBillingGetAlternativeBillingOnlyDialogIntentCallback");
    }

    @Override // com.google.android.gms.internal.play_billing.zzq
    protected final boolean zzb(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzr.zzb(parcel);
            zza((Bundle) zzr.zza(parcel, Bundle.CREATOR));
            return true;
        }
        return false;
    }
}
