package io.bidmachine.media3.common;

import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.InlineMe;
import io.bidmachine.media3.common.Bundleable;
import io.bidmachine.media3.common.MediaItem;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.BundleableUtil;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes9.dex */
public final class MediaItem implements Bundleable {
    public static final String DEFAULT_MEDIA_ID = "";
    public final ClippingConfiguration clippingConfiguration;
    @UnstableApi
    @Deprecated
    public final ClippingProperties clippingProperties;
    public final LiveConfiguration liveConfiguration;
    @Nullable
    public final LocalConfiguration localConfiguration;
    public final String mediaId;
    public final MediaMetadata mediaMetadata;
    @Nullable
    @UnstableApi
    @Deprecated
    public final LocalConfiguration playbackProperties;
    public final RequestMetadata requestMetadata;
    public static final MediaItem EMPTY = new Builder().build();
    private static final String FIELD_MEDIA_ID = Util.intToStringMaxRadix(0);
    private static final String FIELD_LIVE_CONFIGURATION = Util.intToStringMaxRadix(1);
    private static final String FIELD_MEDIA_METADATA = Util.intToStringMaxRadix(2);
    private static final String FIELD_CLIPPING_PROPERTIES = Util.intToStringMaxRadix(3);
    private static final String FIELD_REQUEST_METADATA = Util.intToStringMaxRadix(4);
    private static final String FIELD_LOCAL_CONFIGURATION = Util.intToStringMaxRadix(5);
    @UnstableApi
    public static final Bundleable.Creator<MediaItem> CREATOR = new Bundleable.Creator() { // from class: io.bidmachine.media3.common.j
        @Override // io.bidmachine.media3.common.Bundleable.Creator
        public final Bundleable fromBundle(Bundle bundle) {
            return MediaItem.m20045a(bundle);
        }
    };

    /* loaded from: classes9.dex */
    public static final class AdsConfiguration implements Bundleable {
        public final Uri adTagUri;
        @Nullable
        public final Object adsId;
        private static final String FIELD_AD_TAG_URI = Util.intToStringMaxRadix(0);
        @UnstableApi
        public static final Bundleable.Creator<AdsConfiguration> CREATOR = new Bundleable.Creator() { // from class: io.bidmachine.media3.common.k
            @Override // io.bidmachine.media3.common.Bundleable.Creator
            public final Bundleable fromBundle(Bundle bundle) {
                return MediaItem.AdsConfiguration.m20044a(bundle);
            }
        };

        /* loaded from: classes9.dex */
        public static final class Builder {
            private Uri adTagUri;
            @Nullable
            private Object adsId;

            public Builder(Uri uri) {
                this.adTagUri = uri;
            }

            public AdsConfiguration build() {
                return new AdsConfiguration(this);
            }

            @CanIgnoreReturnValue
            public Builder setAdTagUri(Uri uri) {
                this.adTagUri = uri;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setAdsId(@Nullable Object obj) {
                this.adsId = obj;
                return this;
            }
        }

        /* renamed from: a */
        public static /* synthetic */ AdsConfiguration m20044a(Bundle bundle) {
            return fromBundle(bundle);
        }

        @UnstableApi
        public static AdsConfiguration fromBundle(Bundle bundle) {
            Uri uri = (Uri) bundle.getParcelable(FIELD_AD_TAG_URI);
            Assertions.checkNotNull(uri);
            return new Builder(uri).build();
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

        @Override // io.bidmachine.media3.common.Bundleable
        @UnstableApi
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(FIELD_AD_TAG_URI, this.adTagUri);
            return bundle;
        }

        private AdsConfiguration(Builder builder) {
            this.adTagUri = builder.adTagUri;
            this.adsId = builder.adsId;
        }
    }

    /* loaded from: classes9.dex */
    public static final class Builder {
        @Nullable
        private AdsConfiguration adsConfiguration;
        private ClippingConfiguration.Builder clippingConfiguration;
        @Nullable
        private String customCacheKey;
        private DrmConfiguration.Builder drmConfiguration;
        private LiveConfiguration.Builder liveConfiguration;
        @Nullable
        private String mediaId;
        @Nullable
        private MediaMetadata mediaMetadata;
        @Nullable
        private String mimeType;
        private RequestMetadata requestMetadata;
        private List<StreamKey> streamKeys;
        private ImmutableList<SubtitleConfiguration> subtitleConfigurations;
        @Nullable
        private Object tag;
        @Nullable
        private Uri uri;

        public MediaItem build() {
            boolean z;
            LocalConfiguration localConfiguration;
            if (this.drmConfiguration.licenseUri != null && this.drmConfiguration.scheme == null) {
                z = false;
            } else {
                z = true;
            }
            Assertions.checkState(z);
            Uri uri = this.uri;
            DrmConfiguration drmConfiguration = null;
            if (uri != null) {
                String str = this.mimeType;
                if (this.drmConfiguration.scheme != null) {
                    drmConfiguration = this.drmConfiguration.build();
                }
                localConfiguration = new LocalConfiguration(uri, str, drmConfiguration, this.adsConfiguration, this.streamKeys, this.customCacheKey, this.subtitleConfigurations, this.tag);
            } else {
                localConfiguration = null;
            }
            String str2 = this.mediaId;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = str2;
            ClippingProperties buildClippingProperties = this.clippingConfiguration.buildClippingProperties();
            LiveConfiguration build = this.liveConfiguration.build();
            MediaMetadata mediaMetadata = this.mediaMetadata;
            if (mediaMetadata == null) {
                mediaMetadata = MediaMetadata.EMPTY;
            }
            return new MediaItem(str3, buildClippingProperties, localConfiguration, build, mediaMetadata, this.requestMetadata);
        }

        @CanIgnoreReturnValue
        @UnstableApi
        @Deprecated
        public Builder setAdTagUri(@Nullable String str) {
            return setAdTagUri(str != null ? Uri.parse(str) : null);
        }

