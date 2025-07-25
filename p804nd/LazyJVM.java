package p804nd;

import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata
/* renamed from: nd.l */
/* loaded from: classes5.dex */
public class LazyJVM {

    /* compiled from: LazyJVM.kt */
    @Metadata
    /* renamed from: nd.l$a */
    /* loaded from: classes5.dex */
    public /* synthetic */ class C38503a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC38505n.values().length];
            try {
                iArr[EnumC38505n.f101865b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC38505n.f101866c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC38505n.f101867d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    /* renamed from: a */
    public static <T> InterfaceC38501j<T> m14554a(@NotNull Functions<? extends T> initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        return new C38511t(initializer, null, 2, null);
    }

    @NotNull
    /* renamed from: b */
    public static <T> InterfaceC38501j<T> m14553b(@NotNull EnumC38505n mode, @NotNull Functions<? extends T> initializer) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        int i = C38503a.$EnumSwitchMapping$0[mode.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return new C38499g0(initializer);
                }
                throw new NoWhenBranchMatchedException();
            }
            return new C38509s(initializer);
        }
        return new C38511t(initializer, null, 2, null);
    }
}
