package com.google.android.gms.internal.ads;

import android.net.Network;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzfqr extends zzfqf {
    private zzfvf<Integer> zza;
    private zzfvf<Integer> zzb;
    @Nullable
    private zzfqq zzc;
    @Nullable
    private HttpURLConnection zzd;

    public zzfqr(zzfvf<Integer> zzfvfVar, zzfvf<Integer> zzfvfVar2, @Nullable zzfqq zzfqqVar) {
        this.zza = zzfvfVar;
        this.zzb = zzfvfVar2;
        this.zzc = zzfqqVar;
    }

    public static /* synthetic */ Integer zzf() {
        return -1;
    }

    public static /* synthetic */ Integer zzg() {
        return -1;
    }

    public static /* synthetic */ Integer zzh(int i) {
        return Integer.valueOf(i);
    }

    public static /* synthetic */ Integer zzi(int i) {
        return Integer.valueOf(i);
    }

    public static /* synthetic */ Integer zzj(int i) {
        return Integer.valueOf(i);
    }

    public static /* synthetic */ Integer zzk(int i) {
        return Integer.valueOf(i);
    }

    public static /* synthetic */ Integer zzl(int i) {
        return Integer.valueOf(i);
    }

    public static /* synthetic */ URLConnection zzp(URL url) throws IOException {
        return url.openConnection();
    }

    public static /* synthetic */ URLConnection zzq(Network network, URL url) throws IOException {
        return network.openConnection(url);
    }

    public static void zzs(@Nullable HttpURLConnection httpURLConnection) {
        zzfqg.zza();
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        zzs(this.zzd);
    }

    public HttpURLConnection zzm() throws IOException {
        zzfqg.zzb(((Integer) this.zza.zza()).intValue(), ((Integer) this.zzb.zza()).intValue());
        zzfqq zzfqqVar = this.zzc;
        zzfqqVar.getClass();
        HttpURLConnection httpURLConnection = (HttpURLConnection) zzfqqVar.zza();
        this.zzd = httpURLConnection;
        return httpURLConnection;
    }

    public HttpURLConnection zzn(zzfqq zzfqqVar, final int i, final int i2) throws IOException {
        this.zza = new zzfvf() { // from class: com.google.android.gms.internal.ads.zzfqj
            @Override // com.google.android.gms.internal.ads.zzfvf
            public final Object zza() {
                return zzfqr.zzk(i);
            }
        };
        this.zzb = new zzfvf() { // from class: com.google.android.gms.internal.ads.zzfqk
            @Override // com.google.android.gms.internal.ads.zzfvf
            public final Object zza() {
                return zzfqr.zzl(i2);
            }
        };
        this.zzc = zzfqqVar;
        return zzm();
    }

    @RequiresApi(21)
    public HttpURLConnection zzo(@NonNull final Network network, @NonNull final URL url, final int i, final int i2) throws IOException {
        this.zza = new zzfvf() { // from class: com.google.android.gms.internal.ads.zzfql
            @Override // com.google.android.gms.internal.ads.zzfvf
            public final Object zza() {
                return zzfqr.zzi(i);
            }
        };
        this.zzb = new zzfvf() { // from class: com.google.android.gms.internal.ads.zzfqm
            @Override // com.google.android.gms.internal.ads.zzfvf
            public final Object zza() {
                return zzfqr.zzj(i2);
            }
        };
        this.zzc = new zzfqq() { // from class: com.google.android.gms.internal.ads.zzfqn
            @Override // com.google.android.gms.internal.ads.zzfqq
            public final URLConnection zza() {
                return zzfqr.zzq(network, url);
            }
        };
        return zzm();
    }

    public URLConnection zzr(@NonNull final URL url, final int i) throws IOException {
        this.zza = new zzfvf() { // from class: com.google.android.gms.internal.ads.zzfqo
            @Override // com.google.android.gms.internal.ads.zzfvf
            public final Object zza() {
                return zzfqr.zzh(i);
            }
        };
        this.zzc = new zzfqq() { // from class: com.google.android.gms.internal.ads.zzfqp
            @Override // com.google.android.gms.internal.ads.zzfqq
            public final URLConnection zza() {
                return zzfqr.zzp(url);
            }
        };
        return zzm();
    }

    public zzfqr() {
        this(new zzfvf() { // from class: com.google.android.gms.internal.ads.zzfqh
            @Override // com.google.android.gms.internal.ads.zzfvf
            public final Object zza() {
                return zzfqr.zzf();
            }
        }, new zzfvf() { // from class: com.google.android.gms.internal.ads.zzfqi
            @Override // com.google.android.gms.internal.ads.zzfvf
            public final Object zza() {
                return zzfqr.zzg();
            }
        }, null);
    }
}
