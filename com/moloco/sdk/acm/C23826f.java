package com.moloco.sdk.acm;

import com.moloco.sdk.acm.services.C23853f;
import com.moloco.sdk.acm.services.C23855h;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.moloco.sdk.acm.f */
/* loaded from: classes7.dex */
public final class C23826f {
    @NotNull
    public static final C23827a Companion = new C23827a(null);
    @NotNull

    /* renamed from: a */
    private final C23853f f61843a;

    /* renamed from: b */
    private long f61844b;
    @NotNull

    /* renamed from: c */
    private final List<C23790d> f61845c;
    @NotNull

    /* renamed from: d */
    private final String f61846d;

    /* renamed from: com.moloco.sdk.acm.f$a */
    /* loaded from: classes7.dex */
    public static final class C23827a {
        public /* synthetic */ C23827a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final C23826f m47658a(@NotNull String eventName) {
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            return new C23826f(eventName, new C23853f(new C23855h()), null);
        }

        public C23827a() {
        }
    }

    public /* synthetic */ C23826f(String str, C23853f c23853f, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, c23853f);
    }

    @NotNull
    /* renamed from: a */
    public List<C23790d> m47664a() {
        return this.f61845c;
    }

    @NotNull
    /* renamed from: b */
    public String m47663b() {
        return this.f61846d;
    }

    /* renamed from: c */
    public final long m47662c() {
        return this.f61844b;
    }

    /* renamed from: d */
    public final void m47661d() {
        this.f61843a.m47612b();
    }

    /* renamed from: e */
    public final void m47660e() {
        if (this.f61844b == 0) {
            this.f61844b = this.f61843a.m47613a();
        }
    }

    @NotNull
    /* renamed from: f */
    public C23826f m47659f(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        if (m47664a().size() < 10 && key.length() <= 50 && value.length() <= 50) {
            m47664a().add(new C23790d(key, value));
        }
        return this;
    }

    private C23826f(String str, C23853f c23853f) {
        this.f61843a = c23853f;
        this.f61845c = new ArrayList();
        this.f61846d = str;
    }
}
