package com.google.common.p384io;

import com.amazon.aps.shared.util.APSSharedUtil;
import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Ascii;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.hash.Funnels;
import com.google.common.hash.HashCode;
import com.google.common.hash.HashFunction;
import com.google.common.hash.Hasher;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* renamed from: com.google.common.io.ByteSource */
/* loaded from: classes4.dex */
public abstract class ByteSource {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.common.io.ByteSource$AsCharSource */
    /* loaded from: classes4.dex */
    public class AsCharSource extends CharSource {

        /* renamed from: a */
        final Charset f41251a;

        AsCharSource(Charset charset) {
            this.f41251a = (Charset) Preconditions.checkNotNull(charset);
        }

        @Override // com.google.common.p384io.CharSource
        public ByteSource asByteSource(Charset charset) {
            if (charset.equals(this.f41251a)) {
                return ByteSource.this;
            }
            return super.asByteSource(charset);
        }

        @Override // com.google.common.p384io.CharSource
        public Reader openStream() throws IOException {
            return new InputStreamReader(ByteSource.this.openStream(), this.f41251a);
        }

        @Override // com.google.common.p384io.CharSource
        public String read() throws IOException {
            return new String(ByteSource.this.read(), this.f41251a);
        }

        public String toString() {
            String obj = ByteSource.this.toString();
            String valueOf = String.valueOf(this.f41251a);
            StringBuilder sb2 = new StringBuilder(String.valueOf(obj).length() + 15 + valueOf.length());
            sb2.append(obj);
            sb2.append(".asCharSource(");
            sb2.append(valueOf);
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* renamed from: com.google.common.io.ByteSource$ByteArrayByteSource */
    /* loaded from: classes4.dex */
    private static class ByteArrayByteSource extends ByteSource {

        /* renamed from: a */
        final byte[] f41253a;

        /* renamed from: b */
        final int f41254b;

        /* renamed from: c */
        final int f41255c;

        ByteArrayByteSource(byte[] bArr) {
            this(bArr, 0, bArr.length);
        }

        @Override // com.google.common.p384io.ByteSource
        public long copyTo(OutputStream outputStream) throws IOException {
            outputStream.write(this.f41253a, this.f41254b, this.f41255c);
            return this.f41255c;
        }

        @Override // com.google.common.p384io.ByteSource
        public HashCode hash(HashFunction hashFunction) throws IOException {
            return hashFunction.hashBytes(this.f41253a, this.f41254b, this.f41255c);
        }

        @Override // com.google.common.p384io.ByteSource
        public boolean isEmpty() {
            if (this.f41255c == 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.common.p384io.ByteSource
        public InputStream openBufferedStream() throws IOException {
            return openStream();
        }

        @Override // com.google.common.p384io.ByteSource
        public InputStream openStream() {
            return new ByteArrayInputStream(this.f41253a, this.f41254b, this.f41255c);
        }

        @Override // com.google.common.p384io.ByteSource
        public byte[] read() {
            byte[] bArr = this.f41253a;
            int i = this.f41254b;
            return Arrays.copyOfRange(bArr, i, this.f41255c + i);
        }

        @Override // com.google.common.p384io.ByteSource
        public long size() {
            return this.f41255c;
        }

        @Override // com.google.common.p384io.ByteSource
        public Optional<Long> sizeIfKnown() {
            return Optional.m70057of(Long.valueOf(this.f41255c));
        }

        @Override // com.google.common.p384io.ByteSource
        public ByteSource slice(long j, long j2) {
            boolean z;
            boolean z2 = true;
            if (j >= 0) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "offset (%s) may not be negative", j);
            if (j2 < 0) {
                z2 = false;
            }
            Preconditions.checkArgument(z2, "length (%s) may not be negative", j2);
            long min = Math.min(j, this.f41255c);
            return new ByteArrayByteSource(this.f41253a, this.f41254b + ((int) min), (int) Math.min(j2, this.f41255c - min));
        }

        public String toString() {
            String truncate = Ascii.truncate(BaseEncoding.base16().encode(this.f41253a, this.f41254b, this.f41255c), 30, APSSharedUtil.TRUNCATE_SEPARATOR);
            StringBuilder sb2 = new StringBuilder(String.valueOf(truncate).length() + 17);
            sb2.append("ByteSource.wrap(");
            sb2.append(truncate);
            sb2.append(")");
            return sb2.toString();
        }

        ByteArrayByteSource(byte[] bArr, int i, int i2) {
            this.f41253a = bArr;
            this.f41254b = i;
            this.f41255c = i2;
        }

        @Override // com.google.common.p384io.ByteSource
        @ParametricNullness
        public <T> T read(ByteProcessor<T> byteProcessor) throws IOException {
            byteProcessor.processBytes(this.f41253a, this.f41254b, this.f41255c);
            return byteProcessor.getResult();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.common.io.ByteSource$ConcatenatedByteSource */
    /* loaded from: classes4.dex */
    public static final class ConcatenatedByteSource extends ByteSource {

        /* renamed from: a */
        final Iterable<? extends ByteSource> f41256a;

        ConcatenatedByteSource(Iterable<? extends ByteSource> iterable) {
            this.f41256a = (Iterable) Preconditions.checkNotNull(iterable);
        }

        @Override // com.google.common.p384io.ByteSource
        public boolean isEmpty() throws IOException {
            for (ByteSource byteSource : this.f41256a) {
                if (!byteSource.isEmpty()) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.common.p384io.ByteSource
        public InputStream openStream() throws IOException {
            return new MultiInputStream(this.f41256a.iterator());
        }

        @Override // com.google.common.p384io.ByteSource
        public long size() throws IOException {
            long j = 0;
            for (ByteSource byteSource : this.f41256a) {
                j += byteSource.size();
                if (j < 0) {
                    return Long.MAX_VALUE;
                }
            }
            return j;
        }

        @Override // com.google.common.p384io.ByteSource
        public Optional<Long> sizeIfKnown() {
            Iterable<? extends ByteSource> iterable = this.f41256a;
            if (!(iterable instanceof Collection)) {
                return Optional.absent();
            }
            long j = 0;
            for (ByteSource byteSource : iterable) {
                Optional<Long> sizeIfKnown = byteSource.sizeIfKnown();
                if (!sizeIfKnown.isPresent()) {
                    return Optional.absent();
                }
                j += sizeIfKnown.get().longValue();
                if (j < 0) {
                    return Optional.m70057of(Long.MAX_VALUE);
                }
            }
            return Optional.m70057of(Long.valueOf(j));
        }

        public String toString() {
            String valueOf = String.valueOf(this.f41256a);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 19);
            sb2.append("ByteSource.concat(");
            sb2.append(valueOf);
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.common.io.ByteSource$EmptyByteSource */
    /* loaded from: classes4.dex */
    public static final class EmptyByteSource extends ByteArrayByteSource {

        /* renamed from: d */
        static final EmptyByteSource f41257d = new EmptyByteSource();

        EmptyByteSource() {
            super(new byte[0]);
        }

        @Override // com.google.common.p384io.ByteSource
        public CharSource asCharSource(Charset charset) {
            Preconditions.checkNotNull(charset);
            return CharSource.empty();
        }

        @Override // com.google.common.p384io.ByteSource.ByteArrayByteSource, com.google.common.p384io.ByteSource
        public byte[] read() {
            return this.f41253a;
        }

        @Override // com.google.common.p384io.ByteSource.ByteArrayByteSource
        public String toString() {
            return "ByteSource.empty()";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.common.io.ByteSource$SlicedByteSource */
    /* loaded from: classes4.dex */
    public final class SlicedByteSource extends ByteSource {

        /* renamed from: a */
        final long f41258a;

        /* renamed from: b */
        final long f41259b;

        SlicedByteSource(long j, long j2) {
            boolean z;
            if (j >= 0) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "offset (%s) may not be negative", j);
            Preconditions.checkArgument(j2 >= 0, "length (%s) may not be negative", j2);
            this.f41258a = j;
            this.f41259b = j2;
        }

        /* renamed from: b */
        private InputStream m68249b(InputStream inputStream) throws IOException {
            long j = this.f41258a;
            if (j > 0) {
                try {
                    if (ByteStreams.m68245d(inputStream, j) < this.f41258a) {
                        inputStream.close();
                        return new ByteArrayInputStream(new byte[0]);
                    }
                } finally {
                }
            }
            return ByteStreams.limit(inputStream, this.f41259b);
        }

        @Override // com.google.common.p384io.ByteSource
        public boolean isEmpty() throws IOException {
            if (this.f41259b != 0 && !super.isEmpty()) {
                return false;
            }
            return true;
        }

        @Override // com.google.common.p384io.ByteSource
        public InputStream openBufferedStream() throws IOException {
            return m68249b(ByteSource.this.openBufferedStream());
        }

        @Override // com.google.common.p384io.ByteSource
        public InputStream openStream() throws IOException {
            return m68249b(ByteSource.this.openStream());
        }

        @Override // com.google.common.p384io.ByteSource
        public Optional<Long> sizeIfKnown() {
            Optional<Long> sizeIfKnown = ByteSource.this.sizeIfKnown();
            if (sizeIfKnown.isPresent()) {
                long longValue = sizeIfKnown.get().longValue();
                return Optional.m70057of(Long.valueOf(Math.min(this.f41259b, longValue - Math.min(this.f41258a, longValue))));
            }
            return Optional.absent();
        }

        @Override // com.google.common.p384io.ByteSource
        public ByteSource slice(long j, long j2) {
            boolean z;
            boolean z2 = true;
            if (j >= 0) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "offset (%s) may not be negative", j);
            if (j2 < 0) {
                z2 = false;
            }
            Preconditions.checkArgument(z2, "length (%s) may not be negative", j2);
            long j3 = this.f41259b - j;
            if (j3 <= 0) {
                return ByteSource.empty();
            }
            return ByteSource.this.slice(this.f41258a + j, Math.min(j2, j3));
        }

        public String toString() {
            String obj = ByteSource.this.toString();
            long j = this.f41258a;
            long j2 = this.f41259b;
            StringBuilder sb2 = new StringBuilder(String.valueOf(obj).length() + 50);
            sb2.append(obj);
            sb2.append(".slice(");
            sb2.append(j);
            sb2.append(", ");
            sb2.append(j2);
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* renamed from: a */
    private long m68250a(InputStream inputStream) throws IOException {
        long j = 0;
        while (true) {
            long m68245d = ByteStreams.m68245d(inputStream, 2147483647L);
            if (m68245d > 0) {
                j += m68245d;
            } else {
                return j;
            }
        }
    }

    public static ByteSource concat(Iterable<? extends ByteSource> iterable) {
        return new ConcatenatedByteSource(iterable);
    }

    public static ByteSource empty() {
        return EmptyByteSource.f41257d;
    }

    public static ByteSource wrap(byte[] bArr) {
        return new ByteArrayByteSource(bArr);
    }

    public CharSource asCharSource(Charset charset) {
        return new AsCharSource(charset);
    }

    public boolean contentEquals(ByteSource byteSource) throws IOException {
        int read;
        Preconditions.checkNotNull(byteSource);
        byte[] m68247b = ByteStreams.m68247b();
        byte[] m68247b2 = ByteStreams.m68247b();
        Closer create = Closer.create();
        try {
            InputStream inputStream = (InputStream) create.register(openStream());
            InputStream inputStream2 = (InputStream) create.register(byteSource.openStream());
            do {
                read = ByteStreams.read(inputStream, m68247b, 0, m68247b.length);
                if (read == ByteStreams.read(inputStream2, m68247b2, 0, m68247b2.length) && Arrays.equals(m68247b, m68247b2)) {
                }
                return false;
            } while (read == m68247b.length);
            create.close();
            return true;
        } finally {
        }
    }

    @CanIgnoreReturnValue
    public long copyTo(OutputStream outputStream) throws IOException {
        Preconditions.checkNotNull(outputStream);
        try {
            return ByteStreams.copy((InputStream) Closer.create().register(openStream()), outputStream);
        } finally {
        }
    }

    public HashCode hash(HashFunction hashFunction) throws IOException {
        Hasher newHasher = hashFunction.newHasher();
        copyTo(Funnels.asOutputStream(newHasher));
        return newHasher.hash();
    }

    public boolean isEmpty() throws IOException {
        Optional<Long> sizeIfKnown = sizeIfKnown();
        boolean z = true;
        if (sizeIfKnown.isPresent()) {
            if (sizeIfKnown.get().longValue() == 0) {
                return true;
            }
            return false;
        }
        Closer create = Closer.create();
        try {
            if (((InputStream) create.register(openStream())).read() != -1) {
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

    public InputStream openBufferedStream() throws IOException {
        InputStream openStream = openStream();
        if (openStream instanceof BufferedInputStream) {
            return (BufferedInputStream) openStream;
        }
        return new BufferedInputStream(openStream);
    }

    public abstract InputStream openStream() throws IOException;

    public byte[] read() throws IOException {
        byte[] byteArray;
        Closer create = Closer.create();
        try {
            InputStream inputStream = (InputStream) create.register(openStream());
            Optional<Long> sizeIfKnown = sizeIfKnown();
            if (sizeIfKnown.isPresent()) {
                byteArray = ByteStreams.m68244e(inputStream, sizeIfKnown.get().longValue());
            } else {
                byteArray = ByteStreams.toByteArray(inputStream);
            }
            return byteArray;
        } catch (Throwable th) {
            try {
                throw create.rethrow(th);
            } finally {
                create.close();
            }
        }
    }

    public long size() throws IOException {
        Optional<Long> sizeIfKnown = sizeIfKnown();
        if (sizeIfKnown.isPresent()) {
            return sizeIfKnown.get().longValue();
        }
        Closer create = Closer.create();
        try {
            return m68250a((InputStream) create.register(openStream()));
        } catch (IOException unused) {
            create.close();
            try {
                return ByteStreams.exhaust((InputStream) Closer.create().register(openStream()));
            } finally {
            }
        } finally {
        }
    }

    @Beta
    public Optional<Long> sizeIfKnown() {
        return Optional.absent();
    }

    public ByteSource slice(long j, long j2) {
        return new SlicedByteSource(j, j2);
    }

    public static ByteSource concat(Iterator<? extends ByteSource> it) {
        return concat(ImmutableList.copyOf(it));
    }

    public static ByteSource concat(ByteSource... byteSourceArr) {
        return concat(ImmutableList.copyOf(byteSourceArr));
    }

    @CanIgnoreReturnValue
    public long copyTo(ByteSink byteSink) throws IOException {
        Preconditions.checkNotNull(byteSink);
        Closer create = Closer.create();
        try {
            return ByteStreams.copy((InputStream) create.register(openStream()), (OutputStream) create.register(byteSink.openStream()));
        } finally {
        }
    }

    @CanIgnoreReturnValue
    @Beta
    public <T> T read(ByteProcessor<T> byteProcessor) throws IOException {
        Preconditions.checkNotNull(byteProcessor);
        try {
            return (T) ByteStreams.readBytes((InputStream) Closer.create().register(openStream()), byteProcessor);
        } finally {
        }
    }
}
