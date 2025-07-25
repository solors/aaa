package io.ktor.utils.p731io.internal;

import io.ktor.utils.p731io.C37227p;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: io.ktor.utils.io.internal.c */
/* loaded from: classes9.dex */
public final class ByteBufferChannelInternals {
    @NotNull

    /* renamed from: b */
    public static final C37194a f98208b = new C37194a(null);
    @NotNull

    /* renamed from: c */
    private static final ByteBufferChannelInternals f98209c = new ByteBufferChannelInternals(null);
    @Nullable

    /* renamed from: a */
    private final Throwable f98210a;

    /* compiled from: ByteBufferChannelInternals.kt */
    @Metadata
    /* renamed from: io.ktor.utils.io.internal.c$a */
    /* loaded from: classes9.dex */
    public static final class C37194a {
        private C37194a() {
        }

        public /* synthetic */ C37194a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final ByteBufferChannelInternals m18803a() {
            return ByteBufferChannelInternals.f98209c;
        }
    }

    public ByteBufferChannelInternals(@Nullable Throwable th) {
        this.f98210a = th;
    }

    @Nullable
    /* renamed from: b */
    public final Throwable m18805b() {
        return this.f98210a;
    }

    @NotNull
    /* renamed from: c */
    public final Throwable m18804c() {
        Throwable th = this.f98210a;
        if (th == null) {
            return new C37227p("The channel was closed");
        }
        return th;
    }

    @NotNull
    public String toString() {
        return "Closed[" + m18804c() + ']';
    }
}
