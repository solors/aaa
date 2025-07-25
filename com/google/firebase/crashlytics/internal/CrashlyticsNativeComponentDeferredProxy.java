package com.google.firebase.crashlytics.internal;

import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.StaticSessionData;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class CrashlyticsNativeComponentDeferredProxy implements CrashlyticsNativeComponent {

    /* renamed from: c */
    private static final NativeSessionFileProvider f42259c = new MissingNativeSessionFileProvider();

    /* renamed from: a */
    private final Deferred<CrashlyticsNativeComponent> f42260a;

    /* renamed from: b */
    private final AtomicReference<CrashlyticsNativeComponent> f42261b = new AtomicReference<>(null);

    /* loaded from: classes4.dex */
    private static final class MissingNativeSessionFileProvider implements NativeSessionFileProvider {
        private MissingNativeSessionFileProvider() {
        }

        @Override // com.google.firebase.crashlytics.internal.NativeSessionFileProvider
        public File getAppFile() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.NativeSessionFileProvider
        public CrashlyticsReport.ApplicationExitInfo getApplicationExitInto() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.NativeSessionFileProvider
        public File getBinaryImagesFile() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.NativeSessionFileProvider
        public File getDeviceFile() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.NativeSessionFileProvider
        public File getMetadataFile() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.NativeSessionFileProvider
        public File getMinidumpFile() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.NativeSessionFileProvider
        public File getOsFile() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.NativeSessionFileProvider
        public File getSessionFile() {
            return null;
        }
    }

    public CrashlyticsNativeComponentDeferredProxy(Deferred<CrashlyticsNativeComponent> deferred) {
        this.f42260a = deferred;
        deferred.whenAvailable(new Deferred.DeferredHandler() { // from class: com.google.firebase.crashlytics.internal.a
            {
                CrashlyticsNativeComponentDeferredProxy.this = this;
            }

            @Override // com.google.firebase.inject.Deferred.DeferredHandler
            public final void handle(Provider provider) {
                CrashlyticsNativeComponentDeferredProxy.this.m67225c(provider);
            }
        });
    }

    /* renamed from: c */
    public /* synthetic */ void m67225c(Provider provider) {
        Logger.getLogger().m67216d("Crashlytics native component now available.");
        this.f42261b.set((CrashlyticsNativeComponent) provider.get());
    }

    /* renamed from: d */
    public static /* synthetic */ void m67224d(String str, String str2, long j, StaticSessionData staticSessionData, Provider provider) {
        ((CrashlyticsNativeComponent) provider.get()).prepareNativeSession(str, str2, j, staticSessionData);
    }

    @Override // com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent
    @NonNull
    public NativeSessionFileProvider getSessionFileProvider(@NonNull String str) {
        CrashlyticsNativeComponent crashlyticsNativeComponent = this.f42261b.get();
        if (crashlyticsNativeComponent == null) {
            return f42259c;
        }
        return crashlyticsNativeComponent.getSessionFileProvider(str);
    }

    @Override // com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent
    public boolean hasCrashDataForCurrentSession() {
        CrashlyticsNativeComponent crashlyticsNativeComponent = this.f42261b.get();
        if (crashlyticsNativeComponent != null && crashlyticsNativeComponent.hasCrashDataForCurrentSession()) {
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent
    public boolean hasCrashDataForSession(@NonNull String str) {
        CrashlyticsNativeComponent crashlyticsNativeComponent = this.f42261b.get();
        if (crashlyticsNativeComponent != null && crashlyticsNativeComponent.hasCrashDataForSession(str)) {
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent
    public void prepareNativeSession(@NonNull final String str, @NonNull final String str2, final long j, @NonNull final StaticSessionData staticSessionData) {
        Logger logger = Logger.getLogger();
        logger.m67210v("Deferring native open session: " + str);
        this.f42260a.whenAvailable(new Deferred.DeferredHandler() { // from class: com.google.firebase.crashlytics.internal.b
            @Override // com.google.firebase.inject.Deferred.DeferredHandler
            public final void handle(Provider provider) {
                CrashlyticsNativeComponentDeferredProxy.m67224d(str, str2, j, staticSessionData, provider);
            }
        });
    }
}
