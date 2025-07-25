package com.mbridge.msdk.playercommon.exoplayer2.util;

/* loaded from: classes6.dex */
public final class LibraryLoader {
    private boolean isAvailable;
    private boolean loadAttempted;
    private String[] nativeLibraries;

    public LibraryLoader(String... strArr) {
        this.nativeLibraries = strArr;
    }

    public final synchronized boolean isAvailable() {
        if (this.loadAttempted) {
            return this.isAvailable;
        }
        this.loadAttempted = true;
        try {
            for (String str : this.nativeLibraries) {
                System.loadLibrary(str);
            }
            this.isAvailable = true;
        } catch (UnsatisfiedLinkError unused) {
        }
        return this.isAvailable;
    }

    public final synchronized void setLibraries(String... strArr) {
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
