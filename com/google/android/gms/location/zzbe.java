package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes5.dex */
public final class zzbe implements Parcelable.Creator<LocationAvailability> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationAvailability createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i = 1000;
        int i2 = 1;
        int i3 = 1;
        long j = 0;
        zzbo[] zzboVarArr = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId != 1) {
                if (fieldId != 2) {
                    if (fieldId != 3) {
                        if (fieldId != 4) {
                            if (fieldId != 5) {
                                SafeParcelReader.skipUnknownField(parcel, readHeader);
                            } else {
                                zzboVarArr = (zzbo[]) SafeParcelReader.createTypedArray(parcel, readHeader, zzbo.CREATOR);
                            }
                        } else {
                            i = SafeParcelReader.readInt(parcel, readHeader);
                        }
                    } else {
                        j = SafeParcelReader.readLong(parcel, readHeader);
                    }
                } else {
                    i3 = SafeParcelReader.readInt(parcel, readHeader);
                }
            } else {
                i2 = SafeParcelReader.readInt(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new LocationAvailability(i, i2, i3, j, zzboVarArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationAvailability[] newArray(int i) {
        return new LocationAvailability[i];
    }
}
