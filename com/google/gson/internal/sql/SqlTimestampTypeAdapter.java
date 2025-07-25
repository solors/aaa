package com.google.gson.internal.sql;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;

/* loaded from: classes5.dex */
class SqlTimestampTypeAdapter extends TypeAdapter<Timestamp> {

    /* renamed from: b */
    static final TypeAdapterFactory f44109b = new TypeAdapterFactory() { // from class: com.google.gson.internal.sql.SqlTimestampTypeAdapter.1
        @Override // com.google.gson.TypeAdapterFactory
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            if (typeToken.getRawType() != Timestamp.class) {
                return null;
            }
            return new SqlTimestampTypeAdapter(gson.getAdapter(Date.class));
        }
    };

    /* renamed from: a */
    private final TypeAdapter<Date> f44110a;

    private SqlTimestampTypeAdapter(TypeAdapter<Date> typeAdapter) {
        this.f44110a = typeAdapter;
    }

    @Override // com.google.gson.TypeAdapter
    public Timestamp read(JsonReader jsonReader) throws IOException {
        Date read = this.f44110a.read(jsonReader);
        if (read != null) {
            return new Timestamp(read.getTime());
        }
        return null;
    }

    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, Timestamp timestamp) throws IOException {
        this.f44110a.write(jsonWriter, timestamp);
    }
}
