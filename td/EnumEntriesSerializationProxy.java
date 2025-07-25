package td;

import java.io.Serializable;
import java.lang.Enum;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: td.d */
/* loaded from: classes7.dex */
public final class EnumEntriesSerializationProxy<E extends Enum<E>> implements Serializable {
    @NotNull

    /* renamed from: c */
    private static final C44403a f116545c = new C44403a(null);
    @NotNull

    /* renamed from: b */
    private final Class<E> f116546b;

    /* compiled from: EnumEntriesSerializationProxy.kt */
    @Metadata
    /* renamed from: td.d$a */
    /* loaded from: classes7.dex */
    private static final class C44403a {
        private C44403a() {
        }

        public /* synthetic */ C44403a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public EnumEntriesSerializationProxy(@NotNull E[] entries) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        Class<E> cls = (Class<E>) entries.getClass().getComponentType();
        Intrinsics.m17074g(cls);
        this.f116546b = cls;
    }

    private final Object readResolve() {
        E[] enumConstants = this.f116546b.getEnumConstants();
        Intrinsics.checkNotNullExpressionValue(enumConstants, "getEnumConstants(...)");
        return C44401b.m3113a(enumConstants);
    }
}
