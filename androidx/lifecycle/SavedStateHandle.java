package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.annotation.MainThread;
import androidx.annotation.RestrictTo;
import androidx.core.p017os.BundleKt;
import androidx.savedstate.SavedStateRegistry;
import ge.C33329j;
import ge.C33361p0;
import ge.InterfaceC33421z;
import ge.StateFlow;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C37559r0;
import kotlin.collections._Sets;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.C38513v;

/* compiled from: SavedStateHandle.kt */
@Metadata
/* loaded from: classes.dex */
public final class SavedStateHandle {
    @NotNull
    private static final String KEYS = "keys";
    @NotNull
    private static final String VALUES = "values";
    @NotNull
    private final Map<String, InterfaceC33421z<Object>> flows;
    @NotNull
    private final Map<String, SavingStateLiveData<?>> liveDatas;
    @NotNull
    private final Map<String, Object> regular;
    @NotNull
    private final SavedStateRegistry.SavedStateProvider savedStateProvider;
    @NotNull
    private final Map<String, SavedStateRegistry.SavedStateProvider> savedStateProviders;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final Class<? extends Object>[] ACCEPTABLE_CLASSES = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* compiled from: SavedStateHandle.kt */
    @Metadata
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @NotNull
        public final SavedStateHandle createHandle(@Nullable Bundle bundle, @Nullable Bundle bundle2) {
            boolean z;
            if (bundle == null) {
                if (bundle2 == null) {
                    return new SavedStateHandle();
                }
                HashMap hashMap = new HashMap();
                for (String key : bundle2.keySet()) {
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    hashMap.put(key, bundle2.get(key));
                }
                return new SavedStateHandle(hashMap);
            }
            ClassLoader classLoader = SavedStateHandle.class.getClassLoader();
            Intrinsics.m17074g(classLoader);
            bundle.setClassLoader(classLoader);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(SavedStateHandle.VALUES);
            if (parcelableArrayList != null && parcelableArrayList2 != null && parcelableArrayList.size() == parcelableArrayList2.size()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int size = parcelableArrayList.size();
                for (int i = 0; i < size; i++) {
                    Object obj = parcelableArrayList.get(i);
                    Intrinsics.m17073h(obj, "null cannot be cast to non-null type kotlin.String");
                    linkedHashMap.put((String) obj, parcelableArrayList2.get(i));
                }
                return new SavedStateHandle(linkedHashMap);
            }
            throw new IllegalStateException("Invalid bundle passed as restored state".toString());
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final boolean validateValue(@Nullable Object obj) {
            Class[] clsArr;
            if (obj == null) {
                return true;
            }
            for (Class cls : SavedStateHandle.ACCEPTABLE_CLASSES) {
                Intrinsics.m17074g(cls);
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }
    }

    public SavedStateHandle(@NotNull Map<String, ? extends Object> initialState) {
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.regular = linkedHashMap;
        this.savedStateProviders = new LinkedHashMap();
        this.liveDatas = new LinkedHashMap();
        this.flows = new LinkedHashMap();
        this.savedStateProvider = new SavedStateRegistry.SavedStateProvider() { // from class: androidx.lifecycle.k
            @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
            public final Bundle saveState() {
                return SavedStateHandle.m104699a(SavedStateHandle.this);
            }
        };
        linkedHashMap.putAll(initialState);
    }

    /* renamed from: a */
    public static /* synthetic */ Bundle m104699a(SavedStateHandle savedStateHandle) {
        return savedStateProvider$lambda$0(savedStateHandle);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public static final SavedStateHandle createHandle(@Nullable Bundle bundle, @Nullable Bundle bundle2) {
        return Companion.createHandle(bundle, bundle2);
    }

    private final <T> MutableLiveData<T> getLiveDataInternal(String str, boolean z, T t) {
        SavingStateLiveData<?> savingStateLiveData;
        SavingStateLiveData<?> savingStateLiveData2;
        SavingStateLiveData<?> savingStateLiveData3 = this.liveDatas.get(str);
        if (savingStateLiveData3 instanceof MutableLiveData) {
            savingStateLiveData = savingStateLiveData3;
        } else {
            savingStateLiveData = null;
        }
        if (savingStateLiveData != null) {
            return savingStateLiveData;
        }
        if (this.regular.containsKey(str)) {
            savingStateLiveData2 = new SavingStateLiveData<>(this, str, this.regular.get(str));
        } else if (z) {
            this.regular.put(str, t);
            savingStateLiveData2 = new SavingStateLiveData<>(this, str, t);
        } else {
            savingStateLiveData2 = new SavingStateLiveData<>(this, str);
        }
        this.liveDatas.put(str, savingStateLiveData2);
        return savingStateLiveData2;
    }

    public static final Bundle savedStateProvider$lambda$0(SavedStateHandle this$0) {
        Map m17269y;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        m17269y = C37559r0.m17269y(this$0.savedStateProviders);
        for (Map.Entry entry : m17269y.entrySet()) {
            this$0.set((String) entry.getKey(), ((SavedStateRegistry.SavedStateProvider) entry.getValue()).saveState());
        }
        Set<String> keySet = this$0.regular.keySet();
        ArrayList arrayList = new ArrayList(keySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : keySet) {
            arrayList.add(str);
            arrayList2.add(this$0.regular.get(str));
        }
        return BundleKt.bundleOf(C38513v.m14532a("keys", arrayList), C38513v.m14532a(VALUES, arrayList2));
    }

    @MainThread
    public final void clearSavedStateProvider(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.savedStateProviders.remove(key);
    }

    @MainThread
    public final boolean contains(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.regular.containsKey(key);
    }

    @MainThread
    @Nullable
    public final <T> T get(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            return (T) this.regular.get(key);
        } catch (ClassCastException unused) {
            remove(key);
            return null;
        }
    }

    @MainThread
    @NotNull
    public final <T> MutableLiveData<T> getLiveData(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        MutableLiveData<T> liveDataInternal = getLiveDataInternal(key, false, null);
        Intrinsics.m17073h(liveDataInternal, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<T of androidx.lifecycle.SavedStateHandle.getLiveData>");
        return liveDataInternal;
    }

    @MainThread
    @NotNull
    public final <T> StateFlow<T> getStateFlow(@NotNull String key, T t) {
        Intrinsics.checkNotNullParameter(key, "key");
        Map<String, InterfaceC33421z<Object>> map = this.flows;
        InterfaceC33421z<Object> interfaceC33421z = map.get(key);
        if (interfaceC33421z == null) {
            if (!this.regular.containsKey(key)) {
                this.regular.put(key, t);
            }
            interfaceC33421z = C33361p0.m24033a(this.regular.get(key));
            this.flows.put(key, interfaceC33421z);
            map.put(key, interfaceC33421z);
        }
        StateFlow<T> m24098c = C33329j.m24098c(interfaceC33421z);
        Intrinsics.m17073h(m24098c, "null cannot be cast to non-null type kotlinx.coroutines.flow.StateFlow<T of androidx.lifecycle.SavedStateHandle.getStateFlow>");
        return m24098c;
    }

    @MainThread
    @NotNull
    public final Set<String> keys() {
        Set m17605m;
        Set<String> m17605m2;
        m17605m = _Sets.m17605m(this.regular.keySet(), this.savedStateProviders.keySet());
        m17605m2 = _Sets.m17605m(m17605m, this.liveDatas.keySet());
        return m17605m2;
    }

    @MainThread
    @Nullable
    public final <T> T remove(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        T t = (T) this.regular.remove(key);
        SavingStateLiveData<?> remove = this.liveDatas.remove(key);
        if (remove != null) {
            remove.detach();
        }
        this.flows.remove(key);
        return t;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public final SavedStateRegistry.SavedStateProvider savedStateProvider() {
        return this.savedStateProvider;
    }

    @MainThread
    public final <T> void set(@NotNull String key, @Nullable T t) {
        SavingStateLiveData<?> savingStateLiveData;
        Intrinsics.checkNotNullParameter(key, "key");
        if (Companion.validateValue(t)) {
            SavingStateLiveData<?> savingStateLiveData2 = this.liveDatas.get(key);
            if (savingStateLiveData2 instanceof MutableLiveData) {
                savingStateLiveData = savingStateLiveData2;
            } else {
                savingStateLiveData = null;
            }
            if (savingStateLiveData != null) {
                savingStateLiveData.setValue(t);
            } else {
                this.regular.put(key, t);
            }
            InterfaceC33421z<Object> interfaceC33421z = this.flows.get(key);
            if (interfaceC33421z != null) {
                interfaceC33421z.setValue(t);
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Can't put value with type ");
        Intrinsics.m17074g(t);
        sb2.append(t.getClass());
        sb2.append(" into saved state");
        throw new IllegalArgumentException(sb2.toString());
    }

    @MainThread
    public final void setSavedStateProvider(@NotNull String key, @NotNull SavedStateRegistry.SavedStateProvider provider) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.savedStateProviders.put(key, provider);
    }

    @MainThread
    @NotNull
    public final <T> MutableLiveData<T> getLiveData(@NotNull String key, T t) {
        Intrinsics.checkNotNullParameter(key, "key");
        return getLiveDataInternal(key, true, t);
    }

    /* compiled from: SavedStateHandle.kt */
    @Metadata
    /* loaded from: classes.dex */
    public static final class SavingStateLiveData<T> extends MutableLiveData<T> {
        @Nullable
        private SavedStateHandle handle;
        @NotNull
        private String key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SavingStateLiveData(@Nullable SavedStateHandle savedStateHandle, @NotNull String key, T t) {
            super(t);
            Intrinsics.checkNotNullParameter(key, "key");
            this.key = key;
            this.handle = savedStateHandle;
        }

        public final void detach() {
            this.handle = null;
        }

        @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
        public void setValue(T t) {
            SavedStateHandle savedStateHandle = this.handle;
            if (savedStateHandle != null) {
                savedStateHandle.regular.put(this.key, t);
                InterfaceC33421z interfaceC33421z = (InterfaceC33421z) savedStateHandle.flows.get(this.key);
                if (interfaceC33421z != null) {
                    interfaceC33421z.setValue(t);
                }
            }
            super.setValue(t);
        }

        public SavingStateLiveData(@Nullable SavedStateHandle savedStateHandle, @NotNull String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.key = key;
            this.handle = savedStateHandle;
        }
    }

    public SavedStateHandle() {
        this.regular = new LinkedHashMap();
        this.savedStateProviders = new LinkedHashMap();
        this.liveDatas = new LinkedHashMap();
        this.flows = new LinkedHashMap();
        this.savedStateProvider = new SavedStateRegistry.SavedStateProvider() { // from class: androidx.lifecycle.k
            @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
            public final Bundle saveState() {
                return SavedStateHandle.m104699a(SavedStateHandle.this);
            }
        };
    }
}
