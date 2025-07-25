package androidx.datastore.preferences.core;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p1046xd.C44983m;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PreferenceDataStoreFactory.kt */
@Metadata
/* loaded from: classes.dex */
public final class PreferenceDataStoreFactory$create$delegate$1 extends Lambda implements Functions<File> {
    final /* synthetic */ Functions<File> $produceFile;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PreferenceDataStoreFactory$create$delegate$1(Functions<? extends File> functions) {
        super(0);
        this.$produceFile = functions;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Functions
    @NotNull
    public final File invoke() {
        String m1174s;
        File invoke = this.$produceFile.invoke();
        m1174s = C44983m.m1174s(invoke);
        PreferencesSerializer preferencesSerializer = PreferencesSerializer.INSTANCE;
        if (Intrinsics.m17075f(m1174s, preferencesSerializer.getFileExtension())) {
            return invoke;
        }
        throw new IllegalStateException(("File extension for file: " + invoke + " does not match required extension for Preferences file: " + preferencesSerializer.getFileExtension()).toString());
    }
}
