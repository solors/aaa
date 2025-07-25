package android.support.p013v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: android.support.v4.media.MediaDescriptionCompat */
/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new C0081a();

    /* renamed from: b */
    private final String f211b;

    /* renamed from: c */
    private final CharSequence f212c;

    /* renamed from: d */
    private final CharSequence f213d;

    /* renamed from: f */
    private final CharSequence f214f;

    /* renamed from: g */
    private final Bitmap f215g;

    /* renamed from: h */
    private final Uri f216h;

    /* renamed from: i */
    private final Bundle f217i;

    /* renamed from: j */
    private final Uri f218j;

    /* renamed from: k */
    private MediaDescription f219k;

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$a */
    /* loaded from: classes.dex */
    class C0081a implements Parcelable.Creator<MediaDescriptionCompat> {
        C0081a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return MediaDescriptionCompat.m105655a(MediaDescription.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public MediaDescriptionCompat[] newArray(int i) {
            return new MediaDescriptionCompat[i];
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(21)
    /* renamed from: android.support.v4.media.MediaDescriptionCompat$b */
    /* loaded from: classes.dex */
    public static class C0082b {
        @DoNotInline
        /* renamed from: a */
        static MediaDescription m105650a(MediaDescription.Builder builder) {
            return builder.build();
        }

        @DoNotInline
        /* renamed from: b */
        static MediaDescription.Builder m105649b() {
            return new MediaDescription.Builder();
        }

        @Nullable
        @DoNotInline
        /* renamed from: c */
        static CharSequence m105648c(MediaDescription mediaDescription) {
            return mediaDescription.getDescription();
        }

        @Nullable
        @DoNotInline
        /* renamed from: d */
        static Bundle m105647d(MediaDescription mediaDescription) {
            return mediaDescription.getExtras();
        }

        @Nullable
        @DoNotInline
        /* renamed from: e */
        static Bitmap m105646e(MediaDescription mediaDescription) {
            return mediaDescription.getIconBitmap();
        }

        @Nullable
        @DoNotInline
        /* renamed from: f */
        static Uri m105645f(MediaDescription mediaDescription) {
            return mediaDescription.getIconUri();
        }

        @Nullable
        @DoNotInline
        /* renamed from: g */
        static String m105644g(MediaDescription mediaDescription) {
            return mediaDescription.getMediaId();
        }

        @Nullable
        @DoNotInline
        /* renamed from: h */
        static CharSequence m105643h(MediaDescription mediaDescription) {
            return mediaDescription.getSubtitle();
        }

        @Nullable
        @DoNotInline
        /* renamed from: i */
        static CharSequence m105642i(MediaDescription mediaDescription) {
            return mediaDescription.getTitle();
        }

        @DoNotInline
        /* renamed from: j */
        static void m105641j(MediaDescription.Builder builder, @Nullable CharSequence charSequence) {
            builder.setDescription(charSequence);
        }

        @DoNotInline
        /* renamed from: k */
        static void m105640k(MediaDescription.Builder builder, @Nullable Bundle bundle) {
            builder.setExtras(bundle);
        }

        @DoNotInline
        /* renamed from: l */
        static void m105639l(MediaDescription.Builder builder, @Nullable Bitmap bitmap) {
            builder.setIconBitmap(bitmap);
        }

        @DoNotInline
        /* renamed from: m */
        static void m105638m(MediaDescription.Builder builder, @Nullable Uri uri) {
            builder.setIconUri(uri);
        }

        @DoNotInline
        /* renamed from: n */
        static void m105637n(MediaDescription.Builder builder, @Nullable String str) {
            builder.setMediaId(str);
        }

        @DoNotInline
        /* renamed from: o */
        static void m105636o(MediaDescription.Builder builder, @Nullable CharSequence charSequence) {
            builder.setSubtitle(charSequence);
        }

        @DoNotInline
        /* renamed from: p */
        static void m105635p(MediaDescription.Builder builder, @Nullable CharSequence charSequence) {
            builder.setTitle(charSequence);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(23)
    /* renamed from: android.support.v4.media.MediaDescriptionCompat$c */
    /* loaded from: classes.dex */
    public static class C0083c {
        @Nullable
        @DoNotInline
        /* renamed from: a */
        static Uri m105634a(MediaDescription mediaDescription) {
            return mediaDescription.getMediaUri();
        }

        @DoNotInline
        /* renamed from: b */
        static void m105633b(MediaDescription.Builder builder, @Nullable Uri uri) {
            builder.setMediaUri(uri);
        }
    }

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$d */
    /* loaded from: classes.dex */
    public static final class C0084d {

        /* renamed from: a */
        private String f220a;

        /* renamed from: b */
        private CharSequence f221b;

        /* renamed from: c */
        private CharSequence f222c;

        /* renamed from: d */
        private CharSequence f223d;

        /* renamed from: e */
        private Bitmap f224e;

        /* renamed from: f */
        private Uri f225f;

        /* renamed from: g */
        private Bundle f226g;

        /* renamed from: h */
        private Uri f227h;

        /* renamed from: a */
        public MediaDescriptionCompat m105632a() {
            return new MediaDescriptionCompat(this.f220a, this.f221b, this.f222c, this.f223d, this.f224e, this.f225f, this.f226g, this.f227h);
        }

        /* renamed from: b */
        public C0084d m105631b(@Nullable CharSequence charSequence) {
            this.f223d = charSequence;
            return this;
        }

        /* renamed from: c */
        public C0084d m105630c(@Nullable Bundle bundle) {
            this.f226g = bundle;
            return this;
        }

        /* renamed from: d */
        public C0084d m105629d(@Nullable Bitmap bitmap) {
            this.f224e = bitmap;
            return this;
        }

        /* renamed from: e */
        public C0084d m105628e(@Nullable Uri uri) {
            this.f225f = uri;
            return this;
        }

        /* renamed from: f */
        public C0084d m105627f(@Nullable String str) {
            this.f220a = str;
            return this;
        }

        /* renamed from: g */
        public C0084d m105626g(@Nullable Uri uri) {
            this.f227h = uri;
            return this;
        }

        /* renamed from: h */
        public C0084d m105625h(@Nullable CharSequence charSequence) {
            this.f222c = charSequence;
            return this;
        }

        /* renamed from: i */
        public C0084d m105624i(@Nullable CharSequence charSequence) {
            this.f221b = charSequence;
            return this;
        }
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f211b = str;
        this.f212c = charSequence;
        this.f213d = charSequence2;
        this.f214f = charSequence3;
        this.f215g = bitmap;
        this.f216h = uri;
        this.f217i = bundle;
        this.f218j = uri2;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.support.p013v4.media.MediaDescriptionCompat m105655a(java.lang.Object r8) {
        /*
            r0 = 0
            if (r8 == 0) goto L79
            android.support.v4.media.MediaDescriptionCompat$d r1 = new android.support.v4.media.MediaDescriptionCompat$d
            r1.<init>()
            android.media.MediaDescription r8 = (android.media.MediaDescription) r8
            java.lang.String r2 = android.support.p013v4.media.MediaDescriptionCompat.C0082b.m105644g(r8)
            r1.m105627f(r2)
            java.lang.CharSequence r2 = android.support.p013v4.media.MediaDescriptionCompat.C0082b.m105642i(r8)
            r1.m105624i(r2)
            java.lang.CharSequence r2 = android.support.p013v4.media.MediaDescriptionCompat.C0082b.m105643h(r8)
            r1.m105625h(r2)
            java.lang.CharSequence r2 = android.support.p013v4.media.MediaDescriptionCompat.C0082b.m105648c(r8)
            r1.m105631b(r2)
            android.graphics.Bitmap r2 = android.support.p013v4.media.MediaDescriptionCompat.C0082b.m105646e(r8)
            r1.m105629d(r2)
            android.net.Uri r2 = android.support.p013v4.media.MediaDescriptionCompat.C0082b.m105645f(r8)
            r1.m105628e(r2)
            android.os.Bundle r2 = android.support.p013v4.media.MediaDescriptionCompat.C0082b.m105647d(r8)
            if (r2 == 0) goto L3e
            android.os.Bundle r2 = android.support.p013v4.media.session.MediaSessionCompat.m105602c(r2)
        L3e:
            java.lang.String r3 = "android.support.v4.media.description.MEDIA_URI"
            if (r2 == 0) goto L49
            android.os.Parcelable r4 = r2.getParcelable(r3)
            android.net.Uri r4 = (android.net.Uri) r4
            goto L4a
        L49:
            r4 = r0
        L4a:
            if (r4 == 0) goto L62
            java.lang.String r5 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r6 = r2.containsKey(r5)
            if (r6 == 0) goto L5c
            int r6 = r2.size()
            r7 = 2
            if (r6 != r7) goto L5c
            goto L63
        L5c:
            r2.remove(r3)
            r2.remove(r5)
        L62:
            r0 = r2
        L63:
            r1.m105630c(r0)
            if (r4 == 0) goto L6c
            r1.m105626g(r4)
            goto L73
        L6c:
            android.net.Uri r0 = android.support.p013v4.media.MediaDescriptionCompat.C0083c.m105634a(r8)
            r1.m105626g(r0)
        L73:
            android.support.v4.media.MediaDescriptionCompat r0 = r1.m105632a()
            r0.f219k = r8
        L79:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p013v4.media.MediaDescriptionCompat.m105655a(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    /* renamed from: c */
    public Object m105654c() {
        MediaDescription mediaDescription = this.f219k;
        if (mediaDescription == null) {
            MediaDescription.Builder m105649b = C0082b.m105649b();
            C0082b.m105637n(m105649b, this.f211b);
            C0082b.m105635p(m105649b, this.f212c);
            C0082b.m105636o(m105649b, this.f213d);
            C0082b.m105641j(m105649b, this.f214f);
            C0082b.m105639l(m105649b, this.f215g);
            C0082b.m105638m(m105649b, this.f216h);
            C0082b.m105640k(m105649b, this.f217i);
            C0083c.m105633b(m105649b, this.f218j);
            MediaDescription m105650a = C0082b.m105650a(m105649b);
            this.f219k = m105650a;
            return m105650a;
        }
        return mediaDescription;
    }

    @Nullable
    /* renamed from: d */
    public String m105653d() {
        return this.f211b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return ((Object) this.f212c) + ", " + ((Object) this.f213d) + ", " + ((Object) this.f214f);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ((MediaDescription) m105654c()).writeToParcel(parcel, i);
    }
}
