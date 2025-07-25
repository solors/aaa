package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.collection.IdentityScopeMap;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SnapshotStateObserver.kt */
@StabilityInferred(parameters = 0)
@Metadata
/* loaded from: classes.dex */
public final class SnapshotStateObserver {
    public static final int $stable = 8;
    @NotNull
    private final MutableVector<ApplyMap<?>> applyMaps;
    @NotNull
    private final Function2<Set<? extends Object>, Snapshot, Unit> applyObserver;
    @Nullable
    private ObserverHandle applyUnsubscribe;
    @Nullable
    private ApplyMap<?> currentMap;
    private boolean isPaused;
    @NotNull
    private final Function1<Functions<Unit>, Unit> onChangedExecutor;
    @NotNull
    private final Function1<Object, Unit> readObserver;

    /* compiled from: SnapshotStateObserver.kt */
    @Metadata
    /* loaded from: classes.dex */
    public static final class ApplyMap<T> {
        @Nullable
        private T currentScope;
        @NotNull
        private final HashSet<Object> invalidated;
        @NotNull
        private final IdentityScopeMap<T> map;
        @NotNull
        private final Function1<T, Unit> onChanged;

        /* JADX WARN: Multi-variable type inference failed */
        public ApplyMap(@NotNull Function1<? super T, Unit> onChanged) {
            Intrinsics.checkNotNullParameter(onChanged, "onChanged");
            this.onChanged = onChanged;
            this.map = new IdentityScopeMap<>();
            this.invalidated = new HashSet<>();
        }

        public final void addValue(@NotNull Object value) {
            Intrinsics.checkNotNullParameter(value, "value");
            IdentityScopeMap<T> identityScopeMap = this.map;
            T t = this.currentScope;
            Intrinsics.m17074g(t);
            identityScopeMap.add(value, t);
        }

        public final void callOnChanged(@NotNull Collection<? extends Object> scopes) {
            Intrinsics.checkNotNullParameter(scopes, "scopes");
            Iterator<T> it = scopes.iterator();
            while (it.hasNext()) {
                this.onChanged.invoke(it.next());
            }
        }

        @Nullable
        public final T getCurrentScope() {
            return this.currentScope;
        }

        @NotNull
        public final HashSet<Object> getInvalidated() {
            return this.invalidated;
        }

        @NotNull
        public final IdentityScopeMap<T> getMap() {
            return this.map;
        }

        @NotNull
        public final Function1<T, Unit> getOnChanged() {
            return this.onChanged;
        }

        public final void setCurrentScope(@Nullable T t) {
            this.currentScope = t;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SnapshotStateObserver(@NotNull Function1<? super Functions<Unit>, Unit> onChangedExecutor) {
        Intrinsics.checkNotNullParameter(onChangedExecutor, "onChangedExecutor");
        this.onChangedExecutor = onChangedExecutor;
        this.applyObserver = new SnapshotStateObserver$applyObserver$1(this);
        this.readObserver = new SnapshotStateObserver$readObserver$1(this);
        this.applyMaps = new MutableVector<>(new ApplyMap[16], 0);
    }

    public final void callOnChanged() {
        MutableVector<ApplyMap<?>> mutableVector = this.applyMaps;
        int size = mutableVector.getSize();
        if (size > 0) {
            ApplyMap<?>[] content = mutableVector.getContent();
            int i = 0;
            do {
                ApplyMap<?> applyMap = content[i];
                HashSet<Object> invalidated = applyMap.getInvalidated();
                if (!invalidated.isEmpty()) {
                    applyMap.callOnChanged(invalidated);
                    invalidated.clear();
                }
                i++;
            } while (i < size);
        }
    }

    private final <T> ApplyMap<T> ensureMap(Function1<? super T, Unit> function1) {
        int i;
        boolean z;
        MutableVector<ApplyMap<?>> mutableVector = this.applyMaps;
        int size = mutableVector.getSize();
        if (size > 0) {
            ApplyMap<?>[] content = mutableVector.getContent();
            i = 0;
            do {
                if (content[i].getOnChanged() == function1) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    break;
                }
                i++;
            } while (i < size);
            i = -1;
        } else {
            i = -1;
        }
        if (i == -1) {
            ApplyMap<T> applyMap = new ApplyMap<>(function1);
            this.applyMaps.add(applyMap);
            return applyMap;
        }
        return (ApplyMap<T>) this.applyMaps.getContent()[i];
    }

