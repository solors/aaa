package com.explorestack.protobuf.adcom;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Internal;
import com.explorestack.protobuf.ProtocolMessageEnum;

/* loaded from: classes3.dex */
public enum VideoPlacementType implements ProtocolMessageEnum {
    VIDEO_PLACEMENT_TYPE_INVALID(0),
    VIDEO_PLACEMENT_TYPE_IN_STREAM(1),
    VIDEO_PLACEMENT_TYPE_IN_BANNER(2),
    VIDEO_PLACEMENT_TYPE_IN_ARTICLE(3),
    VIDEO_PLACEMENT_TYPE_IN_FEED(4),
    VIDEO_PLACEMENT_TYPE_INTERSTITIAL(5),
    UNRECOGNIZED(-1);
    
    public static final int VIDEO_PLACEMENT_TYPE_INTERSTITIAL_VALUE = 5;
    public static final int VIDEO_PLACEMENT_TYPE_INVALID_VALUE = 0;
    public static final int VIDEO_PLACEMENT_TYPE_IN_ARTICLE_VALUE = 3;
    public static final int VIDEO_PLACEMENT_TYPE_IN_BANNER_VALUE = 2;
    public static final int VIDEO_PLACEMENT_TYPE_IN_FEED_VALUE = 4;
    public static final int VIDEO_PLACEMENT_TYPE_IN_STREAM_VALUE = 1;
    private final int value;
    private static final Internal.EnumLiteMap<VideoPlacementType> internalValueMap = new Internal.EnumLiteMap<VideoPlacementType>() { // from class: com.explorestack.protobuf.adcom.VideoPlacementType.1
        @Override // com.explorestack.protobuf.Internal.EnumLiteMap
        public VideoPlacementType findValueByNumber(int i) {
            return VideoPlacementType.forNumber(i);
        }
    };
    private static final VideoPlacementType[] VALUES = values();

    VideoPlacementType(int i) {
        this.value = i;
    }

    public static VideoPlacementType forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return null;
                            }
                            return VIDEO_PLACEMENT_TYPE_INTERSTITIAL;
                        }
                        return VIDEO_PLACEMENT_TYPE_IN_FEED;
                    }
                    return VIDEO_PLACEMENT_TYPE_IN_ARTICLE;
                }
                return VIDEO_PLACEMENT_TYPE_IN_BANNER;
            }
            return VIDEO_PLACEMENT_TYPE_IN_STREAM;
        }
        return VIDEO_PLACEMENT_TYPE_INVALID;
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return AdcomProto.getDescriptor().getEnumTypes().get(29);
    }

    public static Internal.EnumLiteMap<VideoPlacementType> internalGetValueMap() {
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
    public static VideoPlacementType valueOf(int i) {
        return forNumber(i);
    }

    public static VideoPlacementType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}
