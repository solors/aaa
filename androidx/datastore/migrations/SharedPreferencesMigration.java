package androidx.datastore.migrations;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.datastore.core.DataMigration;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections._Collections;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37596l;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1076zd.InterfaceC45268n;
import p804nd.C38508r;
import p804nd.InterfaceC38501j;
import p804nd.LazyJVM;
import sd.C42688d;

/* compiled from: SharedPreferencesMigration.kt */
@Metadata
/* loaded from: classes.dex */
public final class SharedPreferencesMigration<T> implements DataMigration<T> {
    @Nullable
    private final Context context;
    @Nullable
    private final Set<String> keySet;
    @NotNull
    private final InterfaceC45268n<SharedPreferencesView, T, Continuation<? super T>, Object> migrate;
    @Nullable
    private final String name;
    @NotNull
    private final InterfaceC38501j sharedPrefs$delegate;
    @NotNull
    private final Function2<T, Continuation<? super Boolean>, Object> shouldRunMigration;

    /* compiled from: SharedPreferencesMigration.kt */
    @DebugMetadata(m17095c = "androidx.datastore.migrations.SharedPreferencesMigration$1", m17094f = "SharedPreferencesMigration.kt", m17093l = {}, m17092m = "invokeSuspend")
    @Metadata
    /* renamed from: androidx.datastore.migrations.SharedPreferencesMigration$1 */
    /* loaded from: classes.dex */
    static final class C17441 extends AbstractC37596l implements Function2<T, Continuation<? super Boolean>, Object> {
        int label;

