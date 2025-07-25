package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.JsonReader;
import androidx.annotation.Nullable;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzfbz {
    public final List zza;
    public final zzfbr zzb;
    public final List zzc;
    @Nullable
    public final zzbvk zzd;

    zzfbz(JsonReader jsonReader, @Nullable zzbvk zzbvkVar) throws IllegalStateException, IOException, JSONException, NumberFormatException, AssertionError {
        Bundle bundle;
        Bundle bundle2;
        this.zzd = zzbvkVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzck)).booleanValue() && zzbvkVar != null && (bundle2 = zzbvkVar.zzm) != null) {
            bundle2.putLong(zzdre.SERVER_RESPONSE_PARSE_START.zza(), com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis());
        }
        List emptyList = Collections.emptyList();
        ArrayList arrayList = new ArrayList();
        jsonReader.beginObject();
        zzfbr zzfbrVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if ("responses".equals(nextName)) {
                jsonReader.beginArray();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if ("ad_configs".equals(nextName2)) {
                        emptyList = new ArrayList();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            emptyList.add(new zzfbo(jsonReader));
                        }
                        jsonReader.endArray();
                    } else if (nextName2.equals("common")) {
                        zzfbrVar = new zzfbr(jsonReader);
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzcl)).booleanValue() && zzbvkVar != null && (bundle = zzbvkVar.zzm) != null) {
                            bundle.putLong(zzdre.NORMALIZATION_AD_RESPONSE_START.zza(), zzfbrVar.zzs);
                            zzbvkVar.zzm.putLong(zzdre.NORMALIZATION_AD_RESPONSE_END.zza(), zzfbrVar.zzt);
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                jsonReader.endArray();
            } else if (nextName.equals("actions")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginObject();
                    String str = null;
                    JSONObject jSONObject = null;
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        if ("name".equals(nextName3)) {
                            str = jsonReader.nextString();
                        } else if ("info".equals(nextName3)) {
                            jSONObject = com.google.android.gms.ads.internal.util.zzbs.zzi(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    if (str != null) {
                        arrayList.add(new zzfby(str, jSONObject));
                    }
                    jsonReader.endObject();
                }
                jsonReader.endArray();
            }
        }
        this.zzc = arrayList;
        this.zza = emptyList;
        this.zzb = zzfbrVar == null ? new zzfbr(new JsonReader(new StringReader(JsonUtils.EMPTY_JSON))) : zzfbrVar;
    }

    public static zzfbz zza(Reader reader, @Nullable zzbvk zzbvkVar) throws zzfbs {
        try {
            try {
                return new zzfbz(new JsonReader(reader), zzbvkVar);
            } catch (IOException | AssertionError | IllegalStateException | NumberFormatException | JSONException e) {
                throw new zzfbs("unable to parse ServerResponse", e);
            }
        } finally {
            IOUtils.closeQuietly(reader);
        }
    }
}
