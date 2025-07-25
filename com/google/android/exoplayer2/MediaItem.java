package com.google.android.exoplayer2;

import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.InlineMe;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes4.dex */
public final class MediaItem implements Bundleable {
    public static final String DEFAULT_MEDIA_ID = "";
    public final ClippingConfiguration clippingConfiguration;
    @Deprecated
    public final ClippingProperties clippingProperties;
    public final LiveConfiguration liveConfiguration;
    @Nullable
    public final LocalConfiguration localConfiguration;
    public final String mediaId;
    public final MediaMetadata mediaMetadata;
    @Nullable
    @Deprecated
    public final PlaybackProperties playbackProperties;
    public final RequestMetadata requestMetadata;
    public static final MediaItem EMPTY = new Builder().build();

    /* renamed from: b */
    private static final String f31675b = Util.intToStringMaxRadix(0);

    /* renamed from: c */
    private static final String f31676c = Util.intToStringMaxRadix(1);

    /* renamed from: d */
    private static final String f31677d = Util.intToStringMaxRadix(2);

    /* renamed from: f */
    private static final String f31678f = Util.intToStringMaxRadix(3);

    /* renamed from: g */
    private static final String f31679g = Util.intToStringMaxRadix(4);
    public static final Bundleable.Creator<MediaItem> CREATOR = new Bundleable.Creator() { // from class: com.google.android.exoplayer2.s1
        @Override // com.google.android.exoplayer2.Bundleable.Creator
        public final Bundleable fromBundle(Bundle bundle) {
            return MediaItem.m75742a(bundle);
        }
    };

    /* loaded from: classes4.dex */
    public static final class AdsConfiguration {
        public final Uri adTagUri;
        @Nullable
        public final Object adsId;

        /* loaded from: classes4.dex */
        public static final class Builder {

            /* renamed from: a */
            private Uri f31680a;
            @Nullable

            /* renamed from: b */
            private Object f31681b;

            public Builder(Uri uri) {
                this.f31680a = uri;
            }

            public AdsConfiguration build() {
                return new AdsConfiguration(this);
            }

            @CanIgnoreReturnValue
            public Builder setAdTagUri(Uri uri) {
                this.f31680a = uri;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setAdsId(@Nullable Object obj) {
                this.f31681b = obj;
                return this;
            }
        }

        public Builder buildUpon() {
            return new Builder(this.adTagUri).setAdsId(this.adsId);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AdsConfiguration)) {
                return false;
            }
            AdsConfiguration adsConfiguration = (AdsConfiguration) obj;
            if (this.adTagUri.equals(adsConfiguration.adTagUri) && Util.areEqual(this.adsId, adsConfiguration.adsId)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i;
            int hashCode = this.adTagUri.hashCode() * 31;
            Object obj = this.adsId;
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            return hashCode + i;
        }

