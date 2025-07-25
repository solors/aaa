package com.facebook.login;

import android.content.ComponentName;
import android.net.Uri;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import androidx.browser.customtabs.CustomTabsSession;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CustomTabPrefetchHelper.kt */
@Metadata
/* loaded from: classes4.dex */
public final class CustomTabPrefetchHelper extends CustomTabsServiceConnection {
    @Nullable
    private static CustomTabsClient client;
    @Nullable
    private static CustomTabsSession session;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final ReentrantLock lock = new ReentrantLock();

    /* compiled from: CustomTabPrefetchHelper.kt */
    @Metadata
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void prepareSession() {
            CustomTabsClient customTabsClient;
            CustomTabPrefetchHelper.lock.lock();
            if (CustomTabPrefetchHelper.session == null && (customTabsClient = CustomTabPrefetchHelper.client) != null) {
                CustomTabPrefetchHelper.session = customTabsClient.newSession(null);
            }
            CustomTabPrefetchHelper.lock.unlock();
        }

        @Nullable
        public final CustomTabsSession getPreparedSessionOnce() {
            CustomTabPrefetchHelper.lock.lock();
            CustomTabsSession customTabsSession = CustomTabPrefetchHelper.session;
            CustomTabPrefetchHelper.session = null;
            CustomTabPrefetchHelper.lock.unlock();
            return customTabsSession;
        }

        public final void mayLaunchUrl(@NotNull Uri url) {
            Intrinsics.checkNotNullParameter(url, "url");
            prepareSession();
            CustomTabPrefetchHelper.lock.lock();
            CustomTabsSession customTabsSession = CustomTabPrefetchHelper.session;
            if (customTabsSession != null) {
                customTabsSession.mayLaunchUrl(url, null, null);
            }
            CustomTabPrefetchHelper.lock.unlock();
        }
    }

    @Nullable
    public static final CustomTabsSession getPreparedSessionOnce() {
        return Companion.getPreparedSessionOnce();
    }

    public static final void mayLaunchUrl(@NotNull Uri uri) {
        Companion.mayLaunchUrl(uri);
    }

    @Override // androidx.browser.customtabs.CustomTabsServiceConnection
    public void onCustomTabsServiceConnected(@NotNull ComponentName name, @NotNull CustomTabsClient newClient) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(newClient, "newClient");
        newClient.warmup(0L);
        client = newClient;
        Companion.prepareSession();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(@NotNull ComponentName componentName) {
        Intrinsics.checkNotNullParameter(componentName, "componentName");
    }
}
