package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzco {
    private static final String zzA;
    private static final String zzB;
    private static final String zzC;
    private static final String zzD;
    private static final String zzE;
    private static final String zzF;
    private static final String zzG;
    private static final String zzp;
    private static final String zzq;
    private static final String zzr;
    private static final String zzs;
    private static final String zzt;
    private static final String zzu;
    private static final String zzv;
    private static final String zzw;
    private static final String zzx;
    private static final String zzy;
    private static final String zzz;
    @Nullable
    public final CharSequence zza;
    @Nullable
    public final Layout.Alignment zzb;
    @Nullable
    public final Layout.Alignment zzc;
    @Nullable
    public final Bitmap zzd;
    public final float zze;
    public final int zzf;
    public final int zzg;
    public final float zzh;
    public final int zzi;
    public final float zzj;
    public final float zzk;
    public final int zzl;
    public final float zzm;
    public final int zzn;
    public final float zzo;

    static {
        zzcm zzcmVar = new zzcm();
        zzcmVar.zzl("");
        zzcmVar.zzp();
        zzp = Integer.toString(0, 36);
        zzq = Integer.toString(17, 36);
        zzr = Integer.toString(1, 36);
        zzs = Integer.toString(2, 36);
        Integer.toString(3, 36);
        zzt = Integer.toString(18, 36);
        zzu = Integer.toString(4, 36);
        zzv = Integer.toString(5, 36);
        zzw = Integer.toString(6, 36);
        zzx = Integer.toString(7, 36);
        zzy = Integer.toString(8, 36);
        zzz = Integer.toString(9, 36);
        zzA = Integer.toString(10, 36);
        zzB = Integer.toString(11, 36);
        zzC = Integer.toString(12, 36);
        zzD = Integer.toString(13, 36);
        zzE = Integer.toString(14, 36);
        zzF = Integer.toString(15, 36);
        zzG = Integer.toString(16, 36);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzco(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z, int i5, int i6, float f6, zzcn zzcnVar) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            zzcw.zzd(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.zza = SpannedString.valueOf(charSequence);
        } else {
            this.zza = charSequence != null ? charSequence.toString() : null;
        }
        this.zzb = alignment;
        this.zzc = alignment2;
        this.zzd = bitmap;
        this.zze = f;
        this.zzf = i;
        this.zzg = i2;
        this.zzh = f2;
        this.zzi = i3;
        this.zzj = f4;
        this.zzk = f5;
        this.zzl = i4;
        this.zzm = f3;
        this.zzn = i6;
        this.zzo = f6;
    }

    public final boolean equals(@Nullable Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj != null && zzco.class == obj.getClass()) {
            zzco zzcoVar = (zzco) obj;
            if (TextUtils.equals(this.zza, zzcoVar.zza) && this.zzb == zzcoVar.zzb && this.zzc == zzcoVar.zzc && ((bitmap = this.zzd) != null ? !((bitmap2 = zzcoVar.zzd) == null || !bitmap.sameAs(bitmap2)) : zzcoVar.zzd == null) && this.zze == zzcoVar.zze && this.zzf == zzcoVar.zzf && this.zzg == zzcoVar.zzg && this.zzh == zzcoVar.zzh && this.zzi == zzcoVar.zzi && this.zzj == zzcoVar.zzj && this.zzk == zzcoVar.zzk && this.zzl == zzcoVar.zzl && this.zzm == zzcoVar.zzm && this.zzn == zzcoVar.zzn && this.zzo == zzcoVar.zzo) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, this.zzc, this.zzd, Float.valueOf(this.zze), Integer.valueOf(this.zzf), Integer.valueOf(this.zzg), Float.valueOf(this.zzh), Integer.valueOf(this.zzi), Float.valueOf(this.zzj), Float.valueOf(this.zzk), Boolean.FALSE, Integer.valueOf((int) ViewCompat.MEASURED_STATE_MASK), Integer.valueOf(this.zzl), Float.valueOf(this.zzm), Integer.valueOf(this.zzn), Float.valueOf(this.zzo)});
    }

    public final Bundle zza() {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.zza;
        if (charSequence != null) {
            bundle.putCharSequence(zzp, charSequence);
            CharSequence charSequence2 = this.zza;
            if (charSequence2 instanceof Spanned) {
                ArrayList<? extends Parcelable> zza = zzcq.zza((Spanned) charSequence2);
                if (!zza.isEmpty()) {
                    bundle.putParcelableArrayList(zzq, zza);
                }
            }
        }
        bundle.putSerializable(zzr, this.zzb);
        bundle.putSerializable(zzs, this.zzc);
        bundle.putFloat(zzu, this.zze);
        bundle.putInt(zzv, this.zzf);
        bundle.putInt(zzw, this.zzg);
        bundle.putFloat(zzx, this.zzh);
        bundle.putInt(zzy, this.zzi);
        bundle.putInt(zzz, this.zzl);
        bundle.putFloat(zzA, this.zzm);
        bundle.putFloat(zzB, this.zzj);
        bundle.putFloat(zzC, this.zzk);
        bundle.putBoolean(zzE, false);
        bundle.putInt(zzD, ViewCompat.MEASURED_STATE_MASK);
        bundle.putInt(zzF, this.zzn);
        bundle.putFloat(zzG, this.zzo);
        if (this.zzd != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            zzcw.zzf(this.zzd.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
            bundle.putByteArray(zzt, byteArrayOutputStream.toByteArray());
        }
        return bundle;
    }

    public final zzcm zzb() {
        return new zzcm(this, null);
    }
}
