package com.learnings.luid;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.learnings.luid.LUIDGenerator;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import p1077ze.OkHttpClient;

/* loaded from: classes6.dex */
public class LUIDGenerator {
    private final Executor executor;
    private final LUIDCache remoteGenerator;
    private final LUIDCache sandboxInGenerator;
    private final LUIDCache sandboxOutsideGenerator;

    /* loaded from: classes6.dex */
    public static class Builder {
        private Context context;
        private Executor executor;
        private String fileDirName;
        private boolean isDebug;
        private OkHttpClient okHttpClient;
        private String packageName;
        private String uuid;
        private int versionCode;
        private String versionName;

        public static /* synthetic */ Thread lambda$build$0(Runnable runnable) {
            return new Thread(runnable, "luid generator");
        }

        public LUIDGenerator build() {
            LUIDLog.showLog = this.isDebug;
            if (TextUtils.isEmpty(this.packageName)) {
                this.packageName = this.context.getPackageName();
            }
            PackageInfo packageInfo = null;
            if (TextUtils.isEmpty(this.versionName)) {
                try {
                    packageInfo = this.context.getPackageManager().getPackageInfo(this.packageName, 0);
                    this.versionName = packageInfo.versionName;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (this.versionCode <= 0) {
                if (packageInfo == null) {
                    try {
                        PackageInfo packageInfo2 = this.context.getPackageManager().getPackageInfo(this.packageName, 0);
                        this.versionName = packageInfo2.versionName;
                        this.versionCode = packageInfo2.versionCode;
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                } else {
                    this.versionCode = packageInfo.versionCode;
                }
            }
            if (!TextUtils.isEmpty(this.uuid)) {
                SandBoxInLUIDCache sandBoxInLUIDCache = new SandBoxInLUIDCache(this.context);
                SandBoxOutsideLUIDCache sandBoxOutsideLUIDCache = new SandBoxOutsideLUIDCache(this.context, this.fileDirName, this.isDebug);
                RemoteLUIDCache remoteLUIDCache = new RemoteLUIDCache(this.context, this.okHttpClient, this.packageName, this.versionName, this.versionCode, this.uuid, this.isDebug);
                if (this.executor == null) {
                    this.executor = Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: com.learnings.luid.c
                        @Override // java.util.concurrent.ThreadFactory
                        public final Thread newThread(Runnable runnable) {
                            Thread lambda$build$0;
                            lambda$build$0 = LUIDGenerator.Builder.lambda$build$0(runnable);
                            return lambda$build$0;
                        }
                    });
                }
                return new LUIDGenerator(sandBoxInLUIDCache, sandBoxOutsideLUIDCache, remoteLUIDCache, this.executor);
            }
            throw new IllegalArgumentException("uuid is empty.");
        }

        public String getPackageName() {
            return this.packageName;
        }

        public int getVersionCode() {
            return this.versionCode;
        }

        public String getVersionName() {
            return this.versionName;
        }

        public Builder setContext(Context context) {
            this.context = context;
            return this;
        }

        public Builder setDebug(boolean z) {
            this.isDebug = z;
            return this;
        }

        public Builder setExecutor(Executor executor) {
            this.executor = executor;
            return this;
        }

        public Builder setFileDirName(String str) {
            this.fileDirName = str;
            return this;
        }

        public Builder setOkHttpClient(OkHttpClient okHttpClient) {
            this.okHttpClient = okHttpClient;
            return this;
        }

        public Builder setPackageName(String str) {
            this.packageName = str;
            return this;
        }

        public Builder setUuid(String str) {
            this.uuid = str;
            return this;
        }

        public Builder setVersionCode(int i) {
            this.versionCode = i;
            return this;
        }

        public Builder setVersionName(String str) {
            this.versionName = str;
            return this;
        }
    }

    /* loaded from: classes6.dex */
    public interface ICallback {
        void onLUIDGenerated(String str);
    }

    private void bindUUID() {
        LUIDCache lUIDCache = this.sandboxInGenerator;
        if (lUIDCache instanceof SandBoxInLUIDCache) {
            ((SandBoxInLUIDCache) lUIDCache).setBindLUID();
        }
    }

    public /* synthetic */ void lambda$asynGenerator$0(ICallback iCallback) {
        postToMainThread(iCallback, generator());
    }

    private static void postToMainThread(final ICallback iCallback, final String str) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.learnings.luid.b
            @Override // java.lang.Runnable
            public final void run() {
                iCallback.onLUIDGenerated(str);
            }
        });
    }

    private String tryBindUUIDtoLUID(String str) {
        LUIDCache lUIDCache = this.sandboxInGenerator;
        if (!(lUIDCache instanceof SandBoxInLUIDCache) || ((SandBoxInLUIDCache) lUIDCache).isBindLUID()) {
            return null;
        }
        ((RemoteLUIDCache) this.remoteGenerator).setCurrentLuid(str);
        LUIDLog.log("重新请求luid, 以便完成绑定");
        String uid = this.remoteGenerator.getUID();
        if (!TextUtils.isEmpty(uid)) {
            bindUUID();
            LUIDLog.log("luid请求成功，完成uuid和luid的绑定");
        }
        return uid;
    }

    public void asynGenerator(final ICallback iCallback) {
        this.executor.execute(new Runnable() { // from class: com.learnings.luid.a
            {
                LUIDGenerator.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                LUIDGenerator.this.lambda$asynGenerator$0(iCallback);
            }
        });
    }

    public String generator() {
        String uid = this.sandboxInGenerator.getUID();
        if (!TextUtils.isEmpty(uid)) {
            this.sandboxOutsideGenerator.saveUID(uid);
            String tryBindUUIDtoLUID = tryBindUUIDtoLUID(uid);
            if (!TextUtils.isEmpty(tryBindUUIDtoLUID) && !tryBindUUIDtoLUID.equals(uid)) {
                this.sandboxInGenerator.saveUID(tryBindUUIDtoLUID);
                this.sandboxOutsideGenerator.saveUID(tryBindUUIDtoLUID);
                LUIDLog.log("绑定luid时发生变化 new luid:" + tryBindUUIDtoLUID);
                return tryBindUUIDtoLUID;
            }
            LUIDLog.log("从缓存中获取luid:" + uid);
            return uid;
        }
        String uid2 = this.sandboxOutsideGenerator.getUID();
        if (!TextUtils.isEmpty(uid2)) {
            this.sandboxInGenerator.saveUID(uid2);
            LUIDLog.log("从sd卡缓存中获取luid:" + uid2);
            return uid2;
        }
        String uid3 = this.remoteGenerator.getUID();
        if (!TextUtils.isEmpty(uid3)) {
            this.sandboxInGenerator.saveUID(uid3);
            this.sandboxOutsideGenerator.saveUID(uid3);
            bindUUID();
            LUIDLog.log("从网络中获取luid:" + uid3 + "  已完成绑定");
        }
        return uid3;
    }

    private LUIDGenerator(LUIDCache lUIDCache, LUIDCache lUIDCache2, LUIDCache lUIDCache3, Executor executor) {
        this.sandboxInGenerator = lUIDCache;
        this.sandboxOutsideGenerator = lUIDCache2;
        this.remoteGenerator = lUIDCache3;
        this.executor = executor;
    }
}
