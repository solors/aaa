package com.google.android.gms.ads.internal.util.client;

import android.util.JsonWriter;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.facebook.internal.NativeProtocol;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.p552ot.pubsub.p561i.p562a.C26559a;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes4.dex */
public final class zzl {
    public static final /* synthetic */ int zza = 0;
    @GuardedBy("lock")
    private static boolean zzc = false;
    @GuardedBy("lock")
    private static boolean zzd = false;
    private final List zzg;
    private static final Object zzb = new Object();
    private static final Clock zze = DefaultClock.getInstance();
    private static final Set zzf = new HashSet(Arrays.asList(new String[0]));

    public zzl() {
        throw null;
    }

    public static /* synthetic */ void zza(String str, String str2, Map map, byte[] bArr, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("uri").value(str);
        jsonWriter.name("verb").value(str2);
        jsonWriter.endObject();
        zzr(jsonWriter, map);
        if (bArr != null) {
            jsonWriter.name("body").value(Base64Utils.encode(bArr));
        }
        jsonWriter.endObject();
    }

    public static /* synthetic */ void zzb(int i, Map map, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name(C26559a.f69635d).value(i);
        jsonWriter.endObject();
        zzr(jsonWriter, map);
        jsonWriter.endObject();
    }

    public static void zzi() {
        synchronized (zzb) {
            zzc = false;
            zzd = false;
            zzo.zzj("Ad debug logging enablement is out of date.");
        }
    }

    public static void zzj(boolean z) {
        synchronized (zzb) {
            zzc = true;
            zzd = z;
        }
    }

    public static boolean zzk() {
        boolean z;
        synchronized (zzb) {
            z = false;
            if (zzc && zzd) {
                z = true;
            }
        }
        return z;
    }

    public static boolean zzl() {
        boolean z;
        synchronized (zzb) {
            z = zzc;
        }
        return z;
    }

    private static synchronized void zzm(String str) {
        synchronized (zzl.class) {
            zzo.zzi("GMA Debug BEGIN");
            int i = 0;
            while (i < str.length()) {
                int i2 = i + 4000;
                zzo.zzi("GMA Debug CONTENT ".concat(String.valueOf(str.substring(i, Math.min(i2, str.length())))));
                i = i2;
            }
            zzo.zzi("GMA Debug FINISH");
        }
    }

    private final void zzn(String str, zzk zzkVar) {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name("timestamp").value(zze.currentTimeMillis());
            jsonWriter.name("event").value(str);
            jsonWriter.name("components").beginArray();
            for (String str2 : this.zzg) {
                jsonWriter.value(str2);
            }
            jsonWriter.endArray();
            zzkVar.zza(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e) {
            zzo.zzh("unable to log", e);
        }
        zzm(stringWriter.toString());
    }

    private final void zzo(@Nullable final String str) {
        zzn("onNetworkRequestError", new zzk() { // from class: com.google.android.gms.ads.internal.util.client.zzi
            @Override // com.google.android.gms.ads.internal.util.client.zzk
            public final void zza(JsonWriter jsonWriter) {
                int i = zzl.zza;
                jsonWriter.name("params").beginObject();
                String str2 = str;
                if (str2 != null) {
                    jsonWriter.name(NativeProtocol.BRIDGE_ARG_ERROR_DESCRIPTION).value(str2);
                }
                jsonWriter.endObject();
            }
        });
    }

    private final void zzp(final String str, final String str2, @Nullable final Map map, @Nullable final byte[] bArr) {
        zzn("onNetworkRequest", new zzk() { // from class: com.google.android.gms.ads.internal.util.client.zzg
            @Override // com.google.android.gms.ads.internal.util.client.zzk
            public final void zza(JsonWriter jsonWriter) {
                zzl.zza(str, str2, map, bArr, jsonWriter);
            }
        });
    }

