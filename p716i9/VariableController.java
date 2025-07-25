package p716i9;

import com.yandex.div.core.InterfaceC29586d;
import com.yandex.div.core.view2.errors.ErrorCollector;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p743ja.Variable;
import p759ka.VariableProvider;

@Metadata
/* renamed from: i9.j */
/* loaded from: classes8.dex */
public interface VariableController extends VariableProvider {
    @Nullable
    /* renamed from: a */
    Variable mo23076a(@NotNull String str);

    @NotNull
    /* renamed from: b */
    InterfaceC29586d mo23075b(@NotNull List<String> list, boolean z, @NotNull Function1<? super Variable, Unit> function1);

    @NotNull
    /* renamed from: c */
    InterfaceC29586d mo23074c(@NotNull String str, @Nullable ErrorCollector errorCollector, boolean z, @NotNull Function1<? super Variable, Unit> function1);

    /* renamed from: d */
    void mo23073d();

    /* renamed from: e */
    void mo23072e();

    /* renamed from: f */
    void mo23071f(@NotNull Function1<? super Variable, Unit> function1);

    /* renamed from: g */
    void mo23070g(@NotNull Variable variable);

    @Override // p759ka.VariableProvider
    @Nullable
    default Object get(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Variable mo23076a = mo23076a(name);
        if (mo23076a != null) {
            return mo23076a.m18484c();
        }
        return null;
    }
}
