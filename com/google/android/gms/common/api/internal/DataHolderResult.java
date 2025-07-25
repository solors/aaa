package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
@KeepForSdk
/* loaded from: classes4.dex */
public abstract class DataHolderResult implements Result, Releasable {
    @NonNull
    @KeepForSdk
    protected final DataHolder mDataHolder;
    @NonNull
    @KeepForSdk
    protected final Status mStatus;

    @KeepForSdk
    protected DataHolderResult(@NonNull DataHolder dataHolder, @NonNull Status status) {
        this.mStatus = status;
        this.mDataHolder = dataHolder;
    }

    @Override // com.google.android.gms.common.api.Result
    @NonNull
    @KeepForSdk
    public Status getStatus() {
        return this.mStatus;
    }

    @Override // com.google.android.gms.common.api.Releasable
    @KeepForSdk
    public void release() {
        DataHolder dataHolder = this.mDataHolder;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }

    @KeepForSdk
    protected DataHolderResult(@NonNull DataHolder dataHolder) {
        this(dataHolder, new Status(dataHolder.getStatusCode()));
    }
}
