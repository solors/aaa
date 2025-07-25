package com.moloco.sdk.internal.publisher.nativead.model;

import android.net.Uri;
import com.moloco.sdk.internal.publisher.nativead.model.AbstractC24173b;
import com.moloco.sdk.internal.publisher.nativead.model.C24165a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.InterfaceC24576c;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.C25060a;
import java.util.List;
import java.util.Map;
import kotlin.Tuples;
import kotlin.collections.C37559r0;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.InterfaceC38501j;
import p804nd.LazyJVM;

/* renamed from: com.moloco.sdk.internal.publisher.nativead.model.c */
/* loaded from: classes7.dex */
public final class C24178c {
    @NotNull

    /* renamed from: a */
    public final Map<Integer, AbstractC24173b.C24174a> f62636a;
    @NotNull

    /* renamed from: b */
    public final Map<Integer, AbstractC24173b.C24175b> f62637b;
    @NotNull

    /* renamed from: c */
    public final Map<Integer, AbstractC24173b.C24176c> f62638c;
    @NotNull

    /* renamed from: d */
    public final Map<Integer, AbstractC24173b.C24177d> f62639d;
    @NotNull

    /* renamed from: e */
    public final List<Tuples<C24165a.AbstractC24166a, InterfaceC24576c>> f62640e;
    @NotNull

    /* renamed from: f */
    public final InterfaceC38501j f62641f;

    /* renamed from: com.moloco.sdk.internal.publisher.nativead.model.c$a */
    /* loaded from: classes7.dex */
    public static final class C24179a extends Lambda implements Functions<Map<Integer, ? extends AbstractC24173b>> {
        public C24179a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Functions
        @NotNull
        /* renamed from: b */
        public final Map<Integer, AbstractC24173b> invoke() {
            Map m17276r;
            Map m17276r2;
            Map<Integer, AbstractC24173b> m17276r3;
            m17276r = C37559r0.m17276r(C24178c.this.f62636a, C24178c.this.f62637b);
            m17276r2 = C37559r0.m17276r(m17276r, C24178c.this.f62638c);
            m17276r3 = C37559r0.m17276r(m17276r2, C24178c.this.f62639d);
            return m17276r3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C24178c(@NotNull Map<Integer, AbstractC24173b.C24174a> data, @NotNull Map<Integer, AbstractC24173b.C24175b> images, @NotNull Map<Integer, AbstractC24173b.C24176c> titles, @NotNull Map<Integer, AbstractC24173b.C24177d> videos, @NotNull List<? extends Tuples<? extends C24165a.AbstractC24166a, ? extends InterfaceC24576c>> failedAssets) {
        InterfaceC38501j m14554a;
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(images, "images");
        Intrinsics.checkNotNullParameter(titles, "titles");
        Intrinsics.checkNotNullParameter(videos, "videos");
        Intrinsics.checkNotNullParameter(failedAssets, "failedAssets");
        this.f62636a = data;
        this.f62637b = images;
        this.f62638c = titles;
        this.f62639d = videos;
        this.f62640e = failedAssets;
        m14554a = LazyJVM.m14554a(new C24179a());
        this.f62641f = m14554a;
    }

    @Nullable
    /* renamed from: a */
    public final String m46832a(int i) {
        AbstractC24173b.C24174a c24174a = this.f62636a.get(Integer.valueOf(i));
        if (c24174a != null) {
            return c24174a.m46836b();
        }
        return null;
    }

    @Nullable
    /* renamed from: c */
    public final Uri m46830c(int i) {
        AbstractC24173b.C24175b c24175b = this.f62637b.get(Integer.valueOf(i));
        if (c24175b != null) {
            return c24175b.m46835b();
        }
        return null;
    }

    @Nullable
    /* renamed from: e */
    public final String m46828e(int i) {
        AbstractC24173b.C24176c c24176c = this.f62638c.get(Integer.valueOf(i));
        if (c24176c != null) {
            return c24176c.m46834b();
        }
        return null;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24178c)) {
            return false;
        }
        C24178c c24178c = (C24178c) obj;
        if (Intrinsics.m17075f(this.f62636a, c24178c.f62636a) && Intrinsics.m17075f(this.f62637b, c24178c.f62637b) && Intrinsics.m17075f(this.f62638c, c24178c.f62638c) && Intrinsics.m17075f(this.f62639d, c24178c.f62639d) && Intrinsics.m17075f(this.f62640e, c24178c.f62640e)) {
            return true;
        }
        return false;
    }

    @Nullable
    /* renamed from: g */
    public final C25060a m46826g(int i) {
        AbstractC24173b.C24177d c24177d = this.f62639d.get(Integer.valueOf(i));
        if (c24177d != null) {
            return c24177d.m46833b();
        }
        return null;
    }

    public int hashCode() {
        return (((((((this.f62636a.hashCode() * 31) + this.f62637b.hashCode()) * 31) + this.f62638c.hashCode()) * 31) + this.f62639d.hashCode()) * 31) + this.f62640e.hashCode();
    }

    @NotNull
    public String toString() {
        return "PreparedNativeAssets(data=" + this.f62636a + ", images=" + this.f62637b + ", titles=" + this.f62638c + ", videos=" + this.f62639d + ", failedAssets=" + this.f62640e + ')';
    }
}
