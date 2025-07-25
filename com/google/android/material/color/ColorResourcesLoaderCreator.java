package com.google.android.material.color;

import android.content.Context;
import android.content.res.loader.ResourcesLoader;
import android.content.res.loader.ResourcesProvider;
import android.os.ParcelFileDescriptor;
import android.system.Os;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.util.Map;

@RequiresApi(30)
/* loaded from: classes5.dex */
final class ColorResourcesLoaderCreator {

    /* renamed from: a */
    private static final String f37171a = "ColorResourcesLoaderCreator";

    private ColorResourcesLoaderCreator() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    /* renamed from: a */
    public static ResourcesLoader m71707a(@NonNull Context context, @NonNull Map<Integer, Integer> map) {
        FileDescriptor fileDescriptor;
        ResourcesProvider loadFromTable;
        try {
            byte[] m71698i = ColorResourcesTableCreator.m71698i(context, map);
            Log.i(f37171a, "Table created, length: " + m71698i.length);
            if (m71698i.length == 0) {
                return null;
            }
            try {
                fileDescriptor = Os.memfd_create("temp.arsc", 0);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(fileDescriptor);
                    fileOutputStream.write(m71698i);
                    ParcelFileDescriptor dup = ParcelFileDescriptor.dup(fileDescriptor);
                    try {
                        ResourcesLoader resourcesLoader = new ResourcesLoader();
                        loadFromTable = ResourcesProvider.loadFromTable(dup, null);
                        resourcesLoader.addProvider(loadFromTable);
                        if (dup != null) {
                            dup.close();
                        }
                        fileOutputStream.close();
                        if (fileDescriptor != null) {
                            Os.close(fileDescriptor);
                        }
                        return resourcesLoader;
                    } catch (Throwable th) {
                        if (dup != null) {
                            try {
                                dup.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (fileDescriptor != null) {
                        Os.close(fileDescriptor);
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                fileDescriptor = null;
            }
        } catch (Exception e) {
            Log.e(f37171a, "Failed to create the ColorResourcesTableCreator.", e);
            return null;
        }
    }
}
