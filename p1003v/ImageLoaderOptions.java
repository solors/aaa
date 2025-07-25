package p1003v;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import p689h.ExifOrientationPolicy;

@Metadata
/* renamed from: v.o */
/* loaded from: classes2.dex */
public final class ImageLoaderOptions {

    /* renamed from: a */
    private final boolean f116757a;

    /* renamed from: b */
    private final boolean f116758b;

    /* renamed from: c */
    private final boolean f116759c;

    /* renamed from: d */
    private final int f116760d;
    @NotNull

    /* renamed from: e */
    private final ExifOrientationPolicy f116761e;

    public ImageLoaderOptions(boolean z, boolean z2, boolean z3, int i, @NotNull ExifOrientationPolicy exifOrientationPolicy) {
        this.f116757a = z;
        this.f116758b = z2;
        this.f116759c = z3;
        this.f116760d = i;
        this.f116761e = exifOrientationPolicy;
    }

    /* renamed from: a */
    public final boolean m2802a() {
        return this.f116757a;
    }

    @NotNull
    /* renamed from: b */
    public final ExifOrientationPolicy m2801b() {
        return this.f116761e;
    }

    /* renamed from: c */
    public final int m2800c() {
        return this.f116760d;
    }

    /* renamed from: d */
    public final boolean m2799d() {
        return this.f116758b;
    }

    /* renamed from: e */
    public final boolean m2798e() {
        return this.f116759c;
    }

    public /* synthetic */ ImageLoaderOptions(boolean z, boolean z2, boolean z3, int i, ExifOrientationPolicy exifOrientationPolicy, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? true : z, (i2 & 2) != 0 ? true : z2, (i2 & 4) == 0 ? z3 : true, (i2 & 8) != 0 ? 4 : i, (i2 & 16) != 0 ? ExifOrientationPolicy.RESPECT_PERFORMANCE : exifOrientationPolicy);
    }
}
