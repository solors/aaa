package com.inmobi.ads;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.C44401b;
import td.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata
/* loaded from: classes6.dex */
public final class AudioStatus {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AudioStatus[] $VALUES;
    @NotNull
    public static final Companion Companion;
    public static final AudioStatus PLAYING = new AudioStatus("PLAYING", 0);
    public static final AudioStatus PAUSED = new AudioStatus("PAUSED", 1);
    public static final AudioStatus COMPLETED = new AudioStatus("COMPLETED", 2);

    @Metadata
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public /* bridge */ /* synthetic */ Object from(Object obj) {
            return from(((Number) obj).intValue());
        }

        @NotNull
        public AudioStatus from(int i) {
            if (i != 0) {
                if (i != 1) {
                    return AudioStatus.COMPLETED;
                }
                return AudioStatus.PAUSED;
            }
            return AudioStatus.PLAYING;
        }

        @NotNull
        /* renamed from: to */
        public Integer m61305to(@NotNull AudioStatus item) {
            Intrinsics.checkNotNullParameter(item, "item");
            return Integer.valueOf(item.ordinal());
        }
    }

    private static final /* synthetic */ AudioStatus[] $values() {
        return new AudioStatus[]{PLAYING, PAUSED, COMPLETED};
    }

    static {
        AudioStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = C44401b.m3113a($values);
        Companion = new Companion(null);
    }

    private AudioStatus(String str, int i) {
    }

    @NotNull
    public static AudioStatus from(int i) {
        return Companion.from(i);
    }

    @NotNull
    public static EnumEntries<AudioStatus> getEntries() {
        return $ENTRIES;
    }

    /* renamed from: to */
    public static int m61307to(@NotNull AudioStatus audioStatus) {
        return Companion.m61305to(audioStatus).intValue();
    }

    public static AudioStatus valueOf(String str) {
        return (AudioStatus) Enum.valueOf(AudioStatus.class, str);
    }

    public static AudioStatus[] values() {
        return (AudioStatus[]) $VALUES.clone();
    }
}
