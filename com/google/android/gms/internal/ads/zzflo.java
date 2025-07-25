package com.google.android.gms.internal.ads;

import android.view.View;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzflo {
    private static final Pattern zza = Pattern.compile("^[a-zA-Z0-9 ]+$");
    private final List zzb = new ArrayList();

    public final List zza() {
        return this.zzb;
    }

    public final void zzb(View view, zzfkw zzfkwVar, @Nullable String str) {
        zzfln zzflnVar;
        if (view != null) {
            if (zza.matcher("Ad overlay").matches()) {
                Iterator it = this.zzb.iterator();
                while (true) {
                    if (it.hasNext()) {
                        zzflnVar = (zzfln) it.next();
                        if (zzflnVar.zzb().get() == view) {
                            break;
                        }
                    } else {
                        zzflnVar = null;
                        break;
                    }
                }
                if (zzflnVar == null) {
                    this.zzb.add(new zzfln(view, zzfkwVar, "Ad overlay"));
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
        }
        throw new IllegalArgumentException("FriendlyObstruction is null");
    }

    public final void zzc() {
        this.zzb.clear();
    }
}
