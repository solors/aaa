package androidx.webkit.internal;

import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(33)
/* loaded from: classes2.dex */
public class ApiHelperForTiramisu {
    private ApiHelperForTiramisu() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @DoNotInline
    public static ServiceInfo getServiceInfo(PackageManager packageManager, ComponentName componentName, PackageManager.ComponentInfoFlags componentInfoFlags) throws PackageManager.NameNotFoundException {
        return packageManager.getServiceInfo(componentName, componentInfoFlags);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @DoNotInline
    /* renamed from: of */
    public static PackageManager.ComponentInfoFlags m104066of(long j) {
        return PackageManager.ComponentInfoFlags.of(j);
    }
}
