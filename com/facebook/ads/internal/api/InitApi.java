package com.facebook.ads.internal.api;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.internal.settings.MultithreadedBundleWrapper;
import com.facebook.infer.annotation.Nullsafe;

@Keep
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes3.dex */
public interface InitApi {
    public static final int INIT_TYPE_CONTENT_PROVIDER = 0;
    public static final int INIT_TYPE_INTERNAL_API = 3;
    public static final int INIT_TYPE_PUBLIC_API = 1;
    public static final int INIT_TYPE_REMOTE_PROCESS = 2;

    void initialize(Context context, @Nullable MultithreadedBundleWrapper multithreadedBundleWrapper, @Nullable AudienceNetworkAds.InitListener initListener, int i);

    boolean isInitialized();

    void onAdLoadInvoked(Context context);

    void onContentProviderCreated(Context context);
}
