package com.unity3d.ads.core.extensions;

import java.io.File;
import java.util.LinkedList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.unity3d.ads.core.extensions.FileExtensionsKt */
/* loaded from: classes7.dex */
public final class FileExtensions {
    public static final long getDirectorySize(@NotNull File file) {
        File[] listFiles;
        Intrinsics.checkNotNullParameter(file, "<this>");
        long j = 0;
        if (!file.exists()) {
            return 0L;
        }
        if (!file.isDirectory()) {
            return file.length();
        }
        LinkedList linkedList = new LinkedList();
        linkedList.add(file);
        while (true) {
            boolean z = true;
            if (!linkedList.isEmpty()) {
                File file2 = (File) linkedList.remove(0);
                if (file2.exists() && (listFiles = file2.listFiles()) != null) {
                    if (listFiles.length != 0) {
                        z = false;
                    }
                    if (!z) {
                        for (File child : listFiles) {
                            if (child.isDirectory()) {
                                Intrinsics.checkNotNullExpressionValue(child, "child");
                                linkedList.add(child);
                            } else {
                                j += child.length();
                            }
                        }
                    }
                }
            } else {
                return j;
            }
        }
    }
}
