package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r */
/* loaded from: classes7.dex */
public final class C25043r {
    @Nullable

    /* renamed from: a */
    public final AbstractC25045t f64949a;
    @Nullable

    /* renamed from: b */
    public final C25028e f64950b;
    @Nullable

    /* renamed from: c */
    public final Long f64951c;
    @NotNull

    /* renamed from: d */
    public final List<C25044s> f64952d;
    @NotNull

    /* renamed from: e */
    public final List<C25050w> f64953e;
    @Nullable

    /* renamed from: f */
    public final C25017a f64954f;
    @NotNull

    /* renamed from: g */
    public final List<C25039n> f64955g;

    public C25043r(@Nullable AbstractC25045t abstractC25045t, @Nullable C25028e c25028e, @Nullable Long l, @NotNull List<C25044s> mediaFiles, @NotNull List<C25050w> trackingList, @Nullable C25017a c25017a, @NotNull List<C25039n> icons) {
        Intrinsics.checkNotNullParameter(mediaFiles, "mediaFiles");
        Intrinsics.checkNotNullParameter(trackingList, "trackingList");
        Intrinsics.checkNotNullParameter(icons, "icons");
        this.f64949a = abstractC25045t;
        this.f64950b = c25028e;
        this.f64951c = l;
        this.f64952d = mediaFiles;
        this.f64953e = trackingList;
        this.f64954f = c25017a;
        this.f64955g = icons;
    }

    @Nullable
    /* renamed from: a */
    public final Long m45235a() {
        return this.f64951c;
    }

    @NotNull
    /* renamed from: b */
    public final List<C25039n> m45234b() {
        return this.f64955g;
    }

    @NotNull
    /* renamed from: c */
    public final List<C25044s> m45233c() {
        return this.f64952d;
    }

    @Nullable
    /* renamed from: d */
    public final AbstractC25045t m45232d() {
        return this.f64949a;
    }

    @NotNull
    /* renamed from: e */
    public final List<C25050w> m45231e() {
        return this.f64953e;
    }

    @Nullable
    /* renamed from: f */
    public final C25017a m45230f() {
        return this.f64954f;
    }
}
