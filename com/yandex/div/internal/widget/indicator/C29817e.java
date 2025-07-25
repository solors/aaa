package com.yandex.div.internal.widget.indicator;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: IndicatorParams.kt */
@Metadata
/* renamed from: com.yandex.div.internal.widget.indicator.e */
/* loaded from: classes8.dex */
public final class C29817e {
    @NotNull

    /* renamed from: a */
    private final IndicatorParams f76178a;
    @NotNull

    /* renamed from: b */
    private final AbstractC29814d f76179b;
    @NotNull

    /* renamed from: c */
    private final AbstractC29814d f76180c;
    @NotNull

    /* renamed from: d */
    private final AbstractC29814d f76181d;
    @NotNull

    /* renamed from: e */
    private final InterfaceC29808b f76182e;

    public C29817e(@NotNull IndicatorParams animation, @NotNull AbstractC29814d activeShape, @NotNull AbstractC29814d inactiveShape, @NotNull AbstractC29814d minimumShape, @NotNull InterfaceC29808b itemsPlacement) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        Intrinsics.checkNotNullParameter(activeShape, "activeShape");
        Intrinsics.checkNotNullParameter(inactiveShape, "inactiveShape");
        Intrinsics.checkNotNullParameter(minimumShape, "minimumShape");
        Intrinsics.checkNotNullParameter(itemsPlacement, "itemsPlacement");
        this.f76178a = animation;
        this.f76179b = activeShape;
        this.f76180c = inactiveShape;
        this.f76181d = minimumShape;
        this.f76182e = itemsPlacement;
    }

    @NotNull
    /* renamed from: a */
    public final AbstractC29814d m36322a() {
        return this.f76179b;
    }

    @NotNull
    /* renamed from: b */
    public final IndicatorParams m36321b() {
        return this.f76178a;
    }

    @NotNull
    /* renamed from: c */
    public final AbstractC29814d m36320c() {
        return this.f76180c;
    }

    @NotNull
    /* renamed from: d */
    public final InterfaceC29808b m36319d() {
        return this.f76182e;
    }

    @NotNull
    /* renamed from: e */
    public final AbstractC29814d m36318e() {
        return this.f76181d;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29817e)) {
            return false;
        }
        C29817e c29817e = (C29817e) obj;
        if (this.f76178a == c29817e.f76178a && Intrinsics.m17075f(this.f76179b, c29817e.f76179b) && Intrinsics.m17075f(this.f76180c, c29817e.f76180c) && Intrinsics.m17075f(this.f76181d, c29817e.f76181d) && Intrinsics.m17075f(this.f76182e, c29817e.f76182e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((this.f76178a.hashCode() * 31) + this.f76179b.hashCode()) * 31) + this.f76180c.hashCode()) * 31) + this.f76181d.hashCode()) * 31) + this.f76182e.hashCode();
    }

    @NotNull
    public String toString() {
        return "Style(animation=" + this.f76178a + ", activeShape=" + this.f76179b + ", inactiveShape=" + this.f76180c + ", minimumShape=" + this.f76181d + ", itemsPlacement=" + this.f76182e + ')';
    }
}
