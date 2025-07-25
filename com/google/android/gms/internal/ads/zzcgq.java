package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzcgq extends MutableContextWrapper {
    @Nullable
    private Activity zza;
    private Context zzb;
    private Context zzc;

    public zzcgq(Context context) {
        super(context);
        setBaseContext(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        return this.zzc.getSystemService(str);
    }

    @Override // android.content.MutableContextWrapper
    public final void setBaseContext(Context context) {
        Activity activity;
        Context applicationContext = context.getApplicationContext();
        this.zzb = applicationContext;
        if (context instanceof Activity) {
            activity = (Activity) context;
        } else {
            activity = null;
        }
        this.zza = activity;
        this.zzc = context;
        super.setBaseContext(applicationContext);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        Activity activity = this.zza;
        if (activity != null) {
            activity.startActivity(intent);
            return;
        }
        intent.setFlags(268435456);
        this.zzb.startActivity(intent);
    }

    @Nullable
    public final Activity zza() {
        return this.zza;
    }

    public final Context zzb() {
        return this.zzc;
    }

    public final void zzc(Intent intent, int i) {
        if (this.zza != null) {
            String valueOf = String.valueOf(intent.getData());
            com.google.android.gms.ads.internal.util.zze.zza("Starting activity for result with intent: " + valueOf + " and requestCode: 236");
            this.zza.startActivityForResult(intent, 236);
            return;
        }
        intent.setFlags(268435456);
        this.zzb.startActivity(intent);
    }
}
