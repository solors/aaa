package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzazw {
    private final zzazl zza;
    private final int zzb;
    private final int zzc;

    public zzazw(int i, int i2, int i3) {
        this.zzb = i;
        i2 = (i2 > 64 || i2 < 0) ? 64 : i2;
        if (i3 <= 0) {
            this.zzc = 1;
        } else {
            this.zzc = i3;
        }
        this.zza = new zzazu(i2);
    }

    public final String zza(ArrayList arrayList, ArrayList arrayList2) {
        String str;
        Collections.sort(arrayList2, new zzazv(this));
        HashSet hashSet = new HashSet();
        loop0: for (int i = 0; i < arrayList2.size(); i++) {
            String[] split = Normalizer.normalize((CharSequence) arrayList.get(((zzazk) arrayList2.get(i)).zze()), Normalizer.Form.NFKC).toLowerCase(Locale.US).split("\n");
            if (split.length != 0) {
                for (String str2 : split) {
                    if (str2.contains("'")) {
                        StringBuilder sb2 = new StringBuilder(str2);
                        int i2 = 1;
                        boolean z = false;
                        while (true) {
                            int i3 = i2 + 2;
                            if (i3 > sb2.length()) {
                                break;
                            }
                            if (sb2.charAt(i2) == '\'') {
                                if (sb2.charAt(i2 - 1) != ' ') {
                                    int i4 = i2 + 1;
                                    if ((sb2.charAt(i4) == 's' || sb2.charAt(i4) == 'S') && (i3 == sb2.length() || sb2.charAt(i3) == ' ')) {
                                        sb2.insert(i2, ' ');
                                        i2 = i3;
                                        z = true;
                                    }
                                }
                                sb2.setCharAt(i2, ' ');
                                z = true;
                            }
                            i2++;
                        }
                        if (z) {
                            str = sb2.toString();
                        } else {
                            str = null;
                        }
                        if (str != null) {
                            str2 = str;
                        }
                    }
                    String[] zzb = zzazp.zzb(str2, true);
                    if (zzb.length >= this.zzc) {
                        for (int i5 = 0; i5 < zzb.length; i5++) {
                            String str3 = "";
                            for (int i6 = 0; i6 < this.zzc; i6++) {
                                int i7 = i5 + i6;
                                if (i7 >= zzb.length) {
                                    break;
                                }
                                if (i6 > 0) {
                                    str3 = str3.concat(" ");
                                }
                                str3 = str3.concat(String.valueOf(zzb[i7]));
                            }
                            hashSet.add(str3);
                            if (hashSet.size() >= this.zzb) {
                                break loop0;
                            }
                        }
                        if (hashSet.size() >= this.zzb) {
                            break loop0;
                        }
                    }
                }
                continue;
            }
        }
        zzazn zzaznVar = new zzazn();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            try {
                zzaznVar.zzb.write(this.zza.zzb((String) it.next()));
            } catch (IOException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Error while writing hash to byteStream", e);
            }
        }
        return zzaznVar.toString();
    }
}
