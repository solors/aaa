package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
@SafeParcelable.Class(creator = "ResolveAccountResponseCreator")
/* loaded from: classes4.dex */
public final class zav extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zav> CREATOR = new zaw();
    @SafeParcelable.VersionField(m72311id = 1)
    final int zaa;
    @Nullable
    @SafeParcelable.Field(m72314id = 2)
    final IBinder zab;
    @SafeParcelable.Field(getter = "getConnectionResult", m72314id = 3)
    private final ConnectionResult zac;
    @SafeParcelable.Field(getter = "getSaveDefaultAccount", m72314id = 4)
    private final boolean zad;
    @SafeParcelable.Field(getter = "isFromCrossClientAuth", m72314id = 5)
    private final boolean zae;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zav(@SafeParcelable.Param(m72313id = 1) int i, @Nullable @SafeParcelable.Param(m72313id = 2) IBinder iBinder, @SafeParcelable.Param(m72313id = 3) ConnectionResult connectionResult, @SafeParcelable.Param(m72313id = 4) boolean z, @SafeParcelable.Param(m72313id = 5) boolean z2) {
        this.zaa = i;
        this.zab = iBinder;
        this.zac = connectionResult;
        this.zad = z;
        this.zae = z2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zav)) {
            return false;
        }
        zav zavVar = (zav) obj;
        if (!this.zac.equals(zavVar.zac) || !Objects.equal(zab(), zavVar.zab())) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zaa);
        SafeParcelWriter.writeIBinder(parcel, 2, this.zab, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zac, i, false);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zad);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zae);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final ConnectionResult zaa() {
        return this.zac;
    }

    @Nullable
    public final IAccountAccessor zab() {
        IBinder iBinder = this.zab;
        if (iBinder == null) {
            return null;
        }
        return IAccountAccessor.Stub.asInterface(iBinder);
    }

    public final boolean zac() {
        return this.zad;
    }

    public final boolean zad() {
        return this.zae;
    }
}
