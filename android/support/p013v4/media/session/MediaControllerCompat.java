package android.support.p013v4.media.session;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.p013v4.media.MediaMetadataCompat;
import android.support.p013v4.media.session.IMediaControllerCallback;
import android.support.p013v4.media.session.IMediaSession;
import android.support.p013v4.media.session.MediaSessionCompat;
import android.util.Log;
import android.view.KeyEvent;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.app.BundleCompat;
import androidx.media.AudioAttributesCompat;
import androidx.versionedparcelable.ParcelUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: android.support.v4.media.session.MediaControllerCompat */
/* loaded from: classes.dex */
public final class MediaControllerCompat {

    /* renamed from: a */
    private final InterfaceC0091b f236a;

    /* renamed from: b */
    private final MediaSessionCompat.Token f237b;
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: c */
    private final ConcurrentHashMap<AbstractC0088a, Boolean> f238c = new ConcurrentHashMap<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    @RequiresApi(21)
    /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21 */
    /* loaded from: classes.dex */
    public static class MediaControllerImplApi21 implements InterfaceC0091b {

        /* renamed from: a */
        protected final MediaController f239a;

        /* renamed from: b */
        final Object f240b = new Object();
        @GuardedBy("mLock")

        /* renamed from: c */
        private final List<AbstractC0088a> f241c = new ArrayList();

        /* renamed from: d */
        private HashMap<AbstractC0088a, BinderC0087a> f242d = new HashMap<>();

        /* renamed from: e */
        final MediaSessionCompat.Token f243e;

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        /* loaded from: classes.dex */
        public static class ExtraBinderRequestResultReceiver extends ResultReceiver {

            /* renamed from: b */
            private WeakReference<MediaControllerImplApi21> f244b;

            ExtraBinderRequestResultReceiver(MediaControllerImplApi21 mediaControllerImplApi21) {
                super(null);
                this.f244b = new WeakReference<>(mediaControllerImplApi21);
            }

