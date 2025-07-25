package com.google.common.p384io;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;
import java.util.ArrayDeque;
import java.util.Queue;

@ElementTypesAreNonnullByDefault
@Beta
@GwtIncompatible
/* renamed from: com.google.common.io.LineReader */
/* loaded from: classes4.dex */
public final class LineReader {

    /* renamed from: a */
    private final Readable f41308a;

    /* renamed from: b */
    private final Reader f41309b;

    /* renamed from: c */
    private final CharBuffer f41310c;

    /* renamed from: d */
    private final char[] f41311d;

    /* renamed from: e */
    private final Queue<String> f41312e;

    /* renamed from: f */
    private final LineBuffer f41313f;

    public LineReader(Readable readable) {
        Reader reader;
        CharBuffer m68232c = CharStreams.m68232c();
        this.f41310c = m68232c;
        this.f41311d = m68232c.array();
        this.f41312e = new ArrayDeque();
        this.f41313f = new LineBuffer() { // from class: com.google.common.io.LineReader.1
            @Override // com.google.common.p384io.LineBuffer
            /* renamed from: d */
            protected void mo68213d(String str, String str2) {
                LineReader.this.f41312e.add(str);
            }
        };
        this.f41308a = (Readable) Preconditions.checkNotNull(readable);
        if (readable instanceof Reader) {
            reader = (Reader) readable;
        } else {
            reader = null;
        }
        this.f41309b = reader;
    }

    @CanIgnoreReturnValue
    public String readLine() throws IOException {
        int read;
        while (true) {
            if (this.f41312e.peek() != null) {
                break;
            }
            Java8Compatibility.m68221a(this.f41310c);
            Reader reader = this.f41309b;
            if (reader != null) {
                char[] cArr = this.f41311d;
                read = reader.read(cArr, 0, cArr.length);
            } else {
                read = this.f41308a.read(this.f41310c);
            }
            if (read == -1) {
                this.f41313f.m68216b();
                break;
            }
            this.f41313f.m68217a(this.f41311d, 0, read);
        }
        return this.f41312e.poll();
    }
}
