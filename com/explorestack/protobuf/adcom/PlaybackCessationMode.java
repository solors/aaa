package com.explorestack.protobuf.adcom;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Internal;
import com.explorestack.protobuf.ProtocolMessageEnum;

/* loaded from: classes3.dex */
public enum PlaybackCessationMode implements ProtocolMessageEnum {
    PLAYBACK_CESSATION_MODE_INVALID(0),
    PLAYBACK_CESSATION_MODE_ON_VIDEO_COMPLETION(1),
    PLAYBACK_CESSATION_MODE_ON_LEAVING_VIEWPORT(2),
    PLAYBACK_CESSATION_MODE_ON_LEAVING_VIEWPORT_CONTINUES_FLOATING(3),
    UNRECOGNIZED(-1);
    
    public static final int PLAYBACK_CESSATION_MODE_INVALID_VALUE = 0;

    /* renamed from: PLAYBACK_CESSATION_MODE_ON_LEAVING_VIEWPORT_CONTINUES_FLOATING_VALUE */
    public static final int f24466xa15570a5 = 3;
    public static final int PLAYBACK_CESSATION_MODE_ON_LEAVING_VIEWPORT_VALUE = 2;
    public static final int PLAYBACK_CESSATION_MODE_ON_VIDEO_COMPLETION_VALUE = 1;
    private final int value;
    private static final Internal.EnumLiteMap<PlaybackCessationMode> internalValueMap = new Internal.EnumLiteMap<PlaybackCessationMode>() { // from class: com.explorestack.protobuf.adcom.PlaybackCessationMode.1
        @Override // com.explorestack.protobuf.Internal.EnumLiteMap
        public PlaybackCessationMode findValueByNumber(int i) {
            return PlaybackCessationMode.forNumber(i);
        }
    };
    private static final PlaybackCessationMode[] VALUES = values();

    PlaybackCessationMode(int i) {
        this.value = i;
    }

    public static PlaybackCessationMode forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return PLAYBACK_CESSATION_MODE_ON_LEAVING_VIEWPORT_CONTINUES_FLOATING;
                }
                return PLAYBACK_CESSATION_MODE_ON_LEAVING_VIEWPORT;
            }
            return PLAYBACK_CESSATION_MODE_ON_VIDEO_COMPLETION;
        }
        return PLAYBACK_CESSATION_MODE_INVALID;
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return AdcomProto.getDescriptor().getEnumTypes().get(23);
    }

    public static Internal.EnumLiteMap<PlaybackCessationMode> internalGetValueMap() {
        return internalValueMap;
    }

    @Override // com.explorestack.protobuf.ProtocolMessageEnum
    public final Descriptors.EnumDescriptor getDescriptorForType() {
        return getDescriptor();
    }

    @Override // com.explorestack.protobuf.ProtocolMessageEnum, com.explorestack.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // com.explorestack.protobuf.ProtocolMessageEnum
    public final Descriptors.EnumValueDescriptor getValueDescriptor() {
        if (this != UNRECOGNIZED) {
            return getDescriptor().getValues().get(ordinal());
        }
        throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
    }

    @Deprecated
    public static PlaybackCessationMode valueOf(int i) {
        return forNumber(i);
    }

    public static PlaybackCessationMode valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}
