package com.moloco.sdk.acm;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.moloco.sdk.acm.c */
/* loaded from: classes7.dex */
public final class C23788c {
    @NotNull
    public static final C23789a Companion = new C23789a(null);
    @NotNull

    /* renamed from: a */
    private final List<C23790d> f61754a;
    @NotNull

    /* renamed from: b */
    private final String f61755b;

    /* renamed from: c */
    private int f61756c;

    /* renamed from: com.moloco.sdk.acm.c$a */
    /* loaded from: classes7.dex */
    public static final class C23789a {
        public /* synthetic */ C23789a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C23789a() {
        }
    }

    public C23788c(@NotNull String eventName) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        this.f61754a = new ArrayList();
        this.f61755b = eventName;
        this.f61756c = 1;
    }

    /* renamed from: a */
    public final int m47736a() {
        return this.f61756c;
    }

    @NotNull
    /* renamed from: b */
    public List<C23790d> m47735b() {
        return this.f61754a;
    }

    @NotNull
    /* renamed from: c */
    public String m47734c() {
        return this.f61755b;
    }

    @NotNull
    /* renamed from: d */
    public C23788c m47733d(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        if (m47735b().size() < 10 && key.length() <= 50 && value.length() <= 50) {
            m47735b().add(new C23790d(key, value));
        }
        return this;
    }
}
