package io.bidmachine;

import android.content.Context;
import android.media.AudioManager;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import io.bidmachine.core.Utils;
import io.bidmachine.utils.DeviceUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes9.dex */
public class DeviceInfo {
    private static final String OS_NAME = "android";
    private static volatile DeviceInfo instance;
    @NonNull
    private final HwInfoCache cache;
    @NonNull
    private final C35181b cpu;
    @NonNull
    private final C35182c gpu;
    @Nullable
    private String hwv;
    @Nullable
    private Boolean isRooted;
    public final boolean isTablet;
    @Nullable
    public final String manufacturer;
    @Nullable
    public final String model;
    @NonNull
    public final String osName;
    @NonNull
    public final String osVersion;
    @Nullable
    public final String phoneCarrier;
    @Nullable
    public final String phoneMCCMNC;
    public final float screenDensity;
    public final int screenDpi;
    @Nullable
    private Long totalDiskSpaceInMB;
    @NonNull
    private final C35180a audio = new C35180a();
    @NonNull
    private final C35183d ram = new C35183d();

    /* renamed from: io.bidmachine.DeviceInfo$a */
    /* loaded from: classes9.dex */
    static final class C35180a {
        C35180a() {
        }

        @Nullable
        private AudioManager getAudioManager(@NonNull Context context) {
            return (AudioManager) context.getSystemService("audio");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Nullable
        public Float getVolumeLevel(@NonNull Context context) {
            int i;
            AudioManager audioManager = getAudioManager(context);
            if (audioManager == null) {
                return null;
            }
            int streamVolume = audioManager.getStreamVolume(3);
            int streamMaxVolume = audioManager.getStreamMaxVolume(3);
            if (Build.VERSION.SDK_INT >= 28) {
                i = audioManager.getStreamMinVolume(3);
            } else {
                i = 0;
            }
            int i2 = streamMaxVolume - i;
            if (i2 == 0) {
                return Float.valueOf(0.0f);
            }
            return Float.valueOf((streamVolume - i) / i2);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Nullable
        public Boolean isRingMuted(@NonNull Context context) {
            AudioManager audioManager = getAudioManager(context);
            if (audioManager == null) {
                return null;
            }
            int ringerMode = audioManager.getRingerMode();
            boolean z = true;
            if (ringerMode != 0 && ringerMode != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: io.bidmachine.DeviceInfo$b */
    /* loaded from: classes9.dex */
    static final class C35181b {
        @NonNull
        public static final String KEY_NAME = "cpu_name";
        @NonNull
        public static final String KEY_VENDOR = "cpu_vendor";
        @NonNull
        private final HwInfoCache cache;
        @Nullable
        private String name;
        @Nullable
        private String vendor;

        C35181b(@NonNull HwInfoCache hwInfoCache) {
            this.cache = hwInfoCache;
        }

        private void extract() {
            read();
            if (TextUtils.isEmpty(this.name)) {
                this.name = Build.BOARD;
            }
            if (TextUtils.isEmpty(this.vendor)) {
                this.vendor = Build.HARDWARE;
            }
        }

        @Nullable
        private String findValue(String str) {
            Matcher matcher = Pattern.compile(":\\s*(.*)").matcher(str);
            if (matcher.find()) {
                return matcher.group(1);
            }
            return null;
        }

        private void read() {
            RandomAccessFile randomAccessFile;
            Throwable th;
            RandomAccessFile randomAccessFile2 = null;
            try {
                randomAccessFile = new RandomAccessFile("/proc/cpuinfo", "r");
                while (true) {
                    try {
                        String readLine = randomAccessFile.readLine();
                        if (readLine == null) {
                            break;
                        }
                        if (!readLine.startsWith("model name:") && !readLine.startsWith("Hardware:")) {
                            if (readLine.startsWith("vendor_id:")) {
                                this.vendor = findValue(readLine);
                            }
                            if (this.name == null && this.vendor != null) {
                                break;
                            }
                        }
                        this.name = findValue(readLine);
                        if (this.name == null) {
                        }
                    } catch (Exception unused) {
                        randomAccessFile2 = randomAccessFile;
                        Utils.close(randomAccessFile2);
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        Utils.close(randomAccessFile);
                        throw th;
                    }
                }
                Utils.close(randomAccessFile);
            } catch (Exception unused2) {
            } catch (Throwable th3) {
                randomAccessFile = null;
                th = th3;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Nullable
        public String getName() {
            return this.name;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Nullable
        public String getVendor() {
            return this.vendor;
        }

        void update(@NonNull Context context) {
            if (TextUtils.isEmpty(this.name)) {
                this.name = this.cache.read(context, KEY_NAME);
            }
            if (TextUtils.isEmpty(this.vendor)) {
                this.vendor = this.cache.read(context, KEY_VENDOR);
            }
            if (TextUtils.isEmpty(this.name) || TextUtils.isEmpty(this.vendor)) {
                extract();
                this.cache.store(context, KEY_NAME, this.name);
                this.cache.store(context, KEY_VENDOR, this.vendor);
            }
        }
    }

    /* renamed from: io.bidmachine.DeviceInfo$c */
    /* loaded from: classes9.dex */
    static final class C35182c {
        @NonNull
        public static final String KEY_NAME = "gpu_name";
        @NonNull
        public static final String KEY_VENDOR = "gpu_vendor";
        @NonNull
        private final HwInfoCache cache;
        @Nullable
        private String name;
        @Nullable
        private String vendor;

        C35182c(@NonNull HwInfoCache hwInfoCache) {
            this.cache = hwInfoCache;
        }

        private EGLConfig chooseEGLConfig(EGLDisplay eGLDisplay) {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            int[] iArr = new int[1];
            EGL14.eglChooseConfig(eGLDisplay, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12344}, 0, eGLConfigArr, 0, 1, iArr, 0);
            if (iArr[0] == 0) {
                return null;
            }
            return eGLConfigArr[0];
        }

        private void cleanUpEGL(@Nullable EGLDisplay eGLDisplay, @Nullable EGLSurface eGLSurface, @Nullable EGLContext eGLContext) {
            if (eGLDisplay != null) {
                makeCurrent(eGLDisplay, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
                if (eGLSurface != null) {
                    EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
                }
                if (eGLContext != null) {
                    EGL14.eglDestroyContext(eGLDisplay, eGLContext);
                }
                EGL14.eglTerminate(eGLDisplay);
            }
        }

        private EGLContext createEGLContext(EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
            return EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
        }

        private EGLSurface createEGLSurface(EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
            return EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, new int[]{12375, 64, 12374, 64, 12344}, 0);
        }

        private void extract() {
            EGLContext eGLContext;
            EGLSurface eGLSurface;
            EGLContext eGLContext2;
            EGLContext eGLContext3;
            EGLDisplay eGLDisplay = null;
            r0 = null;
            EGLContext eGLContext4 = null;
            EGLSurface eGLSurface2 = null;
            EGLDisplay eGLDisplay2 = null;
            try {
                EGLDisplay initEGLDisplay = initEGLDisplay();
                try {
                    EGLConfig chooseEGLConfig = chooseEGLConfig(initEGLDisplay);
                    if (chooseEGLConfig != null) {
                        eGLSurface = createEGLSurface(initEGLDisplay, chooseEGLConfig);
                        try {
                            eGLContext4 = createEGLContext(initEGLDisplay, chooseEGLConfig);
                            makeCurrent(initEGLDisplay, eGLSurface, eGLContext4);
                            this.name = GLES20.glGetString(7937);
                            this.vendor = GLES20.glGetString(7936);
                            eGLContext3 = eGLContext4;
                            eGLSurface2 = eGLSurface;
                        } catch (Exception unused) {
                            eGLContext2 = eGLContext4;
                            eGLDisplay2 = initEGLDisplay;
                            cleanUpEGL(eGLDisplay2, eGLSurface, eGLContext2);
                            return;
                        } catch (Throwable th) {
                            th = th;
                            eGLContext = eGLContext4;
                            eGLDisplay = initEGLDisplay;
                            cleanUpEGL(eGLDisplay, eGLSurface, eGLContext);
                            throw th;
                        }
                    } else {
                        eGLContext3 = null;
                    }
                    cleanUpEGL(initEGLDisplay, eGLSurface2, eGLContext3);
                } catch (Exception unused2) {
                    eGLSurface = null;
                    eGLDisplay2 = initEGLDisplay;
                    eGLContext2 = null;
                } catch (Throwable th2) {
                    th = th2;
                    eGLSurface = null;
                    eGLDisplay = initEGLDisplay;
                    eGLContext = null;
                }
            } catch (Exception unused3) {
                eGLContext2 = null;
                eGLSurface = null;
            } catch (Throwable th3) {
                th = th3;
                eGLContext = null;
                eGLSurface = null;
            }
        }

        private EGLDisplay initEGLDisplay() {
            EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
            int[] iArr = new int[2];
            EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1);
            return eglGetDisplay;
        }

        private void makeCurrent(@Nullable EGLDisplay eGLDisplay, @Nullable EGLSurface eGLSurface, @Nullable EGLContext eGLContext) {
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Nullable
        public String getName() {
            return this.name;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Nullable
        public String getVendor() {
            return this.vendor;
        }

        void update(@NonNull Context context) {
            if (TextUtils.isEmpty(this.name)) {
                this.name = this.cache.read(context, KEY_NAME);
            }
            if (TextUtils.isEmpty(this.vendor)) {
                this.vendor = this.cache.read(context, KEY_VENDOR);
            }
            if (TextUtils.isEmpty(this.name) || TextUtils.isEmpty(this.vendor)) {
                extract();
                this.cache.store(context, KEY_NAME, this.name);
                this.cache.store(context, KEY_VENDOR, this.vendor);
            }
        }
    }

    /* renamed from: io.bidmachine.DeviceInfo$d */
    /* loaded from: classes9.dex */
    static final class C35183d {
        @Nullable
        private Long freeMem;
        @Nullable
        private Long totalMem;

        C35183d() {
        }

        @Nullable
        private String findValue(@Nullable String str) {
            Matcher matcher = Pattern.compile("(\\d+)").matcher(str);
            if (matcher.find()) {
                return matcher.group(1);
            }
            return null;
        }

        @Nullable
        private Long parseValue(@Nullable String str) {
            if (str != null) {
                try {
                    return Long.valueOf(Long.parseLong(str) * 1024);
                } catch (NumberFormatException unused) {
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Nullable
        public Long getFreeMemBytes() {
            return this.freeMem;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Nullable
        public Long getTotalMemBytes() {
            return this.totalMem;
        }

        void update() {
            RandomAccessFile randomAccessFile;
            Throwable th;
            RandomAccessFile randomAccessFile2 = null;
            try {
                randomAccessFile = new RandomAccessFile(AndroidDynamicDeviceInfoDataSource.DIRECTORY_MEM_INFO, "r");
                while (true) {
                    try {
                        String readLine = randomAccessFile.readLine();
                        if (readLine != null) {
                            if (readLine.startsWith("MemTotal:")) {
                                this.totalMem = parseValue(findValue(readLine));
                            } else if (readLine.startsWith("MemAvailable:")) {
                                this.freeMem = parseValue(findValue(readLine));
                            }
                            if (this.totalMem != null && this.freeMem != null) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } catch (Exception unused) {
                        randomAccessFile2 = randomAccessFile;
                        Utils.close(randomAccessFile2);
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        Utils.close(randomAccessFile);
                        throw th;
                    }
                }
                Utils.close(randomAccessFile);
            } catch (Exception unused2) {
            } catch (Throwable th3) {
                randomAccessFile = null;
                th = th3;
            }
        }
    }

    private DeviceInfo(@NonNull Context context) {
        HwInfoCache hwInfoCache = new HwInfoCache();
        this.cache = hwInfoCache;
        this.cpu = new C35181b(hwInfoCache);
        this.gpu = new C35182c(hwInfoCache);
        this.osName = "android";
        this.osVersion = String.valueOf(Build.VERSION.SDK_INT);
        this.manufacturer = DeviceUtils.getManufacturer();
        this.model = DeviceUtils.getModel();
        this.screenDpi = DeviceUtils.getScreenDpi(context);
        this.screenDensity = Utils.getScreenDensity(context);
        this.isTablet = DeviceUtils.isTablet(context);
        this.phoneMCCMNC = DeviceUtils.getPhoneMCCMNC(context);
        this.phoneCarrier = DeviceUtils.getPhoneOperator(context);
    }

    @Nullable
    private String getKernelVersionThroughProcVersion() {
        RandomAccessFile randomAccessFile;
        Throwable th;
        try {
            randomAccessFile = new RandomAccessFile("/proc/version", "r");
        } catch (Exception unused) {
            randomAccessFile = null;
        } catch (Throwable th2) {
            randomAccessFile = null;
            th = th2;
        }
        try {
            String readLine = randomAccessFile.readLine();
            Utils.close(randomAccessFile);
            return readLine;
        } catch (Exception unused2) {
            Utils.close(randomAccessFile);
            return null;
        } catch (Throwable th3) {
            th = th3;
            Utils.close(randomAccessFile);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.io.Closeable, java.io.BufferedReader] */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String getKernelVersionThroughUName() {
        /*
            r5 = this;
            r0 = 0
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L48
            java.lang.String r2 = "uname -a"
            java.lang.Process r1 = r1.exec(r2)     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L48
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L35
            java.io.InputStream r3 = r1.getInputStream()     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L35
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L35
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2e
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2e
            java.lang.String r0 = r3.readLine()     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L4b
            io.bidmachine.core.Utils.close(r3)
            io.bidmachine.core.Utils.close(r2)
            r1.destroy()
            return r0
        L27:
            r0 = move-exception
            goto L3c
        L29:
            r3 = move-exception
            r4 = r3
            r3 = r0
            r0 = r4
            goto L3c
        L2e:
            r3 = r0
            goto L4b
        L30:
            r2 = move-exception
            r3 = r0
            r0 = r2
            r2 = r3
            goto L3c
        L35:
            r2 = r0
            goto L4a
        L37:
            r1 = move-exception
            r2 = r0
            r3 = r2
            r0 = r1
            r1 = r3
        L3c:
            io.bidmachine.core.Utils.close(r3)
            io.bidmachine.core.Utils.close(r2)
            if (r1 == 0) goto L47
            r1.destroy()
        L47:
            throw r0
        L48:
            r1 = r0
            r2 = r1
        L4a:
            r3 = r2
        L4b:
            io.bidmachine.core.Utils.close(r3)
            io.bidmachine.core.Utils.close(r2)
            if (r1 == 0) goto L56
            r1.destroy()
        L56:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.DeviceInfo.getKernelVersionThroughUName():java.lang.String");
    }

    @NonNull
    public static DeviceInfo obtain(@NonNull Context context) {
        DeviceInfo deviceInfo = instance;
        if (deviceInfo == null) {
            synchronized (DeviceInfo.class) {
                deviceInfo = instance;
                if (deviceInfo == null) {
                    deviceInfo = new DeviceInfo(context);
                    instance = deviceInfo;
                }
            }
        }
        return deviceInfo;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public C35180a getAudio() {
        return this.audio;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public Long getAvailableDiskSpaceInMB() {
        try {
            if (!Utils.isExternalMemoryAvailable()) {
                return null;
            }
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return Long.valueOf((statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong()) / 1048576);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public C35181b getCpu() {
        return this.cpu;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public C35182c getGpu() {
        return this.gpu;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public String getHWV() {
        String str = this.hwv;
        if (str != null) {
            return str;
        }
        String kernelVersionThroughProcVersion = getKernelVersionThroughProcVersion();
        if (!TextUtils.isEmpty(kernelVersionThroughProcVersion)) {
            this.hwv = kernelVersionThroughProcVersion;
            return kernelVersionThroughProcVersion;
        }
        String kernelVersionThroughUName = getKernelVersionThroughUName();
        this.hwv = kernelVersionThroughUName;
        return kernelVersionThroughUName;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public C35183d getRam() {
        return this.ram;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public Long getTotalDiskSpaceInMB() {
        Long l = this.totalDiskSpaceInMB;
        if (l != null) {
            return l;
        }
        try {
            if (!Utils.isExternalMemoryAvailable()) {
                return null;
            }
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            Long valueOf = Long.valueOf((statFs.getBlockSizeLong() * statFs.getBlockCountLong()) / 1048576);
            this.totalDiskSpaceInMB = valueOf;
            return valueOf;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isDeviceRooted() {
        Boolean bool = this.isRooted;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = true;
        try {
            String[] strArr = {"/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su"};
            for (int i = 0; i < 8; i++) {
                if (new File(strArr[i]).exists()) {
                    this.isRooted = Boolean.TRUE;
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        Process process = null;
        try {
            process = Runtime.getRuntime().exec(new String[]{"/system/xbin/which", "su"});
            if (new BufferedReader(new InputStreamReader(process.getInputStream())).readLine() == null) {
                z = false;
            }
            Boolean valueOf = Boolean.valueOf(z);
            this.isRooted = valueOf;
            boolean booleanValue = valueOf.booleanValue();
            process.destroy();
            return booleanValue;
        } catch (Exception unused2) {
            if (process != null) {
                process.destroy();
            }
            this.isRooted = Boolean.FALSE;
            return false;
        } catch (Throwable th) {
            if (process != null) {
                process.destroy();
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void updateHwInfo(@NonNull Context context) {
        this.cpu.update(context);
        this.gpu.update(context);
        this.ram.update();
    }
}
