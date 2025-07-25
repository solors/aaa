package android.support.p013v4.media.session;

import android.annotation.SuppressLint;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: android.support.v4.media.session.PlaybackStateCompat */
/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new C0099a();

    /* renamed from: b */
    final int f268b;

    /* renamed from: c */
    final long f269c;

    /* renamed from: d */
    final long f270d;

    /* renamed from: f */
    final float f271f;

    /* renamed from: g */
    final long f272g;

    /* renamed from: h */
    final int f273h;

    /* renamed from: i */
    final CharSequence f274i;

    /* renamed from: j */
    final long f275j;

    /* renamed from: k */
    List<CustomAction> f276k;

    /* renamed from: l */
    final long f277l;

    /* renamed from: m */
    final Bundle f278m;

    /* renamed from: n */
    private PlaybackState f279n;

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$a */
    /* loaded from: classes.dex */
    class C0099a implements Parcelable.Creator<PlaybackStateCompat> {
        C0099a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public PlaybackStateCompat[] newArray(int i) {
            return new PlaybackStateCompat[i];
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(21)
    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$b */
    /* loaded from: classes.dex */
    public static class C0100b {
        @DoNotInline
        /* renamed from: a */
        static void m105575a(PlaybackState.Builder builder, PlaybackState.CustomAction customAction) {
            builder.addCustomAction(customAction);
        }

        @DoNotInline
        /* renamed from: b */
        static PlaybackState.CustomAction m105574b(PlaybackState.CustomAction.Builder builder) {
            return builder.build();
        }

        @DoNotInline
        /* renamed from: c */
        static PlaybackState m105573c(PlaybackState.Builder builder) {
            return builder.build();
        }

        @DoNotInline
        /* renamed from: d */
        static PlaybackState.Builder m105572d() {
            return new PlaybackState.Builder();
        }

        @DoNotInline
        /* renamed from: e */
        static PlaybackState.CustomAction.Builder m105571e(String str, CharSequence charSequence, int i) {
            return new PlaybackState.CustomAction.Builder(str, charSequence, i);
        }

        @DoNotInline
        /* renamed from: f */
        static String m105570f(PlaybackState.CustomAction customAction) {
            return customAction.getAction();
        }

        @DoNotInline
        /* renamed from: g */
        static long m105569g(PlaybackState playbackState) {
            return playbackState.getActions();
        }

        @DoNotInline
        /* renamed from: h */
        static long m105568h(PlaybackState playbackState) {
            return playbackState.getActiveQueueItemId();
        }

        @DoNotInline
        /* renamed from: i */
        static long m105567i(PlaybackState playbackState) {
            return playbackState.getBufferedPosition();
        }

        @DoNotInline
        /* renamed from: j */
        static List<PlaybackState.CustomAction> m105566j(PlaybackState playbackState) {
            return playbackState.getCustomActions();
        }

        @DoNotInline
        /* renamed from: k */
        static CharSequence m105565k(PlaybackState playbackState) {
            return playbackState.getErrorMessage();
        }

        @DoNotInline
        /* renamed from: l */
        static Bundle m105564l(PlaybackState.CustomAction customAction) {
            return customAction.getExtras();
        }

        @DoNotInline
        /* renamed from: m */
        static int m105563m(PlaybackState.CustomAction customAction) {
            return customAction.getIcon();
        }

        @DoNotInline
        /* renamed from: n */
        static long m105562n(PlaybackState playbackState) {
            return playbackState.getLastPositionUpdateTime();
        }

        @DoNotInline
        /* renamed from: o */
        static CharSequence m105561o(PlaybackState.CustomAction customAction) {
            return customAction.getName();
        }

        @DoNotInline
        /* renamed from: p */
        static float m105560p(PlaybackState playbackState) {
            return playbackState.getPlaybackSpeed();
        }

        @DoNotInline
        /* renamed from: q */
        static long m105559q(PlaybackState playbackState) {
            return playbackState.getPosition();
        }

        @DoNotInline
        /* renamed from: r */
        static int m105558r(PlaybackState playbackState) {
            return playbackState.getState();
        }

        @DoNotInline
        /* renamed from: s */
        static void m105557s(PlaybackState.Builder builder, long j) {
            builder.setActions(j);
        }

        @DoNotInline
        /* renamed from: t */
        static void m105556t(PlaybackState.Builder builder, long j) {
            builder.setActiveQueueItemId(j);
        }

        @DoNotInline
        /* renamed from: u */
        static void m105555u(PlaybackState.Builder builder, long j) {
            builder.setBufferedPosition(j);
        }

        @DoNotInline
        /* renamed from: v */
        static void m105554v(PlaybackState.Builder builder, CharSequence charSequence) {
            builder.setErrorMessage(charSequence);
        }

        @DoNotInline
        /* renamed from: w */
        static void m105553w(PlaybackState.CustomAction.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }

        @DoNotInline
        /* renamed from: x */
        static void m105552x(PlaybackState.Builder builder, int i, long j, float f, long j2) {
            builder.setState(i, j, f, j2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(22)
    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$c */
    /* loaded from: classes.dex */
    public static class C0101c {
        @DoNotInline
        /* renamed from: a */
        static Bundle m105551a(PlaybackState playbackState) {
            return playbackState.getExtras();
        }

        @DoNotInline
        /* renamed from: b */
        static void m105550b(PlaybackState.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }
    }

    PlaybackStateCompat(int i, long j, long j2, float f, long j3, int i2, CharSequence charSequence, long j4, List<CustomAction> list, long j5, Bundle bundle) {
        this.f268b = i;
        this.f269c = j;
        this.f270d = j2;
        this.f271f = f;
        this.f272g = j3;
        this.f273h = i2;
        this.f274i = charSequence;
        this.f275j = j4;
        this.f276k = new ArrayList(list);
        this.f277l = j5;
        this.f278m = bundle;
    }

    /* renamed from: a */
    public static PlaybackStateCompat m105582a(Object obj) {
        ArrayList arrayList = null;
        if (obj == null) {
            return null;
        }
        PlaybackState playbackState = (PlaybackState) obj;
        List<PlaybackState.CustomAction> m105566j = C0100b.m105566j(playbackState);
        if (m105566j != null) {
            arrayList = new ArrayList(m105566j.size());
            for (PlaybackState.CustomAction customAction : m105566j) {
                arrayList.add(CustomAction.m105580a(customAction));
            }
        }
        Bundle m105551a = C0101c.m105551a(playbackState);
        MediaSessionCompat.m105604a(m105551a);
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(C0100b.m105558r(playbackState), C0100b.m105559q(playbackState), C0100b.m105567i(playbackState), C0100b.m105560p(playbackState), C0100b.m105569g(playbackState), 0, C0100b.m105565k(playbackState), C0100b.m105562n(playbackState), arrayList, C0100b.m105568h(playbackState), m105551a);
        playbackStateCompat.f279n = playbackState;
        return playbackStateCompat;
    }

    /* renamed from: c */
    public static int m105581c(long j) {
        if (j == 4) {
            return 126;
        }
        if (j == 2) {
            return 127;
        }
        if (j == 32) {
            return 87;
        }
        if (j == 16) {
            return 88;
        }
        if (j == 1) {
            return 86;
        }
        if (j == 64) {
            return 90;
        }
        if (j == 8) {
            return 89;
        }
        if (j == 512) {
            return 85;
        }
        return 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PlaybackState {state=" + this.f268b + ", position=" + this.f269c + ", buffered position=" + this.f270d + ", speed=" + this.f271f + ", updated=" + this.f275j + ", actions=" + this.f272g + ", error code=" + this.f273h + ", error message=" + this.f274i + ", custom actions=" + this.f276k + ", active item id=" + this.f277l + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f268b);
        parcel.writeLong(this.f269c);
        parcel.writeFloat(this.f271f);
        parcel.writeLong(this.f275j);
        parcel.writeLong(this.f270d);
        parcel.writeLong(this.f272g);
        TextUtils.writeToParcel(this.f274i, parcel, i);
        parcel.writeTypedList(this.f276k);
        parcel.writeLong(this.f277l);
        parcel.writeBundle(this.f278m);
        parcel.writeInt(this.f273h);
    }

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction */
    /* loaded from: classes.dex */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new C0098a();

        /* renamed from: b */
        private final String f280b;

        /* renamed from: c */
        private final CharSequence f281c;

        /* renamed from: d */
        private final int f282d;

        /* renamed from: f */
        private final Bundle f283f;

        /* renamed from: g */
        private PlaybackState.CustomAction f284g;

        /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction$a */
        /* loaded from: classes.dex */
        class C0098a implements Parcelable.Creator<CustomAction> {
            C0098a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public CustomAction[] newArray(int i) {
                return new CustomAction[i];
            }
        }

        CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.f280b = str;
            this.f281c = charSequence;
            this.f282d = i;
            this.f283f = bundle;
        }

        /* renamed from: a */
        public static CustomAction m105580a(Object obj) {
            if (obj != null) {
                PlaybackState.CustomAction customAction = (PlaybackState.CustomAction) obj;
                Bundle m105564l = C0100b.m105564l(customAction);
                MediaSessionCompat.m105604a(m105564l);
                CustomAction customAction2 = new CustomAction(C0100b.m105570f(customAction), C0100b.m105561o(customAction), C0100b.m105563m(customAction), m105564l);
                customAction2.f284g = customAction;
                return customAction2;
            }
            return null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + ((Object) this.f281c) + ", mIcon=" + this.f282d + ", mExtras=" + this.f283f;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f280b);
            TextUtils.writeToParcel(this.f281c, parcel, i);
            parcel.writeInt(this.f282d);
            parcel.writeBundle(this.f283f);
        }

        CustomAction(Parcel parcel) {
            this.f280b = parcel.readString();
            this.f281c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f282d = parcel.readInt();
            this.f283f = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f268b = parcel.readInt();
        this.f269c = parcel.readLong();
        this.f271f = parcel.readFloat();
        this.f275j = parcel.readLong();
        this.f270d = parcel.readLong();
        this.f272g = parcel.readLong();
        this.f274i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f276k = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f277l = parcel.readLong();
        this.f278m = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f273h = parcel.readInt();
    }
}
