package com.vungle.ads.internal.downloader;

import java.io.File;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.vungle.ads.internal.downloader.a */
/* loaded from: classes7.dex */
public interface AssetDownloadListener {

    /* compiled from: AssetDownloadListener.kt */
    @Metadata
    /* renamed from: com.vungle.ads.internal.downloader.a$a */
    /* loaded from: classes7.dex */
    public static final class C29179a {
        @NotNull
        public static final C29180a Companion = new C29180a(null);
        public static final int DEFAULT_SERVER_CODE = -1;
        @NotNull
        private final Throwable cause;
        @InterfaceC29181b
        private final int reason;
        private final int serverCode;

        /* compiled from: AssetDownloadListener.kt */
        @Metadata
        /* renamed from: com.vungle.ads.internal.downloader.a$a$a */
        /* loaded from: classes7.dex */
        public static final class C29180a {
            private C29180a() {
            }

            public /* synthetic */ C29180a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* compiled from: AssetDownloadListener.kt */
        @Metadata
        @Retention(RetentionPolicy.RUNTIME)
        /* renamed from: com.vungle.ads.internal.downloader.a$a$b */
        /* loaded from: classes7.dex */
        public @interface InterfaceC29181b {
            @NotNull
            public static final C29182a Companion = C29182a.$$INSTANCE;

            /* compiled from: AssetDownloadListener.kt */
            @Metadata
            /* renamed from: com.vungle.ads.internal.downloader.a$a$b$a */
            /* loaded from: classes7.dex */
            public static final class C29182a {
                private static int CONNECTION_ERROR;
                static final /* synthetic */ C29182a $$INSTANCE = new C29182a();
                private static int REQUEST_ERROR = 1;
                private static int DISK_ERROR = 2;
                private static int FILE_NOT_FOUND_ERROR = 3;
                private static int INTERNAL_ERROR = 4;

                private C29182a() {
                }

                public final int getCONNECTION_ERROR() {
                    return CONNECTION_ERROR;
                }

                public final int getDISK_ERROR() {
                    return DISK_ERROR;
                }

                public final int getFILE_NOT_FOUND_ERROR() {
                    return FILE_NOT_FOUND_ERROR;
                }

                public final int getINTERNAL_ERROR() {
                    return INTERNAL_ERROR;
                }

                public final int getREQUEST_ERROR() {
                    return REQUEST_ERROR;
                }

                public final void setCONNECTION_ERROR(int i) {
                    CONNECTION_ERROR = i;
                }

                public final void setDISK_ERROR(int i) {
                    DISK_ERROR = i;
                }

                public final void setFILE_NOT_FOUND_ERROR(int i) {
                    FILE_NOT_FOUND_ERROR = i;
                }

                public final void setINTERNAL_ERROR(int i) {
                    INTERNAL_ERROR = i;
                }

                public final void setREQUEST_ERROR(int i) {
                    REQUEST_ERROR = i;
                }
            }
        }

        public C29179a(int i, @NotNull Throwable cause, int i2) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            this.serverCode = i;
            this.cause = cause;
            this.reason = i2;
        }

        @NotNull
        public final Throwable getCause() {
            return this.cause;
        }

        public final int getReason() {
            return this.reason;
        }

        public final int getServerCode() {
            return this.serverCode;
        }
    }

    void onError(@Nullable C29179a c29179a, @NotNull DownloadRequest downloadRequest);

    void onSuccess(@NotNull File file, @NotNull DownloadRequest downloadRequest);

    /* compiled from: AssetDownloadListener.kt */
    @Metadata
    /* renamed from: com.vungle.ads.internal.downloader.a$b */
    /* loaded from: classes7.dex */
    public static final class C29183b {
        @NotNull
        public static final C29184a Companion = new C29184a(null);
        private int progressPercent;
        private long sizeBytes;
        private long startBytes;
        private int status;
        private long timestampDownloadStart;

