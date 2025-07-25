package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
@SafeParcelable.Class(creator = "ResolveAccountRequestCreator")
/* loaded from: classes4.dex */
public final class zat extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zat> CREATOR = new zau();
    @SafeParcelable.VersionField(m72311id = 1)
    final int zaa;
    @SafeParcelable.Field(getter = "getAccount", m72314id = 2)
    private final Account zab;
    @SafeParcelable.Field(getter = "getSessionId", m72314id = 3)
    private final int zac;
    @Nullable
    @SafeParcelable.Field(getter = "getSignInAccountHint", m72314id = 4)
    private final GoogleSignInAccount zad;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zat(@SafeParcelable.Param(m72313id = 1) int i, @SafeParcelable.Param(m72313id = 2) Account account, @SafeParcelable.Param(m72313id = 3) int i2, @Nullable @SafeParcelable.Param(m72313id = 4) GoogleSignInAccount googleSignInAccount) {
        this.zaa = i;
        this.zab = account;
        this.zac = i2;
        this.zad = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zaa;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i2);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zab, i, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zac);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zad, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zat(Account account, int i, @Nullable GoogleSignInAccount googleSignInAccount) {
        this(2, account, i, googleSignInAccount);
    }
}
