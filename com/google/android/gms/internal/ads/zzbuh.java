package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.wrappers.Wrappers;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.p552ot.pubsub.p561i.p562a.C26559a;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzbuh implements zzbuj {
    @Nullable
    @VisibleForTesting
    public static zzbuj zza;
    @Nullable
    @VisibleForTesting
    static zzbuj zzb;
    @Nullable
    @VisibleForTesting
    static zzbuj zzc;
    @Nullable
    @VisibleForTesting
    static Boolean zzd;
    private static final Object zze = new Object();
    private final Object zzf;
    private final Context zzg;
    private final WeakHashMap zzh;
    private final ExecutorService zzi;
    private final VersionInfoParcel zzj;
    @Nullable
    private final PackageInfo zzk;
    private final String zzl;
    @Nullable
    private final String zzm;
    private final AtomicBoolean zzn;
    private boolean zzo;

    /* JADX WARN: Removed duplicated region for block: B:55:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected zzbuh(android.content.Context r3, com.google.android.gms.ads.internal.util.client.VersionInfoParcel r4) {
        /*
            r2 = this;
            r2.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.zzf = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            r2.zzh = r0
            com.google.android.gms.internal.ads.zzfqv.zza()
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newCachedThreadPool()
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.unconfigurableExecutorService(r0)
            r2.zzi = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r2.zzn = r0
            android.content.Context r0 = r3.getApplicationContext()
            if (r0 == 0) goto L2f
            android.content.Context r3 = r3.getApplicationContext()
        L2f:
            r2.zzg = r3
            r2.zzj = r4
            com.google.android.gms.internal.ads.zzbcc r4 = com.google.android.gms.internal.ads.zzbcl.zzhG
            com.google.android.gms.internal.ads.zzbcj r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r4 = r0.zza(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r0 = 0
            if (r4 == 0) goto L61
            android.os.Handler r4 = com.google.android.gms.ads.internal.util.client.zzf.zza
            if (r3 == 0) goto L61
            android.content.pm.ApplicationInfo r4 = r3.getApplicationInfo()
            if (r4 != 0) goto L51
            goto L61
        L51:
            com.google.android.gms.common.wrappers.PackageManagerWrapper r4 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            android.content.pm.ApplicationInfo r3 = r3.getApplicationInfo()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            java.lang.String r3 = r3.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            r1 = 0
            android.content.pm.PackageInfo r3 = r4.getPackageInfo(r3, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            goto L62
        L61:
            r3 = r0
        L62:
            r2.zzk = r3
            com.google.android.gms.internal.ads.zzbcc r3 = com.google.android.gms.internal.ads.zzbcl.zzhE
            com.google.android.gms.internal.ads.zzbcj r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r4 = r4.zza(r3)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            java.lang.String r1 = "unknown"
            if (r4 == 0) goto L81
            java.util.Locale r4 = java.util.Locale.getDefault()
            java.lang.String r4 = r4.getCountry()
            goto L82
        L81:
            r4 = r1
        L82:
            r2.zzl = r4
            com.google.android.gms.internal.ads.zzbcj r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r3 = r4.zza(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto Lb1
            android.content.Context r3 = r2.zzg
            android.os.Handler r4 = com.google.android.gms.ads.internal.util.client.zzf.zza
            if (r3 != 0) goto L9b
            goto Lb2
        L9b:
            com.google.android.gms.common.wrappers.PackageManagerWrapper r3 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb2
            java.lang.String r4 = "com.android.vending"
            r1 = 128(0x80, float:1.794E-43)
            android.content.pm.PackageInfo r3 = r3.getPackageInfo(r4, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb2
            if (r3 != 0) goto Laa
            goto Lb2
        Laa:
            int r3 = r3.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb2
            java.lang.String r0 = java.lang.Integer.toString(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb2
            goto Lb2
        Lb1:
            r0 = r1
        Lb2:
            r2.zzm = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbuh.<init>(android.content.Context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel):void");
    }

    public static zzbuj zza(Context context) {
        synchronized (zze) {
            if (zza == null) {
                if (zzl(context)) {
                    zza = new zzbuh(context, VersionInfoParcel.forPackage());
                } else {
                    zza = new zzbui();
                }
            }
        }
        return zza;
    }

    public static zzbuj zzb(Context context, VersionInfoParcel versionInfoParcel) {
        synchronized (zze) {
            if (zzc == null) {
                boolean z = false;
                if (((Boolean) zzbed.zzc.zze()).booleanValue()) {
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzhz)).booleanValue() || ((Boolean) zzbed.zza.zze()).booleanValue()) {
                        z = true;
                    }
                }
                if (zzl(context)) {
                    zzbuh zzbuhVar = new zzbuh(context, versionInfoParcel);
                    zzbuhVar.zzk();
                    zzbuhVar.zzj();
                    zzc = zzbuhVar;
                } else if (z && context != null) {
                    zzbuh zzbuhVar2 = new zzbuh(context, versionInfoParcel, true);
                    zzbuhVar2.zzk();
                    zzbuhVar2.zzj();
                    zzc = zzbuhVar2;
                } else {
                    zzc = new zzbui();
                }
            }
        }
        return zzc;
    }

    public static zzbuj zzc(Context context) {
        synchronized (zze) {
            if (zzb == null) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzhA)).booleanValue()) {
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzhz)).booleanValue()) {
                        zzb = new zzbuh(context, VersionInfoParcel.forPackage());
                    }
                }
                zzb = new zzbui();
            }
        }
        return zzb;
    }

    public static zzbuj zzd(Context context, VersionInfoParcel versionInfoParcel) {
        synchronized (zze) {
            if (zzb == null) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzhA)).booleanValue()) {
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzhz)).booleanValue()) {
                        zzb = new zzbuh(context, versionInfoParcel);
                    }
                }
                zzb = new zzbui();
            }
        }
        return zzb;
    }

    public static String zze(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static String zzf(Throwable th) {
        return zzfve.zzc(com.google.android.gms.ads.internal.util.client.zzf.zzg(zze(th)));
    }

    private final void zzj() {
        Thread.setDefaultUncaughtExceptionHandler(new zzbuf(this, Thread.getDefaultUncaughtExceptionHandler()));
    }

    private final void zzk() {
        Thread thread = Looper.getMainLooper().getThread();
        if (thread == null) {
            return;
        }
        synchronized (this.zzf) {
            this.zzh.put(thread, Boolean.TRUE);
        }
        thread.setUncaughtExceptionHandler(new zzbug(this, thread.getUncaughtExceptionHandler()));
    }

    private static boolean zzl(Context context) {
        boolean z;
        if (context == null) {
            return false;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzmE)).booleanValue()) {
            if (((Boolean) zzbeu.zze.zze()).booleanValue()) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzhz)).booleanValue()) {
                    return true;
                }
            }
            return false;
        }
        synchronized (zze) {
            if (zzd == null) {
                if (com.google.android.gms.ads.internal.client.zzbc.zze().nextInt(100) < ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzmB)).intValue()) {
                    z = true;
                } else {
                    z = false;
                }
                zzd = Boolean.valueOf(z);
            }
        }
        if (zzd.booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzhz)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final void zzg(Thread thread, Throwable th) {
        StackTraceElement[] stackTrace;
        if (th != null) {
            boolean z = false;
            boolean z2 = false;
            for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
                for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
                    z |= com.google.android.gms.ads.internal.util.client.zzf.zzo(stackTraceElement.getClassName());
                    z2 |= zzbuh.class.getName().equals(stackTraceElement.getClassName());
                }
            }
            if (z && !z2) {
                if (!this.zzo) {
                    zzh(th, "");
                }
                if (!this.zzn.getAndSet(true) && ((Boolean) zzbed.zzc.zze()).booleanValue()) {
                    zzbbv.zzc(this.zzg);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuj
    public final void zzh(Throwable th, String str) {
        if (this.zzo) {
            return;
        }
        zzi(th, str, 1.0f);
    }

    @Override // com.google.android.gms.internal.ads.zzbuj
    public final void zzi(Throwable th, String str, float f) {
        Throwable th2;
        Throwable th3;
        String str2;
        PackageInfo packageInfo;
        ActivityManager.MemoryInfo zzc2;
        if (this.zzo) {
            return;
        }
        Handler handler = com.google.android.gms.ads.internal.util.client.zzf.zza;
        boolean z = false;
        if (((Boolean) zzbeu.zzf.zze()).booleanValue()) {
            th2 = th;
        } else {
            LinkedList linkedList = new LinkedList();
            for (Throwable th4 = th; th4 != null; th4 = th4.getCause()) {
                linkedList.push(th4);
            }
            th2 = null;
            while (!linkedList.isEmpty()) {
                Throwable th5 = (Throwable) linkedList.pop();
                StackTraceElement[] stackTrace = th5.getStackTrace();
                boolean z2 = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzcs)).booleanValue() && stackTrace != null && stackTrace.length == 0 && com.google.android.gms.ads.internal.util.client.zzf.zzo(th5.getClass().getName());
                ArrayList arrayList = new ArrayList();
                arrayList.add(new StackTraceElement(th5.getClass().getName(), "<filtered>", "<filtered>", 1));
                for (StackTraceElement stackTraceElement : stackTrace) {
                    if (com.google.android.gms.ads.internal.util.client.zzf.zzo(stackTraceElement.getClassName())) {
                        arrayList.add(stackTraceElement);
                        z2 = true;
                    } else {
                        String className = stackTraceElement.getClassName();
                        if (TextUtils.isEmpty(className) || (!className.startsWith("android.") && !className.startsWith("java."))) {
                            arrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                        } else {
                            arrayList.add(stackTraceElement);
                        }
                    }
                }
                if (z2) {
                    if (th2 == null) {
                        th3 = new Throwable(th5.getMessage());
                    } else {
                        th3 = new Throwable(th5.getMessage(), th2);
                    }
                    th2 = th3;
                    th2.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
                }
            }
        }
        if (th2 != null) {
            String name = th.getClass().getName();
            String zze2 = zze(th);
            String zzf = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zziI)).booleanValue() ? zzf(th) : "";
            double d = f;
            int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            double random = Math.random();
            int i2 = i > 0 ? (int) (1.0f / f) : 1;
            if (random < d) {
                ArrayList<String> arrayList2 = new ArrayList();
                try {
                    z = Wrappers.packageManager(this.zzg).isCallerInstantApp();
                } catch (Throwable th6) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzh("Error fetching instant app info", th6);
                }
                try {
                    str2 = this.zzg.getPackageName();
                } catch (Throwable unused) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Cannot obtain package name, proceeding.");
                    str2 = "unknown";
                }
                Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(z)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE);
                int i3 = Build.VERSION.SDK_INT;
                Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("api", String.valueOf(i3));
                String str3 = Build.MANUFACTURER;
                String str4 = Build.MODEL;
                if (!str4.startsWith(str3)) {
                    str4 = str3 + " " + str4;
                }
                Uri.Builder appendQueryParameter3 = appendQueryParameter2.appendQueryParameter("device", str4).appendQueryParameter("js", this.zzj.afmaVersion).appendQueryParameter("appid", str2).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", zze2).appendQueryParameter("eids", TextUtils.join(",", com.google.android.gms.ads.internal.client.zzbe.zza().zza())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "697668803").appendQueryParameter(DownloadCommon.DOWNLOAD_REPORT_RETRY_COUNT, "dev").appendQueryParameter("sampling_rate", Integer.toString(i2)).appendQueryParameter("pb_tm", String.valueOf(zzbeu.zzc.zze())).appendQueryParameter("gmscv", String.valueOf(GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zzg))).appendQueryParameter("lite", true != this.zzj.isLiteSdk ? "0" : "1");
                if (!TextUtils.isEmpty(zzf)) {
                    appendQueryParameter3.appendQueryParameter(C26559a.f69636e, zzf);
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzhF)).booleanValue() && (zzc2 = com.google.android.gms.ads.internal.util.client.zzf.zzc(this.zzg)) != null) {
                    appendQueryParameter3.appendQueryParameter("available_memory", Long.toString(zzc2.availMem));
                    appendQueryParameter3.appendQueryParameter("total_memory", Long.toString(zzc2.totalMem));
                    appendQueryParameter3.appendQueryParameter("is_low_memory", true == zzc2.lowMemory ? "1" : "0");
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzhE)).booleanValue()) {
                    if (!TextUtils.isEmpty(this.zzl)) {
                        appendQueryParameter3.appendQueryParameter("countrycode", this.zzl);
                    }
                    if (!TextUtils.isEmpty(this.zzm)) {
                        appendQueryParameter3.appendQueryParameter("psv", this.zzm);
                    }
                    Context context = this.zzg;
                    if (i3 >= 26) {
                        packageInfo = WebView.getCurrentWebViewPackage();
                    } else {
                        if (context != null) {
                            try {
                                packageInfo = Wrappers.packageManager(context).getPackageInfo("com.android.webview", 128);
                            } catch (PackageManager.NameNotFoundException unused2) {
                            }
                        }
                        packageInfo = null;
                    }
                    if (packageInfo != null) {
                        appendQueryParameter3.appendQueryParameter("wvvc", Integer.toString(packageInfo.versionCode));
                        appendQueryParameter3.appendQueryParameter("wvvn", packageInfo.versionName);
                        appendQueryParameter3.appendQueryParameter("wvpn", packageInfo.packageName);
                    }
                }
                PackageInfo packageInfo2 = this.zzk;
                if (packageInfo2 != null) {
                    appendQueryParameter3.appendQueryParameter("appvc", String.valueOf(packageInfo2.versionCode));
                    appendQueryParameter3.appendQueryParameter("appvn", this.zzk.versionName);
                }
                arrayList2.add(appendQueryParameter3.toString());
                for (final String str5 : arrayList2) {
                    final com.google.android.gms.ads.internal.util.client.zzu zzuVar = new com.google.android.gms.ads.internal.util.client.zzu(null);
                    this.zzi.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbue
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzuVar.zza(str5);
                        }
                    });
                }
            }
        }
    }

    protected zzbuh(Context context, VersionInfoParcel versionInfoParcel, boolean z) {
        this(context, versionInfoParcel);
        this.zzo = true;
    }
}
