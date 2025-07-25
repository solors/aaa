package com.google.gson.internal.bind;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes5.dex */
public final class JsonTreeReader extends JsonReader {

    /* renamed from: g */
    private static final Reader f44022g = new Reader() { // from class: com.google.gson.internal.bind.JsonTreeReader.1
        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i, int i2) throws IOException {
            throw new AssertionError();
        }
    };

    /* renamed from: h */
    private static final Object f44023h = new Object();

    /* renamed from: b */
    private Object[] f44024b;

    /* renamed from: c */
    private int f44025c;

    /* renamed from: d */
    private String[] f44026d;

    /* renamed from: f */
    private int[] f44027f;

    public JsonTreeReader(JsonElement jsonElement) {
        super(f44022g);
        this.f44024b = new Object[32];
        this.f44025c = 0;
        this.f44026d = new String[32];
        this.f44027f = new int[32];
        m66180h(jsonElement);
    }

    /* renamed from: a */
    private void m66184a(JsonToken jsonToken) throws IOException {
        if (peek() == jsonToken) {
            return;
        }
        throw new IllegalStateException("Expected " + jsonToken + " but was " + peek() + locationString());
    }

    /* renamed from: e */
    private Object m66182e() {
        return this.f44024b[this.f44025c - 1];
    }

    /* renamed from: f */
    private Object m66181f() {
        Object[] objArr = this.f44024b;
        int i = this.f44025c - 1;
        this.f44025c = i;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    /* renamed from: h */
    private void m66180h(Object obj) {
        int i = this.f44025c;
        Object[] objArr = this.f44024b;
        if (i == objArr.length) {
            int i2 = i * 2;
            this.f44024b = Arrays.copyOf(objArr, i2);
            this.f44027f = Arrays.copyOf(this.f44027f, i2);
            this.f44026d = (String[]) Arrays.copyOf(this.f44026d, i2);
        }
        Object[] objArr2 = this.f44024b;
        int i3 = this.f44025c;
        this.f44025c = i3 + 1;
        objArr2[i3] = obj;
    }

    private String locationString() {
        return " at path " + getPath();
    }

    /* renamed from: b */
    public JsonElement m66183b() throws IOException {
        JsonToken peek = peek();
        if (peek != JsonToken.NAME && peek != JsonToken.END_ARRAY && peek != JsonToken.END_OBJECT && peek != JsonToken.END_DOCUMENT) {
            JsonElement jsonElement = (JsonElement) m66182e();
            skipValue();
            return jsonElement;
        }
        throw new IllegalStateException("Unexpected " + peek + " when reading a JsonElement.");
    }

    @Override // com.google.gson.stream.JsonReader
    public void beginArray() throws IOException {
        m66184a(JsonToken.BEGIN_ARRAY);
        m66180h(((JsonArray) m66182e()).iterator());
        this.f44027f[this.f44025c - 1] = 0;
    }

    @Override // com.google.gson.stream.JsonReader
    public void beginObject() throws IOException {
        m66184a(JsonToken.BEGIN_OBJECT);
        m66180h(((JsonObject) m66182e()).entrySet().iterator());
    }

    @Override // com.google.gson.stream.JsonReader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f44024b = new Object[]{f44023h};
        this.f44025c = 1;
    }

    @Override // com.google.gson.stream.JsonReader
    public void endArray() throws IOException {
        m66184a(JsonToken.END_ARRAY);
        m66181f();
        m66181f();
        int i = this.f44025c;
        if (i > 0) {
            int[] iArr = this.f44027f;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public void endObject() throws IOException {
        m66184a(JsonToken.END_OBJECT);
        m66181f();
        m66181f();
        int i = this.f44025c;
        if (i > 0) {
            int[] iArr = this.f44027f;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public String getPath() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('$');
        int i = 0;
        while (true) {
            int i2 = this.f44025c;
            if (i < i2) {
                Object[] objArr = this.f44024b;
                Object obj = objArr[i];
                if (obj instanceof JsonArray) {
                    i++;
                    if (i < i2 && (objArr[i] instanceof Iterator)) {
                        sb2.append('[');
                        sb2.append(this.f44027f[i]);
                        sb2.append(']');
                    }
                } else if ((obj instanceof JsonObject) && (i = i + 1) < i2 && (objArr[i] instanceof Iterator)) {
                    sb2.append('.');
                    String str = this.f44026d[i];
                    if (str != null) {
                        sb2.append(str);
                    }
                }
                i++;
            } else {
                return sb2.toString();
            }
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public boolean hasNext() throws IOException {
        JsonToken peek = peek();
        if (peek != JsonToken.END_OBJECT && peek != JsonToken.END_ARRAY) {
            return true;
        }
        return false;
    }

    @Override // com.google.gson.stream.JsonReader
    public boolean nextBoolean() throws IOException {
        m66184a(JsonToken.BOOLEAN);
        boolean asBoolean = ((JsonPrimitive) m66181f()).getAsBoolean();
        int i = this.f44025c;
        if (i > 0) {
            int[] iArr = this.f44027f;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return asBoolean;
    }

    @Override // com.google.gson.stream.JsonReader
    public double nextDouble() throws IOException {
        JsonToken peek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (peek != jsonToken && peek != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + peek + locationString());
        }
        double asDouble = ((JsonPrimitive) m66182e()).getAsDouble();
        if (!isLenient() && (Double.isNaN(asDouble) || Double.isInfinite(asDouble))) {
            throw new NumberFormatException("JSON forbids NaN and infinities: " + asDouble);
        }
        m66181f();
        int i = this.f44025c;
        if (i > 0) {
            int[] iArr = this.f44027f;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return asDouble;
    }

    @Override // com.google.gson.stream.JsonReader
    public int nextInt() throws IOException {
        JsonToken peek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (peek != jsonToken && peek != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + peek + locationString());
        }
        int asInt = ((JsonPrimitive) m66182e()).getAsInt();
        m66181f();
        int i = this.f44025c;
        if (i > 0) {
            int[] iArr = this.f44027f;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return asInt;
    }

    @Override // com.google.gson.stream.JsonReader
    public long nextLong() throws IOException {
        JsonToken peek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (peek != jsonToken && peek != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + peek + locationString());
        }
        long asLong = ((JsonPrimitive) m66182e()).getAsLong();
        m66181f();
        int i = this.f44025c;
        if (i > 0) {
            int[] iArr = this.f44027f;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return asLong;
    }

    @Override // com.google.gson.stream.JsonReader
    public String nextName() throws IOException {
        m66184a(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) m66182e()).next();
        String str = (String) entry.getKey();
        this.f44026d[this.f44025c - 1] = str;
        m66180h(entry.getValue());
        return str;
    }

    @Override // com.google.gson.stream.JsonReader
    public void nextNull() throws IOException {
        m66184a(JsonToken.NULL);
        m66181f();
        int i = this.f44025c;
        if (i > 0) {
            int[] iArr = this.f44027f;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public String nextString() throws IOException {
        JsonToken peek = peek();
        JsonToken jsonToken = JsonToken.STRING;
        if (peek != jsonToken && peek != JsonToken.NUMBER) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + peek + locationString());
        }
        String asString = ((JsonPrimitive) m66181f()).getAsString();
        int i = this.f44025c;
        if (i > 0) {
            int[] iArr = this.f44027f;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return asString;
    }

    @Override // com.google.gson.stream.JsonReader
    public JsonToken peek() throws IOException {
        if (this.f44025c == 0) {
            return JsonToken.END_DOCUMENT;
        }
        Object m66182e = m66182e();
        if (m66182e instanceof Iterator) {
            boolean z = this.f44024b[this.f44025c - 2] instanceof JsonObject;
            Iterator it = (Iterator) m66182e;
            if (it.hasNext()) {
                if (z) {
                    return JsonToken.NAME;
                }
                m66180h(it.next());
                return peek();
            } else if (z) {
                return JsonToken.END_OBJECT;
            } else {
                return JsonToken.END_ARRAY;
            }
        } else if (m66182e instanceof JsonObject) {
            return JsonToken.BEGIN_OBJECT;
        } else {
            if (m66182e instanceof JsonArray) {
                return JsonToken.BEGIN_ARRAY;
            }
            if (m66182e instanceof JsonPrimitive) {
                JsonPrimitive jsonPrimitive = (JsonPrimitive) m66182e;
                if (jsonPrimitive.isString()) {
                    return JsonToken.STRING;
                }
                if (jsonPrimitive.isBoolean()) {
                    return JsonToken.BOOLEAN;
                }
                if (jsonPrimitive.isNumber()) {
                    return JsonToken.NUMBER;
                }
                throw new AssertionError();
            } else if (m66182e instanceof JsonNull) {
                return JsonToken.NULL;
            } else {
                if (m66182e == f44023h) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new AssertionError();
            }
        }
    }

    public void promoteNameToValue() throws IOException {
        m66184a(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) m66182e()).next();
        m66180h(entry.getValue());
        m66180h(new JsonPrimitive((String) entry.getKey()));
    }

    @Override // com.google.gson.stream.JsonReader
    public void skipValue() throws IOException {
        if (peek() == JsonToken.NAME) {
            nextName();
            this.f44026d[this.f44025c - 2] = "null";
        } else {
            m66181f();
            int i = this.f44025c;
            if (i > 0) {
                this.f44026d[i - 1] = "null";
            }
        }
        int i2 = this.f44025c;
        if (i2 > 0) {
            int[] iArr = this.f44027f;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public String toString() {
        return JsonTreeReader.class.getSimpleName() + locationString();
    }
}
