package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzeuc implements zzetr {
    private final zzgcs zza;
    private final Context zzb;

    public zzeuc(zzgcs zzgcsVar, Context context) {
        this.zza = zzgcsVar;
        this.zzb = context;
    }

    @Nullable
    private static ResolveInfo zzd(PackageManager packageManager, String str) {
        return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 38;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final ListenableFuture zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeub
            {
                zzeuc.this = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeuc.this.zzc();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't wrap try/catch for region: R(23:1|(2:4|2)|5|6|(3:63|64|(19:66|67|9|10|11|(13:13|14|(1:16)(2:46|(3:49|(3:52|(2:55|56)(1:54)|50)|57))|17|18|(2:20|(7:22|23|(5:25|26|27|(1:31)|42)(1:44)|(1:33)(1:40)|(1:35)(1:39)|36|37))|45|23|(0)(0)|(0)(0)|(0)(0)|36|37)|59|14|(0)(0)|17|18|(0)|45|23|(0)(0)|(0)(0)|(0)(0)|36|37))|8|9|10|11|(0)|59|14|(0)(0)|17|18|(0)|45|23|(0)(0)|(0)(0)|(0)(0)|36|37) */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009b A[Catch: Exception -> 0x00b2, TRY_LEAVE, TryCatch #2 {Exception -> 0x00b2, blocks: (B:17:0x008f, B:19:0x009b), top: B:68:0x008f }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0180  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ com.google.android.gms.internal.ads.zzeua zzc() throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 408
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeuc.zzc():com.google.android.gms.internal.ads.zzeua");
    }
}
