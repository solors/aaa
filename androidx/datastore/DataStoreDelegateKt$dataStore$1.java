package androidx.datastore;

import android.content.Context;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C37563v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: DataStoreDelegate.kt */
@Metadata
/* loaded from: classes.dex */
final class DataStoreDelegateKt$dataStore$1 extends Lambda implements Function1 {
    public static final DataStoreDelegateKt$dataStore$1 INSTANCE = new DataStoreDelegateKt$dataStore$1();

    DataStoreDelegateKt$dataStore$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final List invoke(@NotNull Context it) {
        List m17166m;
        Intrinsics.checkNotNullParameter(it, "it");
        m17166m = C37563v.m17166m();
        return m17166m;
    }
}
