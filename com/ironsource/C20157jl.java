package com.ironsource;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.jl */
/* loaded from: classes6.dex */
public final class C20157jl {
    @NotNull

    /* renamed from: n */
    public static final C20158a f50727n = new C20158a(null);

    /* renamed from: o */
    private static final int f50728o = 0;

    /* renamed from: a */
    private final boolean f50729a;
    @NotNull

    /* renamed from: b */
    private C19568a4 f50730b;

    /* renamed from: c */
    private int f50731c;

    /* renamed from: d */
    private long f50732d;

    /* renamed from: e */
    private boolean f50733e;
    @NotNull

    /* renamed from: f */
    private final ArrayList<C21083ul> f50734f;
    @Nullable

    /* renamed from: g */
    private C21083ul f50735g;

    /* renamed from: h */
    private int f50736h;
    @NotNull

    /* renamed from: i */
    private C20028h5 f50737i;

    /* renamed from: j */
    private boolean f50738j;

    /* renamed from: k */
    private long f50739k;

    /* renamed from: l */
    private boolean f50740l;

    /* renamed from: m */
    private boolean f50741m;

    @Metadata
    /* renamed from: com.ironsource.jl$a */
    /* loaded from: classes6.dex */
    public static final class C20158a {
        private C20158a() {
        }

        public /* synthetic */ C20158a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C20157jl(int i, long j, boolean z, @NotNull C19568a4 events, @NotNull C20028h5 auctionSettings, int i2, boolean z2, long j2, boolean z3, boolean z4, boolean z5) {
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(auctionSettings, "auctionSettings");
        this.f50729a = z5;
        this.f50734f = new ArrayList<>();
        this.f50731c = i;
        this.f50732d = j;
        this.f50733e = z;
        this.f50730b = events;
        this.f50736h = i2;
        this.f50737i = auctionSettings;
        this.f50738j = z2;
        this.f50739k = j2;
        this.f50740l = z3;
        this.f50741m = z4;
    }

    @Nullable
    /* renamed from: a */
    public final C21083ul m57822a(@NotNull String placementName) {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        Iterator<C21083ul> it = this.f50734f.iterator();
        while (it.hasNext()) {
            C21083ul next = it.next();
            if (Intrinsics.m17075f(next.getPlacementName(), placementName)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: b */
    public final int m57820b() {
        return this.f50731c;
    }

    /* renamed from: c */
    public final long m57816c() {
        return this.f50732d;
    }

    @NotNull
    /* renamed from: d */
    public final C20028h5 m57814d() {
        return this.f50737i;
    }

    @Nullable
    /* renamed from: e */
    public final C21083ul m57812e() {
        Iterator<C21083ul> it = this.f50734f.iterator();
        while (it.hasNext()) {
            C21083ul next = it.next();
            if (next.isDefault()) {
                return next;
            }
        }
        return this.f50735g;
    }

    /* renamed from: f */
    public final int m57811f() {
        return this.f50736h;
    }

    @NotNull
    /* renamed from: g */
    public final C19568a4 m57810g() {
        return this.f50730b;
    }

    /* renamed from: h */
    public final boolean m57809h() {
        return this.f50738j;
    }

    /* renamed from: i */
    public final long m57808i() {
        return this.f50739k;
    }

    /* renamed from: j */
    public final boolean m57807j() {
        return this.f50740l;
    }

    /* renamed from: k */
    public final boolean m57806k() {
        return this.f50729a;
    }

    /* renamed from: l */
    public final boolean m57805l() {
        return this.f50741m;
    }

    @NotNull
    public String toString() {
        return "NativeAdConfigurations{parallelLoad=" + this.f50731c + ", bidderExclusive=" + this.f50733e + '}';
    }

    /* renamed from: a */
    public final void m57827a(int i) {
        this.f50731c = i;
    }

    /* renamed from: b */
    public final void m57819b(int i) {
        this.f50736h = i;
    }

    /* renamed from: c */
    public final void m57815c(boolean z) {
        this.f50740l = z;
    }

    /* renamed from: d */
    public final void m57813d(boolean z) {
        this.f50741m = z;
    }

    /* renamed from: a */
    public final void m57826a(long j) {
        this.f50732d = j;
    }

    /* renamed from: b */
    public final void m57818b(long j) {
        this.f50739k = j;
    }

    /* renamed from: a */
    public final void m57825a(@NotNull C19568a4 c19568a4) {
        Intrinsics.checkNotNullParameter(c19568a4, "<set-?>");
        this.f50730b = c19568a4;
    }

    /* renamed from: b */
    public final void m57817b(boolean z) {
        this.f50738j = z;
    }

    /* renamed from: a */
    public final void m57824a(@NotNull C20028h5 c20028h5) {
        Intrinsics.checkNotNullParameter(c20028h5, "<set-?>");
        this.f50737i = c20028h5;
    }

    /* renamed from: a */
    public final void m57823a(@Nullable C21083ul c21083ul) {
        if (c21083ul != null) {
            this.f50734f.add(c21083ul);
            if (this.f50735g == null || c21083ul.getPlacementId() == 0) {
                this.f50735g = c21083ul;
            }
        }
    }

    /* renamed from: a */
    public final void m57821a(boolean z) {
        this.f50733e = z;
    }

    /* renamed from: a */
    public final boolean m57828a() {
        return this.f50733e;
    }
}
