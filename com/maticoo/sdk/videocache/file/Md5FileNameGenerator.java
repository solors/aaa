package com.maticoo.sdk.videocache.file;

import android.text.TextUtils;
import com.maticoo.sdk.videocache.ProxyCacheUtils;

/* loaded from: classes6.dex */
public class Md5FileNameGenerator implements FileNameGenerator {
    private static final int MAX_EXTENSION_LENGTH = 4;

    private String getExtension(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        int lastIndexOf2 = str.lastIndexOf(47);
        if (lastIndexOf != -1 && lastIndexOf > lastIndexOf2 && lastIndexOf + 2 + 4 > str.length()) {
            return str.substring(lastIndexOf + 1, str.length());
        }
        return "";
    }

    @Override // com.maticoo.sdk.videocache.file.FileNameGenerator
    public String generate(String str) {
        String extension = getExtension(str);
        String computeMD5 = ProxyCacheUtils.computeMD5(str);
        if (!TextUtils.isEmpty(extension)) {
            return computeMD5 + "." + extension;
        }
        return computeMD5;
    }
}
