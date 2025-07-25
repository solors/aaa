package lc;

import io.ktor.utils.p731io.ByteReadChannelJVM;
import io.ktor.utils.p731io.ByteWriteChannel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p761kc.C37450c;
import p761kc.InterfaceC37464k;

/* compiled from: OutgoingContent.kt */
@Metadata
/* renamed from: lc.b */
/* loaded from: classes9.dex */
public abstract class AbstractC38150b {

    /* compiled from: OutgoingContent.kt */
    @Metadata
    /* renamed from: lc.b$a */
    /* loaded from: classes9.dex */
    public static abstract class AbstractC38151a extends AbstractC38150b {
        public AbstractC38151a() {
            super(null);
        }

        @NotNull
        /* renamed from: d */
        public abstract byte[] mo15543d();
    }

    /* compiled from: OutgoingContent.kt */
    @Metadata
    /* renamed from: lc.b$b */
    /* loaded from: classes9.dex */
    public static abstract class AbstractC38152b extends AbstractC38150b {
        public AbstractC38152b() {
            super(null);
        }
    }

    /* compiled from: OutgoingContent.kt */
    @Metadata
    /* renamed from: lc.b$c */
    /* loaded from: classes9.dex */
    public static abstract class AbstractC38153c extends AbstractC38150b {
        public AbstractC38153c() {
            super(null);
        }

        @NotNull
        /* renamed from: d */
        public abstract ByteReadChannelJVM mo15547d();
    }

    /* compiled from: OutgoingContent.kt */
    @Metadata
    /* renamed from: lc.b$d */
    /* loaded from: classes9.dex */
    public static abstract class AbstractC38154d extends AbstractC38150b {
        public AbstractC38154d() {
            super(null);
        }

        @Nullable
        /* renamed from: d */
        public abstract Object m15546d(@NotNull ByteWriteChannel byteWriteChannel, @NotNull Continuation<? super Unit> continuation);
    }

    private AbstractC38150b() {
    }

    public /* synthetic */ AbstractC38150b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Nullable
    /* renamed from: a */
    public Long mo15545a() {
        return null;
    }

    @Nullable
    /* renamed from: b */
    public C37450c mo15544b() {
        return null;
    }

    @NotNull
    /* renamed from: c */
    public InterfaceC37464k mo15548c() {
        return InterfaceC37464k.f98887a.m17955a();
    }
}
