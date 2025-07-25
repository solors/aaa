package androidx.compose.runtime;

import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.extensions;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections._Collections;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1076zd.InterfaceC45268n;
import p804nd.ExceptionsH;

/* compiled from: Composer.kt */
@Metadata
/* loaded from: classes.dex */
public final class ComposerKt {
    public static final int compositionLocalMapKey = 202;
    @Nullable
    private static CompositionTracer compositionTracer = null;
    private static final int defaultsKey = -127;
    public static final int invocationKey = 200;
    private static final int nodeKey = 125;
    private static final int nodeKeyReplace = 126;
    public static final int providerKey = 201;
    public static final int providerMapsKey = 204;
    public static final int providerValuesKey = 203;
    public static final int referenceKey = 206;
    public static final int reuseKey = 207;
    private static final int rootKey = 100;
    @NotNull
    private static final InterfaceC45268n<Applier<?>, SlotWriter, RememberManager, Unit> removeCurrentGroupInstance = ComposerKt$removeCurrentGroupInstance$1.INSTANCE;
    @NotNull
    private static final InterfaceC45268n<Applier<?>, SlotWriter, RememberManager, Unit> skipToGroupEndInstance = ComposerKt$skipToGroupEndInstance$1.INSTANCE;
    @NotNull
    private static final InterfaceC45268n<Applier<?>, SlotWriter, RememberManager, Unit> endGroupInstance = ComposerKt$endGroupInstance$1.INSTANCE;
    @NotNull
    private static final InterfaceC45268n<Applier<?>, SlotWriter, RememberManager, Unit> startRootGroup = ComposerKt$startRootGroup$1.INSTANCE;
    @NotNull
    private static final InterfaceC45268n<Applier<?>, SlotWriter, RememberManager, Unit> resetSlotsInstance = ComposerKt$resetSlotsInstance$1.INSTANCE;
    @NotNull
    private static final Object invocation = new OpaqueKey(IronSourceConstants.EVENTS_PROVIDER);
    @NotNull
    private static final Object provider = new OpaqueKey(IronSourceConstants.EVENTS_PROVIDER);
    @NotNull
    private static final Object compositionLocalMap = new OpaqueKey("compositionLocalMap");
    @NotNull
    private static final Object providerValues = new OpaqueKey("providerValues");
    @NotNull
    private static final Object providerMaps = new OpaqueKey("providers");
    @NotNull
    private static final Object reference = new OpaqueKey("reference");

    public static final boolean asBool(int i) {
        if (i != 0) {
            return true;
        }
        return false;
    }

