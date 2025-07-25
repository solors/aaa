package com.google.android.exoplayer2;

import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Objects;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes4.dex */
public final class MediaMetadata implements Bundleable {
    public static final int FOLDER_TYPE_ALBUMS = 2;
    public static final int FOLDER_TYPE_ARTISTS = 3;
    public static final int FOLDER_TYPE_GENRES = 4;
    public static final int FOLDER_TYPE_MIXED = 0;
    public static final int FOLDER_TYPE_NONE = -1;
    public static final int FOLDER_TYPE_PLAYLISTS = 5;
    public static final int FOLDER_TYPE_TITLES = 1;
    public static final int FOLDER_TYPE_YEARS = 6;
    public static final int MEDIA_TYPE_ALBUM = 10;
    public static final int MEDIA_TYPE_ARTIST = 11;
    public static final int MEDIA_TYPE_AUDIO_BOOK = 15;
    public static final int MEDIA_TYPE_AUDIO_BOOK_CHAPTER = 2;
    public static final int MEDIA_TYPE_FOLDER_ALBUMS = 21;
    public static final int MEDIA_TYPE_FOLDER_ARTISTS = 22;
    public static final int MEDIA_TYPE_FOLDER_AUDIO_BOOKS = 26;
    public static final int MEDIA_TYPE_FOLDER_GENRES = 23;
    public static final int MEDIA_TYPE_FOLDER_MIXED = 20;
    public static final int MEDIA_TYPE_FOLDER_MOVIES = 35;
    public static final int MEDIA_TYPE_FOLDER_NEWS = 32;
    public static final int MEDIA_TYPE_FOLDER_PLAYLISTS = 24;
    public static final int MEDIA_TYPE_FOLDER_PODCASTS = 27;
    public static final int MEDIA_TYPE_FOLDER_RADIO_STATIONS = 31;
    public static final int MEDIA_TYPE_FOLDER_TRAILERS = 34;
    public static final int MEDIA_TYPE_FOLDER_TV_CHANNELS = 28;
    public static final int MEDIA_TYPE_FOLDER_TV_SERIES = 29;
    public static final int MEDIA_TYPE_FOLDER_TV_SHOWS = 30;
    public static final int MEDIA_TYPE_FOLDER_VIDEOS = 33;
    public static final int MEDIA_TYPE_FOLDER_YEARS = 25;
    public static final int MEDIA_TYPE_GENRE = 12;
    public static final int MEDIA_TYPE_MIXED = 0;
    public static final int MEDIA_TYPE_MOVIE = 8;
    public static final int MEDIA_TYPE_MUSIC = 1;
    public static final int MEDIA_TYPE_NEWS = 5;
    public static final int MEDIA_TYPE_PLAYLIST = 13;
    public static final int MEDIA_TYPE_PODCAST = 16;
    public static final int MEDIA_TYPE_PODCAST_EPISODE = 3;
    public static final int MEDIA_TYPE_RADIO_STATION = 4;
    public static final int MEDIA_TYPE_TRAILER = 7;
    public static final int MEDIA_TYPE_TV_CHANNEL = 17;
    public static final int MEDIA_TYPE_TV_SEASON = 19;
    public static final int MEDIA_TYPE_TV_SERIES = 18;
    public static final int MEDIA_TYPE_TV_SHOW = 9;
    public static final int MEDIA_TYPE_VIDEO = 6;
    public static final int MEDIA_TYPE_YEAR = 14;
    public static final int PICTURE_TYPE_ARTIST_PERFORMER = 8;
    public static final int PICTURE_TYPE_A_BRIGHT_COLORED_FISH = 17;
    public static final int PICTURE_TYPE_BACK_COVER = 4;
    public static final int PICTURE_TYPE_BAND_ARTIST_LOGO = 19;
    public static final int PICTURE_TYPE_BAND_ORCHESTRA = 10;
    public static final int PICTURE_TYPE_COMPOSER = 11;
    public static final int PICTURE_TYPE_CONDUCTOR = 9;
    public static final int PICTURE_TYPE_DURING_PERFORMANCE = 15;
    public static final int PICTURE_TYPE_DURING_RECORDING = 14;
    public static final int PICTURE_TYPE_FILE_ICON = 1;
    public static final int PICTURE_TYPE_FILE_ICON_OTHER = 2;
    public static final int PICTURE_TYPE_FRONT_COVER = 3;
    public static final int PICTURE_TYPE_ILLUSTRATION = 18;
    public static final int PICTURE_TYPE_LEAD_ARTIST_PERFORMER = 7;
    public static final int PICTURE_TYPE_LEAFLET_PAGE = 5;
    public static final int PICTURE_TYPE_LYRICIST = 12;
    public static final int PICTURE_TYPE_MEDIA = 6;
    public static final int PICTURE_TYPE_MOVIE_VIDEO_SCREEN_CAPTURE = 16;
    public static final int PICTURE_TYPE_OTHER = 0;
    public static final int PICTURE_TYPE_PUBLISHER_STUDIO_LOGO = 20;
    public static final int PICTURE_TYPE_RECORDING_LOCATION = 13;
    @Nullable
    public final CharSequence albumArtist;
    @Nullable
    public final CharSequence albumTitle;
    @Nullable
    public final CharSequence artist;
    @Nullable
    public final byte[] artworkData;
    @Nullable
    public final Integer artworkDataType;
    @Nullable
    public final Uri artworkUri;
    @Nullable
    public final CharSequence compilation;
    @Nullable
    public final CharSequence composer;
    @Nullable
    public final CharSequence conductor;
    @Nullable
    public final CharSequence description;
    @Nullable
    public final Integer discNumber;
    @Nullable
    public final CharSequence displayTitle;
    @Nullable
    public final Bundle extras;
    @Nullable
    public final Integer folderType;
    @Nullable
    public final CharSequence genre;
    @Nullable
    public final Boolean isBrowsable;
    @Nullable
    public final Boolean isPlayable;
    @Nullable
    public final Integer mediaType;
    @Nullable
    public final Rating overallRating;
    @Nullable
    public final Integer recordingDay;
    @Nullable
    public final Integer recordingMonth;
    @Nullable
    public final Integer recordingYear;
    @Nullable
    public final Integer releaseDay;
    @Nullable
    public final Integer releaseMonth;
    @Nullable
    public final Integer releaseYear;
    @Nullable
    public final CharSequence station;
    @Nullable
    public final CharSequence subtitle;
    @Nullable
    public final CharSequence title;
    @Nullable
    public final Integer totalDiscCount;
    @Nullable
    public final Integer totalTrackCount;
    @Nullable
    public final Integer trackNumber;
    @Nullable
    public final Rating userRating;
    @Nullable
    public final CharSequence writer;
    @Nullable
    @Deprecated
    public final Integer year;
    public static final MediaMetadata EMPTY = new Builder().build();

