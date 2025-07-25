package com.smaato.sdk.core.framework;

import android.app.Application;
import androidx.annotation.NonNull;
import com.smaato.sdk.core.appconfigcheck.ExpectedManifestEntries;

/* loaded from: classes7.dex */
public interface CoreModuleLoaderInterface extends BaseModuleInterface {
    @NonNull
    ExpectedManifestEntries getExpectedManifestEntries();

    void setApplication(Application application);
}
