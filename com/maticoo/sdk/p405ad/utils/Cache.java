package com.maticoo.sdk.p405ad.utils;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.ironsource.C20517nb;
import com.maticoo.sdk.utils.ApplicationUtil;
import com.maticoo.sdk.utils.IOUtil;
import com.maticoo.sdk.utils.constant.CommonConstants;
import com.maticoo.sdk.utils.log.DeveloperLog;
import com.maticoo.sdk.utils.request.network.Headers;
import com.maticoo.sdk.utils.request.network.Response;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* renamed from: com.maticoo.sdk.ad.utils.Cache */
/* loaded from: classes6.dex */
public final class Cache {
    private static final String FILE_DIR_NAME = "omnetwork";
    private static final long FREE_SD_SPACE_NEEDED_TO_CACHE = 104857600;
    private static final long MAX_CACHE_INTERVAL = 86400000;
    private static final long MIN_CACHE_INTERVAL = 3600000;
    private static final String TAG = "Cache";
    public static final List<String> IN_USE_URLS = new CopyOnWriteArrayList();
    private static final String[] HEADERS = {"Cache-Control", "Content-Type", "ETag", "Last-Modified", "Location", "Content-Length"};

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.maticoo.sdk.ad.utils.Cache$FileLastModifySort */
    /* loaded from: classes6.dex */
    public static class FileLastModifySort implements Comparator<File> {
        private FileLastModifySort() {
        }

        @Override // java.util.Comparator
        public int compare(File file, File file2) {
            if (file.lastModified() > file2.lastModified()) {
                return 1;
            }
            return file.lastModified() == file2.lastModified() ? 0 : -1;
        }
    }

    private static boolean convertToResult(File file, Response response, int i) throws Exception {
        BufferedInputStream stream = response.body().stream();
        IOUtil.writeToFile(stream, file);
        IOUtil.closeQuietly(stream);
        if (i <= 0) {
            if (file.length() > 0) {
                return true;
            }
        } else if (file.length() == i) {
            return true;
        }
        return false;
    }

    private static void createCacheRootDir(Context context) {
        File cacheDir = context.getCacheDir();
        File file = new File(cacheDir.getAbsolutePath() + File.separator + FILE_DIR_NAME);
        if (!file.exists()) {
            file.mkdirs();
        }
    }

