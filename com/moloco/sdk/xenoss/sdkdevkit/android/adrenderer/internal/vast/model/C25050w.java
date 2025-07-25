package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.w */
/* loaded from: classes7.dex */
public final class C25050w {
    @NotNull

    /* renamed from: a */
    public final EnumC25051x f64974a;
    @NotNull

    /* renamed from: b */
    public final String f64975b;
    @Nullable

    /* renamed from: c */
    public final AbstractC25045t f64976c;

    public C25050w(@NotNull EnumC25051x event, @NotNull String url, @Nullable AbstractC25045t abstractC25045t) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(url, "url");
        this.f64974a = event;
        this.f64975b = url;
        this.f64976c = abstractC25045t;
    }

    @NotNull
    /* renamed from: a */
    public final EnumC25051x m45216a() {
        return this.f64974a;
    }

    @Nullable
    /* renamed from: b */
    public final AbstractC25045t m45215b() {
        return this.f64976c;
    }

    @NotNull
    /* renamed from: c */
    public final String m45214c() {
        return this.f64975b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25050w)) {
            return false;
        }
        C25050w c25050w = (C25050w) obj;
        if (this.f64974a == c25050w.f64974a && Intrinsics.m17075f(this.f64975b, c25050w.f64975b) && Intrinsics.m17075f(this.f64976c, c25050w.f64976c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((this.f64974a.hashCode() * 31) + this.f64975b.hashCode()) * 31;
        AbstractC25045t abstractC25045t = this.f64976c;
        if (abstractC25045t == null) {
            hashCode = 0;
        } else {
            hashCode = abstractC25045t.hashCode();
        }
        return hashCode2 + hashCode;
    }

    @NotNull
    public String toString() {
        return "Tracking(event=" + this.f64974a + ", url=" + this.f64975b + ", offset=" + this.f64976c + ')';
    }
}
