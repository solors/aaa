package com.squareup.picasso;

/* loaded from: classes7.dex */
public enum NetworkPolicy {
    NO_CACHE(1),
    NO_STORE(2),
    OFFLINE(4);
    
    final int index;

    NetworkPolicy(int i) {
        this.index = i;
    }

    public static boolean isOfflineOnly(int i) {
        if ((i & OFFLINE.index) != 0) {
            return true;
        }
        return false;
    }

    public static boolean shouldReadFromDiskCache(int i) {
        if ((i & NO_CACHE.index) == 0) {
            return true;
        }
        return false;
    }

    public static boolean shouldWriteToDiskCache(int i) {
        if ((i & NO_STORE.index) == 0) {
            return true;
        }
        return false;
    }
}
