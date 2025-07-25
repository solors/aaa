package com.zeus.gmc.sdk.mobileads.columbus.gson.internal;

import com.zeus.gmc.sdk.mobileads.columbus.gson.JsonElement;
import com.zeus.gmc.sdk.mobileads.columbus.gson.JsonIOException;
import com.zeus.gmc.sdk.mobileads.columbus.gson.JsonNull;
import com.zeus.gmc.sdk.mobileads.columbus.gson.JsonParseException;
import com.zeus.gmc.sdk.mobileads.columbus.gson.JsonSyntaxException;
import com.zeus.gmc.sdk.mobileads.columbus.gson.internal.bind.TypeAdapters;
import com.zeus.gmc.sdk.mobileads.columbus.gson.stream.JsonReader;
import com.zeus.gmc.sdk.mobileads.columbus.gson.stream.JsonWriter;
import com.zeus.gmc.sdk.mobileads.columbus.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;

/* loaded from: classes8.dex */
public final class Streams {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes8.dex */
    public static final class AppendableWriter extends Writer {
        private final Appendable appendable;
        private final CurrentWrite currentWrite;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes8.dex */
        public static class CurrentWrite implements CharSequence {
            char[] chars;

            CurrentWrite() {
            }

            @Override // java.lang.CharSequence
            public char charAt(int i) {
                return this.chars[i];
            }

            @Override // java.lang.CharSequence
            public int length() {
                return this.chars.length;
            }

            @Override // java.lang.CharSequence
            public CharSequence subSequence(int i, int i2) {
                return new String(this.chars, i, i2 - i);
            }
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i, int i2) throws IOException {
            CurrentWrite currentWrite = this.currentWrite;
            currentWrite.chars = cArr;
            this.appendable.append(currentWrite, i, i2 + i);
        }

        private AppendableWriter(Appendable appendable) {
            this.currentWrite = new CurrentWrite();
            this.appendable = appendable;
        }

        @Override // java.io.Writer
        public void write(int i) throws IOException {
            this.appendable.append((char) i);
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }
    }

    private Streams() {
        throw new UnsupportedOperationException();
    }

    public static JsonElement parse(JsonReader jsonReader) throws JsonParseException {
        boolean z;
        try {
            try {
                jsonReader.peek();
                z = false;
                try {
                    return TypeAdapters.JSON_ELEMENT.read(jsonReader);
                } catch (EOFException e) {
                    e = e;
                    if (z) {
                        return JsonNull.INSTANCE;
                    }
                    throw new JsonSyntaxException(e);
                }
            } catch (MalformedJsonException e2) {
                throw new JsonSyntaxException(e2);
            } catch (IOException e3) {
                throw new JsonIOException(e3);
            } catch (NumberFormatException e4) {
                throw new JsonSyntaxException(e4);
            }
        } catch (EOFException e5) {
            e = e5;
            z = true;
        }
    }

    public static void write(JsonElement jsonElement, JsonWriter jsonWriter) throws IOException {
        TypeAdapters.JSON_ELEMENT.write(jsonWriter, jsonElement);
    }

    public static Writer writerForAppendable(Appendable appendable) {
        if (appendable instanceof Writer) {
            return (Writer) appendable;
        }
        return new AppendableWriter(appendable);
    }
}
