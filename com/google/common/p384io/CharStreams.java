package com.google.common.p384io;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.List;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* renamed from: com.google.common.io.CharStreams */
/* loaded from: classes4.dex */
public final class CharStreams {

    /* renamed from: com.google.common.io.CharStreams$NullWriter */
    /* loaded from: classes4.dex */
    private static final class NullWriter extends Writer {

        /* renamed from: b */
        private static final NullWriter f41278b = new NullWriter();

        private NullWriter() {
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(char c) {
            return this;
        }

        public String toString() {
            return "CharStreams.nullWriter()";
        }

        @Override // java.io.Writer
        public void write(int i) {
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(CharSequence charSequence) {
            return this;
        }

        @Override // java.io.Writer
        public void write(char[] cArr) {
            Preconditions.checkNotNull(cArr);
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i, int i2) {
            Preconditions.checkPositionIndexes(i, i2 + i, cArr.length);
        }

        @Override // java.io.Writer
        public void write(String str) {
            Preconditions.checkNotNull(str);
        }

        @Override // java.io.Writer
        public void write(String str, int i, int i2) {
            Preconditions.checkPositionIndexes(i, i2 + i, str.length());
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(CharSequence charSequence, int i, int i2) {
            Preconditions.checkPositionIndexes(i, i2, charSequence == null ? 4 : charSequence.length());
            return this;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }
    }

    private CharStreams() {
    }

    @CanIgnoreReturnValue
    /* renamed from: a */
    static long m68234a(Reader reader, StringBuilder sb2) throws IOException {
        Preconditions.checkNotNull(reader);
        Preconditions.checkNotNull(sb2);
        char[] cArr = new char[2048];
        long j = 0;
        while (true) {
            int read = reader.read(cArr);
            if (read != -1) {
                sb2.append(cArr, 0, read);
                j += read;
            } else {
                return j;
            }
        }
    }

    @Beta
    public static Writer asWriter(Appendable appendable) {
        if (appendable instanceof Writer) {
            return (Writer) appendable;
        }
        return new AppendableWriter(appendable);
    }

    @CanIgnoreReturnValue
    /* renamed from: b */
    static long m68233b(Reader reader, Writer writer) throws IOException {
        Preconditions.checkNotNull(reader);
        Preconditions.checkNotNull(writer);
        char[] cArr = new char[2048];
        long j = 0;
        while (true) {
            int read = reader.read(cArr);
            if (read != -1) {
                writer.write(cArr, 0, read);
                j += read;
            } else {
                return j;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static CharBuffer m68232c() {
        return CharBuffer.allocate(2048);
    }

    @CanIgnoreReturnValue
    public static long copy(Readable readable, Appendable appendable) throws IOException {
        if (readable instanceof Reader) {
            if (appendable instanceof StringBuilder) {
                return m68234a((Reader) readable, (StringBuilder) appendable);
            }
            return m68233b((Reader) readable, asWriter(appendable));
        }
        Preconditions.checkNotNull(readable);
        Preconditions.checkNotNull(appendable);
        CharBuffer m68232c = m68232c();
        long j = 0;
        while (readable.read(m68232c) != -1) {
            Java8Compatibility.m68220b(m68232c);
            appendable.append(m68232c);
            j += m68232c.remaining();
            Java8Compatibility.m68221a(m68232c);
        }
        return j;
    }

    /* renamed from: d */
    private static StringBuilder m68231d(Readable readable) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        if (readable instanceof Reader) {
            m68234a((Reader) readable, sb2);
        } else {
            copy(readable, sb2);
        }
        return sb2;
    }

    @CanIgnoreReturnValue
    @Beta
    public static long exhaust(Readable readable) throws IOException {
        CharBuffer m68232c = m68232c();
        long j = 0;
        while (true) {
            long read = readable.read(m68232c);
            if (read != -1) {
                j += read;
                Java8Compatibility.m68221a(m68232c);
            } else {
                return j;
            }
        }
    }

    @Beta
    public static Writer nullWriter() {
        return NullWriter.f41278b;
    }

    @Beta
    public static List<String> readLines(Readable readable) throws IOException {
        ArrayList arrayList = new ArrayList();
        LineReader lineReader = new LineReader(readable);
        while (true) {
            String readLine = lineReader.readLine();
            if (readLine == null) {
                return arrayList;
            }
            arrayList.add(readLine);
        }
    }

    @Beta
    public static void skipFully(Reader reader, long j) throws IOException {
        Preconditions.checkNotNull(reader);
        while (j > 0) {
            long skip = reader.skip(j);
            if (skip != 0) {
                j -= skip;
            } else {
                throw new EOFException();
            }
        }
    }

    public static String toString(Readable readable) throws IOException {
        return m68231d(readable).toString();
    }

    @Beta
    @CanIgnoreReturnValue
    @ParametricNullness
    public static <T> T readLines(Readable readable, LineProcessor<T> lineProcessor) throws IOException {
        String readLine;
        Preconditions.checkNotNull(readable);
        Preconditions.checkNotNull(lineProcessor);
        LineReader lineReader = new LineReader(readable);
        do {
            readLine = lineReader.readLine();
            if (readLine == null) {
                break;
            }
        } while (lineProcessor.processLine(readLine));
        return lineProcessor.getResult();
    }
}