    /* renamed from: b */
    private static final String f31747b = Util.intToStringMaxRadix(0);

    /* renamed from: c */
    private static final String f31748c = Util.intToStringMaxRadix(1);

    /* renamed from: d */
    private static final String f31749d = Util.intToStringMaxRadix(2);

    /* renamed from: f */
    private static final String f31750f = Util.intToStringMaxRadix(3);

    /* renamed from: g */
    private static final String f31751g = Util.intToStringMaxRadix(4);

    /* renamed from: h */
    private static final String f31752h = Util.intToStringMaxRadix(5);

    /* renamed from: i */
    private static final String f31753i = Util.intToStringMaxRadix(6);

    /* renamed from: j */
    private static final String f31754j = Util.intToStringMaxRadix(8);

    /* renamed from: k */
    private static final String f31755k = Util.intToStringMaxRadix(9);

    /* renamed from: l */
    private static final String f31756l = Util.intToStringMaxRadix(10);

    /* renamed from: m */
    private static final String f31757m = Util.intToStringMaxRadix(11);

    /* renamed from: n */
    private static final String f31758n = Util.intToStringMaxRadix(12);

    /* renamed from: o */
    private static final String f31759o = Util.intToStringMaxRadix(13);

    /* renamed from: p */
    private static final String f31760p = Util.intToStringMaxRadix(14);

    /* renamed from: q */
    private static final String f31761q = Util.intToStringMaxRadix(15);

    /* renamed from: r */
    private static final String f31762r = Util.intToStringMaxRadix(16);

    /* renamed from: s */
    private static final String f31763s = Util.intToStringMaxRadix(17);

    /* renamed from: t */
    private static final String f31764t = Util.intToStringMaxRadix(18);

    /* renamed from: u */
    private static final String f31765u = Util.intToStringMaxRadix(19);

    /* renamed from: v */
    private static final String f31766v = Util.intToStringMaxRadix(20);

    /* renamed from: w */
    private static final String f31767w = Util.intToStringMaxRadix(21);

    /* renamed from: x */
    private static final String f31768x = Util.intToStringMaxRadix(22);

    /* renamed from: y */
    private static final String f31769y = Util.intToStringMaxRadix(23);

    /* renamed from: z */
    private static final String f31770z = Util.intToStringMaxRadix(24);

    /* renamed from: A */
    private static final String f31738A = Util.intToStringMaxRadix(25);

    /* renamed from: B */
    private static final String f31739B = Util.intToStringMaxRadix(26);

    /* renamed from: C */
    private static final String f31740C = Util.intToStringMaxRadix(27);

    /* renamed from: D */
    private static final String f31741D = Util.intToStringMaxRadix(28);

    /* renamed from: E */
    private static final String f31742E = Util.intToStringMaxRadix(29);

