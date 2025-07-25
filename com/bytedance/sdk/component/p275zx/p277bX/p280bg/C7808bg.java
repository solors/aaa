package com.bytedance.sdk.component.p275zx.p277bX.p280bg;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import com.bytedance.sdk.component.p275zx.InterfaceC7770IL;
import com.unity3d.services.core.p621di.ServiceProvider;
import java.io.File;

/* renamed from: com.bytedance.sdk.component.zx.bX.bg.bg */
/* loaded from: classes3.dex */
public class C7808bg implements InterfaceC7770IL, Cloneable {
    private static volatile InterfaceC7770IL ldr;

    /* renamed from: IL */
    private int f17031IL;

    /* renamed from: bX */
    private boolean f17032bX;

    /* renamed from: bg */
    private long f17033bg;
    private boolean eqN;

    /* renamed from: zx */
    private File f17034zx;

    public C7808bg(int i, long j, File file) {
        this(i, j, i != 0, j != 0, file);
    }

    /* renamed from: Kg */
    private static long m87687Kg() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return statFs.getAvailableBlocks() * statFs.getBlockSize();
    }

    /* renamed from: iR */
    public static InterfaceC7770IL m87682iR() {
        return ldr;
    }

    @Override // com.bytedance.sdk.component.p275zx.InterfaceC7770IL
    /* renamed from: IL */
    public int mo87688IL() {
        return this.f17031IL;
    }

    @Override // com.bytedance.sdk.component.p275zx.InterfaceC7770IL
    /* renamed from: bX */
    public boolean mo87686bX() {
        return this.f17032bX;
    }

    @Override // com.bytedance.sdk.component.p275zx.InterfaceC7770IL
    /* renamed from: bg */
    public long mo87685bg() {
        return this.f17033bg;
    }

    @Override // com.bytedance.sdk.component.p275zx.InterfaceC7770IL
    public boolean eqN() {
        return this.eqN;
    }

    @Override // com.bytedance.sdk.component.p275zx.InterfaceC7770IL
    public boolean ldr() {
        return true;
    }

    @Override // com.bytedance.sdk.component.p275zx.InterfaceC7770IL
    /* renamed from: zx */
    public File mo87681zx() {
        return this.f17034zx;
    }

    public C7808bg(int i, long j, boolean z, boolean z2, File file) {
        this.f17033bg = j;
        this.f17031IL = i;
        this.f17032bX = z;
        this.eqN = z2;
        this.f17034zx = file;
    }

    /* renamed from: bg */
    public static void m87684bg(Context context, InterfaceC7770IL interfaceC7770IL) {
        if (interfaceC7770IL != null) {
            ldr = interfaceC7770IL;
        } else {
            ldr = m87683bg(new File(context.getCacheDir(), "image"));
        }
    }

    /* renamed from: bg */
    public static InterfaceC7770IL m87683bg(File file) {
        int min;
        long min2;
        file.mkdirs();
        if (ldr == null) {
            min = Math.min(Long.valueOf(Runtime.getRuntime().maxMemory()).intValue() / 16, 31457280);
            min2 = Math.min(m87687Kg() / 16, 41943040L);
        } else {
            min = Math.min(ldr.mo87688IL() / 2, 31457280);
            min2 = Math.min(ldr.mo87685bg() / 2, 41943040L);
        }
        return new C7808bg(Math.max(min, 26214400), Math.max(min2, (long) ServiceProvider.HTTP_CACHE_DISK_SIZE), file);
    }
}
