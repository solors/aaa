package p802n9;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: n9.f */
/* loaded from: classes8.dex */
public final class DivVideoSource {
    @NotNull

    /* renamed from: a */
    private final Uri f101818a;
    @NotNull

    /* renamed from: b */
    private final String f101819b;
    @Nullable

    /* renamed from: c */
    private final DivVideoResolution f101820c;
    @Nullable

    /* renamed from: d */
    private final Long f101821d;

    public DivVideoSource(@NotNull Uri url, @NotNull String mimeType, @Nullable DivVideoResolution divVideoResolution, @Nullable Long l) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        this.f101818a = url;
        this.f101819b = mimeType;
        this.f101820c = divVideoResolution;
        this.f101821d = l;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DivVideoSource)) {
            return false;
        }
        DivVideoSource divVideoSource = (DivVideoSource) obj;
        if (Intrinsics.m17075f(this.f101818a, divVideoSource.f101818a) && Intrinsics.m17075f(this.f101819b, divVideoSource.f101819b) && Intrinsics.m17075f(this.f101820c, divVideoSource.f101820c) && Intrinsics.m17075f(this.f101821d, divVideoSource.f101821d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((this.f101818a.hashCode() * 31) + this.f101819b.hashCode()) * 31;
        DivVideoResolution divVideoResolution = this.f101820c;
        int i = 0;
        if (divVideoResolution == null) {
            hashCode = 0;
        } else {
            hashCode = divVideoResolution.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        Long l = this.f101821d;
        if (l != null) {
            i = l.hashCode();
        }
        return i2 + i;
    }

    @NotNull
    public String toString() {
        return "DivVideoSource(url=" + this.f101818a + ", mimeType=" + this.f101819b + ", resolution=" + this.f101820c + ", bitrate=" + this.f101821d + ')';
    }
}
