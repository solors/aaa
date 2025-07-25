package p987te;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import p821oe.InterfaceC39165j;

@Metadata
/* renamed from: te.e */
/* loaded from: classes8.dex */
public interface SerializersModuleCollector {

    /* compiled from: SerializersModuleCollector.kt */
    @Metadata
    /* renamed from: te.e$a */
    /* loaded from: classes8.dex */
    public static final class C44408a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SerializersModuleCollector.kt */
        @Metadata
        /* renamed from: te.e$a$a */
        /* loaded from: classes8.dex */
        public static final class C44409a extends Lambda implements Function1<List<? extends KSerializer<?>>, KSerializer<?>> {

            /* renamed from: g */
            final /* synthetic */ KSerializer<T> f116554g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C44409a(KSerializer<T> kSerializer) {
                super(1);
                this.f116554g = kSerializer;
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            /* renamed from: b */
            public final KSerializer<?> invoke(@NotNull List<? extends KSerializer<?>> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return this.f116554g;
            }
        }

        /* renamed from: a */
        public static <T> void m3094a(@NotNull SerializersModuleCollector serializersModuleCollector, @NotNull KClass<T> kClass, @NotNull KSerializer<T> serializer) {
            Intrinsics.checkNotNullParameter(kClass, "kClass");
            Intrinsics.checkNotNullParameter(serializer, "serializer");
            serializersModuleCollector.mo3095e(kClass, new C44409a(serializer));
        }
    }

    /* renamed from: a */
    <Base> void mo3099a(@NotNull KClass<Base> kClass, @NotNull Function1<? super String, ? extends p821oe.KSerializer<? extends Base>> function1);

    /* renamed from: b */
    <Base> void mo3098b(@NotNull KClass<Base> kClass, @NotNull Function1<? super Base, ? extends InterfaceC39165j<? super Base>> function1);

    /* renamed from: c */
    <Base, Sub extends Base> void mo3097c(@NotNull KClass<Base> kClass, @NotNull KClass<Sub> kClass2, @NotNull KSerializer<Sub> kSerializer);

    /* renamed from: d */
    <T> void mo3096d(@NotNull KClass<T> kClass, @NotNull KSerializer<T> kSerializer);

    /* renamed from: e */
    <T> void mo3095e(@NotNull KClass<T> kClass, @NotNull Function1<? super List<? extends KSerializer<?>>, ? extends KSerializer<?>> function1);
}
