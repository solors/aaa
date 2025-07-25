package com.unity3d.services.core.cache;

import android.content.Context;
import android.os.Environment;
import com.maticoo.sdk.utils.log.p406bi.Constants;
import com.unity3d.services.core.log.DeviceLog;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/* loaded from: classes7.dex */
public class CacheDirectory {
    private static final String TEST_FILE_NAME = "UnityAdsTest.txt";
    private String _cacheDirName;
    private File _cacheDirectory;
    private boolean _initialized;
    private final boolean _preferExternalStorage;
    private CacheDirectoryType _type;

    public CacheDirectory(String str) {
        this._initialized = false;
        this._cacheDirectory = null;
        this._type = null;
        this._cacheDirName = str;
        this._preferExternalStorage = true;
    }

    private void createNoMediaFile(File file) {
        try {
            if (new File(file, ".nomedia").createNewFile()) {
                DeviceLog.debug("Successfully created .nomedia file");
            } else {
                DeviceLog.debug("Using existing .nomedia file");
            }
        } catch (Exception e) {
            DeviceLog.exception("Failed to create .nomedia file", e);
        }
    }

    public File createCacheDirectory(File file, String str) {
        if (file == null) {
            return null;
        }
        File file2 = new File(file, str);
        file2.mkdirs();
        if (!file2.isDirectory()) {
            return null;
        }
        return file2;
    }

    public synchronized File getCacheDirectory(Context context) {
        if (context == null) {
            return null;
        }
        if (this._initialized) {
            return this._cacheDirectory;
        }
        this._initialized = true;
        if (this._preferExternalStorage) {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                try {
                    File createCacheDirectory = createCacheDirectory(context.getExternalCacheDir(), this._cacheDirName);
                    if (testCacheDirectory(createCacheDirectory)) {
                        createNoMediaFile(createCacheDirectory);
                        this._cacheDirectory = createCacheDirectory;
                        this._type = CacheDirectoryType.EXTERNAL;
                        DeviceLog.debug("Unity Ads is using external cache directory: " + createCacheDirectory.getAbsolutePath());
                        return this._cacheDirectory;
                    }
                } catch (Exception e) {
                    DeviceLog.exception("Creating external cache directory failed", e);
                    return null;
                }
            } else {
                DeviceLog.debug("External media not mounted");
            }
        }
        File createCacheDirectory2 = createCacheDirectory(context.getNoBackupFilesDir(), this._cacheDirName);
        if (testCacheDirectory(createCacheDirectory2)) {
            this._cacheDirectory = createCacheDirectory2;
            this._type = CacheDirectoryType.INTERNAL;
            DeviceLog.debug("Unity Ads is using internal cache directory: " + createCacheDirectory2.getAbsolutePath());
            return this._cacheDirectory;
        }
        DeviceLog.error("Unity Ads failed to initialize cache directory");
        return null;
    }

    public CacheDirectoryType getType() {
        return this._type;
    }

    public boolean testCacheDirectory(File file) {
        if (file != null && file.isDirectory()) {
            try {
                byte[] bytes = Constants.KEY_TEST.getBytes("UTF-8");
                int length = bytes.length;
                byte[] bArr = new byte[length];
                File file2 = new File(file, TEST_FILE_NAME);
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                fileOutputStream.write(bytes);
                fileOutputStream.flush();
                fileOutputStream.close();
                FileInputStream fileInputStream = new FileInputStream(file2);
                int read = fileInputStream.read(bArr, 0, length);
                fileInputStream.close();
                if (!file2.delete()) {
                    DeviceLog.debug("Failed to delete testfile " + file2.getAbsoluteFile());
                    return false;
                } else if (read != length) {
                    DeviceLog.debug("Read buffer size mismatch");
                    return false;
                } else if (new String(bArr, "UTF-8").equals(Constants.KEY_TEST)) {
                    return true;
                } else {
                    DeviceLog.debug("Read buffer content mismatch");
                    return false;
                }
            } catch (Exception e) {
                DeviceLog.debug("Unity Ads exception while testing cache directory " + file.getAbsolutePath() + ": " + e.getMessage());
            }
        }
        return false;
    }

    public CacheDirectory(String str, boolean z) {
        this._initialized = false;
        this._cacheDirectory = null;
        this._type = null;
        this._preferExternalStorage = z;
        this._cacheDirName = str;
    }
}
