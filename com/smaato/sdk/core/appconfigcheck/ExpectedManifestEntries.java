package com.smaato.sdk.core.appconfigcheck;

import android.app.Activity;
import androidx.annotation.NonNull;
import com.smaato.sdk.core.util.Objects;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes7.dex */
public class ExpectedManifestEntries {
    public static final ExpectedManifestEntries EMPTY = new ExpectedManifestEntries(Collections.emptySet(), Collections.emptySet());
    @NonNull
    private final Set<Class<? extends Activity>> activities;
    @NonNull
    private final Set<String> permissionsMandatory;

    public ExpectedManifestEntries(@NonNull Set<String> set, @NonNull Set<Class<? extends Activity>> set2) {
        Objects.requireNonNull(set, "Parameter permissionsMandatory cannot be null for ExpectedManifestEntries::new");
        this.permissionsMandatory = Collections.unmodifiableSet(set);
        Objects.requireNonNull(set2, "Parameter activities cannot be null for ExpectedManifestEntries::new");
        this.activities = Collections.unmodifiableSet(set2);
    }

    @NonNull
    public Set<Class<? extends Activity>> getActivities() {
        return this.activities;
    }

    @NonNull
    public Set<String> getPermissionsMandatory() {
        return this.permissionsMandatory;
    }
}
