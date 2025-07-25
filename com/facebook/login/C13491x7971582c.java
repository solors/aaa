package com.facebook.login;

import android.content.Intent;
import androidx.activity.result.ActivityResultLauncher;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: LoginManager.kt */
@Metadata
/* renamed from: com.facebook.login.LoginManager$AndroidxActivityResultRegistryOwnerStartActivityDelegate$startActivityForResult$LauncherHolder */
/* loaded from: classes4.dex */
public final class C13491x7971582c {
    @Nullable
    private ActivityResultLauncher<Intent> launcher;

    @Nullable
    public final ActivityResultLauncher<Intent> getLauncher() {
        return this.launcher;
    }

    public final void setLauncher(@Nullable ActivityResultLauncher<Intent> activityResultLauncher) {
        this.launcher = activityResultLauncher;
    }
}
