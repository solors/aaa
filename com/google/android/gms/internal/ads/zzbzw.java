package com.google.android.gms.internal.ads;

import androidx.webkit.Profile;
import com.facebook.appevents.AppEventsConstants;
import com.google.android.gms.common.util.ClientLibraryUtils;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzbzw {
    public static final zzgcs zza;
    public static final zzgcs zzb;
    public static final zzgcs zzc;
    public static final ScheduledExecutorService zzd;
    public static final zzgct zze;
    public static final zzgcs zzf;
    public static final zzgcs zzg;

    static {
        Executor threadPoolExecutor;
        ThreadPoolExecutor threadPoolExecutor2;
        ThreadPoolExecutor threadPoolExecutor3;
        if (ClientLibraryUtils.isPackageSide()) {
            zzfqv.zza();
            threadPoolExecutor = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new zzbzs(Profile.DEFAULT_PROFILE_NAME)));
        } else {
            zzbcc zzbccVar = zzbcl.zzlf;
            if (com.google.android.gms.ads.internal.client.zzbe.zzc().zzb(zzbccVar) != null && ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zzb(zzbccVar)).booleanValue()) {
                zzbcc zzbccVar2 = zzbcl.zzlg;
                if (com.google.android.gms.ads.internal.client.zzbe.zzc().zzb(zzbccVar2) != null) {
                    zzbcc zzbccVar3 = zzbcl.zzlh;
                    if (com.google.android.gms.ads.internal.client.zzbe.zzc().zzb(zzbccVar3) != null) {
                        ThreadPoolExecutor threadPoolExecutor4 = new ThreadPoolExecutor(((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zzb(zzbccVar2)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zzb(zzbccVar2)).intValue(), 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzbzs(Profile.DEFAULT_PROFILE_NAME));
                        threadPoolExecutor4.allowCoreThreadTimeOut(((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zzb(zzbccVar3)).booleanValue());
                        threadPoolExecutor = threadPoolExecutor4;
                    }
                }
            }
            threadPoolExecutor = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new zzbzs(Profile.DEFAULT_PROFILE_NAME));
        }
        zza = new zzbzu(threadPoolExecutor, null);
        if (ClientLibraryUtils.isPackageSide()) {
            threadPoolExecutor2 = zzfqv.zza().zzc(5, new zzbzs("Loader"), 1);
        } else {
            ThreadPoolExecutor threadPoolExecutor5 = new ThreadPoolExecutor(5, 5, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzbzs("Loader"));
            threadPoolExecutor5.allowCoreThreadTimeOut(true);
            threadPoolExecutor2 = threadPoolExecutor5;
        }
        zzb = new zzbzu(threadPoolExecutor2, null);
        if (ClientLibraryUtils.isPackageSide()) {
            threadPoolExecutor3 = zzfqv.zza().zzb(new zzbzs("Activeview"), 1);
        } else {
            ThreadPoolExecutor threadPoolExecutor6 = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzbzs("Activeview"));
            threadPoolExecutor6.allowCoreThreadTimeOut(true);
            threadPoolExecutor3 = threadPoolExecutor6;
        }
        zzc = new zzbzu(threadPoolExecutor3, null);
        zzbzr zzbzrVar = new zzbzr(3, new zzbzs(AppEventsConstants.EVENT_NAME_SCHEDULE));
        zzd = zzbzrVar;
        zze = zzgcz.zzb(zzbzrVar);
        zzf = new zzbzu(new zzbzt(), null);
        zzg = new zzbzu(zzgcz.zzc(), null);
    }
}
