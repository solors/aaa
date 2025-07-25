package p777le;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1076zd.InterfaceC45268n;

/* compiled from: Select.kt */
@Metadata
/* renamed from: le.f */
/* loaded from: classes8.dex */
public final class C38168f implements InterfaceC38167e {
    @NotNull

    /* renamed from: a */
    private final Object f100918a;
    @NotNull

    /* renamed from: b */
    private final InterfaceC45268n<Object, InterfaceC38175k<?>, Object, Unit> f100919b;
    @Nullable

    /* renamed from: c */
    private final InterfaceC45268n<InterfaceC38175k<?>, Object, Object, Function1<Throwable, Unit>> f100920c;
    @NotNull

    /* renamed from: d */
    private final InterfaceC45268n<Object, Object, Object, Object> f100921d;

    /* JADX WARN: Multi-variable type inference failed */
    public C38168f(@NotNull Object obj, @NotNull InterfaceC45268n<Object, ? super InterfaceC38175k<?>, Object, Unit> interfaceC45268n, @Nullable InterfaceC45268n<? super InterfaceC38175k<?>, Object, Object, ? extends Function1<? super Throwable, Unit>> interfaceC45268n2) {
        InterfaceC45268n<Object, Object, Object, Object> interfaceC45268n3;
        this.f100918a = obj;
        this.f100919b = interfaceC45268n;
        this.f100920c = interfaceC45268n2;
        interfaceC45268n3 = C38176l.f100945a;
        this.f100921d = interfaceC45268n3;
    }

    @Override // p777le.InterfaceC38171i
    @Nullable
    /* renamed from: a */
    public InterfaceC45268n<InterfaceC38175k<?>, Object, Object, Function1<Throwable, Unit>> mo15528a() {
        return this.f100920c;
    }

    @Override // p777le.InterfaceC38171i
    @NotNull
    /* renamed from: b */
    public InterfaceC45268n<Object, Object, Object, Object> mo15527b() {
        return this.f100921d;
    }

    @Override // p777le.InterfaceC38171i
    @NotNull
    /* renamed from: c */
    public InterfaceC45268n<Object, InterfaceC38175k<?>, Object, Unit> mo15526c() {
        return this.f100919b;
    }

    @Override // p777le.InterfaceC38171i
    @NotNull
    /* renamed from: d */
    public Object mo15525d() {
        return this.f100918a;
    }

    public /* synthetic */ C38168f(Object obj, InterfaceC45268n interfaceC45268n, InterfaceC45268n interfaceC45268n2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, interfaceC45268n, (i & 4) != 0 ? null : interfaceC45268n2);
    }
}
