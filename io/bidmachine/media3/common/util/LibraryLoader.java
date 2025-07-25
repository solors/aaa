package io.bidmachine.media3.common.util;

import java.util.Arrays;

@UnstableApi
/* loaded from: classes9.dex */
public abstract class LibraryLoader {
    private static final String TAG = "LibraryLoader";
    private boolean isAvailable;
    private boolean loadAttempted;
    private String[] nativeLibraries;

    public LibraryLoader(String... strArr) {
        this.nativeLibraries = strArr;
    }

    public synchronized boolean isAvailable() {
        if (this.loadAttempted) {
            return this.isAvailable;
        }
        this.loadAttempted = true;
        try {
            for (String str : this.nativeLibraries) {
                loadLibrary(str);
            }
            this.isAvailable = true;
        } catch (UnsatisfiedLinkError unused) {
            Log.m19945w(TAG, "Failed to load " + Arrays.toString(this.nativeLibraries));
        }
        return this.isAvailable;
    }

    protected abstract void loadLibrary(String str);

    public synchronized void setLibraries(String... strArr) {
        boolean z;
        if (!this.loadAttempted) {
            z = true;
        } else {
            z = false;
        }
        Assertions.checkState(z, "Cannot set libraries after loading");
        this.nativeLibraries = strArr;
    }
}
