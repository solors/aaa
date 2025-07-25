package androidx.compose.runtime.saveable;

import androidx.compose.runtime.saveable.SaveableStateRegistry;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C37559r0;
import kotlin.collections.C37563v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsJVM;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SaveableStateRegistry.kt */
@Metadata
/* loaded from: classes.dex */
public final class SaveableStateRegistryImpl implements SaveableStateRegistry {
    @NotNull
    private final Function1<Object, Boolean> canBeSaved;
    @NotNull
    private final Map<String, List<Object>> restored;
    @NotNull
    private final Map<String, List<Functions<Object>>> valueProviders;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x000c, code lost:
        r2 = kotlin.collections.C37559r0.m17285D(r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public SaveableStateRegistryImpl(@org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, ? extends java.util.List<? extends java.lang.Object>> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<java.lang.Object, java.lang.Boolean> r3) {
        /*
            r1 = this;
            java.lang.String r0 = "canBeSaved"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r1.<init>()
            r1.canBeSaved = r3
            if (r2 == 0) goto L12
            java.util.Map r2 = kotlin.collections.C37554o0.m17377D(r2)
            if (r2 != 0) goto L17
        L12:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
        L17:
            r1.restored = r2
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            r1.valueProviders = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.saveable.SaveableStateRegistryImpl.<init>(java.util.Map, kotlin.jvm.functions.Function1):void");
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public boolean canBeSaved(@NotNull Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return this.canBeSaved.invoke(value).booleanValue();
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    @Nullable
    public Object consumeRestored(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        List<Object> remove = this.restored.remove(key);
        if (remove != null && (!remove.isEmpty())) {
            if (remove.size() > 1) {
                this.restored.put(key, remove.subList(1, remove.size()));
            }
            return remove.get(0);
        }
        return null;
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    @NotNull
    public Map<String, List<Object>> performSave() {
        Map<String, List<Object>> m17285D;
        ArrayList m17172g;
        m17285D = C37559r0.m17285D(this.restored);
        for (Map.Entry<String, List<Functions<Object>>> entry : this.valueProviders.entrySet()) {
            String key = entry.getKey();
            List<Functions<Object>> value = entry.getValue();
            if (value.size() == 1) {
                Object invoke = value.get(0).invoke();
                if (invoke == null) {
                    continue;
                } else if (canBeSaved(invoke)) {
                    m17172g = C37563v.m17172g(invoke);
                    m17285D.put(key, m17172g);
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            } else {
                int size = value.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    Object invoke2 = value.get(i).invoke();
                    if (invoke2 != null && !canBeSaved(invoke2)) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    arrayList.add(invoke2);
                }
                m17285D.put(key, arrayList);
            }
        }
        return m17285D;
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    @NotNull
    public SaveableStateRegistry.Entry registerProvider(@NotNull final String key, @NotNull final Functions<? extends Object> valueProvider) {
        boolean m16635B;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(valueProvider, "valueProvider");
        m16635B = StringsJVM.m16635B(key);
        if (!m16635B) {
            Map<String, List<Functions<Object>>> map = this.valueProviders;
            List<Functions<Object>> list = map.get(key);
            if (list == null) {
                list = new ArrayList<>();
                map.put(key, list);
            }
            list.add(valueProvider);
            return new SaveableStateRegistry.Entry() { // from class: androidx.compose.runtime.saveable.SaveableStateRegistryImpl$registerProvider$3
                {
                    SaveableStateRegistryImpl.this = this;
                }

                @Override // androidx.compose.runtime.saveable.SaveableStateRegistry.Entry
                public void unregister() {
                    Map map2;
                    Map map3;
                    map2 = SaveableStateRegistryImpl.this.valueProviders;
                    List list2 = (List) map2.remove(key);
                    if (list2 != null) {
                        list2.remove(valueProvider);
                    }
                    if (list2 != null && (!list2.isEmpty())) {
                        map3 = SaveableStateRegistryImpl.this.valueProviders;
                        map3.put(key, list2);
                    }
                }
            };
        }
        throw new IllegalArgumentException("Registered key is empty or blank".toString());
    }
}
