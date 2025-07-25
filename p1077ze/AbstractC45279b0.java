package p1077ze;

import af.Util;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import okio.BufferedSink;
import okio.C39208h;
import okio.C39217m0;
import okio.Source;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1046xd.Closeable;
import p1077ze.MediaType;

/* compiled from: RequestBody.kt */
@Metadata
/* renamed from: ze.b0 */
/* loaded from: classes10.dex */
public abstract class AbstractC45279b0 {
    @NotNull
    public static final C45280a Companion = new C45280a(null);

    /* compiled from: RequestBody.kt */
    @Metadata
    /* renamed from: ze.b0$a */
    /* loaded from: classes10.dex */
    public static final class C45280a {

        /* compiled from: RequestBody.kt */
        @Metadata
        /* renamed from: ze.b0$a$a */
        /* loaded from: classes10.dex */
        public static final class C45281a extends AbstractC45279b0 {

            /* renamed from: a */
            final /* synthetic */ MediaType f119017a;

            /* renamed from: b */
            final /* synthetic */ File f119018b;

            C45281a(MediaType mediaType, File file) {
                this.f119017a = mediaType;
                this.f119018b = file;
            }

            @Override // p1077ze.AbstractC45279b0
            public long contentLength() {
                return this.f119018b.length();
            }

            @Override // p1077ze.AbstractC45279b0
            @Nullable
            public MediaType contentType() {
                return this.f119017a;
            }

            @Override // p1077ze.AbstractC45279b0
            public void writeTo(@NotNull BufferedSink sink) {
                Intrinsics.checkNotNullParameter(sink, "sink");
                Source m13501j = C39217m0.m13501j(this.f119018b);
                try {
                    sink.mo13440H(m13501j);
                    Closeable.m1220a(m13501j, null);
                } finally {
                }
            }
        }

        /* compiled from: RequestBody.kt */
        @Metadata
        /* renamed from: ze.b0$a$b */
        /* loaded from: classes10.dex */
        public static final class C45282b extends AbstractC45279b0 {

            /* renamed from: a */
            final /* synthetic */ MediaType f119019a;

            /* renamed from: b */
            final /* synthetic */ C39208h f119020b;

            C45282b(MediaType mediaType, C39208h c39208h) {
                this.f119019a = mediaType;
                this.f119020b = c39208h;
            }

            @Override // p1077ze.AbstractC45279b0
            public long contentLength() {
                return this.f119020b.m13569C();
            }

            @Override // p1077ze.AbstractC45279b0
            @Nullable
            public MediaType contentType() {
                return this.f119019a;
            }

            @Override // p1077ze.AbstractC45279b0
            public void writeTo(@NotNull BufferedSink sink) {
                Intrinsics.checkNotNullParameter(sink, "sink");
                sink.mo13441E(this.f119020b);
            }
        }

        /* compiled from: RequestBody.kt */
        @Metadata
        /* renamed from: ze.b0$a$c */
        /* loaded from: classes10.dex */
        public static final class C45283c extends AbstractC45279b0 {

            /* renamed from: a */
            final /* synthetic */ MediaType f119021a;

            /* renamed from: b */
            final /* synthetic */ int f119022b;

            /* renamed from: c */
            final /* synthetic */ byte[] f119023c;

            /* renamed from: d */
            final /* synthetic */ int f119024d;

            C45283c(MediaType mediaType, int i, byte[] bArr, int i2) {
                this.f119021a = mediaType;
                this.f119022b = i;
                this.f119023c = bArr;
                this.f119024d = i2;
            }

            @Override // p1077ze.AbstractC45279b0
            public long contentLength() {
                return this.f119022b;
            }

            @Override // p1077ze.AbstractC45279b0
            @Nullable
            public MediaType contentType() {
                return this.f119021a;
            }

            @Override // p1077ze.AbstractC45279b0
            public void writeTo(@NotNull BufferedSink sink) {
                Intrinsics.checkNotNullParameter(sink, "sink");
                sink.write(this.f119023c, this.f119024d, this.f119022b);
            }
        }

        private C45280a() {
        }

        public /* synthetic */ C45280a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: n */
        public static /* synthetic */ AbstractC45279b0 m451n(C45280a c45280a, MediaType mediaType, byte[] bArr, int i, int i2, int i3, Object obj) {
            if ((i3 & 4) != 0) {
                i = 0;
            }
            if ((i3 & 8) != 0) {
                i2 = bArr.length;
            }
            return c45280a.m456i(mediaType, bArr, i, i2);
        }

        /* renamed from: o */
        public static /* synthetic */ AbstractC45279b0 m450o(C45280a c45280a, byte[] bArr, MediaType mediaType, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                mediaType = null;
            }
            if ((i3 & 2) != 0) {
                i = 0;
            }
            if ((i3 & 4) != 0) {
                i2 = bArr.length;
            }
            return c45280a.m452m(bArr, mediaType, i, i2);
        }

        @NotNull
        /* renamed from: a */
        public final AbstractC45279b0 m464a(@NotNull File file, @Nullable MediaType mediaType) {
            Intrinsics.checkNotNullParameter(file, "<this>");
            return new C45281a(mediaType, file);
        }

        @NotNull
        /* renamed from: b */
        public final AbstractC45279b0 m463b(@NotNull String str, @Nullable MediaType mediaType) {
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
            byte[] bytes = str.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            return m452m(bytes, mediaType, 0, bytes.length);
        }

