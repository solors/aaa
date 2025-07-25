package sg.bigo.ads.common.p906aa;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileReader;
import sg.bigo.ads.common.p941x.C43906a;

/* renamed from: sg.bigo.ads.common.aa.a */
/* loaded from: classes10.dex */
public final class C43586a {

    /* renamed from: a */
    private static boolean f114147a = false;

    /* renamed from: b */
    private static boolean f114148b = false;

    /* renamed from: c */
    private static int f114149c = 1;

    /* renamed from: d */
    private static long f114150d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: sg.bigo.ads.common.aa.a$a */
    /* loaded from: classes10.dex */
    public final class C43587a implements FileFilter {
        C43587a() {
        }

        @Override // java.io.FileFilter
        public final boolean accept(File file) {
            String name = file.getName();
            if (!name.startsWith("cpu")) {
                return false;
            }
            for (int i = 3; i < name.length(); i++) {
                if (!Character.isDigit(name.charAt(i))) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: a */
    public static int m5354a() {
        if (f114147a) {
            return f114149c;
        }
        int m4653a = C43906a.m4653a();
        f114149c = m4653a;
        if (m4653a != 0) {
            f114147a = true;
            return m4653a;
        }
        try {
            f114149c = new File("/sys/devices/system/cpu/").listFiles(new C43587a()).length;
        } catch (Throwable unused) {
        }
        if (f114149c <= 1) {
            f114149c = Runtime.getRuntime().availableProcessors();
        }
        f114147a = true;
        C43906a.m4652a(f114149c);
        return f114149c;
    }

    /* renamed from: b */
    public static long m5353b() {
        int parseInt;
        if (f114148b) {
            long j = f114150d;
            if (j != 0) {
                return j;
            }
        }
        long m4646b = C43906a.m4646b();
        f114150d = m4646b;
        if (m4646b != 0) {
            f114148b = true;
            return m4646b;
        }
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < m5354a(); i3++) {
            try {
                File file = new File("/sys/devices/system/cpu/cpu" + i3 + "/cpufreq/cpuinfo_max_freq");
                if (file.exists() && file.canRead()) {
                    byte[] bArr = new byte[128];
                    FileInputStream fileInputStream = new FileInputStream(file);
                    try {
                        fileInputStream.read(bArr);
                        int i4 = 0;
                        while (Character.isDigit(bArr[i4]) && i4 < 128) {
                            i4++;
                        }
                        Integer valueOf = Integer.valueOf(Integer.parseInt(new String(bArr, 0, i4)));
                        if (valueOf.intValue() > i2) {
                            i2 = valueOf.intValue();
                        }
                    } catch (NumberFormatException unused) {
                    } catch (Throwable th) {
                        fileInputStream.close();
                        throw th;
                    }
                    fileInputStream.close();
                }
            } catch (Exception unused2) {
            }
        }
        if (i2 == -1) {
            FileReader fileReader = new FileReader("/proc/cpuinfo");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    String[] split = readLine.split(":", 2);
                    if ("cpu MHz".equals(split[0].replaceAll("[\\t\\n\\r]", ""))) {
                        if (split[1].contains(".")) {
                            parseInt = (int) Double.parseDouble(split[1]);
                        } else {
                            parseInt = Integer.parseInt(split[1]);
                        }
                        int i5 = parseInt * 1000;
                        if (i5 > i2) {
                            i2 = i5;
                        }
                    }
                } catch (Exception unused3) {
                } catch (Throwable th2) {
                    fileReader.close();
                    bufferedReader.close();
                    throw th2;
                }
            }
            fileReader.close();
            bufferedReader.close();
        }
        i = i2;
        f114148b = true;
        long j2 = i / 1000;
        f114150d = j2;
        C43906a.m4651a(j2);
        return f114150d;
    }
}
