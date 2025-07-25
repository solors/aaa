package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import com.p552ot.pubsub.p561i.p562a.C26559a;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzfbq {
    private String zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfbq(JsonReader jsonReader) throws IOException {
        char c;
        jsonReader.beginObject();
        String str = "";
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            int hashCode = nextName.hashCode();
            if (hashCode != -1724546052) {
                if (hashCode == 3059181 && nextName.equals(C26559a.f69635d)) {
                    c = 0;
                }
                c = 65535;
            } else {
                if (nextName.equals("description")) {
                    c = 1;
                }
                c = 65535;
            }
            if (c != 0) {
                if (c != 1) {
                    jsonReader.skipValue();
                } else {
                    str = jsonReader.nextString();
                }
            } else {
                jsonReader.nextInt();
            }
        }
        jsonReader.endObject();
        this.zza = str;
    }

    public final String zza() {
        return this.zza;
    }
}
