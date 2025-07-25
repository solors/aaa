package p1077ze;

import af.Util;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import okio.BufferedSource;
import okio.C39200e;
import okio.C39208h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1077ze.MediaType;

@Metadata
/* renamed from: ze.d0 */
/* loaded from: classes10.dex */
public abstract class ResponseBody implements Closeable {
    @NotNull
    public static final C45297b Companion = new C45297b(null);
    @Nullable
    private Reader reader;

    /* compiled from: ResponseBody.kt */
    @Metadata
    /* renamed from: ze.d0$a */
    /* loaded from: classes10.dex */
    public static final class C45296a extends Reader {
        @NotNull

        /* renamed from: b */
        private final BufferedSource f119109b;
        @NotNull

        /* renamed from: c */
        private final Charset f119110c;

        /* renamed from: d */
        private boolean f119111d;
        @Nullable

        /* renamed from: f */
        private Reader f119112f;

        public C45296a(@NotNull BufferedSource source, @NotNull Charset charset) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(charset, "charset");
            this.f119109b = source;
            this.f119110c = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            Unit unit;
            this.f119111d = true;
            Reader reader = this.f119112f;
            if (reader == null) {
                unit = null;
            } else {
                reader.close();
                unit = Unit.f99208a;
            }
            if (unit == null) {
                this.f119109b.close();
            }
        }

