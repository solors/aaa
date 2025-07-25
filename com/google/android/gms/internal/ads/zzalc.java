package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Base64;
import android.util.Pair;
import androidx.annotation.Nullable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzalc {
    @Nullable
    public final String zza;
    @Nullable
    public final String zzb;
    public final boolean zzc;
    public final long zzd;
    public final long zze;
    @Nullable
    public final zzali zzf;
    public final String zzg;
    @Nullable
    public final String zzh;
    @Nullable
    public final zzalc zzi;
    @Nullable
    private final String[] zzj;
    private final HashMap zzk;
    private final HashMap zzl;
    private List zzm;

    private zzalc(@Nullable String str, @Nullable String str2, long j, long j2, @Nullable zzali zzaliVar, @Nullable String[] strArr, String str3, @Nullable String str4, @Nullable zzalc zzalcVar) {
        boolean z;
        this.zza = str;
        this.zzb = str2;
        this.zzh = str4;
        this.zzf = zzaliVar;
        this.zzj = strArr;
        if (str2 != null) {
            z = true;
        } else {
            z = false;
        }
        this.zzc = z;
        this.zzd = j;
        this.zze = j2;
        str3.getClass();
        this.zzg = str3;
        this.zzi = zzalcVar;
        this.zzk = new HashMap();
        this.zzl = new HashMap();
    }

    public static zzalc zzb(@Nullable String str, long j, long j2, @Nullable zzali zzaliVar, @Nullable String[] strArr, String str2, @Nullable String str3, @Nullable zzalc zzalcVar) {
        return new zzalc(str, null, j, j2, zzaliVar, strArr, str2, str3, zzalcVar);
    }

    public static zzalc zzc(String str) {
        return new zzalc(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    private static SpannableStringBuilder zzi(String str, Map map) {
        if (!map.containsKey(str)) {
            zzcm zzcmVar = new zzcm();
            zzcmVar.zzl(new SpannableStringBuilder());
            map.put(str, zzcmVar);
        }
        CharSequence zzq = ((zzcm) map.get(str)).zzq();
        zzq.getClass();
        return (SpannableStringBuilder) zzq;
    }

    private final void zzj(TreeSet treeSet, boolean z) {
        String str = this.zza;
        boolean equals = "p".equals(str);
        boolean equals2 = "div".equals(str);
        if (z || equals || (equals2 && this.zzh != null)) {
            long j = this.zzd;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.zze;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.zzm != null) {
            for (int i = 0; i < this.zzm.size(); i++) {
                zzalc zzalcVar = (zzalc) this.zzm.get(i);
                boolean z2 = true;
                if (!z && !equals) {
                    z2 = false;
                }
                zzalcVar.zzj(treeSet, z2);
            }
        }
    }

    private final void zzk(long j, String str, List list) {
        String str2;
        if (!"".equals(this.zzg)) {
            str = this.zzg;
        }
        if (zzg(j) && "div".equals(this.zza) && (str2 = this.zzh) != null) {
            list.add(new Pair(str, str2));
            return;
        }
        for (int i = 0; i < zza(); i++) {
            zzd(i).zzk(j, str, list);
        }
    }

    private final void zzl(long j, Map map, Map map2, String str, Map map3) {
        Iterator it;
        zzalc zzalcVar;
        zzali zza;
        int i;
        if (zzg(j)) {
            String str2 = !"".equals(this.zzg) ? this.zzg : str;
            Iterator it2 = this.zzl.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                String str3 = (String) entry.getKey();
                int intValue = this.zzk.containsKey(str3) ? ((Integer) this.zzk.get(str3)).intValue() : 0;
                int intValue2 = ((Integer) entry.getValue()).intValue();
                if (intValue != intValue2) {
                    zzcm zzcmVar = (zzcm) map3.get(str3);
                    zzcmVar.getClass();
                    zzalg zzalgVar = (zzalg) map2.get(str2);
                    zzalgVar.getClass();
                    int i2 = zzalgVar.zzj;
                    zzali zza2 = zzalh.zza(this.zzf, this.zzj, map);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) zzcmVar.zzq();
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        zzcmVar.zzl(spannableStringBuilder);
                    }
                    if (zza2 != null) {
                        zzalc zzalcVar2 = this.zzi;
                        if (zza2.zzh() != -1) {
                            spannableStringBuilder.setSpan(new StyleSpan(zza2.zzh()), intValue, intValue2, 33);
                        }
                        if (zza2.zzI()) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), intValue, intValue2, 33);
                        }
                        if (zza2.zzJ()) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), intValue, intValue2, 33);
                        }
                        if (zza2.zzH()) {
                            zzct.zzb(spannableStringBuilder, new ForegroundColorSpan(zza2.zzd()), intValue, intValue2, 33);
                        }
                        if (zza2.zzG()) {
                            zzct.zzb(spannableStringBuilder, new BackgroundColorSpan(zza2.zzc()), intValue, intValue2, 33);
                        }
                        if (zza2.zzD() != null) {
                            zzct.zzb(spannableStringBuilder, new TypefaceSpan(zza2.zzD()), intValue, intValue2, 33);
                        }
                        if (zza2.zzk() != null) {
                            zzalb zzk = zza2.zzk();
                            zzk.getClass();
                            int i3 = zzk.zza;
                            it = it2;
                            if (i3 == -1) {
                                i3 = (i2 == 2 || i2 == 1) ? 3 : 1;
                                i = 1;
                            } else {
                                i = zzk.zzb;
                            }
                            int i4 = zzk.zzc;
                            if (i4 == -2) {
                                i4 = 1;
                            }
                            zzct.zzb(spannableStringBuilder, new zzcu(i3, i, i4), intValue, intValue2, 33);
                        } else {
                            it = it2;
                        }
                        int zzg = zza2.zzg();
                        if (zzg == 2) {
                            while (true) {
                                if (zzalcVar2 == null) {
                                    zzalcVar2 = null;
                                    break;
                                }
                                zzali zza3 = zzalh.zza(zzalcVar2.zzf, zzalcVar2.zzj, map);
                                if (zza3 != null && zza3.zzg() == 1) {
                                    break;
                                }
                                zzalcVar2 = zzalcVar2.zzi;
                            }
                            if (zzalcVar2 != null) {
                                ArrayDeque arrayDeque = new ArrayDeque();
                                arrayDeque.push(zzalcVar2);
                                while (true) {
                                    if (arrayDeque.isEmpty()) {
                                        zzalcVar = null;
                                        break;
                                    }
                                    zzalc zzalcVar3 = (zzalc) arrayDeque.pop();
                                    zzali zza4 = zzalh.zza(zzalcVar3.zzf, zzalcVar3.zzj, map);
                                    if (zza4 != null && zza4.zzg() == 3) {
                                        zzalcVar = zzalcVar3;
                                        break;
                                    }
                                    for (int zza5 = zzalcVar3.zza() - 1; zza5 >= 0; zza5--) {
                                        arrayDeque.push(zzalcVar3.zzd(zza5));
                                    }
                                }
                                if (zzalcVar != null) {
                                    if (zzalcVar.zza() == 1 && zzalcVar.zzd(0).zzb != null) {
                                        String str4 = zzalcVar.zzd(0).zzb;
                                        int i5 = zzei.zza;
                                        zzali zza6 = zzalh.zza(zzalcVar.zzf, zzalcVar.zzj, map);
                                        int zzf = zza6 != null ? zza6.zzf() : -1;
                                        if (zzf == -1 && (zza = zzalh.zza(zzalcVar2.zzf, zzalcVar2.zzj, map)) != null) {
                                            zzf = zza.zzf();
                                        }
                                        spannableStringBuilder.setSpan(new zzcs(str4, zzf), intValue, intValue2, 33);
                                    } else {
                                        zzdo.zze("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                                    }
                                }
                            }
                        } else if (zzg == 3 || zzg == 4) {
                            spannableStringBuilder.setSpan(new zzala(), intValue, intValue2, 33);
                        }
                        if (zza2.zzF()) {
                            zzct.zzb(spannableStringBuilder, new zzcr(), intValue, intValue2, 33);
                        }
                        int zze = zza2.zze();
                        if (zze == 1) {
                            zzct.zzb(spannableStringBuilder, new AbsoluteSizeSpan((int) zza2.zza(), true), intValue, intValue2, 33);
                        } else if (zze == 2) {
                            zzct.zzb(spannableStringBuilder, new RelativeSizeSpan(zza2.zza()), intValue, intValue2, 33);
                        } else if (zze == 3) {
                            zzct.zza(spannableStringBuilder, zza2.zza() / 100.0f, intValue, intValue2, 33);
                        }
                        if ("p".equals(this.zza)) {
                            if (zza2.zzb() != Float.MAX_VALUE) {
                                zzcmVar.zzj((zza2.zzb() * (-90.0f)) / 100.0f);
                            }
                            if (zza2.zzj() != null) {
                                zzcmVar.zzm(zza2.zzj());
                            }
                            if (zza2.zzi() != null) {
                                zzcmVar.zzg(zza2.zzi());
                            }
                        }
                        it2 = it;
                    }
                }
            }
            for (int i6 = 0; i6 < zza(); i6++) {
                zzd(i6).zzl(j, map, map2, str2, map3);
            }
        }
    }

    private final void zzm(long j, boolean z, String str, Map map) {
        boolean z2;
        this.zzk.clear();
        this.zzl.clear();
        if (!"metadata".equals(this.zza)) {
            if (!"".equals(this.zzg)) {
                str = this.zzg;
            }
            if (this.zzc && z) {
                SpannableStringBuilder zzi = zzi(str, map);
                String str2 = this.zzb;
                str2.getClass();
                zzi.append((CharSequence) str2);
            } else if ("br".equals(this.zza) && z) {
                zzi(str, map).append('\n');
            } else if (zzg(j)) {
                for (Map.Entry entry : map.entrySet()) {
                    CharSequence zzq = ((zzcm) entry.getValue()).zzq();
                    zzq.getClass();
                    this.zzk.put((String) entry.getKey(), Integer.valueOf(zzq.length()));
                }
                boolean equals = "p".equals(this.zza);
                for (int i = 0; i < zza(); i++) {
                    zzalc zzd = zzd(i);
                    if (!z && !equals) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    zzd.zzm(j, z2, str, map);
                }
                if (equals) {
                    SpannableStringBuilder zzi2 = zzi(str, map);
                    int length = zzi2.length();
                    do {
                        length--;
                        if (length < 0) {
                            break;
                        }
                    } while (zzi2.charAt(length) == ' ');
                    if (length >= 0 && zzi2.charAt(length) != '\n') {
                        zzi2.append('\n');
                    }
                }
                for (Map.Entry entry2 : map.entrySet()) {
                    CharSequence zzq2 = ((zzcm) entry2.getValue()).zzq();
                    zzq2.getClass();
                    this.zzl.put((String) entry2.getKey(), Integer.valueOf(zzq2.length()));
                }
            }
        }
    }

    public final int zza() {
        List list = this.zzm;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final zzalc zzd(int i) {
        List list = this.zzm;
        if (list != null) {
            return (zzalc) list.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    public final List zze(long j, Map map, Map map2, Map map3) {
        zzala[] zzalaVarArr;
        List arrayList = new ArrayList();
        zzk(j, this.zzg, arrayList);
        TreeMap treeMap = new TreeMap();
        zzm(j, false, this.zzg, treeMap);
        zzl(j, map, map2, this.zzg, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Pair pair = (Pair) arrayList.get(i);
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                zzalg zzalgVar = (zzalg) map2.get(pair.first);
                zzalgVar.getClass();
                zzcm zzcmVar = new zzcm();
                zzcmVar.zzc(decodeByteArray);
                zzcmVar.zzh(zzalgVar.zzb);
                zzcmVar.zzi(0);
                zzcmVar.zze(zzalgVar.zzc, 0);
                zzcmVar.zzf(zzalgVar.zze);
                zzcmVar.zzk(zzalgVar.zzf);
                zzcmVar.zzd(zzalgVar.zzg);
                zzcmVar.zzo(zzalgVar.zzj);
                arrayList2.add(zzcmVar.zzp());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            zzalg zzalgVar2 = (zzalg) map2.get(entry.getKey());
            zzalgVar2.getClass();
            zzcm zzcmVar2 = (zzcm) entry.getValue();
            CharSequence zzq = zzcmVar2.zzq();
            zzq.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) zzq;
            for (zzala zzalaVar : (zzala[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), zzala.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(zzalaVar), spannableStringBuilder.getSpanEnd(zzalaVar), (CharSequence) "");
            }
            int i2 = 0;
            while (i2 < spannableStringBuilder.length()) {
                int i3 = i2 + 1;
                if (spannableStringBuilder.charAt(i2) == ' ') {
                    int i4 = i3;
                    while (i4 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i4) == ' ') {
                        i4++;
                    }
                    int i5 = i4 - i3;
                    if (i5 > 0) {
                        spannableStringBuilder.delete(i2, i5 + i2);
                    }
                }
                i2 = i3;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            int i6 = 0;
            while (i6 < spannableStringBuilder.length() - 1) {
                int i7 = i6 + 1;
                if (spannableStringBuilder.charAt(i6) == '\n' && spannableStringBuilder.charAt(i7) == ' ') {
                    spannableStringBuilder.delete(i7, i6 + 2);
                }
                i6 = i7;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            int i8 = 0;
            while (i8 < spannableStringBuilder.length() - 1) {
                int i9 = i8 + 1;
                if (spannableStringBuilder.charAt(i8) == ' ' && spannableStringBuilder.charAt(i9) == '\n') {
                    spannableStringBuilder.delete(i8, i9);
                }
                i8 = i9;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            zzcmVar2.zze(zzalgVar2.zzc, zzalgVar2.zzd);
            zzcmVar2.zzf(zzalgVar2.zze);
            zzcmVar2.zzh(zzalgVar2.zzb);
            zzcmVar2.zzk(zzalgVar2.zzf);
            zzcmVar2.zzn(zzalgVar2.zzi, zzalgVar2.zzh);
            zzcmVar2.zzo(zzalgVar2.zzj);
            arrayList2.add(zzcmVar2.zzp());
        }
        return arrayList2;
    }

    public final void zzf(zzalc zzalcVar) {
        if (this.zzm == null) {
            this.zzm = new ArrayList();
        }
        this.zzm.add(zzalcVar);
    }

    public final boolean zzg(long j) {
        long j2 = this.zzd;
        if (j2 == -9223372036854775807L) {
            if (this.zze == -9223372036854775807L) {
                return true;
            }
            j2 = -9223372036854775807L;
        }
        int i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
        if (i <= 0 && this.zze == -9223372036854775807L) {
            return true;
        }
        if (j2 == -9223372036854775807L && j < this.zze) {
            return true;
        }
        if (i <= 0 && j < this.zze) {
            return true;
        }
        return false;
    }

    public final long[] zzh() {
        TreeSet treeSet = new TreeSet();
        int i = 0;
        zzj(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        return jArr;
    }
}
