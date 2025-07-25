package com.google.gson.internal.bind;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public final class JsonTreeWriter extends JsonWriter {

    /* renamed from: f */
    private static final Writer f44028f = new Writer() { // from class: com.google.gson.internal.bind.JsonTreeWriter.1
        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    };

    /* renamed from: g */
    private static final JsonPrimitive f44029g = new JsonPrimitive("closed");

    /* renamed from: b */
    private final List<JsonElement> f44030b;

    /* renamed from: c */
    private String f44031c;

    /* renamed from: d */
    private JsonElement f44032d;

    public JsonTreeWriter() {
        super(f44028f);
        this.f44030b = new ArrayList();
        this.f44032d = JsonNull.INSTANCE;
    }

    /* renamed from: a */
    private JsonElement m66179a() {
        List<JsonElement> list = this.f44030b;
        return list.get(list.size() - 1);
    }

    /* renamed from: b */
    private void m66178b(JsonElement jsonElement) {
        if (this.f44031c != null) {
            if (!jsonElement.isJsonNull() || getSerializeNulls()) {
                ((JsonObject) m66179a()).add(this.f44031c, jsonElement);
            }
            this.f44031c = null;
        } else if (this.f44030b.isEmpty()) {
            this.f44032d = jsonElement;
        } else {
            JsonElement m66179a = m66179a();
            if (m66179a instanceof JsonArray) {
                ((JsonArray) m66179a).add(jsonElement);
                return;
            }
            throw new IllegalStateException();
        }
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter beginArray() throws IOException {
        JsonArray jsonArray = new JsonArray();
        m66178b(jsonArray);
        this.f44030b.add(jsonArray);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter beginObject() throws IOException {
        JsonObject jsonObject = new JsonObject();
        m66178b(jsonObject);
        this.f44030b.add(jsonObject);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f44030b.isEmpty()) {
            this.f44030b.add(f44029g);
            return;
        }
        throw new IOException("Incomplete document");
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter endArray() throws IOException {
        if (!this.f44030b.isEmpty() && this.f44031c == null) {
            if (m66179a() instanceof JsonArray) {
                List<JsonElement> list = this.f44030b;
                list.remove(list.size() - 1);
                return this;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter endObject() throws IOException {
        if (!this.f44030b.isEmpty() && this.f44031c == null) {
            if (m66179a() instanceof JsonObject) {
                List<JsonElement> list = this.f44030b;
                list.remove(list.size() - 1);
                return this;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    public JsonElement get() {
        if (this.f44030b.isEmpty()) {
            return this.f44032d;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.f44030b);
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter name(String str) throws IOException {
        if (str != null) {
            if (!this.f44030b.isEmpty() && this.f44031c == null) {
                if (m66179a() instanceof JsonObject) {
                    this.f44031c = str;
                    return this;
                }
                throw new IllegalStateException();
            }
            throw new IllegalStateException();
        }
        throw new NullPointerException("name == null");
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter nullValue() throws IOException {
        m66178b(JsonNull.INSTANCE);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(String str) throws IOException {
        if (str == null) {
            return nullValue();
        }
        m66178b(new JsonPrimitive(str));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(boolean z) throws IOException {
        m66178b(new JsonPrimitive(Boolean.valueOf(z)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(Boolean bool) throws IOException {
        if (bool == null) {
            return nullValue();
        }
        m66178b(new JsonPrimitive(bool));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(double d) throws IOException {
        if (!isLenient() && (Double.isNaN(d) || Double.isInfinite(d))) {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d);
        }
        m66178b(new JsonPrimitive(Double.valueOf(d)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(long j) throws IOException {
        m66178b(new JsonPrimitive(Long.valueOf(j)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(Number number) throws IOException {
        if (number == null) {
            return nullValue();
        }
        if (!isLenient()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        m66178b(new JsonPrimitive(number));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter, java.io.Flushable
    public void flush() throws IOException {
    }
}
