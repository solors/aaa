package com.ano.gshell;

import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.google.firebase.FirebaseApp;
import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class AnoApplication extends Application {
    static final boolean IS_SELF_LOAD_DEX = false;
    public static ArrayList<Object> memoryLoaders;

    public static native void gp6ioctl(String str);

    public static native void gp7ioctl(String str);

    public static native Object handleLoad(Object obj, int i);

    public static native Object handleLoad(byte[] bArr, int i, int i2);

    public static native long handleLoadV22(byte[] bArr, int i, int i2);

    public static native int ioctl(int i, String str);

    public final native int initialize(String str, String str2, String str3, String str4, String[] strArr);

    static {
        System.loadLibrary("anort");
        memoryLoaders = new ArrayList<>();
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        FirebaseApp.initializeApp(this);
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        String[] strArr = null;
        super.attachBaseContext(context);
        try {
            ApplicationInfo applicationInfo = getApplicationInfo();
            String str = applicationInfo.packageName;
            String str2 = applicationInfo.nativeLibraryDir;
            String str3 = applicationInfo.sourceDir;
            File filesDir = getFilesDir();
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    Field declaredField = applicationInfo.getClass().getDeclaredField("splitSourceDirs");
                    declaredField.setAccessible(true);
                    strArr = (String[]) declaredField.get(applicationInfo);
                } catch (Exception e) {
                }
            }
            if (initialize(str, filesDir.getAbsolutePath(), str2, str3, strArr) != 0) {
                throw new Exception("initialize failed.");
            }
        } catch (Exception e2) {
        }
    }
}
