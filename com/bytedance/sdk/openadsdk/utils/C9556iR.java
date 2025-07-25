package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.C7741PX;
import com.bytedance.sdk.openadsdk.core.C8879bX;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* renamed from: com.bytedance.sdk.openadsdk.utils.iR */
/* loaded from: classes3.dex */
public class C9556iR {

    /* renamed from: com.bytedance.sdk.openadsdk.utils.iR$1 */
    /* loaded from: classes3.dex */
    static class C95571 implements FilenameFilter {

        /* renamed from: bg */
        private final Pattern f21323bg = Pattern.compile("^cpu[0-9]+$");

        C95571() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return this.f21323bg.matcher(str).matches();
        }
    }

    /* renamed from: IL */
    public static int m82411IL(Context context) {
        return C8879bX.m84507bg(context).m84510IL("cpu_max_frequency", 0);
    }

    /* renamed from: bX */
    public static int m82410bX(Context context) {
        return C8879bX.m84507bg(context).m84510IL("cpu_min_frequency", 0);
    }

    /* renamed from: bg */
    public static int m82409bg() {
        return Math.max(Runtime.getRuntime().availableProcessors(), 0);
    }

    /* renamed from: IL */
    public static int m82412IL(int i) {
        BufferedReader bufferedReader;
        Throwable th;
        FileReader fileReader;
        BufferedReader bufferedReader2;
        int parseInt;
        int i2 = 0;
        FileReader fileReader2 = null;
        BufferedReader bufferedReader3 = null;
        while (true) {
            i--;
            if (i < 0) {
                return i2;
            }
            try {
                fileReader = new FileReader("/sys/devices/system/cpu/cpu" + i + "/cpufreq/cpuinfo_min_freq");
                try {
                    bufferedReader2 = new BufferedReader(fileReader);
                } catch (Throwable th2) {
                    BufferedReader bufferedReader4 = bufferedReader3;
                    th = th2;
                    fileReader2 = fileReader;
                    bufferedReader = bufferedReader4;
                }
            } catch (Throwable th3) {
                bufferedReader = bufferedReader3;
                th = th3;
            }
            try {
                String readLine = bufferedReader2.readLine();
                if (!TextUtils.isEmpty(readLine) && ((parseInt = Integer.parseInt(readLine)) < i2 || i2 == 0)) {
                    i2 = parseInt;
                }
                try {
                    bufferedReader2.close();
                    fileReader.close();
                } catch (Exception unused) {
                }
                bufferedReader3 = bufferedReader2;
                fileReader2 = fileReader;
            } catch (Throwable th4) {
                th = th4;
                bufferedReader = bufferedReader2;
                fileReader2 = fileReader;
                try {
                    C7741PX.m87873bg("CpuUtils", th.getMessage());
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (Exception unused2) {
                            bufferedReader3 = bufferedReader;
                        }
                    }
                    bufferedReader3 = bufferedReader;
                } finally {
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (Exception unused3) {
                        }
                    }
                    if (fileReader2 != null) {
                        fileReader2.close();
                    }
                }
            }
        }
    }

    /* renamed from: bg */
    public static int m82407bg(Context context) {
        return C8879bX.m84507bg(context).m84510IL("cpu_count", 0);
    }

    /* renamed from: bg */
    public static int m82408bg(int i) {
        BufferedReader bufferedReader;
        Throwable th;
        int parseInt;
        int i2 = 0;
        FileReader fileReader = null;
        BufferedReader bufferedReader2 = null;
        while (true) {
            i--;
            if (i < 0) {
                return i2;
            }
            try {
                FileReader fileReader2 = new FileReader("/sys/devices/system/cpu/cpu" + i + "/cpufreq/cpuinfo_max_freq");
                try {
                    BufferedReader bufferedReader3 = new BufferedReader(fileReader2);
                    try {
                        String readLine = bufferedReader3.readLine();
                        if (!TextUtils.isEmpty(readLine) && (parseInt = Integer.parseInt(readLine)) > i2) {
                            i2 = parseInt;
                        }
                        try {
                            bufferedReader3.close();
                            fileReader2.close();
                        } catch (Exception unused) {
                        }
                        bufferedReader2 = bufferedReader3;
                        fileReader = fileReader2;
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader = bufferedReader3;
                        fileReader = fileReader2;
                        try {
                            C7741PX.m87873bg("CpuUtils", th.getMessage());
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (Exception unused2) {
                                    bufferedReader2 = bufferedReader;
                                }
                            }
                            bufferedReader2 = bufferedReader;
                        } finally {
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (Exception unused3) {
                                }
                            }
                            if (fileReader != null) {
                                fileReader.close();
                            }
                        }
                    }
                } catch (Throwable th3) {
                    BufferedReader bufferedReader4 = bufferedReader2;
                    th = th3;
                    fileReader = fileReader2;
                    bufferedReader = bufferedReader4;
                }
            } catch (Throwable th4) {
                bufferedReader = bufferedReader2;
                th = th4;
            }
        }
    }
}
