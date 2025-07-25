package com.meevii.abtest.util;

import android.content.Context;
import android.database.Cursor;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes6.dex */
public class IOUtil {
    public static void close(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static void closeCursor(Cursor cursor) {
        if (cursor != null) {
            try {
                cursor.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static void delete(Context context, String str) {
        try {
            File file = new File(context.getFilesDir(), str);
            if (file.exists()) {
                file.delete();
            }
        } catch (Throwable unused) {
        }
    }

    public static byte[] inputStream2ByteArray(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream;
        Throwable th;
        byte[] bArr;
        if (inputStream == null) {
            return null;
        }
        try {
            bArr = new byte[32768];
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                while (true) {
                    try {
                        int read = inputStream.read(bArr);
                        if (read != -1) {
                            byteArrayOutputStream.write(bArr, 0, read);
                        } else {
                            return byteArrayOutputStream.toByteArray();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            th.printStackTrace();
                            close(inputStream);
                            close(byteArrayOutputStream);
                            return bArr;
                        } finally {
                            close(inputStream);
                            close(byteArrayOutputStream);
                        }
                    }
                }
            } catch (Throwable th3) {
                byteArrayOutputStream = null;
                th = th3;
            }
        } catch (Throwable th4) {
            byteArrayOutputStream = null;
            th = th4;
            bArr = null;
        }
    }

    public static boolean inputStream2OutputStream(InputStream inputStream, OutputStream outputStream) {
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    outputStream.write(bArr, 0, read);
                } else {
                    close(inputStream);
                    close(outputStream);
                    return true;
                }
            }
        } catch (Throwable unused) {
            close(inputStream);
            close(outputStream);
            return false;
        }
    }

    public static String inputStream2String(InputStream inputStream, String str) {
        try {
            return new String(inputStream2ByteArray(inputStream), str);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static String loadAbTestDataFromDisk(Context context, String str) {
        try {
            return inputStream2String(context.openFileInput(str), "UTF-8");
        } catch (Throwable unused) {
            AbTestLog.log("no file: " + str);
            return null;
        }
    }

    public static String loadAbTestFromAssets(Context context, String str) {
        try {
            return inputStream2String(context.getAssets().open(str), "UTF-8");
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static boolean saveAbTestDataToDisk(Context context, String str, String str2) {
        try {
            return stringToOutputStream(str2, context.openFileOutput(str, 0));
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public static boolean stringToOutputStream(String str, OutputStream outputStream) {
        if (str != null && outputStream != null) {
            try {
                outputStream.write(str.getBytes());
                close(outputStream);
                return true;
            } catch (Throwable th) {
                try {
                    th.printStackTrace();
                    return false;
                } finally {
                    close(outputStream);
                }
            }
        }
        return false;
    }
}
