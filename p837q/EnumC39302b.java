package p837q;

import kotlin.Metadata;

/* compiled from: CachePolicy.kt */
@Metadata
/* renamed from: q.b */
/* loaded from: classes2.dex */
public enum EnumC39302b {
    ENABLED(true, true),
    READ_ONLY(true, false),
    WRITE_ONLY(false, true),
    DISABLED(false, false);
    

    /* renamed from: b */
    private final boolean f103228b;

    /* renamed from: c */
    private final boolean f103229c;

    EnumC39302b(boolean z, boolean z2) {
        this.f103228b = z;
        this.f103229c = z2;
    }

    /* renamed from: c */
    public final boolean m13139c() {
        return this.f103228b;
    }

    /* renamed from: d */
    public final boolean m13138d() {
        return this.f103229c;
    }
}