    public final void clear(@NotNull Object scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        synchronized (this.applyMaps) {
            MutableVector<ApplyMap<?>> mutableVector = this.applyMaps;
            int size = mutableVector.getSize();
            if (size > 0) {
                ApplyMap<?>[] content = mutableVector.getContent();
                int i = 0;
                do {
                    IdentityScopeMap<?> map = content[i].getMap();
                    int size2 = map.getSize();
                    int i2 = 0;
                    for (int i3 = 0; i3 < size2; i3++) {
                        int i4 = map.getValueOrder()[i3];
                        IdentityArraySet<?> identityArraySet = map.getScopeSets()[i4];
                        Intrinsics.m17074g(identityArraySet);
                        int size3 = identityArraySet.size();
                        int i5 = 0;
                        for (int i6 = 0; i6 < size3; i6++) {
                            Object obj = identityArraySet.getValues()[i6];
                            if (obj == null) {
                                throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                            }
                            if (!(obj == scope)) {
                                if (i5 != i6) {
                                    identityArraySet.getValues()[i5] = obj;
                                }
                                i5++;
                            }
                        }
                        int size4 = identityArraySet.size();
                        for (int i7 = i5; i7 < size4; i7++) {
                            identityArraySet.getValues()[i7] = null;
                        }
                        identityArraySet.setSize(i5);
                        if (identityArraySet.size() > 0) {
                            if (i2 != i3) {
                                int i8 = map.getValueOrder()[i2];
                                map.getValueOrder()[i2] = i4;
                                map.getValueOrder()[i3] = i8;
                            }
                            i2++;
                        }
                    }
                    int size5 = map.getSize();
                    for (int i9 = i2; i9 < size5; i9++) {
                        map.getValues()[map.getValueOrder()[i9]] = null;
                    }
                    map.setSize(i2);
                    i++;
                } while (i < size);
                Unit unit = Unit.f99208a;
            } else {
                Unit unit2 = Unit.f99208a;
            }
        }
    }

    public final void clearIf(@NotNull Function1<Object, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        synchronized (this.applyMaps) {
            MutableVector<ApplyMap<?>> mutableVector = this.applyMaps;
            int size = mutableVector.getSize();
            if (size > 0) {
                ApplyMap<?>[] content = mutableVector.getContent();
                int i = 0;
                do {
                    IdentityScopeMap<?> map = content[i].getMap();
                    int size2 = map.getSize();
                    int i2 = 0;
                    for (int i3 = 0; i3 < size2; i3++) {
                        int i4 = map.getValueOrder()[i3];
                        IdentityArraySet<?> identityArraySet = map.getScopeSets()[i4];
                        Intrinsics.m17074g(identityArraySet);
                        int size3 = identityArraySet.size();
                        int i5 = 0;
                        for (int i6 = 0; i6 < size3; i6++) {
                            Object obj = identityArraySet.getValues()[i6];
                            if (obj != null) {
                                if (!predicate.invoke(obj).booleanValue()) {
                                    if (i5 != i6) {
                                        identityArraySet.getValues()[i5] = obj;
                                    }
                                    i5++;
                                }
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                            }
                        }
                        int size4 = identityArraySet.size();
                        for (int i7 = i5; i7 < size4; i7++) {
                            identityArraySet.getValues()[i7] = null;
                        }
                        identityArraySet.setSize(i5);
                        if (identityArraySet.size() > 0) {
                            if (i2 != i3) {
                                int i8 = map.getValueOrder()[i2];
                                map.getValueOrder()[i2] = i4;
                                map.getValueOrder()[i3] = i8;
                            }
                            i2++;
                        }
                    }
                    int size5 = map.getSize();
                    for (int i9 = i2; i9 < size5; i9++) {
                        map.getValues()[map.getValueOrder()[i9]] = null;
                    }
                    map.setSize(i2);
                    i++;
                } while (i < size);
                Unit unit = Unit.f99208a;
            } else {
                Unit unit2 = Unit.f99208a;
            }
        }
    }

    public final void notifyChanges(@NotNull Set<? extends Object> changes, @NotNull Snapshot snapshot) {
        Intrinsics.checkNotNullParameter(changes, "changes");
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        this.applyObserver.mo105910invoke(changes, snapshot);
    }

    public final <T> void observeReads(@NotNull T scope, @NotNull Function1<? super T, Unit> onValueChangedForScope, @NotNull Functions<Unit> block) {
        ApplyMap<?> ensureMap;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(onValueChangedForScope, "onValueChangedForScope");
        Intrinsics.checkNotNullParameter(block, "block");
        ApplyMap<?> applyMap = this.currentMap;
        boolean z = this.isPaused;
        synchronized (this.applyMaps) {
            ensureMap = ensureMap(onValueChangedForScope);
            ensureMap.getMap().removeScope(scope);
        }
        Object currentScope = ensureMap.getCurrentScope();
        ensureMap.setCurrentScope(scope);
        this.currentMap = ensureMap;
        this.isPaused = false;
        Snapshot.Companion.observe(this.readObserver, null, block);
        this.currentMap = applyMap;
        ensureMap.setCurrentScope(currentScope);
        this.isPaused = z;
    }

    public final void start() {
        this.applyUnsubscribe = Snapshot.Companion.registerApplyObserver(this.applyObserver);
    }

    public final void stop() {
        ObserverHandle observerHandle = this.applyUnsubscribe;
        if (observerHandle != null) {
            observerHandle.dispose();
        }
    }

    public final void withNoObservations(@NotNull Functions<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        boolean z = this.isPaused;
        this.isPaused = true;
        try {
            block.invoke();
        } finally {
            this.isPaused = z;
        }
    }

    public final void clear() {
        synchronized (this.applyMaps) {
            MutableVector<ApplyMap<?>> mutableVector = this.applyMaps;
            int size = mutableVector.getSize();
            if (size > 0) {
                ApplyMap<?>[] content = mutableVector.getContent();
                int i = 0;
                do {
                    content[i].getMap().clear();
                    i++;
                } while (i < size);
                Unit unit = Unit.f99208a;
            } else {
                Unit unit2 = Unit.f99208a;
            }
        }
    }
}
