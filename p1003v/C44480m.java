package p1003v;

import android.os.SystemClock;
import androidx.annotation.WorkerThread;
import java.io.File;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HardwareBitmaps.kt */
@Metadata
/* renamed from: v.m */
/* loaded from: classes2.dex */
final class C44480m {
    @NotNull

    /* renamed from: a */
    public static final C44480m f116752a = new C44480m();
    @NotNull

    /* renamed from: b */
    private static final File f116753b = new File("/proc/self/fd");

    /* renamed from: c */
    private static int f116754c = 30;

    /* renamed from: d */
    private static long f116755d = SystemClock.uptimeMillis();

    /* renamed from: e */
    private static boolean f116756e = true;

    private C44480m() {
    }

    /* renamed from: a */
    private final boolean m2804a() {
        int i = f116754c;
        f116754c = i + 1;
        if (i < 30 && SystemClock.uptimeMillis() <= f116755d + 30000) {
            return false;
        }
        return true;
    }

    @WorkerThread
    /* renamed from: b */
    public final synchronized boolean m2803b(@Nullable InterfaceC44485r interfaceC44485r) {
        if (m2804a()) {
            boolean z = false;
            f116754c = 0;
            f116755d = SystemClock.uptimeMillis();
            String[] list = f116753b.list();
            if (list == null) {
                list = new String[0];
            }
            int length = list.length;
            if (length < 800) {
                z = true;
            }
            f116756e = z;
            if (!z && interfaceC44485r != null && interfaceC44485r.getLevel() <= 5) {
                interfaceC44485r.m2795a("FileDescriptorCounter", 5, "Unable to allocate more hardware bitmaps. Number of used file descriptors: " + length, null);
            }
        }
        return f116756e;
    }
}
