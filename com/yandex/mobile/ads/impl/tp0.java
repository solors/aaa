package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import com.yandex.mobile.ads.impl.sp0;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.InterfaceC38501j;
import p804nd.LazyJVM;

@SuppressLint({"ApplySharedPref"})
/* loaded from: classes8.dex */
public final class tp0 implements sp0, SharedPreferences.OnSharedPreferenceChangeListener {
    @NotNull

    /* renamed from: a */
    private final String f85787a;
    @NotNull

    /* renamed from: b */
    private final lt1 f85788b;
    @NotNull

    /* renamed from: c */
    private final Context f85789c;
    @NotNull

    /* renamed from: d */
    private final InterfaceC38501j f85790d;
    @NotNull

    /* renamed from: e */
    private final LinkedHashSet f85791e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.yandex.mobile.ads.impl.tp0$a */
    /* loaded from: classes8.dex */
    public static final class C31472a extends Lambda implements Functions<SharedPreferences> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C31472a() {
            super(0);
            tp0.this = r1;
        }

        @Override // kotlin.jvm.functions.Functions
        public final SharedPreferences invoke() {
            return lt1.m32196a(tp0.this.f85788b, tp0.this.f85789c, tp0.this.f85787a);
        }
    }

    public tp0(@NotNull Context context, @NotNull String fileName, @NotNull lt1 preferencesFactory) {
        InterfaceC38501j m14554a;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(preferencesFactory, "preferencesFactory");
        this.f85787a = fileName;
        this.f85788b = preferencesFactory;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.f85789c = applicationContext;
        m14554a = LazyJVM.m14554a(new C31472a());
        this.f85790d = m14554a;
        this.f85791e = new LinkedHashSet();
    }

    @Override // com.yandex.mobile.ads.impl.sp0
    public final void clear() {
        ((SharedPreferences) this.f85790d.getValue()).edit().clear().apply();
    }

    @Override // com.yandex.mobile.ads.impl.sp0
    @Nullable
    /* renamed from: d */
    public final String mo29082d(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return ((SharedPreferences) this.f85790d.getValue()).getString(key, null);
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(@Nullable SharedPreferences sharedPreferences, @Nullable String str) {
        if (str != null) {
            for (WeakReference weakReference : this.f85791e) {
                sp0.InterfaceC31386a interfaceC31386a = (sp0.InterfaceC31386a) weakReference.get();
                if (interfaceC31386a != null) {
                    interfaceC31386a.mo29570a(this, str);
                }
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.sp0
    @NotNull
    /* renamed from: a */
    public final Map<String, ?> mo29098a() {
        Map<String, ?> all = ((SharedPreferences) this.f85790d.getValue()).getAll();
        Intrinsics.checkNotNullExpressionValue(all, "getAll(...)");
        return all;
    }

    @Override // com.yandex.mobile.ads.impl.sp0
    /* renamed from: b */
    public final int mo29088b(int i, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        ((SharedPreferences) this.f85790d.getValue()).contains(key);
        return ((SharedPreferences) this.f85790d.getValue()).getInt(key, i);
    }

    @Override // com.yandex.mobile.ads.impl.sp0
    /* renamed from: c */
    public final boolean mo29083c(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return ((SharedPreferences) this.f85790d.getValue()).contains(key);
    }

    @Override // com.yandex.mobile.ads.impl.sp0
    /* renamed from: a */
    public final boolean mo29089a(@NotNull String key, boolean z) {
        Intrinsics.checkNotNullParameter(key, "key");
        return ((SharedPreferences) this.f85790d.getValue()).getBoolean(key, z);
    }

    @Override // com.yandex.mobile.ads.impl.sp0
    @Nullable
    /* renamed from: a */
    public final Set<String> mo29090a(@NotNull String key, @Nullable Set<String> set) {
        Intrinsics.checkNotNullParameter(key, "key");
        return ((SharedPreferences) this.f85790d.getValue()).getStringSet(key, set);
    }

    @Override // com.yandex.mobile.ads.impl.sp0
    /* renamed from: b */
    public final long mo29086b(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return ((SharedPreferences) this.f85790d.getValue()).getLong(key, 0L);
    }

    @Override // com.yandex.mobile.ads.impl.sp0
    /* renamed from: a */
    public final void mo29097a(int i, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        ((SharedPreferences) this.f85790d.getValue()).edit().putInt(key, i).apply();
    }

    @Override // com.yandex.mobile.ads.impl.sp0
    /* renamed from: b */
    public final void mo29085b(@NotNull String key, boolean z) {
        Intrinsics.checkNotNullParameter(key, "key");
        ((SharedPreferences) this.f85790d.getValue()).edit().putBoolean(key, z).apply();
    }

    @Override // com.yandex.mobile.ads.impl.sp0
    /* renamed from: a */
    public final void mo29093a(@NotNull String key, long j) {
        Intrinsics.checkNotNullParameter(key, "key");
        ((SharedPreferences) this.f85790d.getValue()).edit().putLong(key, j).apply();
    }

    @Override // com.yandex.mobile.ads.impl.sp0
    /* renamed from: a */
    public final void mo29092a(@NotNull String key, @Nullable String str) {
        Intrinsics.checkNotNullParameter(key, "key");
        ((SharedPreferences) this.f85790d.getValue()).edit().putString(key, str).apply();
    }

    @Override // com.yandex.mobile.ads.impl.sp0
    /* renamed from: a */
    public final void mo29091a(@NotNull String key, @Nullable HashSet hashSet) {
        Intrinsics.checkNotNullParameter(key, "key");
        ((SharedPreferences) this.f85790d.getValue()).edit().putStringSet(key, hashSet).apply();
    }

    @Override // com.yandex.mobile.ads.impl.sp0
    /* renamed from: a */
    public final void mo29096a(@NotNull sp0.InterfaceC31386a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (this.f85791e.isEmpty()) {
            ((SharedPreferences) this.f85790d.getValue()).registerOnSharedPreferenceChangeListener(this);
        }
        this.f85791e.add(new WeakReference(listener));
    }

    @Override // com.yandex.mobile.ads.impl.sp0
    /* renamed from: a */
    public final void mo29094a(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        ((SharedPreferences) this.f85790d.getValue()).edit().remove(key).apply();
    }
}
