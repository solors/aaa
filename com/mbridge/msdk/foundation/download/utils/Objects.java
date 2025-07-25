package com.mbridge.msdk.foundation.download.utils;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.download.resource.stream.DownloadFileOutputStream;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import com.mbridge.msdk.thrid.okhttp.Response;
import com.mbridge.msdk.thrid.okhttp.ResponseBody;
import java.io.File;
import java.io.FileFilter;
import java.io.InputStream;
import java.util.Arrays;

/* loaded from: classes6.dex */
public class Objects {
    public static void closeInputStream(InputStream inputStream) {
        if (inputStream == null) {
            return;
        }
        try {
            inputStream.close();
        } catch (Exception e) {
            SameLogTool.m51827a("closeStream", e.getLocalizedMessage());
        }
    }

    public static void closeOutputStream(DownloadFileOutputStream downloadFileOutputStream) {
        if (downloadFileOutputStream == null) {
            return;
        }
        try {
            downloadFileOutputStream.close();
        } catch (Exception e) {
            SameLogTool.m51827a("closeStream", e.getLocalizedMessage());
        }
    }

    public static void closeResponse(Response response) {
        if (response == null) {
            return;
        }
        try {
            if (response.body() != null) {
                response.body().close();
            }
            response.close();
        } catch (Exception e) {
            SameLogTool.m51827a("closeStream", e.getLocalizedMessage());
        }
    }

    public static void closeResponseBody(ResponseBody responseBody) {
        if (responseBody == null) {
            return;
        }
        try {
            responseBody.close();
        } catch (Exception e) {
            SameLogTool.m51827a("closeStream", e.getLocalizedMessage());
        }
    }

    private static boolean doubleCheckExists(File file, final String str, final String str2) {
        File[] fileArr;
        try {
            fileArr = file.getParentFile().listFiles(new FileFilter() { // from class: com.mbridge.msdk.foundation.download.utils.Objects.1
                @Override // java.io.FileFilter
                public final boolean accept(File file2) {
                    String absolutePath = file2.getAbsolutePath();
                    return TextUtils.equals(absolutePath, str + str2);
                }
            });
        } catch (Exception e) {
            SameLogTool.m51827a("doubleCheckExists", e.getLocalizedMessage());
            fileArr = null;
        }
        if (fileArr != null && file.length() > 0) {
            return true;
        }
        return false;
    }

    public static boolean exists(File file, String str, String str2) {
        if (file != null && !TextUtils.isEmpty(str)) {
            boolean exists = file.exists();
            if (!exists) {
                return doubleCheckExists(file, str, str2);
            }
            return exists;
        }
        return false;
    }

    public static int hash(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static boolean isNotNull(Object obj) {
        return !isNull(obj);
    }

    public static boolean isNull(Object obj) {
        if (obj == null) {
            return true;
        }
        return false;
    }
}
