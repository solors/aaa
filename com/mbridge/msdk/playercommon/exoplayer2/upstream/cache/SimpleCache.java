package com.mbridge.msdk.playercommon.exoplayer2.upstream.cache;

import android.os.ConditionVariable;
import android.util.Log;
import androidx.annotation.NonNull;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.Cache;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

/* loaded from: classes6.dex */
public final class SimpleCache implements Cache {
    private static final String TAG = "SimpleCache";
    private static boolean cacheFolderLockingDisabled;
    private static final HashSet<File> lockedCacheDirs = new HashSet<>();
    private final File cacheDir;
    private final CacheEvictor evictor;
    private final CachedContentIndex index;
    private final HashMap<String, ArrayList<Cache.Listener>> listeners;
    private boolean released;
    private long totalSpace;

    public SimpleCache(File file, CacheEvictor cacheEvictor) {
        this(file, cacheEvictor, null, false);
    }

    private void addSpan(SimpleCacheSpan simpleCacheSpan) {
        this.index.getOrAdd(simpleCacheSpan.key).addSpan(simpleCacheSpan);
        this.totalSpace += simpleCacheSpan.length;
        notifySpanAdded(simpleCacheSpan);
    }

    @Deprecated
    public static synchronized void disableCacheFolderLocking() {
        synchronized (SimpleCache.class) {
            cacheFolderLockingDisabled = true;
            lockedCacheDirs.clear();
        }
    }