    /* renamed from: F */
    private static final String f31743F = Util.intToStringMaxRadix(30);

    /* renamed from: G */
    private static final String f31744G = Util.intToStringMaxRadix(31);

    /* renamed from: H */
    private static final String f31745H = Util.intToStringMaxRadix(32);

    /* renamed from: I */
    private static final String f31746I = Util.intToStringMaxRadix(1000);
    public static final Bundleable.Creator<MediaMetadata> CREATOR = new Bundleable.Creator() { // from class: com.google.android.exoplayer2.w1
        @Override // com.google.android.exoplayer2.Bundleable.Creator
        public final Bundleable fromBundle(Bundle bundle) {
            return MediaMetadata.m75699a(bundle);
        }
    };

    /* loaded from: classes4.dex */
    public static final class Builder {
        @Nullable

        /* renamed from: A */
        private Integer f31771A;
        @Nullable

        /* renamed from: B */
        private Integer f31772B;
        @Nullable

        /* renamed from: C */
        private CharSequence f31773C;
        @Nullable

        /* renamed from: D */
        private CharSequence f31774D;
        @Nullable

        /* renamed from: E */
        private CharSequence f31775E;
        @Nullable

        /* renamed from: F */
        private Integer f31776F;
        @Nullable

        /* renamed from: G */
        private Bundle f31777G;
        @Nullable

        /* renamed from: a */
        private CharSequence f31778a;
        @Nullable

        /* renamed from: b */
        private CharSequence f31779b;
        @Nullable

        /* renamed from: c */
        private CharSequence f31780c;
        @Nullable

        /* renamed from: d */
        private CharSequence f31781d;
        @Nullable

        /* renamed from: e */
        private CharSequence f31782e;
        @Nullable

        /* renamed from: f */
        private CharSequence f31783f;
        @Nullable

        /* renamed from: g */
        private CharSequence f31784g;
        @Nullable

        /* renamed from: h */
        private Rating f31785h;
        @Nullable

        /* renamed from: i */
        private Rating f31786i;
        @Nullable

        /* renamed from: j */
        private byte[] f31787j;
        @Nullable

        /* renamed from: k */
        private Integer f31788k;
        @Nullable

        /* renamed from: l */
        private Uri f31789l;
        @Nullable

        /* renamed from: m */
        private Integer f31790m;
        @Nullable

        /* renamed from: n */
        private Integer f31791n;
        @Nullable

        /* renamed from: o */
        private Integer f31792o;
        @Nullable

        /* renamed from: p */
        private Boolean f31793p;
        @Nullable

        /* renamed from: q */
        private Boolean f31794q;
        @Nullable

        /* renamed from: r */
        private Integer f31795r;
        @Nullable

        /* renamed from: s */
        private Integer f31796s;
        @Nullable

        /* renamed from: t */
        private Integer f31797t;
        @Nullable

        /* renamed from: u */
        private Integer f31798u;
        @Nullable

        /* renamed from: v */
        private Integer f31799v;
        @Nullable

        /* renamed from: w */
        private Integer f31800w;
        @Nullable

        /* renamed from: x */
        private CharSequence f31801x;
        @Nullable

        /* renamed from: y */
        private CharSequence f31802y;
        @Nullable

        /* renamed from: z */
        private CharSequence f31803z;

        public Builder() {
        }

        public MediaMetadata build() {
            return new MediaMetadata(this);
        }

        @CanIgnoreReturnValue
        public Builder maybeSetArtworkData(byte[] bArr, int i) {
            if (this.f31787j == null || Util.areEqual(Integer.valueOf(i), 3) || !Util.areEqual(this.f31788k, 3)) {
                this.f31787j = (byte[]) bArr.clone();
                this.f31788k = Integer.valueOf(i);
            }
            return this;
        }

