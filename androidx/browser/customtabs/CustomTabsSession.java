package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.ICustomTabsService;
import android.support.customtabs.IEngagementSignalsCallback;
import android.widget.RemoteViews;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.browser.customtabs.CustomTabsSession;
import androidx.browser.customtabs.CustomTabsSessionToken;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class CustomTabsSession {
    private static final String TAG = "CustomTabsSession";
    static final String TARGET_ORIGIN_KEY = "target_origin";
    private final ICustomTabsCallback mCallback;
    private final ComponentName mComponentName;
    @Nullable
    private final PendingIntent mId;
    private final Object mLock = new Object();
    private final ICustomTabsService mService;

    /* renamed from: androidx.browser.customtabs.CustomTabsSession$1 */
    /* loaded from: classes.dex */
    public class BinderC03231 extends IEngagementSignalsCallback.AbstractBinderC0050a {
        private final Handler mHandler = new Handler(Looper.getMainLooper());
        final /* synthetic */ EngagementSignalsCallback val$callback;

        BinderC03231(EngagementSignalsCallback engagementSignalsCallback) {
            CustomTabsSession.this = r1;
            this.val$callback = engagementSignalsCallback;
        }

        /* renamed from: c */
        public static /* synthetic */ void m105482c(EngagementSignalsCallback engagementSignalsCallback, int i, Bundle bundle) {
            engagementSignalsCallback.onGreatestScrollPercentageIncreased(i, bundle);
        }

        /* renamed from: d */
        public static /* synthetic */ void m105481d(EngagementSignalsCallback engagementSignalsCallback, boolean z, Bundle bundle) {
            engagementSignalsCallback.onSessionEnded(z, bundle);
        }

        /* renamed from: e */
        public static /* synthetic */ void m105480e(EngagementSignalsCallback engagementSignalsCallback, boolean z, Bundle bundle) {
            engagementSignalsCallback.onVerticalScrollEvent(z, bundle);
        }

        @Override // android.support.customtabs.IEngagementSignalsCallback
        public void onGreatestScrollPercentageIncreased(final int i, final Bundle bundle) {
            Handler handler = this.mHandler;
            final EngagementSignalsCallback engagementSignalsCallback = this.val$callback;
            handler.post(new Runnable() { // from class: androidx.browser.customtabs.d
                @Override // java.lang.Runnable
                public final void run() {
                    CustomTabsSession.BinderC03231.m105482c(EngagementSignalsCallback.this, i, bundle);
                }
            });
        }

        @Override // android.support.customtabs.IEngagementSignalsCallback
        public void onSessionEnded(final boolean z, final Bundle bundle) {
            Handler handler = this.mHandler;
            final EngagementSignalsCallback engagementSignalsCallback = this.val$callback;
            handler.post(new Runnable() { // from class: androidx.browser.customtabs.c
                @Override // java.lang.Runnable
                public final void run() {
                    CustomTabsSession.BinderC03231.m105481d(EngagementSignalsCallback.this, z, bundle);
                }
            });
        }

        @Override // android.support.customtabs.IEngagementSignalsCallback
        public void onVerticalScrollEvent(final boolean z, final Bundle bundle) {
            Handler handler = this.mHandler;
            final EngagementSignalsCallback engagementSignalsCallback = this.val$callback;
            handler.post(new Runnable() { // from class: androidx.browser.customtabs.b
                @Override // java.lang.Runnable
                public final void run() {
                    CustomTabsSession.BinderC03231.m105480e(EngagementSignalsCallback.this, z, bundle);
                }
            });
        }
    }

    /* renamed from: androidx.browser.customtabs.CustomTabsSession$2 */
    /* loaded from: classes.dex */
    public class BinderC03242 extends IEngagementSignalsCallback.AbstractBinderC0050a {
        private final Executor mExecutor;
        final /* synthetic */ EngagementSignalsCallback val$callback;
        final /* synthetic */ Executor val$executor;

        BinderC03242(Executor executor, EngagementSignalsCallback engagementSignalsCallback) {
            CustomTabsSession.this = r1;
            this.val$executor = executor;
            this.val$callback = engagementSignalsCallback;
            this.mExecutor = executor;
        }

        /* renamed from: c */
        public static /* synthetic */ void m105479c(EngagementSignalsCallback engagementSignalsCallback, int i, Bundle bundle) {
            engagementSignalsCallback.onGreatestScrollPercentageIncreased(i, bundle);
        }

        /* renamed from: d */
        public static /* synthetic */ void m105478d(EngagementSignalsCallback engagementSignalsCallback, boolean z, Bundle bundle) {
            engagementSignalsCallback.onSessionEnded(z, bundle);
        }

        /* renamed from: e */
        public static /* synthetic */ void m105477e(EngagementSignalsCallback engagementSignalsCallback, boolean z, Bundle bundle) {
            engagementSignalsCallback.onVerticalScrollEvent(z, bundle);
        }

        @Override // android.support.customtabs.IEngagementSignalsCallback
        public void onGreatestScrollPercentageIncreased(final int i, final Bundle bundle) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                Executor executor = this.mExecutor;
                final EngagementSignalsCallback engagementSignalsCallback = this.val$callback;
                executor.execute(new Runnable() { // from class: androidx.browser.customtabs.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        CustomTabsSession.BinderC03242.m105479c(EngagementSignalsCallback.this, i, bundle);
                    }
                });
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }

        @Override // android.support.customtabs.IEngagementSignalsCallback
        public void onSessionEnded(final boolean z, final Bundle bundle) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                Executor executor = this.mExecutor;
                final EngagementSignalsCallback engagementSignalsCallback = this.val$callback;
                executor.execute(new Runnable() { // from class: androidx.browser.customtabs.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        CustomTabsSession.BinderC03242.m105478d(EngagementSignalsCallback.this, z, bundle);
                    }
                });
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }

        @Override // android.support.customtabs.IEngagementSignalsCallback
        public void onVerticalScrollEvent(final boolean z, final Bundle bundle) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                Executor executor = this.mExecutor;
                final EngagementSignalsCallback engagementSignalsCallback = this.val$callback;
                executor.execute(new Runnable() { // from class: androidx.browser.customtabs.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        CustomTabsSession.BinderC03242.m105477e(EngagementSignalsCallback.this, z, bundle);
                    }
                });
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }

    /* loaded from: classes.dex */
    static class MockSession extends ICustomTabsService.AbstractBinderC0047a {
        MockSession() {
        }

        @Override // android.support.customtabs.ICustomTabsService
        public Bundle extraCommand(String str, Bundle bundle) throws RemoteException {
            return null;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean isEngagementSignalsApiAvailable(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean mayLaunchUrl(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle, List<Bundle> list) throws RemoteException {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean newSession(ICustomTabsCallback iCustomTabsCallback) throws RemoteException {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean newSessionWithExtras(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public int postMessage(ICustomTabsCallback iCustomTabsCallback, String str, Bundle bundle) throws RemoteException {
            return 0;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean receiveFile(ICustomTabsCallback iCustomTabsCallback, Uri uri, int i, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean requestPostMessageChannel(ICustomTabsCallback iCustomTabsCallback, Uri uri) throws RemoteException {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean requestPostMessageChannelWithExtras(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean setEngagementSignalsCallback(ICustomTabsCallback iCustomTabsCallback, IBinder iBinder, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean updateVisuals(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean validateRelationship(ICustomTabsCallback iCustomTabsCallback, int i, Uri uri, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean warmup(long j) throws RemoteException {
            return false;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: classes.dex */
    public static class PendingSession {
        @Nullable
        private final CustomTabsCallback mCallback;
        @Nullable
        private final PendingIntent mId;

        public PendingSession(@Nullable CustomTabsCallback customTabsCallback, @Nullable PendingIntent pendingIntent) {
            this.mCallback = customTabsCallback;
            this.mId = pendingIntent;
        }

        @Nullable
        public CustomTabsCallback getCallback() {
            return this.mCallback;
        }

        @Nullable
        public PendingIntent getId() {
            return this.mId;
        }
    }

    public CustomTabsSession(ICustomTabsService iCustomTabsService, ICustomTabsCallback iCustomTabsCallback, ComponentName componentName, @Nullable PendingIntent pendingIntent) {
        this.mService = iCustomTabsService;
        this.mCallback = iCustomTabsCallback;
        this.mComponentName = componentName;
        this.mId = pendingIntent;
    }

    private void addIdToBundle(Bundle bundle) {
        PendingIntent pendingIntent = this.mId;
        if (pendingIntent != null) {
            bundle.putParcelable(CustomTabsIntent.EXTRA_SESSION_ID, pendingIntent);
        }
    }

    private Bundle createBundleWithId(@Nullable Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        addIdToBundle(bundle2);
        return bundle2;
    }

    private IEngagementSignalsCallback.AbstractBinderC0050a createEngagementSignalsCallbackWrapper(@NonNull EngagementSignalsCallback engagementSignalsCallback) {
        return new BinderC03231(engagementSignalsCallback);
    }

    @NonNull
    @VisibleForTesting
    public static CustomTabsSession createMockSessionForTesting(@NonNull ComponentName componentName) {
        return new CustomTabsSession(new MockSession(), new CustomTabsSessionToken.MockCallback(), componentName, null);
    }

    @Nullable
    private Bundle createPostMessageExtraBundle(@Nullable Uri uri) {
        Bundle bundle = new Bundle();
        if (uri != null) {
            bundle.putParcelable(TARGET_ORIGIN_KEY, uri);
        }
        if (this.mId != null) {
            addIdToBundle(bundle);
        }
        if (bundle.isEmpty()) {
            return null;
        }
        return bundle;
    }

    public IBinder getBinder() {
        return this.mCallback.asBinder();
    }

    public ComponentName getComponentName() {
        return this.mComponentName;
    }

    @Nullable
    public PendingIntent getId() {
        return this.mId;
    }

    public boolean isEngagementSignalsApiAvailable(@NonNull Bundle bundle) throws RemoteException {
        try {
            return this.mService.isEngagementSignalsApiAvailable(this.mCallback, createBundleWithId(bundle));
        } catch (SecurityException e) {
            throw new UnsupportedOperationException("This method isn't supported by the Custom Tabs implementation.", e);
        }
    }

    public boolean mayLaunchUrl(@Nullable Uri uri, @Nullable Bundle bundle, @Nullable List<Bundle> list) {
        try {
            return this.mService.mayLaunchUrl(this.mCallback, uri, createBundleWithId(bundle), list);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public int postMessage(@NonNull String str, @Nullable Bundle bundle) {
        int postMessage;
        Bundle createBundleWithId = createBundleWithId(bundle);
        synchronized (this.mLock) {
            try {
                try {
                    postMessage = this.mService.postMessage(this.mCallback, str, createBundleWithId);
                } catch (RemoteException unused) {
                    return -2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return postMessage;
    }

    public boolean receiveFile(@NonNull Uri uri, int i, @Nullable Bundle bundle) {
        try {
            return this.mService.receiveFile(this.mCallback, uri, i, createBundleWithId(bundle));
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean requestPostMessageChannel(@NonNull Uri uri) {
        return requestPostMessageChannel(uri, null, new Bundle());
    }

    public boolean setActionButton(@NonNull Bitmap bitmap, @NonNull String str) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(CustomTabsIntent.KEY_ICON, bitmap);
        bundle.putString(CustomTabsIntent.KEY_DESCRIPTION, str);
        Bundle bundle2 = new Bundle();
        bundle2.putBundle(CustomTabsIntent.EXTRA_ACTION_BUTTON_BUNDLE, bundle);
        addIdToBundle(bundle);
        try {
            return this.mService.updateVisuals(this.mCallback, bundle2);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean setEngagementSignalsCallback(@NonNull EngagementSignalsCallback engagementSignalsCallback, @NonNull Bundle bundle) throws RemoteException {
        try {
            return this.mService.setEngagementSignalsCallback(this.mCallback, createEngagementSignalsCallbackWrapper(engagementSignalsCallback).asBinder(), createBundleWithId(bundle));
        } catch (SecurityException e) {
            throw new UnsupportedOperationException("This method isn't supported by the Custom Tabs implementation.", e);
        }
    }

    public boolean setSecondaryToolbarSwipeUpGesture(@Nullable PendingIntent pendingIntent) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(CustomTabsIntent.EXTRA_SECONDARY_TOOLBAR_SWIPE_UP_GESTURE, pendingIntent);
        addIdToBundle(bundle);
        try {
            return this.mService.updateVisuals(this.mCallback, bundle);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean setSecondaryToolbarViews(@Nullable RemoteViews remoteViews, @Nullable int[] iArr, @Nullable PendingIntent pendingIntent) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(CustomTabsIntent.EXTRA_REMOTEVIEWS, remoteViews);
        bundle.putIntArray(CustomTabsIntent.EXTRA_REMOTEVIEWS_VIEW_IDS, iArr);
        bundle.putParcelable(CustomTabsIntent.EXTRA_REMOTEVIEWS_PENDINGINTENT, pendingIntent);
        addIdToBundle(bundle);
        try {
            return this.mService.updateVisuals(this.mCallback, bundle);
        } catch (RemoteException unused) {
            return false;
        }
    }

    @Deprecated
    public boolean setToolbarItem(int i, @NonNull Bitmap bitmap, @NonNull String str) {
        Bundle bundle = new Bundle();
        bundle.putInt(CustomTabsIntent.KEY_ID, i);
        bundle.putParcelable(CustomTabsIntent.KEY_ICON, bitmap);
        bundle.putString(CustomTabsIntent.KEY_DESCRIPTION, str);
        Bundle bundle2 = new Bundle();
        bundle2.putBundle(CustomTabsIntent.EXTRA_ACTION_BUTTON_BUNDLE, bundle);
        addIdToBundle(bundle2);
        try {
            return this.mService.updateVisuals(this.mCallback, bundle2);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean validateRelationship(int i, @NonNull Uri uri, @Nullable Bundle bundle) {
        if (i >= 1 && i <= 2) {
            try {
                return this.mService.validateRelationship(this.mCallback, i, uri, createBundleWithId(bundle));
            } catch (RemoteException unused) {
            }
        }
        return false;
    }

    private IEngagementSignalsCallback.AbstractBinderC0050a createEngagementSignalsCallbackWrapper(@NonNull EngagementSignalsCallback engagementSignalsCallback, @NonNull Executor executor) {
        return new BinderC03242(executor, engagementSignalsCallback);
    }

    public boolean requestPostMessageChannel(@NonNull Uri uri, @Nullable Uri uri2, @NonNull Bundle bundle) {
        try {
            Bundle createPostMessageExtraBundle = createPostMessageExtraBundle(uri2);
            if (createPostMessageExtraBundle != null) {
                bundle.putAll(createPostMessageExtraBundle);
                return this.mService.requestPostMessageChannelWithExtras(this.mCallback, uri, bundle);
            }
            return this.mService.requestPostMessageChannel(this.mCallback, uri);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean setEngagementSignalsCallback(@NonNull Executor executor, @NonNull EngagementSignalsCallback engagementSignalsCallback, @NonNull Bundle bundle) throws RemoteException {
        try {
            return this.mService.setEngagementSignalsCallback(this.mCallback, createEngagementSignalsCallbackWrapper(engagementSignalsCallback, executor).asBinder(), createBundleWithId(bundle));
        } catch (SecurityException e) {
            throw new UnsupportedOperationException("This method isn't supported by the Custom Tabs implementation.", e);
        }
    }
}
