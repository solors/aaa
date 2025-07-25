package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@22.0.2 */
/* loaded from: classes5.dex */
public final class zzg {
    public static double zza(double d) {
        int i;
        if (Double.isNaN(d)) {
            return 0.0d;
        }
        if (Double.isInfinite(d) || d == 0.0d || d == -0.0d) {
            return d;
        }
        return (i > 0 ? 1 : -1) * Math.floor(Math.abs(d));
    }

    public static int zzb(double d) {
        int i;
        if (Double.isNaN(d) || Double.isInfinite(d) || d == 0.0d) {
            return 0;
        }
        return (int) (((i > 0 ? 1 : -1) * Math.floor(Math.abs(d))) % 4.294967296E9d);
    }

    public static long zzc(double d) {
        return zzb(d) & 4294967295L;
    }

    public static void zzc(String str, int i, List<zzaq> list) {
        if (list.size() > i) {
            throw new IllegalArgumentException(String.format("%s operation requires at most %s parameters found %s", str, Integer.valueOf(i), Integer.valueOf(list.size())));
        }
    }

    public static void zzb(zzbv zzbvVar, int i, List<zzaq> list) {
        zzb(zzbvVar.name(), i, list);
    }

    public static int zza(zzh zzhVar) {
        int zzb = zzb(zzhVar.zza("runtime.counter").zze().doubleValue() + 1.0d);
        if (zzb <= 1000000) {
            zzhVar.zzc("runtime.counter", new zzai(Double.valueOf(zzb)));
            return zzb;
        }
        throw new IllegalStateException("Instructions allowed exceeded");
    }

    public static void zzb(String str, int i, List<zzaq> list) {
        if (list.size() < i) {
            throw new IllegalArgumentException(String.format("%s operation requires at least %s parameters found %s", str, Integer.valueOf(i), Integer.valueOf(list.size())));
        }
    }

    public static zzbv zza(String str) {
        zzbv zza = (str == null || str.isEmpty()) ? null : zzbv.zza(Integer.parseInt(str));
        if (zza != null) {
            return zza;
        }
        throw new IllegalArgumentException(String.format("Unsupported commandId %s", str));
    }

    public static boolean zzb(zzaq zzaqVar) {
        if (zzaqVar == null) {
            return false;
        }
        Double zze = zzaqVar.zze();
        return !zze.isNaN() && zze.doubleValue() >= 0.0d && zze.equals(Double.valueOf(Math.floor(zze.doubleValue())));
    }

    public static Object zza(zzaq zzaqVar) {
        if (zzaq.zzd.equals(zzaqVar)) {
            return null;
        }
        if (zzaq.zzc.equals(zzaqVar)) {
            return "";
        }
        if (zzaqVar instanceof zzap) {
            return zza((zzap) zzaqVar);
        }
        if (zzaqVar instanceof zzaf) {
            ArrayList arrayList = new ArrayList();
            Iterator<zzaq> it = ((zzaf) zzaqVar).iterator();
            while (it.hasNext()) {
                Object zza = zza(it.next());
                if (zza != null) {
                    arrayList.add(zza);
                }
            }
            return arrayList;
        } else if (!zzaqVar.zze().isNaN()) {
            return zzaqVar.zze();
        } else {
            return zzaqVar.zzf();
        }
    }

    public static Map<String, Object> zza(zzap zzapVar) {
        HashMap hashMap = new HashMap();
        for (String str : zzapVar.zza()) {
            Object zza = zza(zzapVar.zza(str));
            if (zza != null) {
                hashMap.put(str, zza);
            }
        }
        return hashMap;
    }

    public static void zza(zzbv zzbvVar, int i, List<zzaq> list) {
        zza(zzbvVar.name(), i, list);
    }

    public static void zza(String str, int i, List<zzaq> list) {
        if (list.size() != i) {
            throw new IllegalArgumentException(String.format("%s operation requires %s parameters found %s", str, Integer.valueOf(i), Integer.valueOf(list.size())));
        }
    }

    public static boolean zza(zzaq zzaqVar, zzaq zzaqVar2) {
        if (zzaqVar.getClass().equals(zzaqVar2.getClass())) {
            if ((zzaqVar instanceof zzax) || (zzaqVar instanceof zzao)) {
                return true;
            }
            if (zzaqVar instanceof zzai) {
                if (Double.isNaN(zzaqVar.zze().doubleValue()) || Double.isNaN(zzaqVar2.zze().doubleValue())) {
                    return false;
                }
                return zzaqVar.zze().equals(zzaqVar2.zze());
            } else if (zzaqVar instanceof zzas) {
                return zzaqVar.zzf().equals(zzaqVar2.zzf());
            } else {
                if (zzaqVar instanceof zzag) {
                    return zzaqVar.zzd().equals(zzaqVar2.zzd());
                }
                return zzaqVar == zzaqVar2;
            }
        }
        return false;
    }
}
