package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzaev extends zzaex {
    private long zzb;
    private long[] zzc;
    private long[] zzd;

    public zzaev() {
        super(new zzaci());
        this.zzb = -9223372036854775807L;
        this.zzc = new long[0];
        this.zzd = new long[0];
    }

    private static Double zzg(zzdy zzdyVar) {
        return Double.valueOf(Double.longBitsToDouble(zzdyVar.zzt()));
    }

    @Nullable
    private static Object zzh(zzdy zzdyVar, int i) {
        if (i != 0) {
            boolean z = false;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 8) {
                            if (i != 10) {
                                if (i != 11) {
                                    return null;
                                }
                                Date date = new Date((long) zzg(zzdyVar).doubleValue());
                                zzdyVar.zzM(2);
                                return date;
                            }
                            int zzp = zzdyVar.zzp();
                            ArrayList arrayList = new ArrayList(zzp);
                            for (int i2 = 0; i2 < zzp; i2++) {
                                Object zzh = zzh(zzdyVar, zzdyVar.zzm());
                                if (zzh != null) {
                                    arrayList.add(zzh);
                                }
                            }
                            return arrayList;
                        }
                        return zzj(zzdyVar);
                    }
                    HashMap hashMap = new HashMap();
                    while (true) {
                        String zzi = zzi(zzdyVar);
                        int zzm = zzdyVar.zzm();
                        if (zzm == 9) {
                            return hashMap;
                        }
                        Object zzh2 = zzh(zzdyVar, zzm);
                        if (zzh2 != null) {
                            hashMap.put(zzi, zzh2);
                        }
                    }
                } else {
                    return zzi(zzdyVar);
                }
            } else {
                if (zzdyVar.zzm() == 1) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        } else {
            return zzg(zzdyVar);
        }
    }

    private static String zzi(zzdy zzdyVar) {
        int zzq = zzdyVar.zzq();
        int zzd = zzdyVar.zzd();
        zzdyVar.zzM(zzq);
        return new String(zzdyVar.zzN(), zzd, zzq);
    }

    private static HashMap zzj(zzdy zzdyVar) {
        int zzp = zzdyVar.zzp();
        HashMap hashMap = new HashMap(zzp);
        for (int i = 0; i < zzp; i++) {
            String zzi = zzi(zzdyVar);
            Object zzh = zzh(zzdyVar, zzdyVar.zzm());
            if (zzh != null) {
                hashMap.put(zzi, zzh);
            }
        }
        return hashMap;
    }

    @Override // com.google.android.gms.internal.ads.zzaex
    protected final boolean zza(zzdy zzdyVar) {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaex
    protected final boolean zzb(zzdy zzdyVar, long j) {
        if (zzdyVar.zzm() == 2 && "onMetaData".equals(zzi(zzdyVar)) && zzdyVar.zzb() != 0 && zzdyVar.zzm() == 8) {
            HashMap zzj = zzj(zzdyVar);
            Object obj = zzj.get("duration");
            if (obj instanceof Double) {
                double doubleValue = ((Double) obj).doubleValue();
                if (doubleValue > 0.0d) {
                    this.zzb = (long) (doubleValue * 1000000.0d);
                }
            }
            Object obj2 = zzj.get("keyframes");
            if (obj2 instanceof Map) {
                Map map = (Map) obj2;
                Object obj3 = map.get("filepositions");
                Object obj4 = map.get("times");
                if ((obj3 instanceof List) && (obj4 instanceof List)) {
                    List list = (List) obj3;
                    List list2 = (List) obj4;
                    int size = list2.size();
                    this.zzc = new long[size];
                    this.zzd = new long[size];
                    for (int i = 0; i < size; i++) {
                        Object obj5 = list.get(i);
                        Object obj6 = list2.get(i);
                        if ((obj6 instanceof Double) && (obj5 instanceof Double)) {
                            this.zzc[i] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                            this.zzd[i] = ((Double) obj5).longValue();
                        } else {
                            this.zzc = new long[0];
                            this.zzd = new long[0];
                            break;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final long zzc() {
        return this.zzb;
    }

    public final long[] zzd() {
        return this.zzd;
    }

    public final long[] zze() {
        return this.zzc;
    }
}
