package com.google.gson;

import com.google.gson.internal.Streams;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes5.dex */
public final class JsonStreamParser implements Iterator<JsonElement> {

    /* renamed from: b */
    private final JsonReader f43898b;

    /* renamed from: c */
    private final Object f43899c;

    public JsonStreamParser(String str) {
        this(new StringReader(str));
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        boolean z;
        synchronized (this.f43899c) {
            try {
                try {
                    try {
                        if (this.f43898b.peek() != JsonToken.END_DOCUMENT) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } catch (MalformedJsonException e) {
                        throw new JsonSyntaxException(e);
                    }
                } catch (IOException e2) {
                    throw new JsonIOException(e2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    public JsonStreamParser(Reader reader) {
        JsonReader jsonReader = new JsonReader(reader);
        this.f43898b = jsonReader;
        jsonReader.setLenient(true);
        this.f43899c = new Object();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public JsonElement next() throws JsonParseException {
        if (hasNext()) {
            try {
                return Streams.parse(this.f43898b);
            } catch (JsonParseException e) {
                if (e.getCause() instanceof EOFException) {
                    throw new NoSuchElementException();
                }
                throw e;
            } catch (OutOfMemoryError e2) {
                throw new JsonParseException("Failed parsing JSON source to Json", e2);
            } catch (StackOverflowError e3) {
                throw new JsonParseException("Failed parsing JSON source to Json", e3);
            }
        }
        throw new NoSuchElementException();
    }
}
