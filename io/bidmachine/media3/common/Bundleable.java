package io.bidmachine.media3.common;

import android.os.Bundle;
import io.bidmachine.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes9.dex */
public interface Bundleable {

    /* loaded from: classes9.dex */
    public interface Creator<T extends Bundleable> {
        T fromBundle(Bundle bundle);
    }

    Bundle toBundle();
}
