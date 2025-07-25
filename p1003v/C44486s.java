package p1003v;

import android.content.Context;
import java.io.File;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1046xd.C44983m;
import p706i.DiskCache;

/* compiled from: Utils.kt */
@Metadata
/* renamed from: v.s */
/* loaded from: classes2.dex */
public final class C44486s {
    @NotNull

    /* renamed from: a */
    public static final C44486s f116764a = new C44486s();
    @Nullable

    /* renamed from: b */
    private static DiskCache f116765b;

    private C44486s() {
    }

    @NotNull
    /* renamed from: a */
    public final synchronized DiskCache m2794a(@NotNull Context context) {
        DiskCache diskCache;
        File m1172u;
        diskCache = f116765b;
        if (diskCache == null) {
            DiskCache.C33578a c33578a = new DiskCache.C33578a();
            m1172u = C44983m.m1172u(C44477j.m2822m(context), "image_cache");
            diskCache = c33578a.m23323b(m1172u).m23324a();
            f116765b = diskCache;
        }
        return diskCache;
    }
}
