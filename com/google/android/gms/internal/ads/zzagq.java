package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzagq extends zzagh {
    public static final Parcelable.Creator<zzagq> CREATOR = new zzagp();
    @Nullable
    public final String zza;
    public final zzfxn zzb;

    public zzagq(String str, @Nullable String str2, List list) {
        super(str);
        zzcw.zzd(!list.isEmpty());
        this.zza = str2;
        zzfxn zzl = zzfxn.zzl(list);
        this.zzb = zzl;
        String str3 = (String) zzl.get(0);
    }

    private static List zzb(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
            } else if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
            } else if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzagq.class == obj.getClass()) {
            zzagq zzagqVar = (zzagq) obj;
            if (Objects.equals(this.zzf, zzagqVar.zzf) && Objects.equals(this.zza, zzagqVar.zza) && this.zzb.equals(zzagqVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.zzf.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        String str = this.zza;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return (((hashCode * 31) + i) * 31) + this.zzb.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final String toString() {
        String valueOf = String.valueOf(this.zzb);
        return this.zzf + ": description=" + this.zza + ": values=" + valueOf;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zzf);
        parcel.writeString(this.zza);
        parcel.writeStringArray((String[]) this.zzb.toArray(new String[0]));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzagh, com.google.android.gms.internal.ads.zzax
    public final void zza(zzat zzatVar) {
        char c;
        Integer num;
        String str = this.zzf;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 2569358:
                if (str.equals("TCON")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 1:
                zzatVar.zzq((CharSequence) this.zzb.get(0));
                return;
            case 2:
            case 3:
                zzatVar.zze((CharSequence) this.zzb.get(0));
                return;
            case 4:
            case 5:
                zzatVar.zzc((CharSequence) this.zzb.get(0));
                return;
            case 6:
            case 7:
                zzatVar.zzd((CharSequence) this.zzb.get(0));
                return;
            case '\b':
            case '\t':
                int i = zzei.zza;
                String[] split = ((String) this.zzb.get(0)).split(RemoteSettings.FORWARD_SLASH_STRING, -1);
                try {
                    int parseInt = Integer.parseInt(split[0]);
                    if (split.length > 1) {
                        num = Integer.valueOf(Integer.parseInt(split[1]));
                    } else {
                        num = null;
                    }
                    zzatVar.zzs(Integer.valueOf(parseInt));
                    zzatVar.zzr(num);
                    return;
                } catch (NumberFormatException unused) {
                    return;
                }
            case '\n':
            case 11:
                try {
                    zzatVar.zzl(Integer.valueOf(Integer.parseInt((String) this.zzb.get(0))));
                    return;
                } catch (NumberFormatException unused2) {
                    return;
                }
            case '\f':
            case '\r':
                try {
                    String str2 = (String) this.zzb.get(0);
                    int parseInt2 = Integer.parseInt(str2.substring(2, 4));
                    int parseInt3 = Integer.parseInt(str2.substring(0, 2));
                    zzatVar.zzk(Integer.valueOf(parseInt2));
                    zzatVar.zzj(Integer.valueOf(parseInt3));
                    return;
                } catch (NumberFormatException | StringIndexOutOfBoundsException unused3) {
                    return;
                }
            case 14:
                List zzb = zzb((String) this.zzb.get(0));
                int size = zzb.size();
                if (size != 1) {
                    if (size != 2) {
                        if (size == 3) {
                            zzatVar.zzj((Integer) zzb.get(2));
                        } else {
                            return;
                        }
                    }
                    zzatVar.zzk((Integer) zzb.get(1));
                }
                zzatVar.zzl((Integer) zzb.get(0));
                return;
            case 15:
                List zzb2 = zzb((String) this.zzb.get(0));
                int size2 = zzb2.size();
                if (size2 != 1) {
                    if (size2 != 2) {
                        if (size2 == 3) {
                            zzatVar.zzm((Integer) zzb2.get(2));
                        } else {
                            return;
                        }
                    }
                    zzatVar.zzn((Integer) zzb2.get(1));
                }
                zzatVar.zzo((Integer) zzb2.get(0));
                return;
            case 16:
            case 17:
                zzatVar.zzf((CharSequence) this.zzb.get(0));
                return;
            case 18:
            case 19:
                zzatVar.zzg((CharSequence) this.zzb.get(0));
                return;
            case 20:
            case 21:
                zzatVar.zzt((CharSequence) this.zzb.get(0));
                return;
            case 22:
                Integer zzf = zzgaq.zzf((String) this.zzb.get(0), 10);
                if (zzf == null) {
                    zzatVar.zzi((CharSequence) this.zzb.get(0));
                    return;
                }
                String zza = zzagi.zza(zzf.intValue());
                if (zza != null) {
                    zzatVar.zzi(zza);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
