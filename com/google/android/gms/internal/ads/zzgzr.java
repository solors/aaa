package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzgzr {
    private final ArrayDeque zza = new ArrayDeque();

    private zzgzr() {
    }

    public static /* bridge */ /* synthetic */ zzgwj zza(zzgzr zzgzrVar, zzgwj zzgwjVar, zzgwj zzgwjVar2) {
        zzgzrVar.zzb(zzgwjVar);
        zzgzrVar.zzb(zzgwjVar2);
        zzgwj zzgwjVar3 = (zzgwj) zzgzrVar.zza.pop();
        while (!zzgzrVar.zza.isEmpty()) {
            zzgwjVar3 = new zzgzu((zzgwj) zzgzrVar.zza.pop(), zzgwjVar3);
        }
        return zzgwjVar3;
    }

    private final void zzb(zzgwj zzgwjVar) {
        zzgwj zzgwjVar2;
        zzgwj zzgwjVar3;
        if (zzgwjVar.zzh()) {
            int zzc = zzc(zzgwjVar.zzd());
            ArrayDeque arrayDeque = this.zza;
            int zzc2 = zzgzu.zzc(zzc + 1);
            if (!arrayDeque.isEmpty() && ((zzgwj) this.zza.peek()).zzd() < zzc2) {
                int zzc3 = zzgzu.zzc(zzc);
                zzgwj zzgwjVar4 = (zzgwj) this.zza.pop();
                while (!this.zza.isEmpty() && ((zzgwj) this.zza.peek()).zzd() < zzc3) {
                    zzgwjVar4 = new zzgzu((zzgwj) this.zza.pop(), zzgwjVar4);
                }
                zzgzu zzgzuVar = new zzgzu(zzgwjVar4, zzgwjVar);
                while (!this.zza.isEmpty()) {
                    ArrayDeque arrayDeque2 = this.zza;
                    if (((zzgwj) arrayDeque2.peek()).zzd() >= zzgzu.zzc(zzc(zzgzuVar.zzd()) + 1)) {
                        break;
                    }
                    zzgzuVar = new zzgzu((zzgwj) this.zza.pop(), zzgzuVar);
                }
                this.zza.push(zzgzuVar);
                return;
            }
            this.zza.push(zzgwjVar);
        } else if (zzgwjVar instanceof zzgzu) {
            zzgzu zzgzuVar2 = (zzgzu) zzgwjVar;
            zzgwjVar2 = zzgzuVar2.zzd;
            zzb(zzgwjVar2);
            zzgwjVar3 = zzgzuVar2.zze;
            zzb(zzgwjVar3);
        } else {
            throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(zzgwjVar.getClass())));
        }
    }

    private static final int zzc(int i) {
        int binarySearch = Arrays.binarySearch(zzgzu.zza, i);
        if (binarySearch < 0) {
            return (-(binarySearch + 1)) - 1;
        }
        return binarySearch;
    }

    public /* synthetic */ zzgzr(zzgzt zzgztVar) {
    }
}
