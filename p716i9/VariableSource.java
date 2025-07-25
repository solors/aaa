package p716i9;

import java.util.Collection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p743ja.Variable;

@Metadata
/* renamed from: i9.n */
/* loaded from: classes8.dex */
public interface VariableSource {
    @NotNull

    /* renamed from: a */
    public static final C33618a f92000a = C33618a.f92001a;

    /* compiled from: VariableSource.kt */
    @Metadata
    /* renamed from: i9.n$a */
    /* loaded from: classes8.dex */
    public static final class C33618a {

        /* renamed from: a */
        static final /* synthetic */ C33618a f92001a = new C33618a();

        private C33618a() {
        }

        @NotNull
        /* renamed from: a */
        public final VariableSource m23047a(@NotNull Map<String, ? extends Variable> variables, @NotNull Function1<? super String, Unit> requestObserver, @NotNull Collection<Function1<Variable, Unit>> declarationObservers) {
            Intrinsics.checkNotNullParameter(variables, "variables");
            Intrinsics.checkNotNullParameter(requestObserver, "requestObserver");
            Intrinsics.checkNotNullParameter(declarationObservers, "declarationObservers");
            return new SingleVariableSource(variables, requestObserver, declarationObservers);
        }
    }

    @Nullable
    /* renamed from: a */
    Variable mo23053a(@NotNull String str);

    /* renamed from: b */
    void mo23052b(@NotNull Function1<? super Variable, Unit> function1);

    /* renamed from: c */
    void mo23051c(@NotNull Function1<? super Variable, Unit> function1);

    /* renamed from: d */
    void mo23050d(@NotNull Function1<? super Variable, Unit> function1);

    /* renamed from: e */
    void mo23049e(@NotNull Function1<? super Variable, Unit> function1);

    /* renamed from: f */
    void mo23048f(@NotNull Function1<? super Variable, Unit> function1);
}