        @CanIgnoreReturnValue
        public Builder populate(@Nullable MediaMetadata mediaMetadata) {
            if (mediaMetadata == null) {
                return this;
            }
            CharSequence charSequence = mediaMetadata.title;
            if (charSequence != null) {
                setTitle(charSequence);
            }
            CharSequence charSequence2 = mediaMetadata.artist;
            if (charSequence2 != null) {
                setArtist(charSequence2);
            }
            CharSequence charSequence3 = mediaMetadata.albumTitle;
            if (charSequence3 != null) {
                setAlbumTitle(charSequence3);
            }
            CharSequence charSequence4 = mediaMetadata.albumArtist;
            if (charSequence4 != null) {
                setAlbumArtist(charSequence4);
            }
            CharSequence charSequence5 = mediaMetadata.displayTitle;
            if (charSequence5 != null) {
                setDisplayTitle(charSequence5);
            }
            CharSequence charSequence6 = mediaMetadata.subtitle;
            if (charSequence6 != null) {
                setSubtitle(charSequence6);
            }
            CharSequence charSequence7 = mediaMetadata.description;
            if (charSequence7 != null) {
                setDescription(charSequence7);
            }
            Rating rating = mediaMetadata.userRating;
            if (rating != null) {
                setUserRating(rating);
            }
            Rating rating2 = mediaMetadata.overallRating;
            if (rating2 != null) {
                setOverallRating(rating2);
            }
            byte[] bArr = mediaMetadata.artworkData;
            if (bArr != null) {
                setArtworkData(bArr, mediaMetadata.artworkDataType);
            }
            Uri uri = mediaMetadata.artworkUri;
            if (uri != null) {
                setArtworkUri(uri);
            }
            Integer num = mediaMetadata.trackNumber;
            if (num != null) {
                setTrackNumber(num);
            }
            Integer num2 = mediaMetadata.totalTrackCount;
            if (num2 != null) {
                setTotalTrackCount(num2);
            }
            Integer num3 = mediaMetadata.folderType;
            if (num3 != null) {
                setFolderType(num3);
            }
            Boolean bool = mediaMetadata.isBrowsable;
            if (bool != null) {
                setIsBrowsable(bool);
            }
            Boolean bool2 = mediaMetadata.isPlayable;
            if (bool2 != null) {
                setIsPlayable(bool2);
            }
            Integer num4 = mediaMetadata.year;
            if (num4 != null) {
                setRecordingYear(num4);
            }
            Integer num5 = mediaMetadata.recordingYear;
            if (num5 != null) {
                setRecordingYear(num5);
            }
            Integer num6 = mediaMetadata.recordingMonth;
            if (num6 != null) {
                setRecordingMonth(num6);
            }
            Integer num7 = mediaMetadata.recordingDay;
            if (num7 != null) {
                setRecordingDay(num7);
            }
            Integer num8 = mediaMetadata.releaseYear;
            if (num8 != null) {
                setReleaseYear(num8);
            }
            Integer num9 = mediaMetadata.releaseMonth;
            if (num9 != null) {
                setReleaseMonth(num9);
            }
            Integer num10 = mediaMetadata.releaseDay;
            if (num10 != null) {
                setReleaseDay(num10);
            }
            CharSequence charSequence8 = mediaMetadata.writer;
            if (charSequence8 != null) {
                setWriter(charSequence8);
            }
            CharSequence charSequence9 = mediaMetadata.composer;
            if (charSequence9 != null) {
                setComposer(charSequence9);
            }
            CharSequence charSequence10 = mediaMetadata.conductor;
            if (charSequence10 != null) {
                setConductor(charSequence10);
            }
            Integer num11 = mediaMetadata.discNumber;
            if (num11 != null) {
                setDiscNumber(num11);
            }
            Integer num12 = mediaMetadata.totalDiscCount;
            if (num12 != null) {
                setTotalDiscCount(num12);
            }
            CharSequence charSequence11 = mediaMetadata.genre;
            if (charSequence11 != null) {
                setGenre(charSequence11);
            }
            CharSequence charSequence12 = mediaMetadata.compilation;
            if (charSequence12 != null) {
                setCompilation(charSequence12);
            }
            CharSequence charSequence13 = mediaMetadata.station;
            if (charSequence13 != null) {
                setStation(charSequence13);
            }
            Integer num13 = mediaMetadata.mediaType;
            if (num13 != null) {
                setMediaType(num13);
            }
            Bundle bundle = mediaMetadata.extras;
            if (bundle != null) {
                setExtras(bundle);
            }
            return this;
        }

