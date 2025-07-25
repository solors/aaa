package androidx.datastore.migrations;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: SharedPreferencesMigration.kt */
@Metadata
/* loaded from: classes.dex */
public final class SharedPreferencesMigrationKt {
    @NotNull
    private static final Set<String> MIGRATE_ALL_KEYS = new LinkedHashSet();

    @NotNull
    public static final Set<String> getMIGRATE_ALL_KEYS() {
        return MIGRATE_ALL_KEYS;
    }
}
