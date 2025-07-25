package androidx.compose.p015ui.text.font;

import androidx.compose.p015ui.text.ExperimentalTextApi;
import androidx.compose.p015ui.text.caches.LruCache;
import androidx.compose.p015ui.text.caches.SimpleArrayMap;
import androidx.compose.p015ui.text.platform.Synchronization_jvmKt;
import androidx.compose.p015ui.text.platform.SynchronizedObject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FontListFontFamilyTypefaceAdapter.kt */
@ExperimentalTextApi
@Metadata
/* renamed from: androidx.compose.ui.text.font.AsyncTypefaceCache */
/* loaded from: classes.dex */
public final class AsyncTypefaceCache {
    @NotNull
    private final Object PermanentFailure = AsyncTypefaceResult.m109421constructorimpl(null);
    @NotNull
    private final LruCache<Key, AsyncTypefaceResult> resultCache = new LruCache<>(16);
    @NotNull
    private final SimpleArrayMap<Key, AsyncTypefaceResult> permanentCache = new SimpleArrayMap<>(0, 1, null);
    @NotNull
    private final SynchronizedObject cacheLock = Synchronization_jvmKt.createSynchronizedObject();

    /* compiled from: FontListFontFamilyTypefaceAdapter.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.text.font.AsyncTypefaceCache$Key */
    /* loaded from: classes.dex */
    public static final class Key {
        @NotNull
        private final Font font;
        @Nullable
        private final Object loaderKey;

        public Key(@NotNull Font font, @Nullable Object obj) {
            Intrinsics.checkNotNullParameter(font, "font");
            this.font = font;
            this.loaderKey = obj;
        }

        public static /* synthetic */ Key copy$default(Key key, Font font, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                font = key.font;
            }
            if ((i & 2) != 0) {
                obj = key.loaderKey;
            }
            return key.copy(font, obj);
        }

        @NotNull
        public final Font component1() {
            return this.font;
        }

        @Nullable
        public final Object component2() {
            return this.loaderKey;
        }

