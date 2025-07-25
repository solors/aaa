package com.zeus.gmc.sdk.mobileads.msa.adjump.internal.jujujpjjp;

import android.util.Log;
import com.zeus.gmc.sdk.mobileads.msa.adjump.common.MLog;

/* loaded from: classes8.dex */
public abstract class jupppjuju implements Runnable {
    public boolean jjuuju;
    private String jujujpjjp;
    private String uppjpjj;

    public jupppjuju(String str, String str2) {
        this(str, str2, false);
    }

    private String jujujpjjp(String str) {
        if (str == null) {
            return "";
        }
        return str;
    }

    public abstract void jujujpjjp() throws Exception;

    @Override // java.lang.Runnable
    public final void run() {
        try {
            jujujpjjp();
        } catch (Throwable th) {
            Log.e(MLog.addAdPrefix(this.jujujpjjp), String.format("AD-ThrowableCaughtRunnable message: %s", this.uppjpjj), th);
        }
    }

    public jupppjuju(String str, String str2, boolean z) {
        this.jujujpjjp = jujujpjjp(str);
        this.uppjpjj = jujujpjjp(str2);
        this.jjuuju = z;
    }
}
