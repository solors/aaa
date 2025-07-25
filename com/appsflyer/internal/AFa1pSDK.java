package com.appsflyer.internal;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class AFa1pSDK {
    @Nullable
    public AppsFlyerRequestListener AFInAppEventParameterName;
    public String AFInAppEventType;
    protected final Map<String, Object> AFKeystoreWrapper;
    @Nullable
    public String AFLogger;
    private final boolean afInfoLog;

    /* renamed from: d */
    public String f12957d;

    /* renamed from: e */
    public String f12958e;

    /* renamed from: i */
    private byte[] f12959i;
    public int registerClient;
    public String unregisterClient;
    @Nullable
    public Map<String, Object> valueOf;
    @Nullable
    public String values;

    public AFa1pSDK() {
        this(null, null, null);
    }

    public final boolean AFInAppEventParameterName() {
        if (this.f12958e == null && this.AFInAppEventType == null) {
            return true;
        }
        return false;
    }

    public AFa1pSDK AFInAppEventType(String str) {
        this.unregisterClient = str;
        return this;
    }

    public final AFa1pSDK AFKeystoreWrapper(int i) {
        this.registerClient = i;
        synchronized (this.AFKeystoreWrapper) {
            if (this.AFKeystoreWrapper.containsKey("counter")) {
                this.AFKeystoreWrapper.put("counter", Integer.toString(i));
            }
            if (this.AFKeystoreWrapper.containsKey("launch_counter")) {
                this.AFKeystoreWrapper.put("launch_counter", Integer.toString(i));
            }
        }
        return this;
    }

    public boolean AFLogger() {
        return false;
    }

    /* renamed from: e */
    public boolean mo92132e() {
        return true;
    }

    public boolean registerClient() {
        return true;
    }

    public boolean unregisterClient() {
        return true;
    }

    public final boolean valueOf() {
        return this.afInfoLog;
    }

    public final AFa1pSDK values(String str, Object obj) {
        synchronized (this.AFKeystoreWrapper) {
            this.AFKeystoreWrapper.put(str, obj);
        }
        return this;
    }

    public abstract AFf1ySDK values();

    public AFa1pSDK(@Nullable String str, @Nullable String str2, @Nullable Boolean bool) {
        this.AFKeystoreWrapper = new HashMap();
        this.f12958e = str;
        this.unregisterClient = str2;
        this.afInfoLog = bool != null ? bool.booleanValue() : true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @NonNull
    public static String valueOf(String str) {
        String AFLogger = AFb1rSDK.AFInAppEventParameterName().AFInAppEventType().valueOf().AFLogger();
        return AFLogger != null ? Uri.parse(str).buildUpon().appendQueryParameter(AppsFlyerProperties.CHANNEL, AFLogger).build().toString() : str;
    }

    public final AFa1pSDK AFInAppEventType(Map<String, ?> map) {
        synchronized (map) {
            this.AFKeystoreWrapper.putAll(map);
        }
        return this;
    }

    public final Map<String, Object> AFInAppEventType() {
        return this.AFKeystoreWrapper;
    }

    public final AFa1pSDK AFKeystoreWrapper(byte[] bArr) {
        this.f12959i = bArr;
        return this;
    }

    public final byte[] AFKeystoreWrapper() {
        return this.f12959i;
    }

    public static boolean AFKeystoreWrapper(double d) {
        if (d < 0.0d || d >= 1.0d) {
            return false;
        }
        if (d == 0.0d) {
            return true;
        }
        int i = (int) (1.0d / d);
        int i2 = i + 1;
        if (i2 > 0) {
            return ((int) ((Math.random() * ((double) (i2 - 1))) + 1.0d)) != i;
        }
        throw new IllegalArgumentException("Unsupported max value");
    }
}
