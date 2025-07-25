package p675ff;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1077ze.MediaType;
import p1077ze.ResponseBody;

@Metadata
/* renamed from: ff.h */
/* loaded from: classes10.dex */
public final class RealResponseBody extends ResponseBody {
    @Nullable

    /* renamed from: b */
    private final String f90520b;

    /* renamed from: c */
    private final long f90521c;
    @NotNull

    /* renamed from: d */
    private final BufferedSource f90522d;

    public RealResponseBody(@Nullable String str, long j, @NotNull BufferedSource source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f90520b = str;
        this.f90521c = j;
        this.f90522d = source;
    }

    @Override // p1077ze.ResponseBody
    public long contentLength() {
        return this.f90521c;
    }

    @Override // p1077ze.ResponseBody
    @Nullable
    public MediaType contentType() {
        String str = this.f90520b;
        if (str == null) {
            return null;
        }
        return MediaType.f119348e.m95b(str);
    }

    @Override // p1077ze.ResponseBody
    @NotNull
    public BufferedSource source() {
        return this.f90522d;
    }
}