    public static synchronized boolean existCache(Context context, String str) {
        File file;
        File file2;
        String valueFromFile;
        synchronized (Cache.class) {
            if (context == null) {
                try {
                    if (ApplicationUtil.getInstance().getApplicationContext() == null) {
                        return false;
                    }
                    context = ApplicationUtil.getInstance().getApplicationContext();
                } catch (Throwable th) {
                    DeveloperLog.LogD(TAG, th);
                    return false;
                }
            }
            File rootDir = getRootDir(context);
            if (str.startsWith("http")) {
                Map<String, String> urlFields = getUrlFields(str);
                String str2 = urlFields.get("path");
                String str3 = urlFields.get("name");
                if (TextUtils.isEmpty(str3)) {
                    return false;
                }
                file = new File(rootDir, str2 + str3);
                file2 = new File(rootDir, str2 + str3.concat(CommonConstants.FILE_HEADER_SUFFIX));
            } else {
                Uri parse = Uri.parse(str);
                if (TextUtils.isEmpty(parse.getPath())) {
                    return false;
                }
                file = new File(parse.getPath());
                file2 = new File(parse.getPath().concat(CommonConstants.FILE_HEADER_SUFFIX));
            }
            if (file2.exists() && file.exists()) {
                if (file2.length() > 0) {
                    try {
                        if (!TextUtils.isEmpty(getValueFromFile(file2, "Content-Length"))) {
                            if (file.length() != Integer.parseInt(valueFromFile)) {
                                DeveloperLog.LogD("Cache, length mismatch, url=" + str);
                                return false;
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
                updateFileTime(file2);
                updateFileTime(file);
                long requestInterval = getRequestInterval(file2);
                long maxAge = getMaxAge(file2);
                List<String> list = IN_USE_URLS;
                boolean z = true;
                if (list.contains(str)) {
                    return true;
                }
                if (requestInterval >= maxAge) {
                    z = false;
                }
                if (!z) {
                    DeveloperLog.LogD("Cache, noTimeOut=false, url=" + str);
                } else {
                    list.add(str);
                }
                return z;
            }
            return false;
        }
    }

    private static void freeSpaceIfNeeded(Context context) {
        File[] listFiles = getRootDir(context).listFiles();
        if (listFiles == null) {
            return;
        }
        int i = 0;
        for (File file : listFiles) {
            i = (int) (i + file.length());
        }
        if (i > FREE_SD_SPACE_NEEDED_TO_CACHE) {
            int length = (int) ((listFiles.length * 0.4d) + 1.0d);
            Arrays.sort(listFiles, new FileLastModifySort());
            for (int i2 = 0; i2 < length; i2++) {
                listFiles[i2].delete();
            }
        }
    }

    public static File getCacheFile(Context context, String str, String str2) {
        File file;
        File file2;
        File rootDir = getRootDir(context);
        if (str.startsWith("http")) {
            Map<String, String> urlFields = getUrlFields(str);
            String str3 = urlFields.get("path");
            String str4 = urlFields.get("name");
            if (TextUtils.isEmpty(str4)) {
                return null;
            }
            if (!TextUtils.isEmpty(str2)) {
                str4 = str4.concat(CommonConstants.FILE_HEADER_SUFFIX);
            }
            file2 = makeFilePath(rootDir, str3, str4, false);
        } else {
            Uri parse = Uri.parse(str);
            if (TextUtils.isEmpty(parse.getPath())) {
                return null;
            }
            if (TextUtils.isEmpty(str2)) {
                file = new File(parse.getPath());
            } else {
                file = new File(parse.getPath().concat(CommonConstants.FILE_HEADER_SUFFIX));
            }
            file2 = file;
        }
        updateFileTime(file2);
        return file2;
    }

    private static long getMaxAge(File file) throws Exception {
        String[] split;
        String valueFromFile = getValueFromFile(file, "Cache-Control");
        long j = 0;
        if (!TextUtils.isEmpty(valueFromFile) && valueFromFile.contains(CommonConstants.KEY_MAX_AGE)) {
            for (String str : valueFromFile.split(",")) {
                if (str.contains(CommonConstants.KEY_MAX_AGE)) {
                    j = Long.parseLong(str.split("=")[1]) * 1000;
                }
            }
        }
        if (j > 86400000) {
            return 86400000L;
        }
        if (j < MIN_CACHE_INTERVAL) {
            return MIN_CACHE_INTERVAL;
        }
        return j;
    }

    private static long getRequestInterval(File file) throws Exception {
        String valueFromFile = getValueFromFile(file, CommonConstants.KEY_REQUEST_TIME);
        if (TextUtils.isEmpty(valueFromFile)) {
            return 0L;
        }
        return System.currentTimeMillis() - Long.parseLong(valueFromFile);
    }

    private static File getRootDir(Context context) {
        File cacheDir = context.getCacheDir();
        File file = new File(cacheDir.getAbsolutePath() + File.separator + FILE_DIR_NAME);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    private static Map<String, String> getUrlFields(String str) {
        HashMap hashMap = new HashMap();
        Uri parse = Uri.parse(str);
        String md5 = Encrypter.md5(parse.getHost());
        String path = parse.getPath();
        String query = parse.getQuery();
        if (!TextUtils.isEmpty(path)) {
            hashMap.put("path", md5.concat(path.substring(0, path.lastIndexOf(RemoteSettings.FORWARD_SLASH_STRING))));
            String substring = path.substring(path.lastIndexOf(RemoteSettings.FORWARD_SLASH_STRING));
            if (query != null) {
                substring = substring + "_" + Encrypter.md5(query);
            }
            hashMap.put("name", substring);
        }
        return hashMap;
    }

    public static String getValueFromFile(File file, String str) throws Exception {
        updateFileTime(file);
        FileInputStream fileInputStream = IOUtil.getFileInputStream(file);
        if (fileInputStream == null) {
            return "";
        }
        String iOUtil = IOUtil.toString(fileInputStream);
        if (TextUtils.isEmpty(iOUtil)) {
            return "";
        }
        return new JSONObject(iOUtil.substring(iOUtil.indexOf("{"), iOUtil.lastIndexOf("}") + 1)).optString(str);
    }

    public static void init() {
        if (ApplicationUtil.getInstance().getApplicationContext() == null) {
            return;
        }
        createCacheRootDir(ApplicationUtil.getInstance().getApplicationContext());
        freeSpaceIfNeeded(ApplicationUtil.getInstance().getApplicationContext());
    }

    private static File makeFilePath(File file, String str, String str2) {
        return makeFilePath(file, str, str2, true);
    }

    private static void makeRootDirectory(File file, String str) {
        try {
            File file2 = new File(file, str);
            if (!file2.exists()) {
                file2.mkdirs();
            }
        } catch (Exception e) {
            DeveloperLog.LogE("error:", e);
        }
    }

    private static boolean saveContent(Context context, String str, Response response) throws Exception {
        File rootDir = getRootDir(context);
        Map<String, String> urlFields = getUrlFields(str);
        String str2 = urlFields.get("path");
        String str3 = urlFields.get("name");
        if (TextUtils.isEmpty(str3)) {
            return false;
        }
        File makeFilePath = makeFilePath(rootDir, str2, str3);
        if (makeFilePath.length() > 0) {
            makeFilePath.delete();
            makeFilePath = makeFilePath(rootDir, str2, str3);
        }
        return convertToResult(makeFilePath, response, (int) response.headers().getContentLength());
    }

    public static boolean saveFile(Context context, String str, Response response) {
        if (context == null) {
            return false;
        }
        try {
            boolean saveContent = saveContent(context, str, response);
            if (saveContent) {
                saveHeaderFields(context, str, response);
            }
            return saveContent;
        } catch (Exception e) {
            DeveloperLog.LogD(TAG, e);
            return false;
        }
    }

    public static void saveHeaderFields(Context context, String str, Response response) throws Exception {
        String[] strArr;
        Headers headers = response.headers();
        if (headers != null && !headers.isEmpty()) {
            File rootDir = getRootDir(context);
            Map<String, String> urlFields = getUrlFields(str);
            String str2 = urlFields.get("path");
            String concat = urlFields.get("name").concat(CommonConstants.FILE_HEADER_SUFFIX);
            File makeFilePath = makeFilePath(rootDir, str2, concat);
            if (makeFilePath.length() > 0) {
                makeFilePath.delete();
                makeFilePath = makeFilePath(rootDir, str2, concat);
            }
            JSONObject jSONObject = new JSONObject();
            for (String str3 : HEADERS) {
                if (headers.containsKey(str3)) {
                    jSONObject.put(str3, headers.get(str3).get(0).split(";")[0].trim());
                }
            }
            jSONObject.put(CommonConstants.KEY_REQUEST_TIME, String.valueOf(System.currentTimeMillis()));
            IOUtil.writeToFile(jSONObject.toString().getBytes(Charset.forName(C20517nb.f52167N)), makeFilePath);
        }
    }

    private static void updateFileTime(File file) {
        if (file != null && file.exists()) {
            file.setLastModified(System.currentTimeMillis());
        }
    }

    private static File makeFilePath(File file, String str, String str2, boolean z) {
        makeRootDirectory(file, str);
        File file2 = null;
        try {
            File file3 = new File(file, str + str2);
            if (z) {
                try {
                    if (file3.exists()) {
                        return file3;
                    }
                    file3.createNewFile();
                    return file3;
                } catch (Exception e) {
                    e = e;
                    file2 = file3;
                    DeveloperLog.LogE("error:", e);
                    return file2;
                }
            }
            return file3;
        } catch (Exception e2) {
            e = e2;
        }
    }
}
