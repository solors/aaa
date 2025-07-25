package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes4.dex */
final class zzj implements DynamiteModule.VersionPolicy {
    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy
    public final DynamiteModule.VersionPolicy.SelectionResult selectModule(Context context, String str, DynamiteModule.VersionPolicy.IVersions iVersions) throws DynamiteModule.LoadingException {
        int zzb;
        DynamiteModule.VersionPolicy.SelectionResult selectionResult = new DynamiteModule.VersionPolicy.SelectionResult();
        int zza = iVersions.zza(context, str);
        selectionResult.localVersion = zza;
        int i = 1;
        int i2 = 0;
        if (zza != 0) {
            zzb = iVersions.zzb(context, str, false);
            selectionResult.remoteVersion = zzb;
        } else {
            zzb = iVersions.zzb(context, str, true);
            selectionResult.remoteVersion = zzb;
        }
        int i3 = selectionResult.localVersion;
        if (i3 == 0) {
            if (zzb == 0) {
                i = 0;
                selectionResult.selection = i;
                return selectionResult;
            }
        } else {
            i2 = i3;
        }
        if (i2 >= zzb) {
            i = -1;
        }
        selectionResult.selection = i;
        return selectionResult;
    }
}
