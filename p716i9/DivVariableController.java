package p716i9;

import android.os.Handler;
import android.os.Looper;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C37563v;
import kotlin.collections._Collections;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p743ja.Variable;

@Metadata
/* renamed from: i9.a */
/* loaded from: classes8.dex */
public final class DivVariableController {
    @Nullable

    /* renamed from: a */
    private final DivVariableController f91948a;
    @NotNull

    /* renamed from: b */
    private final Handler f91949b;
    @NotNull

    /* renamed from: c */
    private final ConcurrentHashMap<String, Variable> f91950c;
    @NotNull

    /* renamed from: d */
    private final ConcurrentLinkedQueue<Function1<Variable, Unit>> f91951d;
    @NotNull

    /* renamed from: e */
    private final Set<String> f91952e;
    @NotNull

    /* renamed from: f */
    private final Set<String> f91953f;
    @NotNull

    /* renamed from: g */
    private final ConcurrentLinkedQueue<Function1<String, Unit>> f91954g;
    @NotNull

    /* renamed from: h */
    private final Function1<String, Unit> f91955h;
    @NotNull

    /* renamed from: i */
    private final MultiVariableSource f91956i;

    /* compiled from: DivVariableController.kt */
    @Metadata
    /* renamed from: i9.a$a */
    /* loaded from: classes8.dex */
    static final class C33606a extends Lambda implements Function1<String, Unit> {
        C33606a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.f99208a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull String variableName) {
            Intrinsics.checkNotNullParameter(variableName, "variableName");
            for (Function1 function1 : DivVariableController.this.f91954g) {
                function1.invoke(variableName);
            }
        }
    }

    public DivVariableController() {
        this(null, 1, null);
    }

    /* renamed from: g */
    private final boolean m23089g(String str) {
        boolean contains;
        synchronized (this.f91952e) {
            contains = this.f91952e.contains(str);
        }
        return contains;
    }

    /* renamed from: b */
    public final void m23094b(@NotNull Function1<? super Variable, Unit> observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.f91951d.add(observer);
        DivVariableController divVariableController = this.f91948a;
        if (divVariableController != null) {
            divVariableController.m23094b(observer);
        }
    }

    /* renamed from: c */
    public final void m23093c(@NotNull Function1<? super Variable, Unit> observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        Collection<Variable> values = this.f91950c.values();
        Intrinsics.checkNotNullExpressionValue(values, "variables.values");
        for (Variable variable : values) {
            variable.m18485a(observer);
        }
        DivVariableController divVariableController = this.f91948a;
        if (divVariableController != null) {
            divVariableController.m23093c(observer);
        }
    }

    @NotNull
    /* renamed from: d */
    public final List<Variable> m23092d() {
        List<Variable> m17166m;
        List<Variable> m17569J0;
        Collection<Variable> values = this.f91950c.values();
        Intrinsics.checkNotNullExpressionValue(values, "variables.values");
        DivVariableController divVariableController = this.f91948a;
        if (divVariableController == null || (m17166m = divVariableController.m23092d()) == null) {
            m17166m = C37563v.m17166m();
        }
        m17569J0 = _Collections.m17569J0(values, m17166m);
        return m17569J0;
    }

    @Nullable
    /* renamed from: e */
    public final Variable m23091e(@NotNull String variableName) {
        Intrinsics.checkNotNullParameter(variableName, "variableName");
        if (m23089g(variableName)) {
            return this.f91950c.get(variableName);
        }
        DivVariableController divVariableController = this.f91948a;
        if (divVariableController != null) {
            return divVariableController.m23091e(variableName);
        }
        return null;
    }

    @NotNull
    /* renamed from: f */
    public final MultiVariableSource m23090f() {
        return this.f91956i;
    }

    /* renamed from: h */
    public final void m23088h(@NotNull Function1<? super Variable, Unit> observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        Collection<Variable> values = this.f91950c.values();
        Intrinsics.checkNotNullExpressionValue(values, "variables.values");
        for (Variable it : values) {
            Intrinsics.checkNotNullExpressionValue(it, "it");
            observer.invoke(it);
        }
        DivVariableController divVariableController = this.f91948a;
        if (divVariableController != null) {
            divVariableController.m23088h(observer);
        }
    }

    /* renamed from: i */
    public final void m23087i(@NotNull Function1<? super Variable, Unit> observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.f91951d.remove(observer);
        DivVariableController divVariableController = this.f91948a;
        if (divVariableController != null) {
            divVariableController.m23087i(observer);
        }
    }

    /* renamed from: j */
    public final void m23086j(@NotNull Function1<? super Variable, Unit> observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        Collection<Variable> values = this.f91950c.values();
        Intrinsics.checkNotNullExpressionValue(values, "variables.values");
        for (Variable variable : values) {
            variable.m18476k(observer);
        }
        DivVariableController divVariableController = this.f91948a;
        if (divVariableController != null) {
            divVariableController.m23086j(observer);
        }
    }

    public DivVariableController(@Nullable DivVariableController divVariableController) {
        this.f91948a = divVariableController;
        this.f91949b = new Handler(Looper.getMainLooper());
        this.f91950c = new ConcurrentHashMap<>();
        this.f91951d = new ConcurrentLinkedQueue<>();
        this.f91952e = new LinkedHashSet();
        this.f91953f = new LinkedHashSet();
        this.f91954g = new ConcurrentLinkedQueue<>();
        C33606a c33606a = new C33606a();
        this.f91955h = c33606a;
        this.f91956i = new MultiVariableSource(this, c33606a);
    }

    public /* synthetic */ DivVariableController(DivVariableController divVariableController, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : divVariableController);
    }
}
