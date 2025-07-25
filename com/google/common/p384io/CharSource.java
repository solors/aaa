package com.google.common.p384io;

import com.amazon.aps.shared.util.APSSharedUtil;
import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Ascii;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;
import com.google.common.collect.AbstractIterator;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* renamed from: com.google.common.io.CharSource */
/* loaded from: classes4.dex */
public abstract class CharSource {

    /* renamed from: com.google.common.io.CharSource$AsByteSource */
    /* loaded from: classes4.dex */
    private final class AsByteSource extends ByteSource {

        /* renamed from: a */
        final Charset f41270a;

        AsByteSource(Charset charset) {
            this.f41270a = (Charset) Preconditions.checkNotNull(charset);
        }

        @Override // com.google.common.p384io.ByteSource
        public CharSource asCharSource(Charset charset) {
            if (charset.equals(this.f41270a)) {
                return CharSource.this;
            }
            return super.asCharSource(charset);
        }

        @Override // com.google.common.p384io.ByteSource
        public InputStream openStream() throws IOException {
            return new ReaderInputStream(CharSource.this.openStream(), this.f41270a, 8192);
        }

        public String toString() {
            String obj = CharSource.this.toString();
            String valueOf = String.valueOf(this.f41270a);
            StringBuilder sb2 = new StringBuilder(String.valueOf(obj).length() + 15 + valueOf.length());
            sb2.append(obj);
            sb2.append(".asByteSource(");
            sb2.append(valueOf);
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* renamed from: com.google.common.io.CharSource$CharSequenceCharSource */
    /* loaded from: classes4.dex */
    private static class CharSequenceCharSource extends CharSource {

        /* renamed from: b */
        private static final Splitter f41272b = Splitter.onPattern("\r\n|\n|\r");

        /* renamed from: a */
        protected final CharSequence f41273a;

        protected CharSequenceCharSource(CharSequence charSequence) {
            this.f41273a = (CharSequence) Preconditions.checkNotNull(charSequence);
        }

        /* renamed from: c */
        private Iterator<String> m68237c() {
            return new AbstractIterator<String>() { // from class: com.google.common.io.CharSource.CharSequenceCharSource.1

                /* renamed from: d */
                Iterator<String> f41274d;

                {
                    this.f41274d = CharSequenceCharSource.f41272b.split(CharSequenceCharSource.this.f41273a).iterator();
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.common.collect.AbstractIterator
                /* renamed from: c */
                public String computeNext() {
                    if (this.f41274d.hasNext()) {
                        String next = this.f41274d.next();
                        if (this.f41274d.hasNext() || !next.isEmpty()) {
                            return next;
                        }
                    }
                    return m69807a();
                }
            };
        }

        @Override // com.google.common.p384io.CharSource
        public boolean isEmpty() {
            if (this.f41273a.length() == 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.common.p384io.CharSource
        public long length() {
            return this.f41273a.length();
        }

        @Override // com.google.common.p384io.CharSource
        public Optional<Long> lengthIfKnown() {
            return Optional.m70057of(Long.valueOf(this.f41273a.length()));
        }

        @Override // com.google.common.p384io.CharSource
        public Reader openStream() {
            return new CharSequenceReader(this.f41273a);
        }

        @Override // com.google.common.p384io.CharSource
        public String read() {
            return this.f41273a.toString();
        }

        @Override // com.google.common.p384io.CharSource
        public String readFirstLine() {
            Iterator<String> m68237c = m68237c();
            if (m68237c.hasNext()) {
                return m68237c.next();
            }
            return null;
        }

        @Override // com.google.common.p384io.CharSource
        public ImmutableList<String> readLines() {
            return ImmutableList.copyOf(m68237c());
        }

        public String toString() {
            String truncate = Ascii.truncate(this.f41273a, 30, APSSharedUtil.TRUNCATE_SEPARATOR);
            StringBuilder sb2 = new StringBuilder(String.valueOf(truncate).length() + 17);
            sb2.append("CharSource.wrap(");
            sb2.append(truncate);
            sb2.append(")");
            return sb2.toString();
        }

        @Override // com.google.common.p384io.CharSource
        @ParametricNullness
        public <T> T readLines(LineProcessor<T> lineProcessor) throws IOException {
            Iterator<String> m68237c = m68237c();
            while (m68237c.hasNext() && lineProcessor.processLine(m68237c.next())) {
            }
            return lineProcessor.getResult();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.common.io.CharSource$ConcatenatedCharSource */
    /* loaded from: classes4.dex */
    public static final class ConcatenatedCharSource extends CharSource {

        /* renamed from: a */
        private final Iterable<? extends CharSource> f41276a;

        ConcatenatedCharSource(Iterable<? extends CharSource> iterable) {
            this.f41276a = (Iterable) Preconditions.checkNotNull(iterable);
        }

        @Override // com.google.common.p384io.CharSource
        public boolean isEmpty() throws IOException {
            for (CharSource charSource : this.f41276a) {
                if (!charSource.isEmpty()) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.common.p384io.CharSource
        public long length() throws IOException {
            long j = 0;
            for (CharSource charSource : this.f41276a) {
                j += charSource.length();
            }
            return j;
        }

        @Override // com.google.common.p384io.CharSource
        public Optional<Long> lengthIfKnown() {
            long j = 0;
            for (CharSource charSource : this.f41276a) {
                Optional<Long> lengthIfKnown = charSource.lengthIfKnown();
                if (!lengthIfKnown.isPresent()) {
                    return Optional.absent();
                }
                j += lengthIfKnown.get().longValue();
            }
            return Optional.m70057of(Long.valueOf(j));
        }

        @Override // com.google.common.p384io.CharSource
        public Reader openStream() throws IOException {
            return new MultiReader(this.f41276a.iterator());
        }

        public String toString() {
            String valueOf = String.valueOf(this.f41276a);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 19);
            sb2.append("CharSource.concat(");
            sb2.append(valueOf);
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* renamed from: com.google.common.io.CharSource$EmptyCharSource */
    /* loaded from: classes4.dex */
    private static final class EmptyCharSource extends StringCharSource {

        /* renamed from: c */
        private static final EmptyCharSource f41277c = new EmptyCharSource();

        private EmptyCharSource() {
            super("");
        }

        @Override // com.google.common.p384io.CharSource.CharSequenceCharSource
        public String toString() {
            return "CharSource.empty()";
        }
    }

    /* renamed from: a */
    private long m68239a(Reader reader) throws IOException {
        long j = 0;
        while (true) {
            long skip = reader.skip(Long.MAX_VALUE);
            if (skip != 0) {
                j += skip;
            } else {
                return j;
            }
        }
    }

    public static CharSource concat(Iterable<? extends CharSource> iterable) {
        return new ConcatenatedCharSource(iterable);
    }

    public static CharSource empty() {
        return EmptyCharSource.f41277c;
    }

    public static CharSource wrap(CharSequence charSequence) {
        if (charSequence instanceof String) {
            return new StringCharSource((String) charSequence);
        }
        return new CharSequenceCharSource(charSequence);
    }

    @Beta
    public ByteSource asByteSource(Charset charset) {
        return new AsByteSource(charset);
    }

    @CanIgnoreReturnValue
    public long copyTo(Appendable appendable) throws IOException {
        Preconditions.checkNotNull(appendable);
        try {
            return CharStreams.copy((Reader) Closer.create().register(openStream()), appendable);
        } finally {
        }
    }

    public boolean isEmpty() throws IOException {
        Optional<Long> lengthIfKnown = lengthIfKnown();
        boolean z = true;
        if (lengthIfKnown.isPresent()) {
            if (lengthIfKnown.get().longValue() == 0) {
                return true;
            }
            return false;
        }
        Closer create = Closer.create();
        try {
            if (((Reader) create.register(openStream())).read() != -1) {
                z = false;
            }
            return z;
        } catch (Throwable th) {
            try {
                throw create.rethrow(th);
            } finally {
                create.close();
            }
        }
    }

    @Beta
    public long length() throws IOException {
        Optional<Long> lengthIfKnown = lengthIfKnown();
        if (lengthIfKnown.isPresent()) {
            return lengthIfKnown.get().longValue();
        }
        try {
            return m68239a((Reader) Closer.create().register(openStream()));
        } finally {
        }
    }

    @Beta
    public Optional<Long> lengthIfKnown() {
        return Optional.absent();
    }

    public BufferedReader openBufferedStream() throws IOException {
        Reader openStream = openStream();
        if (openStream instanceof BufferedReader) {
            return (BufferedReader) openStream;
        }
        return new BufferedReader(openStream);
    }

    public abstract Reader openStream() throws IOException;

    public String read() throws IOException {
        try {
            return CharStreams.toString((Reader) Closer.create().register(openStream()));
        } finally {
        }
    }

    public String readFirstLine() throws IOException {
        try {
            return ((BufferedReader) Closer.create().register(openBufferedStream())).readLine();
        } finally {
        }
    }

    public ImmutableList<String> readLines() throws IOException {
        try {
            BufferedReader bufferedReader = (BufferedReader) Closer.create().register(openBufferedStream());
            ArrayList newArrayList = Lists.newArrayList();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    newArrayList.add(readLine);
                } else {
                    return ImmutableList.copyOf((Collection) newArrayList);
                }
            }
        } finally {
        }
    }

    /* renamed from: com.google.common.io.CharSource$StringCharSource */
    /* loaded from: classes4.dex */
    private static class StringCharSource extends CharSequenceCharSource {
        protected StringCharSource(String str) {
            super(str);
        }

        @Override // com.google.common.p384io.CharSource
        public long copyTo(Appendable appendable) throws IOException {
            appendable.append(this.f41273a);
            return this.f41273a.length();
        }

        @Override // com.google.common.p384io.CharSource.CharSequenceCharSource, com.google.common.p384io.CharSource
        public Reader openStream() {
            return new StringReader((String) this.f41273a);
        }

        @Override // com.google.common.p384io.CharSource
        public long copyTo(CharSink charSink) throws IOException {
            Closer create;
            Preconditions.checkNotNull(charSink);
            try {
                ((Writer) Closer.create().register(charSink.openStream())).write((String) this.f41273a);
                return this.f41273a.length();
            } finally {
            }
        }
    }

    public static CharSource concat(Iterator<? extends CharSource> it) {
        return concat(ImmutableList.copyOf(it));
    }

    public static CharSource concat(CharSource... charSourceArr) {
        return concat(ImmutableList.copyOf(charSourceArr));
    }

    @CanIgnoreReturnValue
    public long copyTo(CharSink charSink) throws IOException {
        Preconditions.checkNotNull(charSink);
        Closer create = Closer.create();
        try {
            return CharStreams.copy((Reader) create.register(openStream()), (Writer) create.register(charSink.openStream()));
        } finally {
        }
    }

    @Beta
    @CanIgnoreReturnValue
    @ParametricNullness
    public <T> T readLines(LineProcessor<T> lineProcessor) throws IOException {
        Preconditions.checkNotNull(lineProcessor);
        try {
            return (T) CharStreams.readLines((Reader) Closer.create().register(openStream()), lineProcessor);
        } finally {
        }
    }
}
