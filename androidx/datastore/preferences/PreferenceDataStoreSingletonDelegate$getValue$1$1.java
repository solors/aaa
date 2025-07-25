package androidx.datastore.preferences;

import android.content.Context;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PreferenceDataStoreDelegate.kt */
@Metadata
/* loaded from: classes.dex */
public final class PreferenceDataStoreSingletonDelegate$getValue$1$1 extends Lambda implements Functions<File> {
    final /* synthetic */ Context $applicationContext;
    final /* synthetic */ PreferenceDataStoreSingletonDelegate this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferenceDataStoreSingletonDelegate$getValue$1$1(Context context, PreferenceDataStoreSingletonDelegate preferenceDataStoreSingletonDelegate) {
        super(0);
        this.$applicationContext = context;
        this.this$0 = preferenceDataStoreSingletonDelegate;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Functions
    @NotNull
    public final File invoke() {
        String str;
        Context applicationContext = this.$applicationContext;
        Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
        str = this.this$0.name;
        return PreferenceDataStoreFile.preferencesDataStoreFile(applicationContext, str);
    }
}
