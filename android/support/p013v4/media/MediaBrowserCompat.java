package android.support.p013v4.media;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.media.MediaDescription;
import android.media.browse.MediaBrowser;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.RemoteException;
import android.support.p013v4.media.session.IMediaSession;
import android.support.p013v4.media.session.MediaSessionCompat;
import android.support.p013v4.p014os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.collection.ArrayMap;
import androidx.core.app.BundleCompat;
import androidx.media.MediaBrowserCompatUtils;
import androidx.media.MediaBrowserProtocol;
import androidx.media.MediaBrowserServiceCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: android.support.v4.media.MediaBrowserCompat */
/* loaded from: classes.dex */
public final class MediaBrowserCompat {

    /* renamed from: b */
    static final boolean f185b = Log.isLoggable("MediaBrowserCompat", 3);

    /* renamed from: a */
    private final InterfaceC0071d f186a;

    /* renamed from: android.support.v4.media.MediaBrowserCompat$ItemReceiver */
    /* loaded from: classes.dex */
    private static class ItemReceiver extends ResultReceiver {
        @Override // android.support.p013v4.p014os.ResultReceiver
        /* renamed from: a */
        protected void mo105535a(int i, Bundle bundle) {
            if (bundle != null) {
                bundle = MediaSessionCompat.m105602c(bundle);
            }
            if (i == 0 && bundle != null && bundle.containsKey(MediaBrowserServiceCompat.KEY_MEDIA_ITEM)) {
                Parcelable parcelable = bundle.getParcelable(MediaBrowserServiceCompat.KEY_MEDIA_ITEM);
                if (parcelable != null && !(parcelable instanceof MediaItem)) {
                    throw null;
                }
                MediaItem mediaItem = (MediaItem) parcelable;
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$SearchResultReceiver */
    /* loaded from: classes.dex */
    private static class SearchResultReceiver extends ResultReceiver {
        @Override // android.support.p013v4.p014os.ResultReceiver
        /* renamed from: a */
        protected void mo105535a(int i, Bundle bundle) {
            if (bundle != null) {
                bundle = MediaSessionCompat.m105602c(bundle);
            }
            if (i == 0 && bundle != null && bundle.containsKey(MediaBrowserServiceCompat.KEY_SEARCH_RESULTS)) {
                Parcelable[] parcelableArray = bundle.getParcelableArray(MediaBrowserServiceCompat.KEY_SEARCH_RESULTS);
                parcelableArray.getClass();
                ArrayList arrayList = new ArrayList(parcelableArray.length);
                for (Parcelable parcelable : parcelableArray) {
                    arrayList.add((MediaItem) parcelable);
                }
                throw null;
            }
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(21)
    /* renamed from: android.support.v4.media.MediaBrowserCompat$a */
    /* loaded from: classes.dex */
    public static class C0066a {
        @DoNotInline
        /* renamed from: a */
        static MediaDescription m105675a(MediaBrowser.MediaItem mediaItem) {
            return mediaItem.getDescription();
        }

        @DoNotInline
        /* renamed from: b */
        static int m105674b(MediaBrowser.MediaItem mediaItem) {
            return mediaItem.getFlags();
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$b */
    /* loaded from: classes.dex */
    private static class HandlerC0067b extends Handler {

        /* renamed from: a */
        private final WeakReference<InterfaceC0075h> f189a;

        /* renamed from: b */
        private WeakReference<Messenger> f190b;

        HandlerC0067b(InterfaceC0075h interfaceC0075h) {
            this.f189a = new WeakReference<>(interfaceC0075h);
        }

        /* renamed from: a */
        void m105673a(Messenger messenger) {
            this.f190b = new WeakReference<>(messenger);
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            WeakReference<Messenger> weakReference = this.f190b;
            if (weakReference != null && weakReference.get() != null && this.f189a.get() != null) {
                Bundle data = message.getData();
                MediaSessionCompat.m105604a(data);
                InterfaceC0075h interfaceC0075h = this.f189a.get();
                Messenger messenger = this.f190b.get();
                try {
                    int i = message.what;
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                Log.w("MediaBrowserCompat", "Unhandled message: " + message + "\n  Client version: 1\n  Service version: " + message.arg1);
                            } else {
                                Bundle bundle = data.getBundle(MediaBrowserProtocol.DATA_OPTIONS);
                                MediaSessionCompat.m105604a(bundle);
                                Bundle bundle2 = data.getBundle(MediaBrowserProtocol.DATA_NOTIFY_CHILDREN_CHANGED_OPTIONS);
                                MediaSessionCompat.m105604a(bundle2);
                                interfaceC0075h.mo105668d(messenger, data.getString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID), data.getParcelableArrayList(MediaBrowserProtocol.DATA_MEDIA_ITEM_LIST), bundle, bundle2);
                            }
                        } else {
                            interfaceC0075h.mo105669c(messenger);
                        }
                    } else {
                        Bundle bundle3 = data.getBundle(MediaBrowserProtocol.DATA_ROOT_HINTS);
                        MediaSessionCompat.m105604a(bundle3);
                        interfaceC0075h.mo105667f(messenger, data.getString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID), (MediaSessionCompat.Token) data.getParcelable(MediaBrowserProtocol.DATA_MEDIA_SESSION_TOKEN), bundle3);
                    }
                } catch (BadParcelableException unused) {
                    Log.e("MediaBrowserCompat", "Could not unparcel the data.");
                    if (message.what == 1) {
                        interfaceC0075h.mo105669c(messenger);
                    }
                }
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$d */
    /* loaded from: classes.dex */
    interface InterfaceC0071d {
        /* renamed from: a */
        void mo105672a();

        void disconnect();

        @NonNull
        MediaSessionCompat.Token getSessionToken();
    }

    @RequiresApi(23)
    /* renamed from: android.support.v4.media.MediaBrowserCompat$f */
    /* loaded from: classes.dex */
    static class C0073f extends C0072e {
        C0073f(Context context, ComponentName componentName, C0068c c0068c, Bundle bundle) {
            super(context, componentName, c0068c, bundle);
        }
    }

    @RequiresApi(26)
    /* renamed from: android.support.v4.media.MediaBrowserCompat$g */
    /* loaded from: classes.dex */
    static class C0074g extends C0073f {
        C0074g(Context context, ComponentName componentName, C0068c c0068c, Bundle bundle) {
            super(context, componentName, c0068c, bundle);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$h */
    /* loaded from: classes.dex */
    interface InterfaceC0075h {
        /* renamed from: c */
        void mo105669c(Messenger messenger);

        /* renamed from: d */
        void mo105668d(Messenger messenger, String str, List<MediaItem> list, Bundle bundle, Bundle bundle2);

        /* renamed from: f */
        void mo105667f(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle);
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$i */
    /* loaded from: classes.dex */
    private static class C0076i {

        /* renamed from: a */
        private Messenger f202a;

        /* renamed from: b */
        private Bundle f203b;

        public C0076i(IBinder iBinder, Bundle bundle) {
            this.f202a = new Messenger(iBinder);
            this.f203b = bundle;
        }

        /* renamed from: b */
        private void m105665b(int i, Bundle bundle, Messenger messenger) throws RemoteException {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = 1;
            obtain.setData(bundle);
            obtain.replyTo = messenger;
            this.f202a.send(obtain);
        }

        /* renamed from: a */
        void m105666a(Context context, Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString(MediaBrowserProtocol.DATA_PACKAGE_NAME, context.getPackageName());
            bundle.putInt(MediaBrowserProtocol.DATA_CALLING_PID, Process.myPid());
            bundle.putBundle(MediaBrowserProtocol.DATA_ROOT_HINTS, this.f203b);
            m105665b(6, bundle, messenger);
        }

        /* renamed from: c */
        void m105664c(Messenger messenger) throws RemoteException {
            m105665b(7, null, messenger);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$j */
    /* loaded from: classes.dex */
    private static class C0077j {

        /* renamed from: a */
        private final List<AbstractC0078k> f204a = new ArrayList();

        /* renamed from: b */
        private final List<Bundle> f205b = new ArrayList();

        /* renamed from: a */
        public AbstractC0078k m105663a(Bundle bundle) {
            for (int i = 0; i < this.f205b.size(); i++) {
                if (MediaBrowserCompatUtils.areSameOptions(this.f205b.get(i), bundle)) {
                    return this.f204a.get(i);
                }
            }
            return null;
        }

        /* renamed from: b */
        public List<AbstractC0078k> m105662b() {
            return this.f204a;
        }

        /* renamed from: c */
        public List<Bundle> m105661c() {
            return this.f205b;
        }
    }

    public MediaBrowserCompat(Context context, ComponentName componentName, C0068c c0068c, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f186a = new C0074g(context, componentName, c0068c, bundle);
        } else {
            this.f186a = new C0073f(context, componentName, c0068c, bundle);
        }
    }

    /* renamed from: a */
    public void m105682a() {
        Log.d("MediaBrowserCompat", "Connecting to a MediaBrowserService.");
        this.f186a.mo105672a();
    }

    /* renamed from: b */
    public void m105681b() {
        this.f186a.disconnect();
    }

    @NonNull
    /* renamed from: c */
    public MediaSessionCompat.Token m105680c() {
        return this.f186a.getSessionToken();
    }

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem */
    /* loaded from: classes.dex */
    public static class MediaItem implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = new C0065a();

        /* renamed from: b */
        private final int f187b;

        /* renamed from: c */
        private final MediaDescriptionCompat f188c;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem$a */
        /* loaded from: classes.dex */
        class C0065a implements Parcelable.Creator<MediaItem> {
            C0065a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public MediaItem createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public MediaItem[] newArray(int i) {
                return new MediaItem[i];
            }
        }

        public MediaItem(@NonNull MediaDescriptionCompat mediaDescriptionCompat, int i) {
            if (mediaDescriptionCompat != null) {
                if (!TextUtils.isEmpty(mediaDescriptionCompat.m105653d())) {
                    this.f187b = i;
                    this.f188c = mediaDescriptionCompat;
                    return;
                }
                throw new IllegalArgumentException("description must have a non-empty media id");
            }
            throw new IllegalArgumentException("description cannot be null");
        }

        /* renamed from: a */
        public static MediaItem m105679a(Object obj) {
            if (obj != null) {
                MediaBrowser.MediaItem mediaItem = (MediaBrowser.MediaItem) obj;
                return new MediaItem(MediaDescriptionCompat.m105655a(C0066a.m105675a(mediaItem)), C0066a.m105674b(mediaItem));
            }
            return null;
        }

        /* renamed from: c */
        public static List<MediaItem> m105678c(List<?> list) {
            if (list != null) {
                ArrayList arrayList = new ArrayList(list.size());
                Iterator<?> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(m105679a(it.next()));
                }
                return arrayList;
            }
            return null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @NonNull
        public String toString() {
            return "MediaItem{mFlags=" + this.f187b + ", mDescription=" + this.f188c + '}';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f187b);
            this.f188c.writeToParcel(parcel, i);
        }

        MediaItem(Parcel parcel) {
            this.f187b = parcel.readInt();
            this.f188c = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$c */
    /* loaded from: classes.dex */
    public static class C0068c {
        final MediaBrowser.ConnectionCallback mConnectionCallbackFwk = new C0069a();
        InterfaceC0070b mConnectionCallbackInternal;

        @RequiresApi(21)
        /* renamed from: android.support.v4.media.MediaBrowserCompat$c$a */
        /* loaded from: classes.dex */
        private class C0069a extends MediaBrowser.ConnectionCallback {
            C0069a() {
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public void onConnected() {
                InterfaceC0070b interfaceC0070b = C0068c.this.mConnectionCallbackInternal;
                if (interfaceC0070b != null) {
                    interfaceC0070b.onConnected();
                }
                C0068c.this.onConnected();
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public void onConnectionFailed() {
                InterfaceC0070b interfaceC0070b = C0068c.this.mConnectionCallbackInternal;
                if (interfaceC0070b != null) {
                    interfaceC0070b.mo105670e();
                }
                C0068c.this.onConnectionFailed();
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public void onConnectionSuspended() {
                InterfaceC0070b interfaceC0070b = C0068c.this.mConnectionCallbackInternal;
                if (interfaceC0070b != null) {
                    interfaceC0070b.mo105671b();
                }
                C0068c.this.onConnectionSuspended();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: android.support.v4.media.MediaBrowserCompat$c$b */
        /* loaded from: classes.dex */
        public interface InterfaceC0070b {
            /* renamed from: b */
            void mo105671b();

            /* renamed from: e */
            void mo105670e();

            void onConnected();
        }

        void setInternalConnectionCallback(InterfaceC0070b interfaceC0070b) {
            this.mConnectionCallbackInternal = interfaceC0070b;
        }

        public void onConnected() {
        }

        public void onConnectionFailed() {
        }

        public void onConnectionSuspended() {
        }
    }

    @RequiresApi(21)
    /* renamed from: android.support.v4.media.MediaBrowserCompat$e */
    /* loaded from: classes.dex */
    static class C0072e implements InterfaceC0071d, InterfaceC0075h, C0068c.InterfaceC0070b {

        /* renamed from: a */
        final Context f192a;

        /* renamed from: b */
        protected final MediaBrowser f193b;

        /* renamed from: c */
        protected final Bundle f194c;

        /* renamed from: d */
        protected final HandlerC0067b f195d = new HandlerC0067b(this);

        /* renamed from: e */
        private final ArrayMap<String, C0077j> f196e = new ArrayMap<>();

        /* renamed from: f */
        protected int f197f;

        /* renamed from: g */
        protected C0076i f198g;

        /* renamed from: h */
        protected Messenger f199h;

        /* renamed from: i */
        private MediaSessionCompat.Token f200i;

        /* renamed from: j */
        private Bundle f201j;

        C0072e(Context context, ComponentName componentName, C0068c c0068c, Bundle bundle) {
            Bundle bundle2;
            this.f192a = context;
            if (bundle != null) {
                bundle2 = new Bundle(bundle);
            } else {
                bundle2 = new Bundle();
            }
            this.f194c = bundle2;
            bundle2.putInt(MediaBrowserProtocol.EXTRA_CLIENT_VERSION, 1);
            bundle2.putInt(MediaBrowserProtocol.EXTRA_CALLING_PID, Process.myPid());
            c0068c.setInternalConnectionCallback(this);
            this.f193b = new MediaBrowser(context, componentName, c0068c.mConnectionCallbackFwk, bundle2);
        }

        @Override // android.support.p013v4.media.MediaBrowserCompat.InterfaceC0071d
        /* renamed from: a */
        public void mo105672a() {
            this.f193b.connect();
        }

        @Override // android.support.p013v4.media.MediaBrowserCompat.C0068c.InterfaceC0070b
        /* renamed from: b */
        public void mo105671b() {
            this.f198g = null;
            this.f199h = null;
            this.f200i = null;
            this.f195d.m105673a(null);
        }

        @Override // android.support.p013v4.media.MediaBrowserCompat.InterfaceC0075h
        /* renamed from: d */
        public void mo105668d(Messenger messenger, String str, List<MediaItem> list, Bundle bundle, Bundle bundle2) {
            if (this.f199h != messenger) {
                return;
            }
            C0077j c0077j = this.f196e.get(str);
            if (c0077j == null) {
                if (MediaBrowserCompat.f185b) {
                    Log.d("MediaBrowserCompat", "onLoadChildren for id that isn't subscribed id=" + str);
                    return;
                }
                return;
            }
            AbstractC0078k m105663a = c0077j.m105663a(bundle);
            if (m105663a != null) {
                if (bundle == null) {
                    if (list == null) {
                        m105663a.m105658c(str);
                        return;
                    }
                    this.f201j = bundle2;
                    m105663a.m105660a(str, list);
                    this.f201j = null;
                } else if (list == null) {
                    m105663a.m105657d(str, bundle);
                } else {
                    this.f201j = bundle2;
                    m105663a.m105659b(str, list, bundle);
                    this.f201j = null;
                }
            }
        }

        @Override // android.support.p013v4.media.MediaBrowserCompat.InterfaceC0071d
        public void disconnect() {
            Messenger messenger;
            C0076i c0076i = this.f198g;
            if (c0076i != null && (messenger = this.f199h) != null) {
                try {
                    c0076i.m105664c(messenger);
                } catch (RemoteException unused) {
                    Log.i("MediaBrowserCompat", "Remote error unregistering client messenger.");
                }
            }
            this.f193b.disconnect();
        }

        @Override // android.support.p013v4.media.MediaBrowserCompat.InterfaceC0071d
        @NonNull
        public MediaSessionCompat.Token getSessionToken() {
            if (this.f200i == null) {
                this.f200i = MediaSessionCompat.Token.m105592a(this.f193b.getSessionToken());
            }
            return this.f200i;
        }

        @Override // android.support.p013v4.media.MediaBrowserCompat.C0068c.InterfaceC0070b
        public void onConnected() {
            try {
                Bundle extras = this.f193b.getExtras();
                if (extras == null) {
                    return;
                }
                this.f197f = extras.getInt(MediaBrowserProtocol.EXTRA_SERVICE_VERSION, 0);
                IBinder binder = BundleCompat.getBinder(extras, MediaBrowserProtocol.EXTRA_MESSENGER_BINDER);
                if (binder != null) {
                    this.f198g = new C0076i(binder, this.f194c);
                    Messenger messenger = new Messenger(this.f195d);
                    this.f199h = messenger;
                    this.f195d.m105673a(messenger);
                    try {
                        this.f198g.m105666a(this.f192a, this.f199h);
                    } catch (RemoteException unused) {
                        Log.i("MediaBrowserCompat", "Remote error registering client messenger.");
                    }
                }
                IMediaSession m105538c = IMediaSession.AbstractBinderC0103a.m105538c(BundleCompat.getBinder(extras, MediaBrowserProtocol.EXTRA_SESSION_BINDER));
                if (m105538c != null) {
                    this.f200i = MediaSessionCompat.Token.m105591c(this.f193b.getSessionToken(), m105538c);
                }
            } catch (IllegalStateException e) {
                Log.e("MediaBrowserCompat", "Unexpected IllegalStateException", e);
            }
        }

        @Override // android.support.p013v4.media.MediaBrowserCompat.C0068c.InterfaceC0070b
        /* renamed from: e */
        public void mo105670e() {
        }

        @Override // android.support.p013v4.media.MediaBrowserCompat.InterfaceC0075h
        /* renamed from: c */
        public void mo105669c(Messenger messenger) {
        }

        @Override // android.support.p013v4.media.MediaBrowserCompat.InterfaceC0075h
        /* renamed from: f */
        public void mo105667f(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$k */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0078k {

        /* renamed from: a */
        final MediaBrowser.SubscriptionCallback f206a;

        /* renamed from: b */
        final IBinder f207b = new Binder();

        /* renamed from: c */
        WeakReference<C0077j> f208c;

        @RequiresApi(21)
        /* renamed from: android.support.v4.media.MediaBrowserCompat$k$a */
        /* loaded from: classes.dex */
        private class C0079a extends MediaBrowser.SubscriptionCallback {
            C0079a() {
            }

            /* renamed from: a */
            List<MediaItem> m105656a(List<MediaItem> list, Bundle bundle) {
                if (list == null) {
                    return null;
                }
                int i = bundle.getInt("android.media.browse.extra.PAGE", -1);
                int i2 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
                if (i == -1 && i2 == -1) {
                    return list;
                }
                int i3 = i2 * i;
                int i4 = i3 + i2;
                if (i >= 0 && i2 >= 1 && i3 < list.size()) {
                    if (i4 > list.size()) {
                        i4 = list.size();
                    }
                    return list.subList(i3, i4);
                }
                return Collections.emptyList();
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public void onChildrenLoaded(@NonNull String str, List<MediaBrowser.MediaItem> list) {
                C0077j c0077j;
                WeakReference<C0077j> weakReference = AbstractC0078k.this.f208c;
                if (weakReference == null) {
                    c0077j = null;
                } else {
                    c0077j = weakReference.get();
                }
                if (c0077j == null) {
                    AbstractC0078k.this.m105660a(str, MediaItem.m105678c(list));
                    return;
                }
                List<MediaItem> m105678c = MediaItem.m105678c(list);
                List<AbstractC0078k> m105662b = c0077j.m105662b();
                List<Bundle> m105661c = c0077j.m105661c();
                for (int i = 0; i < m105662b.size(); i++) {
                    Bundle bundle = m105661c.get(i);
                    if (bundle == null) {
                        AbstractC0078k.this.m105660a(str, m105678c);
                    } else {
                        AbstractC0078k.this.m105659b(str, m105656a(m105678c, bundle), bundle);
                    }
                }
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public void onError(@NonNull String str) {
                AbstractC0078k.this.m105658c(str);
            }
        }

        @RequiresApi(26)
        /* renamed from: android.support.v4.media.MediaBrowserCompat$k$b */
        /* loaded from: classes.dex */
        private class C0080b extends C0079a {
            C0080b() {
                super();
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public void onChildrenLoaded(@NonNull String str, @NonNull List<MediaBrowser.MediaItem> list, @NonNull Bundle bundle) {
                MediaSessionCompat.m105604a(bundle);
                AbstractC0078k.this.m105659b(str, MediaItem.m105678c(list), bundle);
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public void onError(@NonNull String str, @NonNull Bundle bundle) {
                MediaSessionCompat.m105604a(bundle);
                AbstractC0078k.this.m105657d(str, bundle);
            }
        }

        public AbstractC0078k() {
            if (Build.VERSION.SDK_INT >= 26) {
                this.f206a = new C0080b();
            } else {
                this.f206a = new C0079a();
            }
        }

        /* renamed from: c */
        public void m105658c(@NonNull String str) {
        }

        /* renamed from: a */
        public void m105660a(@NonNull String str, @NonNull List<MediaItem> list) {
        }

        /* renamed from: d */
        public void m105657d(@NonNull String str, @NonNull Bundle bundle) {
        }

        /* renamed from: b */
        public void m105659b(@NonNull String str, @NonNull List<MediaItem> list, @NonNull Bundle bundle) {
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$CustomActionResultReceiver */
    /* loaded from: classes.dex */
    private static class CustomActionResultReceiver extends ResultReceiver {
        @Override // android.support.p013v4.p014os.ResultReceiver
        /* renamed from: a */
        protected void mo105535a(int i, Bundle bundle) {
        }
    }
}
