package com.yandex.div.core.dagger;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p986tb.Optional;

@Metadata
/* renamed from: com.yandex.div.core.dagger.k */
/* loaded from: classes8.dex */
public final class ExternalOptional<T> {
    @NotNull

    /* renamed from: b */
    public static final C29598a f75250b = new C29598a(null);
    @NotNull

    /* renamed from: a */
    private final Optional<T> f75251a;

    /* compiled from: ExternalOptional.kt */
    @Metadata
    /* renamed from: com.yandex.div.core.dagger.k$a */
    /* loaded from: classes8.dex */
    public static final class C29598a {
        private C29598a() {
        }

        public /* synthetic */ C29598a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final <T> ExternalOptional<T> m37288a() {
            return new ExternalOptional<>(Optional.f116538b.m3126a());
        }

        @NotNull
        /* renamed from: b */
        public final <T> ExternalOptional<T> m37287b(@NotNull T value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new ExternalOptional<>(Optional.f116538b.m3125b(value));
        }

        @NotNull
        /* renamed from: c */
        public final <T> ExternalOptional<T> m37286c(@Nullable T t) {
            if (t != null) {
                return m37287b(t);
            }
            return m37288a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ExternalOptional(@NotNull Optional<? extends T> optional) {
        Intrinsics.checkNotNullParameter(optional, "optional");
        this.f75251a = optional;
    }

    @NotNull
    /* renamed from: a */
    public static final <T> ExternalOptional<T> m37291a() {
        return f75250b.m37288a();
    }

    @NotNull
    /* renamed from: c */
    public static final <T> ExternalOptional<T> m37289c(@NotNull T t) {
        return f75250b.m37287b(t);
    }

    @NotNull
    /* renamed from: b */
    public final Optional<T> m37290b() {
        return this.f75251a;
    }
}