        private AdsConfiguration(Builder builder) {
            this.adTagUri = builder.f31680a;
            this.adsId = builder.f31681b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class Builder {
        @Nullable

        /* renamed from: a */
        private String f31682a;
        @Nullable

        /* renamed from: b */
        private Uri f31683b;
        @Nullable

        /* renamed from: c */
        private String f31684c;

        /* renamed from: d */
        private ClippingConfiguration.Builder f31685d;

        /* renamed from: e */
        private DrmConfiguration.Builder f31686e;

        /* renamed from: f */
        private List<StreamKey> f31687f;
        @Nullable

        /* renamed from: g */
        private String f31688g;

        /* renamed from: h */
        private ImmutableList<SubtitleConfiguration> f31689h;
        @Nullable

        /* renamed from: i */
        private AdsConfiguration f31690i;
        @Nullable

        /* renamed from: j */
        private Object f31691j;
        @Nullable

        /* renamed from: k */
        private MediaMetadata f31692k;

        /* renamed from: l */
        private LiveConfiguration.Builder f31693l;

        /* renamed from: m */
        private RequestMetadata f31694m;

        public MediaItem build() {
            boolean z;
            PlaybackProperties playbackProperties;
            if (this.f31686e.f31707b != null && this.f31686e.f31706a == null) {
                z = false;
            } else {
                z = true;
            }
            Assertions.checkState(z);
            Uri uri = this.f31683b;
            DrmConfiguration drmConfiguration = null;
            if (uri != null) {
                String str = this.f31684c;
                if (this.f31686e.f31706a != null) {
                    drmConfiguration = this.f31686e.build();
                }
                playbackProperties = new PlaybackProperties(uri, str, drmConfiguration, this.f31690i, this.f31687f, this.f31688g, this.f31689h, this.f31691j);
            } else {
                playbackProperties = null;
            }
            String str2 = this.f31682a;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = str2;
            ClippingProperties buildClippingProperties = this.f31685d.buildClippingProperties();
            LiveConfiguration build = this.f31693l.build();
            MediaMetadata mediaMetadata = this.f31692k;
            if (mediaMetadata == null) {
                mediaMetadata = MediaMetadata.EMPTY;
            }
            return new MediaItem(str3, buildClippingProperties, playbackProperties, build, mediaMetadata, this.f31694m);
        }

        @CanIgnoreReturnValue
        @Deprecated
        public Builder setAdTagUri(@Nullable String str) {
            return setAdTagUri(str != null ? Uri.parse(str) : null);
        }

        @CanIgnoreReturnValue
        public Builder setAdsConfiguration(@Nullable AdsConfiguration adsConfiguration) {
            this.f31690i = adsConfiguration;
            return this;
        }

        @CanIgnoreReturnValue
        @Deprecated
        public Builder setClipEndPositionMs(long j) {
            this.f31685d.setEndPositionMs(j);
            return this;
        }

        @CanIgnoreReturnValue
        @Deprecated
        public Builder setClipRelativeToDefaultPosition(boolean z) {
            this.f31685d.setRelativeToDefaultPosition(z);
            return this;
        }

        @CanIgnoreReturnValue
        @Deprecated
        public Builder setClipRelativeToLiveWindow(boolean z) {
            this.f31685d.setRelativeToLiveWindow(z);
            return this;
        }

        @CanIgnoreReturnValue
        @Deprecated
        public Builder setClipStartPositionMs(@IntRange(from = 0) long j) {
            this.f31685d.setStartPositionMs(j);
            return this;
        }

        @CanIgnoreReturnValue
        @Deprecated
        public Builder setClipStartsAtKeyFrame(boolean z) {
            this.f31685d.setStartsAtKeyFrame(z);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setClippingConfiguration(ClippingConfiguration clippingConfiguration) {
            this.f31685d = clippingConfiguration.buildUpon();
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setCustomCacheKey(@Nullable String str) {
            this.f31688g = str;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setDrmConfiguration(@Nullable DrmConfiguration drmConfiguration) {
            DrmConfiguration.Builder builder;
            if (drmConfiguration != null) {
                builder = drmConfiguration.buildUpon();
            } else {
                builder = new DrmConfiguration.Builder();
            }
            this.f31686e = builder;
            return this;
        }

        @CanIgnoreReturnValue
        @Deprecated
        public Builder setDrmForceDefaultLicenseUri(boolean z) {
            this.f31686e.setForceDefaultLicenseUri(z);
            return this;
        }

        @CanIgnoreReturnValue
        @Deprecated
        public Builder setDrmKeySetId(@Nullable byte[] bArr) {
            this.f31686e.setKeySetId(bArr);
            return this;
        }

        @CanIgnoreReturnValue
        @Deprecated
        public Builder setDrmLicenseRequestHeaders(@Nullable Map<String, String> map) {
            DrmConfiguration.Builder builder = this.f31686e;
            if (map == null) {
                map = ImmutableMap.m69397of();
            }
            builder.setLicenseRequestHeaders(map);
            return this;
        }

        @CanIgnoreReturnValue
        @Deprecated
        public Builder setDrmLicenseUri(@Nullable Uri uri) {
            this.f31686e.setLicenseUri(uri);
            return this;
        }

        @CanIgnoreReturnValue
        @Deprecated
        public Builder setDrmMultiSession(boolean z) {
            this.f31686e.setMultiSession(z);
            return this;
        }

        @CanIgnoreReturnValue
        @Deprecated
        public Builder setDrmPlayClearContentWithoutKey(boolean z) {
            this.f31686e.setPlayClearContentWithoutKey(z);
            return this;
        }

        @CanIgnoreReturnValue
        @Deprecated
        public Builder setDrmSessionForClearPeriods(boolean z) {
            this.f31686e.setForceSessionsForAudioAndVideoTracks(z);
            return this;
        }

        @CanIgnoreReturnValue
        @Deprecated
        public Builder setDrmSessionForClearTypes(@Nullable List<Integer> list) {
            DrmConfiguration.Builder builder = this.f31686e;
            if (list == null) {
                list = ImmutableList.m69424of();
            }
            builder.setForcedSessionTrackTypes(list);
            return this;
        }

        @CanIgnoreReturnValue
        @Deprecated
        public Builder setDrmUuid(@Nullable UUID uuid) {
            this.f31686e.m75721j(uuid);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setLiveConfiguration(LiveConfiguration liveConfiguration) {
            this.f31693l = liveConfiguration.buildUpon();
            return this;
        }

        @CanIgnoreReturnValue
        @Deprecated
        public Builder setLiveMaxOffsetMs(long j) {
            this.f31693l.setMaxOffsetMs(j);
            return this;
        }

        @CanIgnoreReturnValue
        @Deprecated
        public Builder setLiveMaxPlaybackSpeed(float f) {
            this.f31693l.setMaxPlaybackSpeed(f);
            return this;
        }

        @CanIgnoreReturnValue
        @Deprecated
        public Builder setLiveMinOffsetMs(long j) {
            this.f31693l.setMinOffsetMs(j);
            return this;
        }

        @CanIgnoreReturnValue
        @Deprecated
        public Builder setLiveMinPlaybackSpeed(float f) {
            this.f31693l.setMinPlaybackSpeed(f);
            return this;
        }

        @CanIgnoreReturnValue
        @Deprecated
        public Builder setLiveTargetOffsetMs(long j) {
            this.f31693l.setTargetOffsetMs(j);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setMediaId(String str) {
            this.f31682a = (String) Assertions.checkNotNull(str);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setMediaMetadata(MediaMetadata mediaMetadata) {
            this.f31692k = mediaMetadata;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setMimeType(@Nullable String str) {
            this.f31684c = str;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setRequestMetadata(RequestMetadata requestMetadata) {
            this.f31694m = requestMetadata;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setStreamKeys(@Nullable List<StreamKey> list) {
            List<StreamKey> emptyList;
            if (list != null && !list.isEmpty()) {
                emptyList = Collections.unmodifiableList(new ArrayList(list));
            } else {
                emptyList = Collections.emptyList();
            }
            this.f31687f = emptyList;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setSubtitleConfigurations(List<SubtitleConfiguration> list) {
            this.f31689h = ImmutableList.copyOf((Collection) list);
            return this;
        }

        @CanIgnoreReturnValue
        @Deprecated
        public Builder setSubtitles(@Nullable List<Subtitle> list) {
            ImmutableList<SubtitleConfiguration> m69424of;
            if (list != null) {
                m69424of = ImmutableList.copyOf((Collection) list);
            } else {
                m69424of = ImmutableList.m69424of();
            }
            this.f31689h = m69424of;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setTag(@Nullable Object obj) {
            this.f31691j = obj;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setUri(@Nullable String str) {
            return setUri(str == null ? null : Uri.parse(str));
        }

        public Builder() {
            this.f31685d = new ClippingConfiguration.Builder();
            this.f31686e = new DrmConfiguration.Builder();
            this.f31687f = Collections.emptyList();
            this.f31689h = ImmutableList.m69424of();
            this.f31693l = new LiveConfiguration.Builder();
            this.f31694m = RequestMetadata.EMPTY;
        }

        @CanIgnoreReturnValue
        @Deprecated
        public Builder setAdTagUri(@Nullable Uri uri) {
            return setAdTagUri(uri, null);
        }

        @CanIgnoreReturnValue
        @Deprecated
        public Builder setDrmLicenseUri(@Nullable String str) {
            this.f31686e.setLicenseUri(str);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setUri(@Nullable Uri uri) {
            this.f31683b = uri;
            return this;
        }

        @CanIgnoreReturnValue
        @Deprecated
        public Builder setAdTagUri(@Nullable Uri uri, @Nullable Object obj) {
            this.f31690i = uri != null ? new AdsConfiguration.Builder(uri).setAdsId(obj).build() : null;
            return this;
        }

        private Builder(MediaItem mediaItem) {
            this();
            DrmConfiguration.Builder builder;
            this.f31685d = mediaItem.clippingConfiguration.buildUpon();
            this.f31682a = mediaItem.mediaId;
            this.f31692k = mediaItem.mediaMetadata;
            this.f31693l = mediaItem.liveConfiguration.buildUpon();
            this.f31694m = mediaItem.requestMetadata;
            LocalConfiguration localConfiguration = mediaItem.localConfiguration;
            if (localConfiguration != null) {
                this.f31688g = localConfiguration.customCacheKey;
                this.f31684c = localConfiguration.mimeType;
                this.f31683b = localConfiguration.uri;
                this.f31687f = localConfiguration.streamKeys;
                this.f31689h = localConfiguration.subtitleConfigurations;
                this.f31691j = localConfiguration.tag;
                DrmConfiguration drmConfiguration = localConfiguration.drmConfiguration;
                if (drmConfiguration != null) {
                    builder = drmConfiguration.buildUpon();
                } else {
                    builder = new DrmConfiguration.Builder();
                }
                this.f31686e = builder;
                this.f31690i = localConfiguration.adsConfiguration;
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class ClippingConfiguration implements Bundleable {
        public final long endPositionMs;
        public final boolean relativeToDefaultPosition;
        public final boolean relativeToLiveWindow;
        @IntRange(from = 0)
        public final long startPositionMs;
        public final boolean startsAtKeyFrame;
        public static final ClippingConfiguration UNSET = new Builder().build();

        /* renamed from: b */
        private static final String f31695b = Util.intToStringMaxRadix(0);

        /* renamed from: c */
        private static final String f31696c = Util.intToStringMaxRadix(1);

        /* renamed from: d */
        private static final String f31697d = Util.intToStringMaxRadix(2);

        /* renamed from: f */
        private static final String f31698f = Util.intToStringMaxRadix(3);

        /* renamed from: g */
        private static final String f31699g = Util.intToStringMaxRadix(4);
        public static final Bundleable.Creator<ClippingProperties> CREATOR = new Bundleable.Creator() { // from class: com.google.android.exoplayer2.t1
            @Override // com.google.android.exoplayer2.Bundleable.Creator
            public final Bundleable fromBundle(Bundle bundle) {
                return MediaItem.ClippingConfiguration.m75738a(bundle);
            }
        };

        /* loaded from: classes4.dex */
        public static final class Builder {

            /* renamed from: a */
            private long f31700a;

            /* renamed from: b */
            private long f31701b;

            /* renamed from: c */
            private boolean f31702c;

            /* renamed from: d */
            private boolean f31703d;

            /* renamed from: e */
            private boolean f31704e;

            public ClippingConfiguration build() {
                return buildClippingProperties();
            }

            @Deprecated
            public ClippingProperties buildClippingProperties() {
                return new ClippingProperties(this);
            }

            @CanIgnoreReturnValue
            public Builder setEndPositionMs(long j) {
                boolean z;
                if (j != Long.MIN_VALUE && j < 0) {
                    z = false;
                } else {
                    z = true;
                }
                Assertions.checkArgument(z);
                this.f31701b = j;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setRelativeToDefaultPosition(boolean z) {
                this.f31703d = z;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setRelativeToLiveWindow(boolean z) {
                this.f31702c = z;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setStartPositionMs(@IntRange(from = 0) long j) {
                boolean z;
                if (j >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                Assertions.checkArgument(z);
                this.f31700a = j;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setStartsAtKeyFrame(boolean z) {
                this.f31704e = z;
                return this;
            }

            public Builder() {
                this.f31701b = Long.MIN_VALUE;
            }

            private Builder(ClippingConfiguration clippingConfiguration) {
                this.f31700a = clippingConfiguration.startPositionMs;
                this.f31701b = clippingConfiguration.endPositionMs;
                this.f31702c = clippingConfiguration.relativeToLiveWindow;
                this.f31703d = clippingConfiguration.relativeToDefaultPosition;
                this.f31704e = clippingConfiguration.startsAtKeyFrame;
            }
        }

        /* renamed from: a */
        public static /* synthetic */ ClippingProperties m75738a(Bundle bundle) {
            return m75737b(bundle);
        }

        /* renamed from: b */
        public static /* synthetic */ ClippingProperties m75737b(Bundle bundle) {
            Builder builder = new Builder();
            String str = f31695b;
            ClippingConfiguration clippingConfiguration = UNSET;
            return builder.setStartPositionMs(bundle.getLong(str, clippingConfiguration.startPositionMs)).setEndPositionMs(bundle.getLong(f31696c, clippingConfiguration.endPositionMs)).setRelativeToLiveWindow(bundle.getBoolean(f31697d, clippingConfiguration.relativeToLiveWindow)).setRelativeToDefaultPosition(bundle.getBoolean(f31698f, clippingConfiguration.relativeToDefaultPosition)).setStartsAtKeyFrame(bundle.getBoolean(f31699g, clippingConfiguration.startsAtKeyFrame)).buildClippingProperties();
        }

        public Builder buildUpon() {
            return new Builder();
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClippingConfiguration)) {
                return false;
            }
            ClippingConfiguration clippingConfiguration = (ClippingConfiguration) obj;
            if (this.startPositionMs == clippingConfiguration.startPositionMs && this.endPositionMs == clippingConfiguration.endPositionMs && this.relativeToLiveWindow == clippingConfiguration.relativeToLiveWindow && this.relativeToDefaultPosition == clippingConfiguration.relativeToDefaultPosition && this.startsAtKeyFrame == clippingConfiguration.startsAtKeyFrame) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            long j = this.startPositionMs;
            long j2 = this.endPositionMs;
            return (((((((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + (this.relativeToLiveWindow ? 1 : 0)) * 31) + (this.relativeToDefaultPosition ? 1 : 0)) * 31) + (this.startsAtKeyFrame ? 1 : 0);
        }

        @Override // com.google.android.exoplayer2.Bundleable
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            long j = this.startPositionMs;
            ClippingConfiguration clippingConfiguration = UNSET;
            if (j != clippingConfiguration.startPositionMs) {
                bundle.putLong(f31695b, j);
            }
            long j2 = this.endPositionMs;
            if (j2 != clippingConfiguration.endPositionMs) {
                bundle.putLong(f31696c, j2);
            }
            boolean z = this.relativeToLiveWindow;
            if (z != clippingConfiguration.relativeToLiveWindow) {
                bundle.putBoolean(f31697d, z);
            }
            boolean z2 = this.relativeToDefaultPosition;
            if (z2 != clippingConfiguration.relativeToDefaultPosition) {
                bundle.putBoolean(f31698f, z2);
            }
            boolean z3 = this.startsAtKeyFrame;
            if (z3 != clippingConfiguration.startsAtKeyFrame) {
                bundle.putBoolean(f31699g, z3);
            }
            return bundle;
        }

        private ClippingConfiguration(Builder builder) {
            this.startPositionMs = builder.f31700a;
            this.endPositionMs = builder.f31701b;
            this.relativeToLiveWindow = builder.f31702c;
            this.relativeToDefaultPosition = builder.f31703d;
            this.startsAtKeyFrame = builder.f31704e;
        }
    }

    @Deprecated
    /* loaded from: classes4.dex */
    public static final class ClippingProperties extends ClippingConfiguration {
        public static final ClippingProperties UNSET = new ClippingConfiguration.Builder().buildClippingProperties();

        private ClippingProperties(ClippingConfiguration.Builder builder) {
            super(builder);
        }
    }

    /* loaded from: classes4.dex */
    public static final class DrmConfiguration {
        @Nullable

        /* renamed from: a */
        private final byte[] f31705a;
        public final boolean forceDefaultLicenseUri;
        public final ImmutableList<Integer> forcedSessionTrackTypes;
        public final ImmutableMap<String, String> licenseRequestHeaders;
        @Nullable
        public final Uri licenseUri;
        public final boolean multiSession;
        public final boolean playClearContentWithoutKey;
        @Deprecated
        public final ImmutableMap<String, String> requestHeaders;
        public final UUID scheme;
        @Deprecated
        public final ImmutableList<Integer> sessionForClearTypes;
        @Deprecated
        public final UUID uuid;

        /* loaded from: classes4.dex */
        public static final class Builder {
            @Nullable

            /* renamed from: a */
            private UUID f31706a;
            @Nullable

            /* renamed from: b */
            private Uri f31707b;

            /* renamed from: c */
            private ImmutableMap<String, String> f31708c;

            /* renamed from: d */
            private boolean f31709d;

            /* renamed from: e */
            private boolean f31710e;

            /* renamed from: f */
            private boolean f31711f;

            /* renamed from: g */
            private ImmutableList<Integer> f31712g;
            @Nullable

            /* renamed from: h */
            private byte[] f31713h;

            @CanIgnoreReturnValue
            @Deprecated
            /* renamed from: j */
            public Builder m75721j(@Nullable UUID uuid) {
                this.f31706a = uuid;
                return this;
            }

            public DrmConfiguration build() {
                return new DrmConfiguration(this);
            }

            @CanIgnoreReturnValue
            @InlineMe(replacement = "this.setForceSessionsForAudioAndVideoTracks(forceSessionsForAudioAndVideoTracks)")
            @Deprecated
            public Builder forceSessionsForAudioAndVideoTracks(boolean z) {
                return setForceSessionsForAudioAndVideoTracks(z);
            }

            @CanIgnoreReturnValue
            public Builder setForceDefaultLicenseUri(boolean z) {
                this.f31711f = z;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setForceSessionsForAudioAndVideoTracks(boolean z) {
                ImmutableList m69424of;
                if (z) {
                    m69424of = ImmutableList.m69422of(2, 1);
                } else {
                    m69424of = ImmutableList.m69424of();
                }
                setForcedSessionTrackTypes(m69424of);
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setForcedSessionTrackTypes(List<Integer> list) {
                this.f31712g = ImmutableList.copyOf((Collection) list);
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setKeySetId(@Nullable byte[] bArr) {
                byte[] bArr2;
                if (bArr != null) {
                    bArr2 = Arrays.copyOf(bArr, bArr.length);
                } else {
                    bArr2 = null;
                }
                this.f31713h = bArr2;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setLicenseRequestHeaders(Map<String, String> map) {
                this.f31708c = ImmutableMap.copyOf((Map) map);
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setLicenseUri(@Nullable Uri uri) {
                this.f31707b = uri;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setMultiSession(boolean z) {
                this.f31709d = z;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setPlayClearContentWithoutKey(boolean z) {
                this.f31710e = z;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setScheme(UUID uuid) {
                this.f31706a = uuid;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setLicenseUri(@Nullable String str) {
                this.f31707b = str == null ? null : Uri.parse(str);
                return this;
            }

            public Builder(UUID uuid) {
                this.f31706a = uuid;
                this.f31708c = ImmutableMap.m69397of();
                this.f31712g = ImmutableList.m69424of();
            }

            @Deprecated
            private Builder() {
                this.f31708c = ImmutableMap.m69397of();
                this.f31712g = ImmutableList.m69424of();
            }

            private Builder(DrmConfiguration drmConfiguration) {
                this.f31706a = drmConfiguration.scheme;
                this.f31707b = drmConfiguration.licenseUri;
                this.f31708c = drmConfiguration.licenseRequestHeaders;
                this.f31709d = drmConfiguration.multiSession;
                this.f31710e = drmConfiguration.playClearContentWithoutKey;
                this.f31711f = drmConfiguration.forceDefaultLicenseUri;
                this.f31712g = drmConfiguration.forcedSessionTrackTypes;
                this.f31713h = drmConfiguration.f31705a;
            }
        }

        public Builder buildUpon() {
            return new Builder();
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DrmConfiguration)) {
                return false;
            }
            DrmConfiguration drmConfiguration = (DrmConfiguration) obj;
            if (this.scheme.equals(drmConfiguration.scheme) && Util.areEqual(this.licenseUri, drmConfiguration.licenseUri) && Util.areEqual(this.licenseRequestHeaders, drmConfiguration.licenseRequestHeaders) && this.multiSession == drmConfiguration.multiSession && this.forceDefaultLicenseUri == drmConfiguration.forceDefaultLicenseUri && this.playClearContentWithoutKey == drmConfiguration.playClearContentWithoutKey && this.forcedSessionTrackTypes.equals(drmConfiguration.forcedSessionTrackTypes) && Arrays.equals(this.f31705a, drmConfiguration.f31705a)) {
                return true;
            }
            return false;
        }

        @Nullable
        public byte[] getKeySetId() {
            byte[] bArr = this.f31705a;
            if (bArr != null) {
                return Arrays.copyOf(bArr, bArr.length);
            }
            return null;
        }

        public int hashCode() {
            int i;
            int hashCode = this.scheme.hashCode() * 31;
            Uri uri = this.licenseUri;
            if (uri != null) {
                i = uri.hashCode();
            } else {
                i = 0;
            }
            return ((((((((((((hashCode + i) * 31) + this.licenseRequestHeaders.hashCode()) * 31) + (this.multiSession ? 1 : 0)) * 31) + (this.forceDefaultLicenseUri ? 1 : 0)) * 31) + (this.playClearContentWithoutKey ? 1 : 0)) * 31) + this.forcedSessionTrackTypes.hashCode()) * 31) + Arrays.hashCode(this.f31705a);
        }

        private DrmConfiguration(Builder builder) {
            Assertions.checkState((builder.f31711f && builder.f31707b == null) ? false : true);
            UUID uuid = (UUID) Assertions.checkNotNull(builder.f31706a);
            this.scheme = uuid;
            this.uuid = uuid;
            this.licenseUri = builder.f31707b;
            this.requestHeaders = builder.f31708c;
            this.licenseRequestHeaders = builder.f31708c;
            this.multiSession = builder.f31709d;
            this.forceDefaultLicenseUri = builder.f31711f;
            this.playClearContentWithoutKey = builder.f31710e;
            this.sessionForClearTypes = builder.f31712g;
            this.forcedSessionTrackTypes = builder.f31712g;
            this.f31705a = builder.f31713h != null ? Arrays.copyOf(builder.f31713h, builder.f31713h.length) : null;
        }
    }

    /* loaded from: classes4.dex */
    public static final class LiveConfiguration implements Bundleable {
        public final long maxOffsetMs;
        public final float maxPlaybackSpeed;
        public final long minOffsetMs;
        public final float minPlaybackSpeed;
        public final long targetOffsetMs;
        public static final LiveConfiguration UNSET = new Builder().build();

        /* renamed from: b */
        private static final String f31714b = Util.intToStringMaxRadix(0);

        /* renamed from: c */
        private static final String f31715c = Util.intToStringMaxRadix(1);

        /* renamed from: d */
        private static final String f31716d = Util.intToStringMaxRadix(2);

        /* renamed from: f */
        private static final String f31717f = Util.intToStringMaxRadix(3);

        /* renamed from: g */
        private static final String f31718g = Util.intToStringMaxRadix(4);
        public static final Bundleable.Creator<LiveConfiguration> CREATOR = new Bundleable.Creator() { // from class: com.google.android.exoplayer2.u1
            @Override // com.google.android.exoplayer2.Bundleable.Creator
            public final Bundleable fromBundle(Bundle bundle) {
                return MediaItem.LiveConfiguration.m75720a(bundle);
            }
        };

        /* loaded from: classes4.dex */
        public static final class Builder {

            /* renamed from: a */
            private long f31719a;

            /* renamed from: b */
            private long f31720b;

            /* renamed from: c */
            private long f31721c;

            /* renamed from: d */
            private float f31722d;

            /* renamed from: e */
            private float f31723e;

            public LiveConfiguration build() {
                return new LiveConfiguration(this);
            }

            @CanIgnoreReturnValue
            public Builder setMaxOffsetMs(long j) {
                this.f31721c = j;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setMaxPlaybackSpeed(float f) {
                this.f31723e = f;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setMinOffsetMs(long j) {
                this.f31720b = j;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setMinPlaybackSpeed(float f) {
                this.f31722d = f;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setTargetOffsetMs(long j) {
                this.f31719a = j;
                return this;
            }

            public Builder() {
                this.f31719a = -9223372036854775807L;
                this.f31720b = -9223372036854775807L;
                this.f31721c = -9223372036854775807L;
                this.f31722d = -3.4028235E38f;
                this.f31723e = -3.4028235E38f;
            }

            private Builder(LiveConfiguration liveConfiguration) {
                this.f31719a = liveConfiguration.targetOffsetMs;
                this.f31720b = liveConfiguration.minOffsetMs;
                this.f31721c = liveConfiguration.maxOffsetMs;
                this.f31722d = liveConfiguration.minPlaybackSpeed;
                this.f31723e = liveConfiguration.maxPlaybackSpeed;
            }
        }

        /* renamed from: a */
        public static /* synthetic */ LiveConfiguration m75720a(Bundle bundle) {
            return m75719b(bundle);
        }

        /* renamed from: b */
        public static /* synthetic */ LiveConfiguration m75719b(Bundle bundle) {
            String str = f31714b;
            LiveConfiguration liveConfiguration = UNSET;
            return new LiveConfiguration(bundle.getLong(str, liveConfiguration.targetOffsetMs), bundle.getLong(f31715c, liveConfiguration.minOffsetMs), bundle.getLong(f31716d, liveConfiguration.maxOffsetMs), bundle.getFloat(f31717f, liveConfiguration.minPlaybackSpeed), bundle.getFloat(f31718g, liveConfiguration.maxPlaybackSpeed));
        }

        public Builder buildUpon() {
            return new Builder();
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LiveConfiguration)) {
                return false;
            }
            LiveConfiguration liveConfiguration = (LiveConfiguration) obj;
            if (this.targetOffsetMs == liveConfiguration.targetOffsetMs && this.minOffsetMs == liveConfiguration.minOffsetMs && this.maxOffsetMs == liveConfiguration.maxOffsetMs && this.minPlaybackSpeed == liveConfiguration.minPlaybackSpeed && this.maxPlaybackSpeed == liveConfiguration.maxPlaybackSpeed) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i;
            long j = this.targetOffsetMs;
            long j2 = this.minOffsetMs;
            long j3 = this.maxOffsetMs;
            int i2 = ((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31;
            float f = this.minPlaybackSpeed;
            int i3 = 0;
            if (f != 0.0f) {
                i = Float.floatToIntBits(f);
            } else {
                i = 0;
            }
            int i4 = (i2 + i) * 31;
            float f2 = this.maxPlaybackSpeed;
            if (f2 != 0.0f) {
                i3 = Float.floatToIntBits(f2);
            }
            return i4 + i3;
        }

        @Override // com.google.android.exoplayer2.Bundleable
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            long j = this.targetOffsetMs;
            LiveConfiguration liveConfiguration = UNSET;
            if (j != liveConfiguration.targetOffsetMs) {
                bundle.putLong(f31714b, j);
            }
            long j2 = this.minOffsetMs;
            if (j2 != liveConfiguration.minOffsetMs) {
                bundle.putLong(f31715c, j2);
            }
            long j3 = this.maxOffsetMs;
            if (j3 != liveConfiguration.maxOffsetMs) {
                bundle.putLong(f31716d, j3);
            }
            float f = this.minPlaybackSpeed;
            if (f != liveConfiguration.minPlaybackSpeed) {
                bundle.putFloat(f31717f, f);
            }
            float f2 = this.maxPlaybackSpeed;
            if (f2 != liveConfiguration.maxPlaybackSpeed) {
                bundle.putFloat(f31718g, f2);
            }
            return bundle;
        }

        private LiveConfiguration(Builder builder) {
            this(builder.f31719a, builder.f31720b, builder.f31721c, builder.f31722d, builder.f31723e);
        }

        @Deprecated
        public LiveConfiguration(long j, long j2, long j3, float f, float f2) {
            this.targetOffsetMs = j;
            this.minOffsetMs = j2;
            this.maxOffsetMs = j3;
            this.minPlaybackSpeed = f;
            this.maxPlaybackSpeed = f2;
        }
    }

    /* loaded from: classes4.dex */
    public static class LocalConfiguration {
        @Nullable
        public final AdsConfiguration adsConfiguration;
        @Nullable
        public final String customCacheKey;
        @Nullable
        public final DrmConfiguration drmConfiguration;
        @Nullable
        public final String mimeType;
        public final List<StreamKey> streamKeys;
        public final ImmutableList<SubtitleConfiguration> subtitleConfigurations;
        @Deprecated
        public final List<Subtitle> subtitles;
        @Nullable
        public final Object tag;
        public final Uri uri;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LocalConfiguration)) {
                return false;
            }
            LocalConfiguration localConfiguration = (LocalConfiguration) obj;
            if (this.uri.equals(localConfiguration.uri) && Util.areEqual(this.mimeType, localConfiguration.mimeType) && Util.areEqual(this.drmConfiguration, localConfiguration.drmConfiguration) && Util.areEqual(this.adsConfiguration, localConfiguration.adsConfiguration) && this.streamKeys.equals(localConfiguration.streamKeys) && Util.areEqual(this.customCacheKey, localConfiguration.customCacheKey) && this.subtitleConfigurations.equals(localConfiguration.subtitleConfigurations) && Util.areEqual(this.tag, localConfiguration.tag)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4;
            int hashCode5 = this.uri.hashCode() * 31;
            String str = this.mimeType;
            int i = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i2 = (hashCode5 + hashCode) * 31;
            DrmConfiguration drmConfiguration = this.drmConfiguration;
            if (drmConfiguration == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = drmConfiguration.hashCode();
            }
            int i3 = (i2 + hashCode2) * 31;
            AdsConfiguration adsConfiguration = this.adsConfiguration;
            if (adsConfiguration == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = adsConfiguration.hashCode();
            }
            int hashCode6 = (((i3 + hashCode3) * 31) + this.streamKeys.hashCode()) * 31;
            String str2 = this.customCacheKey;
            if (str2 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str2.hashCode();
            }
            int hashCode7 = (((hashCode6 + hashCode4) * 31) + this.subtitleConfigurations.hashCode()) * 31;
            Object obj = this.tag;
            if (obj != null) {
                i = obj.hashCode();
            }
            return hashCode7 + i;
        }

        private LocalConfiguration(Uri uri, @Nullable String str, @Nullable DrmConfiguration drmConfiguration, @Nullable AdsConfiguration adsConfiguration, List<StreamKey> list, @Nullable String str2, ImmutableList<SubtitleConfiguration> immutableList, @Nullable Object obj) {
            this.uri = uri;
            this.mimeType = str;
            this.drmConfiguration = drmConfiguration;
            this.adsConfiguration = adsConfiguration;
            this.streamKeys = list;
            this.customCacheKey = str2;
            this.subtitleConfigurations = immutableList;
            ImmutableList.Builder builder = ImmutableList.builder();
            for (int i = 0; i < immutableList.size(); i++) {
                builder.add((ImmutableList.Builder) immutableList.get(i).buildUpon().m75700i());
            }
            this.subtitles = builder.build();
            this.tag = obj;
        }
    }

    @Deprecated
    /* loaded from: classes4.dex */
    public static final class PlaybackProperties extends LocalConfiguration {
        private PlaybackProperties(Uri uri, @Nullable String str, @Nullable DrmConfiguration drmConfiguration, @Nullable AdsConfiguration adsConfiguration, List<StreamKey> list, @Nullable String str2, ImmutableList<SubtitleConfiguration> immutableList, @Nullable Object obj) {
            super(uri, str, drmConfiguration, adsConfiguration, list, str2, immutableList, obj);
        }
    }

    /* loaded from: classes4.dex */
    public static final class RequestMetadata implements Bundleable {
        @Nullable
        public final Bundle extras;
        @Nullable
        public final Uri mediaUri;
        @Nullable
        public final String searchQuery;
        public static final RequestMetadata EMPTY = new Builder().build();

        /* renamed from: b */
        private static final String f31724b = Util.intToStringMaxRadix(0);

        /* renamed from: c */
        private static final String f31725c = Util.intToStringMaxRadix(1);

        /* renamed from: d */
        private static final String f31726d = Util.intToStringMaxRadix(2);
        public static final Bundleable.Creator<RequestMetadata> CREATOR = new Bundleable.Creator() { // from class: com.google.android.exoplayer2.v1
            @Override // com.google.android.exoplayer2.Bundleable.Creator
            public final Bundleable fromBundle(Bundle bundle) {
                return MediaItem.RequestMetadata.m75713a(bundle);
            }
        };

        /* loaded from: classes4.dex */
        public static final class Builder {
            @Nullable

            /* renamed from: a */
            private Uri f31727a;
            @Nullable

            /* renamed from: b */
            private String f31728b;
            @Nullable

            /* renamed from: c */
            private Bundle f31729c;

            public Builder() {
            }

            public RequestMetadata build() {
                return new RequestMetadata(this);
            }

            @CanIgnoreReturnValue
            public Builder setExtras(@Nullable Bundle bundle) {
                this.f31729c = bundle;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setMediaUri(@Nullable Uri uri) {
                this.f31727a = uri;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setSearchQuery(@Nullable String str) {
                this.f31728b = str;
                return this;
            }

            private Builder(RequestMetadata requestMetadata) {
                this.f31727a = requestMetadata.mediaUri;
                this.f31728b = requestMetadata.searchQuery;
                this.f31729c = requestMetadata.extras;
            }
        }

        /* renamed from: a */
        public static /* synthetic */ RequestMetadata m75713a(Bundle bundle) {
            return m75712b(bundle);
        }

        /* renamed from: b */
        public static /* synthetic */ RequestMetadata m75712b(Bundle bundle) {
            return new Builder().setMediaUri((Uri) bundle.getParcelable(f31724b)).setSearchQuery(bundle.getString(f31725c)).setExtras(bundle.getBundle(f31726d)).build();
        }

        public Builder buildUpon() {
            return new Builder();
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RequestMetadata)) {
                return false;
            }
            RequestMetadata requestMetadata = (RequestMetadata) obj;
            if (Util.areEqual(this.mediaUri, requestMetadata.mediaUri) && Util.areEqual(this.searchQuery, requestMetadata.searchQuery)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            Uri uri = this.mediaUri;
            int i = 0;
            if (uri == null) {
                hashCode = 0;
            } else {
                hashCode = uri.hashCode();
            }
            int i2 = hashCode * 31;
            String str = this.searchQuery;
            if (str != null) {
                i = str.hashCode();
            }
            return i2 + i;
        }

        @Override // com.google.android.exoplayer2.Bundleable
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            Uri uri = this.mediaUri;
            if (uri != null) {
                bundle.putParcelable(f31724b, uri);
            }
            String str = this.searchQuery;
            if (str != null) {
                bundle.putString(f31725c, str);
            }
            Bundle bundle2 = this.extras;
            if (bundle2 != null) {
                bundle.putBundle(f31726d, bundle2);
            }
            return bundle;
        }

        private RequestMetadata(Builder builder) {
            this.mediaUri = builder.f31727a;
            this.searchQuery = builder.f31728b;
            this.extras = builder.f31729c;
        }
    }

    @Deprecated
    /* loaded from: classes4.dex */
    public static final class Subtitle extends SubtitleConfiguration {
        @Deprecated
        public Subtitle(Uri uri, String str, @Nullable String str2) {
            this(uri, str, str2, 0);
        }

        @Deprecated
        public Subtitle(Uri uri, String str, @Nullable String str2, int i) {
            this(uri, str, str2, i, 0, null);
        }

        @Deprecated
        public Subtitle(Uri uri, String str, @Nullable String str2, int i, int i2, @Nullable String str3) {
            super(uri, str, str2, i, i2, str3, null);
        }

        private Subtitle(SubtitleConfiguration.Builder builder) {
            super(builder);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ MediaItem m75742a(Bundle bundle) {
        return m75741b(bundle);
    }

    /* renamed from: b */
    public static MediaItem m75741b(Bundle bundle) {
        LiveConfiguration fromBundle;
        MediaMetadata fromBundle2;
        ClippingProperties fromBundle3;
        RequestMetadata fromBundle4;
        String str = (String) Assertions.checkNotNull(bundle.getString(f31675b, ""));
        Bundle bundle2 = bundle.getBundle(f31676c);
        if (bundle2 == null) {
            fromBundle = LiveConfiguration.UNSET;
        } else {
            fromBundle = LiveConfiguration.CREATOR.fromBundle(bundle2);
        }
        LiveConfiguration liveConfiguration = fromBundle;
        Bundle bundle3 = bundle.getBundle(f31677d);
        if (bundle3 == null) {
            fromBundle2 = MediaMetadata.EMPTY;
        } else {
            fromBundle2 = MediaMetadata.CREATOR.fromBundle(bundle3);
        }
        MediaMetadata mediaMetadata = fromBundle2;
        Bundle bundle4 = bundle.getBundle(f31678f);
        if (bundle4 == null) {
            fromBundle3 = ClippingProperties.UNSET;
        } else {
            fromBundle3 = ClippingConfiguration.CREATOR.fromBundle(bundle4);
        }
        ClippingProperties clippingProperties = fromBundle3;
        Bundle bundle5 = bundle.getBundle(f31679g);
        if (bundle5 == null) {
            fromBundle4 = RequestMetadata.EMPTY;
        } else {
            fromBundle4 = RequestMetadata.CREATOR.fromBundle(bundle5);
        }
        return new MediaItem(str, clippingProperties, null, liveConfiguration, mediaMetadata, fromBundle4);
    }

    public static MediaItem fromUri(String str) {
        return new Builder().setUri(str).build();
    }

    public Builder buildUpon() {
        return new Builder();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaItem)) {
            return false;
        }
        MediaItem mediaItem = (MediaItem) obj;
        if (Util.areEqual(this.mediaId, mediaItem.mediaId) && this.clippingConfiguration.equals(mediaItem.clippingConfiguration) && Util.areEqual(this.localConfiguration, mediaItem.localConfiguration) && Util.areEqual(this.liveConfiguration, mediaItem.liveConfiguration) && Util.areEqual(this.mediaMetadata, mediaItem.mediaMetadata) && Util.areEqual(this.requestMetadata, mediaItem.requestMetadata)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = this.mediaId.hashCode() * 31;
        LocalConfiguration localConfiguration = this.localConfiguration;
        if (localConfiguration != null) {
            i = localConfiguration.hashCode();
        } else {
            i = 0;
        }
        return ((((((((hashCode + i) * 31) + this.liveConfiguration.hashCode()) * 31) + this.clippingConfiguration.hashCode()) * 31) + this.mediaMetadata.hashCode()) * 31) + this.requestMetadata.hashCode();
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        if (!this.mediaId.equals("")) {
            bundle.putString(f31675b, this.mediaId);
        }
        if (!this.liveConfiguration.equals(LiveConfiguration.UNSET)) {
            bundle.putBundle(f31676c, this.liveConfiguration.toBundle());
        }
        if (!this.mediaMetadata.equals(MediaMetadata.EMPTY)) {
            bundle.putBundle(f31677d, this.mediaMetadata.toBundle());
        }
        if (!this.clippingConfiguration.equals(ClippingConfiguration.UNSET)) {
            bundle.putBundle(f31678f, this.clippingConfiguration.toBundle());
        }
        if (!this.requestMetadata.equals(RequestMetadata.EMPTY)) {
            bundle.putBundle(f31679g, this.requestMetadata.toBundle());
        }
        return bundle;
    }

    /* loaded from: classes4.dex */
    public static class SubtitleConfiguration {
        @Nullable

        /* renamed from: id */
        public final String f31730id;
        @Nullable
        public final String label;
        @Nullable
        public final String language;
        @Nullable
        public final String mimeType;
        public final int roleFlags;
        public final int selectionFlags;
        public final Uri uri;

        /* loaded from: classes4.dex */
        public static final class Builder {

            /* renamed from: a */
            private Uri f31731a;
            @Nullable

            /* renamed from: b */
            private String f31732b;
            @Nullable

            /* renamed from: c */
            private String f31733c;

            /* renamed from: d */
            private int f31734d;

            /* renamed from: e */
            private int f31735e;
            @Nullable

            /* renamed from: f */
            private String f31736f;
            @Nullable

            /* renamed from: g */
            private String f31737g;

            /* renamed from: i */
            public Subtitle m75700i() {
                return new Subtitle(this);
            }

            public SubtitleConfiguration build() {
                return new SubtitleConfiguration(this);
            }

            @CanIgnoreReturnValue
            public Builder setId(@Nullable String str) {
                this.f31737g = str;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setLabel(@Nullable String str) {
                this.f31736f = str;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setLanguage(@Nullable String str) {
                this.f31733c = str;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setMimeType(@Nullable String str) {
                this.f31732b = str;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setRoleFlags(int i) {
                this.f31735e = i;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setSelectionFlags(int i) {
                this.f31734d = i;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setUri(Uri uri) {
                this.f31731a = uri;
                return this;
            }

            public Builder(Uri uri) {
                this.f31731a = uri;
            }

            private Builder(SubtitleConfiguration subtitleConfiguration) {
                this.f31731a = subtitleConfiguration.uri;
                this.f31732b = subtitleConfiguration.mimeType;
                this.f31733c = subtitleConfiguration.language;
                this.f31734d = subtitleConfiguration.selectionFlags;
                this.f31735e = subtitleConfiguration.roleFlags;
                this.f31736f = subtitleConfiguration.label;
                this.f31737g = subtitleConfiguration.f31730id;
            }
        }

        public Builder buildUpon() {
            return new Builder();
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SubtitleConfiguration)) {
                return false;
            }
            SubtitleConfiguration subtitleConfiguration = (SubtitleConfiguration) obj;
            if (this.uri.equals(subtitleConfiguration.uri) && Util.areEqual(this.mimeType, subtitleConfiguration.mimeType) && Util.areEqual(this.language, subtitleConfiguration.language) && this.selectionFlags == subtitleConfiguration.selectionFlags && this.roleFlags == subtitleConfiguration.roleFlags && Util.areEqual(this.label, subtitleConfiguration.label) && Util.areEqual(this.f31730id, subtitleConfiguration.f31730id)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4 = this.uri.hashCode() * 31;
            String str = this.mimeType;
            int i = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i2 = (hashCode4 + hashCode) * 31;
            String str2 = this.language;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i3 = (((((i2 + hashCode2) * 31) + this.selectionFlags) * 31) + this.roleFlags) * 31;
            String str3 = this.label;
            if (str3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str3.hashCode();
            }
            int i4 = (i3 + hashCode3) * 31;
            String str4 = this.f31730id;
            if (str4 != null) {
                i = str4.hashCode();
            }
            return i4 + i;
        }

        private SubtitleConfiguration(Uri uri, String str, @Nullable String str2, int i, int i2, @Nullable String str3, @Nullable String str4) {
            this.uri = uri;
            this.mimeType = str;
            this.language = str2;
            this.selectionFlags = i;
            this.roleFlags = i2;
            this.label = str3;
            this.f31730id = str4;
        }

        private SubtitleConfiguration(Builder builder) {
            this.uri = builder.f31731a;
            this.mimeType = builder.f31732b;
            this.language = builder.f31733c;
            this.selectionFlags = builder.f31734d;
            this.roleFlags = builder.f31735e;
            this.label = builder.f31736f;
            this.f31730id = builder.f31737g;
        }
    }

    private MediaItem(String str, ClippingProperties clippingProperties, @Nullable PlaybackProperties playbackProperties, LiveConfiguration liveConfiguration, MediaMetadata mediaMetadata, RequestMetadata requestMetadata) {
        this.mediaId = str;
        this.localConfiguration = playbackProperties;
        this.playbackProperties = playbackProperties;
        this.liveConfiguration = liveConfiguration;
        this.mediaMetadata = mediaMetadata;
        this.clippingConfiguration = clippingProperties;
        this.clippingProperties = clippingProperties;
        this.requestMetadata = requestMetadata;
    }

    public static MediaItem fromUri(Uri uri) {
        return new Builder().setUri(uri).build();
    }
}