            @Override // android.os.ResultReceiver
            protected void onReceiveResult(int i, Bundle bundle) {
                MediaControllerImplApi21 mediaControllerImplApi21 = this.f244b.get();
                if (mediaControllerImplApi21 != null && bundle != null) {
                    synchronized (mediaControllerImplApi21.f240b) {
                        mediaControllerImplApi21.f243e.m105588g(IMediaSession.AbstractBinderC0103a.m105538c(BundleCompat.getBinder(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                        mediaControllerImplApi21.f243e.m105587h(ParcelUtils.getVersionedParcelable(bundle, "android.support.v4.media.session.SESSION_TOKEN2"));
                        mediaControllerImplApi21.m105617b();
                    }
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$a */
        /* loaded from: classes.dex */
        public static class BinderC0087a extends AbstractC0088a.BinderC0090b {
            BinderC0087a(AbstractC0088a abstractC0088a) {
                super(abstractC0088a);
            }

            @Override // android.support.p013v4.media.session.IMediaControllerCallback
            /* renamed from: k */
            public void mo105548k(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.p013v4.media.session.IMediaControllerCallback
            /* renamed from: l */
            public void mo105547l() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.p013v4.media.session.IMediaControllerCallback
            /* renamed from: m */
            public void mo105546m(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.p013v4.media.session.IMediaControllerCallback
            /* renamed from: o */
            public void mo105544o(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.p013v4.media.session.IMediaControllerCallback
            /* renamed from: p */
            public void mo105543p(Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.p013v4.media.session.IMediaControllerCallback
            /* renamed from: s */
            public void mo105540s(CharSequence charSequence) throws RemoteException {
                throw new AssertionError();
            }
        }

        MediaControllerImplApi21(Context context, MediaSessionCompat.Token token) {
            this.f243e = token;
            this.f239a = new MediaController(context, (MediaSession.Token) token.m105589f());
            if (token.m105590d() == null) {
                m105616c();
            }
        }

        /* renamed from: c */
        private void m105616c() {
            m105615d("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new ExtraBinderRequestResultReceiver(this));
        }

        @Override // android.support.p013v4.media.session.MediaControllerCompat.InterfaceC0091b
        /* renamed from: a */
        public boolean mo105605a(KeyEvent keyEvent) {
            return this.f239a.dispatchMediaButtonEvent(keyEvent);
        }

        @GuardedBy("mLock")
        /* renamed from: b */
        void m105617b() {
            if (this.f243e.m105590d() == null) {
                return;
            }
            for (AbstractC0088a abstractC0088a : this.f241c) {
                BinderC0087a binderC0087a = new BinderC0087a(abstractC0088a);
                this.f242d.put(abstractC0088a, binderC0087a);
                abstractC0088a.f246c = binderC0087a;
                try {
                    this.f243e.m105590d().mo105536b(binderC0087a);
                    abstractC0088a.m105606i(13, null, null);
                } catch (RemoteException e) {
                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
                }
            }
            this.f241c.clear();
        }

        /* renamed from: d */
        public void m105615d(String str, Bundle bundle, ResultReceiver resultReceiver) {
            this.f239a.sendCommand(str, bundle, resultReceiver);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: android.support.v4.media.session.MediaControllerCompat$b */
    /* loaded from: classes.dex */
    public interface InterfaceC0091b {
        /* renamed from: a */
        boolean mo105605a(KeyEvent keyEvent);
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$c */
    /* loaded from: classes.dex */
    public static final class C0092c {

        /* renamed from: a */
        private final int f249a;

        /* renamed from: b */
        private final AudioAttributesCompat f250b;

        /* renamed from: c */
        private final int f251c;

        /* renamed from: d */
        private final int f252d;

        /* renamed from: e */
        private final int f253e;

        C0092c(int i, @NonNull AudioAttributesCompat audioAttributesCompat, int i2, int i3, int i4) {
            this.f249a = i;
            this.f250b = audioAttributesCompat;
            this.f251c = i2;
            this.f252d = i3;
            this.f253e = i4;
        }
    }

    public MediaControllerCompat(Context context, @NonNull MediaSessionCompat.Token token) {
        if (token != null) {
            this.f237b = token;
            this.f236a = new MediaControllerImplApi21(context, token);
            return;
        }
        throw new IllegalArgumentException("sessionToken must not be null");
    }

    /* renamed from: a */
    public boolean m105618a(KeyEvent keyEvent) {
        if (keyEvent != null) {
            return this.f236a.mo105605a(keyEvent);
        }
        throw new IllegalArgumentException("KeyEvent may not be null");
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0088a implements IBinder.DeathRecipient {

        /* renamed from: b */
        final MediaController.Callback f245b = new C0089a(this);

        /* renamed from: c */
        IMediaControllerCallback f246c;

        @RequiresApi(21)
        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$a */
        /* loaded from: classes.dex */
        private static class C0089a extends MediaController.Callback {

            /* renamed from: a */
            private final WeakReference<AbstractC0088a> f247a;

            C0089a(AbstractC0088a abstractC0088a) {
                this.f247a = new WeakReference<>(abstractC0088a);
            }

            @Override // android.media.session.MediaController.Callback
            public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
                AbstractC0088a abstractC0088a = this.f247a.get();
                if (abstractC0088a != null) {
                    abstractC0088a.m105614a(new C0092c(playbackInfo.getPlaybackType(), AudioAttributesCompat.wrap(playbackInfo.getAudioAttributes()), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume()));
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onExtrasChanged(Bundle bundle) {
                MediaSessionCompat.m105604a(bundle);
                AbstractC0088a abstractC0088a = this.f247a.get();
                if (abstractC0088a != null) {
                    abstractC0088a.m105613b(bundle);
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onMetadataChanged(MediaMetadata mediaMetadata) {
                AbstractC0088a abstractC0088a = this.f247a.get();
                if (abstractC0088a != null) {
                    abstractC0088a.m105612c(MediaMetadataCompat.m105623a(mediaMetadata));
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onPlaybackStateChanged(PlaybackState playbackState) {
                AbstractC0088a abstractC0088a = this.f247a.get();
                if (abstractC0088a != null && abstractC0088a.f246c == null) {
                    abstractC0088a.m105611d(PlaybackStateCompat.m105582a(playbackState));
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onQueueChanged(List<MediaSession.QueueItem> list) {
                AbstractC0088a abstractC0088a = this.f247a.get();
                if (abstractC0088a != null) {
                    abstractC0088a.m105610e(MediaSessionCompat.QueueItem.m105600c(list));
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onQueueTitleChanged(CharSequence charSequence) {
                AbstractC0088a abstractC0088a = this.f247a.get();
                if (abstractC0088a != null) {
                    abstractC0088a.m105609f(charSequence);
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onSessionDestroyed() {
                AbstractC0088a abstractC0088a = this.f247a.get();
                if (abstractC0088a != null) {
                    abstractC0088a.m105608g();
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onSessionEvent(String str, Bundle bundle) {
                MediaSessionCompat.m105604a(bundle);
                AbstractC0088a abstractC0088a = this.f247a.get();
                if (abstractC0088a != null) {
                    IMediaControllerCallback iMediaControllerCallback = abstractC0088a.f246c;
                    abstractC0088a.m105607h(str, bundle);
                }
            }
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            m105606i(8, null, null);
        }

        /* renamed from: g */
        public void m105608g() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$b */
        /* loaded from: classes.dex */
        public static class BinderC0090b extends IMediaControllerCallback.AbstractBinderC0102a {

            /* renamed from: b */
            private final WeakReference<AbstractC0088a> f248b;

            BinderC0090b(AbstractC0088a abstractC0088a) {
                this.f248b = new WeakReference<>(abstractC0088a);
            }

            @Override // android.support.p013v4.media.session.IMediaControllerCallback
            /* renamed from: j */
            public void mo105549j() throws RemoteException {
                AbstractC0088a abstractC0088a = this.f248b.get();
                if (abstractC0088a != null) {
                    abstractC0088a.m105606i(13, null, null);
                }
            }

            @Override // android.support.p013v4.media.session.IMediaControllerCallback
            /* renamed from: n */
            public void mo105545n(int i) throws RemoteException {
                AbstractC0088a abstractC0088a = this.f248b.get();
                if (abstractC0088a != null) {
                    abstractC0088a.m105606i(12, Integer.valueOf(i), null);
                }
            }

            @Override // android.support.p013v4.media.session.IMediaControllerCallback
            public void onEvent(String str, Bundle bundle) throws RemoteException {
                AbstractC0088a abstractC0088a = this.f248b.get();
                if (abstractC0088a != null) {
                    abstractC0088a.m105606i(1, str, bundle);
                }
            }

            @Override // android.support.p013v4.media.session.IMediaControllerCallback
            public void onRepeatModeChanged(int i) throws RemoteException {
                AbstractC0088a abstractC0088a = this.f248b.get();
                if (abstractC0088a != null) {
                    abstractC0088a.m105606i(9, Integer.valueOf(i), null);
                }
            }

            @Override // android.support.p013v4.media.session.IMediaControllerCallback
            /* renamed from: q */
            public void mo105542q(boolean z) throws RemoteException {
                AbstractC0088a abstractC0088a = this.f248b.get();
                if (abstractC0088a != null) {
                    abstractC0088a.m105606i(11, Boolean.valueOf(z), null);
                }
            }

            @Override // android.support.p013v4.media.session.IMediaControllerCallback
            /* renamed from: t */
            public void mo105539t(PlaybackStateCompat playbackStateCompat) throws RemoteException {
                AbstractC0088a abstractC0088a = this.f248b.get();
                if (abstractC0088a != null) {
                    abstractC0088a.m105606i(2, playbackStateCompat, null);
                }
            }

            @Override // android.support.p013v4.media.session.IMediaControllerCallback
            /* renamed from: r */
            public void mo105541r(boolean z) throws RemoteException {
            }
        }

        /* renamed from: a */
        public void m105614a(C0092c c0092c) {
        }

        /* renamed from: b */
        public void m105613b(Bundle bundle) {
        }

        /* renamed from: c */
        public void m105612c(MediaMetadataCompat mediaMetadataCompat) {
        }

        /* renamed from: d */
        public void m105611d(PlaybackStateCompat playbackStateCompat) {
        }

        /* renamed from: e */
        public void m105610e(List<MediaSessionCompat.QueueItem> list) {
        }

        /* renamed from: f */
        public void m105609f(CharSequence charSequence) {
        }

        /* renamed from: h */
        public void m105607h(String str, Bundle bundle) {
        }

        /* renamed from: i */
        void m105606i(int i, Object obj, Bundle bundle) {
        }
    }
}
