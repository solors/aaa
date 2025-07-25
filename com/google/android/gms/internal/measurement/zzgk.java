package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.2 */
/* loaded from: classes5.dex */
public final class zzgk implements zzgn {
    @GuardedBy("ConfigurationContentLoader.class")
    private static final Map<Uri, zzgk> zza = new ArrayMap();
    private static final String[] zzb = {"key", "value"};
    private final ContentResolver zzc;
    private final Uri zzd;
    private final Runnable zze;
    private final ContentObserver zzf;
    private final Object zzg;
    private volatile Map<String, String> zzh;
    @GuardedBy("this")
    private final List<zzgl> zzi;

    private zzgk(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        zzgm zzgmVar = new zzgm(this, null);
        this.zzf = zzgmVar;
        this.zzg = new Object();
        this.zzi = new ArrayList();
        Preconditions.checkNotNull(contentResolver);
        Preconditions.checkNotNull(uri);
        this.zzc = contentResolver;
        this.zzd = uri;
        this.zze = runnable;
        contentResolver.registerContentObserver(uri, false, zzgmVar);
    }

    public static zzgk zza(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        zzgk zzgkVar;
        synchronized (zzgk.class) {
            Map<Uri, zzgk> map = zza;
            zzgkVar = map.get(uri);
            if (zzgkVar == null) {
                try {
                    zzgk zzgkVar2 = new zzgk(contentResolver, uri, runnable);
                    try {
                        map.put(uri, zzgkVar2);
                    } catch (SecurityException unused) {
                    }
                    zzgkVar = zzgkVar2;
                } catch (SecurityException unused2) {
                }
            }
        }
        return zzgkVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void zzc() {
        synchronized (zzgk.class) {
            for (zzgk zzgkVar : zza.values()) {
                zzgkVar.zzc.unregisterContentObserver(zzgkVar.zzf);
            }
            zza.clear();
        }
    }

    @Nullable
    private final Map<String, String> zze() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                return (Map) zzgq.zza(new zzgp() { // from class: com.google.android.gms.internal.measurement.zzgj
                    @Override // com.google.android.gms.internal.measurement.zzgp
                    public final Object zza() {
                        return zzgk.this.zzb();
                    }
                });
            } catch (SQLiteException | IllegalStateException | SecurityException unused) {
                Log.e("ConfigurationContentLdr", "PhenotypeFlag unable to load ContentProvider, using default values");
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                return null;
            }
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Map zzb() {
        Map hashMap;
        Cursor query = this.zzc.query(this.zzd, zzb, null, null, null);
        if (query == null) {
            return Collections.emptyMap();
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            if (count <= 256) {
                hashMap = new ArrayMap(count);
            } else {
                hashMap = new HashMap(count, 1.0f);
            }
            while (query.moveToNext()) {
                hashMap.put(query.getString(0), query.getString(1));
            }
            return hashMap;
        } finally {
            query.close();
        }
    }

    public final void zzd() {
        synchronized (this.zzg) {
            this.zzh = null;
            this.zze.run();
        }
        synchronized (this) {
            for (zzgl zzglVar : this.zzi) {
                zzglVar.zza();
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzgn
    public final /* synthetic */ Object zza(String str) {
        return zza().get(str);
    }

    public final Map<String, String> zza() {
        Map<String, String> map = this.zzh;
        if (map == null) {
            synchronized (this.zzg) {
                map = this.zzh;
                if (map == null) {
                    map = zze();
                    this.zzh = map;
                }
            }
        }
        return map != null ? map : Collections.emptyMap();
    }
}