    private SimpleCacheSpan getSpan(String str, long j) throws Cache.CacheException {
        SimpleCacheSpan span;
        CachedContent cachedContent = this.index.get(str);
        if (cachedContent == null) {
            return SimpleCacheSpan.createOpenHole(str, j);
        }
        while (true) {
            span = cachedContent.getSpan(j);
            if (!span.isCached || span.file.exists()) {
                break;
            }
            removeStaleSpansAndCachedContents();
        }
        return span;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initialize() {
        SimpleCacheSpan simpleCacheSpan;
        if (!this.cacheDir.exists()) {
            this.cacheDir.mkdirs();
            return;
        }
        this.index.load();
        File[] listFiles = this.cacheDir.listFiles();
        if (listFiles == null) {
            return;
        }
        for (File file : listFiles) {
            if (!file.getName().equals(CachedContentIndex.FILE_NAME)) {
                if (file.length() > 0) {
                    simpleCacheSpan = SimpleCacheSpan.createCacheEntry(file, this.index);
                } else {
                    simpleCacheSpan = null;
                }
                if (simpleCacheSpan != null) {
                    addSpan(simpleCacheSpan);
                } else {
                    file.delete();
                }
            }
        }
        this.index.removeEmpty();
        try {
            this.index.store();
        } catch (Cache.CacheException e) {
            Log.e(TAG, "Storing index file failed", e);
        }
    }

    public static synchronized boolean isCacheFolderLocked(File file) {
        boolean contains;
        synchronized (SimpleCache.class) {
            contains = lockedCacheDirs.contains(file.getAbsoluteFile());
        }
        return contains;
    }

    private static synchronized boolean lockFolder(File file) {
        synchronized (SimpleCache.class) {
            if (cacheFolderLockingDisabled) {
                return true;
            }
            return lockedCacheDirs.add(file.getAbsoluteFile());
        }
    }

    private void notifySpanAdded(SimpleCacheSpan simpleCacheSpan) {
        ArrayList<Cache.Listener> arrayList = this.listeners.get(simpleCacheSpan.key);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).onSpanAdded(this, simpleCacheSpan);
            }
        }
        this.evictor.onSpanAdded(this, simpleCacheSpan);
    }

    private void notifySpanRemoved(CacheSpan cacheSpan) {
        ArrayList<Cache.Listener> arrayList = this.listeners.get(cacheSpan.key);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).onSpanRemoved(this, cacheSpan);
            }
        }
        this.evictor.onSpanRemoved(this, cacheSpan);
    }

    private void notifySpanTouched(SimpleCacheSpan simpleCacheSpan, CacheSpan cacheSpan) {
        ArrayList<Cache.Listener> arrayList = this.listeners.get(simpleCacheSpan.key);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).onSpanTouched(this, simpleCacheSpan, cacheSpan);
            }
        }
        this.evictor.onSpanTouched(this, simpleCacheSpan, cacheSpan);
    }

    private void removeStaleSpansAndCachedContents() throws Cache.CacheException {
        ArrayList arrayList = new ArrayList();
        for (CachedContent cachedContent : this.index.getAll()) {
            Iterator<SimpleCacheSpan> it = cachedContent.getSpans().iterator();
            while (it.hasNext()) {
                SimpleCacheSpan next = it.next();
                if (!next.file.exists()) {
                    arrayList.add(next);
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            removeSpan((CacheSpan) arrayList.get(i), false);
        }
        this.index.removeEmpty();
        this.index.store();
    }

    private static synchronized void unlockFolder(File file) {
        synchronized (SimpleCache.class) {
            if (!cacheFolderLockingDisabled) {
                lockedCacheDirs.remove(file.getAbsoluteFile());
            }
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.Cache
    public final synchronized NavigableSet<CacheSpan> addListener(String str, Cache.Listener listener) {
        boolean z;
        if (!this.released) {
            z = true;
        } else {
            z = false;
        }
        Assertions.checkState(z);
        ArrayList<Cache.Listener> arrayList = this.listeners.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.listeners.put(str, arrayList);
        }
        arrayList.add(listener);
        return getCachedSpans(str);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.Cache
    public final synchronized void applyContentMetadataMutations(String str, ContentMetadataMutations contentMetadataMutations) throws Cache.CacheException {
        boolean z;
        if (!this.released) {
            z = true;
        } else {
            z = false;
        }
        Assertions.checkState(z);
        this.index.applyContentMetadataMutations(str, contentMetadataMutations);
        this.index.store();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.Cache
    public final synchronized void commitFile(File file) throws Cache.CacheException {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (!this.released) {
            z = true;
        } else {
            z = false;
        }
        Assertions.checkState(z);
        SimpleCacheSpan createCacheEntry = SimpleCacheSpan.createCacheEntry(file, this.index);
        if (createCacheEntry != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        Assertions.checkState(z2);
        CachedContent cachedContent = this.index.get(createCacheEntry.key);
        Assertions.checkNotNull(cachedContent);
        Assertions.checkState(cachedContent.isLocked());
        if (!file.exists()) {
            return;
        }
        if (file.length() == 0) {
            file.delete();
            return;
        }
        long contentLength = ContentMetadataInternal.getContentLength(cachedContent.getMetadata());
        if (contentLength != -1) {
            if (createCacheEntry.position + createCacheEntry.length > contentLength) {
                z3 = false;
            }
            Assertions.checkState(z3);
        }
        addSpan(createCacheEntry);
        this.index.store();
        notifyAll();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.Cache
    public final synchronized long getCacheSpace() {
        boolean z;
        if (!this.released) {
            z = true;
        } else {
            z = false;
        }
        Assertions.checkState(z);
        return this.totalSpace;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.Cache
    public final synchronized long getCachedLength(String str, long j, long j2) {
        boolean z;
        long j3;
        if (!this.released) {
            z = true;
        } else {
            z = false;
        }
        Assertions.checkState(z);
        CachedContent cachedContent = this.index.get(str);
        if (cachedContent != null) {
            j3 = cachedContent.getCachedBytesLength(j, j2);
        } else {
            j3 = -j2;
        }
        return j3;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.Cache
    @NonNull
    public final synchronized NavigableSet<CacheSpan> getCachedSpans(String str) {
        boolean z;
        TreeSet treeSet;
        if (!this.released) {
            z = true;
        } else {
            z = false;
        }
        Assertions.checkState(z);
        CachedContent cachedContent = this.index.get(str);
        if (cachedContent != null && !cachedContent.isEmpty()) {
            treeSet = new TreeSet((Collection) cachedContent.getSpans());
        }
        treeSet = new TreeSet();
        return treeSet;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.Cache
    public final synchronized long getContentLength(String str) {
        return ContentMetadataInternal.getContentLength(getContentMetadata(str));
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.Cache
    public final synchronized ContentMetadata getContentMetadata(String str) {
        boolean z;
        if (!this.released) {
            z = true;
        } else {
            z = false;
        }
        Assertions.checkState(z);
        return this.index.getContentMetadata(str);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.Cache
    public final synchronized Set<String> getKeys() {
        boolean z;
        if (!this.released) {
            z = true;
        } else {
            z = false;
        }
        Assertions.checkState(z);
        return new HashSet(this.index.getKeys());
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
        if (r4.getCachedBytesLength(r5, r7) >= r7) goto L11;
     */
    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.Cache
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean isCached(java.lang.String r4, long r5, long r7) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.released     // Catch: java.lang.Throwable -> L21
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L9
            r0 = r1
            goto La
        L9:
            r0 = r2
        La:
            com.mbridge.msdk.playercommon.exoplayer2.util.Assertions.checkState(r0)     // Catch: java.lang.Throwable -> L21
            com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.CachedContentIndex r0 = r3.index     // Catch: java.lang.Throwable -> L21
            com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.CachedContent r4 = r0.get(r4)     // Catch: java.lang.Throwable -> L21
            if (r4 == 0) goto L1e
            long r4 = r4.getCachedBytesLength(r5, r7)     // Catch: java.lang.Throwable -> L21
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 < 0) goto L1e
            goto L1f
        L1e:
            r1 = r2
        L1f:
            monitor-exit(r3)
            return r1
        L21:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.SimpleCache.isCached(java.lang.String, long, long):boolean");
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.Cache
    public final synchronized void release() throws Cache.CacheException {
        if (this.released) {
            return;
        }
        this.listeners.clear();
        removeStaleSpansAndCachedContents();
        unlockFolder(this.cacheDir);
        this.released = true;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.Cache
    public final synchronized void releaseHoleSpan(CacheSpan cacheSpan) {
        boolean z;
        if (!this.released) {
            z = true;
        } else {
            z = false;
        }
        Assertions.checkState(z);
        CachedContent cachedContent = this.index.get(cacheSpan.key);
        Assertions.checkNotNull(cachedContent);
        Assertions.checkState(cachedContent.isLocked());
        cachedContent.setLocked(false);
        this.index.maybeRemove(cachedContent.key);
        notifyAll();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.Cache
    public final synchronized void removeListener(String str, Cache.Listener listener) {
        if (this.released) {
            return;
        }
        ArrayList<Cache.Listener> arrayList = this.listeners.get(str);
        if (arrayList != null) {
            arrayList.remove(listener);
            if (arrayList.isEmpty()) {
                this.listeners.remove(str);
            }
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.Cache
    public final synchronized void removeSpan(CacheSpan cacheSpan) throws Cache.CacheException {
        Assertions.checkState(!this.released);
        removeSpan(cacheSpan, true);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.Cache
    public final synchronized void setContentLength(String str, long j) throws Cache.CacheException {
        ContentMetadataMutations contentMetadataMutations = new ContentMetadataMutations();
        ContentMetadataInternal.setContentLength(contentMetadataMutations, j);
        applyContentMetadataMutations(str, contentMetadataMutations);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.Cache
    public final synchronized File startFile(String str, long j, long j2) throws Cache.CacheException {
        boolean z;
        CachedContent cachedContent;
        if (!this.released) {
            z = true;
        } else {
            z = false;
        }
        Assertions.checkState(z);
        cachedContent = this.index.get(str);
        Assertions.checkNotNull(cachedContent);
        Assertions.checkState(cachedContent.isLocked());
        if (!this.cacheDir.exists()) {
            this.cacheDir.mkdirs();
            removeStaleSpansAndCachedContents();
        }
        this.evictor.onStartFile(this, str, j, j2);
        return SimpleCacheSpan.getCacheFile(this.cacheDir, cachedContent.f58767id, j, System.currentTimeMillis());
    }

    public SimpleCache(File file, CacheEvictor cacheEvictor, byte[] bArr) {
        this(file, cacheEvictor, bArr, bArr != null);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.Cache
    public final synchronized SimpleCacheSpan startReadWrite(String str, long j) throws InterruptedException, Cache.CacheException {
        SimpleCacheSpan startReadWriteNonBlocking;
        while (true) {
            startReadWriteNonBlocking = startReadWriteNonBlocking(str, j);
            if (startReadWriteNonBlocking == null) {
                wait();
            }
        }
        return startReadWriteNonBlocking;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.Cache
    public final synchronized SimpleCacheSpan startReadWriteNonBlocking(String str, long j) throws Cache.CacheException {
        Assertions.checkState(!this.released);
        SimpleCacheSpan span = getSpan(str, j);
        if (span.isCached) {
            SimpleCacheSpan simpleCacheSpan = this.index.get(str).touch(span);
            notifySpanTouched(span, simpleCacheSpan);
            return simpleCacheSpan;
        }
        CachedContent orAdd = this.index.getOrAdd(str);
        if (orAdd.isLocked()) {
            return null;
        }
        orAdd.setLocked(true);
        return span;
    }

    public SimpleCache(File file, CacheEvictor cacheEvictor, byte[] bArr, boolean z) {
        this(file, cacheEvictor, new CachedContentIndex(file, bArr, z));
    }

    SimpleCache(File file, CacheEvictor cacheEvictor, CachedContentIndex cachedContentIndex) {
        if (lockFolder(file)) {
            this.cacheDir = file;
            this.evictor = cacheEvictor;
            this.index = cachedContentIndex;
            this.listeners = new HashMap<>();
            final ConditionVariable conditionVariable = new ConditionVariable();
            new Thread("SimpleCache.initialize()") { // from class: com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.SimpleCache.1
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    synchronized (SimpleCache.this) {
                        conditionVariable.open();
                        SimpleCache.this.initialize();
                        SimpleCache.this.evictor.onCacheInitialized();
                    }
                }
            }.start();
            conditionVariable.block();
            return;
        }
        throw new IllegalStateException("Another SimpleCache instance uses the folder: " + file);
    }

    private void removeSpan(CacheSpan cacheSpan, boolean z) throws Cache.CacheException {
        CachedContent cachedContent = this.index.get(cacheSpan.key);
        if (cachedContent == null || !cachedContent.removeSpan(cacheSpan)) {
            return;
        }
        this.totalSpace -= cacheSpan.length;
        if (z) {
            try {
                this.index.maybeRemove(cachedContent.key);
                this.index.store();
            } finally {
                notifySpanRemoved(cacheSpan);
            }
        }
    }
}
