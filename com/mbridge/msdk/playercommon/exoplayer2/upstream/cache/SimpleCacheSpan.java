package com.mbridge.msdk.playercommon.exoplayer2.upstream.cache;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class SimpleCacheSpan extends CacheSpan {
    private static final Pattern CACHE_FILE_PATTERN_V1 = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);
    private static final Pattern CACHE_FILE_PATTERN_V2 = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);
    private static final Pattern CACHE_FILE_PATTERN_V3 = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);
    private static final String SUFFIX = ".v3.exo";

    private SimpleCacheSpan(String str, long j, long j2, long j3, @Nullable File file) {
        super(str, j, j2, j3, file);
    }

    @Nullable
    public static SimpleCacheSpan createCacheEntry(File file, CachedContentIndex cachedContentIndex) {
        String name = file.getName();
        if (!name.endsWith(SUFFIX)) {
            file = upgradeFile(file, cachedContentIndex);
            if (file == null) {
                return null;
            }
            name = file.getName();
        }
        File file2 = file;
        Matcher matcher = CACHE_FILE_PATTERN_V3.matcher(name);
        if (!matcher.matches()) {
            return null;
        }
        long length = file2.length();
        String keyForId = cachedContentIndex.getKeyForId(Integer.parseInt(matcher.group(1)));
        if (keyForId == null) {
            return null;
        }
        return new SimpleCacheSpan(keyForId, Long.parseLong(matcher.group(2)), length, Long.parseLong(matcher.group(3)), file2);
    }

    public static SimpleCacheSpan createClosedHole(String str, long j, long j2) {
        return new SimpleCacheSpan(str, j, j2, -9223372036854775807L, null);
    }

    public static SimpleCacheSpan createLookup(String str, long j) {
        return new SimpleCacheSpan(str, j, -1L, -9223372036854775807L, null);
    }

    public static SimpleCacheSpan createOpenHole(String str, long j) {
        return new SimpleCacheSpan(str, j, -1L, -9223372036854775807L, null);
    }

    public static File getCacheFile(File file, int i, long j, long j2) {
        return new File(file, i + "." + j + "." + j2 + SUFFIX);
    }

    @Nullable
    private static File upgradeFile(File file, CachedContentIndex cachedContentIndex) {
        String group;
        String name = file.getName();
        Matcher matcher = CACHE_FILE_PATTERN_V2.matcher(name);
        if (matcher.matches()) {
            group = Util.unescapeFileName(matcher.group(1));
            if (group == null) {
                return null;
            }
        } else {
            matcher = CACHE_FILE_PATTERN_V1.matcher(name);
            if (!matcher.matches()) {
                return null;
            }
            group = matcher.group(1);
        }
        File cacheFile = getCacheFile(file.getParentFile(), cachedContentIndex.assignIdForKey(group), Long.parseLong(matcher.group(2)), Long.parseLong(matcher.group(3)));
        if (!file.renameTo(cacheFile)) {
            return null;
        }
        return cacheFile;
    }

    public final SimpleCacheSpan copyWithUpdatedLastAccessTime(int i) {
        Assertions.checkState(this.isCached);
        long currentTimeMillis = System.currentTimeMillis();
        return new SimpleCacheSpan(this.key, this.position, this.length, currentTimeMillis, getCacheFile(this.file.getParentFile(), i, this.position, currentTimeMillis));
    }
}
