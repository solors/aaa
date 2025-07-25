package io.appmetrica.analytics.coreutils.internal.cache;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

/* loaded from: classes9.dex */
public interface CachedDataProvider {

    /* loaded from: classes9.dex */
    public static class CachedData<T> {

        /* renamed from: a */
        private final String f92407a;

        /* renamed from: b */
        private volatile long f92408b;

        /* renamed from: c */
        private volatile long f92409c;

        /* renamed from: d */
        private long f92410d = 0;

        /* renamed from: e */
        private Object f92411e = null;

        public CachedData(long j, long j2, @NonNull String str) {
            this.f92407a = String.format("[CachedData-%s]", str);
            this.f92408b = j;
            this.f92409c = j2;
        }

        @Nullable
        public T getData() {
            return (T) this.f92411e;
        }

        @VisibleForTesting
        public long getExpiryTime() {
            return this.f92409c;
        }

        @VisibleForTesting
        public long getRefreshTime() {
            return this.f92408b;
        }

        public final boolean isEmpty() {
            if (this.f92411e == null) {
                return true;
            }
            return false;
        }

        public void setData(@Nullable T t) {
            this.f92411e = t;
            this.f92410d = System.currentTimeMillis();
        }

        public void setExpirationPolicy(long j, long j2) {
            this.f92408b = j;
            this.f92409c = j2;
        }

        public final boolean shouldClearData() {
            if (this.f92410d == 0) {
                return false;
            }
            long currentTimeMillis = System.currentTimeMillis() - this.f92410d;
            if (currentTimeMillis <= this.f92409c && currentTimeMillis >= 0) {
                return false;
            }
            return true;
        }

        public final boolean shouldUpdateData() {
            long currentTimeMillis = System.currentTimeMillis() - this.f92410d;
            if (currentTimeMillis <= this.f92408b && currentTimeMillis >= 0) {
                return false;
            }
            return true;
        }

        @NonNull
        public String toString() {
            return "CachedData{tag='" + this.f92407a + "', refreshTime=" + this.f92408b + ", expiryTime=" + this.f92409c + ", mCachedTime=" + this.f92410d + ", mCachedData=" + this.f92411e + '}';
        }
    }
}
