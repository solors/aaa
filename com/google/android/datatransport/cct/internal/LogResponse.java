package com.google.android.datatransport.cct.internal;

import android.util.JsonReader;
import android.util.JsonToken;
import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;
import java.io.IOException;
import java.io.Reader;

@AutoValue
/* loaded from: classes4.dex */
public abstract class LogResponse {
    /* renamed from: a */
    static LogResponse m76324a(long j) {
        return new AutoValue_LogResponse(j);
    }

    @NonNull
    public static LogResponse fromJson(@NonNull Reader reader) throws IOException {
        JsonReader jsonReader = new JsonReader(reader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    if (jsonReader.peek() == JsonToken.STRING) {
                        return m76324a(Long.parseLong(jsonReader.nextString()));
                    }
                    return m76324a(jsonReader.nextLong());
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } finally {
            jsonReader.close();
        }
    }

    public abstract long getNextRequestWaitMillis();
}
