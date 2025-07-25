package com.mbridge.msdk.foundation.download.download;

import com.mbridge.msdk.foundation.controller.MBSDKContext;
import com.mbridge.msdk.foundation.same.p440e.CommonTask;
import com.mbridge.msdk.foundation.same.p440e.CommonTaskLoader;

/* loaded from: classes6.dex */
public class DownloadTask {
    private CommonTaskLoader mLoader;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static class DownloadTaskHolder {
        public static DownloadTask instance = new DownloadTask();

        private DownloadTaskHolder() {
        }
    }

    public static DownloadTask getInstance() {
        return DownloadTaskHolder.instance;
    }

    private void init() {
        if (MBSDKContext.m52746m().m52792c() != null) {
            this.mLoader = new CommonTaskLoader(MBSDKContext.m52746m().m52792c());
        }
    }

    public void runTask(CommonTask commonTask) {
        CommonTaskLoader commonTaskLoader = this.mLoader;
        if (commonTaskLoader != null) {
            commonTaskLoader.m52233a(commonTask);
        }
    }

    private DownloadTask() {
        init();
    }
}
