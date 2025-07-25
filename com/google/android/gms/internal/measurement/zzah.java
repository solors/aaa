package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@22.0.2 */
/* loaded from: classes5.dex */
public final class zzah implements Iterator<zzaq> {
    private int zza = 0;
    private final /* synthetic */ zzaf zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzah(zzaf zzafVar) {
        this.zzb = zzafVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.zza < this.zzb.zzb()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ zzaq next() {
        if (this.zza < this.zzb.zzb()) {
            zzaf zzafVar = this.zzb;
            int i = this.zza;
            this.zza = i + 1;
            return zzafVar.zza(i);
        }
        int i2 = this.zza;
        throw new NoSuchElementException("Out of bounds index: " + i2);
    }
}
