package androidx.datastore.core;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: SingleProcessDataStore.kt */
@Metadata
/* loaded from: classes.dex */
final class UnInitialized extends State<Object> {
    @NotNull
    public static final UnInitialized INSTANCE = new UnInitialized();

    private UnInitialized() {
        super(null);
    }
}
