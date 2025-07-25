package com.learnings.luid;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;

/* loaded from: classes6.dex */
public class SandBoxOutsideLUIDCache implements LUIDCache {
    private Context context;
    private boolean debug;
    private String fileDirPath;
    private String fileName = ".lxuid";

    public SandBoxOutsideLUIDCache(Context context, String str, boolean z) {
        str = TextUtils.isEmpty(str) ? ".learnings" : str;
        this.context = context.getApplicationContext();
        this.debug = z;
        this.fileDirPath = Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator + str;
    }

    private String readFromFile(File file) {
        StringBuilder sb2 = new StringBuilder();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb2.append(readLine);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (Exception e) {
            if (this.debug) {
                e.printStackTrace();
            }
        }
        return sb2.toString();
    }

    private void writeToExternalIfNeed(Context context, String str) {
        File file = new File(this.fileDirPath, this.fileName);
        if (!file.exists() && context.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            File file2 = new File(this.fileDirPath);
            if (!file2.exists()) {
                file2.mkdir();
            }
            writeToFile(file, str);
        }
    }

    private void writeToFile(File file, String str) {
        if (file.exists()) {
            file.delete();
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(str.getBytes());
            fileOutputStream.close();
        } catch (Exception e) {
            if (this.debug) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.learnings.luid.LUIDCache
    public String getUID() {
        if (this.context.checkCallingOrSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
            return null;
        }
        try {
            File file = new File(this.fileDirPath, this.fileName);
            if (!file.exists()) {
                return null;
            }
            return readFromFile(file);
        } catch (Exception e) {
            if (!this.debug) {
                return null;
            }
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.learnings.luid.LUIDCache
    public void saveUID(String str) {
        writeToExternalIfNeed(this.context, str);
    }
}
