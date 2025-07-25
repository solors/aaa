package com.pubmatic.sdk.common.network;

import androidx.annotation.NonNull;
import com.android.volley.Cache;
import com.android.volley.Network;
import com.android.volley.RequestQueue;

/* loaded from: classes7.dex */
public class POBRequestQueue extends RequestQueue {
    /* JADX INFO: Access modifiers changed from: package-private */
    public POBRequestQueue(@NonNull Cache cache, @NonNull Network network) {
        super(cache, network);
    }
}
