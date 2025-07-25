package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzbyi {
    private final Object zzi;
    private final AtomicReference zzb = new AtomicReference(null);
    private final Object zzc = new Object();
    @Nullable
    private String zzd = null;
    @VisibleForTesting
    final AtomicBoolean zza = new AtomicBoolean(false);
    private final AtomicInteger zze = new AtomicInteger(-1);
    private final AtomicReference zzf = new AtomicReference(null);
    private final AtomicReference zzg = new AtomicReference(null);
    private final ConcurrentMap zzh = new ConcurrentHashMap(9);

    public zzbyi() {
        new AtomicReference(null);
        new ArrayBlockingQueue(20);
        this.zzi = new Object();
    }

    public static final Bundle zzq(@Nullable Map map) {
        Bundle bundle = new Bundle();
        if (map != null) {
            for (String str : map.keySet()) {
                try {
                    if (Objects.equals(str, "value")) {
                        bundle.putDouble(str, Double.parseDouble((String) map.get(str)));
                    } else {
                        bundle.putString(str, (String) map.get(str));
                    }
                } catch (NullPointerException | NumberFormatException unused) {
                }
            }
        }
        return bundle;
    }

    @VisibleForTesting
    static final boolean zzr(Context context) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzav)).booleanValue()) {
            return false;
        }
        if (DynamiteModule.getLocalVersion(context, ModuleDescriptor.MODULE_ID) < ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzaw)).intValue()) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzax)).booleanValue()) {
            try {
                context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                return false;
            } catch (ClassNotFoundException unused) {
            }
        }
        return true;
    }

    @Nullable
    private final Object zzs(String str, Context context) {
        if (!zzx(context, "com.google.android.gms.measurement.AppMeasurement", this.zzf, true)) {
            return null;
        }
        try {
            return zzt(context, str).invoke(this.zzf.get(), new Object[0]);
        } catch (Exception unused) {
            zzw(str, true);
            return null;
        }
    }

    @Nullable
    private final Method zzt(Context context, String str) {
        Method method = (Method) this.zzh.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, new Class[0]);
            this.zzh.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception unused) {
            zzw(str, false);
            return null;
        }
    }

    private final void zzu(Context context, String str, String str2) {
        if (!zzx(context, "com.google.android.gms.measurement.AppMeasurement", this.zzf, true)) {
            return;
        }
        Method method = (Method) this.zzh.get(str2);
        if (method == null) {
            try {
                method = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str2, String.class);
                this.zzh.put(str2, method);
            } catch (Exception unused) {
                zzw(str2, false);
                method = null;
            }
        }
        try {
            method.invoke(this.zzf.get(), str);
            com.google.android.gms.ads.internal.util.zze.zza("Invoke Firebase method " + str2 + ", Ad Unit Id: " + str);
        } catch (Exception unused2) {
            zzw(str2, false);
        }
    }

    private final void zzv(Context context, String str, String str2, @Nullable Bundle bundle) {
        if (zzp(context)) {
            Bundle bundle2 = new Bundle();
            try {
                bundle2.putLong("_aeid", Long.parseLong(str2));
            } catch (NullPointerException | NumberFormatException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Invalid event ID: ".concat(String.valueOf(str2)), e);
            }
            if ("_ac".equals(str)) {
                bundle2.putInt("_r", 1);
            }
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            if (zzx(context, "com.google.android.gms.measurement.AppMeasurement", this.zzf, true)) {
                Method method = (Method) this.zzh.get("logEventInternal");
                if (method == null) {
                    try {
                        method = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", String.class, String.class, Bundle.class);
                        this.zzh.put("logEventInternal", method);
                    } catch (Exception unused) {
                        zzw("logEventInternal", true);
                        method = null;
                    }
                }
                try {
                    method.invoke(this.zzf.get(), "am", str, bundle2);
                } catch (Exception unused2) {
                    zzw("logEventInternal", true);
                }
            }
        }
    }

    private final void zzw(String str, boolean z) {
        if (!this.zza.get()) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Invoke Firebase method " + str + " error.");
            if (z) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
                this.zza.set(true);
            }
        }
    }

    private final boolean zzx(Context context, String str, AtomicReference atomicReference, boolean z) {
        if (atomicReference.get() == null) {
            try {
                zzbyf.zza(atomicReference, null, context.getClassLoader().loadClass(str).getDeclaredMethod("getInstance", Context.class).invoke(null, context));
            } catch (Exception unused) {
                zzw("getInstance", z);
                return false;
            }
        }
        return true;
    }

    @Nullable
    public final String zza(Context context) {
        Object zzs;
        if (zzp(context) && (zzs = zzs("generateEventId", context)) != null) {
            return zzs.toString();
        }
        return null;
    }

    @Nullable
    public final String zzb(final Context context) {
        ExecutorService threadPoolExecutor;
        if (!zzp(context)) {
            return null;
        }
        long longValue = ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzat)).longValue();
        if (longValue < 0) {
            return (String) zzs("getAppInstanceId", context);
        }
        if (this.zzb.get() == null) {
            if (ClientLibraryUtils.isPackageSide()) {
                threadPoolExecutor = zzfqv.zza().zzc(((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzau)).intValue(), new zzbyh(this), 2);
            } else {
                zzbcc zzbccVar = zzbcl.zzau;
                threadPoolExecutor = new ThreadPoolExecutor(((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbccVar)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbccVar)).intValue(), 1L, TimeUnit.MINUTES, new LinkedBlockingQueue(), new zzbyh(this));
            }
            zzbyf.zza(this.zzb, null, threadPoolExecutor);
        }
        try {
            return (String) ((ExecutorService) this.zzb.get()).submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzbyg
                {
                    zzbyi.this = this;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzbyi.this.zze(context);
                }
            }).get(longValue, TimeUnit.MILLISECONDS);
        } catch (TimeoutException unused) {
            return "TIME_OUT";
        } catch (Exception unused2) {
            return null;
        }
    }

    public final String zzc(Context context) {
        if (zzp(context) && zzx(context, "com.google.android.gms.measurement.AppMeasurement", this.zzf, true)) {
            try {
                String str = (String) zzt(context, "getCurrentScreenName").invoke(this.zzf.get(), new Object[0]);
                if (str == null) {
                    str = (String) zzt(context, "getCurrentScreenClass").invoke(this.zzf.get(), new Object[0]);
                }
                if (str == null) {
                    return "";
                }
                return str;
            } catch (Exception unused) {
                zzw("getCurrentScreenName", false);
            }
        }
        return "";
    }

    @Nullable
    public final String zzd(Context context) {
        if (!zzp(context)) {
            return null;
        }
        synchronized (this.zzc) {
            String str = this.zzd;
            if (str != null) {
                return str;
            }
            String str2 = (String) zzs("getGmpAppId", context);
            this.zzd = str2;
            return str2;
        }
    }

    public final /* synthetic */ String zze(Context context) throws Exception {
        return (String) zzs("getAppInstanceId", context);
    }

    public final void zzf(Context context, String str) {
        if (!zzp(context)) {
            return;
        }
        zzu(context, str, "beginAdUnitExposure");
    }

    public final void zzg(Context context, String str) {
        if (!zzp(context)) {
            return;
        }
        zzu(context, str, "endAdUnitExposure");
    }

    public final void zzh(Context context, String str) {
        zzv(context, "_aa", str, null);
    }

    public final void zzi(Context context, String str) {
        zzv(context, "_aq", str, null);
    }

    public final void zzj(Context context, @Nullable String str, @Nullable Map map) {
        zzv(context, "_ac", str, zzq(map));
    }

    public final void zzk(Context context, @Nullable String str, @Nullable Map map) {
        zzv(context, "_ai", str, zzq(map));
    }

    public final void zzl(Context context, @Nullable String str, String str2, String str3, int i) {
        if (!zzp(context)) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_ai", str2);
        bundle.putString("reward_type", str3);
        bundle.putInt("reward_value", i);
        zzv(context, "_ar", str, bundle);
        com.google.android.gms.ads.internal.util.zze.zza("Log a Firebase reward video event, reward type: " + str3 + ", reward value: " + i);
    }

    public final void zzm(Context context, com.google.android.gms.ads.internal.client.zzm zzmVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzaA)).booleanValue() && zzp(context) && zzr(context)) {
            synchronized (this.zzi) {
            }
        }
    }

    public final void zzn(Context context, com.google.android.gms.ads.internal.client.zzfv zzfvVar) {
        zzbyj.zzd(context).zzb().zzc(zzfvVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzaA)).booleanValue() && zzp(context) && zzr(context)) {
            synchronized (this.zzi) {
            }
        }
    }

    @Deprecated
    public final void zzo(Context context, String str) {
        if (zzp(context) && (context instanceof Activity) && zzx(context, "com.google.firebase.analytics.FirebaseAnalytics", this.zzg, false)) {
            Method method = (Method) this.zzh.get("setCurrentScreen");
            if (method == null) {
                try {
                    method = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("setCurrentScreen", Activity.class, String.class, String.class);
                    this.zzh.put("setCurrentScreen", method);
                } catch (Exception unused) {
                    zzw("setCurrentScreen", false);
                    method = null;
                }
            }
            try {
                method.invoke(this.zzg.get(), (Activity) context, str, context.getPackageName());
            } catch (Exception unused2) {
                zzw("setCurrentScreen", false);
            }
        }
    }

    public final boolean zzp(Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzan)).booleanValue() && !this.zza.get()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzay)).booleanValue()) {
                return true;
            }
            if (this.zze.get() == -1) {
                com.google.android.gms.ads.internal.client.zzbc.zzb();
                if (!com.google.android.gms.ads.internal.util.client.zzf.zzs(context, GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE)) {
                    com.google.android.gms.ads.internal.client.zzbc.zzb();
                    if (com.google.android.gms.ads.internal.util.client.zzf.zzt(context)) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzj("Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service.");
                        this.zze.set(0);
                    }
                }
                this.zze.set(1);
            }
            if (this.zze.get() == 1) {
                return true;
            }
        }
        return false;
    }
}