    @ComposeCompilerApi
    public static final <T> T cache(@NotNull Composer composer, boolean z, @NotNull Functions<? extends T> block) {
        Intrinsics.checkNotNullParameter(composer, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        T t = (T) composer.rememberedValue();
        if (z || t == Composer.Companion.getEmpty()) {
            T invoke = block.invoke();
            composer.updateRememberedValue(invoke);
            return invoke;
        }
        return t;
    }

    public static final List<Object> collectNodesFrom(SlotTable slotTable, Anchor anchor) {
        ArrayList arrayList = new ArrayList();
        SlotReader openReader = slotTable.openReader();
        try {
            m107171collectNodesFrom$lambda10$collectFromGroup(openReader, arrayList, slotTable.anchorIndex(anchor));
            Unit unit = Unit.f99208a;
            return arrayList;
        } finally {
            openReader.close();
        }
    }

    /* renamed from: collectNodesFrom$lambda-10$collectFromGroup */
    private static final void m107171collectNodesFrom$lambda10$collectFromGroup(SlotReader slotReader, List<Object> list, int i) {
        if (slotReader.isNode(i)) {
            list.add(slotReader.node(i));
            return;
        }
        int i2 = i + 1;
        int groupSize = i + slotReader.groupSize(i);
        while (i2 < groupSize) {
            m107171collectNodesFrom$lambda10$collectFromGroup(slotReader, list, i2);
            i2 += slotReader.groupSize(i2);
        }
    }

    @NotNull
    public static final Void composeRuntimeError(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        throw new IllegalStateException(("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + message + "). Please report to Google or use https://goo.gle/compose-feedback").toString());
    }

    @Composable
    public static final PersistentMap<CompositionLocal<Object>, State<Object>> compositionLocalMapOf(ProvidedValue<?>[] providedValueArr, PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> persistentMap, Composer composer, int i) {
        composer.startReplaceableGroup(721128344);
        PersistentMap.Builder builder = extensions.persistentHashMapOf().builder();
        for (ProvidedValue<?> providedValue : providedValueArr) {
            if (providedValue.getCanOverride() || !contains(persistentMap, providedValue.getCompositionLocal())) {
                builder.put(providedValue.getCompositionLocal(), providedValue.getCompositionLocal().provided$runtime_release(providedValue.getValue(), composer, 72));
            }
        }
        PersistentMap<CompositionLocal<Object>, State<Object>> build = builder.build();
        composer.endReplaceableGroup();
        return build;
    }

    public static final <T> boolean contains(@NotNull PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> persistentMap, @NotNull CompositionLocal<T> key) {
        Intrinsics.checkNotNullParameter(persistentMap, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return persistentMap.containsKey(key);
    }

    private static final int distanceFrom(SlotReader slotReader, int i, int i2) {
        int i3 = 0;
        while (i > 0 && i != i2) {
            i = slotReader.parent(i);
            i3++;
        }
        return i3;
    }

    public static final List<Invalidation> filterToRange(List<Invalidation> list, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        for (int findInsertLocation = findInsertLocation(list, i); findInsertLocation < list.size(); findInsertLocation++) {
            Invalidation invalidation = list.get(findInsertLocation);
            if (invalidation.getLocation() >= i2) {
                break;
            }
            arrayList.add(invalidation);
        }
        return arrayList;
    }

    private static final int findInsertLocation(List<Invalidation> list, int i) {
        int findLocation = findLocation(list, i);
        if (findLocation < 0) {
            return -(findLocation + 1);
        }
        return findLocation;
    }

    private static final int findLocation(List<Invalidation> list, int i) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            int m17071j = Intrinsics.m17071j(list.get(i3).getLocation(), i);
            if (m17071j < 0) {
                i2 = i3 + 1;
            } else if (m17071j > 0) {
                size = i3 - 1;
            } else {
                return i3;
            }
        }
        return -(i2 + 1);
    }

    public static final Invalidation firstInRange(List<Invalidation> list, int i, int i2) {
        int findInsertLocation = findInsertLocation(list, i);
        if (findInsertLocation < list.size()) {
            Invalidation invalidation = list.get(findInsertLocation);
            if (invalidation.getLocation() < i2) {
                return invalidation;
            }
            return null;
        }
        return null;
    }

    @NotNull
    public static final Object getCompositionLocalMap() {
        return compositionLocalMap;
    }

    @NotNull
    public static final Object getInvocation() {
        return invocation;
    }

    public static final Object getJoinedKey(KeyInfo keyInfo) {
        if (keyInfo.getObjectKey() != null) {
            return new JoinedKey(Integer.valueOf(keyInfo.getKey()), keyInfo.getObjectKey());
        }
        return Integer.valueOf(keyInfo.getKey());
    }

    public static final Object getKey(Object obj, Object obj2, Object obj3) {
        JoinedKey joinedKey;
        if (obj instanceof JoinedKey) {
            joinedKey = (JoinedKey) obj;
        } else {
            joinedKey = null;
        }
        if (joinedKey == null) {
            return null;
        }
        if ((!Intrinsics.m17075f(joinedKey.getLeft(), obj2) || !Intrinsics.m17075f(joinedKey.getRight(), obj3)) && (obj = getKey(joinedKey.getLeft(), obj2, obj3)) == null) {
            obj = getKey(joinedKey.getRight(), obj2, obj3);
        }
        return obj;
    }

    @NotNull
    public static final Object getProvider() {
        return provider;
    }

    @NotNull
    public static final Object getProviderMaps() {
        return providerMaps;
    }

    @NotNull
    public static final Object getProviderValues() {
        return providerValues;
    }

    @NotNull
    public static final Object getReference() {
        return reference;
    }

    public static final <T> T getValueOf(@NotNull PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> persistentMap, @NotNull CompositionLocal<T> key) {
        Intrinsics.checkNotNullParameter(persistentMap, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        State<? extends Object> state = persistentMap.get(key);
        if (state != null) {
            return (T) state.getValue();
        }
        return null;
    }

    public static final void insertIfMissing(List<Invalidation> list, int i, RecomposeScopeImpl recomposeScopeImpl, Object obj) {
        int findLocation = findLocation(list, i);
        IdentityArraySet identityArraySet = null;
        if (findLocation < 0) {
            int i2 = -(findLocation + 1);
            if (obj != null) {
                identityArraySet = new IdentityArraySet();
                identityArraySet.add(obj);
            }
            list.add(i2, new Invalidation(recomposeScopeImpl, i, identityArraySet));
        } else if (obj == null) {
            list.get(findLocation).setInstances(null);
        } else {
            IdentityArraySet<Object> instances = list.get(findLocation).getInstances();
            if (instances != null) {
                instances.add(obj);
            }
        }
    }

    @ComposeCompilerApi
    public static final boolean isTraceInProgress() {
        CompositionTracer compositionTracer2 = compositionTracer;
        if (compositionTracer2 != null && compositionTracer2.isTraceInProgress()) {
            return true;
        }
        return false;
    }

    public static final <K, V> HashMap<K, LinkedHashSet<V>> multiMap() {
        return new HashMap<>();
    }

    @NotNull
    public static final PersistentMap<CompositionLocal<Object>, State<Object>> mutate(@NotNull PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> persistentMap, @NotNull Function1<? super Map<CompositionLocal<Object>, State<Object>>, Unit> mutator) {
        Intrinsics.checkNotNullParameter(persistentMap, "<this>");
        Intrinsics.checkNotNullParameter(mutator, "mutator");
        PersistentMap.Builder<CompositionLocal<Object>, ? extends State<? extends Object>> builder = persistentMap.builder();
        mutator.invoke(builder);
        return builder.build();
    }

    public static final int nearestCommonRootOf(SlotReader slotReader, int i, int i2, int i3) {
        if (i == i2) {
            return i;
        }
        if (i != i3 && i2 != i3) {
            if (slotReader.parent(i) == i2) {
                return i2;
            }
            if (slotReader.parent(i2) == i) {
                return i;
            }
            if (slotReader.parent(i) == slotReader.parent(i2)) {
                return slotReader.parent(i);
            }
            int distanceFrom = distanceFrom(slotReader, i, i3);
            int distanceFrom2 = distanceFrom(slotReader, i2, i3);
            int i4 = distanceFrom - distanceFrom2;
            for (int i5 = 0; i5 < i4; i5++) {
                i = slotReader.parent(i);
            }
            int i6 = distanceFrom2 - distanceFrom;
            for (int i7 = 0; i7 < i6; i7++) {
                i2 = slotReader.parent(i2);
            }
            while (i != i2) {
                i = slotReader.parent(i);
                i2 = slotReader.parent(i2);
            }
            return i;
        }
        return i3;
    }

    public static final <K, V> V pop(HashMap<K, LinkedHashSet<V>> hashMap, K k) {
        Object m17530q0;
        LinkedHashSet<V> linkedHashSet = hashMap.get(k);
        if (linkedHashSet != null) {
            m17530q0 = _Collections.m17530q0(linkedHashSet);
            V v = (V) m17530q0;
            if (v != null) {
                remove(hashMap, k, v);
                return v;
            }
        }
        return null;
    }

    public static final <K, V> boolean put(HashMap<K, LinkedHashSet<V>> hashMap, K k, V v) {
        LinkedHashSet<V> linkedHashSet = hashMap.get(k);
        if (linkedHashSet == null) {
            linkedHashSet = new LinkedHashSet<>();
            hashMap.put(k, linkedHashSet);
        }
        return linkedHashSet.add(v);
    }

    private static final <K, V> Unit remove(HashMap<K, LinkedHashSet<V>> hashMap, K k, V v) {
        LinkedHashSet<V> linkedHashSet = hashMap.get(k);
        if (linkedHashSet != null) {
            linkedHashSet.remove(v);
            if (linkedHashSet.isEmpty()) {
                hashMap.remove(k);
            }
            return Unit.f99208a;
        }
        return null;
    }

    public static final void removeCurrentGroup(@NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
        RecomposeScopeImpl recomposeScopeImpl;
        CompositionImpl composition;
        Intrinsics.checkNotNullParameter(slotWriter, "<this>");
        Intrinsics.checkNotNullParameter(rememberManager, "rememberManager");
        Iterator<Object> groupSlots = slotWriter.groupSlots();
        while (groupSlots.hasNext()) {
            Object next = groupSlots.next();
            if (next instanceof RememberObserver) {
                rememberManager.forgetting((RememberObserver) next);
            } else if ((next instanceof RecomposeScopeImpl) && (composition = (recomposeScopeImpl = (RecomposeScopeImpl) next).getComposition()) != null) {
                composition.setPendingInvalidScopes$runtime_release(true);
                recomposeScopeImpl.release();
            }
        }
        slotWriter.removeGroup();
    }

    public static final Invalidation removeLocation(List<Invalidation> list, int i) {
        int findLocation = findLocation(list, i);
        if (findLocation >= 0) {
            return list.remove(findLocation);
        }
        return null;
    }

    public static final void removeRange(List<Invalidation> list, int i, int i2) {
        int findInsertLocation = findInsertLocation(list, i);
        while (findInsertLocation < list.size() && list.get(findInsertLocation).getLocation() < i2) {
            list.remove(findInsertLocation);
        }
    }

    public static final void runtimeCheck(boolean z, @NotNull Functions<? extends Object> lazyMessage) {
        Intrinsics.checkNotNullParameter(lazyMessage, "lazyMessage");
        if (z) {
            return;
        }
        composeRuntimeError(lazyMessage.invoke().toString());
        throw new ExceptionsH();
    }

    @ComposeCompilerApi
    public static final void sourceInformation(@NotNull Composer composer, @NotNull String sourceInformation) {
        Intrinsics.checkNotNullParameter(composer, "composer");
        Intrinsics.checkNotNullParameter(sourceInformation, "sourceInformation");
        composer.sourceInformation(sourceInformation);
    }

    @ComposeCompilerApi
    public static final void sourceInformationMarkerEnd(@NotNull Composer composer) {
        Intrinsics.checkNotNullParameter(composer, "composer");
        composer.sourceInformationMarkerEnd();
    }

    @ComposeCompilerApi
    public static final void sourceInformationMarkerStart(@NotNull Composer composer, int i, @NotNull String sourceInformation) {
        Intrinsics.checkNotNullParameter(composer, "composer");
        Intrinsics.checkNotNullParameter(sourceInformation, "sourceInformation");
        composer.sourceInformationMarkerStart(i, sourceInformation);
    }

    @ComposeCompilerApi
    public static final void traceEventEnd() {
        CompositionTracer compositionTracer2 = compositionTracer;
        if (compositionTracer2 != null) {
            compositionTracer2.traceEventEnd();
            Unit unit = Unit.f99208a;
        }
    }

    @ComposeCompilerApi
    public static final void traceEventStart(int i, int i2, int i3, @NotNull String info) {
        Intrinsics.checkNotNullParameter(info, "info");
        CompositionTracer compositionTracer2 = compositionTracer;
        if (compositionTracer2 != null) {
            compositionTracer2.traceEventStart(i, i2, i3, info);
            Unit unit = Unit.f99208a;
        }
    }

    public static final void runtimeCheck(boolean z) {
        if (z) {
            return;
        }
        composeRuntimeError("Check failed".toString());
        throw new ExceptionsH();
    }

    public static /* synthetic */ void getCompositionLocalMap$annotations() {
    }

    public static /* synthetic */ void getCompositionLocalMapKey$annotations() {
    }

    private static /* synthetic */ void getCompositionTracer$annotations() {
    }

    public static /* synthetic */ void getInvocation$annotations() {
    }

    public static /* synthetic */ void getInvocationKey$annotations() {
    }

    public static /* synthetic */ void getProvider$annotations() {
    }

    public static /* synthetic */ void getProviderKey$annotations() {
    }

    public static /* synthetic */ void getProviderMaps$annotations() {
    }

    public static /* synthetic */ void getProviderMapsKey$annotations() {
    }

    public static /* synthetic */ void getProviderValues$annotations() {
    }

    public static /* synthetic */ void getProviderValuesKey$annotations() {
    }

    public static /* synthetic */ void getReference$annotations() {
    }

    public static /* synthetic */ void getReferenceKey$annotations() {
    }

    public static /* synthetic */ void getReuseKey$annotations() {
    }

    public static final int asInt(boolean z) {
        return z ? 1 : 0;
    }
}
