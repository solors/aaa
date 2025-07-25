package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzaqn extends zzaqa {
    public zzaqn() {
        throw null;
    }

    public zzaqn(zzaqm zzaqmVar, SSLSocketFactory sSLSocketFactory) {
    }

    @VisibleForTesting
    static List zzb(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                for (String str : (List) entry.getValue()) {
                    arrayList.add(new zzape((String) entry.getKey(), str));
                }
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final zzaqk zza(zzapm zzapmVar, Map map) throws IOException, zzaou {
        String zzk = zzapmVar.zzk();
        HashMap hashMap = new HashMap();
        hashMap.putAll(map);
        hashMap.putAll(zzapmVar.zzl());
        URL url = new URL(zzk);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        int zzb = zzapmVar.zzb();
        httpURLConnection.setConnectTimeout(zzb);
        httpURLConnection.setReadTimeout(zzb);
        boolean z = false;
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        "https".equals(url.getProtocol());
        try {
            for (String str : hashMap.keySet()) {
                httpURLConnection.setRequestProperty(str, (String) hashMap.get(str));
            }
            if (zzapmVar.zza() != 0) {
                httpURLConnection.setRequestMethod("POST");
                byte[] zzx = zzapmVar.zzx();
                if (zzx != null) {
                    httpURLConnection.setDoOutput(true);
                    if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
                        httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
                    }
                    DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                    dataOutputStream.write(zzx);
                    dataOutputStream.close();
                }
            } else {
                httpURLConnection.setRequestMethod("GET");
            }
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode != -1) {
                zzapmVar.zza();
                if ((responseCode < 100 || responseCode >= 200) && responseCode != 204 && responseCode != 304) {
                    try {
                        return new zzaqk(responseCode, zzb(httpURLConnection.getHeaderFields()), httpURLConnection.getContentLength(), new zzaql(httpURLConnection));
                    } catch (Throwable th) {
                        th = th;
                        z = true;
                        if (!z) {
                            httpURLConnection.disconnect();
                        }
                        throw th;
                    }
                }
                zzaqk zzaqkVar = new zzaqk(responseCode, zzb(httpURLConnection.getHeaderFields()), -1, null);
                httpURLConnection.disconnect();
                return zzaqkVar;
            }
            throw new IOException("Could not retrieve response code from HttpUrlConnection.");
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
