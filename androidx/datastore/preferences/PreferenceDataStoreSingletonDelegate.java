package androidx.datastore.preferences;

import android.content.Context;
import androidx.annotation.GuardedBy;
import androidx.datastore.core.DataMigration;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import androidx.datastore.preferences.core.PreferenceDataStoreFactory;
import androidx.datastore.preferences.core.Preferences;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.Interfaces;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PreferenceDataStoreDelegate.kt */
@Metadata
/* loaded from: classes.dex */
public final class PreferenceDataStoreSingletonDelegate implements Interfaces<Context, DataStore<Preferences>> {
    @GuardedBy("lock")
    @Nullable
    private volatile DataStore<Preferences> INSTANCE;
    @Nullable
    private final ReplaceFileCorruptionHandler<Preferences> corruptionHandler;
    @NotNull
    private final Object lock;
    @NotNull
    private final String name;
    @NotNull
    private final Function1<Context, List<DataMigration<Preferences>>> produceMigrations;
    @NotNull
    private final CoroutineScope scope;

    /* JADX WARN: Multi-variable type inference failed */
    public PreferenceDataStoreSingletonDelegate(@NotNull String name, @Nullable ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, @NotNull Function1<? super Context, ? extends List<? extends DataMigration<Preferences>>> produceMigrations, @NotNull CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(produceMigrations, "produceMigrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.name = name;
        this.corruptionHandler = replaceFileCorruptionHandler;
        this.produceMigrations = produceMigrations;
        this.scope = scope;
        this.lock = new Object();
    }

    @Override // kotlin.properties.Interfaces
    public /* bridge */ /* synthetic */ DataStore<Preferences> getValue(Context context, KProperty kProperty) {
        return getValue2(context, (KProperty<?>) kProperty);
    }

    @NotNull
    /* renamed from: getValue  reason: avoid collision after fix types in other method */
    public DataStore<Preferences> getValue2(@NotNull Context thisRef, @NotNull KProperty<?> property) {
        DataStore<Preferences> dataStore;
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        DataStore<Preferences> dataStore2 = this.INSTANCE;
        if (dataStore2 == null) {
            synchronized (this.lock) {
                if (this.INSTANCE == null) {
                    Context applicationContext = thisRef.getApplicationContext();
                    PreferenceDataStoreFactory preferenceDataStoreFactory = PreferenceDataStoreFactory.INSTANCE;
                    ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler = this.corruptionHandler;
                    Function1<Context, List<DataMigration<Preferences>>> function1 = this.produceMigrations;
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
                    this.INSTANCE = preferenceDataStoreFactory.create(replaceFileCorruptionHandler, function1.invoke(applicationContext), this.scope, new PreferenceDataStoreSingletonDelegate$getValue$1$1(applicationContext, this));
                }
                dataStore = this.INSTANCE;
                Intrinsics.m17074g(dataStore);
            }
            return dataStore;
        }
        return dataStore2;
    }
}
