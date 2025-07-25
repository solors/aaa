package androidx.datastore.preferences;

import android.content.Context;
import androidx.datastore.core.DataMigration;
import androidx.datastore.preferences.core.Preferences;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C37563v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PreferenceDataStoreDelegate.kt */
@Metadata
/* loaded from: classes.dex */
public final class PreferenceDataStoreDelegateKt$preferencesDataStore$1 extends Lambda implements Function1<Context, List<? extends DataMigration<Preferences>>> {
    public static final PreferenceDataStoreDelegateKt$preferencesDataStore$1 INSTANCE = new PreferenceDataStoreDelegateKt$preferencesDataStore$1();

    PreferenceDataStoreDelegateKt$preferencesDataStore$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final List<DataMigration<Preferences>> invoke(@NotNull Context it) {
        List<DataMigration<Preferences>> m17166m;
        Intrinsics.checkNotNullParameter(it, "it");
        m17166m = C37563v.m17166m();
        return m17166m;
    }
}
