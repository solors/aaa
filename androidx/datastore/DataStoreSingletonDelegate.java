package androidx.datastore;

import android.content.Context;
import androidx.annotation.GuardedBy;
import androidx.datastore.core.DataMigration;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.DataStoreFactory;
import androidx.datastore.core.Serializer;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.Interfaces;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DataStoreDelegate.kt */
@Metadata
/* loaded from: classes.dex */
public final class DataStoreSingletonDelegate<T> implements Interfaces<Context, DataStore<T>> {
    @GuardedBy("lock")
    @Nullable
    private volatile DataStore<T> INSTANCE;
    @Nullable
    private final ReplaceFileCorruptionHandler<T> corruptionHandler;
    @NotNull
    private final String fileName;
    @NotNull
    private final Object lock;
    @NotNull
    private final Function1<Context, List<DataMigration<T>>> produceMigrations;
    @NotNull
    private final CoroutineScope scope;
    @NotNull
    private final Serializer<T> serializer;

    /* JADX WARN: Multi-variable type inference failed */
    public DataStoreSingletonDelegate(@NotNull String fileName, @NotNull Serializer<T> serializer, @Nullable ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, @NotNull Function1<? super Context, ? extends List<? extends DataMigration<T>>> produceMigrations, @NotNull CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(produceMigrations, "produceMigrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.fileName = fileName;
        this.serializer = serializer;
        this.corruptionHandler = replaceFileCorruptionHandler;
        this.produceMigrations = produceMigrations;
        this.scope = scope;
        this.lock = new Object();
    }

    @Override // kotlin.properties.Interfaces
    public /* bridge */ /* synthetic */ Object getValue(Context context, KProperty kProperty) {
        return getValue2(context, (KProperty<?>) kProperty);
    }

    @NotNull
    /* renamed from: getValue  reason: avoid collision after fix types in other method */
    public DataStore<T> getValue2(@NotNull Context thisRef, @NotNull KProperty<?> property) {
        DataStore<T> dataStore;
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        DataStore<T> dataStore2 = this.INSTANCE;
        if (dataStore2 == null) {
            synchronized (this.lock) {
                if (this.INSTANCE == null) {
                    Context applicationContext = thisRef.getApplicationContext();
                    Serializer<T> serializer = this.serializer;
                    ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler = this.corruptionHandler;
                    Function1<Context, List<DataMigration<T>>> function1 = this.produceMigrations;
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
                    this.INSTANCE = DataStoreFactory.INSTANCE.create(serializer, replaceFileCorruptionHandler, function1.invoke(applicationContext), this.scope, new DataStoreSingletonDelegate$getValue$1$1(applicationContext, this));
                }
                dataStore = this.INSTANCE;
                Intrinsics.m17074g(dataStore);
            }
            return dataStore;
        }
        return dataStore2;
    }
}