        C17441(Continuation<? super C17441> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C17441(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo105910invoke(Object obj, Continuation<? super Boolean> continuation) {
            return invoke2((C17441) obj, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            C42688d.m6959e();
            if (this.label == 0) {
                C38508r.m14539b(obj);
                return boxing.m17100a(true);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Nullable
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(T t, @Nullable Continuation<? super Boolean> continuation) {
            return ((C17441) create(t, continuation)).invokeSuspend(Unit.f99208a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SharedPreferencesMigration.kt */
    @DebugMetadata(m17095c = "androidx.datastore.migrations.SharedPreferencesMigration$2", m17094f = "SharedPreferencesMigration.kt", m17093l = {}, m17092m = "invokeSuspend")
    @Metadata
    /* renamed from: androidx.datastore.migrations.SharedPreferencesMigration$2 */
    /* loaded from: classes.dex */
    public static final class C17452 extends AbstractC37596l implements Function2<T, Continuation<? super Boolean>, Object> {
        int label;

        C17452(Continuation<? super C17452> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C17452(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo105910invoke(Object obj, Continuation<? super Boolean> continuation) {
            return invoke2((C17452) obj, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            C42688d.m6959e();
            if (this.label == 0) {
                C38508r.m14539b(obj);
                return boxing.m17100a(true);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Nullable
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(T t, @Nullable Continuation<? super Boolean> continuation) {
            return ((C17452) create(t, continuation)).invokeSuspend(Unit.f99208a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SharedPreferencesMigration.kt */
    @DebugMetadata(m17095c = "androidx.datastore.migrations.SharedPreferencesMigration$3", m17094f = "SharedPreferencesMigration.kt", m17093l = {}, m17092m = "invokeSuspend")
    @Metadata
    /* renamed from: androidx.datastore.migrations.SharedPreferencesMigration$3 */
    /* loaded from: classes.dex */
    public static final class C17463 extends AbstractC37596l implements Function2<T, Continuation<? super Boolean>, Object> {
        int label;

        C17463(Continuation<? super C17463> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C17463(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo105910invoke(Object obj, Continuation<? super Boolean> continuation) {
            return invoke2((C17463) obj, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            C42688d.m6959e();
            if (this.label == 0) {
                C38508r.m14539b(obj);
                return boxing.m17100a(true);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Nullable
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(T t, @Nullable Continuation<? super Boolean> continuation) {
            return ((C17463) create(t, continuation)).invokeSuspend(Unit.f99208a);
        }
    }

    /* compiled from: SharedPreferencesMigration.kt */
    @Metadata
    /* renamed from: androidx.datastore.migrations.SharedPreferencesMigration$4 */
    /* loaded from: classes.dex */
    static final class C17474 extends Lambda implements Functions<SharedPreferences> {
        final /* synthetic */ Context $context;
        final /* synthetic */ String $sharedPreferencesName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C17474(Context context, String str) {
            super(0);
            this.$context = context;
            this.$sharedPreferencesName = str;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Functions
        @NotNull
        public final SharedPreferences invoke() {
            SharedPreferences sharedPreferences = this.$context.getSharedPreferences(this.$sharedPreferencesName, 0);
            Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPreferences(sharedPreferencesName, Context.MODE_PRIVATE)");
            return sharedPreferences;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SharedPreferencesMigration.kt */
    @RequiresApi(24)
    @Metadata
    /* loaded from: classes.dex */
    public static final class Api24Impl {
        @NotNull
        public static final Api24Impl INSTANCE = new Api24Impl();

        private Api24Impl() {
        }

        @DoNotInline
        public static final boolean deleteSharedPreferences(@NotNull Context context, @NotNull String name) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(name, "name");
            return context.deleteSharedPreferences(name);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesMigration(@NotNull Context context, @NotNull String sharedPreferencesName, @NotNull Set<String> keysToMigrate, @NotNull InterfaceC45268n<? super SharedPreferencesView, ? super T, ? super Continuation<? super T>, ? extends Object> migrate) {
        this(context, sharedPreferencesName, keysToMigrate, null, migrate, 8, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sharedPreferencesName, "sharedPreferencesName");
        Intrinsics.checkNotNullParameter(keysToMigrate, "keysToMigrate");
        Intrinsics.checkNotNullParameter(migrate, "migrate");
    }

    private final void deleteSharedPreferences(Context context, String str) {
        if (Api24Impl.deleteSharedPreferences(context, str)) {
            return;
        }
        throw new IOException(Intrinsics.m17064q("Unable to delete SharedPreferences: ", str));
    }

    private final SharedPreferences getSharedPrefs() {
        return (SharedPreferences) this.sharedPrefs$delegate.getValue();
    }

    private final File getSharedPrefsBackup(File file) {
        return new File(Intrinsics.m17064q(file.getPath(), ".bak"));
    }

    private final File getSharedPrefsFile(Context context, String str) {
        return new File(new File(context.getApplicationInfo().dataDir, "shared_prefs"), Intrinsics.m17064q(str, ".xml"));
    }

    @Override // androidx.datastore.core.DataMigration
    @Nullable
    public Object cleanUp(@NotNull Continuation<? super Unit> continuation) throws IOException {
        Unit unit;
        Object m6959e;
        Context context;
        String str;
        SharedPreferences.Editor edit = getSharedPrefs().edit();
        Set<String> set = this.keySet;
        if (set == null) {
            edit.clear();
        } else {
            for (String str2 : set) {
                edit.remove(str2);
            }
        }
        if (edit.commit()) {
            if (getSharedPrefs().getAll().isEmpty() && (context = this.context) != null && (str = this.name) != null) {
                deleteSharedPreferences(context, str);
            }
            Set<String> set2 = this.keySet;
            if (set2 == null) {
                unit = null;
            } else {
                set2.clear();
                unit = Unit.f99208a;
            }
            m6959e = C42688d.m6959e();
            if (unit == m6959e) {
                return unit;
            }
            return Unit.f99208a;
        }
        throw new IOException("Unable to delete migrated keys from SharedPreferences.");
    }

    @Override // androidx.datastore.core.DataMigration
    @Nullable
    public Object migrate(T t, @NotNull Continuation<? super T> continuation) {
        return this.migrate.invoke(new SharedPreferencesView(getSharedPrefs(), this.keySet), t, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0069, code lost:
        if (r5.isEmpty() == false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    @Override // androidx.datastore.core.DataMigration
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object shouldMigrate(T r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.Boolean> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.datastore.migrations.SharedPreferencesMigration$shouldMigrate$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.datastore.migrations.SharedPreferencesMigration$shouldMigrate$1 r0 = (androidx.datastore.migrations.SharedPreferencesMigration$shouldMigrate$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.migrations.SharedPreferencesMigration$shouldMigrate$1 r0 = new androidx.datastore.migrations.SharedPreferencesMigration$shouldMigrate$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = sd.C42683b.m6964e()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.L$0
            androidx.datastore.migrations.SharedPreferencesMigration r5 = (androidx.datastore.migrations.SharedPreferencesMigration) r5
            p804nd.C38508r.m14539b(r6)
            goto L46
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            p804nd.C38508r.m14539b(r6)
            kotlin.jvm.functions.Function2<T, kotlin.coroutines.d<? super java.lang.Boolean>, java.lang.Object> r6 = r4.shouldRunMigration
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r6 = r6.mo105910invoke(r5, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            r5 = r4
        L46:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r0 = 0
            if (r6 != 0) goto L54
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.boxing.m17100a(r0)
            return r5
        L54:
            java.util.Set<java.lang.String> r6 = r5.keySet
            if (r6 != 0) goto L6e
            android.content.SharedPreferences r5 = r5.getSharedPrefs()
            java.util.Map r5 = r5.getAll()
            java.lang.String r6 = "sharedPrefs.all"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L6c
            goto La0
        L6c:
            r3 = r0
            goto La0
        L6e:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            android.content.SharedPreferences r5 = r5.getSharedPrefs()
            boolean r1 = r6 instanceof java.util.Collection
            if (r1 == 0) goto L82
            r1 = r6
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L82
            goto L6c
        L82:
            java.util.Iterator r6 = r6.iterator()
        L86:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L6c
            java.lang.Object r1 = r6.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r5.contains(r1)
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.boxing.m17100a(r1)
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L86
        La0:
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.boxing.m17100a(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.migrations.SharedPreferencesMigration.shouldMigrate(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesMigration(@NotNull Context context, @NotNull String sharedPreferencesName, @NotNull InterfaceC45268n<? super SharedPreferencesView, ? super T, ? super Continuation<? super T>, ? extends Object> migrate) {
        this(context, sharedPreferencesName, null, null, migrate, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sharedPreferencesName, "sharedPreferencesName");
        Intrinsics.checkNotNullParameter(migrate, "migrate");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesMigration(@NotNull Functions<? extends SharedPreferences> produceSharedPreferences, @NotNull Set<String> keysToMigrate, @NotNull InterfaceC45268n<? super SharedPreferencesView, ? super T, ? super Continuation<? super T>, ? extends Object> migrate) {
        this(produceSharedPreferences, keysToMigrate, (Function2) null, migrate, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(produceSharedPreferences, "produceSharedPreferences");
        Intrinsics.checkNotNullParameter(keysToMigrate, "keysToMigrate");
        Intrinsics.checkNotNullParameter(migrate, "migrate");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesMigration(@NotNull Functions<? extends SharedPreferences> produceSharedPreferences, @NotNull InterfaceC45268n<? super SharedPreferencesView, ? super T, ? super Continuation<? super T>, ? extends Object> migrate) {
        this(produceSharedPreferences, (Set) null, (Function2) null, migrate, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(produceSharedPreferences, "produceSharedPreferences");
        Intrinsics.checkNotNullParameter(migrate, "migrate");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private SharedPreferencesMigration(Functions<? extends SharedPreferences> functions, Set<String> set, Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2, InterfaceC45268n<? super SharedPreferencesView, ? super T, ? super Continuation<? super T>, ? extends Object> interfaceC45268n, Context context, String str) {
        InterfaceC38501j m14554a;
        this.shouldRunMigration = function2;
        this.migrate = interfaceC45268n;
        this.context = context;
        this.name = str;
        m14554a = LazyJVM.m14554a(functions);
        this.sharedPrefs$delegate = m14554a;
        this.keySet = set == SharedPreferencesMigrationKt.getMIGRATE_ALL_KEYS() ? null : _Collections.m17549d1(set);
    }

    /* synthetic */ SharedPreferencesMigration(Functions functions, Set set, Function2 function2, InterfaceC45268n interfaceC45268n, Context context, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(functions, set, (i & 4) != 0 ? new C17441(null) : function2, interfaceC45268n, context, str);
    }

    public /* synthetic */ SharedPreferencesMigration(Functions functions, Set set, Function2 function2, InterfaceC45268n interfaceC45268n, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(functions, (i & 2) != 0 ? SharedPreferencesMigrationKt.getMIGRATE_ALL_KEYS() : set, (i & 4) != 0 ? new C17452(null) : function2, interfaceC45268n);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesMigration(@NotNull Functions<? extends SharedPreferences> produceSharedPreferences, @NotNull Set<String> keysToMigrate, @NotNull Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> shouldRunMigration, @NotNull InterfaceC45268n<? super SharedPreferencesView, ? super T, ? super Continuation<? super T>, ? extends Object> migrate) {
        this(produceSharedPreferences, keysToMigrate, shouldRunMigration, migrate, (Context) null, (String) null);
        Intrinsics.checkNotNullParameter(produceSharedPreferences, "produceSharedPreferences");
        Intrinsics.checkNotNullParameter(keysToMigrate, "keysToMigrate");
        Intrinsics.checkNotNullParameter(shouldRunMigration, "shouldRunMigration");
        Intrinsics.checkNotNullParameter(migrate, "migrate");
    }

    public /* synthetic */ SharedPreferencesMigration(Context context, String str, Set set, Function2 function2, InterfaceC45268n interfaceC45268n, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i & 4) != 0 ? SharedPreferencesMigrationKt.getMIGRATE_ALL_KEYS() : set, (i & 8) != 0 ? new C17463(null) : function2, interfaceC45268n);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesMigration(@NotNull Context context, @NotNull String sharedPreferencesName, @NotNull Set<String> keysToMigrate, @NotNull Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> shouldRunMigration, @NotNull InterfaceC45268n<? super SharedPreferencesView, ? super T, ? super Continuation<? super T>, ? extends Object> migrate) {
        this(new C17474(context, sharedPreferencesName), keysToMigrate, shouldRunMigration, migrate, context, sharedPreferencesName);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sharedPreferencesName, "sharedPreferencesName");
        Intrinsics.checkNotNullParameter(keysToMigrate, "keysToMigrate");
        Intrinsics.checkNotNullParameter(shouldRunMigration, "shouldRunMigration");
        Intrinsics.checkNotNullParameter(migrate, "migrate");
    }
}