        @NotNull
        public final Key copy(@NotNull Font font, @Nullable Object obj) {
            Intrinsics.checkNotNullParameter(font, "font");
            return new Key(font, obj);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Key)) {
                return false;
            }
            Key key = (Key) obj;
            if (Intrinsics.m17075f(this.font, key.font) && Intrinsics.m17075f(this.loaderKey, key.loaderKey)) {
                return true;
            }
            return false;
        }

        @NotNull
        public final Font getFont() {
            return this.font;
        }

        @Nullable
        public final Object getLoaderKey() {
            return this.loaderKey;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = this.font.hashCode() * 31;
            Object obj = this.loaderKey;
            if (obj == null) {
                hashCode = 0;
            } else {
                hashCode = obj.hashCode();
            }
            return hashCode2 + hashCode;
        }

        @NotNull
        public String toString() {
            return "Key(font=" + this.font + ", loaderKey=" + this.loaderKey + ')';
        }
    }

    public static /* synthetic */ void put$default(AsyncTypefaceCache asyncTypefaceCache, Font font, PlatformFontLoader platformFontLoader, Object obj, boolean z, int i, Object obj2) {
        if ((i & 8) != 0) {
            z = false;
        }
        asyncTypefaceCache.put(font, platformFontLoader, obj, z);
    }

    @Nullable
    /* renamed from: get-1ASDuI8  reason: not valid java name */
    public final AsyncTypefaceResult m109419get1ASDuI8(@NotNull Font font, @NotNull PlatformFontLoader platformFontLoader) {
        AsyncTypefaceResult asyncTypefaceResult;
        Intrinsics.checkNotNullParameter(font, "font");
        Intrinsics.checkNotNullParameter(platformFontLoader, "platformFontLoader");
        Key key = new Key(font, platformFontLoader.getCacheKey());
        synchronized (this.cacheLock) {
            asyncTypefaceResult = this.resultCache.get(key);
            if (asyncTypefaceResult == null) {
                asyncTypefaceResult = this.permanentCache.get(key);
            }
        }
        return asyncTypefaceResult;
    }

    public final void put(@NotNull Font font, @NotNull PlatformFontLoader platformFontLoader, @Nullable Object obj, boolean z) {
        Intrinsics.checkNotNullParameter(font, "font");
        Intrinsics.checkNotNullParameter(platformFontLoader, "platformFontLoader");
        Key key = new Key(font, platformFontLoader.getCacheKey());
        synchronized (this.cacheLock) {
            try {
                if (obj == null) {
                    this.permanentCache.put(key, AsyncTypefaceResult.m109420boximpl(this.PermanentFailure));
                } else if (z) {
                    this.permanentCache.put(key, AsyncTypefaceResult.m109420boximpl(AsyncTypefaceResult.m109421constructorimpl(obj)));
                } else {
                    this.resultCache.put(key, AsyncTypefaceResult.m109420boximpl(AsyncTypefaceResult.m109421constructorimpl(obj)));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object runCached(@org.jetbrains.annotations.NotNull androidx.compose.p015ui.text.font.Font r6, @org.jetbrains.annotations.NotNull androidx.compose.p015ui.text.font.PlatformFontLoader r7, boolean r8, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<java.lang.Object>, ? extends java.lang.Object> r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<java.lang.Object> r10) {
        /*
            r5 = this;
            boolean r0 = r10 instanceof androidx.compose.p015ui.text.font.AsyncTypefaceCache$runCached$1
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1 r0 = (androidx.compose.p015ui.text.font.AsyncTypefaceCache$runCached$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1 r0 = new androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1
            r0.<init>(r5, r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = sd.C42683b.m6964e()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            boolean r8 = r0.Z$0
            java.lang.Object r6 = r0.L$1
            androidx.compose.ui.text.font.AsyncTypefaceCache$Key r6 = (androidx.compose.p015ui.text.font.AsyncTypefaceCache.Key) r6
            java.lang.Object r7 = r0.L$0
            androidx.compose.ui.text.font.AsyncTypefaceCache r7 = (androidx.compose.p015ui.text.font.AsyncTypefaceCache) r7
            p804nd.C38508r.m14539b(r10)
            goto L7a
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            p804nd.C38508r.m14539b(r10)
            androidx.compose.ui.text.font.AsyncTypefaceCache$Key r10 = new androidx.compose.ui.text.font.AsyncTypefaceCache$Key
            java.lang.Object r7 = r7.getCacheKey()
            r10.<init>(r6, r7)
            androidx.compose.ui.text.platform.SynchronizedObject r6 = r5.cacheLock
            monitor-enter(r6)
            androidx.compose.ui.text.caches.LruCache<androidx.compose.ui.text.font.AsyncTypefaceCache$Key, androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult> r7 = r5.resultCache     // Catch: java.lang.Throwable -> Lb0
            java.lang.Object r7 = r7.get(r10)     // Catch: java.lang.Throwable -> Lb0
            androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult r7 = (androidx.compose.p015ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult) r7     // Catch: java.lang.Throwable -> Lb0
            if (r7 != 0) goto L5c
            androidx.compose.ui.text.caches.SimpleArrayMap<androidx.compose.ui.text.font.AsyncTypefaceCache$Key, androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult> r7 = r5.permanentCache     // Catch: java.lang.Throwable -> Lb0
            java.lang.Object r7 = r7.get(r10)     // Catch: java.lang.Throwable -> Lb0
            androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult r7 = (androidx.compose.p015ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult) r7     // Catch: java.lang.Throwable -> Lb0
        L5c:
            if (r7 == 0) goto L64
            java.lang.Object r7 = r7.m109427unboximpl()     // Catch: java.lang.Throwable -> Lb0
            monitor-exit(r6)
            return r7
        L64:
            kotlin.Unit r7 = kotlin.Unit.f99208a     // Catch: java.lang.Throwable -> Lb0
            monitor-exit(r6)
            r0.L$0 = r5
            r0.L$1 = r10
            r0.Z$0 = r8
            r0.label = r3
            java.lang.Object r6 = r9.invoke(r0)
            if (r6 != r1) goto L76
            return r1
        L76:
            r7 = r5
            r4 = r10
            r10 = r6
            r6 = r4
        L7a:
            androidx.compose.ui.text.platform.SynchronizedObject r9 = r7.cacheLock
            monitor-enter(r9)
            if (r10 != 0) goto L8d
            androidx.compose.ui.text.caches.SimpleArrayMap<androidx.compose.ui.text.font.AsyncTypefaceCache$Key, androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult> r8 = r7.permanentCache     // Catch: java.lang.Throwable -> L8b
            java.lang.Object r7 = r7.PermanentFailure     // Catch: java.lang.Throwable -> L8b
            androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult r7 = androidx.compose.p015ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult.m109420boximpl(r7)     // Catch: java.lang.Throwable -> L8b
            r8.put(r6, r7)     // Catch: java.lang.Throwable -> L8b
            goto Laa
        L8b:
            r6 = move-exception
            goto Lae
        L8d:
            if (r8 == 0) goto L9d
            androidx.compose.ui.text.caches.SimpleArrayMap<androidx.compose.ui.text.font.AsyncTypefaceCache$Key, androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult> r7 = r7.permanentCache     // Catch: java.lang.Throwable -> L8b
            java.lang.Object r8 = androidx.compose.p015ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult.m109421constructorimpl(r10)     // Catch: java.lang.Throwable -> L8b
            androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult r8 = androidx.compose.p015ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult.m109420boximpl(r8)     // Catch: java.lang.Throwable -> L8b
            r7.put(r6, r8)     // Catch: java.lang.Throwable -> L8b
            goto Laa
        L9d:
            androidx.compose.ui.text.caches.LruCache<androidx.compose.ui.text.font.AsyncTypefaceCache$Key, androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult> r7 = r7.resultCache     // Catch: java.lang.Throwable -> L8b
            java.lang.Object r8 = androidx.compose.p015ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult.m109421constructorimpl(r10)     // Catch: java.lang.Throwable -> L8b
            androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult r8 = androidx.compose.p015ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult.m109420boximpl(r8)     // Catch: java.lang.Throwable -> L8b
            r7.put(r6, r8)     // Catch: java.lang.Throwable -> L8b
        Laa:
            kotlin.Unit r6 = kotlin.Unit.f99208a     // Catch: java.lang.Throwable -> L8b
            monitor-exit(r9)
            return r10
        Lae:
            monitor-exit(r9)
            throw r6
        Lb0:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.text.font.AsyncTypefaceCache.runCached(androidx.compose.ui.text.font.Font, androidx.compose.ui.text.font.PlatformFontLoader, boolean, kotlin.jvm.functions.Function1, kotlin.coroutines.d):java.lang.Object");
    }

    @Nullable
    public final Object runCachedBlocking(@NotNull Font font, @NotNull PlatformFontLoader platformFontLoader, @NotNull Functions<? extends Object> block) {
        Intrinsics.checkNotNullParameter(font, "font");
        Intrinsics.checkNotNullParameter(platformFontLoader, "platformFontLoader");
        Intrinsics.checkNotNullParameter(block, "block");
        synchronized (this.cacheLock) {
            try {
                Key key = new Key(font, platformFontLoader.getCacheKey());
                AsyncTypefaceResult asyncTypefaceResult = (AsyncTypefaceResult) this.resultCache.get(key);
                if (asyncTypefaceResult == null) {
                    asyncTypefaceResult = (AsyncTypefaceResult) this.permanentCache.get(key);
                }
                if (asyncTypefaceResult != null) {
                    Object m109427unboximpl = asyncTypefaceResult.m109427unboximpl();
                    InlineMarker.m17017b(2);
                    InlineMarker.m17018a(2);
                    return m109427unboximpl;
                }
                Unit unit = Unit.f99208a;
                InlineMarker.m17017b(1);
                InlineMarker.m17018a(1);
                Object invoke = block.invoke();
                put$default(this, font, platformFontLoader, invoke, false, 8, null);
                return invoke;
            } catch (Throwable th) {
                InlineMarker.m17017b(1);
                InlineMarker.m17018a(1);
                throw th;
            }
        }
    }

    /* compiled from: FontListFontFamilyTypefaceAdapter.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult */
    /* loaded from: classes.dex */
    public static final class AsyncTypefaceResult {
        @Nullable
        private final Object result;

        private /* synthetic */ AsyncTypefaceResult(Object obj) {
            this.result = obj;
        }

        /* renamed from: box-impl  reason: not valid java name */
        public static final /* synthetic */ AsyncTypefaceResult m109420boximpl(Object obj) {
            return new AsyncTypefaceResult(obj);
        }

        /* renamed from: equals-impl  reason: not valid java name */
        public static boolean m109422equalsimpl(Object obj, Object obj2) {
            if (!(obj2 instanceof AsyncTypefaceResult) || !Intrinsics.m17075f(obj, ((AsyncTypefaceResult) obj2).m109427unboximpl())) {
                return false;
            }
            return true;
        }

        /* renamed from: equals-impl0  reason: not valid java name */
        public static final boolean m109423equalsimpl0(Object obj, Object obj2) {
            return Intrinsics.m17075f(obj, obj2);
        }

        /* renamed from: hashCode-impl  reason: not valid java name */
        public static int m109424hashCodeimpl(Object obj) {
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        /* renamed from: isPermanentFailure-impl  reason: not valid java name */
        public static final boolean m109425isPermanentFailureimpl(Object obj) {
            if (obj == null) {
                return true;
            }
            return false;
        }

        /* renamed from: toString-impl  reason: not valid java name */
        public static String m109426toStringimpl(Object obj) {
            return "AsyncTypefaceResult(result=" + obj + ')';
        }

        public boolean equals(Object obj) {
            return m109422equalsimpl(this.result, obj);
        }

        @Nullable
        public final Object getResult() {
            return this.result;
        }

        public int hashCode() {
            return m109424hashCodeimpl(this.result);
        }

        public String toString() {
            return m109426toStringimpl(this.result);
        }

        /* renamed from: unbox-impl  reason: not valid java name */
        public final /* synthetic */ Object m109427unboximpl() {
            return this.result;
        }

        @NotNull
        /* renamed from: constructor-impl  reason: not valid java name */
        public static Object m109421constructorimpl(@Nullable Object obj) {
            return obj;
        }
    }
}
