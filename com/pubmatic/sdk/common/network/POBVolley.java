package com.pubmatic.sdk.common.network;

import android.content.Context;
import androidx.annotation.NonNull;
import com.android.volley.Network;
import com.android.volley.toolbox.DiskBasedCache;
import java.io.File;

/* loaded from: classes7.dex */
public class POBVolley {
    public static POBRequestQueue newRequestQueue(@NonNull Context context, @NonNull Network network) {
        POBRequestQueue pOBRequestQueue = new POBRequestQueue(new DiskBasedCache(new File(context.getCacheDir(), "pmvolley")), network);
        pOBRequestQueue.start();
        return pOBRequestQueue;
    }
}
