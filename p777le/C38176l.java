package p777le;

import ie.Symbol;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.InterfaceC37780o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1076zd.InterfaceC45268n;

/* compiled from: Select.kt */
@Metadata
/* renamed from: le.l */
/* loaded from: classes8.dex */
public final class C38176l {
    @NotNull

    /* renamed from: a */
    private static final InterfaceC45268n<Object, Object, Object, Object> f100945a = C38177a.f100951g;
    @NotNull

    /* renamed from: b */
    private static final Symbol f100946b = new Symbol("STATE_REG");
    @NotNull

    /* renamed from: c */
    private static final Symbol f100947c = new Symbol("STATE_COMPLETED");
    @NotNull

    /* renamed from: d */
    private static final Symbol f100948d = new Symbol("STATE_CANCELLED");
    @NotNull

    /* renamed from: e */
    private static final Symbol f100949e = new Symbol("NO_RESULT");
    @NotNull

    /* renamed from: f */
    private static final Symbol f100950f = new Symbol("PARAM_CLAUSE_0");

    /* compiled from: Select.kt */
    @Metadata
    /* renamed from: le.l$a */
    /* loaded from: classes8.dex */
    static final class C38177a extends Lambda implements InterfaceC45268n {

        /* renamed from: g */
        public static final C38177a f100951g = new C38177a();

        C38177a() {
            super(3);
        }

        @Override // p1076zd.InterfaceC45268n
        @Nullable
        /* renamed from: a */
        public final Void invoke(@NotNull Object obj, @Nullable Object obj2, @Nullable Object obj3) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final EnumC38179n m15495a(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return EnumC38179n.ALREADY_SELECTED;
                    }
                    throw new IllegalStateException(("Unexpected internal result: " + i).toString());
                }
                return EnumC38179n.CANCELLED;
            }
            return EnumC38179n.REREGISTER;
        }
        return EnumC38179n.SUCCESSFUL;
    }

    @NotNull
    /* renamed from: i */
    public static final Symbol m15487i() {
        return f100950f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static final boolean m15486j(InterfaceC37780o<? super Unit> interfaceC37780o, Function1<? super Throwable, Unit> function1) {
        Object mo15170C = interfaceC37780o.mo15170C(Unit.f99208a, null, function1);
        if (mo15170C == null) {
            return false;
        }
        interfaceC37780o.mo15161w(mo15170C);
        return true;
    }
}
