package com.google.android.gms.internal.auth;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
/* loaded from: classes5.dex */
public final class zzcb {
    static HashMap zze;
    private static Object zzl;
    private static boolean zzm;
    public static final Uri zza = Uri.parse("content://com.google.android.gsf.gservices");
    public static final Uri zzb = Uri.parse("content://com.google.android.gsf.gservices/prefix");
    public static final Pattern zzc = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    public static final Pattern zzd = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    private static final AtomicBoolean zzk = new AtomicBoolean();
    static final HashMap zzf = new HashMap();
    static final HashMap zzg = new HashMap();
    static final HashMap zzh = new HashMap();
    static final HashMap zzi = new HashMap();
    static final String[] zzj = new String[0];

    public static String zza(ContentResolver contentResolver, String str, String str2) {
        synchronized (zzcb.class) {
            String str3 = null;
            if (zze == null) {
                zzk.set(false);
                zze = new HashMap();
                zzl = new Object();
                zzm = false;
                contentResolver.registerContentObserver(zza, true, new zzca(null));
            } else if (zzk.getAndSet(false)) {
                zze.clear();
                zzf.clear();
                zzg.clear();
                zzh.clear();
                zzi.clear();
                zzl = new Object();
                zzm = false;
            }
            Object obj = zzl;
            if (zze.containsKey(str)) {
                String str4 = (String) zze.get(str);
                if (str4 != null) {
                    str3 = str4;
                }
                return str3;
            }
            int length = zzj.length;
            Cursor query = contentResolver.query(zza, null, null, new String[]{str}, null);
            if (query == null) {
                return null;
            }
            try {
                if (!query.moveToFirst()) {
                    zzc(obj, str, null);
                    return null;
                }
                String string = query.getString(1);
                if (string != null && string.equals(null)) {
                    string = null;
                }
                zzc(obj, str, string);
                if (string != null) {
                    str3 = string;
                }
                return str3;
            } finally {
                query.close();
            }
        }
    }

    private static void zzc(Object obj, String str, String str2) {
        synchronized (zzcb.class) {
            if (obj == zzl) {
                zze.put(str, str2);
            }
        }
    }
}
