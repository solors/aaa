package com.google.android.gms.location;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
@SafeParcelable.Class(creator = "SleepClassifyEventCreator")
/* loaded from: classes5.dex */
public class SleepClassifyEvent extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<SleepClassifyEvent> CREATOR = new zzbu();
    @SafeParcelable.Field(getter = "getTimestampSec", m72314id = 1)
    private final int zza;
    @SafeParcelable.Field(getter = "getConfidence", m72314id = 2)
    private final int zzb;
    @SafeParcelable.Field(getter = "getMotion", m72314id = 3)
    private final int zzc;
    @SafeParcelable.Field(getter = "getLight", m72314id = 4)
    private final int zzd;
    @SafeParcelable.Field(getter = "getNoise", m72314id = 5)
    private final int zze;
    @SafeParcelable.Field(getter = "getLightDiff", m72314id = 6)
    private final int zzf;
    @SafeParcelable.Field(getter = "getNightOrDay", m72314id = 7)
    private final int zzg;
    @SafeParcelable.Field(getter = "getConfidenceOverwrittenByAlarmClockTrigger", m72314id = 8)
    private final boolean zzh;
    @SafeParcelable.Field(getter = "getPresenceConfidence", m72314id = 9)
    private final int zzi;

    @ShowFirstParty
    @SafeParcelable.Constructor
    public SleepClassifyEvent(@SafeParcelable.Param(m72313id = 1) int i, @SafeParcelable.Param(m72313id = 2) int i2, @SafeParcelable.Param(m72313id = 3) int i3, @SafeParcelable.Param(m72313id = 4) int i4, @SafeParcelable.Param(m72313id = 5) int i5, @SafeParcelable.Param(m72313id = 6) int i6, @SafeParcelable.Param(m72313id = 7) int i7, @SafeParcelable.Param(m72313id = 8) boolean z, @SafeParcelable.Param(m72313id = 9) int i8) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = i4;
        this.zze = i5;
        this.zzf = i6;
        this.zzg = i7;
        this.zzh = z;
        this.zzi = i8;
    }

    @NonNull
    public static List<SleepClassifyEvent> extractEvents(@NonNull Intent intent) {
        Preconditions.checkNotNull(intent);
        if (!hasEvents(intent)) {
            return Collections.emptyList();
        }
        ArrayList arrayList = (ArrayList) intent.getSerializableExtra("com.google.android.location.internal.EXTRA_SLEEP_CLASSIFY_RESULT");
        if (arrayList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            byte[] bArr = (byte[]) arrayList.get(i);
            Preconditions.checkNotNull(bArr);
            arrayList2.add((SleepClassifyEvent) SafeParcelableSerializer.deserializeFromBytes(bArr, CREATOR));
        }
        return Collections.unmodifiableList(arrayList2);
    }

    public static boolean hasEvents(@Nullable Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent.hasExtra("com.google.android.location.internal.EXTRA_SLEEP_CLASSIFY_RESULT");
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SleepClassifyEvent)) {
            return false;
        }
        SleepClassifyEvent sleepClassifyEvent = (SleepClassifyEvent) obj;
        if (this.zza == sleepClassifyEvent.zza && this.zzb == sleepClassifyEvent.zzb) {
            return true;
        }
        return false;
    }

    public int getConfidence() {
        return this.zzb;
    }

    public int getLight() {
        return this.zzd;
    }

    public int getMotion() {
        return this.zzc;
    }

    public long getTimestampMillis() {
        return this.zza * 1000;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Integer.valueOf(this.zzb));
    }

    @NonNull
    public String toString() {
        int i = this.zza;
        int i2 = this.zzb;
        int i3 = this.zzc;
        int i4 = this.zzd;
        StringBuilder sb2 = new StringBuilder(65);
        sb2.append(i);
        sb2.append(" Conf:");
        sb2.append(i2);
        sb2.append(" Motion:");
        sb2.append(i3);
        sb2.append(" Light:");
        sb2.append(i4);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        Preconditions.checkNotNull(parcel);
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeInt(parcel, 2, getConfidence());
        SafeParcelWriter.writeInt(parcel, 3, getMotion());
        SafeParcelWriter.writeInt(parcel, 4, getLight());
        SafeParcelWriter.writeInt(parcel, 5, this.zze);
        SafeParcelWriter.writeInt(parcel, 6, this.zzf);
        SafeParcelWriter.writeInt(parcel, 7, this.zzg);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzh);
        SafeParcelWriter.writeInt(parcel, 9, this.zzi);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
