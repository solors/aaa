package com.zeus.gmc.sdk.mobileads.columbus.gson.internal.bind;

import com.zeus.gmc.sdk.mobileads.columbus.gson.JsonArray;
import com.zeus.gmc.sdk.mobileads.columbus.gson.JsonElement;
import com.zeus.gmc.sdk.mobileads.columbus.gson.JsonNull;
import com.zeus.gmc.sdk.mobileads.columbus.gson.JsonObject;
import com.zeus.gmc.sdk.mobileads.columbus.gson.JsonPrimitive;
import com.zeus.gmc.sdk.mobileads.columbus.gson.stream.JsonReader;
import com.zeus.gmc.sdk.mobileads.columbus.gson.stream.JsonToken;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public final class JsonTreeReader extends JsonReader {
    private final List<Object> stack;
    private static final Reader UNREADABLE_READER = new Reader() { // from class: com.zeus.gmc.sdk.mobileads.columbus.gson.internal.bind.JsonTreeReader.1
        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i, int i2) throws IOException {
            throw new AssertionError();
        }
    };
    private static final Object SENTINEL_CLOSED = new Object();

    public JsonTreeReader(JsonElement jsonElement) {
        super(UNREADABLE_READER);
        ArrayList arrayList = new ArrayList();
        this.stack = arrayList;
        arrayList.add(jsonElement);
    }

    private void expect(JsonToken jsonToken) throws IOException {
        if (peek() == jsonToken) {
            return;
        }
        throw new IllegalStateException("Expected " + jsonToken + " but was " + peek());
    }

    private Object peekStack() {
        List<Object> list = this.stack;
        return list.get(list.size() - 1);
    }

    private Object popStack() {
        List<Object> list = this.stack;
        return list.remove(list.size() - 1);
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.gson.stream.JsonReader
    public void beginArray() throws IOException {
        expect(JsonToken.BEGIN_ARRAY);
        this.stack.add(((JsonArray) peekStack()).iterator());
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.gson.stream.JsonReader
    public void beginObject() throws IOException {
        expect(JsonToken.BEGIN_OBJECT);
        this.stack.add(((JsonObject) peekStack()).entrySet().iterator());
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.gson.stream.JsonReader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.stack.clear();
        this.stack.add(SENTINEL_CLOSED);
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.gson.stream.JsonReader
    public void endArray() throws IOException {
        expect(JsonToken.END_ARRAY);
        popStack();
        popStack();
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.gson.stream.JsonReader
    public void endObject() throws IOException {
        expect(JsonToken.END_OBJECT);
        popStack();
        popStack();
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.gson.stream.JsonReader
    public boolean hasNext() throws IOException {
        JsonToken peek = peek();
        if (peek != JsonToken.END_OBJECT && peek != JsonToken.END_ARRAY) {
            return true;
        }
        return false;
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.gson.stream.JsonReader
    public boolean nextBoolean() throws IOException {
        expect(JsonToken.BOOLEAN);
        return ((JsonPrimitive) popStack()).getAsBoolean();
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.gson.stream.JsonReader
    public double nextDouble() throws IOException {
        JsonToken peek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (peek != jsonToken && peek != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + peek);
        }
        double asDouble = ((JsonPrimitive) peekStack()).getAsDouble();
        if (!isLenient() && (Double.isNaN(asDouble) || Double.isInfinite(asDouble))) {
            throw new NumberFormatException("JSON forbids NaN and infinities: " + asDouble);
        }
        popStack();
        return asDouble;
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.gson.stream.JsonReader
    public int nextInt() throws IOException {
        JsonToken peek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (peek != jsonToken && peek != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + peek);
        }
        int asInt = ((JsonPrimitive) peekStack()).getAsInt();
        popStack();
        return asInt;
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.gson.stream.JsonReader
    public long nextLong() throws IOException {
        JsonToken peek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (peek != jsonToken && peek != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + peek);
        }
        long asLong = ((JsonPrimitive) peekStack()).getAsLong();
        popStack();
        return asLong;
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.gson.stream.JsonReader
    public String nextName() throws IOException {
        expect(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) peekStack()).next();
        this.stack.add(entry.getValue());
        return (String) entry.getKey();
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.gson.stream.JsonReader
    public void nextNull() throws IOException {
        expect(JsonToken.NULL);
        popStack();
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.gson.stream.JsonReader
    public String nextString() throws IOException {
        JsonToken peek = peek();
        JsonToken jsonToken = JsonToken.STRING;
        if (peek != jsonToken && peek != JsonToken.NUMBER) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + peek);
        }
        return ((JsonPrimitive) popStack()).getAsString();
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.gson.stream.JsonReader
    public JsonToken peek() throws IOException {
        if (this.stack.isEmpty()) {
            return JsonToken.END_DOCUMENT;
        }
        Object peekStack = peekStack();
        if (peekStack instanceof Iterator) {
            List<Object> list = this.stack;
            boolean z = list.get(list.size() - 2) instanceof JsonObject;
            Iterator it = (Iterator) peekStack;
            if (it.hasNext()) {
                if (z) {
                    return JsonToken.NAME;
                }
                this.stack.add(it.next());
                return peek();
            } else if (z) {
                return JsonToken.END_OBJECT;
            } else {
                return JsonToken.END_ARRAY;
            }
        } else if (peekStack instanceof JsonObject) {
            return JsonToken.BEGIN_OBJECT;
        } else {
            if (peekStack instanceof JsonArray) {
                return JsonToken.BEGIN_ARRAY;
            }
            if (peekStack instanceof JsonPrimitive) {
                JsonPrimitive jsonPrimitive = (JsonPrimitive) peekStack;
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
            } else if (peekStack instanceof JsonNull) {
                return JsonToken.NULL;
            } else {
                if (peekStack == SENTINEL_CLOSED) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new AssertionError();
            }
        }
    }

    public void promoteNameToValue() throws IOException {
        expect(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) peekStack()).next();
        this.stack.add(entry.getValue());
        this.stack.add(new JsonPrimitive((String) entry.getKey()));
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.gson.stream.JsonReader
    public void skipValue() throws IOException {
        if (peek() == JsonToken.NAME) {
            nextName();
        } else {
            popStack();
        }
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.gson.stream.JsonReader
    public String toString() {
        return JsonTreeReader.class.getSimpleName();
    }
}