        @CanIgnoreReturnValue
        public Builder setAdsConfiguration(@Nullable AdsConfiguration adsConfiguration) {
            this.adsConfiguration = adsConfiguration;
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        @Deprecated
        public Builder setClipEndPositionMs(long j) {
            this.clippingConfiguration.setEndPositionMs(j);
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        @Deprecated
        public Builder setClipRelativeToDefaultPosition(boolean z) {
            this.clippingConfiguration.setRelativeToDefaultPosition(z);
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        @Deprecated
        public Builder setClipRelativeToLiveWindow(boolean z) {
            this.clippingConfiguration.setRelativeToLiveWindow(z);
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        @Deprecated
        public Builder setClipStartPositionMs(@IntRange(from = 0) long j) {
            this.clippingConfiguration.setStartPositionMs(j);
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        @Deprecated
        public Builder setClipStartsAtKeyFrame(boolean z) {
            this.clippingConfiguration.setStartsAtKeyFrame(z);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setClippingConfiguration(ClippingConfiguration clippingConfiguration) {
            this.clippingConfiguration = clippingConfiguration.buildUpon();
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Builder setCustomCacheKey(@Nullable String str) {
            this.customCacheKey = str;
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
            this.drmConfiguration = builder;
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        @Deprecated
        public Builder setDrmForceDefaultLicenseUri(boolean z) {
            this.drmConfiguration.setForceDefaultLicenseUri(z);
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        @Deprecated
        public Builder setDrmKeySetId(@Nullable byte[] bArr) {
            this.drmConfiguration.setKeySetId(bArr);
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        @Deprecated
        public Builder setDrmLicenseRequestHeaders(@Nullable Map<String, String> map) {
            DrmConfiguration.Builder builder = this.drmConfiguration;
            if (map == null) {
                map = ImmutableMap.m69397of();
            }
            builder.setLicenseRequestHeaders(map);
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        @Deprecated
        public Builder setDrmLicenseUri(@Nullable Uri uri) {
            this.drmConfiguration.setLicenseUri(uri);
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        @Deprecated
        public Builder setDrmMultiSession(boolean z) {
            this.drmConfiguration.setMultiSession(z);
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        @Deprecated
        public Builder setDrmPlayClearContentWithoutKey(boolean z) {
            this.drmConfiguration.setPlayClearContentWithoutKey(z);
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        @Deprecated
        public Builder setDrmSessionForClearPeriods(boolean z) {
            this.drmConfiguration.setForceSessionsForAudioAndVideoTracks(z);
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        @Deprecated
        public Builder setDrmSessionForClearTypes(@Nullable List<Integer> list) {
            DrmConfiguration.Builder builder = this.drmConfiguration;
            if (list == null) {
                list = ImmutableList.m69424of();
            }
            builder.setForcedSessionTrackTypes(list);
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        @Deprecated
        public Builder setDrmUuid(@Nullable UUID uuid) {
            this.drmConfiguration.setNullableScheme(uuid);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setLiveConfiguration(LiveConfiguration liveConfiguration) {
            this.liveConfiguration = liveConfiguration.buildUpon();
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        @Deprecated
        public Builder setLiveMaxOffsetMs(long j) {
            this.liveConfiguration.setMaxOffsetMs(j);
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        @Deprecated
        public Builder setLiveMaxPlaybackSpeed(float f) {
            this.liveConfiguration.setMaxPlaybackSpeed(f);
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        @Deprecated
        public Builder setLiveMinOffsetMs(long j) {
            this.liveConfiguration.setMinOffsetMs(j);
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        @Deprecated
        public Builder setLiveMinPlaybackSpeed(float f) {
            this.liveConfiguration.setMinPlaybackSpeed(f);
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        @Deprecated
        public Builder setLiveTargetOffsetMs(long j) {
            this.liveConfiguration.setTargetOffsetMs(j);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setMediaId(String str) {
            this.mediaId = (String) Assertions.checkNotNull(str);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setMediaMetadata(MediaMetadata mediaMetadata) {
            this.mediaMetadata = mediaMetadata;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setMimeType(@Nullable String str) {
            this.mimeType = str;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setRequestMetadata(RequestMetadata requestMetadata) {
            this.requestMetadata = requestMetadata;
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Builder setStreamKeys(@Nullable List<StreamKey> list) {
            List<StreamKey> emptyList;
            if (list != null && !list.isEmpty()) {
                emptyList = Collections.unmodifiableList(new ArrayList(list));
            } else {
                emptyList = Collections.emptyList();
            }
            this.streamKeys = emptyList;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setSubtitleConfigurations(List<SubtitleConfiguration> list) {
            this.subtitleConfigurations = ImmutableList.copyOf((Collection) list);
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        @Deprecated
        public Builder setSubtitles(@Nullable List<Subtitle> list) {
            ImmutableList<SubtitleConfiguration> m69424of;
            if (list != null) {
                m69424of = ImmutableList.copyOf((Collection) list);
            } else {
                m69424of = ImmutableList.m69424of();
            }
            this.subtitleConfigurations = m69424of;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setTag(@Nullable Object obj) {
            this.tag = obj;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setUri(@Nullable String str) {
            return setUri(str == null ? null : Uri.parse(str));
        }

        public Builder() {
            this.clippingConfiguration = new ClippingConfiguration.Builder();
            this.drmConfiguration = new DrmConfiguration.Builder();
            this.streamKeys = Collections.emptyList();
            this.subtitleConfigurations = ImmutableList.m69424of();
            this.liveConfiguration = new LiveConfiguration.Builder();
            this.requestMetadata = RequestMetadata.EMPTY;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        @Deprecated
        public Builder setAdTagUri(@Nullable Uri uri) {
            return setAdTagUri(uri, null);
        }

        @CanIgnoreReturnValue
        @UnstableApi
        @Deprecated
        public Builder setDrmLicenseUri(@Nullable String str) {
            this.drmConfiguration.setLicenseUri(str);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setUri(@Nullable Uri uri) {
            this.uri = uri;
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        @Deprecated
        public Builder setAdTagUri(@Nullable Uri uri, @Nullable Object obj) {
            this.adsConfiguration = uri != null ? new AdsConfiguration.Builder(uri).setAdsId(obj).build() : null;
            return this;
        }

        private Builder(MediaItem mediaItem) {
            this();
            DrmConfiguration.Builder builder;
            this.clippingConfiguration = mediaItem.clippingConfiguration.buildUpon();
            this.mediaId = mediaItem.mediaId;
            this.mediaMetadata = mediaItem.mediaMetadata;
            this.liveConfiguration = mediaItem.liveConfiguration.buildUpon();
            this.requestMetadata = mediaItem.requestMetadata;
            LocalConfiguration localConfiguration = mediaItem.localConfiguration;
            if (localConfiguration != null) {
                this.customCacheKey = localConfiguration.customCacheKey;
                this.mimeType = localConfiguration.mimeType;
                this.uri = localConfiguration.uri;
                this.streamKeys = localConfiguration.streamKeys;
                this.subtitleConfigurations = localConfiguration.subtitleConfigurations;
                this.tag = localConfiguration.tag;
                DrmConfiguration drmConfiguration = localConfiguration.drmConfiguration;
                if (drmConfiguration != null) {
                    builder = drmConfiguration.buildUpon();
                } else {
                    builder = new DrmConfiguration.Builder();
                }
                this.drmConfiguration = builder;
                this.adsConfiguration = localConfiguration.adsConfiguration;
            }
        }
    }

    /* loaded from: classes9.dex */
    public static class ClippingConfiguration implements Bundleable {
        public final long endPositionMs;
        public final boolean relativeToDefaultPosition;
        public final boolean relativeToLiveWindow;
        @IntRange(from = 0)
        public final long startPositionMs;
        public final boolean startsAtKeyFrame;
        public static final ClippingConfiguration UNSET = new Builder().build();
        private static final String FIELD_START_POSITION_MS = Util.intToStringMaxRadix(0);
        private static final String FIELD_END_POSITION_MS = Util.intToStringMaxRadix(1);
        private static final String FIELD_RELATIVE_TO_LIVE_WINDOW = Util.intToStringMaxRadix(2);
        private static final String FIELD_RELATIVE_TO_DEFAULT_POSITION = Util.intToStringMaxRadix(3);
        private static final String FIELD_STARTS_AT_KEY_FRAME = Util.intToStringMaxRadix(4);
        @UnstableApi
        public static final Bundleable.Creator<ClippingProperties> CREATOR = new Bundleable.Creator() { // from class: io.bidmachine.media3.common.l
            @Override // io.bidmachine.media3.common.Bundleable.Creator
            public final Bundleable fromBundle(Bundle bundle) {
                return MediaItem.ClippingConfiguration.m20043a(bundle);
            }
        };

        /* loaded from: classes9.dex */
        public static final class Builder {
            private long endPositionMs;
            private boolean relativeToDefaultPosition;
            private boolean relativeToLiveWindow;
            private long startPositionMs;
            private boolean startsAtKeyFrame;

            public ClippingConfiguration build() {
                return buildClippingProperties();
            }

            @UnstableApi
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
                this.endPositionMs = j;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setRelativeToDefaultPosition(boolean z) {
                this.relativeToDefaultPosition = z;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setRelativeToLiveWindow(boolean z) {
                this.relativeToLiveWindow = z;
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
                this.startPositionMs = j;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setStartsAtKeyFrame(boolean z) {
                this.startsAtKeyFrame = z;
                return this;
            }

            public Builder() {
                this.endPositionMs = Long.MIN_VALUE;
            }

            private Builder(ClippingConfiguration clippingConfiguration) {
                this.startPositionMs = clippingConfiguration.startPositionMs;
                this.endPositionMs = clippingConfiguration.endPositionMs;
                this.relativeToLiveWindow = clippingConfiguration.relativeToLiveWindow;
                this.relativeToDefaultPosition = clippingConfiguration.relativeToDefaultPosition;
                this.startsAtKeyFrame = clippingConfiguration.startsAtKeyFrame;
            }
        }

        /* renamed from: a */
        public static /* synthetic */ ClippingProperties m20043a(Bundle bundle) {
            return lambda$static$0(bundle);
        }

        public static /* synthetic */ ClippingProperties lambda$static$0(Bundle bundle) {
            Builder builder = new Builder();
            String str = FIELD_START_POSITION_MS;
            ClippingConfiguration clippingConfiguration = UNSET;
            return builder.setStartPositionMs(bundle.getLong(str, clippingConfiguration.startPositionMs)).setEndPositionMs(bundle.getLong(FIELD_END_POSITION_MS, clippingConfiguration.endPositionMs)).setRelativeToLiveWindow(bundle.getBoolean(FIELD_RELATIVE_TO_LIVE_WINDOW, clippingConfiguration.relativeToLiveWindow)).setRelativeToDefaultPosition(bundle.getBoolean(FIELD_RELATIVE_TO_DEFAULT_POSITION, clippingConfiguration.relativeToDefaultPosition)).setStartsAtKeyFrame(bundle.getBoolean(FIELD_STARTS_AT_KEY_FRAME, clippingConfiguration.startsAtKeyFrame)).buildClippingProperties();
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

        @Override // io.bidmachine.media3.common.Bundleable
        @UnstableApi
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            long j = this.startPositionMs;
            ClippingConfiguration clippingConfiguration = UNSET;
            if (j != clippingConfiguration.startPositionMs) {
                bundle.putLong(FIELD_START_POSITION_MS, j);
            }
            long j2 = this.endPositionMs;
            if (j2 != clippingConfiguration.endPositionMs) {
                bundle.putLong(FIELD_END_POSITION_MS, j2);
            }
            boolean z = this.relativeToLiveWindow;
            if (z != clippingConfiguration.relativeToLiveWindow) {
                bundle.putBoolean(FIELD_RELATIVE_TO_LIVE_WINDOW, z);
            }
            boolean z2 = this.relativeToDefaultPosition;
            if (z2 != clippingConfiguration.relativeToDefaultPosition) {
                bundle.putBoolean(FIELD_RELATIVE_TO_DEFAULT_POSITION, z2);
            }
            boolean z3 = this.startsAtKeyFrame;
            if (z3 != clippingConfiguration.startsAtKeyFrame) {
                bundle.putBoolean(FIELD_STARTS_AT_KEY_FRAME, z3);
            }
            return bundle;
        }

        private ClippingConfiguration(Builder builder) {
            this.startPositionMs = builder.startPositionMs;
            this.endPositionMs = builder.endPositionMs;
            this.relativeToLiveWindow = builder.relativeToLiveWindow;
            this.relativeToDefaultPosition = builder.relativeToDefaultPosition;
            this.startsAtKeyFrame = builder.startsAtKeyFrame;
        }
    }

    @UnstableApi
    @Deprecated
    /* loaded from: classes9.dex */
    public static final class ClippingProperties extends ClippingConfiguration {
        public static final ClippingProperties UNSET = new ClippingConfiguration.Builder().buildClippingProperties();

        private ClippingProperties(ClippingConfiguration.Builder builder) {
            super(builder);
        }
    }

    /* loaded from: classes9.dex */
    public static final class DrmConfiguration implements Bundleable {
        public final boolean forceDefaultLicenseUri;
        public final ImmutableList<Integer> forcedSessionTrackTypes;
        @Nullable
        private final byte[] keySetId;
        public final ImmutableMap<String, String> licenseRequestHeaders;
        @Nullable
        public final Uri licenseUri;
        public final boolean multiSession;
        public final boolean playClearContentWithoutKey;
        @UnstableApi
        @Deprecated
        public final ImmutableMap<String, String> requestHeaders;
        public final UUID scheme;
        @UnstableApi
        @Deprecated
        public final ImmutableList<Integer> sessionForClearTypes;
        @UnstableApi
        @Deprecated
        public final UUID uuid;
        private static final String FIELD_SCHEME = Util.intToStringMaxRadix(0);
        private static final String FIELD_LICENSE_URI = Util.intToStringMaxRadix(1);
        private static final String FIELD_LICENSE_REQUEST_HEADERS = Util.intToStringMaxRadix(2);
        private static final String FIELD_MULTI_SESSION = Util.intToStringMaxRadix(3);
        private static final String FIELD_PLAY_CLEAR_CONTENT_WITHOUT_KEY = Util.intToStringMaxRadix(4);
        private static final String FIELD_FORCE_DEFAULT_LICENSE_URI = Util.intToStringMaxRadix(5);
        private static final String FIELD_FORCED_SESSION_TRACK_TYPES = Util.intToStringMaxRadix(6);
        private static final String FIELD_KEY_SET_ID = Util.intToStringMaxRadix(7);
        @UnstableApi
        public static final Bundleable.Creator<DrmConfiguration> CREATOR = new Bundleable.Creator() { // from class: io.bidmachine.media3.common.m
            @Override // io.bidmachine.media3.common.Bundleable.Creator
            public final Bundleable fromBundle(Bundle bundle) {
                return MediaItem.DrmConfiguration.m20042a(bundle);
            }
        };

        /* loaded from: classes9.dex */
        public static final class Builder {
            private boolean forceDefaultLicenseUri;
            private ImmutableList<Integer> forcedSessionTrackTypes;
            @Nullable
            private byte[] keySetId;
            private ImmutableMap<String, String> licenseRequestHeaders;
            @Nullable
            private Uri licenseUri;
            private boolean multiSession;
            private boolean playClearContentWithoutKey;
            @Nullable
            private UUID scheme;

            @CanIgnoreReturnValue
            @Deprecated
            public Builder setNullableScheme(@Nullable UUID uuid) {
                this.scheme = uuid;
                return this;
            }

            public DrmConfiguration build() {
                return new DrmConfiguration(this);
            }

            @UnstableApi
            @Deprecated
            @CanIgnoreReturnValue
            @InlineMe(replacement = "this.setForceSessionsForAudioAndVideoTracks(forceSessionsForAudioAndVideoTracks)")
            public Builder forceSessionsForAudioAndVideoTracks(boolean z) {
                return setForceSessionsForAudioAndVideoTracks(z);
            }

            @CanIgnoreReturnValue
            public Builder setForceDefaultLicenseUri(boolean z) {
                this.forceDefaultLicenseUri = z;
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
                this.forcedSessionTrackTypes = ImmutableList.copyOf((Collection) list);
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
                this.keySetId = bArr2;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setLicenseRequestHeaders(Map<String, String> map) {
                this.licenseRequestHeaders = ImmutableMap.copyOf((Map) map);
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setLicenseUri(@Nullable Uri uri) {
                this.licenseUri = uri;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setMultiSession(boolean z) {
                this.multiSession = z;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setPlayClearContentWithoutKey(boolean z) {
                this.playClearContentWithoutKey = z;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setScheme(UUID uuid) {
                this.scheme = uuid;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setLicenseUri(@Nullable String str) {
                this.licenseUri = str == null ? null : Uri.parse(str);
                return this;
            }

            public Builder(UUID uuid) {
                this.scheme = uuid;
                this.licenseRequestHeaders = ImmutableMap.m69397of();
                this.forcedSessionTrackTypes = ImmutableList.m69424of();
            }

            @Deprecated
            private Builder() {
                this.licenseRequestHeaders = ImmutableMap.m69397of();
                this.forcedSessionTrackTypes = ImmutableList.m69424of();
            }

            private Builder(DrmConfiguration drmConfiguration) {
                this.scheme = drmConfiguration.scheme;
                this.licenseUri = drmConfiguration.licenseUri;
                this.licenseRequestHeaders = drmConfiguration.licenseRequestHeaders;
                this.multiSession = drmConfiguration.multiSession;
                this.playClearContentWithoutKey = drmConfiguration.playClearContentWithoutKey;
                this.forceDefaultLicenseUri = drmConfiguration.forceDefaultLicenseUri;
                this.forcedSessionTrackTypes = drmConfiguration.forcedSessionTrackTypes;
                this.keySetId = drmConfiguration.keySetId;
            }
        }

        /* renamed from: a */
        public static /* synthetic */ DrmConfiguration m20042a(Bundle bundle) {
            return fromBundle(bundle);
        }

        @UnstableApi
        public static DrmConfiguration fromBundle(Bundle bundle) {
            UUID fromString = UUID.fromString((String) Assertions.checkNotNull(bundle.getString(FIELD_SCHEME)));
            ImmutableMap<String, String> bundleToStringImmutableMap = BundleableUtil.bundleToStringImmutableMap(BundleableUtil.getBundleWithDefault(bundle, FIELD_LICENSE_REQUEST_HEADERS, Bundle.EMPTY));
            boolean z = bundle.getBoolean(FIELD_MULTI_SESSION, false);
            boolean z2 = bundle.getBoolean(FIELD_PLAY_CLEAR_CONTENT_WITHOUT_KEY, false);
            boolean z3 = bundle.getBoolean(FIELD_FORCE_DEFAULT_LICENSE_URI, false);
            ImmutableList copyOf = ImmutableList.copyOf((Collection) BundleableUtil.getIntegerArrayListWithDefault(bundle, FIELD_FORCED_SESSION_TRACK_TYPES, new ArrayList()));
            return new Builder(fromString).setLicenseUri((Uri) bundle.getParcelable(FIELD_LICENSE_URI)).setLicenseRequestHeaders(bundleToStringImmutableMap).setMultiSession(z).setForceDefaultLicenseUri(z3).setPlayClearContentWithoutKey(z2).setForcedSessionTrackTypes(copyOf).setKeySetId(bundle.getByteArray(FIELD_KEY_SET_ID)).build();
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
            if (this.scheme.equals(drmConfiguration.scheme) && Util.areEqual(this.licenseUri, drmConfiguration.licenseUri) && Util.areEqual(this.licenseRequestHeaders, drmConfiguration.licenseRequestHeaders) && this.multiSession == drmConfiguration.multiSession && this.forceDefaultLicenseUri == drmConfiguration.forceDefaultLicenseUri && this.playClearContentWithoutKey == drmConfiguration.playClearContentWithoutKey && this.forcedSessionTrackTypes.equals(drmConfiguration.forcedSessionTrackTypes) && Arrays.equals(this.keySetId, drmConfiguration.keySetId)) {
                return true;
            }
            return false;
        }

        @Nullable
        public byte[] getKeySetId() {
            byte[] bArr = this.keySetId;
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
            return ((((((((((((hashCode + i) * 31) + this.licenseRequestHeaders.hashCode()) * 31) + (this.multiSession ? 1 : 0)) * 31) + (this.forceDefaultLicenseUri ? 1 : 0)) * 31) + (this.playClearContentWithoutKey ? 1 : 0)) * 31) + this.forcedSessionTrackTypes.hashCode()) * 31) + Arrays.hashCode(this.keySetId);
        }

        @Override // io.bidmachine.media3.common.Bundleable
        @UnstableApi
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putString(FIELD_SCHEME, this.scheme.toString());
            Uri uri = this.licenseUri;
            if (uri != null) {
                bundle.putParcelable(FIELD_LICENSE_URI, uri);
            }
            if (!this.licenseRequestHeaders.isEmpty()) {
                bundle.putBundle(FIELD_LICENSE_REQUEST_HEADERS, BundleableUtil.stringMapToBundle(this.licenseRequestHeaders));
            }
            boolean z = this.multiSession;
            if (z) {
                bundle.putBoolean(FIELD_MULTI_SESSION, z);
            }
            boolean z2 = this.playClearContentWithoutKey;
            if (z2) {
                bundle.putBoolean(FIELD_PLAY_CLEAR_CONTENT_WITHOUT_KEY, z2);
            }
            boolean z3 = this.forceDefaultLicenseUri;
            if (z3) {
                bundle.putBoolean(FIELD_FORCE_DEFAULT_LICENSE_URI, z3);
            }
            if (!this.forcedSessionTrackTypes.isEmpty()) {
                bundle.putIntegerArrayList(FIELD_FORCED_SESSION_TRACK_TYPES, new ArrayList<>(this.forcedSessionTrackTypes));
            }
            byte[] bArr = this.keySetId;
            if (bArr != null) {
                bundle.putByteArray(FIELD_KEY_SET_ID, bArr);
            }
            return bundle;
        }

        private DrmConfiguration(Builder builder) {
            Assertions.checkState((builder.forceDefaultLicenseUri && builder.licenseUri == null) ? false : true);
            UUID uuid = (UUID) Assertions.checkNotNull(builder.scheme);
            this.scheme = uuid;
            this.uuid = uuid;
            this.licenseUri = builder.licenseUri;
            this.requestHeaders = builder.licenseRequestHeaders;
            this.licenseRequestHeaders = builder.licenseRequestHeaders;
            this.multiSession = builder.multiSession;
            this.forceDefaultLicenseUri = builder.forceDefaultLicenseUri;
            this.playClearContentWithoutKey = builder.playClearContentWithoutKey;
            this.sessionForClearTypes = builder.forcedSessionTrackTypes;
            this.forcedSessionTrackTypes = builder.forcedSessionTrackTypes;
            this.keySetId = builder.keySetId != null ? Arrays.copyOf(builder.keySetId, builder.keySetId.length) : null;
        }
    }

    /* loaded from: classes9.dex */
    public static final class LiveConfiguration implements Bundleable {
        public final long maxOffsetMs;
        public final float maxPlaybackSpeed;
        public final long minOffsetMs;
        public final float minPlaybackSpeed;
        public final long targetOffsetMs;
        public static final LiveConfiguration UNSET = new Builder().build();
        private static final String FIELD_TARGET_OFFSET_MS = Util.intToStringMaxRadix(0);
        private static final String FIELD_MIN_OFFSET_MS = Util.intToStringMaxRadix(1);
        private static final String FIELD_MAX_OFFSET_MS = Util.intToStringMaxRadix(2);
        private static final String FIELD_MIN_PLAYBACK_SPEED = Util.intToStringMaxRadix(3);
        private static final String FIELD_MAX_PLAYBACK_SPEED = Util.intToStringMaxRadix(4);
        @UnstableApi
        public static final Bundleable.Creator<LiveConfiguration> CREATOR = new Bundleable.Creator() { // from class: io.bidmachine.media3.common.n
            @Override // io.bidmachine.media3.common.Bundleable.Creator
            public final Bundleable fromBundle(Bundle bundle) {
                return MediaItem.LiveConfiguration.m20041a(bundle);
            }
        };

        /* loaded from: classes9.dex */
        public static final class Builder {
            private long maxOffsetMs;
            private float maxPlaybackSpeed;
            private long minOffsetMs;
            private float minPlaybackSpeed;
            private long targetOffsetMs;

            public LiveConfiguration build() {
                return new LiveConfiguration(this);
            }

            @CanIgnoreReturnValue
            public Builder setMaxOffsetMs(long j) {
                this.maxOffsetMs = j;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setMaxPlaybackSpeed(float f) {
                this.maxPlaybackSpeed = f;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setMinOffsetMs(long j) {
                this.minOffsetMs = j;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setMinPlaybackSpeed(float f) {
                this.minPlaybackSpeed = f;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setTargetOffsetMs(long j) {
                this.targetOffsetMs = j;
                return this;
            }

            public Builder() {
                this.targetOffsetMs = -9223372036854775807L;
                this.minOffsetMs = -9223372036854775807L;
                this.maxOffsetMs = -9223372036854775807L;
                this.minPlaybackSpeed = -3.4028235E38f;
                this.maxPlaybackSpeed = -3.4028235E38f;
            }

            private Builder(LiveConfiguration liveConfiguration) {
                this.targetOffsetMs = liveConfiguration.targetOffsetMs;
                this.minOffsetMs = liveConfiguration.minOffsetMs;
                this.maxOffsetMs = liveConfiguration.maxOffsetMs;
                this.minPlaybackSpeed = liveConfiguration.minPlaybackSpeed;
                this.maxPlaybackSpeed = liveConfiguration.maxPlaybackSpeed;
            }
        }

        /* renamed from: a */
        public static /* synthetic */ LiveConfiguration m20041a(Bundle bundle) {
            return lambda$static$0(bundle);
        }

        public static /* synthetic */ LiveConfiguration lambda$static$0(Bundle bundle) {
            String str = FIELD_TARGET_OFFSET_MS;
            LiveConfiguration liveConfiguration = UNSET;
            return new LiveConfiguration(bundle.getLong(str, liveConfiguration.targetOffsetMs), bundle.getLong(FIELD_MIN_OFFSET_MS, liveConfiguration.minOffsetMs), bundle.getLong(FIELD_MAX_OFFSET_MS, liveConfiguration.maxOffsetMs), bundle.getFloat(FIELD_MIN_PLAYBACK_SPEED, liveConfiguration.minPlaybackSpeed), bundle.getFloat(FIELD_MAX_PLAYBACK_SPEED, liveConfiguration.maxPlaybackSpeed));
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

        @Override // io.bidmachine.media3.common.Bundleable
        @UnstableApi
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            long j = this.targetOffsetMs;
            LiveConfiguration liveConfiguration = UNSET;
            if (j != liveConfiguration.targetOffsetMs) {
                bundle.putLong(FIELD_TARGET_OFFSET_MS, j);
            }
            long j2 = this.minOffsetMs;
            if (j2 != liveConfiguration.minOffsetMs) {
                bundle.putLong(FIELD_MIN_OFFSET_MS, j2);
            }
            long j3 = this.maxOffsetMs;
            if (j3 != liveConfiguration.maxOffsetMs) {
                bundle.putLong(FIELD_MAX_OFFSET_MS, j3);
            }
            float f = this.minPlaybackSpeed;
            if (f != liveConfiguration.minPlaybackSpeed) {
                bundle.putFloat(FIELD_MIN_PLAYBACK_SPEED, f);
            }
            float f2 = this.maxPlaybackSpeed;
            if (f2 != liveConfiguration.maxPlaybackSpeed) {
                bundle.putFloat(FIELD_MAX_PLAYBACK_SPEED, f2);
            }
            return bundle;
        }

        private LiveConfiguration(Builder builder) {
            this(builder.targetOffsetMs, builder.minOffsetMs, builder.maxOffsetMs, builder.minPlaybackSpeed, builder.maxPlaybackSpeed);
        }

        @UnstableApi
        @Deprecated
        public LiveConfiguration(long j, long j2, long j3, float f, float f2) {
            this.targetOffsetMs = j;
            this.minOffsetMs = j2;
            this.maxOffsetMs = j3;
            this.minPlaybackSpeed = f;
            this.maxPlaybackSpeed = f2;
        }
    }

    /* loaded from: classes9.dex */
    public static final class LocalConfiguration implements Bundleable {
        @Nullable
        public final AdsConfiguration adsConfiguration;
        @Nullable
        @UnstableApi
        public final String customCacheKey;
        @Nullable
        public final DrmConfiguration drmConfiguration;
        @Nullable
        public final String mimeType;
        @UnstableApi
        public final List<StreamKey> streamKeys;
        public final ImmutableList<SubtitleConfiguration> subtitleConfigurations;
        @UnstableApi
        @Deprecated
        public final List<Subtitle> subtitles;
        @Nullable
        public final Object tag;
        public final Uri uri;
        private static final String FIELD_URI = Util.intToStringMaxRadix(0);
        private static final String FIELD_MIME_TYPE = Util.intToStringMaxRadix(1);
        private static final String FIELD_DRM_CONFIGURATION = Util.intToStringMaxRadix(2);
        private static final String FIELD_ADS_CONFIGURATION = Util.intToStringMaxRadix(3);
        private static final String FIELD_STREAM_KEYS = Util.intToStringMaxRadix(4);
        private static final String FIELD_CUSTOM_CACHE_KEY = Util.intToStringMaxRadix(5);
        private static final String FIELD_SUBTITLE_CONFIGURATION = Util.intToStringMaxRadix(6);
        @UnstableApi
        public static final Bundleable.Creator<LocalConfiguration> CREATOR = new Bundleable.Creator() { // from class: io.bidmachine.media3.common.o
            @Override // io.bidmachine.media3.common.Bundleable.Creator
            public final Bundleable fromBundle(Bundle bundle) {
                return MediaItem.LocalConfiguration.m20040a(bundle);
            }
        };

        /* renamed from: a */
        public static /* synthetic */ LocalConfiguration m20040a(Bundle bundle) {
            return fromBundle(bundle);
        }

        @UnstableApi
        public static LocalConfiguration fromBundle(Bundle bundle) {
            DrmConfiguration fromBundle;
            ImmutableList fromBundleList;
            ImmutableList fromBundleList2;
            Bundle bundle2 = bundle.getBundle(FIELD_DRM_CONFIGURATION);
            AdsConfiguration adsConfiguration = null;
            if (bundle2 == null) {
                fromBundle = null;
            } else {
                fromBundle = DrmConfiguration.CREATOR.fromBundle(bundle2);
            }
            Bundle bundle3 = bundle.getBundle(FIELD_ADS_CONFIGURATION);
            if (bundle3 != null) {
                adsConfiguration = AdsConfiguration.CREATOR.fromBundle(bundle3);
            }
            AdsConfiguration adsConfiguration2 = adsConfiguration;
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(FIELD_STREAM_KEYS);
            if (parcelableArrayList == null) {
                fromBundleList = ImmutableList.m69424of();
            } else {
                fromBundleList = BundleableUtil.fromBundleList(new Bundleable.Creator() { // from class: io.bidmachine.media3.common.p
                    @Override // io.bidmachine.media3.common.Bundleable.Creator
                    public final Bundleable fromBundle(Bundle bundle4) {
                        return StreamKey.fromBundle(bundle4);
                    }
                }, parcelableArrayList);
            }
            ImmutableList immutableList = fromBundleList;
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(FIELD_SUBTITLE_CONFIGURATION);
            if (parcelableArrayList2 == null) {
                fromBundleList2 = ImmutableList.m69424of();
            } else {
                fromBundleList2 = BundleableUtil.fromBundleList(SubtitleConfiguration.CREATOR, parcelableArrayList2);
            }
            return new LocalConfiguration((Uri) Assertions.checkNotNull((Uri) bundle.getParcelable(FIELD_URI)), bundle.getString(FIELD_MIME_TYPE), fromBundle, adsConfiguration2, immutableList, bundle.getString(FIELD_CUSTOM_CACHE_KEY), fromBundleList2, null);
        }

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

        @Override // io.bidmachine.media3.common.Bundleable
        @UnstableApi
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(FIELD_URI, this.uri);
            String str = this.mimeType;
            if (str != null) {
                bundle.putString(FIELD_MIME_TYPE, str);
            }
            DrmConfiguration drmConfiguration = this.drmConfiguration;
            if (drmConfiguration != null) {
                bundle.putBundle(FIELD_DRM_CONFIGURATION, drmConfiguration.toBundle());
            }
            AdsConfiguration adsConfiguration = this.adsConfiguration;
            if (adsConfiguration != null) {
                bundle.putBundle(FIELD_ADS_CONFIGURATION, adsConfiguration.toBundle());
            }
            if (!this.streamKeys.isEmpty()) {
                bundle.putParcelableArrayList(FIELD_STREAM_KEYS, BundleableUtil.toBundleArrayList(this.streamKeys));
            }
            String str2 = this.customCacheKey;
            if (str2 != null) {
                bundle.putString(FIELD_CUSTOM_CACHE_KEY, str2);
            }
            if (!this.subtitleConfigurations.isEmpty()) {
                bundle.putParcelableArrayList(FIELD_SUBTITLE_CONFIGURATION, BundleableUtil.toBundleArrayList(this.subtitleConfigurations));
            }
            return bundle;
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
                builder.add((ImmutableList.Builder) immutableList.get(i).buildUpon().buildSubtitle());
            }
            this.subtitles = builder.build();
            this.tag = obj;
        }
    }

    /* loaded from: classes9.dex */
    public static final class RequestMetadata implements Bundleable {
        @Nullable
        public final Bundle extras;
        @Nullable
        public final Uri mediaUri;
        @Nullable
        public final String searchQuery;
        public static final RequestMetadata EMPTY = new Builder().build();
        private static final String FIELD_MEDIA_URI = Util.intToStringMaxRadix(0);
        private static final String FIELD_SEARCH_QUERY = Util.intToStringMaxRadix(1);
        private static final String FIELD_EXTRAS = Util.intToStringMaxRadix(2);
        @UnstableApi
        public static final Bundleable.Creator<RequestMetadata> CREATOR = new Bundleable.Creator() { // from class: io.bidmachine.media3.common.q
            @Override // io.bidmachine.media3.common.Bundleable.Creator
            public final Bundleable fromBundle(Bundle bundle) {
                return MediaItem.RequestMetadata.m20039a(bundle);
            }
        };

        /* loaded from: classes9.dex */
        public static final class Builder {
            @Nullable
            private Bundle extras;
            @Nullable
            private Uri mediaUri;
            @Nullable
            private String searchQuery;

            public Builder() {
            }

            public RequestMetadata build() {
                return new RequestMetadata(this);
            }

            @CanIgnoreReturnValue
            public Builder setExtras(@Nullable Bundle bundle) {
                this.extras = bundle;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setMediaUri(@Nullable Uri uri) {
                this.mediaUri = uri;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setSearchQuery(@Nullable String str) {
                this.searchQuery = str;
                return this;
            }

            private Builder(RequestMetadata requestMetadata) {
                this.mediaUri = requestMetadata.mediaUri;
                this.searchQuery = requestMetadata.searchQuery;
                this.extras = requestMetadata.extras;
            }
        }

        /* renamed from: a */
        public static /* synthetic */ RequestMetadata m20039a(Bundle bundle) {
            return lambda$static$0(bundle);
        }

        public static /* synthetic */ RequestMetadata lambda$static$0(Bundle bundle) {
            return new Builder().setMediaUri((Uri) bundle.getParcelable(FIELD_MEDIA_URI)).setSearchQuery(bundle.getString(FIELD_SEARCH_QUERY)).setExtras(bundle.getBundle(FIELD_EXTRAS)).build();
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

        @Override // io.bidmachine.media3.common.Bundleable
        @UnstableApi
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            Uri uri = this.mediaUri;
            if (uri != null) {
                bundle.putParcelable(FIELD_MEDIA_URI, uri);
            }
            String str = this.searchQuery;
            if (str != null) {
                bundle.putString(FIELD_SEARCH_QUERY, str);
            }
            Bundle bundle2 = this.extras;
            if (bundle2 != null) {
                bundle.putBundle(FIELD_EXTRAS, bundle2);
            }
            return bundle;
        }

        private RequestMetadata(Builder builder) {
            this.mediaUri = builder.mediaUri;
            this.searchQuery = builder.searchQuery;
            this.extras = builder.extras;
        }
    }

    @UnstableApi
    @Deprecated
    /* loaded from: classes9.dex */
    public static final class Subtitle extends SubtitleConfiguration {
        @UnstableApi
        @Deprecated
        public Subtitle(Uri uri, String str, @Nullable String str2) {
            this(uri, str, str2, 0);
        }

        @UnstableApi
        @Deprecated
        public Subtitle(Uri uri, String str, @Nullable String str2, int i) {
            this(uri, str, str2, i, 0, null);
        }

        @UnstableApi
        @Deprecated
        public Subtitle(Uri uri, String str, @Nullable String str2, int i, int i2, @Nullable String str3) {
            super(uri, str, str2, i, i2, str3, null);
        }

        private Subtitle(SubtitleConfiguration.Builder builder) {
            super(builder);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ MediaItem m20045a(Bundle bundle) {
        return fromBundle(bundle);
    }

    public static MediaItem fromBundle(Bundle bundle) {
        LiveConfiguration fromBundle;
        MediaMetadata fromBundle2;
        ClippingProperties fromBundle3;
        RequestMetadata fromBundle4;
        LocalConfiguration fromBundle5;
        String str = (String) Assertions.checkNotNull(bundle.getString(FIELD_MEDIA_ID, ""));
        Bundle bundle2 = bundle.getBundle(FIELD_LIVE_CONFIGURATION);
        if (bundle2 == null) {
            fromBundle = LiveConfiguration.UNSET;
        } else {
            fromBundle = LiveConfiguration.CREATOR.fromBundle(bundle2);
        }
        LiveConfiguration liveConfiguration = fromBundle;
        Bundle bundle3 = bundle.getBundle(FIELD_MEDIA_METADATA);
        if (bundle3 == null) {
            fromBundle2 = MediaMetadata.EMPTY;
        } else {
            fromBundle2 = MediaMetadata.CREATOR.fromBundle(bundle3);
        }
        MediaMetadata mediaMetadata = fromBundle2;
        Bundle bundle4 = bundle.getBundle(FIELD_CLIPPING_PROPERTIES);
        if (bundle4 == null) {
            fromBundle3 = ClippingProperties.UNSET;
        } else {
            fromBundle3 = ClippingConfiguration.CREATOR.fromBundle(bundle4);
        }
        ClippingProperties clippingProperties = fromBundle3;
        Bundle bundle5 = bundle.getBundle(FIELD_REQUEST_METADATA);
        if (bundle5 == null) {
            fromBundle4 = RequestMetadata.EMPTY;
        } else {
            fromBundle4 = RequestMetadata.CREATOR.fromBundle(bundle5);
        }
        RequestMetadata requestMetadata = fromBundle4;
        Bundle bundle6 = bundle.getBundle(FIELD_LOCAL_CONFIGURATION);
        if (bundle6 == null) {
            fromBundle5 = null;
        } else {
            fromBundle5 = LocalConfiguration.CREATOR.fromBundle(bundle6);
        }
        return new MediaItem(str, clippingProperties, fromBundle5, liveConfiguration, mediaMetadata, requestMetadata);
    }

    public static MediaItem fromUri(String str) {
        return new Builder().setUri(str).build();
    }

    @UnstableApi
    private Bundle toBundle(boolean z) {
        LocalConfiguration localConfiguration;
        Bundle bundle = new Bundle();
        if (!this.mediaId.equals("")) {
            bundle.putString(FIELD_MEDIA_ID, this.mediaId);
        }
        if (!this.liveConfiguration.equals(LiveConfiguration.UNSET)) {
            bundle.putBundle(FIELD_LIVE_CONFIGURATION, this.liveConfiguration.toBundle());
        }
        if (!this.mediaMetadata.equals(MediaMetadata.EMPTY)) {
            bundle.putBundle(FIELD_MEDIA_METADATA, this.mediaMetadata.toBundle());
        }
        if (!this.clippingConfiguration.equals(ClippingConfiguration.UNSET)) {
            bundle.putBundle(FIELD_CLIPPING_PROPERTIES, this.clippingConfiguration.toBundle());
        }
        if (!this.requestMetadata.equals(RequestMetadata.EMPTY)) {
            bundle.putBundle(FIELD_REQUEST_METADATA, this.requestMetadata.toBundle());
        }
        if (z && (localConfiguration = this.localConfiguration) != null) {
            bundle.putBundle(FIELD_LOCAL_CONFIGURATION, localConfiguration.toBundle());
        }
        return bundle;
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

    @UnstableApi
    public Bundle toBundleIncludeLocalConfiguration() {
        return toBundle(true);
    }

    /* loaded from: classes9.dex */
    public static class SubtitleConfiguration implements Bundleable {
        @Nullable

        /* renamed from: id */
        public final String f96657id;
        @Nullable
        public final String label;
        @Nullable
        public final String language;
        @Nullable
        public final String mimeType;
        public final int roleFlags;
        public final int selectionFlags;
        public final Uri uri;
        private static final String FIELD_URI = Util.intToStringMaxRadix(0);
        private static final String FIELD_MIME_TYPE = Util.intToStringMaxRadix(1);
        private static final String FIELD_LANGUAGE = Util.intToStringMaxRadix(2);
        private static final String FIELD_SELECTION_FLAGS = Util.intToStringMaxRadix(3);
        private static final String FIELD_ROLE_FLAGS = Util.intToStringMaxRadix(4);
        private static final String FIELD_LABEL = Util.intToStringMaxRadix(5);
        private static final String FIELD_ID = Util.intToStringMaxRadix(6);
        @UnstableApi
        public static final Bundleable.Creator<SubtitleConfiguration> CREATOR = new Bundleable.Creator() { // from class: io.bidmachine.media3.common.s
            @Override // io.bidmachine.media3.common.Bundleable.Creator
            public final Bundleable fromBundle(Bundle bundle) {
                return MediaItem.SubtitleConfiguration.m20038a(bundle);
            }
        };

        /* loaded from: classes9.dex */
        public static final class Builder {
            @Nullable

            /* renamed from: id */
            private String f96658id;
            @Nullable
            private String label;
            @Nullable
            private String language;
            @Nullable
            private String mimeType;
            private int roleFlags;
            private int selectionFlags;
            private Uri uri;

            public Subtitle buildSubtitle() {
                return new Subtitle(this);
            }

            public SubtitleConfiguration build() {
                return new SubtitleConfiguration(this);
            }

            @CanIgnoreReturnValue
            public Builder setId(@Nullable String str) {
                this.f96658id = str;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setLabel(@Nullable String str) {
                this.label = str;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setLanguage(@Nullable String str) {
                this.language = str;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setMimeType(@Nullable String str) {
                this.mimeType = str;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setRoleFlags(int i) {
                this.roleFlags = i;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setSelectionFlags(int i) {
                this.selectionFlags = i;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setUri(Uri uri) {
                this.uri = uri;
                return this;
            }

            public Builder(Uri uri) {
                this.uri = uri;
            }

            private Builder(SubtitleConfiguration subtitleConfiguration) {
                this.uri = subtitleConfiguration.uri;
                this.mimeType = subtitleConfiguration.mimeType;
                this.language = subtitleConfiguration.language;
                this.selectionFlags = subtitleConfiguration.selectionFlags;
                this.roleFlags = subtitleConfiguration.roleFlags;
                this.label = subtitleConfiguration.label;
                this.f96658id = subtitleConfiguration.f96657id;
            }
        }

        /* renamed from: a */
        public static /* synthetic */ SubtitleConfiguration m20038a(Bundle bundle) {
            return fromBundle(bundle);
        }

        @UnstableApi
        public static SubtitleConfiguration fromBundle(Bundle bundle) {
            String string = bundle.getString(FIELD_MIME_TYPE);
            String string2 = bundle.getString(FIELD_LANGUAGE);
            int i = bundle.getInt(FIELD_SELECTION_FLAGS, 0);
            int i2 = bundle.getInt(FIELD_ROLE_FLAGS, 0);
            String string3 = bundle.getString(FIELD_LABEL);
            return new Builder((Uri) Assertions.checkNotNull((Uri) bundle.getParcelable(FIELD_URI))).setMimeType(string).setLanguage(string2).setSelectionFlags(i).setRoleFlags(i2).setLabel(string3).setId(bundle.getString(FIELD_ID)).build();
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
            if (this.uri.equals(subtitleConfiguration.uri) && Util.areEqual(this.mimeType, subtitleConfiguration.mimeType) && Util.areEqual(this.language, subtitleConfiguration.language) && this.selectionFlags == subtitleConfiguration.selectionFlags && this.roleFlags == subtitleConfiguration.roleFlags && Util.areEqual(this.label, subtitleConfiguration.label) && Util.areEqual(this.f96657id, subtitleConfiguration.f96657id)) {
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
            String str4 = this.f96657id;
            if (str4 != null) {
                i = str4.hashCode();
            }
            return i4 + i;
        }

        @Override // io.bidmachine.media3.common.Bundleable
        @UnstableApi
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(FIELD_URI, this.uri);
            String str = this.mimeType;
            if (str != null) {
                bundle.putString(FIELD_MIME_TYPE, str);
            }
            String str2 = this.language;
            if (str2 != null) {
                bundle.putString(FIELD_LANGUAGE, str2);
            }
            int i = this.selectionFlags;
            if (i != 0) {
                bundle.putInt(FIELD_SELECTION_FLAGS, i);
            }
            int i2 = this.roleFlags;
            if (i2 != 0) {
                bundle.putInt(FIELD_ROLE_FLAGS, i2);
            }
            String str3 = this.label;
            if (str3 != null) {
                bundle.putString(FIELD_LABEL, str3);
            }
            String str4 = this.f96657id;
            if (str4 != null) {
                bundle.putString(FIELD_ID, str4);
            }
            return bundle;
        }

        private SubtitleConfiguration(Uri uri, String str, @Nullable String str2, int i, int i2, @Nullable String str3, @Nullable String str4) {
            this.uri = uri;
            this.mimeType = str;
            this.language = str2;
            this.selectionFlags = i;
            this.roleFlags = i2;
            this.label = str3;
            this.f96657id = str4;
        }

        private SubtitleConfiguration(Builder builder) {
            this.uri = builder.uri;
            this.mimeType = builder.mimeType;
            this.language = builder.language;
            this.selectionFlags = builder.selectionFlags;
            this.roleFlags = builder.roleFlags;
            this.label = builder.label;
            this.f96657id = builder.f96658id;
        }
    }

    private MediaItem(String str, ClippingProperties clippingProperties, @Nullable LocalConfiguration localConfiguration, LiveConfiguration liveConfiguration, MediaMetadata mediaMetadata, RequestMetadata requestMetadata) {
        this.mediaId = str;
        this.localConfiguration = localConfiguration;
        this.playbackProperties = localConfiguration;
        this.liveConfiguration = liveConfiguration;
        this.mediaMetadata = mediaMetadata;
        this.clippingConfiguration = clippingProperties;
        this.clippingProperties = clippingProperties;
        this.requestMetadata = requestMetadata;
    }

    public static MediaItem fromUri(Uri uri) {
        return new Builder().setUri(uri).build();
    }

    @Override // io.bidmachine.media3.common.Bundleable
    @UnstableApi
    public Bundle toBundle() {
        return toBundle(false);
    }
}
