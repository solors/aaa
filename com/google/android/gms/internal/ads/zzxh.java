package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.annotation.Nullable;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzxh extends zzbw {
    public final boolean zzD;
    public final boolean zzE;
    public final boolean zzF;
    public final boolean zzG;
    public final boolean zzH;
    public final boolean zzI;
    public final boolean zzJ;
    public final boolean zzK;
    public final boolean zzL;
    public final boolean zzM;
    public final boolean zzN;
    public final boolean zzO;
    public final boolean zzP;
    public final boolean zzQ;
    public final boolean zzR;
    private final SparseArray zzS;
    private final SparseBooleanArray zzT;

    static {
        new zzxh(new zzxg());
        Integer.toString(1000, 36);
        Integer.toString(1001, 36);
        Integer.toString(1002, 36);
        Integer.toString(1003, 36);
        Integer.toString(1004, 36);
        Integer.toString(1005, 36);
        Integer.toString(1006, 36);
        Integer.toString(1007, 36);
        Integer.toString(1008, 36);
        Integer.toString(1009, 36);
        Integer.toString(1010, 36);
        Integer.toString(1011, 36);
        Integer.toString(1012, 36);
        Integer.toString(1013, 36);
        Integer.toString(1014, 36);
        Integer.toString(1015, 36);
        Integer.toString(1016, 36);
        Integer.toString(1017, 36);
        Integer.toString(1018, 36);
    }

    public static zzxh zzd(Context context) {
        return new zzxh(new zzxg(context));
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzxh.class == obj.getClass()) {
            zzxh zzxhVar = (zzxh) obj;
            if (super.equals(zzxhVar) && this.zzD == zzxhVar.zzD && this.zzF == zzxhVar.zzF && this.zzH == zzxhVar.zzH && this.zzM == zzxhVar.zzM && this.zzN == zzxhVar.zzN && this.zzO == zzxhVar.zzO && this.zzQ == zzxhVar.zzQ) {
                SparseBooleanArray sparseBooleanArray = this.zzT;
                SparseBooleanArray sparseBooleanArray2 = zzxhVar.zzT;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    int i = 0;
                    while (true) {
                        if (i < size) {
                            if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                                break;
                            }
                            i++;
                        } else {
                            SparseArray sparseArray = this.zzS;
                            SparseArray sparseArray2 = zzxhVar.zzS;
                            int size2 = sparseArray.size();
                            if (sparseArray2.size() == size2) {
                                for (int i2 = 0; i2 < size2; i2++) {
                                    int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i2));
                                    if (indexOfKey >= 0) {
                                        Map map = (Map) sparseArray.valueAt(i2);
                                        Map map2 = (Map) sparseArray2.valueAt(indexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                zzwj zzwjVar = (zzwj) entry.getKey();
                                                if (map2.containsKey(zzwjVar)) {
                                                    if (!Objects.equals(entry.getValue(), map2.get(zzwjVar))) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.zzD ? 1 : 0)) * 961) + (this.zzF ? 1 : 0)) * 961) + (this.zzH ? 1 : 0)) * 28629151) + (this.zzM ? 1 : 0)) * 31) + (this.zzN ? 1 : 0)) * 31) + (this.zzO ? 1 : 0)) * 961) + (this.zzQ ? 1 : 0)) * 31;
    }

    public final zzxg zzc() {
        return new zzxg(this, null);
    }

    @Nullable
    @Deprecated
    public final zzxi zze(int i, zzwj zzwjVar) {
        Map map = (Map) this.zzS.get(i);
        if (map != null) {
            return (zzxi) map.get(zzwjVar);
        }
        return null;
    }

    public final boolean zzf(int i) {
        return this.zzT.get(i);
    }

    @Deprecated
    public final boolean zzg(int i, zzwj zzwjVar) {
        Map map = (Map) this.zzS.get(i);
        if (map != null && map.containsKey(zzwjVar)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public zzxh(zzxg zzxgVar) {
        super(zzxgVar);
        this.zzD = zzxg.zzx(zzxgVar);
        this.zzE = false;
        this.zzF = zzxg.zzt(zzxgVar);
        this.zzG = false;
        this.zzH = zzxg.zzv(zzxgVar);
        this.zzI = false;
        this.zzJ = false;
        this.zzK = false;
        this.zzL = false;
        this.zzM = zzxg.zzr(zzxgVar);
        this.zzN = zzxg.zzu(zzxgVar);
        this.zzO = zzxg.zzw(zzxgVar);
        this.zzP = false;
        this.zzQ = zzxg.zzs(zzxgVar);
        this.zzR = false;
        this.zzS = zzxg.zzo(zzxgVar);
        this.zzT = zzxg.zzp(zzxgVar);
    }
}
