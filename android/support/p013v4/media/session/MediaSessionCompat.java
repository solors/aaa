package android.support.p013v4.media.session;

import android.annotation.SuppressLint;
import android.media.MediaDescription;
import android.media.session.MediaSession;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.p013v4.media.MediaDescriptionCompat;
import android.util.Log;
import androidx.annotation.DoNotInline;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: android.support.v4.media.session.MediaSessionCompat */
/* loaded from: classes.dex */
public class MediaSessionCompat {

    /* renamed from: a */
    private final MediaControllerCompat f254a;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper */
    /* loaded from: classes.dex */
    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new C0095a();

        /* renamed from: b */
        ResultReceiver f258b;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper$a */
        /* loaded from: classes.dex */
        class C0095a implements Parcelable.Creator<ResultReceiverWrapper> {
            C0095a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public ResultReceiverWrapper createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public ResultReceiverWrapper[] newArray(int i) {
                return new ResultReceiverWrapper[i];
            }
        }

        ResultReceiverWrapper(Parcel parcel) {
            this.f258b = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            this.f258b.writeToParcel(parcel, i);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: android.support.v4.media.session.MediaSessionCompat$Token */
    /* loaded from: classes.dex */
    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new C0096a();

        /* renamed from: b */
        private final Object f259b;

        /* renamed from: c */
        private final Object f260c;
        @GuardedBy("mLock")

        /* renamed from: d */
        private IMediaSession f261d;
        @GuardedBy("mLock")

        /* renamed from: f */
        private VersionedParcelable f262f;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$Token$a */
        /* loaded from: classes.dex */
        class C0096a implements Parcelable.Creator<Token> {
            C0096a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public Token createFromParcel(Parcel parcel) {
                return new Token(parcel.readParcelable(null));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public Token[] newArray(int i) {
                return new Token[i];
            }
        }

        Token(Object obj) {
            this(obj, null, null);
        }

        /* renamed from: a */
        public static Token m105592a(Object obj) {
            return m105591c(obj, null);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        /* renamed from: c */
        public static Token m105591c(Object obj, IMediaSession iMediaSession) {
            if (obj != null) {
                if (obj instanceof MediaSession.Token) {
                    return new Token(obj, iMediaSession);
                }
                throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
            }
            return null;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        /* renamed from: d */
        public IMediaSession m105590d() {
            IMediaSession iMediaSession;
            synchronized (this.f259b) {
                iMediaSession = this.f261d;
            }
            return iMediaSession;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            Object obj2 = this.f260c;
            if (obj2 == null) {
                if (token.f260c == null) {
                    return true;
                }
                return false;
            }
            Object obj3 = token.f260c;
            if (obj3 == null) {
                return false;
            }
            return obj2.equals(obj3);
        }

        /* renamed from: f */
        public Object m105589f() {
            return this.f260c;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        /* renamed from: g */
        public void m105588g(IMediaSession iMediaSession) {
            synchronized (this.f259b) {
                this.f261d = iMediaSession;
            }
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        /* renamed from: h */
        public void m105587h(VersionedParcelable versionedParcelable) {
            synchronized (this.f259b) {
                this.f262f = versionedParcelable;
            }
        }

        public int hashCode() {
            Object obj = this.f260c;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable((Parcelable) this.f260c, i);
        }

        Token(Object obj, IMediaSession iMediaSession) {
            this(obj, iMediaSession, null);
        }

        Token(Object obj, IMediaSession iMediaSession, VersionedParcelable versionedParcelable) {
            this.f259b = new Object();
            this.f260c = obj;
            this.f261d = iMediaSession;
            this.f262f = versionedParcelable;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: a */
    public static void m105604a(@Nullable Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: c */
    public static Bundle m105602c(@Nullable Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        m105604a(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    /* renamed from: b */
    public MediaControllerCompat m105603b() {
        return this.f254a;
    }

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem */
    /* loaded from: classes.dex */
    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new C0093a();

        /* renamed from: b */
        private final MediaDescriptionCompat f255b;

        /* renamed from: c */
        private final long f256c;

        /* renamed from: d */
        private MediaSession.QueueItem f257d;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem$a */
        /* loaded from: classes.dex */
        class C0093a implements Parcelable.Creator<QueueItem> {
            C0093a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public QueueItem[] newArray(int i) {
                return new QueueItem[i];
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @RequiresApi(21)
        /* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem$b */
        /* loaded from: classes.dex */
        public static class C0094b {
            @DoNotInline
            /* renamed from: a */
            static MediaSession.QueueItem m105597a(MediaDescription mediaDescription, long j) {
                return new MediaSession.QueueItem(mediaDescription, j);
            }

            @DoNotInline
            /* renamed from: b */
            static MediaDescription m105596b(MediaSession.QueueItem queueItem) {
                return queueItem.getDescription();
            }

            @DoNotInline
            /* renamed from: c */
            static long m105595c(MediaSession.QueueItem queueItem) {
                return queueItem.getQueueId();
            }
        }

        private QueueItem(MediaSession.QueueItem queueItem, MediaDescriptionCompat mediaDescriptionCompat, long j) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null");
            }
            if (j != -1) {
                this.f255b = mediaDescriptionCompat;
                this.f256c = j;
                this.f257d = queueItem;
                return;
            }
            throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
        }

        /* renamed from: a */
        public static QueueItem m105601a(Object obj) {
            if (obj != null) {
                MediaSession.QueueItem queueItem = (MediaSession.QueueItem) obj;
                return new QueueItem(queueItem, MediaDescriptionCompat.m105655a(C0094b.m105596b(queueItem)), C0094b.m105595c(queueItem));
            }
            return null;
        }

        /* renamed from: c */
        public static List<QueueItem> m105600c(List<?> list) {
            if (list != null) {
                ArrayList arrayList = new ArrayList(list.size());
                Iterator<?> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(m105601a(it.next()));
                }
                return arrayList;
            }
            return null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "MediaSession.QueueItem {Description=" + this.f255b + ", Id=" + this.f256c + " }";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            this.f255b.writeToParcel(parcel, i);
            parcel.writeLong(this.f256c);
        }

        QueueItem(Parcel parcel) {
            this.f255b = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f256c = parcel.readLong();
        }
    }
}
