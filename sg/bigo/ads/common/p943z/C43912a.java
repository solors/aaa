package sg.bigo.ads.common.p943z;

import android.os.Build;
import com.ironsource.C20517nb;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* renamed from: sg.bigo.ads.common.z.a */
/* loaded from: classes10.dex */
public final class C43912a {

    /* renamed from: a */
    private static String[] f114983a = {"/dev/socket/qemud", "/dev/qemu_pipe"};

    /* renamed from: b */
    private static String[] f114984b = {"/system/lib/libc_malloc_debug_qemu.so", "/sys/qemu_trace", "/system/bin/qemu-props"};

    /* renamed from: c */
    private static String[] f114985c = {"/dev/socket/genyd", "/dev/socket/baseband_genyd"};

    /* renamed from: d */
    private static String[] f114986d = {"goldfish"};

    /* JADX WARN: Removed duplicated region for block: B:15:0x0020 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0021 A[RETURN] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m4593a() {
        /*
            r0 = 0
            boolean r1 = m4589e()     // Catch: java.lang.Throwable -> L21
            r2 = 1
            if (r1 != 0) goto L1d
            boolean r1 = m4590d()     // Catch: java.lang.Throwable -> L21
            if (r1 != 0) goto L1d
            boolean r1 = m4588f()     // Catch: java.lang.Throwable -> L21
            if (r1 != 0) goto L1d
            boolean r1 = m4587g()     // Catch: java.lang.Throwable -> L21
            if (r1 == 0) goto L1b
            goto L1d
        L1b:
            r1 = r0
            goto L1e
        L1d:
            r1 = r2
        L1e:
            if (r1 == 0) goto L21
            return r2
        L21:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.common.p943z.C43912a.m4593a():int");
    }

    /* renamed from: b */
    public static String m4592b() {
        return " Build.BOARD = " + Build.BOARD + ", Build.BOOTLOADER = " + Build.BOOTLOADER + ", Build.BRAND = " + Build.BRAND + ", Build.DEVICE = " + Build.DEVICE + ", Build.DISPLAY = " + Build.DISPLAY + ", Build.FINGERPRINT = " + Build.FINGERPRINT + ", Build.HARDWARE = " + Build.HARDWARE + ", Build.HOST = " + Build.HOST + ", Build.MANUFACTURER = " + Build.MANUFACTURER + ", Build.MODEL = " + Build.MODEL + ", Build.PRODUCT = " + Build.PRODUCT + ", Build.TIME = " + Build.TIME + ", Build.TYPE = " + Build.TYPE + ", Build.ID = " + Build.USER + ", Build.VERSION.CODENAME = " + Build.VERSION.CODENAME + ", Build.VERSION.INCREMENTAL = " + Build.VERSION.INCREMENTAL + ", Build.VERSION.RELEASE = " + Build.VERSION.RELEASE + ", Build.VERSION.SDK_INT = " + Build.VERSION.SDK_INT + ",";
    }

    /* renamed from: c */
    public static String m4591c() {
        try {
            Process start = new ProcessBuilder("/system/bin/cat", "/proc/cpuinfo").start();
            StringBuilder sb2 = new StringBuilder();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(start.getInputStream(), C20517nb.f52167N));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb2.append(readLine);
                } else {
                    bufferedReader.close();
                    return sb2.toString().toLowerCase();
                }
            }
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: d */
    private static boolean m4590d() {
        try {
            for (String str : f114984b) {
                if (new File(str).exists()) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /* renamed from: e */
    private static boolean m4589e() {
        try {
            for (String str : f114983a) {
                if (new File(str).exists()) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /* renamed from: f */
    private static boolean m4588f() {
        try {
            for (String str : f114985c) {
                if (new File(str).exists()) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /* renamed from: g */
    private static boolean m4587g() {
        File[] fileArr = {new File("/proc/tty/drivers"), new File("/proc/cpuinfo")};
        for (int i = 0; i < 2; i++) {
            File file = fileArr[i];
            if (file.exists() && file.canRead()) {
                byte[] bArr = new byte[1024];
                try {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    fileInputStream.read(bArr);
                    fileInputStream.close();
                } catch (Throwable unused) {
                }
                String str = new String(bArr);
                for (String str2 : f114986d) {
                    if (str.contains(str2)) {
                        return true;
                    }
                }
                continue;
            }
        }
        return false;
    }
}
