package androidx.compose.foundation.lazy;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1076zd.InterfaceC45268n;
import p1076zd.InterfaceC45269o;

/* compiled from: LazyDsl.kt */
@LazyScopeMarker
@Metadata
/* loaded from: classes.dex */
public interface LazyListScope {

    /* compiled from: LazyDsl.kt */
    @Metadata
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static void item(@NotNull LazyListScope lazyListScope, @Nullable Object obj, @Nullable Object obj2, @NotNull InterfaceC45268n<? super LazyItemScope, ? super Composer, ? super Integer, Unit> content) {
            Intrinsics.checkNotNullParameter(content, "content");
            LazyListScope.super.item(obj, obj2, content);
        }

        @Deprecated
        public static void items(@NotNull LazyListScope lazyListScope, int i, @Nullable Function1<? super Integer, ? extends Object> function1, @NotNull Function1<? super Integer, ? extends Object> contentType, @NotNull InterfaceC45269o<? super LazyItemScope, ? super Integer, ? super Composer, ? super Integer, Unit> itemContent) {
            Intrinsics.checkNotNullParameter(contentType, "contentType");
            Intrinsics.checkNotNullParameter(itemContent, "itemContent");
            LazyListScope.super.items(i, function1, contentType, itemContent);
        }

        @Deprecated
        public static /* synthetic */ void item(LazyListScope lazyListScope, Object obj, InterfaceC45268n content) {
            Intrinsics.checkNotNullParameter(content, "content");
            LazyListScope.super.item(obj, content);
        }

        @Deprecated
        public static /* synthetic */ void items(LazyListScope lazyListScope, int i, Function1 function1, InterfaceC45269o itemContent) {
            Intrinsics.checkNotNullParameter(itemContent, "itemContent");
            LazyListScope.super.items(i, function1, itemContent);
        }
    }

    static /* synthetic */ void item$default(LazyListScope lazyListScope, Object obj, Object obj2, InterfaceC45268n interfaceC45268n, int i, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }
        if ((i & 1) != 0) {
            obj = null;
        }
        if ((i & 2) != 0) {
            obj2 = null;
        }
        lazyListScope.item(obj, obj2, interfaceC45268n);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void items$default(LazyListScope lazyListScope, int i, Function1 function1, Function1 function12, InterfaceC45269o interfaceC45269o, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
        }
        if ((i2 & 2) != 0) {
            function1 = null;
        }
        if ((i2 & 4) != 0) {
            function12 = LazyListScope$items$1.INSTANCE;
        }
        lazyListScope.items(i, function1, function12, interfaceC45269o);
    }

    static /* synthetic */ void stickyHeader$default(LazyListScope lazyListScope, Object obj, Object obj2, InterfaceC45268n interfaceC45268n, int i, Object obj3) {
        if (obj3 == null) {
            if ((i & 1) != 0) {
                obj = null;
            }
            if ((i & 2) != 0) {
                obj2 = null;
            }
            lazyListScope.stickyHeader(obj, obj2, interfaceC45268n);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stickyHeader");
    }

    default void item(@Nullable Object obj, @Nullable Object obj2, @NotNull InterfaceC45268n<? super LazyItemScope, ? super Composer, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(content, "content");
        throw new IllegalStateException("The method is not implemented".toString());
    }

    default void items(int i, @Nullable Function1<? super Integer, ? extends Object> function1, @NotNull Function1<? super Integer, ? extends Object> contentType, @NotNull InterfaceC45269o<? super LazyItemScope, ? super Integer, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        throw new IllegalStateException("The method is not implemented".toString());
    }

    @ExperimentalFoundationApi
    void stickyHeader(@Nullable Object obj, @Nullable Object obj2, @NotNull InterfaceC45268n<? super LazyItemScope, ? super Composer, ? super Integer, Unit> interfaceC45268n);

    static /* synthetic */ void item$default(LazyListScope lazyListScope, Object obj, InterfaceC45268n interfaceC45268n, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }
        if ((i & 1) != 0) {
            obj = null;
        }
        lazyListScope.item(obj, interfaceC45268n);
    }

    /* synthetic */ default void item(Object obj, InterfaceC45268n content) {
        Intrinsics.checkNotNullParameter(content, "content");
        item(obj, null, content);
    }

    /* synthetic */ default void items(int i, Function1 function1, InterfaceC45269o itemContent) {
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        items(i, function1, LazyListScope$items$2.INSTANCE, itemContent);
    }

    static /* synthetic */ void items$default(LazyListScope lazyListScope, int i, Function1 function1, InterfaceC45269o interfaceC45269o, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
        }
        if ((i2 & 2) != 0) {
            function1 = null;
        }
        lazyListScope.items(i, function1, interfaceC45269o);
    }
}
