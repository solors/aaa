package io.ktor.utils.p731io;

import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: io.ktor.utils.io.e */
/* loaded from: classes9.dex */
public final class ByteChannel {

    /* compiled from: ByteChannel.kt */
    @Metadata
    /* renamed from: io.ktor.utils.io.e$a */
    /* loaded from: classes9.dex */
    public static final class C37174a extends ByteBufferChannel {

        /* renamed from: q */
        final /* synthetic */ Function1<Throwable, Throwable> f98117q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C37174a(boolean z, Function1<? super Throwable, ? extends Throwable> function1) {
            super(z, null, 0, 6, null);
            this.f98117q = function1;
        }

        @Override // io.ktor.utils.p731io.ByteBufferChannel, io.ktor.utils.p731io.ByteWriteChannel
        /* renamed from: d */
        public boolean mo18749d(@Nullable Throwable th) {
            return super.mo18749d(this.f98117q.invoke(th));
        }
    }

    @NotNull
    /* renamed from: a */
    public static final ByteChannelCtor m18871a(boolean z) {
        return new ByteBufferChannel(z, null, 0, 6, null);
    }

    @NotNull
    /* renamed from: b */
    public static final ByteChannelCtor m18870b(boolean z, @NotNull Function1<? super Throwable, ? extends Throwable> exceptionMapper) {
        Intrinsics.checkNotNullParameter(exceptionMapper, "exceptionMapper");
        return new C37174a(z, exceptionMapper);
    }

    /* renamed from: c */
    public static /* synthetic */ ByteChannelCtor m18869c(boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return m18871a(z);
    }

    /* renamed from: d */
    public static /* synthetic */ ByteChannelCtor m18868d(boolean z, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return m18870b(z, function1);
    }

    @NotNull
    /* renamed from: e */
    public static final ByteReadChannelJVM m18867e(@NotNull byte[] content, int i, int i2) {
        Intrinsics.checkNotNullParameter(content, "content");
        ByteBuffer wrap = ByteBuffer.wrap(content, i, i2);
        Intrinsics.checkNotNullExpressionValue(wrap, "wrap(content, offset, length)");
        return new ByteBufferChannel(wrap);
    }
}
