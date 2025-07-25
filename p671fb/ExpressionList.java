package p671fb;

import com.yandex.div.core.InterfaceC29586d;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: fb.a */
/* loaded from: classes8.dex */
public final class ExpressionList<T> implements InterfaceC33099c<T> {
    @NotNull

    /* renamed from: a */
    private final List<T> f90384a;

    /* JADX WARN: Multi-variable type inference failed */
    public ExpressionList(@NotNull List<? extends T> values) {
        Intrinsics.checkNotNullParameter(values, "values");
        this.f90384a = values;
    }

    @Override // p671fb.InterfaceC33099c
    @NotNull
    /* renamed from: a */
    public List<T> mo24827a(@NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        return this.f90384a;
    }

    @Override // p671fb.InterfaceC33099c
    @NotNull
    /* renamed from: b */
    public InterfaceC29586d mo24826b(@NotNull ExpressionResolver resolver, @NotNull Function1<? super List<? extends T>, Unit> callback) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return InterfaceC29586d.f75159W7;
    }

    @NotNull
    /* renamed from: c */
    public final List<T> m24852c() {
        return this.f90384a;
    }

    public boolean equals(@Nullable Object obj) {
        if ((obj instanceof ExpressionList) && Intrinsics.m17075f(this.f90384a, ((ExpressionList) obj).f90384a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f90384a.hashCode() * 16;
    }
}
