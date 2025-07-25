package androidx.compose.runtime.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Stable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections._Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.ranges.PrimitiveRanges;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1076zd.FunctionN;

/* compiled from: ComposableLambdaN.jvm.kt */
@Stable
@Metadata
/* loaded from: classes.dex */
public final class ComposableLambdaNImpl implements ComposableLambdaN {
    @Nullable
    private Object _block;
    private final int arity;
    private final int key;
    @Nullable
    private RecomposeScope scope;
    @Nullable
    private List<RecomposeScope> scopes;
    private final boolean tracked;

    public ComposableLambdaNImpl(int i, boolean z, int i2) {
        this.key = i;
        this.tracked = z;
        this.arity = i2;
    }

    private final int realParamCount(int i) {
        int i2 = (i - 1) - 1;
        for (int i3 = 1; i3 * 10 < i2; i3++) {
            i2--;
        }
        return i2;
    }

    private final void trackRead(Composer composer) {
        RecomposeScope recomposeScope;
        if (this.tracked && (recomposeScope = composer.getRecomposeScope()) != null) {
            composer.recordUsed(recomposeScope);
            if (ComposableLambdaKt.replacableWith(this.scope, recomposeScope)) {
                this.scope = recomposeScope;
                return;
            }
            List<RecomposeScope> list = this.scopes;
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                this.scopes = arrayList;
                arrayList.add(recomposeScope);
                return;
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (ComposableLambdaKt.replacableWith(list.get(i), recomposeScope)) {
                    list.set(i, recomposeScope);
                    return;
                }
            }
            list.add(recomposeScope);
        }
    }

    private final void trackWrite() {
        if (this.tracked) {
            RecomposeScope recomposeScope = this.scope;
            if (recomposeScope != null) {
                recomposeScope.invalidate();
                this.scope = null;
            }
            List<RecomposeScope> list = this.scopes;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    list.get(i).invalidate();
                }
                list.clear();
            }
        }
    }

    @Override // androidx.compose.runtime.internal.ComposableLambdaN, kotlin.jvm.internal.FunctionBase
    public int getArity() {
        return this.arity;
    }

    public final int getKey() {
        return this.key;
    }

    @Override // androidx.compose.runtime.internal.ComposableLambdaN, p1076zd.FunctionN
    @Nullable
    public Object invoke(@NotNull Object... args) {
        PrimitiveRanges m16900v;
        List m17305u0;
        int sameBits;
        Intrinsics.checkNotNullParameter(args, "args");
        int realParamCount = realParamCount(args.length);
        Object obj = args[realParamCount];
        if (obj != null) {
            Composer composer = (Composer) obj;
            m16900v = _Ranges.m16900v(0, args.length - 1);
            m17305u0 = _Arrays.m17305u0(args, m16900v);
            Object[] array = m17305u0.toArray(new Object[0]);
            if (array != null) {
                Object obj2 = args[args.length - 1];
                if (obj2 != null) {
                    int intValue = ((Integer) obj2).intValue();
                    Composer startRestartGroup = composer.startRestartGroup(this.key);
                    trackRead(startRestartGroup);
                    if (startRestartGroup.changed(this)) {
                        sameBits = ComposableLambdaKt.differentBits(realParamCount);
                    } else {
                        sameBits = ComposableLambdaKt.sameBits(realParamCount);
                    }
                    int i = intValue | sameBits;
                    Object obj3 = this._block;
                    if (obj3 != null) {
                        SpreadBuilder spreadBuilder = new SpreadBuilder(2);
                        spreadBuilder.m17014b(array);
                        spreadBuilder.m17015a(Integer.valueOf(i));
                        Object invoke = ((FunctionN) obj3).invoke(spreadBuilder.m17012d(new Object[spreadBuilder.m17013c()]));
                        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new ComposableLambdaNImpl$invoke$1(args, realParamCount, this));
                        }
                        return invoke;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.jvm.functions.FunctionN<*>");
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.Composer");
    }

    public final void update(@NotNull Object block) {
        boolean z;
        Intrinsics.checkNotNullParameter(block, "block");
        if (!Intrinsics.m17075f(block, this._block)) {
            if (this._block == null) {
                z = true;
            } else {
                z = false;
            }
            this._block = (FunctionN) block;
            if (!z) {
                trackWrite();
            }
        }
    }
}
