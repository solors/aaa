package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzin;
import java.util.EnumMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.2 */
/* loaded from: classes5.dex */
public final class zzav {
    private static final zzav zza = new zzav(null, 100);
    private final int zzb;
    private final String zzc;
    private final Boolean zzd;
    private final String zze;
    private final EnumMap<zzin.zza, zzim> zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzav(Boolean bool, int i) {
        this(bool, i, (Boolean) null, (String) null);
    }

    private final String zzh() {
        zzin.zza[] zza2;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.zzb);
        for (zzin.zza zzaVar : zzio.DMA.zza()) {
            sb2.append(":");
            sb2.append(zzin.zza(this.zzf.get(zzaVar)));
        }
        return sb2.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzav)) {
            return false;
        }
        zzav zzavVar = (zzav) obj;
        if (!this.zzc.equalsIgnoreCase(zzavVar.zzc) || !Objects.equals(this.zzd, zzavVar.zzd)) {
            return false;
        }
        return Objects.equals(this.zze, zzavVar.zze);
    }

    public final int hashCode() {
        int i;
        int hashCode;
        Boolean bool = this.zzd;
        if (bool == null) {
            i = 3;
        } else if (bool == Boolean.TRUE) {
            i = 7;
        } else {
            i = 13;
        }
        String str = this.zze;
        if (str == null) {
            hashCode = 17;
        } else {
            hashCode = str.hashCode();
        }
        return this.zzc.hashCode() + (i * 29) + (hashCode * 137);
    }

    public final String toString() {
        zzin.zza[] zza2;
        StringBuilder sb2 = new StringBuilder("source=");
        sb2.append(zzin.zza(this.zzb));
        for (zzin.zza zzaVar : zzio.DMA.zza()) {
            sb2.append(",");
            sb2.append(zzaVar.zze);
            sb2.append("=");
            zzim zzimVar = this.zzf.get(zzaVar);
            if (zzimVar == null) {
                sb2.append("uninitialized");
            } else {
                int i = zzay.zza[zzimVar.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                sb2.append("granted");
                            }
                        } else {
                            sb2.append("denied");
                        }
                    } else {
                        sb2.append("eu_consent_policy");
                    }
                } else {
                    sb2.append("uninitialized");
                }
            }
        }
        if (this.zzd != null) {
            sb2.append(",isDmaRegion=");
            sb2.append(this.zzd);
        }
        if (this.zze != null) {
            sb2.append(",cpsDisplayStr=");
            sb2.append(this.zze);
        }
        return sb2.toString();
    }

    public final int zza() {
        return this.zzb;
    }

    public final Bundle zzb() {
        Bundle bundle = new Bundle();
        for (Map.Entry<zzin.zza, zzim> entry : this.zzf.entrySet()) {
            String zzb = zzin.zzb(entry.getValue());
            if (zzb != null) {
                bundle.putString(entry.getKey().zze, zzb);
            }
        }
        Boolean bool = this.zzd;
        if (bool != null) {
            bundle.putString("is_dma_region", bool.toString());
        }
        String str = this.zze;
        if (str != null) {
            bundle.putString("cps_display_str", str);
        }
        return bundle;
    }

    public final zzim zzc() {
        zzim zzimVar = this.zzf.get(zzin.zza.AD_USER_DATA);
        if (zzimVar == null) {
            return zzim.UNINITIALIZED;
        }
        return zzimVar;
    }

    public final Boolean zzd() {
        return this.zzd;
    }

    public final String zze() {
        return this.zze;
    }

    public final String zzf() {
        return this.zzc;
    }

    public final boolean zzg() {
        for (zzim zzimVar : this.zzf.values()) {
            if (zzimVar != zzim.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzav(Boolean bool, int i, Boolean bool2, String str) {
        EnumMap<zzin.zza, zzim> enumMap = new EnumMap<>(zzin.zza.class);
        this.zzf = enumMap;
        enumMap.put((EnumMap<zzin.zza, zzim>) zzin.zza.AD_USER_DATA, (zzin.zza) zzin.zza(bool));
        this.zzb = i;
        this.zzc = zzh();
        this.zzd = bool2;
        this.zze = str;
    }

    public static zzav zza(Bundle bundle, int i) {
        zzin.zza[] zza2;
        if (bundle == null) {
            return new zzav(null, i);
        }
        EnumMap enumMap = new EnumMap(zzin.zza.class);
        for (zzin.zza zzaVar : zzio.DMA.zza()) {
            enumMap.put((EnumMap) zzaVar, (zzin.zza) zzin.zza(bundle.getString(zzaVar.zze)));
        }
        return new zzav(enumMap, i, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    private zzav(EnumMap<zzin.zza, zzim> enumMap, int i, Boolean bool, String str) {
        EnumMap<zzin.zza, zzim> enumMap2 = new EnumMap<>(zzin.zza.class);
        this.zzf = enumMap2;
        enumMap2.putAll(enumMap);
        this.zzb = i;
        this.zzc = zzh();
        this.zzd = bool;
        this.zze = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzav zza(zzim zzimVar, int i) {
        EnumMap enumMap = new EnumMap(zzin.zza.class);
        enumMap.put((EnumMap) zzin.zza.AD_USER_DATA, (zzin.zza) zzimVar);
        return new zzav(enumMap, -10, (Boolean) null, (String) null);
    }

    public static zzav zza(String str) {
        if (str != null && str.length() > 0) {
            String[] split = str.split(":");
            int parseInt = Integer.parseInt(split[0]);
            EnumMap enumMap = new EnumMap(zzin.zza.class);
            zzin.zza[] zza2 = zzio.DMA.zza();
            int length = zza2.length;
            int i = 1;
            int i2 = 0;
            while (i2 < length) {
                enumMap.put((EnumMap) zza2[i2], (zzin.zza) zzin.zza(split[i].charAt(0)));
                i2++;
                i++;
            }
            return new zzav(enumMap, parseInt, (Boolean) null, (String) null);
        }
        return zza;
    }

    public static Boolean zza(Bundle bundle) {
        zzim zza2;
        if (bundle == null || (zza2 = zzin.zza(bundle.getString("ad_personalization"))) == null) {
            return null;
        }
        int i = zzay.zza[zza2.ordinal()];
        if (i != 3) {
            if (i != 4) {
                return null;
            }
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
