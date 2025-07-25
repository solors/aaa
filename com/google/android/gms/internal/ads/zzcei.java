package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.ironsource.C21114v8;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzcei extends zzfr implements zzgt {
    private static final Pattern zza = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private final int zzb;
    private final int zzc;
    private final String zzd;
    private final zzgs zze;
    private zzgd zzf;
    private HttpURLConnection zzg;
    private final Queue zzh;
    private InputStream zzi;
    private boolean zzj;
    private int zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private final long zzq;
    private final long zzr;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcei(String str, zzgy zzgyVar, int i, int i2, long j, long j2) {
        super(true);
        zzcw.zzc(str);
        this.zzd = str;
        this.zze = new zzgs();
        this.zzb = i;
        this.zzc = i2;
        this.zzh = new ArrayDeque();
        this.zzq = j;
        this.zzr = j2;
        if (zzgyVar != null) {
            zzf(zzgyVar);
        }
    }

    private final void zzl() {
        while (!this.zzh.isEmpty()) {
            try {
                ((HttpURLConnection) this.zzh.remove()).disconnect();
            } catch (Exception e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Unexpected error while disconnecting", e);
            }
        }
        this.zzg = null;
    }

    @Override // com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] bArr, int i, int i2) throws zzgp {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.zzl;
            long j2 = this.zzm;
            if (j - j2 == 0) {
                return -1;
            }
            long j3 = this.zzn + j2;
            long j4 = i2;
            long j5 = this.zzr;
            long j6 = this.zzp;
            long j7 = j6 + 1;
            if (j3 + j4 + j5 > j7) {
                long j8 = this.zzo;
                if (j6 < j8) {
                    long min = Math.min(j8, Math.max(((this.zzq + j7) - j5) - 1, (-1) + j7 + j4));
                    zzk(j7, min, 2);
                    this.zzp = min;
                    j6 = min;
                }
            }
            int read = this.zzi.read(bArr, i, (int) Math.min(j4, ((j6 + 1) - this.zzn) - this.zzm));
            if (read != -1) {
                this.zzm += read;
                zzg(read);
                return read;
            }
            throw new EOFException();
        } catch (IOException e) {
            throw new zzgp(e, this.zzf, 2000, 2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public final long zzb(zzgd zzgdVar) throws zzgp {
        long min;
        this.zzf = zzgdVar;
        this.zzm = 0L;
        long j = zzgdVar.zze;
        long j2 = zzgdVar.zzf;
        if (j2 == -1) {
            min = this.zzq;
        } else {
            min = Math.min(this.zzq, j2);
        }
        this.zzn = j;
        HttpURLConnection zzk = zzk(j, (min + j) - 1, 1);
        this.zzg = zzk;
        String headerField = zzk.getHeaderField("Content-Range");
        if (!TextUtils.isEmpty(headerField)) {
            Matcher matcher = zza.matcher(headerField);
            if (matcher.find()) {
                try {
                    Long.parseLong(matcher.group(1));
                    long parseLong = Long.parseLong(matcher.group(2));
                    long parseLong2 = Long.parseLong(matcher.group(3));
                    long j3 = zzgdVar.zzf;
                    if (j3 != -1) {
                        this.zzl = j3;
                        this.zzo = Math.max(parseLong, (this.zzn + j3) - 1);
                    } else {
                        this.zzl = parseLong2 - this.zzn;
                        this.zzo = parseLong2 - 1;
                    }
                    this.zzp = parseLong;
                    this.zzj = true;
                    zzj(zzgdVar);
                    return this.zzl;
                } catch (NumberFormatException unused) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("Unexpected Content-Range [" + headerField + C21114v8.C21123i.f54139e);
                }
            }
        }
        throw new zzceg(headerField, zzgdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    @Nullable
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzg;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public final void zzd() throws zzgp {
        try {
            InputStream inputStream = this.zzi;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    throw new zzgp(e, this.zzf, 2000, 3);
                }
            }
        } finally {
            this.zzi = null;
            zzl();
            if (this.zzj) {
                this.zzj = false;
                zzh();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfr, com.google.android.gms.internal.ads.zzfy
    @Nullable
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.zzg;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    @VisibleForTesting
    final HttpURLConnection zzk(long j, long j2, int i) throws zzgp {
        String uri = this.zzf.zza.toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
            httpURLConnection.setConnectTimeout(this.zzb);
            httpURLConnection.setReadTimeout(this.zzc);
            for (Map.Entry entry : this.zze.zza().entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpURLConnection.setRequestProperty("Range", "bytes=" + j + "-" + j2);
            httpURLConnection.setRequestProperty("User-Agent", this.zzd);
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            this.zzh.add(httpURLConnection);
            String uri2 = this.zzf.zza.toString();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                this.zzk = responseCode;
                if (responseCode >= 200 && responseCode <= 299) {
                    try {
                        InputStream inputStream = httpURLConnection.getInputStream();
                        if (this.zzi != null) {
                            inputStream = new SequenceInputStream(this.zzi, inputStream);
                        }
                        this.zzi = inputStream;
                        return httpURLConnection;
                    } catch (IOException e) {
                        zzl();
                        throw new zzgp(e, this.zzf, 2000, i);
                    }
                }
                Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                zzl();
                throw new zzceh(this.zzk, headerFields, this.zzf, i);
            } catch (IOException e2) {
                zzl();
                String valueOf = String.valueOf(uri2);
                throw new zzgp("Unable to connect to ".concat(valueOf), e2, this.zzf, 2000, i);
            }
        } catch (IOException e3) {
            String valueOf2 = String.valueOf(uri);
            throw new zzgp("Unable to connect to ".concat(valueOf2), e3, this.zzf, 2000, i);
        }
    }
}
