package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzgl extends zzfr implements zzgt {
    private final boolean zza;
    private final int zzb;
    private final int zzc;
    @Nullable
    private final String zzd;
    @Nullable
    private final zzgs zze;
    private final zzgs zzf;
    @Nullable
    private zzgd zzg;
    @Nullable
    private HttpURLConnection zzh;
    @Nullable
    private InputStream zzi;
    private boolean zzj;
    private int zzk;
    private long zzl;
    private long zzm;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgl(String str, int i, int i2, boolean z, boolean z2, zzgs zzgsVar, zzfuo zzfuoVar, boolean z3, zzgk zzgkVar) {
        super(true);
        this.zzd = str;
        this.zzb = i;
        this.zzc = i2;
        this.zza = z;
        this.zze = zzgsVar;
        this.zzf = new zzgs();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.net.HttpURLConnection zzk(java.net.URL r3, int r4, @androidx.annotation.Nullable byte[] r5, long r6, long r8, boolean r10, boolean r11, java.util.Map r12) throws java.io.IOException {
        /*
            r2 = this;
            java.net.URLConnection r3 = r3.openConnection()
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3
            int r4 = r2.zzb
            r3.setConnectTimeout(r4)
            int r4 = r2.zzc
            r3.setReadTimeout(r4)
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            com.google.android.gms.internal.ads.zzgs r5 = r2.zze
            java.util.Map r5 = r5.zza()
            r4.putAll(r5)
            com.google.android.gms.internal.ads.zzgs r5 = r2.zzf
            java.util.Map r5 = r5.zza()
            r4.putAll(r5)
            r4.putAll(r12)
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L32:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L4e
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r12 = r5.getKey()
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r5 = r5.getValue()
            java.lang.String r5 = (java.lang.String) r5
            r3.setRequestProperty(r12, r5)
            goto L32
        L4e:
            r4 = 0
            int r12 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            r0 = -1
            if (r12 != 0) goto L5d
            int r6 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r6 != 0) goto L5c
            r4 = 0
            goto L7c
        L5c:
            r6 = r4
        L5d:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "bytes="
            r4.append(r5)
            r4.append(r6)
            java.lang.String r5 = "-"
            r4.append(r5)
            int r5 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r5 == 0) goto L78
            long r6 = r6 + r8
            long r6 = r6 + r0
            r4.append(r6)
        L78:
            java.lang.String r4 = r4.toString()
        L7c:
            if (r4 == 0) goto L83
            java.lang.String r5 = "Range"
            r3.setRequestProperty(r5, r4)
        L83:
            java.lang.String r4 = r2.zzd
            if (r4 == 0) goto L8c
            java.lang.String r5 = "User-Agent"
            r3.setRequestProperty(r5, r4)
        L8c:
            r4 = 1
            if (r4 == r10) goto L92
            java.lang.String r4 = "identity"
            goto L94
        L92:
            java.lang.String r4 = "gzip"
        L94:
            java.lang.String r5 = "Accept-Encoding"
            r3.setRequestProperty(r5, r4)
            r3.setInstanceFollowRedirects(r11)
            r4 = 0
            r3.setDoOutput(r4)
            int r4 = com.google.android.gms.internal.ads.zzgd.zzh
            java.lang.String r4 = "GET"
            r3.setRequestMethod(r4)
            r3.connect()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgl.zzk(java.net.URL, int, byte[], long, long, boolean, boolean, java.util.Map):java.net.HttpURLConnection");
    }

    private final URL zzl(URL url, @Nullable String str, zzgd zzgdVar) throws zzgp {
        if (str != null) {
            try {
                URL url2 = new URL(url, str);
                String protocol = url2.getProtocol();
                if (!"https".equals(protocol) && !"http".equals(protocol)) {
                    throw new zzgp("Unsupported protocol redirect: ".concat(String.valueOf(protocol)), zzgdVar, 2001, 1);
                }
                if (!this.zza && !protocol.equals(url.getProtocol())) {
                    String protocol2 = url.getProtocol();
                    throw new zzgp("Disallowed cross-protocol redirect (" + protocol2 + " to " + protocol + ")", zzgdVar, 2001, 1);
                }
                return url2;
            } catch (MalformedURLException e) {
                throw new zzgp(e, zzgdVar, 2001, 1);
            }
        }
        throw new zzgp("Null location redirect", zzgdVar, 2001, 1);
    }

    private final void zzm() {
        HttpURLConnection httpURLConnection = this.zzh;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                zzdo.zzd("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] bArr, int i, int i2) throws zzgp {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.zzl;
            if (j != -1) {
                long j2 = j - this.zzm;
                if (j2 != 0) {
                    i2 = (int) Math.min(i2, j2);
                }
                return -1;
            }
            InputStream inputStream = this.zzi;
            int i3 = zzei.zza;
            int read = inputStream.read(bArr, i, i2);
            if (read == -1) {
                return -1;
            }
            this.zzm += read;
            zzg(read);
            return read;
        } catch (IOException e) {
            zzgd zzgdVar = this.zzg;
            int i4 = zzei.zza;
            throw zzgp.zza(e, zzgdVar, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x01cd, code lost:
        r5 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01ef, code lost:
        throw new com.google.android.gms.internal.ads.zzgp(new java.net.NoRouteToHostException("Too many redirects: " + r6), r25, 2001, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b4, code lost:
        if (r8 == 0) goto L66;
     */
    @Override // com.google.android.gms.internal.ads.zzfy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long zzb(com.google.android.gms.internal.ads.zzgd r25) throws com.google.android.gms.internal.ads.zzgp {
        /*
            Method dump skipped, instructions count: 508
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgl.zzb(com.google.android.gms.internal.ads.zzgd):long");
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    @Nullable
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzh;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        zzgd zzgdVar = this.zzg;
        if (zzgdVar != null) {
            return zzgdVar.zza;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.net.HttpURLConnection, com.google.android.gms.internal.ads.zzgd, java.io.InputStream] */
    @Override // com.google.android.gms.internal.ads.zzfy
    public final void zzd() throws zzgp {
        try {
            InputStream inputStream = this.zzi;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    zzgd zzgdVar = this.zzg;
                    int i = zzei.zza;
                    throw new zzgp(e, zzgdVar, 2000, 3);
                }
            }
        } finally {
            this.zzi = null;
            zzm();
            if (this.zzj) {
                this.zzj = false;
                zzh();
            }
            this.zzh = null;
            this.zzg = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfr, com.google.android.gms.internal.ads.zzfy
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.zzh;
        if (httpURLConnection == null) {
            return zzfxq.zzd();
        }
        return new zzgj(httpURLConnection.getHeaderFields());
    }
}
