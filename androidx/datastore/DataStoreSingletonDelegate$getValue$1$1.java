package androidx.datastore;

import android.content.Context;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DataStoreDelegate.kt */
@Metadata
/* loaded from: classes.dex */
public final class DataStoreSingletonDelegate$getValue$1$1 extends Lambda implements Functions<File> {
    final /* synthetic */ Context $applicationContext;
    final /* synthetic */ DataStoreSingletonDelegate<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreSingletonDelegate$getValue$1$1(Context context, DataStoreSingletonDelegate<T> dataStoreSingletonDelegate) {
        super(0);
        this.$applicationContext = context;
        this.this$0 = dataStoreSingletonDelegate;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Functions
    @NotNull
    public final File invoke() {
        String str;
        Context applicationContext = this.$applicationContext;
        Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
        str = ((DataStoreSingletonDelegate) this.this$0).fileName;
        return DataStoreFile.dataStoreFile(applicationContext, str);
    }
}