        /* compiled from: AssetDownloadListener.kt */
        @Metadata
        /* renamed from: com.vungle.ads.internal.downloader.a$b$a */
        /* loaded from: classes7.dex */
        public static final class C29184a {
            private C29184a() {
            }

            public /* synthetic */ C29184a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final C29183b copy(@NotNull C29183b progress) {
                Intrinsics.checkNotNullParameter(progress, "progress");
                C29183b c29183b = new C29183b();
                c29183b.setStatus(progress.getStatus());
                c29183b.setProgressPercent(progress.getProgressPercent());
                c29183b.setTimestampDownloadStart(progress.getTimestampDownloadStart());
                c29183b.setSizeBytes(progress.getSizeBytes());
                c29183b.setStartBytes(progress.getStartBytes());
                return c29183b;
            }
        }

        /* compiled from: AssetDownloadListener.kt */
        @Metadata
        @Retention(RetentionPolicy.RUNTIME)
        /* renamed from: com.vungle.ads.internal.downloader.a$b$b */
        /* loaded from: classes7.dex */
        public @interface InterfaceC29185b {
            @NotNull
            public static final C29186a Companion = C29186a.$$INSTANCE;

            /* compiled from: AssetDownloadListener.kt */
            @Metadata
            /* renamed from: com.vungle.ads.internal.downloader.a$b$b$a */
            /* loaded from: classes7.dex */
            public static final class C29186a {
                private static int STARTED;
                static final /* synthetic */ C29186a $$INSTANCE = new C29186a();
                private static int IN_PROGRESS = 1;
                private static int PAUSED = 2;
                private static int CANCELLED = 3;
                private static int DONE = 4;
                private static int LOST_CONNECTION = 5;
                private static int STATE_CHANGED = 6;
                private static int ERROR = 7;

                private C29186a() {
                }

                public final int getCANCELLED() {
                    return CANCELLED;
                }

                public final int getDONE() {
                    return DONE;
                }

                public final int getERROR() {
                    return ERROR;
                }

                public final int getIN_PROGRESS() {
                    return IN_PROGRESS;
                }

                public final int getLOST_CONNECTION() {
                    return LOST_CONNECTION;
                }

                public final int getPAUSED() {
                    return PAUSED;
                }

                public final int getSTARTED() {
                    return STARTED;
                }

                public final int getSTATE_CHANGED() {
                    return STATE_CHANGED;
                }

                public final void setCANCELLED(int i) {
                    CANCELLED = i;
                }

                public final void setDONE(int i) {
                    DONE = i;
                }

                public final void setERROR(int i) {
                    ERROR = i;
                }

                public final void setIN_PROGRESS(int i) {
                    IN_PROGRESS = i;
                }

                public final void setLOST_CONNECTION(int i) {
                    LOST_CONNECTION = i;
                }

                public final void setPAUSED(int i) {
                    PAUSED = i;
                }

                public final void setSTARTED(int i) {
                    STARTED = i;
                }

                public final void setSTATE_CHANGED(int i) {
                    STATE_CHANGED = i;
                }
            }
        }

        public final int getProgressPercent() {
            return this.progressPercent;
        }

        public final long getSizeBytes() {
            return this.sizeBytes;
        }

        public final long getStartBytes() {
            return this.startBytes;
        }

        public final int getStatus() {
            return this.status;
        }

        public final long getTimestampDownloadStart() {
            return this.timestampDownloadStart;
        }

        public final void setProgressPercent(int i) {
            this.progressPercent = i;
        }

        public final void setSizeBytes(long j) {
            this.sizeBytes = j;
        }

        public final void setStartBytes(long j) {
            this.startBytes = j;
        }

        public final void setStatus(int i) {
            this.status = i;
        }

        public final void setTimestampDownloadStart(long j) {
            this.timestampDownloadStart = j;
        }

        @InterfaceC29185b
        public static /* synthetic */ void getStatus$annotations() {
        }
    }
}
