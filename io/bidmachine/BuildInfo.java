package io.bidmachine;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.utils.DeviceUtils;
import io.bidmachine.utils.lazy.LazyCachedValue;
import io.bidmachine.utils.lazy.LazyValue;

/* loaded from: classes9.dex */
public final class BuildInfo {
    @Nullable
    private static volatile BuildInfo instance;
    @NonNull
    private final LazyCachedValue<Boolean> isDebuggable;
    @Nullable
    private volatile String sha1Signature = null;
    @Nullable
    private volatile String sha256Signature = null;

    private BuildInfo(@NonNull final Context context) {
        this.isDebuggable = new LazyCachedValue<>(new LazyValue() { // from class: io.bidmachine.p2
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                return BuildInfo.m20613a(context);
            }
        });
    }

    /* renamed from: a */
    public static /* synthetic */ Boolean m20613a(Context context) {
        return lambda$new$0(context);
    }

    public static /* synthetic */ Boolean lambda$new$0(Context context) {
        boolean z;
        if ((context.getApplicationInfo().flags & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @NonNull
    public static BuildInfo obtain(@NonNull Context context) {
        BuildInfo buildInfo = instance;
        if (buildInfo == null) {
            synchronized (BuildInfo.class) {
                buildInfo = instance;
                if (buildInfo == null) {
                    buildInfo = new BuildInfo(context.getApplicationContext());
                    instance = buildInfo;
                }
            }
        }
        return buildInfo;
    }

    @Nullable
    public String getSha1Signature(@NonNull Context context) {
        String str = this.sha1Signature;
        if (str == null) {
            String sha1Signature = DeviceUtils.getSha1Signature(context);
            this.sha1Signature = sha1Signature;
            return sha1Signature;
        }
        return str;
    }

    @Nullable
    public String getSha256Signature(@NonNull Context context) {
        String str = this.sha256Signature;
        if (str == null) {
            String sha256Signature = DeviceUtils.getSha256Signature(context);
            this.sha256Signature = sha256Signature;
            return sha256Signature;
        }
        return str;
    }

    public boolean isDebuggable() {
        return this.isDebuggable.get().booleanValue();
    }
}
