package com.fyber.inneractive.sdk.player.cache;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.util.AbstractC15459m;
import java.io.File;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.fyber.inneractive.sdk.player.cache.m */
/* loaded from: classes4.dex */
public final class C14759m implements InterfaceC14751e {

    /* renamed from: f */
    public static final C14759m f27975f = new C14759m();

    /* renamed from: a */
    public Context f27976a;

    /* renamed from: b */
    public C14752f f27977b;

    /* renamed from: c */
    public boolean f27978c = false;

    /* renamed from: d */
    public final CopyOnWriteArrayList f27979d = new CopyOnWriteArrayList();

    /* renamed from: e */
    public final RunnableC14758l f27980e = new RunnableC14758l(this);

    /* renamed from: a */
    public static File m77640a(Context context, String str) {
        String str2;
        File externalCacheDir;
        String str3 = "";
        if (context != null && !TextUtils.isEmpty(str)) {
            if (AbstractC15459m.f30607a != null && AbstractC15459m.m76485a("android.permission.WRITE_EXTERNAL_STORAGE")) {
                try {
                    str2 = Environment.getExternalStorageState();
                } catch (Throwable unused) {
                    str2 = "";
                }
                if ("mounted".equals(str2)) {
                    try {
                        str3 = Environment.getExternalStorageState();
                    } catch (Throwable unused2) {
                    }
                    if (("mounted".equals(str3) || "mounted_ro".equals(str3)) && (externalCacheDir = context.getExternalCacheDir()) != null && externalCacheDir.getFreeSpace() > 52428800) {
                        return new File(context.getExternalCacheDir(), str);
                    }
                }
            }
            File cacheDir = context.getCacheDir();
            if (cacheDir != null && cacheDir.getFreeSpace() > 52428800) {
                return new File(context.getCacheDir(), str);
            }
        }
        return null;
    }
}
