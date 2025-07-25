package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.2 */
@MainThread
@VisibleForTesting
/* loaded from: classes5.dex */
public final class zzki implements Application.ActivityLifecycleCallbacks {
    private final /* synthetic */ zziv zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzki(zziv zzivVar) {
        this.zza = zzivVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ad A[Catch: RuntimeException -> 0x0198, TRY_ENTER, TryCatch #0 {RuntimeException -> 0x0198, blocks: (B:3:0x000b, B:5:0x0019, B:9:0x002a, B:38:0x00ad, B:40:0x00b9, B:44:0x00ce, B:46:0x00d4, B:49:0x00e1, B:51:0x00e7, B:52:0x00fa, B:53:0x0106, B:56:0x010d, B:60:0x0130, B:62:0x014c, B:61:0x013d, B:64:0x0153, B:66:0x0159, B:68:0x015f, B:70:0x0165, B:72:0x016b, B:74:0x0173, B:78:0x017e, B:80:0x018c, B:82:0x0192, B:13:0x003e, B:16:0x0046, B:18:0x004e, B:20:0x0054, B:22:0x005a, B:24:0x0060, B:26:0x0068, B:28:0x0070, B:30:0x0078, B:32:0x0080, B:33:0x008c, B:35:0x00a4), top: B:87:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010d A[Catch: RuntimeException -> 0x0198, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x0198, blocks: (B:3:0x000b, B:5:0x0019, B:9:0x002a, B:38:0x00ad, B:40:0x00b9, B:44:0x00ce, B:46:0x00d4, B:49:0x00e1, B:51:0x00e7, B:52:0x00fa, B:53:0x0106, B:56:0x010d, B:60:0x0130, B:62:0x014c, B:61:0x013d, B:64:0x0153, B:66:0x0159, B:68:0x015f, B:70:0x0165, B:72:0x016b, B:74:0x0173, B:78:0x017e, B:80:0x018c, B:82:0x0192, B:13:0x003e, B:16:0x0046, B:18:0x004e, B:20:0x0054, B:22:0x005a, B:24:0x0060, B:26:0x0068, B:28:0x0070, B:30:0x0078, B:32:0x0080, B:33:0x008c, B:35:0x00a4), top: B:87:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void zza(com.google.android.gms.measurement.internal.zzki r17, boolean r18, android.net.Uri r19, java.lang.String r20, java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzki.zza(com.google.android.gms.measurement.internal.zzki, boolean, android.net.Uri, java.lang.String, java.lang.String):void");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        String str;
        boolean z;
        try {
            this.zza.zzj().zzp().zza("onActivityCreated");
            Intent intent = activity.getIntent();
            if (intent == null) {
                return;
            }
            Uri data = intent.getData();
            if (data == null || !data.isHierarchical()) {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    String string = extras.getString("com.android.vending.referral_url");
                    if (!TextUtils.isEmpty(string)) {
                        data = Uri.parse(string);
                    }
                }
                data = null;
            }
            Uri uri = data;
            if (uri != null && uri.isHierarchical()) {
                this.zza.zzq();
                if (zznp.zza(intent)) {
                    str = "gs";
                } else {
                    str = "auto";
                }
                String str2 = str;
                String queryParameter = uri.getQueryParameter("referrer");
                if (bundle == null) {
                    z = true;
                } else {
                    z = false;
                }
                this.zza.zzl().zzb(new zzkh(this, z, uri, str2, queryParameter));
            }
        } catch (RuntimeException e) {
            this.zza.zzj().zzg().zza("Throwable caught in onActivityCreated", e);
        } finally {
            this.zza.zzn().zza(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.zza.zzn().zza(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @MainThread
    public final void onActivityPaused(Activity activity) {
        this.zza.zzn().zzb(activity);
        zzmh zzp = this.zza.zzp();
        zzp.zzl().zzb(new zzmj(zzp, zzp.zzb().elapsedRealtime()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @MainThread
    public final void onActivityResumed(Activity activity) {
        zzmh zzp = this.zza.zzp();
        zzp.zzl().zzb(new zzmk(zzp, zzp.zzb().elapsedRealtime()));
        this.zza.zzn().zzc(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.zza.zzn().zzb(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
