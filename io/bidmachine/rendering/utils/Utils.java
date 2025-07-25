package io.bidmachine.rendering.utils;

import android.content.Context;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.tools.SameMD5;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Map;

/* loaded from: classes9.dex */
public class Utils {
    public static boolean canUseExternalFilesDir(@NonNull Context context) {
        return isExternalMemoryAvailable();
    }

    @NonNull
    public static Handler createHandlerWithMyOrMainLooper() {
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        return new Handler(myLooper);
    }

    @NonNull
    public static String createHexHashCode(@NonNull Object obj) {
        return Integer.toHexString(obj.hashCode());
    }

    public static <T> void forEach(@NonNull Collection<T> collection, @NonNull Executable<T> executable) {
        for (T t : collection) {
            executable.safeExecute(t);
        }
    }

    @Nullable
    public static <T extends KeyHolder> T fromKey(@Nullable String str, @NonNull T[] tArr) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String lowerCase = str.toLowerCase();
        for (T t : tArr) {
            if (t.getKey().equals(lowerCase)) {
                return t;
            }
        }
        return null;
    }

    @NonNull
    public static Date getDate(int i) {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(6, -i);
        return calendar.getTime();
    }

    @Nullable
    public static byte[] getMD5(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
            messageDigest.update(bArr);
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static boolean isExternalMemoryAvailable() {
        return Environment.getExternalStorageState().equals("mounted");
    }

    public static boolean isPermissionGranted(@NonNull Context context, @Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (context.checkPermission(str, Process.myPid(), Process.myUid()) != 0) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void set(@NonNull Collection<T> collection, @Nullable Collection<T> collection2) {
        collection.clear();
        if (collection2 != 0) {
            collection.addAll(collection2);
        }
    }

    @Nullable
    public static Boolean toBoolean(@Nullable Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (!(obj instanceof String)) {
            return null;
        }
        return Boolean.valueOf(Boolean.parseBoolean((String) obj));
    }

    @Nullable
    public static Integer toIntOrNull(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(str));
        } catch (Exception unused) {
            return null;
        }
    }

    @Nullable
    public static Integer toInteger(@Nullable Object obj) {
        int intValue;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Integer) {
            intValue = ((Integer) obj).intValue();
        } else if (obj instanceof Long) {
            intValue = ((Long) obj).intValue();
        } else if (obj instanceof Float) {
            intValue = ((Float) obj).intValue();
        } else if (obj instanceof Double) {
            intValue = ((Double) obj).intValue();
        } else {
            if (obj instanceof String) {
                try {
                    return Integer.valueOf(Integer.parseInt((String) obj));
                } catch (Exception unused) {
                }
            }
            return null;
        }
        return Integer.valueOf(intValue);
    }

    @Nullable
    public static Long toLong(@Nullable Object obj) {
        long longValue;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Long) {
            longValue = ((Long) obj).longValue();
        } else if (obj instanceof Integer) {
            longValue = ((Integer) obj).longValue();
        } else if (obj instanceof Float) {
            longValue = ((Float) obj).longValue();
        } else if (obj instanceof Double) {
            longValue = ((Double) obj).longValue();
        } else {
            if (obj instanceof String) {
                try {
                    return Long.valueOf(Long.parseLong((String) obj));
                } catch (Exception unused) {
                }
            }
            return null;
        }
        return Long.valueOf(longValue);
    }

    @Nullable
    public static String toString(@Nullable Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        return String.valueOf(obj);
    }

    public static long write(@NonNull InputStream inputStream, @NonNull OutputStream outputStream) {
        byte[] bArr = new byte[1024];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read > 0) {
                outputStream.write(bArr, 0, read);
                j += read;
            } else {
                return j;
            }
        }
    }

    public static boolean writePermissionGranted(@NonNull Context context) {
        return isPermissionGranted(context, "android.permission.WRITE_EXTERNAL_STORAGE");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T, V> void set(@NonNull Map<T, V> map, @Nullable Map<T, V> map2) {
        map.clear();
        if (map2 != 0) {
            map.putAll(map2);
        }
    }
}