        @Override // java.io.Reader
        public int read(@NotNull char[] cbuf, int i, int i2) throws IOException {
            Intrinsics.checkNotNullParameter(cbuf, "cbuf");
            if (!this.f119111d) {
                Reader reader = this.f119112f;
                if (reader == null) {
                    reader = new InputStreamReader(this.f119109b.inputStream(), Util.m105756J(this.f119109b, this.f119110c));
                    this.f119112f = reader;
                }
                return reader.read(cbuf, i, i2);
            }
            throw new IOException("Stream closed");
        }
    }

    /* compiled from: ResponseBody.kt */
    @Metadata
    /* renamed from: ze.d0$b */
    /* loaded from: classes10.dex */
    public static final class C45297b {

        /* compiled from: ResponseBody.kt */
        @Metadata
        /* renamed from: ze.d0$b$a */
        /* loaded from: classes10.dex */
        public static final class C45298a extends ResponseBody {

            /* renamed from: b */
            final /* synthetic */ MediaType f119113b;

            /* renamed from: c */
            final /* synthetic */ long f119114c;

            /* renamed from: d */
            final /* synthetic */ BufferedSource f119115d;

            C45298a(MediaType mediaType, long j, BufferedSource bufferedSource) {
                this.f119113b = mediaType;
                this.f119114c = j;
                this.f119115d = bufferedSource;
            }

            @Override // p1077ze.ResponseBody
            public long contentLength() {
                return this.f119114c;
            }

            @Override // p1077ze.ResponseBody
            @Nullable
            public MediaType contentType() {
                return this.f119113b;
            }

            @Override // p1077ze.ResponseBody
            @NotNull
            public BufferedSource source() {
                return this.f119115d;
            }
        }

        private C45297b() {
        }

        public /* synthetic */ C45297b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: i */
        public static /* synthetic */ ResponseBody m340i(C45297b c45297b, byte[] bArr, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return c45297b.m341h(bArr, mediaType);
        }

        @NotNull
        /* renamed from: a */
        public final ResponseBody m348a(@NotNull String str, @Nullable MediaType mediaType) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            Charset charset = Charsets.UTF_8;
            if (mediaType != null) {
                Charset m99d = MediaType.m99d(mediaType, null, 1, null);
                if (m99d == null) {
                    MediaType.C45335a c45335a = MediaType.f119348e;
                    mediaType = c45335a.m95b(mediaType + "; charset=utf-8");
                } else {
                    charset = m99d;
                }
            }
            C39200e m13601S = new C39200e().m13601S(str, charset);
            return m347b(m13601S, mediaType, m13601S.size());
        }

        @NotNull
        /* renamed from: b */
        public final ResponseBody m347b(@NotNull BufferedSource bufferedSource, @Nullable MediaType mediaType, long j) {
            Intrinsics.checkNotNullParameter(bufferedSource, "<this>");
            return new C45298a(mediaType, j, bufferedSource);
        }

        @NotNull
        /* renamed from: c */
        public final ResponseBody m346c(@NotNull C39208h c39208h, @Nullable MediaType mediaType) {
            Intrinsics.checkNotNullParameter(c39208h, "<this>");
            return m347b(new C39200e().mo13441E(c39208h), mediaType, c39208h.m13569C());
        }

        @NotNull
        /* renamed from: d */
        public final ResponseBody m345d(@Nullable MediaType mediaType, long j, @NotNull BufferedSource content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return m347b(content, mediaType, j);
        }

        @NotNull
        /* renamed from: e */
        public final ResponseBody m344e(@Nullable MediaType mediaType, @NotNull String content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return m348a(content, mediaType);
        }

        @NotNull
        /* renamed from: f */
        public final ResponseBody m343f(@Nullable MediaType mediaType, @NotNull C39208h content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return m346c(content, mediaType);
        }

        @NotNull
        /* renamed from: g */
        public final ResponseBody m342g(@Nullable MediaType mediaType, @NotNull byte[] content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return m341h(content, mediaType);
        }

        @NotNull
        /* renamed from: h */
        public final ResponseBody m341h(@NotNull byte[] bArr, @Nullable MediaType mediaType) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            return m347b(new C39200e().write(bArr), mediaType, bArr.length);
        }
    }

    private final Charset charset() {
        Charset m100c;
        MediaType contentType = contentType();
        if (contentType == null) {
            m100c = null;
        } else {
            m100c = contentType.m100c(Charsets.UTF_8);
        }
        if (m100c == null) {
            return Charsets.UTF_8;
        }
        return m100c;
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [T, java.lang.Object] */
    private final <T> T consumeSource(Function1<? super BufferedSource, ? extends T> function1, Function1<? super T, Integer> function12) {
        long contentLength = contentLength();
        if (contentLength <= 2147483647L) {
            BufferedSource source = source();
            try {
                T invoke = function1.invoke(source);
                InlineMarker.m17017b(1);
                p1046xd.Closeable.m1220a(source, null);
                InlineMarker.m17018a(1);
                int intValue = function12.invoke(invoke).intValue();
                if (contentLength != -1 && contentLength != intValue) {
                    throw new IOException("Content-Length (" + contentLength + ") and stream length (" + intValue + ") disagree");
                }
                return invoke;
            } finally {
            }
        } else {
            throw new IOException(Intrinsics.m17064q("Cannot buffer entire body for content length: ", Long.valueOf(contentLength)));
        }
    }

    @NotNull
    public static final ResponseBody create(@NotNull String str, @Nullable MediaType mediaType) {
        return Companion.m348a(str, mediaType);
    }

    @NotNull
    public final InputStream byteStream() {
        return source().inputStream();
    }

    @NotNull
    public final C39208h byteString() throws IOException {
        long contentLength = contentLength();
        if (contentLength <= 2147483647L) {
            BufferedSource source = source();
            try {
                C39208h readByteString = source.readByteString();
                p1046xd.Closeable.m1220a(source, null);
                int m13569C = readByteString.m13569C();
                if (contentLength != -1 && contentLength != m13569C) {
                    throw new IOException("Content-Length (" + contentLength + ") and stream length (" + m13569C + ") disagree");
                }
                return readByteString;
            } finally {
            }
        } else {
            throw new IOException(Intrinsics.m17064q("Cannot buffer entire body for content length: ", Long.valueOf(contentLength)));
        }
    }

    @NotNull
    public final byte[] bytes() throws IOException {
        long contentLength = contentLength();
        if (contentLength <= 2147483647L) {
            BufferedSource source = source();
            try {
                byte[] readByteArray = source.readByteArray();
                p1046xd.Closeable.m1220a(source, null);
                int length = readByteArray.length;
                if (contentLength != -1 && contentLength != length) {
                    throw new IOException("Content-Length (" + contentLength + ") and stream length (" + length + ") disagree");
                }
                return readByteArray;
            } finally {
            }
        } else {
            throw new IOException(Intrinsics.m17064q("Cannot buffer entire body for content length: ", Long.valueOf(contentLength)));
        }
    }

    @NotNull
    public final Reader charStream() {
        Reader reader = this.reader;
        if (reader == null) {
            C45296a c45296a = new C45296a(source(), charset());
            this.reader = c45296a;
            return c45296a;
        }
        return reader;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Util.m105726m(source());
    }

    public abstract long contentLength();

    @Nullable
    public abstract MediaType contentType();

    @NotNull
    public abstract BufferedSource source();

    @NotNull
    public final String string() throws IOException {
        BufferedSource source = source();
        try {
            String readString = source.readString(Util.m105756J(source, charset()));
            p1046xd.Closeable.m1220a(source, null);
            return readString;
        } finally {
        }
    }

    @NotNull
    public static final ResponseBody create(@NotNull BufferedSource bufferedSource, @Nullable MediaType mediaType, long j) {
        return Companion.m347b(bufferedSource, mediaType, j);
    }

    @NotNull
    public static final ResponseBody create(@NotNull C39208h c39208h, @Nullable MediaType mediaType) {
        return Companion.m346c(c39208h, mediaType);
    }

    @NotNull
    public static final ResponseBody create(@Nullable MediaType mediaType, long j, @NotNull BufferedSource bufferedSource) {
        return Companion.m345d(mediaType, j, bufferedSource);
    }

    @NotNull
    public static final ResponseBody create(@Nullable MediaType mediaType, @NotNull String str) {
        return Companion.m344e(mediaType, str);
    }

    @NotNull
    public static final ResponseBody create(@Nullable MediaType mediaType, @NotNull C39208h c39208h) {
        return Companion.m343f(mediaType, c39208h);
    }

    @NotNull
    public static final ResponseBody create(@Nullable MediaType mediaType, @NotNull byte[] bArr) {
        return Companion.m342g(mediaType, bArr);
    }

    @NotNull
    public static final ResponseBody create(@NotNull byte[] bArr, @Nullable MediaType mediaType) {
        return Companion.m341h(bArr, mediaType);
    }
}
