package com.appsflyer;

import androidx.annotation.WorkerThread;

@Deprecated
/* loaded from: classes2.dex */
public final class CreateOneLinkHttpTask {

    @Deprecated
    /* loaded from: classes2.dex */
    public interface ResponseListener {
        @WorkerThread
        void onResponse(String str);

        @WorkerThread
        void onResponseError(String str);
    }
}