    private final void zzq(@Nullable final Map map, final int i) {
        zzn("onNetworkResponse", new zzk() { // from class: com.google.android.gms.ads.internal.util.client.zzj
            @Override // com.google.android.gms.ads.internal.util.client.zzk
            public final void zza(JsonWriter jsonWriter) {
                zzl.zzb(i, map, jsonWriter);
            }
        });
    }

    private static void zzr(JsonWriter jsonWriter, @Nullable Map map) throws IOException {
        if (map == null) {
            return;
        }
        jsonWriter.name("headers").beginArray();
        Iterator it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            if (!zzf.contains(str)) {
                if (entry.getValue() instanceof List) {
                    for (String str2 : (List) entry.getValue()) {
                        jsonWriter.beginObject();
                        jsonWriter.name("name").value(str);
                        jsonWriter.name("value").value(str2);
                        jsonWriter.endObject();
                    }
                } else if (entry.getValue() instanceof String) {
                    jsonWriter.beginObject();
                    jsonWriter.name("name").value(str);
                    jsonWriter.name("value").value((String) entry.getValue());
                    jsonWriter.endObject();
                } else {
                    zzo.zzg("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                    break;
                }
            }
        }
        jsonWriter.endArray();
    }

    public final void zzc(HttpURLConnection httpURLConnection, @Nullable byte[] bArr) {
        HashMap hashMap;
        if (!zzk()) {
            return;
        }
        if (httpURLConnection.getRequestProperties() == null) {
            hashMap = null;
        } else {
            hashMap = new HashMap(httpURLConnection.getRequestProperties());
        }
        zzp(new String(httpURLConnection.getURL().toString()), new String(httpURLConnection.getRequestMethod()), hashMap, bArr);
    }

    public final void zzd(String str, String str2, @Nullable Map map, @Nullable byte[] bArr) {
        if (!zzk()) {
            return;
        }
        zzp(str, "GET", map, bArr);
    }

    public final void zze(HttpURLConnection httpURLConnection, int i) {
        HashMap hashMap;
        if (zzk()) {
            String str = null;
            if (httpURLConnection.getHeaderFields() == null) {
                hashMap = null;
            } else {
                hashMap = new HashMap(httpURLConnection.getHeaderFields());
            }
            zzq(hashMap, i);
            if (i >= 200 && i < 300) {
                return;
            }
            try {
                str = httpURLConnection.getResponseMessage();
            } catch (IOException e) {
                zzo.zzj("Can not get error message from error HttpURLConnection\n".concat(String.valueOf(e.getMessage())));
            }
            zzo(str);
        }
    }

    public final void zzf(@Nullable Map map, int i) {
        if (zzk()) {
            zzq(map, i);
            if (i >= 200 && i < 300) {
                return;
            }
            zzo(null);
        }
    }

    public final void zzg(@Nullable String str) {
        if (zzk() && str != null) {
            zzh(str.getBytes());
        }
    }

    public final void zzh(final byte[] bArr) {
        zzn("onNetworkResponseBody", new zzk() { // from class: com.google.android.gms.ads.internal.util.client.zzh
            @Override // com.google.android.gms.ads.internal.util.client.zzk
            public final void zza(JsonWriter jsonWriter) {
                int i = zzl.zza;
                jsonWriter.name("params").beginObject();
                byte[] bArr2 = bArr;
                int length = bArr2.length;
                String encode = Base64Utils.encode(bArr2);
                if (length < 10000) {
                    jsonWriter.name("body").value(encode);
                } else {
                    String zzf2 = zzf.zzf(encode);
                    if (zzf2 != null) {
                        jsonWriter.name("bodydigest").value(zzf2);
                    }
                }
                jsonWriter.name("bodylength").value(length);
                jsonWriter.endObject();
            }
        });
    }

    public zzl(@Nullable String str) {
        List asList;
        if (!zzk()) {
            asList = new ArrayList();
        } else {
            asList = Arrays.asList("network_request_".concat(String.valueOf(UUID.randomUUID().toString())));
        }
        this.zzg = asList;
    }
}