        @NotNull
        /* renamed from: c */
        public final AbstractC45279b0 m462c(@NotNull C39208h c39208h, @Nullable MediaType mediaType) {
            Intrinsics.checkNotNullParameter(c39208h, "<this>");
            return new C45282b(mediaType, c39208h);
        }

        @NotNull
        /* renamed from: d */
        public final AbstractC45279b0 m461d(@Nullable MediaType mediaType, @NotNull File file) {
            Intrinsics.checkNotNullParameter(file, "file");
            return m464a(file, mediaType);
        }

        @NotNull
        /* renamed from: e */
        public final AbstractC45279b0 m460e(@Nullable MediaType mediaType, @NotNull String content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return m463b(content, mediaType);
        }

        @NotNull
        /* renamed from: f */
        public final AbstractC45279b0 m459f(@Nullable MediaType mediaType, @NotNull C39208h content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return m462c(content, mediaType);
        }

        @NotNull
        /* renamed from: g */
        public final AbstractC45279b0 m458g(@Nullable MediaType mediaType, @NotNull byte[] content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return m451n(this, mediaType, content, 0, 0, 12, null);
        }

        @NotNull
        /* renamed from: h */
        public final AbstractC45279b0 m457h(@Nullable MediaType mediaType, @NotNull byte[] content, int i) {
            Intrinsics.checkNotNullParameter(content, "content");
            return m451n(this, mediaType, content, i, 0, 8, null);
        }

        @NotNull
        /* renamed from: i */
        public final AbstractC45279b0 m456i(@Nullable MediaType mediaType, @NotNull byte[] content, int i, int i2) {
            Intrinsics.checkNotNullParameter(content, "content");
            return m452m(content, mediaType, i, i2);
        }

        @NotNull
        /* renamed from: j */
        public final AbstractC45279b0 m455j(@NotNull byte[] bArr) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            return m450o(this, bArr, null, 0, 0, 7, null);
        }

        @NotNull
        /* renamed from: k */
        public final AbstractC45279b0 m454k(@NotNull byte[] bArr, @Nullable MediaType mediaType) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            return m450o(this, bArr, mediaType, 0, 0, 6, null);
        }

        @NotNull
        /* renamed from: l */
        public final AbstractC45279b0 m453l(@NotNull byte[] bArr, @Nullable MediaType mediaType, int i) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            return m450o(this, bArr, mediaType, i, 0, 4, null);
        }

        @NotNull
        /* renamed from: m */
        public final AbstractC45279b0 m452m(@NotNull byte[] bArr, @Nullable MediaType mediaType, int i, int i2) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            Util.m105727l(bArr.length, i, i2);
            return new C45283c(mediaType, i2, bArr, i);
        }
    }

    @NotNull
    public static final AbstractC45279b0 create(@NotNull File file, @Nullable MediaType mediaType) {
        return Companion.m464a(file, mediaType);
    }

    public long contentLength() throws IOException {
        return -1L;
    }

    @Nullable
    public abstract MediaType contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(@NotNull BufferedSink bufferedSink) throws IOException;

    @NotNull
    public static final AbstractC45279b0 create(@NotNull String str, @Nullable MediaType mediaType) {
        return Companion.m463b(str, mediaType);
    }

    @NotNull
    public static final AbstractC45279b0 create(@NotNull C39208h c39208h, @Nullable MediaType mediaType) {
        return Companion.m462c(c39208h, mediaType);
    }

    @NotNull
    public static final AbstractC45279b0 create(@Nullable MediaType mediaType, @NotNull File file) {
        return Companion.m461d(mediaType, file);
    }

    @NotNull
    public static final AbstractC45279b0 create(@Nullable MediaType mediaType, @NotNull String str) {
        return Companion.m460e(mediaType, str);
    }

    @NotNull
    public static final AbstractC45279b0 create(@Nullable MediaType mediaType, @NotNull C39208h c39208h) {
        return Companion.m459f(mediaType, c39208h);
    }

    @NotNull
    public static final AbstractC45279b0 create(@Nullable MediaType mediaType, @NotNull byte[] bArr) {
        return Companion.m458g(mediaType, bArr);
    }

    @NotNull
    public static final AbstractC45279b0 create(@Nullable MediaType mediaType, @NotNull byte[] bArr, int i) {
        return Companion.m457h(mediaType, bArr, i);
    }

    @NotNull
    public static final AbstractC45279b0 create(@Nullable MediaType mediaType, @NotNull byte[] bArr, int i, int i2) {
        return Companion.m456i(mediaType, bArr, i, i2);
    }

    @NotNull
    public static final AbstractC45279b0 create(@NotNull byte[] bArr) {
        return Companion.m455j(bArr);
    }

    @NotNull
    public static final AbstractC45279b0 create(@NotNull byte[] bArr, @Nullable MediaType mediaType) {
        return Companion.m454k(bArr, mediaType);
    }

    @NotNull
    public static final AbstractC45279b0 create(@NotNull byte[] bArr, @Nullable MediaType mediaType, int i) {
        return Companion.m453l(bArr, mediaType, i);
    }

    @NotNull
    public static final AbstractC45279b0 create(@NotNull byte[] bArr, @Nullable MediaType mediaType, int i, int i2) {
        return Companion.m452m(bArr, mediaType, i, i2);
    }
}
