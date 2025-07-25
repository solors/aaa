package com.unity3d.services.core.log;

import android.util.Log;
import com.pubmatic.sdk.nativead.POBNativeConstants;
import java.io.File;
import java.lang.reflect.Method;
import java.util.HashMap;

/* loaded from: classes7.dex */
public class DeviceLog {
    private static boolean FORCE_DEBUG_LOG = false;
    public static final int LOGLEVEL_DEBUG = 8;
    private static final int LOGLEVEL_ERROR = 1;
    public static final int LOGLEVEL_INFO = 4;
    private static final int LOGLEVEL_WARNING = 2;
    private static boolean LOG_DEBUG = true;
    private static boolean LOG_ERROR = true;
    private static boolean LOG_INFO = true;
    private static boolean LOG_WARNING = true;
    private static final int MAX_DEBUG_MSG_LENGTH = 3072;
    private static final HashMap<UnityAdsLogLevel, DeviceLogLevel> _deviceLogLevel;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.unity3d.services.core.log.DeviceLog$1 */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class C290361 {

        /* renamed from: $SwitchMap$com$unity3d$services$core$log$DeviceLog$UnityAdsLogLevel */
        static final /* synthetic */ int[] f74987xf32d8d1;

        static {
            int[] iArr = new int[UnityAdsLogLevel.values().length];
            f74987xf32d8d1 = iArr;
            try {
                iArr[UnityAdsLogLevel.INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f74987xf32d8d1[UnityAdsLogLevel.DEBUG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f74987xf32d8d1[UnityAdsLogLevel.WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f74987xf32d8d1[UnityAdsLogLevel.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes7.dex */
    public enum UnityAdsLogLevel {
        INFO,
        DEBUG,
        WARNING,
        ERROR
    }

    static {
        HashMap<UnityAdsLogLevel, DeviceLogLevel> hashMap = new HashMap<>();
        _deviceLogLevel = hashMap;
        if (hashMap.size() == 0) {
            hashMap.put(UnityAdsLogLevel.INFO, new DeviceLogLevel("i"));
            hashMap.put(UnityAdsLogLevel.DEBUG, new DeviceLogLevel("d"));
            hashMap.put(UnityAdsLogLevel.WARNING, new DeviceLogLevel(POBNativeConstants.NATIVE_IMAGE_WIDTH));
            hashMap.put(UnityAdsLogLevel.ERROR, new DeviceLogLevel("e"));
        }
        if (new File("/data/local/tmp/UnityAdsForceDebugMode").exists()) {
            FORCE_DEBUG_LOG = true;
        }
    }

    private static String checkMessage(String str) {
        if (str == null || str.length() == 0) {
            return "DO NOT USE EMPTY MESSAGES, use DeviceLog.entered() instead";
        }
        return str;
    }

    private static DeviceLogEntry createLogEntry(UnityAdsLogLevel unityAdsLogLevel, String str) {
        StackTraceElement stackTraceElement;
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        DeviceLogLevel logLevel = getLogLevel(unityAdsLogLevel);
        if (logLevel == null) {
            return null;
        }
        int i = 0;
        boolean z = false;
        while (i < stackTrace.length) {
            StackTraceElement stackTraceElement2 = stackTrace[i];
            if (stackTraceElement2.getClassName().equals(DeviceLog.class.getName())) {
                z = true;
            }
            if (!stackTraceElement2.getClassName().equals(DeviceLog.class.getName()) && z) {
                break;
            }
            i++;
        }
        if (i < stackTrace.length) {
            stackTraceElement = stackTrace[i];
        } else {
            stackTraceElement = null;
        }
        if (stackTraceElement == null) {
            return null;
        }
        return new DeviceLogEntry(logLevel, str, stackTraceElement);
    }

    public static void debug(String str) {
        if (isDebugEnabled()) {
            if (str.length() > MAX_DEBUG_MSG_LENGTH) {
                debug(str.substring(0, MAX_DEBUG_MSG_LENGTH));
                if (str.length() < 30720) {
                    debug(str.substring(MAX_DEBUG_MSG_LENGTH));
                    return;
                }
                return;
            }
            write(UnityAdsLogLevel.DEBUG, checkMessage(str));
        }
    }

    public static void entered() {
        debug("ENTERED METHOD");
    }

    public static void error(String str) {
        write(UnityAdsLogLevel.ERROR, checkMessage(str));
    }

    public static void exception(String str, Exception exc) {
        String str2 = "";
        if (str != null) {
            str2 = "" + str;
        }
        if (exc != null) {
            str2 = str2 + ": " + exc.getMessage();
        }
        if (exc != null && exc.getCause() != null) {
            str2 = str2 + ": " + exc.getCause().getMessage();
        }
        write(UnityAdsLogLevel.ERROR, str2);
    }

    private static DeviceLogLevel getLogLevel(UnityAdsLogLevel unityAdsLogLevel) {
        return _deviceLogLevel.get(unityAdsLogLevel);
    }

    public static void info(String str) {
        write(UnityAdsLogLevel.INFO, checkMessage(str));
    }

    private static boolean isDebugEnabled() {
        if (!LOG_DEBUG && !FORCE_DEBUG_LOG) {
            return false;
        }
        return true;
    }

    public static void setLogLevel(int i) {
        if (i >= 8) {
            LOG_ERROR = true;
            LOG_WARNING = true;
            LOG_INFO = true;
            LOG_DEBUG = true;
        } else if (i >= 4) {
            LOG_ERROR = true;
            LOG_WARNING = true;
            LOG_INFO = true;
            LOG_DEBUG = false;
        } else if (i >= 2) {
            LOG_ERROR = true;
            LOG_WARNING = true;
            LOG_INFO = false;
            LOG_DEBUG = false;
        } else if (i >= 1) {
            LOG_ERROR = true;
            LOG_WARNING = false;
            LOG_INFO = false;
            LOG_DEBUG = false;
        } else {
            LOG_ERROR = false;
            LOG_WARNING = false;
            LOG_INFO = false;
            LOG_DEBUG = false;
        }
    }

    public static void warning(String str) {
        write(UnityAdsLogLevel.WARNING, checkMessage(str));
    }

    private static void write(UnityAdsLogLevel unityAdsLogLevel, String str) {
        boolean z;
        int i = C290361.f74987xf32d8d1[unityAdsLogLevel.ordinal()];
        boolean z2 = true;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        z = true;
                    } else {
                        z = LOG_ERROR;
                    }
                } else {
                    z = LOG_WARNING;
                }
            } else {
                z = LOG_DEBUG;
            }
        } else {
            z = LOG_INFO;
        }
        if (!FORCE_DEBUG_LOG) {
            z2 = z;
        }
        if (z2) {
            writeToLog(createLogEntry(unityAdsLogLevel, str));
        }
    }

    private static void writeToLog(DeviceLogEntry deviceLogEntry) {
        Method method;
        if (deviceLogEntry != null && deviceLogEntry.getLogLevel() != null) {
            try {
                method = Log.class.getMethod(deviceLogEntry.getLogLevel().getReceivingMethodName(), String.class, String.class);
            } catch (Exception e) {
                Log.e("UnityAds", "Writing to log failed!", e);
                method = null;
            }
            if (method != null) {
                try {
                    method.invoke(null, deviceLogEntry.getLogLevel().getLogTag(), deviceLogEntry.getParsedMessage());
                } catch (Exception e2) {
                    Log.e("UnityAds", "Writing to log failed!", e2);
                }
            }
        }
    }

    public static void error(String str, Object... objArr) {
        error(String.format(str, objArr));
    }

    public static void info(String str, Object... objArr) {
        info(String.format(str, objArr));
    }

    public static void warning(String str, Object... objArr) {
        warning(String.format(str, objArr));
    }

    public static void debug(String str, Object... objArr) {
        if (isDebugEnabled()) {
            debug(String.format(str, objArr));
        }
    }
}