        @CanIgnoreReturnValue
        public Builder populateFromMetadata(Metadata metadata) {
            for (int i = 0; i < metadata.length(); i++) {
                metadata.get(i).populateMediaMetadata(this);
            }
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setAlbumArtist(@Nullable CharSequence charSequence) {
            this.f31781d = charSequence;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setAlbumTitle(@Nullable CharSequence charSequence) {
            this.f31780c = charSequence;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setArtist(@Nullable CharSequence charSequence) {
            this.f31779b = charSequence;
            return this;
        }

        @CanIgnoreReturnValue
        @Deprecated
        public Builder setArtworkData(@Nullable byte[] bArr) {
            return setArtworkData(bArr, null);
        }

        @CanIgnoreReturnValue
        public Builder setArtworkUri(@Nullable Uri uri) {
            this.f31789l = uri;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setCompilation(@Nullable CharSequence charSequence) {
            this.f31774D = charSequence;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setComposer(@Nullable CharSequence charSequence) {
            this.f31802y = charSequence;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setConductor(@Nullable CharSequence charSequence) {
            this.f31803z = charSequence;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setDescription(@Nullable CharSequence charSequence) {
            this.f31784g = charSequence;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setDiscNumber(@Nullable Integer num) {
            this.f31771A = num;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setDisplayTitle(@Nullable CharSequence charSequence) {
            this.f31782e = charSequence;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setExtras(@Nullable Bundle bundle) {
            this.f31777G = bundle;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setFolderType(@Nullable Integer num) {
            this.f31792o = num;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setGenre(@Nullable CharSequence charSequence) {
            this.f31773C = charSequence;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setIsBrowsable(@Nullable Boolean bool) {
            this.f31793p = bool;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setIsPlayable(@Nullable Boolean bool) {
            this.f31794q = bool;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setMediaType(@Nullable Integer num) {
            this.f31776F = num;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setOverallRating(@Nullable Rating rating) {
            this.f31786i = rating;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setRecordingDay(@IntRange(from = 1, m105510to = 31) @Nullable Integer num) {
            this.f31797t = num;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setRecordingMonth(@IntRange(from = 1, m105510to = 12) @Nullable Integer num) {
            this.f31796s = num;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setRecordingYear(@Nullable Integer num) {
            this.f31795r = num;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setReleaseDay(@IntRange(from = 1, m105510to = 31) @Nullable Integer num) {
            this.f31800w = num;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setReleaseMonth(@IntRange(from = 1, m105510to = 12) @Nullable Integer num) {
            this.f31799v = num;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setReleaseYear(@Nullable Integer num) {
            this.f31798u = num;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setStation(@Nullable CharSequence charSequence) {
            this.f31775E = charSequence;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setSubtitle(@Nullable CharSequence charSequence) {
            this.f31783f = charSequence;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setTitle(@Nullable CharSequence charSequence) {
            this.f31778a = charSequence;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setTotalDiscCount(@Nullable Integer num) {
            this.f31772B = num;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setTotalTrackCount(@Nullable Integer num) {
            this.f31791n = num;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setTrackNumber(@Nullable Integer num) {
            this.f31790m = num;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setUserRating(@Nullable Rating rating) {
            this.f31785h = rating;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setWriter(@Nullable CharSequence charSequence) {
            this.f31801x = charSequence;
            return this;
        }

        @CanIgnoreReturnValue
        @Deprecated
        public Builder setYear(@Nullable Integer num) {
            return setRecordingYear(num);
        }

        private Builder(MediaMetadata mediaMetadata) {
            this.f31778a = mediaMetadata.title;
            this.f31779b = mediaMetadata.artist;
            this.f31780c = mediaMetadata.albumTitle;
            this.f31781d = mediaMetadata.albumArtist;
            this.f31782e = mediaMetadata.displayTitle;
            this.f31783f = mediaMetadata.subtitle;
            this.f31784g = mediaMetadata.description;
            this.f31785h = mediaMetadata.userRating;
            this.f31786i = mediaMetadata.overallRating;
            this.f31787j = mediaMetadata.artworkData;
            this.f31788k = mediaMetadata.artworkDataType;
            this.f31789l = mediaMetadata.artworkUri;
            this.f31790m = mediaMetadata.trackNumber;
            this.f31791n = mediaMetadata.totalTrackCount;
            this.f31792o = mediaMetadata.folderType;
            this.f31793p = mediaMetadata.isBrowsable;
            this.f31794q = mediaMetadata.isPlayable;
            this.f31795r = mediaMetadata.recordingYear;
            this.f31796s = mediaMetadata.recordingMonth;
            this.f31797t = mediaMetadata.recordingDay;
            this.f31798u = mediaMetadata.releaseYear;
            this.f31799v = mediaMetadata.releaseMonth;
            this.f31800w = mediaMetadata.releaseDay;
            this.f31801x = mediaMetadata.writer;
            this.f31802y = mediaMetadata.composer;
            this.f31803z = mediaMetadata.conductor;
            this.f31771A = mediaMetadata.discNumber;
            this.f31772B = mediaMetadata.totalDiscCount;
            this.f31773C = mediaMetadata.genre;
            this.f31774D = mediaMetadata.compilation;
            this.f31775E = mediaMetadata.station;
            this.f31776F = mediaMetadata.mediaType;
            this.f31777G = mediaMetadata.extras;
        }

        @CanIgnoreReturnValue
        public Builder setArtworkData(@Nullable byte[] bArr, @Nullable Integer num) {
            this.f31787j = bArr == null ? null : (byte[]) bArr.clone();
            this.f31788k = num;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder populateFromMetadata(List<Metadata> list) {
            for (int i = 0; i < list.size(); i++) {
                Metadata metadata = list.get(i);
                for (int i2 = 0; i2 < metadata.length(); i2++) {
                    metadata.get(i2).populateMediaMetadata(this);
                }
            }
            return this;
        }
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface FolderType {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface MediaType {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface PictureType {
    }

    /* renamed from: a */
    public static /* synthetic */ MediaMetadata m75699a(Bundle bundle) {
        return m75698b(bundle);
    }

    /* renamed from: b */
    public static MediaMetadata m75698b(Bundle bundle) {
        Integer num;
        Bundle bundle2;
        Bundle bundle3;
        Builder builder = new Builder();
        Builder description = builder.setTitle(bundle.getCharSequence(f31747b)).setArtist(bundle.getCharSequence(f31748c)).setAlbumTitle(bundle.getCharSequence(f31749d)).setAlbumArtist(bundle.getCharSequence(f31750f)).setDisplayTitle(bundle.getCharSequence(f31751g)).setSubtitle(bundle.getCharSequence(f31752h)).setDescription(bundle.getCharSequence(f31753i));
        byte[] byteArray = bundle.getByteArray(f31756l);
        String str = f31742E;
        if (bundle.containsKey(str)) {
            num = Integer.valueOf(bundle.getInt(str));
        } else {
            num = null;
        }
        description.setArtworkData(byteArray, num).setArtworkUri((Uri) bundle.getParcelable(f31757m)).setWriter(bundle.getCharSequence(f31768x)).setComposer(bundle.getCharSequence(f31769y)).setConductor(bundle.getCharSequence(f31770z)).setGenre(bundle.getCharSequence(f31740C)).setCompilation(bundle.getCharSequence(f31741D)).setStation(bundle.getCharSequence(f31743F)).setExtras(bundle.getBundle(f31746I));
        String str2 = f31754j;
        if (bundle.containsKey(str2) && (bundle3 = bundle.getBundle(str2)) != null) {
            builder.setUserRating(Rating.CREATOR.fromBundle(bundle3));
        }
        String str3 = f31755k;
        if (bundle.containsKey(str3) && (bundle2 = bundle.getBundle(str3)) != null) {
            builder.setOverallRating(Rating.CREATOR.fromBundle(bundle2));
        }
        String str4 = f31758n;
        if (bundle.containsKey(str4)) {
            builder.setTrackNumber(Integer.valueOf(bundle.getInt(str4)));
        }
        String str5 = f31759o;
        if (bundle.containsKey(str5)) {
            builder.setTotalTrackCount(Integer.valueOf(bundle.getInt(str5)));
        }
        String str6 = f31760p;
        if (bundle.containsKey(str6)) {
            builder.setFolderType(Integer.valueOf(bundle.getInt(str6)));
        }
        String str7 = f31745H;
        if (bundle.containsKey(str7)) {
            builder.setIsBrowsable(Boolean.valueOf(bundle.getBoolean(str7)));
        }
        String str8 = f31761q;
        if (bundle.containsKey(str8)) {
            builder.setIsPlayable(Boolean.valueOf(bundle.getBoolean(str8)));
        }
        String str9 = f31762r;
        if (bundle.containsKey(str9)) {
            builder.setRecordingYear(Integer.valueOf(bundle.getInt(str9)));
        }
        String str10 = f31763s;
        if (bundle.containsKey(str10)) {
            builder.setRecordingMonth(Integer.valueOf(bundle.getInt(str10)));
        }
        String str11 = f31764t;
        if (bundle.containsKey(str11)) {
            builder.setRecordingDay(Integer.valueOf(bundle.getInt(str11)));
        }
        String str12 = f31765u;
        if (bundle.containsKey(str12)) {
            builder.setReleaseYear(Integer.valueOf(bundle.getInt(str12)));
        }
        String str13 = f31766v;
        if (bundle.containsKey(str13)) {
            builder.setReleaseMonth(Integer.valueOf(bundle.getInt(str13)));
        }
        String str14 = f31767w;
        if (bundle.containsKey(str14)) {
            builder.setReleaseDay(Integer.valueOf(bundle.getInt(str14)));
        }
        String str15 = f31738A;
        if (bundle.containsKey(str15)) {
            builder.setDiscNumber(Integer.valueOf(bundle.getInt(str15)));
        }
        String str16 = f31739B;
        if (bundle.containsKey(str16)) {
            builder.setTotalDiscCount(Integer.valueOf(bundle.getInt(str16)));
        }
        String str17 = f31744G;
        if (bundle.containsKey(str17)) {
            builder.setMediaType(Integer.valueOf(bundle.getInt(str17)));
        }
        return builder.build();
    }

    /* renamed from: c */
    private static int m75697c(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
                return 1;
            case 20:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            default:
                return 0;
            case 21:
                return 2;
            case 22:
                return 3;
            case 23:
                return 4;
            case 24:
                return 5;
            case 25:
                return 6;
        }
    }

    /* renamed from: d */
    private static int m75696d(int i) {
        switch (i) {
            case 1:
                return 0;
            case 2:
                return 21;
            case 3:
                return 22;
            case 4:
                return 23;
            case 5:
                return 24;
            case 6:
                return 25;
            default:
                return 20;
        }
    }

    public Builder buildUpon() {
        return new Builder();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MediaMetadata.class != obj.getClass()) {
            return false;
        }
        MediaMetadata mediaMetadata = (MediaMetadata) obj;
        if (Util.areEqual(this.title, mediaMetadata.title) && Util.areEqual(this.artist, mediaMetadata.artist) && Util.areEqual(this.albumTitle, mediaMetadata.albumTitle) && Util.areEqual(this.albumArtist, mediaMetadata.albumArtist) && Util.areEqual(this.displayTitle, mediaMetadata.displayTitle) && Util.areEqual(this.subtitle, mediaMetadata.subtitle) && Util.areEqual(this.description, mediaMetadata.description) && Util.areEqual(this.userRating, mediaMetadata.userRating) && Util.areEqual(this.overallRating, mediaMetadata.overallRating) && Arrays.equals(this.artworkData, mediaMetadata.artworkData) && Util.areEqual(this.artworkDataType, mediaMetadata.artworkDataType) && Util.areEqual(this.artworkUri, mediaMetadata.artworkUri) && Util.areEqual(this.trackNumber, mediaMetadata.trackNumber) && Util.areEqual(this.totalTrackCount, mediaMetadata.totalTrackCount) && Util.areEqual(this.folderType, mediaMetadata.folderType) && Util.areEqual(this.isBrowsable, mediaMetadata.isBrowsable) && Util.areEqual(this.isPlayable, mediaMetadata.isPlayable) && Util.areEqual(this.recordingYear, mediaMetadata.recordingYear) && Util.areEqual(this.recordingMonth, mediaMetadata.recordingMonth) && Util.areEqual(this.recordingDay, mediaMetadata.recordingDay) && Util.areEqual(this.releaseYear, mediaMetadata.releaseYear) && Util.areEqual(this.releaseMonth, mediaMetadata.releaseMonth) && Util.areEqual(this.releaseDay, mediaMetadata.releaseDay) && Util.areEqual(this.writer, mediaMetadata.writer) && Util.areEqual(this.composer, mediaMetadata.composer) && Util.areEqual(this.conductor, mediaMetadata.conductor) && Util.areEqual(this.discNumber, mediaMetadata.discNumber) && Util.areEqual(this.totalDiscCount, mediaMetadata.totalDiscCount) && Util.areEqual(this.genre, mediaMetadata.genre) && Util.areEqual(this.compilation, mediaMetadata.compilation) && Util.areEqual(this.station, mediaMetadata.station) && Util.areEqual(this.mediaType, mediaMetadata.mediaType)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(this.title, this.artist, this.albumTitle, this.albumArtist, this.displayTitle, this.subtitle, this.description, this.userRating, this.overallRating, Integer.valueOf(Arrays.hashCode(this.artworkData)), this.artworkDataType, this.artworkUri, this.trackNumber, this.totalTrackCount, this.folderType, this.isBrowsable, this.isPlayable, this.recordingYear, this.recordingMonth, this.recordingDay, this.releaseYear, this.releaseMonth, this.releaseDay, this.writer, this.composer, this.conductor, this.discNumber, this.totalDiscCount, this.genre, this.compilation, this.station, this.mediaType);
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.title;
        if (charSequence != null) {
            bundle.putCharSequence(f31747b, charSequence);
        }
        CharSequence charSequence2 = this.artist;
        if (charSequence2 != null) {
            bundle.putCharSequence(f31748c, charSequence2);
        }
        CharSequence charSequence3 = this.albumTitle;
        if (charSequence3 != null) {
            bundle.putCharSequence(f31749d, charSequence3);
        }
        CharSequence charSequence4 = this.albumArtist;
        if (charSequence4 != null) {
            bundle.putCharSequence(f31750f, charSequence4);
        }
        CharSequence charSequence5 = this.displayTitle;
        if (charSequence5 != null) {
            bundle.putCharSequence(f31751g, charSequence5);
        }
        CharSequence charSequence6 = this.subtitle;
        if (charSequence6 != null) {
            bundle.putCharSequence(f31752h, charSequence6);
        }
        CharSequence charSequence7 = this.description;
        if (charSequence7 != null) {
            bundle.putCharSequence(f31753i, charSequence7);
        }
        byte[] bArr = this.artworkData;
        if (bArr != null) {
            bundle.putByteArray(f31756l, bArr);
        }
        Uri uri = this.artworkUri;
        if (uri != null) {
            bundle.putParcelable(f31757m, uri);
        }
        CharSequence charSequence8 = this.writer;
        if (charSequence8 != null) {
            bundle.putCharSequence(f31768x, charSequence8);
        }
        CharSequence charSequence9 = this.composer;
        if (charSequence9 != null) {
            bundle.putCharSequence(f31769y, charSequence9);
        }
        CharSequence charSequence10 = this.conductor;
        if (charSequence10 != null) {
            bundle.putCharSequence(f31770z, charSequence10);
        }
        CharSequence charSequence11 = this.genre;
        if (charSequence11 != null) {
            bundle.putCharSequence(f31740C, charSequence11);
        }
        CharSequence charSequence12 = this.compilation;
        if (charSequence12 != null) {
            bundle.putCharSequence(f31741D, charSequence12);
        }
        CharSequence charSequence13 = this.station;
        if (charSequence13 != null) {
            bundle.putCharSequence(f31743F, charSequence13);
        }
        Rating rating = this.userRating;
        if (rating != null) {
            bundle.putBundle(f31754j, rating.toBundle());
        }
        Rating rating2 = this.overallRating;
        if (rating2 != null) {
            bundle.putBundle(f31755k, rating2.toBundle());
        }
        Integer num = this.trackNumber;
        if (num != null) {
            bundle.putInt(f31758n, num.intValue());
        }
        Integer num2 = this.totalTrackCount;
        if (num2 != null) {
            bundle.putInt(f31759o, num2.intValue());
        }
        Integer num3 = this.folderType;
        if (num3 != null) {
            bundle.putInt(f31760p, num3.intValue());
        }
        Boolean bool = this.isBrowsable;
        if (bool != null) {
            bundle.putBoolean(f31745H, bool.booleanValue());
        }
        Boolean bool2 = this.isPlayable;
        if (bool2 != null) {
            bundle.putBoolean(f31761q, bool2.booleanValue());
        }
        Integer num4 = this.recordingYear;
        if (num4 != null) {
            bundle.putInt(f31762r, num4.intValue());
        }
        Integer num5 = this.recordingMonth;
        if (num5 != null) {
            bundle.putInt(f31763s, num5.intValue());
        }
        Integer num6 = this.recordingDay;
        if (num6 != null) {
            bundle.putInt(f31764t, num6.intValue());
        }
        Integer num7 = this.releaseYear;
        if (num7 != null) {
            bundle.putInt(f31765u, num7.intValue());
        }
        Integer num8 = this.releaseMonth;
        if (num8 != null) {
            bundle.putInt(f31766v, num8.intValue());
        }
        Integer num9 = this.releaseDay;
        if (num9 != null) {
            bundle.putInt(f31767w, num9.intValue());
        }
        Integer num10 = this.discNumber;
        if (num10 != null) {
            bundle.putInt(f31738A, num10.intValue());
        }
        Integer num11 = this.totalDiscCount;
        if (num11 != null) {
            bundle.putInt(f31739B, num11.intValue());
        }
        Integer num12 = this.artworkDataType;
        if (num12 != null) {
            bundle.putInt(f31742E, num12.intValue());
        }
        Integer num13 = this.mediaType;
        if (num13 != null) {
            bundle.putInt(f31744G, num13.intValue());
        }
        Bundle bundle2 = this.extras;
        if (bundle2 != null) {
            bundle.putBundle(f31746I, bundle2);
        }
        return bundle;
    }

    private MediaMetadata(Builder builder) {
        Boolean bool = builder.f31793p;
        Integer num = builder.f31792o;
        Integer num2 = builder.f31776F;
        if (bool != null) {
            if (!bool.booleanValue()) {
                num = -1;
            } else if (num == null || num.intValue() == -1) {
                num = Integer.valueOf(num2 != null ? m75697c(num2.intValue()) : 0);
            }
        } else if (num != null) {
            bool = Boolean.valueOf(num.intValue() != -1);
            if (bool.booleanValue() && num2 == null) {
                num2 = Integer.valueOf(m75696d(num.intValue()));
            }
        }
        this.title = builder.f31778a;
        this.artist = builder.f31779b;
        this.albumTitle = builder.f31780c;
        this.albumArtist = builder.f31781d;
        this.displayTitle = builder.f31782e;
        this.subtitle = builder.f31783f;
        this.description = builder.f31784g;
        this.userRating = builder.f31785h;
        this.overallRating = builder.f31786i;
        this.artworkData = builder.f31787j;
        this.artworkDataType = builder.f31788k;
        this.artworkUri = builder.f31789l;
        this.trackNumber = builder.f31790m;
        this.totalTrackCount = builder.f31791n;
        this.folderType = num;
        this.isBrowsable = bool;
        this.isPlayable = builder.f31794q;
        this.year = builder.f31795r;
        this.recordingYear = builder.f31795r;
        this.recordingMonth = builder.f31796s;
        this.recordingDay = builder.f31797t;
        this.releaseYear = builder.f31798u;
        this.releaseMonth = builder.f31799v;
        this.releaseDay = builder.f31800w;
        this.writer = builder.f31801x;
        this.composer = builder.f31802y;
        this.conductor = builder.f31803z;
        this.discNumber = builder.f31771A;
        this.totalDiscCount = builder.f31772B;
        this.genre = builder.f31773C;
        this.compilation = builder.f31774D;
        this.station = builder.f31775E;
        this.mediaType = num2;
        this.extras = builder.f31777G;
    }
}
