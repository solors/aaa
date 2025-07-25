package androidx.profileinstaller;

import androidx.annotation.NonNull;
import java.util.TreeMap;

/* loaded from: classes2.dex */
class DexProfileData {
    @NonNull
    final String apkName;
    int classSetSize;
    @NonNull
    int[] classes;
    final long dexChecksum;
    @NonNull
    final String dexName;
    final int hotMethodRegionSize;
    long mTypeIdCount;
    @NonNull
    final TreeMap<Integer, Integer> methods;
    final int numMethodIds;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DexProfileData(@NonNull String str, @NonNull String str2, long j, long j2, int i, int i2, int i3, @NonNull int[] iArr, @NonNull TreeMap<Integer, Integer> treeMap) {
        this.apkName = str;
        this.dexName = str2;
        this.dexChecksum = j;
        this.mTypeIdCount = j2;
        this.classSetSize = i;
        this.hotMethodRegionSize = i2;
        this.numMethodIds = i3;
        this.classes = iArr;
        this.methods = treeMap;
    }
}
