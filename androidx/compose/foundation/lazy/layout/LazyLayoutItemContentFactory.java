package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.p015ui.unit.Constraints;
import androidx.compose.p015ui.unit.ConstraintsKt;
import androidx.compose.p015ui.unit.Density;
import androidx.compose.p015ui.unit.DensityKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LazyLayoutItemContentFactory.kt */
@ExperimentalFoundationApi
@Metadata
/* loaded from: classes.dex */
public final class LazyLayoutItemContentFactory {
    private long constraintsOfCachedLambdas;
    @NotNull
    private Density densityOfCachedLambdas;
    @NotNull
    private final Functions<LazyLayoutItemProvider> itemProvider;
    @NotNull
    private final Map<Object, CachedItemContent> lambdasCache;
    @NotNull
    private final SaveableStateHolder saveableStateHolder;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LazyLayoutItemContentFactory.kt */
    @Metadata
    /* loaded from: classes.dex */
    public final class CachedItemContent {
        @Nullable
        private Function2<? super Composer, ? super Integer, Unit> _content;
        @NotNull
        private final Object key;
        @NotNull
        private final SnapshotState lastKnownIndex$delegate;
        final /* synthetic */ LazyLayoutItemContentFactory this$0;
        @Nullable
        private final Object type;

        public CachedItemContent(LazyLayoutItemContentFactory lazyLayoutItemContentFactory, @NotNull int i, @Nullable Object key, Object obj) {
            SnapshotState mutableStateOf$default;
            Intrinsics.checkNotNullParameter(key, "key");
            this.this$0 = lazyLayoutItemContentFactory;
            this.key = key;
            this.type = obj;
            mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Integer.valueOf(i), null, 2, null);
            this.lastKnownIndex$delegate = mutableStateOf$default;
        }

        private final Function2<Composer, Integer, Unit> createContentLambda() {
            return ComposableLambdaKt.composableLambdaInstance(1403994769, true, new C0570xbaaa624f(this.this$0, this));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void setLastKnownIndex(int i) {
            this.lastKnownIndex$delegate.setValue(Integer.valueOf(i));
        }

        @NotNull
        public final Function2<Composer, Integer, Unit> getContent() {
            Function2 function2 = this._content;
            if (function2 == null) {
                Function2<Composer, Integer, Unit> createContentLambda = createContentLambda();
                this._content = createContentLambda;
                return createContentLambda;
            }
            return function2;
        }

        @NotNull
        public final Object getKey() {
            return this.key;
        }

        public final int getLastKnownIndex() {
            return ((Number) this.lastKnownIndex$delegate.getValue()).intValue();
        }

        @Nullable
        public final Object getType() {
            return this.type;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LazyLayoutItemContentFactory(@NotNull SaveableStateHolder saveableStateHolder, @NotNull Functions<? extends LazyLayoutItemProvider> itemProvider) {
        Intrinsics.checkNotNullParameter(saveableStateHolder, "saveableStateHolder");
        Intrinsics.checkNotNullParameter(itemProvider, "itemProvider");
        this.saveableStateHolder = saveableStateHolder;
        this.itemProvider = itemProvider;
        this.lambdasCache = new LinkedHashMap();
        this.densityOfCachedLambdas = DensityKt.Density(0.0f, 0.0f);
        this.constraintsOfCachedLambdas = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
    }

    @NotNull
    public final Function2<Composer, Integer, Unit> getContent(int i, @NotNull Object key) {
        Intrinsics.checkNotNullParameter(key, "key");
        CachedItemContent cachedItemContent = this.lambdasCache.get(key);
        Object contentType = this.itemProvider.invoke().getContentType(i);
        if (cachedItemContent != null && cachedItemContent.getLastKnownIndex() == i && Intrinsics.m17075f(cachedItemContent.getType(), contentType)) {
            return cachedItemContent.getContent();
        }
        CachedItemContent cachedItemContent2 = new CachedItemContent(this, i, key, contentType);
        this.lambdasCache.put(key, cachedItemContent2);
        return cachedItemContent2.getContent();
    }

    @Nullable
    public final Object getContentType(@Nullable Object obj) {
        CachedItemContent cachedItemContent = this.lambdasCache.get(obj);
        if (cachedItemContent != null) {
            return cachedItemContent.getType();
        }
        LazyLayoutItemProvider invoke = this.itemProvider.invoke();
        Integer num = invoke.getKeyToIndexMap().get(obj);
        if (num != null) {
            return invoke.getContentType(num.intValue());
        }
        return null;
    }

    @NotNull
    public final Functions<LazyLayoutItemProvider> getItemProvider() {
        return this.itemProvider;
    }

    /* renamed from: onBeforeMeasure-0kLqBqw  reason: not valid java name */
    public final void m106529onBeforeMeasure0kLqBqw(@NotNull Density density, long j) {
        Intrinsics.checkNotNullParameter(density, "density");
        if (!Intrinsics.m17075f(density, this.densityOfCachedLambdas) || !Constraints.m109683equalsimpl0(j, this.constraintsOfCachedLambdas)) {
            this.densityOfCachedLambdas = density;
            this.constraintsOfCachedLambdas = j;
            this.lambdasCache.clear();
        }
    }
}
