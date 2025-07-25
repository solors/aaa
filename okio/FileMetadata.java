package okio;

import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C37559r0;
import kotlin.collections._Collections;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: okio.k */
/* loaded from: classes10.dex */
public final class FileMetadata {

    /* renamed from: a */
    private final boolean f102967a;

    /* renamed from: b */
    private final boolean f102968b;
    @Nullable

    /* renamed from: c */
    private final C39223s0 f102969c;
    @Nullable

    /* renamed from: d */
    private final Long f102970d;
    @Nullable

    /* renamed from: e */
    private final Long f102971e;
    @Nullable

    /* renamed from: f */
    private final Long f102972f;
    @Nullable

    /* renamed from: g */
    private final Long f102973g;
    @NotNull

    /* renamed from: h */
    private final Map<KClass<?>, Object> f102974h;

    public FileMetadata(boolean z, boolean z2, @Nullable C39223s0 c39223s0, @Nullable Long l, @Nullable Long l2, @Nullable Long l3, @Nullable Long l4, @NotNull Map<KClass<?>, ? extends Object> extras) {
        Map<KClass<?>, Object> m17269y;
        Intrinsics.checkNotNullParameter(extras, "extras");
        this.f102967a = z;
        this.f102968b = z2;
        this.f102969c = c39223s0;
        this.f102970d = l;
        this.f102971e = l2;
        this.f102972f = l3;
        this.f102973g = l4;
        m17269y = C37559r0.m17269y(extras);
        this.f102974h = m17269y;
    }

    @NotNull
    /* renamed from: a */
    public final FileMetadata m13530a(boolean z, boolean z2, @Nullable C39223s0 c39223s0, @Nullable Long l, @Nullable Long l2, @Nullable Long l3, @Nullable Long l4, @NotNull Map<KClass<?>, ? extends Object> extras) {
        Intrinsics.checkNotNullParameter(extras, "extras");
        return new FileMetadata(z, z2, c39223s0, l, l2, l3, l4, extras);
    }

    @Nullable
    /* renamed from: c */
    public final Long m13528c() {
        return this.f102972f;
    }

    @Nullable
    /* renamed from: d */
    public final Long m13527d() {
        return this.f102970d;
    }

    @Nullable
    /* renamed from: e */
    public final C39223s0 m13526e() {
        return this.f102969c;
    }

    /* renamed from: f */
    public final boolean m13525f() {
        return this.f102968b;
    }

    /* renamed from: g */
    public final boolean m13524g() {
        return this.f102967a;
    }

    @NotNull
    public String toString() {
        String m17521z0;
        ArrayList arrayList = new ArrayList();
        if (this.f102967a) {
            arrayList.add("isRegularFile");
        }
        if (this.f102968b) {
            arrayList.add("isDirectory");
        }
        if (this.f102970d != null) {
            arrayList.add("byteCount=" + this.f102970d);
        }
        if (this.f102971e != null) {
            arrayList.add("createdAt=" + this.f102971e);
        }
        if (this.f102972f != null) {
            arrayList.add("lastModifiedAt=" + this.f102972f);
        }
        if (this.f102973g != null) {
            arrayList.add("lastAccessedAt=" + this.f102973g);
        }
        if (!this.f102974h.isEmpty()) {
            arrayList.add("extras=" + this.f102974h);
        }
        m17521z0 = _Collections.m17521z0(arrayList, ", ", "FileMetadata(", ")", 0, null, null, 56, null);
        return m17521z0;
    }

    public /* synthetic */ FileMetadata(boolean z, boolean z2, C39223s0 c39223s0, Long l, Long l2, Long l3, Long l4, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) == 0 ? z2 : false, (i & 4) != 0 ? null : c39223s0, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : l2, (i & 32) != 0 ? null : l3, (i & 64) == 0 ? l4 : null, (i & 128) != 0 ? C37559r0.m17284j() : map);
    }
}
