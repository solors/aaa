package com.google.firebase.crashlytics.ndk;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.Logger;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
class JniNativeApi implements NativeApi {
    private static final FilenameFilter APK_FILTER = new FilenameFilter() { // from class: com.google.firebase.crashlytics.ndk.e
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return JniNativeApi.m66867a(file, str);
        }
    };
    private static final boolean LIB_CRASHLYTICS_LOADED;
    private final Context context;

    static {
        boolean z;
        try {
            System.loadLibrary("crashlytics");
            z = true;
        } catch (UnsatisfiedLinkError e) {
            Logger.getLogger().m67214e("libcrashlytics could not be loaded. This APK may not have been compiled for this device's architecture. NDK crashes will not be reported to Crashlytics:\n" + e.getLocalizedMessage());
            z = false;
        }
        LIB_CRASHLYTICS_LOADED = z;
    }

    public JniNativeApi(Context context) {
        this.context = context;
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m66867a(File file, String str) {
        return lambda$static$0(file, str);
    }

    @TargetApi(21)
    public static void addSplitSourceDirs(List<String> list, PackageInfo packageInfo) {
        ApplicationInfo applicationInfo = packageInfo.applicationInfo;
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr != null) {
            Collections.addAll(list, strArr);
        }
        File file = new File(applicationInfo.dataDir, String.format("files/splitcompat/%s/verified-splits", getVersionCodeAsString(packageInfo)));
        if (!file.exists()) {
            Logger.getLogger().m67216d("No dynamic features found at " + file.getAbsolutePath());
            return;
        }
        File[] listFiles = file.listFiles(APK_FILTER);
        if (listFiles == null) {
            listFiles = new File[0];
        }
        Logger.getLogger().m67216d("Found " + listFiles.length + " APKs in " + file.getAbsolutePath());
        for (File file2 : listFiles) {
            Logger.getLogger().m67216d("Adding " + file2.getName() + " to classpath.");
            list.add(file2.getAbsolutePath());
        }
    }

    private static int getPackageInfoFlags() {
        return 9216;
    }

    private static String getVersionCodeAsString(PackageInfo packageInfo) {
        long longVersionCode;
        if (Build.VERSION.SDK_INT >= 28) {
            longVersionCode = packageInfo.getLongVersionCode();
            return Long.toString(longVersionCode);
        }
        return Integer.toString(packageInfo.versionCode);
    }

    public static boolean isAtLeastLollipop() {
        return true;
    }

    public static /* synthetic */ boolean lambda$static$0(File file, String str) {
        return str.toLowerCase().endsWith(".apk");
    }

    private native boolean nativeInit(String[] strArr, Object obj);

    @Override // com.google.firebase.crashlytics.ndk.NativeApi
    public boolean initialize(String str, AssetManager assetManager) {
        String[] makePackagePaths = makePackagePaths(Build.CPU_ABI);
        if (makePackagePaths.length < 2) {
            return false;
        }
        String str2 = makePackagePaths[0];
        String str3 = makePackagePaths[1];
        if (!LIB_CRASHLYTICS_LOADED || !nativeInit(new String[]{str2, str3, str}, assetManager)) {
            return false;
        }
        return true;
    }

    public String[] makePackagePaths(String str) {
        try {
            PackageInfo packageInfo = this.context.getPackageManager().getPackageInfo(this.context.getPackageName(), getPackageInfoFlags());
            ArrayList<String> arrayList = new ArrayList(10);
            arrayList.add(packageInfo.applicationInfo.sourceDir);
            if (isAtLeastLollipop()) {
                addSplitSourceDirs(arrayList, packageInfo);
            }
            String[] strArr = packageInfo.applicationInfo.sharedLibraryFiles;
            if (strArr != null) {
                Collections.addAll(arrayList, strArr);
            }
            ArrayList arrayList2 = new ArrayList(10);
            File parentFile = new File(packageInfo.applicationInfo.nativeLibraryDir).getParentFile();
            if (parentFile != null) {
                arrayList2.add(new File(parentFile, str).getPath());
                if (str.startsWith("arm64")) {
                    arrayList2.add(new File(parentFile, "arm64").getPath());
                } else if (str.startsWith("arm")) {
                    arrayList2.add(new File(parentFile, "arm").getPath());
                }
            }
            for (String str2 : arrayList) {
                if (str2.endsWith(".apk")) {
                    arrayList2.add(str2 + "!/lib/" + str);
                }
            }
            arrayList2.add(System.getProperty("java.library.path"));
            arrayList2.add(packageInfo.applicationInfo.nativeLibraryDir);
            String str3 = File.pathSeparator;
            return new String[]{TextUtils.join(str3, arrayList), TextUtils.join(str3, arrayList2)};
        } catch (PackageManager.NameNotFoundException e) {
            Logger.getLogger().m67213e("Unable to compose package paths", e);
            throw new RuntimeException(e);
        }
    }
}
