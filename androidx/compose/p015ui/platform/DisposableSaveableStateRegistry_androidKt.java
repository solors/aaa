package androidx.compose.p015ui.platform;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.p015ui.C0825R;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p804nd.InterfaceC38498g;

/* compiled from: DisposableSaveableStateRegistry.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.platform.DisposableSaveableStateRegistry_androidKt */
/* loaded from: classes.dex */
public final class DisposableSaveableStateRegistry_androidKt {
    @NotNull
    private static final Class<? extends Object>[] AcceptableClasses = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    @NotNull
    public static final DisposableSaveableStateRegistry DisposableSaveableStateRegistry(@NotNull View view, @NotNull SavedStateRegistryOwner owner) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(owner, "owner");
        ViewParent parent = view.getParent();
        if (parent != null) {
            View view2 = (View) parent;
            Object tag = view2.getTag(C0825R.C0827id.compose_view_saveable_id_tag);
            String str = tag instanceof String ? (String) tag : null;
            if (str == null) {
                str = String.valueOf(view2.getId());
            }
            return DisposableSaveableStateRegistry(str, owner);
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.View");
    }

    public static final boolean canBeSavedToBundle(Object obj) {
        if (obj instanceof SnapshotMutableState) {
            SnapshotMutableState snapshotMutableState = (SnapshotMutableState) obj;
            if (snapshotMutableState.getPolicy() != SnapshotStateKt.neverEqualPolicy() && snapshotMutableState.getPolicy() != SnapshotStateKt.structuralEqualityPolicy() && snapshotMutableState.getPolicy() != SnapshotStateKt.referentialEqualityPolicy()) {
                return false;
            }
            T value = snapshotMutableState.getValue();
            if (value == 0) {
                return true;
            }
            return canBeSavedToBundle(value);
        } else if ((obj instanceof InterfaceC38498g) && (obj instanceof Serializable)) {
            return false;
        } else {
            for (Class<? extends Object> cls : AcceptableClasses) {
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }
    }

    public static final Bundle toBundle(Map<String, ? extends List<? extends Object>> map) {
        ArrayList<? extends Parcelable> arrayList;
        Bundle bundle = new Bundle();
        for (Map.Entry<String, ? extends List<? extends Object>> entry : map.entrySet()) {
            String key = entry.getKey();
            List<? extends Object> value = entry.getValue();
            if (value instanceof ArrayList) {
                arrayList = (ArrayList) value;
            } else {
                arrayList = new ArrayList<>(value);
            }
            bundle.putParcelableArrayList(key, arrayList);
        }
        return bundle;
    }

    private static final Map<String, List<Object>> toMap(Bundle bundle) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Set<String> keySet = bundle.keySet();
        Intrinsics.checkNotNullExpressionValue(keySet, "this.keySet()");
        for (String key : keySet) {
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(key);
            if (parcelableArrayList != null) {
                Intrinsics.checkNotNullExpressionValue(key, "key");
                linkedHashMap.put(key, parcelableArrayList);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any?> }");
            }
        }
        return linkedHashMap;
    }

    @NotNull
    public static final DisposableSaveableStateRegistry DisposableSaveableStateRegistry(@NotNull String id2, @NotNull SavedStateRegistryOwner savedStateRegistryOwner) {
        boolean z;
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "savedStateRegistryOwner");
        String str = SaveableStateRegistry.class.getSimpleName() + ':' + id2;
        SavedStateRegistry savedStateRegistry = savedStateRegistryOwner.getSavedStateRegistry();
        Bundle consumeRestoredStateForKey = savedStateRegistry.consumeRestoredStateForKey(str);
        final SaveableStateRegistry SaveableStateRegistry = SaveableStateRegistryKt.SaveableStateRegistry(consumeRestoredStateForKey != null ? toMap(consumeRestoredStateForKey) : null, C0949xcceb09c3.INSTANCE);
        try {
            savedStateRegistry.registerSavedStateProvider(str, new SavedStateRegistry.SavedStateProvider() { // from class: androidx.compose.ui.platform.DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$registered$1
                @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
                @NotNull
                public final Bundle saveState() {
                    Bundle bundle;
                    bundle = DisposableSaveableStateRegistry_androidKt.toBundle(SaveableStateRegistry.performSave());
                    return bundle;
                }
            });
            z = true;
        } catch (IllegalArgumentException unused) {
            z = false;
        }
        return new DisposableSaveableStateRegistry(SaveableStateRegistry, new C0947xec1ea390(z, savedStateRegistry, str));
    }
}
