package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1076zd.InterfaceC45268n;
import p1076zd.InterfaceC45269o;

/* compiled from: LazyGridDsl.kt */
@LazyGridScopeMarker
@Metadata
/* loaded from: classes.dex */
public interface LazyGridScope {
    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void item$default(LazyGridScope lazyGridScope, Object obj, Function1 function1, Object obj2, InterfaceC45268n interfaceC45268n, int i, Object obj3) {
        if (obj3 == null) {
            if ((i & 1) != 0) {
                obj = null;
            }
            if ((i & 2) != 0) {
                function1 = null;
            }
            if ((i & 4) != 0) {
                obj2 = null;
            }
            lazyGridScope.item(obj, function1, obj2, interfaceC45268n);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
    }

    static /* synthetic */ void items$default(LazyGridScope lazyGridScope, int i, Function1 function1, Function2 function2, Function1 function12, InterfaceC45269o interfaceC45269o, int i2, Object obj) {
        Function1 function13;
        Function2 function22;
        if (obj == null) {
            if ((i2 & 2) != 0) {
                function13 = null;
            } else {
                function13 = function1;
            }
            if ((i2 & 4) != 0) {
                function22 = null;
            } else {
                function22 = function2;
            }
            LazyGridScope$items$1 lazyGridScope$items$1 = function12;
            if ((i2 & 8) != 0) {
                lazyGridScope$items$1 = LazyGridScope$items$1.INSTANCE;
            }
            lazyGridScope.items(i, function13, function22, lazyGridScope$items$1, interfaceC45269o);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
    }

    void item(@Nullable Object obj, @Nullable Function1<? super LazyGridItemSpanScope, LazyGridSpan> function1, @Nullable Object obj2, @NotNull InterfaceC45268n<? super LazyGridItemScope, ? super Composer, ? super Integer, Unit> interfaceC45268n);

    void items(int i, @Nullable Function1<? super Integer, ? extends Object> function1, @Nullable Function2<? super LazyGridItemSpanScope, ? super Integer, LazyGridSpan> function2, @NotNull Function1<? super Integer, ? extends Object> function12, @NotNull InterfaceC45269o<? super LazyGridItemScope, ? super Integer, ? super Composer, ? super Integer, Unit> interfaceC45269o);
}
