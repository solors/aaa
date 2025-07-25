package p822of;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.C39223s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: of.i */
/* loaded from: classes10.dex */
public final class ZipEntry {
    @NotNull

    /* renamed from: a */
    private final C39223s0 f102900a;

    /* renamed from: b */
    private final boolean f102901b;
    @NotNull

    /* renamed from: c */
    private final String f102902c;

    /* renamed from: d */
    private final long f102903d;

    /* renamed from: e */
    private final long f102904e;

    /* renamed from: f */
    private final long f102905f;

    /* renamed from: g */
    private final int f102906g;
    @Nullable

    /* renamed from: h */
    private final Long f102907h;

    /* renamed from: i */
    private final long f102908i;
    @NotNull

    /* renamed from: j */
    private final List<C39223s0> f102909j;

    public ZipEntry(@NotNull C39223s0 canonicalPath, boolean z, @NotNull String comment, long j, long j2, long j3, int i, @Nullable Long l, long j4) {
        Intrinsics.checkNotNullParameter(canonicalPath, "canonicalPath");
        Intrinsics.checkNotNullParameter(comment, "comment");
        this.f102900a = canonicalPath;
        this.f102901b = z;
        this.f102902c = comment;
        this.f102903d = j;
        this.f102904e = j2;
        this.f102905f = j3;
        this.f102906g = i;
        this.f102907h = l;
        this.f102908i = j4;
        this.f102909j = new ArrayList();
    }

    @NotNull
    /* renamed from: a */
    public final C39223s0 m13668a() {
        return this.f102900a;
    }

    @NotNull
    /* renamed from: b */
    public final List<C39223s0> m13667b() {
        return this.f102909j;
    }

    /* renamed from: c */
    public final long m13666c() {
        return this.f102904e;
    }

    /* renamed from: d */
    public final int m13665d() {
        return this.f102906g;
    }

    @Nullable
    /* renamed from: e */
    public final Long m13664e() {
        return this.f102907h;
    }

    /* renamed from: f */
    public final long m13663f() {
        return this.f102908i;
    }

    /* renamed from: g */
    public final long m13662g() {
        return this.f102905f;
    }

    /* renamed from: h */
    public final boolean m13661h() {
        return this.f102901b;
    }

    public /* synthetic */ ZipEntry(C39223s0 c39223s0, boolean z, String str, long j, long j2, long j3, int i, Long l, long j4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(c39223s0, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? "" : str, (i2 & 8) != 0 ? -1L : j, (i2 & 16) != 0 ? -1L : j2, (i2 & 32) != 0 ? -1L : j3, (i2 & 64) != 0 ? -1 : i, (i2 & 128) != 0 ? null : l, (i2 & 256) == 0 ? j4 : -1L);
    }
}
