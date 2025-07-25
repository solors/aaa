package p987te;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: te.a */
/* loaded from: classes8.dex */
public abstract class SerializersModule {

    /* compiled from: SerializersModule.kt */
    @Metadata
    /* renamed from: te.a$a */
    /* loaded from: classes8.dex */
    public static final class C44404a extends SerializersModule {
        @NotNull

        /* renamed from: a */
        private final KSerializer<?> f116547a;

        @Override // p987te.SerializersModule
        @NotNull
        /* renamed from: a */
        public KSerializer<?> mo3107a(@NotNull List<? extends KSerializer<?>> typeArgumentsSerializers) {
            Intrinsics.checkNotNullParameter(typeArgumentsSerializers, "typeArgumentsSerializers");
            return this.f116547a;
        }

        @NotNull
        /* renamed from: b */
        public final KSerializer<?> m3108b() {
            return this.f116547a;
        }

        public boolean equals(@Nullable Object obj) {
            if ((obj instanceof C44404a) && Intrinsics.m17075f(((C44404a) obj).f116547a, this.f116547a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f116547a.hashCode();
        }
    }

    /* compiled from: SerializersModule.kt */
    @Metadata
    /* renamed from: te.a$b */
    /* loaded from: classes8.dex */
    public static final class C44405b extends SerializersModule {
        @NotNull

        /* renamed from: a */
        private final Function1<List<? extends KSerializer<?>>, KSerializer<?>> f116548a;

        @Override // p987te.SerializersModule
        @NotNull
        /* renamed from: a */
        public KSerializer<?> mo3107a(@NotNull List<? extends KSerializer<?>> typeArgumentsSerializers) {
            Intrinsics.checkNotNullParameter(typeArgumentsSerializers, "typeArgumentsSerializers");
            return this.f116548a.invoke(typeArgumentsSerializers);
        }

        @NotNull
        /* renamed from: b */
        public final Function1<List<? extends KSerializer<?>>, KSerializer<?>> m3106b() {
            return this.f116548a;
        }
    }

    private SerializersModule() {
    }

    @NotNull
    /* renamed from: a */
    public abstract KSerializer<?> mo3107a(@NotNull List<? extends KSerializer<?>> list);
}
