package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
@SafeParcelable.Class(creator = "ModuleInstallResponseCreator")
/* loaded from: classes4.dex */
public class ModuleInstallResponse extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<ModuleInstallResponse> CREATOR = new zad();
    @SafeParcelable.Field(getter = "getSessionId", m72314id = 1)
    private final int zaa;
    @SafeParcelable.Field(defaultValue = "false", getter = "getShouldUnregisterListener", m72314id = 2)
    private final boolean zab;

    @KeepForSdk
    public ModuleInstallResponse(int i) {
        this(i, false);
    }

    public boolean areModulesAlreadyInstalled() {
        if (this.zaa == 0) {
            return true;
        }
        return false;
    }

    public int getSessionId() {
        return this.zaa;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getSessionId());
        SafeParcelWriter.writeBoolean(parcel, 2, this.zab);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final boolean zaa() {
        return this.zab;
    }

    @SafeParcelable.Constructor
    public ModuleInstallResponse(@SafeParcelable.Param(m72313id = 1) int i, @SafeParcelable.Param(m72313id = 2) boolean z) {
        this.zaa = i;
        this.zab = z;
    }
}
