package androidx.compose.foundation.lazy;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1076zd.InterfaceC45269o;

/* compiled from: LazyListScopeImpl.kt */
@Metadata
/* loaded from: classes.dex */
public final class LazyListIntervalContent {
    @NotNull
    private final InterfaceC45269o<LazyItemScope, Integer, Composer, Integer, Unit> item;
    @Nullable
    private final Function1<Integer, Object> key;
    @NotNull
    private final Function1<Integer, Object> type;

    /* JADX WARN: Multi-variable type inference failed */
    public LazyListIntervalContent(@Nullable Function1<? super Integer, ? extends Object> function1, @NotNull Function1<? super Integer, ? extends Object> type, @NotNull InterfaceC45269o<? super LazyItemScope, ? super Integer, ? super Composer, ? super Integer, Unit> item) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(item, "item");
        this.key = function1;
        this.type = type;
        this.item = item;
    }

    @NotNull
    public final InterfaceC45269o<LazyItemScope, Integer, Composer, Integer, Unit> getItem() {
        return this.item;
    }

    @Nullable
    public final Function1<Integer, Object> getKey() {
        return this.key;
    }

    @NotNull
    public final Function1<Integer, Object> getType() {
        return this.type;
    }
}
