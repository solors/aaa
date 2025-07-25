package androidx.compose.runtime.saveable;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C37559r0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SaveableStateHolder.kt */
@Metadata
/* loaded from: classes.dex */
public final class SaveableStateHolderImpl implements SaveableStateHolder {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final Saver<SaveableStateHolderImpl, ?> Saver = SaverKt.Saver(SaveableStateHolderImpl$Companion$Saver$1.INSTANCE, SaveableStateHolderImpl$Companion$Saver$2.INSTANCE);
    @Nullable
    private SaveableStateRegistry parentSaveableStateRegistry;
    @NotNull
    private final Map<Object, RegistryHolder> registryHolders;
    @NotNull
    private final Map<Object, Map<String, List<Object>>> savedStates;

    /* compiled from: SaveableStateHolder.kt */
    @Metadata
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Saver<SaveableStateHolderImpl, ?> getSaver() {
            return SaveableStateHolderImpl.Saver;
        }
    }

    /* compiled from: SaveableStateHolder.kt */
    @Metadata
    /* loaded from: classes.dex */
    public final class RegistryHolder {
        @NotNull
        private final Object key;
        @NotNull
        private final SaveableStateRegistry registry;
        private boolean shouldSave;
        final /* synthetic */ SaveableStateHolderImpl this$0;

        public RegistryHolder(@NotNull SaveableStateHolderImpl saveableStateHolderImpl, Object key) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.this$0 = saveableStateHolderImpl;
            this.key = key;
            this.shouldSave = true;
            this.registry = SaveableStateRegistryKt.SaveableStateRegistry((Map) saveableStateHolderImpl.savedStates.get(key), new SaveableStateHolderImpl$RegistryHolder$registry$1(saveableStateHolderImpl));
        }

        @NotNull
        public final Object getKey() {
            return this.key;
        }

        @NotNull
        public final SaveableStateRegistry getRegistry() {
            return this.registry;
        }

        public final boolean getShouldSave() {
            return this.shouldSave;
        }

        public final void saveTo(@NotNull Map<Object, Map<String, List<Object>>> map) {
            Intrinsics.checkNotNullParameter(map, "map");
            if (this.shouldSave) {
                Map<String, List<Object>> performSave = this.registry.performSave();
                if (performSave.isEmpty()) {
                    map.remove(this.key);
                } else {
                    map.put(this.key, performSave);
                }
            }
        }

        public final void setShouldSave(boolean z) {
            this.shouldSave = z;
        }
    }

    public SaveableStateHolderImpl() {
        this(null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<Object, Map<String, List<Object>>> saveAll() {
        Map<Object, Map<String, List<Object>>> m17285D;
        m17285D = C37559r0.m17285D(this.savedStates);
        for (RegistryHolder registryHolder : this.registryHolders.values()) {
            registryHolder.saveTo(m17285D);
        }
        if (m17285D.isEmpty()) {
            return null;
        }
        return m17285D;
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateHolder
    @Composable
    public void SaveableStateProvider(@NotNull Object key, @NotNull Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i) {
        boolean z;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-1198538093);
        startRestartGroup.startReplaceableGroup(444418301);
        startRestartGroup.startReusableGroup(207, key);
        startRestartGroup.startReplaceableGroup(-642722479);
        startRestartGroup.startReplaceableGroup(-492369756);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            SaveableStateRegistry saveableStateRegistry = this.parentSaveableStateRegistry;
            if (saveableStateRegistry != null) {
                z = saveableStateRegistry.canBeSaved(key);
            } else {
                z = true;
            }
            if (z) {
                rememberedValue = new RegistryHolder(this, key);
                startRestartGroup.updateRememberedValue(rememberedValue);
            } else {
                throw new IllegalArgumentException(("Type of the key " + key + " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
            }
        }
        startRestartGroup.endReplaceableGroup();
        RegistryHolder registryHolder = (RegistryHolder) rememberedValue;
        CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{SaveableStateRegistryKt.getLocalSaveableStateRegistry().provides(registryHolder.getRegistry())}, content, startRestartGroup, (i & 112) | 8);
        EffectsKt.DisposableEffect(Unit.f99208a, new SaveableStateHolderImpl$SaveableStateProvider$1$1(this, key, registryHolder), startRestartGroup, 0);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReusableGroup();
        startRestartGroup.endReplaceableGroup();
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new SaveableStateHolderImpl$SaveableStateProvider$2(this, key, content, i));
        }
    }

    @Nullable
    public final SaveableStateRegistry getParentSaveableStateRegistry() {
        return this.parentSaveableStateRegistry;
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateHolder
    public void removeState(@NotNull Object key) {
        Intrinsics.checkNotNullParameter(key, "key");
        RegistryHolder registryHolder = this.registryHolders.get(key);
        if (registryHolder != null) {
            registryHolder.setShouldSave(false);
        } else {
            this.savedStates.remove(key);
        }
    }

    public final void setParentSaveableStateRegistry(@Nullable SaveableStateRegistry saveableStateRegistry) {
        this.parentSaveableStateRegistry = saveableStateRegistry;
    }

    public SaveableStateHolderImpl(@NotNull Map<Object, Map<String, List<Object>>> savedStates) {
        Intrinsics.checkNotNullParameter(savedStates, "savedStates");
        this.savedStates = savedStates;
        this.registryHolders = new LinkedHashMap();
    }

    public /* synthetic */ SaveableStateHolderImpl(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new LinkedHashMap() : map);
    }
}
