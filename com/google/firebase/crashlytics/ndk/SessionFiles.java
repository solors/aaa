package com.google.firebase.crashlytics.ndk;

import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.io.File;

/* loaded from: classes4.dex */
final class SessionFiles {
    public final File app;
    public final File binaryImages;
    public final File device;
    public final File metadata;
    public final NativeCore nativeCore;

    /* renamed from: os */
    public final File f42971os;
    public final File session;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class Builder {
        private File app;
        private File binaryImages;
        private File device;
        private File metadata;
        private NativeCore nativeCore;

        /* renamed from: os */
        private File f42972os;
        private File session;

        /* JADX INFO: Access modifiers changed from: package-private */
        public Builder appFile(File file) {
            this.app = file;
            return this;
        }

        Builder binaryImagesFile(File file) {
            this.binaryImages = file;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public SessionFiles build() {
            return new SessionFiles(this);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Builder deviceFile(File file) {
            this.device = file;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Builder metadataFile(File file) {
            this.metadata = file;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Builder nativeCore(NativeCore nativeCore) {
            this.nativeCore = nativeCore;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Builder osFile(File file) {
            this.f42972os = file;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Builder sessionFile(File file) {
            this.session = file;
            return this;
        }
    }

    /* loaded from: classes4.dex */
    static final class NativeCore {
        @Nullable
        public final CrashlyticsReport.ApplicationExitInfo applicationExitInfo;
        @Nullable
        public final File minidump;

        /* JADX INFO: Access modifiers changed from: package-private */
        public NativeCore(@Nullable File file, @Nullable CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
            this.minidump = file;
            this.applicationExitInfo = applicationExitInfo;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean hasCore() {
            File file = this.minidump;
            if ((file != null && file.exists()) || this.applicationExitInfo != null) {
                return true;
            }
            return false;
        }
    }

    private SessionFiles(Builder builder) {
        this.nativeCore = builder.nativeCore;
        this.binaryImages = builder.binaryImages;
        this.metadata = builder.metadata;
        this.session = builder.session;
        this.app = builder.app;
        this.device = builder.device;
        this.f42971os = builder.f42972os;
    }
}
