package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import androidx.collection.SimpleArrayMap;
import com.google.common.base.Optional;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.2 */
/* loaded from: classes5.dex */
public final class zzgv {

    /* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.2 */
    /* loaded from: classes5.dex */
    public static class zza {
        private static volatile Optional<zzgt> zza;

        private zza() {
        }

        public static Optional<zzgt> zza(Context context) {
            Optional<zzgt> zza2;
            Optional<zzgt> optional = zza;
            if (optional == null) {
                synchronized (zza.class) {
                    optional = zza;
                    if (optional == null) {
                        new zzgv();
                        if (!zzgw.zza(Build.TYPE, Build.TAGS)) {
                            zza2 = Optional.absent();
                        } else {
                            if (zzgi.zza() && !context.isDeviceProtectedStorage()) {
                                context = context.createDeviceProtectedStorageContext();
                            }
                            zza2 = zzgv.zza(context);
                        }
                        zza = zza2;
                        optional = zza2;
                    }
                }
            }
            return optional;
        }
    }

    private static zzgt zza(Context context, File file) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            SimpleArrayMap simpleArrayMap = new SimpleArrayMap();
            HashMap hashMap = new HashMap();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    String[] split = readLine.split(" ", 3);
                    if (split.length != 3) {
                        Log.e("HermeticFileOverrides", "Invalid: " + readLine);
                    } else {
                        String zza2 = zza(split[0]);
                        String decode = Uri.decode(zza(split[1]));
                        String str = (String) hashMap.get(split[2]);
                        if (str == null) {
                            String zza3 = zza(split[2]);
                            str = Uri.decode(zza3);
                            if (str.length() < 1024 || str == zza3) {
                                hashMap.put(zza3, str);
                            }
                        }
                        SimpleArrayMap simpleArrayMap2 = (SimpleArrayMap) simpleArrayMap.get(zza2);
                        if (simpleArrayMap2 == null) {
                            simpleArrayMap2 = new SimpleArrayMap();
                            simpleArrayMap.put(zza2, simpleArrayMap2);
                        }
                        simpleArrayMap2.put(decode, str);
                    }
                } else {
                    String valueOf = String.valueOf(file);
                    String packageName = context.getPackageName();
                    Log.w("HermeticFileOverrides", "Parsed " + valueOf + " for Android package " + packageName);
                    zzgo zzgoVar = new zzgo(simpleArrayMap);
                    bufferedReader.close();
                    return zzgoVar;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static Optional<File> zzb(Context context) {
        try {
            File file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
            if (file.exists()) {
                return Optional.m70057of(file);
            }
            return Optional.absent();
        } catch (RuntimeException e) {
            Log.e("HermeticFileOverrides", "no data dir", e);
            return Optional.absent();
        }
    }

    @VisibleForTesting
    static Optional<zzgt> zza(Context context) {
        Optional<zzgt> absent;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            StrictMode.allowThreadDiskWrites();
            Optional<File> zzb = zzb(context);
            if (zzb.isPresent()) {
                absent = Optional.m70057of(zza(context, zzb.get()));
            } else {
                absent = Optional.absent();
            }
            return absent;
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    private static final String zza(String str) {
        return new String(str);
    }
}
