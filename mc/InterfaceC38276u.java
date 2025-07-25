package mc;

import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: StringValues.kt */
@Metadata
/* renamed from: mc.u */
/* loaded from: classes9.dex */
public interface InterfaceC38276u {
    @Nullable
    /* renamed from: a */
    List<String> mo15209a(@NotNull String str);

    /* renamed from: b */
    boolean mo15208b();

    /* renamed from: c */
    void mo15207c(@NotNull String str, @NotNull Iterable<String> iterable);

    void clear();

    boolean contains(@NotNull String str);

    /* renamed from: d */
    void mo15206d(@NotNull StringValues stringValues);

    /* renamed from: e */
    void mo15205e(@NotNull String str, @NotNull String str2);

    @NotNull
    Set<Map.Entry<String, List<String>>> entries();

    boolean isEmpty();

    @NotNull
    Set<String> names();
}
