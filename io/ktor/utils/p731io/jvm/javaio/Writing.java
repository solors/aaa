package io.ktor.utils.p731io.jvm.javaio;

import io.ktor.utils.p731io.ByteReadChannelJVM;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37589d;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: io.ktor.utils.io.jvm.javaio.j */
/* loaded from: classes9.dex */
public final class Writing {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Writing.kt */
    @DebugMetadata(m17095c = "io.ktor.utils.io.jvm.javaio.WritingKt", m17094f = "Writing.kt", m17093l = {22}, m17092m = "copyTo")
    @Metadata
    /* renamed from: io.ktor.utils.io.jvm.javaio.j$a */
    /* loaded from: classes9.dex */
    public static final class C37223a extends AbstractC37589d {

        /* renamed from: l */
        Object f98297l;

        /* renamed from: m */
        Object f98298m;

        /* renamed from: n */
        Object f98299n;

        /* renamed from: o */
        long f98300o;

        /* renamed from: p */
        long f98301p;

        /* renamed from: q */
        long f98302q;

        /* renamed from: r */
        /* synthetic */ Object f98303r;

        /* renamed from: s */
        int f98304s;

        C37223a(Continuation<? super C37223a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f98303r = obj;
            this.f98304s |= Integer.MIN_VALUE;
            return Writing.m18715a(null, null, 0L, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00be  */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0099 -> B:52:0x009d). Please submit an issue!!! */
    @org.jetbrains.annotations.Nullable
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m18715a(@org.jetbrains.annotations.NotNull io.ktor.utils.p731io.ByteReadChannelJVM r18, @org.jetbrains.annotations.NotNull java.io.OutputStream r19, long r20, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.Long> r22) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.p731io.jvm.javaio.Writing.m18715a(io.ktor.utils.io.g, java.io.OutputStream, long, kotlin.coroutines.d):java.lang.Object");
    }

    /* renamed from: b */
    public static /* synthetic */ Object m18714b(ByteReadChannelJVM byteReadChannelJVM, OutputStream outputStream, long j, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            j = Long.MAX_VALUE;
        }
        return m18715a(byteReadChannelJVM, outputStream, j, continuation);
    }
}
