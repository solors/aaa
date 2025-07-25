package okio;

import kotlin.Metadata;
import kotlin.collections._ArraysJvm;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: okio.w0 */
/* loaded from: classes10.dex */
public final class Segment {
    @NotNull

    /* renamed from: h */
    public static final C39228a f103020h = new C39228a(null);
    @NotNull

    /* renamed from: a */
    public final byte[] f103021a;

    /* renamed from: b */
    public int f103022b;

    /* renamed from: c */
    public int f103023c;

    /* renamed from: d */
    public boolean f103024d;

    /* renamed from: e */
    public boolean f103025e;
    @Nullable

    /* renamed from: f */
    public Segment f103026f;
    @Nullable

    /* renamed from: g */
    public Segment f103027g;

    /* compiled from: Segment.kt */
    @Metadata
    /* renamed from: okio.w0$a */
    /* loaded from: classes10.dex */
    public static final class C39228a {
        private C39228a() {
        }

        public /* synthetic */ C39228a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public Segment() {
        this.f103021a = new byte[8192];
        this.f103025e = true;
        this.f103024d = false;
    }

    /* renamed from: a */
    public final void m13416a() {
        boolean z;
        Segment segment = this.f103027g;
        int i = 0;
        if (segment != this) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Intrinsics.m17074g(segment);
            if (!segment.f103025e) {
                return;
            }
            int i2 = this.f103023c - this.f103022b;
            Segment segment2 = this.f103027g;
            Intrinsics.m17074g(segment2);
            int i3 = 8192 - segment2.f103023c;
            Segment segment3 = this.f103027g;
            Intrinsics.m17074g(segment3);
            if (!segment3.f103024d) {
                Segment segment4 = this.f103027g;
                Intrinsics.m17074g(segment4);
                i = segment4.f103022b;
            }
            if (i2 > i3 + i) {
                return;
            }
            Segment segment5 = this.f103027g;
            Intrinsics.m17074g(segment5);
            m13411f(segment5, i2);
            m13415b();
            SegmentPool.m13408b(this);
            return;
        }
        throw new IllegalStateException("cannot compact".toString());
    }

    @Nullable
    /* renamed from: b */
    public final Segment m13415b() {
        Segment segment = this.f103026f;
        if (segment == this) {
            segment = null;
        }
        Segment segment2 = this.f103027g;
        Intrinsics.m17074g(segment2);
        segment2.f103026f = this.f103026f;
        Segment segment3 = this.f103026f;
        Intrinsics.m17074g(segment3);
        segment3.f103027g = this.f103027g;
        this.f103026f = null;
        this.f103027g = null;
        return segment;
    }

    @NotNull
    /* renamed from: c */
    public final Segment m13414c(@NotNull Segment segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        segment.f103027g = this;
        segment.f103026f = this.f103026f;
        Segment segment2 = this.f103026f;
        Intrinsics.m17074g(segment2);
        segment2.f103027g = segment;
        this.f103026f = segment;
        return segment;
    }

    @NotNull
    /* renamed from: d */
    public final Segment m13413d() {
        this.f103024d = true;
        return new Segment(this.f103021a, this.f103022b, this.f103023c, true, false);
    }

    @NotNull
    /* renamed from: e */
    public final Segment m13412e(int i) {
        boolean z;
        Segment m13407c;
        if (i > 0 && i <= this.f103023c - this.f103022b) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i >= 1024) {
                m13407c = m13413d();
            } else {
                m13407c = SegmentPool.m13407c();
                byte[] bArr = this.f103021a;
                byte[] bArr2 = m13407c.f103021a;
                int i2 = this.f103022b;
                _ArraysJvm.m17392m(bArr, bArr2, 0, i2, i2 + i, 2, null);
            }
            m13407c.f103023c = m13407c.f103022b + i;
            this.f103022b += i;
            Segment segment = this.f103027g;
            Intrinsics.m17074g(segment);
            segment.m13414c(m13407c);
            return m13407c;
        }
        throw new IllegalArgumentException("byteCount out of range".toString());
    }

    /* renamed from: f */
    public final void m13411f(@NotNull Segment sink, int i) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (sink.f103025e) {
            int i2 = sink.f103023c;
            if (i2 + i > 8192) {
                if (!sink.f103024d) {
                    int i3 = sink.f103022b;
                    if ((i2 + i) - i3 <= 8192) {
                        byte[] bArr = sink.f103021a;
                        _ArraysJvm.m17392m(bArr, bArr, 0, i3, i2, 2, null);
                        sink.f103023c -= sink.f103022b;
                        sink.f103022b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            byte[] bArr2 = this.f103021a;
            byte[] bArr3 = sink.f103021a;
            int i4 = sink.f103023c;
            int i5 = this.f103022b;
            _ArraysJvm.m17398g(bArr2, bArr3, i4, i5, i5 + i);
            sink.f103023c += i;
            this.f103022b += i;
            return;
        }
        throw new IllegalStateException("only owner can write".toString());
    }

    public Segment(@NotNull byte[] data, int i, int i2, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f103021a = data;
        this.f103022b = i;
        this.f103023c = i2;
        this.f103024d = z;
        this.f103025e = z2;
    }
}
