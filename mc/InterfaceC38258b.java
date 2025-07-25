package mc;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Attributes.kt */
@Metadata
/* renamed from: mc.b */
/* loaded from: classes9.dex */
public interface InterfaceC38258b {

    /* compiled from: Attributes.kt */
    @Metadata
    /* renamed from: mc.b$a */
    /* loaded from: classes9.dex */
    public static final class C38259a {
        @NotNull
        /* renamed from: a */
        public static <T> T m15256a(@NotNull InterfaceC38258b interfaceC38258b, @NotNull Attributes<T> key) {
            Intrinsics.checkNotNullParameter(key, "key");
            T t = (T) interfaceC38258b.mo15254b(key);
            if (t != null) {
                return t;
            }
            throw new IllegalStateException("No instance for key " + key);
        }
    }

    @NotNull
    /* renamed from: a */
    List<Attributes<?>> mo15255a();

    @Nullable
    /* renamed from: b */
    <T> T mo15254b(@NotNull Attributes<T> attributes);

    @NotNull
    /* renamed from: c */
    <T> T mo15220c(@NotNull Attributes<T> attributes, @NotNull Functions<? extends T> functions);

    /* renamed from: d */
    <T> void mo15253d(@NotNull Attributes<T> attributes);

    @NotNull
    /* renamed from: e */
    <T> T mo15252e(@NotNull Attributes<T> attributes);

    /* renamed from: f */
    <T> void mo15251f(@NotNull Attributes<T> attributes, @NotNull T t);

    /* renamed from: g */
    boolean mo15250g(@NotNull Attributes<?> attributes);
}
